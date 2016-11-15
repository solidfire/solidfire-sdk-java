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

public class ModifyVolumeAccessGroupLunAssignmentsRequest implements Serializable {

    public static final long serialVersionUID = -2854592840284265047L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("lunAssignments") private LunAssignment[] lunAssignments;

    // empty constructor
    @Since("7.0")
    public ModifyVolumeAccessGroupLunAssignmentsRequest() {}

    // parameterized constructor
    @Since("7.0")
    public ModifyVolumeAccessGroupLunAssignmentsRequest(
        Long volumeAccessGroupID,
        LunAssignment[] lunAssignments
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.lunAssignments = lunAssignments;
    }

    /** 
     * Unique volume access group ID for which the LUN assignments will be modified.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    /** 
     * The volume IDs with new assigned LUN values.
     **/
    public LunAssignment[] getLunAssignments() { return this.lunAssignments; }
    public void setLunAssignments(LunAssignment[] lunAssignments) { 
        this.lunAssignments = lunAssignments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVolumeAccessGroupLunAssignmentsRequest that = (ModifyVolumeAccessGroupLunAssignmentsRequest) o;
        return 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) &&
            Objects.equals(lunAssignments, that.lunAssignments);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID, (Object[])lunAssignments );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("lunAssignments", lunAssignments);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        sb.append(" lunAssignments : ").append(Arrays.toString(lunAssignments)).append(",");
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

        private Builder() { }

        public ModifyVolumeAccessGroupLunAssignmentsRequest build() {
            return new ModifyVolumeAccessGroupLunAssignmentsRequest (
                         this.volumeAccessGroupID,
                         this.lunAssignments);
        }

        private ModifyVolumeAccessGroupLunAssignmentsRequest.Builder buildFrom(final ModifyVolumeAccessGroupLunAssignmentsRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.lunAssignments = req.lunAssignments;

            return this;
        }

        public ModifyVolumeAccessGroupLunAssignmentsRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public ModifyVolumeAccessGroupLunAssignmentsRequest.Builder lunAssignments(final LunAssignment[] lunAssignments) {
            this.lunAssignments = lunAssignments;
            return this;
        }

    }
}
