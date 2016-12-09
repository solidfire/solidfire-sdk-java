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
 * 
 **/

public class PrepareVirtualSnapshotRequest implements Serializable {

    public static final long serialVersionUID = -4324099540451716656L;
    @SerializedName("virtualVolumeID") private java.util.UUID virtualVolumeID;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("writableSnapshot") private Optional<Boolean> writableSnapshot;
    @SerializedName("callingVirtualVolumeHostID") private Optional<java.util.UUID> callingVirtualVolumeHostID;

    // empty constructor
    @Since("7.0")
    public PrepareVirtualSnapshotRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public PrepareVirtualSnapshotRequest(
        java.util.UUID virtualVolumeID,
        Optional<String> name,
        Optional<Boolean> writableSnapshot,
        Optional<java.util.UUID> callingVirtualVolumeHostID
    )
    {
        this.virtualVolumeID = virtualVolumeID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.writableSnapshot = (writableSnapshot == null) ? Optional.<Boolean>empty() : writableSnapshot;
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : callingVirtualVolumeHostID;
    }

    /** 
     * The ID of the Virtual Volume to clone.
     **/
    public java.util.UUID getVirtualVolumeID() { return this.virtualVolumeID; }
    public void setVirtualVolumeID(java.util.UUID virtualVolumeID) { 
        this.virtualVolumeID = virtualVolumeID;
    }
    /** 
     * The name for the newly-created volume.
     **/
    public Optional<String> getName() { return this.name; }
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * Will the snapshot be writable?
     **/
    public Optional<Boolean> getWritableSnapshot() { return this.writableSnapshot; }
    public void setWritableSnapshot(Optional<Boolean> writableSnapshot) { 
        this.writableSnapshot = (writableSnapshot == null) ? Optional.<Boolean>empty() : writableSnapshot;
    }
    /** 
     **/
    public Optional<java.util.UUID> getCallingVirtualVolumeHostID() { return this.callingVirtualVolumeHostID; }
    public void setCallingVirtualVolumeHostID(Optional<java.util.UUID> callingVirtualVolumeHostID) { 
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : callingVirtualVolumeHostID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrepareVirtualSnapshotRequest that = (PrepareVirtualSnapshotRequest) o;

        return 
            Objects.equals(virtualVolumeID, that.virtualVolumeID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(writableSnapshot, that.writableSnapshot) && 
            Objects.equals(callingVirtualVolumeHostID, that.callingVirtualVolumeHostID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeID,name,writableSnapshot,callingVirtualVolumeHostID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeID", virtualVolumeID);
        map.put("name", name);
        map.put("writableSnapshot", writableSnapshot);
        map.put("callingVirtualVolumeHostID", callingVirtualVolumeHostID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualVolumeID : ").append(virtualVolumeID).append(",");
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(name).append(",");
        }
        if(null != writableSnapshot && writableSnapshot.isPresent()){
            sb.append(" writableSnapshot : ").append(writableSnapshot).append(",");
        }
        if(null != callingVirtualVolumeHostID && callingVirtualVolumeHostID.isPresent()){
            sb.append(" callingVirtualVolumeHostID : ").append(callingVirtualVolumeHostID).append(",");
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
        private java.util.UUID virtualVolumeID;
        private Optional<String> name;
        private Optional<Boolean> writableSnapshot;
        private Optional<java.util.UUID> callingVirtualVolumeHostID;

        private Builder() { }

        public PrepareVirtualSnapshotRequest build() {
            return new PrepareVirtualSnapshotRequest (
                         this.virtualVolumeID,
                         this.name,
                         this.writableSnapshot,
                         this.callingVirtualVolumeHostID);
        }

        private PrepareVirtualSnapshotRequest.Builder buildFrom(final PrepareVirtualSnapshotRequest req) {
            this.virtualVolumeID = req.virtualVolumeID;
            this.name = req.name;
            this.writableSnapshot = req.writableSnapshot;
            this.callingVirtualVolumeHostID = req.callingVirtualVolumeHostID;

            return this;
        }

        public PrepareVirtualSnapshotRequest.Builder virtualVolumeID(final java.util.UUID virtualVolumeID) {
            this.virtualVolumeID = virtualVolumeID;
            return this;
        }

        public PrepareVirtualSnapshotRequest.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public PrepareVirtualSnapshotRequest.Builder optionalWritableSnapshot(final Boolean writableSnapshot) {
            this.writableSnapshot = (writableSnapshot == null) ? Optional.<Boolean>empty() : Optional.of(writableSnapshot);
            return this;
        }

        public PrepareVirtualSnapshotRequest.Builder optionalCallingVirtualVolumeHostID(final java.util.UUID callingVirtualVolumeHostID) {
            this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : Optional.of(callingVirtualVolumeHostID);
            return this;
        }

    }
}
