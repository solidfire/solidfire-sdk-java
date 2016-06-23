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
 * The Request object for the "CreateVolumeAccessGroup" API Service call.
 **/
public class CreateVolumeAccessGroupRequest implements Serializable {

    private static final long serialVersionUID = -1325323557L;

    @SerializedName("name") private final String name;
    @SerializedName("initiators") private final Optional<String[]> initiators;
    @SerializedName("volumes") private final Optional<long[]> volumes;
    @SerializedName("virtualNetworkID") private final Optional<long[]> virtualNetworkID;
    @SerializedName("virtualNetworkTags") private final Optional<long[]> virtualNetworkTags;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "CreateVolumeAccessGroup" API Service call.
     * @param name [required] Name of the volume access group.
     * @param initiators (optional) List of initiators to include in the volume access group.
     * @param volumes (optional) List of volumes to initially include in the volume access group.
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public CreateVolumeAccessGroupRequest(String name, Optional<String[]> initiators, Optional<long[]> volumes, Optional<java.util.Map<String, Object>> attributes) {
        this.name = name;
        this.virtualNetworkTags = Optional.<long[]>empty();
        this.virtualNetworkID = Optional.<long[]>empty();
        this.volumes = (volumes == null) ? Optional.<long[]>empty() : volumes;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.initiators = (initiators == null) ? Optional.<String[]>empty() : initiators;
    }

    /**
     * The Request object for the "CreateVolumeAccessGroup" API Service call.
     * @param name [required] Name of the volume access group.
     * @param initiators (optional) List of initiators to include in the volume access group.
     * @param volumes (optional) List of volumes to initially include in the volume access group.
     * @param virtualNetworkID (optional) The ID of the SolidFire Virtual Network ID to associate the volume access group with.
     * @param virtualNetworkTags (optional) The ID of the VLAN Virtual Network Tag to associate the volume access group with.
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 8.0
     **/
    @Since("8.0")
    public CreateVolumeAccessGroupRequest(String name, Optional<String[]> initiators, Optional<long[]> volumes, Optional<long[]> virtualNetworkID, Optional<long[]> virtualNetworkTags, Optional<java.util.Map<String, Object>> attributes) {
        this.name = name;
        this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<long[]>empty() : virtualNetworkTags;
        this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<long[]>empty() : virtualNetworkID;
        this.volumes = (volumes == null) ? Optional.<long[]>empty() : volumes;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.initiators = (initiators == null) ? Optional.<String[]>empty() : initiators;
    }


    /**
     * Name of the volume access group.
     * It is not required to be unique, but recommended.
     **/
    public String getName() {
        return this.name;
    }

    /**
     * List of initiators to include in the volume access group.
     * If unspecified, the access group will start out without configured initiators.
     **/
    public Optional<String[]> getInitiators() {
        return this.initiators;
    }

    /**
     * List of volumes to initially include in the volume access group.
     * If unspecified, the access group will start without any volumes.
     **/
    public Optional<long[]> getVolumes() {
        return this.volumes;
    }

    /**
     * The ID of the SolidFire Virtual Network ID to associate the volume access group with.
     * @since 8.0 
     **/

    @Since("8.0")
    public Optional<long[]> getVirtualNetworkID() {
        return this.virtualNetworkID;
    }

    /**
     * The ID of the VLAN Virtual Network Tag to associate the volume access group with.
     * @since 8.0 
     **/

    @Since("8.0")
    public Optional<long[]> getVirtualNetworkTags() {
        return this.virtualNetworkTags;
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

        CreateVolumeAccessGroupRequest that = (CreateVolumeAccessGroupRequest) o;
        

        return Objects.equals( name , that.name )
            && Objects.deepEquals( initiators , that.initiators )
            && Objects.deepEquals( volumes , that.volumes )
            && Objects.deepEquals( virtualNetworkID , that.virtualNetworkID )
            && Objects.deepEquals( virtualNetworkTags , that.virtualNetworkTags )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, initiators, volumes, virtualNetworkID, virtualNetworkTags, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" name : ").append(name).append(",");
        if(null != initiators && initiators.isPresent())
            sb.append(" initiators : ").append(Arrays.toString(initiators.get())).append(",");
        if(null != volumes && volumes.isPresent())
            sb.append(" volumes : ").append(Arrays.toString(volumes.get())).append(",");
        if(null != virtualNetworkID && virtualNetworkID.isPresent())
            sb.append(" virtualNetworkID : ").append(Arrays.toString(virtualNetworkID.get())).append(",");
        if(null != virtualNetworkTags && virtualNetworkTags.isPresent())
            sb.append(" virtualNetworkTags : ").append(Arrays.toString(virtualNetworkTags.get())).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private String name;
        private Optional<String[]> initiators;
        private Optional<long[]> volumes;
        private Optional<long[]> virtualNetworkID;
        private Optional<long[]> virtualNetworkTags;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public CreateVolumeAccessGroupRequest build() {
            return new CreateVolumeAccessGroupRequest (
                         this.name,
                         this.initiators,
                         this.volumes,
                         this.virtualNetworkID,
                         this.virtualNetworkTags,
                         this.attributes            );
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

        public CreateVolumeAccessGroupRequest.Builder optionalVolumes(final long[] volumes) {
            this.volumes = (volumes == null) ? Optional.<long[]>empty() : Optional.of(volumes);
            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder optionalVirtualNetworkID(final long[] virtualNetworkID) {
            this.virtualNetworkID = (virtualNetworkID == null) ? Optional.<long[]>empty() : Optional.of(virtualNetworkID);
            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder optionalVirtualNetworkTags(final long[] virtualNetworkTags) {
            this.virtualNetworkTags = (virtualNetworkTags == null) ? Optional.<long[]>empty() : Optional.of(virtualNetworkTags);
            return this;
        }

        public CreateVolumeAccessGroupRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
