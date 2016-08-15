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

import com.google.gson.annotations.SerializedName;
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
 * The object returned by the "AsyncHandle" API Service call.
 **/
public class AsyncHandleResult  implements Serializable  {

    private static final long serialVersionUID = -362619182L;

    @SerializedName("asyncHandle") private final Long asyncHandle;

    /**
     * The object returned by the "AsyncHandle" API Service call.
     * @param asyncHandle [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public AsyncHandleResult(Long asyncHandle) {
        this.asyncHandle = asyncHandle;
    }

    public Long getAsyncHandle() {
        return this.asyncHandle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AsyncHandleResult that = (AsyncHandleResult) o;
        

        return Objects.equals( asyncHandle , that.asyncHandle );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) asyncHandle );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" asyncHandle : ").append(asyncHandle);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Long asyncHandle;

        private Builder() { }

        public AsyncHandleResult build() {
            return new AsyncHandleResult (
                         this.asyncHandle            );
        }

        private AsyncHandleResult.Builder buildFrom(final AsyncHandleResult req) {
            this.asyncHandle = req.asyncHandle;

            return this;
        }

        public AsyncHandleResult.Builder asyncHandle(final Long asyncHandle) {
            this.asyncHandle = asyncHandle;
            return this;
        }

    }

}
