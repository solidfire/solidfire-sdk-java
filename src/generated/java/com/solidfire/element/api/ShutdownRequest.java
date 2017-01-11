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
 * ShutdownRequest  
 **/

public class ShutdownRequest implements Serializable {

    public static final long serialVersionUID = -9028774115799936174L;
    @SerializedName("nodes") private Optional<Long[]> nodes;
    @SerializedName("option") private String option;

    // empty constructor
    @Since("7.0")
    public ShutdownRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ShutdownRequest(
        Optional<Long[]> nodes,
        String option
    )
    {
        this.nodes = (nodes == null) ? Optional.<Long[]>empty() : nodes;
        this.option = option;
    }

    /** 
     * List of NodeIDs for the nodes to be shutdown.
     **/
    public Optional<Long[]> getNodes() { return this.nodes; }
    public void setNodes(Optional<Long[]> nodes) { 
        this.nodes = (nodes == null) ? Optional.<Long[]>empty() : nodes;
    }
    /** 
     * Action to take for the node shutdown:restart: Restarts the node.halt: Performs full power-off of the node.
     **/
    public String getOption() { return this.option; }
    public void setOption(String option) { 
        this.option = option;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShutdownRequest that = (ShutdownRequest) o;

        return 
            Objects.equals(nodes, that.nodes) && 
            Objects.equals(option, that.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodes,option );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodes", nodes);
        map.put("option", option);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != nodes && nodes.isPresent()){
            sb.append(" nodes : ").append(nodes).append(",");
        }
        sb.append(" option : ").append(option).append(",");
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
        private Optional<Long[]> nodes;
        private String option;

        private Builder() { }

        public ShutdownRequest build() {
            return new ShutdownRequest (
                         this.nodes,
                         this.option);
        }

        private ShutdownRequest.Builder buildFrom(final ShutdownRequest req) {
            this.nodes = req.nodes;
            this.option = req.option;

            return this;
        }

        public ShutdownRequest.Builder optionalNodes(final Long[] nodes) {
            this.nodes = (nodes == null) ? Optional.<Long[]>empty() : Optional.of(nodes);
            return this;
        }

        public ShutdownRequest.Builder option(final String option) {
            this.option = option;
            return this;
        }

    }
}
