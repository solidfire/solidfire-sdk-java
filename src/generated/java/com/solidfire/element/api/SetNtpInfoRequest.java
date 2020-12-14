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
 * SetNtpInfoRequest  
 * SetNtpInfo enables you to configure NTP on cluster nodes. The values you set with this interface apply to all nodes in the cluster. If an NTP broadcast server periodically broadcasts time information on your network, you can optionally configure nodes as broadcast clients.
 * Note: NetApp recommends using NTP servers that are internal to your network, rather than the installation defaults.
 **/

public class SetNtpInfoRequest implements Serializable {

    public static final long serialVersionUID = 2505705781387492025L;
    @SerializedName("servers") private String[] servers;
    @SerializedName("broadcastclient") private Optional<Boolean> broadcastclient;
    // empty constructor
    @Since("7.0")
    public SetNtpInfoRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetNtpInfoRequest(
        String[] servers,
        Optional<Boolean> broadcastclient
    )
    {
        this.servers = servers;
        this.broadcastclient = (broadcastclient == null) ? Optional.<Boolean>empty() : broadcastclient;
    }

    /** 
     * List of NTP servers to add to each nodes NTP configuration.
     **/
    public String[] getServers() { return this.servers; }
   
    public void setServers(String[] servers) { 
        this.servers = servers;
    }
    /** 
     * Enables every node in the cluster as a broadcast client.
     **/
    public Optional<Boolean> getBroadcastclient() { return this.broadcastclient; }
   
    public void setBroadcastclient(Optional<Boolean> broadcastclient) { 
        this.broadcastclient = (broadcastclient == null) ? Optional.<Boolean>empty() : broadcastclient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetNtpInfoRequest that = (SetNtpInfoRequest) o;

        return 
            Arrays.equals(servers, that.servers) && 
            Objects.equals(broadcastclient, that.broadcastclient);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])servers,broadcastclient );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("servers", servers);
        map.put("broadcastclient", broadcastclient);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" servers : ").append(gson.toJson(Arrays.toString(servers))).append(",");
        if(null != broadcastclient && broadcastclient.isPresent()){
            sb.append(" broadcastclient : ").append(gson.toJson(broadcastclient)).append(",");
        }
        else{
            sb.append(" broadcastclient : ").append("null").append(",");
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
        private String[] servers;
        private Optional<Boolean> broadcastclient;

        private Builder() { }

        public SetNtpInfoRequest build() {
            return new SetNtpInfoRequest (
                         this.servers,
                         this.broadcastclient);
        }

        private SetNtpInfoRequest.Builder buildFrom(final SetNtpInfoRequest req) {
            this.servers = req.servers;
            this.broadcastclient = req.broadcastclient;

            return this;
        }

        public SetNtpInfoRequest.Builder servers(final String[] servers) {
            this.servers = servers;
            return this;
        }

        public SetNtpInfoRequest.Builder optionalBroadcastclient(final Boolean broadcastclient) {
            this.broadcastclient = (broadcastclient == null) ? Optional.<Boolean>empty() : Optional.of(broadcastclient);
            return this;
        }

    }
}
