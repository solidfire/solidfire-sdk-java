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
 * The Request object for the "AddVolumesToVolumeAccessGroup" API Service call.
 **/
public class AddVolumesToVolumeAccessGroupRequest implements Serializable {

    private static final long serialVersionUID = 1187472634L;

    private final Long volumeAccessGroupID;
    private final Long[] volumes;

    /**
     * The Request object for the "AddVolumesToVolumeAccessGroup" API Service call.
     * @param volumeAccessGroupID [required] The ID of the volume access group to modify.
     * @param volumes [required] List of volumes to add to this volume access group.
     * @since 7.0
     **/
    @Since("7.0")
    public AddVolumesToVolumeAccessGroupRequest(Long volumeAccessGroupID, Long[] volumes) {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.volumes = volumes;
    }


    /**
     * The ID of the volume access group to modify.
     **/
    public Long getVolumeAccessGroupID() {
        return this.volumeAccessGroupID;
    }

    /**
     * List of volumes to add to this volume access group.
     **/
    public Long[] getVolumes() {
        return this.volumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddVolumesToVolumeAccessGroupRequest that = (AddVolumesToVolumeAccessGroupRequest) o;
        

        return Objects.equals( volumeAccessGroupID , that.volumeAccessGroupID )
            && Objects.deepEquals( volumes , that.volumes );
    }

    @Override
    public int hashCode() {

        return Objects.hash( volumeAccessGroupID, volumes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        sb.append(" volumes : ").append(Arrays.toString(volumes));
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
        private Long[] volumes;

        private Builder() { }

        public AddVolumesToVolumeAccessGroupRequest toRequest() {
            return new AddVolumesToVolumeAccessGroupRequest (
                         this.volumeAccessGroupID,
                         this.volumes            );
        }

        private AddVolumesToVolumeAccessGroupRequest.Builder fromRequest(final AddVolumesToVolumeAccessGroupRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.volumes = req.volumes;

            return this;
        }

        public AddVolumesToVolumeAccessGroupRequest.Builder withVolumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public AddVolumesToVolumeAccessGroupRequest.Builder withVolumes(final Long[] volumes) {
            this.volumes = volumes;
            return this;
        }

    }

}
