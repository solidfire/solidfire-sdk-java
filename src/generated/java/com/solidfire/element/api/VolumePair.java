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

import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * The Volume Pair Info is an object containing information about a volume that is paired on a remote cluster.
 **/
public class VolumePair implements Serializable {

    private static final long serialVersionUID = 23799657L;

    private final Long clusterPairID;
    private final Long remoteVolumeID;
    private final Long remoteSliceID;
    private final String remoteVolumeName;
    private final String volumePairUUID;
    private final RemoteReplication remoteReplication;

    /**
     * The Volume Pair Info is an object containing information about a volume that is paired on a remote cluster.
     * If the volume is not paired, this object is null.
     * @param clusterPairID [required] The remote cluster a volume is paired with.
     * @param remoteVolumeID [required] The VolumeID on the remote cluster a volume is paired with.
     * @param remoteSliceID [required] The SliceID on the remote cluster a volume is paired with.
     * @param remoteVolumeName [required] The last-observed name of the volume on the remote cluster a volume is paired with.
     * @param volumePairUUID [required] A UUID in canonical form.
     * @param remoteReplication [required] Details about the replication configuration for this volume pair.
     * @since 7.0
     **/
    @Since("7.0")
    public VolumePair(Long clusterPairID, Long remoteVolumeID, Long remoteSliceID, String remoteVolumeName, String volumePairUUID, RemoteReplication remoteReplication) {
        this.clusterPairID = clusterPairID;
        this.remoteVolumeName = remoteVolumeName;
        this.remoteVolumeID = remoteVolumeID;
        this.remoteSliceID = remoteSliceID;
        this.remoteReplication = remoteReplication;
        this.volumePairUUID = volumePairUUID;
    }


    /**
     * The remote cluster a volume is paired with.
     **/
    public Long getClusterPairID() {
        return this.clusterPairID;
    }

    /**
     * The VolumeID on the remote cluster a volume is paired with.
     **/
    public Long getRemoteVolumeID() {
        return this.remoteVolumeID;
    }

    /**
     * The SliceID on the remote cluster a volume is paired with.
     **/
    public Long getRemoteSliceID() {
        return this.remoteSliceID;
    }

    /**
     * The last-observed name of the volume on the remote cluster a volume is paired with.
     **/
    public String getRemoteVolumeName() {
        return this.remoteVolumeName;
    }

    /**
     * A UUID in canonical form.
     **/
    public String getVolumePairUUID() {
        return this.volumePairUUID;
    }

    /**
     * Details about the replication configuration for this volume pair.
     **/
    public RemoteReplication getRemoteReplication() {
        return this.remoteReplication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumePair that = (VolumePair) o;
        

        return Objects.equals( clusterPairID , that.clusterPairID )
            && Objects.equals( remoteVolumeID , that.remoteVolumeID )
            && Objects.equals( remoteSliceID , that.remoteSliceID )
            && Objects.equals( remoteVolumeName , that.remoteVolumeName )
            && Objects.equals( volumePairUUID , that.volumePairUUID )
            && Objects.equals( remoteReplication , that.remoteReplication );
    }

    @Override
    public int hashCode() {

        return Objects.hash( clusterPairID, remoteVolumeID, remoteSliceID, remoteVolumeName, volumePairUUID, remoteReplication );
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
        sb.append(" remoteReplication : ").append(remoteReplication);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
