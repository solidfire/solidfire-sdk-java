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

import com.solidfire.core.client.Attributes;
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
    @SerializedName("attributes") private Optional<Attributes> attributes;
    @SerializedName("createTime") private Optional<String> createTime;
    @SerializedName("enableRemoteReplication") private Optional<Boolean> enableRemoteReplication;
    @SerializedName("expirationReason") private Optional<String> expirationReason;
    @SerializedName("expirationTime") private Optional<String> expirationTime;
    @SerializedName("groupID") private Optional<Long> groupID;
    @SerializedName("groupSnapshotUUID") private Optional<java.util.UUID> groupSnapshotUUID;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("remoteStatus") private Optional<String> remoteStatus;
    @SerializedName("remoteStatuses") private Optional<Attributes[]> remoteStatuses;
    @SerializedName("status") private Optional<String> status;
    @SerializedName("totalSize") private Optional<Long> totalSize;
    @SerializedName("virtualVolumeID") private Optional<Long> virtualVolumeID;
    @SerializedName("volumePairUUID") private Optional<java.util.UUID> volumePairUUID;

    // empty constructor
    @Since("7.0")
    public GroupSnapshotMembers() {}

    
    // parameterized constructor
    @Since("7.0")
    public GroupSnapshotMembers(
        Long volumeID,
        Long snapshotID,
        String checksum,
        Optional<Attributes> attributes,
        Optional<String> createTime,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> expirationReason,
        Optional<String> expirationTime,
        Optional<Long> groupID,
        Optional<java.util.UUID> groupSnapshotUUID,
        Optional<String> name,
        Optional<String> remoteStatus,
        Optional<Attributes[]> remoteStatuses,
        Optional<String> status,
        Optional<Long> totalSize,
        Optional<Long> virtualVolumeID,
        Optional<java.util.UUID> volumePairUUID
    )
    {
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
        this.checksum = checksum;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.createTime = (createTime == null) ? Optional.<String>empty() : createTime;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.expirationReason = (expirationReason == null) ? Optional.<String>empty() : expirationReason;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
        this.groupSnapshotUUID = (groupSnapshotUUID == null) ? Optional.<java.util.UUID>empty() : groupSnapshotUUID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.remoteStatus = (remoteStatus == null) ? Optional.<String>empty() : remoteStatus;
        this.remoteStatuses = (remoteStatuses == null) ? Optional.<Attributes[]>empty() : remoteStatuses;
        this.status = (status == null) ? Optional.<String>empty() : status;
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<Long>empty() : virtualVolumeID;
        this.volumePairUUID = (volumePairUUID == null) ? Optional.<java.util.UUID>empty() : volumePairUUID;
    }
    // parameterized constructor
    @Since("8.0")
    public GroupSnapshotMembers(
        Long volumeID,
        Long snapshotID,
        String snapshotUUID,
        String checksum,
        Optional<Attributes> attributes,
        Optional<String> createTime,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> expirationReason,
        Optional<String> expirationTime,
        Optional<Long> groupID,
        Optional<java.util.UUID> groupSnapshotUUID,
        Optional<String> name,
        Optional<String> remoteStatus,
        Optional<Attributes[]> remoteStatuses,
        Optional<String> status,
        Optional<Long> totalSize,
        Optional<Long> virtualVolumeID,
        Optional<java.util.UUID> volumePairUUID
    )
    {
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
        this.snapshotUUID = snapshotUUID;
        this.checksum = checksum;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.createTime = (createTime == null) ? Optional.<String>empty() : createTime;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.expirationReason = (expirationReason == null) ? Optional.<String>empty() : expirationReason;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
        this.groupSnapshotUUID = (groupSnapshotUUID == null) ? Optional.<java.util.UUID>empty() : groupSnapshotUUID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.remoteStatus = (remoteStatus == null) ? Optional.<String>empty() : remoteStatus;
        this.remoteStatuses = (remoteStatuses == null) ? Optional.<Attributes[]>empty() : remoteStatuses;
        this.status = (status == null) ? Optional.<String>empty() : status;
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<Long>empty() : virtualVolumeID;
        this.volumePairUUID = (volumePairUUID == null) ? Optional.<java.util.UUID>empty() : volumePairUUID;
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
     * 
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    /** 
     * 
     **/
    public Optional<String> getCreateTime() { return this.createTime; }
    public void setCreateTime(Optional<String> createTime) { 
        this.createTime = (createTime == null) ? Optional.<String>empty() : createTime;
    }
    /** 
     * 
     **/
    public Optional<Boolean> getEnableRemoteReplication() { return this.enableRemoteReplication; }
    public void setEnableRemoteReplication(Optional<Boolean> enableRemoteReplication) { 
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
    }
    /** 
     * 
     **/
    public Optional<String> getExpirationReason() { return this.expirationReason; }
    public void setExpirationReason(Optional<String> expirationReason) { 
        this.expirationReason = (expirationReason == null) ? Optional.<String>empty() : expirationReason;
    }
    /** 
     * 
     **/
    public Optional<String> getExpirationTime() { return this.expirationTime; }
    public void setExpirationTime(Optional<String> expirationTime) { 
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
    }
    /** 
     * 
     **/
    public Optional<Long> getGroupID() { return this.groupID; }
    public void setGroupID(Optional<Long> groupID) { 
        this.groupID = (groupID == null) ? Optional.<Long>empty() : groupID;
    }
    /** 
     * 
     **/
    public Optional<java.util.UUID> getGroupSnapshotUUID() { return this.groupSnapshotUUID; }
    public void setGroupSnapshotUUID(Optional<java.util.UUID> groupSnapshotUUID) { 
        this.groupSnapshotUUID = (groupSnapshotUUID == null) ? Optional.<java.util.UUID>empty() : groupSnapshotUUID;
    }
    /** 
     * 
     **/
    public Optional<String> getName() { return this.name; }
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * 
     **/
    public Optional<String> getRemoteStatus() { return this.remoteStatus; }
    public void setRemoteStatus(Optional<String> remoteStatus) { 
        this.remoteStatus = (remoteStatus == null) ? Optional.<String>empty() : remoteStatus;
    }
    /** 
     * 
     **/
    public Optional<Attributes[]> getRemoteStatuses() { return this.remoteStatuses; }
    public void setRemoteStatuses(Optional<Attributes[]> remoteStatuses) { 
        this.remoteStatuses = (remoteStatuses == null) ? Optional.<Attributes[]>empty() : remoteStatuses;
    }
    /** 
     * 
     **/
    public Optional<String> getStatus() { return this.status; }
    public void setStatus(Optional<String> status) { 
        this.status = (status == null) ? Optional.<String>empty() : status;
    }
    /** 
     * 
     **/
    public Optional<Long> getTotalSize() { return this.totalSize; }
    public void setTotalSize(Optional<Long> totalSize) { 
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
    }
    /** 
     * 
     **/
    public Optional<Long> getVirtualVolumeID() { return this.virtualVolumeID; }
    public void setVirtualVolumeID(Optional<Long> virtualVolumeID) { 
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<Long>empty() : virtualVolumeID;
    }
    /** 
     * 
     **/
    public Optional<java.util.UUID> getVolumePairUUID() { return this.volumePairUUID; }
    public void setVolumePairUUID(Optional<java.util.UUID> volumePairUUID) { 
        this.volumePairUUID = (volumePairUUID == null) ? Optional.<java.util.UUID>empty() : volumePairUUID;
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
            Objects.equals(remoteStatuses, that.remoteStatuses) && 
            Objects.equals(status, that.status) && 
            Objects.equals(totalSize, that.totalSize) && 
            Objects.equals(virtualVolumeID, that.virtualVolumeID) && 
            Objects.equals(volumePairUUID, that.volumePairUUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,snapshotID,snapshotUUID,checksum,attributes,createTime,enableRemoteReplication,expirationReason,expirationTime,groupID,groupSnapshotUUID,name,remoteStatus,remoteStatuses,status,totalSize,virtualVolumeID,volumePairUUID );
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
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes).append(",");
        }
        if(null != createTime && createTime.isPresent()){
            sb.append(" createTime : ").append(createTime).append(",");
        }
        if(null != enableRemoteReplication && enableRemoteReplication.isPresent()){
            sb.append(" enableRemoteReplication : ").append(enableRemoteReplication).append(",");
        }
        if(null != expirationReason && expirationReason.isPresent()){
            sb.append(" expirationReason : ").append(expirationReason).append(",");
        }
        if(null != expirationTime && expirationTime.isPresent()){
            sb.append(" expirationTime : ").append(expirationTime).append(",");
        }
        if(null != groupID && groupID.isPresent()){
            sb.append(" groupID : ").append(groupID).append(",");
        }
        if(null != groupSnapshotUUID && groupSnapshotUUID.isPresent()){
            sb.append(" groupSnapshotUUID : ").append(groupSnapshotUUID).append(",");
        }
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(name).append(",");
        }
        if(null != remoteStatus && remoteStatus.isPresent()){
            sb.append(" remoteStatus : ").append(remoteStatus).append(",");
        }
        if(null != remoteStatuses && remoteStatuses.isPresent()){
            sb.append(" remoteStatuses : ").append(remoteStatuses).append(",");
        }
        if(null != status && status.isPresent()){
            sb.append(" status : ").append(status).append(",");
        }
        if(null != totalSize && totalSize.isPresent()){
            sb.append(" totalSize : ").append(totalSize).append(",");
        }
        if(null != virtualVolumeID && virtualVolumeID.isPresent()){
            sb.append(" virtualVolumeID : ").append(virtualVolumeID).append(",");
        }
        if(null != volumePairUUID && volumePairUUID.isPresent()){
            sb.append(" volumePairUUID : ").append(volumePairUUID).append(",");
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
        private Long volumeID;
        private Long snapshotID;
        private String snapshotUUID;
        private String checksum;
        private Optional<Attributes> attributes;
        private Optional<String> createTime;
        private Optional<Boolean> enableRemoteReplication;
        private Optional<String> expirationReason;
        private Optional<String> expirationTime;
        private Optional<Long> groupID;
        private Optional<java.util.UUID> groupSnapshotUUID;
        private Optional<String> name;
        private Optional<String> remoteStatus;
        private Optional<Attributes[]> remoteStatuses;
        private Optional<String> status;
        private Optional<Long> totalSize;
        private Optional<Long> virtualVolumeID;
        private Optional<java.util.UUID> volumePairUUID;

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

        public GroupSnapshotMembers.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

        public GroupSnapshotMembers.Builder optionalCreateTime(final String createTime) {
            this.createTime = (createTime == null) ? Optional.<String>empty() : Optional.of(createTime);
            return this;
        }

        public GroupSnapshotMembers.Builder optionalEnableRemoteReplication(final Boolean enableRemoteReplication) {
            this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : Optional.of(enableRemoteReplication);
            return this;
        }

        public GroupSnapshotMembers.Builder optionalExpirationReason(final String expirationReason) {
            this.expirationReason = (expirationReason == null) ? Optional.<String>empty() : Optional.of(expirationReason);
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

        public GroupSnapshotMembers.Builder optionalGroupSnapshotUUID(final java.util.UUID groupSnapshotUUID) {
            this.groupSnapshotUUID = (groupSnapshotUUID == null) ? Optional.<java.util.UUID>empty() : Optional.of(groupSnapshotUUID);
            return this;
        }

        public GroupSnapshotMembers.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public GroupSnapshotMembers.Builder optionalRemoteStatus(final String remoteStatus) {
            this.remoteStatus = (remoteStatus == null) ? Optional.<String>empty() : Optional.of(remoteStatus);
            return this;
        }

        public GroupSnapshotMembers.Builder optionalRemoteStatuses(final Attributes[] remoteStatuses) {
            this.remoteStatuses = (remoteStatuses == null) ? Optional.<Attributes[]>empty() : Optional.of(remoteStatuses);
            return this;
        }

        public GroupSnapshotMembers.Builder optionalStatus(final String status) {
            this.status = (status == null) ? Optional.<String>empty() : Optional.of(status);
            return this;
        }

        public GroupSnapshotMembers.Builder optionalTotalSize(final Long totalSize) {
            this.totalSize = (totalSize == null) ? Optional.<Long>empty() : Optional.of(totalSize);
            return this;
        }

        public GroupSnapshotMembers.Builder optionalVirtualVolumeID(final Long virtualVolumeID) {
            this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<Long>empty() : Optional.of(virtualVolumeID);
            return this;
        }

        public GroupSnapshotMembers.Builder optionalVolumePairUUID(final java.util.UUID volumePairUUID) {
            this.volumePairUUID = (volumePairUUID == null) ? Optional.<java.util.UUID>empty() : Optional.of(volumePairUUID);
            return this;
        }

    }
}
