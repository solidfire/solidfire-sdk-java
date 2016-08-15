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
 * LDAP Configuration object returns information about the LDAP configuration on SolidFire storage. LDAP information is returned with the API method GetLdapConfiguration.
 **/
public class LdapConfiguration  implements Serializable  {

    private static final long serialVersionUID = -801623939L;

    @SerializedName("authType") private final String authType;
    @SerializedName("enabled") private final Boolean enabled;
    @SerializedName("groupSearchBaseDN") private final String groupSearchBaseDN;
    @SerializedName("groupSearchCustomFilter") private final String groupSearchCustomFilter;
    @SerializedName("groupSearchType") private final String groupSearchType;
    @SerializedName("searchBindDN") private final String searchBindDN;
    @SerializedName("serverURIs") private final String[] serverURIs;
    @SerializedName("userDNTemplate") private final String userDNTemplate;
    @SerializedName("userSearchBaseDN") private final String userSearchBaseDN;
    @SerializedName("userSearchFilter") private final String userSearchFilter;

    /**
     * LDAP Configuration object returns information about the LDAP configuration on SolidFire storage. LDAP information is returned with the API method GetLdapConfiguration.
     * @param authType [required] Identifies which user authentcation method will be used. <br/>
     * @param enabled [required] Identifies whether or not the system is enabled for LDAP. <br/>
     * @param groupSearchBaseDN [required] The base DN of the tree to start the group search (will do a subtree search from here).
     * @param groupSearchCustomFilter [required] The custom search filter used.
     * @param groupSearchType [required] Controls the default group search filter used, can be one of the following:<br/>
     * @param searchBindDN [required] A fully qualified DN to log in with to perform an LDAP search for the user (needs read access to the LDAP directory).
     * @param serverURIs [required] A comma-separated list of LDAP server URIs (examples: "ldap://1.2.3.4" and ldaps://1.2.3.4:123")
     * @param userDNTemplate [required] A string that is used to form a fully qualified user DN.
     * @param userSearchBaseDN [required] The base DN of the tree used to start the search (will do a subtree search from here).
     * @param userSearchFilter [required] The LDAP filter used.
     * @since 7.0
     **/
    @Since("7.0")
    public LdapConfiguration(String authType, Boolean enabled, String groupSearchBaseDN, String groupSearchCustomFilter, String groupSearchType, String searchBindDN, String[] serverURIs, String userDNTemplate, String userSearchBaseDN, String userSearchFilter) {
        this.searchBindDN = searchBindDN;
        this.userSearchFilter = userSearchFilter;
        this.serverURIs = serverURIs;
        this.enabled = enabled;
        this.groupSearchBaseDN = groupSearchBaseDN;
        this.groupSearchCustomFilter = groupSearchCustomFilter;
        this.authType = authType;
        this.groupSearchType = groupSearchType;
        this.userSearchBaseDN = userSearchBaseDN;
        this.userDNTemplate = userDNTemplate;
    }


    /**
     * Identifies which user authentcation method will be used. <br/>
     * Valid values:<br/>
     * <b>DirectBind</b><br/>
     * <b>SearchAndBind</b>
     **/
    public String getAuthType() {
        return this.authType;
    }

    /**
     * Identifies whether or not the system is enabled for LDAP. <br/>
     * Valid values:<br/>
     * <b>true</b><br/>
     * <b>false</b>
     **/
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * The base DN of the tree to start the group search (will do a subtree search from here).
     **/
    public String getGroupSearchBaseDN() {
        return this.groupSearchBaseDN;
    }

    /**
     * The custom search filter used.
     **/
    public String getGroupSearchCustomFilter() {
        return this.groupSearchCustomFilter;
    }

    /**
     * Controls the default group search filter used, can be one of the following:<br/>
     * <b>NoGroups</b>: No group support.<br/>
     * <b>ActiveDirectory</b>: Nested membership of all of a user&#39;s AD groups.<br/>
     * <b>MemberDN</b>: MemberDN style groups (single-level).
     **/
    public String getGroupSearchType() {
        return this.groupSearchType;
    }

    /**
     * A fully qualified DN to log in with to perform an LDAP search for the user (needs read access to the LDAP directory).
     **/
    public String getSearchBindDN() {
        return this.searchBindDN;
    }

    /**
     * A comma-separated list of LDAP server URIs (examples: "ldap://1.2.3.4" and ldaps://1.2.3.4:123")
     **/
    public String[] getServerURIs() {
        return this.serverURIs;
    }

    /**
     * A string that is used to form a fully qualified user DN.
     **/
    public String getUserDNTemplate() {
        return this.userDNTemplate;
    }

    /**
     * The base DN of the tree used to start the search (will do a subtree search from here).
     **/
    public String getUserSearchBaseDN() {
        return this.userSearchBaseDN;
    }

