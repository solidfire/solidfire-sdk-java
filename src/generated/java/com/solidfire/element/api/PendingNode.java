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
 * PendingNode  
 * A "pending node" is one that has not yet joined the cluster.
 * It can be added to a cluster using the AddNode method.
 **/

public class PendingNode implements Serializable {

    public static final long serialVersionUID = -5009010888297865928L;
    @SerializedName("pendingNodeID") private Long pendingNodeID;
    @SerializedName("AssignedNodeID") private Long assignedNodeID;
    @SerializedName("name") private String name;
    @SerializedName("compatible") private Boolean compatible;
    @SerializedName("platformInfo") private Platform platformInfo;
    @SerializedName("cip") private String cip;
    @SerializedName("cipi") private String cipi;
    @SerializedName("mip") private String mip;
    @SerializedName("mipi") private String mipi;
    @SerializedName("sip") private String sip;
    @SerializedName("sipi") private String sipi;
    @SerializedName("softwareVersion") private String softwareVersion;
    @SerializedName("uuid") private java.util.UUID uuid;

    // empty constructor
    @Since("7.0")
    public PendingNode() {}

    
    // parameterized constructor
    @Since("7.0")
    public PendingNode(
        Long pendingNodeID,
        Long assignedNodeID,
        String name,
        Boolean compatible,
        Platform platformInfo,
        String cip,
        String cipi,
        String mip,
        String mipi,
        String sip,
        String sipi,
        String softwareVersion,
        java.util.UUID uuid
    )
    {
        this.pendingNodeID = pendingNodeID;
        this.assignedNodeID = assignedNodeID;
        this.name = name;
        this.compatible = compatible;
        this.platformInfo = platformInfo;
        this.cip = cip;
        this.cipi = cipi;
        this.mip = mip;
        this.mipi = mipi;
        this.sip = sip;
        this.sipi = sipi;
        this.softwareVersion = softwareVersion;
        this.uuid = uuid;
    }

    /** 
     **/
    public Long getPendingNodeID() { return this.pendingNodeID; }
    public void setPendingNodeID(Long pendingNodeID) { 
        this.pendingNodeID = pendingNodeID;
    }
    /** 
     **/
    public Long getAssignedNodeID() { return this.assignedNodeID; }
    public void setAssignedNodeID(Long assignedNodeID) { 
        this.assignedNodeID = assignedNodeID;
    }
    /** 
     * The host name for this node.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     **/
    public Boolean getCompatible() { return this.compatible; }
    public void setCompatible(Boolean compatible) { 
        this.compatible = compatible;
    }
    /** 
     * Information about the platform this node is.
     **/
    public Platform getPlatformInfo() { return this.platformInfo; }
    public void setPlatformInfo(Platform platformInfo) { 
        this.platformInfo = platformInfo;
    }
    /** 
     * IP address used for both intra- and inter-cluster communication.
     **/
    public String getCip() { return this.cip; }
    public void setCip(String cip) { 
        this.cip = cip;
    }
    /** 
     * The machine's name for the "cip" interface.
     **/
    public String getCipi() { return this.cipi; }
    public void setCipi(String cipi) { 
        this.cipi = cipi;
    }
    /** 
     * IP address used for cluster management (hosting the API and web site).
     **/
    public String getMip() { return this.mip; }
    public void setMip(String mip) { 
        this.mip = mip;
    }
    /** 
     * The machine's name for the "mip" interface.
     **/
    public String getMipi() { return this.mipi; }
    public void setMipi(String mipi) { 
        this.mipi = mipi;
    }
    /** 
     * IP address used for iSCSI traffic.
     **/
    public String getSip() { return this.sip; }
    public void setSip(String sip) { 
        this.sip = sip;
    }
    /** 
     * The machine's name for the "sip" interface.
     **/
    public String getSipi() { return this.sipi; }
    public void setSipi(String sipi) { 
        this.sipi = sipi;
    }
    /** 
     * The version of SolidFire software this node is currently running.
     **/
    public String getSoftwareVersion() { return this.softwareVersion; }
    public void setSoftwareVersion(String softwareVersion) { 
        this.softwareVersion = softwareVersion;
    }
    /** 
     * UUID of node.
     **/
    public java.util.UUID getUuid() { return this.uuid; }
    public void setUuid(java.util.UUID uuid) { 
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PendingNode that = (PendingNode) o;

        return 
            Objects.equals(pendingNodeID, that.pendingNodeID) && 
            Objects.equals(assignedNodeID, that.assignedNodeID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(compatible, that.compatible) && 
            Objects.equals(platformInfo, that.platformInfo) && 
            Objects.equals(cip, that.cip) && 
            Objects.equals(cipi, that.cipi) && 
            Objects.equals(mip, that.mip) && 
            Objects.equals(mipi, that.mipi) && 
            Objects.equals(sip, that.sip) && 
            Objects.equals(sipi, that.sipi) && 
            Objects.equals(softwareVersion, that.softwareVersion) && 
            Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash( pendingNodeID,assignedNodeID,name,compatible,platformInfo,cip,cipi,mip,mipi,sip,sipi,softwareVersion,uuid );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("pendingNodeID", pendingNodeID);
        map.put("assignedNodeID", assignedNodeID);
        map.put("name", name);
        map.put("compatible", compatible);
        map.put("platformInfo", platformInfo);
        map.put("cip", cip);
        map.put("cipi", cipi);
        map.put("mip", mip);
        map.put("mipi", mipi);
        map.put("sip", sip);
        map.put("sipi", sipi);
        map.put("softwareVersion", softwareVersion);
        map.put("uuid", uuid);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" pendingNodeID : ").append(pendingNodeID).append(",");
        sb.append(" assignedNodeID : ").append(assignedNodeID).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" compatible : ").append(compatible).append(",");
        sb.append(" platformInfo : ").append(platformInfo).append(",");
        sb.append(" cip : ").append(cip).append(",");
        sb.append(" cipi : ").append(cipi).append(",");
        sb.append(" mip : ").append(mip).append(",");
        sb.append(" mipi : ").append(mipi).append(",");
        sb.append(" sip : ").append(sip).append(",");
        sb.append(" sipi : ").append(sipi).append(",");
        sb.append(" softwareVersion : ").append(softwareVersion).append(",");
        sb.append(" uuid : ").append(uuid).append(",");
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
        private Long pendingNodeID;
        private Long assignedNodeID;
        private String name;
        private Boolean compatible;
        private Platform platformInfo;
        private String cip;
        private String cipi;
        private String mip;
        private String mipi;
        private String sip;
        private String sipi;
        private String softwareVersion;
        private java.util.UUID uuid;

