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
 * ISCSISession  
 * Information about an iSCSI session.
 **/

public class ISCSISession implements Serializable {

    public static final long serialVersionUID = -3449300008711067548L;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("accountName") private String accountName;
    @SerializedName("authentication") private ISCSIAuthentication authentication;
    @SerializedName("createTime") private String createTime;
    @SerializedName("driveID") private Long driveID;
    @SerializedName("driveIDs") private Optional<Long[]> driveIDs;
    @SerializedName("initiator") private Optional<Initiator> initiator;
    @SerializedName("initiatorIP") private String initiatorIP;
    @SerializedName("initiatorName") private String initiatorName;
    @SerializedName("initiatorPortName") private String initiatorPortName;
    @SerializedName("initiatorSessionID") private Long initiatorSessionID;
    @SerializedName("msSinceLastIscsiPDU") private Long msSinceLastIscsiPDU;
    @SerializedName("msSinceLastScsiCommand") private Long msSinceLastScsiCommand;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("serviceID") private Long serviceID;
    @SerializedName("sessionID") private Long sessionID;
    @SerializedName("targetIP") private String targetIP;
    @SerializedName("targetName") private String targetName;
    @SerializedName("targetPortName") private String targetPortName;
    @SerializedName("virtualNetworkID") private Long virtualNetworkID;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("volumeInstance") private Long volumeInstance;
    // empty constructor
    @Since("7.0")
    public ISCSISession() {}

    
    // parameterized constructor
    @Since("7.0")
    public ISCSISession(
        Long accountID,
        String accountName,
        String createTime,
        Long driveID,
        Optional<Long[]> driveIDs,
        Optional<Initiator> initiator,
        String initiatorIP,
        String initiatorName,
        String initiatorPortName,
        Long initiatorSessionID,
        Long msSinceLastIscsiPDU,
        Long msSinceLastScsiCommand,
        Long nodeID,
        Long serviceID,
        Long sessionID,
        String targetIP,
        String targetName,
        String targetPortName,
        Long virtualNetworkID,
        Long volumeID,
        Long volumeInstance
    )
    {
        this.accountID = accountID;
        this.accountName = accountName;
        this.createTime = createTime;
        this.driveID = driveID;
        this.driveIDs = (driveIDs == null) ? Optional.<Long[]>empty() : driveIDs;
        this.initiator = (initiator == null) ? Optional.<Initiator>empty() : initiator;
        this.initiatorIP = initiatorIP;
        this.initiatorName = initiatorName;
        this.initiatorPortName = initiatorPortName;
        this.initiatorSessionID = initiatorSessionID;
        this.msSinceLastIscsiPDU = msSinceLastIscsiPDU;
        this.msSinceLastScsiCommand = msSinceLastScsiCommand;
        this.nodeID = nodeID;
        this.serviceID = serviceID;
        this.sessionID = sessionID;
        this.targetIP = targetIP;
        this.targetName = targetName;
        this.targetPortName = targetPortName;
        this.virtualNetworkID = virtualNetworkID;
        this.volumeID = volumeID;
        this.volumeInstance = volumeInstance;
    }
    // parameterized constructor
    @Since("12.0")
    public ISCSISession(
        Long accountID,
        String accountName,
        ISCSIAuthentication authentication,
        String createTime,
        Long driveID,
        Optional<Long[]> driveIDs,
        Optional<Initiator> initiator,
        String initiatorIP,
        String initiatorName,
        String initiatorPortName,
        Long initiatorSessionID,
        Long msSinceLastIscsiPDU,
        Long msSinceLastScsiCommand,
        Long nodeID,
        Long serviceID,
        Long sessionID,
        String targetIP,
        String targetName,
        String targetPortName,
        Long virtualNetworkID,
        Long volumeID,
        Long volumeInstance
    )
    {
        this.accountID = accountID;
        this.accountName = accountName;
        this.authentication = authentication;
        this.createTime = createTime;
        this.driveID = driveID;
        this.driveIDs = (driveIDs == null) ? Optional.<Long[]>empty() : driveIDs;
        this.initiator = (initiator == null) ? Optional.<Initiator>empty() : initiator;
        this.initiatorIP = initiatorIP;
        this.initiatorName = initiatorName;
        this.initiatorPortName = initiatorPortName;
        this.initiatorSessionID = initiatorSessionID;
        this.msSinceLastIscsiPDU = msSinceLastIscsiPDU;
        this.msSinceLastScsiCommand = msSinceLastScsiCommand;
        this.nodeID = nodeID;
        this.serviceID = serviceID;
        this.sessionID = sessionID;
        this.targetIP = targetIP;
        this.targetName = targetName;
        this.targetPortName = targetPortName;
        this.virtualNetworkID = virtualNetworkID;
        this.volumeID = volumeID;
        this.volumeInstance = volumeInstance;
    }

