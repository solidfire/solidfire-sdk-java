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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ClusterStats  
 **/

public class ClusterStats implements Serializable {

    public static final long serialVersionUID = -8071979927197008409L;
    @SerializedName("clusterUtilization") private Double clusterUtilization;
    @SerializedName("clientQueueDepth") private Long clientQueueDepth;
    @SerializedName("readBytes") private Long readBytes;
    @SerializedName("readOps") private Long readOps;
    @SerializedName("timestamp") private String timestamp;
    @SerializedName("writeBytes") private Long writeBytes;
    @SerializedName("writeOps") private Long writeOps;
    @SerializedName("actualIOPS") private Optional<Long> actualIOPS;
    @SerializedName("averageIOPSize") private Optional<Long> averageIOPSize;
    @SerializedName("latencyUSec") private Optional<Long> latencyUSec;
    @SerializedName("readBytesLastSample") private Optional<Long> readBytesLastSample;
    @SerializedName("readLatencyUSec") private Optional<Long> readLatencyUSec;
    @SerializedName("readOpsLastSample") private Optional<Long> readOpsLastSample;
    @SerializedName("samplePeriodMsec") private Optional<Long> samplePeriodMsec;
    @SerializedName("unalignedReads") private Optional<Long> unalignedReads;
    @SerializedName("unalignedWrites") private Optional<Long> unalignedWrites;
    @SerializedName("writeBytesLastSample") private Optional<Long> writeBytesLastSample;
    @SerializedName("writeLatencyUSec") private Optional<Long> writeLatencyUSec;
    @SerializedName("writeOpsLastSample") private Optional<Long> writeOpsLastSample;

    // empty constructor
    @Since("7.0")
    public ClusterStats() {}

    
    // parameterized constructor
    @Since("7.0")
    public ClusterStats(
        Double clusterUtilization,
        Long clientQueueDepth,
        Long readBytes,
        Long readOps,
        String timestamp,
        Long writeBytes,
        Long writeOps,
        Optional<Long> actualIOPS,
        Optional<Long> averageIOPSize,
        Optional<Long> latencyUSec,
        Optional<Long> readBytesLastSample,
        Optional<Long> readLatencyUSec,
        Optional<Long> readOpsLastSample,
        Optional<Long> samplePeriodMsec,
        Optional<Long> unalignedReads,
        Optional<Long> unalignedWrites,
        Optional<Long> writeBytesLastSample,
        Optional<Long> writeLatencyUSec,
        Optional<Long> writeOpsLastSample
    )
    {
        this.clusterUtilization = clusterUtilization;
        this.clientQueueDepth = clientQueueDepth;
        this.readBytes = readBytes;
        this.readOps = readOps;
        this.timestamp = timestamp;
        this.writeBytes = writeBytes;
        this.writeOps = writeOps;
        this.actualIOPS = (actualIOPS == null) ? Optional.<Long>empty() : actualIOPS;
        this.averageIOPSize = (averageIOPSize == null) ? Optional.<Long>empty() : averageIOPSize;
        this.latencyUSec = (latencyUSec == null) ? Optional.<Long>empty() : latencyUSec;
        this.readBytesLastSample = (readBytesLastSample == null) ? Optional.<Long>empty() : readBytesLastSample;
        this.readLatencyUSec = (readLatencyUSec == null) ? Optional.<Long>empty() : readLatencyUSec;
        this.readOpsLastSample = (readOpsLastSample == null) ? Optional.<Long>empty() : readOpsLastSample;
        this.samplePeriodMsec = (samplePeriodMsec == null) ? Optional.<Long>empty() : samplePeriodMsec;
        this.unalignedReads = (unalignedReads == null) ? Optional.<Long>empty() : unalignedReads;
        this.unalignedWrites = (unalignedWrites == null) ? Optional.<Long>empty() : unalignedWrites;
        this.writeBytesLastSample = (writeBytesLastSample == null) ? Optional.<Long>empty() : writeBytesLastSample;
        this.writeLatencyUSec = (writeLatencyUSec == null) ? Optional.<Long>empty() : writeLatencyUSec;
        this.writeOpsLastSample = (writeOpsLastSample == null) ? Optional.<Long>empty() : writeOpsLastSample;
    }

