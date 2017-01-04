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
 * RemoveVirtualNetworkRequest  
 **/

public class RemoveVirtualNetworkRequest implements Serializable {

    public static final long serialVersionUID = -7622530625529296409L;
    @SerializedName("virtualNetworkID") private Optional<Long> virtualNetworkID;
    @SerializedName("virtualNetworkTag") private Optional<Long> virtualNetworkTag;

    // empty constructor
    @Since("7.0")
    public RemoveVirtualNetworkRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RemoveVirtualNetworkRequest(
        Optional<Long> virtualNetworkID,
        Optional<Long> virtualNetworkTag
    )
    {
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : virtualNetworkID;
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
    }

    /** 
     * Network ID that identifies the virtual network to remove.
     **/
    public Optional<Long> getVirtualNetworkID() { return this.virtualNetworkID; }
    public void setVirtualNetworkID(Optional<Long> virtualNetworkID) { 
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : virtualNetworkID;
    }
    /** 
     * Network Tag that identifies the virtual network to remove.
     **/
    public Optional<Long> getVirtualNetworkTag() { return this.virtualNetworkTag; }
    public void setVirtualNetworkTag(Optional<Long> virtualNetworkTag) { 
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveVirtualNetworkRequest that = (RemoveVirtualNetworkRequest) o;

        return 
            Objects.equals(virtualNetworkID, that.virtualNetworkID) && 
            Objects.equals(virtualNetworkTag, that.virtualNetworkTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualNetworkID,virtualNetworkTag );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualNetworkID", virtualNetworkID);
        map.put("virtualNetworkTag", virtualNetworkTag);
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

        private Builder() { }

        public RemoveVirtualNetworkRequest build() {
            return new RemoveVirtualNetworkRequest (
                         this.virtualNetworkID,
                         this.virtualNetworkTag);
        }

        private RemoveVirtualNetworkRequest.Builder buildFrom(final RemoveVirtualNetworkRequest req) {
            this.virtualNetworkID = req.virtualNetworkID;
            this.virtualNetworkTag = req.virtualNetworkTag;

            return this;
        }

        public RemoveVirtualNetworkRequest.Builder optionalVirtualNetworkID(final Long virtualNetworkID) {
            this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long>empty() : Optional.of(virtualNetworkID);
            return this;
        }

        public RemoveVirtualNetworkRequest.Builder optionalVirtualNetworkTag(final Long virtualNetworkTag) {
            this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : Optional.of(virtualNetworkTag);
            return this;
        }

    }
}
