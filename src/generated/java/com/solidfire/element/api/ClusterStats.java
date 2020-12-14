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
 * ClusterStats  
 **/

public class ClusterStats implements Serializable {

    public static final long serialVersionUID = 1350933100470880071L;
    @SerializedName("clusterUtilization") private Double clusterUtilization;
    @SerializedName("clientQueueDepth") private Long clientQueueDepth;
    @SerializedName("normalizedIOPS") private Long normalizedIOPS;
    @SerializedName("readBytes") private Long readBytes;
    @SerializedName("readLatencyUSecTotal") private Long readLatencyUSecTotal;
    @SerializedName("readOps") private Long readOps;
    @SerializedName("servicesCount") private Long servicesCount;
    @SerializedName("servicesTotal") private Long servicesTotal;
    @SerializedName("timestamp") private String timestamp;
    @SerializedName("writeBytes") private Long writeBytes;
    @SerializedName("writeLatencyUSecTotal") private Long writeLatencyUSecTotal;
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
        Long normalizedIOPS,
        Long readBytes,
        Long readLatencyUSecTotal,
        Long readOps,
        Long servicesCount,
        Long servicesTotal,
        String timestamp,
        Long writeBytes,
        Long writeLatencyUSecTotal,
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
        this.normalizedIOPS = normalizedIOPS;
        this.readBytes = readBytes;
        this.readLatencyUSecTotal = readLatencyUSecTotal;
        this.readOps = readOps;
        this.servicesCount = servicesCount;
        this.servicesTotal = servicesTotal;
        this.timestamp = timestamp;
        this.writeBytes = writeBytes;
        this.writeLatencyUSecTotal = writeLatencyUSecTotal;
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
     * 
     **/
    public Long getNormalizedIOPS() { return this.normalizedIOPS; }
   
    public void setNormalizedIOPS(Long normalizedIOPS) { 
        this.normalizedIOPS = normalizedIOPS;
    }
    /** 
     * Total bytes read by clients.
     **/
    public Long getReadBytes() { return this.readBytes; }
   
    public void setReadBytes(Long readBytes) { 
        this.readBytes = readBytes;
    }
    /** 
     * 
     **/
    public Long getReadLatencyUSecTotal() { return this.readLatencyUSecTotal; }
   
    public void setReadLatencyUSecTotal(Long readLatencyUSecTotal) { 
        this.readLatencyUSecTotal = readLatencyUSecTotal;
    }
    /** 
     * Total read operations.
     **/
    public Long getReadOps() { return this.readOps; }
   
    public void setReadOps(Long readOps) { 
        this.readOps = readOps;
    }
    /** 
     * Services count
     **/
    public Long getServicesCount() { return this.servicesCount; }
   
    public void setServicesCount(Long servicesCount) { 
        this.servicesCount = servicesCount;
    }
    /** 
     * Total services.
     **/
    public Long getServicesTotal() { return this.servicesTotal; }
   
