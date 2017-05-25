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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetNodeStatsResult  
 **/

public class GetNodeStatsResult implements Serializable {

    public static final long serialVersionUID = -8908209611544465892L;
    @SerializedName("nodeStats") private NodeStatsInfo nodeStats;
    // empty constructor
    @Since("7.0")
    public GetNodeStatsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetNodeStatsResult(
        NodeStatsInfo nodeStats
    )
    {
        this.nodeStats = nodeStats;
    }

    /** 
     * Node activity information.
     **/
    public NodeStatsInfo getNodeStats() { return this.nodeStats; }
    public void setNodeStats(NodeStatsInfo nodeStats) { 
        this.nodeStats = nodeStats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetNodeStatsResult that = (GetNodeStatsResult) o;

        return 
            Objects.equals(nodeStats, that.nodeStats);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeStats );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodeStats", nodeStats);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodeStats : ").append(nodeStats).append(",");
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
        private NodeStatsInfo nodeStats;

        private Builder() { }

        public GetNodeStatsResult build() {
            return new GetNodeStatsResult (
                         this.nodeStats);
        }

        private GetNodeStatsResult.Builder buildFrom(final GetNodeStatsResult req) {
            this.nodeStats = req.nodeStats;

            return this;
        }

        public GetNodeStatsResult.Builder nodeStats(final NodeStatsInfo nodeStats) {
            this.nodeStats = nodeStats;
            return this;
        }

    }
}
