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
 * SetNetworkConfigResult  
 **/

public class SetNetworkConfigResult implements Serializable {

    public static final long serialVersionUID = 3937213142373917318L;
    @SerializedName("network") private Network network;
    // empty constructor
    @Since("7.0")
    public SetNetworkConfigResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetNetworkConfigResult(
        Network network
    )
    {
        this.network = network;
    }

    /** 
     * 
     **/
    public Network getNetwork() { return this.network; }
   
    public void setNetwork(Network network) { 
        this.network = network;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetNetworkConfigResult that = (SetNetworkConfigResult) o;

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
        private Network network;

        private Builder() { }

        public SetNetworkConfigResult build() {
            return new SetNetworkConfigResult (
                         this.network);
        }

        private SetNetworkConfigResult.Builder buildFrom(final SetNetworkConfigResult req) {
            this.network = req.network;

            return this;
        }

        public SetNetworkConfigResult.Builder network(final Network network) {
            this.network = network;
            return this;
        }

    }
}
