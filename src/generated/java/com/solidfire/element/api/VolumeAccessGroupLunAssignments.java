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
 * VolumeAccessGroupLunAssignments  
 * VolumeAccessGroup ID and Lun to be assigned to all volumes within it.
 **/

public class VolumeAccessGroupLunAssignments implements Serializable {

    public static final long serialVersionUID = 7162952036650770771L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("lunAssignments") private LunAssignment[] lunAssignments;
    @SerializedName("deletedLunAssignments") private LunAssignment[] deletedLunAssignments;

    // empty constructor
    @Since("7.0")
    public VolumeAccessGroupLunAssignments() {}

    
    // parameterized constructor
    @Since("7.0")
    public VolumeAccessGroupLunAssignments(
        Long volumeAccessGroupID,
        LunAssignment[] lunAssignments,
        LunAssignment[] deletedLunAssignments
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.lunAssignments = lunAssignments;
        this.deletedLunAssignments = deletedLunAssignments;
    }

    /** 
     * Unique volume access group ID for which the LUN assignments will be modified.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    /** 
     * The volume IDs with assigned LUN values.
     **/
    public LunAssignment[] getLunAssignments() { return this.lunAssignments; }
    public void setLunAssignments(LunAssignment[] lunAssignments) { 
        this.lunAssignments = lunAssignments;
    }
    /** 
     * The volume IDs with deleted LUN values.
     **/
    public LunAssignment[] getDeletedLunAssignments() { return this.deletedLunAssignments; }
    public void setDeletedLunAssignments(LunAssignment[] deletedLunAssignments) { 
        this.deletedLunAssignments = deletedLunAssignments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumeAccessGroupLunAssignments that = (VolumeAccessGroupLunAssignments) o;

        return 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) && 
            Arrays.equals(lunAssignments, that.lunAssignments) && 
            Arrays.equals(deletedLunAssignments, that.deletedLunAssignments);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID,(Object[])lunAssignments,(Object[])deletedLunAssignments );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("lunAssignments", lunAssignments);
        map.put("deletedLunAssignments", deletedLunAssignments);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        sb.append(" lunAssignments : ").append(Arrays.toString(lunAssignments)).append(",");
        sb.append(" deletedLunAssignments : ").append(Arrays.toString(deletedLunAssignments)).append(",");
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
        private LunAssignment[] lunAssignments;
        private LunAssignment[] deletedLunAssignments;

        private Builder() { }

        public VolumeAccessGroupLunAssignments build() {
            return new VolumeAccessGroupLunAssignments (
                         this.volumeAccessGroupID,
                         this.lunAssignments,
                         this.deletedLunAssignments);
        }

        private VolumeAccessGroupLunAssignments.Builder buildFrom(final VolumeAccessGroupLunAssignments req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.lunAssignments = req.lunAssignments;
            this.deletedLunAssignments = req.deletedLunAssignments;

            return this;
        }

        public VolumeAccessGroupLunAssignments.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public VolumeAccessGroupLunAssignments.Builder lunAssignments(final LunAssignment[] lunAssignments) {
            this.lunAssignments = lunAssignments;
            return this;
        }

        public VolumeAccessGroupLunAssignments.Builder deletedLunAssignments(final LunAssignment[] deletedLunAssignments) {
            this.deletedLunAssignments = deletedLunAssignments;
            return this;
        }

    }
}
