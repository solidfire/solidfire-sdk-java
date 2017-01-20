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
 * ClusterCapacity  
 * High level capacity measurements for the entire cluster.
 **/

public class ClusterCapacity implements Serializable {

    public static final long serialVersionUID = -1078626393079794539L;
    @SerializedName("activeBlockSpace") private Long activeBlockSpace;
    @SerializedName("activeSessions") private Long activeSessions;
    @SerializedName("averageIOPS") private Long averageIOPS;
    @SerializedName("clusterRecentIOSize") private Long clusterRecentIOSize;
    @SerializedName("currentIOPS") private Long currentIOPS;
    @SerializedName("maxIOPS") private Long maxIOPS;
    @SerializedName("maxOverProvisionableSpace") private Long maxOverProvisionableSpace;
    @SerializedName("maxProvisionedSpace") private Long maxProvisionedSpace;
    @SerializedName("maxUsedMetadataSpace") private Long maxUsedMetadataSpace;
    @SerializedName("maxUsedSpace") private Long maxUsedSpace;
    @SerializedName("nonZeroBlocks") private Long nonZeroBlocks;
    @SerializedName("peakActiveSessions") private Long peakActiveSessions;
    @SerializedName("peakIOPS") private Long peakIOPS;
    @SerializedName("provisionedSpace") private Long provisionedSpace;
    @SerializedName("snapshotNonZeroBlocks") private Long snapshotNonZeroBlocks;
    @SerializedName("timestamp") private String timestamp;
    @SerializedName("totalOps") private Long totalOps;
    @SerializedName("uniqueBlocks") private Long uniqueBlocks;
    @SerializedName("uniqueBlocksUsedSpace") private Long uniqueBlocksUsedSpace;
    @SerializedName("usedMetadataSpace") private Long usedMetadataSpace;
    @SerializedName("usedMetadataSpaceInSnapshots") private Long usedMetadataSpaceInSnapshots;
    @SerializedName("usedSpace") private Long usedSpace;
    @SerializedName("zeroBlocks") private Long zeroBlocks;

    // empty constructor
    @Since("7.0")
    public ClusterCapacity() {}

    
    // parameterized constructor
    @Since("7.0")
    public ClusterCapacity(
        Long activeBlockSpace,
        Long activeSessions,
        Long averageIOPS,
        Long clusterRecentIOSize,
        Long currentIOPS,
        Long maxIOPS,
        Long maxOverProvisionableSpace,
        Long maxProvisionedSpace,
        Long maxUsedMetadataSpace,
        Long maxUsedSpace,
        Long nonZeroBlocks,
        Long peakActiveSessions,
        Long peakIOPS,
        Long provisionedSpace,
        String timestamp,
        Long totalOps,
        Long uniqueBlocks,
        Long uniqueBlocksUsedSpace,
        Long usedMetadataSpace,
        Long usedMetadataSpaceInSnapshots,
        Long usedSpace,
        Long zeroBlocks
    )
    {
        this.activeBlockSpace = activeBlockSpace;
        this.activeSessions = activeSessions;
        this.averageIOPS = averageIOPS;
        this.clusterRecentIOSize = clusterRecentIOSize;
        this.currentIOPS = currentIOPS;
        this.maxIOPS = maxIOPS;
        this.maxOverProvisionableSpace = maxOverProvisionableSpace;
        this.maxProvisionedSpace = maxProvisionedSpace;
        this.maxUsedMetadataSpace = maxUsedMetadataSpace;
        this.maxUsedSpace = maxUsedSpace;
        this.nonZeroBlocks = nonZeroBlocks;
        this.peakActiveSessions = peakActiveSessions;
        this.peakIOPS = peakIOPS;
        this.provisionedSpace = provisionedSpace;
        this.timestamp = timestamp;
        this.totalOps = totalOps;
        this.uniqueBlocks = uniqueBlocks;
        this.uniqueBlocksUsedSpace = uniqueBlocksUsedSpace;
        this.usedMetadataSpace = usedMetadataSpace;
        this.usedMetadataSpaceInSnapshots = usedMetadataSpaceInSnapshots;
        this.usedSpace = usedSpace;
        this.zeroBlocks = zeroBlocks;
    }
    // parameterized constructor
    @Since("8.0")
    public ClusterCapacity(
        Long activeBlockSpace,
        Long activeSessions,
        Long averageIOPS,
        Long clusterRecentIOSize,
        Long currentIOPS,
        Long maxIOPS,
        Long maxOverProvisionableSpace,
        Long maxProvisionedSpace,
        Long maxUsedMetadataSpace,
        Long maxUsedSpace,
        Long nonZeroBlocks,
        Long peakActiveSessions,
        Long peakIOPS,
        Long provisionedSpace,
        Long snapshotNonZeroBlocks,
        String timestamp,
        Long totalOps,
        Long uniqueBlocks,
        Long uniqueBlocksUsedSpace,
        Long usedMetadataSpace,
        Long usedMetadataSpaceInSnapshots,
        Long usedSpace,
        Long zeroBlocks
    )
    {
        this.activeBlockSpace = activeBlockSpace;
        this.activeSessions = activeSessions;
        this.averageIOPS = averageIOPS;
        this.clusterRecentIOSize = clusterRecentIOSize;
        this.currentIOPS = currentIOPS;
        this.maxIOPS = maxIOPS;
        this.maxOverProvisionableSpace = maxOverProvisionableSpace;
        this.maxProvisionedSpace = maxProvisionedSpace;
        this.maxUsedMetadataSpace = maxUsedMetadataSpace;
        this.maxUsedSpace = maxUsedSpace;
        this.nonZeroBlocks = nonZeroBlocks;
        this.peakActiveSessions = peakActiveSessions;
        this.peakIOPS = peakIOPS;
        this.provisionedSpace = provisionedSpace;
        this.snapshotNonZeroBlocks = snapshotNonZeroBlocks;
        this.timestamp = timestamp;
        this.totalOps = totalOps;
        this.uniqueBlocks = uniqueBlocks;
        this.uniqueBlocksUsedSpace = uniqueBlocksUsedSpace;
        this.usedMetadataSpace = usedMetadataSpace;
        this.usedMetadataSpaceInSnapshots = usedMetadataSpaceInSnapshots;
        this.usedSpace = usedSpace;
        this.zeroBlocks = zeroBlocks;
    }

