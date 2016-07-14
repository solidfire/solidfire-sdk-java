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
 * Contains statistical data for an individual volume.
 **/
public class VolumeStats implements Serializable {

    private static final long serialVersionUID = 685872453L;

    @SerializedName("accountID") private final Long accountID;
    @SerializedName("actualIOPS") private final Long actualIOPS;
    @SerializedName("asyncDelay") private final Optional<String> asyncDelay;
    @SerializedName("averageIOPSize") private final Long averageIOPSize;
    @SerializedName("burstIOPSCredit") private final Long burstIOPSCredit;
    @SerializedName("clientQueueDepth") private final Long clientQueueDepth;
    @SerializedName("desiredMetadataHosts") private final MetadataHosts desiredMetadataHosts;
    @SerializedName("latencyUSec") private final Long latencyUSec;
    @SerializedName("metadataHosts") private final MetadataHosts metadataHosts;
    @SerializedName("nonZeroBlocks") private final Long nonZeroBlocks;
    @SerializedName("readBytes") private final Long readBytes;
    @SerializedName("readLatencyUSec") private final Long readLatencyUSec;
    @SerializedName("readOps") private final Long readOps;
    @SerializedName("throttle") private final Double throttle;
    @SerializedName("timestamp") private final String timestamp;
    @SerializedName("totalLatencyUSec") private final Long totalLatencyUSec;
    @SerializedName("unalignedReads") private final Long unalignedReads;
    @SerializedName("unalignedWrites") private final Long unalignedWrites;
    @SerializedName("volumeAccessGroups") private final Long[] volumeAccessGroups;
    @SerializedName("volumeID") private final Long volumeID;
    @SerializedName("volumeSize") private final Long volumeSize;
    @SerializedName("volumeUtilization") private final Double volumeUtilization;
    @SerializedName("writeBytes") private final Long writeBytes;
    @SerializedName("writeLatencyUSec") private final Long writeLatencyUSec;
    @SerializedName("writeOps") private final Long writeOps;
    @SerializedName("zeroBlocks") private final Long zeroBlocks;

    /**
     * Contains statistical data for an individual volume.
     * @param accountID [required] AccountID of the volume owner.
     * @param actualIOPS [required] Current actual IOPS to the volume in the last 500 milliseconds.
     * @param asyncDelay (optional) The length of time since the volume was last synced with the remote cluster.
     * @param averageIOPSize [required] Average size in bytes of recent I/O to the volume in the last 500 milliseconds.
     * @param burstIOPSCredit [required] The total number of IOP credits available to the user.
     * @param clientQueueDepth [required] The number of outstanding read and write operations to the cluster.
     * @param desiredMetadataHosts [required] The volume services being migrated to if the volume metadata is getting migrated between volume services.
     * @param latencyUSec [required] The observed latency time, in microseconds, to complete operations to a volume.<br/>
     * @param metadataHosts [required] The volume services on which the volume metadata resides.
     * @param nonZeroBlocks [required] The number of 4KiB blocks with data after the last garbage collection operation has completed.
     * @param readBytes [required] Total bytes read by clients.
     * @param readLatencyUSec [required] The average time, in microseconds, to complete read operations.
     * @param readOps [required] Total read operations.
     * @param throttle [required] A floating value between 0 and 1 that represents how much the system is throttling clients
     * @param timestamp [required] The current time in UTC.
     * @param totalLatencyUSec [required] The average time, in microseconds, to complete read and write operations to a volume.
     * @param unalignedReads [required] For 512e volumes, the number of read operations that were not on a 4k sector boundary.
     * @param unalignedWrites [required] For 512e volumes, the number of write operations that were not on a 4k sector boundary.
     * @param volumeAccessGroups [required] List of volume access group(s) to which a volume belongs.
     * @param volumeID [required] Volume ID of the volume.
     * @param volumeSize [required] Total provisioned capacity in bytes.
     * @param volumeUtilization [required] A floating value that describes how much the client is using the volume.
     * @param writeBytes [required] Total bytes written by clients.
     * @param writeLatencyUSec [required] The average time, in microseconds, to complete write operations.
     * @param writeOps [required] Total write operations occurring on the volume.
     * @param zeroBlocks [required] Total number of 4KiB blocks without data after the last round of garbage collection operation has completed.
     * @since 7.0
     **/
    @Since("7.0")
    public VolumeStats(Long accountID, Long actualIOPS, Optional<String> asyncDelay, Long averageIOPSize, Long burstIOPSCredit, Long clientQueueDepth, MetadataHosts desiredMetadataHosts, Long latencyUSec, MetadataHosts metadataHosts, Long nonZeroBlocks, Long readBytes, Long readLatencyUSec, Long readOps, Double throttle, String timestamp, Long totalLatencyUSec, Long unalignedReads, Long unalignedWrites, Long[] volumeAccessGroups, Long volumeID, Long volumeSize, Double volumeUtilization, Long writeBytes, Long writeLatencyUSec, Long writeOps, Long zeroBlocks) {
        this.writeOps = writeOps;
        this.totalLatencyUSec = totalLatencyUSec;
        this.volumeAccessGroups = volumeAccessGroups;
        this.unalignedWrites = unalignedWrites;
        this.timestamp = timestamp;
        this.readOps = readOps;
        this.nonZeroBlocks = nonZeroBlocks;
        this.burstIOPSCredit = burstIOPSCredit;
        this.metadataHosts = metadataHosts;
        this.writeBytes = writeBytes;
        this.asyncDelay = (asyncDelay == null) ? Optional.<String>empty() : asyncDelay;
        this.accountID = accountID;
        this.readLatencyUSec = readLatencyUSec;
        this.unalignedReads = unalignedReads;
        this.latencyUSec = latencyUSec;
        this.clientQueueDepth = clientQueueDepth;
        this.readBytes = readBytes;
        this.volumeUtilization = volumeUtilization;
        this.volumeID = volumeID;
        this.writeLatencyUSec = writeLatencyUSec;
        this.zeroBlocks = zeroBlocks;
        this.throttle = throttle;
        this.volumeSize = volumeSize;
        this.averageIOPSize = averageIOPSize;
        this.actualIOPS = actualIOPS;
        this.desiredMetadataHosts = desiredMetadataHosts;
    }


