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
 * IdpConfigInfo  
 * Configuration and integration details regarding a third party Identity Provider (IdP).
 **/

public class IdpConfigInfo implements Serializable {

    public static final long serialVersionUID = -2334815507025672785L;
    @SerializedName("idpConfigurationID") private java.util.UUID idpConfigurationID;
    @SerializedName("idpName") private String idpName;
    @SerializedName("idpMetadata") private String idpMetadata;
    @SerializedName("spMetadataUrl") private String spMetadataUrl;
    @SerializedName("serviceProviderCertificate") private String serviceProviderCertificate;
    @SerializedName("enabled") private Boolean enabled;
    // empty constructor
    @Since("7.0")
    public IdpConfigInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public IdpConfigInfo(
        java.util.UUID idpConfigurationID,
        String idpName,
        String idpMetadata,
        String spMetadataUrl,
        String serviceProviderCertificate,
        Boolean enabled
    )
    {
        this.idpConfigurationID = idpConfigurationID;
        this.idpName = idpName;
        this.idpMetadata = idpMetadata;
        this.spMetadataUrl = spMetadataUrl;
        this.serviceProviderCertificate = serviceProviderCertificate;
        this.enabled = enabled;
    }

    /** 
     * UUID for the third party Identity Provider (IdP) Configuration.
     **/
    public java.util.UUID getIdpConfigurationID() { return this.idpConfigurationID; }
   
    public void setIdpConfigurationID(java.util.UUID idpConfigurationID) { 
        this.idpConfigurationID = idpConfigurationID;
    }
    /** 
     * Name for retrieving IdP provider for SAML 2.0 single sign-on.
     **/
    public String getIdpName() { return this.idpName; }
   
    public void setIdpName(String idpName) { 
        this.idpName = idpName;
    }
    /** 
     * Metadata for configuration and integration details for SAML 2.0 single sign-on.
     **/
    public String getIdpMetadata() { return this.idpMetadata; }
   
    public void setIdpMetadata(String idpMetadata) { 
        this.idpMetadata = idpMetadata;
    }
    /** 
     * URL for retrieving Service Provider (SP) Metadata from the Cluster to provide to the IdP for establish a trust relationship.
     **/
    public String getSpMetadataUrl() { return this.spMetadataUrl; }
   
    public void setSpMetadataUrl(String spMetadataUrl) { 
        this.spMetadataUrl = spMetadataUrl;
    }
    /** 
     * A PEM format Base64 encoded PKCS#10 X.509 certificate to be used for communication with this IDP.
     **/
    public String getServiceProviderCertificate() { return this.serviceProviderCertificate; }
   
    public void setServiceProviderCertificate(String serviceProviderCertificate) { 
        this.serviceProviderCertificate = serviceProviderCertificate;
    }
    /** 
     * Whether this third party Identity Provider configuration is enabled.
     **/
    public Boolean getEnabled() { return this.enabled; }
   
    public void setEnabled(Boolean enabled) { 
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdpConfigInfo that = (IdpConfigInfo) o;

        return 
            Objects.equals(idpConfigurationID, that.idpConfigurationID) && 
            Objects.equals(idpName, that.idpName) && 
            Objects.equals(idpMetadata, that.idpMetadata) && 
            Objects.equals(spMetadataUrl, that.spMetadataUrl) && 
            Objects.equals(serviceProviderCertificate, that.serviceProviderCertificate) && 
            Objects.equals(enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash( idpConfigurationID,idpName,idpMetadata,spMetadataUrl,serviceProviderCertificate,enabled );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("idpConfigurationID", idpConfigurationID);
        map.put("idpName", idpName);
        map.put("idpMetadata", idpMetadata);
        map.put("spMetadataUrl", spMetadataUrl);
        map.put("serviceProviderCertificate", serviceProviderCertificate);
        map.put("enabled", enabled);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" idpConfigurationID : ").append(gson.toJson(idpConfigurationID)).append(",");
        sb.append(" idpName : ").append(gson.toJson(idpName)).append(",");
        sb.append(" idpMetadata : ").append(gson.toJson(idpMetadata)).append(",");
        sb.append(" spMetadataUrl : ").append(gson.toJson(spMetadataUrl)).append(",");
        sb.append(" serviceProviderCertificate : ").append(gson.toJson(serviceProviderCertificate)).append(",");
        sb.append(" enabled : ").append(gson.toJson(enabled)).append(",");
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
        private java.util.UUID idpConfigurationID;
        private String idpName;
        private String idpMetadata;
        private String spMetadataUrl;
        private String serviceProviderCertificate;
        private Boolean enabled;

        private Builder() { }

        public IdpConfigInfo build() {
            return new IdpConfigInfo (
                         this.idpConfigurationID,
                         this.idpName,
                         this.idpMetadata,
                         this.spMetadataUrl,
                         this.serviceProviderCertificate,
                         this.enabled);
        }

        private IdpConfigInfo.Builder buildFrom(final IdpConfigInfo req) {
            this.idpConfigurationID = req.idpConfigurationID;
            this.idpName = req.idpName;
            this.idpMetadata = req.idpMetadata;
            this.spMetadataUrl = req.spMetadataUrl;
            this.serviceProviderCertificate = req.serviceProviderCertificate;
            this.enabled = req.enabled;

            return this;
        }

        public IdpConfigInfo.Builder idpConfigurationID(final java.util.UUID idpConfigurationID) {
            this.idpConfigurationID = idpConfigurationID;
            return this;
        }

        public IdpConfigInfo.Builder idpName(final String idpName) {
            this.idpName = idpName;
            return this;
        }

        public IdpConfigInfo.Builder idpMetadata(final String idpMetadata) {
            this.idpMetadata = idpMetadata;
            return this;
        }

        public IdpConfigInfo.Builder spMetadataUrl(final String spMetadataUrl) {
            this.spMetadataUrl = spMetadataUrl;
            return this;
        }

        public IdpConfigInfo.Builder serviceProviderCertificate(final String serviceProviderCertificate) {
            this.serviceProviderCertificate = serviceProviderCertificate;
            return this;
        }

        public IdpConfigInfo.Builder enabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

    }
}
