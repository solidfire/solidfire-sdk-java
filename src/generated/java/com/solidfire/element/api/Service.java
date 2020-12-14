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
 * Service  
 **/

public class Service implements Serializable {

    public static final long serialVersionUID = -3439065655137018098L;
    @SerializedName("serviceID") private Long serviceID;
    @SerializedName("serviceType") private String serviceType;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("associatedBV") private Optional<Long> associatedBV;
    @SerializedName("associatedTS") private Optional<Long> associatedTS;
    @SerializedName("associatedVS") private Optional<Long> associatedVS;
    @SerializedName("asyncResultIDs") private Long[] asyncResultIDs;
    @SerializedName("driveID") private Optional<Long> driveID;
    @SerializedName("firstTimeStartup") private Boolean firstTimeStartup;
    @SerializedName("ipcPort") private Long ipcPort;
    @SerializedName("iscsiPort") private Long iscsiPort;
    @SerializedName("status") private String status;
    @SerializedName("startedDriveIDs") private Long[] startedDriveIDs;
    @SerializedName("driveIDs") private Long[] driveIDs;
    @SerializedName("smartSsdWriteEnabled") private Optional<Boolean> smartSsdWriteEnabled;
    // empty constructor
    @Since("7.0")
    public Service() {}

    
    // parameterized constructor
    @Since("7.0")
    public Service(
        Long serviceID,
        String serviceType,
        Long nodeID,
        Optional<Long> associatedBV,
        Optional<Long> associatedTS,
        Optional<Long> associatedVS,
        Long[] asyncResultIDs,
        Optional<Long> driveID,
        Boolean firstTimeStartup,
        Long ipcPort,
        Long iscsiPort,
        String status,
        Long[] startedDriveIDs,
        Long[] driveIDs,
        Optional<Boolean> smartSsdWriteEnabled
    )
    {
        this.serviceID = serviceID;
        this.serviceType = serviceType;
        this.nodeID = nodeID;
        this.associatedBV = (associatedBV == null) ? Optional.<Long>empty() : associatedBV;
        this.associatedTS = (associatedTS == null) ? Optional.<Long>empty() : associatedTS;
        this.associatedVS = (associatedVS == null) ? Optional.<Long>empty() : associatedVS;
        this.asyncResultIDs = asyncResultIDs;
        this.driveID = (driveID == null) ? Optional.<Long>empty() : driveID;
        this.firstTimeStartup = firstTimeStartup;
        this.ipcPort = ipcPort;
        this.iscsiPort = iscsiPort;
        this.status = status;
        this.startedDriveIDs = startedDriveIDs;
        this.driveIDs = driveIDs;
        this.smartSsdWriteEnabled = (smartSsdWriteEnabled == null) ? Optional.<Boolean>empty() : smartSsdWriteEnabled;
    }

    /** 
     * Unique identifier for this service.
     **/
    public Long getServiceID() { return this.serviceID; }
   
    public void setServiceID(Long serviceID) { 
        this.serviceID = serviceID;
    }
    /** 
     * 
     **/
    public String getServiceType() { return this.serviceType; }
   
    public void setServiceType(String serviceType) { 
        this.serviceType = serviceType;
    }
    /** 
     * The node this service resides on.
     **/
    public Long getNodeID() { return this.nodeID; }
   
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     * This service's associated bulk volume service.
     * This will only be set if the service type is a slice service.
     **/
    public Optional<Long> getAssociatedBV() { return this.associatedBV; }
   
    public void setAssociatedBV(Optional<Long> associatedBV) { 
        this.associatedBV = (associatedBV == null) ? Optional.<Long>empty() : associatedBV;
    }
    /** 
     * This service's associated transport service.
     * This will only be set if the service type is a slice service.
     **/
    public Optional<Long> getAssociatedTS() { return this.associatedTS; }
   
    public void setAssociatedTS(Optional<Long> associatedTS) { 
        this.associatedTS = (associatedTS == null) ? Optional.<Long>empty() : associatedTS;
    }
    /** 
     * This service's associated volume service.
     * This will only be set if the service type is a slice service.
     **/
    public Optional<Long> getAssociatedVS() { return this.associatedVS; }
   
    public void setAssociatedVS(Optional<Long> associatedVS) { 
        this.associatedVS = (associatedVS == null) ? Optional.<Long>empty() : associatedVS;
    }
    /** 
     * The list of asynchronous jobs currently running for this service.
     **/
    public Long[] getAsyncResultIDs() { return this.asyncResultIDs; }
   
    public void setAsyncResultIDs(Long[] asyncResultIDs) { 
        this.asyncResultIDs = asyncResultIDs;
    }
    /** 
     * If this service resides on a drive, the ID of that drive.
     **/
    public Optional<Long> getDriveID() { return this.driveID; }
   
