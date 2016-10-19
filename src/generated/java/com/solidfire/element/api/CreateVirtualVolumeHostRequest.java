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
 * The Request object for the "CreateVirtualVolumeHost" API Service call.
 **/
public class CreateVirtualVolumeHostRequest  implements Serializable  {

    private static final long serialVersionUID = -264853873L;

    @SerializedName("virtualVolumeHostID") private final java.util.UUID virtualVolumeHostID;
    @SerializedName("clusterID") private final java.util.UUID clusterID;
    @SerializedName("initiatorNames") private final Optional<String[]> initiatorNames;
    @SerializedName("visibleProtocolEndpointIDs") private final Optional<java.util.UUID[]> visibleProtocolEndpointIDs;
    @SerializedName("hostAddress") private final Optional<String> hostAddress;
    @SerializedName("callingVirtualVolumeHostID") private final Optional<java.util.UUID> callingVirtualVolumeHostID;

    /**
     * The Request object for the "CreateVirtualVolumeHost" API Service call.
     * @param virtualVolumeHostID [required] The GUID of the ESX host.
     * @param clusterID [required] The GUID of the ESX Cluster.
     * @param initiatorNames (optional) 
     * @param visibleProtocolEndpointIDs (optional) A list of PEs the host is aware of.
     * @param hostAddress (optional) IP or DNS name for the host.
     * @param callingVirtualVolumeHostID (optional) 
     * @since 9.0
     **/
    @Since("9.0")
    public CreateVirtualVolumeHostRequest(java.util.UUID virtualVolumeHostID, java.util.UUID clusterID, Optional<String[]> initiatorNames, Optional<java.util.UUID[]> visibleProtocolEndpointIDs, Optional<String> hostAddress, Optional<java.util.UUID> callingVirtualVolumeHostID) {
        this.visibleProtocolEndpointIDs = (visibleProtocolEndpointIDs == null) ? Optional.<java.util.UUID[]>empty() : visibleProtocolEndpointIDs;
        this.virtualVolumeHostID = virtualVolumeHostID;
        this.clusterID = clusterID;
        this.callingVirtualVolumeHostID = (callingVirtualVolumeHostID == null) ? Optional.<java.util.UUID>empty() : callingVirtualVolumeHostID;
        this.hostAddress = (hostAddress == null) ? Optional.<String>empty() : hostAddress;
        this.initiatorNames = (initiatorNames == null) ? Optional.<String[]>empty() : initiatorNames;
    }


    /**
     * The GUID of the ESX host.
     **/
    public java.util.UUID getVirtualVolumeHostID() {
        return this.virtualVolumeHostID;
    }

    /**
     * The GUID of the ESX Cluster.
     **/
    public java.util.UUID getClusterID() {
        return this.clusterID;
    }
    public Optional<String[]> getInitiatorNames() {
        return this.initiatorNames;
    }

    /**
     * A list of PEs the host is aware of.
     **/
    public Optional<java.util.UUID[]> getVisibleProtocolEndpointIDs() {
        return this.visibleProtocolEndpointIDs;
    }

    /**
     * IP or DNS name for the host.
     **/
    public Optional<String> getHostAddress() {
        return this.hostAddress;
    }
    public Optional<java.util.UUID> getCallingVirtualVolumeHostID() {
        return this.callingVirtualVolumeHostID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateVirtualVolumeHostRequest that = (CreateVirtualVolumeHostRequest) o;
        

        return Objects.equals( virtualVolumeHostID , that.virtualVolumeHostID )
            && Objects.equals( clusterID , that.clusterID )
            && Objects.deepEquals( initiatorNames , that.initiatorNames )
            && Objects.deepEquals( visibleProtocolEndpointIDs , that.visibleProtocolEndpointIDs )
            && Objects.equals( hostAddress , that.hostAddress )
            && Objects.equals( callingVirtualVolumeHostID , that.callingVirtualVolumeHostID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeHostID, clusterID, initiatorNames, visibleProtocolEndpointIDs, hostAddress, callingVirtualVolumeHostID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualVolumeHostID : ").append(virtualVolumeHostID).append(",");
        sb.append(" clusterID : ").append(clusterID).append(",");
        if(null != initiatorNames && initiatorNames.isPresent())
            sb.append(" initiatorNames : ").append(Arrays.toString(initiatorNames.get())).append(",");
        if(null != visibleProtocolEndpointIDs && visibleProtocolEndpointIDs.isPresent())
            sb.append(" visibleProtocolEndpointIDs : ").append(Arrays.toString(visibleProtocolEndpointIDs.get())).append(",");
        if(null != hostAddress && hostAddress.isPresent())
            sb.append(" hostAddress : ").append(hostAddress.get()).append(",");
        if(null != callingVirtualVolumeHostID && callingVirtualVolumeHostID.isPresent())
            sb.append(" callingVirtualVolumeHostID : ").append(callingVirtualVolumeHostID.get());
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
                         this.callingVirtualVolumeHostID            );
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