    /** 
     * The numeric ID of the account object used for authentication (if any).
     **/
    public Long getAccountID() { return this.accountID; }
   
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     * The name of the account object used for authentication (if any).
     **/
    public String getAccountName() { return this.accountName; }
   
    public void setAccountName(String accountName) { 
        this.accountName = accountName;
    }
    /** 
     * Authentication information for this session.
     **/
    public ISCSIAuthentication getAuthentication() { return this.authentication; }
   
    public void setAuthentication(ISCSIAuthentication authentication) { 
        this.authentication = authentication;
    }
    /** 
     * The time when this session was created.
     **/
    public String getCreateTime() { return this.createTime; }
   
    public void setCreateTime(String createTime) { 
        this.createTime = createTime;
    }
    /** 
     * The numeric drive ID associated with this session.
     **/
    public Long getDriveID() { return this.driveID; }
   
    public void setDriveID(Long driveID) { 
        this.driveID = driveID;
    }
    /** 
     * A list of numeric drive IDs associated with this session.
     **/
    public Optional<Long[]> getDriveIDs() { return this.driveIDs; }
   
    public void setDriveIDs(Optional<Long[]> driveIDs) { 
        this.driveIDs = (driveIDs == null) ? Optional.<Long[]>empty() : driveIDs;
    }
    /** 
     * The initiator object (if any) associated with this session.
     **/
    public Optional<Initiator> getInitiator() { return this.initiator; }
   
    public void setInitiator(Optional<Initiator> initiator) { 
        this.initiator = (initiator == null) ? Optional.<Initiator>empty() : initiator;
    }
    /** 
     * The initiator's socket IP address and TCP port number.
     **/
    public String getInitiatorIP() { return this.initiatorIP; }
   
    public void setInitiatorIP(String initiatorIP) { 
        this.initiatorIP = initiatorIP;
    }
    /** 
     * The initiator's iSCSI qualified name (IQN) string.
     **/
    public String getInitiatorName() { return this.initiatorName; }
   
    public void setInitiatorName(String initiatorName) { 
        this.initiatorName = initiatorName;
    }
    /** 
     * The iSCSI initiator port name string.
     **/
    public String getInitiatorPortName() { return this.initiatorPortName; }
   
    public void setInitiatorPortName(String initiatorPortName) { 
        this.initiatorPortName = initiatorPortName;
    }
    /** 
     * The iSCSI initiator session ID (ISID) for this session.
     **/
    public Long getInitiatorSessionID() { return this.initiatorSessionID; }
   
    public void setInitiatorSessionID(Long initiatorSessionID) { 
        this.initiatorSessionID = initiatorSessionID;
    }
    /** 
     * Number of milliseconds since this session received an iSCSI PDU.
     **/
    public Long getMsSinceLastIscsiPDU() { return this.msSinceLastIscsiPDU; }
   
    public void setMsSinceLastIscsiPDU(Long msSinceLastIscsiPDU) { 
        this.msSinceLastIscsiPDU = msSinceLastIscsiPDU;
    }
    /** 
     * Number of milliseconds since this session received a SCSI command.
     **/
    public Long getMsSinceLastScsiCommand() { return this.msSinceLastScsiCommand; }
   
