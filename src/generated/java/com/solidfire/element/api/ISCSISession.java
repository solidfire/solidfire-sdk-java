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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * 
 **/
public class ISCSISession implements Serializable {

    private static final long serialVersionUID = 113665601L;

    @SerializedName("accountID") private final Long accountID;
    @SerializedName("accountName") private final String accountName;
    @SerializedName("driveID") private final Long driveID;
    @SerializedName("initiatorIP") private final String initiatorIP;
    @SerializedName("initiatorName") private final String initiatorName;
    @SerializedName("nodeID") private final Long nodeID;
    @SerializedName("serviceID") private final Long serviceID;
    @SerializedName("sessionID") private final Long sessionID;
    @SerializedName("targetName") private final String targetName;
    @SerializedName("targetIP") private final String targetIP;
    @SerializedName("virtualNetworkID") private final String virtualNetworkID;
    @SerializedName("volumeID") private final Long volumeID;

    /**
     * 
     * @param accountID [required] 
     * @param accountName [required] 
     * @param driveID [required] 
     * @param initiatorIP [required] 
     * @param initiatorName [required] 
     * @param nodeID [required] 
     * @param serviceID [required] 
     * @param sessionID [required] 
     * @param targetName [required] 
     * @param targetIP [required] 
     * @param virtualNetworkID [required] 
     * @param volumeID [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public ISCSISession(Long accountID, String accountName, Long driveID, String initiatorIP, String initiatorName, Long nodeID, Long serviceID, Long sessionID, String targetName, String targetIP, String virtualNetworkID, Long volumeID) {
        this.accountName = accountName;
        this.initiatorIP = initiatorIP;
        this.virtualNetworkID = virtualNetworkID;
        this.targetIP = targetIP;
        this.accountID = accountID;
        this.sessionID = sessionID;
        this.targetName = targetName;
        this.volumeID = volumeID;
        this.driveID = driveID;
        this.nodeID = nodeID;
        this.initiatorName = initiatorName;
        this.serviceID = serviceID;
    }

    public Long getAccountID() {
        return this.accountID;
    }
    public String getAccountName() {
        return this.accountName;
    }
    public Long getDriveID() {
        return this.driveID;
    }
    public String getInitiatorIP() {
        return this.initiatorIP;
    }
    public String getInitiatorName() {
        return this.initiatorName;
    }
    public Long getNodeID() {
        return this.nodeID;
    }
    public Long getServiceID() {
        return this.serviceID;
    }
    public Long getSessionID() {
        return this.sessionID;
    }
    public String getTargetName() {
        return this.targetName;
    }
    public String getTargetIP() {
        return this.targetIP;
    }
    public String getVirtualNetworkID() {
        return this.virtualNetworkID;
    }
    public Long getVolumeID() {
        return this.volumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ISCSISession that = (ISCSISession) o;
        

        return Objects.equals( accountID , that.accountID )
            && Objects.equals( accountName , that.accountName )
            && Objects.equals( driveID , that.driveID )
            && Objects.equals( initiatorIP , that.initiatorIP )
            && Objects.equals( initiatorName , that.initiatorName )
            && Objects.equals( nodeID , that.nodeID )
            && Objects.equals( serviceID , that.serviceID )
            && Objects.equals( sessionID , that.sessionID )
            && Objects.equals( targetName , that.targetName )
            && Objects.equals( targetIP , that.targetIP )
            && Objects.equals( virtualNetworkID , that.virtualNetworkID )
            && Objects.equals( volumeID , that.volumeID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID, accountName, driveID, initiatorIP, initiatorName, nodeID, serviceID, sessionID, targetName, targetIP, virtualNetworkID, volumeID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" accountID : ").append(accountID).append(",");
        sb.append(" accountName : ").append(accountName).append(",");
        sb.append(" driveID : ").append(driveID).append(",");
        sb.append(" initiatorIP : ").append(initiatorIP).append(",");
        sb.append(" initiatorName : ").append(initiatorName).append(",");
        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" serviceID : ").append(serviceID).append(",");
        sb.append(" sessionID : ").append(sessionID).append(",");
        sb.append(" targetName : ").append(targetName).append(",");
        sb.append(" targetIP : ").append(targetIP).append(",");
        sb.append(" virtualNetworkID : ").append(virtualNetworkID).append(",");
        sb.append(" volumeID : ").append(volumeID);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
