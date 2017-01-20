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
 * DeleteGroupSnapshotRequest  
 **/

public class DeleteGroupSnapshotRequest implements Serializable {

    public static final long serialVersionUID = -7065009107300427745L;
    @SerializedName("groupSnapshotID") private Long groupSnapshotID;
    @SerializedName("saveMembers") private Boolean saveMembers;

    // empty constructor
    @Since("7.0")
    public DeleteGroupSnapshotRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteGroupSnapshotRequest(
        Long groupSnapshotID,
        Boolean saveMembers
    )
    {
        this.groupSnapshotID = groupSnapshotID;
        this.saveMembers = saveMembers;
    }

    /** 
     * Unique ID of the group snapshot.
     **/
    public Long getGroupSnapshotID() { return this.groupSnapshotID; }
    public void setGroupSnapshotID(Long groupSnapshotID) { 
        this.groupSnapshotID = groupSnapshotID;
    }
    /** 
     * true: Snapshots are kept, but group association is removed.
     * false: The group and snapshots are deleted.
     **/
    public Boolean getSaveMembers() { return this.saveMembers; }
    public void setSaveMembers(Boolean saveMembers) { 
        this.saveMembers = saveMembers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteGroupSnapshotRequest that = (DeleteGroupSnapshotRequest) o;

        return 
            Objects.equals(groupSnapshotID, that.groupSnapshotID) && 
            Objects.equals(saveMembers, that.saveMembers);
    }

    @Override
    public int hashCode() {
        return Objects.hash( groupSnapshotID,saveMembers );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("groupSnapshotID", groupSnapshotID);
        map.put("saveMembers", saveMembers);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" groupSnapshotID : ").append(groupSnapshotID).append(",");
        sb.append(" saveMembers : ").append(saveMembers).append(",");
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
        private Boolean saveMembers;

        private Builder() { }

        public DeleteGroupSnapshotRequest build() {
            return new DeleteGroupSnapshotRequest (
                         this.groupSnapshotID,
                         this.saveMembers);
        }

        private DeleteGroupSnapshotRequest.Builder buildFrom(final DeleteGroupSnapshotRequest req) {
            this.groupSnapshotID = req.groupSnapshotID;
            this.saveMembers = req.saveMembers;

            return this;
        }

        public DeleteGroupSnapshotRequest.Builder groupSnapshotID(final Long groupSnapshotID) {
            this.groupSnapshotID = groupSnapshotID;
            return this;
        }

        public DeleteGroupSnapshotRequest.Builder saveMembers(final Boolean saveMembers) {
            this.saveMembers = saveMembers;
            return this;
        }

    }
}
