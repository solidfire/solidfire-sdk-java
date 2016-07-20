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
 * Snapshots is an object containing information about each snapshot made for a volume.
 **/
public class Snapshot implements Serializable {

    private static final long serialVersionUID = 2121047841L;

    @SerializedName("snapshotID") private final Long snapshotID;
    @SerializedName("volumeID") private final Long volumeID;
    @SerializedName("name") private final String name;
    @SerializedName("checksum") private final String checksum;
    @SerializedName("enableRemoteReplication") private final Boolean enableRemoteReplication;
    @SerializedName("expirationReason") private final String expirationReason;
    @SerializedName("expirationTime") private final String expirationTime;
    @SerializedName("remoteStatuses") private final String remoteStatuses;
    @SerializedName("status") private final String status;
    @SerializedName("SnapshotUUID") private final String snapshotUUID;
    @SerializedName("totalSize") private final Long totalSize;
    @SerializedName("groupID") private final Optional<Long> groupID;
    @SerializedName("groupSnapshotUUID") private final String groupSnapshotUUID;
    @SerializedName("createTime") private final String createTime;
    @SerializedName("attributes") private final java.util.Map<String, Object> attributes;

    /**
     * Snapshots is an object containing information about each snapshot made for a volume.
     * The return object includes information for the active snapshot as well as each snapshot created for the volume.
     * @param snapshotID [required] Unique ID for this snapshot.
     * @param volumeID [required] The volume this snapshot was taken of.
     * @param name [required] A name for this snapshot.
     * @param checksum [required] A string that represents the correct digits in the stored snapshot.
     * @param status [required] Current status of the snapshot
     * @param totalSize [required] Total size of this snapshot in bytes.
     * @param groupID (optional) If present, the ID of the group this snapshot is a part of.
     * @param createTime [required] The time this snapshot was taken.
     * @param attributes [required] List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public Snapshot(Long snapshotID, Long volumeID, String name, String checksum, String status, Long totalSize, Optional<Long> groupID, String createTime, java.util.Map<String, Object> attributes) {
        this.name = name;
        this.remoteStatuses = null;
        this.expirationTime = null;
        this.createTime = createTime;
        this.totalSize = totalSize;
        this.expirationReason = null;
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
        this.attributes = attributes;
        this.groupSnapshotUUID = null;
        this.checksum = checksum;
        this.enableRemoteReplication = null;
        this.status = status;
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
        this.snapshotUUID = null;
    }

    /**
     * Snapshots is an object containing information about each snapshot made for a volume.
     * The return object includes information for the active snapshot as well as each snapshot created for the volume.
     * @param snapshotID [required] Unique ID for this snapshot.
     * @param volumeID [required] The volume this snapshot was taken of.
     * @param name [required] A name for this snapshot.
     * @param checksum [required] A string that represents the correct digits in the stored snapshot.
     * @param enableRemoteReplication [required] Identifies if snapshot is enabled for remote replication.
     * @param expirationReason [required] Indicates how the snapshot expiration was set. Possible values:
     * @param expirationTime [required] The time at which this snapshot will expire and be purged from the cluster.
     * @param remoteStatuses [required] Current remote status of the snapshot remoteStatus: Possible values:
     * @param status [required] Current status of the snapshot
     * @param snapshotUUID [required] Universal Unique ID of an existing snapshot.
     * @param totalSize [required] Total size of this snapshot in bytes.
     * @param groupID (optional) If present, the ID of the group this snapshot is a part of.
     * @param groupSnapshotUUID [required] The current &quot;members&quot; results contains information about each snapshot in the group.
     * @param createTime [required] The time this snapshot was taken.
     * @param attributes [required] List of Name/Value pairs in JSON object format.
     * @since 8.0
     **/
    @Since("8.0")
    public Snapshot(Long snapshotID, Long volumeID, String name, String checksum, Boolean enableRemoteReplication, String expirationReason, String expirationTime, String remoteStatuses, String status, String snapshotUUID, Long totalSize, Optional<Long> groupID, String groupSnapshotUUID, String createTime, java.util.Map<String, Object> attributes) {
        this.name = name;
        this.remoteStatuses = remoteStatuses;
        this.expirationTime = expirationTime;
        this.createTime = createTime;
        this.totalSize = totalSize;
        this.expirationReason = expirationReason;
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
        this.attributes = attributes;
        this.groupSnapshotUUID = groupSnapshotUUID;
        this.checksum = checksum;
        this.enableRemoteReplication = enableRemoteReplication;
        this.status = status;
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
        this.snapshotUUID = snapshotUUID;
    }