        private Builder() { }

        public PendingNode build() {
            return new PendingNode (
                         this.pendingNodeID,
                         this.assignedNodeID,
                         this.name,
                         this.compatible,
                         this.platformInfo,
                         this.cip,
                         this.cipi,
                         this.mip,
                         this.mipi,
                         this.sip,
                         this.sipi,
                         this.softwareVersion,
                         this.uuid);
        }

        private PendingNode.Builder buildFrom(final PendingNode req) {
            this.pendingNodeID = req.pendingNodeID;
            this.assignedNodeID = req.assignedNodeID;
            this.name = req.name;
            this.compatible = req.compatible;
            this.platformInfo = req.platformInfo;
            this.cip = req.cip;
            this.cipi = req.cipi;
            this.mip = req.mip;
            this.mipi = req.mipi;
            this.sip = req.sip;
            this.sipi = req.sipi;
            this.softwareVersion = req.softwareVersion;
            this.uuid = req.uuid;

            return this;
        }

        public PendingNode.Builder pendingNodeID(final Long pendingNodeID) {
            this.pendingNodeID = pendingNodeID;
            return this;
        }

        public PendingNode.Builder assignedNodeID(final Long assignedNodeID) {
            this.assignedNodeID = assignedNodeID;
            return this;
        }

        public PendingNode.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public PendingNode.Builder compatible(final Boolean compatible) {
            this.compatible = compatible;
            return this;
        }

        public PendingNode.Builder platformInfo(final Platform platformInfo) {
            this.platformInfo = platformInfo;
            return this;
        }

        public PendingNode.Builder cip(final String cip) {
            this.cip = cip;
            return this;
        }

        public PendingNode.Builder cipi(final String cipi) {
            this.cipi = cipi;
            return this;
        }

        public PendingNode.Builder mip(final String mip) {
            this.mip = mip;
            return this;
        }

        public PendingNode.Builder mipi(final String mipi) {
            this.mipi = mipi;
            return this;
        }

        public PendingNode.Builder sip(final String sip) {
            this.sip = sip;
            return this;
        }

        public PendingNode.Builder sipi(final String sipi) {
            this.sipi = sipi;
            return this;
        }

        public PendingNode.Builder softwareVersion(final String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }

        public PendingNode.Builder uuid(final java.util.UUID uuid) {
            this.uuid = uuid;
            return this;
        }

    }
}
