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
 * 
 **/

public class GetNtpInfoResult implements Serializable {

    public static final long serialVersionUID = 869413777L;
    @SerializedName("broadcastclient") private Boolean broadcastclient;
    @SerializedName("servers") private String[] servers;

    // empty constructor
    @Since("7.0")
    public GetNtpInfoResult() {}

    // parameterized constructor
    @Since("7.0")
    public GetNtpInfoResult(
        Boolean broadcastclient,
        String[] servers
    )
    {
        this.broadcastclient = broadcastclient;
        this.servers = servers;
    }

    /** 
     * Indicates whether or not the nodes in the cluster are listening for broadcast NTP messages. Possible values:
     * true
     * false
     **/
    public Boolean getBroadcastclient() { return this.broadcastclient; }
    public void setBroadcastclient(Boolean broadcastclient) { 
        this.broadcastclient = broadcastclient;
    }
    /** 
     * List of NTP servers.
     **/
    public String[] getServers() { return this.servers; }
    public void setServers(String[] servers) { 
        this.servers = servers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetNtpInfoResult that = (GetNtpInfoResult) o;
        return 
            Objects.equals(broadcastclient, that.broadcastclient) &&
            Arrays.equals(servers, that.servers);
    }

    @Override
    public int hashCode() {
        return Objects.hash( broadcastclient, (Object[])servers );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("broadcastclient", broadcastclient);
        map.put("servers", servers);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" broadcastclient : ").append(broadcastclient).append(",");
        sb.append(" servers : ").append(Arrays.toString(servers)).append(",");
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
        private Boolean broadcastclient;
        private String[] servers;

        private Builder() { }

        public GetNtpInfoResult build() {
            return new GetNtpInfoResult (
                         this.broadcastclient,
                         this.servers);
        }

        private GetNtpInfoResult.Builder buildFrom(final GetNtpInfoResult req) {
            this.broadcastclient = req.broadcastclient;
            this.servers = req.servers;

            return this;
        }

        public GetNtpInfoResult.Builder broadcastclient(final Boolean broadcastclient) {
            this.broadcastclient = broadcastclient;
            return this;
        }

        public GetNtpInfoResult.Builder servers(final String[] servers) {
            this.servers = servers;
            return this;
        }

    }
}
