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
 * ListPendingActiveNodesResult  
 **/

public class ListPendingActiveNodesResult implements Serializable {

    public static final long serialVersionUID = -3822382945601077541L;
    @SerializedName("pendingActiveNodes") private PendingActiveNode[] pendingActiveNodes;
    // empty constructor
    @Since("7.0")
    public ListPendingActiveNodesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListPendingActiveNodesResult(
        PendingActiveNode[] pendingActiveNodes
    )
    {
        this.pendingActiveNodes = pendingActiveNodes;
    }

    /** 
     * List of objects detailing information about all PendingActive nodes in the system.
     **/
    public PendingActiveNode[] getPendingActiveNodes() { return this.pendingActiveNodes; }
   
    public void setPendingActiveNodes(PendingActiveNode[] pendingActiveNodes) { 
        this.pendingActiveNodes = pendingActiveNodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListPendingActiveNodesResult that = (ListPendingActiveNodesResult) o;

        return 
            Arrays.equals(pendingActiveNodes, that.pendingActiveNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])pendingActiveNodes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("pendingActiveNodes", pendingActiveNodes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" pendingActiveNodes : ").append(gson.toJson(Arrays.toString(pendingActiveNodes))).append(",");
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
        private PendingActiveNode[] pendingActiveNodes;

        private Builder() { }

        public ListPendingActiveNodesResult build() {
            return new ListPendingActiveNodesResult (
                         this.pendingActiveNodes);
        }

        private ListPendingActiveNodesResult.Builder buildFrom(final ListPendingActiveNodesResult req) {
            this.pendingActiveNodes = req.pendingActiveNodes;

            return this;
        }

        public ListPendingActiveNodesResult.Builder pendingActiveNodes(final PendingActiveNode[] pendingActiveNodes) {
            this.pendingActiveNodes = pendingActiveNodes;
            return this;
        }

    }
}
