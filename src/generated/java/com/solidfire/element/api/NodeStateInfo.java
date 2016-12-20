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
 **/

public class NodeStateInfo implements Serializable {

    public static final long serialVersionUID = -4911274814703519058L;
    @SerializedName("cluster") private String cluster;
    @SerializedName("state") private String state;

    // empty constructor
    @Since("7.0")
    public NodeStateInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public NodeStateInfo(
        String cluster,
        String state
    )
    {
        this.cluster = cluster;
        this.state = state;
    }

    /** 
     * Name of the cluster.
     **/
    public String getCluster() { return this.cluster; }
    public void setCluster(String cluster) { 
        this.cluster = cluster;
    }
    /** 
     * <strong>Available:</strong> Node has not been configured with a cluster name.<br><strong>Pending:</strong> Node is pending for a specific named cluster and can be added.<br><strong>Active:</strong> Node is active and a member of a cluster and may not be added to another cluster.
     **/
    public String getState() { return this.state; }
    public void setState(String state) { 
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeStateInfo that = (NodeStateInfo) o;

        return 
            Objects.equals(cluster, that.cluster) && 
            Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash( cluster,state );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("cluster", cluster);
        map.put("state", state);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" cluster : ").append(cluster).append(",");
        sb.append(" state : ").append(state).append(",");
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
        private String cluster;
        private String state;

        private Builder() { }

        public NodeStateInfo build() {
            return new NodeStateInfo (
                         this.cluster,
                         this.state);
        }

        private NodeStateInfo.Builder buildFrom(final NodeStateInfo req) {
            this.cluster = req.cluster;
            this.state = req.state;

            return this;
        }

        public NodeStateInfo.Builder cluster(final String cluster) {
            this.cluster = cluster;
            return this;
        }

        public NodeStateInfo.Builder state(final String state) {
            this.state = state;
            return this;
        }

    }
}
