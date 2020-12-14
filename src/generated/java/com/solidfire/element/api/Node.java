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
 * Node  
 * A node refers to an individual machine in a cluster.
 * Each active node hosts a master service, which is responsible for managing any drives or other services for that node.
 * After a node becomes active, any drives associated with the node will become available for addition to the cluster.
 **/

public class Node implements Serializable {

    public static final long serialVersionUID = -8162532113261048982L;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("associatedMasterServiceID") private Long associatedMasterServiceID;
    @SerializedName("associatedFServiceID") private Long associatedFServiceID;
    @SerializedName("fibreChannelTargetPortGroup") private Optional<Long> fibreChannelTargetPortGroup;
    @SerializedName("name") private String name;
    @SerializedName("platformInfo") private Platform platformInfo;
    @SerializedName("role") private String role;
    @SerializedName("softwareVersion") private String softwareVersion;
    @SerializedName("cip") private String cip;
    @SerializedName("cipi") private String cipi;
    @SerializedName("mip") private String mip;
    @SerializedName("mipi") private String mipi;
    @SerializedName("sip") private String sip;
    @SerializedName("sipi") private String sipi;
    @SerializedName("uuid") private java.util.UUID uuid;
    @SerializedName("virtualNetworks") private VirtualNetworkAddress[] virtualNetworks;
    @SerializedName("attributes") private Attributes attributes;
    @SerializedName("nodeSlot") private Optional<String> nodeSlot;
    @SerializedName("chassisName") private String chassisName;
    @SerializedName("customProtectionDomainName") private String customProtectionDomainName;
    @SerializedName("maintenanceMode") private String maintenanceMode;
    // empty constructor
    @Since("7.0")
    public Node() {}

    
    // parameterized constructor
    @Since("7.0")
    public Node(
        Long nodeID,
        Long associatedMasterServiceID,
        Long associatedFServiceID,
        Optional<Long> fibreChannelTargetPortGroup,
        String name,
        Platform platformInfo,
        String role,
        String softwareVersion,
        String cip,
        String cipi,
        String mip,
        String mipi,
        String sip,
        String sipi,
        java.util.UUID uuid,
        VirtualNetworkAddress[] virtualNetworks,
        Attributes attributes,
        Optional<String> nodeSlot,
        String chassisName,
        String customProtectionDomainName,
        String maintenanceMode
    )
    {
        this.nodeID = nodeID;
        this.associatedMasterServiceID = associatedMasterServiceID;
        this.associatedFServiceID = associatedFServiceID;
        this.fibreChannelTargetPortGroup = (fibreChannelTargetPortGroup == null) ? Optional.<Long>empty() : fibreChannelTargetPortGroup;
        this.name = name;
        this.platformInfo = platformInfo;
        this.role = role;
        this.softwareVersion = softwareVersion;
        this.cip = cip;
        this.cipi = cipi;
        this.mip = mip;
        this.mipi = mipi;
        this.sip = sip;
        this.sipi = sipi;
        this.uuid = uuid;
        this.virtualNetworks = virtualNetworks;
        this.attributes = attributes;
        this.nodeSlot = (nodeSlot == null) ? Optional.<String>empty() : nodeSlot;
        this.chassisName = chassisName;
        this.customProtectionDomainName = customProtectionDomainName;
        this.maintenanceMode = maintenanceMode;
    }

    /** 
     * The unique identifier for this node.
     **/
    public Long getNodeID() { return this.nodeID; }
   
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     * The master service responsible for controlling other services on this node.
     **/
    public Long getAssociatedMasterServiceID() { return this.associatedMasterServiceID; }
   
    public void setAssociatedMasterServiceID(Long associatedMasterServiceID) { 
        this.associatedMasterServiceID = associatedMasterServiceID;
    }
    /** 
     * 
     **/
    public Long getAssociatedFServiceID() { return this.associatedFServiceID; }
   
    public void setAssociatedFServiceID(Long associatedFServiceID) { 
        this.associatedFServiceID = associatedFServiceID;
    }
    /** 
     * 
     **/
    public Optional<Long> getFibreChannelTargetPortGroup() { return this.fibreChannelTargetPortGroup; }
   
    public void setFibreChannelTargetPortGroup(Optional<Long> fibreChannelTargetPortGroup) { 
        this.fibreChannelTargetPortGroup = (fibreChannelTargetPortGroup == null) ? Optional.<Long>empty() : fibreChannelTargetPortGroup;
    }
    /** 
     * 
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
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
     * The version of SolidFire software currently running on this node.
     **/
    public String getSoftwareVersion() { return this.softwareVersion; }
   
