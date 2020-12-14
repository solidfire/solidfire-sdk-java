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
 * GetNetworkConfigResult  
 **/

public class GetNetworkConfigResult implements Serializable {

    public static final long serialVersionUID = 7398421192911408063L;
    @SerializedName("network") private Network network;
    @SerializedName("networkInterfaces") private Optional<NetworkConfig[]> networkInterfaces;
    // empty constructor
    @Since("7.0")
    public GetNetworkConfigResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetNetworkConfigResult(
        Network network,
        Optional<NetworkConfig[]> networkInterfaces
    )
    {
        this.network = network;
        this.networkInterfaces = (networkInterfaces == null) ? Optional.<NetworkConfig[]>empty() : networkInterfaces;
    }

    /** 
     * 
     **/
    public Network getNetwork() { return this.network; }
   
    public void setNetwork(Network network) { 
        this.network = network;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfig[]> getNetworkInterfaces() { return this.networkInterfaces; }
   
    public void setNetworkInterfaces(Optional<NetworkConfig[]> networkInterfaces) { 
        this.networkInterfaces = (networkInterfaces == null) ? Optional.<NetworkConfig[]>empty() : networkInterfaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetNetworkConfigResult that = (GetNetworkConfigResult) o;

        return 
            Objects.equals(network, that.network) && 
            Objects.equals(networkInterfaces, that.networkInterfaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash( network,networkInterfaces );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("network", network);
        map.put("networkInterfaces", networkInterfaces);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" network : ").append(gson.toJson(network)).append(",");
        if(null != networkInterfaces && networkInterfaces.isPresent()){
            sb.append(" networkInterfaces : ").append(gson.toJson(networkInterfaces)).append(",");
        }
        else{
            sb.append(" networkInterfaces : ").append("null").append(",");
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
        private Network network;
        private Optional<NetworkConfig[]> networkInterfaces;

        private Builder() { }

        public GetNetworkConfigResult build() {
            return new GetNetworkConfigResult (
                         this.network,
                         this.networkInterfaces);
        }

        private GetNetworkConfigResult.Builder buildFrom(final GetNetworkConfigResult req) {
            this.network = req.network;
            this.networkInterfaces = req.networkInterfaces;

            return this;
        }

        public GetNetworkConfigResult.Builder network(final Network network) {
            this.network = network;
            return this;
        }

        public GetNetworkConfigResult.Builder optionalNetworkInterfaces(final NetworkConfig[] networkInterfaces) {
            this.networkInterfaces = (networkInterfaces == null) ? Optional.<NetworkConfig[]>empty() : Optional.of(networkInterfaces);
            return this;
        }

    }
}
