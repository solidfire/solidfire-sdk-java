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
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class GetEfficiencyResult implements Serializable {

    public static final long serialVersionUID = 1200500802556208719L;
    @SerializedName("compression") private Optional<Double> compression;
    @SerializedName("deduplication") private Optional<Double> deduplication;
    @SerializedName("thinProvisioning") private Optional<Double> thinProvisioning;
    @SerializedName("timestamp") private String timestamp;
    @SerializedName("missingVolumes") private Long[] missingVolumes;

    // empty constructor
    @Since("7.0")
    public GetEfficiencyResult() {}

    // parameterized constructor
    @Since("7.0")
    public GetEfficiencyResult(
        Optional<Double> compression,
        Optional<Double> deduplication,
        Optional<Double> thinProvisioning,
        String timestamp,
        Long[] missingVolumes
    )
    {
        this.compression = (compression == null) ? Optional.<Double>empty() : compression;
        this.deduplication = (deduplication == null) ? Optional.<Double>empty() : deduplication;
        this.thinProvisioning = (thinProvisioning == null) ? Optional.<Double>empty() : thinProvisioning;
        this.timestamp = timestamp;
        this.missingVolumes = missingVolumes;
    }

    /** 
     * The amount of space being saved by compressing data on a single volume. Stated as a ratio where "1" means data has been stored without being compressed.
     **/
    public Optional<Double> getCompression() { return this.compression; }
    public void setCompression(Optional<Double> compression) { 
        this.compression = (compression == null) ? Optional.<Double>empty() : compression;
    }
    /** 
     * The amount of space being saved on a single volume by not duplicating data. Stated as a ratio.
     **/
    public Optional<Double> getDeduplication() { return this.deduplication; }
    public void setDeduplication(Optional<Double> deduplication) { 
        this.deduplication = (deduplication == null) ? Optional.<Double>empty() : deduplication;
    }
    /** 
     * The ratio of space used to the amount of space allocated for storing data. Stated as a ratio.
     **/
    public Optional<Double> getThinProvisioning() { return this.thinProvisioning; }
    public void setThinProvisioning(Optional<Double> thinProvisioning) { 
        this.thinProvisioning = (thinProvisioning == null) ? Optional.<Double>empty() : thinProvisioning;
    }
    /** 
     * The last time efficiency data was collected after Garbage Collection (GC). ISO 8601 data string.
     **/
    public String getTimestamp() { return this.timestamp; }
    public void setTimestamp(String timestamp) { 
        this.timestamp = timestamp;
    }
    /** 
     * The volumes that could not be queried for efficiency data. Missing volumes can be caused by GC being less than hour old, temporary network loss or restarted services since the GC cycle.
     **/
    public Long[] getMissingVolumes() { return this.missingVolumes; }
    public void setMissingVolumes(Long[] missingVolumes) { 
        this.missingVolumes = missingVolumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetEfficiencyResult that = (GetEfficiencyResult) o;

        return 
            Objects.equals(compression, that.compression) &&
            Objects.equals(deduplication, that.deduplication) &&
            Objects.equals(thinProvisioning, that.thinProvisioning) &&
            Objects.equals(timestamp, that.timestamp) &&
            Arrays.equals(missingVolumes, that.missingVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( compression, deduplication, thinProvisioning, timestamp, (Object[])missingVolumes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("compression", compression);
        map.put("deduplication", deduplication);
        map.put("thinProvisioning", thinProvisioning);
        map.put("timestamp", timestamp);
        map.put("missingVolumes", missingVolumes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != compression && compression.isPresent()){
            sb.append(" compression : ").append(compression).append(",");
        }
        if(null != deduplication && deduplication.isPresent()){
            sb.append(" deduplication : ").append(deduplication).append(",");
        }
        if(null != thinProvisioning && thinProvisioning.isPresent()){
            sb.append(" thinProvisioning : ").append(thinProvisioning).append(",");
        }
        sb.append(" timestamp : ").append(timestamp).append(",");
        sb.append(" missingVolumes : ").append(Arrays.toString(missingVolumes)).append(",");
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
        private Optional<Double> compression;
        private Optional<Double> deduplication;
        private Optional<Double> thinProvisioning;
        private String timestamp;
        private Long[] missingVolumes;

        private Builder() { }

        public GetEfficiencyResult build() {
            return new GetEfficiencyResult (
                         this.compression,
                         this.deduplication,
                         this.thinProvisioning,
                         this.timestamp,
                         this.missingVolumes);
        }

        private GetEfficiencyResult.Builder buildFrom(final GetEfficiencyResult req) {
            this.compression = req.compression;
            this.deduplication = req.deduplication;
            this.thinProvisioning = req.thinProvisioning;
            this.timestamp = req.timestamp;
            this.missingVolumes = req.missingVolumes;

            return this;
        }

        public GetEfficiencyResult.Builder optionalCompression(final Double compression) {
            this.compression = (compression == null) ? Optional.<Double>empty() : Optional.of(compression);
            return this;
        }

        public GetEfficiencyResult.Builder optionalDeduplication(final Double deduplication) {
            this.deduplication = (deduplication == null) ? Optional.<Double>empty() : Optional.of(deduplication);
            return this;
        }

        public GetEfficiencyResult.Builder optionalThinProvisioning(final Double thinProvisioning) {
            this.thinProvisioning = (thinProvisioning == null) ? Optional.<Double>empty() : Optional.of(thinProvisioning);
            return this;
        }

        public GetEfficiencyResult.Builder timestamp(final String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public GetEfficiencyResult.Builder missingVolumes(final Long[] missingVolumes) {
            this.missingVolumes = missingVolumes;
            return this;
        }

    }
}