    /** 
     * The amount of space on the block drives.
     * This includes additional information such as metadata entries and space which can be cleaned up.
     **/
    public Long getActiveBlockSpace() { return this.activeBlockSpace; }
    public void setActiveBlockSpace(Long activeBlockSpace) { 
        this.activeBlockSpace = activeBlockSpace;
    }
    /** 
     * Number of active iSCSI sessions communicating with the cluster
     **/
    public Long getActiveSessions() { return this.activeSessions; }
    public void setActiveSessions(Long activeSessions) { 
        this.activeSessions = activeSessions;
    }
    /** 
     * Average IPS for the cluster since midnight Coordinated Universal Time (UTC).
     **/
    public Long getAverageIOPS() { return this.averageIOPS; }
    public void setAverageIOPS(Long averageIOPS) { 
        this.averageIOPS = averageIOPS;
    }
    /** 
     * The average size of IOPS to all volumes in the cluster.
     **/
    public Long getClusterRecentIOSize() { return this.clusterRecentIOSize; }
    public void setClusterRecentIOSize(Long clusterRecentIOSize) { 
        this.clusterRecentIOSize = clusterRecentIOSize;
    }
    /** 
     * Average IOPS for all volumes in the cluster over the last 5 seconds.
     **/
    public Long getCurrentIOPS() { return this.currentIOPS; }
    public void setCurrentIOPS(Long currentIOPS) { 
        this.currentIOPS = currentIOPS;
    }
    /** 
     * Estimated maximum IOPS capability of the current cluster.
     **/
    public Long getMaxIOPS() { return this.maxIOPS; }
    public void setMaxIOPS(Long maxIOPS) { 
        this.maxIOPS = maxIOPS;
    }
    /** 
     * The maximum amount of provisionable space.
     * This is a computed value.
     * You cannot create new volumes if the current provisioned space plus the new volume size would exceed this number:
     * maxOverProvisionableSpace = maxProvisionedSpace * GetClusterFull
     **/
    public Long getMaxOverProvisionableSpace() { return this.maxOverProvisionableSpace; }
    public void setMaxOverProvisionableSpace(Long maxOverProvisionableSpace) { 
        this.maxOverProvisionableSpace = maxOverProvisionableSpace;
    }
    /** 
     * The total amount of provisionable space if all volumes are 100% filled (no thin provisioned metadata).
     **/
    public Long getMaxProvisionedSpace() { return this.maxProvisionedSpace; }
    public void setMaxProvisionedSpace(Long maxProvisionedSpace) { 
        this.maxProvisionedSpace = maxProvisionedSpace;
    }
    /** 
     * The amount of bytes on volume drives used to store metadata.
     **/
    public Long getMaxUsedMetadataSpace() { return this.maxUsedMetadataSpace; }
    public void setMaxUsedMetadataSpace(Long maxUsedMetadataSpace) { 
        this.maxUsedMetadataSpace = maxUsedMetadataSpace;
    }
    /** 
     * The total amount of space on all active block drives.
     **/
    public Long getMaxUsedSpace() { return this.maxUsedSpace; }
    public void setMaxUsedSpace(Long maxUsedSpace) { 
        this.maxUsedSpace = maxUsedSpace;
    }
    /** 
     * Total number of 4KiB blocks with data after the last garbage collection operation has completed.
     **/
    public Long getNonZeroBlocks() { return this.nonZeroBlocks; }
    public void setNonZeroBlocks(Long nonZeroBlocks) { 
        this.nonZeroBlocks = nonZeroBlocks;
    }
    /** 
     * Peak number of iSCSI connections since midnight UTC.
     **/
    public Long getPeakActiveSessions() { return this.peakActiveSessions; }
    public void setPeakActiveSessions(Long peakActiveSessions) { 
        this.peakActiveSessions = peakActiveSessions;
    }
    /** 
     * The highest value for currentIOPS since midnight UTC.
     **/
    public Long getPeakIOPS() { return this.peakIOPS; }
    public void setPeakIOPS(Long peakIOPS) { 
        this.peakIOPS = peakIOPS;
    }
    /** 
     * Total amount of space provisioned in all volumes on the cluster.
     **/
    public Long getProvisionedSpace() { return this.provisionedSpace; }
    public void setProvisionedSpace(Long provisionedSpace) { 
        this.provisionedSpace = provisionedSpace;
    }
    /** 
     * Total number of 4KiB blocks in snapshots with data.
     **/
    public Long getSnapshotNonZeroBlocks() { return this.snapshotNonZeroBlocks; }
    public void setSnapshotNonZeroBlocks(Long snapshotNonZeroBlocks) { 
        this.snapshotNonZeroBlocks = snapshotNonZeroBlocks;
    }
    /** 
     * The date and time this cluster capacity sample was taken.
     **/
    public String getTimestamp() { return this.timestamp; }
    public void setTimestamp(String timestamp) { 
        this.timestamp = timestamp;
    }
    /** 
     * The total number of I/O operations performed throughout the lifetime of the cluster
     **/
    public Long getTotalOps() { return this.totalOps; }
    public void setTotalOps(Long totalOps) { 
        this.totalOps = totalOps;
    }
    /** 
     * The total number of blocks stored on the block drives.
     * The value includes replicated blocks.
     **/
    public Long getUniqueBlocks() { return this.uniqueBlocks; }
    public void setUniqueBlocks(Long uniqueBlocks) { 
        this.uniqueBlocks = uniqueBlocks;
    }
    /** 
     * The total amount of data the uniqueBlocks take up on the block drives.
     * This number is always consistent with the uniqueBlocks value.
     **/
    public Long getUniqueBlocksUsedSpace() { return this.uniqueBlocksUsedSpace; }
    public void setUniqueBlocksUsedSpace(Long uniqueBlocksUsedSpace) { 
        this.uniqueBlocksUsedSpace = uniqueBlocksUsedSpace;
    }
    /** 
     * The total amount of bytes on volume drives used to store metadata
     **/
    public Long getUsedMetadataSpace() { return this.usedMetadataSpace; }
    public void setUsedMetadataSpace(Long usedMetadataSpace) { 
        this.usedMetadataSpace = usedMetadataSpace;
    }
    /** 
     * The amount of bytes on volume drives used for storing unique data in snapshots.
     * This number provides an estimate of how much metadata space would be regained by deleting all snapshots on the system.
     **/
    public Long getUsedMetadataSpaceInSnapshots() { return this.usedMetadataSpaceInSnapshots; }
    public void setUsedMetadataSpaceInSnapshots(Long usedMetadataSpaceInSnapshots) { 
        this.usedMetadataSpaceInSnapshots = usedMetadataSpaceInSnapshots;
    }
    /** 
     * Total amount of space used by all block drives in the system.
     **/
    public Long getUsedSpace() { return this.usedSpace; }
    public void setUsedSpace(Long usedSpace) { 
        this.usedSpace = usedSpace;
    }
    /** 
     * Total number of 4KiB blocks without data after the last round of garabage collection operation has completed.
     **/
    public Long getZeroBlocks() { return this.zeroBlocks; }
    public void setZeroBlocks(Long zeroBlocks) { 
        this.zeroBlocks = zeroBlocks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterCapacity that = (ClusterCapacity) o;

        return 
            Objects.equals(activeBlockSpace, that.activeBlockSpace) && 
            Objects.equals(activeSessions, that.activeSessions) && 
            Objects.equals(averageIOPS, that.averageIOPS) && 
            Objects.equals(clusterRecentIOSize, that.clusterRecentIOSize) && 
            Objects.equals(currentIOPS, that.currentIOPS) && 
            Objects.equals(maxIOPS, that.maxIOPS) && 
            Objects.equals(maxOverProvisionableSpace, that.maxOverProvisionableSpace) && 
            Objects.equals(maxProvisionedSpace, that.maxProvisionedSpace) && 
            Objects.equals(maxUsedMetadataSpace, that.maxUsedMetadataSpace) && 
            Objects.equals(maxUsedSpace, that.maxUsedSpace) && 
            Objects.equals(nonZeroBlocks, that.nonZeroBlocks) && 
            Objects.equals(peakActiveSessions, that.peakActiveSessions) && 
            Objects.equals(peakIOPS, that.peakIOPS) && 
            Objects.equals(provisionedSpace, that.provisionedSpace) && 
            Objects.equals(snapshotNonZeroBlocks, that.snapshotNonZeroBlocks) && 
            Objects.equals(timestamp, that.timestamp) && 
            Objects.equals(totalOps, that.totalOps) && 
            Objects.equals(uniqueBlocks, that.uniqueBlocks) && 
            Objects.equals(uniqueBlocksUsedSpace, that.uniqueBlocksUsedSpace) && 
            Objects.equals(usedMetadataSpace, that.usedMetadataSpace) && 
            Objects.equals(usedMetadataSpaceInSnapshots, that.usedMetadataSpaceInSnapshots) && 
            Objects.equals(usedSpace, that.usedSpace) && 
            Objects.equals(zeroBlocks, that.zeroBlocks);
    }

