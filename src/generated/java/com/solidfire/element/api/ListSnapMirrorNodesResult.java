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
 * ListSnapMirrorNodesResult  
 **/

public class ListSnapMirrorNodesResult implements Serializable {

    public static final long serialVersionUID = 736947697186902177L;
    @SerializedName("snapMirrorNodes") private SnapMirrorNode[] snapMirrorNodes;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorNodesResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorNodesResult(
        SnapMirrorNode[] snapMirrorNodes
    )
    {
        this.snapMirrorNodes = snapMirrorNodes;
    }

    /** 
     * A list of the nodes on the ONTAP cluster.
     **/
    public SnapMirrorNode[] getSnapMirrorNodes() { return this.snapMirrorNodes; }
   
    public void setSnapMirrorNodes(SnapMirrorNode[] snapMirrorNodes) { 
        this.snapMirrorNodes = snapMirrorNodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorNodesResult that = (ListSnapMirrorNodesResult) o;

        return 
            Arrays.equals(snapMirrorNodes, that.snapMirrorNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])snapMirrorNodes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorNodes", snapMirrorNodes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorNodes : ").append(gson.toJson(Arrays.toString(snapMirrorNodes))).append(",");
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
        private SnapMirrorNode[] snapMirrorNodes;

        private Builder() { }

        public ListSnapMirrorNodesResult build() {
            return new ListSnapMirrorNodesResult (
                         this.snapMirrorNodes);
        }

        private ListSnapMirrorNodesResult.Builder buildFrom(final ListSnapMirrorNodesResult req) {
            this.snapMirrorNodes = req.snapMirrorNodes;

            return this;
        }

        public ListSnapMirrorNodesResult.Builder snapMirrorNodes(final SnapMirrorNode[] snapMirrorNodes) {
            this.snapMirrorNodes = snapMirrorNodes;
            return this;
        }

    }
}
