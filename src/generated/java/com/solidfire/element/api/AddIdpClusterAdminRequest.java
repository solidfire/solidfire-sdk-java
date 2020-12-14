/*
 * Copyright &copy 2014, 2016 NetApp, Inc. All Rights Reserved.
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
 * AddIdpClusterAdminRequest  
 * Adds a cluster administrator user authenticated by a third party Identity Provider (IdP).  
 * IdP cluster admin accounts are configured based on SAML attribute-value information provided 
 * within the IdP's SAML assertion associated with the user.  If a user successfully 
 * authenticates with the IdP and has SAML attribute statements within the SAML assertion 
 * matching multiple IdP cluster admin accounts, the user will have the combined access level 
 * of those matching IdP cluster admin accounts.
 **/

public class AddIdpClusterAdminRequest implements Serializable {

    public static final long serialVersionUID = 1432381717266563601L;
    @SerializedName("username") private String username;
    @SerializedName("access") private String[] access;
    @SerializedName("acceptEula") private Boolean acceptEula;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public AddIdpClusterAdminRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddIdpClusterAdminRequest(
        String username,
        String[] access,
        Boolean acceptEula,
        Optional<Attributes> attributes
    )
    {
        this.username = username;
        this.access = access;
        this.acceptEula = acceptEula;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * A SAML attribute-value mapping to a IdP cluster admin (e.g. email=test@example.com).  
     * This could be defined using a specific SAML subject using NameID, or an entry in the 
     * SAML attribute statement such as eduPersonAffiliation.
     **/
    public String getUsername() { return this.username; }
   
    public void setUsername(String username) { 
        this.username = username;
    }
    /** 
     * Controls which methods this IdP Cluster Admin can use. For more details on the levels of access, 
     * see the Access Control appendix in the SolidFire API Reference.
     **/
    public String[] getAccess() { return this.access; }
   
    public void setAccess(String[] access) { 
        this.access = access;
    }
    /** 
     * Accept the End User License Agreement. Set to true to add a cluster administrator account to the system.
     * If omitted or set to false, the method call fails.
     **/
    public Boolean getAcceptEula() { return this.acceptEula; }
   
    public void setAcceptEula(Boolean acceptEula) { 
        this.acceptEula = acceptEula;
    }
    /** 
     * List of name-value pairs in JSON object format.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddIdpClusterAdminRequest that = (AddIdpClusterAdminRequest) o;

        return 
            Objects.equals(username, that.username) && 
            Arrays.equals(access, that.access) && 
            Objects.equals(acceptEula, that.acceptEula) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( username,(Object[])access,acceptEula,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("access", access);
        map.put("acceptEula", acceptEula);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" username : ").append(gson.toJson(username)).append(",");
        sb.append(" access : ").append(gson.toJson(Arrays.toString(access))).append(",");
        sb.append(" acceptEula : ").append(gson.toJson(acceptEula)).append(",");
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        }
        else{
            sb.append(" attributes : ").append("null").append(",");
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
        private String username;
        private String[] access;
        private Boolean acceptEula;
        private Optional<Attributes> attributes;

        private Builder() { }

        public AddIdpClusterAdminRequest build() {
            return new AddIdpClusterAdminRequest (
                         this.username,
                         this.access,
                         this.acceptEula,
                         this.attributes);
        }

        private AddIdpClusterAdminRequest.Builder buildFrom(final AddIdpClusterAdminRequest req) {
            this.username = req.username;
            this.access = req.access;
            this.acceptEula = req.acceptEula;
            this.attributes = req.attributes;

            return this;
        }

        public AddIdpClusterAdminRequest.Builder username(final String username) {
            this.username = username;
            return this;
        }

        public AddIdpClusterAdminRequest.Builder access(final String[] access) {
            this.access = access;
            return this;
        }

        public AddIdpClusterAdminRequest.Builder acceptEula(final Boolean acceptEula) {
            this.acceptEula = acceptEula;
            return this;
        }

        public AddIdpClusterAdminRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
