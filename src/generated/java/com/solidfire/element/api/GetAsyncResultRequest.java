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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetAsyncResultRequest  
 * You can use GetAsyncResult to retrieve the result of asynchronous method calls. Some method calls require some time to run, and
 * might not be finished when the system sends the initial response. To obtain the status or result of the method call, use
 * GetAsyncResult to poll the asyncHandle value returned by the method.
 * GetAsyncResult returns the overall status of the operation (in progress, completed, or error) in a standard fashion, but the actual
 * data returned for the operation depends on the original method call and the return data is documented with each method.
 **/

public class GetAsyncResultRequest implements Serializable {

    public static final long serialVersionUID = 4624708581636089693L;
    @SerializedName("asyncHandle") private Long asyncHandle;
    @SerializedName("keepResult") private Optional<Boolean> keepResult;
    // empty constructor
    @Since("7.0")
    public GetAsyncResultRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetAsyncResultRequest(
        Long asyncHandle,
        Optional<Boolean> keepResult
    )
    {
        this.asyncHandle = asyncHandle;
        this.keepResult = (keepResult == null) ? Optional.<Boolean>empty() : keepResult;
    }

    /** 
     * A value that was returned from the original
     * asynchronous method call.
     **/
    public Long getAsyncHandle() { return this.asyncHandle; }
   
    public void setAsyncHandle(Long asyncHandle) { 
        this.asyncHandle = asyncHandle;
    }
    /** 
     * If true, GetAsyncResult does not remove the
     * asynchronous result upon returning it, enabling future
     * queries to that asyncHandle.
     **/
    public Optional<Boolean> getKeepResult() { return this.keepResult; }
   
    public void setKeepResult(Optional<Boolean> keepResult) { 
        this.keepResult = (keepResult == null) ? Optional.<Boolean>empty() : keepResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetAsyncResultRequest that = (GetAsyncResultRequest) o;

        return 
            Objects.equals(asyncHandle, that.asyncHandle) && 
            Objects.equals(keepResult, that.keepResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash( asyncHandle,keepResult );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("asyncHandle", asyncHandle);
        map.put("keepResult", keepResult);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" asyncHandle : ").append(gson.toJson(asyncHandle)).append(",");
        if(null != keepResult && keepResult.isPresent()){
            sb.append(" keepResult : ").append(gson.toJson(keepResult)).append(",");
        }
        else{
            sb.append(" keepResult : ").append("null").append(",");
        }
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
        private Optional<Boolean> keepResult;

        private Builder() { }

        public GetAsyncResultRequest build() {
            return new GetAsyncResultRequest (
                         this.asyncHandle,
                         this.keepResult);
        }

        private GetAsyncResultRequest.Builder buildFrom(final GetAsyncResultRequest req) {
            this.asyncHandle = req.asyncHandle;
            this.keepResult = req.keepResult;

            return this;
        }

        public GetAsyncResultRequest.Builder asyncHandle(final Long asyncHandle) {
            this.asyncHandle = asyncHandle;
            return this;
        }

        public GetAsyncResultRequest.Builder optionalKeepResult(final Boolean keepResult) {
            this.keepResult = (keepResult == null) ? Optional.<Boolean>empty() : Optional.of(keepResult);
            return this;
        }

    }
}