    /**
     * Unique ID for this snapshot.
     **/
    public Long getSnapshotID() {
        return this.snapshotID;
    }

    /**
     * The volume this snapshot was taken of.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    /**
     * A name for this snapshot.
     * It is not necessarily unique.
     **/
    public String getName() {
        return this.name;
    }

    /**
     * A string that represents the correct digits in the stored snapshot.
     * This checksum can be used later to compare other snapshots to detect errors in the data.
     **/
    public String getChecksum() {
        return this.checksum;
    }

    /**
     * Identifies if snapshot is enabled for remote replication.
     * @since 8.0 
     **/

    @Since("8.0")
    public Boolean getEnableRemoteReplication() {
        return this.enableRemoteReplication;
    }

    /**
     * Indicates how the snapshot expiration was set. Possible values:
     * <br/><b>api</b>: expiration time was set by using the API.
     * <br/><b>none</b>: there is no expiration time set.
     * <br/><b>test</b>: expiration time was set for testing.
     * @since 8.0 
     **/

    @Since("8.0")
    public String getExpirationReason() {
        return this.expirationReason;
    }

    /**
     * The time at which this snapshot will expire and be purged from the cluster.
     * @since 8.0 
     **/

    @Since("8.0")
    public String getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * Current remote status of the snapshot remoteStatus: Possible values:
     * <br/><b>Present</b>: Snapshot exists on a remote cluster
     * <br/><b>Not Present</b>: Snapshot does not exist on remote cluster
     * <br/><b>Syncing</b>: This is a target cluster and it is currently replicating the snapshot
     * <br/><b>Deleted</b>: This is a target cluster, the snapshot has been deleted, and it still exists on the source.
     * <br/><b>volumePairUUID</b>: universal identifier of the volume pair
     * @since 8.0 
     **/

    @Since("8.0")
    public String getRemoteStatuses() {
        return this.remoteStatuses;
    }

