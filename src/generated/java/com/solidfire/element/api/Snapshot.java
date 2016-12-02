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
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ['Snapshots is an object containing information about each snapshot made for a volume.', 'The return object includes information for the active snapshot as well as each snapshot created for the volume.']['Snapshots is an object containing information about each snapshot made for a volume.', 'The return object includes information for the active snapshot as well as each snapshot created for the volume.']
 **/

public class Snapshot implements Serializable {

    public static final long serialVersionUID = -3853847877971082924L;
    @SerializedName("snapshotID") private Long snapshotID;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("name") private String name;
    @SerializedName("checksum") private String checksum;
    @SerializedName("enableRemoteReplication") private Boolean enableRemoteReplication;
    @SerializedName("expirationReason") private String expirationReason;
    @SerializedName("expirationTime") private String expirationTime;
    @SerializedName("remoteStatuses") private String remoteStatuses;
    @SerializedName("status") private String status;
    @SerializedName("snapshotUUID") private java.util.UUID snapshotUUID;
    @SerializedName("totalSize") private Long totalSize;
    @SerializedName("groupID") private Optional<Long> groupID;
    @SerializedName("groupSnapshotUUID") private java.util.UUID groupSnapshotUUID;
    @SerializedName("createTime") private String createTime;
    @SerializedName("attributes") private LinkedTreeMap<String, Object> attributes;

    // empty constructor
    @Since("7.0")
    public Snapshot() {}

    // parameterized constructor
    @Since("7.0")
    public Snapshot(
        Long snapshotID,
        Long volumeID,
        String name,
        String checksum,
        Boolean enableRemoteReplication,
        String expirationReason,
        String expirationTime,
        String remoteStatuses,
        String status,
        java.util.UUID snapshotUUID,
        Long totalSize,
        Optional<Long> groupID,
        java.util.UUID groupSnapshotUUID,
        String createTime,
        LinkedTreeMap<String, Object> attributes
    )
    {
        this.snapshotID = snapshotID;
        this.volumeID = volumeID;
        this.name = name;
        this.checksum = checksum;
        this.enableRemoteReplication = enableRemoteReplication;
        this.expirationReason = expirationReason;
        this.expirationTime = expirationTime;
        this.remoteStatuses = remoteStatuses;
        this.status = status;
        this.snapshotUUID = snapshotUUID;
        this.totalSize = totalSize;
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
        this.groupSnapshotUUID = groupSnapshotUUID;
        this.createTime = createTime;
        this.attributes = attributes;
    }

