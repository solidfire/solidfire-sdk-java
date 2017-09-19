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
 * DeleteVolumeAccessGroupRequest  
 * DeleteVolumeAccessGroup enables you to delete a
 * volume access group.
 **/

public class DeleteVolumeAccessGroupRequest implements Serializable {

    public static final long serialVersionUID = -4577487893309432735L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("deleteOrphanInitiators") private Optional<Boolean> deleteOrphanInitiators;
    @SerializedName("force") private Optional<Boolean> force;
    // empty constructor
    @Since("7.0")
    public DeleteVolumeAccessGroupRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteVolumeAccessGroupRequest(
        Long volumeAccessGroupID
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    // parameterized constructor
    @Since("9.0")
    public DeleteVolumeAccessGroupRequest(
        Long volumeAccessGroupID,
        Optional<Boolean> deleteOrphanInitiators,
        Optional<Boolean> force
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.deleteOrphanInitiators = (deleteOrphanInitiators == null) ? Optional.<Boolean>empty() : deleteOrphanInitiators;
        this.force = (force == null) ? Optional.<Boolean>empty() : force;
    }

    /** 
     * The ID of the volume access group
     * to be deleted.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
   
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    /** 
     * true: Delete initiator objects after they are removed from a volume access group.
     * false: Do not delete initiator objects after they are removed from a volume access group.
     **/
    public Optional<Boolean> getDeleteOrphanInitiators() { return this.deleteOrphanInitiators; }
   
    public void setDeleteOrphanInitiators(Optional<Boolean> deleteOrphanInitiators) { 
        this.deleteOrphanInitiators = (deleteOrphanInitiators == null) ? Optional.<Boolean>empty() : deleteOrphanInitiators;
    }
    /** 
     * Adding this flag will force the volume access group to be deleted even though it has a Virtual Network ID or Tag.
     * true: Volume access group will be deleted.
     * false: Default. Do not delete the volume access group if it has a Virtual Network ID or Tag.
     **/
    public Optional<Boolean> getForce() { return this.force; }
   
    public void setForce(Optional<Boolean> force) { 
        this.force = (force == null) ? Optional.<Boolean>empty() : force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteVolumeAccessGroupRequest that = (DeleteVolumeAccessGroupRequest) o;

        return 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) && 
            Objects.equals(deleteOrphanInitiators, that.deleteOrphanInitiators) && 
            Objects.equals(force, that.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID,deleteOrphanInitiators,force );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("deleteOrphanInitiators", deleteOrphanInitiators);
        map.put("force", force);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(gson.toJson(volumeAccessGroupID)).append(",");
        if(null != deleteOrphanInitiators && deleteOrphanInitiators.isPresent()){
            sb.append(" deleteOrphanInitiators : ").append(gson.toJson(deleteOrphanInitiators)).append(",");
        }
        else{
            sb.append(" deleteOrphanInitiators : ").append("null").append(",");
        }
        if(null != force && force.isPresent()){
            sb.append(" force : ").append(gson.toJson(force)).append(",");
        }
        else{
            sb.append(" force : ").append("null").append(",");
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
        private Optional<Boolean> deleteOrphanInitiators;
        private Optional<Boolean> force;

        private Builder() { }

        public DeleteVolumeAccessGroupRequest build() {
            return new DeleteVolumeAccessGroupRequest (
                         this.volumeAccessGroupID,
                         this.deleteOrphanInitiators,
                         this.force);
        }

        private DeleteVolumeAccessGroupRequest.Builder buildFrom(final DeleteVolumeAccessGroupRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.deleteOrphanInitiators = req.deleteOrphanInitiators;
            this.force = req.force;

            return this;
        }

        public DeleteVolumeAccessGroupRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public DeleteVolumeAccessGroupRequest.Builder optionalDeleteOrphanInitiators(final Boolean deleteOrphanInitiators) {
            this.deleteOrphanInitiators = (deleteOrphanInitiators == null) ? Optional.<Boolean>empty() : Optional.of(deleteOrphanInitiators);
            return this;
        }

        public DeleteVolumeAccessGroupRequest.Builder optionalForce(final Boolean force) {
            this.force = (force == null) ? Optional.<Boolean>empty() : Optional.of(force);
            return this;
        }

    }
}
