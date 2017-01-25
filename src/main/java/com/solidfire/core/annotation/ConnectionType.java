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
package com.solidfire.core.annotation;

import java.lang.annotation.*;

/**
 * Defines the type of connection this method can be run against from list: Cluster, Node.
 *
 * Attempting to run a Cluster-Only method against a Node connection (and vice versa)
 * will result in an @see ApiException.
 */
@Documented
@Inherited
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ConnectionType {
    /**
     * @return the connection type of the attributed method
     */
    String value();
}


