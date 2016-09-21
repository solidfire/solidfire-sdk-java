/*
 * Copyright &copy 2014-2016 NetApp, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.solidfire.client;

import com.solidfire.element.api.GetAPIRequest;
import com.solidfire.element.api.GetAPIResult;
import com.solidfire.jsvcgen.client.*;
import com.solidfire.jsvcgen.javautil.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static com.solidfire.jsvcgen.javautil.Optional.of;
import static java.lang.String.format;


/**
 * The Abstract Factory defines the version checking logic for an implementation factory
 * that instantiates a ServiceBase.
 *
 * @param <T> extends ServiceBase
 *
 * @see #checkVersion(String, Optional, String, String, Optional, boolean)
 */
public abstract class AbstractFactory<T extends ServiceBase> {

    private static final Logger log = LoggerFactory.getLogger(AbstractFactory.class);

    private static final String IP4_ADDRESS_REGEX = "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$";


    /**
     * Getter for property 'minApiVersion'.
     *
     * @return Value for property 'minApiVersion'.
     */
    protected abstract double getMinApiVersion();

    /**
     * Getter for property 'maxApiVersion'.
     *
     * @return Value for property 'maxApiVersion'.
     */
    protected abstract double getMaxApiVersion();

    /**
     * Initializes the ServiceBase with a given RequestDispatcher.
     *
     * @param requestDispatcher the instantiated RequestBuilder
     * @return the initialized ServiceBase
     */
    protected abstract T toServiceBase(final RequestDispatcher requestDispatcher);

    /**
     *
     * @param target     the management virtual IP (or hostname)
     * @param port       the port to use
     * @param username   admin username
     * @param password   admin password
     * @param apiVersion the version of the API services
     * @param verifySSL  if set to true, the target will be checked against the list of valid SSL hosts, including verification of the
     *                   validity of the Cert recorded for a given target, otherwise these validity checks are ignored, which is useful
     *                   when the target is an IP address.
     * @return an initialized RequestBuilder
     */
    protected RequestDispatcher buildRequestDispatcher(String target, Optional<Integer> port, String username, String password, Optional<String> apiVersion, boolean verifySSL) {

        final URL endpoint;
        if (apiVersion.isPresent()) {

            final double version;
            try {
                version = Double.valueOf(apiVersion.get());
                endpoint = toEndpoint(target, port, version);
            } catch (NullPointerException | NumberFormatException e) {
                throw new ApiException("Unable to determine version to connect from value: " + apiVersion.get());
            }

        } else {
            endpoint = toEndpoint(target, port, getMinApiVersion());
        }
        final RequestDispatcher requestDispatcher;

        if (verifySSL) {
            requestDispatcher = new HttpsRequestDispatcher(endpoint, username, password);
        } else {
            requestDispatcher = new HttpsRequestDispatcherWithoutSSLVerification(endpoint, username, password);
        }

        return requestDispatcher;

    }

    /**
     * Checks if the provided target is in the form of an IP address or a hostname.  Depending on the value of verifySSL, this method
     * will throw an ApiException because IP addresses will not have a proper SSL certificate.
     * @param target     the management virtual IP (or hostname)
     * @param verifySSL  if set to true, the target will be checked against the list of valid SSL hosts, including verification of the
     *                   validity of the Cert recorded for a given target, otherwise these validity checks are ignored, which is useful
     *                   when the target is an IP address.
     * @throws ApiException when target is in the form of an IP address and verifySSL is true.
     */
    protected static void testTargetFormat(String target, boolean verifySSL) {
        if (target.matches(IP4_ADDRESS_REGEX) && verifySSL) {
            throw new ApiException("Cannot verify SSL when target is an IP address. Set verifySSL to false or use a fully qualified domain name.");
        }
    }

    /**
     * Creates a URL representation of a SolidFire API endpoint, depending on the optional value of port, in the form:
     *
     * https://{target}:{port}/json-rpc/{apiVersion}
     *  or
     * https://{target}/json-rpc/{apiVersion}
     *
     *
     * @param target     the management virtual IP (or hostname)
     * @param port       (optional) the port to use
     * @param apiVersion the version of the API services
     * @return URL representing the SolidFire API endpoint
     */
    protected static URL toEndpoint(String target, Optional<Integer> port, double apiVersion) {
        try {
            if (port.isPresent()) {
                return new URL("https", target, port.get(), "/json-rpc/" + apiVersion);
            } else {
                return new URL("https", target, "/json-rpc/" + apiVersion);
            }
        } catch (MalformedURLException mue) {
            // Can't actually happen
            throw new RuntimeException(mue);
        }
    }

