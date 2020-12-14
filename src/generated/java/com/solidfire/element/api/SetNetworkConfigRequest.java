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
 * SetNetworkConfigRequest  
 * The SetNetworkConfig API method enables you to set the network configuration for a node. To display the current network settings for a node, run the GetNetworkConfig API method. 
 * Note: This method is available only through the per-node API endpoint 5.0 or later.
 * Changing the "bond-mode" on a node can cause a temporary loss of network connectivity. Exercise caution when using this method.
 **/

public class SetNetworkConfigRequest implements Serializable {

    public static final long serialVersionUID = -2919017005794669355L;
    @SerializedName("network") private NetworkParams network;
    // empty constructor
    @Since("7.0")
    public SetNetworkConfigRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetNetworkConfigRequest(
        NetworkParams network
    )
    {
        this.network = network;
    }

    /** 
     * An object containing node network settings to modify.
     **/
    public NetworkParams getNetwork() { return this.network; }
   
    public void setNetwork(NetworkParams network) { 
        this.network = network;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetNetworkConfigRequest that = (SetNetworkConfigRequest) o;

        return 
            Objects.equals(network, that.network);
    }

    @Override
    public int hashCode() {
        return Objects.hash( network );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("network", network);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

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
        private NetworkParams network;

        private Builder() { }

        public SetNetworkConfigRequest build() {
            return new SetNetworkConfigRequest (
                         this.network);
        }

        private SetNetworkConfigRequest.Builder buildFrom(final SetNetworkConfigRequest req) {
            this.network = req.network;

            return this;
        }

        public SetNetworkConfigRequest.Builder network(final NetworkParams network) {
            this.network = network;
            return this;
        }

    }
}