    @Override
    public int hashCode() {
        return Objects.hash( activeBlockSpace,activeSessions,averageIOPS,clusterRecentIOSize,currentIOPS,maxIOPS,maxOverProvisionableSpace,maxProvisionedSpace,maxUsedMetadataSpace,maxUsedSpace,nonZeroBlocks,peakActiveSessions,peakIOPS,provisionedSpace,snapshotNonZeroBlocks,timestamp,totalOps,uniqueBlocks,uniqueBlocksUsedSpace,usedMetadataSpace,usedMetadataSpaceInSnapshots,usedSpace,zeroBlocks );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("activeBlockSpace", activeBlockSpace);
        map.put("activeSessions", activeSessions);
        map.put("averageIOPS", averageIOPS);
        map.put("clusterRecentIOSize", clusterRecentIOSize);
        map.put("currentIOPS", currentIOPS);
        map.put("maxIOPS", maxIOPS);
        map.put("maxOverProvisionableSpace", maxOverProvisionableSpace);
        map.put("maxProvisionedSpace", maxProvisionedSpace);
        map.put("maxUsedMetadataSpace", maxUsedMetadataSpace);
        map.put("maxUsedSpace", maxUsedSpace);
        map.put("nonZeroBlocks", nonZeroBlocks);
        map.put("peakActiveSessions", peakActiveSessions);
        map.put("peakIOPS", peakIOPS);
        map.put("provisionedSpace", provisionedSpace);
        map.put("snapshotNonZeroBlocks", snapshotNonZeroBlocks);
        map.put("timestamp", timestamp);
        map.put("totalOps", totalOps);
        map.put("uniqueBlocks", uniqueBlocks);
        map.put("uniqueBlocksUsedSpace", uniqueBlocksUsedSpace);
        map.put("usedMetadataSpace", usedMetadataSpace);
        map.put("usedMetadataSpaceInSnapshots", usedMetadataSpaceInSnapshots);
        map.put("usedSpace", usedSpace);
        map.put("zeroBlocks", zeroBlocks);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" activeBlockSpace : ").append(activeBlockSpace).append(",");
        sb.append(" activeSessions : ").append(activeSessions).append(",");
        sb.append(" averageIOPS : ").append(averageIOPS).append(",");
        sb.append(" clusterRecentIOSize : ").append(clusterRecentIOSize).append(",");
        sb.append(" currentIOPS : ").append(currentIOPS).append(",");
        sb.append(" maxIOPS : ").append(maxIOPS).append(",");
        sb.append(" maxOverProvisionableSpace : ").append(maxOverProvisionableSpace).append(",");
        sb.append(" maxProvisionedSpace : ").append(maxProvisionedSpace).append(",");
        sb.append(" maxUsedMetadataSpace : ").append(maxUsedMetadataSpace).append(",");
        sb.append(" maxUsedSpace : ").append(maxUsedSpace).append(",");
        sb.append(" nonZeroBlocks : ").append(nonZeroBlocks).append(",");
        sb.append(" peakActiveSessions : ").append(peakActiveSessions).append(",");
        sb.append(" peakIOPS : ").append(peakIOPS).append(",");
        sb.append(" provisionedSpace : ").append(provisionedSpace).append(",");
        sb.append(" snapshotNonZeroBlocks : ").append(snapshotNonZeroBlocks).append(",");
        sb.append(" timestamp : ").append(timestamp).append(",");
        sb.append(" totalOps : ").append(totalOps).append(",");
        sb.append(" uniqueBlocks : ").append(uniqueBlocks).append(",");
        sb.append(" uniqueBlocksUsedSpace : ").append(uniqueBlocksUsedSpace).append(",");
        sb.append(" usedMetadataSpace : ").append(usedMetadataSpace).append(",");
        sb.append(" usedMetadataSpaceInSnapshots : ").append(usedMetadataSpaceInSnapshots).append(",");
        sb.append(" usedSpace : ").append(usedSpace).append(",");
        sb.append(" zeroBlocks : ").append(zeroBlocks).append(",");
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
        private Long activeBlockSpace;
        private Long activeSessions;
        private Long averageIOPS;
        private Long clusterRecentIOSize;
        private Long currentIOPS;
        private Long maxIOPS;
        private Long maxOverProvisionableSpace;
        private Long maxProvisionedSpace;
        private Long maxUsedMetadataSpace;
        private Long maxUsedSpace;
        private Long nonZeroBlocks;
        private Long peakActiveSessions;
        private Long peakIOPS;
        private Long provisionedSpace;
        private Long snapshotNonZeroBlocks;
        private String timestamp;
        private Long totalOps;
        private Long uniqueBlocks;
        private Long uniqueBlocksUsedSpace;
        private Long usedMetadataSpace;
        private Long usedMetadataSpaceInSnapshots;
        private Long usedSpace;
        private Long zeroBlocks;

