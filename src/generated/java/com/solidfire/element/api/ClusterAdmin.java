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
 * ClusterAdmin  
 **/

public class ClusterAdmin implements Serializable {

    public static final long serialVersionUID = 7237496562909622134L;
    @SerializedName("authMethod") private String authMethod;
    @SerializedName("access") private String[] access;
    @SerializedName("clusterAdminID") private Long clusterAdminID;
    @SerializedName("username") private String username;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public ClusterAdmin() {}

    
    // parameterized constructor
    @Since("7.0")
    public ClusterAdmin(
        String authMethod,
        String[] access,
        Long clusterAdminID,
        String username,
        Optional<Attributes> attributes
    )
    {
        this.authMethod = authMethod;
        this.access = access;
        this.clusterAdminID = clusterAdminID;
        this.username = username;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * Method in which the cluster admin can be authenticated.
     **/
    public String getAuthMethod() { return this.authMethod; }
   
    public void setAuthMethod(String authMethod) { 
        this.authMethod = authMethod;
    }
    /** 
     * Controls which methods this cluster admin can use. For more details, see Access Control in the Element API Reference Guide.
     **/
    public String[] getAccess() { return this.access; }
   
    public void setAccess(String[] access) { 
        this.access = access;
    }
    /** 
     * Unique identifier for the cluster admin
     **/
    public Long getClusterAdminID() { return this.clusterAdminID; }
   
    public void setClusterAdminID(Long clusterAdminID) { 
        this.clusterAdminID = clusterAdminID;
    }
    /** 
     * Username, LDAP DN, or SAML Attribute for the cluster admin.
     **/
    public String getUsername() { return this.username; }
   
    public void setUsername(String username) { 
        this.username = username;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterAdmin that = (ClusterAdmin) o;

        return 
            Objects.equals(authMethod, that.authMethod) && 
            Arrays.equals(access, that.access) && 
            Objects.equals(clusterAdminID, that.clusterAdminID) && 
            Objects.equals(username, that.username) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( authMethod,(Object[])access,clusterAdminID,username,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("authMethod", authMethod);
        map.put("access", access);
        map.put("clusterAdminID", clusterAdminID);
        map.put("username", username);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" authMethod : ").append(gson.toJson(authMethod)).append(",");
        sb.append(" access : ").append(gson.toJson(Arrays.toString(access))).append(",");
        sb.append(" clusterAdminID : ").append(gson.toJson(clusterAdminID)).append(",");
        sb.append(" username : ").append(gson.toJson(username)).append(",");
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
        private String authMethod;
        private String[] access;
        private Long clusterAdminID;
        private String username;
        private Optional<Attributes> attributes;

        private Builder() { }

        public ClusterAdmin build() {
            return new ClusterAdmin (
                         this.authMethod,
                         this.access,
                         this.clusterAdminID,
                         this.username,
                         this.attributes);
        }

        private ClusterAdmin.Builder buildFrom(final ClusterAdmin req) {
            this.authMethod = req.authMethod;
            this.access = req.access;
            this.clusterAdminID = req.clusterAdminID;
            this.username = req.username;
            this.attributes = req.attributes;

            return this;
        }

        public ClusterAdmin.Builder authMethod(final String authMethod) {
            this.authMethod = authMethod;
            return this;
        }

        public ClusterAdmin.Builder access(final String[] access) {
            this.access = access;
            return this;
        }

        public ClusterAdmin.Builder clusterAdminID(final Long clusterAdminID) {
            this.clusterAdminID = clusterAdminID;
            return this;
        }

        public ClusterAdmin.Builder username(final String username) {
            this.username = username;
            return this;
        }

        public ClusterAdmin.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
