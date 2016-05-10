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
 * The Request object for the "DeleteGroupSnapshot" API Service call.
 **/
public class DeleteGroupSnapshotRequest implements Serializable {

    private static final long serialVersionUID = -910251580L;

    private final Long groupSnapshotID;
    private final Boolean saveMembers;

    /**
     * The Request object for the "DeleteGroupSnapshot" API Service call.
     * @param groupSnapshotID [required] Unique ID of the group snapshot.
     * @param saveMembers [required] <br/><b>true</b>: Snapshots are kept, but group association is removed.
     * @since 7.0
     **/
    @Since("7.0")
    public DeleteGroupSnapshotRequest(Long groupSnapshotID, Boolean saveMembers) {
        this.groupSnapshotID = groupSnapshotID;
        this.saveMembers = saveMembers;
    }


    /**
     * Unique ID of the group snapshot.
     **/
    public Long getGroupSnapshotID() {
        return this.groupSnapshotID;
    }

    /**
     * <br/><b>true</b>: Snapshots are kept, but group association is removed.
     * <br/><b>false</b>: The group and snapshots are deleted.
     **/
    public Boolean getSaveMembers() {
        return this.saveMembers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteGroupSnapshotRequest that = (DeleteGroupSnapshotRequest) o;
        

        return Objects.equals( groupSnapshotID , that.groupSnapshotID )
            && Objects.equals( saveMembers , that.saveMembers );
    }

    @Override
    public int hashCode() {

        return Objects.hash( groupSnapshotID, saveMembers );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" groupSnapshotID : ").append(groupSnapshotID).append(",");
        sb.append(" saveMembers : ").append(saveMembers);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder getBuilder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().fromRequest(this);
    }

    public static class Builder {
        private Long groupSnapshotID;
        private Boolean saveMembers;

        private Builder() { }

        public DeleteGroupSnapshotRequest toRequest() {
            return new DeleteGroupSnapshotRequest (
                         this.groupSnapshotID,
                         this.saveMembers            );
        }

        private DeleteGroupSnapshotRequest.Builder fromRequest(final DeleteGroupSnapshotRequest req) {
            this.groupSnapshotID = req.groupSnapshotID;
            this.saveMembers = req.saveMembers;

            return this;
        }

        public DeleteGroupSnapshotRequest.Builder withGroupSnapshotID(final Long groupSnapshotID) {
            this.groupSnapshotID = groupSnapshotID;
            return this;
        }

        public DeleteGroupSnapshotRequest.Builder withSaveMembers(final Boolean saveMembers) {
            this.saveMembers = saveMembers;
            return this;
        }

    }

}
