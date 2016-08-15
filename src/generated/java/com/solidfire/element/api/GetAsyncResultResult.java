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
 * The object returned by the &quot;GetAsyncResult&quot; API Service call.
 **/
public class GetAsyncResultResult  implements Serializable  {

    private static final long serialVersionUID = 18116817L;

    @SerializedName("result") private final AsyncResult result;
    @SerializedName("status") private final String status;

    /**
     * The object returned by the &quot;GetAsyncResult&quot; API Service call.
     * <br/>
     * <b>Note</b>: The return value of GetAsyncResult is essentially a nested version of the standard JSON response with an additional status field.
     * @param result [required] The resulting message for the original method call if the call was completed successfully.
     * @param status [required] Status of the asynchronous method call
     * @since 7.0
     **/
    @Since("7.0")
    public GetAsyncResultResult(AsyncResult result, String status) {
        this.result = result;
        this.status = status;
    }


    /**
     * The resulting message for the original method call if the call was completed successfully.
     **/
    public AsyncResult getResult() {
        return this.result;
    }

    /**
     * Status of the asynchronous method call
     * <br/><b>running</b>: The method is still running.
     * <br/><b>complete</b>: The method is complete and the result or error is available.
     **/
    public String getStatus() {
        return this.status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetAsyncResultResult that = (GetAsyncResultResult) o;
        

        return Objects.equals( result , that.result )
            && Objects.equals( status , that.status );
    }

    @Override
    public int hashCode() {
        return Objects.hash( result, status );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" result : ").append(result).append(",");
        sb.append(" status : ").append(status);
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
        private AsyncResult result;
        private String status;

        private Builder() { }

        public GetAsyncResultResult build() {
            return new GetAsyncResultResult (
                         this.result,
                         this.status            );
        }

        private GetAsyncResultResult.Builder buildFrom(final GetAsyncResultResult req) {
            this.result = req.result;
            this.status = req.status;

            return this;
        }

        public GetAsyncResultResult.Builder result(final AsyncResult result) {
            this.result = result;
            return this;
        }

        public GetAsyncResultResult.Builder status(final String status) {
            this.status = status;
            return this;
        }

    }

}
