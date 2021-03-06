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
 * CreateGroupSnapshotResult  
 **/

public class CreateGroupSnapshotResult implements Serializable {

    public static final long serialVersionUID = -3243595407415206614L;
    @SerializedName("groupSnapshot") private GroupSnapshot groupSnapshot;
    @SerializedName("groupSnapshotID") private Long groupSnapshotID;
    @SerializedName("members") private GroupSnapshotMembers[] members;
    // empty constructor
    @Since("7.0")
    public CreateGroupSnapshotResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateGroupSnapshotResult(
        GroupSnapshot groupSnapshot,
        Long groupSnapshotID,
        GroupSnapshotMembers[] members
    )
    {
        this.groupSnapshot = groupSnapshot;
        this.groupSnapshotID = groupSnapshotID;
        this.members = members;
    }

    /** 
     * 
     **/
    public GroupSnapshot getGroupSnapshot() { return this.groupSnapshot; }
   
    public void setGroupSnapshot(GroupSnapshot groupSnapshot) { 
        this.groupSnapshot = groupSnapshot;
    }
    /** 
     * Unique ID of the new group snapshot.
     **/
    public Long getGroupSnapshotID() { return this.groupSnapshotID; }
   
    public void setGroupSnapshotID(Long groupSnapshotID) { 
        this.groupSnapshotID = groupSnapshotID;
    }
    /** 
     * List of checksum, volumeIDs and snapshotIDs for each member of the group.
     **/
    public GroupSnapshotMembers[] getMembers() { return this.members; }
   
    public void setMembers(GroupSnapshotMembers[] members) { 
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateGroupSnapshotResult that = (CreateGroupSnapshotResult) o;

        return 
            Objects.equals(groupSnapshot, that.groupSnapshot) && 
            Objects.equals(groupSnapshotID, that.groupSnapshotID) && 
            Arrays.equals(members, that.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash( groupSnapshot,groupSnapshotID,(Object[])members );
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

        sb.append(" groupSnapshot : ").append(gson.toJson(groupSnapshot)).append(",");
        sb.append(" groupSnapshotID : ").append(gson.toJson(groupSnapshotID)).append(",");
        sb.append(" members : ").append(gson.toJson(Arrays.toString(members))).append(",");
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
        private GroupSnapshot groupSnapshot;
        private Long groupSnapshotID;
        private GroupSnapshotMembers[] members;

        private Builder() { }

        public CreateGroupSnapshotResult build() {
            return new CreateGroupSnapshotResult (
                         this.groupSnapshot,
                         this.groupSnapshotID,
                         this.members);
        }

        private CreateGroupSnapshotResult.Builder buildFrom(final CreateGroupSnapshotResult req) {
            this.groupSnapshot = req.groupSnapshot;
            this.groupSnapshotID = req.groupSnapshotID;
            this.members = req.members;

            return this;
        }

        public CreateGroupSnapshotResult.Builder groupSnapshot(final GroupSnapshot groupSnapshot) {
            this.groupSnapshot = groupSnapshot;
            return this;
        }

        public CreateGroupSnapshotResult.Builder groupSnapshotID(final Long groupSnapshotID) {
            this.groupSnapshotID = groupSnapshotID;
            return this;
        }

        public CreateGroupSnapshotResult.Builder members(final GroupSnapshotMembers[] members) {
            this.members = members;
            return this;
        }

    }
}