    public void setServicesTotal(Long servicesTotal) { 
        this.servicesTotal = servicesTotal;
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
     * 
     **/
    public Long getWriteLatencyUSecTotal() { return this.writeLatencyUSecTotal; }
   
    public void setWriteLatencyUSecTotal(Long writeLatencyUSecTotal) { 
        this.writeLatencyUSecTotal = writeLatencyUSecTotal;
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
            Objects.equals(normalizedIOPS, that.normalizedIOPS) && 
            Objects.equals(readBytes, that.readBytes) && 
            Objects.equals(readLatencyUSecTotal, that.readLatencyUSecTotal) && 
            Objects.equals(readOps, that.readOps) && 
            Objects.equals(servicesCount, that.servicesCount) && 
            Objects.equals(servicesTotal, that.servicesTotal) && 
            Objects.equals(timestamp, that.timestamp) && 
            Objects.equals(writeBytes, that.writeBytes) && 
            Objects.equals(writeLatencyUSecTotal, that.writeLatencyUSecTotal) && 
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
        return Objects.hash( clusterUtilization,clientQueueDepth,normalizedIOPS,readBytes,readLatencyUSecTotal,readOps,servicesCount,servicesTotal,timestamp,writeBytes,writeLatencyUSecTotal,writeOps,actualIOPS,averageIOPSize,latencyUSec,readBytesLastSample,readLatencyUSec,readOpsLastSample,samplePeriodMsec,unalignedReads,unalignedWrites,writeBytesLastSample,writeLatencyUSec,writeOpsLastSample );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterUtilization", clusterUtilization);
        map.put("clientQueueDepth", clientQueueDepth);
        map.put("normalizedIOPS", normalizedIOPS);
        map.put("readBytes", readBytes);
        map.put("readLatencyUSecTotal", readLatencyUSecTotal);
        map.put("readOps", readOps);
        map.put("servicesCount", servicesCount);
        map.put("servicesTotal", servicesTotal);
        map.put("timestamp", timestamp);
        map.put("writeBytes", writeBytes);
        map.put("writeLatencyUSecTotal", writeLatencyUSecTotal);
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
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" clusterUtilization : ").append(gson.toJson(clusterUtilization)).append(",");
        sb.append(" clientQueueDepth : ").append(gson.toJson(clientQueueDepth)).append(",");
        sb.append(" normalizedIOPS : ").append(gson.toJson(normalizedIOPS)).append(",");
        sb.append(" readBytes : ").append(gson.toJson(readBytes)).append(",");
        sb.append(" readLatencyUSecTotal : ").append(gson.toJson(readLatencyUSecTotal)).append(",");
        sb.append(" readOps : ").append(gson.toJson(readOps)).append(",");
        sb.append(" servicesCount : ").append(gson.toJson(servicesCount)).append(",");
        sb.append(" servicesTotal : ").append(gson.toJson(servicesTotal)).append(",");
        sb.append(" timestamp : ").append(gson.toJson(timestamp)).append(",");
        sb.append(" writeBytes : ").append(gson.toJson(writeBytes)).append(",");
        sb.append(" writeLatencyUSecTotal : ").append(gson.toJson(writeLatencyUSecTotal)).append(",");
        sb.append(" writeOps : ").append(gson.toJson(writeOps)).append(",");
        if(null != actualIOPS && actualIOPS.isPresent()){
            sb.append(" actualIOPS : ").append(gson.toJson(actualIOPS)).append(",");
        }
        else{
            sb.append(" actualIOPS : ").append("null").append(",");
        }
        if(null != averageIOPSize && averageIOPSize.isPresent()){
            sb.append(" averageIOPSize : ").append(gson.toJson(averageIOPSize)).append(",");
        }
        else{
            sb.append(" averageIOPSize : ").append("null").append(",");
        }
        if(null != latencyUSec && latencyUSec.isPresent()){
            sb.append(" latencyUSec : ").append(gson.toJson(latencyUSec)).append(",");
        }
        else{
            sb.append(" latencyUSec : ").append("null").append(",");
        }
        if(null != readBytesLastSample && readBytesLastSample.isPresent()){
            sb.append(" readBytesLastSample : ").append(gson.toJson(readBytesLastSample)).append(",");
        }
        else{
            sb.append(" readBytesLastSample : ").append("null").append(",");
        }
        if(null != readLatencyUSec && readLatencyUSec.isPresent()){
            sb.append(" readLatencyUSec : ").append(gson.toJson(readLatencyUSec)).append(",");
        }
        else{
            sb.append(" readLatencyUSec : ").append("null").append(",");
        }
        if(null != readOpsLastSample && readOpsLastSample.isPresent()){
            sb.append(" readOpsLastSample : ").append(gson.toJson(readOpsLastSample)).append(",");
        }
        else{
            sb.append(" readOpsLastSample : ").append("null").append(",");
        }
        if(null != samplePeriodMsec && samplePeriodMsec.isPresent()){
            sb.append(" samplePeriodMsec : ").append(gson.toJson(samplePeriodMsec)).append(",");
        }
        else{
            sb.append(" samplePeriodMsec : ").append("null").append(",");
        }
        if(null != unalignedReads && unalignedReads.isPresent()){
            sb.append(" unalignedReads : ").append(gson.toJson(unalignedReads)).append(",");
        }
        else{
            sb.append(" unalignedReads : ").append("null").append(",");
        }
        if(null != unalignedWrites && unalignedWrites.isPresent()){
            sb.append(" unalignedWrites : ").append(gson.toJson(unalignedWrites)).append(",");
        }
        else{
            sb.append(" unalignedWrites : ").append("null").append(",");
        }
        if(null != writeBytesLastSample && writeBytesLastSample.isPresent()){
            sb.append(" writeBytesLastSample : ").append(gson.toJson(writeBytesLastSample)).append(",");
        }
        else{
            sb.append(" writeBytesLastSample : ").append("null").append(",");
        }
        if(null != writeLatencyUSec && writeLatencyUSec.isPresent()){
            sb.append(" writeLatencyUSec : ").append(gson.toJson(writeLatencyUSec)).append(",");
        }
        else{
            sb.append(" writeLatencyUSec : ").append("null").append(",");
        }
        if(null != writeOpsLastSample && writeOpsLastSample.isPresent()){
            sb.append(" writeOpsLastSample : ").append(gson.toJson(writeOpsLastSample)).append(",");
        }
        else{
            sb.append(" writeOpsLastSample : ").append("null").append(",");
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
        private Long normalizedIOPS;
        private Long readBytes;
        private Long readLatencyUSecTotal;
        private Long readOps;
        private Long servicesCount;
        private Long servicesTotal;
        private String timestamp;
        private Long writeBytes;
        private Long writeLatencyUSecTotal;
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
                         this.normalizedIOPS,
                         this.readBytes,
                         this.readLatencyUSecTotal,
                         this.readOps,
                         this.servicesCount,
                         this.servicesTotal,
                         this.timestamp,
                         this.writeBytes,
                         this.writeLatencyUSecTotal,
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
            this.normalizedIOPS = req.normalizedIOPS;
            this.readBytes = req.readBytes;
            this.readLatencyUSecTotal = req.readLatencyUSecTotal;
            this.readOps = req.readOps;
            this.servicesCount = req.servicesCount;
            this.servicesTotal = req.servicesTotal;
            this.timestamp = req.timestamp;
            this.writeBytes = req.writeBytes;
            this.writeLatencyUSecTotal = req.writeLatencyUSecTotal;
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

        public ClusterStats.Builder normalizedIOPS(final Long normalizedIOPS) {
            this.normalizedIOPS = normalizedIOPS;
            return this;
        }

        public ClusterStats.Builder readBytes(final Long readBytes) {
            this.readBytes = readBytes;
            return this;
        }

        public ClusterStats.Builder readLatencyUSecTotal(final Long readLatencyUSecTotal) {
            this.readLatencyUSecTotal = readLatencyUSecTotal;
            return this;
        }

        public ClusterStats.Builder readOps(final Long readOps) {
            this.readOps = readOps;
            return this;
        }

        public ClusterStats.Builder servicesCount(final Long servicesCount) {
            this.servicesCount = servicesCount;
            return this;
        }

        public ClusterStats.Builder servicesTotal(final Long servicesTotal) {
            this.servicesTotal = servicesTotal;
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

        public ClusterStats.Builder writeLatencyUSecTotal(final Long writeLatencyUSecTotal) {
            this.writeLatencyUSecTotal = writeLatencyUSecTotal;
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
