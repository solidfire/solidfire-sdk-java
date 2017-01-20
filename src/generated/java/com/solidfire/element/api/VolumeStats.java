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
 * VolumeStats  
 * Contains statistical data for an individual volume.
 **/

public class VolumeStats implements Serializable {

    public static final long serialVersionUID = -9122760636649944014L;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("actualIOPS") private Long actualIOPS;
    @SerializedName("asyncDelay") private Optional<String> asyncDelay;
    @SerializedName("averageIOPSize") private Long averageIOPSize;
    @SerializedName("burstIOPSCredit") private Long burstIOPSCredit;
    @SerializedName("clientQueueDepth") private Long clientQueueDepth;
    @SerializedName("desiredMetadataHosts") private MetadataHosts desiredMetadataHosts;
    @SerializedName("latencyUSec") private Long latencyUSec;
    @SerializedName("metadataHosts") private MetadataHosts metadataHosts;
    @SerializedName("nonZeroBlocks") private Long nonZeroBlocks;
    @SerializedName("readBytes") private Long readBytes;
    @SerializedName("readLatencyUSec") private Long readLatencyUSec;
    @SerializedName("readOps") private Long readOps;
    @SerializedName("throttle") private Double throttle;
    @SerializedName("timestamp") private String timestamp;
    @SerializedName("totalLatencyUSec") private Long totalLatencyUSec;
    @SerializedName("unalignedReads") private Long unalignedReads;
    @SerializedName("unalignedWrites") private Long unalignedWrites;
    @SerializedName("volumeAccessGroups") private Long[] volumeAccessGroups;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("volumeSize") private Long volumeSize;
    @SerializedName("volumeUtilization") private Double volumeUtilization;
    @SerializedName("writeBytes") private Long writeBytes;
    @SerializedName("writeLatencyUSec") private Long writeLatencyUSec;
    @SerializedName("writeOps") private Long writeOps;
    @SerializedName("zeroBlocks") private Long zeroBlocks;
    @SerializedName("writeBytesLastSample") private Long writeBytesLastSample;
    @SerializedName("samplePeriodMSec") private Long samplePeriodMSec;
    @SerializedName("readBytesLastSample") private Long readBytesLastSample;
    @SerializedName("readOpsLastSample") private Long readOpsLastSample;
    @SerializedName("writeOpsLastSample") private Long writeOpsLastSample;
    @SerializedName("virtualVolumeID") private java.util.UUID virtualVolumeID;

    // empty constructor
    @Since("7.0")
    public VolumeStats() {}

    
    // parameterized constructor
    @Since("7.0")
    public VolumeStats(
        Long accountID,
        Long actualIOPS,
        Optional<String> asyncDelay,
        Long averageIOPSize,
        Long burstIOPSCredit,
        Long clientQueueDepth,
        MetadataHosts desiredMetadataHosts,
        Long latencyUSec,
        MetadataHosts metadataHosts,
        Long nonZeroBlocks,
        Long readBytes,
        Long readLatencyUSec,
        Long readOps,
        Double throttle,
        String timestamp,
        Long totalLatencyUSec,
        Long unalignedReads,
        Long unalignedWrites,
        Long[] volumeAccessGroups,
        Long volumeID,
        Long volumeSize,
        Double volumeUtilization,
        Long writeBytes,
        Long writeLatencyUSec,
        Long writeOps,
        Long zeroBlocks,
        Long writeBytesLastSample,
        Long samplePeriodMSec,
        Long readBytesLastSample,
        Long readOpsLastSample,
        Long writeOpsLastSample,
        java.util.UUID virtualVolumeID
    )
    {
        this.accountID = accountID;
        this.actualIOPS = actualIOPS;
        this.asyncDelay = (asyncDelay == null) ? Optional.<String>empty() : asyncDelay;
        this.averageIOPSize = averageIOPSize;
        this.burstIOPSCredit = burstIOPSCredit;
        this.clientQueueDepth = clientQueueDepth;
        this.desiredMetadataHosts = desiredMetadataHosts;
        this.latencyUSec = latencyUSec;
        this.metadataHosts = metadataHosts;
        this.nonZeroBlocks = nonZeroBlocks;
        this.readBytes = readBytes;
        this.readLatencyUSec = readLatencyUSec;
        this.readOps = readOps;
        this.throttle = throttle;
        this.timestamp = timestamp;
        this.totalLatencyUSec = totalLatencyUSec;
        this.unalignedReads = unalignedReads;
        this.unalignedWrites = unalignedWrites;
        this.volumeAccessGroups = volumeAccessGroups;
        this.volumeID = volumeID;
        this.volumeSize = volumeSize;
        this.volumeUtilization = volumeUtilization;
        this.writeBytes = writeBytes;
        this.writeLatencyUSec = writeLatencyUSec;
        this.writeOps = writeOps;
        this.zeroBlocks = zeroBlocks;
        this.writeBytesLastSample = writeBytesLastSample;
        this.samplePeriodMSec = samplePeriodMSec;
        this.readBytesLastSample = readBytesLastSample;
        this.readOpsLastSample = readOpsLastSample;
        this.writeOpsLastSample = writeOpsLastSample;
        this.virtualVolumeID = virtualVolumeID;
    }

