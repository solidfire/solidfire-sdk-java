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

public class ModifyVirtualNetworkRequest implements Serializable {

    public static final long serialVersionUID = -8401847868102898491L;
    @SerializedName("virtualNetworkID") private Optional<Long> virtualNetworkID;
    @SerializedName("virtualNetworkTag") private Optional<Long> virtualNetworkTag;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("addressBlocks") private Optional<AddressBlock[]> addressBlocks;
    @SerializedName("netmask") private Optional<String> netmask;
    @SerializedName("svip") private Optional<String> svip;
    @SerializedName("gateway") private Optional<String> gateway;
    @SerializedName("namespace") private Optional<Boolean> namespace;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public ModifyVirtualNetworkRequest() {}

    // parameterized constructor
    @Since("7.0")
    public ModifyVirtualNetworkRequest(
        Optional<Long> virtualNetworkID,
        Optional<Long> virtualNetworkTag,
        Optional<String> name,
        Optional<AddressBlock[]> addressBlocks,
        Optional<String> netmask,
        Optional<String> svip,
        Optional<String> gateway,
        Optional<Boolean> namespace,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : virtualNetworkID;
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.addressBlocks = (addressBlocks == null) ? Optional.<AddressBlock[]>empty() : addressBlocks;
        this.netmask = (netmask == null) ? Optional.<String>empty() : netmask;
        this.svip = (svip == null) ? Optional.<String>empty() : svip;
        this.gateway = (gateway == null) ? Optional.<String>empty() : gateway;
        this.namespace = (namespace == null) ? Optional.<Boolean>empty() : namespace;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * Unique identifier of the virtual network to modify. This is the virtual network ID assigned by the SolidFire cluster.
     **/
    public Optional<Long> getVirtualNetworkID() { return this.virtualNetworkID; }
    public void setVirtualNetworkID(Optional<Long> virtualNetworkID) { 
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : virtualNetworkID;
    }
    /** 
     * Network Tag that identifies the virtual network to modify.
     **/
    public Optional<Long> getVirtualNetworkTag() { return this.virtualNetworkTag; }
    public void setVirtualNetworkTag(Optional<Long> virtualNetworkTag) { 
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
    }
    /** 
     * New name for the virtual network.
     **/
    public Optional<String> getName() { return this.name; }
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * New addressBlock to set for this Virtual Network object. This may contain new address blocks to add to the existing object or it may omit unused address blocks that need to be removed. Alternatively, existing address blocks may be extended or reduced in size. The size of the starting addressBlocks for a Virtual Network object can only be increased, and can never be decreased.
     * Attributes for this parameter are:
     * <br/><b>start:</b> start of the IP address range. (String)
     * <br/><b>size:</b> numbre of IP addresses to include in the block. (Integer)
     **/
    public Optional<AddressBlock[]> getAddressBlocks() { return this.addressBlocks; }
    public void setAddressBlocks(Optional<AddressBlock[]> addressBlocks) { 
        this.addressBlocks = (addressBlocks == null) ? Optional.<AddressBlock[]>empty() : addressBlocks;
    }
    /** 
     * New netmask for this virtual network.
     **/
    public Optional<String> getNetmask() { return this.netmask; }
    public void setNetmask(Optional<String> netmask) { 
        this.netmask = (netmask == null) ? Optional.<String>empty() : netmask;
    }
    /** 
     * The storage virtual IP address for this virtual network. The svip for Virtual Network cannot be changed. A new Virtual Network must be created in order to use a different svip address.
     **/
    public Optional<String> getSvip() { return this.svip; }
    public void setSvip(Optional<String> svip) { 
        this.svip = (svip == null) ? Optional.<String>empty() : svip;
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
     * A new list of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<java.util.Map<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVirtualNetworkRequest that = (ModifyVirtualNetworkRequest) o;
        return 
            Objects.equals(virtualNetworkID, that.virtualNetworkID) &&
            Objects.equals(virtualNetworkTag, that.virtualNetworkTag) &&
            Objects.equals(name, that.name) &&
            Arrays.equals(addressBlocks, that.addressBlocks) &&
            Objects.equals(netmask, that.netmask) &&
            Objects.equals(svip, that.svip) &&
            Objects.equals(gateway, that.gateway) &&
            Objects.equals(namespace, that.namespace) &&
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualNetworkID, virtualNetworkTag, name, addressBlocks, netmask, svip, gateway, namespace, attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualNetworkID", virtualNetworkID);
        map.put("virtualNetworkTag", virtualNetworkTag);
        map.put("name", name);
        map.put("addressBlocks", addressBlocks);
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

        if(null != virtualNetworkID && virtualNetworkID.isPresent()){
            sb.append(" virtualNetworkID : ").append(virtualNetworkID).append(",");
        }
        if(null != virtualNetworkTag && virtualNetworkTag.isPresent()){
            sb.append(" virtualNetworkTag : ").append(virtualNetworkTag).append(",");
        }
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(name).append(",");
        }
        if(null != addressBlocks && addressBlocks.isPresent()){
            sb.append(" addressBlocks : ").append(addressBlocks).append(",");
        }
        if(null != netmask && netmask.isPresent()){
            sb.append(" netmask : ").append(netmask).append(",");
        }
        if(null != svip && svip.isPresent()){
            sb.append(" svip : ").append(svip).append(",");
        }
        if(null != gateway && gateway.isPresent()){
            sb.append(" gateway : ").append(gateway).append(",");
        }
        if(null != namespace && namespace.isPresent()){
            sb.append(" namespace : ").append(namespace).append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes).append(",");
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
        private Optional<Long> virtualNetworkID;
        private Optional<Long> virtualNetworkTag;
        private Optional<String> name;
        private Optional<AddressBlock[]> addressBlocks;
        private Optional<String> netmask;
        private Optional<String> svip;
        private Optional<String> gateway;
        private Optional<Boolean> namespace;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public ModifyVirtualNetworkRequest build() {
            return new ModifyVirtualNetworkRequest (
                         this.virtualNetworkID,
                         this.virtualNetworkTag,
                         this.name,
                         this.addressBlocks,
                         this.netmask,
                         this.svip,
                         this.gateway,
                         this.namespace,
                         this.attributes);
        }

        private ModifyVirtualNetworkRequest.Builder buildFrom(final ModifyVirtualNetworkRequest req) {
            this.virtualNetworkID = req.virtualNetworkID;
            this.virtualNetworkTag = req.virtualNetworkTag;
            this.name = req.name;
            this.addressBlocks = req.addressBlocks;
            this.netmask = req.netmask;
            this.svip = req.svip;
            this.gateway = req.gateway;
            this.namespace = req.namespace;
            this.attributes = req.attributes;

            return this;
        }

        public ModifyVirtualNetworkRequest.Builder optionalVirtualNetworkID(final Long virtualNetworkID) {
            this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : Optional.of(virtualNetworkID);
            return this;
        }

        public ModifyVirtualNetworkRequest.Builder optionalVirtualNetworkTag(final Long virtualNetworkTag) {
            this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : Optional.of(virtualNetworkTag);
            return this;
        }

        public ModifyVirtualNetworkRequest.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public ModifyVirtualNetworkRequest.Builder optionalAddressBlocks(final AddressBlock[] addressBlocks) {
            this.addressBlocks = (addressBlocks == null) ? Optional.<AddressBlock[]>empty() : Optional.of(addressBlocks);
            return this;
        }

        public ModifyVirtualNetworkRequest.Builder optionalNetmask(final String netmask) {
            this.netmask = (netmask == null) ? Optional.<String>empty() : Optional.of(netmask);
            return this;
        }

        public ModifyVirtualNetworkRequest.Builder optionalSvip(final String svip) {
            this.svip = (svip == null) ? Optional.<String>empty() : Optional.of(svip);
            return this;
        }

        public ModifyVirtualNetworkRequest.Builder optionalGateway(final String gateway) {
            this.gateway = (gateway == null) ? Optional.<String>empty() : Optional.of(gateway);
            return this;
        }

        public ModifyVirtualNetworkRequest.Builder optionalNamespace(final Boolean namespace) {
            this.namespace = (namespace == null) ? Optional.<Boolean>empty() : Optional.of(namespace);
            return this;
        }

        public ModifyVirtualNetworkRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
