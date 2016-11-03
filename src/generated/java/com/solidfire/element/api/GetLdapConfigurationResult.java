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
 * 
 **/

public class GetLdapConfigurationResult implements Serializable {

    public static final long serialVersionUID = -1364313198500777326L;
    @SerializedName("ldapConfiguration") private LdapConfiguration ldapConfiguration;

    // empty constructor
    @Since("7.0")
    public GetLdapConfigurationResult() {}

    // parameterized constructor
    @Since("7.0")
    public GetLdapConfigurationResult(
        LdapConfiguration ldapConfiguration
    )
    {
        this.ldapConfiguration = ldapConfiguration;
    }

    /** 
     * List of the current LDAP configuration settings. This API call will not return the plain text of the search account password.
     * <br/><br/>
     * <b>Note</b>: If LDAP authentication is currently disabled, all the returned settings will be empty with the exception of "authType", and "groupSearchType" which are set to "SearchAndBind" and "ActiveDirectory" respectively.
     **/
    public LdapConfiguration getLdapConfiguration() { return this.ldapConfiguration; }
    public void setLdapConfiguration(LdapConfiguration ldapConfiguration) { 
        this.ldapConfiguration = ldapConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetLdapConfigurationResult that = (GetLdapConfigurationResult) o;
        return 
            Objects.equals(ldapConfiguration, that.ldapConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash( ldapConfiguration );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("ldapConfiguration", ldapConfiguration);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" ldapConfiguration : ").append(ldapConfiguration).append(",");
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
        private LdapConfiguration ldapConfiguration;

        private Builder() { }

        public GetLdapConfigurationResult build() {
            return new GetLdapConfigurationResult (
                         this.ldapConfiguration);
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
