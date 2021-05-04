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
 * EnableBmcColdResetRequest  
 * EnableBmcColdReset enables a background task that periodically resets the Baseboard Management Controller (BMC) for all nodes in the cluster.
 **/

public class EnableBmcColdResetRequest implements Serializable {

    public static final long serialVersionUID = 6938874316676019694L;
    @SerializedName("timeout") private Optional<Long> timeout;
    // empty constructor
    @Since("7.0")
    public EnableBmcColdResetRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public EnableBmcColdResetRequest(
        Optional<Long> timeout
    )
    {
        this.timeout = (timeout == null) ? Optional.<Long>empty() : timeout;
    }

    /** 
     * If set, the time between BMC reset operations in minutes. The default is 20160 minutes.
     **/
    public Optional<Long> getTimeout() { return this.timeout; }
   
    public void setTimeout(Optional<Long> timeout) { 
        this.timeout = (timeout == null) ? Optional.<Long>empty() : timeout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnableBmcColdResetRequest that = (EnableBmcColdResetRequest) o;

        return 
            Objects.equals(timeout, that.timeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash( timeout );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("timeout", timeout);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != timeout && timeout.isPresent()){
            sb.append(" timeout : ").append(gson.toJson(timeout)).append(",");
        }
        else{
            sb.append(" timeout : ").append("null").append(",");
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
        private Optional<Long> timeout;

        private Builder() { }

        public EnableBmcColdResetRequest build() {
            return new EnableBmcColdResetRequest (
                         this.timeout);
        }

        private EnableBmcColdResetRequest.Builder buildFrom(final EnableBmcColdResetRequest req) {
            this.timeout = req.timeout;

            return this;
        }

        public EnableBmcColdResetRequest.Builder optionalTimeout(final Long timeout) {
            this.timeout = (timeout == null) ? Optional.<Long>empty() : Optional.of(timeout);
            return this;
        }

    }
}
