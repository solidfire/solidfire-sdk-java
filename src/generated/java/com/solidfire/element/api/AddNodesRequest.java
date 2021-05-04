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
 * AddNodesRequest  
 * AddNodes enables you to add one or more new nodes to a cluster. When a node that is not configured starts up for the first time, you are prompted to configure the node. After you configure the node, it is registered as a "pending node" with the cluster. 
 * Note: It might take several seconds after adding a new node for it to start up and register its drives as available.
 **/

public class AddNodesRequest implements Serializable {

    public static final long serialVersionUID = -9040072560420795429L;
    @SerializedName("pendingNodes") private Long[] pendingNodes;
    @SerializedName("autoInstall") private Optional<Boolean> autoInstall = Optional.of(true);
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
     *  List of pending NodeIDs for the nodes to be added. You can  obtain the list of pending nodes using the ListPendingNodes method.
     **/
    public Long[] getPendingNodes() { return this.pendingNodes; }
   
    public void setPendingNodes(Long[] pendingNodes) { 
        this.pendingNodes = pendingNodes;
    }
    /** 
     * If true, RTFI will be performed on the nodes.  The default behavior is to perform RTFI.
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
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" pendingNodes : ").append(gson.toJson(Arrays.toString(pendingNodes))).append(",");
        if(null != autoInstall && autoInstall.isPresent()){
            sb.append(" autoInstall : ").append(gson.toJson(autoInstall)).append(",");
        }
        else{
            sb.append(" autoInstall : ").append("null").append(",");
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

        public AddNodesRequest.Builder optionalAutoInstall(final Boolean autoInstall) {
            this.autoInstall = (autoInstall == null) ? Optional.<Boolean>empty() : Optional.of(autoInstall);
            return this;
        }

    }
}
