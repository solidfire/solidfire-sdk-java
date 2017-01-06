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
 * GetRemoteLoggingHostsResult  
 **/

public class GetRemoteLoggingHostsResult implements Serializable {

    public static final long serialVersionUID = 2615024065666924098L;
    @SerializedName("remoteHosts") private LoggingServer[] remoteHosts;

    // empty constructor
    @Since("7.0")
    public GetRemoteLoggingHostsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetRemoteLoggingHostsResult(
        LoggingServer[] remoteHosts
    )
    {
        this.remoteHosts = remoteHosts;
    }

    /** 
     * List of hosts to forward logging information to.
     **/
    public LoggingServer[] getRemoteHosts() { return this.remoteHosts; }
    public void setRemoteHosts(LoggingServer[] remoteHosts) { 
        this.remoteHosts = remoteHosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetRemoteLoggingHostsResult that = (GetRemoteLoggingHostsResult) o;

        return 
            Arrays.equals(remoteHosts, that.remoteHosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])remoteHosts );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("remoteHosts", remoteHosts);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" remoteHosts : ").append(Arrays.toString(remoteHosts)).append(",");
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
        private LoggingServer[] remoteHosts;

        private Builder() { }

        public GetRemoteLoggingHostsResult build() {
            return new GetRemoteLoggingHostsResult (
                         this.remoteHosts);
        }

        private GetRemoteLoggingHostsResult.Builder buildFrom(final GetRemoteLoggingHostsResult req) {
            this.remoteHosts = req.remoteHosts;

            return this;
        }

        public GetRemoteLoggingHostsResult.Builder remoteHosts(final LoggingServer[] remoteHosts) {
            this.remoteHosts = remoteHosts;
            return this;
        }

    }
}