    public void setMsSinceLastScsiCommand(Long msSinceLastScsiCommand) { 
        this.msSinceLastScsiCommand = msSinceLastScsiCommand;
    }
    /** 
     * The numeric node ID associated with this session.
     **/
    public Long getNodeID() { return this.nodeID; }
   
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     * The numeric service ID associated with this session.
     **/
    public Long getServiceID() { return this.serviceID; }
   
    public void setServiceID(Long serviceID) { 
        this.serviceID = serviceID;
    }
    /** 
     * The numeric ID associated with this session.
     **/
    public Long getSessionID() { return this.sessionID; }
   
    public void setSessionID(Long sessionID) { 
        this.sessionID = sessionID;
    }
    /** 
     * The target's socket IP address and TCP port number.
     **/
    public String getTargetIP() { return this.targetIP; }
   
    public void setTargetIP(String targetIP) { 
        this.targetIP = targetIP;
    }
    /** 
     * The target's iSCSI qualified name (IQN) string.
     **/
    public String getTargetName() { return this.targetName; }
   
    public void setTargetName(String targetName) { 
        this.targetName = targetName;
    }
    /** 
     * The iSCSI target port name string.
     **/
    public String getTargetPortName() { return this.targetPortName; }
   
    public void setTargetPortName(String targetPortName) { 
        this.targetPortName = targetPortName;
    }
    /** 
     * The numeric ID of the virtual network (if any) used to create the session.
     **/
    public Long getVirtualNetworkID() { return this.virtualNetworkID; }
   
    public void setVirtualNetworkID(Long virtualNetworkID) { 
        this.virtualNetworkID = virtualNetworkID;
    }
    /** 
     * The numeric ID of the volume (if any) associated with the target name.
     **/
    public Long getVolumeID() { return this.volumeID; }
   
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * The instance of the volume (if any) associated with this session.
     **/
    public Long getVolumeInstance() { return this.volumeInstance; }
   
