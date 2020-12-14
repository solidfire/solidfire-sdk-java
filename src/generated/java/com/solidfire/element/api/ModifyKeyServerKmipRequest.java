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
 * ModifyKeyServerKmipRequest  
 * Modifies a KMIP (Key Management Interoperability Protocol) Key Server to the specified attributes. The only required parameter is the keyServerID. A request which contains only the keyServerID will be a no-op and no error will be returned. Any other parameters which are specified will replace the existing values on the KMIP Key Server with the specified keyServerID. Because this server might be part of an active provider this will result in contacting the server to verify it's functional. Multiple hostnames or IP addresses must only be provided to the kmipKeyServerHostnames parameter if the key servers are in a clustered configuration.
 **/

public class ModifyKeyServerKmipRequest implements Serializable {

    public static final long serialVersionUID = 9000193726892327532L;
    @SerializedName("kmipCaCertificate") private Optional<String> kmipCaCertificate;
    @SerializedName("kmipClientCertificate") private Optional<String> kmipClientCertificate;
    @SerializedName("kmipKeyServerHostnames") private Optional<String[]> kmipKeyServerHostnames;
    @SerializedName("keyServerID") private Long keyServerID;
    @SerializedName("kmipKeyServerName") private Optional<String> kmipKeyServerName;
    @SerializedName("kmipKeyServerPort") private Optional<Long> kmipKeyServerPort;
    // empty constructor
    @Since("7.0")
    public ModifyKeyServerKmipRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyKeyServerKmipRequest(
        Optional<String> kmipCaCertificate,
        Optional<String> kmipClientCertificate,
        Optional<String[]> kmipKeyServerHostnames,
        Long keyServerID,
        Optional<String> kmipKeyServerName,
        Optional<Long> kmipKeyServerPort
    )
    {
        this.kmipCaCertificate = (kmipCaCertificate == null) ? Optional.<String>empty() : kmipCaCertificate;
        this.kmipClientCertificate = (kmipClientCertificate == null) ? Optional.<String>empty() : kmipClientCertificate;
        this.kmipKeyServerHostnames = (kmipKeyServerHostnames == null) ? Optional.<String[]>empty() : kmipKeyServerHostnames;
        this.keyServerID = keyServerID;
        this.kmipKeyServerName = (kmipKeyServerName == null) ? Optional.<String>empty() : kmipKeyServerName;
        this.kmipKeyServerPort = (kmipKeyServerPort == null) ? Optional.<Long>empty() : kmipKeyServerPort;
    }

    /** 
     * The public key certificate of the external key server's root CA.
     * This will be used to verify the certificate presented by external key server in the TLS communication.
     * For key server clusters where individual servers use different CAs, provide a concatenated string containing the root certificates of all the CAs.
     **/
    public Optional<String> getKmipCaCertificate() { return this.kmipCaCertificate; }
   
    public void setKmipCaCertificate(Optional<String> kmipCaCertificate) { 
        this.kmipCaCertificate = (kmipCaCertificate == null) ? Optional.<String>empty() : kmipCaCertificate;
    }
    /** 
     * A PEM format Base64 encoded PKCS#10 X.509 certificate used by the Solidfire KMIP client.
     **/
    public Optional<String> getKmipClientCertificate() { return this.kmipClientCertificate; }
   
    public void setKmipClientCertificate(Optional<String> kmipClientCertificate) { 
        this.kmipClientCertificate = (kmipClientCertificate == null) ? Optional.<String>empty() : kmipClientCertificate;
    }
    /** 
     * Array of the hostnames or IP addresses associated with this KMIP Key Server. Multiple hostnames or IP addresses
     * must only be provided if the key servers are in a clustered configuration.
     **/
    public Optional<String[]> getKmipKeyServerHostnames() { return this.kmipKeyServerHostnames; }
   
    public void setKmipKeyServerHostnames(Optional<String[]> kmipKeyServerHostnames) { 
        this.kmipKeyServerHostnames = (kmipKeyServerHostnames == null) ? Optional.<String[]>empty() : kmipKeyServerHostnames;
    }
    /** 
     * The ID of the KMIP Key Server to modify.
     **/
    public Long getKeyServerID() { return this.keyServerID; }
   
    public void setKeyServerID(Long keyServerID) { 
        this.keyServerID = keyServerID;
    }
    /** 
     * The name of the KMIP Key Server.  This name is only used for display purposes and does not need to be unique.
     **/
    public Optional<String> getKmipKeyServerName() { return this.kmipKeyServerName; }
   
    public void setKmipKeyServerName(Optional<String> kmipKeyServerName) { 
        this.kmipKeyServerName = (kmipKeyServerName == null) ? Optional.<String>empty() : kmipKeyServerName;
    }
    /** 
     * The port number associated with this KMIP Key Server (typically 5696).
     **/
    public Optional<Long> getKmipKeyServerPort() { return this.kmipKeyServerPort; }
   
