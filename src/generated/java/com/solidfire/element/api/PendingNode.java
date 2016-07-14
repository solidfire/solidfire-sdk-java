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
 * A &quot;pending node&quot; is one that has not yet joined the cluster.
 **/
public class PendingNode implements Serializable {

    private static final long serialVersionUID = -829314366L;

    @SerializedName("pendingNodeID") private final Long pendingNodeID;
    @SerializedName("AssignedNodeID") private final Long assignedNodeID;
    @SerializedName("name") private final String name;
    @SerializedName("compatible") private final Boolean compatible;
    @SerializedName("platformInfo") private final Platform platformInfo;
    @SerializedName("cip") private final String cip;
    @SerializedName("cipi") private final String cipi;
    @SerializedName("mip") private final String mip;
    @SerializedName("mipi") private final String mipi;
    @SerializedName("sip") private final String sip;
    @SerializedName("sipi") private final String sipi;
    @SerializedName("softwareVersion") private final String softwareVersion;
    @SerializedName("uuid") private final String uuid;

    /**
     * A &quot;pending node&quot; is one that has not yet joined the cluster.
     * It can be added to a cluster using the AddNode method.
     * @param pendingNodeID [required] 
     * @param assignedNodeID [required] 
     * @param name [required] The host name for this node.
     * @param compatible [required] 
     * @param platformInfo [required] Information about the platform this node is.
     * @param cip [required] IP address used for both intra- and inter-cluster communication.
     * @param cipi [required] The machine&#39;s name for the &quot;cip&quot; interface.
     * @param mip [required] IP address used for cluster management (hosting the API and web site).
     * @param mipi [required] The machine&#39;s name for the &quot;mip&quot; interface.
     * @param sip [required] IP address used for iSCSI traffic.
     * @param sipi [required] The machine&#39;s name for the &quot;sip&quot; interface.
     * @param softwareVersion [required] The version of SolidFire software this node is currently running.
     * @param uuid [required] UUID of node.
     * @since 7.0
     **/
    @Since("7.0")
    public PendingNode(Long pendingNodeID, Long assignedNodeID, String name, Boolean compatible, Platform platformInfo, String cip, String cipi, String mip, String mipi, String sip, String sipi, String softwareVersion, String uuid) {
        this.name = name;
        this.sip = sip;
        this.cipi = cipi;
        this.softwareVersion = softwareVersion;
        this.uuid = uuid;
        this.pendingNodeID = pendingNodeID;
        this.compatible = compatible;
        this.cip = cip;
        this.platformInfo = platformInfo;
        this.mip = mip;
        this.sipi = sipi;
        this.assignedNodeID = assignedNodeID;
        this.mipi = mipi;
    }

    public Long getPendingNodeID() {
        return this.pendingNodeID;
    }
    public Long getAssignedNodeID() {
        return this.assignedNodeID;
    }

    /**
     * The host name for this node.
     **/
    public String getName() {
        return this.name;
    }
    public Boolean getCompatible() {
        return this.compatible;
    }

    /**
     * Information about the platform this node is.
     **/
    public Platform getPlatformInfo() {
        return this.platformInfo;
    }

    /**
     * IP address used for both intra- and inter-cluster communication.
     **/
    public String getCip() {
        return this.cip;
    }

    /**
     * The machine&#39;s name for the &quot;cip&quot; interface.
     **/
    public String getCipi() {
        return this.cipi;
    }

    /**
     * IP address used for cluster management (hosting the API and web site).
     **/
    public String getMip() {
        return this.mip;
    }

    /**
     * The machine&#39;s name for the &quot;mip&quot; interface.
     **/
    public String getMipi() {
        return this.mipi;
    }

    /**
     * IP address used for iSCSI traffic.
     **/
    public String getSip() {
        return this.sip;
    }

    /**
     * The machine&#39;s name for the &quot;sip&quot; interface.
     **/
    public String getSipi() {
        return this.sipi;
    }

    /**
     * The version of SolidFire software this node is currently running.
     **/
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    /**
     * UUID of node.
     **/
    public String getUuid() {
        return this.uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PendingNode that = (PendingNode) o;
        

        return Objects.equals( pendingNodeID , that.pendingNodeID )
            && Objects.equals( assignedNodeID , that.assignedNodeID )
            && Objects.equals( name , that.name )
            && Objects.equals( compatible , that.compatible )
            && Objects.equals( platformInfo , that.platformInfo )
            && Objects.equals( cip , that.cip )
            && Objects.equals( cipi , that.cipi )
            && Objects.equals( mip , that.mip )
            && Objects.equals( mipi , that.mipi )
            && Objects.equals( sip , that.sip )
            && Objects.equals( sipi , that.sipi )
            && Objects.equals( softwareVersion , that.softwareVersion )
            && Objects.equals( uuid , that.uuid );
    }

    @Override
    public int hashCode() {
        return Objects.hash( pendingNodeID, assignedNodeID, name, compatible, platformInfo, cip, cipi, mip, mipi, sip, sipi, softwareVersion, uuid );
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
        sb.append(" uuid : ").append(uuid);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
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
        private String uuid;

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
                         this.uuid            );
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

        public PendingNode.Builder AssignedNodeID(final Long assignedNodeID) {
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

        public PendingNode.Builder uuid(final String uuid) {
            this.uuid = uuid;
            return this;
        }

    }

}
