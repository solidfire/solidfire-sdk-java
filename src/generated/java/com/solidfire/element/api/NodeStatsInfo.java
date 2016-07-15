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
 * 
 **/
public class NodeStatsInfo implements Serializable {

    private static final long serialVersionUID = -1879716780L;

    @SerializedName("cBytesIn") private final Long cBytesIn;
    @SerializedName("cBytesOut") private final Long cBytesOut;
    @SerializedName("cpu") private final Long cpu;
    @SerializedName("mBytesIn") private final Long mBytesIn;
    @SerializedName("mBytesOut") private final Long mBytesOut;
    @SerializedName("networkUtilizationCluster") private final Long networkUtilizationCluster;
    @SerializedName("networkUtilizationStorage") private final Long networkUtilizationStorage;
    @SerializedName("nodeID") private final Long nodeID;
    @SerializedName("sBytesIn") private final Long sBytesIn;
    @SerializedName("sBytesOut") private final Long sBytesOut;
    @SerializedName("timestamp") private final String timestamp;
    @SerializedName("usedMemory") private final Long usedMemory;

    /**
     * 
     * @param cBytesIn [required] Bytes in on the cluster interface.
     * @param cBytesOut [required] Bytes out on the cluster interface.
     * @param cpu [required] CPU Usage %
     * @param mBytesIn [required] Bytes in on the management interface.
     * @param mBytesOut [required] Bytes out on the management interface.
     * @param networkUtilizationCluster [required] Network interface utilization (in %) for the cluster network interface.
     * @param networkUtilizationStorage [required] Network interface utilization (in %) for the storage network interface.
     * @param nodeID [required] 
     * @param sBytesIn [required] Bytes in on the storage interface.
     * @param sBytesOut [required] Bytes out on the storage interface.
     * @param timestamp [required] Current time in UTC format ISO 8691 date string.
     * @param usedMemory [required] Total memory usage in bytes.
     * @since 7.0
     **/
    @Since("7.0")
    public NodeStatsInfo(Long cBytesIn, Long cBytesOut, Long cpu, Long mBytesIn, Long mBytesOut, Long networkUtilizationCluster, Long networkUtilizationStorage, Long nodeID, Long sBytesIn, Long sBytesOut, String timestamp, Long usedMemory) {
        this.mBytesIn = mBytesIn;
        this.networkUtilizationCluster = networkUtilizationCluster;
        this.timestamp = timestamp;
        this.usedMemory = usedMemory;
        this.sBytesIn = sBytesIn;
        this.networkUtilizationStorage = networkUtilizationStorage;
        this.cpu = cpu;
        this.mBytesOut = mBytesOut;
        this.sBytesOut = sBytesOut;
        this.nodeID = nodeID;
        this.cBytesOut = cBytesOut;
        this.cBytesIn = cBytesIn;
    }


    /**
     * Bytes in on the cluster interface.
     **/
    public Long getCBytesIn() {
        return this.cBytesIn;
    }

    /**
     * Bytes out on the cluster interface.
     **/
    public Long getCBytesOut() {
        return this.cBytesOut;
    }

    /**
     * CPU Usage %
     **/
    public Long getCpu() {
        return this.cpu;
    }

    /**
     * Bytes in on the management interface.
     **/
    public Long getMBytesIn() {
        return this.mBytesIn;
    }

    /**
     * Bytes out on the management interface.
     **/
    public Long getMBytesOut() {
        return this.mBytesOut;
    }

    /**
     * Network interface utilization (in %) for the cluster network interface.
     **/
    public Long getNetworkUtilizationCluster() {
        return this.networkUtilizationCluster;
    }

    /**
     * Network interface utilization (in %) for the storage network interface.
     **/
    public Long getNetworkUtilizationStorage() {
        return this.networkUtilizationStorage;
    }
    public Long getNodeID() {
        return this.nodeID;
    }

    /**
     * Bytes in on the storage interface.
     **/
    public Long getSBytesIn() {
        return this.sBytesIn;
    }

    /**
     * Bytes out on the storage interface.
     **/
    public Long getSBytesOut() {
        return this.sBytesOut;
    }

    /**
     * Current time in UTC format ISO 8691 date string.
     **/
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * Total memory usage in bytes.
     **/
    public Long getUsedMemory() {
        return this.usedMemory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeStatsInfo that = (NodeStatsInfo) o;
        

        return Objects.equals( cBytesIn , that.cBytesIn )
            && Objects.equals( cBytesOut , that.cBytesOut )
            && Objects.equals( cpu , that.cpu )
            && Objects.equals( mBytesIn , that.mBytesIn )
            && Objects.equals( mBytesOut , that.mBytesOut )
            && Objects.equals( networkUtilizationCluster , that.networkUtilizationCluster )
            && Objects.equals( networkUtilizationStorage , that.networkUtilizationStorage )
            && Objects.equals( nodeID , that.nodeID )
            && Objects.equals( sBytesIn , that.sBytesIn )
            && Objects.equals( sBytesOut , that.sBytesOut )
            && Objects.equals( timestamp , that.timestamp )
            && Objects.equals( usedMemory , that.usedMemory );
    }

