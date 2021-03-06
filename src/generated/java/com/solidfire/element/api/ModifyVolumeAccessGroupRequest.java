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
 * ModifyVolumeAccessGroupRequest  
 * You can use ModifyVolumeAccessGroup to update initiators and add or remove volumes from a volume access group. If a specified initiator or volume is a duplicate of what currently exists, the volume access group is left as-is. If you do not specify a value for volumes or initiators, the current list of initiators and volumes is not changed.
 **/

public class ModifyVolumeAccessGroupRequest implements Serializable {

    public static final long serialVersionUID = -1410168109607648107L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("initiators") private Optional<String[]> initiators;
    @SerializedName("volumes") private Optional<Long[]> volumes;
    @SerializedName("deleteOrphanInitiators") private Optional<Boolean> deleteOrphanInitiators = Optional.of(true);
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public ModifyVolumeAccessGroupRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyVolumeAccessGroupRequest(
        Long volumeAccessGroupID,
        Optional<String> name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<Attributes> attributes
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.initiators = (initiators == null) ? Optional.<String[]>empty() : initiators;
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("9.0")
    public ModifyVolumeAccessGroupRequest(
        Long volumeAccessGroupID,
        Optional<String> name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<Boolean> deleteOrphanInitiators,
        Optional<Attributes> attributes
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.initiators = (initiators == null) ? Optional.<String[]>empty() : initiators;
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
        this.deleteOrphanInitiators = (deleteOrphanInitiators == null) ? Optional.<Boolean>empty() : deleteOrphanInitiators;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * The ID of the volume access group to modify.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
   
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    /** 
     * The new name for this volume access group. Not required to be unique, but recommended.
     **/
    public Optional<String> getName() { return this.name; }
   
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * List of initiators to include in the volume access group. If unspecified, the access group's configured initiators are not modified.
     **/
    public Optional<String[]> getInitiators() { return this.initiators; }
   
    public void setInitiators(Optional<String[]> initiators) { 
        this.initiators = (initiators == null) ? Optional.<String[]>empty() : initiators;
    }
    /** 
     * List of volumes to initially include in the volume access group. If unspecified, the access group's volumes are not modified.
     **/
    public Optional<Long[]> getVolumes() { return this.volumes; }
   
    public void setVolumes(Optional<Long[]> volumes) { 
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
    }
    /** 
     * true: Default. Delete initiator objects after they are removed from a volume access group.
     * false: Do not delete initiator objects after they are removed from a volume access group.
     **/
    public Optional<Boolean> getDeleteOrphanInitiators() { return this.deleteOrphanInitiators; }
   
    public void setDeleteOrphanInitiators(Optional<Boolean> deleteOrphanInitiators) { 
        this.deleteOrphanInitiators = (deleteOrphanInitiators == null) ? Optional.<Boolean>empty() : deleteOrphanInitiators;
    }
    /** 
     * List of name-value pairs in JSON object format.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVolumeAccessGroupRequest that = (ModifyVolumeAccessGroupRequest) o;

        return 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(initiators, that.initiators) && 
            Objects.equals(volumes, that.volumes) && 
            Objects.equals(deleteOrphanInitiators, that.deleteOrphanInitiators) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID,name,initiators,volumes,deleteOrphanInitiators,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("name", name);
        map.put("initiators", initiators);
        map.put("volumes", volumes);
        map.put("deleteOrphanInitiators", deleteOrphanInitiators);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(gson.toJson(volumeAccessGroupID)).append(",");
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(gson.toJson(name)).append(",");
        }
        else{
            sb.append(" name : ").append("null").append(",");
        }
        if(null != initiators && initiators.isPresent()){
            sb.append(" initiators : ").append(gson.toJson(initiators)).append(",");
        }
        else{
            sb.append(" initiators : ").append("null").append(",");
        }
        if(null != volumes && volumes.isPresent()){
            sb.append(" volumes : ").append(gson.toJson(volumes)).append(",");
        }
        else{
            sb.append(" volumes : ").append("null").append(",");
        }
        if(null != deleteOrphanInitiators && deleteOrphanInitiators.isPresent()){
            sb.append(" deleteOrphanInitiators : ").append(gson.toJson(deleteOrphanInitiators)).append(",");
        }
        else{
            sb.append(" deleteOrphanInitiators : ").append("null").append(",");
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
        private Long volumeAccessGroupID;
        private Optional<String> name;
        private Optional<String[]> initiators;
        private Optional<Long[]> volumes;
        private Optional<Boolean> deleteOrphanInitiators;
        private Optional<Attributes> attributes;

        private Builder() { }

        public ModifyVolumeAccessGroupRequest build() {
            return new ModifyVolumeAccessGroupRequest (
                         this.volumeAccessGroupID,
                         this.name,
                         this.initiators,
                         this.volumes,
                         this.deleteOrphanInitiators,
                         this.attributes);
        }

        private ModifyVolumeAccessGroupRequest.Builder buildFrom(final ModifyVolumeAccessGroupRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.name = req.name;
            this.initiators = req.initiators;
            this.volumes = req.volumes;
            this.deleteOrphanInitiators = req.deleteOrphanInitiators;
            this.attributes = req.attributes;

            return this;
        }

        public ModifyVolumeAccessGroupRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
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

        public ModifyVolumeAccessGroupRequest.Builder optionalDeleteOrphanInitiators(final Boolean deleteOrphanInitiators) {
            this.deleteOrphanInitiators = (deleteOrphanInitiators == null) ? Optional.<Boolean>empty() : Optional.of(deleteOrphanInitiators);
            return this;
        }

        public ModifyVolumeAccessGroupRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