        private Builder() { }

        public ClusterCapacity build() {
            return new ClusterCapacity (
                         this.activeBlockSpace,
                         this.activeSessions,
                         this.averageIOPS,
                         this.clusterRecentIOSize,
                         this.currentIOPS,
                         this.maxIOPS,
                         this.maxOverProvisionableSpace,
                         this.maxProvisionedSpace,
                         this.maxUsedMetadataSpace,
                         this.maxUsedSpace,
                         this.nonZeroBlocks,
                         this.peakActiveSessions,
                         this.peakIOPS,
                         this.provisionedSpace,
                         this.snapshotNonZeroBlocks,
                         this.timestamp,
                         this.totalOps,
                         this.uniqueBlocks,
                         this.uniqueBlocksUsedSpace,
                         this.usedMetadataSpace,
                         this.usedMetadataSpaceInSnapshots,
                         this.usedSpace,
                         this.zeroBlocks);
        }

        private ClusterCapacity.Builder buildFrom(final ClusterCapacity req) {
            this.activeBlockSpace = req.activeBlockSpace;
            this.activeSessions = req.activeSessions;
            this.averageIOPS = req.averageIOPS;
            this.clusterRecentIOSize = req.clusterRecentIOSize;
            this.currentIOPS = req.currentIOPS;
            this.maxIOPS = req.maxIOPS;
            this.maxOverProvisionableSpace = req.maxOverProvisionableSpace;
            this.maxProvisionedSpace = req.maxProvisionedSpace;
            this.maxUsedMetadataSpace = req.maxUsedMetadataSpace;
            this.maxUsedSpace = req.maxUsedSpace;
            this.nonZeroBlocks = req.nonZeroBlocks;
            this.peakActiveSessions = req.peakActiveSessions;
            this.peakIOPS = req.peakIOPS;
            this.provisionedSpace = req.provisionedSpace;
            this.snapshotNonZeroBlocks = req.snapshotNonZeroBlocks;
            this.timestamp = req.timestamp;
            this.totalOps = req.totalOps;
            this.uniqueBlocks = req.uniqueBlocks;
            this.uniqueBlocksUsedSpace = req.uniqueBlocksUsedSpace;
            this.usedMetadataSpace = req.usedMetadataSpace;
            this.usedMetadataSpaceInSnapshots = req.usedMetadataSpaceInSnapshots;
            this.usedSpace = req.usedSpace;
            this.zeroBlocks = req.zeroBlocks;

            return this;
        }

