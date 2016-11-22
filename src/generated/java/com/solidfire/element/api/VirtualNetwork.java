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

public class VirtualNetwork implements Serializable {

    public static final long serialVersionUID = 8407011142643317951L;
    @SerializedName("virtualNetworkID") private Long virtualNetworkID;
    @SerializedName("virtualNetworkTag") private Long virtualNetworkTag;
    @SerializedName("addressBlocks") private AddressBlock[] addressBlocks;
    @SerializedName("name") private String name;
    @SerializedName("netmask") private String netmask;
    @SerializedName("svip") private String svip;
    @SerializedName("gateway") private Optional<String> gateway;
    @SerializedName("namespace") private Optional<Boolean> namespace;
    @SerializedName("attributes") private java.util.Map<String, Object> attributes;

    // empty constructor
    @Since("7.0")
    public VirtualNetwork() {}

    // parameterized constructor
    @Since("7.0")
    public VirtualNetwork(
        Long virtualNetworkID,
        Long virtualNetworkTag,
        AddressBlock[] addressBlocks,
        String name,
        String netmask,
        String svip,
        Optional<String> gateway,
        Optional<Boolean> namespace,
        java.util.Map<String, Object> attributes
    )
    {
        this.virtualNetworkID = virtualNetworkID;
        this.virtualNetworkTag = virtualNetworkTag;
        this.addressBlocks = addressBlocks;
        this.name = name;
        this.netmask = netmask;
        this.svip = svip;
        this.gateway = (gateway == null) ? Optional.<String>empty() : gateway;
        this.namespace = (namespace == null) ? Optional.<Boolean>empty() : namespace;
        this.attributes = attributes;
    }

    /** 
     * SolidFire unique identifier for a virtual network.
     **/
    public Long getVirtualNetworkID() { return this.virtualNetworkID; }
    public void setVirtualNetworkID(Long virtualNetworkID) { 
        this.virtualNetworkID = virtualNetworkID;
    }
    /** 
     * VLAN Tag identifier.
     **/
    public Long getVirtualNetworkTag() { return this.virtualNetworkTag; }
    public void setVirtualNetworkTag(Long virtualNetworkTag) { 
        this.virtualNetworkTag = virtualNetworkTag;
    }
    /** 
     * Range of address blocks currently assigned to the virtual network.
     * <br/><b>available:</b> Binary string in "1"s and "0"s. 1 equals the IP is available and 0 equals the IP is not available. The string is read from right to left with the digit to the far right being the first IP address in the list of addressBlocks.
     * <br/><b>size:</b> the size of this block of addresses.
     * <br/><b>start:</b> first IP address in the block.
     **/
    public AddressBlock[] getAddressBlocks() { return this.addressBlocks; }
    public void setAddressBlocks(AddressBlock[] addressBlocks) { 
        this.addressBlocks = addressBlocks;
    }
    /** 
     * The name assigned to the virtual network.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * IP address of the netmask for the virtual network.
     **/
    public String getNetmask() { return this.netmask; }
    public void setNetmask(String netmask) { 
        this.netmask = netmask;
    }
    /** 
     * Storage IP address for the virtual network.
     **/
    public String getSvip() { return this.svip; }
    public void setSvip(String svip) { 
        this.svip = svip;
    }
    /** 
     * 
     **/
    public Optional<String> getGateway() { return this.gateway; }
    public void setGateway(Optional<String> gateway) { 
        this.gateway = (gateway == null) ? Optional.<String>empty() : gateway;
    }
    /** 
     * 
     **/
    public Optional<Boolean> getNamespace() { return this.namespace; }
    public void setNamespace(Optional<Boolean> namespace) { 
        this.namespace = (namespace == null) ? Optional.<Boolean>empty() : namespace;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public java.util.Map<String, Object> getAttributes() { return this.attributes; }
    public void setAttributes(java.util.Map<String, Object> attributes) { 
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualNetwork that = (VirtualNetwork) o;
        return 
            Objects.equals(virtualNetworkID, that.virtualNetworkID) &&
            Objects.equals(virtualNetworkTag, that.virtualNetworkTag) &&
            Arrays.equals(addressBlocks, that.addressBlocks) &&
            Objects.equals(name, that.name) &&
            Objects.equals(netmask, that.netmask) &&
            Objects.equals(svip, that.svip) &&
            Objects.equals(gateway, that.gateway) &&
            Objects.equals(namespace, that.namespace) &&
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualNetworkID, virtualNetworkTag, (Object[])addressBlocks, name, netmask, svip, gateway, namespace, attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualNetworkID", virtualNetworkID);
        map.put("virtualNetworkTag", virtualNetworkTag);
        map.put("addressBlocks", addressBlocks);
        map.put("name", name);
        map.put("netmask", netmask);
        map.put("svip", svip);
        map.put("gateway", gateway);
        map.put("namespace", namespace);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualNetworkID : ").append(virtualNetworkID).append(",");
        sb.append(" virtualNetworkTag : ").append(virtualNetworkTag).append(",");
        sb.append(" addressBlocks : ").append(Arrays.toString(addressBlocks)).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" netmask : ").append(netmask).append(",");
        sb.append(" svip : ").append(svip).append(",");
        if(null != gateway && gateway.isPresent()){
            sb.append(" gateway : ").append(gateway.get()).append(",");
        }
        if(null != namespace && namespace.isPresent()){
            sb.append(" namespace : ").append(namespace.get()).append(",");
        }
        sb.append(" attributes : ").append(attributes).append(",");
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
        private Long virtualNetworkTag;
        private AddressBlock[] addressBlocks;
        private String name;
        private String netmask;
        private String svip;
        private Optional<String> gateway;
        private Optional<Boolean> namespace;
        private java.util.Map<String, Object> attributes;

        private Builder() { }

        public VirtualNetwork build() {
            return new VirtualNetwork (
                         this.virtualNetworkID,
                         this.virtualNetworkTag,
                         this.addressBlocks,
                         this.name,
                         this.netmask,
                         this.svip,
                         this.gateway,
                         this.namespace,
                         this.attributes);
        }

        private VirtualNetwork.Builder buildFrom(final VirtualNetwork req) {
            this.virtualNetworkID = req.virtualNetworkID;
            this.virtualNetworkTag = req.virtualNetworkTag;
            this.addressBlocks = req.addressBlocks;
            this.name = req.name;
            this.netmask = req.netmask;
            this.svip = req.svip;
            this.gateway = req.gateway;
            this.namespace = req.namespace;
            this.attributes = req.attributes;

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

        public VirtualNetwork.Builder optionalGateway(final String gateway) {
            this.gateway = (gateway == null) ? Optional.<String>empty() : Optional.of(gateway);
            return this;
        }

        public VirtualNetwork.Builder optionalNamespace(final Boolean namespace) {
            this.namespace = (namespace == null) ? Optional.<Boolean>empty() : Optional.of(namespace);
            return this;
        }

        public VirtualNetwork.Builder attributes(final java.util.Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

    }
}
