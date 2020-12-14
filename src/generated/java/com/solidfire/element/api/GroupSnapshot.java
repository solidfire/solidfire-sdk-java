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
 * GroupSnapshot  
 * Group Snapshot object represents a point-in-time copy of a group of volumes.
 **/

public class GroupSnapshot implements Serializable {

    public static final long serialVersionUID = -7882252378219486264L;
    @SerializedName("groupSnapshotID") private Long groupSnapshotID;
    @SerializedName("groupSnapshotUUID") private java.util.UUID groupSnapshotUUID;
    @SerializedName("members") private Snapshot[] members;
    @SerializedName("name") private String name;
    @SerializedName("createTime") private String createTime;
    @SerializedName("status") private String status;
    @SerializedName("enableRemoteReplication") private Boolean enableRemoteReplication;
    @SerializedName("remoteStatuses") private Optional<GroupSnapshotRemoteStatus[]> remoteStatuses;
    @SerializedName("attributes") private Attributes attributes;
    // empty constructor
    @Since("7.0")
    public GroupSnapshot() {}

    
    // parameterized constructor
    @Since("7.0")
    public GroupSnapshot(
        Long groupSnapshotID,
        java.util.UUID groupSnapshotUUID,
        Snapshot[] members,
        String name,
        String createTime,
        String status,
        Boolean enableRemoteReplication,
        Optional<GroupSnapshotRemoteStatus[]> remoteStatuses,
        Attributes attributes
    )
    {
        this.groupSnapshotID = groupSnapshotID;
        this.groupSnapshotUUID = groupSnapshotUUID;
        this.members = members;
        this.name = name;
        this.createTime = createTime;
        this.status = status;
        this.enableRemoteReplication = enableRemoteReplication;
        this.remoteStatuses = (remoteStatuses == null) ? Optional.<GroupSnapshotRemoteStatus[]>empty() : remoteStatuses;
        this.attributes = attributes;
    }

    /** 
     * Unique ID of the new group snapshot.
     **/
    public Long getGroupSnapshotID() { return this.groupSnapshotID; }
   
    public void setGroupSnapshotID(Long groupSnapshotID) { 
        this.groupSnapshotID = groupSnapshotID;
    }
    /** 
     * UUID of the group snapshot.
     **/
    public java.util.UUID getGroupSnapshotUUID() { return this.groupSnapshotUUID; }
   
    public void setGroupSnapshotUUID(java.util.UUID groupSnapshotUUID) { 
        this.groupSnapshotUUID = groupSnapshotUUID;
    }
    /** 
     * List of snapshots that are members of the group.
     **/
    public Snapshot[] getMembers() { return this.members; }
   
    public void setMembers(Snapshot[] members) { 
        this.members = members;
    }
    /** 
     * Name of the group snapshot, or, if none was given, the UTC formatted day and time on which the snapshot was created.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * The UTC formatted day and time on which the snapshot was created.
     **/
    public String getCreateTime() { return this.createTime; }
   
    public void setCreateTime(String createTime) { 
        this.createTime = createTime;
    }
    /** 
     * Status of the snapshot.
     * Possible values:
     * Preparing: A snapshot that is being prepared for use and is not yet writable.
     * Done: A snapshot that has finished being prepared and is now usable
     **/
    public String getStatus() { return this.status; }
   
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     * Identifies if group snapshot is enabled for remote replication.
     **/
    public Boolean getEnableRemoteReplication() { return this.enableRemoteReplication; }
   
    public void setEnableRemoteReplication(Boolean enableRemoteReplication) { 
        this.enableRemoteReplication = enableRemoteReplication;
    }
    /** 
     * Replication status of the group snapshot as seen on the source cluster.
     * Shows if the group snapshot replication is currently in progress, or
     * has successfully completed.
     **/
    public Optional<GroupSnapshotRemoteStatus[]> getRemoteStatuses() { return this.remoteStatuses; }
   
