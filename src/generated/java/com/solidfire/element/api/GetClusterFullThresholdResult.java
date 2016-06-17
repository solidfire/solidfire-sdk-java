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
 * The object returned by the "GetClusterFullThreshold" API Service call.
 **/
public class GetClusterFullThresholdResult implements Serializable {

    private static final long serialVersionUID = -271581514L;

    @SerializedName("blockFullness") private final String blockFullness;
    @SerializedName("fullness") private final String fullness;
    @SerializedName("maxMetadataOverProvisionFactor") private final long maxMetadataOverProvisionFactor;
    @SerializedName("metadataFullness") private final String metadataFullness;
    @SerializedName("sliceReserveUsedThresholdPct") private final long sliceReserveUsedThresholdPct;
    @SerializedName("stage2AwareThreshold") private final long stage2AwareThreshold;
    @SerializedName("stage2BlockThresholdBytes") private final long stage2BlockThresholdBytes;
    @SerializedName("stage3BlockThresholdBytes") private final long stage3BlockThresholdBytes;
    @SerializedName("stage3BlockThresholdPercent") private final long stage3BlockThresholdPercent;
    @SerializedName("stage3LowThreshold") private final long stage3LowThreshold;
    @SerializedName("stage4CriticalThreshold") private final long stage4CriticalThreshold;
    @SerializedName("stage4BlockThresholdBytes") private final long stage4BlockThresholdBytes;
    @SerializedName("stage5BlockThresholdBytes") private final long stage5BlockThresholdBytes;
    @SerializedName("sumTotalClusterBytes") private final long sumTotalClusterBytes;
    @SerializedName("sumTotalMetadataClusterBytes") private final long sumTotalMetadataClusterBytes;
    @SerializedName("sumUsedClusterBytes") private final long sumUsedClusterBytes;
    @SerializedName("sumUsedMetadataClusterBytes") private final long sumUsedMetadataClusterBytes;

    /**
     * The object returned by the "GetClusterFullThreshold" API Service call.
     * @param blockFullness [required] Current computed level of block fullness of the cluster.
     * @param fullness [required] Reflects the highest level of fullness between &quot;blockFullness&quot; and &quot;metadataFullness&quot;.
     * @param maxMetadataOverProvisionFactor [required] A value representative of the number of times metadata space can be over provisioned relative to the amount of space available. For example, if there was enough metadata space to store 100 TiB of volumes and this number was set to 5, then 500 TiB worth of volumes could be created.
     * @param metadataFullness [required] Current computed level of metadata fullness of the cluster.
     * @param sliceReserveUsedThresholdPct [required] Error condition; message sent to &quot;Alerts&quot; if the reserved slice utilization is greater than the sliceReserveUsedThresholdPct value returned.
     * @param stage2AwareThreshold [required] Awareness condition: Value that is set for &quot;Stage 2&quot; cluster threshold level.
     * @param stage2BlockThresholdBytes [required] Number of bytes being used by the cluster at which a stage2 condition will exist.
     * @param stage3BlockThresholdBytes [required] Number of bytes being used by the cluster at which a stage3 condition will exist.
     * @param stage3BlockThresholdPercent [required] The percent value set for stage3. At this percent full, a warning will be posted in the Alerts log.
     * @param stage3LowThreshold [required] Error condition; message sent to &quot;Alerts&quot; that capacity on a cluster is getting low.
     * @param stage4CriticalThreshold [required] Error condition; message sent to &quot;Alerts&quot; that capacity on a cluster is critically low.
     * @param stage4BlockThresholdBytes [required] Number of bytes being used by the cluster at which a stage4 condition will exist.
     * @param stage5BlockThresholdBytes [required] Number of bytes being used by the cluster at which a stage5 condition will exist.
     * @param sumTotalClusterBytes [required] Physical capacity of the cluster measured in bytes.
     * @param sumTotalMetadataClusterBytes [required] Total amount of space that can be used to store metadata.
     * @param sumUsedClusterBytes [required] Number of bytes used on the cluster.
     * @param sumUsedMetadataClusterBytes [required] Amount of space used on volume drives to store metadata.
     * @since 7.0
     **/
    @Since("7.0")
    public GetClusterFullThresholdResult(String blockFullness, String fullness, long maxMetadataOverProvisionFactor, String metadataFullness, long sliceReserveUsedThresholdPct, long stage2AwareThreshold, long stage2BlockThresholdBytes, long stage3BlockThresholdBytes, long stage3BlockThresholdPercent, long stage3LowThreshold, long stage4CriticalThreshold, long stage4BlockThresholdBytes, long stage5BlockThresholdBytes, long sumTotalClusterBytes, long sumTotalMetadataClusterBytes, long sumUsedClusterBytes, long sumUsedMetadataClusterBytes) {
        this.stage4BlockThresholdBytes = stage4BlockThresholdBytes;
        this.stage4CriticalThreshold = stage4CriticalThreshold;
        this.metadataFullness = metadataFullness;
        this.sumTotalClusterBytes = sumTotalClusterBytes;
        this.stage2AwareThreshold = stage2AwareThreshold;
        this.maxMetadataOverProvisionFactor = maxMetadataOverProvisionFactor;
        this.sliceReserveUsedThresholdPct = sliceReserveUsedThresholdPct;
        this.fullness = fullness;
        this.stage5BlockThresholdBytes = stage5BlockThresholdBytes;
        this.sumTotalMetadataClusterBytes = sumTotalMetadataClusterBytes;
        this.sumUsedMetadataClusterBytes = sumUsedMetadataClusterBytes;
        this.stage3BlockThresholdBytes = stage3BlockThresholdBytes;
        this.blockFullness = blockFullness;
        this.sumUsedClusterBytes = sumUsedClusterBytes;
        this.stage3LowThreshold = stage3LowThreshold;
        this.stage2BlockThresholdBytes = stage2BlockThresholdBytes;
        this.stage3BlockThresholdPercent = stage3BlockThresholdPercent;
    }


