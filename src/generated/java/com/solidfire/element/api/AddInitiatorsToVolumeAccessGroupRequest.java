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

import com.solidfire.javautil.Optional;

import com.solidfire.client.ApiException;
import com.solidfire.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import com.solidfire.annotation.Since;

import static com.solidfire.javautil.Optional.of;


/**
 * The Request object for the "AddInitiatorsToVolumeAccessGroup" API Service call.
 **/
public class AddInitiatorsToVolumeAccessGroupRequest implements Serializable {

    private static final long serialVersionUID = -2119409487L;

    private final Long volumeAccessGroupID;
    private final String[] initiators;

    /**
     * The Request object for the "AddInitiatorsToVolumeAccessGroup" API Service call.
     * @param volumeAccessGroupID [required] The ID of the volume access group to modify.
     * @param initiators [required] List of initiators to add to the volume access group.
     * @since 7.0
     **/
    @Since("7.0")
    public AddInitiatorsToVolumeAccessGroupRequest(Long volumeAccessGroupID, String[] initiators) {
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
     * List of initiators to add to the volume access group.
     **/
    public String[] getInitiators() {
        return this.initiators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddInitiatorsToVolumeAccessGroupRequest that = (AddInitiatorsToVolumeAccessGroupRequest) o;
        

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

    public static final Builder getBuilder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().fromRequest(this);
    }

    public static class Builder {
        private Long volumeAccessGroupID;
        private String[] initiators;

        private Builder() { }

        public AddInitiatorsToVolumeAccessGroupRequest toRequest() {
            return new AddInitiatorsToVolumeAccessGroupRequest (
                         this.volumeAccessGroupID,
                         this.initiators            );
        }

        private AddInitiatorsToVolumeAccessGroupRequest.Builder fromRequest(final AddInitiatorsToVolumeAccessGroupRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.initiators = req.initiators;

            return this;
        }

        public AddInitiatorsToVolumeAccessGroupRequest.Builder withVolumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public AddInitiatorsToVolumeAccessGroupRequest.Builder withInitiators(final String[] initiators) {
            this.initiators = initiators;
            return this;
        }

    }

}