        public ClusterCapacity.Builder activeBlockSpace(final Long activeBlockSpace) {
            this.activeBlockSpace = activeBlockSpace;
            return this;
        }

        public ClusterCapacity.Builder activeSessions(final Long activeSessions) {
            this.activeSessions = activeSessions;
            return this;
        }

        public ClusterCapacity.Builder averageIOPS(final Long averageIOPS) {
            this.averageIOPS = averageIOPS;
            return this;
        }

        public ClusterCapacity.Builder clusterRecentIOSize(final Long clusterRecentIOSize) {
            this.clusterRecentIOSize = clusterRecentIOSize;
            return this;
        }

        public ClusterCapacity.Builder currentIOPS(final Long currentIOPS) {
            this.currentIOPS = currentIOPS;
            return this;
        }

        public ClusterCapacity.Builder maxIOPS(final Long maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }

        public ClusterCapacity.Builder maxOverProvisionableSpace(final Long maxOverProvisionableSpace) {
            this.maxOverProvisionableSpace = maxOverProvisionableSpace;
            return this;
        }

        public ClusterCapacity.Builder maxProvisionedSpace(final Long maxProvisionedSpace) {
            this.maxProvisionedSpace = maxProvisionedSpace;
            return this;
        }

        public ClusterCapacity.Builder maxUsedMetadataSpace(final Long maxUsedMetadataSpace) {
            this.maxUsedMetadataSpace = maxUsedMetadataSpace;
            return this;
        }

