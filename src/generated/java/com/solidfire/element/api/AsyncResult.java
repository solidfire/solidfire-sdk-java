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

import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ['The wrapped object returned by the "GetAsyncResult" API Service call.', '<br/>', '<b>Note</b>: The return value of GetAsyncResult is essentially a nested version of the standard JSON response with an additional status field.']['The wrapped object returned by the "GetAsyncResult" API Service call.', '<br/>', '<b>Note</b>: The return value of GetAsyncResult is essentially a nested version of the standard JSON response with an additional status field.']['The wrapped object returned by the "GetAsyncResult" API Service call.', '<br/>', '<b>Note</b>: The return value of GetAsyncResult is essentially a nested version of the standard JSON response with an additional status field.']
 **/

public class AsyncResult implements Serializable {

    public static final long serialVersionUID = -544451420L;
    @SerializedName("message") private String message;

    // empty constructor
    @Since("7.0")
    public AsyncResult() {}

    // parameterized constructor
    @Since("7.0")
    public AsyncResult(
        String message
    )
    {
        this.message = message;
    }

    /** 
     * The return value for the original method call if the call was completed successfully.
     **/
    public String getMessage() { return this.message; }
    public void setMessage(String message) { 
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AsyncResult that = (AsyncResult) o;
        return 
            Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash( message );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" message : ").append(message).append(",");
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
        private String message;

        private Builder() { }

        public AsyncResult build() {
            return new AsyncResult (
                         this.message);
        }

        private AsyncResult.Builder buildFrom(final AsyncResult req) {
            this.message = req.message;

            return this;
        }

        public AsyncResult.Builder message(final String message) {
            this.message = message;
            return this;
        }

    }
}
