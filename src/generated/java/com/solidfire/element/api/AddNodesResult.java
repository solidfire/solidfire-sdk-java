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
 * AddNodesResult  
 **/

public class AddNodesResult implements Serializable {

    public static final long serialVersionUID = 2922145517052875853L;
    @SerializedName("autoInstall") private Optional<Boolean> autoInstall;
    @SerializedName("nodes") private AddedNode[] nodes;

    // empty constructor
    @Since("7.0")
    public AddNodesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddNodesResult(
        Optional<Boolean> autoInstall,
        AddedNode[] nodes
    )
    {
        this.autoInstall = (autoInstall == null) ? Optional.<Boolean>empty() : autoInstall;
        this.nodes = nodes;
    }

    /** 
     * 
     **/
    public Optional<Boolean> getAutoInstall() { return this.autoInstall; }
    public void setAutoInstall(Optional<Boolean> autoInstall) { 
        this.autoInstall = (autoInstall == null) ? Optional.<Boolean>empty() : autoInstall;
    }
    /** 
     * An array of objects mapping the previous "pendingNodeID" to the "nodeID".
     **/
    public AddedNode[] getNodes() { return this.nodes; }
    public void setNodes(AddedNode[] nodes) { 
        this.nodes = nodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddNodesResult that = (AddNodesResult) o;

        return 
            Objects.equals(autoInstall, that.autoInstall) && 
            Arrays.equals(nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( autoInstall,(Object[])nodes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("autoInstall", autoInstall);
        map.put("nodes", nodes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != autoInstall && autoInstall.isPresent()){
            sb.append(" autoInstall : ").append(autoInstall).append(",");
        }
        sb.append(" nodes : ").append(Arrays.toString(nodes)).append(",");
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
        private Optional<Boolean> autoInstall;
        private AddedNode[] nodes;

        private Builder() { }

        public AddNodesResult build() {
            return new AddNodesResult (
                         this.autoInstall,
                         this.nodes);
        }

        private AddNodesResult.Builder buildFrom(final AddNodesResult req) {
            this.autoInstall = req.autoInstall;
            this.nodes = req.nodes;

            return this;
        }

        public AddNodesResult.Builder optional(final Boolean autoInstall) {
            this.autoInstall = (autoInstall == null) ? Optional.<Boolean>empty() : Optional.of(autoInstall);
            return this;
        }

        public AddNodesResult.Builder nodes(final AddedNode[] nodes) {
            this.nodes = nodes;
            return this;
        }

    }
}