    /** 
     * Unique ID for this snapshot.
     **/
    public Long getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Long snapshotID) { 
        this.snapshotID = snapshotID;
    }
    /** 
     * The volume this snapshot was taken of.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * A name for this snapshot.
     * It is not necessarily unique.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * A string that represents the correct digits in the stored snapshot.
     * This checksum can be used later to compare other snapshots to detect errors in the data.
     **/
    public String getChecksum() { return this.checksum; }
    public void setChecksum(String checksum) { 
        this.checksum = checksum;
    }
    /** 
     * Identifies if snapshot is enabled for remote replication.
     **/
    public Boolean getEnableRemoteReplication() { return this.enableRemoteReplication; }
    public void setEnableRemoteReplication(Boolean enableRemoteReplication) { 
        this.enableRemoteReplication = enableRemoteReplication;
    }
    /** 
     * Indicates how the snapshot expiration was set. Possible values:
     * <br/><b>api</b>: expiration time was set by using the API.
     * <br/><b>none</b>: there is no expiration time set.
     * <br/><b>test</b>: expiration time was set for testing.
     **/
    public String getExpirationReason() { return this.expirationReason; }
    public void setExpirationReason(String expirationReason) { 
        this.expirationReason = expirationReason;
    }
    /** 
     * The time at which this snapshot will expire and be purged from the cluster.
     **/
    public String getExpirationTime() { return this.expirationTime; }
    public void setExpirationTime(String expirationTime) { 
        this.expirationTime = expirationTime;
    }
    /** 
     * Current remote status of the snapshot remoteStatus: Possible values:
     * <br/><b>Present</b>: Snapshot exists on a remote cluster
     * <br/><b>Not Present</b>: Snapshot does not exist on remote cluster
     * <br/><b>Syncing</b>: This is a target cluster and it is currently replicating the snapshot
     * <br/><b>Deleted</b>: This is a target cluster, the snapshot has been deleted, and it still exists on the source.
     * <br/><b>volumePairUUID</b>: universal identifier of the volume pair
     **/
    public String getRemoteStatuses() { return this.remoteStatuses; }
    public void setRemoteStatuses(String remoteStatuses) { 
        this.remoteStatuses = remoteStatuses;
    }
    /** 
     * Current status of the snapshot
     * <br/><b>Preparing</b>: A snapshot that is being prepared for use and is not yet writable.
     * <br/><b>Done</b>: A snapshot that has finished being prepared and is now usable.
     * <br/><b>Active</b>: This snapshot is the active branch.
     **/
    public String getStatus() { return this.status; }
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     * Universal Unique ID of an existing snapshot.
     **/
    public java.util.UUID getSnapshotUUID() { return this.snapshotUUID; }
    public void setSnapshotUUID(java.util.UUID snapshotUUID) { 
        this.snapshotUUID = snapshotUUID;
    }
    /** 
     * Total size of this snapshot in bytes.
     * It is equivalent to totalSize of the volume when this snapshot was taken.
     **/
    public Long getTotalSize() { return this.totalSize; }
    public void setTotalSize(Long totalSize) { 
        this.totalSize = totalSize;
    }
    /** 
     * If present, the ID of the group this snapshot is a part of.
     * If not present, this snapshot is not part of a group.
     **/
    public Optional<Long> getGroupID() { return this.groupID; }
    public void setGroupID(Optional<Long> groupID) { 
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
    }
    /** 
     * The current "members" results contains information about each snapshot in the group.
     * Each of these members will have a "uuid" parameter for the snapshot's UUID.
     **/
    public java.util.UUID getGroupSnapshotUUID() { return this.groupSnapshotUUID; }
    public void setGroupSnapshotUUID(java.util.UUID groupSnapshotUUID) { 
        this.groupSnapshotUUID = groupSnapshotUUID;
    }
    /** 
     * The time this snapshot was taken.
     **/
    public String getCreateTime() { return this.createTime; }
    public void setCreateTime(String createTime) { 
        this.createTime = createTime;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public LinkedTreeMap<String, Object> getAttributes() { return this.attributes; }
    public void setAttributes(LinkedTreeMap<String, Object> attributes) { 
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Snapshot that = (Snapshot) o;

        return 
            Objects.equals(snapshotID, that.snapshotID) &&
            Objects.equals(volumeID, that.volumeID) &&
            Objects.equals(name, that.name) &&
            Objects.equals(checksum, that.checksum) &&
            Objects.equals(enableRemoteReplication, that.enableRemoteReplication) &&
            Objects.equals(expirationReason, that.expirationReason) &&
            Objects.equals(expirationTime, that.expirationTime) &&
            Objects.equals(remoteStatuses, that.remoteStatuses) &&
            Objects.equals(status, that.status) &&
            Objects.equals(snapshotUUID, that.snapshotUUID) &&
            Objects.equals(totalSize, that.totalSize) &&
            Objects.equals(groupID, that.groupID) &&
            Objects.equals(groupSnapshotUUID, that.groupSnapshotUUID) &&
            Objects.equals(createTime, that.createTime) &&
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapshotID, volumeID, name, checksum, enableRemoteReplication, expirationReason, expirationTime, remoteStatuses, status, snapshotUUID, totalSize, groupID, groupSnapshotUUID, createTime, attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapshotID", snapshotID);
        map.put("volumeID", volumeID);
        map.put("name", name);
        map.put("checksum", checksum);
        map.put("enableRemoteReplication", enableRemoteReplication);
        map.put("expirationReason", expirationReason);
        map.put("expirationTime", expirationTime);
        map.put("remoteStatuses", remoteStatuses);
        map.put("status", status);
        map.put("snapshotUUID", snapshotUUID);
        map.put("totalSize", totalSize);
        map.put("groupID", groupID);
        map.put("groupSnapshotUUID", groupSnapshotUUID);
        map.put("createTime", createTime);
        map.put("attributes", attributes);
        return map;
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
        if(null != groupID && groupID.isPresent()){
            sb.append(" groupID : ").append(groupID).append(",");
        }
        sb.append(" groupSnapshotUUID : ").append(groupSnapshotUUID).append(",");
        sb.append(" createTime : ").append(createTime).append(",");
        sb.append(" attributes : ").append(attributes).append(",");
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
        private Long snapshotID;
        private Long volumeID;
        private String name;
        private String checksum;
        private Boolean enableRemoteReplication;
        private String expirationReason;
        private String expirationTime;
        private String remoteStatuses;
        private String status;
        private java.util.UUID snapshotUUID;
        private Long totalSize;
        private Optional<Long> groupID;
        private java.util.UUID groupSnapshotUUID;
        private String createTime;
        private LinkedTreeMap<String, Object> attributes;

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
                         this.attributes);
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

        public Snapshot.Builder snapshotUUID(final java.util.UUID snapshotUUID) {
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

        public Snapshot.Builder groupSnapshotUUID(final java.util.UUID groupSnapshotUUID) {
            this.groupSnapshotUUID = groupSnapshotUUID;
            return this;
        }

        public Snapshot.Builder createTime(final String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Snapshot.Builder attributes(final LinkedTreeMap<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

    }
}
