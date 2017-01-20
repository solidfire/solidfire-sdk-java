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
 * ListAllNodesResult  
 **/

public class ListAllNodesResult implements Serializable {

    public static final long serialVersionUID = -7669750478128627170L;
    @SerializedName("nodes") private Node[] nodes;
    @SerializedName("pendingNodes") private PendingNode[] pendingNodes;

    // empty constructor
    @Since("7.0")
    public ListAllNodesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListAllNodesResult(
        Node[] nodes,
        PendingNode[] pendingNodes
    )
    {
        this.nodes = nodes;
        this.pendingNodes = pendingNodes;
    }

    /** 
     **/
    public Node[] getNodes() { return this.nodes; }
    public void setNodes(Node[] nodes) { 
        this.nodes = nodes;
    }
    /** 
     **/
    public PendingNode[] getPendingNodes() { return this.pendingNodes; }
    public void setPendingNodes(PendingNode[] pendingNodes) { 
        this.pendingNodes = pendingNodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListAllNodesResult that = (ListAllNodesResult) o;

        return 
            Arrays.equals(nodes, that.nodes) && 
            Arrays.equals(pendingNodes, that.pendingNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])nodes,(Object[])pendingNodes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodes", nodes);
        map.put("pendingNodes", pendingNodes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodes : ").append(Arrays.toString(nodes)).append(",");
        sb.append(" pendingNodes : ").append(Arrays.toString(pendingNodes)).append(",");
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
        private Node[] nodes;
        private PendingNode[] pendingNodes;

        private Builder() { }

        public ListAllNodesResult build() {
            return new ListAllNodesResult (
                         this.nodes,
                         this.pendingNodes);
        }

        private ListAllNodesResult.Builder buildFrom(final ListAllNodesResult req) {
            this.nodes = req.nodes;
            this.pendingNodes = req.pendingNodes;

            return this;
        }

        public ListAllNodesResult.Builder nodes(final Node[] nodes) {
            this.nodes = nodes;
            return this;
        }

        public ListAllNodesResult.Builder pendingNodes(final PendingNode[] pendingNodes) {
            this.pendingNodes = pendingNodes;
            return this;
        }

    }
}
