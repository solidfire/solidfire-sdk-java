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
public class ClusterFaultInfo implements Serializable {

    private static final long serialVersionUID = -807751610L;

    private final String severity;
    private final String type;
    private final String code;
    private final String details;
    private final Long nodeHardwareFaultID;
    private final Long nodeID;
    private final Long serviceID;
    private final Long driveID;
    private final Boolean resolved;
    private final Long clusterFaultID;
    private final String date;
    private final String resolvedDate;
    private final Object data;

    /**
     * 
     * @param severity [required] 
     * @param type [required] 
     * @param code [required] 
     * @param details [required] 
     * @param nodeHardwareFaultID [required] 
     * @param nodeID [required] 
     * @param serviceID [required] 
     * @param driveID [required] 
     * @param resolved [required] 
     * @param clusterFaultID [required] 
     * @param date [required] 
     * @param resolvedDate [required] 
     * @param data [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public ClusterFaultInfo(String severity, String type, String code, String details, Long nodeHardwareFaultID, Long nodeID, Long serviceID, Long driveID, Boolean resolved, Long clusterFaultID, String date, String resolvedDate, Object data) {
        this.clusterFaultID = clusterFaultID;
        this.nodeHardwareFaultID = nodeHardwareFaultID;
        this.data = data;
        this.code = code;
        this.resolvedDate = resolvedDate;
        this.date = date;
        this.resolved = resolved;
        this.details = details;
        this.severity = severity;
        this.driveID = driveID;
        this.type = type;
        this.nodeID = nodeID;
        this.serviceID = serviceID;
    }

    public String getSeverity() {
        return this.severity;
    }
    public String getType() {
        return this.type;
    }
    public String getCode() {
        return this.code;
    }
    public String getDetails() {
        return this.details;
    }
    public Long getNodeHardwareFaultID() {
        return this.nodeHardwareFaultID;
    }
    public Long getNodeID() {
        return this.nodeID;
    }
    public Long getServiceID() {
        return this.serviceID;
    }
    public Long getDriveID() {
        return this.driveID;
    }
    public Boolean getResolved() {
        return this.resolved;
    }
    public Long getClusterFaultID() {
        return this.clusterFaultID;
    }
    public String getDate() {
        return this.date;
    }
    public String getResolvedDate() {
        return this.resolvedDate;
    }
    public Object getData() {
        return this.data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterFaultInfo that = (ClusterFaultInfo) o;
        

        return Objects.equals( severity , that.severity )
            && Objects.equals( type , that.type )
            && Objects.equals( code , that.code )
            && Objects.equals( details , that.details )
            && Objects.equals( nodeHardwareFaultID , that.nodeHardwareFaultID )
            && Objects.equals( nodeID , that.nodeID )
            && Objects.equals( serviceID , that.serviceID )
            && Objects.equals( driveID , that.driveID )
            && Objects.equals( resolved , that.resolved )
            && Objects.equals( clusterFaultID , that.clusterFaultID )
            && Objects.equals( date , that.date )
            && Objects.equals( resolvedDate , that.resolvedDate )
            && Objects.equals( data , that.data );
    }

    @Override
    public int hashCode() {

        return Objects.hash( severity, type, code, details, nodeHardwareFaultID, nodeID, serviceID, driveID, resolved, clusterFaultID, date, resolvedDate, data );
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
        sb.append(" data : ").append(data);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
