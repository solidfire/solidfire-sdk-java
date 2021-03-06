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
 * SetClusterConfigResult  
 **/

public class SetClusterConfigResult implements Serializable {

    public static final long serialVersionUID = 4850375475889192724L;
    @SerializedName("cluster") private ClusterConfig cluster;
    // empty constructor
    @Since("7.0")
    public SetClusterConfigResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetClusterConfigResult(
        ClusterConfig cluster
    )
    {
        this.cluster = cluster;
    }

    /** 
     * Settings for the cluster. All new and current settings are returned.
     **/
    public ClusterConfig getCluster() { return this.cluster; }
   
    public void setCluster(ClusterConfig cluster) { 
        this.cluster = cluster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetClusterConfigResult that = (SetClusterConfigResult) o;

        return 
            Objects.equals(cluster, that.cluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash( cluster );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("cluster", cluster);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" cluster : ").append(gson.toJson(cluster)).append(",");
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
        private ClusterConfig cluster;

        private Builder() { }

        public SetClusterConfigResult build() {
            return new SetClusterConfigResult (
                         this.cluster);
        }

        private SetClusterConfigResult.Builder buildFrom(final SetClusterConfigResult req) {
            this.cluster = req.cluster;

            return this;
        }

        public SetClusterConfigResult.Builder cluster(final ClusterConfig cluster) {
            this.cluster = cluster;
            return this;
        }

    }
}
