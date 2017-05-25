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
 * ModifyVolumePairRequest  
 * ModifyVolumePair enables you to pause or restart replication between a pair of volumes.
 **/

public class ModifyVolumePairRequest implements Serializable {

    public static final long serialVersionUID = 5515348424178660277L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("pausedManual") private Optional<Boolean> pausedManual;
    @SerializedName("mode") private Optional<String> mode;
    @SerializedName("pauseLimit") private Optional<Long> pauseLimit;
    // empty constructor
    @Since("7.0")
    public ModifyVolumePairRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyVolumePairRequest(
        Long volumeID,
        Optional<Boolean> pausedManual,
        Optional<String> mode,
        Optional<Long> pauseLimit
    )
    {
        this.volumeID = volumeID;
        this.pausedManual = (pausedManual == null) ? Optional.<Boolean>empty() : pausedManual;
        this.mode = (mode == null) ? Optional.<String>empty() : mode;
        this.pauseLimit = (pauseLimit == null) ? Optional.<Long>empty() : pauseLimit;
    }

    /** 
     * The ID of the volume to be modified.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * Specifies whether to pause or restart volume replication process. Valid values are: 
     * true: Pauses volume replication
     * false: Restarts volume replication
     **/
    public Optional<Boolean> getPausedManual() { return this.pausedManual; }
    public void setPausedManual(Optional<Boolean> pausedManual) { 
        this.pausedManual = (pausedManual == null) ? Optional.<Boolean>empty() : pausedManual;
    }
    /** 
     * Specifies the volume replication mode. Possible values are:
     * Async: Writes are acknowledged when they complete locally. The cluster does not wait for writes to be replicated to the target cluster.
     * Sync: The source acknowledges the write when the data is stored locally and on the remote cluster.
     * SnapshotsOnly: Only snapshots created on the source cluster are replicated. Active writes from the source volume are not replicated.
     **/
    public Optional<String> getMode() { return this.mode; }
    public void setMode(Optional<String> mode) { 
        this.mode = (mode == null) ? Optional.<String>empty() : mode;
    }
    /** 
     * Internal use only.
     **/
    public Optional<Long> getPauseLimit() { return this.pauseLimit; }
    public void setPauseLimit(Optional<Long> pauseLimit) { 
        this.pauseLimit = (pauseLimit == null) ? Optional.<Long>empty() : pauseLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVolumePairRequest that = (ModifyVolumePairRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(pausedManual, that.pausedManual) && 
            Objects.equals(mode, that.mode) && 
            Objects.equals(pauseLimit, that.pauseLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,pausedManual,mode,pauseLimit );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("pausedManual", pausedManual);
        map.put("mode", mode);
        map.put("pauseLimit", pauseLimit);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        if(null != pausedManual && pausedManual.isPresent()){
            sb.append(" pausedManual : ").append(pausedManual).append(",");
        }
        if(null != mode && mode.isPresent()){
            sb.append(" mode : ").append(mode).append(",");
        }
        if(null != pauseLimit && pauseLimit.isPresent()){
            sb.append(" pauseLimit : ").append(pauseLimit).append(",");
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
        private Optional<Boolean> pausedManual;
        private Optional<String> mode;
        private Optional<Long> pauseLimit;

        private Builder() { }

        public ModifyVolumePairRequest build() {
            return new ModifyVolumePairRequest (
                         this.volumeID,
                         this.pausedManual,
                         this.mode,
                         this.pauseLimit);
        }

        private ModifyVolumePairRequest.Builder buildFrom(final ModifyVolumePairRequest req) {
            this.volumeID = req.volumeID;
            this.pausedManual = req.pausedManual;
            this.mode = req.mode;
            this.pauseLimit = req.pauseLimit;

            return this;
        }

        public ModifyVolumePairRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public ModifyVolumePairRequest.Builder optionalPausedManual(final Boolean pausedManual) {
            this.pausedManual = (pausedManual == null) ? Optional.<Boolean>empty() : Optional.of(pausedManual);
            return this;
        }

        public ModifyVolumePairRequest.Builder optionalMode(final String mode) {
            this.mode = (mode == null) ? Optional.<String>empty() : Optional.of(mode);
            return this;
        }

        public ModifyVolumePairRequest.Builder optionalPauseLimit(final Long pauseLimit) {
            this.pauseLimit = (pauseLimit == null) ? Optional.<Long>empty() : Optional.of(pauseLimit);
            return this;
        }

    }
}