    public void setSoftwareVersion(String softwareVersion) { 
        this.softwareVersion = softwareVersion;
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
     * UUID of node.
     **/
    public java.util.UUID getUuid() { return this.uuid; }
   
    public void setUuid(java.util.UUID uuid) { 
        this.uuid = uuid;
    }
    /** 
     * 
     **/
    public VirtualNetworkAddress[] getVirtualNetworks() { return this.virtualNetworks; }
   
    public void setVirtualNetworks(VirtualNetworkAddress[] virtualNetworks) { 
        this.virtualNetworks = virtualNetworks;
    }
    /** 
     * 
     **/
    public Attributes getAttributes() { return this.attributes; }
   
    public void setAttributes(Attributes attributes) { 
        this.attributes = attributes;
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
    /** 
     * Indicates which mode a node is in for maintenance.
     **/
    public String getMaintenanceMode() { return this.maintenanceMode; }
   
    public void setMaintenanceMode(String maintenanceMode) { 
        this.maintenanceMode = maintenanceMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node that = (Node) o;

        return 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(associatedMasterServiceID, that.associatedMasterServiceID) && 
            Objects.equals(associatedFServiceID, that.associatedFServiceID) && 
            Objects.equals(fibreChannelTargetPortGroup, that.fibreChannelTargetPortGroup) && 
            Objects.equals(name, that.name) && 
            Objects.equals(platformInfo, that.platformInfo) && 
            Objects.equals(role, that.role) && 
            Objects.equals(softwareVersion, that.softwareVersion) && 
            Objects.equals(cip, that.cip) && 
            Objects.equals(cipi, that.cipi) && 
            Objects.equals(mip, that.mip) && 
            Objects.equals(mipi, that.mipi) && 
            Objects.equals(sip, that.sip) && 
            Objects.equals(sipi, that.sipi) && 
            Objects.equals(uuid, that.uuid) && 
            Arrays.equals(virtualNetworks, that.virtualNetworks) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(nodeSlot, that.nodeSlot) && 
            Objects.equals(chassisName, that.chassisName) && 
            Objects.equals(customProtectionDomainName, that.customProtectionDomainName) && 
            Objects.equals(maintenanceMode, that.maintenanceMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeID,associatedMasterServiceID,associatedFServiceID,fibreChannelTargetPortGroup,name,platformInfo,role,softwareVersion,cip,cipi,mip,mipi,sip,sipi,uuid,(Object[])virtualNetworks,attributes,nodeSlot,chassisName,customProtectionDomainName,maintenanceMode );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodeID", nodeID);
        map.put("associatedMasterServiceID", associatedMasterServiceID);
        map.put("associatedFServiceID", associatedFServiceID);
        map.put("fibreChannelTargetPortGroup", fibreChannelTargetPortGroup);
        map.put("name", name);
        map.put("platformInfo", platformInfo);
        map.put("role", role);
        map.put("softwareVersion", softwareVersion);
        map.put("cip", cip);
        map.put("cipi", cipi);
        map.put("mip", mip);
        map.put("mipi", mipi);
        map.put("sip", sip);
        map.put("sipi", sipi);
        map.put("uuid", uuid);
        map.put("virtualNetworks", virtualNetworks);
        map.put("attributes", attributes);
        map.put("nodeSlot", nodeSlot);
        map.put("chassisName", chassisName);
        map.put("customProtectionDomainName", customProtectionDomainName);
        map.put("maintenanceMode", maintenanceMode);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" nodeID : ").append(gson.toJson(nodeID)).append(",");
        sb.append(" associatedMasterServiceID : ").append(gson.toJson(associatedMasterServiceID)).append(",");
        sb.append(" associatedFServiceID : ").append(gson.toJson(associatedFServiceID)).append(",");
        if(null != fibreChannelTargetPortGroup && fibreChannelTargetPortGroup.isPresent()){
            sb.append(" fibreChannelTargetPortGroup : ").append(gson.toJson(fibreChannelTargetPortGroup)).append(",");
        }
        else{
            sb.append(" fibreChannelTargetPortGroup : ").append("null").append(",");
        }
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" platformInfo : ").append(gson.toJson(platformInfo)).append(",");
        sb.append(" role : ").append(gson.toJson(role)).append(",");
        sb.append(" softwareVersion : ").append(gson.toJson(softwareVersion)).append(",");
        sb.append(" cip : ").append(gson.toJson(cip)).append(",");
        sb.append(" cipi : ").append(gson.toJson(cipi)).append(",");
        sb.append(" mip : ").append(gson.toJson(mip)).append(",");
        sb.append(" mipi : ").append(gson.toJson(mipi)).append(",");
        sb.append(" sip : ").append(gson.toJson(sip)).append(",");
        sb.append(" sipi : ").append(gson.toJson(sipi)).append(",");
        sb.append(" uuid : ").append(gson.toJson(uuid)).append(",");
        sb.append(" virtualNetworks : ").append(gson.toJson(Arrays.toString(virtualNetworks))).append(",");
        sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        if(null != nodeSlot && nodeSlot.isPresent()){
            sb.append(" nodeSlot : ").append(gson.toJson(nodeSlot)).append(",");
        }
        else{
            sb.append(" nodeSlot : ").append("null").append(",");
        }
        sb.append(" chassisName : ").append(gson.toJson(chassisName)).append(",");
        sb.append(" customProtectionDomainName : ").append(gson.toJson(customProtectionDomainName)).append(",");
        sb.append(" maintenanceMode : ").append(gson.toJson(maintenanceMode)).append(",");
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
        private Long nodeID;
        private Long associatedMasterServiceID;
        private Long associatedFServiceID;
        private Optional<Long> fibreChannelTargetPortGroup;
        private String name;
        private Platform platformInfo;
        private String role;
        private String softwareVersion;
        private String cip;
        private String cipi;
        private String mip;
        private String mipi;
        private String sip;
        private String sipi;
        private java.util.UUID uuid;
        private VirtualNetworkAddress[] virtualNetworks;
        private Attributes attributes;
        private Optional<String> nodeSlot;
        private String chassisName;
        private String customProtectionDomainName;
        private String maintenanceMode;

        private Builder() { }

        public Node build() {
            return new Node (
                         this.nodeID,
                         this.associatedMasterServiceID,
                         this.associatedFServiceID,
                         this.fibreChannelTargetPortGroup,
                         this.name,
                         this.platformInfo,
                         this.role,
                         this.softwareVersion,
                         this.cip,
                         this.cipi,
                         this.mip,
                         this.mipi,
                         this.sip,
                         this.sipi,
                         this.uuid,
                         this.virtualNetworks,
                         this.attributes,
                         this.nodeSlot,
                         this.chassisName,
                         this.customProtectionDomainName,
                         this.maintenanceMode);
        }

        private Node.Builder buildFrom(final Node req) {
            this.nodeID = req.nodeID;
            this.associatedMasterServiceID = req.associatedMasterServiceID;
            this.associatedFServiceID = req.associatedFServiceID;
            this.fibreChannelTargetPortGroup = req.fibreChannelTargetPortGroup;
            this.name = req.name;
            this.platformInfo = req.platformInfo;
            this.role = req.role;
            this.softwareVersion = req.softwareVersion;
            this.cip = req.cip;
            this.cipi = req.cipi;
            this.mip = req.mip;
            this.mipi = req.mipi;
            this.sip = req.sip;
            this.sipi = req.sipi;
            this.uuid = req.uuid;
            this.virtualNetworks = req.virtualNetworks;
            this.attributes = req.attributes;
            this.nodeSlot = req.nodeSlot;
            this.chassisName = req.chassisName;
            this.customProtectionDomainName = req.customProtectionDomainName;
            this.maintenanceMode = req.maintenanceMode;

            return this;
        }

        public Node.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public Node.Builder associatedMasterServiceID(final Long associatedMasterServiceID) {
            this.associatedMasterServiceID = associatedMasterServiceID;
            return this;
        }

        public Node.Builder associatedFServiceID(final Long associatedFServiceID) {
            this.associatedFServiceID = associatedFServiceID;
            return this;
        }

        public Node.Builder optionalFibreChannelTargetPortGroup(final Long fibreChannelTargetPortGroup) {
            this.fibreChannelTargetPortGroup = (fibreChannelTargetPortGroup == null) ? Optional.<Long>empty() : Optional.of(fibreChannelTargetPortGroup);
            return this;
        }

        public Node.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Node.Builder platformInfo(final Platform platformInfo) {
            this.platformInfo = platformInfo;
            return this;
        }

        public Node.Builder role(final String role) {
            this.role = role;
            return this;
        }

        public Node.Builder softwareVersion(final String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }

        public Node.Builder cip(final String cip) {
            this.cip = cip;
            return this;
        }

        public Node.Builder cipi(final String cipi) {
            this.cipi = cipi;
            return this;
        }

        public Node.Builder mip(final String mip) {
            this.mip = mip;
            return this;
        }

        public Node.Builder mipi(final String mipi) {
            this.mipi = mipi;
            return this;
        }

        public Node.Builder sip(final String sip) {
            this.sip = sip;
            return this;
        }

        public Node.Builder sipi(final String sipi) {
            this.sipi = sipi;
            return this;
        }

        public Node.Builder uuid(final java.util.UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public Node.Builder virtualNetworks(final VirtualNetworkAddress[] virtualNetworks) {
            this.virtualNetworks = virtualNetworks;
            return this;
        }

        public Node.Builder attributes(final Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Node.Builder optionalNodeSlot(final String nodeSlot) {
            this.nodeSlot = (nodeSlot == null) ? Optional.<String>empty() : Optional.of(nodeSlot);
            return this;
        }

        public Node.Builder chassisName(final String chassisName) {
            this.chassisName = chassisName;
            return this;
        }

        public Node.Builder customProtectionDomainName(final String customProtectionDomainName) {
            this.customProtectionDomainName = customProtectionDomainName;
            return this;
        }

        public Node.Builder maintenanceMode(final String maintenanceMode) {
            this.maintenanceMode = maintenanceMode;
            return this;
        }

    }
}
