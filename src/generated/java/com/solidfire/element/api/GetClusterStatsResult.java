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
 * GetClusterStatsResult  
 **/

public class GetClusterStatsResult implements Serializable {

    public static final long serialVersionUID = -1285274398708868528L;
    @SerializedName("clusterStats") private ClusterStats clusterStats;

    // empty constructor
    @Since("7.0")
    public GetClusterStatsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetClusterStatsResult(
        ClusterStats clusterStats
    )
    {
        this.clusterStats = clusterStats;
    }

    /** 
     **/
    public ClusterStats getClusterStats() { return this.clusterStats; }
    public void setClusterStats(ClusterStats clusterStats) { 
        this.clusterStats = clusterStats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClusterStatsResult that = (GetClusterStatsResult) o;

        return 
            Objects.equals(clusterStats, that.clusterStats);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterStats );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterStats", clusterStats);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterStats : ").append(clusterStats).append(",");
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
        private ClusterStats clusterStats;

        private Builder() { }

        public GetClusterStatsResult build() {
            return new GetClusterStatsResult (
                         this.clusterStats);
        }

        private GetClusterStatsResult.Builder buildFrom(final GetClusterStatsResult req) {
            this.clusterStats = req.clusterStats;

            return this;
        }

        public GetClusterStatsResult.Builder clusterStats(final ClusterStats clusterStats) {
            this.clusterStats = clusterStats;
            return this;
        }

    }
}
