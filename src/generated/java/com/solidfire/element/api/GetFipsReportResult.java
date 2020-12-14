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
 * GetFipsReportResult  
 * An array of objects, one from each node in the cluster, indicating FIPS information.
 **/

public class GetFipsReportResult implements Serializable {

    public static final long serialVersionUID = 7495110696879557902L;
    @SerializedName("nodes") private FipsNodeReportType[] nodes;
    @SerializedName("errorNodes") private FipsErrorNodeReportType[] errorNodes;
    // empty constructor
    @Since("7.0")
    public GetFipsReportResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetFipsReportResult(
        FipsNodeReportType[] nodes,
        FipsErrorNodeReportType[] errorNodes
    )
    {
        this.nodes = nodes;
        this.errorNodes = errorNodes;
    }

    /** 
     * Array of nodes containing FIPS information.
     **/
    public FipsNodeReportType[] getNodes() { return this.nodes; }
   
    public void setNodes(FipsNodeReportType[] nodes) { 
        this.nodes = nodes;
    }
    /** 
     * Array of nodes that failed to gather FIPS information.
     **/
    public FipsErrorNodeReportType[] getErrorNodes() { return this.errorNodes; }
   
    public void setErrorNodes(FipsErrorNodeReportType[] errorNodes) { 
        this.errorNodes = errorNodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetFipsReportResult that = (GetFipsReportResult) o;

        return 
            Arrays.equals(nodes, that.nodes) && 
            Arrays.equals(errorNodes, that.errorNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])nodes,(Object[])errorNodes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodes", nodes);
        map.put("errorNodes", errorNodes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" nodes : ").append(gson.toJson(Arrays.toString(nodes))).append(",");
        sb.append(" errorNodes : ").append(gson.toJson(Arrays.toString(errorNodes))).append(",");
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
        private FipsNodeReportType[] nodes;
        private FipsErrorNodeReportType[] errorNodes;

        private Builder() { }

        public GetFipsReportResult build() {
            return new GetFipsReportResult (
                         this.nodes,
                         this.errorNodes);
        }

        private GetFipsReportResult.Builder buildFrom(final GetFipsReportResult req) {
            this.nodes = req.nodes;
            this.errorNodes = req.errorNodes;

            return this;
        }

        public GetFipsReportResult.Builder nodes(final FipsNodeReportType[] nodes) {
            this.nodes = nodes;
            return this;
        }

        public GetFipsReportResult.Builder errorNodes(final FipsErrorNodeReportType[] errorNodes) {
            this.errorNodes = errorNodes;
            return this;
        }

    }
}
