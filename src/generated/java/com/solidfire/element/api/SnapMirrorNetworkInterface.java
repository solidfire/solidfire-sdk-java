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
 * SnapMirrorNetworkInterface  
 * The snapMirrorNetworkInterface object contains information about the intercluster Logical Interface (LIF) names.
 **/

public class SnapMirrorNetworkInterface implements Serializable {

    public static final long serialVersionUID = -5259117748133664095L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("interfaceName") private String interfaceName;
    @SerializedName("networkAddress") private String networkAddress;
    @SerializedName("networkMask") private String networkMask;
    @SerializedName("interfaceRole") private String interfaceRole;
    @SerializedName("operationalStatus") private String operationalStatus;
    @SerializedName("administrativeStatus") private String administrativeStatus;
    @SerializedName("vserverName") private String vserverName;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorNetworkInterface(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorNetworkInterface(
        Long snapMirrorEndpointID,
        String interfaceName,
        String networkAddress,
        String networkMask,
        String interfaceRole,
        String operationalStatus,
        String administrativeStatus,
        String vserverName
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.interfaceName = interfaceName;
        this.networkAddress = networkAddress;
        this.networkMask = networkMask;
        this.interfaceRole = interfaceRole;
        this.operationalStatus = operationalStatus;
        this.administrativeStatus = administrativeStatus;
        this.vserverName = vserverName;
    }

    /** 
     * The ID of the destination ONTAP system.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The logical interface (LIF) name.
     **/
    public String getInterfaceName() { return this.interfaceName; }
   
    public void setInterfaceName(String interfaceName) { 
        this.interfaceName = interfaceName;
    }
    /** 
     * The IP address of the LIF.
     **/
    public String getNetworkAddress() { return this.networkAddress; }
   
    public void setNetworkAddress(String networkAddress) { 
        this.networkAddress = networkAddress;
    }
    /** 
     * The network mask of the LIF.
     **/
    public String getNetworkMask() { return this.networkMask; }
   
    public void setNetworkMask(String networkMask) { 
        this.networkMask = networkMask;
    }
    /** 
     * The role of the LIF.
     * Possible values:
     * undef
     * cluster
     * data
     * node_mgmt
     * intercluster
     * cluster_mgmt
     **/
    public String getInterfaceRole() { return this.interfaceRole; }
   
    public void setInterfaceRole(String interfaceRole) { 
        this.interfaceRole = interfaceRole;
    }
    /** 
     * Specifies the operational status of the LIF.
     * Possible values:
     * up
     * down
     **/
    public String getOperationalStatus() { return this.operationalStatus; }
   
    public void setOperationalStatus(String operationalStatus) { 
        this.operationalStatus = operationalStatus;
    }
    /** 
     * Specifies the administrative status of the LIF. The administrative status can differ from the operational status.
     * For instance, if you specify the status as up but a network problem prevents the interface from functioning, the operational status remains as down.
     * Possible values:
     * up
     * down
     **/
    public String getAdministrativeStatus() { return this.administrativeStatus; }
   
    public void setAdministrativeStatus(String administrativeStatus) { 
        this.administrativeStatus = administrativeStatus;
    }
    /** 
     * The name of the Vserver.
     **/
    public String getVserverName() { return this.vserverName; }
   
    public void setVserverName(String vserverName) { 
        this.vserverName = vserverName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorNetworkInterface that = (SnapMirrorNetworkInterface) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(interfaceName, that.interfaceName) && 
            Objects.equals(networkAddress, that.networkAddress) && 
            Objects.equals(networkMask, that.networkMask) && 
            Objects.equals(interfaceRole, that.interfaceRole) && 
            Objects.equals(operationalStatus, that.operationalStatus) && 
            Objects.equals(administrativeStatus, that.administrativeStatus) && 
            Objects.equals(vserverName, that.vserverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,interfaceName,networkAddress,networkMask,interfaceRole,operationalStatus,administrativeStatus,vserverName );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("interfaceName", interfaceName);
        map.put("networkAddress", networkAddress);
        map.put("networkMask", networkMask);
        map.put("interfaceRole", interfaceRole);
        map.put("operationalStatus", operationalStatus);
        map.put("administrativeStatus", administrativeStatus);
        map.put("vserverName", vserverName);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" interfaceName : ").append(gson.toJson(interfaceName)).append(",");
        sb.append(" networkAddress : ").append(gson.toJson(networkAddress)).append(",");
        sb.append(" networkMask : ").append(gson.toJson(networkMask)).append(",");
        sb.append(" interfaceRole : ").append(gson.toJson(interfaceRole)).append(",");
        sb.append(" operationalStatus : ").append(gson.toJson(operationalStatus)).append(",");
        sb.append(" administrativeStatus : ").append(gson.toJson(administrativeStatus)).append(",");
        sb.append(" vserverName : ").append(gson.toJson(vserverName)).append(",");
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
        private Long snapMirrorEndpointID;
        private String interfaceName;
        private String networkAddress;
        private String networkMask;
        private String interfaceRole;
        private String operationalStatus;
        private String administrativeStatus;
        private String vserverName;

        private Builder() { }

        public SnapMirrorNetworkInterface build() {
            return new SnapMirrorNetworkInterface (
                         this.snapMirrorEndpointID,
                         this.interfaceName,
                         this.networkAddress,
                         this.networkMask,
                         this.interfaceRole,
                         this.operationalStatus,
                         this.administrativeStatus,
                         this.vserverName);
        }

        private SnapMirrorNetworkInterface.Builder buildFrom(final SnapMirrorNetworkInterface req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.interfaceName = req.interfaceName;
            this.networkAddress = req.networkAddress;
            this.networkMask = req.networkMask;
            this.interfaceRole = req.interfaceRole;
            this.operationalStatus = req.operationalStatus;
            this.administrativeStatus = req.administrativeStatus;
            this.vserverName = req.vserverName;

            return this;
        }

        public SnapMirrorNetworkInterface.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public SnapMirrorNetworkInterface.Builder interfaceName(final String interfaceName) {
            this.interfaceName = interfaceName;
            return this;
        }

        public SnapMirrorNetworkInterface.Builder networkAddress(final String networkAddress) {
            this.networkAddress = networkAddress;
            return this;
        }

        public SnapMirrorNetworkInterface.Builder networkMask(final String networkMask) {
            this.networkMask = networkMask;
            return this;
        }

        public SnapMirrorNetworkInterface.Builder interfaceRole(final String interfaceRole) {
            this.interfaceRole = interfaceRole;
            return this;
        }

        public SnapMirrorNetworkInterface.Builder operationalStatus(final String operationalStatus) {
            this.operationalStatus = operationalStatus;
            return this;
        }

        public SnapMirrorNetworkInterface.Builder administrativeStatus(final String administrativeStatus) {
            this.administrativeStatus = administrativeStatus;
            return this;
        }

        public SnapMirrorNetworkInterface.Builder vserverName(final String vserverName) {
            this.vserverName = vserverName;
            return this;
        }

    }
}
