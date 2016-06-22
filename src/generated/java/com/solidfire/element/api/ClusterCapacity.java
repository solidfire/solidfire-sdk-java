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
 * High level capacity measurements for the entire cluster.
 **/
public class ClusterCapacity implements Serializable {

    private static final long serialVersionUID = 521310811L;

    @SerializedName("activeBlockSpace") private final long activeBlockSpace;
    @SerializedName("activeSessions") private final long activeSessions;
    @SerializedName("averageIOPS") private final long averageIOPS;
    @SerializedName("clusterRecentIOSize") private final long clusterRecentIOSize;
    @SerializedName("currentIOPS") private final long currentIOPS;
    @SerializedName("maxIOPS") private final long maxIOPS;
    @SerializedName("maxOverProvisionableSpace") private final long maxOverProvisionableSpace;
    @SerializedName("maxProvisionedSpace") private final long maxProvisionedSpace;
    @SerializedName("maxUsedMetadataSpace") private final long maxUsedMetadataSpace;
    @SerializedName("maxUsedSpace") private final long maxUsedSpace;
    @SerializedName("nonZeroBlocks") private final long nonZeroBlocks;
    @SerializedName("peakActiveSessions") private final long peakActiveSessions;
    @SerializedName("peakIOPS") private final long peakIOPS;
    @SerializedName("provisionedSpace") private final long provisionedSpace;
    @SerializedName("snapshotNonZeroBlocks") private final long snapshotNonZeroBlocks;
    @SerializedName("timestamp") private final String timestamp;
    @SerializedName("totalOps") private final long totalOps;
    @SerializedName("uniqueBlocks") private final long uniqueBlocks;
    @SerializedName("uniqueBlocksUsedSpace") private final long uniqueBlocksUsedSpace;
    @SerializedName("usedMetadataSpace") private final long usedMetadataSpace;
    @SerializedName("usedMetadataSpaceInSnapshots") private final long usedMetadataSpaceInSnapshots;
    @SerializedName("usedSpace") private final long usedSpace;
    @SerializedName("zeroBlocks") private final long zeroBlocks;

    /**
     * High level capacity measurements for the entire cluster.
     * @param activeBlockSpace [required] The amount of space on the block drives.
     * @param activeSessions [required] Number of active iSCSI sessions communicating with the cluster
     * @param averageIOPS [required] Average IPS for the cluster since midnight Coordinated Universal Time (UTC).
     * @param clusterRecentIOSize [required] The average size of IOPS to all volumes in the cluster.
     * @param currentIOPS [required] Average IOPS for all volumes in the cluster over the last 5 seconds.
     * @param maxIOPS [required] Estimated maximum IOPS capability of the current cluster.
     * @param maxOverProvisionableSpace [required] The maximum amount of provisionable space.
     * @param maxProvisionedSpace [required] The total amount of provisionable space if all volumes are 100% filled (no thin provisioned metadata).
     * @param maxUsedMetadataSpace [required] The amount of bytes on volume drives used to store metadata.
     * @param maxUsedSpace [required] The total amount of space on all active block drives.
     * @param nonZeroBlocks [required] Total number of 4KiB blocks with data after the last garbage collection operation has completed.
     * @param peakActiveSessions [required] Peak number of iSCSI connections since midnight UTC.
     * @param peakIOPS [required] The highest value for currentIOPS since midnight UTC.
     * @param provisionedSpace [required] Total amount of space provisioned in all volumes on the cluster.
     * @param timestamp [required] The date and time this cluster capacity sample was taken.
     * @param totalOps [required] The total number of I/O operations performed throughout the lifetime of the cluster
     * @param uniqueBlocks [required] The total number of blocks stored on the block drives.
     * @param uniqueBlocksUsedSpace [required] The total amount of data the uniqueBlocks take up on the block drives.
     * @param usedMetadataSpace [required] The total amount of bytes on volume drives used to store metadata
     * @param usedMetadataSpaceInSnapshots [required] The amount of bytes on volume drives used for storing unique data in snapshots.
     * @param usedSpace [required] Total amount of space used by all block drives in the system.
     * @param zeroBlocks [required] Total number of 4KiB blocks without data after the last round of garabage collection operation has completed.
     * @since 7.0
     **/
    @Since("7.0")
    public ClusterCapacity(long activeBlockSpace, long activeSessions, long averageIOPS, long clusterRecentIOSize, long currentIOPS, long maxIOPS, long maxOverProvisionableSpace, long maxProvisionedSpace, long maxUsedMetadataSpace, long maxUsedSpace, long nonZeroBlocks, long peakActiveSessions, long peakIOPS, long provisionedSpace, String timestamp, long totalOps, long uniqueBlocks, long uniqueBlocksUsedSpace, long usedMetadataSpace, long usedMetadataSpaceInSnapshots, long usedSpace, long zeroBlocks) {
        this.usedMetadataSpaceInSnapshots = usedMetadataSpaceInSnapshots;
        this.maxUsedMetadataSpace = maxUsedMetadataSpace;
        this.activeBlockSpace = activeBlockSpace;
        this.totalOps = totalOps;
        this.usedSpace = usedSpace;
        this.activeSessions = activeSessions;
        this.timestamp = timestamp;
        this.nonZeroBlocks = nonZeroBlocks;
        this.peakActiveSessions = peakActiveSessions;
        this.maxOverProvisionableSpace = maxOverProvisionableSpace;
        this.provisionedSpace = provisionedSpace;
        this.peakIOPS = peakIOPS;
        this.maxProvisionedSpace = maxProvisionedSpace;
        this.maxIOPS = maxIOPS;
        this.currentIOPS = currentIOPS;
        this.clusterRecentIOSize = clusterRecentIOSize;
        this.snapshotNonZeroBlocks = 0;
        this.zeroBlocks = zeroBlocks;
        this.maxUsedSpace = maxUsedSpace;
        this.usedMetadataSpace = usedMetadataSpace;
        this.uniqueBlocksUsedSpace = uniqueBlocksUsedSpace;
        this.averageIOPS = averageIOPS;
        this.uniqueBlocks = uniqueBlocks;
    }

