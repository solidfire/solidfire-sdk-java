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
/*
 * DO NOT EDIT THIS CODE BY HAND! It has been generated with jsvcgen.
 */
package com.solidfire.element.api;

import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * The wrapped object returned by the &quot;GetAsyncResult&quot; API Service call.
 **/
public class AsyncResult implements Serializable {

    private static final long serialVersionUID = 1992378667L;

    private final String message;

    /**
     * The wrapped object returned by the &quot;GetAsyncResult&quot; API Service call.
     * <br/>
     * <b>Note</b>: The return value of GetAsyncResult is essentially a nested version of the standard JSON response with an additional status field.
     * @param message [required] The return value for the original method call if the call was completed successfully.
     * @since 7.0
     **/
    @Since("7.0")
    public AsyncResult(String message) {
        this.message = message;
    }


    /**
     * The return value for the original method call if the call was completed successfully.
     **/
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AsyncResult that = (AsyncResult) o;
        

        return Objects.equals( message , that.message );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) message );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" message : ").append(message);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
