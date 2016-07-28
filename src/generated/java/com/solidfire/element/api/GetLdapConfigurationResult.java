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
 * The object returned by the "GetLdapConfiguration" API Service call.
 **/
public class GetLdapConfigurationResult  implements Serializable  {

    private static final long serialVersionUID = -778688371L;

    @SerializedName("ldapConfiguration") private final LdapConfiguration ldapConfiguration;

    /**
     * The object returned by the "GetLdapConfiguration" API Service call.
     * @param ldapConfiguration [required] List of the current LDAP configuration settings. This API call will not return the plain text of the search account password.
     * @since 7.0
     **/
    @Since("7.0")
    public GetLdapConfigurationResult(LdapConfiguration ldapConfiguration) {
        this.ldapConfiguration = ldapConfiguration;
    }


    /**
     * List of the current LDAP configuration settings. This API call will not return the plain text of the search account password.
     * <br/><br/>
     * <b>Note</b>: If LDAP authentication is currently disabled, all the returned settings will be empty with the exception of "authType", and "groupSearchType" which are set to &quot;SearchAndBind&quot; and &quot;ActiveDirectory&quot; respectively.
     **/
    public LdapConfiguration getLdapConfiguration() {
        return this.ldapConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetLdapConfigurationResult that = (GetLdapConfigurationResult) o;
        

        return Objects.equals( ldapConfiguration , that.ldapConfiguration );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) ldapConfiguration );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" ldapConfiguration : ").append(ldapConfiguration);
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
        private LdapConfiguration ldapConfiguration;

        private Builder() { }

        public GetLdapConfigurationResult build() {
            return new GetLdapConfigurationResult (
                         this.ldapConfiguration            );
        }

        private GetLdapConfigurationResult.Builder buildFrom(final GetLdapConfigurationResult req) {
            this.ldapConfiguration = req.ldapConfiguration;

            return this;
        }

        public GetLdapConfigurationResult.Builder ldapConfiguration(final LdapConfiguration ldapConfiguration) {
            this.ldapConfiguration = ldapConfiguration;
            return this;
        }

    }

}
