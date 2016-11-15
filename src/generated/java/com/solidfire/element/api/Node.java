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
 * ['A node refers to an individual machine in a cluster.', 'Each active node hosts a master service, which is responsible for managing the drives and other services on its node.', 'After a node is made active, its drives will become available for addition to the cluster.']['A node refers to an individual machine in a cluster.', 'Each active node hosts a master service, which is responsible for managing the drives and other services on its node.', 'After a node is made active, its drives will become available for addition to the cluster.']['A node refers to an individual machine in a cluster.', 'Each active node hosts a master service, which is responsible for managing the drives and other services on its node.', 'After a node is made active, its drives will become available for addition to the cluster.']
 **/

public class Node implements Serializable {

    public static final long serialVersionUID = -7985492147846592224L;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("associatedMasterServiceID") private Long associatedMasterServiceID;
    @SerializedName("associatedFServiceID") private Long associatedFServiceID;
    @SerializedName("fibreChannelTargetPortGroup") private String fibreChannelTargetPortGroup;
    @SerializedName("name") private String name;
    @SerializedName("platformInfo") private Platform platformInfo;
    @SerializedName("softwareVersion") private String softwareVersion;
    @SerializedName("cip") private String cip;
    @SerializedName("cipi") private String cipi;
    @SerializedName("mip") private String mip;
    @SerializedName("mipi") private String mipi;
    @SerializedName("sip") private String sip;
    @SerializedName("sipi") private String sipi;
    @SerializedName("uuid") private java.util.UUID uuid;
    @SerializedName("attributes") private java.util.Map<String, Object> attributes;

    // empty constructor
    @Since("7.0")
    public Node() {}

