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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * Snapshot  
 * Snapshots is an object containing information about each snapshot made for a volume.
 * The return object includes information for the active snapshot as well as each snapshot created for the volume.
 **/

public class Snapshot implements Serializable {

    public static final long serialVersionUID = -3853847877971082924L;
    @SerializedName("snapshotID") private Long snapshotID;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("name") private String name;
    @SerializedName("checksum") private String checksum;
    @SerializedName("enableRemoteReplication") private Boolean enableRemoteReplication;
    @SerializedName("expirationReason") private String expirationReason;
    @SerializedName("expirationTime") private Optional<String> expirationTime;
    @SerializedName("remoteStatuses") private Optional<SnapshotRemoteStatus[]> remoteStatuses;
    @SerializedName("status") private String status;
    @SerializedName("snapshotUUID") private java.util.UUID snapshotUUID;
    @SerializedName("totalSize") private Long totalSize;
    @SerializedName("groupID") private Optional<Long> groupID;
    @SerializedName("groupSnapshotUUID") private java.util.UUID groupSnapshotUUID;
    @SerializedName("createTime") private String createTime;
    @SerializedName("instanceCreateTime") private String instanceCreateTime;
    @SerializedName("volumeName") private String volumeName;
    @SerializedName("instanceSnapshotUUID") private java.util.UUID instanceSnapshotUUID;
    @SerializedName("virtualVolumeID") private Optional<java.util.UUID> virtualVolumeID;
    @SerializedName("attributes") private Attributes attributes;
    @SerializedName("snapMirrorLabel") private Optional<String> snapMirrorLabel;
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
        String status,
        Long totalSize,
        Optional<Long> groupID,
        String createTime,
        String instanceCreateTime,
        String volumeName,
        java.util.UUID instanceSnapshotUUID,
        Optional<java.util.UUID> virtualVolumeID,
        Attributes attributes
    )
    {
        this.snapshotID = snapshotID;
        this.volumeID = volumeID;
        this.name = name;
        this.checksum = checksum;
        this.status = status;
        this.totalSize = totalSize;
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
        this.createTime = createTime;
        this.instanceCreateTime = instanceCreateTime;
        this.volumeName = volumeName;
        this.instanceSnapshotUUID = instanceSnapshotUUID;
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<java.util.UUID>empty() : virtualVolumeID;
        this.attributes = attributes;
    }
    // parameterized constructor
    @Since("8.0")
    public Snapshot(
        Long snapshotID,
        Long volumeID,
        String name,
        String checksum,
        Boolean enableRemoteReplication,
        String expirationReason,
        Optional<String> expirationTime,
        Optional<SnapshotRemoteStatus[]> remoteStatuses,
        String status,
        java.util.UUID snapshotUUID,
        Long totalSize,
        Optional<Long> groupID,
        java.util.UUID groupSnapshotUUID,
        String createTime,
        String instanceCreateTime,
        String volumeName,
        java.util.UUID instanceSnapshotUUID,
        Optional<java.util.UUID> virtualVolumeID,
        Attributes attributes
    )
    {
        this.snapshotID = snapshotID;
        this.volumeID = volumeID;
        this.name = name;
        this.checksum = checksum;
        this.enableRemoteReplication = enableRemoteReplication;
        this.expirationReason = expirationReason;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.remoteStatuses = (remoteStatuses == null) ? Optional.<SnapshotRemoteStatus[]>empty() : remoteStatuses;
        this.status = status;
        this.snapshotUUID = snapshotUUID;
        this.totalSize = totalSize;
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
        this.groupSnapshotUUID = groupSnapshotUUID;
        this.createTime = createTime;
        this.instanceCreateTime = instanceCreateTime;
        this.volumeName = volumeName;
        this.instanceSnapshotUUID = instanceSnapshotUUID;
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<java.util.UUID>empty() : virtualVolumeID;
        this.attributes = attributes;
    }
    // parameterized constructor
    @Since("10.0")
    public Snapshot(
        Long snapshotID,
        Long volumeID,
        String name,
        String checksum,
        Boolean enableRemoteReplication,
        String expirationReason,
        Optional<String> expirationTime,
        Optional<SnapshotRemoteStatus[]> remoteStatuses,
        String status,
        java.util.UUID snapshotUUID,
        Long totalSize,
        Optional<Long> groupID,
        java.util.UUID groupSnapshotUUID,
        String createTime,
        String instanceCreateTime,
        String volumeName,
        java.util.UUID instanceSnapshotUUID,
        Optional<java.util.UUID> virtualVolumeID,
        Attributes attributes,
        Optional<String> snapMirrorLabel
    )
    {
        this.snapshotID = snapshotID;
        this.volumeID = volumeID;
        this.name = name;
        this.checksum = checksum;
        this.enableRemoteReplication = enableRemoteReplication;
        this.expirationReason = expirationReason;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.remoteStatuses = (remoteStatuses == null) ? Optional.<SnapshotRemoteStatus[]>empty() : remoteStatuses;
        this.status = status;
        this.snapshotUUID = snapshotUUID;
        this.totalSize = totalSize;
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
        this.groupSnapshotUUID = groupSnapshotUUID;
        this.createTime = createTime;
        this.instanceCreateTime = instanceCreateTime;
        this.volumeName = volumeName;
        this.instanceSnapshotUUID = instanceSnapshotUUID;
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<java.util.UUID>empty() : virtualVolumeID;
        this.attributes = attributes;
        this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : snapMirrorLabel;
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
     * api: expiration time was set by using the API.
     * none: there is no expiration time set.
     * test: expiration time was set for testing.
     **/
    public String getExpirationReason() { return this.expirationReason; }
   
    public void setExpirationReason(String expirationReason) { 
        this.expirationReason = expirationReason;
    }
    /** 
     * The time at which this snapshot will expire and be purged from the cluster.
     **/
    public Optional<String> getExpirationTime() { return this.expirationTime; }
   
    public void setExpirationTime(Optional<String> expirationTime) { 
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
    }
    /** 
     * Current remote status of the snapshot remoteStatus: Possible values:
     * Present: Snapshot exists on a remote cluster
     * Not Present: Snapshot does not exist on remote cluster
     * Syncing: This is a target cluster and it is currently replicating the snapshot
     * Deleted: This is a target cluster, the snapshot has been deleted, and it still exists on the source.
     * volumePairUUID: universal identifier of the volume pair
     **/
    public Optional<SnapshotRemoteStatus[]> getRemoteStatuses() { return this.remoteStatuses; }
   
    public void setRemoteStatuses(Optional<SnapshotRemoteStatus[]> remoteStatuses) { 
        this.remoteStatuses = (remoteStatuses == null) ? Optional.<SnapshotRemoteStatus[]>empty() : remoteStatuses;
    }
    /** 
     * Current status of the snapshot
     * Preparing: A snapshot that is being prepared for use and is not yet writable.
     * Done: A snapshot that has finished being prepared and is now usable.
     * Active: This snapshot is the active branch.
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
     * 
     **/
    public String getInstanceCreateTime() { return this.instanceCreateTime; }
   
    public void setInstanceCreateTime(String instanceCreateTime) { 
        this.instanceCreateTime = instanceCreateTime;
    }
    /** 
     * 
     **/
    public String getVolumeName() { return this.volumeName; }
   
    public void setVolumeName(String volumeName) { 
        this.volumeName = volumeName;
    }
    /** 
     * 
     **/
    public java.util.UUID getInstanceSnapshotUUID() { return this.instanceSnapshotUUID; }
   
    public void setInstanceSnapshotUUID(java.util.UUID instanceSnapshotUUID) { 
        this.instanceSnapshotUUID = instanceSnapshotUUID;
    }
    /** 
     * The ID of the virtual volume with which the snapshot is associated.
     **/
    public Optional<java.util.UUID> getVirtualVolumeID() { return this.virtualVolumeID; }
   
    public void setVirtualVolumeID(Optional<java.util.UUID> virtualVolumeID) { 
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<java.util.UUID>empty() : virtualVolumeID;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Attributes getAttributes() { return this.attributes; }
   
    public void setAttributes(Attributes attributes) { 
        this.attributes = attributes;
    }
    /** 
     * Label used by SnapMirror software to specify snapshot retention policy on SnapMirror endpoint.
     **/
    public Optional<String> getSnapMirrorLabel() { return this.snapMirrorLabel; }
   
    public void setSnapMirrorLabel(Optional<String> snapMirrorLabel) { 
        this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : snapMirrorLabel;
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
            Objects.equals(instanceCreateTime, that.instanceCreateTime) && 
            Objects.equals(volumeName, that.volumeName) && 
            Objects.equals(instanceSnapshotUUID, that.instanceSnapshotUUID) && 
            Objects.equals(virtualVolumeID, that.virtualVolumeID) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(snapMirrorLabel, that.snapMirrorLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapshotID,volumeID,name,checksum,enableRemoteReplication,expirationReason,expirationTime,remoteStatuses,status,snapshotUUID,totalSize,groupID,groupSnapshotUUID,createTime,instanceCreateTime,volumeName,instanceSnapshotUUID,virtualVolumeID,attributes,snapMirrorLabel );
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
        map.put("instanceCreateTime", instanceCreateTime);
        map.put("volumeName", volumeName);
        map.put("instanceSnapshotUUID", instanceSnapshotUUID);
        map.put("virtualVolumeID", virtualVolumeID);
        map.put("attributes", attributes);
        map.put("snapMirrorLabel", snapMirrorLabel);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapshotID : ").append(gson.toJson(snapshotID)).append(",");
        sb.append(" volumeID : ").append(gson.toJson(volumeID)).append(",");
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" checksum : ").append(gson.toJson(checksum)).append(",");
        sb.append(" enableRemoteReplication : ").append(gson.toJson(enableRemoteReplication)).append(",");
        sb.append(" expirationReason : ").append(gson.toJson(expirationReason)).append(",");
        if(null != expirationTime && expirationTime.isPresent()){
            sb.append(" expirationTime : ").append(gson.toJson(expirationTime)).append(",");
        }
        else{
            sb.append(" expirationTime : ").append("null").append(",");
        }
        if(null != remoteStatuses && remoteStatuses.isPresent()){
            sb.append(" remoteStatuses : ").append(gson.toJson(remoteStatuses)).append(",");
        }
        else{
            sb.append(" remoteStatuses : ").append("null").append(",");
        }
        sb.append(" status : ").append(gson.toJson(status)).append(",");
        sb.append(" snapshotUUID : ").append(gson.toJson(snapshotUUID)).append(",");
        sb.append(" totalSize : ").append(gson.toJson(totalSize)).append(",");
        if(null != groupID && groupID.isPresent()){
            sb.append(" groupID : ").append(gson.toJson(groupID)).append(",");
        }
        else{
            sb.append(" groupID : ").append("null").append(",");
        }
        sb.append(" groupSnapshotUUID : ").append(gson.toJson(groupSnapshotUUID)).append(",");
        sb.append(" createTime : ").append(gson.toJson(createTime)).append(",");
        sb.append(" instanceCreateTime : ").append(gson.toJson(instanceCreateTime)).append(",");
        sb.append(" volumeName : ").append(gson.toJson(volumeName)).append(",");
        sb.append(" instanceSnapshotUUID : ").append(gson.toJson(instanceSnapshotUUID)).append(",");
        if(null != virtualVolumeID && virtualVolumeID.isPresent()){
            sb.append(" virtualVolumeID : ").append(gson.toJson(virtualVolumeID)).append(",");
        }
        else{
            sb.append(" virtualVolumeID : ").append("null").append(",");
        }
        sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        if(null != snapMirrorLabel && snapMirrorLabel.isPresent()){
            sb.append(" snapMirrorLabel : ").append(gson.toJson(snapMirrorLabel)).append(",");
        }
        else{
            sb.append(" snapMirrorLabel : ").append("null").append(",");
        }
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
        private Optional<String> expirationTime;
        private Optional<SnapshotRemoteStatus[]> remoteStatuses;
        private String status;
        private java.util.UUID snapshotUUID;
        private Long totalSize;
        private Optional<Long> groupID;
        private java.util.UUID groupSnapshotUUID;
        private String createTime;
        private String instanceCreateTime;
        private String volumeName;
        private java.util.UUID instanceSnapshotUUID;
        private Optional<java.util.UUID> virtualVolumeID;
        private Attributes attributes;
        private Optional<String> snapMirrorLabel;

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
                         this.instanceCreateTime,
                         this.volumeName,
                         this.instanceSnapshotUUID,
                         this.virtualVolumeID,
                         this.attributes,
                         this.snapMirrorLabel);
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
            this.instanceCreateTime = req.instanceCreateTime;
            this.volumeName = req.volumeName;
            this.instanceSnapshotUUID = req.instanceSnapshotUUID;
            this.virtualVolumeID = req.virtualVolumeID;
            this.attributes = req.attributes;
            this.snapMirrorLabel = req.snapMirrorLabel;

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

        public Snapshot.Builder optionalExpirationTime(final String expirationTime) {
            this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : Optional.of(expirationTime);
            return this;
        }

        public Snapshot.Builder optionalRemoteStatuses(final SnapshotRemoteStatus[] remoteStatuses) {
            this.remoteStatuses = (remoteStatuses == null) ? Optional.<SnapshotRemoteStatus[]>empty() : Optional.of(remoteStatuses);
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

        public Snapshot.Builder instanceCreateTime(final String instanceCreateTime) {
            this.instanceCreateTime = instanceCreateTime;
            return this;
        }

        public Snapshot.Builder volumeName(final String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public Snapshot.Builder instanceSnapshotUUID(final java.util.UUID instanceSnapshotUUID) {
            this.instanceSnapshotUUID = instanceSnapshotUUID;
            return this;
        }

        public Snapshot.Builder optionalVirtualVolumeID(final java.util.UUID virtualVolumeID) {
            this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<java.util.UUID>empty() : Optional.of(virtualVolumeID);
            return this;
        }

        public Snapshot.Builder attributes(final Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Snapshot.Builder optionalSnapMirrorLabel(final String snapMirrorLabel) {
            this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : Optional.of(snapMirrorLabel);
            return this;
        }

    }
}
