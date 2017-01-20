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
 * RemoveNodesRequest  
 **/

public class RemoveNodesRequest implements Serializable {

    public static final long serialVersionUID = 7755077794445510386L;
    @SerializedName("nodes") private Long[] nodes;

    // empty constructor
    @Since("7.0")
    public RemoveNodesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RemoveNodesRequest(
        Long[] nodes
    )
    {
        this.nodes = nodes;
    }

    /** 
     * List of NodeIDs for the nodes to be removed.
     **/
    public Long[] getNodes() { return this.nodes; }
    public void setNodes(Long[] nodes) { 
        this.nodes = nodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveNodesRequest that = (RemoveNodesRequest) o;

        return 
            Arrays.equals(nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])nodes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodes", nodes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

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
        private Long[] nodes;

        private Builder() { }

        public RemoveNodesRequest build() {
            return new RemoveNodesRequest (
                         this.nodes);
        }

        private RemoveNodesRequest.Builder buildFrom(final RemoveNodesRequest req) {
            this.nodes = req.nodes;

            return this;
        }

        public RemoveNodesRequest.Builder nodes(final Long[] nodes) {
            this.nodes = nodes;
            return this;
        }

    }
}
