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

public class PrepareVirtualSnapshotResult implements Serializable {

    public static final long serialVersionUID = 3092376121061281453L;
    @SerializedName("virtualVolumeTaskID") private java.util.UUID virtualVolumeTaskID;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("snapshotID") private Long snapshotID;
    @SerializedName("virtualVolumeID") private java.util.UUID virtualVolumeID;

    // empty constructor
    @Since("7.0")
    public PrepareVirtualSnapshotResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public PrepareVirtualSnapshotResult(
        java.util.UUID virtualVolumeTaskID,
        Long volumeID,
        Long snapshotID,
        java.util.UUID virtualVolumeID
    )
    {
        this.virtualVolumeTaskID = virtualVolumeTaskID;
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
        this.virtualVolumeID = virtualVolumeID;
    }

    /** 
     * The ID of the clone task.
     **/
    public java.util.UUID getVirtualVolumeTaskID() { return this.virtualVolumeTaskID; }
    public void setVirtualVolumeTaskID(java.util.UUID virtualVolumeTaskID) { 
        this.virtualVolumeTaskID = virtualVolumeTaskID;
    }
    /** 
     * The volume ID of the newly-created clone.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * snapshotID for the prepared VVol snapshot.
     **/
    public Long getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Long snapshotID) { 
        this.snapshotID = snapshotID;
    }
    /** 
     * virtualVolumeID for the newly created clone.
     **/
    public java.util.UUID getVirtualVolumeID() { return this.virtualVolumeID; }
    public void setVirtualVolumeID(java.util.UUID virtualVolumeID) { 
        this.virtualVolumeID = virtualVolumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrepareVirtualSnapshotResult that = (PrepareVirtualSnapshotResult) o;

        return 
            Objects.equals(virtualVolumeTaskID, that.virtualVolumeTaskID) && 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(snapshotID, that.snapshotID) && 
            Objects.equals(virtualVolumeID, that.virtualVolumeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeTaskID,volumeID,snapshotID,virtualVolumeID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeTaskID", virtualVolumeTaskID);
        map.put("volumeID", volumeID);
        map.put("snapshotID", snapshotID);
        map.put("virtualVolumeID", virtualVolumeID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualVolumeTaskID : ").append(virtualVolumeTaskID).append(",");
        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" snapshotID : ").append(snapshotID).append(",");
        sb.append(" virtualVolumeID : ").append(virtualVolumeID).append(",");
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
        private java.util.UUID virtualVolumeTaskID;
        private Long volumeID;
        private Long snapshotID;
        private java.util.UUID virtualVolumeID;

        private Builder() { }

        public PrepareVirtualSnapshotResult build() {
            return new PrepareVirtualSnapshotResult (
                         this.virtualVolumeTaskID,
                         this.volumeID,
                         this.snapshotID,
                         this.virtualVolumeID);
        }

        private PrepareVirtualSnapshotResult.Builder buildFrom(final PrepareVirtualSnapshotResult req) {
            this.virtualVolumeTaskID = req.virtualVolumeTaskID;
            this.volumeID = req.volumeID;
            this.snapshotID = req.snapshotID;
            this.virtualVolumeID = req.virtualVolumeID;

            return this;
        }

        public PrepareVirtualSnapshotResult.Builder virtualVolumeTaskID(final java.util.UUID virtualVolumeTaskID) {
            this.virtualVolumeTaskID = virtualVolumeTaskID;
            return this;
        }

        public PrepareVirtualSnapshotResult.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public PrepareVirtualSnapshotResult.Builder snapshotID(final Long snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

        public PrepareVirtualSnapshotResult.Builder virtualVolumeID(final java.util.UUID virtualVolumeID) {
            this.virtualVolumeID = virtualVolumeID;
            return this;
        }

    }
}
