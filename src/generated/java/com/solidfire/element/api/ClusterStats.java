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
public class ClusterStats implements Serializable {

    private static final long serialVersionUID = 595507504L;

    @SerializedName("clusterUtilization") private final Double clusterUtilization;
    @SerializedName("clientQueueDepth") private final Long clientQueueDepth;
    @SerializedName("readBytes") private final Long readBytes;
    @SerializedName("readOps") private final Long readOps;
    @SerializedName("timestamp") private final String timestamp;
    @SerializedName("writeBytes") private final Long writeBytes;
    @SerializedName("writeOps") private final Long writeOps;

    /**
     * 
     * @param clusterUtilization [required] The amount of cluster capacity being utilized.
     * @param clientQueueDepth [required] 
     * @param readBytes [required] Total bytes read by clients.
     * @param readOps [required] Total read operations.
     * @param timestamp [required] Current time in UTC format. ISO 8601 date string.
     * @param writeBytes [required] Total bytes written by clients.
     * @param writeOps [required] Total write operations.
     * @since 7.0
     **/
    @Since("7.0")
    public ClusterStats(Double clusterUtilization, Long clientQueueDepth, Long readBytes, Long readOps, String timestamp, Long writeBytes, Long writeOps) {
        this.writeOps = writeOps;
        this.timestamp = timestamp;
        this.readOps = readOps;
        this.clusterUtilization = clusterUtilization;
        this.writeBytes = writeBytes;
        this.clientQueueDepth = clientQueueDepth;
        this.readBytes = readBytes;
    }


    /**
     * The amount of cluster capacity being utilized.
     **/
    public Double getClusterUtilization() {
        return this.clusterUtilization;
    }
    public Long getClientQueueDepth() {
        return this.clientQueueDepth;
    }

    /**
     * Total bytes read by clients.
     **/
    public Long getReadBytes() {
        return this.readBytes;
    }

    /**
     * Total read operations.
     **/
    public Long getReadOps() {
        return this.readOps;
    }

    /**
     * Current time in UTC format. ISO 8601 date string.
     **/
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * Total bytes written by clients.
     **/
    public Long getWriteBytes() {
        return this.writeBytes;
    }

    /**
     * Total write operations.
     **/
    public Long getWriteOps() {
        return this.writeOps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterStats that = (ClusterStats) o;
        

        return Objects.equals( clusterUtilization , that.clusterUtilization )
            && Objects.equals( clientQueueDepth , that.clientQueueDepth )
            && Objects.equals( readBytes , that.readBytes )
            && Objects.equals( readOps , that.readOps )
            && Objects.equals( timestamp , that.timestamp )
            && Objects.equals( writeBytes , that.writeBytes )
            && Objects.equals( writeOps , that.writeOps );
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterUtilization, clientQueueDepth, readBytes, readOps, timestamp, writeBytes, writeOps );
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
        sb.append(" writeOps : ").append(writeOps);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
