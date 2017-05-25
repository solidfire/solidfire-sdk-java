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
 * SetClusterConfigRequest  
 * The SetClusterConfig API method enables you to set the configuration this node uses to communicate with the cluster it is associated with. To see the states in which these objects can be modified, see Cluster Object Attributes. To display the current cluster
 * interface settings for a node, run the GetClusterConfig API method.
 * Note: This method is available only through the per-node API endpoint 5.0 or later.
 **/

public class SetClusterConfigRequest implements Serializable {

    public static final long serialVersionUID = -2841138981963500104L;
    @SerializedName("cluster") private ClusterConfig cluster;
    // empty constructor
    @Since("7.0")
    public SetClusterConfigRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetClusterConfigRequest(
        ClusterConfig cluster
    )
    {
        this.cluster = cluster;
    }

    /** 
     * Objects that are changed for the cluster interface settings.
     **/
    public ClusterConfig getCluster() { return this.cluster; }
    public void setCluster(ClusterConfig cluster) { 
        this.cluster = cluster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetClusterConfigRequest that = (SetClusterConfigRequest) o;

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
        sb.append( "{ " );

        sb.append(" cluster : ").append(cluster).append(",");
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

        public SetClusterConfigRequest build() {
            return new SetClusterConfigRequest (
                         this.cluster);
        }

        private SetClusterConfigRequest.Builder buildFrom(final SetClusterConfigRequest req) {
            this.cluster = req.cluster;

            return this;
        }

        public SetClusterConfigRequest.Builder cluster(final ClusterConfig cluster) {
            this.cluster = cluster;
            return this;
        }

    }
}
