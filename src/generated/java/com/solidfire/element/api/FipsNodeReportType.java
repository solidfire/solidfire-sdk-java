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
 * FipsNodeReportType  
 * FIPS related information for a node.
 **/

public class FipsNodeReportType implements Serializable {

    public static final long serialVersionUID = 6528632256718158705L;
    @SerializedName("httpsEnabled") private Boolean httpsEnabled;
    @SerializedName("fipsDrives") private String fipsDrives;
    @SerializedName("nodeID") private Long nodeID;
    // empty constructor
    @Since("7.0")
    public FipsNodeReportType() {}

    
    // parameterized constructor
    @Since("7.0")
    public FipsNodeReportType(
        Boolean httpsEnabled,
        Long nodeID
    )
    {
        this.httpsEnabled = httpsEnabled;
        this.nodeID = nodeID;
    }
    // parameterized constructor
    @Since("11.0")
    public FipsNodeReportType(
        Boolean httpsEnabled,
        String fipsDrives,
        Long nodeID
    )
    {
        this.httpsEnabled = httpsEnabled;
        this.fipsDrives = fipsDrives;
        this.nodeID = nodeID;
    }

    /** 
     * FIPS https feature status.
     **/
    public Boolean getHttpsEnabled() { return this.httpsEnabled; }
   
    public void setHttpsEnabled(Boolean httpsEnabled) { 
        this.httpsEnabled = httpsEnabled;
    }
    /** 
     * Node's FipsDrives capability status.
     **/
    public String getFipsDrives() { return this.fipsDrives; }
   
    public void setFipsDrives(String fipsDrives) { 
        this.fipsDrives = fipsDrives;
    }
    /** 
     * Node ID.
     **/
    public Long getNodeID() { return this.nodeID; }
   
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FipsNodeReportType that = (FipsNodeReportType) o;

        return 
            Objects.equals(httpsEnabled, that.httpsEnabled) && 
            Objects.equals(fipsDrives, that.fipsDrives) && 
            Objects.equals(nodeID, that.nodeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( httpsEnabled,fipsDrives,nodeID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("httpsEnabled", httpsEnabled);
        map.put("fipsDrives", fipsDrives);
        map.put("nodeID", nodeID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" httpsEnabled : ").append(gson.toJson(httpsEnabled)).append(",");
        sb.append(" fipsDrives : ").append(gson.toJson(fipsDrives)).append(",");
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
        private Boolean httpsEnabled;
        private String fipsDrives;
        private Long nodeID;

        private Builder() { }

        public FipsNodeReportType build() {
            return new FipsNodeReportType (
                         this.httpsEnabled,
                         this.fipsDrives,
                         this.nodeID);
        }

        private FipsNodeReportType.Builder buildFrom(final FipsNodeReportType req) {
            this.httpsEnabled = req.httpsEnabled;
            this.fipsDrives = req.fipsDrives;
            this.nodeID = req.nodeID;

            return this;
        }

        public FipsNodeReportType.Builder httpsEnabled(final Boolean httpsEnabled) {
            this.httpsEnabled = httpsEnabled;
            return this;
        }

        public FipsNodeReportType.Builder fipsDrives(final String fipsDrives) {
            this.fipsDrives = fipsDrives;
            return this;
        }

        public FipsNodeReportType.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

    }
}
