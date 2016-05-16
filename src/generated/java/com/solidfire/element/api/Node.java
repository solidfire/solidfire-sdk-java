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
 * A node refers to an individual machine in a cluster.
 **/
public class Node implements Serializable {

    private static final long serialVersionUID = 1456687201L;

    private final Long nodeID;
    private final Long associatedMasterServiceID;
    private final Long associatedFServiceID;
    private final String fibreChannelTargetPortGroup;
    private final String name;
    private final Platform platformInfo;
    private final String softwareVersion;
    private final String cip;
    private final String cipi;
    private final String mip;
    private final String mipi;
    private final String sip;
    private final String sipi;
    private final String uuid;
    private final java.util.Map<String, Object> attributes;

    /**
     * A node refers to an individual machine in a cluster.
     * Each active node hosts a master service, which is responsible for managing the drives and other services on its node.
     * After a node is made active, its drives will become available for addition to the cluster.
     * @param nodeID [required] The unique identifier for this node.
     * @param associatedMasterServiceID [required] The master service responsible for controlling other services on this node.
     * @param associatedFServiceID [required] 
     * @param fibreChannelTargetPortGroup [required] 
     * @param name [required] 
     * @param platformInfo [required] Information about the platform this node is.
     * @param softwareVersion [required] The version of SolidFire software this node is currently running.
     * @param cip [required] IP address used for both intra- and inter-cluster communication.
     * @param cipi [required] The machine&#39;s name for the &quot;cip&quot; interface.
     * @param mip [required] IP address used for cluster management (hosting the API and web site).
     * @param mipi [required] The machine&#39;s name for the &quot;mip&quot; interface.
     * @param sip [required] IP address used for iSCSI traffic.
     * @param sipi [required] The machine&#39;s name for the &quot;sip&quot; interface.
     * @param uuid [required] UUID of node.
     * @param attributes [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public Node(Long nodeID, Long associatedMasterServiceID, Long associatedFServiceID, String fibreChannelTargetPortGroup, String name, Platform platformInfo, String softwareVersion, String cip, String cipi, String mip, String mipi, String sip, String sipi, String uuid, java.util.Map<String, Object> attributes) {
        this.name = name;
        this.sip = sip;
        this.cipi = cipi;
        this.softwareVersion = softwareVersion;
        this.uuid = uuid;
        this.associatedFServiceID = associatedFServiceID;
        this.attributes = attributes;
        this.associatedMasterServiceID = associatedMasterServiceID;
        this.fibreChannelTargetPortGroup = fibreChannelTargetPortGroup;
        this.cip = cip;
        this.platformInfo = platformInfo;
        this.mip = mip;
        this.sipi = sipi;
        this.nodeID = nodeID;
        this.mipi = mipi;
    }


    /**
     * The unique identifier for this node.
     **/
    public Long getNodeID() {
        return this.nodeID;
    }

    /**
     * The master service responsible for controlling other services on this node.
     **/
    public Long getAssociatedMasterServiceID() {
        return this.associatedMasterServiceID;
    }
    public Long getAssociatedFServiceID() {
        return this.associatedFServiceID;
    }
    public String getFibreChannelTargetPortGroup() {
        return this.fibreChannelTargetPortGroup;
    }
    public String getName() {
        return this.name;
    }

    /**
     * Information about the platform this node is.
     **/
    public Platform getPlatformInfo() {
        return this.platformInfo;
    }

    /**
     * The version of SolidFire software this node is currently running.
     **/
    public String getSoftwareVersion() {
        return this.softwareVersion;
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
     * UUID of node.
     **/
    public String getUuid() {
        return this.uuid;
    }
    public java.util.Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node that = (Node) o;
        

        return Objects.equals( nodeID , that.nodeID )
            && Objects.equals( associatedMasterServiceID , that.associatedMasterServiceID )
            && Objects.equals( associatedFServiceID , that.associatedFServiceID )
            && Objects.equals( fibreChannelTargetPortGroup , that.fibreChannelTargetPortGroup )
            && Objects.equals( name , that.name )
            && Objects.equals( platformInfo , that.platformInfo )
            && Objects.equals( softwareVersion , that.softwareVersion )
            && Objects.equals( cip , that.cip )
            && Objects.equals( cipi , that.cipi )
            && Objects.equals( mip , that.mip )
            && Objects.equals( mipi , that.mipi )
            && Objects.equals( sip , that.sip )
            && Objects.equals( sipi , that.sipi )
            && Objects.equals( uuid , that.uuid )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {

        return Objects.hash( nodeID, associatedMasterServiceID, associatedFServiceID, fibreChannelTargetPortGroup, name, platformInfo, softwareVersion, cip, cipi, mip, mipi, sip, sipi, uuid, attributes );
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
        sb.append(" attributes : ").append(attributes);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
