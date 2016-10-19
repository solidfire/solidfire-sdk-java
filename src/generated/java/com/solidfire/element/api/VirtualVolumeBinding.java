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
 * 
 **/
public class VirtualVolumeBinding  implements Serializable  {

    private static final long serialVersionUID = -788784370L;

    @SerializedName("protocolEndpointID") private final java.util.UUID protocolEndpointID;
    @SerializedName("protocolEndpointInBandID") private final String protocolEndpointInBandID;
    @SerializedName("protocolEndpointType") private final String protocolEndpointType;
    @SerializedName("virtualVolumeBindingID") private final Long virtualVolumeBindingID;
    @SerializedName("virtualVolumeHostID") private final java.util.UUID virtualVolumeHostID;
    @SerializedName("virtualVolumeID") private final java.util.UUID virtualVolumeID;
    @SerializedName("virtualVolumeSecondaryID") private final String virtualVolumeSecondaryID;
    @SerializedName("virtualVolume") private final VirtualVolumeInfo virtualVolume;
    @SerializedName("protocolEndpoint") private final java.util.UUID protocolEndpoint;
    @SerializedName("virtualVolumeHost") private final VirtualVolumeHost virtualVolumeHost;

    /**
     * 
     * @param protocolEndpointID [required] The unique ID of the protocol endpoint.
     * @param protocolEndpointInBandID [required] The scsiNAADeviceID of the protocol endpoint. For more information, see protocolEndpoint.
     * @param protocolEndpointType [required] The type of protocol endpoint. SCSI is the only value returned for the protocol endpoint type.
     * @param virtualVolumeBindingID [required] The unique ID of the virtual volume binding object.
     * @param virtualVolumeHostID [required] The unique ID of the virtual volume host.
     * @param virtualVolumeID [required] The unique ID of the virtual volume.
     * @param virtualVolumeSecondaryID [required] The secondary ID of the virtual volume.
     * @param virtualVolume [required] An object describing the bound volume or snapshot.
     * @param protocolEndpoint [required] An object describing the protocol endpoint to which the virtual volume is bound.
     * @param virtualVolumeHost [required] An object describing the host to which this binding corresponds.
     * @since 7.0
     **/
    @Since("7.0")
    public VirtualVolumeBinding(java.util.UUID protocolEndpointID, String protocolEndpointInBandID, String protocolEndpointType, Long virtualVolumeBindingID, java.util.UUID virtualVolumeHostID, java.util.UUID virtualVolumeID, String virtualVolumeSecondaryID, VirtualVolumeInfo virtualVolume, java.util.UUID protocolEndpoint, VirtualVolumeHost virtualVolumeHost) {
        this.virtualVolume = virtualVolume;
        this.virtualVolumeHost = virtualVolumeHost;
        this.protocolEndpointType = protocolEndpointType;
        this.virtualVolumeID = virtualVolumeID;
        this.virtualVolumeSecondaryID = virtualVolumeSecondaryID;
        this.protocolEndpoint = protocolEndpoint;
        this.virtualVolumeHostID = virtualVolumeHostID;
        this.virtualVolumeBindingID = virtualVolumeBindingID;
        this.protocolEndpointInBandID = protocolEndpointInBandID;
        this.protocolEndpointID = protocolEndpointID;
    }


    /**
     * The unique ID of the protocol endpoint.
     **/
    public java.util.UUID getProtocolEndpointID() {
        return this.protocolEndpointID;
    }

    /**
     * The scsiNAADeviceID of the protocol endpoint. For more information, see protocolEndpoint.
     **/
    public String getProtocolEndpointInBandID() {
        return this.protocolEndpointInBandID;
    }

    /**
     * The type of protocol endpoint. SCSI is the only value returned for the protocol endpoint type.
     **/
    public String getProtocolEndpointType() {
        return this.protocolEndpointType;
    }

    /**
     * The unique ID of the virtual volume binding object.
     **/
    public Long getVirtualVolumeBindingID() {
        return this.virtualVolumeBindingID;
    }

    /**
     * The unique ID of the virtual volume host.
     **/
    public java.util.UUID getVirtualVolumeHostID() {
        return this.virtualVolumeHostID;
    }

    /**
     * The unique ID of the virtual volume.
     **/
    public java.util.UUID getVirtualVolumeID() {
        return this.virtualVolumeID;
    }

    /**
     * The secondary ID of the virtual volume.
     **/
    public String getVirtualVolumeSecondaryID() {
        return this.virtualVolumeSecondaryID;
    }

    /**
     * An object describing the bound volume or snapshot.
     **/
    public VirtualVolumeInfo getVirtualVolume() {
        return this.virtualVolume;
    }

    /**
     * An object describing the protocol endpoint to which the virtual volume is bound.
     **/
    public java.util.UUID getProtocolEndpoint() {
        return this.protocolEndpoint;
    }

    /**
     * An object describing the host to which this binding corresponds.
     **/
    public VirtualVolumeHost getVirtualVolumeHost() {
        return this.virtualVolumeHost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualVolumeBinding that = (VirtualVolumeBinding) o;
        

        return Objects.equals( protocolEndpointID , that.protocolEndpointID )
            && Objects.equals( protocolEndpointInBandID , that.protocolEndpointInBandID )
            && Objects.equals( protocolEndpointType , that.protocolEndpointType )
            && Objects.equals( virtualVolumeBindingID , that.virtualVolumeBindingID )
            && Objects.equals( virtualVolumeHostID , that.virtualVolumeHostID )
            && Objects.equals( virtualVolumeID , that.virtualVolumeID )
            && Objects.equals( virtualVolumeSecondaryID , that.virtualVolumeSecondaryID )
            && Objects.equals( virtualVolume , that.virtualVolume )
            && Objects.equals( protocolEndpoint , that.protocolEndpoint )
            && Objects.equals( virtualVolumeHost , that.virtualVolumeHost );
    }

