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
 * The object returned by the "GetVolumeEfficiency" API Service call.
 **/
public class GetVolumeEfficiencyResult implements Serializable {

    private static final long serialVersionUID = -237066237L;

    private final Double compression;
    private final Double deduplication;
    private final Long[] missingVolumes;
    private final Double thinProvisioning;
    private final String timestamp;

    /**
     * The object returned by the "GetVolumeEfficiency" API Service call.
     * @param compression [required] The amount of space being saved by compressing data on a single volume.
     * @param deduplication [required] The amount of space being saved on a single volume by not duplicating data.
     * @param thinProvisioning [required] The ratio of space used to the amount of space allocated for storing data.
     * @param timestamp [required] The last time efficiency data was collected after Garbage Collection (GC).
     * @since 7.0
     **/
    @Since("7.0")
    public GetVolumeEfficiencyResult(Double compression, Double deduplication, Double thinProvisioning, String timestamp) {
        this.timestamp = timestamp;
        this.compression = compression;
        this.thinProvisioning = thinProvisioning;
        this.missingVolumes = null;
        this.deduplication = deduplication;
    }

    /**
     * The object returned by the "GetVolumeEfficiency" API Service call.
     * @param compression [required] The amount of space being saved by compressing data on a single volume.
     * @param deduplication [required] The amount of space being saved on a single volume by not duplicating data.
     * @param missingVolumes [required] The volumes that could not be queried for efficiency data.
     * @param thinProvisioning [required] The ratio of space used to the amount of space allocated for storing data.
     * @param timestamp [required] The last time efficiency data was collected after Garbage Collection (GC).
     * @since 8.0
     **/
    @Since("8.0")
    public GetVolumeEfficiencyResult(Double compression, Double deduplication, Long[] missingVolumes, Double thinProvisioning, String timestamp) {
        this.timestamp = timestamp;
        this.compression = compression;
        this.thinProvisioning = thinProvisioning;
        this.missingVolumes = missingVolumes;
        this.deduplication = deduplication;
    }


    /**
     * The amount of space being saved by compressing data on a single volume.
     * Stated as a ratio where &quot;1&quot; means data has been stored without being compressed.
     **/
    public Double getCompression() {
        return this.compression;
    }

    /**
     * The amount of space being saved on a single volume by not duplicating data.
     * Stated as a ratio.
     **/
    public Double getDeduplication() {
        return this.deduplication;
    }

    /**
     * The volumes that could not be queried for efficiency data.
     * Missing volumes can be caused by GC being less than hour old, temporary network loss or restarted services since the GC cycle.
     * @since 8.0 
     **/

    @Since("8.0")
    public Long[] getMissingVolumes() {
        return this.missingVolumes;
    }

    /**
     * The ratio of space used to the amount of space allocated for storing data.
     * Stated as a ratio.
     **/
    public Double getThinProvisioning() {
        return this.thinProvisioning;
    }

    /**
     * The last time efficiency data was collected after Garbage Collection (GC).
     **/
    public String getTimestamp() {
        return this.timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetVolumeEfficiencyResult that = (GetVolumeEfficiencyResult) o;
        

        return Objects.equals( compression , that.compression )
            && Objects.equals( deduplication , that.deduplication )
            && Objects.deepEquals( missingVolumes , that.missingVolumes )
            && Objects.equals( thinProvisioning , that.thinProvisioning )
            && Objects.equals( timestamp , that.timestamp );
    }

    @Override
    public int hashCode() {

        return Objects.hash( compression, deduplication, missingVolumes, thinProvisioning, timestamp );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" compression : ").append(compression).append(",");
        sb.append(" deduplication : ").append(deduplication).append(",");
        sb.append(" missingVolumes : ").append(Arrays.toString(missingVolumes)).append(",");
        sb.append(" thinProvisioning : ").append(thinProvisioning).append(",");
        sb.append(" timestamp : ").append(timestamp);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
