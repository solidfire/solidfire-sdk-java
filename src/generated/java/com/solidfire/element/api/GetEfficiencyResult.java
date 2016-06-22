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

import com.google.gson.annotations.SerializedName;
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
 * The object returned by the "GetEfficiency" API Service call.
 **/
public class GetEfficiencyResult implements Serializable {

    private static final long serialVersionUID = 1980851376L;

    @SerializedName("compression") private final double compression;
    @SerializedName("deduplication") private final double deduplication;
    @SerializedName("thinProvisioning") private final double thinProvisioning;
    @SerializedName("timestamp") private final String timestamp;
    @SerializedName("missingVolumes") private final long[] missingVolumes;

    /**
     * The object returned by the "GetEfficiency" API Service call.
     * @param compression [required] The amount of space being saved by compressing data on a single volume. Stated as a ratio where "1" means data has been stored without being compressed.
     * @param deduplication [required] The amount of space being saved on a single volume by not duplicating data. Stated as a ratio.
     * @param thinProvisioning [required] The ratio of space used to the amount of space allocated for storing data. Stated as a ratio.
     * @param timestamp [required] The last time efficiency data was collected after Garbage Collection (GC). ISO 8601 data string.
     * @param missingVolumes [required] The volumes that could not be queried for efficiency data. Missing volumes can be caused by GC being less than hour old, temporary network loss or restarted services since the GC cycle.
     * @since 7.0
     **/
    @Since("7.0")
    public GetEfficiencyResult(double compression, double deduplication, double thinProvisioning, String timestamp, long[] missingVolumes) {
        this.timestamp = timestamp;
        this.compression = compression;
        this.thinProvisioning = thinProvisioning;
        this.missingVolumes = missingVolumes;
        this.deduplication = deduplication;
    }


    /**
     * The amount of space being saved by compressing data on a single volume. Stated as a ratio where "1" means data has been stored without being compressed.
     **/
    public double getCompression() {
        return this.compression;
    }

    /**
     * The amount of space being saved on a single volume by not duplicating data. Stated as a ratio.
     **/
    public double getDeduplication() {
        return this.deduplication;
    }

    /**
     * The ratio of space used to the amount of space allocated for storing data. Stated as a ratio.
     **/
    public double getThinProvisioning() {
        return this.thinProvisioning;
    }

    /**
     * The last time efficiency data was collected after Garbage Collection (GC). ISO 8601 data string.
     **/
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * The volumes that could not be queried for efficiency data. Missing volumes can be caused by GC being less than hour old, temporary network loss or restarted services since the GC cycle.
     **/
    public long[] getMissingVolumes() {
        return this.missingVolumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetEfficiencyResult that = (GetEfficiencyResult) o;
        

        return Objects.equals( compression , that.compression )
            && Objects.equals( deduplication , that.deduplication )
            && Objects.equals( thinProvisioning , that.thinProvisioning )
            && Objects.equals( timestamp , that.timestamp )
            && Objects.deepEquals( missingVolumes , that.missingVolumes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( compression, deduplication, thinProvisioning, timestamp, missingVolumes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" compression : ").append(compression).append(",");
        sb.append(" deduplication : ").append(deduplication).append(",");
        sb.append(" thinProvisioning : ").append(thinProvisioning).append(",");
        sb.append(" timestamp : ").append(timestamp).append(",");
        sb.append(" missingVolumes : ").append(Arrays.toString(missingVolumes));
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