    /** 
     * The amount of cluster capacity being utilized.
     **/
    public Double getClusterUtilization() { return this.clusterUtilization; }
    public void setClusterUtilization(Double clusterUtilization) { 
        this.clusterUtilization = clusterUtilization;
    }
    /** 
     * 
     **/
    public Long getClientQueueDepth() { return this.clientQueueDepth; }
    public void setClientQueueDepth(Long clientQueueDepth) { 
        this.clientQueueDepth = clientQueueDepth;
    }
    /** 
     * Total bytes read by clients.
     **/
    public Long getReadBytes() { return this.readBytes; }
    public void setReadBytes(Long readBytes) { 
        this.readBytes = readBytes;
    }
    /** 
     * Total read operations.
     **/
    public Long getReadOps() { return this.readOps; }
    public void setReadOps(Long readOps) { 
        this.readOps = readOps;
    }
    /** 
     * Current time in UTC format. ISO 8601 date string.
     **/
    public String getTimestamp() { return this.timestamp; }
    public void setTimestamp(String timestamp) { 
        this.timestamp = timestamp;
    }
    /** 
     * Total bytes written by clients.
     **/
    public Long getWriteBytes() { return this.writeBytes; }
    public void setWriteBytes(Long writeBytes) { 
        this.writeBytes = writeBytes;
    }
    /** 
     * Total write operations.
     **/
    public Long getWriteOps() { return this.writeOps; }
    public void setWriteOps(Long writeOps) { 
        this.writeOps = writeOps;
    }
    /** 
     * 
     **/
    public Optional<Long> getActualIOPS() { return this.actualIOPS; }
    public void setActualIOPS(Optional<Long> actualIOPS) { 
        this.actualIOPS = (actualIOPS == null) ? Optional.<Long>empty() : actualIOPS;
    }
    /** 
     * 
     **/
    public Optional<Long> getAverageIOPSize() { return this.averageIOPSize; }
    public void setAverageIOPSize(Optional<Long> averageIOPSize) { 
        this.averageIOPSize = (averageIOPSize == null) ? Optional.<Long>empty() : averageIOPSize;
    }
    /** 
     * 
     **/
    public Optional<Long> getLatencyUSec() { return this.latencyUSec; }
    public void setLatencyUSec(Optional<Long> latencyUSec) { 
        this.latencyUSec = (latencyUSec == null) ? Optional.<Long>empty() : latencyUSec;
    }
    /** 
     * 
     **/
    public Optional<Long> getReadBytesLastSample() { return this.readBytesLastSample; }
    public void setReadBytesLastSample(Optional<Long> readBytesLastSample) { 
        this.readBytesLastSample = (readBytesLastSample == null) ? Optional.<Long>empty() : readBytesLastSample;
    }
    /** 
     * 
     **/
    public Optional<Long> getReadLatencyUSec() { return this.readLatencyUSec; }
    public void setReadLatencyUSec(Optional<Long> readLatencyUSec) { 
        this.readLatencyUSec = (readLatencyUSec == null) ? Optional.<Long>empty() : readLatencyUSec;
    }
    /** 
     * 
     **/
    public Optional<Long> getReadOpsLastSample() { return this.readOpsLastSample; }
    public void setReadOpsLastSample(Optional<Long> readOpsLastSample) { 
        this.readOpsLastSample = (readOpsLastSample == null) ? Optional.<Long>empty() : readOpsLastSample;
    }
    /** 
     * 
     **/
    public Optional<Long> getSamplePeriodMsec() { return this.samplePeriodMsec; }
    public void setSamplePeriodMsec(Optional<Long> samplePeriodMsec) { 
        this.samplePeriodMsec = (samplePeriodMsec == null) ? Optional.<Long>empty() : samplePeriodMsec;
    }
    /** 
     * 
     **/
    public Optional<Long> getUnalignedReads() { return this.unalignedReads; }
    public void setUnalignedReads(Optional<Long> unalignedReads) { 
        this.unalignedReads = (unalignedReads == null) ? Optional.<Long>empty() : unalignedReads;
    }
    /** 
     * 
     **/
    public Optional<Long> getUnalignedWrites() { return this.unalignedWrites; }
    public void setUnalignedWrites(Optional<Long> unalignedWrites) { 
        this.unalignedWrites = (unalignedWrites == null) ? Optional.<Long>empty() : unalignedWrites;
    }
    /** 
     * 
     **/
    public Optional<Long> getWriteBytesLastSample() { return this.writeBytesLastSample; }
    public void setWriteBytesLastSample(Optional<Long> writeBytesLastSample) { 
        this.writeBytesLastSample = (writeBytesLastSample == null) ? Optional.<Long>empty() : writeBytesLastSample;
    }
    /** 
     * 
     **/
    public Optional<Long> getWriteLatencyUSec() { return this.writeLatencyUSec; }
    public void setWriteLatencyUSec(Optional<Long> writeLatencyUSec) { 
        this.writeLatencyUSec = (writeLatencyUSec == null) ? Optional.<Long>empty() : writeLatencyUSec;
    }
    /** 
     * 
     **/
    public Optional<Long> getWriteOpsLastSample() { return this.writeOpsLastSample; }
    public void setWriteOpsLastSample(Optional<Long> writeOpsLastSample) { 
        this.writeOpsLastSample = (writeOpsLastSample == null) ? Optional.<Long>empty() : writeOpsLastSample;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterStats that = (ClusterStats) o;

        return 
            Objects.equals(clusterUtilization, that.clusterUtilization) && 
            Objects.equals(clientQueueDepth, that.clientQueueDepth) && 
            Objects.equals(readBytes, that.readBytes) && 
            Objects.equals(readOps, that.readOps) && 
            Objects.equals(timestamp, that.timestamp) && 
            Objects.equals(writeBytes, that.writeBytes) && 
            Objects.equals(writeOps, that.writeOps) && 
            Objects.equals(actualIOPS, that.actualIOPS) && 
            Objects.equals(averageIOPSize, that.averageIOPSize) && 
            Objects.equals(latencyUSec, that.latencyUSec) && 
            Objects.equals(readBytesLastSample, that.readBytesLastSample) && 
            Objects.equals(readLatencyUSec, that.readLatencyUSec) && 
            Objects.equals(readOpsLastSample, that.readOpsLastSample) && 
            Objects.equals(samplePeriodMsec, that.samplePeriodMsec) && 
            Objects.equals(unalignedReads, that.unalignedReads) && 
            Objects.equals(unalignedWrites, that.unalignedWrites) && 
            Objects.equals(writeBytesLastSample, that.writeBytesLastSample) && 
            Objects.equals(writeLatencyUSec, that.writeLatencyUSec) && 
            Objects.equals(writeOpsLastSample, that.writeOpsLastSample);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterUtilization,clientQueueDepth,readBytes,readOps,timestamp,writeBytes,writeOps,actualIOPS,averageIOPSize,latencyUSec,readBytesLastSample,readLatencyUSec,readOpsLastSample,samplePeriodMsec,unalignedReads,unalignedWrites,writeBytesLastSample,writeLatencyUSec,writeOpsLastSample );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterUtilization", clusterUtilization);
        map.put("clientQueueDepth", clientQueueDepth);
        map.put("readBytes", readBytes);
        map.put("readOps", readOps);
        map.put("timestamp", timestamp);
        map.put("writeBytes", writeBytes);
        map.put("writeOps", writeOps);
        map.put("actualIOPS", actualIOPS);
        map.put("averageIOPSize", averageIOPSize);
        map.put("latencyUSec", latencyUSec);
        map.put("readBytesLastSample", readBytesLastSample);
        map.put("readLatencyUSec", readLatencyUSec);
        map.put("readOpsLastSample", readOpsLastSample);
        map.put("samplePeriodMsec", samplePeriodMsec);
        map.put("unalignedReads", unalignedReads);
        map.put("unalignedWrites", unalignedWrites);
        map.put("writeBytesLastSample", writeBytesLastSample);
        map.put("writeLatencyUSec", writeLatencyUSec);
        map.put("writeOpsLastSample", writeOpsLastSample);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterUtilization : ").append(clusterUtilization).append(",");
        sb.append(" clientQueueDepth : ").append(clientQueueDepth).append(",");
        sb.append(" readBytes : ").append(readBytes).append(",");
        sb.append(" readOps : ").append(readOps).append(",");
        sb.append(" timestamp : ").append(timestamp).append(",");
        sb.append(" writeBytes : ").append(writeBytes).append(",");
        sb.append(" writeOps : ").append(writeOps).append(",");
        if(null != actualIOPS && actualIOPS.isPresent()){
            sb.append(" actualIOPS : ").append(actualIOPS).append(",");
        }
        if(null != averageIOPSize && averageIOPSize.isPresent()){
            sb.append(" averageIOPSize : ").append(averageIOPSize).append(",");
        }
        if(null != latencyUSec && latencyUSec.isPresent()){
            sb.append(" latencyUSec : ").append(latencyUSec).append(",");
        }
        if(null != readBytesLastSample && readBytesLastSample.isPresent()){
            sb.append(" readBytesLastSample : ").append(readBytesLastSample).append(",");
        }
        if(null != readLatencyUSec && readLatencyUSec.isPresent()){
            sb.append(" readLatencyUSec : ").append(readLatencyUSec).append(",");
        }
        if(null != readOpsLastSample && readOpsLastSample.isPresent()){
            sb.append(" readOpsLastSample : ").append(readOpsLastSample).append(",");
        }
        if(null != samplePeriodMsec && samplePeriodMsec.isPresent()){
            sb.append(" samplePeriodMsec : ").append(samplePeriodMsec).append(",");
        }
        if(null != unalignedReads && unalignedReads.isPresent()){
            sb.append(" unalignedReads : ").append(unalignedReads).append(",");
        }
        if(null != unalignedWrites && unalignedWrites.isPresent()){
            sb.append(" unalignedWrites : ").append(unalignedWrites).append(",");
        }
        if(null != writeBytesLastSample && writeBytesLastSample.isPresent()){
            sb.append(" writeBytesLastSample : ").append(writeBytesLastSample).append(",");
        }
        if(null != writeLatencyUSec && writeLatencyUSec.isPresent()){
            sb.append(" writeLatencyUSec : ").append(writeLatencyUSec).append(",");
        }
        if(null != writeOpsLastSample && writeOpsLastSample.isPresent()){
            sb.append(" writeOpsLastSample : ").append(writeOpsLastSample).append(",");
        }
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
        private Double clusterUtilization;
        private Long clientQueueDepth;
        private Long readBytes;
        private Long readOps;
        private String timestamp;
        private Long writeBytes;
        private Long writeOps;
        private Optional<Long> actualIOPS;
        private Optional<Long> averageIOPSize;
        private Optional<Long> latencyUSec;
        private Optional<Long> readBytesLastSample;
        private Optional<Long> readLatencyUSec;
        private Optional<Long> readOpsLastSample;
        private Optional<Long> samplePeriodMsec;
        private Optional<Long> unalignedReads;
        private Optional<Long> unalignedWrites;
        private Optional<Long> writeBytesLastSample;
        private Optional<Long> writeLatencyUSec;
        private Optional<Long> writeOpsLastSample;

