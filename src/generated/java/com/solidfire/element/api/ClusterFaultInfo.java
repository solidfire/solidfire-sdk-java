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
 * ClusterFaultInfo  
 **/

public class ClusterFaultInfo implements Serializable {

    public static final long serialVersionUID = -5303506460547294310L;
    @SerializedName("severity") private String severity;
    @SerializedName("type") private String type;
    @SerializedName("code") private String code;
    @SerializedName("details") private String details;
    @SerializedName("nodeHardwareFaultID") private NodeHardwareFaultID nodeHardwareFaultID;
    @SerializedName("nodeID") private NodeID nodeID;
    @SerializedName("serviceID") private ServiceID serviceID;
    @SerializedName("driveID") private DriveID driveID;
    @SerializedName("resolved") private Boolean resolved;
    @SerializedName("clusterFaultID") private ClusterFaultID clusterFaultID;
    @SerializedName("date") private String date;
    @SerializedName("resolvedDate") private String resolvedDate;
    @SerializedName("data") private Object data;

    // empty constructor
    @Since("7.0")
    public ClusterFaultInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public ClusterFaultInfo(
        String severity,
        String type,
        String code,
        String details,
        NodeHardwareFaultID nodeHardwareFaultID,
        NodeID nodeID,
        ServiceID serviceID,
        DriveID driveID,
        Boolean resolved,
        ClusterFaultID clusterFaultID,
        String date,
        String resolvedDate,
        Object data
    )
    {
        this.severity = severity;
        this.type = type;
        this.code = code;
        this.details = details;
        this.nodeHardwareFaultID = nodeHardwareFaultID;
        this.nodeID = nodeID;
        this.serviceID = serviceID;
        this.driveID = driveID;
        this.resolved = resolved;
        this.clusterFaultID = clusterFaultID;
        this.date = date;
        this.resolvedDate = resolvedDate;
        this.data = data;
    }

    /** 
     **/
    public String getSeverity() { return this.severity; }
    public void setSeverity(String severity) { 
        this.severity = severity;
    }
    /** 
     **/
    public String getType() { return this.type; }
    public void setType(String type) { 
        this.type = type;
    }
    /** 
     **/
    public String getCode() { return this.code; }
    public void setCode(String code) { 
        this.code = code;
    }
    /** 
     **/
    public String getDetails() { return this.details; }
    public void setDetails(String details) { 
        this.details = details;
    }
    /** 
     **/
    public NodeHardwareFaultID getNodeHardwareFaultID() { return this.nodeHardwareFaultID; }
    public void setNodeHardwareFaultID(NodeHardwareFaultID nodeHardwareFaultID) { 
        this.nodeHardwareFaultID = nodeHardwareFaultID;
    }
    /** 
     **/
    public NodeID getNodeID() { return this.nodeID; }
    public void setNodeID(NodeID nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     **/
    public ServiceID getServiceID() { return this.serviceID; }
    public void setServiceID(ServiceID serviceID) { 
        this.serviceID = serviceID;
    }
    /** 
     **/
    public DriveID getDriveID() { return this.driveID; }
    public void setDriveID(DriveID driveID) { 
        this.driveID = driveID;
    }
    /** 
     **/
    public Boolean getResolved() { return this.resolved; }
    public void setResolved(Boolean resolved) { 
        this.resolved = resolved;
    }
    /** 
     **/
    public ClusterFaultID getClusterFaultID() { return this.clusterFaultID; }
    public void setClusterFaultID(ClusterFaultID clusterFaultID) { 
        this.clusterFaultID = clusterFaultID;
    }
    /** 
     **/
    public String getDate() { return this.date; }
    public void setDate(String date) { 
        this.date = date;
    }
    /** 
     **/
    public String getResolvedDate() { return this.resolvedDate; }
    public void setResolvedDate(String resolvedDate) { 
        this.resolvedDate = resolvedDate;
    }
    /** 
     **/
    public Object getData() { return this.data; }
    public void setData(Object data) { 
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterFaultInfo that = (ClusterFaultInfo) o;

        return 
            Objects.equals(severity, that.severity) && 
            Objects.equals(type, that.type) && 
            Objects.equals(code, that.code) && 
            Objects.equals(details, that.details) && 
            Objects.equals(nodeHardwareFaultID, that.nodeHardwareFaultID) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(serviceID, that.serviceID) && 
            Objects.equals(driveID, that.driveID) && 
            Objects.equals(resolved, that.resolved) && 
            Objects.equals(clusterFaultID, that.clusterFaultID) && 
            Objects.equals(date, that.date) && 
            Objects.equals(resolvedDate, that.resolvedDate) && 
            Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash( severity,type,code,details,nodeHardwareFaultID,nodeID,serviceID,driveID,resolved,clusterFaultID,date,resolvedDate,data );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("severity", severity);
        map.put("type", type);
        map.put("code", code);
        map.put("details", details);
        map.put("nodeHardwareFaultID", nodeHardwareFaultID);
        map.put("nodeID", nodeID);
        map.put("serviceID", serviceID);
        map.put("driveID", driveID);
        map.put("resolved", resolved);
        map.put("clusterFaultID", clusterFaultID);
        map.put("date", date);
        map.put("resolvedDate", resolvedDate);
        map.put("data", data);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" severity : ").append(severity).append(",");
        sb.append(" type : ").append(type).append(",");
        sb.append(" code : ").append(code).append(",");
        sb.append(" details : ").append(details).append(",");
        sb.append(" nodeHardwareFaultID : ").append(nodeHardwareFaultID).append(",");
        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" serviceID : ").append(serviceID).append(",");
        sb.append(" driveID : ").append(driveID).append(",");
        sb.append(" resolved : ").append(resolved).append(",");
        sb.append(" clusterFaultID : ").append(clusterFaultID).append(",");
        sb.append(" date : ").append(date).append(",");
        sb.append(" resolvedDate : ").append(resolvedDate).append(",");
        sb.append(" data : ").append(data).append(",");
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
        private String severity;
        private String type;
        private String code;
        private String details;
        private NodeHardwareFaultID nodeHardwareFaultID;
        private NodeID nodeID;
        private ServiceID serviceID;
        private DriveID driveID;
        private Boolean resolved;
        private ClusterFaultID clusterFaultID;
        private String date;
        private String resolvedDate;
        private Object data;