    /**
     * AccountID of the volume owner.
     **/
    public Long getAccountID() {
        return this.accountID;
    }

    /**
     * Current actual IOPS to the volume in the last 500 milliseconds.
     **/
    public Long getActualIOPS() {
        return this.actualIOPS;
    }

    /**
     * The length of time since the volume was last synced with the remote cluster.
     * If the volume is not paired, this is null.
     * <br/><br/>
     * <br/><b>Note</b>: A target volume in an active replication state always has an async delay of 0 (zero).
     * <br/>Target volumes are system-aware during replication and assume async delay is accurate at all times.
     **/
    public Optional<String> getAsyncDelay() {
        return this.asyncDelay;
    }

    /**
     * Average size in bytes of recent I/O to the volume in the last 500 milliseconds.
     **/
    public Long getAverageIOPSize() {
        return this.averageIOPSize;
    }

    /**
     * The total number of IOP credits available to the user.
     * When users are not using up to the max IOPS, credits are accrued.
     **/
    public Long getBurstIOPSCredit() {
        return this.burstIOPSCredit;
    }

    /**
     * The number of outstanding read and write operations to the cluster.
     **/
    public Long getClientQueueDepth() {
        return this.clientQueueDepth;
    }

    /**
     * The volume services being migrated to if the volume metadata is getting migrated between volume services.
     * A &quot;null&quot; value means the volume is not migrating.
     **/
    public MetadataHosts getDesiredMetadataHosts() {
        return this.desiredMetadataHosts;
    }

    /**
     * The observed latency time, in microseconds, to complete operations to a volume.<br/>
     * A &quot;0&quot; (zero) value means there is no I/O to the volume.
     **/
    public Long getLatencyUSec() {
        return this.latencyUSec;
    }

    /**
     * The volume services on which the volume metadata resides.
     **/
    public MetadataHosts getMetadataHosts() {
        return this.metadataHosts;
    }

    /**
     * The number of 4KiB blocks with data after the last garbage collection operation has completed.
     **/
    public Long getNonZeroBlocks() {
        return this.nonZeroBlocks;
    }

    /**
     * Total bytes read by clients.
     **/
    public Long getReadBytes() {
        return this.readBytes;
    }

    /**
     * The average time, in microseconds, to complete read operations.
     **/
    public Long getReadLatencyUSec() {
        return this.readLatencyUSec;
    }

    /**
     * Total read operations.
     **/
    public Long getReadOps() {
        return this.readOps;
    }

    /**
     * A floating value between 0 and 1 that represents how much the system is throttling clients
     * below their max IOPS because of re-replication of data, transient errors and snapshots taken.
     **/
    public Double getThrottle() {
        return this.throttle;
    }