    public void setVolumeInstance(Long volumeInstance) { 
        this.volumeInstance = volumeInstance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ISCSISession that = (ISCSISession) o;

        return 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(accountName, that.accountName) && 
            Objects.equals(authentication, that.authentication) && 
            Objects.equals(createTime, that.createTime) && 
            Objects.equals(driveID, that.driveID) && 
            Objects.equals(driveIDs, that.driveIDs) && 
            Objects.equals(initiator, that.initiator) && 
            Objects.equals(initiatorIP, that.initiatorIP) && 
            Objects.equals(initiatorName, that.initiatorName) && 
            Objects.equals(initiatorPortName, that.initiatorPortName) && 
            Objects.equals(initiatorSessionID, that.initiatorSessionID) && 
            Objects.equals(msSinceLastIscsiPDU, that.msSinceLastIscsiPDU) && 
            Objects.equals(msSinceLastScsiCommand, that.msSinceLastScsiCommand) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(serviceID, that.serviceID) && 
            Objects.equals(sessionID, that.sessionID) && 
            Objects.equals(targetIP, that.targetIP) && 
            Objects.equals(targetName, that.targetName) && 
            Objects.equals(targetPortName, that.targetPortName) && 
            Objects.equals(virtualNetworkID, that.virtualNetworkID) && 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(volumeInstance, that.volumeInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID,accountName,authentication,createTime,driveID,driveIDs,initiator,initiatorIP,initiatorName,initiatorPortName,initiatorSessionID,msSinceLastIscsiPDU,msSinceLastScsiCommand,nodeID,serviceID,sessionID,targetIP,targetName,targetPortName,virtualNetworkID,volumeID,volumeInstance );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountID", accountID);
        map.put("accountName", accountName);
        map.put("authentication", authentication);
        map.put("createTime", createTime);
        map.put("driveID", driveID);
        map.put("driveIDs", driveIDs);
        map.put("initiator", initiator);
        map.put("initiatorIP", initiatorIP);
        map.put("initiatorName", initiatorName);
        map.put("initiatorPortName", initiatorPortName);
        map.put("initiatorSessionID", initiatorSessionID);
        map.put("msSinceLastIscsiPDU", msSinceLastIscsiPDU);
        map.put("msSinceLastScsiCommand", msSinceLastScsiCommand);
        map.put("nodeID", nodeID);
        map.put("serviceID", serviceID);
        map.put("sessionID", sessionID);
        map.put("targetIP", targetIP);
        map.put("targetName", targetName);
        map.put("targetPortName", targetPortName);
        map.put("virtualNetworkID", virtualNetworkID);
        map.put("volumeID", volumeID);
        map.put("volumeInstance", volumeInstance);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" accountID : ").append(gson.toJson(accountID)).append(",");
        sb.append(" accountName : ").append(gson.toJson(accountName)).append(",");
        sb.append(" authentication : ").append(gson.toJson(authentication)).append(",");
        sb.append(" createTime : ").append(gson.toJson(createTime)).append(",");
        sb.append(" driveID : ").append(gson.toJson(driveID)).append(",");
        if(null != driveIDs && driveIDs.isPresent()){
            sb.append(" driveIDs : ").append(gson.toJson(driveIDs)).append(",");
        }
        else{
            sb.append(" driveIDs : ").append("null").append(",");
        }
        if(null != initiator && initiator.isPresent()){
            sb.append(" initiator : ").append(gson.toJson(initiator)).append(",");
        }
        else{
            sb.append(" initiator : ").append("null").append(",");
        }
        sb.append(" initiatorIP : ").append(gson.toJson(initiatorIP)).append(",");
        sb.append(" initiatorName : ").append(gson.toJson(initiatorName)).append(",");
        sb.append(" initiatorPortName : ").append(gson.toJson(initiatorPortName)).append(",");
        sb.append(" initiatorSessionID : ").append(gson.toJson(initiatorSessionID)).append(",");
        sb.append(" msSinceLastIscsiPDU : ").append(gson.toJson(msSinceLastIscsiPDU)).append(",");
        sb.append(" msSinceLastScsiCommand : ").append(gson.toJson(msSinceLastScsiCommand)).append(",");
        sb.append(" nodeID : ").append(gson.toJson(nodeID)).append(",");
        sb.append(" serviceID : ").append(gson.toJson(serviceID)).append(",");
        sb.append(" sessionID : ").append(gson.toJson(sessionID)).append(",");
        sb.append(" targetIP : ").append(gson.toJson(targetIP)).append(",");
        sb.append(" targetName : ").append(gson.toJson(targetName)).append(",");
        sb.append(" targetPortName : ").append(gson.toJson(targetPortName)).append(",");
        sb.append(" virtualNetworkID : ").append(gson.toJson(virtualNetworkID)).append(",");
        sb.append(" volumeID : ").append(gson.toJson(volumeID)).append(",");
        sb.append(" volumeInstance : ").append(gson.toJson(volumeInstance)).append(",");
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
        private Long accountID;
        private String accountName;
        private ISCSIAuthentication authentication;
        private String createTime;
        private Long driveID;
        private Optional<Long[]> driveIDs;
        private Optional<Initiator> initiator;
        private String initiatorIP;
        private String initiatorName;
        private String initiatorPortName;
        private Long initiatorSessionID;
        private Long msSinceLastIscsiPDU;
        private Long msSinceLastScsiCommand;
        private Long nodeID;
        private Long serviceID;
        private Long sessionID;
        private String targetIP;
        private String targetName;
        private String targetPortName;
        private Long virtualNetworkID;
        private Long volumeID;
        private Long volumeInstance;

        private Builder() { }

        public ISCSISession build() {
            return new ISCSISession (
                         this.accountID,
                         this.accountName,
                         this.authentication,
                         this.createTime,
                         this.driveID,
                         this.driveIDs,
                         this.initiator,
                         this.initiatorIP,
                         this.initiatorName,
                         this.initiatorPortName,
                         this.initiatorSessionID,
                         this.msSinceLastIscsiPDU,
                         this.msSinceLastScsiCommand,
                         this.nodeID,
                         this.serviceID,
                         this.sessionID,
                         this.targetIP,
                         this.targetName,
                         this.targetPortName,
                         this.virtualNetworkID,
                         this.volumeID,
                         this.volumeInstance);
        }

