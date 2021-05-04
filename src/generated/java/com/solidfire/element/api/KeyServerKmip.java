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
 * KeyServerKmip  
 * A KMIP (Key Management Interoperability Protocol) Key Server describes a location for retrieving authentication keys for use with cluster features such as Encryption At Rest.
 **/

public class KeyServerKmip implements Serializable {

    public static final long serialVersionUID = 5953502434508144171L;
    @SerializedName("keyProviderID") private Optional<Long> keyProviderID;
    @SerializedName("kmipAssignedProviderIsActive") private Optional<Boolean> kmipAssignedProviderIsActive;
    @SerializedName("kmipCaCertificate") private String kmipCaCertificate;
    @SerializedName("kmipClientCertificate") private String kmipClientCertificate;
    @SerializedName("kmipKeyServerHostnames") private String[] kmipKeyServerHostnames;
    @SerializedName("keyServerID") private Long keyServerID;
    @SerializedName("kmipKeyServerName") private String kmipKeyServerName;
    @SerializedName("kmipKeyServerPort") private Long kmipKeyServerPort;
    // empty constructor
    @Since("7.0")
    public KeyServerKmip() {}

    
    // parameterized constructor
    @Since("7.0")
    public KeyServerKmip(
        Optional<Long> keyProviderID,
        Optional<Boolean> kmipAssignedProviderIsActive,
        String kmipCaCertificate,
        String kmipClientCertificate,
        String[] kmipKeyServerHostnames,
        Long keyServerID,
        String kmipKeyServerName,
        Long kmipKeyServerPort
    )
    {
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
        this.kmipAssignedProviderIsActive = (kmipAssignedProviderIsActive == null) ? Optional.<Boolean>empty() : kmipAssignedProviderIsActive;
        this.kmipCaCertificate = kmipCaCertificate;
        this.kmipClientCertificate = kmipClientCertificate;
        this.kmipKeyServerHostnames = kmipKeyServerHostnames;
        this.keyServerID = keyServerID;
        this.kmipKeyServerName = kmipKeyServerName;
        this.kmipKeyServerPort = kmipKeyServerPort;
    }

    /** 
     * If this KMIP Key Server is assigned to a provider, this field will contain the ID of the KMIP Key Provider it's assigned to.  Otherwise it will be null.
     **/
    public Optional<Long> getKeyProviderID() { return this.keyProviderID; }
   
    public void setKeyProviderID(Optional<Long> keyProviderID) { 
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
    }
    /** 
     * If this KMIP Key Server is assigned to a provider (keyProviderID is not null), this field will indicate whether that provider is active (providing keys which are currently in use).  Otherwise it will be null.
     **/
    public Optional<Boolean> getKmipAssignedProviderIsActive() { return this.kmipAssignedProviderIsActive; }
   
    public void setKmipAssignedProviderIsActive(Optional<Boolean> kmipAssignedProviderIsActive) { 
        this.kmipAssignedProviderIsActive = (kmipAssignedProviderIsActive == null) ? Optional.<Boolean>empty() : kmipAssignedProviderIsActive;
    }
    /** 
     * The public key certificate of the external key server's root CA.
     * This will be used to verify the certificate presented by external key server in the TLS communication.
     * For key server clusters where individual servers use different CAs, provide a concatenated string containing the root certificates of all the CAs.
     **/
    public String getKmipCaCertificate() { return this.kmipCaCertificate; }
   
    public void setKmipCaCertificate(String kmipCaCertificate) { 
        this.kmipCaCertificate = kmipCaCertificate;
    }
    /** 
     * A PEM format Base64 encoded PKCS#10 X.509 certificate used by the Solidfire KMIP client.
     **/
    public String getKmipClientCertificate() { return this.kmipClientCertificate; }
   
    public void setKmipClientCertificate(String kmipClientCertificate) { 
        this.kmipClientCertificate = kmipClientCertificate;
    }
    /** 
     * The hostnames or IP addresses associated with this KMIP Key Server.
     **/
    public String[] getKmipKeyServerHostnames() { return this.kmipKeyServerHostnames; }
   
    public void setKmipKeyServerHostnames(String[] kmipKeyServerHostnames) { 
        this.kmipKeyServerHostnames = kmipKeyServerHostnames;
    }
    /** 
     * The ID of the KMIP Key Server.  This is a unique value assigned by the cluster during CreateKeyServer which cannot be changedKmip.
     **/
    public Long getKeyServerID() { return this.keyServerID; }
   
    public void setKeyServerID(Long keyServerID) { 
        this.keyServerID = keyServerID;
    }
    /** 
     * The name of the KMIP Key Server.  This name is only used for display purposes and does not need to be unique.
     **/
    public String getKmipKeyServerName() { return this.kmipKeyServerName; }
   
    public void setKmipKeyServerName(String kmipKeyServerName) { 
        this.kmipKeyServerName = kmipKeyServerName;
    }
    /** 
     * The port number associated with this KMIP Key Server (typically 5696).
     **/
    public Long getKmipKeyServerPort() { return this.kmipKeyServerPort; }
   
