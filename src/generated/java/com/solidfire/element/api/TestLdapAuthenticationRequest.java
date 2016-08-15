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
 * The Request object for the "TestLdapAuthentication" API Service call.
 **/
public class TestLdapAuthenticationRequest  implements Serializable  {

    private static final long serialVersionUID = 1764798054L;

    @SerializedName("username") private final String username;
    @SerializedName("password") private final String password;
    @SerializedName("ldapConfiguration") private final Optional<LdapConfiguration> ldapConfiguration;

    /**
     * The Request object for the "TestLdapAuthentication" API Service call.
     * @param username [required] The username to be tested.
     * @param password [required] The password for the username to be tester.
     * @param ldapConfiguration (optional) An ldapConfiguration object to be tested. If this parameter is provided, the API call will test the provided configuration even if LDAP authentication is currently disabled.
     * @since 8.0
     **/
    @Since("8.0")
    public TestLdapAuthenticationRequest(String username, String password, Optional<LdapConfiguration> ldapConfiguration) {
        this.username = username;
        this.password = password;
        this.ldapConfiguration = (ldapConfiguration == null) ? Optional.<LdapConfiguration>empty() : ldapConfiguration;
    }


    /**
     * The username to be tested.
     **/
    public String getUsername() {
        return this.username;
    }

    /**
     * The password for the username to be tester.
     **/
    public String getPassword() {
        return this.password;
    }

    /**
     * An ldapConfiguration object to be tested. If this parameter is provided, the API call will test the provided configuration even if LDAP authentication is currently disabled.
     **/
    public Optional<LdapConfiguration> getLdapConfiguration() {
        return this.ldapConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestLdapAuthenticationRequest that = (TestLdapAuthenticationRequest) o;
        

        return Objects.equals( username , that.username )
            && Objects.equals( password , that.password )
            && Objects.equals( ldapConfiguration , that.ldapConfiguration );
    }

    @Override
    public int hashCode() {
        return Objects.hash( username, password, ldapConfiguration );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" username : ").append(username).append(",");
        sb.append(" password : ").append(password).append(",");
        if(null != ldapConfiguration && ldapConfiguration.isPresent())
            sb.append(" ldapConfiguration : ").append(ldapConfiguration.get());
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
        private Optional<LdapConfiguration> ldapConfiguration;

        private Builder() { }

        public TestLdapAuthenticationRequest build() {
            return new TestLdapAuthenticationRequest (
                         this.username,
                         this.password,
                         this.ldapConfiguration            );
        }

        private TestLdapAuthenticationRequest.Builder buildFrom(final TestLdapAuthenticationRequest req) {
            this.username = req.username;
            this.password = req.password;
            this.ldapConfiguration = req.ldapConfiguration;

            return this;
        }

        public TestLdapAuthenticationRequest.Builder username(final String username) {
            this.username = username;
            return this;
        }

        public TestLdapAuthenticationRequest.Builder password(final String password) {
            this.password = password;
            return this;
        }

        public TestLdapAuthenticationRequest.Builder optionalLdapConfiguration(final LdapConfiguration ldapConfiguration) {
            this.ldapConfiguration = (ldapConfiguration == null) ? Optional.<LdapConfiguration>empty() : Optional.of(ldapConfiguration);
            return this;
        }

    }

}
