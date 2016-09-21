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
 * The Request object for the "EnableLdapAuthentication" API Service call.
 **/
public class EnableLdapAuthenticationRequest  implements Serializable  {

    private static final long serialVersionUID = -2040059293L;

    @SerializedName("authType") private final Optional<String> authType;
    @SerializedName("groupSearchBaseDN") private final Optional<String> groupSearchBaseDN;
    @SerializedName("groupSearchCustomFilter") private final Optional<String> groupSearchCustomFilter;
    @SerializedName("groupSearchType") private final Optional<String> groupSearchType;
    @SerializedName("searchBindDN") private final Optional<String> searchBindDN;
    @SerializedName("searchBindPassword") private final Optional<String> searchBindPassword;
    @SerializedName("serverURIs") private final String[] serverURIs;
    @SerializedName("userDNTemplate") private final Optional<String> userDNTemplate;
    @SerializedName("userSearchBaseDN") private final Optional<String> userSearchBaseDN;
    @SerializedName("userSearchFilter") private final Optional<String> userSearchFilter;

    /**
     * The Request object for the "EnableLdapAuthentication" API Service call.
     * @param authType (optional) Identifies which user authentcation method will be used. <br/>
     * @param groupSearchBaseDN (optional) The base DN of the tree to start the group search (will do a subtree search from here).
     * @param groupSearchCustomFilter (optional) REQUIRED for CustomFilter<br/>
     * @param groupSearchType (optional) Controls the default group search filter used, can be one of the following:<br/>
     * @param searchBindDN (optional) REQUIRED for SearchAndBind<br/>
     * @param searchBindPassword (optional) REQUIRED for SearchAndBind<br/>
     * @param serverURIs [required] A list of LDAP server URIs (examples: "ldap://1.2.3.4" and ldaps://1.2.3.4:123")
     * @param userDNTemplate (optional) REQUIRED for DirectBind<br/>
     * @param userSearchBaseDN (optional) REQUIRED for SearchAndBind
     * @param userSearchFilter (optional) REQUIRED for SearchAndBind.<br/>
     * @since 8.0
     **/
    @Since("8.0")
    public EnableLdapAuthenticationRequest(Optional<String> authType, Optional<String> groupSearchBaseDN, Optional<String> groupSearchCustomFilter, Optional<String> groupSearchType, Optional<String> searchBindDN, Optional<String> searchBindPassword, String[] serverURIs, Optional<String> userDNTemplate, Optional<String> userSearchBaseDN, Optional<String> userSearchFilter) {
        this.searchBindDN = (searchBindDN == null) ? Optional.<String>empty() : searchBindDN;
        this.userSearchFilter = (userSearchFilter == null) ? Optional.<String>empty() : userSearchFilter;
        this.serverURIs = serverURIs;
        this.groupSearchBaseDN = (groupSearchBaseDN == null) ? Optional.<String>empty() : groupSearchBaseDN;
        this.groupSearchCustomFilter = (groupSearchCustomFilter == null) ? Optional.<String>empty() : groupSearchCustomFilter;
        this.searchBindPassword = (searchBindPassword == null) ? Optional.<String>empty() : searchBindPassword;
        this.authType = (authType == null) ? Optional.<String>empty() : authType;
        this.groupSearchType = (groupSearchType == null) ? Optional.<String>empty() : groupSearchType;
        this.userSearchBaseDN = (userSearchBaseDN == null) ? Optional.<String>empty() : userSearchBaseDN;
        this.userDNTemplate = (userDNTemplate == null) ? Optional.<String>empty() : userDNTemplate;
    }


    /**
     * Identifies which user authentcation method will be used. <br/>
     * Must be one of the following:<br/>
     * <b>DirectBind</b><br/>
     * <b>SearchAndBind</b> (default)
     **/
    public Optional<String> getAuthType() {
        return this.authType;
    }

    /**
     * The base DN of the tree to start the group search (will do a subtree search from here).
     **/
    public Optional<String> getGroupSearchBaseDN() {
        return this.groupSearchBaseDN;
    }

    /**
     * REQUIRED for CustomFilter<br/>
     * For use with the CustomFilter search type, an LDAP filter to use to return the DNs of a user's groups.<br/>
     * The string can have placeholder text of %USERNAME% and %USERDN% to be replaced with their username and full userDN as needed.
     **/
    public Optional<String> getGroupSearchCustomFilter() {
        return this.groupSearchCustomFilter;
    }

