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
 * DeleteIdpConfigurationRequest  
 * Delete an existing configuration with a third party Identity Provider (IdP) for the cluster.
 * Deleting the last IdP Configuration will remove the SAML Service Provider certificate from the cluster.
 **/

public class DeleteIdpConfigurationRequest implements Serializable {

    public static final long serialVersionUID = 6357297076062080593L;
    @SerializedName("idpConfigurationID") private Optional<java.util.UUID> idpConfigurationID;
    @SerializedName("idpName") private Optional<String> idpName;
    // empty constructor
    @Since("7.0")
    public DeleteIdpConfigurationRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteIdpConfigurationRequest(
        Optional<java.util.UUID> idpConfigurationID,
        Optional<String> idpName
    )
    {
        this.idpConfigurationID = (idpConfigurationID == null) ? Optional.<java.util.UUID>empty() : idpConfigurationID;
        this.idpName = (idpName == null) ? Optional.<String>empty() : idpName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteIdpConfigurationRequest that = (DeleteIdpConfigurationRequest) o;

        return 
            Objects.equals(idpConfigurationID, that.idpConfigurationID) && 
            Objects.equals(idpName, that.idpName);
    }

    @Override
    public int hashCode() {
        return Objects.hash( idpConfigurationID,idpName );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("idpConfigurationID", idpConfigurationID);
        map.put("idpName", idpName);
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

        private Builder() { }

        public DeleteIdpConfigurationRequest build() {
            return new DeleteIdpConfigurationRequest (
                         this.idpConfigurationID,
                         this.idpName);
        }

        private DeleteIdpConfigurationRequest.Builder buildFrom(final DeleteIdpConfigurationRequest req) {
            this.idpConfigurationID = req.idpConfigurationID;
            this.idpName = req.idpName;

            return this;
        }

        public DeleteIdpConfigurationRequest.Builder optionalIdpConfigurationID(final java.util.UUID idpConfigurationID) {
            this.idpConfigurationID = (idpConfigurationID == null) ? Optional.<java.util.UUID>empty() : Optional.of(idpConfigurationID);
            return this;
        }

        public DeleteIdpConfigurationRequest.Builder optionalIdpName(final String idpName) {
            this.idpName = (idpName == null) ? Optional.<String>empty() : Optional.of(idpName);
            return this;
        }

    }
}
