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
 * A &quot;pending node&quot; is one that has not yet joined the cluster.
 **/
public class PendingNode implements Serializable {

    private static final long serialVersionUID = -829314366L;

    private final Long pendingNodeID;
    private final Long assignedNodeID;
    private final String name;
    private final Boolean compatible;
    private final Platform platformInfo;
    private final String cip;
    private final String cipi;
    private final String mip;
    private final String mipi;
    private final String sip;
    private final String sipi;
    private final String softwareVersion;
    private final String uuid;

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
}
