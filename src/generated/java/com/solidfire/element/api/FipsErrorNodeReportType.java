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
 * FipsErrorNodeReportType  
 * Error description about why a node failed to gather FIPS information.
 **/

public class FipsErrorNodeReportType implements Serializable {

    public static final long serialVersionUID = 3983471716039582705L;
    @SerializedName("error") private FipsErrorNodeReportErrorType error;
    @SerializedName("nodeID") private Long nodeID;
    // empty constructor
    @Since("7.0")
    public FipsErrorNodeReportType() {}

    
    // parameterized constructor
    @Since("7.0")
    public FipsErrorNodeReportType(
        FipsErrorNodeReportErrorType error,
        Long nodeID
    )
    {
        this.error = error;
        this.nodeID = nodeID;
    }

    /** 
     * Error description
     **/
    public FipsErrorNodeReportErrorType getError() { return this.error; }
   
    public void setError(FipsErrorNodeReportErrorType error) { 
        this.error = error;
    }
    /** 
     * Node ID
     **/
    public Long getNodeID() { return this.nodeID; }
   
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FipsErrorNodeReportType that = (FipsErrorNodeReportType) o;

        return 
            Objects.equals(error, that.error) && 
            Objects.equals(nodeID, that.nodeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( error,nodeID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("error", error);
        map.put("nodeID", nodeID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" error : ").append(gson.toJson(error)).append(",");
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
        private FipsErrorNodeReportErrorType error;
        private Long nodeID;

        private Builder() { }

        public FipsErrorNodeReportType build() {
            return new FipsErrorNodeReportType (
                         this.error,
                         this.nodeID);
        }

        private FipsErrorNodeReportType.Builder buildFrom(final FipsErrorNodeReportType req) {
            this.error = req.error;
            this.nodeID = req.nodeID;

            return this;
        }

        public FipsErrorNodeReportType.Builder error(final FipsErrorNodeReportErrorType error) {
            this.error = error;
            return this;
        }

        public FipsErrorNodeReportType.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

    }
}
