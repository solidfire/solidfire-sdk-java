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
 * The Request object for the "ListVirtualNetworks" API Service call.
 **/
public class ListVirtualNetworksRequest  implements Serializable  {

    private static final long serialVersionUID = -1763276070L;

    @SerializedName("virtualNetworkID") private final Optional<Long> virtualNetworkID;
    @SerializedName("virtualNetworkTag") private final Optional<Long> virtualNetworkTag;
    @SerializedName("virtualNetworkIDs") private final Optional<Long[]> virtualNetworkIDs;
    @SerializedName("virtualNetworkTags") private final Optional<Long[]> virtualNetworkTags;

    /**
     * The Request object for the "ListVirtualNetworks" API Service call.
     * @param virtualNetworkID (optional) Network ID to filter the list for a single virtual network
     * @param virtualNetworkTag (optional) Network Tag to filter the list for a single virtual network
     * @param virtualNetworkIDs (optional) NetworkIDs to include in the list.
     * @param virtualNetworkTags (optional) Network Tags to include in the list.
     * @since 7.0
     **/
    @Since("7.0")
    public ListVirtualNetworksRequest(Optional<Long> virtualNetworkID, Optional<Long> virtualNetworkTag, Optional<Long[]> virtualNetworkIDs, Optional<Long[]> virtualNetworkTags) {
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : virtualNetworkID;
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
        this.virtualNetworkIDs = (virtualNetworkIDs == null) ? Optional.<Long[]>empty() : virtualNetworkIDs;
        this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<Long[]>empty() : virtualNetworkTags;
    }


    /**
     * Network ID to filter the list for a single virtual network
     **/
    public Optional<Long> getVirtualNetworkID() {
        return this.virtualNetworkID;
    }

    /**
     * Network Tag to filter the list for a single virtual network
     **/
    public Optional<Long> getVirtualNetworkTag() {
        return this.virtualNetworkTag;
    }

    /**
     * NetworkIDs to include in the list.
     **/
    public Optional<Long[]> getVirtualNetworkIDs() {
        return this.virtualNetworkIDs;
    }

    /**
     * Network Tags to include in the list.
     **/
    public Optional<Long[]> getVirtualNetworkTags() {
        return this.virtualNetworkTags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualNetworksRequest that = (ListVirtualNetworksRequest) o;
        

        return Objects.equals( virtualNetworkID , that.virtualNetworkID )
            && Objects.equals( virtualNetworkTag , that.virtualNetworkTag )
            && Objects.deepEquals( virtualNetworkIDs , that.virtualNetworkIDs )
            && Objects.deepEquals( virtualNetworkTags , that.virtualNetworkTags );
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualNetworkID, virtualNetworkTag, virtualNetworkIDs, virtualNetworkTags );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != virtualNetworkID && virtualNetworkID.isPresent())
            sb.append(" virtualNetworkID : ").append(virtualNetworkID.get()).append(",");
        if(null != virtualNetworkTag && virtualNetworkTag.isPresent())
            sb.append(" virtualNetworkTag : ").append(virtualNetworkTag.get()).append(",");
        if(null != virtualNetworkIDs && virtualNetworkIDs.isPresent())
            sb.append(" virtualNetworkIDs : ").append(Arrays.toString(virtualNetworkIDs.get())).append(",");
        if(null != virtualNetworkTags && virtualNetworkTags.isPresent())
            sb.append(" virtualNetworkTags : ").append(Arrays.toString(virtualNetworkTags.get()));
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
        private Optional<Long[]> virtualNetworkIDs;
        private Optional<Long[]> virtualNetworkTags;

        private Builder() { }

        public ListVirtualNetworksRequest build() {
            return new ListVirtualNetworksRequest (
                         this.virtualNetworkID,
                         this.virtualNetworkTag,
                         this.virtualNetworkIDs,
                         this.virtualNetworkTags            );
        }

        private ListVirtualNetworksRequest.Builder buildFrom(final ListVirtualNetworksRequest req) {
            this.virtualNetworkID = req.virtualNetworkID;
            this.virtualNetworkTag = req.virtualNetworkTag;
            this.virtualNetworkIDs = req.virtualNetworkIDs;
            this.virtualNetworkTags = req.virtualNetworkTags;

            return this;
        }

        public ListVirtualNetworksRequest.Builder optionalVirtualNetworkID(final Long virtualNetworkID) {
            this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : Optional.of(virtualNetworkID);
            return this;
        }

        public ListVirtualNetworksRequest.Builder optionalVirtualNetworkTag(final Long virtualNetworkTag) {
            this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : Optional.of(virtualNetworkTag);
            return this;
        }

        public ListVirtualNetworksRequest.Builder optionalVirtualNetworkIDs(final Long[] virtualNetworkIDs) {
            this.virtualNetworkIDs = (virtualNetworkIDs == null) ? Optional.<Long[]>empty() : Optional.of(virtualNetworkIDs);
            return this;
        }

        public ListVirtualNetworksRequest.Builder optionalVirtualNetworkTags(final Long[] virtualNetworkTags) {
            this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<Long[]>empty() : Optional.of(virtualNetworkTags);
            return this;
        }

    }

}
