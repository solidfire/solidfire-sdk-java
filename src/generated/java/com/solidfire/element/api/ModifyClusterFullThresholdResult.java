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
 * ModifyClusterFullThresholdResult  
 **/

public class ModifyClusterFullThresholdResult implements Serializable {

    public static final long serialVersionUID = -2890350803321360133L;
    @SerializedName("blockFullness") private String blockFullness;
    @SerializedName("fullness") private String fullness;
    @SerializedName("maxMetadataOverProvisionFactor") private Long maxMetadataOverProvisionFactor;
    @SerializedName("metadataFullness") private String metadataFullness;
    @SerializedName("sliceReserveUsedThresholdPct") private Long sliceReserveUsedThresholdPct;
    @SerializedName("stage2AwareThreshold") private Long stage2AwareThreshold;
    @SerializedName("stage2BlockThresholdBytes") private Long stage2BlockThresholdBytes;
    @SerializedName("stage3BlockThresholdBytes") private Long stage3BlockThresholdBytes;
    @SerializedName("stage3BlockThresholdPercent") private Long stage3BlockThresholdPercent;
    @SerializedName("stage3LowThreshold") private Long stage3LowThreshold;
    @SerializedName("stage4CriticalThreshold") private Long stage4CriticalThreshold;
    @SerializedName("stage4BlockThresholdBytes") private Long stage4BlockThresholdBytes;
    @SerializedName("stage5BlockThresholdBytes") private Long stage5BlockThresholdBytes;
    @SerializedName("sumTotalClusterBytes") private Long sumTotalClusterBytes;
    @SerializedName("sumTotalMetadataClusterBytes") private Long sumTotalMetadataClusterBytes;
    @SerializedName("sumUsedClusterBytes") private Long sumUsedClusterBytes;
    @SerializedName("sumUsedMetadataClusterBytes") private Long sumUsedMetadataClusterBytes;

    // empty constructor
    @Since("7.0")
    public ModifyClusterFullThresholdResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyClusterFullThresholdResult(
        String blockFullness,
        String fullness,
        Long maxMetadataOverProvisionFactor,
        String metadataFullness,
        Long sliceReserveUsedThresholdPct,
        Long stage2AwareThreshold,
        Long stage2BlockThresholdBytes,
        Long stage3BlockThresholdBytes,
        Long stage3BlockThresholdPercent,
        Long stage3LowThreshold,
        Long stage4CriticalThreshold,
        Long stage4BlockThresholdBytes,
        Long stage5BlockThresholdBytes,
        Long sumTotalClusterBytes,
        Long sumTotalMetadataClusterBytes,
        Long sumUsedClusterBytes,
        Long sumUsedMetadataClusterBytes
    )
    {
        this.blockFullness = blockFullness;
        this.fullness = fullness;
        this.maxMetadataOverProvisionFactor = maxMetadataOverProvisionFactor;
        this.metadataFullness = metadataFullness;
        this.sliceReserveUsedThresholdPct = sliceReserveUsedThresholdPct;
        this.stage2AwareThreshold = stage2AwareThreshold;
        this.stage2BlockThresholdBytes = stage2BlockThresholdBytes;
        this.stage3BlockThresholdBytes = stage3BlockThresholdBytes;
        this.stage3BlockThresholdPercent = stage3BlockThresholdPercent;
        this.stage3LowThreshold = stage3LowThreshold;
        this.stage4CriticalThreshold = stage4CriticalThreshold;
        this.stage4BlockThresholdBytes = stage4BlockThresholdBytes;
        this.stage5BlockThresholdBytes = stage5BlockThresholdBytes;
        this.sumTotalClusterBytes = sumTotalClusterBytes;
        this.sumTotalMetadataClusterBytes = sumTotalMetadataClusterBytes;
        this.sumUsedClusterBytes = sumUsedClusterBytes;
        this.sumUsedMetadataClusterBytes = sumUsedMetadataClusterBytes;
    }

