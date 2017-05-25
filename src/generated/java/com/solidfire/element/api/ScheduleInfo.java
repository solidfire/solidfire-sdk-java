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

import com.solidfire.core.client.Attributes;
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

    public static final long serialVersionUID = -6717421927575865365L;
    @SerializedName("enableRemoteReplication") private Optional<Boolean> enableRemoteReplication;
    @SerializedName("retention") private Optional<String> retention;
    @SerializedName("snapshotName") private Optional<String> snapshotName;
    @SerializedName("volumeIDs") private Optional<Long[]> volumeIDs;
    // empty constructor
    @Since("7.0")
    public ScheduleInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public ScheduleInfo(
        Optional<Boolean> enableRemoteReplication,
        Optional<String> retention,
        Optional<String> snapshotName,
        Optional<Long[]> volumeIDs
    )
    {
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
        this.snapshotName = (snapshotName == null) ? Optional.<String>empty() : snapshotName;
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
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
    /** 
     * The snapshot name to be used. 
     **/
    public Optional<String> getSnapshotName() { return this.snapshotName; }
    public void setSnapshotName(Optional<String> snapshotName) { 
        this.snapshotName = (snapshotName == null) ? Optional.<String>empty() : snapshotName;
    }
    /** 
     * A list of volume IDs to be included in the group snapshot.
     **/
    public Optional<Long[]> getVolumeIDs() { return this.volumeIDs; }
    public void setVolumeIDs(Optional<Long[]> volumeIDs) { 
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleInfo that = (ScheduleInfo) o;

        return 
            Objects.equals(enableRemoteReplication, that.enableRemoteReplication) && 
            Objects.equals(retention, that.retention) && 
            Objects.equals(snapshotName, that.snapshotName) && 
            Objects.equals(volumeIDs, that.volumeIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( enableRemoteReplication,retention,snapshotName,volumeIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("enableRemoteReplication", enableRemoteReplication);
        map.put("retention", retention);
        map.put("snapshotName", snapshotName);
        map.put("volumeIDs", volumeIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != enableRemoteReplication && enableRemoteReplication.isPresent()){
            sb.append(" enableRemoteReplication : ").append(enableRemoteReplication).append(",");
        }
        if(null != retention && retention.isPresent()){
            sb.append(" retention : ").append(retention).append(",");
        }
        if(null != snapshotName && snapshotName.isPresent()){
            sb.append(" snapshotName : ").append(snapshotName).append(",");
        }
        if(null != volumeIDs && volumeIDs.isPresent()){
            sb.append(" volumeIDs : ").append(volumeIDs).append(",");
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
        private Optional<Boolean> enableRemoteReplication;
        private Optional<String> retention;
        private Optional<String> snapshotName;
        private Optional<Long[]> volumeIDs;

        private Builder() { }

        public ScheduleInfo build() {
            return new ScheduleInfo (
                         this.enableRemoteReplication,
                         this.retention,
                         this.snapshotName,
                         this.volumeIDs);
        }

        private ScheduleInfo.Builder buildFrom(final ScheduleInfo req) {
            this.enableRemoteReplication = req.enableRemoteReplication;
            this.retention = req.retention;
            this.snapshotName = req.snapshotName;
            this.volumeIDs = req.volumeIDs;

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

        public ScheduleInfo.Builder optionalSnapshotName(final String snapshotName) {
            this.snapshotName = (snapshotName == null) ? Optional.<String>empty() : Optional.of(snapshotName);
            return this;
        }

        public ScheduleInfo.Builder optionalVolumeIDs(final Long[] volumeIDs) {
            this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : Optional.of(volumeIDs);
            return this;
        }

    }
}
