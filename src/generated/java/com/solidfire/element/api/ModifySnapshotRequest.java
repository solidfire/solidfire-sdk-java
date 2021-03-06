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
 * ModifySnapshotRequest  
 * ModifySnapshot enables you to change the attributes currently assigned to a snapshot. You can use this method to enable snapshots created on
 * the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
 **/

public class ModifySnapshotRequest implements Serializable {

    public static final long serialVersionUID = -6880414752949101904L;
    @SerializedName("snapshotID") private Long snapshotID;
    @SerializedName("expirationTime") private Optional<String> expirationTime;
    @SerializedName("enableRemoteReplication") private Optional<Boolean> enableRemoteReplication;
    @SerializedName("snapMirrorLabel") private Optional<String> snapMirrorLabel;
    // empty constructor
    @Since("7.0")
    public ModifySnapshotRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifySnapshotRequest(
        Long snapshotID,
        Optional<String> expirationTime,
        Optional<Boolean> enableRemoteReplication
    )
    {
        this.snapshotID = snapshotID;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
    }
    // parameterized constructor
    @Since("10.0")
    public ModifySnapshotRequest(
        Long snapshotID,
        Optional<String> expirationTime,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> snapMirrorLabel
    )
    {
        this.snapshotID = snapshotID;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : snapMirrorLabel;
    }

    /** 
     * Specifies the ID of the snapshot.
     **/
    public Long getSnapshotID() { return this.snapshotID; }
   
    public void setSnapshotID(Long snapshotID) { 
        this.snapshotID = snapshotID;
    }
    /** 
     * Specify the time after which the snapshot can be removed.
     * If neither 'expirationTime' nor 'retention' is specified for the original snapshot, the snapshot
     * will be retained until manually deleted.
     * The format is: 
     *   ISO 8601 date string for time based expiration, otherwise it will not expire.
     *   'null', or not specified, the snapshot is to be retained permanently.
     *   'fifo' causes the snapshot to be preserved on a First-In-First-Out basis, relative to other FIFO
     *        snapshots on the volume. The API will fail if no FIFO space is available.
     * Note: The 'retention' option is not supported by ModifySnapshot.
     **/
    public Optional<String> getExpirationTime() { return this.expirationTime; }
   
    public void setExpirationTime(Optional<String> expirationTime) { 
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
    }
    /** 
     * Replicates the snapshot created to a remote cluster.
     * Possible values are:
     * true: The snapshot is replicated to remote storage.
     * false: Default. The snapshot is not replicated.
     **/
    public Optional<Boolean> getEnableRemoteReplication() { return this.enableRemoteReplication; }
   
    public void setEnableRemoteReplication(Optional<Boolean> enableRemoteReplication) { 
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
    }
    /** 
     * Label used by SnapMirror software to specify snapshot retention policy on SnapMirror endpoint.
     **/
    public Optional<String> getSnapMirrorLabel() { return this.snapMirrorLabel; }
   
    public void setSnapMirrorLabel(Optional<String> snapMirrorLabel) { 
        this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : snapMirrorLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifySnapshotRequest that = (ModifySnapshotRequest) o;

        return 
            Objects.equals(snapshotID, that.snapshotID) && 
            Objects.equals(expirationTime, that.expirationTime) && 
            Objects.equals(enableRemoteReplication, that.enableRemoteReplication) && 
            Objects.equals(snapMirrorLabel, that.snapMirrorLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapshotID,expirationTime,enableRemoteReplication,snapMirrorLabel );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapshotID", snapshotID);
        map.put("expirationTime", expirationTime);
        map.put("enableRemoteReplication", enableRemoteReplication);
        map.put("snapMirrorLabel", snapMirrorLabel);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapshotID : ").append(gson.toJson(snapshotID)).append(",");
        if(null != expirationTime && expirationTime.isPresent()){
            sb.append(" expirationTime : ").append(gson.toJson(expirationTime)).append(",");
        }
        else{
            sb.append(" expirationTime : ").append("null").append(",");
        }
        if(null != enableRemoteReplication && enableRemoteReplication.isPresent()){
            sb.append(" enableRemoteReplication : ").append(gson.toJson(enableRemoteReplication)).append(",");
        }
        else{
            sb.append(" enableRemoteReplication : ").append("null").append(",");
        }
        if(null != snapMirrorLabel && snapMirrorLabel.isPresent()){
            sb.append(" snapMirrorLabel : ").append(gson.toJson(snapMirrorLabel)).append(",");
        }
        else{
            sb.append(" snapMirrorLabel : ").append("null").append(",");
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
        private Long snapshotID;
        private Optional<String> expirationTime;
        private Optional<Boolean> enableRemoteReplication;
        private Optional<String> snapMirrorLabel;

        private Builder() { }

        public ModifySnapshotRequest build() {
            return new ModifySnapshotRequest (
                         this.snapshotID,
                         this.expirationTime,
                         this.enableRemoteReplication,
                         this.snapMirrorLabel);
        }

        private ModifySnapshotRequest.Builder buildFrom(final ModifySnapshotRequest req) {
            this.snapshotID = req.snapshotID;
            this.expirationTime = req.expirationTime;
            this.enableRemoteReplication = req.enableRemoteReplication;
            this.snapMirrorLabel = req.snapMirrorLabel;

            return this;
        }

        public ModifySnapshotRequest.Builder snapshotID(final Long snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

        public ModifySnapshotRequest.Builder optionalExpirationTime(final String expirationTime) {
            this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : Optional.of(expirationTime);
            return this;
        }

        public ModifySnapshotRequest.Builder optionalEnableRemoteReplication(final Boolean enableRemoteReplication) {
            this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : Optional.of(enableRemoteReplication);
            return this;
        }

        public ModifySnapshotRequest.Builder optionalSnapMirrorLabel(final String snapMirrorLabel) {
            this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : Optional.of(snapMirrorLabel);
            return this;
        }

    }
}
