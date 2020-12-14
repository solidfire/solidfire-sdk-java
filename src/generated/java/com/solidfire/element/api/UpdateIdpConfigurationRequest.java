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
 * UpdateIdpConfigurationRequest  
 * Update an existing configuration with a third party Identity Provider (IdP) for the cluster.
 **/

public class UpdateIdpConfigurationRequest implements Serializable {

    public static final long serialVersionUID = -3904100497247730739L;
    @SerializedName("idpConfigurationID") private Optional<java.util.UUID> idpConfigurationID;
    @SerializedName("idpName") private Optional<String> idpName;
    @SerializedName("newIdpName") private Optional<String> newIdpName;
    @SerializedName("idpMetadata") private Optional<String> idpMetadata;
    @SerializedName("generateNewCertificate") private Optional<Boolean> generateNewCertificate;
    // empty constructor
    @Since("7.0")
    public UpdateIdpConfigurationRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public UpdateIdpConfigurationRequest(
        Optional<java.util.UUID> idpConfigurationID,
        Optional<String> idpName,
        Optional<String> newIdpName,
        Optional<String> idpMetadata,
        Optional<Boolean> generateNewCertificate
    )
    {
        this.idpConfigurationID = (idpConfigurationID == null) ? Optional.<java.util.UUID>empty() : idpConfigurationID;
        this.idpName = (idpName == null) ? Optional.<String>empty() : idpName;
        this.newIdpName = (newIdpName == null) ? Optional.<String>empty() : newIdpName;
        this.idpMetadata = (idpMetadata == null) ? Optional.<String>empty() : idpMetadata;
        this.generateNewCertificate = (generateNewCertificate == null) ? Optional.<Boolean>empty() : generateNewCertificate;
    }

    /** 
     * UUID for the third party Identity Provider (IdP) Configuration.
     **/
    public Optional<java.util.UUID> getIdpConfigurationID() { return this.idpConfigurationID; }
   
    public void setIdpConfigurationID(Optional<java.util.UUID> idpConfigurationID) { 
        this.idpConfigurationID = (idpConfigurationID == null) ? Optional.<java.util.UUID>empty() : idpConfigurationID;
    }
    /** 
     * Name for identifying and retrieving IdP provider for SAML 2.0 single sign-on.
     **/
    public Optional<String> getIdpName() { return this.idpName; }
   
    public void setIdpName(Optional<String> idpName) { 
        this.idpName = (idpName == null) ? Optional.<String>empty() : idpName;
    }
    /** 
     * If specified replaces the IdP name.
     **/
    public Optional<String> getNewIdpName() { return this.newIdpName; }
   
    public void setNewIdpName(Optional<String> newIdpName) { 
        this.newIdpName = (newIdpName == null) ? Optional.<String>empty() : newIdpName;
    }
    /** 
     * IdP Metadata for configuration and integration details for SAML 2.0 single sign-on.
     **/
    public Optional<String> getIdpMetadata() { return this.idpMetadata; }
   
    public void setIdpMetadata(Optional<String> idpMetadata) { 
        this.idpMetadata = (idpMetadata == null) ? Optional.<String>empty() : idpMetadata;
    }
    /** 
     * If true, generate new SAML key/certificate and replace the existing pair. 
     * NOTE: Replacing the existing certificate will disrupt the established trust between the Cluster and the Idp until Cluster's Service Provider metadata is reloaded at the Idp
     * If not provided or false, the SAML certificate and key will remain unchanged.
     **/
    public Optional<Boolean> getGenerateNewCertificate() { return this.generateNewCertificate; }
   
