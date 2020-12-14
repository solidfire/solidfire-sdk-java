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
 * AddClusterAdminRequest  
 * You can use AddClusterAdmin to add a new cluster admin account. A cluster ddmin can manage the cluster using the API and management tools. Cluster admins are completely separate and unrelated to standard tenant accounts.
 * Each cluster admin can be restricted to a subset of the API. NetApp recommends using multiple cluster admin accounts for different users and applications. You should give each cluster admin the minimal permissions necessary; this reduces the potential impact of credential compromise.
 * You must accept the End User License Agreement (EULA) by setting the acceptEula parameter to true to add a cluster administrator account to the system.
 **/

public class AddClusterAdminRequest implements Serializable {

    public static final long serialVersionUID = 2302484283389373014L;
    @SerializedName("username") private String username;
    @SerializedName("password") private String password;
    @SerializedName("access") private String[] access;
    @SerializedName("acceptEula") private Boolean acceptEula;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public AddClusterAdminRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddClusterAdminRequest(
        String username,
        String password,
        String[] access,
        Boolean acceptEula,
        Optional<Attributes> attributes
    )
    {
        this.username = username;
        this.password = password;
        this.access = access;
        this.acceptEula = acceptEula;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * Unique username for this cluster admin. Must be between 1 and 1024 characters in length.
     **/
    public String getUsername() { return this.username; }
   
    public void setUsername(String username) { 
        this.username = username;
    }
    /** 
     * Password used to authenticate this cluster admin.
     **/
    public String getPassword() { return this.password; }
   
    public void setPassword(String password) { 
        this.password = password;
    }
    /** 
     * Controls which methods this cluster admin can use. For more details on the levels of access, see Access Control in the Element API Reference Guide.
     **/
    public String[] getAccess() { return this.access; }
   
    public void setAccess(String[] access) { 
        this.access = access;
    }
    /** 
     * Required to indicate your acceptance of the End User License
     * Agreement when creating this cluster. To accept the EULA,
     * set this parameter to true.
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

        AddClusterAdminRequest that = (AddClusterAdminRequest) o;

        return 
            Objects.equals(username, that.username) && 
            Objects.equals(password, that.password) && 
            Arrays.equals(access, that.access) && 
            Objects.equals(acceptEula, that.acceptEula) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( username,password,(Object[])access,acceptEula,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("password", password);
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
        sb.append(" password : ").append(gson.toJson(password)).append(",");
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
        private String password;
        private String[] access;
        private Boolean acceptEula;
        private Optional<Attributes> attributes;

        private Builder() { }

        public AddClusterAdminRequest build() {
            return new AddClusterAdminRequest (
                         this.username,
                         this.password,
                         this.access,
                         this.acceptEula,
                         this.attributes);
        }

        private AddClusterAdminRequest.Builder buildFrom(final AddClusterAdminRequest req) {
            this.username = req.username;
            this.password = req.password;
            this.access = req.access;
            this.acceptEula = req.acceptEula;
            this.attributes = req.attributes;

            return this;
        }

        public AddClusterAdminRequest.Builder username(final String username) {
            this.username = username;
            return this;
        }

        public AddClusterAdminRequest.Builder password(final String password) {
            this.password = password;
            return this;
        }

        public AddClusterAdminRequest.Builder access(final String[] access) {
            this.access = access;
            return this;
        }

        public AddClusterAdminRequest.Builder acceptEula(final Boolean acceptEula) {
            this.acceptEula = acceptEula;
            return this;
        }

        public AddClusterAdminRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