    public void setKmipKeyServerPort(Long kmipKeyServerPort) { 
        this.kmipKeyServerPort = kmipKeyServerPort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KeyServerKmip that = (KeyServerKmip) o;

        return 
            Objects.equals(keyProviderID, that.keyProviderID) && 
            Objects.equals(kmipAssignedProviderIsActive, that.kmipAssignedProviderIsActive) && 
            Objects.equals(kmipCaCertificate, that.kmipCaCertificate) && 
            Objects.equals(kmipClientCertificate, that.kmipClientCertificate) && 
            Arrays.equals(kmipKeyServerHostnames, that.kmipKeyServerHostnames) && 
            Objects.equals(keyServerID, that.keyServerID) && 
            Objects.equals(kmipKeyServerName, that.kmipKeyServerName) && 
            Objects.equals(kmipKeyServerPort, that.kmipKeyServerPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash( keyProviderID,kmipAssignedProviderIsActive,kmipCaCertificate,kmipClientCertificate,(Object[])kmipKeyServerHostnames,keyServerID,kmipKeyServerName,kmipKeyServerPort );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("keyProviderID", keyProviderID);
        map.put("kmipAssignedProviderIsActive", kmipAssignedProviderIsActive);
        map.put("kmipCaCertificate", kmipCaCertificate);
        map.put("kmipClientCertificate", kmipClientCertificate);
        map.put("kmipKeyServerHostnames", kmipKeyServerHostnames);
        map.put("keyServerID", keyServerID);
        map.put("kmipKeyServerName", kmipKeyServerName);
        map.put("kmipKeyServerPort", kmipKeyServerPort);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != keyProviderID && keyProviderID.isPresent()){
            sb.append(" keyProviderID : ").append(gson.toJson(keyProviderID)).append(",");
        }
        else{
            sb.append(" keyProviderID : ").append("null").append(",");
        }
        if(null != kmipAssignedProviderIsActive && kmipAssignedProviderIsActive.isPresent()){
            sb.append(" kmipAssignedProviderIsActive : ").append(gson.toJson(kmipAssignedProviderIsActive)).append(",");
        }
        else{
            sb.append(" kmipAssignedProviderIsActive : ").append("null").append(",");
        }
        sb.append(" kmipCaCertificate : ").append(gson.toJson(kmipCaCertificate)).append(",");
        sb.append(" kmipClientCertificate : ").append(gson.toJson(kmipClientCertificate)).append(",");
        sb.append(" kmipKeyServerHostnames : ").append(gson.toJson(Arrays.toString(kmipKeyServerHostnames))).append(",");
        sb.append(" keyServerID : ").append(gson.toJson(keyServerID)).append(",");
        sb.append(" kmipKeyServerName : ").append(gson.toJson(kmipKeyServerName)).append(",");
        sb.append(" kmipKeyServerPort : ").append(gson.toJson(kmipKeyServerPort)).append(",");
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
        private Optional<Long> keyProviderID;
        private Optional<Boolean> kmipAssignedProviderIsActive;
        private String kmipCaCertificate;
        private String kmipClientCertificate;
        private String[] kmipKeyServerHostnames;
        private Long keyServerID;
        private String kmipKeyServerName;
        private Long kmipKeyServerPort;

        private Builder() { }

        public KeyServerKmip build() {
            return new KeyServerKmip (
                         this.keyProviderID,
                         this.kmipAssignedProviderIsActive,
                         this.kmipCaCertificate,
                         this.kmipClientCertificate,
                         this.kmipKeyServerHostnames,
                         this.keyServerID,
                         this.kmipKeyServerName,
                         this.kmipKeyServerPort);
        }

        private KeyServerKmip.Builder buildFrom(final KeyServerKmip req) {
            this.keyProviderID = req.keyProviderID;
            this.kmipAssignedProviderIsActive = req.kmipAssignedProviderIsActive;
            this.kmipCaCertificate = req.kmipCaCertificate;
            this.kmipClientCertificate = req.kmipClientCertificate;
            this.kmipKeyServerHostnames = req.kmipKeyServerHostnames;
            this.keyServerID = req.keyServerID;
            this.kmipKeyServerName = req.kmipKeyServerName;
            this.kmipKeyServerPort = req.kmipKeyServerPort;

            return this;
        }

        public KeyServerKmip.Builder optionalKeyProviderID(final Long keyProviderID) {
            this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : Optional.of(keyProviderID);
            return this;
        }

        public KeyServerKmip.Builder optionalKmipAssignedProviderIsActive(final Boolean kmipAssignedProviderIsActive) {
            this.kmipAssignedProviderIsActive = (kmipAssignedProviderIsActive == null) ? Optional.<Boolean>empty() : Optional.of(kmipAssignedProviderIsActive);
            return this;
        }

        public KeyServerKmip.Builder kmipCaCertificate(final String kmipCaCertificate) {
            this.kmipCaCertificate = kmipCaCertificate;
            return this;
        }

        public KeyServerKmip.Builder kmipClientCertificate(final String kmipClientCertificate) {
            this.kmipClientCertificate = kmipClientCertificate;
            return this;
        }

        public KeyServerKmip.Builder kmipKeyServerHostnames(final String[] kmipKeyServerHostnames) {
            this.kmipKeyServerHostnames = kmipKeyServerHostnames;
            return this;
        }

        public KeyServerKmip.Builder keyServerID(final Long keyServerID) {
            this.keyServerID = keyServerID;
            return this;
        }

        public KeyServerKmip.Builder kmipKeyServerName(final String kmipKeyServerName) {
            this.kmipKeyServerName = kmipKeyServerName;
            return this;
        }

        public KeyServerKmip.Builder kmipKeyServerPort(final Long kmipKeyServerPort) {
            this.kmipKeyServerPort = kmipKeyServerPort;
            return this;
        }

    }
}