        private Builder() { }

        public ClusterStats build() {
            return new ClusterStats (
                         this.clusterUtilization,
                         this.clientQueueDepth,
                         this.readBytes,
                         this.readOps,
                         this.timestamp,
                         this.writeBytes,
                         this.writeOps,
                         this.actualIOPS,
                         this.averageIOPSize,
                         this.latencyUSec,
                         this.readBytesLastSample,
                         this.readLatencyUSec,
                         this.readOpsLastSample,
                         this.samplePeriodMsec,
                         this.unalignedReads,
                         this.unalignedWrites,
                         this.writeBytesLastSample,
                         this.writeLatencyUSec,
                         this.writeOpsLastSample);
        }

        private ClusterStats.Builder buildFrom(final ClusterStats req) {
            this.clusterUtilization = req.clusterUtilization;
            this.clientQueueDepth = req.clientQueueDepth;
            this.readBytes = req.readBytes;
            this.readOps = req.readOps;
            this.timestamp = req.timestamp;
            this.writeBytes = req.writeBytes;
            this.writeOps = req.writeOps;
            this.actualIOPS = req.actualIOPS;
            this.averageIOPSize = req.averageIOPSize;
            this.latencyUSec = req.latencyUSec;
            this.readBytesLastSample = req.readBytesLastSample;
            this.readLatencyUSec = req.readLatencyUSec;
            this.readOpsLastSample = req.readOpsLastSample;
            this.samplePeriodMsec = req.samplePeriodMsec;
            this.unalignedReads = req.unalignedReads;
            this.unalignedWrites = req.unalignedWrites;
            this.writeBytesLastSample = req.writeBytesLastSample;
            this.writeLatencyUSec = req.writeLatencyUSec;
            this.writeOpsLastSample = req.writeOpsLastSample;

            return this;
        }

