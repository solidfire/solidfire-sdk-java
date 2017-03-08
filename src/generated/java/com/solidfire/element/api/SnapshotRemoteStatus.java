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
 * SnapshotRemoteStatus  
 **/

public class SnapshotRemoteStatus implements Serializable {

    public static final long serialVersionUID = 6049293383257307136L;
    @SerializedName("remoteStatus") private String remoteStatus;
    @SerializedName("volumePairUUID") private java.util.UUID volumePairUUID;

    // empty constructor
    @Since("7.0")
    public SnapshotRemoteStatus() {}

    
    // parameterized constructor
    @Since("7.0")
    public SnapshotRemoteStatus(
        String remoteStatus,
        java.util.UUID volumePairUUID
    )
    {
        this.remoteStatus = remoteStatus;
        this.volumePairUUID = volumePairUUID;
    }

    /** 
     * 
     **/
    public String getRemoteStatus() { return this.remoteStatus; }
    public void setRemoteStatus(String remoteStatus) { 
        this.remoteStatus = remoteStatus;
    }
    /** 
     * The snapshot is done and is writable (the active branch of the slice).
     **/
    public java.util.UUID getVolumePairUUID() { return this.volumePairUUID; }
    public void setVolumePairUUID(java.util.UUID volumePairUUID) { 
        this.volumePairUUID = volumePairUUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapshotRemoteStatus that = (SnapshotRemoteStatus) o;

        return 
            Objects.equals(remoteStatus, that.remoteStatus) && 
            Objects.equals(volumePairUUID, that.volumePairUUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( remoteStatus,volumePairUUID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("remoteStatus", remoteStatus);
        map.put("volumePairUUID", volumePairUUID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" remoteStatus : ").append(remoteStatus).append(",");
        sb.append(" volumePairUUID : ").append(volumePairUUID).append(",");
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
        private String remoteStatus;
        private java.util.UUID volumePairUUID;

        private Builder() { }

        public SnapshotRemoteStatus build() {
            return new SnapshotRemoteStatus (
                         this.remoteStatus,
                         this.volumePairUUID);
        }

        private SnapshotRemoteStatus.Builder buildFrom(final SnapshotRemoteStatus req) {
            this.remoteStatus = req.remoteStatus;
            this.volumePairUUID = req.volumePairUUID;

            return this;
        }

        public SnapshotRemoteStatus.Builder remoteStatus(final String remoteStatus) {
            this.remoteStatus = remoteStatus;
            return this;
        }

        public SnapshotRemoteStatus.Builder volumePairUUID(final java.util.UUID volumePairUUID) {
            this.volumePairUUID = volumePairUUID;
            return this;
        }

    }
}