    public void setKmipKeyServerPort(Optional<Long> kmipKeyServerPort) { 
        this.kmipKeyServerPort = (kmipKeyServerPort == null) ? Optional.<Long>empty() : kmipKeyServerPort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyKeyServerKmipRequest that = (ModifyKeyServerKmipRequest) o;

        return 
            Objects.equals(kmipCaCertificate, that.kmipCaCertificate) && 
            Objects.equals(kmipClientCertificate, that.kmipClientCertificate) && 
            Objects.equals(kmipKeyServerHostnames, that.kmipKeyServerHostnames) && 
            Objects.equals(keyServerID, that.keyServerID) && 
            Objects.equals(kmipKeyServerName, that.kmipKeyServerName) && 
            Objects.equals(kmipKeyServerPort, that.kmipKeyServerPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash( kmipCaCertificate,kmipClientCertificate,kmipKeyServerHostnames,keyServerID,kmipKeyServerName,kmipKeyServerPort );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
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

        if(null != kmipCaCertificate && kmipCaCertificate.isPresent()){
            sb.append(" kmipCaCertificate : ").append(gson.toJson(kmipCaCertificate)).append(",");
        }
        else{
            sb.append(" kmipCaCertificate : ").append("null").append(",");
        }
        if(null != kmipClientCertificate && kmipClientCertificate.isPresent()){
            sb.append(" kmipClientCertificate : ").append(gson.toJson(kmipClientCertificate)).append(",");
        }
        else{
            sb.append(" kmipClientCertificate : ").append("null").append(",");
        }
        if(null != kmipKeyServerHostnames && kmipKeyServerHostnames.isPresent()){
            sb.append(" kmipKeyServerHostnames : ").append(gson.toJson(kmipKeyServerHostnames)).append(",");
        }
        else{
            sb.append(" kmipKeyServerHostnames : ").append("null").append(",");
        }
        sb.append(" keyServerID : ").append(gson.toJson(keyServerID)).append(",");
        if(null != kmipKeyServerName && kmipKeyServerName.isPresent()){
            sb.append(" kmipKeyServerName : ").append(gson.toJson(kmipKeyServerName)).append(",");
        }
        else{
            sb.append(" kmipKeyServerName : ").append("null").append(",");
        }
        if(null != kmipKeyServerPort && kmipKeyServerPort.isPresent()){
            sb.append(" kmipKeyServerPort : ").append(gson.toJson(kmipKeyServerPort)).append(",");
        }
        else{
            sb.append(" kmipKeyServerPort : ").append("null").append(",");
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
        private Optional<String> kmipCaCertificate;
        private Optional<String> kmipClientCertificate;
        private Optional<String[]> kmipKeyServerHostnames;
        private Long keyServerID;
        private Optional<String> kmipKeyServerName;
        private Optional<Long> kmipKeyServerPort;

        private Builder() { }

        public ModifyKeyServerKmipRequest build() {
            return new ModifyKeyServerKmipRequest (
                         this.kmipCaCertificate,
                         this.kmipClientCertificate,
                         this.kmipKeyServerHostnames,
                         this.keyServerID,
                         this.kmipKeyServerName,
                         this.kmipKeyServerPort);
        }

        private ModifyKeyServerKmipRequest.Builder buildFrom(final ModifyKeyServerKmipRequest req) {
            this.kmipCaCertificate = req.kmipCaCertificate;
            this.kmipClientCertificate = req.kmipClientCertificate;
            this.kmipKeyServerHostnames = req.kmipKeyServerHostnames;
            this.keyServerID = req.keyServerID;
            this.kmipKeyServerName = req.kmipKeyServerName;
            this.kmipKeyServerPort = req.kmipKeyServerPort;

            return this;
        }

        public ModifyKeyServerKmipRequest.Builder optionalKmipCaCertificate(final String kmipCaCertificate) {
            this.kmipCaCertificate = (kmipCaCertificate == null) ? Optional.<String>empty() : Optional.of(kmipCaCertificate);
            return this;
        }

        public ModifyKeyServerKmipRequest.Builder optionalKmipClientCertificate(final String kmipClientCertificate) {
            this.kmipClientCertificate = (kmipClientCertificate == null) ? Optional.<String>empty() : Optional.of(kmipClientCertificate);
            return this;
        }

        public ModifyKeyServerKmipRequest.Builder optionalKmipKeyServerHostnames(final String[] kmipKeyServerHostnames) {
            this.kmipKeyServerHostnames = (kmipKeyServerHostnames == null) ? Optional.<String[]>empty() : Optional.of(kmipKeyServerHostnames);
            return this;
        }

        public ModifyKeyServerKmipRequest.Builder keyServerID(final Long keyServerID) {
            this.keyServerID = keyServerID;
            return this;
        }

        public ModifyKeyServerKmipRequest.Builder optionalKmipKeyServerName(final String kmipKeyServerName) {
            this.kmipKeyServerName = (kmipKeyServerName == null) ? Optional.<String>empty() : Optional.of(kmipKeyServerName);
            return this;
        }

        public ModifyKeyServerKmipRequest.Builder optionalKmipKeyServerPort(final Long kmipKeyServerPort) {
            this.kmipKeyServerPort = (kmipKeyServerPort == null) ? Optional.<Long>empty() : Optional.of(kmipKeyServerPort);
            return this;
        }

    }
}
