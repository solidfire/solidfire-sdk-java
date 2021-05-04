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
 * GetNodeHardwareInfoRequest  
 * GetNodeHardwareInfo enables you to return all the hardware information and status for the node specified. This generally includes details about
 * manufacturers, vendors, versions, and other associated hardware identification information.
 **/

public class GetNodeHardwareInfoRequest implements Serializable {

    public static final long serialVersionUID = 4032929607006860812L;
    @SerializedName("nodeID") private Long nodeID;
    // empty constructor
    @Since("7.0")
    public GetNodeHardwareInfoRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetNodeHardwareInfoRequest(
        Long nodeID
    )
    {
        this.nodeID = nodeID;
    }

    /** 
     * The ID of the node for which hardware information is being requested. Information
     * about a Fibre Channel node is returned if a Fibre Channel node is specified.
     **/
    public Long getNodeID() { return this.nodeID; }
   
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetNodeHardwareInfoRequest that = (GetNodeHardwareInfoRequest) o;

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

        public GetNodeHardwareInfoRequest build() {
            return new GetNodeHardwareInfoRequest (
                         this.nodeID);
        }

        private GetNodeHardwareInfoRequest.Builder buildFrom(final GetNodeHardwareInfoRequest req) {
            this.nodeID = req.nodeID;

            return this;
        }

        public GetNodeHardwareInfoRequest.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

    }
}
