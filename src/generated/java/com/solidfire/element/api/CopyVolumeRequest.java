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

public class CopyVolumeRequest implements Serializable {

    public static final long serialVersionUID = -6809771567710525111L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("dstVolumeID") private Long dstVolumeID;
    @SerializedName("snapshotID") private Optional<Long> snapshotID;

    // empty constructor
    @Since("7.0")
    public CopyVolumeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CopyVolumeRequest(
        Long volumeID,
        Long dstVolumeID,
        Optional<Long> snapshotID
    )
    {
        this.volumeID = volumeID;
        this.dstVolumeID = dstVolumeID;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
    }

    /** 
     * Source volume to copy.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * Destination volume for the copy.
     **/
    public Long getDstVolumeID() { return this.dstVolumeID; }
    public void setDstVolumeID(Long dstVolumeID) { 
        this.dstVolumeID = dstVolumeID;
    }
    /** 
     * Snapshot ID of the source volume to create the copy from.
     **/
    public Optional<Long> getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Optional<Long> snapshotID) { 
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
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
        private Long volumeID;
        private Long dstVolumeID;
        private Optional<Long> snapshotID;

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

        public CopyVolumeRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public CopyVolumeRequest.Builder dstVolumeID(final Long dstVolumeID) {
            this.dstVolumeID = dstVolumeID;
            return this;
        }

        public CopyVolumeRequest.Builder optionalSnapshotID(final Long snapshotID) {
            this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : Optional.of(snapshotID);
            return this;
        }

    }
}
