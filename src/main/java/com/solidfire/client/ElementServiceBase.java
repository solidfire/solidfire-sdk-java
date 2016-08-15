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

import com.solidfire.element.api.CHAPSecret;
import com.solidfire.jsvcgen.client.RequestDispatcher;
import com.solidfire.jsvcgen.client.ServiceBase;
import com.solidfire.serialization.CHAPSecretAdaptor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jason Ryan Womack on 5/17/16.
 */
public class ElementServiceBase extends ServiceBase {

    private static final List<String> CHAP_SECRET_METHODS;

    static {
        CHAP_SECRET_METHODS =
                Collections.unmodifiableList(
                        Arrays.asList(
                                "AddAccount".toLowerCase(),
                                "ModifyAccount".toLowerCase(),
                                "CreateStorageContainer".toLowerCase(),
                                "ModifyStorageContainer".toLowerCase()
                        )
                );
    }

    static {
        LogSplash.logo();
    }

    /**
     * Create a service with the given connection.
     *
     * @param requestDispatcher is the mechanism for sending requests to some location.
     */
    protected ElementServiceBase(RequestDispatcher requestDispatcher) {

        super(requestDispatcher);
        this.getGsonBuilder().registerTypeHierarchyAdapter(CHAPSecretAdaptor.serializingClass(), new CHAPSecretAdaptor());
    }


    protected <TRequest> String encodeRequest(String method,
                                              TRequest requestParams,
                                              Class<TRequest> requestParamsClass) {
        final String request = super.encodeRequest(method, requestParams, requestParamsClass);
        if (CHAP_SECRET_METHODS.contains(method.toLowerCase())) {
            return request.replace("\"" + CHAPSecret.autoGenerate() + "\"", "null")
                          .replace("" + CHAPSecret.autoGenerate() + "", "null");
        }

        return request;
    }
}
