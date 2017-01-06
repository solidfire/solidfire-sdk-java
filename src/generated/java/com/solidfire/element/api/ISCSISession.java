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
 * ISCSISession  
 **/

public class ISCSISession implements Serializable {

    public static final long serialVersionUID = -1637168637781139879L;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("initiator") private Initiator initiator;
    @SerializedName("accountName") private String accountName;
    @SerializedName("driveID") private Long driveID;
    @SerializedName("initiatorIP") private String initiatorIP;
    @SerializedName("initiatorPortName") private String initiatorPortName;
    @SerializedName("targetPortName") private String targetPortName;
    @SerializedName("initiatorName") private String initiatorName;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("serviceID") private Long serviceID;
    @SerializedName("sessionID") private Long sessionID;
    @SerializedName("targetName") private String targetName;
    @SerializedName("targetIP") private String targetIP;
    @SerializedName("virtualNetworkID") private Long virtualNetworkID;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("createTime") private String createTime;
    @SerializedName("volumeInstance") private Long volumeInstance;
    @SerializedName("initiatorSessionID") private Long initiatorSessionID;

    // empty constructor
    @Since("7.0")
    public ISCSISession() {}

    
    // parameterized constructor
    @Since("7.0")
    public ISCSISession(
        Long accountID,
        Initiator initiator,
        String accountName,
        Long driveID,
        String initiatorIP,
        String initiatorPortName,
        String targetPortName,
        String initiatorName,
        Long nodeID,
        Long serviceID,
        Long sessionID,
        String targetName,
        String targetIP,
        Long virtualNetworkID,
        Long volumeID,
        String createTime,
        Long volumeInstance,
        Long initiatorSessionID
    )
    {
        this.accountID = accountID;
        this.initiator = initiator;
        this.accountName = accountName;
        this.driveID = driveID;
        this.initiatorIP = initiatorIP;
        this.initiatorPortName = initiatorPortName;
        this.targetPortName = targetPortName;
        this.initiatorName = initiatorName;
        this.nodeID = nodeID;
        this.serviceID = serviceID;
        this.sessionID = sessionID;
        this.targetName = targetName;
        this.targetIP = targetIP;
        this.virtualNetworkID = virtualNetworkID;
        this.volumeID = volumeID;
        this.createTime = createTime;
        this.volumeInstance = volumeInstance;
        this.initiatorSessionID = initiatorSessionID;
    }

