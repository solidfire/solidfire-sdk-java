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
 * ProtocolEndpoint  
 **/

public class ProtocolEndpoint implements Serializable {

    public static final long serialVersionUID = -2236280820678345533L;
    @SerializedName("protocolEndpointID") private java.util.UUID protocolEndpointID;
    @SerializedName("protocolEndpointState") private String protocolEndpointState;
    @SerializedName("providerType") private String providerType;
    @SerializedName("primaryProviderID") private Long primaryProviderID;
    @SerializedName("secondaryProviderID") private Long secondaryProviderID;
    @SerializedName("scsiNAADeviceID") private String scsiNAADeviceID;
    // empty constructor
    @Since("7.0")
    public ProtocolEndpoint() {}

    
    // parameterized constructor
    @Since("7.0")
    public ProtocolEndpoint(
        java.util.UUID protocolEndpointID,
        String protocolEndpointState,
        String providerType,
        Long primaryProviderID,
        Long secondaryProviderID,
        String scsiNAADeviceID
    )
    {
        this.protocolEndpointID = protocolEndpointID;
        this.protocolEndpointState = protocolEndpointState;
        this.providerType = providerType;
        this.primaryProviderID = primaryProviderID;
        this.secondaryProviderID = secondaryProviderID;
        this.scsiNAADeviceID = scsiNAADeviceID;
    }

    /** 
     * 
     **/
    public java.util.UUID getProtocolEndpointID() { return this.protocolEndpointID; }
   
    public void setProtocolEndpointID(java.util.UUID protocolEndpointID) { 
        this.protocolEndpointID = protocolEndpointID;
    }
    /** 
     * 
     **/
    public String getProtocolEndpointState() { return this.protocolEndpointState; }
   
    public void setProtocolEndpointState(String protocolEndpointState) { 
        this.protocolEndpointState = protocolEndpointState;
    }
    /** 
     * 
     **/
    public String getProviderType() { return this.providerType; }
   
    public void setProviderType(String providerType) { 
        this.providerType = providerType;
    }
    /** 
     * 
     **/
    public Long getPrimaryProviderID() { return this.primaryProviderID; }
   
    public void setPrimaryProviderID(Long primaryProviderID) { 
        this.primaryProviderID = primaryProviderID;
    }
    /** 
     * 
     **/
    public Long getSecondaryProviderID() { return this.secondaryProviderID; }
   
    public void setSecondaryProviderID(Long secondaryProviderID) { 
        this.secondaryProviderID = secondaryProviderID;
    }
    /** 
     * 
     **/
    public String getScsiNAADeviceID() { return this.scsiNAADeviceID; }
   
    public void setScsiNAADeviceID(String scsiNAADeviceID) { 
        this.scsiNAADeviceID = scsiNAADeviceID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProtocolEndpoint that = (ProtocolEndpoint) o;

        return 
            Objects.equals(protocolEndpointID, that.protocolEndpointID) && 
            Objects.equals(protocolEndpointState, that.protocolEndpointState) && 
            Objects.equals(providerType, that.providerType) && 
            Objects.equals(primaryProviderID, that.primaryProviderID) && 
            Objects.equals(secondaryProviderID, that.secondaryProviderID) && 
            Objects.equals(scsiNAADeviceID, that.scsiNAADeviceID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( protocolEndpointID,protocolEndpointState,providerType,primaryProviderID,secondaryProviderID,scsiNAADeviceID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("protocolEndpointID", protocolEndpointID);
        map.put("protocolEndpointState", protocolEndpointState);
        map.put("providerType", providerType);
        map.put("primaryProviderID", primaryProviderID);
        map.put("secondaryProviderID", secondaryProviderID);
        map.put("scsiNAADeviceID", scsiNAADeviceID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" protocolEndpointID : ").append(gson.toJson(protocolEndpointID)).append(",");
        sb.append(" protocolEndpointState : ").append(gson.toJson(protocolEndpointState)).append(",");
        sb.append(" providerType : ").append(gson.toJson(providerType)).append(",");
        sb.append(" primaryProviderID : ").append(gson.toJson(primaryProviderID)).append(",");
        sb.append(" secondaryProviderID : ").append(gson.toJson(secondaryProviderID)).append(",");
        sb.append(" scsiNAADeviceID : ").append(gson.toJson(scsiNAADeviceID)).append(",");
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
        private String protocolEndpointState;
        private String providerType;
        private Long primaryProviderID;
        private Long secondaryProviderID;
        private String scsiNAADeviceID;

        private Builder() { }

        public ProtocolEndpoint build() {
            return new ProtocolEndpoint (
                         this.protocolEndpointID,
                         this.protocolEndpointState,
                         this.providerType,
                         this.primaryProviderID,
                         this.secondaryProviderID,
                         this.scsiNAADeviceID);
        }

        private ProtocolEndpoint.Builder buildFrom(final ProtocolEndpoint req) {
            this.protocolEndpointID = req.protocolEndpointID;
            this.protocolEndpointState = req.protocolEndpointState;
            this.providerType = req.providerType;
            this.primaryProviderID = req.primaryProviderID;
            this.secondaryProviderID = req.secondaryProviderID;
            this.scsiNAADeviceID = req.scsiNAADeviceID;

            return this;
        }

        public ProtocolEndpoint.Builder protocolEndpointID(final java.util.UUID protocolEndpointID) {
            this.protocolEndpointID = protocolEndpointID;
            return this;
        }

        public ProtocolEndpoint.Builder protocolEndpointState(final String protocolEndpointState) {
            this.protocolEndpointState = protocolEndpointState;
            return this;
        }

        public ProtocolEndpoint.Builder providerType(final String providerType) {
            this.providerType = providerType;
            return this;
        }

        public ProtocolEndpoint.Builder primaryProviderID(final Long primaryProviderID) {
            this.primaryProviderID = primaryProviderID;
            return this;
        }

        public ProtocolEndpoint.Builder secondaryProviderID(final Long secondaryProviderID) {
            this.secondaryProviderID = secondaryProviderID;
            return this;
        }

        public ProtocolEndpoint.Builder scsiNAADeviceID(final String scsiNAADeviceID) {
            this.scsiNAADeviceID = scsiNAADeviceID;
            return this;
        }

    }
}
