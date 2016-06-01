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
 * The Request object for the "RemoveInitiatorsFromVolumeAccessGroup" API Service call.
 **/
public class RemoveInitiatorsFromVolumeAccessGroupRequest implements Serializable {

    private static final long serialVersionUID = 2097416743L;

    @SerializedName("volumeAccessGroupID") private final Long volumeAccessGroupID;
    @SerializedName("initiators") private final String[] initiators;

    /**
     * The Request object for the "RemoveInitiatorsFromVolumeAccessGroup" API Service call.
     * @param volumeAccessGroupID [required] The ID of the volume access group to modify.
     * @param initiators [required] List of initiators to remove from the volume access group.
     * @since 7.0
     **/
    @Since("7.0")
    public RemoveInitiatorsFromVolumeAccessGroupRequest(Long volumeAccessGroupID, String[] initiators) {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.initiators = initiators;
    }


    /**
     * The ID of the volume access group to modify.
     **/
    public Long getVolumeAccessGroupID() {
        return this.volumeAccessGroupID;
    }

    /**
     * List of initiators to remove from the volume access group.
     **/
    public String[] getInitiators() {
        return this.initiators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveInitiatorsFromVolumeAccessGroupRequest that = (RemoveInitiatorsFromVolumeAccessGroupRequest) o;
        

        return Objects.equals( volumeAccessGroupID , that.volumeAccessGroupID )
            && Objects.deepEquals( initiators , that.initiators );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID, initiators );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        sb.append(" initiators : ").append(Arrays.toString(initiators));
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
        private Long volumeAccessGroupID;
        private String[] initiators;

        private Builder() { }

        public RemoveInitiatorsFromVolumeAccessGroupRequest build() {
            return new RemoveInitiatorsFromVolumeAccessGroupRequest (
                         this.volumeAccessGroupID,
                         this.initiators            );
        }

        private RemoveInitiatorsFromVolumeAccessGroupRequest.Builder buildFrom(final RemoveInitiatorsFromVolumeAccessGroupRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.initiators = req.initiators;

            return this;
        }

        public RemoveInitiatorsFromVolumeAccessGroupRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public RemoveInitiatorsFromVolumeAccessGroupRequest.Builder initiators(final String[] initiators) {
            this.initiators = initiators;
            return this;
        }

    }

}