    /**
     * Current status of the snapshot
     * <br/><b>Preparing</b>: A snapshot that is being prepared for use and is not yet writable.
     * <br/><b>Done</b>: A snapshot that has finished being prepared and is now usable.
     * <br/><b>Active</b>: This snapshot is the active branch.
     **/
    public String getStatus() {
        return this.status;
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
     * Total size of this snapshot in bytes.
     * It is equivalent to totalSize of the volume when this snapshot was taken.
     **/
    public Long getTotalSize() {
        return this.totalSize;
    }

    /**
     * If present, the ID of the group this snapshot is a part of.
     * If not present, this snapshot is not part of a group.
     **/
    public Optional<Long> getGroupID() {
        return this.groupID;
    }

    /**
     * The current &quot;members&quot; results contains information about each snapshot in the group.
     * Each of these members will have a &quot;uuid&quot; parameter for the snapshot&#39;s UUID.
     * @since 8.0 
     **/

    @Since("8.0")
    public String getGroupSnapshotUUID() {
        return this.groupSnapshotUUID;
    }

    /**
     * The time this snapshot was taken.
     **/
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public java.util.Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Snapshot that = (Snapshot) o;
        

        return Objects.equals( snapshotID , that.snapshotID )
            && Objects.equals( volumeID , that.volumeID )
            && Objects.equals( name , that.name )
            && Objects.equals( checksum , that.checksum )
            && Objects.equals( enableRemoteReplication , that.enableRemoteReplication )
            && Objects.equals( expirationReason , that.expirationReason )
            && Objects.equals( expirationTime , that.expirationTime )
            && Objects.equals( remoteStatuses , that.remoteStatuses )
            && Objects.equals( status , that.status )
            && Objects.equals( snapshotUUID , that.snapshotUUID )
            && Objects.equals( totalSize , that.totalSize )
            && Objects.equals( groupID , that.groupID )
            && Objects.equals( groupSnapshotUUID , that.groupSnapshotUUID )
            && Objects.equals( createTime , that.createTime )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapshotID, volumeID, name, checksum, enableRemoteReplication, expirationReason, expirationTime, remoteStatuses, status, snapshotUUID, totalSize, groupID, groupSnapshotUUID, createTime, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" snapshotID : ").append(snapshotID).append(",");
        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" checksum : ").append(checksum).append(",");
        sb.append(" enableRemoteReplication : ").append(enableRemoteReplication).append(",");
        sb.append(" expirationReason : ").append(expirationReason).append(",");
        sb.append(" expirationTime : ").append(expirationTime).append(",");
        sb.append(" remoteStatuses : ").append(remoteStatuses).append(",");
        sb.append(" status : ").append(status).append(",");
        sb.append(" snapshotUUID : ").append(snapshotUUID).append(",");
        sb.append(" totalSize : ").append(totalSize).append(",");
        if(null != groupID && groupID.isPresent())
            sb.append(" groupID : ").append(groupID.get()).append(",");
        sb.append(" groupSnapshotUUID : ").append(groupSnapshotUUID).append(",");
        sb.append(" createTime : ").append(createTime).append(",");
        sb.append(" attributes : ").append(attributes);
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
        private Long snapshotID;
        private Long volumeID;
        private String name;
        private String checksum;
        private Boolean enableRemoteReplication;
        private String expirationReason;
        private String expirationTime;
        private String remoteStatuses;
        private String status;
        private String snapshotUUID;
        private Long totalSize;
        private Optional<Long> groupID;
        private String groupSnapshotUUID;
        private String createTime;
        private java.util.Map<String, Object> attributes;

        private Builder() { }

        public Snapshot build() {
            return new Snapshot (
                         this.snapshotID,
                         this.volumeID,
                         this.name,
                         this.checksum,
                         this.enableRemoteReplication,
                         this.expirationReason,
                         this.expirationTime,
                         this.remoteStatuses,
                         this.status,
                         this.snapshotUUID,
                         this.totalSize,
                         this.groupID,
                         this.groupSnapshotUUID,
                         this.createTime,
                         this.attributes            );
        }

        private Snapshot.Builder buildFrom(final Snapshot req) {
            this.snapshotID = req.snapshotID;
            this.volumeID = req.volumeID;
            this.name = req.name;
            this.checksum = req.checksum;
            this.enableRemoteReplication = req.enableRemoteReplication;
            this.expirationReason = req.expirationReason;
            this.expirationTime = req.expirationTime;
            this.remoteStatuses = req.remoteStatuses;
            this.status = req.status;
            this.snapshotUUID = req.snapshotUUID;
            this.totalSize = req.totalSize;
            this.groupID = req.groupID;
            this.groupSnapshotUUID = req.groupSnapshotUUID;
            this.createTime = req.createTime;
            this.attributes = req.attributes;

            return this;
        }

        public Snapshot.Builder snapshotID(final Long snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

        public Snapshot.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public Snapshot.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Snapshot.Builder checksum(final String checksum) {
            this.checksum = checksum;
            return this;
        }

        public Snapshot.Builder enableRemoteReplication(final Boolean enableRemoteReplication) {
            this.enableRemoteReplication = enableRemoteReplication;
            return this;
        }

        public Snapshot.Builder expirationReason(final String expirationReason) {
            this.expirationReason = expirationReason;
            return this;
        }

        public Snapshot.Builder expirationTime(final String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Snapshot.Builder remoteStatuses(final String remoteStatuses) {
            this.remoteStatuses = remoteStatuses;
            return this;
        }

        public Snapshot.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public Snapshot.Builder SnapshotUUID(final String snapshotUUID) {
            this.snapshotUUID = snapshotUUID;
            return this;
        }

        public Snapshot.Builder totalSize(final Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public Snapshot.Builder optionalGroupID(final Long groupID) {
            this.groupID = (groupID == null) ? Optional.<Long>empty() : Optional.of(groupID);
            return this;
        }

        public Snapshot.Builder groupSnapshotUUID(final String groupSnapshotUUID) {
            this.groupSnapshotUUID = groupSnapshotUUID;
            return this;
        }

        public Snapshot.Builder createTime(final String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Snapshot.Builder attributes(final java.util.Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

    }

}
