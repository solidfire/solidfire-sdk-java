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
 * CreateVolumeAccessGroupRequest  
 **/

public class CreateVolumeAccessGroupRequest implements Serializable {

    public static final long serialVersionUID = 6824028462430624106L;
    @SerializedName("name") private String name;
    @SerializedName("initiators") private Optional<Iqn[]> initiators;
    @SerializedName("volumes") private Optional<VolumeID[]> volumes;
    @SerializedName("virtualNetworkID") private Optional<VirtualNetworkID[]> virtualNetworkID;
    @SerializedName("virtualNetworkTags") private Optional<VirtualNetworkTags[]> virtualNetworkTags;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public CreateVolumeAccessGroupRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateVolumeAccessGroupRequest(
        String name,
        Optional<Iqn[]> initiators,
        Optional<VolumeID[]> volumes,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.name = name;
        this.initiators = (initiators == null) ? Optional.<Iqn[]>empty() : initiators;
        this.volumes = (volumes == null) ? Optional.<VolumeID[]>empty() : volumes;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }
    // parameterized constructor
    @Since("8.0")
    public CreateVolumeAccessGroupRequest(
        String name,
        Optional<Iqn[]> initiators,
        Optional<VolumeID[]> volumes,
        Optional<VirtualNetworkID[]> virtualNetworkID,
        Optional<VirtualNetworkTags[]> virtualNetworkTags,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.name = name;
        this.initiators = (initiators == null) ? Optional.<Iqn[]>empty() : initiators;
        this.volumes = (volumes == null) ? Optional.<VolumeID[]>empty() : volumes;
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<VirtualNetworkID[]>empty() : virtualNetworkID;
        this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<VirtualNetworkTags[]>empty() : virtualNetworkTags;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * Name of the volume access group.
     * It is not required to be unique, but recommended.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * List of initiators to include in the volume access group.
     * If unspecified, the access group will start out without configured initiators.
     **/
    public Optional<Iqn[]> getInitiators() { return this.initiators; }
    public void setInitiators(Optional<Iqn[]> initiators) { 
        this.initiators = (initiators == null) ? Optional.<Iqn[]>empty() : initiators;
    }
    /** 
     * List of volumes to initially include in the volume access group.
     * If unspecified, the access group will start without any volumes.
     **/
    public Optional<VolumeID[]> getVolumes() { return this.volumes; }
    public void setVolumes(Optional<VolumeID[]> volumes) { 
        this.volumes = (volumes == null) ? Optional.<VolumeID[]>empty() : volumes;
    }
    /** 
     * The ID of the SolidFire Virtual Network ID to associate the volume access group with.
     **/
    public Optional<VirtualNetworkID[]> getVirtualNetworkID() { return this.virtualNetworkID; }
    public void setVirtualNetworkID(Optional<VirtualNetworkID[]> virtualNetworkID) { 
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<VirtualNetworkID[]>empty() : virtualNetworkID;
    }
    /** 
     * The ID of the VLAN Virtual Network Tag to associate the volume access group with.
     **/
    public Optional<VirtualNetworkTags[]> getVirtualNetworkTags() { return this.virtualNetworkTags; }
    public void setVirtualNetworkTags(Optional<VirtualNetworkTags[]> virtualNetworkTags) { 
        this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<VirtualNetworkTags[]>empty() : virtualNetworkTags;
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

        CreateVolumeAccessGroupRequest that = (CreateVolumeAccessGroupRequest) o;

        return 
            Objects.equals(name, that.name) && 
            Objects.equals(initiators, that.initiators) && 
            Objects.equals(volumes, that.volumes) && 
            Objects.equals(virtualNetworkID, that.virtualNetworkID) && 
            Objects.equals(virtualNetworkTags, that.virtualNetworkTags) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,initiators,volumes,virtualNetworkID,virtualNetworkTags,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("initiators", initiators);
        map.put("volumes", volumes);
        map.put("virtualNetworkID", virtualNetworkID);
        map.put("virtualNetworkTags", virtualNetworkTags);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" name : ").append(name).append(",");
        if(null != initiators && initiators.isPresent()){
            sb.append(" initiators : ").append(initiators).append(",");
        }
        if(null != volumes && volumes.isPresent()){
            sb.append(" volumes : ").append(volumes).append(",");
        }
        if(null != virtualNetworkID && virtualNetworkID.isPresent()){
            sb.append(" virtualNetworkID : ").append(virtualNetworkID).append(",");
        }
        if(null != virtualNetworkTags && virtualNetworkTags.isPresent()){
            sb.append(" virtualNetworkTags : ").append(virtualNetworkTags).append(",");
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
        private String name;
        private Optional<Iqn[]> initiators;
        private Optional<VolumeID[]> volumes;
        private Optional<VirtualNetworkID[]> virtualNetworkID;
        private Optional<VirtualNetworkTags[]> virtualNetworkTags;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public CreateVolumeAccessGroupRequest build() {
            return new CreateVolumeAccessGroupRequest (
                         this.name,
                         this.initiators,
                         this.volumes,
                         this.virtualNetworkID,
                         this.virtualNetworkTags,
                         this.attributes);
        }

        private CreateVolumeAccessGroupRequest.Builder buildFrom(final CreateVolumeAccessGroupRequest req) {
            this.name = req.name;
            this.initiators = req.initiators;
            this.volumes = req.volumes;
            this.virtualNetworkID = req.virtualNetworkID;
            this.virtualNetworkTags = req.virtualNetworkTags;
            this.attributes = req.attributes;

            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder optionalInitiators(final Iqn[] initiators) {
            this.initiators = (initiators == null) ? Optional.<Iqn[]>empty() : Optional.of(initiators);
            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder optionalVolumes(final VolumeID[] volumes) {
            this.volumes = (volumes == null) ? Optional.<VolumeID[]>empty() : Optional.of(volumes);
            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder optionalVirtualNetworkID(final VirtualNetworkID[] virtualNetworkID) {
            this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<VirtualNetworkID[]>empty() : Optional.of(virtualNetworkID);
            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder optionalVirtualNetworkTags(final VirtualNetworkTags[] virtualNetworkTags) {
            this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<VirtualNetworkTags[]>empty() : Optional.of(virtualNetworkTags);
            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