    /** 
     **/
    public Long getAccountID() { return this.accountID; }
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     **/
    public Initiator getInitiator() { return this.initiator; }
    public void setInitiator(Initiator initiator) { 
        this.initiator = initiator;
    }
    /** 
     **/
    public String getAccountName() { return this.accountName; }
    public void setAccountName(String accountName) { 
        this.accountName = accountName;
    }
    /** 
     **/
    public Long getDriveID() { return this.driveID; }
    public void setDriveID(Long driveID) { 
        this.driveID = driveID;
    }
    /** 
     **/
    public String getInitiatorIP() { return this.initiatorIP; }
    public void setInitiatorIP(String initiatorIP) { 
        this.initiatorIP = initiatorIP;
    }
    /** 
     **/
    public String getInitiatorPortName() { return this.initiatorPortName; }
    public void setInitiatorPortName(String initiatorPortName) { 
        this.initiatorPortName = initiatorPortName;
    }
    /** 
     **/
    public String getTargetPortName() { return this.targetPortName; }
    public void setTargetPortName(String targetPortName) { 
        this.targetPortName = targetPortName;
    }
    /** 
     **/
    public String getInitiatorName() { return this.initiatorName; }
    public void setInitiatorName(String initiatorName) { 
        this.initiatorName = initiatorName;
    }
    /** 
     **/
    public Long getNodeID() { return this.nodeID; }
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     **/
    public Long getServiceID() { return this.serviceID; }
    public void setServiceID(Long serviceID) { 
        this.serviceID = serviceID;
    }
    /** 
     **/
    public Long getSessionID() { return this.sessionID; }
    public void setSessionID(Long sessionID) { 
        this.sessionID = sessionID;
    }
    /** 
     **/
    public String getTargetName() { return this.targetName; }
    public void setTargetName(String targetName) { 
        this.targetName = targetName;
    }
    /** 
     **/
    public String getTargetIP() { return this.targetIP; }
    public void setTargetIP(String targetIP) { 
        this.targetIP = targetIP;
    }
    /** 
     **/
    public Long getVirtualNetworkID() { return this.virtualNetworkID; }
    public void setVirtualNetworkID(Long virtualNetworkID) { 
        this.virtualNetworkID = virtualNetworkID;
    }
    /** 
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     **/
    public String getCreateTime() { return this.createTime; }
    public void setCreateTime(String createTime) { 
        this.createTime = createTime;
    }
    /** 
     **/
    public Long getVolumeInstance() { return this.volumeInstance; }
    public void setVolumeInstance(Long volumeInstance) { 
        this.volumeInstance = volumeInstance;
    }
    /** 
     **/
    public Long getInitiatorSessionID() { return this.initiatorSessionID; }
    public void setInitiatorSessionID(Long initiatorSessionID) { 
        this.initiatorSessionID = initiatorSessionID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ISCSISession that = (ISCSISession) o;

        return 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(initiator, that.initiator) && 
            Objects.equals(accountName, that.accountName) && 
            Objects.equals(driveID, that.driveID) && 
            Objects.equals(initiatorIP, that.initiatorIP) && 
            Objects.equals(initiatorPortName, that.initiatorPortName) && 
            Objects.equals(targetPortName, that.targetPortName) && 
            Objects.equals(initiatorName, that.initiatorName) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(serviceID, that.serviceID) && 
            Objects.equals(sessionID, that.sessionID) && 
            Objects.equals(targetName, that.targetName) && 
            Objects.equals(targetIP, that.targetIP) && 
            Objects.equals(virtualNetworkID, that.virtualNetworkID) && 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(createTime, that.createTime) && 
            Objects.equals(volumeInstance, that.volumeInstance) && 
            Objects.equals(initiatorSessionID, that.initiatorSessionID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID,initiator,accountName,driveID,initiatorIP,initiatorPortName,targetPortName,initiatorName,nodeID,serviceID,sessionID,targetName,targetIP,virtualNetworkID,volumeID,createTime,volumeInstance,initiatorSessionID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountID", accountID);
        map.put("initiator", initiator);
        map.put("accountName", accountName);
        map.put("driveID", driveID);
        map.put("initiatorIP", initiatorIP);
        map.put("initiatorPortName", initiatorPortName);
        map.put("targetPortName", targetPortName);
        map.put("initiatorName", initiatorName);
        map.put("nodeID", nodeID);
        map.put("serviceID", serviceID);
        map.put("sessionID", sessionID);
        map.put("targetName", targetName);
        map.put("targetIP", targetIP);
        map.put("virtualNetworkID", virtualNetworkID);
        map.put("volumeID", volumeID);
        map.put("createTime", createTime);
        map.put("volumeInstance", volumeInstance);
        map.put("initiatorSessionID", initiatorSessionID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" accountID : ").append(accountID).append(",");
        sb.append(" initiator : ").append(initiator).append(",");
        sb.append(" accountName : ").append(accountName).append(",");
        sb.append(" driveID : ").append(driveID).append(",");
        sb.append(" initiatorIP : ").append(initiatorIP).append(",");
        sb.append(" initiatorPortName : ").append(initiatorPortName).append(",");
        sb.append(" targetPortName : ").append(targetPortName).append(",");
        sb.append(" initiatorName : ").append(initiatorName).append(",");
        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" serviceID : ").append(serviceID).append(",");
        sb.append(" sessionID : ").append(sessionID).append(",");
        sb.append(" targetName : ").append(targetName).append(",");
        sb.append(" targetIP : ").append(targetIP).append(",");
        sb.append(" virtualNetworkID : ").append(virtualNetworkID).append(",");
        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" createTime : ").append(createTime).append(",");
        sb.append(" volumeInstance : ").append(volumeInstance).append(",");
        sb.append(" initiatorSessionID : ").append(initiatorSessionID).append(",");
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
        private Initiator initiator;
        private String accountName;
        private Long driveID;
        private String initiatorIP;
        private String initiatorPortName;
        private String targetPortName;
        private String initiatorName;
        private Long nodeID;
        private Long serviceID;
        private Long sessionID;
        private String targetName;
        private String targetIP;
        private Long virtualNetworkID;
        private Long volumeID;
        private String createTime;
        private Long volumeInstance;
        private Long initiatorSessionID;

