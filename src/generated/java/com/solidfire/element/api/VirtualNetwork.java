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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * 
 **/
public class VirtualNetwork  implements Serializable  {

    private static final long serialVersionUID = -14832004L;

    @SerializedName("virtualNetworkID") private final Long virtualNetworkID;
    @SerializedName("virtualNetworkTag") private final Long virtualNetworkTag;
    @SerializedName("addressBlocks") private final AddressBlock[] addressBlocks;
    @SerializedName("attributes") private final java.util.Map<String, Object> attributes;
    @SerializedName("name") private final String name;
    @SerializedName("netmask") private final String netmask;
    @SerializedName("svip") private final String svip;

    /**
     * 
     * @param virtualNetworkID [required] SolidFire unique identifier for a virtual network.
     * @param virtualNetworkTag [required] VLAN Tag identifier.
     * @param addressBlocks [required] Range of address blocks currently assigned to the virtual network.
     * @param attributes [required] List of Name/Value pairs in JSON object format.
     * @param name [required] The name assigned to the virtual network.
     * @param netmask [required] IP address of the netmask for the virtual network.
     * @param svip [required] Storage IP address for the virtual network.
     * @since 7.0
     **/
    @Since("7.0")
    public VirtualNetwork(Long virtualNetworkID, Long virtualNetworkTag, AddressBlock[] addressBlocks, java.util.Map<String, Object> attributes, String name, String netmask, String svip) {
        this.name = name;
        this.virtualNetworkTag = virtualNetworkTag;
        this.netmask = netmask;
        this.virtualNetworkID = virtualNetworkID;
        this.attributes = attributes;
        this.addressBlocks = addressBlocks;
        this.svip = svip;
    }


    /**
     * SolidFire unique identifier for a virtual network.
     **/
    public Long getVirtualNetworkID() {
        return this.virtualNetworkID;
    }

    /**
     * VLAN Tag identifier.
     **/
    public Long getVirtualNetworkTag() {
        return this.virtualNetworkTag;
    }

    /**
     * Range of address blocks currently assigned to the virtual network.
     * <b>available:</b> Binary string in "1"s and "0"s. 1 equals the IP is available and 0 equals the IP is not available. The string is read from right to left with the digit to the far right being the first IP address in the list of addressBlocks.
     * <b>size:</b> the size of this block of addresses.
     * <b>start:</b> first IP address in the block.
     **/
    public AddressBlock[] getAddressBlocks() {
        return this.addressBlocks;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public java.util.Map<String, Object> getAttributes() {
        return this.attributes;
    }

    /**
     * The name assigned to the virtual network.
     **/
    public String getName() {
        return this.name;
    }

    /**
     * IP address of the netmask for the virtual network.
     **/
    public String getNetmask() {
        return this.netmask;
    }

    /**
     * Storage IP address for the virtual network.
     **/
    public String getSvip() {
        return this.svip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualNetwork that = (VirtualNetwork) o;
        

        return Objects.equals( virtualNetworkID , that.virtualNetworkID )
            && Objects.equals( virtualNetworkTag , that.virtualNetworkTag )
            && Objects.deepEquals( addressBlocks , that.addressBlocks )
            && Objects.equals( attributes , that.attributes )
            && Objects.equals( name , that.name )
            && Objects.equals( netmask , that.netmask )
            && Objects.equals( svip , that.svip );
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualNetworkID, virtualNetworkTag, addressBlocks, attributes, name, netmask, svip );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualNetworkID : ").append(virtualNetworkID).append(",");
        sb.append(" virtualNetworkTag : ").append(virtualNetworkTag).append(",");
        sb.append(" addressBlocks : ").append(Arrays.toString(addressBlocks)).append(",");
        sb.append(" attributes : ").append(attributes).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" netmask : ").append(netmask).append(",");
        sb.append(" svip : ").append(svip);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Long virtualNetworkID;
        private Long virtualNetworkTag;
        private AddressBlock[] addressBlocks;
        private java.util.Map<String, Object> attributes;
        private String name;
        private String netmask;
        private String svip;

        private Builder() { }

        public VirtualNetwork build() {
            return new VirtualNetwork (
                         this.virtualNetworkID,
                         this.virtualNetworkTag,
                         this.addressBlocks,
                         this.attributes,
                         this.name,
                         this.netmask,
                         this.svip            );
        }

        private VirtualNetwork.Builder buildFrom(final VirtualNetwork req) {
            this.virtualNetworkID = req.virtualNetworkID;
            this.virtualNetworkTag = req.virtualNetworkTag;
            this.addressBlocks = req.addressBlocks;
            this.attributes = req.attributes;
            this.name = req.name;
            this.netmask = req.netmask;
            this.svip = req.svip;

            return this;
        }

        public VirtualNetwork.Builder virtualNetworkID(final Long virtualNetworkID) {
            this.virtualNetworkID = virtualNetworkID;
            return this;
        }

        public VirtualNetwork.Builder virtualNetworkTag(final Long virtualNetworkTag) {
            this.virtualNetworkTag = virtualNetworkTag;
            return this;
        }

        public VirtualNetwork.Builder addressBlocks(final AddressBlock[] addressBlocks) {
            this.addressBlocks = addressBlocks;
            return this;
        }

        public VirtualNetwork.Builder attributes(final java.util.Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

        public VirtualNetwork.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public VirtualNetwork.Builder netmask(final String netmask) {
            this.netmask = netmask;
            return this;
        }

        public VirtualNetwork.Builder svip(final String svip) {
            this.svip = svip;
            return this;
        }

    }

}
