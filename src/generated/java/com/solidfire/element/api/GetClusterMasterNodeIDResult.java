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
 * GetClusterMasterNodeIDResult  
 **/

public class GetClusterMasterNodeIDResult implements Serializable {

    public static final long serialVersionUID = 63756434284906386L;
    @SerializedName("nodeID") private Long nodeID;
    // empty constructor
    @Since("7.0")
    public GetClusterMasterNodeIDResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetClusterMasterNodeIDResult(
        Long nodeID
    )
    {
        this.nodeID = nodeID;
    }

    /** 
     * ID of the master node.
     **/
    public Long getNodeID() { return this.nodeID; }
   
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClusterMasterNodeIDResult that = (GetClusterMasterNodeIDResult) o;

        return 
            Objects.equals(nodeID, that.nodeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodeID", nodeID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" nodeID : ").append(gson.toJson(nodeID)).append(",");
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

        private Builder() { }

        public GetClusterMasterNodeIDResult build() {
            return new GetClusterMasterNodeIDResult (
                         this.nodeID);
        }

        private GetClusterMasterNodeIDResult.Builder buildFrom(final GetClusterMasterNodeIDResult req) {
            this.nodeID = req.nodeID;

            return this;
        }

        public GetClusterMasterNodeIDResult.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

    }
}