        public ClusterStats.Builder clusterUtilization(final Double clusterUtilization) {
            this.clusterUtilization = clusterUtilization;
            return this;
        }

        public ClusterStats.Builder clientQueueDepth(final Long clientQueueDepth) {
            this.clientQueueDepth = clientQueueDepth;
            return this;
        }

        public ClusterStats.Builder readBytes(final Long readBytes) {
            this.readBytes = readBytes;
            return this;
        }

        public ClusterStats.Builder readOps(final Long readOps) {
            this.readOps = readOps;
            return this;
        }

        public ClusterStats.Builder timestamp(final String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ClusterStats.Builder writeBytes(final Long writeBytes) {
            this.writeBytes = writeBytes;
            return this;
        }

        public ClusterStats.Builder writeOps(final Long writeOps) {
            this.writeOps = writeOps;
            return this;
        }

        public ClusterStats.Builder optionalActualIOPS(final Long actualIOPS) {
            this.actualIOPS = (actualIOPS == null) ? Optional.<Long>empty() : Optional.of(actualIOPS);
            return this;
        }

        public ClusterStats.Builder optionalAverageIOPSize(final Long averageIOPSize) {
            this.averageIOPSize = (averageIOPSize == null) ? Optional.<Long>empty() : Optional.of(averageIOPSize);
            return this;
        }

        public ClusterStats.Builder optionalLatencyUSec(final Long latencyUSec) {
            this.latencyUSec = (latencyUSec == null) ? Optional.<Long>empty() : Optional.of(latencyUSec);
            return this;
        }

        public ClusterStats.Builder optionalReadBytesLastSample(final Long readBytesLastSample) {
            this.readBytesLastSample = (readBytesLastSample == null) ? Optional.<Long>empty() : Optional.of(readBytesLastSample);
            return this;
        }

        public ClusterStats.Builder optionalReadLatencyUSec(final Long readLatencyUSec) {
            this.readLatencyUSec = (readLatencyUSec == null) ? Optional.<Long>empty() : Optional.of(readLatencyUSec);
            return this;
        }

        public ClusterStats.Builder optionalReadOpsLastSample(final Long readOpsLastSample) {
            this.readOpsLastSample = (readOpsLastSample == null) ? Optional.<Long>empty() : Optional.of(readOpsLastSample);
            return this;
        }

        public ClusterStats.Builder optionalSamplePeriodMsec(final Long samplePeriodMsec) {
            this.samplePeriodMsec = (samplePeriodMsec == null) ? Optional.<Long>empty() : Optional.of(samplePeriodMsec);
            return this;
        }

        public ClusterStats.Builder optionalUnalignedReads(final Long unalignedReads) {
            this.unalignedReads = (unalignedReads == null) ? Optional.<Long>empty() : Optional.of(unalignedReads);
            return this;
        }

        public ClusterStats.Builder optionalUnalignedWrites(final Long unalignedWrites) {
            this.unalignedWrites = (unalignedWrites == null) ? Optional.<Long>empty() : Optional.of(unalignedWrites);
            return this;
        }

        public ClusterStats.Builder optionalWriteBytesLastSample(final Long writeBytesLastSample) {
            this.writeBytesLastSample = (writeBytesLastSample == null) ? Optional.<Long>empty() : Optional.of(writeBytesLastSample);
            return this;
        }

        public ClusterStats.Builder optionalWriteLatencyUSec(final Long writeLatencyUSec) {
            this.writeLatencyUSec = (writeLatencyUSec == null) ? Optional.<Long>empty() : Optional.of(writeLatencyUSec);
            return this;
        }

        public ClusterStats.Builder optionalWriteOpsLastSample(final Long writeOpsLastSample) {
            this.writeOpsLastSample = (writeOpsLastSample == null) ? Optional.<Long>empty() : Optional.of(writeOpsLastSample);
            return this;
        }

    }
}
