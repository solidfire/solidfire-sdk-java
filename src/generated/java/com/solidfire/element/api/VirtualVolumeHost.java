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
 * VirtualVolumeHost  
 **/

public class VirtualVolumeHost implements Serializable {

    public static final long serialVersionUID = 3388453493580999423L;
    @SerializedName("virtualVolumeHostID") private java.util.UUID virtualVolumeHostID;
    @SerializedName("clusterID") private Optional<java.util.UUID> clusterID;
    @SerializedName("visibleProtocolEndpointIDs") private java.util.UUID[] visibleProtocolEndpointIDs;
    @SerializedName("bindings") private Long[] bindings;
    @SerializedName("initiatorNames") private String[] initiatorNames;
    @SerializedName("hostAddress") private Optional<String> hostAddress;
    // empty constructor
    @Since("7.0")
    public VirtualVolumeHost() {}

    
    // parameterized constructor
    @Since("7.0")
    public VirtualVolumeHost(
        java.util.UUID virtualVolumeHostID,
        Optional<java.util.UUID> clusterID,
        java.util.UUID[] visibleProtocolEndpointIDs,
        Long[] bindings,
        String[] initiatorNames,
        Optional<String> hostAddress
    )
    {
        this.virtualVolumeHostID = virtualVolumeHostID;
        this.clusterID = (clusterID == null) ? Optional.<java.util.UUID>empty() : clusterID;
        this.visibleProtocolEndpointIDs = visibleProtocolEndpointIDs;
        this.bindings = bindings;
        this.initiatorNames = initiatorNames;
        this.hostAddress = (hostAddress == null) ? Optional.<String>empty() : hostAddress;
    }

    /** 
     * 
     **/
    public java.util.UUID getVirtualVolumeHostID() { return this.virtualVolumeHostID; }
   
    public void setVirtualVolumeHostID(java.util.UUID virtualVolumeHostID) { 
        this.virtualVolumeHostID = virtualVolumeHostID;
    }
    /** 
     * 
     **/
    public Optional<java.util.UUID> getClusterID() { return this.clusterID; }
   
    public void setClusterID(Optional<java.util.UUID> clusterID) { 
        this.clusterID = (clusterID == null) ? Optional.<java.util.UUID>empty() : clusterID;
    }
    /** 
     * 
     **/
    public java.util.UUID[] getVisibleProtocolEndpointIDs() { return this.visibleProtocolEndpointIDs; }
   
    public void setVisibleProtocolEndpointIDs(java.util.UUID[] visibleProtocolEndpointIDs) { 
        this.visibleProtocolEndpointIDs = visibleProtocolEndpointIDs;
    }
    /** 
     * 
     **/
    public Long[] getBindings() { return this.bindings; }
   
    public void setBindings(Long[] bindings) { 
        this.bindings = bindings;
    }
    /** 
     * 
     **/
    public String[] getInitiatorNames() { return this.initiatorNames; }
   
    public void setInitiatorNames(String[] initiatorNames) { 
        this.initiatorNames = initiatorNames;
    }
    /** 
     * 
     **/
    public Optional<String> getHostAddress() { return this.hostAddress; }
   
    public void setHostAddress(Optional<String> hostAddress) { 
        this.hostAddress = (hostAddress == null) ? Optional.<String>empty() : hostAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualVolumeHost that = (VirtualVolumeHost) o;

        return 
            Objects.equals(virtualVolumeHostID, that.virtualVolumeHostID) && 
            Objects.equals(clusterID, that.clusterID) && 
            Arrays.equals(visibleProtocolEndpointIDs, that.visibleProtocolEndpointIDs) && 
            Arrays.equals(bindings, that.bindings) && 
            Arrays.equals(initiatorNames, that.initiatorNames) && 
            Objects.equals(hostAddress, that.hostAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeHostID,clusterID,(Object[])visibleProtocolEndpointIDs,(Object[])bindings,(Object[])initiatorNames,hostAddress );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeHostID", virtualVolumeHostID);
        map.put("clusterID", clusterID);
        map.put("visibleProtocolEndpointIDs", visibleProtocolEndpointIDs);
        map.put("bindings", bindings);
        map.put("initiatorNames", initiatorNames);
        map.put("hostAddress", hostAddress);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" virtualVolumeHostID : ").append(gson.toJson(virtualVolumeHostID)).append(",");
        if(null != clusterID && clusterID.isPresent()){
            sb.append(" clusterID : ").append(gson.toJson(clusterID)).append(",");
        }
        else{
            sb.append(" clusterID : ").append("null").append(",");
        }
        sb.append(" visibleProtocolEndpointIDs : ").append(gson.toJson(Arrays.toString(visibleProtocolEndpointIDs))).append(",");
        sb.append(" bindings : ").append(gson.toJson(Arrays.toString(bindings))).append(",");
        sb.append(" initiatorNames : ").append(gson.toJson(Arrays.toString(initiatorNames))).append(",");
        if(null != hostAddress && hostAddress.isPresent()){
            sb.append(" hostAddress : ").append(gson.toJson(hostAddress)).append(",");
        }
        else{
            sb.append(" hostAddress : ").append("null").append(",");
        }
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
        private java.util.UUID virtualVolumeHostID;
        private Optional<java.util.UUID> clusterID;
        private java.util.UUID[] visibleProtocolEndpointIDs;
        private Long[] bindings;
        private String[] initiatorNames;
        private Optional<String> hostAddress;

        private Builder() { }

        public VirtualVolumeHost build() {
            return new VirtualVolumeHost (
                         this.virtualVolumeHostID,
                         this.clusterID,
                         this.visibleProtocolEndpointIDs,
                         this.bindings,
                         this.initiatorNames,
                         this.hostAddress);
        }

        private VirtualVolumeHost.Builder buildFrom(final VirtualVolumeHost req) {
            this.virtualVolumeHostID = req.virtualVolumeHostID;
            this.clusterID = req.clusterID;
            this.visibleProtocolEndpointIDs = req.visibleProtocolEndpointIDs;
            this.bindings = req.bindings;
            this.initiatorNames = req.initiatorNames;
            this.hostAddress = req.hostAddress;

            return this;
        }

        public VirtualVolumeHost.Builder virtualVolumeHostID(final java.util.UUID virtualVolumeHostID) {
            this.virtualVolumeHostID = virtualVolumeHostID;
            return this;
        }

        public VirtualVolumeHost.Builder optionalClusterID(final java.util.UUID clusterID) {
            this.clusterID = (clusterID == null) ? Optional.<java.util.UUID>empty() : Optional.of(clusterID);
            return this;
        }

        public VirtualVolumeHost.Builder visibleProtocolEndpointIDs(final java.util.UUID[] visibleProtocolEndpointIDs) {
            this.visibleProtocolEndpointIDs = visibleProtocolEndpointIDs;
            return this;
        }

        public VirtualVolumeHost.Builder bindings(final Long[] bindings) {
            this.bindings = bindings;
            return this;
        }

        public VirtualVolumeHost.Builder initiatorNames(final String[] initiatorNames) {
            this.initiatorNames = initiatorNames;
            return this;
        }

        public VirtualVolumeHost.Builder optionalHostAddress(final String hostAddress) {
            this.hostAddress = (hostAddress == null) ? Optional.<String>empty() : Optional.of(hostAddress);
            return this;
        }

    }
}
