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
 * ListGroupSnapshotsRequest  
 * ListGroupSnapshots is used to return information about all group snapshots that have been created.
 **/

public class ListGroupSnapshotsRequest implements Serializable {

    public static final long serialVersionUID = 3471955734566932778L;
    @SerializedName("volumeID") private Optional<Long> volumeID;
    @SerializedName("groupSnapshotID") private Optional<Long> groupSnapshotID;

    // empty constructor
    @Since("7.0")
    public ListGroupSnapshotsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListGroupSnapshotsRequest(
        Optional<Long> volumeID
    )
    {
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
    }
    // parameterized constructor
    @Since("9.0")
    public ListGroupSnapshotsRequest(
        Optional<Long> volumeID,
        Optional<Long> groupSnapshotID
    )
    {
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
        this.groupSnapshotID = (groupSnapshotID == null) ? Optional.<Long>empty() : groupSnapshotID;
    }

    /** 
     * An array of unique volume IDs to query.
     * If this parameter is not specified, all group snapshots on the cluster will be included.
     **/
    public Optional<Long> getVolumeID() { return this.volumeID; }
    public void setVolumeID(Optional<Long> volumeID) { 
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
    }
    /** 
     * Get info about individual snapshot
     **/
    public Optional<Long> getGroupSnapshotID() { return this.groupSnapshotID; }
    public void setGroupSnapshotID(Optional<Long> groupSnapshotID) { 
        this.groupSnapshotID = (groupSnapshotID == null) ? Optional.<Long>empty() : groupSnapshotID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListGroupSnapshotsRequest that = (ListGroupSnapshotsRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(groupSnapshotID, that.groupSnapshotID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,groupSnapshotID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("groupSnapshotID", groupSnapshotID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != volumeID && volumeID.isPresent()){
            sb.append(" volumeID : ").append(volumeID).append(",");
        }
        if(null != groupSnapshotID && groupSnapshotID.isPresent()){
            sb.append(" groupSnapshotID : ").append(groupSnapshotID).append(",");
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
        private Optional<Long> volumeID;
        private Optional<Long> groupSnapshotID;

        private Builder() { }

        public ListGroupSnapshotsRequest build() {
            return new ListGroupSnapshotsRequest (
                         this.volumeID,
                         this.groupSnapshotID);
        }

        private ListGroupSnapshotsRequest.Builder buildFrom(final ListGroupSnapshotsRequest req) {
            this.volumeID = req.volumeID;
            this.groupSnapshotID = req.groupSnapshotID;

            return this;
        }

        public ListGroupSnapshotsRequest.Builder optionalVolumeID(final Long volumeID) {
            this.volumeID = (volumeID == null) ? Optional.<Long>empty() : Optional.of(volumeID);
            return this;
        }

        public ListGroupSnapshotsRequest.Builder optionalGroupSnapshotID(final Long groupSnapshotID) {
            this.groupSnapshotID = (groupSnapshotID == null) ? Optional.<Long>empty() : Optional.of(groupSnapshotID);
            return this;
        }

    }
}
