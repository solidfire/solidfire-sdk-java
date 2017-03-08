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
 * AddNodesRequest  
 * AddNodes is used to add one or more new nodes to the cluster. When a node is not configured and starts up for the first time you are prompted to configure the node. Once a node is configured it is registered as a "pending node" with the cluster.
 * 
 * Adding a node to a cluster that has been set up for virtual networking will require a sufficient number of virtual storage IP addresses to allocate a virtual IP to the new node. If there are no virtual IP addresses available for the new node, the AddNode operation will not complete successfully. Use the "ModifyVirtualNetwork" method to add more storage IP addresses to your virtual network.
 * 
 * The software version on each node in a cluster must be compatible. Run the "ListAllNodes" API to see what versions of software are currently running on the cluster nodes. For an explanation of software version compatibility, see "Node Versioning and Compatibility" in the Element API guide.
 * 
 * Once a node has been added, the drives on the node are made available and can then be added via the "AddDrives" method to increase the storage capacity of the cluster.
 * 
 * Note: It may take several seconds after adding a new Node for it to start up and register the drives as being available.
 **/

public class AddNodesRequest implements Serializable {

    public static final long serialVersionUID = -3701373756118626536L;
    @SerializedName("pendingNodes") private Long[] pendingNodes;
    @SerializedName("autoInstall") private Optional<Boolean> autoInstall;

    // empty constructor
    @Since("7.0")
    public AddNodesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddNodesRequest(
        Long[] pendingNodes,
        Optional<Boolean> autoInstall
    )
    {
        this.pendingNodes = pendingNodes;
        this.autoInstall = (autoInstall == null) ? Optional.<Boolean>empty() : autoInstall;
    }

    /** 
     * List of PendingNodeIDs for the Nodes to be added. You can obtain the list of Pending Nodes via the ListPendingNodes method.
     **/
    public Long[] getPendingNodes() { return this.pendingNodes; }
    public void setPendingNodes(Long[] pendingNodes) { 
        this.pendingNodes = pendingNodes;
    }
    /** 
     * Whether these nodes should be autoinstalled
     **/
    public Optional<Boolean> getAutoInstall() { return this.autoInstall; }
    public void setAutoInstall(Optional<Boolean> autoInstall) { 
        this.autoInstall = (autoInstall == null) ? Optional.<Boolean>empty() : autoInstall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddNodesRequest that = (AddNodesRequest) o;

        return 
            Arrays.equals(pendingNodes, that.pendingNodes) && 
            Objects.equals(autoInstall, that.autoInstall);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])pendingNodes,autoInstall );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("pendingNodes", pendingNodes);
        map.put("autoInstall", autoInstall);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" pendingNodes : ").append(Arrays.toString(pendingNodes)).append(",");
        if(null != autoInstall && autoInstall.isPresent()){
            sb.append(" autoInstall : ").append(autoInstall).append(",");
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
        private Long[] pendingNodes;
        private Optional<Boolean> autoInstall;

        private Builder() { }

        public AddNodesRequest build() {
            return new AddNodesRequest (
                         this.pendingNodes,
                         this.autoInstall);
        }

        private AddNodesRequest.Builder buildFrom(final AddNodesRequest req) {
            this.pendingNodes = req.pendingNodes;
            this.autoInstall = req.autoInstall;

            return this;
        }

        public AddNodesRequest.Builder pendingNodes(final Long[] pendingNodes) {
            this.pendingNodes = pendingNodes;
            return this;
        }

        public AddNodesRequest.Builder optional(final Boolean autoInstall) {
            this.autoInstall = (autoInstall == null) ? Optional.<Boolean>empty() : Optional.of(autoInstall);
            return this;
        }

    }
}
