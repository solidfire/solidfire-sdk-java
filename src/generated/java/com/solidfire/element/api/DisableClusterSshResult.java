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
 * DisableClusterSshResult  
 **/

public class DisableClusterSshResult implements Serializable {

    public static final long serialVersionUID = 3412369733502823896L;
    @SerializedName("enabled") private Boolean enabled;
    @SerializedName("timeRemaining") private String timeRemaining;
    @SerializedName("nodes") private NodeSshInfo[] nodes;

    
    // parameterized constructor
    @Since("7.0")
    public DisableClusterSshResult(
    )
    {
    }
    // parameterized constructor
    @Since("11.0")
    public DisableClusterSshResult(
        Boolean enabled,
        String timeRemaining,
        NodeSshInfo[] nodes
    )
    {
        this.enabled = enabled;
        this.timeRemaining = timeRemaining;
        this.nodes = nodes;
    }

    /** 
     * Status of SSH on the cluster.
     **/
    public Boolean getEnabled() { return this.enabled; }
   
    public void setEnabled(Boolean enabled) { 
        this.enabled = enabled;
    }
    /** 
     * Time remaining until SSH is disable on the cluster.
     **/
    public String getTimeRemaining() { return this.timeRemaining; }
   
    public void setTimeRemaining(String timeRemaining) { 
        this.timeRemaining = timeRemaining;
    }
    /** 
     * Time remaining until SSH is disable on the cluster.
     **/
    public NodeSshInfo[] getNodes() { return this.nodes; }
   
    public void setNodes(NodeSshInfo[] nodes) { 
        this.nodes = nodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DisableClusterSshResult that = (DisableClusterSshResult) o;

        return 
            Objects.equals(enabled, that.enabled) && 
            Objects.equals(timeRemaining, that.timeRemaining) && 
            Arrays.equals(nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( enabled,timeRemaining,(Object[])nodes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("enabled", enabled);
        map.put("timeRemaining", timeRemaining);
        map.put("nodes", nodes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" enabled : ").append(gson.toJson(enabled)).append(",");
        sb.append(" timeRemaining : ").append(gson.toJson(timeRemaining)).append(",");
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
        private Boolean enabled;
        private String timeRemaining;
        private NodeSshInfo[] nodes;

        private Builder() { }

        public DisableClusterSshResult build() {
            return new DisableClusterSshResult (
                         this.enabled,
                         this.timeRemaining,
                         this.nodes);
        }

        private DisableClusterSshResult.Builder buildFrom(final DisableClusterSshResult req) {
            this.enabled = req.enabled;
            this.timeRemaining = req.timeRemaining;
            this.nodes = req.nodes;

            return this;
        }

        public DisableClusterSshResult.Builder enabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public DisableClusterSshResult.Builder timeRemaining(final String timeRemaining) {
            this.timeRemaining = timeRemaining;
            return this;
        }

        public DisableClusterSshResult.Builder nodes(final NodeSshInfo[] nodes) {
            this.nodes = nodes;
            return this;
        }

    }
}
