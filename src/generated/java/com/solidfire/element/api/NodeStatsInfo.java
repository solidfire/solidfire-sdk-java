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
 **/

public class NodeStatsInfo implements Serializable {

    public static final long serialVersionUID = 7349711922328450412L;
    @SerializedName("cBytesIn") private Long cBytesIn;
    @SerializedName("cBytesOut") private Long cBytesOut;
    @SerializedName("cpu") private Long cpu;
    @SerializedName("mBytesIn") private Long mBytesIn;
    @SerializedName("mBytesOut") private Long mBytesOut;
    @SerializedName("networkUtilizationCluster") private Long networkUtilizationCluster;
    @SerializedName("networkUtilizationStorage") private Long networkUtilizationStorage;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("sBytesIn") private Long sBytesIn;
    @SerializedName("sBytesOut") private Long sBytesOut;
    @SerializedName("timestamp") private String timestamp;
    @SerializedName("usedMemory") private Long usedMemory;

    // empty constructor
    @Since("7.0")
    public NodeStatsInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public NodeStatsInfo(
        Long cBytesIn,
        Long cBytesOut,
        Long cpu,
        Long mBytesIn,
        Long mBytesOut,
        Long networkUtilizationCluster,
        Long networkUtilizationStorage,
        Long nodeID,
        Long sBytesIn,
        Long sBytesOut,
        String timestamp,
        Long usedMemory
    )
    {
        this.cBytesIn = cBytesIn;
        this.cBytesOut = cBytesOut;
        this.cpu = cpu;
        this.mBytesIn = mBytesIn;
        this.mBytesOut = mBytesOut;
        this.networkUtilizationCluster = networkUtilizationCluster;
        this.networkUtilizationStorage = networkUtilizationStorage;
        this.nodeID = nodeID;
        this.sBytesIn = sBytesIn;
        this.sBytesOut = sBytesOut;
        this.timestamp = timestamp;
        this.usedMemory = usedMemory;
    }

    /** 
     * Bytes in on the cluster interface.
     **/
    public Long getCBytesIn() { return this.cBytesIn; }
    public void setCBytesIn(Long cBytesIn) { 
        this.cBytesIn = cBytesIn;
    }
    /** 
     * Bytes out on the cluster interface.
     **/
    public Long getCBytesOut() { return this.cBytesOut; }
    public void setCBytesOut(Long cBytesOut) { 
        this.cBytesOut = cBytesOut;
    }
    /** 
     * CPU Usage %
     **/
    public Long getCpu() { return this.cpu; }
    public void setCpu(Long cpu) { 
        this.cpu = cpu;
    }
    /** 
     * Bytes in on the management interface.
     **/
    public Long getMBytesIn() { return this.mBytesIn; }
    public void setMBytesIn(Long mBytesIn) { 
        this.mBytesIn = mBytesIn;
    }
    /** 
     * Bytes out on the management interface.
     **/
    public Long getMBytesOut() { return this.mBytesOut; }
    public void setMBytesOut(Long mBytesOut) { 
        this.mBytesOut = mBytesOut;
    }
    /** 
     * Network interface utilization (in %) for the cluster network interface.
     **/
    public Long getNetworkUtilizationCluster() { return this.networkUtilizationCluster; }
    public void setNetworkUtilizationCluster(Long networkUtilizationCluster) { 
        this.networkUtilizationCluster = networkUtilizationCluster;
    }
    /** 
     * Network interface utilization (in %) for the storage network interface.
     **/
    public Long getNetworkUtilizationStorage() { return this.networkUtilizationStorage; }
    public void setNetworkUtilizationStorage(Long networkUtilizationStorage) { 
        this.networkUtilizationStorage = networkUtilizationStorage;
    }
    /** 
     **/
    public Long getNodeID() { return this.nodeID; }
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     * Bytes in on the storage interface.
     **/
    public Long getSBytesIn() { return this.sBytesIn; }
    public void setSBytesIn(Long sBytesIn) { 
        this.sBytesIn = sBytesIn;
    }
    /** 
     * Bytes out on the storage interface.
     **/
    public Long getSBytesOut() { return this.sBytesOut; }
    public void setSBytesOut(Long sBytesOut) { 
        this.sBytesOut = sBytesOut;
    }
    /** 
     * Current time in UTC format ISO 8691 date string.
     **/
    public String getTimestamp() { return this.timestamp; }
    public void setTimestamp(String timestamp) { 
        this.timestamp = timestamp;
    }
    /** 
     * Total memory usage in bytes.
     **/
    public Long getUsedMemory() { return this.usedMemory; }
    public void setUsedMemory(Long usedMemory) { 
        this.usedMemory = usedMemory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeStatsInfo that = (NodeStatsInfo) o;

        return 
            Objects.equals(cBytesIn, that.cBytesIn) && 
            Objects.equals(cBytesOut, that.cBytesOut) && 
            Objects.equals(cpu, that.cpu) && 
            Objects.equals(mBytesIn, that.mBytesIn) && 
            Objects.equals(mBytesOut, that.mBytesOut) && 
            Objects.equals(networkUtilizationCluster, that.networkUtilizationCluster) && 
            Objects.equals(networkUtilizationStorage, that.networkUtilizationStorage) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(sBytesIn, that.sBytesIn) && 
            Objects.equals(sBytesOut, that.sBytesOut) && 
            Objects.equals(timestamp, that.timestamp) && 
            Objects.equals(usedMemory, that.usedMemory);
    }

    @Override
    public int hashCode() {
        return Objects.hash( cBytesIn,cBytesOut,cpu,mBytesIn,mBytesOut,networkUtilizationCluster,networkUtilizationStorage,nodeID,sBytesIn,sBytesOut,timestamp,usedMemory );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("cBytesIn", cBytesIn);
        map.put("cBytesOut", cBytesOut);
        map.put("cpu", cpu);
        map.put("mBytesIn", mBytesIn);
        map.put("mBytesOut", mBytesOut);
        map.put("networkUtilizationCluster", networkUtilizationCluster);
        map.put("networkUtilizationStorage", networkUtilizationStorage);
        map.put("nodeID", nodeID);
        map.put("sBytesIn", sBytesIn);
        map.put("sBytesOut", sBytesOut);
        map.put("timestamp", timestamp);
        map.put("usedMemory", usedMemory);
        return map;
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
        sb.append(" usedMemory : ").append(usedMemory).append(",");
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
                         this.usedMemory);
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
