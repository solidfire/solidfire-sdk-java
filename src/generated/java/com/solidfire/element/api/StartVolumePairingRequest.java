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

public class StartVolumePairingRequest implements Serializable {

    public static final long serialVersionUID = 5766800825199078076L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("mode") private Optional<String> mode;

    // empty constructor
    @Since("7.0")
    public StartVolumePairingRequest() {}

    // parameterized constructor
    @Since("7.0")
    public StartVolumePairingRequest(
        Long volumeID,
        Optional<String> mode
    )
    {
        this.volumeID = volumeID;
        this.mode = (mode == null) ? Optional.<String>empty() : mode;
    }

    /** 
     * The ID of the volume on which to start the pairing process.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * The mode of the volume on which to start the pairing process. The mode can only be set if the volume is the source volume.<br/>
     * Possible values:<br/>
     * <b>Async</b>: (default if no mode parameter specified) Writes are acknowledged when they complete locally. The cluster does not wait for writes to be replicated to the target cluster.<br/>
     * <b>Sync</b>: Source acknowledges write when the data is stored locally and on the remote cluster.<br/>
     * <b>SnapshotsOnly</b>: Only snapshots created on the source cluster will be replicated. Active writes from the source volume will not be replicated.<br/>
     **/
    public Optional<String> getMode() { return this.mode; }
    public void setMode(Optional<String> mode) { 
        this.mode = (mode == null) ? Optional.<String>empty() : mode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StartVolumePairingRequest that = (StartVolumePairingRequest) o;
        return 
            Objects.equals(volumeID, that.volumeID) &&
            Objects.equals(mode.orElse(null), that.mode.orElse(null));
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, mode );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("mode", mode);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        if(null != mode && mode.isPresent()){
            sb.append(" mode : ").append(mode.orElse(null)).append(",");
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
        private Optional<String> mode;

        private Builder() { }

        public StartVolumePairingRequest build() {
            return new StartVolumePairingRequest (
                         this.volumeID,
                         this.mode);
        }

        private StartVolumePairingRequest.Builder buildFrom(final StartVolumePairingRequest req) {
            this.volumeID = req.volumeID;
            this.mode = req.mode;

            return this;
        }

        public StartVolumePairingRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public StartVolumePairingRequest.Builder optionalMode(final String mode) {
            this.mode = (mode == null) ? Optional.<String>empty() : Optional.of(mode);
            return this;
        }

    }
}