    /**
     * Current computed level of block fullness of the cluster.
     * Possible values: <br/><b>stage1Happy</b>: No alerts or error conditions. <br/><b>stage2Aware</b>: 3 nodes of capacity available. <br/><b>stage3Low</b>: 2 nodes of capacity available. <br/><b>stage4Critical</b>: 1 node of capacity available. No new volumes or clones can be created. <br/><b>stage5CompletelyConsumed</b>: Completely consumed. Cluster is read-only, iSCSI connection is maintained but all writes are suspended.
     **/
    public String getBlockFullness() {
        return this.blockFullness;
    }

    /**
     * Reflects the highest level of fullness between &quot;blockFullness&quot; and &quot;metadataFullness&quot;.
     **/
    public String getFullness() {
        return this.fullness;
    }

    /**
     * A value representative of the number of times metadata space can be over provisioned relative to the amount of space available. For example, if there was enough metadata space to store 100 TiB of volumes and this number was set to 5, then 500 TiB worth of volumes could be created.
     **/
    public long getMaxMetadataOverProvisionFactor() {
        return this.maxMetadataOverProvisionFactor;
    }

    /**
     * Current computed level of metadata fullness of the cluster.
     **/
    public String getMetadataFullness() {
        return this.metadataFullness;
    }

    /**
     * Error condition; message sent to &quot;Alerts&quot; if the reserved slice utilization is greater than the sliceReserveUsedThresholdPct value returned.
     **/
    public long getSliceReserveUsedThresholdPct() {
        return this.sliceReserveUsedThresholdPct;
    }

    /**
     * Awareness condition: Value that is set for &quot;Stage 2&quot; cluster threshold level.
     **/
    public long getStage2AwareThreshold() {
        return this.stage2AwareThreshold;
    }

    /**
     * Number of bytes being used by the cluster at which a stage2 condition will exist.
     **/
    public long getStage2BlockThresholdBytes() {
        return this.stage2BlockThresholdBytes;
    }

    /**
     * Number of bytes being used by the cluster at which a stage3 condition will exist.
     **/
    public long getStage3BlockThresholdBytes() {
        return this.stage3BlockThresholdBytes;
    }