    @Override
    public int hashCode() {
        return Objects.hash( cBytesIn, cBytesOut, cpu, mBytesIn, mBytesOut, networkUtilizationCluster, networkUtilizationStorage, nodeID, sBytesIn, sBytesOut, timestamp, usedMemory );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" cBytesIn : ").append(cBytesIn).append(",");
        sb.append(" cBytesOut : ").append(cBytesOut).append(",");
        sb.append(" cpu : ").append(cpu).append(",");
        sb.append(" mBytesIn : ").append(mBytesIn).append(",");
        sb.append(" mBytesOut : ").append(mBytesOut).append(",");
        sb.append(" networkUtilizationCluster : ").append(networkUtilizationCluster).append(",");
        sb.append(" networkUtilizationStorage : ").append(networkUtilizationStorage).append(",");
        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" sBytesIn : ").append(sBytesIn).append(",");
        sb.append(" sBytesOut : ").append(sBytesOut).append(",");
        sb.append(" timestamp : ").append(timestamp).append(",");
        sb.append(" usedMemory : ").append(usedMemory);
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
        private Long cBytesIn;
        private Long cBytesOut;
        private Long cpu;
        private Long mBytesIn;
        private Long mBytesOut;
        private Long networkUtilizationCluster;
        private Long networkUtilizationStorage;
        private Long nodeID;
        private Long sBytesIn;
        private Long sBytesOut;
        private String timestamp;
        private Long usedMemory;

        private Builder() { }

        public NodeStatsInfo build() {
            return new NodeStatsInfo (
                         this.cBytesIn,
                         this.cBytesOut,
                         this.cpu,
                         this.mBytesIn,
                         this.mBytesOut,
                         this.networkUtilizationCluster,
                         this.networkUtilizationStorage,
                         this.nodeID,
                         this.sBytesIn,
                         this.sBytesOut,
                         this.timestamp,
                         this.usedMemory            );
        }

        private NodeStatsInfo.Builder buildFrom(final NodeStatsInfo req) {
            this.cBytesIn = req.cBytesIn;
            this.cBytesOut = req.cBytesOut;
            this.cpu = req.cpu;
            this.mBytesIn = req.mBytesIn;
            this.mBytesOut = req.mBytesOut;
            this.networkUtilizationCluster = req.networkUtilizationCluster;
            this.networkUtilizationStorage = req.networkUtilizationStorage;
            this.nodeID = req.nodeID;
            this.sBytesIn = req.sBytesIn;
            this.sBytesOut = req.sBytesOut;
            this.timestamp = req.timestamp;
            this.usedMemory = req.usedMemory;

            return this;
        }

        public NodeStatsInfo.Builder cBytesIn(final Long cBytesIn) {
            this.cBytesIn = cBytesIn;
            return this;
        }

        public NodeStatsInfo.Builder cBytesOut(final Long cBytesOut) {
            this.cBytesOut = cBytesOut;
            return this;
        }

        public NodeStatsInfo.Builder cpu(final Long cpu) {
            this.cpu = cpu;
            return this;
        }

        public NodeStatsInfo.Builder mBytesIn(final Long mBytesIn) {
            this.mBytesIn = mBytesIn;
            return this;
        }

        public NodeStatsInfo.Builder mBytesOut(final Long mBytesOut) {
            this.mBytesOut = mBytesOut;
            return this;
        }

        public NodeStatsInfo.Builder networkUtilizationCluster(final Long networkUtilizationCluster) {
            this.networkUtilizationCluster = networkUtilizationCluster;
            return this;
        }

        public NodeStatsInfo.Builder networkUtilizationStorage(final Long networkUtilizationStorage) {
            this.networkUtilizationStorage = networkUtilizationStorage;
            return this;
        }

        public NodeStatsInfo.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public NodeStatsInfo.Builder sBytesIn(final Long sBytesIn) {
            this.sBytesIn = sBytesIn;
            return this;
        }

        public NodeStatsInfo.Builder sBytesOut(final Long sBytesOut) {
            this.sBytesOut = sBytesOut;
            return this;
        }

        public NodeStatsInfo.Builder timestamp(final String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public NodeStatsInfo.Builder usedMemory(final Long usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }

    }

}
