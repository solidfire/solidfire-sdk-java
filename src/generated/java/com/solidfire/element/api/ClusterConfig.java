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
 * Cluster Config object returns information the node uses to communicate with the cluster.
 **/

public class ClusterConfig implements Serializable {

    public static final long serialVersionUID = 3884387958155246889L;
    @SerializedName("cipi") private Optional<String> cipi;
    @SerializedName("cluster") private Optional<String> cluster;
    @SerializedName("ensemble") private Optional<String[]> ensemble;
    @SerializedName("mipi") private Optional<String> mipi;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("nodeID") private Optional<Long> nodeID;
    @SerializedName("pendingNodeID") private Optional<Long> pendingNodeID;
    @SerializedName("role") private Optional<String> role;
    @SerializedName("sipi") private Optional<String> sipi;
    @SerializedName("state") private Optional<String> state;

    // empty constructor
    @Since("7.0")
    public ClusterConfig() {}

    // parameterized constructor
    @Since("7.0")
    public ClusterConfig(
        Optional<String> cipi,
        Optional<String> cluster,
        Optional<String[]> ensemble,
        Optional<String> mipi,
        Optional<String> name,
        Optional<Long> nodeID,
        Optional<Long> pendingNodeID,
        Optional<String> role,
        Optional<String> sipi,
        Optional<String> state
    )
    {
        this.cipi = (cipi == null) ? Optional.<String>empty() : cipi;
        this.cluster = (cluster == null) ? Optional.<String>empty() : cluster;
        this.ensemble = (ensemble == null) ? Optional.<String[]>empty() : ensemble;
        this.mipi = (mipi == null) ? Optional.<String>empty() : mipi;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.nodeID = (nodeID == null) ? Optional.<Long>empty() : nodeID;
        this.pendingNodeID = (pendingNodeID == null) ? Optional.<Long>empty() : pendingNodeID;
        this.role = (role == null) ? Optional.<String>empty() : role;
        this.sipi = (sipi == null) ? Optional.<String>empty() : sipi;
        this.state = (state == null) ? Optional.<String>empty() : state;
    }

    /** 
     * Network interface used for cluster communication.
     **/
    public Optional<String> getCipi() { return this.cipi; }
    public void setCipi(Optional<String> cipi) { 
        this.cipi = (cipi == null) ? Optional.<String>empty() : cipi;
    }
    /** 
     * Unique cluster name.
     **/
    public Optional<String> getCluster() { return this.cluster; }
    public void setCluster(Optional<String> cluster) { 
        this.cluster = (cluster == null) ? Optional.<String>empty() : cluster;
    }
    /** 
     * Nodes that are participating in the cluster.
     **/
    public Optional<String[]> getEnsemble() { return this.ensemble; }
    public void setEnsemble(Optional<String[]> ensemble) { 
        this.ensemble = (ensemble == null) ? Optional.<String[]>empty() : ensemble;
    }
    /** 
     * Network interface used for node management.
     **/
    public Optional<String> getMipi() { return this.mipi; }
    public void setMipi(Optional<String> mipi) { 
        this.mipi = (mipi == null) ? Optional.<String>empty() : mipi;
    }
    /** 
     * Unique cluster name.
     **/
    public Optional<String> getName() { return this.name; }
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     **/
    public Optional<Long> getNodeID() { return this.nodeID; }
    public void setNodeID(Optional<Long> nodeID) { 
        this.nodeID = (nodeID == null) ? Optional.<Long>empty() : nodeID;
    }
    /** 
     **/
    public Optional<Long> getPendingNodeID() { return this.pendingNodeID; }
    public void setPendingNodeID(Optional<Long> pendingNodeID) { 
        this.pendingNodeID = (pendingNodeID == null) ? Optional.<Long>empty() : pendingNodeID;
    }
    /** 
     * Identifies the role of the node
     **/
    public Optional<String> getRole() { return this.role; }
    public void setRole(Optional<String> role) { 
        this.role = (role == null) ? Optional.<String>empty() : role;
    }
    /** 
     * Network interface used for storage.
     **/
    public Optional<String> getSipi() { return this.sipi; }
    public void setSipi(Optional<String> sipi) { 
        this.sipi = (sipi == null) ? Optional.<String>empty() : sipi;
    }
    /** 
     **/
    public Optional<String> getState() { return this.state; }
    public void setState(Optional<String> state) { 
        this.state = (state == null) ? Optional.<String>empty() : state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterConfig that = (ClusterConfig) o;
        return 
            Objects.equals(cipi, that.cipi) &&
            Objects.equals(cluster, that.cluster) &&
            Arrays.equals(ensemble, that.ensemble) &&
            Objects.equals(mipi, that.mipi) &&
            Objects.equals(name, that.name) &&
            Objects.equals(nodeID, that.nodeID) &&
            Objects.equals(pendingNodeID, that.pendingNodeID) &&
            Objects.equals(role, that.role) &&
            Objects.equals(sipi, that.sipi) &&
            Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash( cipi, cluster, ensemble, mipi, name, nodeID, pendingNodeID, role, sipi, state );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("cipi", cipi);
        map.put("cluster", cluster);
        map.put("ensemble", ensemble);
        map.put("mipi", mipi);
        map.put("name", name);
        map.put("nodeID", nodeID);
        map.put("pendingNodeID", pendingNodeID);
        map.put("role", role);
        map.put("sipi", sipi);
        map.put("state", state);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != cipi && cipi.isPresent()){
            sb.append(" cipi : ").append(cipi).append(",");
        }
        if(null != cluster && cluster.isPresent()){
            sb.append(" cluster : ").append(cluster).append(",");
        }
        if(null != ensemble && ensemble.isPresent()){
            sb.append(" ensemble : ").append(ensemble).append(",");
        }
        if(null != mipi && mipi.isPresent()){
            sb.append(" mipi : ").append(mipi).append(",");
        }
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(name).append(",");
        }
        if(null != nodeID && nodeID.isPresent()){
            sb.append(" nodeID : ").append(nodeID).append(",");
        }
        if(null != pendingNodeID && pendingNodeID.isPresent()){
            sb.append(" pendingNodeID : ").append(pendingNodeID).append(",");
        }
        if(null != role && role.isPresent()){
            sb.append(" role : ").append(role).append(",");
        }
        if(null != sipi && sipi.isPresent()){
            sb.append(" sipi : ").append(sipi).append(",");
        }
        if(null != state && state.isPresent()){
            sb.append(" state : ").append(state).append(",");
        }
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
                         this.state);
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
