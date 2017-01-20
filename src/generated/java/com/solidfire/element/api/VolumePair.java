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
 * VolumePair  
 * The Volume Pair Info is an object containing information about a volume that is paired on a remote cluster.
 * If the volume is not paired, this object is null.
 **/

public class VolumePair implements Serializable {

    public static final long serialVersionUID = -8991720289145692243L;
    @SerializedName("clusterPairID") private Long clusterPairID;
    @SerializedName("remoteVolumeID") private Long remoteVolumeID;
    @SerializedName("remoteSliceID") private Long remoteSliceID;
    @SerializedName("remoteVolumeName") private String remoteVolumeName;
    @SerializedName("volumePairUUID") private java.util.UUID volumePairUUID;
    @SerializedName("remoteReplication") private RemoteReplication remoteReplication;

    // empty constructor
    @Since("7.0")
    public VolumePair() {}

    
    // parameterized constructor
    @Since("7.0")
    public VolumePair(
        Long clusterPairID,
        Long remoteVolumeID,
        Long remoteSliceID,
        String remoteVolumeName,
        java.util.UUID volumePairUUID,
        RemoteReplication remoteReplication
    )
    {
        this.clusterPairID = clusterPairID;
        this.remoteVolumeID = remoteVolumeID;
        this.remoteSliceID = remoteSliceID;
        this.remoteVolumeName = remoteVolumeName;
        this.volumePairUUID = volumePairUUID;
        this.remoteReplication = remoteReplication;
    }

    /** 
     * The remote cluster a volume is paired with.
     **/
    public Long getClusterPairID() { return this.clusterPairID; }
    public void setClusterPairID(Long clusterPairID) { 
        this.clusterPairID = clusterPairID;
    }
    /** 
     * The VolumeID on the remote cluster a volume is paired with.
     **/
    public Long getRemoteVolumeID() { return this.remoteVolumeID; }
    public void setRemoteVolumeID(Long remoteVolumeID) { 
        this.remoteVolumeID = remoteVolumeID;
    }
    /** 
     * The SliceID on the remote cluster a volume is paired with.
     **/
    public Long getRemoteSliceID() { return this.remoteSliceID; }
    public void setRemoteSliceID(Long remoteSliceID) { 
        this.remoteSliceID = remoteSliceID;
    }
    /** 
     * The last-observed name of the volume on the remote cluster a volume is paired with.
     **/
    public String getRemoteVolumeName() { return this.remoteVolumeName; }
    public void setRemoteVolumeName(String remoteVolumeName) { 
        this.remoteVolumeName = remoteVolumeName;
    }
    /** 
     * A UUID in canonical form.
     **/
    public java.util.UUID getVolumePairUUID() { return this.volumePairUUID; }
    public void setVolumePairUUID(java.util.UUID volumePairUUID) { 
        this.volumePairUUID = volumePairUUID;
    }
    /** 
     * Details about the replication configuration for this volume pair.
     **/
    public RemoteReplication getRemoteReplication() { return this.remoteReplication; }
    public void setRemoteReplication(RemoteReplication remoteReplication) { 
        this.remoteReplication = remoteReplication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumePair that = (VolumePair) o;

        return 
            Objects.equals(clusterPairID, that.clusterPairID) && 
            Objects.equals(remoteVolumeID, that.remoteVolumeID) && 
            Objects.equals(remoteSliceID, that.remoteSliceID) && 
            Objects.equals(remoteVolumeName, that.remoteVolumeName) && 
            Objects.equals(volumePairUUID, that.volumePairUUID) && 
            Objects.equals(remoteReplication, that.remoteReplication);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterPairID,remoteVolumeID,remoteSliceID,remoteVolumeName,volumePairUUID,remoteReplication );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterPairID", clusterPairID);
        map.put("remoteVolumeID", remoteVolumeID);
        map.put("remoteSliceID", remoteSliceID);
        map.put("remoteVolumeName", remoteVolumeName);
        map.put("volumePairUUID", volumePairUUID);
        map.put("remoteReplication", remoteReplication);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterPairID : ").append(clusterPairID).append(",");
        sb.append(" remoteVolumeID : ").append(remoteVolumeID).append(",");
        sb.append(" remoteSliceID : ").append(remoteSliceID).append(",");
        sb.append(" remoteVolumeName : ").append(remoteVolumeName).append(",");
        sb.append(" volumePairUUID : ").append(volumePairUUID).append(",");
        sb.append(" remoteReplication : ").append(remoteReplication).append(",");
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
        private Long clusterPairID;
        private Long remoteVolumeID;
        private Long remoteSliceID;
        private String remoteVolumeName;
        private java.util.UUID volumePairUUID;
        private RemoteReplication remoteReplication;

        private Builder() { }

        public VolumePair build() {
            return new VolumePair (
                         this.clusterPairID,
                         this.remoteVolumeID,
                         this.remoteSliceID,
                         this.remoteVolumeName,
                         this.volumePairUUID,
                         this.remoteReplication);
        }

        private VolumePair.Builder buildFrom(final VolumePair req) {
            this.clusterPairID = req.clusterPairID;
            this.remoteVolumeID = req.remoteVolumeID;
            this.remoteSliceID = req.remoteSliceID;
            this.remoteVolumeName = req.remoteVolumeName;
            this.volumePairUUID = req.volumePairUUID;
            this.remoteReplication = req.remoteReplication;

            return this;
        }

        public VolumePair.Builder clusterPairID(final Long clusterPairID) {
            this.clusterPairID = clusterPairID;
            return this;
        }

        public VolumePair.Builder remoteVolumeID(final Long remoteVolumeID) {
            this.remoteVolumeID = remoteVolumeID;
            return this;
        }

        public VolumePair.Builder remoteSliceID(final Long remoteSliceID) {
            this.remoteSliceID = remoteSliceID;
            return this;
        }

        public VolumePair.Builder remoteVolumeName(final String remoteVolumeName) {
            this.remoteVolumeName = remoteVolumeName;
            return this;
        }

        public VolumePair.Builder volumePairUUID(final java.util.UUID volumePairUUID) {
            this.volumePairUUID = volumePairUUID;
            return this;
        }

        public VolumePair.Builder remoteReplication(final RemoteReplication remoteReplication) {
            this.remoteReplication = remoteReplication;
            return this;
        }

    }
}
