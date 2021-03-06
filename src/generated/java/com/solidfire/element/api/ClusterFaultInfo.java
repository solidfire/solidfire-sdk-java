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
 * ClusterFaultInfo  
 **/

public class ClusterFaultInfo implements Serializable {

    public static final long serialVersionUID = 8671459861121318368L;
    @SerializedName("driveIDs") private Optional<Long[]> driveIDs;
    @SerializedName("networkInterface") private Optional<String> networkInterface;
    @SerializedName("severity") private String severity;
    @SerializedName("type") private String type;
    @SerializedName("code") private String code;
    @SerializedName("details") private String details;
    @SerializedName("nodeHardwareFaultID") private Long nodeHardwareFaultID;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("serviceID") private Long serviceID;
    @SerializedName("driveID") private Long driveID;
    @SerializedName("resolved") private Boolean resolved;
    @SerializedName("clusterFaultID") private Long clusterFaultID;
    @SerializedName("date") private String date;
    @SerializedName("resolvedDate") private String resolvedDate;
    @SerializedName("data") private Optional<Attributes> data;
    @SerializedName("externalSource") private Optional<String> externalSource;
    // empty constructor
    @Since("7.0")
    public ClusterFaultInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public ClusterFaultInfo(
        Optional<Long[]> driveIDs,
        Optional<String> networkInterface,
        String severity,
        String type,
        String code,
        String details,
        Long nodeHardwareFaultID,
        Long nodeID,
        Long serviceID,
        Long driveID,
        Boolean resolved,
        Long clusterFaultID,
        String date,
        String resolvedDate,
        Optional<Attributes> data
    )
    {
        this.driveIDs = (driveIDs == null) ? Optional.<Long[]>empty() : driveIDs;
        this.networkInterface = (networkInterface == null) ? Optional.<String>empty() : networkInterface;
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
        this.data = (data == null) ? Optional.<Attributes>empty() : data;
    }
    // parameterized constructor
    @Since("10.0")
    public ClusterFaultInfo(
        Optional<Long[]> driveIDs,
        Optional<String> networkInterface,
        String severity,
        String type,
        String code,
        String details,
        Long nodeHardwareFaultID,
        Long nodeID,
        Long serviceID,
        Long driveID,
        Boolean resolved,
        Long clusterFaultID,
        String date,
        String resolvedDate,
        Optional<Attributes> data,
        Optional<String> externalSource
    )
    {
        this.driveIDs = (driveIDs == null) ? Optional.<Long[]>empty() : driveIDs;
        this.networkInterface = (networkInterface == null) ? Optional.<String>empty() : networkInterface;
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
        this.data = (data == null) ? Optional.<Attributes>empty() : data;
        this.externalSource = (externalSource == null) ? Optional.<String>empty() : externalSource;
    }

    /** 
     * 
     **/
    public Optional<Long[]> getDriveIDs() { return this.driveIDs; }
   
    public void setDriveIDs(Optional<Long[]> driveIDs) { 
        this.driveIDs = (driveIDs == null) ? Optional.<Long[]>empty() : driveIDs;
    }
    /** 
     * 
     **/
    public Optional<String> getNetworkInterface() { return this.networkInterface; }
   
    public void setNetworkInterface(Optional<String> networkInterface) { 
        this.networkInterface = (networkInterface == null) ? Optional.<String>empty() : networkInterface;
    }
    /** 
     * 
     **/
    public String getSeverity() { return this.severity; }
   
    public void setSeverity(String severity) { 
        this.severity = severity;
    }
    /** 
     * 
     **/
    public String getType() { return this.type; }
   
    public void setType(String type) { 
        this.type = type;
    }
    /** 
     * 
     **/
    public String getCode() { return this.code; }
   
    public void setCode(String code) { 
        this.code = code;
    }
    /** 
     * 
     **/
    public String getDetails() { return this.details; }
   
    public void setDetails(String details) { 
        this.details = details;
    }
    /** 
     * 
     **/
    public Long getNodeHardwareFaultID() { return this.nodeHardwareFaultID; }
   
