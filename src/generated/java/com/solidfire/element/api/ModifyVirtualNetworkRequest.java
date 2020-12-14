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
 * ModifyVirtualNetworkRequest  
 * You can use ModifyVirtualNetwork to change the attributes of an existing virtual network. This method enables you to add or remove
 * address blocks, change the netmask, or modify the name or description of the virtual network. You can also use it to enable or
 * disable namespaces, as well as add or remove a gateway if namespaces are enabled on the virtual network.
 * Note: This method requires either the VirtualNetworkID or the VirtualNetworkTag as a parameter, but not both.
 * Caution: Enabling or disabling the Routable Storage VLANs functionality for an existing virtual network by changing the
 * "namespace" parameter disrupts any traffic handled by the virtual network. NetApp strongly recommends changing the
 * "namespace" parameter only during a scheduled maintenance window.
 **/

public class ModifyVirtualNetworkRequest implements Serializable {

    public static final long serialVersionUID = -5951988628125731270L;
    @SerializedName("virtualNetworkID") private Optional<Long> virtualNetworkID;
    @SerializedName("virtualNetworkTag") private Optional<Long> virtualNetworkTag;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("addressBlocks") private Optional<AddressBlockParams[]> addressBlocks;
    @SerializedName("netmask") private Optional<String> netmask;
    @SerializedName("svip") private Optional<String> svip;
    @SerializedName("gateway") private Optional<String> gateway;
    @SerializedName("namespace") private Optional<Boolean> namespace;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public ModifyVirtualNetworkRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyVirtualNetworkRequest(
        Optional<Long> virtualNetworkID,
        Optional<Long> virtualNetworkTag,
        Optional<String> name,
        Optional<AddressBlockParams[]> addressBlocks,
        Optional<String> netmask,
        Optional<String> svip,
        Optional<Attributes> attributes
    )
    {
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : virtualNetworkID;
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.addressBlocks = (addressBlocks == null) ? Optional.<AddressBlockParams[]>empty() : addressBlocks;
        this.netmask = (netmask == null) ? Optional.<String>empty() : netmask;
        this.svip = (svip == null) ? Optional.<String>empty() : svip;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("9.0")
    public ModifyVirtualNetworkRequest(
        Optional<Long> virtualNetworkID,
        Optional<Long> virtualNetworkTag,
        Optional<String> name,
        Optional<AddressBlockParams[]> addressBlocks,
        Optional<String> netmask,
        Optional<String> svip,
        Optional<String> gateway,
        Optional<Boolean> namespace,
        Optional<Attributes> attributes
    )
    {
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : virtualNetworkID;
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.addressBlocks = (addressBlocks == null) ? Optional.<AddressBlockParams[]>empty() : addressBlocks;
        this.netmask = (netmask == null) ? Optional.<String>empty() : netmask;
        this.svip = (svip == null) ? Optional.<String>empty() : svip;
        this.gateway = (gateway == null) ? Optional.<String>empty() : gateway;
        this.namespace = (namespace == null) ? Optional.<Boolean>empty() : namespace;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * The unique identifier of the virtual network to modify. This is the virtual
     * network ID assigned by the cluster. 
     * Note: This parameter is optional
     * but either virtualNetworkID or virtualNetworkTag must be specified
     * with this API method.
     **/
    public Optional<Long> getVirtualNetworkID() { return this.virtualNetworkID; }
   
    public void setVirtualNetworkID(Optional<Long> virtualNetworkID) { 
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : virtualNetworkID;
    }
    /** 
     * The network tag that identifies the virtual network to modify.
     * Note: This parameter is optional
     * but either virtualNetworkID or virtualNetworkTag must be specified
     * with this API method.
     **/
    public Optional<Long> getVirtualNetworkTag() { return this.virtualNetworkTag; }
   
    public void setVirtualNetworkTag(Optional<Long> virtualNetworkTag) { 
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
    }
    /** 
     * The new name for the virtual network.
     **/
    public Optional<String> getName() { return this.name; }
   
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * The new addressBlock to set for this virtual network. This might contain
     * new address blocks to add to the existing object or omit
     * unused address blocks that need to be removed. Alternatively, you
     * can extend or reduce the size of existing address blocks. You can only
     * increase the size of the starting addressBlocks for a virtual network
     * object; you can never decrease it.
     * Attributes for this parameter are:
     * start: The start of the IP address range. (String)
     * size: The number of IP addresses to include in the block. (Integer)
     **/
    public Optional<AddressBlockParams[]> getAddressBlocks() { return this.addressBlocks; }
   
    public void setAddressBlocks(Optional<AddressBlockParams[]> addressBlocks) { 
        this.addressBlocks = (addressBlocks == null) ? Optional.<AddressBlockParams[]>empty() : addressBlocks;
    }
    /** 
     * New network mask for this virtual network.
     **/
    public Optional<String> getNetmask() { return this.netmask; }
   
    public void setNetmask(Optional<String> netmask) { 
        this.netmask = (netmask == null) ? Optional.<String>empty() : netmask;
    }
    /** 
     * The storage virtual IP address for this virtual network. The svip for a
     * virtual network cannot be changed. You must create a new virtual
     * network to use a different svip address.
     **/
    public Optional<String> getSvip() { return this.svip; }
   
    public void setSvip(Optional<String> svip) { 
        this.svip = (svip == null) ? Optional.<String>empty() : svip;
    }
    /** 
     * The IP address of a gateway of the virtual network. This parameter is valid only if the namespace parameter is set to true (meaning VRF is enabled).
     **/
    public Optional<String> getGateway() { return this.gateway; }
   
    public void setGateway(Optional<String> gateway) { 
        this.gateway = (gateway == null) ? Optional.<String>empty() : gateway;
    }
    /** 
     * When set to true, enables the Routable Storage VLANs functionality by recreating the virtual network and configuring a namespace to contain it.
     * When set to false, disables the VRF functionality for the virtual network.
     * Changing this value disrupts traffic running through this virtual network.
     **/
    public Optional<Boolean> getNamespace() { return this.namespace; }
   
    public void setNamespace(Optional<Boolean> namespace) { 
        this.namespace = (namespace == null) ? Optional.<Boolean>empty() : namespace;
    }
    /** 
     * A new list of name-value pairs in JSON object format.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
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
            Objects.equals(addressBlocks, that.addressBlocks) && 
            Objects.equals(netmask, that.netmask) && 
            Objects.equals(svip, that.svip) && 
            Objects.equals(gateway, that.gateway) && 
            Objects.equals(namespace, that.namespace) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualNetworkID,virtualNetworkTag,name,addressBlocks,netmask,svip,gateway,namespace,attributes );
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
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != virtualNetworkID && virtualNetworkID.isPresent()){
            sb.append(" virtualNetworkID : ").append(gson.toJson(virtualNetworkID)).append(",");
        }
        else{
            sb.append(" virtualNetworkID : ").append("null").append(",");
        }
        if(null != virtualNetworkTag && virtualNetworkTag.isPresent()){
            sb.append(" virtualNetworkTag : ").append(gson.toJson(virtualNetworkTag)).append(",");
        }
        else{
            sb.append(" virtualNetworkTag : ").append("null").append(",");
        }
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(gson.toJson(name)).append(",");
        }
        else{
            sb.append(" name : ").append("null").append(",");
        }
        if(null != addressBlocks && addressBlocks.isPresent()){
            sb.append(" addressBlocks : ").append(gson.toJson(addressBlocks)).append(",");
        }
        else{
            sb.append(" addressBlocks : ").append("null").append(",");
        }
        if(null != netmask && netmask.isPresent()){
            sb.append(" netmask : ").append(gson.toJson(netmask)).append(",");
        }
        else{
            sb.append(" netmask : ").append("null").append(",");
        }
        if(null != svip && svip.isPresent()){
            sb.append(" svip : ").append(gson.toJson(svip)).append(",");
        }
        else{
            sb.append(" svip : ").append("null").append(",");
        }
        if(null != gateway && gateway.isPresent()){
            sb.append(" gateway : ").append(gson.toJson(gateway)).append(",");
        }
        else{
            sb.append(" gateway : ").append("null").append(",");
        }
        if(null != namespace && namespace.isPresent()){
            sb.append(" namespace : ").append(gson.toJson(namespace)).append(",");
        }
        else{
            sb.append(" namespace : ").append("null").append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        }
        else{
            sb.append(" attributes : ").append("null").append(",");
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
        private Optional<AddressBlockParams[]> addressBlocks;
        private Optional<String> netmask;
        private Optional<String> svip;
        private Optional<String> gateway;
        private Optional<Boolean> namespace;
        private Optional<Attributes> attributes;

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

        public ModifyVirtualNetworkRequest.Builder optionalAddressBlocks(final AddressBlockParams[] addressBlocks) {
            this.addressBlocks = (addressBlocks == null) ? Optional.<AddressBlockParams[]>empty() : Optional.of(addressBlocks);
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

        public ModifyVirtualNetworkRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
