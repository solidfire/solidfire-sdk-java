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
 * CreateIdpConfigurationRequest  
 * Create a potential trust relationship for authentication using a third party Identity Provider (IdP) for the cluster.  
 * A SAML Service Provider certificate is required for IdP communication, which will be generated as necessary.
 **/

public class CreateIdpConfigurationRequest implements Serializable {

    public static final long serialVersionUID = 7709337570816590784L;
    @SerializedName("idpName") private String idpName;
    @SerializedName("idpMetadata") private String idpMetadata;
    // empty constructor
    @Since("7.0")
    public CreateIdpConfigurationRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateIdpConfigurationRequest(
        String idpName,
        String idpMetadata
    )
    {
        this.idpName = idpName;
        this.idpMetadata = idpMetadata;
    }

    /** 
     * Name used to identify an IdP provider for SAML 2.0 single sign-on.
     **/
    public String getIdpName() { return this.idpName; }
   
    public void setIdpName(String idpName) { 
        this.idpName = idpName;
    }
    /** 
     * IdP Metadata to store.
     **/
    public String getIdpMetadata() { return this.idpMetadata; }
   
    public void setIdpMetadata(String idpMetadata) { 
        this.idpMetadata = idpMetadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateIdpConfigurationRequest that = (CreateIdpConfigurationRequest) o;

        return 
            Objects.equals(idpName, that.idpName) && 
            Objects.equals(idpMetadata, that.idpMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash( idpName,idpMetadata );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("idpName", idpName);
        map.put("idpMetadata", idpMetadata);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" idpName : ").append(gson.toJson(idpName)).append(",");
        sb.append(" idpMetadata : ").append(gson.toJson(idpMetadata)).append(",");
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
        private String idpName;
        private String idpMetadata;

        private Builder() { }

        public CreateIdpConfigurationRequest build() {
            return new CreateIdpConfigurationRequest (
                         this.idpName,
                         this.idpMetadata);
        }

        private CreateIdpConfigurationRequest.Builder buildFrom(final CreateIdpConfigurationRequest req) {
            this.idpName = req.idpName;
            this.idpMetadata = req.idpMetadata;

            return this;
        }

        public CreateIdpConfigurationRequest.Builder idpName(final String idpName) {
            this.idpName = idpName;
            return this;
        }

        public CreateIdpConfigurationRequest.Builder idpMetadata(final String idpMetadata) {
            this.idpMetadata = idpMetadata;
            return this;
        }

    }
}
