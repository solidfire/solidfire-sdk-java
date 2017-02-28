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
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GroupSnapshotMembers  
 * List of checksum, volumeIDs and snapshotIDs for each member of the group.
 **/

public class GroupSnapshotMembers implements Serializable {

    public static final long serialVersionUID = 4785362642461122102L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("snapshotID") private Long snapshotID;
    @SerializedName("snapshotUUID") private String snapshotUUID;
    @SerializedName("checksum") private String checksum;
    @SerializedName("attributes") private java.util.Map<String, Object> attributes;
    @SerializedName("createTime") private String createTime;
    @SerializedName("enableRemoteReplication") private Boolean enableRemoteReplication;
    @SerializedName("expirationReason") private String expirationReason;
    @SerializedName("expirationTime") private Optional<String> expirationTime;
    @SerializedName("groupID") private Optional<Long> groupID;
    @SerializedName("groupSnapshotUUID") private java.util.UUID groupSnapshotUUID;
    @SerializedName("name") private String name;
    @SerializedName("remoteStatus") private String remoteStatus;
    @SerializedName("remoteStatuses") private java.util.Map<String, Object>[] remoteStatuses;
    @SerializedName("status") private String status;
    @SerializedName("totalSize") private Long totalSize;
    @SerializedName("virtualVolumeID") private Optional<Long> virtualVolumeID;
    @SerializedName("volumePairUUID") private java.util.UUID volumePairUUID;

    // empty constructor
    @Since("7.0")
    public GroupSnapshotMembers() {}

    
    // parameterized constructor
    @Since("7.0")
    public GroupSnapshotMembers(
        Long volumeID,
        Long snapshotID,
        String checksum,
        java.util.Map<String, Object> attributes,
        String createTime,
        Boolean enableRemoteReplication,
        String expirationReason,
        Optional<String> expirationTime,
        Optional<Long> groupID,
        java.util.UUID groupSnapshotUUID,
        String name,
        String remoteStatus,
        java.util.Map<String, Object>[] remoteStatuses,
        String status,
        Long totalSize,
        Optional<Long> virtualVolumeID,
        java.util.UUID volumePairUUID
    )
    {
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
        this.checksum = checksum;
        this.attributes = attributes;
        this.createTime = createTime;
        this.enableRemoteReplication = enableRemoteReplication;
        this.expirationReason = expirationReason;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
        this.groupSnapshotUUID = groupSnapshotUUID;
        this.name = name;
        this.remoteStatus = remoteStatus;
        this.remoteStatuses = remoteStatuses;
        this.status = status;
        this.totalSize = totalSize;
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<Long>empty() : virtualVolumeID;
        this.volumePairUUID = volumePairUUID;
    }
    // parameterized constructor
    @Since("8.0")
    public GroupSnapshotMembers(
        Long volumeID,
        Long snapshotID,
        String snapshotUUID,
        String checksum,
        java.util.Map<String, Object> attributes,
        String createTime,
        Boolean enableRemoteReplication,
        String expirationReason,
        Optional<String> expirationTime,
        Optional<Long> groupID,
        java.util.UUID groupSnapshotUUID,
        String name,
        String remoteStatus,
        java.util.Map<String, Object>[] remoteStatuses,
        String status,
        Long totalSize,
        Optional<Long> virtualVolumeID,
        java.util.UUID volumePairUUID
    )
    {
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
        this.snapshotUUID = snapshotUUID;
        this.checksum = checksum;
        this.attributes = attributes;
        this.createTime = createTime;
        this.enableRemoteReplication = enableRemoteReplication;
        this.expirationReason = expirationReason;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
        this.groupSnapshotUUID = groupSnapshotUUID;
        this.name = name;
        this.remoteStatus = remoteStatus;
        this.remoteStatuses = remoteStatuses;
        this.status = status;
        this.totalSize = totalSize;
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<Long>empty() : virtualVolumeID;
        this.volumePairUUID = volumePairUUID;
    }

