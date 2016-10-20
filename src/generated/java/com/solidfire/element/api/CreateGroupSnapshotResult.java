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
 * The object returned by the "CreateGroupSnapshot" API Service call.
 **/
public class CreateGroupSnapshotResult  implements Serializable  {

    private static final long serialVersionUID = 67011248L;

    @SerializedName("groupSnapshotID") private Long groupSnapshotID;
    @SerializedName("members") private GroupSnapshotMembers[] members;

    /**
     * The object returned by the "CreateGroupSnapshot" API Service call.
     * @param groupSnapshotID [required] Unique ID of the new group snapshot.
     * @param members [required] List of checksum, volumeIDs and snapshotIDs for each member of the group.
     * @since 7.0
     **/
    @Since("7.0")
    public CreateGroupSnapshotResult(Long groupSnapshotID, GroupSnapshotMembers[] members) {
        this.groupSnapshotID = groupSnapshotID;
        this.members = members;
    }

    
    /**
     * The object returned by the "CreateGroupSnapshot" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public CreateGroupSnapshotResult() {}


    /**
     * Unique ID of the new group snapshot.
     **/
    public Long getGroupSnapshotID() {
        return this.groupSnapshotID;
    }

    public void setGroupSnapshotID(Long groupSnapshotID) {
        this.groupSnapshotID = groupSnapshotID;
    }

    /**
     * List of checksum, volumeIDs and snapshotIDs for each member of the group.
     **/
    public GroupSnapshotMembers[] getMembers() {
        return this.members;
    }

    public void setMembers(GroupSnapshotMembers[] members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateGroupSnapshotResult that = (CreateGroupSnapshotResult) o;
        

        return Objects.equals( groupSnapshotID , that.groupSnapshotID )
            && Objects.deepEquals( members , that.members );
    }

    @Override
    public int hashCode() {
        return Objects.hash( groupSnapshotID, members );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" groupSnapshotID : ").append(groupSnapshotID).append(",");
        sb.append(" members : ").append(Arrays.toString(members));
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
        private GroupSnapshotMembers[] members;

        private Builder() { }

        public CreateGroupSnapshotResult build() {
            return new CreateGroupSnapshotResult (
                         this.groupSnapshotID,
                         this.members            );
        }

        private CreateGroupSnapshotResult.Builder buildFrom(final CreateGroupSnapshotResult req) {
            this.groupSnapshotID = req.groupSnapshotID;
            this.members = req.members;

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
