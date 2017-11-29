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
 * VirtualVolumeBinding  
 **/

public class VirtualVolumeBinding implements Serializable {

    public static final long serialVersionUID = 7502598809220693698L;
    @SerializedName("protocolEndpointID") private java.util.UUID protocolEndpointID;
    @SerializedName("protocolEndpointInBandID") private String protocolEndpointInBandID;
    @SerializedName("protocolEndpointType") private String protocolEndpointType;
    @SerializedName("virtualVolumeBindingID") private Long virtualVolumeBindingID;
    @SerializedName("virtualVolumeHostID") private java.util.UUID virtualVolumeHostID;
    @SerializedName("virtualVolumeID") private java.util.UUID virtualVolumeID;
    @SerializedName("virtualVolumeSecondaryID") private String virtualVolumeSecondaryID;
    // empty constructor
    @Since("7.0")
    public VirtualVolumeBinding() {}

    
    // parameterized constructor
    @Since("7.0")
    public VirtualVolumeBinding(
        java.util.UUID protocolEndpointID,
        String protocolEndpointInBandID,
        String protocolEndpointType,
        Long virtualVolumeBindingID,
        java.util.UUID virtualVolumeHostID,
        java.util.UUID virtualVolumeID,
        String virtualVolumeSecondaryID
    )
    {
        this.protocolEndpointID = protocolEndpointID;
        this.protocolEndpointInBandID = protocolEndpointInBandID;
        this.protocolEndpointType = protocolEndpointType;
        this.virtualVolumeBindingID = virtualVolumeBindingID;
        this.virtualVolumeHostID = virtualVolumeHostID;
        this.virtualVolumeID = virtualVolumeID;
        this.virtualVolumeSecondaryID = virtualVolumeSecondaryID;
    }

    /** 
     * The unique ID of the protocol endpoint.
     **/
    public java.util.UUID getProtocolEndpointID() { return this.protocolEndpointID; }
   
    public void setProtocolEndpointID(java.util.UUID protocolEndpointID) { 
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
    public java.util.UUID getVirtualVolumeHostID() { return this.virtualVolumeHostID; }
   
    public void setVirtualVolumeHostID(java.util.UUID virtualVolumeHostID) { 
        this.virtualVolumeHostID = virtualVolumeHostID;
    }
    /** 
     * The unique ID of the virtual volume.
     **/
    public java.util.UUID getVirtualVolumeID() { return this.virtualVolumeID; }
   
    public void setVirtualVolumeID(java.util.UUID virtualVolumeID) { 
        this.virtualVolumeID = virtualVolumeID;
    }
    /** 
     * The secondary ID of the virtual volume.
     **/
    public String getVirtualVolumeSecondaryID() { return this.virtualVolumeSecondaryID; }
   
    public void setVirtualVolumeSecondaryID(String virtualVolumeSecondaryID) { 
        this.virtualVolumeSecondaryID = virtualVolumeSecondaryID;
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
            Objects.equals(virtualVolumeSecondaryID, that.virtualVolumeSecondaryID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( protocolEndpointID,protocolEndpointInBandID,protocolEndpointType,virtualVolumeBindingID,virtualVolumeHostID,virtualVolumeID,virtualVolumeSecondaryID );
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
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" protocolEndpointID : ").append(gson.toJson(protocolEndpointID)).append(",");
        sb.append(" protocolEndpointInBandID : ").append(gson.toJson(protocolEndpointInBandID)).append(",");
        sb.append(" protocolEndpointType : ").append(gson.toJson(protocolEndpointType)).append(",");
        sb.append(" virtualVolumeBindingID : ").append(gson.toJson(virtualVolumeBindingID)).append(",");
        sb.append(" virtualVolumeHostID : ").append(gson.toJson(virtualVolumeHostID)).append(",");
        sb.append(" virtualVolumeID : ").append(gson.toJson(virtualVolumeID)).append(",");
        sb.append(" virtualVolumeSecondaryID : ").append(gson.toJson(virtualVolumeSecondaryID)).append(",");
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

        private Builder() { }

        public VirtualVolumeBinding build() {
            return new VirtualVolumeBinding (
                         this.protocolEndpointID,
                         this.protocolEndpointInBandID,
                         this.protocolEndpointType,
                         this.virtualVolumeBindingID,
                         this.virtualVolumeHostID,
                         this.virtualVolumeID,
                         this.virtualVolumeSecondaryID);
        }

        private VirtualVolumeBinding.Builder buildFrom(final VirtualVolumeBinding req) {
            this.protocolEndpointID = req.protocolEndpointID;
            this.protocolEndpointInBandID = req.protocolEndpointInBandID;
            this.protocolEndpointType = req.protocolEndpointType;
            this.virtualVolumeBindingID = req.virtualVolumeBindingID;
            this.virtualVolumeHostID = req.virtualVolumeHostID;
            this.virtualVolumeID = req.virtualVolumeID;
            this.virtualVolumeSecondaryID = req.virtualVolumeSecondaryID;

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

    }
}
