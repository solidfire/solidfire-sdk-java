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
        Long writeOps
    )
    {
        this.clusterUtilization = clusterUtilization;
        this.clientQueueDepth = clientQueueDepth;
        this.readBytes = readBytes;
        this.readOps = readOps;
        this.timestamp = timestamp;
        this.writeBytes = writeBytes;
        this.writeOps = writeOps;
    }

    /** 
     * The amount of cluster capacity being utilized.
     **/
    public Double getClusterUtilization() { return this.clusterUtilization; }
    public void setClusterUtilization(Double clusterUtilization) { 
        this.clusterUtilization = clusterUtilization;
    }
    /** 
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
            Objects.equals(writeOps, that.writeOps);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterUtilization,clientQueueDepth,readBytes,readOps,timestamp,writeBytes,writeOps );
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

        private Builder() { }

        public ClusterStats build() {
            return new ClusterStats (
                         this.clusterUtilization,
                         this.clientQueueDepth,
                         this.readBytes,
                         this.readOps,
                         this.timestamp,
                         this.writeBytes,
                         this.writeOps);
        }

        private ClusterStats.Builder buildFrom(final ClusterStats req) {
            this.clusterUtilization = req.clusterUtilization;
            this.clientQueueDepth = req.clientQueueDepth;
            this.readBytes = req.readBytes;
            this.readOps = req.readOps;
            this.timestamp = req.timestamp;
            this.writeBytes = req.writeBytes;
            this.writeOps = req.writeOps;

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

    }
}