    public void setDriveID(Optional<Long> driveID) { 
        this.driveID = (driveID == null) ? Optional.<Long>empty() : driveID;
    }
    /** 
     * Has this service started successfully?
     * When a new drive is added to the system, the created service will initially have a value of false here.
     * After the service has started, this value will be set to true.
     * This can be used to check if the service has ever started.
     **/
    public Boolean getFirstTimeStartup() { return this.firstTimeStartup; }
   
    public void setFirstTimeStartup(Boolean firstTimeStartup) { 
        this.firstTimeStartup = firstTimeStartup;
    }
    /** 
     * The port used for intra-cluster communication.
     * This will be in the 4000-4100 range.
     **/
    public Long getIpcPort() { return this.ipcPort; }
   
    public void setIpcPort(Long ipcPort) { 
        this.ipcPort = ipcPort;
    }
    /** 
     * The port used for iSCSI traffic.
     * This will only be set if the service type is a transport service.
     **/
    public Long getIscsiPort() { return this.iscsiPort; }
   
    public void setIscsiPort(Long iscsiPort) { 
        this.iscsiPort = iscsiPort;
    }
    /** 
     * 
     **/
    public String getStatus() { return this.status; }
   
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     * 
     **/
    public Long[] getStartedDriveIDs() { return this.startedDriveIDs; }
   
    public void setStartedDriveIDs(Long[] startedDriveIDs) { 
        this.startedDriveIDs = startedDriveIDs;
    }
    /** 
     * 
     **/
    public Long[] getDriveIDs() { return this.driveIDs; }
   
    public void setDriveIDs(Long[] driveIDs) { 
        this.driveIDs = driveIDs;
    }
    /** 
     * 
     **/
    public Optional<Boolean> getSmartSsdWriteEnabled() { return this.smartSsdWriteEnabled; }
   
