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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetStorageContainerEfficiencyResult  
 **/

public class GetStorageContainerEfficiencyResult implements Serializable {

    public static final long serialVersionUID = 437711388770516956L;
    @SerializedName("compression") private Double compression;
    @SerializedName("deduplication") private Double deduplication;
    @SerializedName("missingVolumes") private Long[] missingVolumes;
    @SerializedName("thinProvisioning") private Double thinProvisioning;
    @SerializedName("timestamp") private String timestamp;
    // empty constructor
    @Since("7.0")
    public GetStorageContainerEfficiencyResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetStorageContainerEfficiencyResult(
        Double compression,
        Double deduplication,
        Long[] missingVolumes,
        Double thinProvisioning,
        String timestamp
    )
    {
        this.compression = compression;
        this.deduplication = deduplication;
        this.missingVolumes = missingVolumes;
        this.thinProvisioning = thinProvisioning;
        this.timestamp = timestamp;
    }

    /** 
     * 
     **/
    public Double getCompression() { return this.compression; }
   
    public void setCompression(Double compression) { 
        this.compression = compression;
    }
    /** 
     * 
     **/
    public Double getDeduplication() { return this.deduplication; }
   
    public void setDeduplication(Double deduplication) { 
        this.deduplication = deduplication;
    }
    /** 
     * The volumes that could not be queried for efficiency data. Missing volumes can be caused by the Garbage Collection (GC) cycle being less than an hour old, temporary loss of network connectivity, or restarted services since the GC cycle.
     **/
    public Long[] getMissingVolumes() { return this.missingVolumes; }
   
    public void setMissingVolumes(Long[] missingVolumes) { 
        this.missingVolumes = missingVolumes;
    }
    /** 
     * 
     **/
    public Double getThinProvisioning() { return this.thinProvisioning; }
   
    public void setThinProvisioning(Double thinProvisioning) { 
        this.thinProvisioning = thinProvisioning;
    }
    /** 
     * The last time efficiency data was collected after Garbage Collection (GC).
     **/
    public String getTimestamp() { return this.timestamp; }
   
    public void setTimestamp(String timestamp) { 
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetStorageContainerEfficiencyResult that = (GetStorageContainerEfficiencyResult) o;

        return 
            Objects.equals(compression, that.compression) && 
            Objects.equals(deduplication, that.deduplication) && 
            Arrays.equals(missingVolumes, that.missingVolumes) && 
            Objects.equals(thinProvisioning, that.thinProvisioning) && 
            Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash( compression,deduplication,(Object[])missingVolumes,thinProvisioning,timestamp );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("compression", compression);
        map.put("deduplication", deduplication);
        map.put("missingVolumes", missingVolumes);
        map.put("thinProvisioning", thinProvisioning);
        map.put("timestamp", timestamp);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" compression : ").append(gson.toJson(compression)).append(",");
        sb.append(" deduplication : ").append(gson.toJson(deduplication)).append(",");
        sb.append(" missingVolumes : ").append(gson.toJson(Arrays.toString(missingVolumes))).append(",");
        sb.append(" thinProvisioning : ").append(gson.toJson(thinProvisioning)).append(",");
        sb.append(" timestamp : ").append(gson.toJson(timestamp)).append(",");
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
                         this.timestamp);
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
