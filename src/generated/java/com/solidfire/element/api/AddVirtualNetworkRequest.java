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
 * The Request object for the "AddVirtualNetwork" API Service call.
 **/
public class AddVirtualNetworkRequest  implements Serializable  {

    private static final long serialVersionUID = 531396962L;

    @SerializedName("virtualNetworkTag") private final Long virtualNetworkTag;
    @SerializedName("name") private final String name;
    @SerializedName("addressBlocks") private final AddressBlock[] addressBlocks;
    @SerializedName("netmask") private final String netmask;
    @SerializedName("svip") private final String svip;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "AddVirtualNetwork" API Service call.
     * @param virtualNetworkTag [required] A unique virtual network (VLAN) tag. Supported values are 1 to 4095 (the number zero (0) is not supported).
     * @param name [required] User defined name for the new virtual network.
     * @param addressBlocks [required] Unique Range of IP addresses to include in the virtual network.
     * @param netmask [required] Unique netmask for the virtual network being created.
     * @param svip [required] Unique storage IP address for the virtual network being created.
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public AddVirtualNetworkRequest(Long virtualNetworkTag, String name, AddressBlock[] addressBlocks, String netmask, String svip, Optional<java.util.Map<String, Object>> attributes) {
        this.name = name;
        this.virtualNetworkTag = virtualNetworkTag;
        this.netmask = netmask;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.addressBlocks = addressBlocks;
        this.svip = svip;
    }


    /**
     * A unique virtual network (VLAN) tag. Supported values are 1 to 4095 (the number zero (0) is not supported).
     **/
    public Long getVirtualNetworkTag() {
        return this.virtualNetworkTag;
    }

    /**
     * User defined name for the new virtual network.
     **/
    public String getName() {
        return this.name;
    }

    /**
     * Unique Range of IP addresses to include in the virtual network.
     * Attributes for this parameter are:
     * <b>start:</b> start of the IP address range. (String)
     * <b>size:</b> numbre of IP addresses to include in the block. (Integer)
     **/
    public AddressBlock[] getAddressBlocks() {
        return this.addressBlocks;
    }

    /**
     * Unique netmask for the virtual network being created.
     **/
    public String getNetmask() {
        return this.netmask;
    }

    /**
     * Unique storage IP address for the virtual network being created.
     **/
    public String getSvip() {
        return this.svip;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddVirtualNetworkRequest that = (AddVirtualNetworkRequest) o;
        

        return Objects.equals( virtualNetworkTag , that.virtualNetworkTag )
            && Objects.equals( name , that.name )
            && Objects.deepEquals( addressBlocks , that.addressBlocks )
            && Objects.equals( netmask , that.netmask )
            && Objects.equals( svip , that.svip )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualNetworkTag, name, addressBlocks, netmask, svip, attributes );
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
        private Long virtualNetworkTag;
        private String name;
        private AddressBlock[] addressBlocks;
        private String netmask;
        private String svip;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public AddVirtualNetworkRequest build() {
            return new AddVirtualNetworkRequest (
                         this.virtualNetworkTag,
                         this.name,
                         this.addressBlocks,
                         this.netmask,
                         this.svip,
                         this.attributes            );
        }

        private AddVirtualNetworkRequest.Builder buildFrom(final AddVirtualNetworkRequest req) {
            this.virtualNetworkTag = req.virtualNetworkTag;
            this.name = req.name;
            this.addressBlocks = req.addressBlocks;
            this.netmask = req.netmask;
            this.svip = req.svip;
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

        public AddVirtualNetworkRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