    /** 
     * The source volume ID for the snapshot.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * Unique ID of a snapshot from which the new snapshot is made.
     * The snapshotID passed must be a snapshot on the given volume.
     **/
    public Long getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Long snapshotID) { 
        this.snapshotID = snapshotID;
    }
    /** 
     * Universal Unique ID of an existing snapshot.
     **/
    public String getSnapshotUUID() { return this.snapshotUUID; }
    public void setSnapshotUUID(String snapshotUUID) { 
        this.snapshotUUID = snapshotUUID;
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
     **/
    public java.util.Map<String, Object> getAttributes() { return this.attributes; }
    public void setAttributes(java.util.Map<String, Object> attributes) { 
        this.attributes = attributes;
    }
    /** 
     **/
    public String getCreateTime() { return this.createTime; }
    public void setCreateTime(String createTime) { 
        this.createTime = createTime;
    }
    /** 
     **/
    public Boolean getEnableRemoteReplication() { return this.enableRemoteReplication; }
    public void setEnableRemoteReplication(Boolean enableRemoteReplication) { 
        this.enableRemoteReplication = enableRemoteReplication;
    }
    /** 
     **/
    public String getExpirationReason() { return this.expirationReason; }
    public void setExpirationReason(String expirationReason) { 
        this.expirationReason = expirationReason;
    }
    /** 
     **/
    public Optional<String> getExpirationTime() { return this.expirationTime; }
    public void setExpirationTime(Optional<String> expirationTime) { 
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
    }
    /** 
     **/
    public Optional<Long> getGroupID() { return this.groupID; }
    public void setGroupID(Optional<Long> groupID) { 
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
    }
    /** 
     **/
    public java.util.UUID getGroupSnapshotUUID() { return this.groupSnapshotUUID; }
    public void setGroupSnapshotUUID(java.util.UUID groupSnapshotUUID) { 
        this.groupSnapshotUUID = groupSnapshotUUID;
    }
    /** 
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     **/
    public String getRemoteStatus() { return this.remoteStatus; }
    public void setRemoteStatus(String remoteStatus) { 
        this.remoteStatus = remoteStatus;
    }
    /** 
     **/
    public java.util.Map<String, Object>[] getRemoteStatuses() { return this.remoteStatuses; }
    public void setRemoteStatuses(java.util.Map<String, Object>[] remoteStatuses) { 
        this.remoteStatuses = remoteStatuses;
    }
    /** 
     **/
    public String getStatus() { return this.status; }
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     **/
    public Long getTotalSize() { return this.totalSize; }
    public void setTotalSize(Long totalSize) { 
        this.totalSize = totalSize;
    }
    /** 
     **/
    public Optional<Long> getVirtualVolumeID() { return this.virtualVolumeID; }
    public void setVirtualVolumeID(Optional<Long> virtualVolumeID) { 
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<Long>empty() : virtualVolumeID;
    }
    /** 
     **/
    public java.util.UUID getVolumePairUUID() { return this.volumePairUUID; }
    public void setVolumePairUUID(java.util.UUID volumePairUUID) { 
        this.volumePairUUID = volumePairUUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupSnapshotMembers that = (GroupSnapshotMembers) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(snapshotID, that.snapshotID) && 
            Objects.equals(snapshotUUID, that.snapshotUUID) && 
            Objects.equals(checksum, that.checksum) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(createTime, that.createTime) && 
            Objects.equals(enableRemoteReplication, that.enableRemoteReplication) && 
            Objects.equals(expirationReason, that.expirationReason) && 
            Objects.equals(expirationTime, that.expirationTime) && 
            Objects.equals(groupID, that.groupID) && 
            Objects.equals(groupSnapshotUUID, that.groupSnapshotUUID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(remoteStatus, that.remoteStatus) && 
            Arrays.equals(remoteStatuses, that.remoteStatuses) && 
            Objects.equals(status, that.status) && 
            Objects.equals(totalSize, that.totalSize) && 
            Objects.equals(virtualVolumeID, that.virtualVolumeID) && 
            Objects.equals(volumePairUUID, that.volumePairUUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,snapshotID,snapshotUUID,checksum,attributes,createTime,enableRemoteReplication,expirationReason,expirationTime,groupID,groupSnapshotUUID,name,remoteStatus,(Object[])remoteStatuses,status,totalSize,virtualVolumeID,volumePairUUID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("snapshotID", snapshotID);
        map.put("snapshotUUID", snapshotUUID);
        map.put("checksum", checksum);
        map.put("attributes", attributes);
        map.put("createTime", createTime);
        map.put("enableRemoteReplication", enableRemoteReplication);
        map.put("expirationReason", expirationReason);
        map.put("expirationTime", expirationTime);
        map.put("groupID", groupID);
        map.put("groupSnapshotUUID", groupSnapshotUUID);
        map.put("name", name);
        map.put("remoteStatus", remoteStatus);
        map.put("remoteStatuses", remoteStatuses);
        map.put("status", status);
        map.put("totalSize", totalSize);
        map.put("virtualVolumeID", virtualVolumeID);
        map.put("volumePairUUID", volumePairUUID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" snapshotID : ").append(snapshotID).append(",");
        sb.append(" snapshotUUID : ").append(snapshotUUID).append(",");
        sb.append(" checksum : ").append(checksum).append(",");
        sb.append(" attributes : ").append(attributes).append(",");
        sb.append(" createTime : ").append(createTime).append(",");
        sb.append(" enableRemoteReplication : ").append(enableRemoteReplication).append(",");
        sb.append(" expirationReason : ").append(expirationReason).append(",");
        if(null != expirationTime && expirationTime.isPresent()){
            sb.append(" expirationTime : ").append(expirationTime).append(",");
        }
        if(null != groupID && groupID.isPresent()){
            sb.append(" groupID : ").append(groupID).append(",");
        }
        sb.append(" groupSnapshotUUID : ").append(groupSnapshotUUID).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" remoteStatus : ").append(remoteStatus).append(",");
        sb.append(" remoteStatuses : ").append(Arrays.toString(remoteStatuses)).append(",");
        sb.append(" status : ").append(status).append(",");
        sb.append(" totalSize : ").append(totalSize).append(",");
        if(null != virtualVolumeID && virtualVolumeID.isPresent()){
            sb.append(" virtualVolumeID : ").append(virtualVolumeID).append(",");
        }
        sb.append(" volumePairUUID : ").append(volumePairUUID).append(",");
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
        private Long snapshotID;
        private String snapshotUUID;
        private String checksum;
        private java.util.Map<String, Object> attributes;
        private String createTime;
        private Boolean enableRemoteReplication;
        private String expirationReason;
        private Optional<String> expirationTime;
        private Optional<Long> groupID;
        private java.util.UUID groupSnapshotUUID;
        private String name;
        private String remoteStatus;
        private java.util.Map<String, Object>[] remoteStatuses;
        private String status;
        private Long totalSize;
        private Optional<Long> virtualVolumeID;
        private java.util.UUID volumePairUUID;

        private Builder() { }

        public GroupSnapshotMembers build() {
            return new GroupSnapshotMembers (
                         this.volumeID,
                         this.snapshotID,
                         this.snapshotUUID,
                         this.checksum,
                         this.attributes,
                         this.createTime,
                         this.enableRemoteReplication,
                         this.expirationReason,
                         this.expirationTime,
                         this.groupID,
                         this.groupSnapshotUUID,
                         this.name,
                         this.remoteStatus,
                         this.remoteStatuses,
                         this.status,
                         this.totalSize,
                         this.virtualVolumeID,
                         this.volumePairUUID);
        }

        private GroupSnapshotMembers.Builder buildFrom(final GroupSnapshotMembers req) {
            this.volumeID = req.volumeID;
            this.snapshotID = req.snapshotID;
            this.snapshotUUID = req.snapshotUUID;
            this.checksum = req.checksum;
            this.attributes = req.attributes;
            this.createTime = req.createTime;
            this.enableRemoteReplication = req.enableRemoteReplication;
            this.expirationReason = req.expirationReason;
            this.expirationTime = req.expirationTime;
            this.groupID = req.groupID;
            this.groupSnapshotUUID = req.groupSnapshotUUID;
            this.name = req.name;
            this.remoteStatus = req.remoteStatus;
            this.remoteStatuses = req.remoteStatuses;
            this.status = req.status;
            this.totalSize = req.totalSize;
            this.virtualVolumeID = req.virtualVolumeID;
            this.volumePairUUID = req.volumePairUUID;

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

        public GroupSnapshotMembers.Builder snapshotUUID(final String snapshotUUID) {
            this.snapshotUUID = snapshotUUID;
            return this;
        }

        public GroupSnapshotMembers.Builder checksum(final String checksum) {
            this.checksum = checksum;
            return this;
        }

        public GroupSnapshotMembers.Builder attributes(final java.util.Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

        public GroupSnapshotMembers.Builder createTime(final String createTime) {
            this.createTime = createTime;
            return this;
        }

        public GroupSnapshotMembers.Builder enableRemoteReplication(final Boolean enableRemoteReplication) {
            this.enableRemoteReplication = enableRemoteReplication;
            return this;
        }

        public GroupSnapshotMembers.Builder expirationReason(final String expirationReason) {
            this.expirationReason = expirationReason;
            return this;
        }

        public GroupSnapshotMembers.Builder optionalExpirationTime(final String expirationTime) {
            this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : Optional.of(expirationTime);
            return this;
        }

        public GroupSnapshotMembers.Builder optionalGroupID(final Long groupID) {
            this.groupID = (groupID == null) ? Optional.<Long>empty() : Optional.of(groupID);
            return this;
        }

        public GroupSnapshotMembers.Builder groupSnapshotUUID(final java.util.UUID groupSnapshotUUID) {
            this.groupSnapshotUUID = groupSnapshotUUID;
            return this;
        }

        public GroupSnapshotMembers.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public GroupSnapshotMembers.Builder remoteStatus(final String remoteStatus) {
            this.remoteStatus = remoteStatus;
            return this;
        }

        public GroupSnapshotMembers.Builder remoteStatuses(final java.util.Map<String, Object>[] remoteStatuses) {
            this.remoteStatuses = remoteStatuses;
            return this;
        }

        public GroupSnapshotMembers.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public GroupSnapshotMembers.Builder totalSize(final Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public GroupSnapshotMembers.Builder optionalVirtualVolumeID(final Long virtualVolumeID) {
            this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<Long>empty() : Optional.of(virtualVolumeID);
            return this;
        }

        public GroupSnapshotMembers.Builder volumePairUUID(final java.util.UUID volumePairUUID) {
            this.volumePairUUID = volumePairUUID;
            return this;
        }

    }
}