        private Builder() { }

        public ISCSISession build() {
            return new ISCSISession (
                         this.accountID,
                         this.initiator,
                         this.accountName,
                         this.driveID,
                         this.initiatorIP,
                         this.initiatorPortName,
                         this.targetPortName,
                         this.initiatorName,
                         this.nodeID,
                         this.serviceID,
                         this.sessionID,
                         this.targetName,
                         this.targetIP,
                         this.virtualNetworkID,
                         this.volumeID,
                         this.createTime,
                         this.volumeInstance,
                         this.initiatorSessionID);
        }

        private ISCSISession.Builder buildFrom(final ISCSISession req) {
            this.accountID = req.accountID;
            this.initiator = req.initiator;
            this.accountName = req.accountName;
            this.driveID = req.driveID;
            this.initiatorIP = req.initiatorIP;
            this.initiatorPortName = req.initiatorPortName;
            this.targetPortName = req.targetPortName;
            this.initiatorName = req.initiatorName;
            this.nodeID = req.nodeID;
            this.serviceID = req.serviceID;
            this.sessionID = req.sessionID;
            this.targetName = req.targetName;
            this.targetIP = req.targetIP;
            this.virtualNetworkID = req.virtualNetworkID;
            this.volumeID = req.volumeID;
            this.createTime = req.createTime;
            this.volumeInstance = req.volumeInstance;
            this.initiatorSessionID = req.initiatorSessionID;

            return this;
        }

        public ISCSISession.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public ISCSISession.Builder initiator(final Initiator initiator) {
            this.initiator = initiator;
            return this;
        }

        public ISCSISession.Builder accountName(final String accountName) {
            this.accountName = accountName;
            return this;
        }

        public ISCSISession.Builder driveID(final Long driveID) {
            this.driveID = driveID;
            return this;
        }

        public ISCSISession.Builder initiatorIP(final String initiatorIP) {
            this.initiatorIP = initiatorIP;
            return this;
        }

        public ISCSISession.Builder initiatorPortName(final String initiatorPortName) {
            this.initiatorPortName = initiatorPortName;
            return this;
        }

        public ISCSISession.Builder targetPortName(final String targetPortName) {
            this.targetPortName = targetPortName;
            return this;
        }

        public ISCSISession.Builder initiatorName(final String initiatorName) {
            this.initiatorName = initiatorName;
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

        public ISCSISession.Builder targetName(final String targetName) {
            this.targetName = targetName;
            return this;
        }

        public ISCSISession.Builder targetIP(final String targetIP) {
            this.targetIP = targetIP;
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

        public ISCSISession.Builder createTime(final String createTime) {
            this.createTime = createTime;
            return this;
        }

        public ISCSISession.Builder volumeInstance(final Long volumeInstance) {
            this.volumeInstance = volumeInstance;
            return this;
        }

        public ISCSISession.Builder initiatorSessionID(final Long initiatorSessionID) {
            this.initiatorSessionID = initiatorSessionID;
            return this;
        }

    }
}
