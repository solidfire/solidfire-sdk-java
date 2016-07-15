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
 * List of checksum, volumeIDs and snapshotIDs for each member of the group.
 **/
public class GroupSnapshotMembers implements Serializable {

    private static final long serialVersionUID = -1007473247L;

    @SerializedName("volumeID") private final Long volumeID;
    @SerializedName("snapshotID") private final Long snapshotID;
    @SerializedName("SnapshotUUID") private final String snapshotUUID;
    @SerializedName("checksum") private final String checksum;

    /**
     * List of checksum, volumeIDs and snapshotIDs for each member of the group.
     * @param volumeID [required] The source volume ID for the snapshot.
     * @param snapshotID [required] Unique ID of a snapshot from which the new snapshot is made.
     * @param checksum [required] A string that represents the correct digits in the stored snapshot.
     * @since 7.0
     **/
    @Since("7.0")
    public GroupSnapshotMembers(Long volumeID, Long snapshotID, String checksum) {
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
        this.snapshotUUID = null;
        this.checksum = checksum;
    }

    /**
     * List of checksum, volumeIDs and snapshotIDs for each member of the group.
     * @param volumeID [required] The source volume ID for the snapshot.
     * @param snapshotID [required] Unique ID of a snapshot from which the new snapshot is made.
     * @param snapshotUUID [required] Universal Unique ID of an existing snapshot.
     * @param checksum [required] A string that represents the correct digits in the stored snapshot.
     * @since 8.0
     **/
    @Since("8.0")
    public GroupSnapshotMembers(Long volumeID, Long snapshotID, String snapshotUUID, String checksum) {
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
        this.snapshotUUID = snapshotUUID;
        this.checksum = checksum;
    }


    /**
     * The source volume ID for the snapshot.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    /**
     * Unique ID of a snapshot from which the new snapshot is made.
     * The snapshotID passed must be a snapshot on the given volume.
     **/
    public Long getSnapshotID() {
        return this.snapshotID;
    }

    /**
     * Universal Unique ID of an existing snapshot.
     * @since 8.0 
     **/

    @Since("8.0")
    public String getSnapshotUUID() {
        return this.snapshotUUID;
    }

    /**
     * A string that represents the correct digits in the stored snapshot.
     * This checksum can be used later to compare other snapshots to detect errors in the data.
     **/
    public String getChecksum() {
        return this.checksum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupSnapshotMembers that = (GroupSnapshotMembers) o;
        

        return Objects.equals( volumeID , that.volumeID )
            && Objects.equals( snapshotID , that.snapshotID )
            && Objects.equals( snapshotUUID , that.snapshotUUID )
            && Objects.equals( checksum , that.checksum );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, snapshotID, snapshotUUID, checksum );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" snapshotID : ").append(snapshotID).append(",");
        sb.append(" snapshotUUID : ").append(snapshotUUID).append(",");
        sb.append(" checksum : ").append(checksum);
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
        private Long volumeID;
        private Long snapshotID;
        private String snapshotUUID;
        private String checksum;

        private Builder() { }

        public GroupSnapshotMembers build() {
            return new GroupSnapshotMembers (
                         this.volumeID,
                         this.snapshotID,
                         this.snapshotUUID,
                         this.checksum            );
        }

        private GroupSnapshotMembers.Builder buildFrom(final GroupSnapshotMembers req) {
            this.volumeID = req.volumeID;
            this.snapshotID = req.snapshotID;
            this.snapshotUUID = req.snapshotUUID;
            this.checksum = req.checksum;

            return this;
        }

        public GroupSnapshotMembers.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public GroupSnapshotMembers.Builder snapshotID(final Long snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

        public GroupSnapshotMembers.Builder SnapshotUUID(final String snapshotUUID) {
            this.snapshotUUID = snapshotUUID;
            return this;
        }

        public GroupSnapshotMembers.Builder checksum(final String checksum) {
            this.checksum = checksum;
            return this;
        }

    }

}