    public void setNodeHardwareFaultID(Long nodeHardwareFaultID) { 
        this.nodeHardwareFaultID = nodeHardwareFaultID;
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
    public Long getServiceID() { return this.serviceID; }
   
    public void setServiceID(Long serviceID) { 
        this.serviceID = serviceID;
    }
    /** 
     * 
     **/
    public Long getDriveID() { return this.driveID; }
   
    public void setDriveID(Long driveID) { 
        this.driveID = driveID;
    }
    /** 
     * 
     **/
    public Boolean getResolved() { return this.resolved; }
   
    public void setResolved(Boolean resolved) { 
        this.resolved = resolved;
    }
    /** 
     * 
     **/
    public Long getClusterFaultID() { return this.clusterFaultID; }
   
    public void setClusterFaultID(Long clusterFaultID) { 
        this.clusterFaultID = clusterFaultID;
    }
    /** 
     * 
     **/
    public String getDate() { return this.date; }
   
    public void setDate(String date) { 
        this.date = date;
    }
    /** 
     * 
     **/
    public String getResolvedDate() { return this.resolvedDate; }
   
    public void setResolvedDate(String resolvedDate) { 
        this.resolvedDate = resolvedDate;
    }
    /** 
     * 
     **/
    public Optional<Attributes> getData() { return this.data; }
   
    public void setData(Optional<Attributes> data) { 
        this.data = (data == null) ? Optional.<Attributes>empty() : data;
    }
    /** 
     * 
     **/
    public Optional<String> getExternalSource() { return this.externalSource; }
   
    public void setExternalSource(Optional<String> externalSource) { 
        this.externalSource = (externalSource == null) ? Optional.<String>empty() : externalSource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterFaultInfo that = (ClusterFaultInfo) o;

        return 
            Objects.equals(driveIDs, that.driveIDs) && 
            Objects.equals(networkInterface, that.networkInterface) && 
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
            Objects.equals(data, that.data) && 
            Objects.equals(externalSource, that.externalSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash( driveIDs,networkInterface,severity,type,code,details,nodeHardwareFaultID,nodeID,serviceID,driveID,resolved,clusterFaultID,date,resolvedDate,data,externalSource );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("driveIDs", driveIDs);
        map.put("networkInterface", networkInterface);
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
        map.put("externalSource", externalSource);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != driveIDs && driveIDs.isPresent()){
            sb.append(" driveIDs : ").append(gson.toJson(driveIDs)).append(",");
        }
        else{
            sb.append(" driveIDs : ").append("null").append(",");
        }
        if(null != networkInterface && networkInterface.isPresent()){
            sb.append(" networkInterface : ").append(gson.toJson(networkInterface)).append(",");
        }
        else{
            sb.append(" networkInterface : ").append("null").append(",");
        }
        sb.append(" severity : ").append(gson.toJson(severity)).append(",");
        sb.append(" type : ").append(gson.toJson(type)).append(",");
        sb.append(" code : ").append(gson.toJson(code)).append(",");
        sb.append(" details : ").append(gson.toJson(details)).append(",");
        sb.append(" nodeHardwareFaultID : ").append(gson.toJson(nodeHardwareFaultID)).append(",");
        sb.append(" nodeID : ").append(gson.toJson(nodeID)).append(",");
        sb.append(" serviceID : ").append(gson.toJson(serviceID)).append(",");
        sb.append(" driveID : ").append(gson.toJson(driveID)).append(",");
        sb.append(" resolved : ").append(gson.toJson(resolved)).append(",");
        sb.append(" clusterFaultID : ").append(gson.toJson(clusterFaultID)).append(",");
        sb.append(" date : ").append(gson.toJson(date)).append(",");
        sb.append(" resolvedDate : ").append(gson.toJson(resolvedDate)).append(",");
        if(null != data && data.isPresent()){
            sb.append(" data : ").append(gson.toJson(data)).append(",");
        }
        else{
            sb.append(" data : ").append("null").append(",");
        }
        if(null != externalSource && externalSource.isPresent()){
            sb.append(" externalSource : ").append(gson.toJson(externalSource)).append(",");
        }
        else{
            sb.append(" externalSource : ").append("null").append(",");
        }
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
        private Optional<Long[]> driveIDs;
        private Optional<String> networkInterface;
        private String severity;
        private String type;
        private String code;
        private String details;
        private Long nodeHardwareFaultID;
        private Long nodeID;
        private Long serviceID;
        private Long driveID;
        private Boolean resolved;
        private Long clusterFaultID;
        private String date;
        private String resolvedDate;
        private Optional<Attributes> data;
        private Optional<String> externalSource;

        private Builder() { }

        public ClusterFaultInfo build() {
            return new ClusterFaultInfo (
                         this.driveIDs,
                         this.networkInterface,
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
                         this.data,
                         this.externalSource);
        }

        private ClusterFaultInfo.Builder buildFrom(final ClusterFaultInfo req) {
            this.driveIDs = req.driveIDs;
            this.networkInterface = req.networkInterface;
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
            this.externalSource = req.externalSource;

            return this;
        }

        public ClusterFaultInfo.Builder optionalDriveIDs(final Long[] driveIDs) {
            this.driveIDs = (driveIDs == null) ? Optional.<Long[]>empty() : Optional.of(driveIDs);
            return this;
        }

        public ClusterFaultInfo.Builder optionalNetworkInterface(final String networkInterface) {
            this.networkInterface = (networkInterface == null) ? Optional.<String>empty() : Optional.of(networkInterface);
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

        public ClusterFaultInfo.Builder nodeHardwareFaultID(final Long nodeHardwareFaultID) {
            this.nodeHardwareFaultID = nodeHardwareFaultID;
            return this;
        }

        public ClusterFaultInfo.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public ClusterFaultInfo.Builder serviceID(final Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        public ClusterFaultInfo.Builder driveID(final Long driveID) {
            this.driveID = driveID;
            return this;
        }

        public ClusterFaultInfo.Builder resolved(final Boolean resolved) {
            this.resolved = resolved;
            return this;
        }

        public ClusterFaultInfo.Builder clusterFaultID(final Long clusterFaultID) {
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

        public ClusterFaultInfo.Builder optionalData(final Attributes data) {
            this.data = (data == null) ? Optional.<Attributes>empty() : Optional.of(data);
            return this;
        }

        public ClusterFaultInfo.Builder optionalExternalSource(final String externalSource) {
            this.externalSource = (externalSource == null) ? Optional.<String>empty() : Optional.of(externalSource);
            return this;
        }

    }
}
