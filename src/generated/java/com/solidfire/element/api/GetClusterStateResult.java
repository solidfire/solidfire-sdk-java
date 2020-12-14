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
 * GetClusterStateResult  
 **/

public class GetClusterStateResult implements Serializable {

    public static final long serialVersionUID = 4535059977135751175L;
    @SerializedName("nodes") private Optional<NodeStateResult[]> nodes;
    @SerializedName("cluster") private Optional<String> cluster;
    @SerializedName("state") private Optional<String> state;
    // empty constructor
    @Since("7.0")
    public GetClusterStateResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetClusterStateResult(
        Optional<NodeStateResult[]> nodes,
        Optional<String> cluster,
        Optional<String> state
    )
    {
        this.nodes = (nodes == null) ? Optional.<NodeStateResult[]>empty() : nodes;
        this.cluster = (cluster == null) ? Optional.<String>empty() : cluster;
        this.state = (state == null) ? Optional.<String>empty() : state;
    }

    /** 
     * Array of NodeStateResult objects for each node in the cluster.
     **/
    public Optional<NodeStateResult[]> getNodes() { return this.nodes; }
   
    public void setNodes(Optional<NodeStateResult[]> nodes) { 
        this.nodes = (nodes == null) ? Optional.<NodeStateResult[]>empty() : nodes;
    }
    /** 
     * 
     **/
    public Optional<String> getCluster() { return this.cluster; }
   
    public void setCluster(Optional<String> cluster) { 
        this.cluster = (cluster == null) ? Optional.<String>empty() : cluster;
    }
    /** 
     * 
     **/
    public Optional<String> getState() { return this.state; }
   
    public void setState(Optional<String> state) { 
        this.state = (state == null) ? Optional.<String>empty() : state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClusterStateResult that = (GetClusterStateResult) o;

        return 
            Objects.equals(nodes, that.nodes) && 
            Objects.equals(cluster, that.cluster) && 
            Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodes,cluster,state );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodes", nodes);
        map.put("cluster", cluster);
        map.put("state", state);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != nodes && nodes.isPresent()){
            sb.append(" nodes : ").append(gson.toJson(nodes)).append(",");
        }
        else{
            sb.append(" nodes : ").append("null").append(",");
        }
        if(null != cluster && cluster.isPresent()){
            sb.append(" cluster : ").append(gson.toJson(cluster)).append(",");
        }
        else{
            sb.append(" cluster : ").append("null").append(",");
        }
        if(null != state && state.isPresent()){
            sb.append(" state : ").append(gson.toJson(state)).append(",");
        }
        else{
            sb.append(" state : ").append("null").append(",");
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
        private Optional<NodeStateResult[]> nodes;
        private Optional<String> cluster;
        private Optional<String> state;

        private Builder() { }

        public GetClusterStateResult build() {
            return new GetClusterStateResult (
                         this.nodes,
                         this.cluster,
                         this.state);
        }

        private GetClusterStateResult.Builder buildFrom(final GetClusterStateResult req) {
            this.nodes = req.nodes;
            this.cluster = req.cluster;
            this.state = req.state;

            return this;
        }

        public GetClusterStateResult.Builder optionalNodes(final NodeStateResult[] nodes) {
            this.nodes = (nodes == null) ? Optional.<NodeStateResult[]>empty() : Optional.of(nodes);
            return this;
        }

        public GetClusterStateResult.Builder optionalCluster(final String cluster) {
            this.cluster = (cluster == null) ? Optional.<String>empty() : Optional.of(cluster);
            return this;
        }

        public GetClusterStateResult.Builder optionalState(final String state) {
            this.state = (state == null) ? Optional.<String>empty() : Optional.of(state);
            return this;
        }

    }
}