    /**
     * High level capacity measurements for the entire cluster.
     * @param activeBlockSpace [required] The amount of space on the block drives.
     * @param activeSessions [required] Number of active iSCSI sessions communicating with the cluster
     * @param averageIOPS [required] Average IPS for the cluster since midnight Coordinated Universal Time (UTC).
     * @param clusterRecentIOSize [required] The average size of IOPS to all volumes in the cluster.
     * @param currentIOPS [required] Average IOPS for all volumes in the cluster over the last 5 seconds.
     * @param maxIOPS [required] Estimated maximum IOPS capability of the current cluster.
     * @param maxOverProvisionableSpace [required] The maximum amount of provisionable space.
     * @param maxProvisionedSpace [required] The total amount of provisionable space if all volumes are 100% filled (no thin provisioned metadata).
     * @param maxUsedMetadataSpace [required] The amount of bytes on volume drives used to store metadata.
     * @param maxUsedSpace [required] The total amount of space on all active block drives.
     * @param nonZeroBlocks [required] Total number of 4KiB blocks with data after the last garbage collection operation has completed.
     * @param peakActiveSessions [required] Peak number of iSCSI connections since midnight UTC.
     * @param peakIOPS [required] The highest value for currentIOPS since midnight UTC.
     * @param provisionedSpace [required] Total amount of space provisioned in all volumes on the cluster.
     * @param snapshotNonZeroBlocks [required] Total number of 4KiB blocks in snapshots with data.
     * @param timestamp [required] The date and time this cluster capacity sample was taken.
     * @param totalOps [required] The total number of I/O operations performed throughout the lifetime of the cluster
     * @param uniqueBlocks [required] The total number of blocks stored on the block drives.
     * @param uniqueBlocksUsedSpace [required] The total amount of data the uniqueBlocks take up on the block drives.
     * @param usedMetadataSpace [required] The total amount of bytes on volume drives used to store metadata
     * @param usedMetadataSpaceInSnapshots [required] The amount of bytes on volume drives used for storing unique data in snapshots.
     * @param usedSpace [required] Total amount of space used by all block drives in the system.
     * @param zeroBlocks [required] Total number of 4KiB blocks without data after the last round of garabage collection operation has completed.
     * @since 8.0
     **/
    @Since("8.0")
    public ClusterCapacity(long activeBlockSpace, long activeSessions, long averageIOPS, long clusterRecentIOSize, long currentIOPS, long maxIOPS, long maxOverProvisionableSpace, long maxProvisionedSpace, long maxUsedMetadataSpace, long maxUsedSpace, long nonZeroBlocks, long peakActiveSessions, long peakIOPS, long provisionedSpace, long snapshotNonZeroBlocks, String timestamp, long totalOps, long uniqueBlocks, long uniqueBlocksUsedSpace, long usedMetadataSpace, long usedMetadataSpaceInSnapshots, long usedSpace, long zeroBlocks) {
        this.usedMetadataSpaceInSnapshots = usedMetadataSpaceInSnapshots;
        this.maxUsedMetadataSpace = maxUsedMetadataSpace;
        this.activeBlockSpace = activeBlockSpace;
        this.totalOps = totalOps;
        this.usedSpace = usedSpace;
        this.activeSessions = activeSessions;
        this.timestamp = timestamp;
        this.nonZeroBlocks = nonZeroBlocks;
        this.peakActiveSessions = peakActiveSessions;
        this.maxOverProvisionableSpace = maxOverProvisionableSpace;
        this.provisionedSpace = provisionedSpace;
        this.peakIOPS = peakIOPS;
        this.maxProvisionedSpace = maxProvisionedSpace;
        this.maxIOPS = maxIOPS;
        this.currentIOPS = currentIOPS;
        this.clusterRecentIOSize = clusterRecentIOSize;
        this.snapshotNonZeroBlocks = snapshotNonZeroBlocks;
        this.zeroBlocks = zeroBlocks;
        this.maxUsedSpace = maxUsedSpace;
        this.usedMetadataSpace = usedMetadataSpace;
        this.uniqueBlocksUsedSpace = uniqueBlocksUsedSpace;
        this.averageIOPS = averageIOPS;
        this.uniqueBlocks = uniqueBlocks;
    }