    /**
     * Controls the default group search filter used, can be one of the following:<br/>
     * <b>NoGroups</b>: No group support.<br/>
     * <b>ActiveDirectory</b>: (default) Nested membership of all of a user's AD groups.<br/>
     * <b>MemberDN</b>: MemberDN style groups (single-level).
     **/
    public Optional<String> getGroupSearchType() {
        return this.groupSearchType;
    }

    /**
     * REQUIRED for SearchAndBind<br/>
     * A fully qualified DN to log in with to perform an LDAP search for the user (needs read access to the LDAP directory).
     **/
    public Optional<String> getSearchBindDN() {
        return this.searchBindDN;
    }

    /**
     * REQUIRED for SearchAndBind<br/>
     * The password for the searchBindDN account used for searching.
     **/
    public Optional<String> getSearchBindPassword() {
        return this.searchBindPassword;
    }

    /**
     * A list of LDAP server URIs (examples: "ldap://1.2.3.4" and ldaps://1.2.3.4:123")
     **/
    public String[] getServerURIs() {
        return this.serverURIs;
    }

    /**
     * REQUIRED for DirectBind<br/>
     * A string that is used to form a fully qualified user DN.<br/>
     * The string should have the placeholder text "%USERNAME%" which will be replaced with the username of the authenticating user.
     **/
    public Optional<String> getUserDNTemplate() {
        return this.userDNTemplate;
    }

    /**
     * REQUIRED for SearchAndBind
     * The base DN of the tree used to start the search (will do a subtree search from here).
     **/
    public Optional<String> getUserSearchBaseDN() {
        return this.userSearchBaseDN;
    }

    /**
     * REQUIRED for SearchAndBind.<br/>
     * The LDAP filter to use.<br/>
     * The string should have the placeholder text "%USERNAME%" which will be replaced with the username of the authenticating user.<br/>
     * Example: (&(objectClass=person) (sAMAccountName=%USERNAME%)) will use the sAMAccountName field in Active Directory to match the nusername entered at cluster login.
     **/
    public Optional<String> getUserSearchFilter() {
        return this.userSearchFilter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnableLdapAuthenticationRequest that = (EnableLdapAuthenticationRequest) o;
        

        return Objects.equals( authType , that.authType )
            && Objects.equals( groupSearchBaseDN , that.groupSearchBaseDN )
            && Objects.equals( groupSearchCustomFilter , that.groupSearchCustomFilter )
            && Objects.equals( groupSearchType , that.groupSearchType )
            && Objects.equals( searchBindDN , that.searchBindDN )
            && Objects.equals( searchBindPassword , that.searchBindPassword )
            && Objects.deepEquals( serverURIs , that.serverURIs )
            && Objects.equals( userDNTemplate , that.userDNTemplate )
            && Objects.equals( userSearchBaseDN , that.userSearchBaseDN )
            && Objects.equals( userSearchFilter , that.userSearchFilter );
    }

    @Override
    public int hashCode() {
        return Objects.hash( authType, groupSearchBaseDN, groupSearchCustomFilter, groupSearchType, searchBindDN, searchBindPassword, serverURIs, userDNTemplate, userSearchBaseDN, userSearchFilter );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != authType && authType.isPresent())
            sb.append(" authType : ").append(authType.get()).append(",");
        if(null != groupSearchBaseDN && groupSearchBaseDN.isPresent())
            sb.append(" groupSearchBaseDN : ").append(groupSearchBaseDN.get()).append(",");
        if(null != groupSearchCustomFilter && groupSearchCustomFilter.isPresent())
            sb.append(" groupSearchCustomFilter : ").append(groupSearchCustomFilter.get()).append(",");
        if(null != groupSearchType && groupSearchType.isPresent())
            sb.append(" groupSearchType : ").append(groupSearchType.get()).append(",");
        if(null != searchBindDN && searchBindDN.isPresent())
            sb.append(" searchBindDN : ").append(searchBindDN.get()).append(",");
        if(null != searchBindPassword && searchBindPassword.isPresent())
            sb.append(" searchBindPassword : ").append(searchBindPassword.get()).append(",");
        sb.append(" serverURIs : ").append(Arrays.toString(serverURIs)).append(",");
        if(null != userDNTemplate && userDNTemplate.isPresent())
            sb.append(" userDNTemplate : ").append(userDNTemplate.get()).append(",");
        if(null != userSearchBaseDN && userSearchBaseDN.isPresent())
            sb.append(" userSearchBaseDN : ").append(userSearchBaseDN.get()).append(",");
        if(null != userSearchFilter && userSearchFilter.isPresent())
            sb.append(" userSearchFilter : ").append(userSearchFilter.get());
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
        private Optional<String> authType;
        private Optional<String> groupSearchBaseDN;
        private Optional<String> groupSearchCustomFilter;
        private Optional<String> groupSearchType;
        private Optional<String> searchBindDN;
        private Optional<String> searchBindPassword;
        private String[] serverURIs;
        private Optional<String> userDNTemplate;
        private Optional<String> userSearchBaseDN;
        private Optional<String> userSearchFilter;

