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
 * Represents the relationship between the source Volume and cloned Volume IDs.
 **/
public class GroupCloneVolumeMember  implements Serializable  {

    private static final long serialVersionUID = -1785945131L;

    @SerializedName("volumeID") private final Long volumeID;
    @SerializedName("srcVolumeID") private final Long srcVolumeID;

    /**
     * Represents the relationship between the source Volume and cloned Volume IDs.
     * @param volumeID [required] The VolumeID of the cloned volume.
     * @param srcVolumeID [required] The VolumeID of the source volume.
     * @since 7.0
     **/
    @Since("7.0")
    public GroupCloneVolumeMember(Long volumeID, Long srcVolumeID) {
        this.volumeID = volumeID;
        this.srcVolumeID = srcVolumeID;
    }


    /**
     * The VolumeID of the cloned volume.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    /**
     * The VolumeID of the source volume.
     **/
    public Long getSrcVolumeID() {
        return this.srcVolumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupCloneVolumeMember that = (GroupCloneVolumeMember) o;
        

        return Objects.equals( volumeID , that.volumeID )
            && Objects.equals( srcVolumeID , that.srcVolumeID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, srcVolumeID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" srcVolumeID : ").append(srcVolumeID);
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
        private Long volumeID;
        private Long srcVolumeID;

        private Builder() { }

        public GroupCloneVolumeMember build() {
            return new GroupCloneVolumeMember (
                         this.volumeID,
                         this.srcVolumeID            );
        }

        private GroupCloneVolumeMember.Builder buildFrom(final GroupCloneVolumeMember req) {
            this.volumeID = req.volumeID;
            this.srcVolumeID = req.srcVolumeID;

            return this;
        }

        public GroupCloneVolumeMember.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public GroupCloneVolumeMember.Builder srcVolumeID(final Long srcVolumeID) {
            this.srcVolumeID = srcVolumeID;
            return this;
        }

    }

}