        private Builder() { }

        public ClusterFaultInfo build() {
            return new ClusterFaultInfo (
                         this.severity,
                         this.type,
                         this.code,
                         this.details,
                         this.nodeHardwareFaultID,
                         this.nodeID,
                         this.serviceID,
                         this.driveID,
                         this.resolved,
                         this.clusterFaultID,
                         this.date,
                         this.resolvedDate,
                         this.data);
        }

        private ClusterFaultInfo.Builder buildFrom(final ClusterFaultInfo req) {
            this.severity = req.severity;
            this.type = req.type;
            this.code = req.code;
            this.details = req.details;
            this.nodeHardwareFaultID = req.nodeHardwareFaultID;
            this.nodeID = req.nodeID;
            this.serviceID = req.serviceID;
            this.driveID = req.driveID;
            this.resolved = req.resolved;
            this.clusterFaultID = req.clusterFaultID;
            this.date = req.date;
            this.resolvedDate = req.resolvedDate;
            this.data = req.data;

            return this;
        }

        public ClusterFaultInfo.Builder severity(final String severity) {
            this.severity = severity;
            return this;
        }

        public ClusterFaultInfo.Builder type(final String type) {
            this.type = type;
            return this;
        }

        public ClusterFaultInfo.Builder code(final String code) {
            this.code = code;
            return this;
        }

        public ClusterFaultInfo.Builder details(final String details) {
            this.details = details;
            return this;
        }

        public ClusterFaultInfo.Builder nodeHardwareFaultID(final NodeHardwareFaultID nodeHardwareFaultID) {
            this.nodeHardwareFaultID = nodeHardwareFaultID;
            return this;
        }

        public ClusterFaultInfo.Builder nodeID(final NodeID nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public ClusterFaultInfo.Builder serviceID(final ServiceID serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        public ClusterFaultInfo.Builder driveID(final DriveID driveID) {
            this.driveID = driveID;
            return this;
        }

        public ClusterFaultInfo.Builder resolved(final Boolean resolved) {
            this.resolved = resolved;
            return this;
        }

        public ClusterFaultInfo.Builder clusterFaultID(final ClusterFaultID clusterFaultID) {
            this.clusterFaultID = clusterFaultID;
            return this;
        }

        public ClusterFaultInfo.Builder date(final String date) {
            this.date = date;
            return this;
        }

        public ClusterFaultInfo.Builder resolvedDate(final String resolvedDate) {
            this.resolvedDate = resolvedDate;
            return this;
        }

        public ClusterFaultInfo.Builder data(final Object data) {
            this.data = data;
            return this;
        }

    }
}
