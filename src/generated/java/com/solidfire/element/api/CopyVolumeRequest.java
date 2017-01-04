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
 * CopyVolumeRequest  
 **/

public class CopyVolumeRequest implements Serializable {

    public static final long serialVersionUID = -6809771567710525111L;
    @SerializedName("volumeID") private VolumeID volumeID;
    @SerializedName("dstVolumeID") private VolumeID dstVolumeID;
    @SerializedName("snapshotID") private Optional<SnapshotID> snapshotID;

    // empty constructor
    @Since("7.0")
    public CopyVolumeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CopyVolumeRequest(
        VolumeID volumeID,
        VolumeID dstVolumeID,
        Optional<SnapshotID> snapshotID
    )
    {
        this.volumeID = volumeID;
        this.dstVolumeID = dstVolumeID;
        this.snapshotID = (snapshotID == null) ? Optional.<SnapshotID>empty() : snapshotID;
    }

    /** 
     * Source volume to copy.
     **/
    public VolumeID getVolumeID() { return this.volumeID; }
    public void setVolumeID(VolumeID volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * Destination volume for the copy.
     **/
    public VolumeID getDstVolumeID() { return this.dstVolumeID; }
    public void setDstVolumeID(VolumeID dstVolumeID) { 
        this.dstVolumeID = dstVolumeID;
    }
    /** 
     * Snapshot ID of the source volume to create the copy from.
     **/
    public Optional<SnapshotID> getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Optional<SnapshotID> snapshotID) { 
        this.snapshotID = (snapshotID == null) ? Optional.<SnapshotID>empty() : snapshotID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CopyVolumeRequest that = (CopyVolumeRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(dstVolumeID, that.dstVolumeID) && 
            Objects.equals(snapshotID, that.snapshotID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,dstVolumeID,snapshotID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("dstVolumeID", dstVolumeID);
        map.put("snapshotID", snapshotID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" dstVolumeID : ").append(dstVolumeID).append(",");
        if(null != snapshotID && snapshotID.isPresent()){
            sb.append(" snapshotID : ").append(snapshotID).append(",");
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
        private VolumeID volumeID;
        private VolumeID dstVolumeID;
        private Optional<SnapshotID> snapshotID;

        private Builder() { }

        public CopyVolumeRequest build() {
            return new CopyVolumeRequest (
                         this.volumeID,
                         this.dstVolumeID,
                         this.snapshotID);
        }

        private CopyVolumeRequest.Builder buildFrom(final CopyVolumeRequest req) {
            this.volumeID = req.volumeID;
            this.dstVolumeID = req.dstVolumeID;
            this.snapshotID = req.snapshotID;

            return this;
        }

        public CopyVolumeRequest.Builder volumeID(final VolumeID volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public CopyVolumeRequest.Builder dstVolumeID(final VolumeID dstVolumeID) {
            this.dstVolumeID = dstVolumeID;
            return this;
        }

        public CopyVolumeRequest.Builder optionalSnapshotID(final SnapshotID snapshotID) {
            this.snapshotID = (snapshotID == null) ? Optional.<SnapshotID>empty() : Optional.of(snapshotID);
            return this;
        }

    }
}
