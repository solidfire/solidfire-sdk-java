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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetIpmiConfigNodesResult  
 **/

public class GetIpmiConfigNodesResult implements Serializable {

    public static final long serialVersionUID = 3732713589844209397L;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("result") private Attributes result;
    // empty constructor
    @Since("7.0")
    public GetIpmiConfigNodesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetIpmiConfigNodesResult(
        Long nodeID,
        Attributes result
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
    public Attributes getResult() { return this.result; }
    public void setResult(Attributes result) { 
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetIpmiConfigNodesResult that = (GetIpmiConfigNodesResult) o;

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
        private Attributes result;

        private Builder() { }

        public GetIpmiConfigNodesResult build() {
            return new GetIpmiConfigNodesResult (
                         this.nodeID,
                         this.result);
        }

        private GetIpmiConfigNodesResult.Builder buildFrom(final GetIpmiConfigNodesResult req) {
            this.nodeID = req.nodeID;
            this.result = req.result;

            return this;
        }

        public GetIpmiConfigNodesResult.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public GetIpmiConfigNodesResult.Builder result(final Attributes result) {
            this.result = result;
            return this;
        }

    }
}
