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
public class ClusterFaultInfo  implements Serializable  {

    private static final long serialVersionUID = 1498069682L;

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
    @SerializedName("data") private Object data;

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

    
    /**
     * 
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public ClusterFaultInfo() {}

    public String getSeverity() {
        return this.severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    public Long getNodeHardwareFaultID() {
        return this.nodeHardwareFaultID;
    }

    public void setNodeHardwareFaultID(Long nodeHardwareFaultID) {
        this.nodeHardwareFaultID = nodeHardwareFaultID;
    }


    public Long getNodeID() {
        return this.nodeID;
    }

    public void setNodeID(Long nodeID) {
        this.nodeID = nodeID;
    }


    public Long getServiceID() {
        return this.serviceID;
    }

    public void setServiceID(Long serviceID) {
        this.serviceID = serviceID;
    }


    public Long getDriveID() {
        return this.driveID;
    }

    public void setDriveID(Long driveID) {
        this.driveID = driveID;
    }


    public Boolean getResolved() {
        return this.resolved;
    }

    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }


    public Long getClusterFaultID() {
        return this.clusterFaultID;
    }

    public void setClusterFaultID(Long clusterFaultID) {
        this.clusterFaultID = clusterFaultID;
    }


    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getResolvedDate() {
        return this.resolvedDate;
    }

    public void setResolvedDate(String resolvedDate) {
        this.resolvedDate = resolvedDate;
    }


    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
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
        private Long nodeHardwareFaultID;
        private Long nodeID;
        private Long serviceID;
        private Long driveID;
        private Boolean resolved;
        private Long clusterFaultID;
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
                         this.data            );
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

        public ClusterFaultInfo.Builder data(final Object data) {
            this.data = data;
            return this;
        }

    }

}
