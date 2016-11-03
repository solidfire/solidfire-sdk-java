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
 * 
 **/

public class VirtualVolumeBinding implements Serializable {

    public static final long serialVersionUID = 7502598809220693698L;
    @SerializedName("protocolEndpointID") private UUIDNullable protocolEndpointID;
    @SerializedName("protocolEndpointInBandID") private String protocolEndpointInBandID;
    @SerializedName("protocolEndpointType") private String protocolEndpointType;
    @SerializedName("virtualVolumeBindingID") private Long virtualVolumeBindingID;
    @SerializedName("virtualVolumeHostID") private UUIDNullable virtualVolumeHostID;
    @SerializedName("virtualVolumeID") private UUIDNullable virtualVolumeID;
    @SerializedName("virtualVolumeSecondaryID") private String virtualVolumeSecondaryID;
    @SerializedName("virtualVolume") private VirtualVolumeInfo virtualVolume;
    @SerializedName("protocolEndpoint") private UUIDNullable protocolEndpoint;
    @SerializedName("virtualVolumeHost") private VirtualVolumeHost virtualVolumeHost;

    // empty constructor
    @Since("7.0")
    public VirtualVolumeBinding() {}

    // parameterized constructor
    @Since("7.0")
    public VirtualVolumeBinding(
        UUIDNullable protocolEndpointID,
        String protocolEndpointInBandID,
        String protocolEndpointType,
        Long virtualVolumeBindingID,
        UUIDNullable virtualVolumeHostID,
        UUIDNullable virtualVolumeID,
        String virtualVolumeSecondaryID,
        VirtualVolumeInfo virtualVolume,
        UUIDNullable protocolEndpoint,
        VirtualVolumeHost virtualVolumeHost
    )
    {
        this.protocolEndpointID = protocolEndpointID;
        this.protocolEndpointInBandID = protocolEndpointInBandID;
        this.protocolEndpointType = protocolEndpointType;
        this.virtualVolumeBindingID = virtualVolumeBindingID;
        this.virtualVolumeHostID = virtualVolumeHostID;
        this.virtualVolumeID = virtualVolumeID;
        this.virtualVolumeSecondaryID = virtualVolumeSecondaryID;
        this.virtualVolume = virtualVolume;
        this.protocolEndpoint = protocolEndpoint;
        this.virtualVolumeHost = virtualVolumeHost;
    }