        public ClusterCapacity.Builder maxUsedSpace(final Long maxUsedSpace) {
            this.maxUsedSpace = maxUsedSpace;
            return this;
        }

        public ClusterCapacity.Builder nonZeroBlocks(final Long nonZeroBlocks) {
            this.nonZeroBlocks = nonZeroBlocks;
            return this;
        }

        public ClusterCapacity.Builder peakActiveSessions(final Long peakActiveSessions) {
            this.peakActiveSessions = peakActiveSessions;
            return this;
        }

        public ClusterCapacity.Builder peakIOPS(final Long peakIOPS) {
            this.peakIOPS = peakIOPS;
            return this;
        }

        public ClusterCapacity.Builder provisionedSpace(final Long provisionedSpace) {
            this.provisionedSpace = provisionedSpace;
            return this;
        }

        public ClusterCapacity.Builder snapshotNonZeroBlocks(final Long snapshotNonZeroBlocks) {
            this.snapshotNonZeroBlocks = snapshotNonZeroBlocks;
            return this;
        }

        public ClusterCapacity.Builder timestamp(final String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ClusterCapacity.Builder totalOps(final Long totalOps) {
            this.totalOps = totalOps;
            return this;
        }

        public ClusterCapacity.Builder uniqueBlocks(final Long uniqueBlocks) {
            this.uniqueBlocks = uniqueBlocks;
            return this;
        }

        public ClusterCapacity.Builder uniqueBlocksUsedSpace(final Long uniqueBlocksUsedSpace) {
            this.uniqueBlocksUsedSpace = uniqueBlocksUsedSpace;
            return this;
        }

        public ClusterCapacity.Builder usedMetadataSpace(final Long usedMetadataSpace) {
            this.usedMetadataSpace = usedMetadataSpace;
            return this;
        }

        public ClusterCapacity.Builder usedMetadataSpaceInSnapshots(final Long usedMetadataSpaceInSnapshots) {
            this.usedMetadataSpaceInSnapshots = usedMetadataSpaceInSnapshots;
            return this;
        }

        public ClusterCapacity.Builder usedSpace(final Long usedSpace) {
            this.usedSpace = usedSpace;
            return this;
        }

        public ClusterCapacity.Builder zeroBlocks(final Long zeroBlocks) {
            this.zeroBlocks = zeroBlocks;
            return this;
        }

    }
}