    public void setSmartSsdWriteEnabled(Optional<Boolean> smartSsdWriteEnabled) { 
        this.smartSsdWriteEnabled = (smartSsdWriteEnabled == null) ? Optional.<Boolean>empty() : smartSsdWriteEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Service that = (Service) o;

        return 
            Objects.equals(serviceID, that.serviceID) && 
            Objects.equals(serviceType, that.serviceType) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(associatedBV, that.associatedBV) && 
            Objects.equals(associatedTS, that.associatedTS) && 
            Objects.equals(associatedVS, that.associatedVS) && 
            Arrays.equals(asyncResultIDs, that.asyncResultIDs) && 
            Objects.equals(driveID, that.driveID) && 
            Objects.equals(firstTimeStartup, that.firstTimeStartup) && 
            Objects.equals(ipcPort, that.ipcPort) && 
            Objects.equals(iscsiPort, that.iscsiPort) && 
            Objects.equals(status, that.status) && 
            Arrays.equals(startedDriveIDs, that.startedDriveIDs) && 
            Arrays.equals(driveIDs, that.driveIDs) && 
            Objects.equals(smartSsdWriteEnabled, that.smartSsdWriteEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash( serviceID,serviceType,nodeID,associatedBV,associatedTS,associatedVS,(Object[])asyncResultIDs,driveID,firstTimeStartup,ipcPort,iscsiPort,status,(Object[])startedDriveIDs,(Object[])driveIDs,smartSsdWriteEnabled );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("serviceID", serviceID);
        map.put("serviceType", serviceType);
        map.put("nodeID", nodeID);
        map.put("associatedBV", associatedBV);
        map.put("associatedTS", associatedTS);
        map.put("associatedVS", associatedVS);
        map.put("asyncResultIDs", asyncResultIDs);
        map.put("driveID", driveID);
        map.put("firstTimeStartup", firstTimeStartup);
        map.put("ipcPort", ipcPort);
        map.put("iscsiPort", iscsiPort);
        map.put("status", status);
        map.put("startedDriveIDs", startedDriveIDs);
        map.put("driveIDs", driveIDs);
        map.put("smartSsdWriteEnabled", smartSsdWriteEnabled);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" serviceID : ").append(gson.toJson(serviceID)).append(",");
        sb.append(" serviceType : ").append(gson.toJson(serviceType)).append(",");
        sb.append(" nodeID : ").append(gson.toJson(nodeID)).append(",");
        if(null != associatedBV && associatedBV.isPresent()){
            sb.append(" associatedBV : ").append(gson.toJson(associatedBV)).append(",");
        }
        else{
            sb.append(" associatedBV : ").append("null").append(",");
        }
        if(null != associatedTS && associatedTS.isPresent()){
            sb.append(" associatedTS : ").append(gson.toJson(associatedTS)).append(",");
        }
        else{
            sb.append(" associatedTS : ").append("null").append(",");
        }
        if(null != associatedVS && associatedVS.isPresent()){
            sb.append(" associatedVS : ").append(gson.toJson(associatedVS)).append(",");
        }
        else{
            sb.append(" associatedVS : ").append("null").append(",");
        }
        sb.append(" asyncResultIDs : ").append(gson.toJson(Arrays.toString(asyncResultIDs))).append(",");
        if(null != driveID && driveID.isPresent()){
            sb.append(" driveID : ").append(gson.toJson(driveID)).append(",");
        }
        else{
            sb.append(" driveID : ").append("null").append(",");
        }
        sb.append(" firstTimeStartup : ").append(gson.toJson(firstTimeStartup)).append(",");
        sb.append(" ipcPort : ").append(gson.toJson(ipcPort)).append(",");
        sb.append(" iscsiPort : ").append(gson.toJson(iscsiPort)).append(",");
        sb.append(" status : ").append(gson.toJson(status)).append(",");
        sb.append(" startedDriveIDs : ").append(gson.toJson(Arrays.toString(startedDriveIDs))).append(",");
        sb.append(" driveIDs : ").append(gson.toJson(Arrays.toString(driveIDs))).append(",");
        if(null != smartSsdWriteEnabled && smartSsdWriteEnabled.isPresent()){
            sb.append(" smartSsdWriteEnabled : ").append(gson.toJson(smartSsdWriteEnabled)).append(",");
        }
        else{
            sb.append(" smartSsdWriteEnabled : ").append("null").append(",");
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
        private Long serviceID;
        private String serviceType;
        private Long nodeID;
        private Optional<Long> associatedBV;
        private Optional<Long> associatedTS;
        private Optional<Long> associatedVS;
        private Long[] asyncResultIDs;
        private Optional<Long> driveID;
        private Boolean firstTimeStartup;
        private Long ipcPort;
        private Long iscsiPort;
        private String status;
        private Long[] startedDriveIDs;
        private Long[] driveIDs;
        private Optional<Boolean> smartSsdWriteEnabled;

        private Builder() { }

        public Service build() {
            return new Service (
                         this.serviceID,
                         this.serviceType,
                         this.nodeID,
                         this.associatedBV,
                         this.associatedTS,
                         this.associatedVS,
                         this.asyncResultIDs,
                         this.driveID,
                         this.firstTimeStartup,
                         this.ipcPort,
                         this.iscsiPort,
                         this.status,
                         this.startedDriveIDs,
                         this.driveIDs,
                         this.smartSsdWriteEnabled);
        }

        private Service.Builder buildFrom(final Service req) {
            this.serviceID = req.serviceID;
            this.serviceType = req.serviceType;
            this.nodeID = req.nodeID;
            this.associatedBV = req.associatedBV;
            this.associatedTS = req.associatedTS;
            this.associatedVS = req.associatedVS;
            this.asyncResultIDs = req.asyncResultIDs;
            this.driveID = req.driveID;
            this.firstTimeStartup = req.firstTimeStartup;
            this.ipcPort = req.ipcPort;
            this.iscsiPort = req.iscsiPort;
            this.status = req.status;
            this.startedDriveIDs = req.startedDriveIDs;
            this.driveIDs = req.driveIDs;
            this.smartSsdWriteEnabled = req.smartSsdWriteEnabled;

            return this;
        }

        public Service.Builder serviceID(final Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        public Service.Builder serviceType(final String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public Service.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public Service.Builder optionalAssociatedBV(final Long associatedBV) {
            this.associatedBV = (associatedBV == null) ? Optional.<Long>empty() : Optional.of(associatedBV);
            return this;
        }

        public Service.Builder optionalAssociatedTS(final Long associatedTS) {
            this.associatedTS = (associatedTS == null) ? Optional.<Long>empty() : Optional.of(associatedTS);
            return this;
        }

        public Service.Builder optionalAssociatedVS(final Long associatedVS) {
            this.associatedVS = (associatedVS == null) ? Optional.<Long>empty() : Optional.of(associatedVS);
            return this;
        }

        public Service.Builder asyncResultIDs(final Long[] asyncResultIDs) {
            this.asyncResultIDs = asyncResultIDs;
            return this;
        }

        public Service.Builder optionalDriveID(final Long driveID) {
            this.driveID = (driveID == null) ? Optional.<Long>empty() : Optional.of(driveID);
            return this;
        }

        public Service.Builder firstTimeStartup(final Boolean firstTimeStartup) {
            this.firstTimeStartup = firstTimeStartup;
            return this;
        }

        public Service.Builder ipcPort(final Long ipcPort) {
            this.ipcPort = ipcPort;
            return this;
        }

        public Service.Builder iscsiPort(final Long iscsiPort) {
            this.iscsiPort = iscsiPort;
            return this;
        }

        public Service.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public Service.Builder startedDriveIDs(final Long[] startedDriveIDs) {
            this.startedDriveIDs = startedDriveIDs;
            return this;
        }

        public Service.Builder driveIDs(final Long[] driveIDs) {
            this.driveIDs = driveIDs;
            return this;
        }

        public Service.Builder optionalSmartSsdWriteEnabled(final Boolean smartSsdWriteEnabled) {
            this.smartSsdWriteEnabled = (smartSsdWriteEnabled == null) ? Optional.<Boolean>empty() : Optional.of(smartSsdWriteEnabled);
            return this;
        }

    }
}
