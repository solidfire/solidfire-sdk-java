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
 * VolumeQoSHistograms  
 * Contains histograms showing a volume's utilization relative to its QOS settings.
 * The histograms are created by sampling inside the QOS manager.
 **/

public class VolumeQoSHistograms implements Serializable {

    public static final long serialVersionUID = -2495051042643334958L;
    @SerializedName("volumeID") private Long[] volumeID;
    @SerializedName("timestamp") private Long[] timestamp;
    @SerializedName("belowMinIopsPercentages") private QuintileHistogram[] belowMinIopsPercentages;
    @SerializedName("minToMaxIopsPercentages") private QuintileHistogram[] minToMaxIopsPercentages;
    @SerializedName("targetUtilizationPercentages") private QuintileHistogram[] targetUtilizationPercentages;
    @SerializedName("throttlePercentages") private QuintileHistogram[] throttlePercentages;
    @SerializedName("readBlockSizes") private BlockSizeHistogram[] readBlockSizes;
    @SerializedName("writeBlockSizes") private BlockSizeHistogram[] writeBlockSizes;
    // empty constructor
    @Since("7.0")
    public VolumeQoSHistograms() {}

    
    // parameterized constructor
    @Since("7.0")
    public VolumeQoSHistograms(
        Long[] volumeID,
        Long[] timestamp,
        QuintileHistogram[] belowMinIopsPercentages,
        QuintileHistogram[] minToMaxIopsPercentages,
        QuintileHistogram[] targetUtilizationPercentages,
        QuintileHistogram[] throttlePercentages,
        BlockSizeHistogram[] readBlockSizes,
        BlockSizeHistogram[] writeBlockSizes
    )
    {
        this.volumeID = volumeID;
        this.timestamp = timestamp;
        this.belowMinIopsPercentages = belowMinIopsPercentages;
        this.minToMaxIopsPercentages = minToMaxIopsPercentages;
        this.targetUtilizationPercentages = targetUtilizationPercentages;
        this.throttlePercentages = throttlePercentages;
        this.readBlockSizes = readBlockSizes;
        this.writeBlockSizes = writeBlockSizes;
    }

    /** 
     * VolumeID for this volume.
     **/
    public Long[] getVolumeID() { return this.volumeID; }
   
