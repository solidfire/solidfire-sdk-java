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
 * NodeStatsInfo  
 **/

public class NodeStatsInfo implements Serializable {

    public static final long serialVersionUID = -746464577488285323L;
    @SerializedName("cBytesIn") private Long cBytesIn;
    @SerializedName("cBytesOut") private Long cBytesOut;
    @SerializedName("count") private Long count;
    @SerializedName("cpu") private Long cpu;
    @SerializedName("cpuTotal") private Long cpuTotal;
    @SerializedName("mBytesIn") private Long mBytesIn;
    @SerializedName("mBytesOut") private Long mBytesOut;
    @SerializedName("networkUtilizationCluster") private Long networkUtilizationCluster;
    @SerializedName("networkUtilizationStorage") private Long networkUtilizationStorage;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("readOps") private Long readOps;
    @SerializedName("readLatencyUSecTotal") private Long readLatencyUSecTotal;
    @SerializedName("sBytesIn") private Long sBytesIn;
    @SerializedName("sBytesOut") private Long sBytesOut;
    @SerializedName("ssLoadHistogram") private QuintileHistogram ssLoadHistogram;
    @SerializedName("timestamp") private String timestamp;
    @SerializedName("usedMemory") private Long usedMemory;
    @SerializedName("writeLatencyUSecTotal") private Long writeLatencyUSecTotal;
    @SerializedName("writeOps") private Long writeOps;
    // empty constructor
    @Since("7.0")
    public NodeStatsInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public NodeStatsInfo(
        Long cBytesIn,
        Long cBytesOut,
        Long count,
        Long cpu,
        Long cpuTotal,
        Long mBytesIn,
        Long mBytesOut,
        Long networkUtilizationCluster,
        Long networkUtilizationStorage,
        Long nodeID,
        Long readOps,
        Long readLatencyUSecTotal,
        Long sBytesIn,
        Long sBytesOut,
        String timestamp,
        Long usedMemory,
        Long writeLatencyUSecTotal,
        Long writeOps
    )
    {
        this.cBytesIn = cBytesIn;
        this.cBytesOut = cBytesOut;
        this.count = count;
        this.cpu = cpu;
        this.cpuTotal = cpuTotal;
        this.mBytesIn = mBytesIn;
        this.mBytesOut = mBytesOut;
        this.networkUtilizationCluster = networkUtilizationCluster;
        this.networkUtilizationStorage = networkUtilizationStorage;
        this.nodeID = nodeID;
        this.readOps = readOps;
        this.readLatencyUSecTotal = readLatencyUSecTotal;
        this.sBytesIn = sBytesIn;
        this.sBytesOut = sBytesOut;
        this.timestamp = timestamp;
        this.usedMemory = usedMemory;
        this.writeLatencyUSecTotal = writeLatencyUSecTotal;
        this.writeOps = writeOps;
    }
    // parameterized constructor
    @Since("11.0")
    public NodeStatsInfo(
        Long cBytesIn,
        Long cBytesOut,
        Long count,
        Long cpu,
        Long cpuTotal,
        Long mBytesIn,
        Long mBytesOut,
        Long networkUtilizationCluster,
        Long networkUtilizationStorage,
        Long nodeID,
        Long readOps,
        Long readLatencyUSecTotal,
        Long sBytesIn,
        Long sBytesOut,
        QuintileHistogram ssLoadHistogram,
        String timestamp,
        Long usedMemory,
        Long writeLatencyUSecTotal,
        Long writeOps
    )
    {
        this.cBytesIn = cBytesIn;
        this.cBytesOut = cBytesOut;
        this.count = count;
        this.cpu = cpu;
        this.cpuTotal = cpuTotal;
        this.mBytesIn = mBytesIn;
        this.mBytesOut = mBytesOut;
        this.networkUtilizationCluster = networkUtilizationCluster;
        this.networkUtilizationStorage = networkUtilizationStorage;
        this.nodeID = nodeID;
        this.readOps = readOps;
        this.readLatencyUSecTotal = readLatencyUSecTotal;
        this.sBytesIn = sBytesIn;
        this.sBytesOut = sBytesOut;
        this.ssLoadHistogram = ssLoadHistogram;
        this.timestamp = timestamp;
        this.usedMemory = usedMemory;
        this.writeLatencyUSecTotal = writeLatencyUSecTotal;
        this.writeOps = writeOps;
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
     * 
     **/
    public Long getCount() { return this.count; }
   
    public void setCount(Long count) { 
        this.count = count;
    }
    /** 
     * CPU Usage %
     **/
    public Long getCpu() { return this.cpu; }
   
    public void setCpu(Long cpu) { 
        this.cpu = cpu;
    }
    /** 
     * CPU Total
     **/
    public Long getCpuTotal() { return this.cpuTotal; }
   
    public void setCpuTotal(Long cpuTotal) { 
        this.cpuTotal = cpuTotal;
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
     * 
     **/
    public Long getNodeID() { return this.nodeID; }
   
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     * Read Operations.
     **/
    public Long getReadOps() { return this.readOps; }
   
    public void setReadOps(Long readOps) { 
        this.readOps = readOps;
    }
    /** 
     * 
     **/
    public Long getReadLatencyUSecTotal() { return this.readLatencyUSecTotal; }
   
    public void setReadLatencyUSecTotal(Long readLatencyUSecTotal) { 
        this.readLatencyUSecTotal = readLatencyUSecTotal;
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
     * A histogram of SS load measurements.
     **/
    public QuintileHistogram getSsLoadHistogram() { return this.ssLoadHistogram; }
   
    public void setSsLoadHistogram(QuintileHistogram ssLoadHistogram) { 
        this.ssLoadHistogram = ssLoadHistogram;
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
    /** 
     * 
     **/
    public Long getWriteLatencyUSecTotal() { return this.writeLatencyUSecTotal; }
   
    public void setWriteLatencyUSecTotal(Long writeLatencyUSecTotal) { 
        this.writeLatencyUSecTotal = writeLatencyUSecTotal;
    }
    /** 
     * Write Operations
     **/
    public Long getWriteOps() { return this.writeOps; }
   
    public void setWriteOps(Long writeOps) { 
        this.writeOps = writeOps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeStatsInfo that = (NodeStatsInfo) o;

        return 
            Objects.equals(cBytesIn, that.cBytesIn) && 
            Objects.equals(cBytesOut, that.cBytesOut) && 
            Objects.equals(count, that.count) && 
            Objects.equals(cpu, that.cpu) && 
            Objects.equals(cpuTotal, that.cpuTotal) && 
            Objects.equals(mBytesIn, that.mBytesIn) && 
            Objects.equals(mBytesOut, that.mBytesOut) && 
            Objects.equals(networkUtilizationCluster, that.networkUtilizationCluster) && 
            Objects.equals(networkUtilizationStorage, that.networkUtilizationStorage) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(readOps, that.readOps) && 
            Objects.equals(readLatencyUSecTotal, that.readLatencyUSecTotal) && 
            Objects.equals(sBytesIn, that.sBytesIn) && 
            Objects.equals(sBytesOut, that.sBytesOut) && 
            Objects.equals(ssLoadHistogram, that.ssLoadHistogram) && 
            Objects.equals(timestamp, that.timestamp) && 
            Objects.equals(usedMemory, that.usedMemory) && 
            Objects.equals(writeLatencyUSecTotal, that.writeLatencyUSecTotal) && 
            Objects.equals(writeOps, that.writeOps);
    }

    @Override
    public int hashCode() {
        return Objects.hash( cBytesIn,cBytesOut,count,cpu,cpuTotal,mBytesIn,mBytesOut,networkUtilizationCluster,networkUtilizationStorage,nodeID,readOps,readLatencyUSecTotal,sBytesIn,sBytesOut,ssLoadHistogram,timestamp,usedMemory,writeLatencyUSecTotal,writeOps );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("cBytesIn", cBytesIn);
        map.put("cBytesOut", cBytesOut);
        map.put("count", count);
        map.put("cpu", cpu);
        map.put("cpuTotal", cpuTotal);
        map.put("mBytesIn", mBytesIn);
        map.put("mBytesOut", mBytesOut);
        map.put("networkUtilizationCluster", networkUtilizationCluster);
        map.put("networkUtilizationStorage", networkUtilizationStorage);
        map.put("nodeID", nodeID);
        map.put("readOps", readOps);
        map.put("readLatencyUSecTotal", readLatencyUSecTotal);
        map.put("sBytesIn", sBytesIn);
        map.put("sBytesOut", sBytesOut);
        map.put("ssLoadHistogram", ssLoadHistogram);
        map.put("timestamp", timestamp);
        map.put("usedMemory", usedMemory);
        map.put("writeLatencyUSecTotal", writeLatencyUSecTotal);
        map.put("writeOps", writeOps);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" cBytesIn : ").append(gson.toJson(cBytesIn)).append(",");
        sb.append(" cBytesOut : ").append(gson.toJson(cBytesOut)).append(",");
        sb.append(" count : ").append(gson.toJson(count)).append(",");
        sb.append(" cpu : ").append(gson.toJson(cpu)).append(",");
        sb.append(" cpuTotal : ").append(gson.toJson(cpuTotal)).append(",");
        sb.append(" mBytesIn : ").append(gson.toJson(mBytesIn)).append(",");
        sb.append(" mBytesOut : ").append(gson.toJson(mBytesOut)).append(",");
        sb.append(" networkUtilizationCluster : ").append(gson.toJson(networkUtilizationCluster)).append(",");
        sb.append(" networkUtilizationStorage : ").append(gson.toJson(networkUtilizationStorage)).append(",");
        sb.append(" nodeID : ").append(gson.toJson(nodeID)).append(",");
        sb.append(" readOps : ").append(gson.toJson(readOps)).append(",");
        sb.append(" readLatencyUSecTotal : ").append(gson.toJson(readLatencyUSecTotal)).append(",");
        sb.append(" sBytesIn : ").append(gson.toJson(sBytesIn)).append(",");
        sb.append(" sBytesOut : ").append(gson.toJson(sBytesOut)).append(",");
        sb.append(" ssLoadHistogram : ").append(gson.toJson(ssLoadHistogram)).append(",");
        sb.append(" timestamp : ").append(gson.toJson(timestamp)).append(",");
        sb.append(" usedMemory : ").append(gson.toJson(usedMemory)).append(",");
        sb.append(" writeLatencyUSecTotal : ").append(gson.toJson(writeLatencyUSecTotal)).append(",");
        sb.append(" writeOps : ").append(gson.toJson(writeOps)).append(",");
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
        private Long count;
        private Long cpu;
        private Long cpuTotal;
        private Long mBytesIn;
        private Long mBytesOut;
        private Long networkUtilizationCluster;
        private Long networkUtilizationStorage;
        private Long nodeID;
        private Long readOps;
        private Long readLatencyUSecTotal;
        private Long sBytesIn;
        private Long sBytesOut;
        private QuintileHistogram ssLoadHistogram;
        private String timestamp;
        private Long usedMemory;
        private Long writeLatencyUSecTotal;
        private Long writeOps;

        private Builder() { }

        public NodeStatsInfo build() {
            return new NodeStatsInfo (
                         this.cBytesIn,
                         this.cBytesOut,
                         this.count,
                         this.cpu,
                         this.cpuTotal,
                         this.mBytesIn,
                         this.mBytesOut,
                         this.networkUtilizationCluster,
                         this.networkUtilizationStorage,
                         this.nodeID,
                         this.readOps,
                         this.readLatencyUSecTotal,
                         this.sBytesIn,
                         this.sBytesOut,
                         this.ssLoadHistogram,
                         this.timestamp,
                         this.usedMemory,
                         this.writeLatencyUSecTotal,
                         this.writeOps);
        }

        private NodeStatsInfo.Builder buildFrom(final NodeStatsInfo req) {
            this.cBytesIn = req.cBytesIn;
            this.cBytesOut = req.cBytesOut;
            this.count = req.count;
            this.cpu = req.cpu;
            this.cpuTotal = req.cpuTotal;
            this.mBytesIn = req.mBytesIn;
            this.mBytesOut = req.mBytesOut;
            this.networkUtilizationCluster = req.networkUtilizationCluster;
            this.networkUtilizationStorage = req.networkUtilizationStorage;
            this.nodeID = req.nodeID;
            this.readOps = req.readOps;
            this.readLatencyUSecTotal = req.readLatencyUSecTotal;
            this.sBytesIn = req.sBytesIn;
            this.sBytesOut = req.sBytesOut;
            this.ssLoadHistogram = req.ssLoadHistogram;
            this.timestamp = req.timestamp;
            this.usedMemory = req.usedMemory;
            this.writeLatencyUSecTotal = req.writeLatencyUSecTotal;
            this.writeOps = req.writeOps;

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

        public NodeStatsInfo.Builder count(final Long count) {
            this.count = count;
            return this;
        }

        public NodeStatsInfo.Builder cpu(final Long cpu) {
            this.cpu = cpu;
            return this;
        }

        public NodeStatsInfo.Builder cpuTotal(final Long cpuTotal) {
            this.cpuTotal = cpuTotal;
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

        public NodeStatsInfo.Builder readOps(final Long readOps) {
            this.readOps = readOps;
            return this;
        }

        public NodeStatsInfo.Builder readLatencyUSecTotal(final Long readLatencyUSecTotal) {
            this.readLatencyUSecTotal = readLatencyUSecTotal;
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

        public NodeStatsInfo.Builder ssLoadHistogram(final QuintileHistogram ssLoadHistogram) {
            this.ssLoadHistogram = ssLoadHistogram;
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

        public NodeStatsInfo.Builder writeLatencyUSecTotal(final Long writeLatencyUSecTotal) {
            this.writeLatencyUSecTotal = writeLatencyUSecTotal;
            return this;
        }

        public NodeStatsInfo.Builder writeOps(final Long writeOps) {
            this.writeOps = writeOps;
            return this;
        }

    }
}