    /**
     * The LDAP filter used.
     **/
    public String getUserSearchFilter() {
        return this.userSearchFilter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LdapConfiguration that = (LdapConfiguration) o;
        

        return Objects.equals( authType , that.authType )
            && Objects.equals( enabled , that.enabled )
            && Objects.equals( groupSearchBaseDN , that.groupSearchBaseDN )
            && Objects.equals( groupSearchCustomFilter , that.groupSearchCustomFilter )
            && Objects.equals( groupSearchType , that.groupSearchType )
            && Objects.equals( searchBindDN , that.searchBindDN )
            && Objects.deepEquals( serverURIs , that.serverURIs )
            && Objects.equals( userDNTemplate , that.userDNTemplate )
            && Objects.equals( userSearchBaseDN , that.userSearchBaseDN )
            && Objects.equals( userSearchFilter , that.userSearchFilter );
    }

    @Override
    public int hashCode() {
        return Objects.hash( authType, enabled, groupSearchBaseDN, groupSearchCustomFilter, groupSearchType, searchBindDN, serverURIs, userDNTemplate, userSearchBaseDN, userSearchFilter );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" authType : ").append(authType).append(",");
        sb.append(" enabled : ").append(enabled).append(",");
        sb.append(" groupSearchBaseDN : ").append(groupSearchBaseDN).append(",");
        sb.append(" groupSearchCustomFilter : ").append(groupSearchCustomFilter).append(",");
        sb.append(" groupSearchType : ").append(groupSearchType).append(",");
        sb.append(" searchBindDN : ").append(searchBindDN).append(",");
        sb.append(" serverURIs : ").append(Arrays.toString(serverURIs)).append(",");
        sb.append(" userDNTemplate : ").append(userDNTemplate).append(",");
        sb.append(" userSearchBaseDN : ").append(userSearchBaseDN).append(",");
        sb.append(" userSearchFilter : ").append(userSearchFilter);
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
        private String authType;
        private Boolean enabled;
        private String groupSearchBaseDN;
        private String groupSearchCustomFilter;
        private String groupSearchType;
        private String searchBindDN;
        private String[] serverURIs;
        private String userDNTemplate;
        private String userSearchBaseDN;
        private String userSearchFilter;

        private Builder() { }

        public LdapConfiguration build() {
            return new LdapConfiguration (
                         this.authType,
                         this.enabled,
                         this.groupSearchBaseDN,
                         this.groupSearchCustomFilter,
                         this.groupSearchType,
                         this.searchBindDN,
                         this.serverURIs,
                         this.userDNTemplate,
                         this.userSearchBaseDN,
                         this.userSearchFilter            );
        }

        private LdapConfiguration.Builder buildFrom(final LdapConfiguration req) {
            this.authType = req.authType;
            this.enabled = req.enabled;
            this.groupSearchBaseDN = req.groupSearchBaseDN;
            this.groupSearchCustomFilter = req.groupSearchCustomFilter;
            this.groupSearchType = req.groupSearchType;
            this.searchBindDN = req.searchBindDN;
            this.serverURIs = req.serverURIs;
            this.userDNTemplate = req.userDNTemplate;
            this.userSearchBaseDN = req.userSearchBaseDN;
            this.userSearchFilter = req.userSearchFilter;

            return this;
        }

        public LdapConfiguration.Builder authType(final String authType) {
            this.authType = authType;
            return this;
        }

        public LdapConfiguration.Builder enabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public LdapConfiguration.Builder groupSearchBaseDN(final String groupSearchBaseDN) {
            this.groupSearchBaseDN = groupSearchBaseDN;
            return this;
        }

        public LdapConfiguration.Builder groupSearchCustomFilter(final String groupSearchCustomFilter) {
            this.groupSearchCustomFilter = groupSearchCustomFilter;
            return this;
        }

        public LdapConfiguration.Builder groupSearchType(final String groupSearchType) {
            this.groupSearchType = groupSearchType;
            return this;
        }

        public LdapConfiguration.Builder searchBindDN(final String searchBindDN) {
            this.searchBindDN = searchBindDN;
            return this;
        }

        public LdapConfiguration.Builder serverURIs(final String[] serverURIs) {
            this.serverURIs = serverURIs;
            return this;
        }

        public LdapConfiguration.Builder userDNTemplate(final String userDNTemplate) {
            this.userDNTemplate = userDNTemplate;
            return this;
        }

        public LdapConfiguration.Builder userSearchBaseDN(final String userSearchBaseDN) {
            this.userSearchBaseDN = userSearchBaseDN;
            return this;
        }

        public LdapConfiguration.Builder userSearchFilter(final String userSearchFilter) {
            this.userSearchFilter = userSearchFilter;
            return this;
        }

    }

}
