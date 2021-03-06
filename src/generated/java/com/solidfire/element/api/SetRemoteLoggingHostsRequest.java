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
 * SetRemoteLoggingHostsRequest  
 * SetRemoteLoggingHosts enables you to configure remote logging from the nodes in the storage cluster to a centralized log server or servers. Remote logging is performed over TCP using the default port 514. This API does not add to the existing logging hosts. Rather, it replaces what currently exists with new values specified by this API method. You can use GetRemoteLoggingHosts to determine what the current logging hosts are, and then use SetRemoteLoggingHosts to set the desired list of current and new logging hosts.
 **/

public class SetRemoteLoggingHostsRequest implements Serializable {

    public static final long serialVersionUID = -7461746160915449395L;
    @SerializedName("remoteHosts") private LoggingServer[] remoteHosts;
    // empty constructor
    @Since("7.0")
    public SetRemoteLoggingHostsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetRemoteLoggingHostsRequest(
        LoggingServer[] remoteHosts
    )
    {
        this.remoteHosts = remoteHosts;
    }

    /** 
     * A list of hosts to send log messages to.
     **/
    public LoggingServer[] getRemoteHosts() { return this.remoteHosts; }
   
    public void setRemoteHosts(LoggingServer[] remoteHosts) { 
        this.remoteHosts = remoteHosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetRemoteLoggingHostsRequest that = (SetRemoteLoggingHostsRequest) o;

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
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" remoteHosts : ").append(gson.toJson(Arrays.toString(remoteHosts))).append(",");
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

        public SetRemoteLoggingHostsRequest build() {
            return new SetRemoteLoggingHostsRequest (
                         this.remoteHosts);
        }

        private SetRemoteLoggingHostsRequest.Builder buildFrom(final SetRemoteLoggingHostsRequest req) {
            this.remoteHosts = req.remoteHosts;

            return this;
        }

        public SetRemoteLoggingHostsRequest.Builder remoteHosts(final LoggingServer[] remoteHosts) {
            this.remoteHosts = remoteHosts;
            return this;
        }

    }
}