    // parameterized constructor
    @Since("7.0")
    public Node(
        Long nodeID,
        Long associatedMasterServiceID,
        Long associatedFServiceID,
        String fibreChannelTargetPortGroup,
        String name,
        Platform platformInfo,
        String softwareVersion,
        String cip,
        String cipi,
        String mip,
        String mipi,
        String sip,
        String sipi,
        java.util.UUID uuid,
        java.util.Map<String, Object> attributes
    )
    {
        this.nodeID = nodeID;
        this.associatedMasterServiceID = associatedMasterServiceID;
        this.associatedFServiceID = associatedFServiceID;
        this.fibreChannelTargetPortGroup = fibreChannelTargetPortGroup;
        this.name = name;
        this.platformInfo = platformInfo;
        this.softwareVersion = softwareVersion;
        this.cip = cip;
        this.cipi = cipi;
        this.mip = mip;
        this.mipi = mipi;
        this.sip = sip;
        this.sipi = sipi;
        this.uuid = uuid;
        this.attributes = attributes;
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
     **/
    public Long getAssociatedFServiceID() { return this.associatedFServiceID; }
    public void setAssociatedFServiceID(Long associatedFServiceID) { 
        this.associatedFServiceID = associatedFServiceID;
    }
    /** 
     **/
    public String getFibreChannelTargetPortGroup() { return this.fibreChannelTargetPortGroup; }
    public void setFibreChannelTargetPortGroup(String fibreChannelTargetPortGroup) { 
        this.fibreChannelTargetPortGroup = fibreChannelTargetPortGroup;
    }
    /** 
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * Information about the platform this node is.
     **/
    public Platform getPlatformInfo() { return this.platformInfo; }
    public void setPlatformInfo(Platform platformInfo) { 
        this.platformInfo = platformInfo;
    }
    /** 
     * The version of SolidFire software this node is currently running.
     **/
    public String getSoftwareVersion() { return this.softwareVersion; }
    public void setSoftwareVersion(String softwareVersion) { 
        this.softwareVersion = softwareVersion;
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
     * UUID of node.
     **/
    public java.util.UUID getUuid() { return this.uuid; }
    public void setUuid(java.util.UUID uuid) { 
        this.uuid = uuid;
    }
    /** 
     **/
    public java.util.Map<String, Object> getAttributes() { return this.attributes; }
    public void setAttributes(java.util.Map<String, Object> attributes) { 
        this.attributes = attributes;
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
            Objects.equals(softwareVersion, that.softwareVersion) &&
            Objects.equals(cip, that.cip) &&
            Objects.equals(cipi, that.cipi) &&
            Objects.equals(mip, that.mip) &&
            Objects.equals(mipi, that.mipi) &&
            Objects.equals(sip, that.sip) &&
            Objects.equals(sipi, that.sipi) &&
            Objects.equals(uuid, that.uuid) &&
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeID, associatedMasterServiceID, associatedFServiceID, fibreChannelTargetPortGroup, name, platformInfo, softwareVersion, cip, cipi, mip, mipi, sip, sipi, uuid, attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodeID", nodeID);
        map.put("associatedMasterServiceID", associatedMasterServiceID);
        map.put("associatedFServiceID", associatedFServiceID);
        map.put("fibreChannelTargetPortGroup", fibreChannelTargetPortGroup);
        map.put("name", name);
        map.put("platformInfo", platformInfo);
        map.put("softwareVersion", softwareVersion);
        map.put("cip", cip);
        map.put("cipi", cipi);
        map.put("mip", mip);
        map.put("mipi", mipi);
        map.put("sip", sip);
        map.put("sipi", sipi);
        map.put("uuid", uuid);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" associatedMasterServiceID : ").append(associatedMasterServiceID).append(",");
        sb.append(" associatedFServiceID : ").append(associatedFServiceID).append(",");
        sb.append(" fibreChannelTargetPortGroup : ").append(fibreChannelTargetPortGroup).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" platformInfo : ").append(platformInfo).append(",");
        sb.append(" softwareVersion : ").append(softwareVersion).append(",");
        sb.append(" cip : ").append(cip).append(",");
        sb.append(" cipi : ").append(cipi).append(",");
        sb.append(" mip : ").append(mip).append(",");
        sb.append(" mipi : ").append(mipi).append(",");
        sb.append(" sip : ").append(sip).append(",");
        sb.append(" sipi : ").append(sipi).append(",");
        sb.append(" uuid : ").append(uuid).append(",");
        sb.append(" attributes : ").append(attributes).append(",");
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
        private String fibreChannelTargetPortGroup;
        private String name;
        private Platform platformInfo;
        private String softwareVersion;
        private String cip;
        private String cipi;
        private String mip;
        private String mipi;
        private String sip;
        private String sipi;
        private java.util.UUID uuid;
        private java.util.Map<String, Object> attributes;

        private Builder() { }

        public Node build() {
            return new Node (
                         this.nodeID,
                         this.associatedMasterServiceID,
                         this.associatedFServiceID,
                         this.fibreChannelTargetPortGroup,
                         this.name,
                         this.platformInfo,
                         this.softwareVersion,
                         this.cip,
                         this.cipi,
                         this.mip,
                         this.mipi,
                         this.sip,
                         this.sipi,
                         this.uuid,
                         this.attributes);
        }

        private Node.Builder buildFrom(final Node req) {
            this.nodeID = req.nodeID;
            this.associatedMasterServiceID = req.associatedMasterServiceID;
            this.associatedFServiceID = req.associatedFServiceID;
            this.fibreChannelTargetPortGroup = req.fibreChannelTargetPortGroup;
            this.name = req.name;
            this.platformInfo = req.platformInfo;
            this.softwareVersion = req.softwareVersion;
            this.cip = req.cip;
            this.cipi = req.cipi;
            this.mip = req.mip;
            this.mipi = req.mipi;
            this.sip = req.sip;
            this.sipi = req.sipi;
            this.uuid = req.uuid;
            this.attributes = req.attributes;

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

        public Node.Builder fibreChannelTargetPortGroup(final String fibreChannelTargetPortGroup) {
            this.fibreChannelTargetPortGroup = fibreChannelTargetPortGroup;
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

        public Node.Builder attributes(final java.util.Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

    }
}
