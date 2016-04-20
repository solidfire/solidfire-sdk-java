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
 * The object returned by the "CreateGroupSnapshot" API Service call.
 **/
public class CreateGroupSnapshotResult implements Serializable {

    private static final long serialVersionUID = -1863322416L;

    private final Long groupSnapshotID;
    private final GroupSnapshotMembers[] members;

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
     * Unique ID of the new group snapshot.
     **/
    public Long getGroupSnapshotID() {
        return this.groupSnapshotID;
    }

    /**
     * List of checksum, volumeIDs and snapshotIDs for each member of the group.
     **/
    public GroupSnapshotMembers[] getMembers() {
        return this.members;
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
}
