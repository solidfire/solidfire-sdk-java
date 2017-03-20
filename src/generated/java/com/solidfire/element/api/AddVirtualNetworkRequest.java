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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * AddVirtualNetworkRequest  
 * AddVirtualNetwork is used to add a new virtual network to a cluster configuration. When a virtual network is added, an interface for each node is created and each will require a virtual network IP address. The number of IP addresses specified as a parameter for this API method must be equal to or greater than the number of nodes in the cluster. Virtual network addresses are bulk provisioned by SolidFire and assigned to individual nodes automatically. Virtual network addresses do not need to be assigned to nodes manually.
 * 
 * Note: The AddVirtualNetwork method is used only to create a new virtual network. If you want to make changes to a virtual network, please use the ModifyVirtualNetwork method.
 **/

public class AddVirtualNetworkRequest implements Serializable {

    public static final long serialVersionUID = -6379118305344760739L;
    @SerializedName("virtualNetworkTag") private Long virtualNetworkTag;
    @SerializedName("name") private String name;
    @SerializedName("addressBlocks") private AddressBlock[] addressBlocks;
    @SerializedName("netmask") private String netmask;
    @SerializedName("svip") private String svip;
    @SerializedName("gateway") private Optional<String> gateway;
    @SerializedName("namespace") private Optional<Boolean> namespace;
    @SerializedName("attributes") private Optional<Attributes> attributes;

    // empty constructor
    @Since("7.0")
    public AddVirtualNetworkRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddVirtualNetworkRequest(
        Long virtualNetworkTag,
        String name,
        AddressBlock[] addressBlocks,
        String netmask,
        String svip,
        Optional<Attributes> attributes
    )
    {
        this.virtualNetworkTag = virtualNetworkTag;
        this.name = name;
        this.addressBlocks = addressBlocks;
        this.netmask = netmask;
        this.svip = svip;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("9.0")
    public AddVirtualNetworkRequest(
        Long virtualNetworkTag,
        String name,
        AddressBlock[] addressBlocks,
        String netmask,
        String svip,
        Optional<String> gateway,
        Optional<Boolean> namespace,
        Optional<Attributes> attributes
    )
    {
        this.virtualNetworkTag = virtualNetworkTag;
        this.name = name;
        this.addressBlocks = addressBlocks;
        this.netmask = netmask;
        this.svip = svip;
        this.gateway = (gateway == null) ? Optional.<String>empty() : gateway;
        this.namespace = (namespace == null) ? Optional.<Boolean>empty() : namespace;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * A unique virtual network (VLAN) tag. Supported values are 1 to 4095 (the number zero (0) is not supported).
     **/
    public Long getVirtualNetworkTag() { return this.virtualNetworkTag; }
    public void setVirtualNetworkTag(Long virtualNetworkTag) { 
        this.virtualNetworkTag = virtualNetworkTag;
    }
    /** 
     * User defined name for the new virtual network.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * Unique Range of IP addresses to include in the virtual network.
     * Attributes for this parameter are:
     * start: start of the IP address range. (String)
     * size: numbre of IP addresses to include in the block. (Integer)
     **/
    public AddressBlock[] getAddressBlocks() { return this.addressBlocks; }
    public void setAddressBlocks(AddressBlock[] addressBlocks) { 
        this.addressBlocks = addressBlocks;
    }
    /** 
     * Unique netmask for the virtual network being created.
     **/
    public String getNetmask() { return this.netmask; }
    public void setNetmask(String netmask) { 
        this.netmask = netmask;
    }
    /** 
     * Unique storage IP address for the virtual network being created.
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
    public Optional<Attributes> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddVirtualNetworkRequest that = (AddVirtualNetworkRequest) o;

        return 
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
        return Objects.hash( virtualNetworkTag,name,(Object[])addressBlocks,netmask,svip,gateway,namespace,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
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

        sb.append(" virtualNetworkTag : ").append(virtualNetworkTag).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" addressBlocks : ").append(Arrays.toString(addressBlocks)).append(",");
        sb.append(" netmask : ").append(netmask).append(",");
        sb.append(" svip : ").append(svip).append(",");
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
        private Long virtualNetworkTag;
        private String name;
        private AddressBlock[] addressBlocks;
        private String netmask;
        private String svip;
        private Optional<String> gateway;
        private Optional<Boolean> namespace;
        private Optional<Attributes> attributes;

        private Builder() { }

        public AddVirtualNetworkRequest build() {
            return new AddVirtualNetworkRequest (
                         this.virtualNetworkTag,
                         this.name,
                         this.addressBlocks,
                         this.netmask,
                         this.svip,
                         this.gateway,
                         this.namespace,
                         this.attributes);
        }

        private AddVirtualNetworkRequest.Builder buildFrom(final AddVirtualNetworkRequest req) {
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

        public AddVirtualNetworkRequest.Builder virtualNetworkTag(final Long virtualNetworkTag) {
            this.virtualNetworkTag = virtualNetworkTag;
            return this;
        }

        public AddVirtualNetworkRequest.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public AddVirtualNetworkRequest.Builder addressBlocks(final AddressBlock[] addressBlocks) {
            this.addressBlocks = addressBlocks;
            return this;
        }

        public AddVirtualNetworkRequest.Builder netmask(final String netmask) {
            this.netmask = netmask;
            return this;
        }

        public AddVirtualNetworkRequest.Builder svip(final String svip) {
            this.svip = svip;
            return this;
        }

        public AddVirtualNetworkRequest.Builder optionalGateway(final String gateway) {
            this.gateway = (gateway == null) ? Optional.<String>empty() : Optional.of(gateway);
            return this;
        }

        public AddVirtualNetworkRequest.Builder optionalNamespace(final Boolean namespace) {
            this.namespace = (namespace == null) ? Optional.<Boolean>empty() : Optional.of(namespace);
            return this;
        }

        public AddVirtualNetworkRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
