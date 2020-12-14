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
 * RollbackToGroupSnapshotResult  
 **/

public class RollbackToGroupSnapshotResult implements Serializable {

    public static final long serialVersionUID = -4267470482090937700L;
    @SerializedName("groupSnapshot") private Optional<GroupSnapshot> groupSnapshot;
    @SerializedName("groupSnapshotID") private Optional<Long> groupSnapshotID;
    @SerializedName("members") private Optional<GroupSnapshotMembers[]> members;
    // empty constructor
    @Since("7.0")
    public RollbackToGroupSnapshotResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public RollbackToGroupSnapshotResult(
        Optional<GroupSnapshot> groupSnapshot,
        Optional<Long> groupSnapshotID,
        Optional<GroupSnapshotMembers[]> members
    )
    {
        this.groupSnapshot = (groupSnapshot == null) ? Optional.<GroupSnapshot>empty() : groupSnapshot;
        this.groupSnapshotID = (groupSnapshotID == null) ? Optional.<Long>empty() : groupSnapshotID;
        this.members = (members == null) ? Optional.<GroupSnapshotMembers[]>empty() : members;
    }

    /** 
     * 
     **/
    public Optional<GroupSnapshot> getGroupSnapshot() { return this.groupSnapshot; }
   
    public void setGroupSnapshot(Optional<GroupSnapshot> groupSnapshot) { 
        this.groupSnapshot = (groupSnapshot == null) ? Optional.<GroupSnapshot>empty() : groupSnapshot;
    }
    /** 
     * Unique ID of the new group snapshot.
     **/
    public Optional<Long> getGroupSnapshotID() { return this.groupSnapshotID; }
   
    public void setGroupSnapshotID(Optional<Long> groupSnapshotID) { 
        this.groupSnapshotID = (groupSnapshotID == null) ? Optional.<Long>empty() : groupSnapshotID;
    }
    /** 
     * List of checksum, volumeIDs and snapshotIDs for each member of the group.
     **/
    public Optional<GroupSnapshotMembers[]> getMembers() { return this.members; }
   
    public void setMembers(Optional<GroupSnapshotMembers[]> members) { 
        this.members = (members == null) ? Optional.<GroupSnapshotMembers[]>empty() : members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RollbackToGroupSnapshotResult that = (RollbackToGroupSnapshotResult) o;

        return 
            Objects.equals(groupSnapshot, that.groupSnapshot) && 
            Objects.equals(groupSnapshotID, that.groupSnapshotID) && 
            Objects.equals(members, that.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash( groupSnapshot,groupSnapshotID,members );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("groupSnapshot", groupSnapshot);
        map.put("groupSnapshotID", groupSnapshotID);
        map.put("members", members);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != groupSnapshot && groupSnapshot.isPresent()){
            sb.append(" groupSnapshot : ").append(gson.toJson(groupSnapshot)).append(",");
        }
        else{
            sb.append(" groupSnapshot : ").append("null").append(",");
        }
        if(null != groupSnapshotID && groupSnapshotID.isPresent()){
            sb.append(" groupSnapshotID : ").append(gson.toJson(groupSnapshotID)).append(",");
        }
        else{
            sb.append(" groupSnapshotID : ").append("null").append(",");
        }
        if(null != members && members.isPresent()){
            sb.append(" members : ").append(gson.toJson(members)).append(",");
        }
        else{
            sb.append(" members : ").append("null").append(",");
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
        private Optional<GroupSnapshot> groupSnapshot;
        private Optional<Long> groupSnapshotID;
        private Optional<GroupSnapshotMembers[]> members;

        private Builder() { }

        public RollbackToGroupSnapshotResult build() {
            return new RollbackToGroupSnapshotResult (
                         this.groupSnapshot,
                         this.groupSnapshotID,
                         this.members);
        }

        private RollbackToGroupSnapshotResult.Builder buildFrom(final RollbackToGroupSnapshotResult req) {
            this.groupSnapshot = req.groupSnapshot;
            this.groupSnapshotID = req.groupSnapshotID;
            this.members = req.members;

            return this;
        }

        public RollbackToGroupSnapshotResult.Builder optionalGroupSnapshot(final GroupSnapshot groupSnapshot) {
            this.groupSnapshot = (groupSnapshot == null) ? Optional.<GroupSnapshot>empty() : Optional.of(groupSnapshot);
            return this;
        }

        public RollbackToGroupSnapshotResult.Builder optionalGroupSnapshotID(final Long groupSnapshotID) {
            this.groupSnapshotID = (groupSnapshotID == null) ? Optional.<Long>empty() : Optional.of(groupSnapshotID);
            return this;
        }

        public RollbackToGroupSnapshotResult.Builder optionalMembers(final GroupSnapshotMembers[] members) {
            this.members = (members == null) ? Optional.<GroupSnapshotMembers[]>empty() : Optional.of(members);
            return this;
        }

    }
}
