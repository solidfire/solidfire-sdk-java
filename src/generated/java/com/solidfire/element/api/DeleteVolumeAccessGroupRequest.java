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
 * DeleteVolumeAccessGroupRequest  
 **/

public class DeleteVolumeAccessGroupRequest implements Serializable {

    public static final long serialVersionUID = 8476466628428325659L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("deleteOrphanInitiators") private Boolean deleteOrphanInitiators = true;

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
        Boolean deleteOrphanInitiators
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.deleteOrphanInitiators = deleteOrphanInitiators;
    }

    /** 
     * The ID of the volume access group to delete.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    /** 
     * true: Delete initiator objects after they are removed from a volume access group.
     * false: Do not delete initiator objects after they are removed from a volume access group.
     **/
    public Boolean getDeleteOrphanInitiators() { return this.deleteOrphanInitiators; }
    public void setDeleteOrphanInitiators(Boolean deleteOrphanInitiators) { 
        this.deleteOrphanInitiators = deleteOrphanInitiators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteVolumeAccessGroupRequest that = (DeleteVolumeAccessGroupRequest) o;

        return 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) && 
            Objects.equals(deleteOrphanInitiators, that.deleteOrphanInitiators);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID,deleteOrphanInitiators );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("deleteOrphanInitiators", deleteOrphanInitiators);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        sb.append(" deleteOrphanInitiators : ").append(deleteOrphanInitiators).append(",");
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
        private Boolean deleteOrphanInitiators;

        private Builder() { }

        public DeleteVolumeAccessGroupRequest build() {
            return new DeleteVolumeAccessGroupRequest (
                         this.volumeAccessGroupID,
                         this.deleteOrphanInitiators);
        }

        private DeleteVolumeAccessGroupRequest.Builder buildFrom(final DeleteVolumeAccessGroupRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.deleteOrphanInitiators = req.deleteOrphanInitiators;

            return this;
        }

        public DeleteVolumeAccessGroupRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public DeleteVolumeAccessGroupRequest.Builder deleteOrphanInitiators(final Boolean deleteOrphanInitiators) {
            this.deleteOrphanInitiators = deleteOrphanInitiators;
            return this;
        }

    }
}
