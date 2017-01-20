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
 * CreateVirtualVolumeHostRequest  
 **/

public class CreateVirtualVolumeHostRequest implements Serializable {

    public static final long serialVersionUID = 4413350546873497723L;
    @SerializedName("virtualVolumeHostID") private java.util.UUID virtualVolumeHostID;
    @SerializedName("clusterID") private java.util.UUID clusterID;
    @SerializedName("initiatorNames") private Optional<String[]> initiatorNames;
    @SerializedName("visibleProtocolEndpointIDs") private Optional<java.util.UUID[]> visibleProtocolEndpointIDs;
    @SerializedName("hostAddress") private Optional<String> hostAddress;
    @SerializedName("callingVirtualVolumeHostID") private Optional<java.util.UUID> callingVirtualVolumeHostID;

    // empty constructor
    @Since("7.0")
    public CreateVirtualVolumeHostRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateVirtualVolumeHostRequest(
        java.util.UUID virtualVolumeHostID,
        java.util.UUID clusterID,
        Optional<String[]> initiatorNames,
        Optional<java.util.UUID[]> visibleProtocolEndpointIDs,
        Optional<String> hostAddress,
        Optional<java.util.UUID> callingVirtualVolumeHostID
    )
    {
        this.virtualVolumeHostID = virtualVolumeHostID;
        this.clusterID = clusterID;
        this.initiatorNames = (initiatorNames == null) ? Optional.<String[]>empty() : initiatorNames;
        this.visibleProtocolEndpointIDs = (visibleProtocolEndpointIDs == null) ? Optional.<java.util.UUID[]>empty() : visibleProtocolEndpointIDs;
        this.hostAddress = (hostAddress == null) ? Optional.<String>empty() : hostAddress;
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : callingVirtualVolumeHostID;
    }

