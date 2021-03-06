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
 * AddLdapClusterAdminRequest  
 * AddLdapClusterAdmin enables you to add a new LDAP cluster administrator user. An LDAP cluster administrator can manage the
 * cluster via the API and management tools. LDAP cluster admin accounts are completely separate and unrelated to standard tenant
 * accounts.
 * You can also use this method to add an LDAP group that has been defined in Active Directory. The access level that is given to the group is passed to the individual users in the LDAP group.
 **/

public class AddLdapClusterAdminRequest implements Serializable {

    public static final long serialVersionUID = -6931129844811753972L;
    @SerializedName("username") private String username;
    @SerializedName("access") private String[] access;
    @SerializedName("acceptEula") private Optional<Boolean> acceptEula;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public AddLdapClusterAdminRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddLdapClusterAdminRequest(
        String username,
        String[] access,
        Optional<Boolean> acceptEula,
        Optional<Attributes> attributes
    )
    {
        this.username = username;
        this.access = access;
        this.acceptEula = (acceptEula == null) ? Optional.<Boolean>empty() : acceptEula;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * The distinguished user name for the new LDAP cluster admin.
     **/
    public String getUsername() { return this.username; }
   
    public void setUsername(String username) { 
        this.username = username;
    }
    /** 
     * Controls which methods this Cluster Admin can use. For more details on the levels of access, see the Access Control appendix in the SolidFire API Reference.
     **/
    public String[] getAccess() { return this.access; }
   
    public void setAccess(String[] access) { 
        this.access = access;
    }
    /** 
     * Accept the End User License Agreement. Set to true to add a cluster administrator account to the system. If omitted or set to false, the method call fails.
     **/
    public Optional<Boolean> getAcceptEula() { return this.acceptEula; }
   
    public void setAcceptEula(Optional<Boolean> acceptEula) { 
        this.acceptEula = (acceptEula == null) ? Optional.<Boolean>empty() : acceptEula;
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

        AddLdapClusterAdminRequest that = (AddLdapClusterAdminRequest) o;

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
        if(null != acceptEula && acceptEula.isPresent()){
            sb.append(" acceptEula : ").append(gson.toJson(acceptEula)).append(",");
        }
        else{
            sb.append(" acceptEula : ").append("null").append(",");
        }
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
        private Optional<Boolean> acceptEula;
        private Optional<Attributes> attributes;

        private Builder() { }

        public AddLdapClusterAdminRequest build() {
            return new AddLdapClusterAdminRequest (
                         this.username,
                         this.access,
                         this.acceptEula,
                         this.attributes);
        }

        private AddLdapClusterAdminRequest.Builder buildFrom(final AddLdapClusterAdminRequest req) {
            this.username = req.username;
            this.access = req.access;
            this.acceptEula = req.acceptEula;
            this.attributes = req.attributes;

            return this;
        }

        public AddLdapClusterAdminRequest.Builder username(final String username) {
            this.username = username;
            return this;
        }

        public AddLdapClusterAdminRequest.Builder access(final String[] access) {
            this.access = access;
            return this;
        }

        public AddLdapClusterAdminRequest.Builder optionalAcceptEula(final Boolean acceptEula) {
            this.acceptEula = (acceptEula == null) ? Optional.<Boolean>empty() : Optional.of(acceptEula);
            return this;
        }

        public AddLdapClusterAdminRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
