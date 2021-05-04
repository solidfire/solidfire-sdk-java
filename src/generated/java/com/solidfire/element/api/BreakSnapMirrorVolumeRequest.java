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
 * BreakSnapMirrorVolumeRequest  
 * The SolidFire Element OS web UI uses the BreakSnapMirrorVolume method to break the SnapMirror relationship between an ONTAP source container and SolidFire target volume. Breaking a SolidFire SnapMirror volume is useful if an ONTAP system becomes unavailable while replicating data to a SolidFire volume. This feature enables a storage administrator to take control of a SolidFire SnapMirror volume, break its relationship with the remote ONTAP system, and revert the volume to a previous snapshot.
 **/

public class BreakSnapMirrorVolumeRequest implements Serializable {

    public static final long serialVersionUID = -3371923131892540115L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("snapshotID") private Optional<Long> snapshotID;
    @SerializedName("preserve") private Optional<Boolean> preserve;
    @SerializedName("access") private Optional<String> access;

    
    // parameterized constructor
    @Since("7.0")
    public BreakSnapMirrorVolumeRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public BreakSnapMirrorVolumeRequest(
        Long volumeID,
        Optional<Long> snapshotID,
        Optional<Boolean> preserve,
        Optional<String> access
    )
    {
        this.volumeID = volumeID;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
        this.preserve = (preserve == null) ? Optional.<Boolean>empty() : preserve;
        this.access = (access == null) ? Optional.<String>empty() : access;
    }

    /** 
     * The volume on which to perform the break operation.
     * The volume access mode must be snapMirrorTarget.
     **/
    public Long getVolumeID() { return this.volumeID; }
   
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * Roll back the volume to the snapshot identified by this ID.
     * The default behavior is to roll back to the most recent snapshot.
     **/
    public Optional<Long> getSnapshotID() { return this.snapshotID; }
   
    public void setSnapshotID(Optional<Long> snapshotID) { 
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
    }
    /** 
     * Preserve any snapshots newer than the snapshot identified by snapshotID.
     * Possible values:
     * true: Preserve snapshots newer than snapshotID.
     * false: Do not preserve snapshots newer than snapshotID.
     * If false, any snapshots newer than snapshotID are deleted.
     **/
    public Optional<Boolean> getPreserve() { return this.preserve; }
   
    public void setPreserve(Optional<Boolean> preserve) { 
        this.preserve = (preserve == null) ? Optional.<Boolean>empty() : preserve;
    }
    /** 
     * Resulting volume access mode.
     * Possible values:
     * readWrite
     * readOnly
     * locked
     **/
    public Optional<String> getAccess() { return this.access; }
   
    public void setAccess(Optional<String> access) { 
        this.access = (access == null) ? Optional.<String>empty() : access;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BreakSnapMirrorVolumeRequest that = (BreakSnapMirrorVolumeRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(snapshotID, that.snapshotID) && 
            Objects.equals(preserve, that.preserve) && 
            Objects.equals(access, that.access);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,snapshotID,preserve,access );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("snapshotID", snapshotID);
        map.put("preserve", preserve);
        map.put("access", access);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(gson.toJson(volumeID)).append(",");
        if(null != snapshotID && snapshotID.isPresent()){
            sb.append(" snapshotID : ").append(gson.toJson(snapshotID)).append(",");
        }
        else{
            sb.append(" snapshotID : ").append("null").append(",");
        }
        if(null != preserve && preserve.isPresent()){
            sb.append(" preserve : ").append(gson.toJson(preserve)).append(",");
        }
        else{
            sb.append(" preserve : ").append("null").append(",");
        }
        if(null != access && access.isPresent()){
            sb.append(" access : ").append(gson.toJson(access)).append(",");
        }
        else{
            sb.append(" access : ").append("null").append(",");
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
        private Optional<Long> snapshotID;
        private Optional<Boolean> preserve;
        private Optional<String> access;

        private Builder() { }

        public BreakSnapMirrorVolumeRequest build() {
            return new BreakSnapMirrorVolumeRequest (
                         this.volumeID,
                         this.snapshotID,
                         this.preserve,
                         this.access);
        }

        private BreakSnapMirrorVolumeRequest.Builder buildFrom(final BreakSnapMirrorVolumeRequest req) {
            this.volumeID = req.volumeID;
            this.snapshotID = req.snapshotID;
            this.preserve = req.preserve;
            this.access = req.access;

            return this;
        }

        public BreakSnapMirrorVolumeRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public BreakSnapMirrorVolumeRequest.Builder optionalSnapshotID(final Long snapshotID) {
            this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : Optional.of(snapshotID);
            return this;
        }

        public BreakSnapMirrorVolumeRequest.Builder optionalPreserve(final Boolean preserve) {
            this.preserve = (preserve == null) ? Optional.<Boolean>empty() : Optional.of(preserve);
            return this;
        }

        public BreakSnapMirrorVolumeRequest.Builder optionalAccess(final String access) {
            this.access = (access == null) ? Optional.<String>empty() : Optional.of(access);
            return this;
        }

    }
}