        private Builder() { }

        public EnableLdapAuthenticationRequest build() {
            return new EnableLdapAuthenticationRequest (
                         this.authType,
                         this.groupSearchBaseDN,
                         this.groupSearchCustomFilter,
                         this.groupSearchType,
                         this.searchBindDN,
                         this.searchBindPassword,
                         this.serverURIs,
                         this.userDNTemplate,
                         this.userSearchBaseDN,
                         this.userSearchFilter            );
        }

        private EnableLdapAuthenticationRequest.Builder buildFrom(final EnableLdapAuthenticationRequest req) {
            this.authType = req.authType;
            this.groupSearchBaseDN = req.groupSearchBaseDN;
            this.groupSearchCustomFilter = req.groupSearchCustomFilter;
            this.groupSearchType = req.groupSearchType;
            this.searchBindDN = req.searchBindDN;
            this.searchBindPassword = req.searchBindPassword;
            this.serverURIs = req.serverURIs;
            this.userDNTemplate = req.userDNTemplate;
            this.userSearchBaseDN = req.userSearchBaseDN;
            this.userSearchFilter = req.userSearchFilter;

            return this;
        }

        public EnableLdapAuthenticationRequest.Builder optionalAuthType(final String authType) {
            this.authType = (authType == null) ? Optional.<String>empty() : Optional.of(authType);
            return this;
        }

        public EnableLdapAuthenticationRequest.Builder optionalGroupSearchBaseDN(final String groupSearchBaseDN) {
            this.groupSearchBaseDN = (groupSearchBaseDN == null) ? Optional.<String>empty() : Optional.of(groupSearchBaseDN);
            return this;
        }

        public EnableLdapAuthenticationRequest.Builder optionalGroupSearchCustomFilter(final String groupSearchCustomFilter) {
            this.groupSearchCustomFilter = (groupSearchCustomFilter == null) ? Optional.<String>empty() : Optional.of(groupSearchCustomFilter);
            return this;
        }

        public EnableLdapAuthenticationRequest.Builder optionalGroupSearchType(final String groupSearchType) {
            this.groupSearchType = (groupSearchType == null) ? Optional.<String>empty() : Optional.of(groupSearchType);
            return this;
        }

        public EnableLdapAuthenticationRequest.Builder optionalSearchBindDN(final String searchBindDN) {
            this.searchBindDN = (searchBindDN == null) ? Optional.<String>empty() : Optional.of(searchBindDN);
            return this;
        }

        public EnableLdapAuthenticationRequest.Builder optionalSearchBindPassword(final String searchBindPassword) {
            this.searchBindPassword = (searchBindPassword == null) ? Optional.<String>empty() : Optional.of(searchBindPassword);
            return this;
        }

        public EnableLdapAuthenticationRequest.Builder serverURIs(final String[] serverURIs) {
            this.serverURIs = serverURIs;
            return this;
        }

        public EnableLdapAuthenticationRequest.Builder optionalUserDNTemplate(final String userDNTemplate) {
            this.userDNTemplate = (userDNTemplate == null) ? Optional.<String>empty() : Optional.of(userDNTemplate);
            return this;
        }

        public EnableLdapAuthenticationRequest.Builder optionalUserSearchBaseDN(final String userSearchBaseDN) {
            this.userSearchBaseDN = (userSearchBaseDN == null) ? Optional.<String>empty() : Optional.of(userSearchBaseDN);
            return this;
        }

        public EnableLdapAuthenticationRequest.Builder optionalUserSearchFilter(final String userSearchFilter) {
            this.userSearchFilter = (userSearchFilter == null) ? Optional.<String>empty() : Optional.of(userSearchFilter);
            return this;
        }

    }

}