    public void setVolumeID(Long[] volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * The time and date that the histograms were returned.
     **/
    public Long[] getTimestamp() { return this.timestamp; }
   
    public void setTimestamp(Long[] timestamp) { 
        this.timestamp = timestamp;
    }
    /** 
     * Shows the distribution of samples where IO sent to the volume was below its minimum IOP setting.
     **/
    public QuintileHistogram[] getBelowMinIopsPercentages() { return this.belowMinIopsPercentages; }
   
    public void setBelowMinIopsPercentages(QuintileHistogram[] belowMinIopsPercentages) { 
        this.belowMinIopsPercentages = belowMinIopsPercentages;
    }
    /** 
     * Shows the distribution of samples where IO sent to the volume was above its minimum IOP setting.
     * Burst is shown in the histogram's Bucket101Plus entry.
     **/
    public QuintileHistogram[] getMinToMaxIopsPercentages() { return this.minToMaxIopsPercentages; }
   
    public void setMinToMaxIopsPercentages(QuintileHistogram[] minToMaxIopsPercentages) { 
        this.minToMaxIopsPercentages = minToMaxIopsPercentages;
    }
    /** 
     * Shows the volume's overall utilization.
     **/
    public QuintileHistogram[] getTargetUtilizationPercentages() { return this.targetUtilizationPercentages; }
   
    public void setTargetUtilizationPercentages(QuintileHistogram[] targetUtilizationPercentages) { 
        this.targetUtilizationPercentages = targetUtilizationPercentages;
    }
    /** 
     * Shows how often and how severely the volume was being throttled.
     **/
    public QuintileHistogram[] getThrottlePercentages() { return this.throttlePercentages; }
   
    public void setThrottlePercentages(QuintileHistogram[] throttlePercentages) { 
        this.throttlePercentages = throttlePercentages;
    }
    /** 
     * Shows the distribution of block sizes for read requests
     **/
    public BlockSizeHistogram[] getReadBlockSizes() { return this.readBlockSizes; }
   
    public void setReadBlockSizes(BlockSizeHistogram[] readBlockSizes) { 
        this.readBlockSizes = readBlockSizes;
    }
    /** 
     * Shows the distribution of block sizes for write requests
     **/
    public BlockSizeHistogram[] getWriteBlockSizes() { return this.writeBlockSizes; }
   
    public void setWriteBlockSizes(BlockSizeHistogram[] writeBlockSizes) { 
        this.writeBlockSizes = writeBlockSizes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumeQoSHistograms that = (VolumeQoSHistograms) o;

        return 
            Arrays.equals(volumeID, that.volumeID) && 
            Arrays.equals(timestamp, that.timestamp) && 
            Arrays.equals(belowMinIopsPercentages, that.belowMinIopsPercentages) && 
            Arrays.equals(minToMaxIopsPercentages, that.minToMaxIopsPercentages) && 
            Arrays.equals(targetUtilizationPercentages, that.targetUtilizationPercentages) && 
            Arrays.equals(throttlePercentages, that.throttlePercentages) && 
            Arrays.equals(readBlockSizes, that.readBlockSizes) && 
            Arrays.equals(writeBlockSizes, that.writeBlockSizes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])volumeID,(Object[])timestamp,(Object[])belowMinIopsPercentages,(Object[])minToMaxIopsPercentages,(Object[])targetUtilizationPercentages,(Object[])throttlePercentages,(Object[])readBlockSizes,(Object[])writeBlockSizes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("timestamp", timestamp);
        map.put("belowMinIopsPercentages", belowMinIopsPercentages);
        map.put("minToMaxIopsPercentages", minToMaxIopsPercentages);
        map.put("targetUtilizationPercentages", targetUtilizationPercentages);
        map.put("throttlePercentages", throttlePercentages);
        map.put("readBlockSizes", readBlockSizes);
        map.put("writeBlockSizes", writeBlockSizes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(gson.toJson(Arrays.toString(volumeID))).append(",");
        sb.append(" timestamp : ").append(gson.toJson(Arrays.toString(timestamp))).append(",");
        sb.append(" belowMinIopsPercentages : ").append(gson.toJson(Arrays.toString(belowMinIopsPercentages))).append(",");
        sb.append(" minToMaxIopsPercentages : ").append(gson.toJson(Arrays.toString(minToMaxIopsPercentages))).append(",");
        sb.append(" targetUtilizationPercentages : ").append(gson.toJson(Arrays.toString(targetUtilizationPercentages))).append(",");
        sb.append(" throttlePercentages : ").append(gson.toJson(Arrays.toString(throttlePercentages))).append(",");
        sb.append(" readBlockSizes : ").append(gson.toJson(Arrays.toString(readBlockSizes))).append(",");
        sb.append(" writeBlockSizes : ").append(gson.toJson(Arrays.toString(writeBlockSizes))).append(",");
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
        private Long[] volumeID;
        private Long[] timestamp;
        private QuintileHistogram[] belowMinIopsPercentages;
        private QuintileHistogram[] minToMaxIopsPercentages;
        private QuintileHistogram[] targetUtilizationPercentages;
        private QuintileHistogram[] throttlePercentages;
        private BlockSizeHistogram[] readBlockSizes;
        private BlockSizeHistogram[] writeBlockSizes;

        private Builder() { }

        public VolumeQoSHistograms build() {
            return new VolumeQoSHistograms (
                         this.volumeID,
                         this.timestamp,
                         this.belowMinIopsPercentages,
                         this.minToMaxIopsPercentages,
                         this.targetUtilizationPercentages,
                         this.throttlePercentages,
                         this.readBlockSizes,
                         this.writeBlockSizes);
        }

        private VolumeQoSHistograms.Builder buildFrom(final VolumeQoSHistograms req) {
            this.volumeID = req.volumeID;
            this.timestamp = req.timestamp;
            this.belowMinIopsPercentages = req.belowMinIopsPercentages;
            this.minToMaxIopsPercentages = req.minToMaxIopsPercentages;
            this.targetUtilizationPercentages = req.targetUtilizationPercentages;
            this.throttlePercentages = req.throttlePercentages;
            this.readBlockSizes = req.readBlockSizes;
            this.writeBlockSizes = req.writeBlockSizes;

            return this;
        }

        public VolumeQoSHistograms.Builder volumeID(final Long[] volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public VolumeQoSHistograms.Builder timestamp(final Long[] timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public VolumeQoSHistograms.Builder belowMinIopsPercentages(final QuintileHistogram[] belowMinIopsPercentages) {
            this.belowMinIopsPercentages = belowMinIopsPercentages;
            return this;
        }

        public VolumeQoSHistograms.Builder minToMaxIopsPercentages(final QuintileHistogram[] minToMaxIopsPercentages) {
            this.minToMaxIopsPercentages = minToMaxIopsPercentages;
            return this;
        }

        public VolumeQoSHistograms.Builder targetUtilizationPercentages(final QuintileHistogram[] targetUtilizationPercentages) {
            this.targetUtilizationPercentages = targetUtilizationPercentages;
            return this;
        }

        public VolumeQoSHistograms.Builder throttlePercentages(final QuintileHistogram[] throttlePercentages) {
            this.throttlePercentages = throttlePercentages;
            return this;
        }

        public VolumeQoSHistograms.Builder readBlockSizes(final BlockSizeHistogram[] readBlockSizes) {
            this.readBlockSizes = readBlockSizes;
            return this;
        }

        public VolumeQoSHistograms.Builder writeBlockSizes(final BlockSizeHistogram[] writeBlockSizes) {
            this.writeBlockSizes = writeBlockSizes;
            return this;
        }

    }
}
