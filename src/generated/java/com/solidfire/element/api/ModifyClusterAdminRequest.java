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

import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ModifyClusterAdminRequest  
 * ModifyClusterAdmin is used to change the settings for a Cluster Admin or LDAP Cluster Admin. Access for the administrator Cluster Admin account cannot be changed.
 **/

public class ModifyClusterAdminRequest implements Serializable {

    public static final long serialVersionUID = 4400919580991586247L;
    @SerializedName("clusterAdminID") private Long clusterAdminID;
    @SerializedName("password") private Optional<String> password;
    @SerializedName("access") private Optional<String[]> access;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public ModifyClusterAdminRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyClusterAdminRequest(
        Long clusterAdminID,
        Optional<String> password,
        Optional<String[]> access,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.clusterAdminID = clusterAdminID;
        this.password = (password == null) ? Optional.<String>empty() : password;
        this.access = (access == null) ? Optional.<String[]>empty() : access;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * ClusterAdminID for the Cluster Admin or LDAP Cluster Admin to modify.
     **/
    public Long getClusterAdminID() { return this.clusterAdminID; }
    public void setClusterAdminID(Long clusterAdminID) { 
        this.clusterAdminID = clusterAdminID;
    }
    /** 
     * Password used to authenticate this Cluster Admin.
     **/
    public Optional<String> getPassword() { return this.password; }
    public void setPassword(Optional<String> password) { 
        this.password = (password == null) ? Optional.<String>empty() : password;
    }
    /** 
     * Controls which methods this Cluster Admin can use. For more details on the levels of access, see "Access Control" in the Element API Guide.
     **/
    public Optional<String[]> getAccess() { return this.access; }
    public void setAccess(Optional<String[]> access) { 
        this.access = (access == null) ? Optional.<String[]>empty() : access;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<java.util.Map<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
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
        sb.append( "{ " );

        sb.append(" clusterAdminID : ").append(clusterAdminID).append(",");
        if(null != password && password.isPresent()){
            sb.append(" password : ").append(password).append(",");
        }
        if(null != access && access.isPresent()){
            sb.append(" access : ").append(access).append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes).append(",");
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
        private Optional<java.util.Map<String, Object>> attributes;

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

        public ModifyClusterAdminRequest.Builder optional(final String password) {
            this.password = (password == null) ? Optional.<String>empty() : Optional.of(password);
            return this;
        }

        public ModifyClusterAdminRequest.Builder optional(final String[] access) {
            this.access = (access == null) ? Optional.<String[]>empty() : Optional.of(access);
            return this;
        }

        public ModifyClusterAdminRequest.Builder optional(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