    /** 
     * The unique ID of the protocol endpoint.
     **/
    public UUIDNullable getProtocolEndpointID() { return this.protocolEndpointID; }
    public void setProtocolEndpointID(UUIDNullable protocolEndpointID) { 
        this.protocolEndpointID = protocolEndpointID;
    }
    /** 
     * The scsiNAADeviceID of the protocol endpoint. For more information, see protocolEndpoint.
     **/
    public String getProtocolEndpointInBandID() { return this.protocolEndpointInBandID; }
    public void setProtocolEndpointInBandID(String protocolEndpointInBandID) { 
        this.protocolEndpointInBandID = protocolEndpointInBandID;
    }
    /** 
     * The type of protocol endpoint. SCSI is the only value returned for the protocol endpoint type.
     **/
    public String getProtocolEndpointType() { return this.protocolEndpointType; }
    public void setProtocolEndpointType(String protocolEndpointType) { 
        this.protocolEndpointType = protocolEndpointType;
    }
    /** 
     * The unique ID of the virtual volume binding object.
     **/
    public Long getVirtualVolumeBindingID() { return this.virtualVolumeBindingID; }
    public void setVirtualVolumeBindingID(Long virtualVolumeBindingID) { 
        this.virtualVolumeBindingID = virtualVolumeBindingID;
    }
    /** 
     * The unique ID of the virtual volume host.
     **/
    public UUIDNullable getVirtualVolumeHostID() { return this.virtualVolumeHostID; }
    public void setVirtualVolumeHostID(UUIDNullable virtualVolumeHostID) { 
        this.virtualVolumeHostID = virtualVolumeHostID;
    }
    /** 
     * The unique ID of the virtual volume.
     **/
    public UUIDNullable getVirtualVolumeID() { return this.virtualVolumeID; }
    public void setVirtualVolumeID(UUIDNullable virtualVolumeID) { 
        this.virtualVolumeID = virtualVolumeID;
    }
    /** 
     * The secondary ID of the virtual volume.
     **/
    public String getVirtualVolumeSecondaryID() { return this.virtualVolumeSecondaryID; }
    public void setVirtualVolumeSecondaryID(String virtualVolumeSecondaryID) { 
        this.virtualVolumeSecondaryID = virtualVolumeSecondaryID;
    }
    /** 
     * An object describing the bound volume or snapshot.
     **/
    public VirtualVolumeInfo getVirtualVolume() { return this.virtualVolume; }
    public void setVirtualVolume(VirtualVolumeInfo virtualVolume) { 
        this.virtualVolume = virtualVolume;
    }
    /** 
     * An object describing the protocol endpoint to which the virtual volume is bound.
     **/
    public UUIDNullable getProtocolEndpoint() { return this.protocolEndpoint; }
    public void setProtocolEndpoint(UUIDNullable protocolEndpoint) { 
        this.protocolEndpoint = protocolEndpoint;
    }
    /** 
     * An object describing the host to which this binding corresponds.
     **/
    public VirtualVolumeHost getVirtualVolumeHost() { return this.virtualVolumeHost; }
    public void setVirtualVolumeHost(VirtualVolumeHost virtualVolumeHost) { 
        this.virtualVolumeHost = virtualVolumeHost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualVolumeBinding that = (VirtualVolumeBinding) o;
        return 
            Objects.equals(protocolEndpointID, that.protocolEndpointID) &&
            Objects.equals(protocolEndpointInBandID, that.protocolEndpointInBandID) &&
            Objects.equals(protocolEndpointType, that.protocolEndpointType) &&
            Objects.equals(virtualVolumeBindingID, that.virtualVolumeBindingID) &&
            Objects.equals(virtualVolumeHostID, that.virtualVolumeHostID) &&
            Objects.equals(virtualVolumeID, that.virtualVolumeID) &&
            Objects.equals(virtualVolumeSecondaryID, that.virtualVolumeSecondaryID) &&
            Objects.equals(virtualVolume, that.virtualVolume) &&
            Objects.equals(protocolEndpoint, that.protocolEndpoint) &&
            Objects.equals(virtualVolumeHost, that.virtualVolumeHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash( protocolEndpointID, protocolEndpointInBandID, protocolEndpointType, virtualVolumeBindingID, virtualVolumeHostID, virtualVolumeID, virtualVolumeSecondaryID, virtualVolume, protocolEndpoint, virtualVolumeHost );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("protocolEndpointID", protocolEndpointID);
        map.put("protocolEndpointInBandID", protocolEndpointInBandID);
        map.put("protocolEndpointType", protocolEndpointType);
        map.put("virtualVolumeBindingID", virtualVolumeBindingID);
        map.put("virtualVolumeHostID", virtualVolumeHostID);
        map.put("virtualVolumeID", virtualVolumeID);
        map.put("virtualVolumeSecondaryID", virtualVolumeSecondaryID);
        map.put("virtualVolume", virtualVolume);
        map.put("protocolEndpoint", protocolEndpoint);
        map.put("virtualVolumeHost", virtualVolumeHost);
        return map;
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
        sb.append(" virtualVolumeHost : ").append(virtualVolumeHost).append(",");
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
        private UUIDNullable protocolEndpointID;
        private String protocolEndpointInBandID;
        private String protocolEndpointType;
        private Long virtualVolumeBindingID;
        private UUIDNullable virtualVolumeHostID;
        private UUIDNullable virtualVolumeID;
        private String virtualVolumeSecondaryID;
        private VirtualVolumeInfo virtualVolume;
        private UUIDNullable protocolEndpoint;
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
                         this.virtualVolumeHost);
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

        public VirtualVolumeBinding.Builder protocolEndpointID(final UUIDNullable protocolEndpointID) {
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

        public VirtualVolumeBinding.Builder virtualVolumeHostID(final UUIDNullable virtualVolumeHostID) {
            this.virtualVolumeHostID = virtualVolumeHostID;
            return this;
        }

        public VirtualVolumeBinding.Builder virtualVolumeID(final UUIDNullable virtualVolumeID) {
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

        public VirtualVolumeBinding.Builder protocolEndpoint(final UUIDNullable protocolEndpoint) {
            this.protocolEndpoint = protocolEndpoint;
            return this;
        }

        public VirtualVolumeBinding.Builder virtualVolumeHost(final VirtualVolumeHost virtualVolumeHost) {
            this.virtualVolumeHost = virtualVolumeHost;
            return this;
        }

    }
}
