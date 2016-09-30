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
 * VolumeAccessGroup ID and Lun to be assigned to all volumes within it.
 **/
public class VolumeAccessGroupLunAssignments  implements Serializable  {

    private static final long serialVersionUID = 568929847L;

    @SerializedName("volumeAccessGroupID") private final Long volumeAccessGroupID;
    @SerializedName("lunAssignments") private final LunAssignment[] lunAssignments;
    @SerializedName("deletedLunAssignments") private final LunAssignment[] deletedLunAssignments;

    /**
     * VolumeAccessGroup ID and Lun to be assigned to all volumes within it.
     * @param volumeAccessGroupID [required] Unique volume access group ID for which the LUN assignments will be modified.
     * @param lunAssignments [required] The volume IDs with assigned LUN values.
     * @param deletedLunAssignments [required] The volume IDs with deleted LUN values.
     * @since 7.0
     **/
    @Since("7.0")
    public VolumeAccessGroupLunAssignments(Long volumeAccessGroupID, LunAssignment[] lunAssignments, LunAssignment[] deletedLunAssignments) {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.lunAssignments = lunAssignments;
        this.deletedLunAssignments = deletedLunAssignments;
    }


    /**
     * Unique volume access group ID for which the LUN assignments will be modified.
     **/
    public Long getVolumeAccessGroupID() {
        return this.volumeAccessGroupID;
    }

    /**
     * The volume IDs with assigned LUN values.
     **/
    public LunAssignment[] getLunAssignments() {
        return this.lunAssignments;
    }

    /**
     * The volume IDs with deleted LUN values.
     **/
    public LunAssignment[] getDeletedLunAssignments() {
        return this.deletedLunAssignments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumeAccessGroupLunAssignments that = (VolumeAccessGroupLunAssignments) o;
        

        return Objects.equals( volumeAccessGroupID , that.volumeAccessGroupID )
            && Objects.deepEquals( lunAssignments , that.lunAssignments )
            && Objects.deepEquals( deletedLunAssignments , that.deletedLunAssignments );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID, lunAssignments, deletedLunAssignments );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        sb.append(" lunAssignments : ").append(Arrays.toString(lunAssignments)).append(",");
        sb.append(" deletedLunAssignments : ").append(Arrays.toString(deletedLunAssignments));
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
                         this.deletedLunAssignments            );
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
