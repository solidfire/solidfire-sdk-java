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
 * AsyncHandleResult  
 **/

public class AsyncHandleResult implements Serializable {

    public static final long serialVersionUID = -2932335770116448432L;
    @SerializedName("asyncHandle") private Long asyncHandle;

    // empty constructor
    @Since("7.0")
    public AsyncHandleResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public AsyncHandleResult(
        Long asyncHandle
    )
    {
        this.asyncHandle = asyncHandle;
    }

    /** 
     **/
    public Long getAsyncHandle() { return this.asyncHandle; }
    public void setAsyncHandle(Long asyncHandle) { 
        this.asyncHandle = asyncHandle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AsyncHandleResult that = (AsyncHandleResult) o;

        return 
            Objects.equals(asyncHandle, that.asyncHandle);
    }

    @Override
    public int hashCode() {
        return Objects.hash( asyncHandle );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("asyncHandle", asyncHandle);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" asyncHandle : ").append(asyncHandle).append(",");
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
                         this.asyncHandle);
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
