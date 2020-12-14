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
 * ModifyGroupSnapshotRequest  
 * ModifyGroupSnapshot enables you to change the attributes of a group of snapshots. You can also use this method to enable snapshots created on the Read/Write (source) volume to be remotely replicated to a target SolidFire storage system.
 **/

public class ModifyGroupSnapshotRequest implements Serializable {

    public static final long serialVersionUID = 8910084486119464059L;
    @SerializedName("groupSnapshotID") private Long groupSnapshotID;
    @SerializedName("expirationTime") private Optional<String> expirationTime;
    @SerializedName("enableRemoteReplication") private Optional<Boolean> enableRemoteReplication;
    @SerializedName("snapMirrorLabel") private Optional<String> snapMirrorLabel;
    // empty constructor
    @Since("7.0")
    public ModifyGroupSnapshotRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyGroupSnapshotRequest(
        Long groupSnapshotID,
        Optional<String> expirationTime,
        Optional<Boolean> enableRemoteReplication
    )
    {
        this.groupSnapshotID = groupSnapshotID;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
    }
    // parameterized constructor
    @Since("10.0")
    public ModifyGroupSnapshotRequest(
        Long groupSnapshotID,
        Optional<String> expirationTime,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> snapMirrorLabel
    )
    {
        this.groupSnapshotID = groupSnapshotID;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : snapMirrorLabel;
    }

    /** 
     * Specifies the ID of the group of snapshots.
     **/
    public Long getGroupSnapshotID() { return this.groupSnapshotID; }
   
    public void setGroupSnapshotID(Long groupSnapshotID) { 
        this.groupSnapshotID = groupSnapshotID;
    }
    /** 
     * Sets the time when the snapshot should be
     * removed. If unspecified, the current time is used.
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

        ModifyGroupSnapshotRequest that = (ModifyGroupSnapshotRequest) o;

        return 
            Objects.equals(groupSnapshotID, that.groupSnapshotID) && 
            Objects.equals(expirationTime, that.expirationTime) && 
            Objects.equals(enableRemoteReplication, that.enableRemoteReplication) && 
            Objects.equals(snapMirrorLabel, that.snapMirrorLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash( groupSnapshotID,expirationTime,enableRemoteReplication,snapMirrorLabel );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("groupSnapshotID", groupSnapshotID);
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

        sb.append(" groupSnapshotID : ").append(gson.toJson(groupSnapshotID)).append(",");
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
        private Long groupSnapshotID;
        private Optional<String> expirationTime;
        private Optional<Boolean> enableRemoteReplication;
        private Optional<String> snapMirrorLabel;

        private Builder() { }

        public ModifyGroupSnapshotRequest build() {
            return new ModifyGroupSnapshotRequest (
                         this.groupSnapshotID,
                         this.expirationTime,
                         this.enableRemoteReplication,
                         this.snapMirrorLabel);
        }

        private ModifyGroupSnapshotRequest.Builder buildFrom(final ModifyGroupSnapshotRequest req) {
            this.groupSnapshotID = req.groupSnapshotID;
            this.expirationTime = req.expirationTime;
            this.enableRemoteReplication = req.enableRemoteReplication;
            this.snapMirrorLabel = req.snapMirrorLabel;

            return this;
        }

        public ModifyGroupSnapshotRequest.Builder groupSnapshotID(final Long groupSnapshotID) {
            this.groupSnapshotID = groupSnapshotID;
            return this;
        }

        public ModifyGroupSnapshotRequest.Builder optionalExpirationTime(final String expirationTime) {
            this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : Optional.of(expirationTime);
            return this;
        }

        public ModifyGroupSnapshotRequest.Builder optionalEnableRemoteReplication(final Boolean enableRemoteReplication) {
            this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : Optional.of(enableRemoteReplication);
            return this;
        }

        public ModifyGroupSnapshotRequest.Builder optionalSnapMirrorLabel(final String snapMirrorLabel) {
            this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : Optional.of(snapMirrorLabel);
            return this;
        }

    }
}