    public void setGenerateNewCertificate(Optional<Boolean> generateNewCertificate) { 
        this.generateNewCertificate = (generateNewCertificate == null) ? Optional.<Boolean>empty() : generateNewCertificate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpdateIdpConfigurationRequest that = (UpdateIdpConfigurationRequest) o;

        return 
            Objects.equals(idpConfigurationID, that.idpConfigurationID) && 
            Objects.equals(idpName, that.idpName) && 
            Objects.equals(newIdpName, that.newIdpName) && 
            Objects.equals(idpMetadata, that.idpMetadata) && 
            Objects.equals(generateNewCertificate, that.generateNewCertificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash( idpConfigurationID,idpName,newIdpName,idpMetadata,generateNewCertificate );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("idpConfigurationID", idpConfigurationID);
        map.put("idpName", idpName);
        map.put("newIdpName", newIdpName);
        map.put("idpMetadata", idpMetadata);
        map.put("generateNewCertificate", generateNewCertificate);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != idpConfigurationID && idpConfigurationID.isPresent()){
            sb.append(" idpConfigurationID : ").append(gson.toJson(idpConfigurationID)).append(",");
        }
        else{
            sb.append(" idpConfigurationID : ").append("null").append(",");
        }
        if(null != idpName && idpName.isPresent()){
            sb.append(" idpName : ").append(gson.toJson(idpName)).append(",");
        }
        else{
            sb.append(" idpName : ").append("null").append(",");
        }
        if(null != newIdpName && newIdpName.isPresent()){
            sb.append(" newIdpName : ").append(gson.toJson(newIdpName)).append(",");
        }
        else{
            sb.append(" newIdpName : ").append("null").append(",");
        }
        if(null != idpMetadata && idpMetadata.isPresent()){
            sb.append(" idpMetadata : ").append(gson.toJson(idpMetadata)).append(",");
        }
        else{
            sb.append(" idpMetadata : ").append("null").append(",");
        }
        if(null != generateNewCertificate && generateNewCertificate.isPresent()){
            sb.append(" generateNewCertificate : ").append(gson.toJson(generateNewCertificate)).append(",");
        }
        else{
            sb.append(" generateNewCertificate : ").append("null").append(",");
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
        private Optional<java.util.UUID> idpConfigurationID;
        private Optional<String> idpName;
        private Optional<String> newIdpName;
        private Optional<String> idpMetadata;
        private Optional<Boolean> generateNewCertificate;

        private Builder() { }

        public UpdateIdpConfigurationRequest build() {
            return new UpdateIdpConfigurationRequest (
                         this.idpConfigurationID,
                         this.idpName,
                         this.newIdpName,
                         this.idpMetadata,
                         this.generateNewCertificate);
        }

        private UpdateIdpConfigurationRequest.Builder buildFrom(final UpdateIdpConfigurationRequest req) {
            this.idpConfigurationID = req.idpConfigurationID;
            this.idpName = req.idpName;
            this.newIdpName = req.newIdpName;
            this.idpMetadata = req.idpMetadata;
            this.generateNewCertificate = req.generateNewCertificate;

            return this;
        }

        public UpdateIdpConfigurationRequest.Builder optionalIdpConfigurationID(final java.util.UUID idpConfigurationID) {
            this.idpConfigurationID = (idpConfigurationID == null) ? Optional.<java.util.UUID>empty() : Optional.of(idpConfigurationID);
            return this;
        }

        public UpdateIdpConfigurationRequest.Builder optionalIdpName(final String idpName) {
            this.idpName = (idpName == null) ? Optional.<String>empty() : Optional.of(idpName);
            return this;
        }

        public UpdateIdpConfigurationRequest.Builder optionalNewIdpName(final String newIdpName) {
            this.newIdpName = (newIdpName == null) ? Optional.<String>empty() : Optional.of(newIdpName);
            return this;
        }

        public UpdateIdpConfigurationRequest.Builder optionalIdpMetadata(final String idpMetadata) {
            this.idpMetadata = (idpMetadata == null) ? Optional.<String>empty() : Optional.of(idpMetadata);
            return this;
        }

        public UpdateIdpConfigurationRequest.Builder optionalGenerateNewCertificate(final Boolean generateNewCertificate) {
            this.generateNewCertificate = (generateNewCertificate == null) ? Optional.<Boolean>empty() : Optional.of(generateNewCertificate);
            return this;
        }

    }
}