    /**
     * The percent value set for stage3. At this percent full, a warning will be posted in the Alerts log.
     **/
    public long getStage3BlockThresholdPercent() {
        return this.stage3BlockThresholdPercent;
    }

    /**
     * Error condition; message sent to &quot;Alerts&quot; that capacity on a cluster is getting low.
     **/
    public long getStage3LowThreshold() {
        return this.stage3LowThreshold;
    }

    /**
     * Error condition; message sent to &quot;Alerts&quot; that capacity on a cluster is critically low.
     **/
    public long getStage4CriticalThreshold() {
        return this.stage4CriticalThreshold;
    }

    /**
     * Number of bytes being used by the cluster at which a stage4 condition will exist.
     **/
    public long getStage4BlockThresholdBytes() {
        return this.stage4BlockThresholdBytes;
    }

    /**
     * Number of bytes being used by the cluster at which a stage5 condition will exist.
     **/
    public long getStage5BlockThresholdBytes() {
        return this.stage5BlockThresholdBytes;
    }

    /**
     * Physical capacity of the cluster measured in bytes.
     **/
    public long getSumTotalClusterBytes() {
        return this.sumTotalClusterBytes;
    }

    /**
     * Total amount of space that can be used to store metadata.
     **/
    public long getSumTotalMetadataClusterBytes() {
        return this.sumTotalMetadataClusterBytes;
    }

    /**
     * Number of bytes used on the cluster.
     **/
    public long getSumUsedClusterBytes() {
        return this.sumUsedClusterBytes;
    }

    /**
     * Amount of space used on volume drives to store metadata.
     **/
    public long getSumUsedMetadataClusterBytes() {
        return this.sumUsedMetadataClusterBytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClusterFullThresholdResult that = (GetClusterFullThresholdResult) o;
        

        return Objects.equals( blockFullness , that.blockFullness )
            && Objects.equals( fullness , that.fullness )
            && Objects.equals( maxMetadataOverProvisionFactor , that.maxMetadataOverProvisionFactor )
            && Objects.equals( metadataFullness , that.metadataFullness )
            && Objects.equals( sliceReserveUsedThresholdPct , that.sliceReserveUsedThresholdPct )
            && Objects.equals( stage2AwareThreshold , that.stage2AwareThreshold )
            && Objects.equals( stage2BlockThresholdBytes , that.stage2BlockThresholdBytes )
            && Objects.equals( stage3BlockThresholdBytes , that.stage3BlockThresholdBytes )
            && Objects.equals( stage3BlockThresholdPercent , that.stage3BlockThresholdPercent )
            && Objects.equals( stage3LowThreshold , that.stage3LowThreshold )
            && Objects.equals( stage4CriticalThreshold , that.stage4CriticalThreshold )
            && Objects.equals( stage4BlockThresholdBytes , that.stage4BlockThresholdBytes )
            && Objects.equals( stage5BlockThresholdBytes , that.stage5BlockThresholdBytes )
            && Objects.equals( sumTotalClusterBytes , that.sumTotalClusterBytes )
            && Objects.equals( sumTotalMetadataClusterBytes , that.sumTotalMetadataClusterBytes )
            && Objects.equals( sumUsedClusterBytes , that.sumUsedClusterBytes )
            && Objects.equals( sumUsedMetadataClusterBytes , that.sumUsedMetadataClusterBytes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( blockFullness, fullness, maxMetadataOverProvisionFactor, metadataFullness, sliceReserveUsedThresholdPct, stage2AwareThreshold, stage2BlockThresholdBytes, stage3BlockThresholdBytes, stage3BlockThresholdPercent, stage3LowThreshold, stage4CriticalThreshold, stage4BlockThresholdBytes, stage5BlockThresholdBytes, sumTotalClusterBytes, sumTotalMetadataClusterBytes, sumUsedClusterBytes, sumUsedMetadataClusterBytes );
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
        sb.append(" sumUsedMetadataClusterBytes : ").append(sumUsedMetadataClusterBytes);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