    /** 
     * Current computed level of block fullness of the cluster.
     * Possible values: stage1Happy: No alerts or error conditions. stage2Aware: 3 nodes of capacity available. stage3Low: 2 nodes of capacity available. stage4Critical: 1 node of capacity available. No new volumes or clones can be created. stage5CompletelyConsumed: Completely consumed. Cluster is read-only, iSCSI connection is maintained but all writes are suspended.
     **/
    public String getBlockFullness() { return this.blockFullness; }
    public void setBlockFullness(String blockFullness) { 
        this.blockFullness = blockFullness;
    }
    /** 
     * Reflects the highest level of fullness between "blockFullness" and "metadataFullness".
     **/
    public String getFullness() { return this.fullness; }
    public void setFullness(String fullness) { 
        this.fullness = fullness;
    }
    /** 
     * A value representative of the number of times metadata space can be over provisioned relative to the amount of space available. For example, if there was enough metadata space to store 100 TiB of volumes and this number was set to 5, then 500 TiB worth of volumes could be created.
     **/
    public Long getMaxMetadataOverProvisionFactor() { return this.maxMetadataOverProvisionFactor; }
    public void setMaxMetadataOverProvisionFactor(Long maxMetadataOverProvisionFactor) { 
        this.maxMetadataOverProvisionFactor = maxMetadataOverProvisionFactor;
    }
    /** 
     * Current computed level of metadata fullness of the cluster.
     **/
    public String getMetadataFullness() { return this.metadataFullness; }
    public void setMetadataFullness(String metadataFullness) { 
        this.metadataFullness = metadataFullness;
    }
    /** 
     * Error condition; message sent to "Alerts" if the reserved slice utilization is greater than the sliceReserveUsedThresholdPct value returned.
     **/
    public Long getSliceReserveUsedThresholdPct() { return this.sliceReserveUsedThresholdPct; }
    public void setSliceReserveUsedThresholdPct(Long sliceReserveUsedThresholdPct) { 
        this.sliceReserveUsedThresholdPct = sliceReserveUsedThresholdPct;
    }
    /** 
     * Awareness condition: Value that is set for "Stage 2" cluster threshold level.
     **/
    public Long getStage2AwareThreshold() { return this.stage2AwareThreshold; }
    public void setStage2AwareThreshold(Long stage2AwareThreshold) { 
        this.stage2AwareThreshold = stage2AwareThreshold;
    }
    /** 
     * Number of bytes being used by the cluster at which a stage2 condition will exist.
     **/
    public Long getStage2BlockThresholdBytes() { return this.stage2BlockThresholdBytes; }
    public void setStage2BlockThresholdBytes(Long stage2BlockThresholdBytes) { 
        this.stage2BlockThresholdBytes = stage2BlockThresholdBytes;
    }
    /** 
     * Number of bytes being used by the cluster at which a stage3 condition will exist.
     **/
    public Long getStage3BlockThresholdBytes() { return this.stage3BlockThresholdBytes; }
    public void setStage3BlockThresholdBytes(Long stage3BlockThresholdBytes) { 
        this.stage3BlockThresholdBytes = stage3BlockThresholdBytes;
    }
    /** 
     * The percent value set for stage3. At this percent full, a warning will be posted in the Alerts log.
     **/
    public Long getStage3BlockThresholdPercent() { return this.stage3BlockThresholdPercent; }
    public void setStage3BlockThresholdPercent(Long stage3BlockThresholdPercent) { 
        this.stage3BlockThresholdPercent = stage3BlockThresholdPercent;
    }
    /** 
     * Error condition; message sent to "Alerts" that capacity on a cluster is getting low.
     **/
    public Long getStage3LowThreshold() { return this.stage3LowThreshold; }
    public void setStage3LowThreshold(Long stage3LowThreshold) { 
        this.stage3LowThreshold = stage3LowThreshold;
    }
    /** 
     * Error condition; message sent to "Alerts" that capacity on a cluster is critically low.
     **/
    public Long getStage4CriticalThreshold() { return this.stage4CriticalThreshold; }
    public void setStage4CriticalThreshold(Long stage4CriticalThreshold) { 
        this.stage4CriticalThreshold = stage4CriticalThreshold;
    }
    /** 
     * Number of bytes being used by the cluster at which a stage4 condition will exist.
     **/
    public Long getStage4BlockThresholdBytes() { return this.stage4BlockThresholdBytes; }
    public void setStage4BlockThresholdBytes(Long stage4BlockThresholdBytes) { 
        this.stage4BlockThresholdBytes = stage4BlockThresholdBytes;
    }
    /** 
     * Number of bytes being used by the cluster at which a stage5 condition will exist.
     **/
    public Long getStage5BlockThresholdBytes() { return this.stage5BlockThresholdBytes; }
    public void setStage5BlockThresholdBytes(Long stage5BlockThresholdBytes) { 
        this.stage5BlockThresholdBytes = stage5BlockThresholdBytes;
    }
    /** 
     * Physical capacity of the cluster measured in bytes.
     **/
    public Long getSumTotalClusterBytes() { return this.sumTotalClusterBytes; }
    public void setSumTotalClusterBytes(Long sumTotalClusterBytes) { 
        this.sumTotalClusterBytes = sumTotalClusterBytes;
    }
    /** 
     * Total amount of space that can be used to store metadata.
     **/
    public Long getSumTotalMetadataClusterBytes() { return this.sumTotalMetadataClusterBytes; }
    public void setSumTotalMetadataClusterBytes(Long sumTotalMetadataClusterBytes) { 
        this.sumTotalMetadataClusterBytes = sumTotalMetadataClusterBytes;
    }
    /** 
     * Number of bytes used on the cluster.
     **/
    public Long getSumUsedClusterBytes() { return this.sumUsedClusterBytes; }
    public void setSumUsedClusterBytes(Long sumUsedClusterBytes) { 
        this.sumUsedClusterBytes = sumUsedClusterBytes;
    }
    /** 
     * Amount of space used on volume drives to store metadata.
     **/
    public Long getSumUsedMetadataClusterBytes() { return this.sumUsedMetadataClusterBytes; }
    public void setSumUsedMetadataClusterBytes(Long sumUsedMetadataClusterBytes) { 
        this.sumUsedMetadataClusterBytes = sumUsedMetadataClusterBytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyClusterFullThresholdResult that = (ModifyClusterFullThresholdResult) o;

        return 
            Objects.equals(blockFullness, that.blockFullness) && 
            Objects.equals(fullness, that.fullness) && 
            Objects.equals(maxMetadataOverProvisionFactor, that.maxMetadataOverProvisionFactor) && 
            Objects.equals(metadataFullness, that.metadataFullness) && 
            Objects.equals(sliceReserveUsedThresholdPct, that.sliceReserveUsedThresholdPct) && 
            Objects.equals(stage2AwareThreshold, that.stage2AwareThreshold) && 
            Objects.equals(stage2BlockThresholdBytes, that.stage2BlockThresholdBytes) && 
            Objects.equals(stage3BlockThresholdBytes, that.stage3BlockThresholdBytes) && 
            Objects.equals(stage3BlockThresholdPercent, that.stage3BlockThresholdPercent) && 
            Objects.equals(stage3LowThreshold, that.stage3LowThreshold) && 
            Objects.equals(stage4CriticalThreshold, that.stage4CriticalThreshold) && 
            Objects.equals(stage4BlockThresholdBytes, that.stage4BlockThresholdBytes) && 
            Objects.equals(stage5BlockThresholdBytes, that.stage5BlockThresholdBytes) && 
            Objects.equals(sumTotalClusterBytes, that.sumTotalClusterBytes) && 
            Objects.equals(sumTotalMetadataClusterBytes, that.sumTotalMetadataClusterBytes) && 
            Objects.equals(sumUsedClusterBytes, that.sumUsedClusterBytes) && 
            Objects.equals(sumUsedMetadataClusterBytes, that.sumUsedMetadataClusterBytes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( blockFullness,fullness,maxMetadataOverProvisionFactor,metadataFullness,sliceReserveUsedThresholdPct,stage2AwareThreshold,stage2BlockThresholdBytes,stage3BlockThresholdBytes,stage3BlockThresholdPercent,stage3LowThreshold,stage4CriticalThreshold,stage4BlockThresholdBytes,stage5BlockThresholdBytes,sumTotalClusterBytes,sumTotalMetadataClusterBytes,sumUsedClusterBytes,sumUsedMetadataClusterBytes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("blockFullness", blockFullness);
        map.put("fullness", fullness);
        map.put("maxMetadataOverProvisionFactor", maxMetadataOverProvisionFactor);
        map.put("metadataFullness", metadataFullness);
        map.put("sliceReserveUsedThresholdPct", sliceReserveUsedThresholdPct);
        map.put("stage2AwareThreshold", stage2AwareThreshold);
        map.put("stage2BlockThresholdBytes", stage2BlockThresholdBytes);
        map.put("stage3BlockThresholdBytes", stage3BlockThresholdBytes);
        map.put("stage3BlockThresholdPercent", stage3BlockThresholdPercent);
        map.put("stage3LowThreshold", stage3LowThreshold);
        map.put("stage4CriticalThreshold", stage4CriticalThreshold);
        map.put("stage4BlockThresholdBytes", stage4BlockThresholdBytes);
        map.put("stage5BlockThresholdBytes", stage5BlockThresholdBytes);
        map.put("sumTotalClusterBytes", sumTotalClusterBytes);
        map.put("sumTotalMetadataClusterBytes", sumTotalMetadataClusterBytes);
        map.put("sumUsedClusterBytes", sumUsedClusterBytes);
        map.put("sumUsedMetadataClusterBytes", sumUsedMetadataClusterBytes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" blockFullness : ").append(blockFullness).append(",");
        sb.append(" fullness : ").append(fullness).append(",");
        sb.append(" maxMetadataOverProvisionFactor : ").append(maxMetadataOverProvisionFactor).append(",");
        sb.append(" metadataFullness : ").append(metadataFullness).append(",");
        sb.append(" sliceReserveUsedThresholdPct : ").append(sliceReserveUsedThresholdPct).append(",");
        sb.append(" stage2AwareThreshold : ").append(stage2AwareThreshold).append(",");
        sb.append(" stage2BlockThresholdBytes : ").append(stage2BlockThresholdBytes).append(",");
        sb.append(" stage3BlockThresholdBytes : ").append(stage3BlockThresholdBytes).append(",");
        sb.append(" stage3BlockThresholdPercent : ").append(stage3BlockThresholdPercent).append(",");
        sb.append(" stage3LowThreshold : ").append(stage3LowThreshold).append(",");
        sb.append(" stage4CriticalThreshold : ").append(stage4CriticalThreshold).append(",");
        sb.append(" stage4BlockThresholdBytes : ").append(stage4BlockThresholdBytes).append(",");
        sb.append(" stage5BlockThresholdBytes : ").append(stage5BlockThresholdBytes).append(",");
        sb.append(" sumTotalClusterBytes : ").append(sumTotalClusterBytes).append(",");
        sb.append(" sumTotalMetadataClusterBytes : ").append(sumTotalMetadataClusterBytes).append(",");
        sb.append(" sumUsedClusterBytes : ").append(sumUsedClusterBytes).append(",");
        sb.append(" sumUsedMetadataClusterBytes : ").append(sumUsedMetadataClusterBytes).append(",");
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
        private String blockFullness;
        private String fullness;
        private Long maxMetadataOverProvisionFactor;
        private String metadataFullness;
        private Long sliceReserveUsedThresholdPct;
        private Long stage2AwareThreshold;
        private Long stage2BlockThresholdBytes;
        private Long stage3BlockThresholdBytes;
        private Long stage3BlockThresholdPercent;
        private Long stage3LowThreshold;
        private Long stage4CriticalThreshold;
        private Long stage4BlockThresholdBytes;
        private Long stage5BlockThresholdBytes;
        private Long sumTotalClusterBytes;
        private Long sumTotalMetadataClusterBytes;
        private Long sumUsedClusterBytes;
        private Long sumUsedMetadataClusterBytes;

        private Builder() { }

        public ModifyClusterFullThresholdResult build() {
            return new ModifyClusterFullThresholdResult (
                         this.blockFullness,
                         this.fullness,
                         this.maxMetadataOverProvisionFactor,
                         this.metadataFullness,
                         this.sliceReserveUsedThresholdPct,
                         this.stage2AwareThreshold,
                         this.stage2BlockThresholdBytes,
                         this.stage3BlockThresholdBytes,
                         this.stage3BlockThresholdPercent,
                         this.stage3LowThreshold,
                         this.stage4CriticalThreshold,
                         this.stage4BlockThresholdBytes,
                         this.stage5BlockThresholdBytes,
                         this.sumTotalClusterBytes,
                         this.sumTotalMetadataClusterBytes,
                         this.sumUsedClusterBytes,
                         this.sumUsedMetadataClusterBytes);
        }

        private ModifyClusterFullThresholdResult.Builder buildFrom(final ModifyClusterFullThresholdResult req) {
            this.blockFullness = req.blockFullness;
            this.fullness = req.fullness;
            this.maxMetadataOverProvisionFactor = req.maxMetadataOverProvisionFactor;
            this.metadataFullness = req.metadataFullness;
            this.sliceReserveUsedThresholdPct = req.sliceReserveUsedThresholdPct;
            this.stage2AwareThreshold = req.stage2AwareThreshold;
            this.stage2BlockThresholdBytes = req.stage2BlockThresholdBytes;
            this.stage3BlockThresholdBytes = req.stage3BlockThresholdBytes;
            this.stage3BlockThresholdPercent = req.stage3BlockThresholdPercent;
            this.stage3LowThreshold = req.stage3LowThreshold;
            this.stage4CriticalThreshold = req.stage4CriticalThreshold;
            this.stage4BlockThresholdBytes = req.stage4BlockThresholdBytes;
            this.stage5BlockThresholdBytes = req.stage5BlockThresholdBytes;
            this.sumTotalClusterBytes = req.sumTotalClusterBytes;
            this.sumTotalMetadataClusterBytes = req.sumTotalMetadataClusterBytes;
            this.sumUsedClusterBytes = req.sumUsedClusterBytes;
            this.sumUsedMetadataClusterBytes = req.sumUsedMetadataClusterBytes;

            return this;
        }

        public ModifyClusterFullThresholdResult.Builder blockFullness(final String blockFullness) {
            this.blockFullness = blockFullness;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder fullness(final String fullness) {
            this.fullness = fullness;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder maxMetadataOverProvisionFactor(final Long maxMetadataOverProvisionFactor) {
            this.maxMetadataOverProvisionFactor = maxMetadataOverProvisionFactor;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder metadataFullness(final String metadataFullness) {
            this.metadataFullness = metadataFullness;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder sliceReserveUsedThresholdPct(final Long sliceReserveUsedThresholdPct) {
            this.sliceReserveUsedThresholdPct = sliceReserveUsedThresholdPct;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder stage2AwareThreshold(final Long stage2AwareThreshold) {
            this.stage2AwareThreshold = stage2AwareThreshold;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder stage2BlockThresholdBytes(final Long stage2BlockThresholdBytes) {
            this.stage2BlockThresholdBytes = stage2BlockThresholdBytes;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder stage3BlockThresholdBytes(final Long stage3BlockThresholdBytes) {
            this.stage3BlockThresholdBytes = stage3BlockThresholdBytes;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder stage3BlockThresholdPercent(final Long stage3BlockThresholdPercent) {
            this.stage3BlockThresholdPercent = stage3BlockThresholdPercent;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder stage3LowThreshold(final Long stage3LowThreshold) {
            this.stage3LowThreshold = stage3LowThreshold;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder stage4CriticalThreshold(final Long stage4CriticalThreshold) {
            this.stage4CriticalThreshold = stage4CriticalThreshold;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder stage4BlockThresholdBytes(final Long stage4BlockThresholdBytes) {
            this.stage4BlockThresholdBytes = stage4BlockThresholdBytes;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder stage5BlockThresholdBytes(final Long stage5BlockThresholdBytes) {
            this.stage5BlockThresholdBytes = stage5BlockThresholdBytes;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder sumTotalClusterBytes(final Long sumTotalClusterBytes) {
            this.sumTotalClusterBytes = sumTotalClusterBytes;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder sumTotalMetadataClusterBytes(final Long sumTotalMetadataClusterBytes) {
            this.sumTotalMetadataClusterBytes = sumTotalMetadataClusterBytes;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder sumUsedClusterBytes(final Long sumUsedClusterBytes) {
            this.sumUsedClusterBytes = sumUsedClusterBytes;
            return this;
        }

        public ModifyClusterFullThresholdResult.Builder sumUsedMetadataClusterBytes(final Long sumUsedMetadataClusterBytes) {
            this.sumUsedMetadataClusterBytes = sumUsedMetadataClusterBytes;
            return this;
        }

    }
}