        private ISCSISession.Builder buildFrom(final ISCSISession req) {
            this.accountID = req.accountID;
            this.accountName = req.accountName;
            this.authentication = req.authentication;
            this.createTime = req.createTime;
            this.driveID = req.driveID;
            this.driveIDs = req.driveIDs;
            this.initiator = req.initiator;
            this.initiatorIP = req.initiatorIP;
            this.initiatorName = req.initiatorName;
            this.initiatorPortName = req.initiatorPortName;
            this.initiatorSessionID = req.initiatorSessionID;
            this.msSinceLastIscsiPDU = req.msSinceLastIscsiPDU;
            this.msSinceLastScsiCommand = req.msSinceLastScsiCommand;
            this.nodeID = req.nodeID;
            this.serviceID = req.serviceID;
            this.sessionID = req.sessionID;
            this.targetIP = req.targetIP;
            this.targetName = req.targetName;
            this.targetPortName = req.targetPortName;
            this.virtualNetworkID = req.virtualNetworkID;
            this.volumeID = req.volumeID;
            this.volumeInstance = req.volumeInstance;

            return this;
        }

        public ISCSISession.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public ISCSISession.Builder accountName(final String accountName) {
            this.accountName = accountName;
            return this;
        }

        public ISCSISession.Builder authentication(final ISCSIAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public ISCSISession.Builder createTime(final String createTime) {
            this.createTime = createTime;
            return this;
        }

        public ISCSISession.Builder driveID(final Long driveID) {
            this.driveID = driveID;
            return this;
        }

        public ISCSISession.Builder optionalDriveIDs(final Long[] driveIDs) {
            this.driveIDs = (driveIDs == null) ? Optional.<Long[]>empty() : Optional.of(driveIDs);
            return this;
        }

        public ISCSISession.Builder optionalInitiator(final Initiator initiator) {
            this.initiator = (initiator == null) ? Optional.<Initiator>empty() : Optional.of(initiator);
            return this;
        }

        public ISCSISession.Builder initiatorIP(final String initiatorIP) {
            this.initiatorIP = initiatorIP;
            return this;
        }

        public ISCSISession.Builder initiatorName(final String initiatorName) {
            this.initiatorName = initiatorName;
            return this;
        }

        public ISCSISession.Builder initiatorPortName(final String initiatorPortName) {
            this.initiatorPortName = initiatorPortName;
            return this;
        }

        public ISCSISession.Builder initiatorSessionID(final Long initiatorSessionID) {
            this.initiatorSessionID = initiatorSessionID;
            return this;
        }

        public ISCSISession.Builder msSinceLastIscsiPDU(final Long msSinceLastIscsiPDU) {
            this.msSinceLastIscsiPDU = msSinceLastIscsiPDU;
            return this;
        }

        public ISCSISession.Builder msSinceLastScsiCommand(final Long msSinceLastScsiCommand) {
            this.msSinceLastScsiCommand = msSinceLastScsiCommand;
            return this;
        }

        public ISCSISession.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public ISCSISession.Builder serviceID(final Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        public ISCSISession.Builder sessionID(final Long sessionID) {
            this.sessionID = sessionID;
            return this;
        }

        public ISCSISession.Builder targetIP(final String targetIP) {
            this.targetIP = targetIP;
            return this;
        }

        public ISCSISession.Builder targetName(final String targetName) {
            this.targetName = targetName;
            return this;
        }

        public ISCSISession.Builder targetPortName(final String targetPortName) {
            this.targetPortName = targetPortName;
            return this;
        }

        public ISCSISession.Builder virtualNetworkID(final Long virtualNetworkID) {
            this.virtualNetworkID = virtualNetworkID;
            return this;
        }

        public ISCSISession.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public ISCSISession.Builder volumeInstance(final Long volumeInstance) {
            this.volumeInstance = volumeInstance;
            return this;
        }

    }
}
