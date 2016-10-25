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
 * The Request object for the "ModifyVolumeAccessGroupLunAssignments" API Service call.
 **/
public class ModifyVolumeAccessGroupLunAssignmentsRequest  implements Serializable  {

    private static final long serialVersionUID = 326091512L;

    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("lunAssignments") private LunAssignment[] lunAssignments;

    /**
     * The Request object for the "ModifyVolumeAccessGroupLunAssignments" API Service call.
     * @param volumeAccessGroupID [required] Unique volume access group ID for which the LUN assignments will be modified.
     * @param lunAssignments [required] The volume IDs with new assigned LUN values.
     * @since 7.0
     **/
    @Since("7.0")
    public ModifyVolumeAccessGroupLunAssignmentsRequest(Long volumeAccessGroupID, LunAssignment[] lunAssignments) {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.lunAssignments = lunAssignments;
    }

    
    /**
     * The Request object for the "ModifyVolumeAccessGroupLunAssignments" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public ModifyVolumeAccessGroupLunAssignmentsRequest() {}


    /**
     * Unique volume access group ID for which the LUN assignments will be modified.
     **/
    public Long getVolumeAccessGroupID() {
        return this.volumeAccessGroupID;
    }

    public void setVolumeAccessGroupID(Long volumeAccessGroupID) {
        this.volumeAccessGroupID = volumeAccessGroupID;
    }



    /**
     * The volume IDs with new assigned LUN values.
     **/
    public LunAssignment[] getLunAssignments() {
        return this.lunAssignments;
    }

    public void setLunAssignments(LunAssignment[] lunAssignments) {
        this.lunAssignments = lunAssignments;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVolumeAccessGroupLunAssignmentsRequest that = (ModifyVolumeAccessGroupLunAssignmentsRequest) o;
        

        return Objects.equals( volumeAccessGroupID , that.volumeAccessGroupID )
            && Objects.deepEquals( lunAssignments , that.lunAssignments );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID, lunAssignments );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        sb.append(" lunAssignments : ").append(Arrays.toString(lunAssignments));
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
                         this.lunAssignments            );
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
