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
 * The Request object for the "ModifyClusterAdmin" API Service call.
 **/
public class ModifyClusterAdminRequest implements Serializable {

    private static final long serialVersionUID = -1663388854L;

    private final Long clusterAdminID;
    private final Optional<String> password;
    private final Optional<String[]> access;
    private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "ModifyClusterAdmin" API Service call.
     * @param clusterAdminID [required] ClusterAdminID for the Cluster Admin or LDAP Cluster Admin to modify.
     * @param password (optional) Password used to authenticate this Cluster Admin.
     * @param access (optional) Controls which methods this Cluster Admin can use. For more details on the levels of access, see &quot;Access Control&quot; in the Element API Guide.
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public ModifyClusterAdminRequest(Long clusterAdminID, Optional<String> password, Optional<String[]> access, Optional<java.util.Map<String, Object>> attributes) {
        this.clusterAdminID = clusterAdminID;
        this.password = (password == null) ? Optional.<String>empty() : password;
        this.access = (access == null) ? Optional.<String[]>empty() : access;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }


    /**
     * ClusterAdminID for the Cluster Admin or LDAP Cluster Admin to modify.
     **/
    public Long getClusterAdminID() {
        return this.clusterAdminID;
    }

    /**
     * Password used to authenticate this Cluster Admin.
     **/
    public Optional<String> getPassword() {
        return this.password;
    }

    /**
     * Controls which methods this Cluster Admin can use. For more details on the levels of access, see &quot;Access Control&quot; in the Element API Guide.
     **/
    public Optional<String[]> getAccess() {
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

        ModifyClusterAdminRequest that = (ModifyClusterAdminRequest) o;
        

        return Objects.equals( clusterAdminID , that.clusterAdminID )
            && Objects.equals( password , that.password )
            && Objects.deepEquals( access , that.access )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {

        return Objects.hash( clusterAdminID, password, access, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterAdminID : ").append(clusterAdminID).append(",");
        if(null != password && password.isPresent())
            sb.append(" password : ").append(password.get()).append(",");
        if(null != access && access.isPresent())
            sb.append(" access : ").append(Arrays.toString(access.get())).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder getBuilder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().fromRequest(this);
    }

    public static class Builder {
        private Long clusterAdminID;
        private Optional<String> password;
        private Optional<String[]> access;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public ModifyClusterAdminRequest toRequest() {
            return new ModifyClusterAdminRequest (
                         this.clusterAdminID,
                         this.password,
                         this.access,
                         this.attributes            );
        }

        private ModifyClusterAdminRequest.Builder fromRequest(final ModifyClusterAdminRequest req) {
            this.clusterAdminID = req.clusterAdminID;
            this.password = req.password;
            this.access = req.access;
            this.attributes = req.attributes;

            return this;
        }

        public ModifyClusterAdminRequest.Builder withClusterAdminID(final Long clusterAdminID) {
            this.clusterAdminID = clusterAdminID;
            return this;
        }

        public ModifyClusterAdminRequest.Builder withOptionalPassword(final String password) {
            this.password = (password == null) ? Optional.<String>empty() : Optional.of(password);
            return this;
        }

        public ModifyClusterAdminRequest.Builder withOptionalAccess(final String[] access) {
            this.access = (access == null) ? Optional.<String[]>empty() : Optional.of(access);
            return this;
        }

        public ModifyClusterAdminRequest.Builder withOptionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
