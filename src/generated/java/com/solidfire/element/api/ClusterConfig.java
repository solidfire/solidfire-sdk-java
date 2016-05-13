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
 * Cluster Config object returns information the node uses to communicate with the cluster.
 **/
public class ClusterConfig implements Serializable {

    private static final long serialVersionUID = 1903782929L;

    private final String cipi;
    private final String cluster;
    private final String[] ensemble;
    private final String mipi;
    private final String name;
    private final Optional<Long> nodeID;
    private final Optional<Long> pendingNodeID;
    private final String role;
    private final String sipi;
    private final String state;

    /**
     * Cluster Config object returns information the node uses to communicate with the cluster.
     * @param cipi [required] Network interface used for cluster communication.
     * @param cluster [required] Unique cluster name.
     * @param ensemble [required] Nodes that are participating in the cluster.
     * @param mipi [required] Network interface used for node management.
     * @param name [required] Unique cluster name.
     * @param nodeID (optional) 
     * @param pendingNodeID (optional) 
     * @param role [required] Identifies the role of the node
     * @param sipi [required] Network interface used for storage.
     * @param state [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public ClusterConfig(String cipi, String cluster, String[] ensemble, String mipi, String name, Optional<Long> nodeID, Optional<Long> pendingNodeID, String role, String sipi, String state) {
        this.name = name;
        this.state = state;
        this.cipi = cipi;
        this.role = role;
        this.ensemble = ensemble;
        this.pendingNodeID = (pendingNodeID == null) ? Optional.<Long>empty() : pendingNodeID;
        this.cluster = cluster;
        this.sipi = sipi;
        this.nodeID = (nodeID == null) ? Optional.<Long>empty() : nodeID;
        this.mipi = mipi;
    }


    /**
     * Network interface used for cluster communication.
     **/
    public String getCipi() {
        return this.cipi;
    }

    /**
     * Unique cluster name.
     **/
    public String getCluster() {
        return this.cluster;
    }

    /**
     * Nodes that are participating in the cluster.
     **/
    public String[] getEnsemble() {
        return this.ensemble;
    }

    /**
     * Network interface used for node management.
     **/
    public String getMipi() {
        return this.mipi;
    }

    /**
     * Unique cluster name.
     **/
    public String getName() {
        return this.name;
    }
    public Optional<Long> getNodeID() {
        return this.nodeID;
    }
    public Optional<Long> getPendingNodeID() {
        return this.pendingNodeID;
    }

    /**
     * Identifies the role of the node
     **/
    public String getRole() {
        return this.role;
    }

    /**
     * Network interface used for storage.
     **/
    public String getSipi() {
        return this.sipi;
    }
    public String getState() {
        return this.state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterConfig that = (ClusterConfig) o;
        

        return Objects.equals( cipi , that.cipi )
            && Objects.equals( cluster , that.cluster )
            && Objects.deepEquals( ensemble , that.ensemble )
            && Objects.equals( mipi , that.mipi )
            && Objects.equals( name , that.name )
            && Objects.equals( nodeID , that.nodeID )
            && Objects.equals( pendingNodeID , that.pendingNodeID )
            && Objects.equals( role , that.role )
            && Objects.equals( sipi , that.sipi )
            && Objects.equals( state , that.state );
    }

    @Override
    public int hashCode() {

        return Objects.hash( cipi, cluster, ensemble, mipi, name, nodeID, pendingNodeID, role, sipi, state );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" cipi : ").append(cipi).append(",");
        sb.append(" cluster : ").append(cluster).append(",");
        sb.append(" ensemble : ").append(Arrays.toString(ensemble)).append(",");
        sb.append(" mipi : ").append(mipi).append(",");
        sb.append(" name : ").append(name).append(",");
        if(null != nodeID && nodeID.isPresent())
            sb.append(" nodeID : ").append(nodeID.get()).append(",");
        if(null != pendingNodeID && pendingNodeID.isPresent())
            sb.append(" pendingNodeID : ").append(pendingNodeID.get()).append(",");
        sb.append(" role : ").append(role).append(",");
        sb.append(" sipi : ").append(sipi).append(",");
        sb.append(" state : ").append(state);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
