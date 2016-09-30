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
 * Cluster Config object returns information the node uses to communicate with the cluster.
 **/
public class ClusterConfig  implements Serializable  {

    private static final long serialVersionUID = 956907419L;

    @SerializedName("cipi") private final Optional<String> cipi;
    @SerializedName("cluster") private final Optional<String> cluster;
    @SerializedName("ensemble") private final Optional<String[]> ensemble;
    @SerializedName("mipi") private final Optional<String> mipi;
    @SerializedName("name") private final Optional<String> name;
    @SerializedName("nodeID") private final Optional<Long> nodeID;
    @SerializedName("pendingNodeID") private final Optional<Long> pendingNodeID;
    @SerializedName("role") private final Optional<String> role;
    @SerializedName("sipi") private final Optional<String> sipi;
    @SerializedName("state") private final Optional<String> state;

    /**
     * Cluster Config object returns information the node uses to communicate with the cluster.
     * @param cipi (optional) Network interface used for cluster communication.
     * @param cluster (optional) Unique cluster name.
     * @param ensemble (optional) Nodes that are participating in the cluster.
     * @param mipi (optional) Network interface used for node management.
     * @param name (optional) Unique cluster name.
     * @param nodeID (optional) 
     * @param pendingNodeID (optional) 
     * @param role (optional) Identifies the role of the node
     * @param sipi (optional) Network interface used for storage.
     * @param state (optional) 
     * @since 7.0
     **/
    @Since("7.0")
    public ClusterConfig(Optional<String> cipi, Optional<String> cluster, Optional<String[]> ensemble, Optional<String> mipi, Optional<String> name, Optional<Long> nodeID, Optional<Long> pendingNodeID, Optional<String> role, Optional<String> sipi, Optional<String> state) {
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.state = (state == null) ? Optional.<String>empty() : state;
        this.cipi = (cipi == null) ? Optional.<String>empty() : cipi;
        this.role = (role == null) ? Optional.<String>empty() : role;
        this.ensemble = (ensemble == null) ? Optional.<String[]>empty() : ensemble;
        this.pendingNodeID = (pendingNodeID == null) ? Optional.<Long>empty() : pendingNodeID;
        this.cluster = (cluster == null) ? Optional.<String>empty() : cluster;
        this.sipi = (sipi == null) ? Optional.<String>empty() : sipi;
        this.nodeID = (nodeID == null) ? Optional.<Long>empty() : nodeID;
        this.mipi = (mipi == null) ? Optional.<String>empty() : mipi;
    }


    /**
     * Network interface used for cluster communication.
     **/
    public Optional<String> getCipi() {
        return this.cipi;
    }

    /**
     * Unique cluster name.
     **/
    public Optional<String> getCluster() {
        return this.cluster;
    }

    /**
     * Nodes that are participating in the cluster.
     **/
    public Optional<String[]> getEnsemble() {
        return this.ensemble;
    }

    /**
     * Network interface used for node management.
     **/
    public Optional<String> getMipi() {
        return this.mipi;
    }

    /**
     * Unique cluster name.
     **/
    public Optional<String> getName() {
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
    public Optional<String> getRole() {
        return this.role;
    }

    /**
     * Network interface used for storage.
     **/
    public Optional<String> getSipi() {
        return this.sipi;
    }
    public Optional<String> getState() {
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

        if(null != cipi && cipi.isPresent())
            sb.append(" cipi : ").append(cipi.get()).append(",");
        if(null != cluster && cluster.isPresent())
            sb.append(" cluster : ").append(cluster.get()).append(",");
        if(null != ensemble && ensemble.isPresent())
            sb.append(" ensemble : ").append(Arrays.toString(ensemble.get())).append(",");
        if(null != mipi && mipi.isPresent())
            sb.append(" mipi : ").append(mipi.get()).append(",");
        if(null != name && name.isPresent())
            sb.append(" name : ").append(name.get()).append(",");
        if(null != nodeID && nodeID.isPresent())
            sb.append(" nodeID : ").append(nodeID.get()).append(",");
        if(null != pendingNodeID && pendingNodeID.isPresent())
            sb.append(" pendingNodeID : ").append(pendingNodeID.get()).append(",");
        if(null != role && role.isPresent())
            sb.append(" role : ").append(role.get()).append(",");
        if(null != sipi && sipi.isPresent())
            sb.append(" sipi : ").append(sipi.get()).append(",");
        if(null != state && state.isPresent())
            sb.append(" state : ").append(state.get());
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
        private Optional<String> cipi;
        private Optional<String> cluster;
        private Optional<String[]> ensemble;
        private Optional<String> mipi;
        private Optional<String> name;
        private Optional<Long> nodeID;
        private Optional<Long> pendingNodeID;
        private Optional<String> role;
        private Optional<String> sipi;
        private Optional<String> state;

        private Builder() { }

        public ClusterConfig build() {
            return new ClusterConfig (
                         this.cipi,
                         this.cluster,
                         this.ensemble,
                         this.mipi,
                         this.name,
                         this.nodeID,
                         this.pendingNodeID,
                         this.role,
                         this.sipi,
                         this.state            );
        }

        private ClusterConfig.Builder buildFrom(final ClusterConfig req) {
            this.cipi = req.cipi;
            this.cluster = req.cluster;
            this.ensemble = req.ensemble;
            this.mipi = req.mipi;
            this.name = req.name;
            this.nodeID = req.nodeID;
            this.pendingNodeID = req.pendingNodeID;
            this.role = req.role;
            this.sipi = req.sipi;
            this.state = req.state;

            return this;
        }

        public ClusterConfig.Builder optionalCipi(final String cipi) {
            this.cipi = (cipi == null) ? Optional.<String>empty() : Optional.of(cipi);
            return this;
        }

        public ClusterConfig.Builder optionalCluster(final String cluster) {
            this.cluster = (cluster == null) ? Optional.<String>empty() : Optional.of(cluster);
            return this;
        }

        public ClusterConfig.Builder optionalEnsemble(final String[] ensemble) {
            this.ensemble = (ensemble == null) ? Optional.<String[]>empty() : Optional.of(ensemble);
            return this;
        }

        public ClusterConfig.Builder optionalMipi(final String mipi) {
            this.mipi = (mipi == null) ? Optional.<String>empty() : Optional.of(mipi);
            return this;
        }

        public ClusterConfig.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public ClusterConfig.Builder optionalNodeID(final Long nodeID) {
            this.nodeID = (nodeID == null) ? Optional.<Long>empty() : Optional.of(nodeID);
            return this;
        }

        public ClusterConfig.Builder optionalPendingNodeID(final Long pendingNodeID) {
            this.pendingNodeID = (pendingNodeID == null) ? Optional.<Long>empty() : Optional.of(pendingNodeID);
            return this;
        }

        public ClusterConfig.Builder optionalRole(final String role) {
            this.role = (role == null) ? Optional.<String>empty() : Optional.of(role);
            return this;
        }

        public ClusterConfig.Builder optionalSipi(final String sipi) {
            this.sipi = (sipi == null) ? Optional.<String>empty() : Optional.of(sipi);
            return this;
        }

        public ClusterConfig.Builder optionalState(final String state) {
            this.state = (state == null) ? Optional.<String>empty() : Optional.of(state);
            return this;
        }

    }

}