    /**
     * The amount of space on the block drives.
     * This includes additional information such as metadata entries and space which can be cleaned up.
     **/
    public long getActiveBlockSpace() {
        return this.activeBlockSpace;
    }

    /**
     * Number of active iSCSI sessions communicating with the cluster
     **/
    public long getActiveSessions() {
        return this.activeSessions;
    }

    /**
     * Average IPS for the cluster since midnight Coordinated Universal Time (UTC).
     **/
    public long getAverageIOPS() {
        return this.averageIOPS;
    }

    /**
     * The average size of IOPS to all volumes in the cluster.
     **/
    public long getClusterRecentIOSize() {
        return this.clusterRecentIOSize;
    }

    /**
     * Average IOPS for all volumes in the cluster over the last 5 seconds.
     **/
    public long getCurrentIOPS() {
        return this.currentIOPS;
    }

    /**
     * Estimated maximum IOPS capability of the current cluster.
     **/
    public long getMaxIOPS() {
        return this.maxIOPS;
    }

    /**
     * The maximum amount of provisionable space.
     * This is a computed value.
     * You cannot create new volumes if the current provisioned space plus the new volume size would exceed this number:
     * maxOverProvisionableSpace = maxProvisionedSpace * GetClusterFull
     **/
    public long getMaxOverProvisionableSpace() {
        return this.maxOverProvisionableSpace;
    }

    /**
     * The total amount of provisionable space if all volumes are 100% filled (no thin provisioned metadata).
     **/
    public long getMaxProvisionedSpace() {
        return this.maxProvisionedSpace;
    }

    /**
     * The amount of bytes on volume drives used to store metadata.
     **/
    public long getMaxUsedMetadataSpace() {
        return this.maxUsedMetadataSpace;
    }

    /**
     * The total amount of space on all active block drives.
     **/
    public long getMaxUsedSpace() {
        return this.maxUsedSpace;
    }

    /**
     * Total number of 4KiB blocks with data after the last garbage collection operation has completed.
     **/
    public long getNonZeroBlocks() {
        return this.nonZeroBlocks;
    }

    /**
     * Peak number of iSCSI connections since midnight UTC.
     **/
    public long getPeakActiveSessions() {
        return this.peakActiveSessions;
    }

    /**
     * The highest value for currentIOPS since midnight UTC.
     **/
    public long getPeakIOPS() {
        return this.peakIOPS;
    }

