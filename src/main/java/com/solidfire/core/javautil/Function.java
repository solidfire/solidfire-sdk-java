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
package com.solidfire.core.javautil;

/**
 * Equivalent of the Java 8 Function interface.
 *
 * @param <T> The input to the function.
 * @param <R> The output of the function.
 */
public interface Function<T, R> {
    /**
     * Applies this function to the given argument.
     * @param t the function argument
     * @return the function result
     */
    R apply(T t);
}
