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
 * CheckProposedClusterRequest  
 * CheckProposedCluster validates that creating a cluster from a given set of nodes is likely to succeed.  Any problems with the proposed cluster are returned as errors with a human-readable description and unique error code.
 **/

public class CheckProposedClusterRequest implements Serializable {

    public static final long serialVersionUID = 1943851611380268634L;
    @SerializedName("nodes") private String[] nodes;
    // empty constructor
    @Since("7.0")
    public CheckProposedClusterRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CheckProposedClusterRequest(
        String[] nodes
    )
    {
        this.nodes = nodes;
    }

    /** 
     * List of node IPs for the nodes in the new cluster.
     **/
    public String[] getNodes() { return this.nodes; }
   
    public void setNodes(String[] nodes) { 
        this.nodes = nodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CheckProposedClusterRequest that = (CheckProposedClusterRequest) o;

        return 
            Arrays.equals(nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])nodes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodes", nodes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" nodes : ").append(gson.toJson(Arrays.toString(nodes))).append(",");
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
        private String[] nodes;

        private Builder() { }

        public CheckProposedClusterRequest build() {
            return new CheckProposedClusterRequest (
                         this.nodes);
        }

        private CheckProposedClusterRequest.Builder buildFrom(final CheckProposedClusterRequest req) {
            this.nodes = req.nodes;

            return this;
        }

        public CheckProposedClusterRequest.Builder nodes(final String[] nodes) {
            this.nodes = nodes;
            return this;
        }

    }
}