    @Override
    public int hashCode() {
        return Objects.hash( protocolEndpointID, protocolEndpointInBandID, protocolEndpointType, virtualVolumeBindingID, virtualVolumeHostID, virtualVolumeID, virtualVolumeSecondaryID, virtualVolume, protocolEndpoint, virtualVolumeHost );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" protocolEndpointID : ").append(protocolEndpointID).append(",");
        sb.append(" protocolEndpointInBandID : ").append(protocolEndpointInBandID).append(",");
        sb.append(" protocolEndpointType : ").append(protocolEndpointType).append(",");
        sb.append(" virtualVolumeBindingID : ").append(virtualVolumeBindingID).append(",");
        sb.append(" virtualVolumeHostID : ").append(virtualVolumeHostID).append(",");
        sb.append(" virtualVolumeID : ").append(virtualVolumeID).append(",");
        sb.append(" virtualVolumeSecondaryID : ").append(virtualVolumeSecondaryID).append(",");
        sb.append(" virtualVolume : ").append(virtualVolume).append(",");
        sb.append(" protocolEndpoint : ").append(protocolEndpoint).append(",");
        sb.append(" virtualVolumeHost : ").append(virtualVolumeHost);
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
        private java.util.UUID protocolEndpointID;
        private String protocolEndpointInBandID;
        private String protocolEndpointType;
        private Long virtualVolumeBindingID;
        private java.util.UUID virtualVolumeHostID;
        private java.util.UUID virtualVolumeID;
        private String virtualVolumeSecondaryID;
        private VirtualVolumeInfo virtualVolume;
        private java.util.UUID protocolEndpoint;
        private VirtualVolumeHost virtualVolumeHost;

        private Builder() { }

        public VirtualVolumeBinding build() {
            return new VirtualVolumeBinding (
                         this.protocolEndpointID,
                         this.protocolEndpointInBandID,
                         this.protocolEndpointType,
                         this.virtualVolumeBindingID,
                         this.virtualVolumeHostID,
                         this.virtualVolumeID,
                         this.virtualVolumeSecondaryID,
                         this.virtualVolume,
                         this.protocolEndpoint,
                         this.virtualVolumeHost            );
        }

        private VirtualVolumeBinding.Builder buildFrom(final VirtualVolumeBinding req) {
            this.protocolEndpointID = req.protocolEndpointID;
            this.protocolEndpointInBandID = req.protocolEndpointInBandID;
            this.protocolEndpointType = req.protocolEndpointType;
            this.virtualVolumeBindingID = req.virtualVolumeBindingID;
            this.virtualVolumeHostID = req.virtualVolumeHostID;
            this.virtualVolumeID = req.virtualVolumeID;
            this.virtualVolumeSecondaryID = req.virtualVolumeSecondaryID;
            this.virtualVolume = req.virtualVolume;
            this.protocolEndpoint = req.protocolEndpoint;
            this.virtualVolumeHost = req.virtualVolumeHost;

            return this;
        }

        public VirtualVolumeBinding.Builder protocolEndpointID(final java.util.UUID protocolEndpointID) {
            this.protocolEndpointID = protocolEndpointID;
            return this;
        }

        public VirtualVolumeBinding.Builder protocolEndpointInBandID(final String protocolEndpointInBandID) {
            this.protocolEndpointInBandID = protocolEndpointInBandID;
            return this;
        }

        public VirtualVolumeBinding.Builder protocolEndpointType(final String protocolEndpointType) {
            this.protocolEndpointType = protocolEndpointType;
            return this;
        }

        public VirtualVolumeBinding.Builder virtualVolumeBindingID(final Long virtualVolumeBindingID) {
            this.virtualVolumeBindingID = virtualVolumeBindingID;
            return this;
        }

        public VirtualVolumeBinding.Builder virtualVolumeHostID(final java.util.UUID virtualVolumeHostID) {
            this.virtualVolumeHostID = virtualVolumeHostID;
            return this;
        }

        public VirtualVolumeBinding.Builder virtualVolumeID(final java.util.UUID virtualVolumeID) {
            this.virtualVolumeID = virtualVolumeID;
            return this;
        }

        public VirtualVolumeBinding.Builder virtualVolumeSecondaryID(final String virtualVolumeSecondaryID) {
            this.virtualVolumeSecondaryID = virtualVolumeSecondaryID;
            return this;
        }

        public VirtualVolumeBinding.Builder virtualVolume(final VirtualVolumeInfo virtualVolume) {
            this.virtualVolume = virtualVolume;
            return this;
        }

        public VirtualVolumeBinding.Builder protocolEndpoint(final java.util.UUID protocolEndpoint) {
            this.protocolEndpoint = protocolEndpoint;
            return this;
        }

        public VirtualVolumeBinding.Builder virtualVolumeHost(final VirtualVolumeHost virtualVolumeHost) {
            this.virtualVolumeHost = virtualVolumeHost;
            return this;
        }

    }

}
