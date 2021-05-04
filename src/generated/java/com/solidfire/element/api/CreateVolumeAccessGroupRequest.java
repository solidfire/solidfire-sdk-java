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
 * CreateVolumeAccessGroupRequest  
 * You can use CreateVolumeAccessGroup to create a new volume access group. When you create the volume access group, you need to give it a name, and you can optionally enter initiators and volumes. After you create the group, you can add volumes and initiator IQNs. Any initiator IQN that you add to the volume access group is able to access any volume in the group without CHAP authentication.
 **/

public class CreateVolumeAccessGroupRequest implements Serializable {

    public static final long serialVersionUID = -8183863011571728646L;
    @SerializedName("name") private String name;
    @SerializedName("initiators") private Optional<String[]> initiators;
    @SerializedName("volumes") private Optional<Long[]> volumes;
    @SerializedName("virtualNetworkID") private Optional<Long[]> virtualNetworkID;
    @SerializedName("virtualNetworkTags") private Optional<Long[]> virtualNetworkTags;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public CreateVolumeAccessGroupRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateVolumeAccessGroupRequest(
        String name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<Attributes> attributes
    )
    {
        this.name = name;
        this.initiators = (initiators == null) ? Optional.<String[]>empty() : initiators;
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("8.0")
    public CreateVolumeAccessGroupRequest(
        String name,
        Optional<String[]> initiators,
        Optional<Long[]> volumes,
        Optional<Long[]> virtualNetworkID,
        Optional<Long[]> virtualNetworkTags,
        Optional<Attributes> attributes
    )
    {
        this.name = name;
        this.initiators = (initiators == null) ? Optional.<String[]>empty() : initiators;
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long[]>empty() : virtualNetworkID;
        this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<Long[]>empty() : virtualNetworkTags;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * The name for this volume access group. Not required to be unique, but recommended.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
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
     * The ID of the SolidFire virtual network to associate the volume access group with.
     **/
    public Optional<Long[]> getVirtualNetworkID() { return this.virtualNetworkID; }
   
    public void setVirtualNetworkID(Optional<Long[]> virtualNetworkID) { 
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long[]>empty() : virtualNetworkID;
    }
    /** 
     * The ID of the SolidFire virtual network to associate the volume access group with.
     **/
    public Optional<Long[]> getVirtualNetworkTags() { return this.virtualNetworkTags; }
   
    public void setVirtualNetworkTags(Optional<Long[]> virtualNetworkTags) { 
        this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<Long[]>empty() : virtualNetworkTags;
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
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" name : ").append(gson.toJson(name)).append(",");
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
        if(null != virtualNetworkID && virtualNetworkID.isPresent()){
            sb.append(" virtualNetworkID : ").append(gson.toJson(virtualNetworkID)).append(",");
        }
        else{
            sb.append(" virtualNetworkID : ").append("null").append(",");
        }
        if(null != virtualNetworkTags && virtualNetworkTags.isPresent()){
            sb.append(" virtualNetworkTags : ").append(gson.toJson(virtualNetworkTags)).append(",");
        }
        else{
            sb.append(" virtualNetworkTags : ").append("null").append(",");
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
        private String name;
        private Optional<String[]> initiators;
        private Optional<Long[]> volumes;
        private Optional<Long[]> virtualNetworkID;
        private Optional<Long[]> virtualNetworkTags;
        private Optional<Attributes> attributes;

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

        public CreateVolumeAccessGroupRequest.Builder optionalInitiators(final String[] initiators) {
            this.initiators = (initiators == null) ? Optional.<String[]>empty() : Optional.of(initiators);
            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder optionalVolumes(final Long[] volumes) {
            this.volumes = (volumes == null) ? Optional.<Long[]>empty() : Optional.of(volumes);
            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder optionalVirtualNetworkID(final Long[] virtualNetworkID) {
            this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<Long[]>empty() : Optional.of(virtualNetworkID);
            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder optionalVirtualNetworkTags(final Long[] virtualNetworkTags) {
            this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<Long[]>empty() : Optional.of(virtualNetworkTags);
            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
