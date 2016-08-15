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
 * The Request object for the "ModifyVirtualNetwork" API Service call.
 **/
public class ModifyVirtualNetworkRequest  implements Serializable  {

    private static final long serialVersionUID = -1612380447L;

    @SerializedName("virtualNetworkID") private final Optional<Long> virtualNetworkID;
    @SerializedName("virtualNetworkTag") private final Optional<Long> virtualNetworkTag;
    @SerializedName("name") private final Optional<String> name;
    @SerializedName("addressBlocks") private final Optional<AddressBlock[]> addressBlocks;
    @SerializedName("netmask") private final Optional<String> netmask;
    @SerializedName("svip") private final Optional<String> svip;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "ModifyVirtualNetwork" API Service call.
     * @param virtualNetworkID (optional) Unique identifier of the virtual network to modify. This is the virtual network ID assigned by the SolidFire cluster.
     * @param virtualNetworkTag (optional) Network Tag that identifies the virtual network to modify.
     * @param name (optional) New name for the virtual network.
     * @param addressBlocks (optional) New addressBlock to set for this Virtual Network object. This may contain new address blocks to add to the existing object or it may omit unused address blocks that need to be removed. Alternatively, existing address blocks may be extended or reduced in size. The size of the starting addressBlocks for a Virtual Network object can only be increased, and can never be decreased.
     * @param netmask (optional) New netmask for this virtual network.
     * @param svip (optional) The storage virtual IP address for this virtual network. The svip for Virtual Network cannot be changed. A new Virtual Network must be created in order to use a different svip address.
     * @param attributes (optional) A new list of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public ModifyVirtualNetworkRequest(Optional<Long> virtualNetworkID, Optional<Long> virtualNetworkTag, Optional<String> name, Optional<AddressBlock[]> addressBlocks, Optional<String> netmask, Optional<String> svip, Optional<java.util.Map<String, Object>> attributes) {
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
        this.netmask = (netmask == null) ? Optional.<String>empty() : netmask;
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : virtualNetworkID;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.addressBlocks = (addressBlocks == null) ? Optional.<AddressBlock[]>empty() : addressBlocks;
        this.svip = (svip == null) ? Optional.<String>empty() : svip;
    }


    /**
     * Unique identifier of the virtual network to modify. This is the virtual network ID assigned by the SolidFire cluster.
     **/
    public Optional<Long> getVirtualNetworkID() {
        return this.virtualNetworkID;
    }

    /**
     * Network Tag that identifies the virtual network to modify.
     **/
    public Optional<Long> getVirtualNetworkTag() {
        return this.virtualNetworkTag;
    }

    /**
     * New name for the virtual network.
     **/
    public Optional<String> getName() {
        return this.name;
    }

    /**
     * New addressBlock to set for this Virtual Network object. This may contain new address blocks to add to the existing object or it may omit unused address blocks that need to be removed. Alternatively, existing address blocks may be extended or reduced in size. The size of the starting addressBlocks for a Virtual Network object can only be increased, and can never be decreased.
     * Attributes for this parameter are:
     * <b>start:</b> start of the IP address range. (String)
     * <b>size:</b> numbre of IP addresses to include in the block. (Integer)
     **/
    public Optional<AddressBlock[]> getAddressBlocks() {
        return this.addressBlocks;
    }

    /**
     * New netmask for this virtual network.
     **/
    public Optional<String> getNetmask() {
        return this.netmask;
    }

    /**
     * The storage virtual IP address for this virtual network. The svip for Virtual Network cannot be changed. A new Virtual Network must be created in order to use a different svip address.
     **/
    public Optional<String> getSvip() {
        return this.svip;
    }

    /**
     * A new list of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVirtualNetworkRequest that = (ModifyVirtualNetworkRequest) o;
        

        return Objects.equals( virtualNetworkID , that.virtualNetworkID )
            && Objects.equals( virtualNetworkTag , that.virtualNetworkTag )
            && Objects.equals( name , that.name )
            && Objects.deepEquals( addressBlocks , that.addressBlocks )
            && Objects.equals( netmask , that.netmask )
            && Objects.equals( svip , that.svip )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualNetworkID, virtualNetworkTag, name, addressBlocks, netmask, svip, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != virtualNetworkID && virtualNetworkID.isPresent())
            sb.append(" virtualNetworkID : ").append(virtualNetworkID.get()).append(",");
        if(null != virtualNetworkTag && virtualNetworkTag.isPresent())
            sb.append(" virtualNetworkTag : ").append(virtualNetworkTag.get()).append(",");
        if(null != name && name.isPresent())
            sb.append(" name : ").append(name.get()).append(",");
        if(null != addressBlocks && addressBlocks.isPresent())
            sb.append(" addressBlocks : ").append(Arrays.toString(addressBlocks.get())).append(",");
        if(null != netmask && netmask.isPresent())
            sb.append(" netmask : ").append(netmask.get()).append(",");
        if(null != svip && svip.isPresent())
            sb.append(" svip : ").append(svip.get()).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
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
                         this.attributes            );
        }

        private ModifyVirtualNetworkRequest.Builder buildFrom(final ModifyVirtualNetworkRequest req) {
            this.virtualNetworkID = req.virtualNetworkID;
            this.virtualNetworkTag = req.virtualNetworkTag;
            this.name = req.name;
            this.addressBlocks = req.addressBlocks;
            this.netmask = req.netmask;
            this.svip = req.svip;
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

        public ModifyVirtualNetworkRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
