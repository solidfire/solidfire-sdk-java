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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * CopyVolumeRequest  
 * CopyVolume enables you to overwrite the data contents of an existing volume with the data contents of another volume (or
 * snapshot). Attributes of the destination volume such as IQN, QoS settings, size, account, and volume access group membership are
 * not changed. The destination volume must already exist and must be the same size as the source volume.
 * NetApp strongly recommends that clients unmount the destination volume before the CopyVolume operation begins. If the
 * destination volume is modified during the copy operation, the changes will be lost.
 * This method is asynchronous and may take a variable amount of time to complete. You can use the GetAsyncResult method to
 * determine when the process has finished, and ListSyncJobs to see the progress of the copy.
 **/

public class CopyVolumeRequest implements Serializable {

    public static final long serialVersionUID = 7631698635093772075L;
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
     * VolumeID of the volume to be read from.
     **/
    public Long getVolumeID() { return this.volumeID; }
   
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * VolumeID of the volume to be overwritten.
     **/
    public Long getDstVolumeID() { return this.dstVolumeID; }
   
    public void setDstVolumeID(Long dstVolumeID) { 
        this.dstVolumeID = dstVolumeID;
    }
    /** 
     * ID of the snapshot that is used as the source of the clone.
     * If no ID is provided, the current active volume is used.
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
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(gson.toJson(volumeID)).append(",");
        sb.append(" dstVolumeID : ").append(gson.toJson(dstVolumeID)).append(",");
        if(null != snapshotID && snapshotID.isPresent()){
            sb.append(" snapshotID : ").append(gson.toJson(snapshotID)).append(",");
        }
        else{
            sb.append(" snapshotID : ").append("null").append(",");
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
