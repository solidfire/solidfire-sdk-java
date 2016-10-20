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
 * The object returned by the "GetStorageContainerEfficiency" API Service call.
 **/
public class GetStorageContainerEfficiencyResult  implements Serializable  {

    private static final long serialVersionUID = 2061817778L;

    @SerializedName("compression") private Double compression;
    @SerializedName("deduplication") private Double deduplication;
    @SerializedName("missingVolumes") private Long[] missingVolumes;
    @SerializedName("thinProvisioning") private Double thinProvisioning;
    @SerializedName("timestamp") private String timestamp;

    /**
     * The object returned by the "GetStorageContainerEfficiency" API Service call.
     * @param compression [required] 
     * @param deduplication [required] 
     * @param missingVolumes [required] The volumes that could not be queried for efficiency data. Missing volumes can be caused by the Garbage Collection (GC) cycle being less than an hour old, temporary loss of network connectivity, or restarted services since the GC cycle.
     * @param thinProvisioning [required] 
     * @param timestamp [required] The last time efficiency data was collected after Garbage Collection (GC).
     * @since 7.0
     **/
    @Since("7.0")
    public GetStorageContainerEfficiencyResult(Double compression, Double deduplication, Long[] missingVolumes, Double thinProvisioning, String timestamp) {
        this.timestamp = timestamp;
        this.compression = compression;
        this.thinProvisioning = thinProvisioning;
        this.missingVolumes = missingVolumes;
        this.deduplication = deduplication;
    }

    
    /**
     * The object returned by the "GetStorageContainerEfficiency" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public GetStorageContainerEfficiencyResult() {}

    public Double getCompression() {
        return this.compression;
    }

    public void setCompression(Double compression) {
        this.compression = compression;
    }
    public Double getDeduplication() {
        return this.deduplication;
    }

    public void setDeduplication(Double deduplication) {
        this.deduplication = deduplication;
    }

    /**
     * The volumes that could not be queried for efficiency data. Missing volumes can be caused by the Garbage Collection (GC) cycle being less than an hour old, temporary loss of network connectivity, or restarted services since the GC cycle.
     **/
    public Long[] getMissingVolumes() {
        return this.missingVolumes;
    }

    public void setMissingVolumes(Long[] missingVolumes) {
        this.missingVolumes = missingVolumes;
    }
    public Double getThinProvisioning() {
        return this.thinProvisioning;
    }

    public void setThinProvisioning(Double thinProvisioning) {
        this.thinProvisioning = thinProvisioning;
    }

    /**
     * The last time efficiency data was collected after Garbage Collection (GC).
     **/
    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetStorageContainerEfficiencyResult that = (GetStorageContainerEfficiencyResult) o;
        

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

    public static Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Double compression;
        private Double deduplication;
        private Long[] missingVolumes;
        private Double thinProvisioning;
        private String timestamp;

        private Builder() { }

        public GetStorageContainerEfficiencyResult build() {
            return new GetStorageContainerEfficiencyResult (
                         this.compression,
                         this.deduplication,
                         this.missingVolumes,
                         this.thinProvisioning,
                         this.timestamp            );
        }

        private GetStorageContainerEfficiencyResult.Builder buildFrom(final GetStorageContainerEfficiencyResult req) {
            this.compression = req.compression;
            this.deduplication = req.deduplication;
            this.missingVolumes = req.missingVolumes;
            this.thinProvisioning = req.thinProvisioning;
            this.timestamp = req.timestamp;

            return this;
        }

        public GetStorageContainerEfficiencyResult.Builder compression(final Double compression) {
            this.compression = compression;
            return this;
        }

        public GetStorageContainerEfficiencyResult.Builder deduplication(final Double deduplication) {
            this.deduplication = deduplication;
            return this;
        }

        public GetStorageContainerEfficiencyResult.Builder missingVolumes(final Long[] missingVolumes) {
            this.missingVolumes = missingVolumes;
            return this;
        }

        public GetStorageContainerEfficiencyResult.Builder thinProvisioning(final Double thinProvisioning) {
            this.thinProvisioning = thinProvisioning;
            return this;
        }

        public GetStorageContainerEfficiencyResult.Builder timestamp(final String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

    }

}
