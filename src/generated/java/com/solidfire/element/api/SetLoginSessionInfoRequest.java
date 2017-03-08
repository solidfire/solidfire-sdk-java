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
 * SetLoginSessionInfoRequest  
 * SetLoginSessionInfo is used to set the period of time a log in authentication is valid. After the log in period elapses without activity on the system the authentication will expire. New log in credentials will be required for continued access to the cluster once the timeout period has elapsed.
 **/

public class SetLoginSessionInfoRequest implements Serializable {

    public static final long serialVersionUID = 1280173479845571914L;
    @SerializedName("timeout") private String timeout;

    // empty constructor
    @Since("7.0")
    public SetLoginSessionInfoRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetLoginSessionInfoRequest(
        String timeout
    )
    {
        this.timeout = timeout;
    }

    /** 
     * Cluster authentication expiration period. Formatted in HH:mm:ss. For example: 01:30:00, 00:90:00, and 00:00:5400 can all be used to equal a 90 minute timeout period. Default is 30 minutes.
     **/
    public String getTimeout() { return this.timeout; }
    public void setTimeout(String timeout) { 
        this.timeout = timeout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetLoginSessionInfoRequest that = (SetLoginSessionInfoRequest) o;

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
        sb.append( "{ " );

        sb.append(" timeout : ").append(timeout).append(",");
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
        private String timeout;

        private Builder() { }

        public SetLoginSessionInfoRequest build() {
            return new SetLoginSessionInfoRequest (
                         this.timeout);
        }

        private SetLoginSessionInfoRequest.Builder buildFrom(final SetLoginSessionInfoRequest req) {
            this.timeout = req.timeout;

            return this;
        }

        public SetLoginSessionInfoRequest.Builder timeout(final String timeout) {
            this.timeout = timeout;
            return this;
        }

    }
}