    /**
     * Checks the version of an endpoint against the target endpoint.  If the version is malformed, lower then the minimally supported version, or
     * the version is not supported on the cluster, an exception is thrown.  If the version provided is higher the the maximum supported version
     * for the SDK, a warning is generated, but the ServiceBase implementation is returned.  If a version is not supplied, either the highest
     * supported version of the Cluster or the maximum supported version of the Cluster, which ever is lower, is used.
     *
     * @param target     the management virtual IP (or hostname)
     * @param port       (optional) the port to use
     * @param username   admin username
     * @param password   admin password
     * @param version    (optional) the requested supported version of the SolidFire Cluster
     * @param verifySSL  if set to true, the target will be checked against the list of valid SSL hosts, including verification of the
     *                   validity of the Cert recorded for a given target, otherwise these validity checks are ignored, which is useful
     *                   when the target is an IP address.
     * @return T the implementation of ServiceBase initialized with the properly constructed RequestDispatcher
     */
    protected T checkVersion(String target, Optional<Integer> port, String username, String password, Optional<String> version, boolean verifySSL) {
        testTargetFormat(target, verifySSL);

        final RequestDispatcher dispatcher;

        final T element = toServiceBase(buildRequestDispatcher(target, port, username, password, of(getMinApiVersion()+""), verifySSL));
        final GetAPIResult getAPIResult = element.sendRequest("GetAPI", new GetAPIRequest(), GetAPIRequest.class, GetAPIResult.class);

        if (version.isPresent()) {
            final double versionActual;
            try {
                versionActual = Double.valueOf(version.get());
            } catch (NullPointerException | NumberFormatException e) {
                throw new ApiException("Unable to determine version to connect from value: " + version.get());
            }

            if (versionActual < getMinApiVersion()) {
                throw new ApiException(format("Cannot connect to a version lower than supported by the SDK. Connect at %1$.1f or higher.", getMinApiVersion()));

            }


            final List<Double> supportedVersions = new ArrayList<>();
            for (final double apiVersion : getAPIResult.getSupportedVersions()) {
                if (apiVersion >= getMinApiVersion()) {
                    supportedVersions.add(apiVersion);
                }
            }

            if (supportedVersions.contains(versionActual)) {
                dispatcher = buildRequestDispatcher(target, port, username, password, of(versionActual + ""), verifySSL);
            } else {
                throw new ApiException(format("Invalid version to connect on this cluster. Valid versions are: %s", join(supportedVersions, ", ", "or")));
            }

            if (versionActual > getMaxApiVersion()) {
                log.warn("You have connected to a version that is higher than supported by this SDK. Some functionality may not work.");
            }
        } else if (getAPIResult.getCurrentVersion() > getMaxApiVersion()) {
            dispatcher = buildRequestDispatcher(target, port, username, password, of(getMaxApiVersion() + ""), verifySSL);
        } else {
            dispatcher = buildRequestDispatcher(target, port, username, password, of(getAPIResult.getCurrentVersion() + ""), verifySSL);
        }

        return toServiceBase(dispatcher);
    }

    //* Simple join list of strings method used for pretty documentation formatting *//
    private static String join(final List<?> list, final String delim, final String endingConjunction) {
        final StringBuilder sb = new StringBuilder();

        String tempDelim = "";

        for (Object i : list) {
            sb.append(tempDelim).append(i);
            tempDelim = delim;
        }

        final String result = sb.toString();
        final int lastDelim = result.lastIndexOf(delim);

        final String returnedResult;

        if (lastDelim == -1 || endingConjunction.trim().length() == 0) {
            returnedResult = result;
        } else {
            returnedResult = result.substring(0, lastDelim + 1) + " " + endingConjunction + result.substring(lastDelim + 1);
        }

        return returnedResult;
    }
}
