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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * The Request object for the "AddClusterAdmin" API Service call.
 **/
public class AddClusterAdminRequest  implements Serializable  {

    private static final long serialVersionUID = -2112294983L;

    @SerializedName("username") private final String username;
    @SerializedName("password") private final String password;
    @SerializedName("access") private final String[] access;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "AddClusterAdmin" API Service call.
     * @param username [required] Unique username for this Cluster Admin.
     * @param password [required] Password used to authenticate this Cluster Admin.
     * @param access [required] Controls which methods this Cluster Admin can use. For more details on the levels of access, see &quot;Access Control&quot; in the Element API Guide.
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public AddClusterAdminRequest(String username, String password, String[] access, Optional<java.util.Map<String, Object>> attributes) {
        this.username = username;
        this.password = password;
        this.access = access;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }


    /**
     * Unique username for this Cluster Admin.
     **/
    public String getUsername() {
        return this.username;
    }

    /**
     * Password used to authenticate this Cluster Admin.
     **/
    public String getPassword() {
        return this.password;
    }

    /**
     * Controls which methods this Cluster Admin can use. For more details on the levels of access, see &quot;Access Control&quot; in the Element API Guide.
     **/
    public String[] getAccess() {
        return this.access;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddClusterAdminRequest that = (AddClusterAdminRequest) o;
        

        return Objects.equals( username , that.username )
            && Objects.equals( password , that.password )
            && Objects.deepEquals( access , that.access )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( username, password, access, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" username : ").append(username).append(",");
        sb.append(" password : ").append(password).append(",");
        sb.append(" access : ").append(Arrays.toString(access)).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private String username;
        private String password;
        private String[] access;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public AddClusterAdminRequest build() {
            return new AddClusterAdminRequest (
                         this.username,
                         this.password,
                         this.access,
                         this.attributes            );
        }

        private AddClusterAdminRequest.Builder buildFrom(final AddClusterAdminRequest req) {
            this.username = req.username;
            this.password = req.password;
            this.access = req.access;
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

        public AddClusterAdminRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
