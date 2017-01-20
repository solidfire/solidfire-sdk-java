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
 * GetAsyncResultResult  
 * The object returned by the "GetAsyncResult" API Service call.
 * 
 * Note: The return value of GetAsyncResult is essentially a nested version of the standard JSON response with an additional status field.
 **/

public class GetAsyncResultResult implements Serializable {

    public static final long serialVersionUID = -108693847265816423L;
    @SerializedName("result") private AsyncResult result;
    @SerializedName("status") private String status;

    // empty constructor
    @Since("7.0")
    public GetAsyncResultResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetAsyncResultResult(
        AsyncResult result,
        String status
    )
    {
        this.result = result;
        this.status = status;
    }

    /** 
     * The resulting message for the original method call if the call was completed successfully.
     **/
    public AsyncResult getResult() { return this.result; }
    public void setResult(AsyncResult result) { 
        this.result = result;
    }
    /** 
     * Status of the asynchronous method call
     * running: The method is still running.
     * complete: The method is complete and the result or error is available.
     **/
    public String getStatus() { return this.status; }
    public void setStatus(String status) { 
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetAsyncResultResult that = (GetAsyncResultResult) o;

        return 
            Objects.equals(result, that.result) && 
            Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash( result,status );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("result", result);
        map.put("status", status);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" result : ").append(result).append(",");
        sb.append(" status : ").append(status).append(",");
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
                         this.status);
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
