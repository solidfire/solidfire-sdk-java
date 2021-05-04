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
 * SnapMirrorEndpoint  
 * The snapMirrorEndpoint object contains information about the remote SnapMirror storage systems communicating with the SolidFire cluster. You can retrieve this information with the ListSnapMirrorEndpoints API method.
 **/

public class SnapMirrorEndpoint implements Serializable {

    public static final long serialVersionUID = -2942011479761548599L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("managementIP") private String managementIP;
    @SerializedName("clusterName") private String clusterName;
    @SerializedName("username") private String username;
    @SerializedName("ipAddresses") private String[] ipAddresses;
    @SerializedName("isConnected") private Boolean isConnected;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorEndpoint(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorEndpoint(
        Long snapMirrorEndpointID,
        String managementIP,
        String clusterName,
        String username,
        String[] ipAddresses,
        Boolean isConnected
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.managementIP = managementIP;
        this.clusterName = clusterName;
        this.username = username;
        this.ipAddresses = ipAddresses;
        this.isConnected = isConnected;
    }

    /** 
     * The unique identifier for the object in the local cluster.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The cluster management IP address of the endpoint.
     **/
    public String getManagementIP() { return this.managementIP; }
   
    public void setManagementIP(String managementIP) { 
        this.managementIP = managementIP;
    }
    /** 
     * The ONTAP cluster name. This value is automatically populated with
     * the value of "clusterName" from the snapMirrorClusterIdentity object.
     **/
    public String getClusterName() { return this.clusterName; }
   
    public void setClusterName(String clusterName) { 
        this.clusterName = clusterName;
    }
    /** 
     * The management username for the ONTAP system.
     **/
    public String getUsername() { return this.username; }
   
    public void setUsername(String username) { 
        this.username = username;
    }
    /** 
     * List of the inter-cluster storage IP addresses for all nodes in the cluster.
     * You can get these IP addresses with the ListSnapMirrorNetworkInterfaces method.
     **/
    public String[] getIpAddresses() { return this.ipAddresses; }
   
    public void setIpAddresses(String[] ipAddresses) { 
        this.ipAddresses = ipAddresses;
    }
    /** 
     * The connectivity status of the control link to the ONTAP cluster.
     **/
    public Boolean getIsConnected() { return this.isConnected; }
   
    public void setIsConnected(Boolean isConnected) { 
        this.isConnected = isConnected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorEndpoint that = (SnapMirrorEndpoint) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(managementIP, that.managementIP) && 
            Objects.equals(clusterName, that.clusterName) && 
            Objects.equals(username, that.username) && 
            Arrays.equals(ipAddresses, that.ipAddresses) && 
            Objects.equals(isConnected, that.isConnected);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,managementIP,clusterName,username,(Object[])ipAddresses,isConnected );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("managementIP", managementIP);
        map.put("clusterName", clusterName);
        map.put("username", username);
        map.put("ipAddresses", ipAddresses);
        map.put("isConnected", isConnected);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" managementIP : ").append(gson.toJson(managementIP)).append(",");
        sb.append(" clusterName : ").append(gson.toJson(clusterName)).append(",");
        sb.append(" username : ").append(gson.toJson(username)).append(",");
        sb.append(" ipAddresses : ").append(gson.toJson(Arrays.toString(ipAddresses))).append(",");
        sb.append(" isConnected : ").append(gson.toJson(isConnected)).append(",");
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
        private String managementIP;
        private String clusterName;
        private String username;
        private String[] ipAddresses;
        private Boolean isConnected;

        private Builder() { }

        public SnapMirrorEndpoint build() {
            return new SnapMirrorEndpoint (
                         this.snapMirrorEndpointID,
                         this.managementIP,
                         this.clusterName,
                         this.username,
                         this.ipAddresses,
                         this.isConnected);
        }

        private SnapMirrorEndpoint.Builder buildFrom(final SnapMirrorEndpoint req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.managementIP = req.managementIP;
            this.clusterName = req.clusterName;
            this.username = req.username;
            this.ipAddresses = req.ipAddresses;
            this.isConnected = req.isConnected;

            return this;
        }

        public SnapMirrorEndpoint.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public SnapMirrorEndpoint.Builder managementIP(final String managementIP) {
            this.managementIP = managementIP;
            return this;
        }

        public SnapMirrorEndpoint.Builder clusterName(final String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public SnapMirrorEndpoint.Builder username(final String username) {
            this.username = username;
            return this;
        }

        public SnapMirrorEndpoint.Builder ipAddresses(final String[] ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public SnapMirrorEndpoint.Builder isConnected(final Boolean isConnected) {
            this.isConnected = isConnected;
            return this;
        }

    }
}