    /** 
     * AccountID of the volume owner.
     **/
    public Long getAccountID() { return this.accountID; }
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     * Current actual IOPS to the volume in the last 500 milliseconds.
     **/
    public Long getActualIOPS() { return this.actualIOPS; }
    public void setActualIOPS(Long actualIOPS) { 
        this.actualIOPS = actualIOPS;
    }
    /** 
     * The length of time since the volume was last synced with the remote cluster.
     * If the volume is not paired, this is null.
     * 
     * Note: A target volume in an active replication state always has an async delay of 0 (zero).
     * Target volumes are system-aware during replication and assume async delay is accurate at all times.
     **/
    public Optional<String> getAsyncDelay() { return this.asyncDelay; }
    public void setAsyncDelay(Optional<String> asyncDelay) { 
        this.asyncDelay = (asyncDelay == null) ? Optional.<String>empty() : asyncDelay;
    }
    /** 
     * Average size in bytes of recent I/O to the volume in the last 500 milliseconds.
     **/
    public Long getAverageIOPSize() { return this.averageIOPSize; }
    public void setAverageIOPSize(Long averageIOPSize) { 
        this.averageIOPSize = averageIOPSize;
    }
    /** 
     * The total number of IOP credits available to the user.
     * When users are not using up to the max IOPS, credits are accrued.
     **/
    public Long getBurstIOPSCredit() { return this.burstIOPSCredit; }
    public void setBurstIOPSCredit(Long burstIOPSCredit) { 
        this.burstIOPSCredit = burstIOPSCredit;
    }
    /** 
     * The number of outstanding read and write operations to the cluster.
     **/
    public Long getClientQueueDepth() { return this.clientQueueDepth; }
    public void setClientQueueDepth(Long clientQueueDepth) { 
        this.clientQueueDepth = clientQueueDepth;
    }
    /** 
     * The volume services being migrated to if the volume metadata is getting migrated between volume services.
     * A "null" value means the volume is not migrating.
     **/
    public MetadataHosts getDesiredMetadataHosts() { return this.desiredMetadataHosts; }
    public void setDesiredMetadataHosts(MetadataHosts desiredMetadataHosts) { 
        this.desiredMetadataHosts = desiredMetadataHosts;
    }
    /** 
     * The observed latency time, in microseconds, to complete operations to a volume.
     * A "0" (zero) value means there is no I/O to the volume.
     **/
    public Long getLatencyUSec() { return this.latencyUSec; }
    public void setLatencyUSec(Long latencyUSec) { 
        this.latencyUSec = latencyUSec;
    }
    /** 
     * The volume services on which the volume metadata resides.
     **/
    public MetadataHosts getMetadataHosts() { return this.metadataHosts; }
    public void setMetadataHosts(MetadataHosts metadataHosts) { 
        this.metadataHosts = metadataHosts;
    }
    /** 
     * The number of 4KiB blocks with data after the last garbage collection operation has completed.
     **/
    public Long getNonZeroBlocks() { return this.nonZeroBlocks; }
    public void setNonZeroBlocks(Long nonZeroBlocks) { 
        this.nonZeroBlocks = nonZeroBlocks;
    }
    /** 
     * Total bytes read by clients.
     **/
    public Long getReadBytes() { return this.readBytes; }
    public void setReadBytes(Long readBytes) { 
        this.readBytes = readBytes;
    }
    /** 
     * The average time, in microseconds, to complete read operations.
     **/
    public Long getReadLatencyUSec() { return this.readLatencyUSec; }
    public void setReadLatencyUSec(Long readLatencyUSec) { 
        this.readLatencyUSec = readLatencyUSec;
    }
    /** 
     * Total read operations.
     **/
    public Long getReadOps() { return this.readOps; }
    public void setReadOps(Long readOps) { 
        this.readOps = readOps;
    }
    /** 
     * A floating value between 0 and 1 that represents how much the system is throttling clients
     * below their max IOPS because of re-replication of data, transient errors and snapshots taken.
     **/
    public Double getThrottle() { return this.throttle; }
    public void setThrottle(Double throttle) { 
        this.throttle = throttle;
    }
    /** 
     * The current time in UTC.
     **/
    public String getTimestamp() { return this.timestamp; }
    public void setTimestamp(String timestamp) { 
        this.timestamp = timestamp;
    }
    /** 
     * The average time, in microseconds, to complete read and write operations to a volume.
     **/
    public Long getTotalLatencyUSec() { return this.totalLatencyUSec; }
    public void setTotalLatencyUSec(Long totalLatencyUSec) { 
        this.totalLatencyUSec = totalLatencyUSec;
    }
    /** 
     * For 512e volumes, the number of read operations that were not on a 4k sector boundary.
     * High numbers of unaligned reads may indicate improper partition alignment.
     **/
    public Long getUnalignedReads() { return this.unalignedReads; }
    public void setUnalignedReads(Long unalignedReads) { 
        this.unalignedReads = unalignedReads;
    }
    /** 
     * For 512e volumes, the number of write operations that were not on a 4k sector boundary.
     * High numbers of unaligned writes may indicate improper partition alignment.
     **/
    public Long getUnalignedWrites() { return this.unalignedWrites; }
    public void setUnalignedWrites(Long unalignedWrites) { 
        this.unalignedWrites = unalignedWrites;
    }
    /** 
     * List of volume access group(s) to which a volume belongs.
     **/
    public Long[] getVolumeAccessGroups() { return this.volumeAccessGroups; }
    public void setVolumeAccessGroups(Long[] volumeAccessGroups) { 
        this.volumeAccessGroups = volumeAccessGroups;
    }
    /** 
     * Volume ID of the volume.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * Total provisioned capacity in bytes.
     **/
    public Long getVolumeSize() { return this.volumeSize; }
    public void setVolumeSize(Long volumeSize) { 
        this.volumeSize = volumeSize;
    }
    /** 
     * A floating value that describes how much the client is using the volume.
     * 
     * Values:
     *  0 = Client is not using the volume
     * 1 = Client is using their max
     * >1 = Client is using their burst
     **/
    public Double getVolumeUtilization() { return this.volumeUtilization; }
    public void setVolumeUtilization(Double volumeUtilization) { 
        this.volumeUtilization = volumeUtilization;
    }
    /** 
     * Total bytes written by clients.
     **/
    public Long getWriteBytes() { return this.writeBytes; }
    public void setWriteBytes(Long writeBytes) { 
        this.writeBytes = writeBytes;
    }
    /** 
     * The average time, in microseconds, to complete write operations.
     **/
    public Long getWriteLatencyUSec() { return this.writeLatencyUSec; }
    public void setWriteLatencyUSec(Long writeLatencyUSec) { 
        this.writeLatencyUSec = writeLatencyUSec;
    }
    /** 
     * Total write operations occurring on the volume.
     **/
    public Long getWriteOps() { return this.writeOps; }
    public void setWriteOps(Long writeOps) { 
        this.writeOps = writeOps;
    }
    /** 
     * Total number of 4KiB blocks without data after the last round of garbage collection operation has completed.
     **/
    public Long getZeroBlocks() { return this.zeroBlocks; }
    public void setZeroBlocks(Long zeroBlocks) { 
        this.zeroBlocks = zeroBlocks;
    }
    /** 
     * The total number of bytes written to the volume during the last sample period.
     **/
    public Long getWriteBytesLastSample() { return this.writeBytesLastSample; }
    public void setWriteBytesLastSample(Long writeBytesLastSample) { 
        this.writeBytesLastSample = writeBytesLastSample;
    }
    /** 
     * The length of the sample period in milliseconds.
     **/
    public Long getSamplePeriodMSec() { return this.samplePeriodMSec; }
    public void setSamplePeriodMSec(Long samplePeriodMSec) { 
        this.samplePeriodMSec = samplePeriodMSec;
    }
    /** 
     * The total number of bytes read from the volume during the last sample period.
     **/
    public Long getReadBytesLastSample() { return this.readBytesLastSample; }
    public void setReadBytesLastSample(Long readBytesLastSample) { 
        this.readBytesLastSample = readBytesLastSample;
    }
    /** 
     * The total number of read operations durin gth elast sample period.
     **/
    public Long getReadOpsLastSample() { return this.readOpsLastSample; }
    public void setReadOpsLastSample(Long readOpsLastSample) { 
        this.readOpsLastSample = readOpsLastSample;
    }
    /** 
     * The total number of write operations during the last sample period.
     **/
    public Long getWriteOpsLastSample() { return this.writeOpsLastSample; }
    public void setWriteOpsLastSample(Long writeOpsLastSample) { 
        this.writeOpsLastSample = writeOpsLastSample;
    }
    /** 
     * If the volume of interest is associated with a virtual volume, this is the virtual volume ID.
     **/
    public java.util.UUID getVirtualVolumeID() { return this.virtualVolumeID; }
    public void setVirtualVolumeID(java.util.UUID virtualVolumeID) { 
        this.virtualVolumeID = virtualVolumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumeStats that = (VolumeStats) o;

        return 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(actualIOPS, that.actualIOPS) && 
            Objects.equals(asyncDelay, that.asyncDelay) && 
            Objects.equals(averageIOPSize, that.averageIOPSize) && 
            Objects.equals(burstIOPSCredit, that.burstIOPSCredit) && 
            Objects.equals(clientQueueDepth, that.clientQueueDepth) && 
            Objects.equals(desiredMetadataHosts, that.desiredMetadataHosts) && 
            Objects.equals(latencyUSec, that.latencyUSec) && 
            Objects.equals(metadataHosts, that.metadataHosts) && 
            Objects.equals(nonZeroBlocks, that.nonZeroBlocks) && 
            Objects.equals(readBytes, that.readBytes) && 
            Objects.equals(readLatencyUSec, that.readLatencyUSec) && 
            Objects.equals(readOps, that.readOps) && 
            Objects.equals(throttle, that.throttle) && 
            Objects.equals(timestamp, that.timestamp) && 
            Objects.equals(totalLatencyUSec, that.totalLatencyUSec) && 
            Objects.equals(unalignedReads, that.unalignedReads) && 
            Objects.equals(unalignedWrites, that.unalignedWrites) && 
            Arrays.equals(volumeAccessGroups, that.volumeAccessGroups) && 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(volumeSize, that.volumeSize) && 
            Objects.equals(volumeUtilization, that.volumeUtilization) && 
            Objects.equals(writeBytes, that.writeBytes) && 
            Objects.equals(writeLatencyUSec, that.writeLatencyUSec) && 
            Objects.equals(writeOps, that.writeOps) && 
            Objects.equals(zeroBlocks, that.zeroBlocks) && 
            Objects.equals(writeBytesLastSample, that.writeBytesLastSample) && 
            Objects.equals(samplePeriodMSec, that.samplePeriodMSec) && 
            Objects.equals(readBytesLastSample, that.readBytesLastSample) && 
            Objects.equals(readOpsLastSample, that.readOpsLastSample) && 
            Objects.equals(writeOpsLastSample, that.writeOpsLastSample) && 
            Objects.equals(virtualVolumeID, that.virtualVolumeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID,actualIOPS,asyncDelay,averageIOPSize,burstIOPSCredit,clientQueueDepth,desiredMetadataHosts,latencyUSec,metadataHosts,nonZeroBlocks,readBytes,readLatencyUSec,readOps,throttle,timestamp,totalLatencyUSec,unalignedReads,unalignedWrites,(Object[])volumeAccessGroups,volumeID,volumeSize,volumeUtilization,writeBytes,writeLatencyUSec,writeOps,zeroBlocks,writeBytesLastSample,samplePeriodMSec,readBytesLastSample,readOpsLastSample,writeOpsLastSample,virtualVolumeID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountID", accountID);
        map.put("actualIOPS", actualIOPS);
        map.put("asyncDelay", asyncDelay);
        map.put("averageIOPSize", averageIOPSize);
        map.put("burstIOPSCredit", burstIOPSCredit);
        map.put("clientQueueDepth", clientQueueDepth);
        map.put("desiredMetadataHosts", desiredMetadataHosts);
        map.put("latencyUSec", latencyUSec);
        map.put("metadataHosts", metadataHosts);
        map.put("nonZeroBlocks", nonZeroBlocks);
        map.put("readBytes", readBytes);
        map.put("readLatencyUSec", readLatencyUSec);
        map.put("readOps", readOps);
        map.put("throttle", throttle);
        map.put("timestamp", timestamp);
        map.put("totalLatencyUSec", totalLatencyUSec);
        map.put("unalignedReads", unalignedReads);
        map.put("unalignedWrites", unalignedWrites);
        map.put("volumeAccessGroups", volumeAccessGroups);
        map.put("volumeID", volumeID);
        map.put("volumeSize", volumeSize);
        map.put("volumeUtilization", volumeUtilization);
        map.put("writeBytes", writeBytes);
        map.put("writeLatencyUSec", writeLatencyUSec);
        map.put("writeOps", writeOps);
        map.put("zeroBlocks", zeroBlocks);
        map.put("writeBytesLastSample", writeBytesLastSample);
        map.put("samplePeriodMSec", samplePeriodMSec);
        map.put("readBytesLastSample", readBytesLastSample);
        map.put("readOpsLastSample", readOpsLastSample);
        map.put("writeOpsLastSample", writeOpsLastSample);
        map.put("virtualVolumeID", virtualVolumeID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" accountID : ").append(accountID).append(",");
        sb.append(" actualIOPS : ").append(actualIOPS).append(",");
        if(null != asyncDelay && asyncDelay.isPresent()){
            sb.append(" asyncDelay : ").append(asyncDelay).append(",");
        }
        sb.append(" averageIOPSize : ").append(averageIOPSize).append(",");
        sb.append(" burstIOPSCredit : ").append(burstIOPSCredit).append(",");
        sb.append(" clientQueueDepth : ").append(clientQueueDepth).append(",");
        sb.append(" desiredMetadataHosts : ").append(desiredMetadataHosts).append(",");
        sb.append(" latencyUSec : ").append(latencyUSec).append(",");
        sb.append(" metadataHosts : ").append(metadataHosts).append(",");
        sb.append(" nonZeroBlocks : ").append(nonZeroBlocks).append(",");
        sb.append(" readBytes : ").append(readBytes).append(",");
        sb.append(" readLatencyUSec : ").append(readLatencyUSec).append(",");
        sb.append(" readOps : ").append(readOps).append(",");
        sb.append(" throttle : ").append(throttle).append(",");
        sb.append(" timestamp : ").append(timestamp).append(",");
        sb.append(" totalLatencyUSec : ").append(totalLatencyUSec).append(",");
        sb.append(" unalignedReads : ").append(unalignedReads).append(",");
        sb.append(" unalignedWrites : ").append(unalignedWrites).append(",");
        sb.append(" volumeAccessGroups : ").append(Arrays.toString(volumeAccessGroups)).append(",");
        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" volumeSize : ").append(volumeSize).append(",");
        sb.append(" volumeUtilization : ").append(volumeUtilization).append(",");
        sb.append(" writeBytes : ").append(writeBytes).append(",");
        sb.append(" writeLatencyUSec : ").append(writeLatencyUSec).append(",");
        sb.append(" writeOps : ").append(writeOps).append(",");
        sb.append(" zeroBlocks : ").append(zeroBlocks).append(",");
        sb.append(" writeBytesLastSample : ").append(writeBytesLastSample).append(",");
        sb.append(" samplePeriodMSec : ").append(samplePeriodMSec).append(",");
        sb.append(" readBytesLastSample : ").append(readBytesLastSample).append(",");
        sb.append(" readOpsLastSample : ").append(readOpsLastSample).append(",");
        sb.append(" writeOpsLastSample : ").append(writeOpsLastSample).append(",");
        sb.append(" virtualVolumeID : ").append(virtualVolumeID).append(",");
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
        private Long accountID;
        private Long actualIOPS;
        private Optional<String> asyncDelay;
        private Long averageIOPSize;
        private Long burstIOPSCredit;
        private Long clientQueueDepth;
        private MetadataHosts desiredMetadataHosts;
        private Long latencyUSec;
        private MetadataHosts metadataHosts;
        private Long nonZeroBlocks;
        private Long readBytes;
        private Long readLatencyUSec;
        private Long readOps;
        private Double throttle;
        private String timestamp;
        private Long totalLatencyUSec;
        private Long unalignedReads;
        private Long unalignedWrites;
        private Long[] volumeAccessGroups;
        private Long volumeID;
        private Long volumeSize;
        private Double volumeUtilization;
        private Long writeBytes;
        private Long writeLatencyUSec;
        private Long writeOps;
        private Long zeroBlocks;
        private Long writeBytesLastSample;
        private Long samplePeriodMSec;
        private Long readBytesLastSample;
        private Long readOpsLastSample;
        private Long writeOpsLastSample;
        private java.util.UUID virtualVolumeID;

        private Builder() { }

        public VolumeStats build() {
            return new VolumeStats (
                         this.accountID,
                         this.actualIOPS,
                         this.asyncDelay,
                         this.averageIOPSize,
                         this.burstIOPSCredit,
                         this.clientQueueDepth,
                         this.desiredMetadataHosts,
                         this.latencyUSec,
                         this.metadataHosts,
                         this.nonZeroBlocks,
                         this.readBytes,
                         this.readLatencyUSec,
                         this.readOps,
                         this.throttle,
                         this.timestamp,
                         this.totalLatencyUSec,
                         this.unalignedReads,
                         this.unalignedWrites,
                         this.volumeAccessGroups,
                         this.volumeID,
                         this.volumeSize,
                         this.volumeUtilization,
                         this.writeBytes,
                         this.writeLatencyUSec,
                         this.writeOps,
                         this.zeroBlocks,
                         this.writeBytesLastSample,
                         this.samplePeriodMSec,
                         this.readBytesLastSample,
                         this.readOpsLastSample,
                         this.writeOpsLastSample,
                         this.virtualVolumeID);
        }

        private VolumeStats.Builder buildFrom(final VolumeStats req) {
            this.accountID = req.accountID;
            this.actualIOPS = req.actualIOPS;
            this.asyncDelay = req.asyncDelay;
            this.averageIOPSize = req.averageIOPSize;
            this.burstIOPSCredit = req.burstIOPSCredit;
            this.clientQueueDepth = req.clientQueueDepth;
            this.desiredMetadataHosts = req.desiredMetadataHosts;
            this.latencyUSec = req.latencyUSec;
            this.metadataHosts = req.metadataHosts;
            this.nonZeroBlocks = req.nonZeroBlocks;
            this.readBytes = req.readBytes;
            this.readLatencyUSec = req.readLatencyUSec;
            this.readOps = req.readOps;
            this.throttle = req.throttle;
            this.timestamp = req.timestamp;
            this.totalLatencyUSec = req.totalLatencyUSec;
            this.unalignedReads = req.unalignedReads;
            this.unalignedWrites = req.unalignedWrites;
            this.volumeAccessGroups = req.volumeAccessGroups;
            this.volumeID = req.volumeID;
            this.volumeSize = req.volumeSize;
            this.volumeUtilization = req.volumeUtilization;
            this.writeBytes = req.writeBytes;
            this.writeLatencyUSec = req.writeLatencyUSec;
            this.writeOps = req.writeOps;
            this.zeroBlocks = req.zeroBlocks;
            this.writeBytesLastSample = req.writeBytesLastSample;
            this.samplePeriodMSec = req.samplePeriodMSec;
            this.readBytesLastSample = req.readBytesLastSample;
            this.readOpsLastSample = req.readOpsLastSample;
            this.writeOpsLastSample = req.writeOpsLastSample;
            this.virtualVolumeID = req.virtualVolumeID;

            return this;
        }

        public VolumeStats.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public VolumeStats.Builder actualIOPS(final Long actualIOPS) {
            this.actualIOPS = actualIOPS;
            return this;
        }

        public VolumeStats.Builder optionalAsyncDelay(final String asyncDelay) {
            this.asyncDelay = (asyncDelay == null) ? Optional.<String>empty() : Optional.of(asyncDelay);
            return this;
        }

        public VolumeStats.Builder averageIOPSize(final Long averageIOPSize) {
            this.averageIOPSize = averageIOPSize;
            return this;
        }

        public VolumeStats.Builder burstIOPSCredit(final Long burstIOPSCredit) {
            this.burstIOPSCredit = burstIOPSCredit;
            return this;
        }

        public VolumeStats.Builder clientQueueDepth(final Long clientQueueDepth) {
            this.clientQueueDepth = clientQueueDepth;
            return this;
        }

        public VolumeStats.Builder desiredMetadataHosts(final MetadataHosts desiredMetadataHosts) {
            this.desiredMetadataHosts = desiredMetadataHosts;
            return this;
        }

        public VolumeStats.Builder latencyUSec(final Long latencyUSec) {
            this.latencyUSec = latencyUSec;
            return this;
        }

        public VolumeStats.Builder metadataHosts(final MetadataHosts metadataHosts) {
            this.metadataHosts = metadataHosts;
            return this;
        }

        public VolumeStats.Builder nonZeroBlocks(final Long nonZeroBlocks) {
            this.nonZeroBlocks = nonZeroBlocks;
            return this;
        }

        public VolumeStats.Builder readBytes(final Long readBytes) {
            this.readBytes = readBytes;
            return this;
        }

        public VolumeStats.Builder readLatencyUSec(final Long readLatencyUSec) {
            this.readLatencyUSec = readLatencyUSec;
            return this;
        }

        public VolumeStats.Builder readOps(final Long readOps) {
            this.readOps = readOps;
            return this;
        }

        public VolumeStats.Builder throttle(final Double throttle) {
            this.throttle = throttle;
            return this;
        }

        public VolumeStats.Builder timestamp(final String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public VolumeStats.Builder totalLatencyUSec(final Long totalLatencyUSec) {
            this.totalLatencyUSec = totalLatencyUSec;
            return this;
        }

        public VolumeStats.Builder unalignedReads(final Long unalignedReads) {
            this.unalignedReads = unalignedReads;
            return this;
        }

        public VolumeStats.Builder unalignedWrites(final Long unalignedWrites) {
            this.unalignedWrites = unalignedWrites;
            return this;
        }

        public VolumeStats.Builder volumeAccessGroups(final Long[] volumeAccessGroups) {
            this.volumeAccessGroups = volumeAccessGroups;
            return this;
        }

        public VolumeStats.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public VolumeStats.Builder volumeSize(final Long volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public VolumeStats.Builder volumeUtilization(final Double volumeUtilization) {
            this.volumeUtilization = volumeUtilization;
            return this;
        }

        public VolumeStats.Builder writeBytes(final Long writeBytes) {
            this.writeBytes = writeBytes;
            return this;
        }

        public VolumeStats.Builder writeLatencyUSec(final Long writeLatencyUSec) {
            this.writeLatencyUSec = writeLatencyUSec;
            return this;
        }

        public VolumeStats.Builder writeOps(final Long writeOps) {
            this.writeOps = writeOps;
            return this;
        }

        public VolumeStats.Builder zeroBlocks(final Long zeroBlocks) {
            this.zeroBlocks = zeroBlocks;
            return this;
        }

        public VolumeStats.Builder writeBytesLastSample(final Long writeBytesLastSample) {
            this.writeBytesLastSample = writeBytesLastSample;
            return this;
        }

        public VolumeStats.Builder samplePeriodMSec(final Long samplePeriodMSec) {
            this.samplePeriodMSec = samplePeriodMSec;
            return this;
        }

        public VolumeStats.Builder readBytesLastSample(final Long readBytesLastSample) {
            this.readBytesLastSample = readBytesLastSample;
            return this;
        }

        public VolumeStats.Builder readOpsLastSample(final Long readOpsLastSample) {
            this.readOpsLastSample = readOpsLastSample;
            return this;
        }

        public VolumeStats.Builder writeOpsLastSample(final Long writeOpsLastSample) {
            this.writeOpsLastSample = writeOpsLastSample;
            return this;
        }

        public VolumeStats.Builder virtualVolumeID(final java.util.UUID virtualVolumeID) {
            this.virtualVolumeID = virtualVolumeID;
            return this;
        }

    }
}
