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
 * GetOriginNode  
 **/

public class GetOriginNode implements Serializable {

    public static final long serialVersionUID = -1532831057366120053L;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("result") private GetOriginNodeResult result;

    // empty constructor
    @Since("7.0")
    public GetOriginNode() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetOriginNode(
        Long nodeID,
        GetOriginNodeResult result
    )
    {
        this.nodeID = nodeID;
        this.result = result;
    }

    /** 
     * 
     **/
    public Long getNodeID() { return this.nodeID; }
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     * 
     **/
    public GetOriginNodeResult getResult() { return this.result; }
    public void setResult(GetOriginNodeResult result) { 
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetOriginNode that = (GetOriginNode) o;

        return 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeID,result );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodeID", nodeID);
        map.put("result", result);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" result : ").append(result).append(",");
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
        private Long nodeID;
        private GetOriginNodeResult result;

        private Builder() { }

        public GetOriginNode build() {
            return new GetOriginNode (
                         this.nodeID,
                         this.result);
        }

        private GetOriginNode.Builder buildFrom(final GetOriginNode req) {
            this.nodeID = req.nodeID;
            this.result = req.result;

            return this;
        }

        public GetOriginNode.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public GetOriginNode.Builder result(final GetOriginNodeResult result) {
            this.result = result;
            return this;
        }

    }
}
