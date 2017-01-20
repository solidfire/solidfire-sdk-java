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
 * PairedCluster  
 **/

public class PairedCluster implements Serializable {

    public static final long serialVersionUID = -1634521540469589650L;
    @SerializedName("clusterName") private String clusterName;
    @SerializedName("clusterPairID") private Long clusterPairID;
    @SerializedName("clusterPairUUID") private java.util.UUID clusterPairUUID;
    @SerializedName("latency") private Long latency;
    @SerializedName("mvip") private String mvip;
    @SerializedName("status") private String status;
    @SerializedName("version") private String version;

    // empty constructor
    @Since("7.0")
    public PairedCluster() {}

    
    // parameterized constructor
    @Since("7.0")
    public PairedCluster(
        String clusterName,
        Long clusterPairID,
        java.util.UUID clusterPairUUID,
        Long latency,
        String mvip,
        String status,
        String version
    )
    {
        this.clusterName = clusterName;
        this.clusterPairID = clusterPairID;
        this.clusterPairUUID = clusterPairUUID;
        this.latency = latency;
        this.mvip = mvip;
        this.status = status;
        this.version = version;
    }

    /** 
     * Name of the other cluster in the pair
     **/
    public String getClusterName() { return this.clusterName; }
    public void setClusterName(String clusterName) { 
        this.clusterName = clusterName;
    }
    /** 
     * Unique ID given to each cluster in the pair.
     **/
    public Long getClusterPairID() { return this.clusterPairID; }
    public void setClusterPairID(Long clusterPairID) { 
        this.clusterPairID = clusterPairID;
    }
    /** 
     * Universally unique identifier.
     **/
    public java.util.UUID getClusterPairUUID() { return this.clusterPairUUID; }
    public void setClusterPairUUID(java.util.UUID clusterPairUUID) { 
        this.clusterPairUUID = clusterPairUUID;
    }
    /** 
     * Number, in milliseconds, of latency between clusters.
     **/
    public Long getLatency() { return this.latency; }
    public void setLatency(Long latency) { 
        this.latency = latency;
    }
    /** 
     * IP of the management connection for paired clusters.
     **/
    public String getMvip() { return this.mvip; }
    public void setMvip(String mvip) { 
        this.mvip = mvip;
    }
    /** 
     * Can be one of the following:
     * Connected
     * Misconfigured
     * Disconnected
     **/
    public String getStatus() { return this.status; }
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     * The Element OS version of the other cluster in the pair.
     **/
    public String getVersion() { return this.version; }
    public void setVersion(String version) { 
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PairedCluster that = (PairedCluster) o;

        return 
            Objects.equals(clusterName, that.clusterName) && 
            Objects.equals(clusterPairID, that.clusterPairID) && 
            Objects.equals(clusterPairUUID, that.clusterPairUUID) && 
            Objects.equals(latency, that.latency) && 
            Objects.equals(mvip, that.mvip) && 
            Objects.equals(status, that.status) && 
            Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterName,clusterPairID,clusterPairUUID,latency,mvip,status,version );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterName", clusterName);
        map.put("clusterPairID", clusterPairID);
        map.put("clusterPairUUID", clusterPairUUID);
        map.put("latency", latency);
        map.put("mvip", mvip);
        map.put("status", status);
        map.put("version", version);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterName : ").append(clusterName).append(",");
        sb.append(" clusterPairID : ").append(clusterPairID).append(",");
        sb.append(" clusterPairUUID : ").append(clusterPairUUID).append(",");
        sb.append(" latency : ").append(latency).append(",");
        sb.append(" mvip : ").append(mvip).append(",");
        sb.append(" status : ").append(status).append(",");
        sb.append(" version : ").append(version).append(",");
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
        private String clusterName;
        private Long clusterPairID;
        private java.util.UUID clusterPairUUID;
        private Long latency;
        private String mvip;
        private String status;
        private String version;

        private Builder() { }

        public PairedCluster build() {
            return new PairedCluster (
                         this.clusterName,
                         this.clusterPairID,
                         this.clusterPairUUID,
                         this.latency,
                         this.mvip,
                         this.status,
                         this.version);
        }

        private PairedCluster.Builder buildFrom(final PairedCluster req) {
            this.clusterName = req.clusterName;
            this.clusterPairID = req.clusterPairID;
            this.clusterPairUUID = req.clusterPairUUID;
            this.latency = req.latency;
            this.mvip = req.mvip;
            this.status = req.status;
            this.version = req.version;

            return this;
        }

        public PairedCluster.Builder clusterName(final String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public PairedCluster.Builder clusterPairID(final Long clusterPairID) {
            this.clusterPairID = clusterPairID;
            return this;
        }

        public PairedCluster.Builder clusterPairUUID(final java.util.UUID clusterPairUUID) {
            this.clusterPairUUID = clusterPairUUID;
            return this;
        }

        public PairedCluster.Builder latency(final Long latency) {
            this.latency = latency;
            return this;
        }

        public PairedCluster.Builder mvip(final String mvip) {
            this.mvip = mvip;
            return this;
        }

        public PairedCluster.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public PairedCluster.Builder version(final String version) {
            this.version = version;
            return this;
        }

    }
}
