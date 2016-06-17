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
 * Cluster Info object returns information the node uses to communicate with the cluster.
 **/
public class ClusterInfo implements Serializable {

    private static final long serialVersionUID = 1308956314L;

    @SerializedName("attributes") private final java.util.Map<String, Object> attributes;
    @SerializedName("encryptionAtRestState") private final String encryptionAtRestState;
    @SerializedName("ensemble") private final String[] ensemble;
    @SerializedName("mvip") private final String mvip;
    @SerializedName("mvipNodeID") private final long mvipNodeID;
    @SerializedName("name") private final String name;
    @SerializedName("repCount") private final long repCount;
    @SerializedName("state") private final String state;
    @SerializedName("svip") private final String svip;
    @SerializedName("svipNodeID") private final long svipNodeID;
    @SerializedName("uniqueID") private final String uniqueID;
    @SerializedName("uuid") private final String uuid;

    /**
     * Cluster Info object returns information the node uses to communicate with the cluster.
     * @param attributes [required] List of Name/Value pairs in JSON object format.
     * @param encryptionAtRestState [required] Encryption at rest state.
     * @param ensemble [required] Array of Node IP addresses that are participating in the cluster.
     * @param mvip [required] Management network interface.
     * @param mvipNodeID [required] Node holding the master MVIP address
     * @param name [required] Unique cluster name.
     * @param repCount [required] Number of replicas of each piece of data to store in the cluster.
     * @param state [required] 
     * @param svip [required] Storage virtual IP
     * @param svipNodeID [required] Node holding the master SVIP address.
     * @param uniqueID [required] Unique ID for the cluster.
     * @param uuid [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public ClusterInfo(java.util.Map<String, Object> attributes, String encryptionAtRestState, String[] ensemble, String mvip, long mvipNodeID, String name, long repCount, String state, String svip, long svipNodeID, String uniqueID, String uuid) {
        this.name = name;
        this.state = state;
        this.uuid = uuid;
        this.mvip = mvip;
        this.svipNodeID = svipNodeID;
        this.ensemble = ensemble;
        this.attributes = attributes;
        this.repCount = repCount;
        this.encryptionAtRestState = encryptionAtRestState;
        this.mvipNodeID = mvipNodeID;
        this.svip = svip;
        this.uniqueID = uniqueID;
    }


    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public java.util.Map<String, Object> getAttributes() {
        return this.attributes;
    }

    /**
     * Encryption at rest state.
     **/
    public String getEncryptionAtRestState() {
        return this.encryptionAtRestState;
    }

    /**
     * Array of Node IP addresses that are participating in the cluster.
     **/
    public String[] getEnsemble() {
        return this.ensemble;
    }

    /**
     * Management network interface.
     **/
    public String getMvip() {
        return this.mvip;
    }

    /**
     * Node holding the master MVIP address
     **/
    public long getMvipNodeID() {
        return this.mvipNodeID;
    }

    /**
     * Unique cluster name.
     **/
    public String getName() {
        return this.name;
    }

    /**
     * Number of replicas of each piece of data to store in the cluster.
     * Valid value is 2
     **/
    public long getRepCount() {
        return this.repCount;
    }
    public String getState() {
        return this.state;
    }

    /**
     * Storage virtual IP
     **/
    public String getSvip() {
        return this.svip;
    }

    /**
     * Node holding the master SVIP address.
     **/
    public long getSvipNodeID() {
        return this.svipNodeID;
    }

    /**
     * Unique ID for the cluster.
     **/
    public String getUniqueID() {
        return this.uniqueID;
    }
    public String getUuid() {
        return this.uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterInfo that = (ClusterInfo) o;
        

        return Objects.equals( attributes , that.attributes )
            && Objects.equals( encryptionAtRestState , that.encryptionAtRestState )
            && Objects.deepEquals( ensemble , that.ensemble )
            && Objects.equals( mvip , that.mvip )
            && Objects.equals( mvipNodeID , that.mvipNodeID )
            && Objects.equals( name , that.name )
            && Objects.equals( repCount , that.repCount )
            && Objects.equals( state , that.state )
            && Objects.equals( svip , that.svip )
            && Objects.equals( svipNodeID , that.svipNodeID )
            && Objects.equals( uniqueID , that.uniqueID )
            && Objects.equals( uuid , that.uuid );
    }

    @Override
    public int hashCode() {
        return Objects.hash( attributes, encryptionAtRestState, ensemble, mvip, mvipNodeID, name, repCount, state, svip, svipNodeID, uniqueID, uuid );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" attributes : ").append(attributes).append(",");
        sb.append(" encryptionAtRestState : ").append(encryptionAtRestState).append(",");
        sb.append(" ensemble : ").append(Arrays.toString(ensemble)).append(",");
        sb.append(" mvip : ").append(mvip).append(",");
        sb.append(" mvipNodeID : ").append(mvipNodeID).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" repCount : ").append(repCount).append(",");
        sb.append(" state : ").append(state).append(",");
        sb.append(" svip : ").append(svip).append(",");
        sb.append(" svipNodeID : ").append(svipNodeID).append(",");
        sb.append(" uniqueID : ").append(uniqueID).append(",");
        sb.append(" uuid : ").append(uuid);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
