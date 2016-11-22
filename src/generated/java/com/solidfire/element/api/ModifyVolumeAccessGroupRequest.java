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

public class ModifyVolumeAccessGroupRequest implements Serializable {

    public static final long serialVersionUID = -695617336L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("virtualNetworkID") private Optional<Long[]> virtualNetworkID;
    @SerializedName("virtualNetworkTags") private Optional<Long[]> virtualNetworkTags;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("initiators") private Optional<String[]> initiators;
    @SerializedName("volumes") private Optional<Long[]> volumes;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public ModifyVolumeAccessGroupRequest() {}

    // parameterized constructor
    @Since("7.0")
    public ModifyVolumeAccessGroupRequest(
        Long volumeAccessGroupID,
        Optional<Long[]> virtualNetworkID,
        Optional<Long[]> virtualNetworkTags,
        Optional<String> name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long[]>empty() : virtualNetworkID;
        this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<Long[]>empty() : virtualNetworkTags;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.initiators = (initiators == null) ? Optional.<String[]>empty() : initiators;
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * The ID of the volume access group to modify.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    /** 
     * The ID of the SolidFire Virtual Network ID to associate the volume access group with.
     **/
    public Optional<Long[]> getVirtualNetworkID() { return this.virtualNetworkID; }
    public void setVirtualNetworkID(Optional<Long[]> virtualNetworkID) { 
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long[]>empty() : virtualNetworkID;
    }
    /** 
     * The ID of the VLAN Virtual Network Tag to associate the volume access group with.
     **/
    public Optional<Long[]> getVirtualNetworkTags() { return this.virtualNetworkTags; }
    public void setVirtualNetworkTags(Optional<Long[]> virtualNetworkTags) { 
        this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<Long[]>empty() : virtualNetworkTags;
    }
    /** 
     * Name of the volume access group.
     * It is not required to be unique, but recommended.
     **/
    public Optional<String> getName() { return this.name; }
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * List of initiators to include in the volume access group.
     * If unspecified, the access group's configured initiators will not be modified.
     **/
    public Optional<String[]> getInitiators() { return this.initiators; }
    public void setInitiators(Optional<String[]> initiators) { 
        this.initiators = (initiators == null) ? Optional.<String[]>empty() : initiators;
    }
    /** 
     * List of volumes to initially include in the volume access group.
     * If unspecified, the access group's volumes will not be modified.
     **/
    public Optional<Long[]> getVolumes() { return this.volumes; }
    public void setVolumes(Optional<Long[]> volumes) { 
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<java.util.Map<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVolumeAccessGroupRequest that = (ModifyVolumeAccessGroupRequest) o;
        return 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) &&
            Arrays.equals(virtualNetworkID, that.virtualNetworkID) &&
            Arrays.equals(virtualNetworkTags, that.virtualNetworkTags) &&
            Objects.equals(name, that.name) &&
            Arrays.equals(initiators, that.initiators) &&
            Arrays.equals(volumes, that.volumes) &&
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID, virtualNetworkID, virtualNetworkTags, name, initiators, volumes, attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("virtualNetworkID", virtualNetworkID);
        map.put("virtualNetworkTags", virtualNetworkTags);
        map.put("name", name);
        map.put("initiators", initiators);
        map.put("volumes", volumes);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        if(null != virtualNetworkID && virtualNetworkID.isPresent()){
            sb.append(" virtualNetworkID : ").append(virtualNetworkID.get()).append(",");
        }
        if(null != virtualNetworkTags && virtualNetworkTags.isPresent()){
            sb.append(" virtualNetworkTags : ").append(virtualNetworkTags.get()).append(",");
        }
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(name.get()).append(",");
        }
        if(null != initiators && initiators.isPresent()){
            sb.append(" initiators : ").append(initiators.get()).append(",");
        }
        if(null != volumes && volumes.isPresent()){
            sb.append(" volumes : ").append(volumes.get()).append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes.get()).append(",");
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
        private Long volumeAccessGroupID;
        private Optional<Long[]> virtualNetworkID;
        private Optional<Long[]> virtualNetworkTags;
        private Optional<String> name;
        private Optional<String[]> initiators;
        private Optional<Long[]> volumes;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public ModifyVolumeAccessGroupRequest build() {
            return new ModifyVolumeAccessGroupRequest (
                         this.volumeAccessGroupID,
                         this.virtualNetworkID,
                         this.virtualNetworkTags,
                         this.name,
                         this.initiators,
                         this.volumes,
                         this.attributes);
        }

        private ModifyVolumeAccessGroupRequest.Builder buildFrom(final ModifyVolumeAccessGroupRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.virtualNetworkID = req.virtualNetworkID;
            this.virtualNetworkTags = req.virtualNetworkTags;
            this.name = req.name;
            this.initiators = req.initiators;
            this.volumes = req.volumes;
            this.attributes = req.attributes;

            return this;
        }

        public ModifyVolumeAccessGroupRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public ModifyVolumeAccessGroupRequest.Builder optionalVirtualNetworkID(final Long[] virtualNetworkID) {
            this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long[]>empty() : Optional.of(virtualNetworkID);
            return this;
        }

        public ModifyVolumeAccessGroupRequest.Builder optionalVirtualNetworkTags(final Long[] virtualNetworkTags) {
            this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<Long[]>empty() : Optional.of(virtualNetworkTags);
            return this;
        }

        public ModifyVolumeAccessGroupRequest.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public ModifyVolumeAccessGroupRequest.Builder optionalInitiators(final String[] initiators) {
            this.initiators = (initiators == null) ? Optional.<String[]>empty() : Optional.of(initiators);
            return this;
        }

        public ModifyVolumeAccessGroupRequest.Builder optionalVolumes(final Long[] volumes) {
            this.volumes = (volumes == null) ? Optional.<Long[]>empty() : Optional.of(volumes);
            return this;
        }

        public ModifyVolumeAccessGroupRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
