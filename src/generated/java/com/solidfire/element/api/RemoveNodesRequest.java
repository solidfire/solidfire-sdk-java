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
 * RemoveNodesRequest  
 * RemoveNodes can be used to remove one or more nodes from the cluster. Before removing a node, you must remove all drives from the node using the RemoveDrives method. You cannot remove a node until the RemoveDrives process has completed and all data has been migrated off of the node's drives.
 * After removing a node, the removed node registers itself as a pending node. You can add the pending node again or shut it down (shutting the node down removes it from the Pending Node list).
 * 
 * RemoveNodes can fail with xEnsembleInvalidSize if removing the nodes would violate ensemble size restrictions.
 * RemoveNodes can fail with xEnsembleQuorumLoss if removing the nodes would cause a loss of quorum.
 * RemoveNodes can fail with xEnsembleToleranceChange if there are enabled data protection schemes that can tolerate multiple node failures and removing the nodes would decrease the ensemble's node failure tolerance. The optional ignoreEnsembleToleranceChange parameter can be set true to disable the ensemble tolerance check.
 **/

public class RemoveNodesRequest implements Serializable {

    public static final long serialVersionUID = 8871715698611659872L;
    @SerializedName("nodes") private Long[] nodes;
    @SerializedName("ignoreEnsembleToleranceChange") private Optional<Boolean> ignoreEnsembleToleranceChange = Optional.of(false);
    // empty constructor
    @Since("7.0")
    public RemoveNodesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RemoveNodesRequest(
        Long[] nodes,
        Optional<Boolean> ignoreEnsembleToleranceChange
    )
    {
        this.nodes = nodes;
        this.ignoreEnsembleToleranceChange = (ignoreEnsembleToleranceChange == null) ? Optional.<Boolean>empty() : ignoreEnsembleToleranceChange;
    }

    /** 
     * List of NodeIDs for the nodes to be removed.
     **/
    public Long[] getNodes() { return this.nodes; }
   
    public void setNodes(Long[] nodes) { 
        this.nodes = nodes;
    }
    /** 
     * Ignore changes to the ensemble's node failure tolerance when removing nodes.
     **/
    public Optional<Boolean> getIgnoreEnsembleToleranceChange() { return this.ignoreEnsembleToleranceChange; }
   
    public void setIgnoreEnsembleToleranceChange(Optional<Boolean> ignoreEnsembleToleranceChange) { 
        this.ignoreEnsembleToleranceChange = (ignoreEnsembleToleranceChange == null) ? Optional.<Boolean>empty() : ignoreEnsembleToleranceChange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveNodesRequest that = (RemoveNodesRequest) o;

        return 
            Arrays.equals(nodes, that.nodes) && 
            Objects.equals(ignoreEnsembleToleranceChange, that.ignoreEnsembleToleranceChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])nodes,ignoreEnsembleToleranceChange );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodes", nodes);
        map.put("ignoreEnsembleToleranceChange", ignoreEnsembleToleranceChange);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" nodes : ").append(gson.toJson(Arrays.toString(nodes))).append(",");
        if(null != ignoreEnsembleToleranceChange && ignoreEnsembleToleranceChange.isPresent()){
            sb.append(" ignoreEnsembleToleranceChange : ").append(gson.toJson(ignoreEnsembleToleranceChange)).append(",");
        }
        else{
            sb.append(" ignoreEnsembleToleranceChange : ").append("null").append(",");
        }
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
        private Long[] nodes;
        private Optional<Boolean> ignoreEnsembleToleranceChange;

        private Builder() { }

        public RemoveNodesRequest build() {
            return new RemoveNodesRequest (
                         this.nodes,
                         this.ignoreEnsembleToleranceChange);
        }

        private RemoveNodesRequest.Builder buildFrom(final RemoveNodesRequest req) {
            this.nodes = req.nodes;
            this.ignoreEnsembleToleranceChange = req.ignoreEnsembleToleranceChange;

            return this;
        }

        public RemoveNodesRequest.Builder nodes(final Long[] nodes) {
            this.nodes = nodes;
            return this;
        }

        public RemoveNodesRequest.Builder optionalIgnoreEnsembleToleranceChange(final Boolean ignoreEnsembleToleranceChange) {
            this.ignoreEnsembleToleranceChange = (ignoreEnsembleToleranceChange == null) ? Optional.<Boolean>empty() : Optional.of(ignoreEnsembleToleranceChange);
            return this;
        }

    }
}
