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
 * ListIdpConfigurationsRequest  
 * List configurations for third party Identity Provider(s) (IdP), optionally providing either enabledOnly flag to retrieve the currently enabled IdP configuration, or an IdP metadata UUID or IdP name to query a specific IdP configuration information.
 **/

public class ListIdpConfigurationsRequest implements Serializable {

    public static final long serialVersionUID = -7149009286023934106L;
    @SerializedName("idpConfigurationID") private Optional<java.util.UUID> idpConfigurationID;
    @SerializedName("idpName") private Optional<String> idpName;
    @SerializedName("enabledOnly") private Optional<Boolean> enabledOnly = Optional.of(false);
    // empty constructor
    @Since("7.0")
    public ListIdpConfigurationsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListIdpConfigurationsRequest(
        Optional<java.util.UUID> idpConfigurationID,
        Optional<String> idpName,
        Optional<Boolean> enabledOnly
    )
    {
        this.idpConfigurationID = (idpConfigurationID == null) ? Optional.<java.util.UUID>empty() : idpConfigurationID;
        this.idpName = (idpName == null) ? Optional.<String>empty() : idpName;
        this.enabledOnly = (enabledOnly == null) ? Optional.<Boolean>empty() : enabledOnly;
    }

    /** 
     * UUID for the third party Identity Provider (IdP) Configuration.
     **/
    public Optional<java.util.UUID> getIdpConfigurationID() { return this.idpConfigurationID; }
   
    public void setIdpConfigurationID(Optional<java.util.UUID> idpConfigurationID) { 
        this.idpConfigurationID = (idpConfigurationID == null) ? Optional.<java.util.UUID>empty() : idpConfigurationID;
    }
    /** 
     * Filters the result to an IdP configuration information for a specific IdP name.
     **/
    public Optional<String> getIdpName() { return this.idpName; }
   
    public void setIdpName(Optional<String> idpName) { 
        this.idpName = (idpName == null) ? Optional.<String>empty() : idpName;
    }
    /** 
     * Filters the result to return the currently enabled Idp configuration.
     **/
    public Optional<Boolean> getEnabledOnly() { return this.enabledOnly; }
   
    public void setEnabledOnly(Optional<Boolean> enabledOnly) { 
        this.enabledOnly = (enabledOnly == null) ? Optional.<Boolean>empty() : enabledOnly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListIdpConfigurationsRequest that = (ListIdpConfigurationsRequest) o;

        return 
            Objects.equals(idpConfigurationID, that.idpConfigurationID) && 
            Objects.equals(idpName, that.idpName) && 
            Objects.equals(enabledOnly, that.enabledOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash( idpConfigurationID,idpName,enabledOnly );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("idpConfigurationID", idpConfigurationID);
        map.put("idpName", idpName);
        map.put("enabledOnly", enabledOnly);
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
        if(null != enabledOnly && enabledOnly.isPresent()){
            sb.append(" enabledOnly : ").append(gson.toJson(enabledOnly)).append(",");
        }
        else{
            sb.append(" enabledOnly : ").append("null").append(",");
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
        private Optional<Boolean> enabledOnly;

        private Builder() { }

        public ListIdpConfigurationsRequest build() {
            return new ListIdpConfigurationsRequest (
                         this.idpConfigurationID,
                         this.idpName,
                         this.enabledOnly);
        }

        private ListIdpConfigurationsRequest.Builder buildFrom(final ListIdpConfigurationsRequest req) {
            this.idpConfigurationID = req.idpConfigurationID;
            this.idpName = req.idpName;
            this.enabledOnly = req.enabledOnly;

            return this;
        }

        public ListIdpConfigurationsRequest.Builder optionalIdpConfigurationID(final java.util.UUID idpConfigurationID) {
            this.idpConfigurationID = (idpConfigurationID == null) ? Optional.<java.util.UUID>empty() : Optional.of(idpConfigurationID);
            return this;
        }

        public ListIdpConfigurationsRequest.Builder optionalIdpName(final String idpName) {
            this.idpName = (idpName == null) ? Optional.<String>empty() : Optional.of(idpName);
            return this;
        }

        public ListIdpConfigurationsRequest.Builder optionalEnabledOnly(final Boolean enabledOnly) {
            this.enabledOnly = (enabledOnly == null) ? Optional.<Boolean>empty() : Optional.of(enabledOnly);
            return this;
        }

    }
}
