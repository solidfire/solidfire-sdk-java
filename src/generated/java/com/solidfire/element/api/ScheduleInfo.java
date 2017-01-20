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
 * ScheduleInfo  
 **/

public class ScheduleInfo implements Serializable {

    public static final long serialVersionUID = -3719894399081183340L;
    @SerializedName("volumeIDs") private Optional<Long[]> volumeIDs;
    @SerializedName("snapshotName") private Optional<String> snapshotName;
    @SerializedName("enableRemoteReplication") private Optional<Boolean> enableRemoteReplication;
    @SerializedName("retention") private Optional<String> retention;

    // empty constructor
    @Since("7.0")
    public ScheduleInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public ScheduleInfo(
        Optional<Long[]> volumeIDs,
        Optional<String> snapshotName,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> retention
    )
    {
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
        this.snapshotName = (snapshotName == null) ? Optional.<String>empty() : snapshotName;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
    }

    /** 
     * A list of volume IDs to be included in the group snapshot.
     **/
    public Optional<Long[]> getVolumeIDs() { return this.volumeIDs; }
    public void setVolumeIDs(Optional<Long[]> volumeIDs) { 
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
    }
    /** 
     * The snapshot name to be used. 
     **/
    public Optional<String> getSnapshotName() { return this.snapshotName; }
    public void setSnapshotName(Optional<String> snapshotName) { 
        this.snapshotName = (snapshotName == null) ? Optional.<String>empty() : snapshotName;
    }
    /** 
     * Indicates if the snapshot should be included in remote replication.
     **/
    public Optional<Boolean> getEnableRemoteReplication() { return this.enableRemoteReplication; }
    public void setEnableRemoteReplication(Optional<Boolean> enableRemoteReplication) { 
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
    }
    /** 
     * The amount of time the snapshot will be retained in HH:mm:ss.
     **/
    public Optional<String> getRetention() { return this.retention; }
    public void setRetention(Optional<String> retention) { 
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleInfo that = (ScheduleInfo) o;

        return 
            Objects.equals(volumeIDs, that.volumeIDs) && 
            Objects.equals(snapshotName, that.snapshotName) && 
            Objects.equals(enableRemoteReplication, that.enableRemoteReplication) && 
            Objects.equals(retention, that.retention);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeIDs,snapshotName,enableRemoteReplication,retention );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeIDs", volumeIDs);
        map.put("snapshotName", snapshotName);
        map.put("enableRemoteReplication", enableRemoteReplication);
        map.put("retention", retention);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != volumeIDs && volumeIDs.isPresent()){
            sb.append(" volumeIDs : ").append(volumeIDs).append(",");
        }
        if(null != snapshotName && snapshotName.isPresent()){
            sb.append(" snapshotName : ").append(snapshotName).append(",");
        }
        if(null != enableRemoteReplication && enableRemoteReplication.isPresent()){
            sb.append(" enableRemoteReplication : ").append(enableRemoteReplication).append(",");
        }
        if(null != retention && retention.isPresent()){
            sb.append(" retention : ").append(retention).append(",");
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
        private Optional<Long[]> volumeIDs;
        private Optional<String> snapshotName;
        private Optional<Boolean> enableRemoteReplication;
        private Optional<String> retention;

        private Builder() { }

        public ScheduleInfo build() {
            return new ScheduleInfo (
                         this.volumeIDs,
                         this.snapshotName,
                         this.enableRemoteReplication,
                         this.retention);
        }

        private ScheduleInfo.Builder buildFrom(final ScheduleInfo req) {
            this.volumeIDs = req.volumeIDs;
            this.snapshotName = req.snapshotName;
            this.enableRemoteReplication = req.enableRemoteReplication;
            this.retention = req.retention;

            return this;
        }

        public ScheduleInfo.Builder optionalVolumeIDs(final Long[] volumeIDs) {
            this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : Optional.of(volumeIDs);
            return this;
        }

        public ScheduleInfo.Builder optionalSnapshotName(final String snapshotName) {
            this.snapshotName = (snapshotName == null) ? Optional.<String>empty() : Optional.of(snapshotName);
            return this;
        }

        public ScheduleInfo.Builder optionalEnableRemoteReplication(final Boolean enableRemoteReplication) {
            this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : Optional.of(enableRemoteReplication);
            return this;
        }

        public ScheduleInfo.Builder optionalRetention(final String retention) {
            this.retention = (retention == null) ? Optional.<String>empty() : Optional.of(retention);
            return this;
        }

    }
}
