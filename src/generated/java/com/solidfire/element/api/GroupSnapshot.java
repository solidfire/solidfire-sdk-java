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

import com.solidfire.javautil.Optional;

import com.solidfire.client.ApiException;
import com.solidfire.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import com.solidfire.annotation.Since;

import static com.solidfire.javautil.Optional.of;


/**
 * Group Snapshot object represents a point-in-time copy of a group of volumes.
 **/
public class GroupSnapshot implements Serializable {

    private static final long serialVersionUID = -430612536L;

    private final Long groupSnapshotID;
    private final String groupSnapshotUUID;
    private final GroupSnapshotMembers[] members;
    private final String name;
    private final String createTime;
    private final String status;
    private final java.util.Map<String, Object> attributes;

    /**
     * Group Snapshot object represents a point-in-time copy of a group of volumes.
     * @param groupSnapshotID [required] Unique ID of the new group snapshot.
     * @param groupSnapshotUUID [required] UUID of the group snapshot.
     * @param members [required] List of volumeIDs and snapshotIDs for each member of the group.
     * @param name [required] Name of the group snapshot, or, if none was given, the UTC formatted day and time on which the snapshot was created.
     * @param createTime [required] The UTC formatted day and time on which the snapshot was created.
     * @param status [required] Status of the snapshot.
     * @param attributes [required] List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public GroupSnapshot(Long groupSnapshotID, String groupSnapshotUUID, GroupSnapshotMembers[] members, String name, String createTime, String status, java.util.Map<String, Object> attributes) {
        this.name = name;
        this.createTime = createTime;
        this.attributes = attributes;
        this.groupSnapshotUUID = groupSnapshotUUID;
        this.status = status;
        this.members = members;
        this.groupSnapshotID = groupSnapshotID;
    }


    /**
     * Unique ID of the new group snapshot.
     **/
    public Long getGroupSnapshotID() {
        return this.groupSnapshotID;
    }

    /**
     * UUID of the group snapshot.
     **/
    public String getGroupSnapshotUUID() {
        return this.groupSnapshotUUID;
    }

    /**
     * List of volumeIDs and snapshotIDs for each member of the group.
     **/
    public GroupSnapshotMembers[] getMembers() {
        return this.members;
    }

    /**
     * Name of the group snapshot, or, if none was given, the UTC formatted day and time on which the snapshot was created.
     **/
    public String getName() {
        return this.name;
    }

    /**
     * The UTC formatted day and time on which the snapshot was created.
     **/
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * Status of the snapshot.
     * Possible values:
     * <br/><b>Preparing</b>: A snapshot that is being prepared for use and is not yet writable.
     * <br/><b>Done</b>: A snapshot that has finished being prepared and is now usable
     **/
    public String getStatus() {
        return this.status;
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

        GroupSnapshot that = (GroupSnapshot) o;
        

        return Objects.equals( groupSnapshotID , that.groupSnapshotID )
            && Objects.equals( groupSnapshotUUID , that.groupSnapshotUUID )
            && Objects.deepEquals( members , that.members )
            && Objects.equals( name , that.name )
            && Objects.equals( createTime , that.createTime )
            && Objects.equals( status , that.status )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {

        return Objects.hash( groupSnapshotID, groupSnapshotUUID, members, name, createTime, status, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" groupSnapshotID : ").append(groupSnapshotID).append(",");
        sb.append(" groupSnapshotUUID : ").append(groupSnapshotUUID).append(",");
        sb.append(" members : ").append(Arrays.toString(members)).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" createTime : ").append(createTime).append(",");
        sb.append(" status : ").append(status).append(",");
        sb.append(" attributes : ").append(attributes);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
