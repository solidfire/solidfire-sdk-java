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
 * EnableIdpAuthenticationRequest  
 * Enable support for authentication using a third party Identity Provider (IdP) for the cluster.
 * Once IdP authentication is enabled, cluster and Ldap admins will no longer be able to access the cluster via supported UIs and any active authenticated sessions will be invalidated/logged out.
 * Only third party IdP authenticated users will be able to access the cluster via the supported UIs.
 **/

public class EnableIdpAuthenticationRequest implements Serializable {

    public static final long serialVersionUID = -498326757677396229L;
    @SerializedName("idpConfigurationID") private Optional<java.util.UUID> idpConfigurationID;
    // empty constructor
    @Since("7.0")
    public EnableIdpAuthenticationRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public EnableIdpAuthenticationRequest(
        Optional<java.util.UUID> idpConfigurationID
    )
    {
        this.idpConfigurationID = (idpConfigurationID == null) ? Optional.<java.util.UUID>empty() : idpConfigurationID;
    }

    /** 
     * UUID for the third party Identity Provider (IdP) Configuration.  
     * If only one IdP Configuration exists, then we will default to enabling that configuration.
     **/
    public Optional<java.util.UUID> getIdpConfigurationID() { return this.idpConfigurationID; }
   
    public void setIdpConfigurationID(Optional<java.util.UUID> idpConfigurationID) { 
        this.idpConfigurationID = (idpConfigurationID == null) ? Optional.<java.util.UUID>empty() : idpConfigurationID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnableIdpAuthenticationRequest that = (EnableIdpAuthenticationRequest) o;

        return 
            Objects.equals(idpConfigurationID, that.idpConfigurationID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( idpConfigurationID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("idpConfigurationID", idpConfigurationID);
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

        private Builder() { }

        public EnableIdpAuthenticationRequest build() {
            return new EnableIdpAuthenticationRequest (
                         this.idpConfigurationID);
        }

        private EnableIdpAuthenticationRequest.Builder buildFrom(final EnableIdpAuthenticationRequest req) {
            this.idpConfigurationID = req.idpConfigurationID;

            return this;
        }

        public EnableIdpAuthenticationRequest.Builder optionalIdpConfigurationID(final java.util.UUID idpConfigurationID) {
            this.idpConfigurationID = (idpConfigurationID == null) ? Optional.<java.util.UUID>empty() : Optional.of(idpConfigurationID);
            return this;
        }

    }
}