    /**
     * Total amount of space provisioned in all volumes on the cluster.
     **/
    public long getProvisionedSpace() {
        return this.provisionedSpace;
    }

    /**
     * Total number of 4KiB blocks in snapshots with data.
     * @since 8.0 
     **/

    @Since("8.0")
    public long getSnapshotNonZeroBlocks() {
        return this.snapshotNonZeroBlocks;
    }

    /**
     * The date and time this cluster capacity sample was taken.
     **/
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * The total number of I/O operations performed throughout the lifetime of the cluster
     **/
    public long getTotalOps() {
        return this.totalOps;
    }

    /**
     * The total number of blocks stored on the block drives.
     * The value includes replicated blocks.
     **/
    public long getUniqueBlocks() {
        return this.uniqueBlocks;
    }

    /**
     * The total amount of data the uniqueBlocks take up on the block drives.
     * This number is always consistent with the uniqueBlocks value.
     **/
    public long getUniqueBlocksUsedSpace() {
        return this.uniqueBlocksUsedSpace;
    }

    /**
     * The total amount of bytes on volume drives used to store metadata
     **/
    public long getUsedMetadataSpace() {
        return this.usedMetadataSpace;
    }

    /**
     * The amount of bytes on volume drives used for storing unique data in snapshots.
     * This number provides an estimate of how much metadata space would be regained by deleting all snapshots on the system.
     **/
    public long getUsedMetadataSpaceInSnapshots() {
        return this.usedMetadataSpaceInSnapshots;
    }

    /**
     * Total amount of space used by all block drives in the system.
     **/
    public long getUsedSpace() {
        return this.usedSpace;
    }

    /**
     * Total number of 4KiB blocks without data after the last round of garabage collection operation has completed.
     **/
    public long getZeroBlocks() {
        return this.zeroBlocks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterCapacity that = (ClusterCapacity) o;
        

        return Objects.equals( activeBlockSpace , that.activeBlockSpace )
            && Objects.equals( activeSessions , that.activeSessions )
            && Objects.equals( averageIOPS , that.averageIOPS )
            && Objects.equals( clusterRecentIOSize , that.clusterRecentIOSize )
            && Objects.equals( currentIOPS , that.currentIOPS )
            && Objects.equals( maxIOPS , that.maxIOPS )
            && Objects.equals( maxOverProvisionableSpace , that.maxOverProvisionableSpace )
            && Objects.equals( maxProvisionedSpace , that.maxProvisionedSpace )
            && Objects.equals( maxUsedMetadataSpace , that.maxUsedMetadataSpace )
            && Objects.equals( maxUsedSpace , that.maxUsedSpace )
            && Objects.equals( nonZeroBlocks , that.nonZeroBlocks )
            && Objects.equals( peakActiveSessions , that.peakActiveSessions )
            && Objects.equals( peakIOPS , that.peakIOPS )
            && Objects.equals( provisionedSpace , that.provisionedSpace )
            && Objects.equals( snapshotNonZeroBlocks , that.snapshotNonZeroBlocks )
            && Objects.equals( timestamp , that.timestamp )
            && Objects.equals( totalOps , that.totalOps )
            && Objects.equals( uniqueBlocks , that.uniqueBlocks )
            && Objects.equals( uniqueBlocksUsedSpace , that.uniqueBlocksUsedSpace )
            && Objects.equals( usedMetadataSpace , that.usedMetadataSpace )
            && Objects.equals( usedMetadataSpaceInSnapshots , that.usedMetadataSpaceInSnapshots )
            && Objects.equals( usedSpace , that.usedSpace )
            && Objects.equals( zeroBlocks , that.zeroBlocks );
    }

    @Override
    public int hashCode() {
        return Objects.hash( activeBlockSpace, activeSessions, averageIOPS, clusterRecentIOSize, currentIOPS, maxIOPS, maxOverProvisionableSpace, maxProvisionedSpace, maxUsedMetadataSpace, maxUsedSpace, nonZeroBlocks, peakActiveSessions, peakIOPS, provisionedSpace, snapshotNonZeroBlocks, timestamp, totalOps, uniqueBlocks, uniqueBlocksUsedSpace, usedMetadataSpace, usedMetadataSpaceInSnapshots, usedSpace, zeroBlocks );
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
        sb.append(" zeroBlocks : ").append(zeroBlocks);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
