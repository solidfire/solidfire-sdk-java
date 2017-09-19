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

import com.solidfire.element.api.SolidFireElement;
import com.solidfire.core.client.RequestDispatcher;
import com.solidfire.core.javautil.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.solidfire.core.javautil.Optional.of;

public class ElementFactory extends AbstractFactory<SolidFireElement> {

    private static final Logger log = LoggerFactory.getLogger(ElementFactory.class);

    private static final double MIN_SDK_VERSION = 7.0;

    private ElementFactory() {
    }


    /**
     * Create a new instance of SolidFireElement with a connection to the given target with the appropriate username and
     * password.  Hostname verification is defaulted to false.
     *
     * @param mvip     the management virtual IP (MVIP)
     * @param username admin username
     * @param password admin password
     * @return an instance of the SolidFire Element
     */
    public static SolidFireElement create(String mvip, String username, String password) {
        return new ElementFactory().checkVersion(mvip, Optional.<Integer>empty(), username, password, Optional.<String>empty(), false);
    }


    /**
     * Create a new instance of SolidFireElement with a connection to the given target with the appropriate username and
     * password.  The instance will be initialized at the maximum supported version of the API.
     *
     * @param target    the management virtual IP (or hostname)
     * @param username  admin username
     * @param password  admin password
     * @param verifySSL if set to true, the target will be checked against the list of valid SSL hosts, including verification of the
     *                  validity of the Cert recorded for a given target, otherwise these validity checks are ignored, which is useful
     *                  when the target is an IP address.
     * @return an instance of the SolidFire Element
     */
    public static SolidFireElement create(String target, String username, String password, boolean verifySSL) {
        return new ElementFactory().checkVersion(target, Optional.<Integer>empty(), username, password, Optional.<String>empty(), verifySSL);
    }


    /**
     * Create a new instance of SolidFireElement with a connection to the given target with the appropriate username and
     * password.   Hostname verification is defaulted to false.
     *
     * @param mvip       the management virtual IP
     * @param username   admin username
     * @param password   admin password
     * @param apiVersion the version of the API services
     * @return an instance of the SolidFire Element
     */
    public static SolidFireElement create(String mvip, String username, String password, String apiVersion) {
        return new ElementFactory().checkVersion(mvip, Optional.<Integer>empty(), username, password, of(apiVersion), false);
    }


    /**
     * Create a new instance of SolidFireElement with a connection to the given target with the appropriate username and
     * password.
     *
     * @param target     the management virtual IP (or hostname)
     * @param username   admin username
     * @param password   admin password
     * @param apiVersion the version of the API services
     * @param verifySSL  if set to true, the target will be checked against the list of valid SSL hosts, including verification of the
     *                   validity of the Cert recorded for a given target, otherwise these validity checks are ignored, which is useful
     *                   when the target is an IP address.
     * @return an instance of the SolidFire Element
     */
    public static SolidFireElement create(String target, String username, String password, String apiVersion, boolean verifySSL) {
        return new ElementFactory().checkVersion(target, Optional.<Integer>empty(), username, password, of(apiVersion), verifySSL);
    }


    /**
     * Create a new instance of SolidFireElement with a connection to the given target with Port and the appropriate username and
     * password.  The instance will be initialized at the maximum supported version of the API.
     *
     * @param target    the management virtual IP (or hostname)
     * @param port      the port to use
     * @param username  admin username
     * @param password  admin password
     * @param verifySSL if set to true, the target will be checked against the list of valid SSL hosts, including verification of the
     *                  validity of the Cert recorded for a given target, otherwise these validity checks are ignored, which is useful
     *                  when the target is an IP address.
     * @return an instance of the SolidFire Element
     */
    public static SolidFireElement create(String target, Integer port, String username, String password, boolean verifySSL) {
        return new ElementFactory().checkVersion(target, of(port), username, password, Optional.<String>empty(), verifySSL);
    }


    /**
     * Create a new instance of SolidFireElement with a connection to the given target with Port and the appropriate username and
     * password.  Hostname verification is defaulted to false.
     *
     * @param mvip       the management virtual IP
     * @param port       the port to use
     * @param username   admin username
     * @param password   admin password
     * @param apiVersion the version of the API services
     * @return an instance of the SolidFire Element
     */
    public static SolidFireElement create(String mvip, Integer port, String username, String password, String apiVersion) {
        return new ElementFactory().checkVersion(mvip, of(port), username, password, of(apiVersion), false);
    }


    /**
     * Create a new instance of SolidFireElement with a connection to the given target with Port and the appropriate username and
     * password.
     *
     * @param target     the management virtual IP (or hostname)
     * @param port       the port to use
     * @param username   admin username
     * @param password   admin password
     * @param apiVersion the version of the API services
     * @param verifySSL  if set to true, the target will be checked against the list of valid SSL hosts, including verification of the
     *                   validity of the Cert recorded for a given target, otherwise these validity checks are ignored, which is useful
     *                   when the target is an IP address.
     * @return an instance of the SolidFire Element
     */
    public static SolidFireElement create(String target, Integer port, String username, String password, String apiVersion, boolean verifySSL) {
        return new ElementFactory().checkVersion(target, of(port), username, password, of(apiVersion), verifySSL);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    protected double getMinApiVersion() {
        return MIN_SDK_VERSION;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    protected SolidFireElement toServiceBase(RequestDispatcher requestDispatcher) {
        return new SolidFireElement(requestDispatcher);
    }
}
