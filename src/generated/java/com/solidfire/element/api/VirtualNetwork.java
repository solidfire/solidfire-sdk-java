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
 * VirtualNetwork  
 **/

public class VirtualNetwork implements Serializable {

    public static final long serialVersionUID = 8407011142643317951L;
    @SerializedName("virtualNetworkID") private Long virtualNetworkID;
    @SerializedName("address") private IPAddress address;

    // empty constructor
    @Since("7.0")
    public VirtualNetwork() {}

    
    // parameterized constructor
    @Since("7.0")
    public VirtualNetwork(
        Long virtualNetworkID,
        IPAddress address
    )
    {
        this.virtualNetworkID = virtualNetworkID;
        this.address = address;
    }

    /** 
     * SolidFire unique identifier for a virtual network.
     **/
    public Long getVirtualNetworkID() { return this.virtualNetworkID; }
    public void setVirtualNetworkID(Long virtualNetworkID) { 
        this.virtualNetworkID = virtualNetworkID;
    }
    /** 
     * Virtual Network Address.
     **/
    public IPAddress getAddress() { return this.address; }
    public void setAddress(IPAddress address) { 
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualNetwork that = (VirtualNetwork) o;

        return 
            Objects.equals(virtualNetworkID, that.virtualNetworkID) && 
            Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualNetworkID,address );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualNetworkID", virtualNetworkID);
        map.put("address", address);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualNetworkID : ").append(virtualNetworkID).append(",");
        sb.append(" address : ").append(address).append(",");
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
        private Long virtualNetworkID;
        private IPAddress address;

        private Builder() { }

        public VirtualNetwork build() {
            return new VirtualNetwork (
                         this.virtualNetworkID,
                         this.address);
        }

        private VirtualNetwork.Builder buildFrom(final VirtualNetwork req) {
            this.virtualNetworkID = req.virtualNetworkID;
            this.address = req.address;

            return this;
        }

        public VirtualNetwork.Builder virtualNetworkID(final Long virtualNetworkID) {
            this.virtualNetworkID = virtualNetworkID;
            return this;
        }

        public VirtualNetwork.Builder address(final IPAddress address) {
            this.address = address;
            return this;
        }

    }
}