    /** 
     * The GUID of the ESX host.
     **/
    public java.util.UUID getVirtualVolumeHostID() { return this.virtualVolumeHostID; }
    public void setVirtualVolumeHostID(java.util.UUID virtualVolumeHostID) { 
        this.virtualVolumeHostID = virtualVolumeHostID;
    }
    /** 
     * The GUID of the ESX Cluster.
     **/
    public java.util.UUID getClusterID() { return this.clusterID; }
    public void setClusterID(java.util.UUID clusterID) { 
        this.clusterID = clusterID;
    }
    /** 
     **/
    public Optional<String[]> getInitiatorNames() { return this.initiatorNames; }
    public void setInitiatorNames(Optional<String[]> initiatorNames) { 
        this.initiatorNames = (initiatorNames == null) ? Optional.<String[]>empty() : initiatorNames;
    }
    /** 
     * A list of PEs the host is aware of.
     **/
    public Optional<java.util.UUID[]> getVisibleProtocolEndpointIDs() { return this.visibleProtocolEndpointIDs; }
    public void setVisibleProtocolEndpointIDs(Optional<java.util.UUID[]> visibleProtocolEndpointIDs) { 
        this.visibleProtocolEndpointIDs = (visibleProtocolEndpointIDs == null) ? Optional.<java.util.UUID[]>empty() : visibleProtocolEndpointIDs;
    }
    /** 
     * IP or DNS name for the host.
     **/
    public Optional<String> getHostAddress() { return this.hostAddress; }
    public void setHostAddress(Optional<String> hostAddress) { 
        this.hostAddress = (hostAddress == null) ? Optional.<String>empty() : hostAddress;
    }
    /** 
     **/
    public Optional<java.util.UUID> getCallingVirtualVolumeHostID() { return this.callingVirtualVolumeHostID; }
    public void setCallingVirtualVolumeHostID(Optional<java.util.UUID> callingVirtualVolumeHostID) { 
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : callingVirtualVolumeHostID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateVirtualVolumeHostRequest that = (CreateVirtualVolumeHostRequest) o;

        return 
            Objects.equals(virtualVolumeHostID, that.virtualVolumeHostID) && 
            Objects.equals(clusterID, that.clusterID) && 
            Objects.equals(initiatorNames, that.initiatorNames) && 
            Objects.equals(visibleProtocolEndpointIDs, that.visibleProtocolEndpointIDs) && 
            Objects.equals(hostAddress, that.hostAddress) && 
            Objects.equals(callingVirtualVolumeHostID, that.callingVirtualVolumeHostID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeHostID,clusterID,initiatorNames,visibleProtocolEndpointIDs,hostAddress,callingVirtualVolumeHostID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeHostID", virtualVolumeHostID);
        map.put("clusterID", clusterID);
        map.put("initiatorNames", initiatorNames);
        map.put("visibleProtocolEndpointIDs", visibleProtocolEndpointIDs);
        map.put("hostAddress", hostAddress);
        map.put("callingVirtualVolumeHostID", callingVirtualVolumeHostID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualVolumeHostID : ").append(virtualVolumeHostID).append(",");
        sb.append(" clusterID : ").append(clusterID).append(",");
        if(null != initiatorNames && initiatorNames.isPresent()){
            sb.append(" initiatorNames : ").append(initiatorNames).append(",");
        }
        if(null != visibleProtocolEndpointIDs && visibleProtocolEndpointIDs.isPresent()){
            sb.append(" visibleProtocolEndpointIDs : ").append(visibleProtocolEndpointIDs).append(",");
        }
        if(null != hostAddress && hostAddress.isPresent()){
            sb.append(" hostAddress : ").append(hostAddress).append(",");
        }
        if(null != callingVirtualVolumeHostID && callingVirtualVolumeHostID.isPresent()){
            sb.append(" callingVirtualVolumeHostID : ").append(callingVirtualVolumeHostID).append(",");
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
        private java.util.UUID clusterID;
        private Optional<String[]> initiatorNames;
        private Optional<java.util.UUID[]> visibleProtocolEndpointIDs;
        private Optional<String> hostAddress;
        private Optional<java.util.UUID> callingVirtualVolumeHostID;

        private Builder() { }

        public CreateVirtualVolumeHostRequest build() {
            return new CreateVirtualVolumeHostRequest (
                         this.virtualVolumeHostID,
                         this.clusterID,
                         this.initiatorNames,
                         this.visibleProtocolEndpointIDs,
                         this.hostAddress,
                         this.callingVirtualVolumeHostID);
        }

        private CreateVirtualVolumeHostRequest.Builder buildFrom(final CreateVirtualVolumeHostRequest req) {
            this.virtualVolumeHostID = req.virtualVolumeHostID;
            this.clusterID = req.clusterID;
            this.initiatorNames = req.initiatorNames;
            this.visibleProtocolEndpointIDs = req.visibleProtocolEndpointIDs;
            this.hostAddress = req.hostAddress;
            this.callingVirtualVolumeHostID = req.callingVirtualVolumeHostID;

            return this;
        }

        public CreateVirtualVolumeHostRequest.Builder virtualVolumeHostID(final java.util.UUID virtualVolumeHostID) {
            this.virtualVolumeHostID = virtualVolumeHostID;
            return this;
        }

        public CreateVirtualVolumeHostRequest.Builder clusterID(final java.util.UUID clusterID) {
            this.clusterID = clusterID;
            return this;
        }

        public CreateVirtualVolumeHostRequest.Builder optionalInitiatorNames(final String[] initiatorNames) {
            this.initiatorNames = (initiatorNames == null) ? Optional.<String[]>empty() : Optional.of(initiatorNames);
            return this;
        }

        public CreateVirtualVolumeHostRequest.Builder optionalVisibleProtocolEndpointIDs(final java.util.UUID[] visibleProtocolEndpointIDs) {
            this.visibleProtocolEndpointIDs = (visibleProtocolEndpointIDs == null) ? Optional.<java.util.UUID[]>empty() : Optional.of(visibleProtocolEndpointIDs);
            return this;
        }

        public CreateVirtualVolumeHostRequest.Builder optionalHostAddress(final String hostAddress) {
            this.hostAddress = (hostAddress == null) ? Optional.<String>empty() : Optional.of(hostAddress);
            return this;
        }

        public CreateVirtualVolumeHostRequest.Builder optionalCallingVirtualVolumeHostID(final java.util.UUID callingVirtualVolumeHostID) {
            this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : Optional.of(callingVirtualVolumeHostID);
            return this;
        }

    }
}
