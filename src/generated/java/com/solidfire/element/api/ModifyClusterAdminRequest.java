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
 * ModifyClusterAdminRequest  
 * You can use ModifyClusterAdmin to change the settings for a cluster admin, LDAP cluster admin, 
 * or third party Identity Provider (IdP) cluster admin.  You cannot change access for the 
 * administrator cluster admin account.
 **/

public class ModifyClusterAdminRequest implements Serializable {

    public static final long serialVersionUID = 1920948106655815200L;
    @SerializedName("clusterAdminID") private Long clusterAdminID;
    @SerializedName("password") private Optional<String> password;
    @SerializedName("access") private Optional<String[]> access;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public ModifyClusterAdminRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyClusterAdminRequest(
        Long clusterAdminID,
        Optional<String> password,
        Optional<String[]> access,
        Optional<Attributes> attributes
    )
    {
        this.clusterAdminID = clusterAdminID;
        this.password = (password == null) ? Optional.<String>empty() : password;
        this.access = (access == null) ? Optional.<String[]>empty() : access;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * ClusterAdminID for the cluster admin, LDAP cluster admin, or IdP cluster admin to modify.
     **/
    public Long getClusterAdminID() { return this.clusterAdminID; }
   
    public void setClusterAdminID(Long clusterAdminID) { 
        this.clusterAdminID = clusterAdminID;
    }
    /** 
     * Password used to authenticate this cluster admin.
     * This parameter does not apply for an LDAP or IdP cluster admin.
     **/
    public Optional<String> getPassword() { return this.password; }
   
    public void setPassword(Optional<String> password) { 
        this.password = (password == null) ? Optional.<String>empty() : password;
    }
    /** 
     * Controls which methods this cluster admin can use. For more details, see Access Control in the Element API Reference Guide.
     **/
    public Optional<String[]> getAccess() { return this.access; }
   
    public void setAccess(Optional<String[]> access) { 
        this.access = (access == null) ? Optional.<String[]>empty() : access;
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

        ModifyClusterAdminRequest that = (ModifyClusterAdminRequest) o;

        return 
            Objects.equals(clusterAdminID, that.clusterAdminID) && 
            Objects.equals(password, that.password) && 
            Objects.equals(access, that.access) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterAdminID,password,access,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterAdminID", clusterAdminID);
        map.put("password", password);
        map.put("access", access);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" clusterAdminID : ").append(gson.toJson(clusterAdminID)).append(",");
        if(null != password && password.isPresent()){
            sb.append(" password : ").append(gson.toJson(password)).append(",");
        }
        else{
            sb.append(" password : ").append("null").append(",");
        }
        if(null != access && access.isPresent()){
            sb.append(" access : ").append(gson.toJson(access)).append(",");
        }
        else{
            sb.append(" access : ").append("null").append(",");
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
        private Long clusterAdminID;
        private Optional<String> password;
        private Optional<String[]> access;
        private Optional<Attributes> attributes;

        private Builder() { }

        public ModifyClusterAdminRequest build() {
            return new ModifyClusterAdminRequest (
                         this.clusterAdminID,
                         this.password,
                         this.access,
                         this.attributes);
        }

        private ModifyClusterAdminRequest.Builder buildFrom(final ModifyClusterAdminRequest req) {
            this.clusterAdminID = req.clusterAdminID;
            this.password = req.password;
            this.access = req.access;
            this.attributes = req.attributes;

            return this;
        }

        public ModifyClusterAdminRequest.Builder clusterAdminID(final Long clusterAdminID) {
            this.clusterAdminID = clusterAdminID;
            return this;
        }

        public ModifyClusterAdminRequest.Builder optionalPassword(final String password) {
            this.password = (password == null) ? Optional.<String>empty() : Optional.of(password);
            return this;
        }

        public ModifyClusterAdminRequest.Builder optionalAccess(final String[] access) {
            this.access = (access == null) ? Optional.<String[]>empty() : Optional.of(access);
            return this;
        }

        public ModifyClusterAdminRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
