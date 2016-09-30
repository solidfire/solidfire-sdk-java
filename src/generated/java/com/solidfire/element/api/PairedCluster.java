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
public class PairedCluster  implements Serializable  {

    private static final long serialVersionUID = 1718146493L;

    @SerializedName("clusterName") private final String clusterName;
    @SerializedName("clusterPairID") private final Long clusterPairID;
    @SerializedName("clusterPairUUID") private final java.util.UUID clusterPairUUID;
    @SerializedName("latency") private final Long latency;
    @SerializedName("mvip") private final String mvip;
    @SerializedName("status") private final String status;
    @SerializedName("version") private final String version;

    /**
     * 
     * @param clusterName [required] Name of the other cluster in the pair
     * @param clusterPairID [required] Unique ID given to each cluster in the pair.
     * @param clusterPairUUID [required] Universally unique identifier.
     * @param latency [required] Number, in milliseconds, of latency between clusters.
     * @param mvip [required] IP of the management connection for paired clusters.
     * @param status [required] Can be one of the following:
     * @param version [required] The Element OS version of the other cluster in the pair.
     * @since 7.0
     **/
    @Since("7.0")
    public PairedCluster(String clusterName, Long clusterPairID, java.util.UUID clusterPairUUID, Long latency, String mvip, String status, String version) {
        this.clusterPairID = clusterPairID;
        this.mvip = mvip;
        this.latency = latency;
        this.version = version;
        this.status = status;
        this.clusterName = clusterName;
        this.clusterPairUUID = clusterPairUUID;
    }


    /**
     * Name of the other cluster in the pair
     **/
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * Unique ID given to each cluster in the pair.
     **/
    public Long getClusterPairID() {
        return this.clusterPairID;
    }

    /**
     * Universally unique identifier.
     **/
    public java.util.UUID getClusterPairUUID() {
        return this.clusterPairUUID;
    }

    /**
     * Number, in milliseconds, of latency between clusters.
     **/
    public Long getLatency() {
        return this.latency;
    }

    /**
     * IP of the management connection for paired clusters.
     **/
    public String getMvip() {
        return this.mvip;
    }

    /**
     * Can be one of the following:
     * <br/><b>Connected</b>
     * <br/><b>Misconfigured</b>
     * <br/><b>Disconnected</b>
     **/
    public String getStatus() {
        return this.status;
    }

    /**
     * The Element OS version of the other cluster in the pair.
     **/
    public String getVersion() {
        return this.version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PairedCluster that = (PairedCluster) o;
        

        return Objects.equals( clusterName , that.clusterName )
            && Objects.equals( clusterPairID , that.clusterPairID )
            && Objects.equals( clusterPairUUID , that.clusterPairUUID )
            && Objects.equals( latency , that.latency )
            && Objects.equals( mvip , that.mvip )
            && Objects.equals( status , that.status )
            && Objects.equals( version , that.version );
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterName, clusterPairID, clusterPairUUID, latency, mvip, status, version );
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
        sb.append(" version : ").append(version);
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
                         this.version            );
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