    public void setRemoteStatuses(Optional<GroupSnapshotRemoteStatus[]> remoteStatuses) { 
        this.remoteStatuses = (remoteStatuses == null) ? Optional.<GroupSnapshotRemoteStatus[]>empty() : remoteStatuses;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Attributes getAttributes() { return this.attributes; }
   
    public void setAttributes(Attributes attributes) { 
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupSnapshot that = (GroupSnapshot) o;

        return 
            Objects.equals(groupSnapshotID, that.groupSnapshotID) && 
            Objects.equals(groupSnapshotUUID, that.groupSnapshotUUID) && 
            Arrays.equals(members, that.members) && 
            Objects.equals(name, that.name) && 
            Objects.equals(createTime, that.createTime) && 
            Objects.equals(status, that.status) && 
            Objects.equals(enableRemoteReplication, that.enableRemoteReplication) && 
            Objects.equals(remoteStatuses, that.remoteStatuses) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( groupSnapshotID,groupSnapshotUUID,(Object[])members,name,createTime,status,enableRemoteReplication,remoteStatuses,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("groupSnapshotID", groupSnapshotID);
        map.put("groupSnapshotUUID", groupSnapshotUUID);
        map.put("members", members);
        map.put("name", name);
        map.put("createTime", createTime);
        map.put("status", status);
        map.put("enableRemoteReplication", enableRemoteReplication);
        map.put("remoteStatuses", remoteStatuses);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" groupSnapshotID : ").append(gson.toJson(groupSnapshotID)).append(",");
        sb.append(" groupSnapshotUUID : ").append(gson.toJson(groupSnapshotUUID)).append(",");
        sb.append(" members : ").append(gson.toJson(Arrays.toString(members))).append(",");
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" createTime : ").append(gson.toJson(createTime)).append(",");
        sb.append(" status : ").append(gson.toJson(status)).append(",");
        sb.append(" enableRemoteReplication : ").append(gson.toJson(enableRemoteReplication)).append(",");
        if(null != remoteStatuses && remoteStatuses.isPresent()){
            sb.append(" remoteStatuses : ").append(gson.toJson(remoteStatuses)).append(",");
        }
        else{
            sb.append(" remoteStatuses : ").append("null").append(",");
        }
        sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
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
        private Long groupSnapshotID;
        private java.util.UUID groupSnapshotUUID;
        private Snapshot[] members;
        private String name;
        private String createTime;
        private String status;
        private Boolean enableRemoteReplication;
        private Optional<GroupSnapshotRemoteStatus[]> remoteStatuses;
        private Attributes attributes;

        private Builder() { }

        public GroupSnapshot build() {
            return new GroupSnapshot (
                         this.groupSnapshotID,
                         this.groupSnapshotUUID,
                         this.members,
                         this.name,
                         this.createTime,
                         this.status,
                         this.enableRemoteReplication,
                         this.remoteStatuses,
                         this.attributes);
        }

        private GroupSnapshot.Builder buildFrom(final GroupSnapshot req) {
            this.groupSnapshotID = req.groupSnapshotID;
            this.groupSnapshotUUID = req.groupSnapshotUUID;
            this.members = req.members;
            this.name = req.name;
            this.createTime = req.createTime;
            this.status = req.status;
            this.enableRemoteReplication = req.enableRemoteReplication;
            this.remoteStatuses = req.remoteStatuses;
            this.attributes = req.attributes;

            return this;
        }

        public GroupSnapshot.Builder groupSnapshotID(final Long groupSnapshotID) {
            this.groupSnapshotID = groupSnapshotID;
            return this;
        }

        public GroupSnapshot.Builder groupSnapshotUUID(final java.util.UUID groupSnapshotUUID) {
            this.groupSnapshotUUID = groupSnapshotUUID;
            return this;
        }

        public GroupSnapshot.Builder members(final Snapshot[] members) {
            this.members = members;
            return this;
        }

        public GroupSnapshot.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public GroupSnapshot.Builder createTime(final String createTime) {
            this.createTime = createTime;
            return this;
        }

        public GroupSnapshot.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public GroupSnapshot.Builder enableRemoteReplication(final Boolean enableRemoteReplication) {
            this.enableRemoteReplication = enableRemoteReplication;
            return this;
        }

        public GroupSnapshot.Builder optionalRemoteStatuses(final GroupSnapshotRemoteStatus[] remoteStatuses) {
            this.remoteStatuses = (remoteStatuses == null) ? Optional.<GroupSnapshotRemoteStatus[]>empty() : Optional.of(remoteStatuses);
            return this;
        }

        public GroupSnapshot.Builder attributes(final Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

    }
}
