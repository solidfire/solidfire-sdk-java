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
 * PendingNode  
 * A "pending node" is a node that has not yet joined the cluster.
 * Pending nodes can be added to a cluster using the AddNode method.
 **/

public class PendingNode implements Serializable {

    public static final long serialVersionUID = 6516433508282856115L;
    @SerializedName("pendingNodeID") private Long pendingNodeID;
    @SerializedName("assignedNodeID") private Long assignedNodeID;
    @SerializedName("name") private String name;
    @SerializedName("compatible") private Boolean compatible;
    @SerializedName("platformInfo") private Platform platformInfo;
    @SerializedName("role") private String role;
    @SerializedName("cip") private String cip;
    @SerializedName("cipi") private String cipi;
    @SerializedName("mip") private String mip;
    @SerializedName("mipi") private String mipi;
    @SerializedName("sip") private String sip;
    @SerializedName("sipi") private String sipi;
    @SerializedName("softwareVersion") private String softwareVersion;
    @SerializedName("uuid") private java.util.UUID uuid;
    @SerializedName("nodeSlot") private Optional<String> nodeSlot;
    @SerializedName("chassisName") private String chassisName;
    @SerializedName("customProtectionDomainName") private String customProtectionDomainName;
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
        String role,
        String cip,
        String cipi,
        String mip,
        String mipi,
        String sip,
        String sipi,
        String softwareVersion,
        java.util.UUID uuid,
        Optional<String> nodeSlot,
        String chassisName,
        String customProtectionDomainName
    )
    {
        this.pendingNodeID = pendingNodeID;
        this.assignedNodeID = assignedNodeID;
        this.name = name;
        this.compatible = compatible;
        this.platformInfo = platformInfo;
        this.role = role;
        this.cip = cip;
        this.cipi = cipi;
        this.mip = mip;
        this.mipi = mipi;
        this.sip = sip;
        this.sipi = sipi;
        this.softwareVersion = softwareVersion;
        this.uuid = uuid;
        this.nodeSlot = (nodeSlot == null) ? Optional.<String>empty() : nodeSlot;
        this.chassisName = chassisName;
        this.customProtectionDomainName = customProtectionDomainName;
    }

    /** 
     * 
     **/
    public Long getPendingNodeID() { return this.pendingNodeID; }
   
    public void setPendingNodeID(Long pendingNodeID) { 
        this.pendingNodeID = pendingNodeID;
    }
    /** 
     * 
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
     * Indicates whether the pending node's software version is compatible with the cluster.
     **/
    public Boolean getCompatible() { return this.compatible; }
   
    public void setCompatible(Boolean compatible) { 
        this.compatible = compatible;
    }
    /** 
     * Information about the node's hardware.
     **/
    public Platform getPlatformInfo() { return this.platformInfo; }
   
    public void setPlatformInfo(Platform platformInfo) { 
        this.platformInfo = platformInfo;
    }
    /** 
     * The node's role in the cluster. Possible values are Management, Storage, Compute, and Witness.
     **/
    public String getRole() { return this.role; }
   
    public void setRole(String role) { 
        this.role = role;
    }
    /** 
     * IP address used for both intra-cluster and inter-cluster communication.
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
     * IP address used for the per-node API and UI.
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
     * The version of SolidFire software currently running on this node.
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
    /** 
     * 
     **/
    public Optional<String> getNodeSlot() { return this.nodeSlot; }
   
    public void setNodeSlot(Optional<String> nodeSlot) { 
        this.nodeSlot = (nodeSlot == null) ? Optional.<String>empty() : nodeSlot;
    }
    /** 
     * Uniquely identifies a chassis, and identical for all nodes in a given chassis.
     **/
    public String getChassisName() { return this.chassisName; }
   
    public void setChassisName(String chassisName) { 
        this.chassisName = chassisName;
    }
    /** 
     * Uniquely identifies a custom protection domain, identical for all nodes within all chassis in a given custom protection domain.
     **/
    public String getCustomProtectionDomainName() { return this.customProtectionDomainName; }
   
    public void setCustomProtectionDomainName(String customProtectionDomainName) { 
        this.customProtectionDomainName = customProtectionDomainName;
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
            Objects.equals(role, that.role) && 
            Objects.equals(cip, that.cip) && 
            Objects.equals(cipi, that.cipi) && 
            Objects.equals(mip, that.mip) && 
            Objects.equals(mipi, that.mipi) && 
            Objects.equals(sip, that.sip) && 
            Objects.equals(sipi, that.sipi) && 
            Objects.equals(softwareVersion, that.softwareVersion) && 
            Objects.equals(uuid, that.uuid) && 
            Objects.equals(nodeSlot, that.nodeSlot) && 
            Objects.equals(chassisName, that.chassisName) && 
            Objects.equals(customProtectionDomainName, that.customProtectionDomainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash( pendingNodeID,assignedNodeID,name,compatible,platformInfo,role,cip,cipi,mip,mipi,sip,sipi,softwareVersion,uuid,nodeSlot,chassisName,customProtectionDomainName );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("pendingNodeID", pendingNodeID);
        map.put("assignedNodeID", assignedNodeID);
        map.put("name", name);
        map.put("compatible", compatible);
        map.put("platformInfo", platformInfo);
        map.put("role", role);
        map.put("cip", cip);
        map.put("cipi", cipi);
        map.put("mip", mip);
        map.put("mipi", mipi);
        map.put("sip", sip);
        map.put("sipi", sipi);
        map.put("softwareVersion", softwareVersion);
        map.put("uuid", uuid);
        map.put("nodeSlot", nodeSlot);
        map.put("chassisName", chassisName);
        map.put("customProtectionDomainName", customProtectionDomainName);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" pendingNodeID : ").append(gson.toJson(pendingNodeID)).append(",");
        sb.append(" assignedNodeID : ").append(gson.toJson(assignedNodeID)).append(",");
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" compatible : ").append(gson.toJson(compatible)).append(",");
        sb.append(" platformInfo : ").append(gson.toJson(platformInfo)).append(",");
        sb.append(" role : ").append(gson.toJson(role)).append(",");
        sb.append(" cip : ").append(gson.toJson(cip)).append(",");
        sb.append(" cipi : ").append(gson.toJson(cipi)).append(",");
        sb.append(" mip : ").append(gson.toJson(mip)).append(",");
        sb.append(" mipi : ").append(gson.toJson(mipi)).append(",");
        sb.append(" sip : ").append(gson.toJson(sip)).append(",");
        sb.append(" sipi : ").append(gson.toJson(sipi)).append(",");
        sb.append(" softwareVersion : ").append(gson.toJson(softwareVersion)).append(",");
        sb.append(" uuid : ").append(gson.toJson(uuid)).append(",");
        if(null != nodeSlot && nodeSlot.isPresent()){
            sb.append(" nodeSlot : ").append(gson.toJson(nodeSlot)).append(",");
        }
        else{
            sb.append(" nodeSlot : ").append("null").append(",");
        }
        sb.append(" chassisName : ").append(gson.toJson(chassisName)).append(",");
        sb.append(" customProtectionDomainName : ").append(gson.toJson(customProtectionDomainName)).append(",");
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
        private String role;
        private String cip;
        private String cipi;
        private String mip;
        private String mipi;
        private String sip;
        private String sipi;
        private String softwareVersion;
        private java.util.UUID uuid;
        private Optional<String> nodeSlot;
        private String chassisName;
        private String customProtectionDomainName;

        private Builder() { }

        public PendingNode build() {
            return new PendingNode (
                         this.pendingNodeID,
                         this.assignedNodeID,
                         this.name,
                         this.compatible,
                         this.platformInfo,
                         this.role,
                         this.cip,
                         this.cipi,
                         this.mip,
                         this.mipi,
                         this.sip,
                         this.sipi,
                         this.softwareVersion,
                         this.uuid,
                         this.nodeSlot,
                         this.chassisName,
                         this.customProtectionDomainName);
        }

        private PendingNode.Builder buildFrom(final PendingNode req) {
            this.pendingNodeID = req.pendingNodeID;
            this.assignedNodeID = req.assignedNodeID;
            this.name = req.name;
            this.compatible = req.compatible;
            this.platformInfo = req.platformInfo;
            this.role = req.role;
            this.cip = req.cip;
            this.cipi = req.cipi;
            this.mip = req.mip;
            this.mipi = req.mipi;
            this.sip = req.sip;
            this.sipi = req.sipi;
            this.softwareVersion = req.softwareVersion;
            this.uuid = req.uuid;
            this.nodeSlot = req.nodeSlot;
            this.chassisName = req.chassisName;
            this.customProtectionDomainName = req.customProtectionDomainName;

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

        public PendingNode.Builder role(final String role) {
            this.role = role;
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

        public PendingNode.Builder optionalNodeSlot(final String nodeSlot) {
            this.nodeSlot = (nodeSlot == null) ? Optional.<String>empty() : Optional.of(nodeSlot);
            return this;
        }

        public PendingNode.Builder chassisName(final String chassisName) {
            this.chassisName = chassisName;
            return this;
        }

        public PendingNode.Builder customProtectionDomainName(final String customProtectionDomainName) {
            this.customProtectionDomainName = customProtectionDomainName;
            return this;
        }

    }
}
