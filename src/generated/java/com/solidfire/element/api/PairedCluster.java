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
public class PairedCluster implements Serializable {

    private static final long serialVersionUID = 1075756961L;

    @SerializedName("clusterName") private final String clusterName;
    @SerializedName("clusterPairID") private final long clusterPairID;
    @SerializedName("clusterPairUUID") private final String clusterPairUUID;
    @SerializedName("latency") private final long latency;
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
     * @param status [required] Can be one of the following:<br/>
     * @param version [required] The Element OS version of the other cluster in the pair.
     * @since 7.0
     **/
    @Since("7.0")
    public PairedCluster(String clusterName, long clusterPairID, String clusterPairUUID, long latency, String mvip, String status, String version) {
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
    public long getClusterPairID() {
        return this.clusterPairID;
    }

    /**
     * Universally unique identifier.
     **/
    public String getClusterPairUUID() {
        return this.clusterPairUUID;
    }

    /**
     * Number, in milliseconds, of latency between clusters.
     **/
    public long getLatency() {
        return this.latency;
    }

    /**
     * IP of the management connection for paired clusters.
     **/
    public String getMvip() {
        return this.mvip;
    }

    /**
     * Can be one of the following:<br/>
     * <b>Connected</b>
     * <b>Misconfigured</b>
     * <b>Disconnected</b>
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
}