    /**
     * The current time in UTC.
     **/
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * The average time, in microseconds, to complete read and write operations to a volume.
     **/
    public Long getTotalLatencyUSec() {
        return this.totalLatencyUSec;
    }

    /**
     * For 512e volumes, the number of read operations that were not on a 4k sector boundary.
     * High numbers of unaligned reads may indicate improper partition alignment.
     **/
    public Long getUnalignedReads() {
        return this.unalignedReads;
    }

    /**
     * For 512e volumes, the number of write operations that were not on a 4k sector boundary.
     * High numbers of unaligned writes may indicate improper partition alignment.
     **/
    public Long getUnalignedWrites() {
        return this.unalignedWrites;
    }

    /**
     * List of volume access group(s) to which a volume belongs.
     **/
    public Long[] getVolumeAccessGroups() {
        return this.volumeAccessGroups;
    }

    /**
     * Volume ID of the volume.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    /**
     * Total provisioned capacity in bytes.
     **/
    public Long getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * A floating value that describes how much the client is using the volume.
     * <br/><br/>
     * Values:<br/>
     *  0 = Client is not using the volume<br/>
     * 1 = Client is using their max<br/>
     * >1 = Client is using their burst
     **/
    public Double getVolumeUtilization() {
        return this.volumeUtilization;
    }

    /**
     * Total bytes written by clients.
     **/
    public Long getWriteBytes() {
        return this.writeBytes;
    }

    /**
     * The average time, in microseconds, to complete write operations.
     **/
    public Long getWriteLatencyUSec() {
        return this.writeLatencyUSec;
    }

    /**
     * Total write operations occurring on the volume.
     **/
    public Long getWriteOps() {
        return this.writeOps;
    }

    /**
     * Total number of 4KiB blocks without data after the last round of garbage collection operation has completed.
     **/
    public Long getZeroBlocks() {
        return this.zeroBlocks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumeStats that = (VolumeStats) o;
        

        return Objects.equals( accountID , that.accountID )
            && Objects.equals( actualIOPS , that.actualIOPS )
            && Objects.equals( asyncDelay , that.asyncDelay )
            && Objects.equals( averageIOPSize , that.averageIOPSize )
            && Objects.equals( burstIOPSCredit , that.burstIOPSCredit )
            && Objects.equals( clientQueueDepth , that.clientQueueDepth )
            && Objects.equals( desiredMetadataHosts , that.desiredMetadataHosts )
            && Objects.equals( latencyUSec , that.latencyUSec )
            && Objects.equals( metadataHosts , that.metadataHosts )
            && Objects.equals( nonZeroBlocks , that.nonZeroBlocks )
            && Objects.equals( readBytes , that.readBytes )
            && Objects.equals( readLatencyUSec , that.readLatencyUSec )
            && Objects.equals( readOps , that.readOps )
            && Objects.equals( throttle , that.throttle )
            && Objects.equals( timestamp , that.timestamp )
            && Objects.equals( totalLatencyUSec , that.totalLatencyUSec )
            && Objects.equals( unalignedReads , that.unalignedReads )
            && Objects.equals( unalignedWrites , that.unalignedWrites )
            && Objects.deepEquals( volumeAccessGroups , that.volumeAccessGroups )
            && Objects.equals( volumeID , that.volumeID )
            && Objects.equals( volumeSize , that.volumeSize )
            && Objects.equals( volumeUtilization , that.volumeUtilization )
            && Objects.equals( writeBytes , that.writeBytes )
            && Objects.equals( writeLatencyUSec , that.writeLatencyUSec )
            && Objects.equals( writeOps , that.writeOps )
            && Objects.equals( zeroBlocks , that.zeroBlocks );
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID, actualIOPS, asyncDelay, averageIOPSize, burstIOPSCredit, clientQueueDepth, desiredMetadataHosts, latencyUSec, metadataHosts, nonZeroBlocks, readBytes, readLatencyUSec, readOps, throttle, timestamp, totalLatencyUSec, unalignedReads, unalignedWrites, volumeAccessGroups, volumeID, volumeSize, volumeUtilization, writeBytes, writeLatencyUSec, writeOps, zeroBlocks );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" accountID : ").append(accountID).append(",");
        sb.append(" actualIOPS : ").append(actualIOPS).append(",");
        if(null != asyncDelay && asyncDelay.isPresent())
            sb.append(" asyncDelay : ").append(asyncDelay.get()).append(",");
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
        sb.append(" zeroBlocks : ").append(zeroBlocks);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
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
                         this.zeroBlocks            );
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

    }

}
