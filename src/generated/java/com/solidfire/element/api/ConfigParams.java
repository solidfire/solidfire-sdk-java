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
 * ConfigParams  
 **/

public class ConfigParams implements Serializable {

    public static final long serialVersionUID = -8246535488592412918L;
    @SerializedName("cluster") private ClusterConfig cluster;
    @SerializedName("network") private NetworkParams network;
    // empty constructor
    @Since("7.0")
    public ConfigParams() {}

    
    // parameterized constructor
    @Since("7.0")
    public ConfigParams(
        ClusterConfig cluster,
        NetworkParams network
    )
    {
        this.cluster = cluster;
        this.network = network;
    }

    /** 
     * 
     **/
    public ClusterConfig getCluster() { return this.cluster; }
   
    public void setCluster(ClusterConfig cluster) { 
        this.cluster = cluster;
    }
    /** 
     * 
     **/
    public NetworkParams getNetwork() { return this.network; }
   
    public void setNetwork(NetworkParams network) { 
        this.network = network;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigParams that = (ConfigParams) o;

        return 
            Objects.equals(cluster, that.cluster) && 
            Objects.equals(network, that.network);
    }

    @Override
    public int hashCode() {
        return Objects.hash( cluster,network );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("cluster", cluster);
        map.put("network", network);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" cluster : ").append(gson.toJson(cluster)).append(",");
        sb.append(" network : ").append(gson.toJson(network)).append(",");
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
        private ClusterConfig cluster;
        private NetworkParams network;

        private Builder() { }

        public ConfigParams build() {
            return new ConfigParams (
                         this.cluster,
                         this.network);
        }

        private ConfigParams.Builder buildFrom(final ConfigParams req) {
            this.cluster = req.cluster;
            this.network = req.network;

            return this;
        }

        public ConfigParams.Builder cluster(final ClusterConfig cluster) {
            this.cluster = cluster;
            return this;
        }

        public ConfigParams.Builder network(final NetworkParams network) {
            this.network = network;
            return this;
        }

    }
}
