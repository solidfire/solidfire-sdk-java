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

public class ListVirtualNetworksRequest implements Serializable {

    public static final long serialVersionUID = 323479911027186489L;
    @SerializedName("virtualNetworkID") private Optional<Long> virtualNetworkID;
    @SerializedName("virtualNetworkTag") private Optional<Long> virtualNetworkTag;
    @SerializedName("virtualNetworkIDs") private Optional<Long[]> virtualNetworkIDs;
    @SerializedName("virtualNetworkTags") private Optional<Long[]> virtualNetworkTags;

    // empty constructor
    @Since("7.0")
    public ListVirtualNetworksRequest() {}

    // parameterized constructor
    @Since("7.0")
    public ListVirtualNetworksRequest(
        Optional<Long> virtualNetworkID,
        Optional<Long> virtualNetworkTag,
        Optional<Long[]> virtualNetworkIDs,
        Optional<Long[]> virtualNetworkTags
    )
    {
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : virtualNetworkID;
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
        this.virtualNetworkIDs = (virtualNetworkIDs == null) ? Optional.<Long[]>empty() : virtualNetworkIDs;
        this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<Long[]>empty() : virtualNetworkTags;
    }

    /** 
     * Network ID to filter the list for a single virtual network
     **/
    public Optional<Long> getVirtualNetworkID() { return this.virtualNetworkID; }
    public void setVirtualNetworkID(Optional<Long> virtualNetworkID) { 
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : virtualNetworkID;
    }
    /** 
     * Network Tag to filter the list for a single virtual network
     **/
    public Optional<Long> getVirtualNetworkTag() { return this.virtualNetworkTag; }
    public void setVirtualNetworkTag(Optional<Long> virtualNetworkTag) { 
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
    }
    /** 
     * NetworkIDs to include in the list.
     **/
    public Optional<Long[]> getVirtualNetworkIDs() { return this.virtualNetworkIDs; }
    public void setVirtualNetworkIDs(Optional<Long[]> virtualNetworkIDs) { 
        this.virtualNetworkIDs = (virtualNetworkIDs == null) ? Optional.<Long[]>empty() : virtualNetworkIDs;
    }
    /** 
     * Network Tags to include in the list.
     **/
    public Optional<Long[]> getVirtualNetworkTags() { return this.virtualNetworkTags; }
    public void setVirtualNetworkTags(Optional<Long[]> virtualNetworkTags) { 
        this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<Long[]>empty() : virtualNetworkTags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualNetworksRequest that = (ListVirtualNetworksRequest) o;
        return 
            Objects.equals(virtualNetworkID, that.virtualNetworkID) &&
            Objects.equals(virtualNetworkTag, that.virtualNetworkTag) &&
            Arrays.equals(virtualNetworkIDs, that.virtualNetworkIDs) &&
            Arrays.equals(virtualNetworkTags, that.virtualNetworkTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualNetworkID, virtualNetworkTag, virtualNetworkIDs, virtualNetworkTags );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualNetworkID", virtualNetworkID);
        map.put("virtualNetworkTag", virtualNetworkTag);
        map.put("virtualNetworkIDs", virtualNetworkIDs);
        map.put("virtualNetworkTags", virtualNetworkTags);
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
        if(null != virtualNetworkIDs && virtualNetworkIDs.isPresent()){
            sb.append(" virtualNetworkIDs : ").append(virtualNetworkIDs).append(",");
        }
        if(null != virtualNetworkTags && virtualNetworkTags.isPresent()){
            sb.append(" virtualNetworkTags : ").append(virtualNetworkTags).append(",");
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
        private Optional<Long[]> virtualNetworkIDs;
        private Optional<Long[]> virtualNetworkTags;

        private Builder() { }

        public ListVirtualNetworksRequest build() {
            return new ListVirtualNetworksRequest (
                         this.virtualNetworkID,
                         this.virtualNetworkTag,
                         this.virtualNetworkIDs,
                         this.virtualNetworkTags);
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
