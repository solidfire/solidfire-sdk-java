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
 * GetBootstrapConfigResult  
 **/

public class GetBootstrapConfigResult implements Serializable {

    public static final long serialVersionUID = 7635078735348945319L;
    @SerializedName("clusterName") private String clusterName;
    @SerializedName("nodeName") private String nodeName;
    @SerializedName("nodes") private NodeWaitingToJoin[] nodes;
    @SerializedName("version") private String version;
    // empty constructor
    @Since("7.0")
    public GetBootstrapConfigResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetBootstrapConfigResult(
        String clusterName,
        String nodeName,
        NodeWaitingToJoin[] nodes,
        String version
    )
    {
        this.clusterName = clusterName;
        this.nodeName = nodeName;
        this.nodes = nodes;
        this.version = version;
    }

    /** 
     * Name of the cluster.
     **/
    public String getClusterName() { return this.clusterName; }
   
    public void setClusterName(String clusterName) { 
        this.clusterName = clusterName;
    }
    /** 
     * Name of the node.
     **/
    public String getNodeName() { return this.nodeName; }
   
    public void setNodeName(String nodeName) { 
        this.nodeName = nodeName;
    }
    /** 
     * List of descriptions for each node that is actively waiting to join this cluster: compatible - Indicates if the listed node is compatible with the node the API call was executed against. name - IP address of each node. version - version of SolidFire Element software currently installed on the node.
     **/
    public NodeWaitingToJoin[] getNodes() { return this.nodes; }
   
    public void setNodes(NodeWaitingToJoin[] nodes) { 
        this.nodes = nodes;
    }
    /** 
     * Version of the SolidFire Element software currently installed.
     **/
    public String getVersion() { return this.version; }
   
    public void setVersion(String version) { 
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetBootstrapConfigResult that = (GetBootstrapConfigResult) o;

        return 
            Objects.equals(clusterName, that.clusterName) && 
            Objects.equals(nodeName, that.nodeName) && 
            Arrays.equals(nodes, that.nodes) && 
            Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterName,nodeName,(Object[])nodes,version );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterName", clusterName);
        map.put("nodeName", nodeName);
        map.put("nodes", nodes);
        map.put("version", version);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" clusterName : ").append(gson.toJson(clusterName)).append(",");
        sb.append(" nodeName : ").append(gson.toJson(nodeName)).append(",");
        sb.append(" nodes : ").append(gson.toJson(Arrays.toString(nodes))).append(",");
        sb.append(" version : ").append(gson.toJson(version)).append(",");
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
        private String nodeName;
        private NodeWaitingToJoin[] nodes;
        private String version;

        private Builder() { }

        public GetBootstrapConfigResult build() {
            return new GetBootstrapConfigResult (
                         this.clusterName,
                         this.nodeName,
                         this.nodes,
                         this.version);
        }

        private GetBootstrapConfigResult.Builder buildFrom(final GetBootstrapConfigResult req) {
            this.clusterName = req.clusterName;
            this.nodeName = req.nodeName;
            this.nodes = req.nodes;
            this.version = req.version;

            return this;
        }

        public GetBootstrapConfigResult.Builder clusterName(final String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public GetBootstrapConfigResult.Builder nodeName(final String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        public GetBootstrapConfigResult.Builder nodes(final NodeWaitingToJoin[] nodes) {
            this.nodes = nodes;
            return this;
        }

        public GetBootstrapConfigResult.Builder version(final String version) {
            this.version = version;
            return this;
        }

    }
}
