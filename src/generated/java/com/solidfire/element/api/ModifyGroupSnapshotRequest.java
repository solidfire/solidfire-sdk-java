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
 * ModifyGroupSnapshotRequest  
 **/

public class ModifyGroupSnapshotRequest implements Serializable {

    public static final long serialVersionUID = -3820766952241604504L;
    @SerializedName("groupSnapshotID") private GroupSnapshotID groupSnapshotID;
    @SerializedName("expirationTime") private Optional<String> expirationTime;
    @SerializedName("enableRemoteReplication") private Optional<Boolean> enableRemoteReplication;

    // empty constructor
    @Since("7.0")
    public ModifyGroupSnapshotRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyGroupSnapshotRequest(
        GroupSnapshotID groupSnapshotID,
        Optional<String> expirationTime,
        Optional<Boolean> enableRemoteReplication
    )
    {
        this.groupSnapshotID = groupSnapshotID;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
    }

    /** 
     * ID of the snapshot.
     **/
    public GroupSnapshotID getGroupSnapshotID() { return this.groupSnapshotID; }
    public void setGroupSnapshotID(GroupSnapshotID groupSnapshotID) { 
        this.groupSnapshotID = groupSnapshotID;
    }
    /** 
     * Use to set the time when the snapshot should be removed.
     **/
    public Optional<String> getExpirationTime() { return this.expirationTime; }
    public void setExpirationTime(Optional<String> expirationTime) { 
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
    }
    /** 
     * Use to enable the snapshot created to be replicated to a remote SolidFire cluster.
     * Possible values:
     * <br/><b>true</b>: the snapshot will be replicated to remote storage.
     * <br/><b>false</b>: Default. No replication.
     **/
    public Optional<Boolean> getEnableRemoteReplication() { return this.enableRemoteReplication; }
    public void setEnableRemoteReplication(Optional<Boolean> enableRemoteReplication) { 
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyGroupSnapshotRequest that = (ModifyGroupSnapshotRequest) o;

        return 
            Objects.equals(groupSnapshotID, that.groupSnapshotID) && 
            Objects.equals(expirationTime, that.expirationTime) && 
            Objects.equals(enableRemoteReplication, that.enableRemoteReplication);
    }

    @Override
    public int hashCode() {
        return Objects.hash( groupSnapshotID,expirationTime,enableRemoteReplication );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("groupSnapshotID", groupSnapshotID);
        map.put("expirationTime", expirationTime);
        map.put("enableRemoteReplication", enableRemoteReplication);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" groupSnapshotID : ").append(groupSnapshotID).append(",");
        if(null != expirationTime && expirationTime.isPresent()){
            sb.append(" expirationTime : ").append(expirationTime).append(",");
        }
        if(null != enableRemoteReplication && enableRemoteReplication.isPresent()){
            sb.append(" enableRemoteReplication : ").append(enableRemoteReplication).append(",");
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
        private GroupSnapshotID groupSnapshotID;
        private Optional<String> expirationTime;
        private Optional<Boolean> enableRemoteReplication;

        private Builder() { }

        public ModifyGroupSnapshotRequest build() {
            return new ModifyGroupSnapshotRequest (
                         this.groupSnapshotID,
                         this.expirationTime,
                         this.enableRemoteReplication);
        }

        private ModifyGroupSnapshotRequest.Builder buildFrom(final ModifyGroupSnapshotRequest req) {
            this.groupSnapshotID = req.groupSnapshotID;
            this.expirationTime = req.expirationTime;
            this.enableRemoteReplication = req.enableRemoteReplication;

            return this;
        }

        public ModifyGroupSnapshotRequest.Builder groupSnapshotID(final GroupSnapshotID groupSnapshotID) {
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

    }
}
