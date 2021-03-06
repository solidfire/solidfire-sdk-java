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
 * EnableLdapAuthenticationRequest  
 * The EnableLdapAuthentication method enables you to configure an LDAP directory connection to use for LDAP authentication to a cluster. Users that are members of the LDAP directory can then log in to the storage system using their LDAP credentials.
 **/

public class EnableLdapAuthenticationRequest implements Serializable {

    public static final long serialVersionUID = 2007535657606871101L;
    @SerializedName("authType") private Optional<String> authType;
    @SerializedName("groupSearchBaseDN") private Optional<String> groupSearchBaseDN;
    @SerializedName("groupSearchCustomFilter") private Optional<String> groupSearchCustomFilter;
    @SerializedName("groupSearchType") private Optional<String> groupSearchType;
    @SerializedName("searchBindDN") private Optional<String> searchBindDN;
    @SerializedName("searchBindPassword") private Optional<String> searchBindPassword;
    @SerializedName("serverURIs") private String[] serverURIs;
    @SerializedName("userDNTemplate") private Optional<String> userDNTemplate;
    @SerializedName("userSearchBaseDN") private Optional<String> userSearchBaseDN;
    @SerializedName("userSearchFilter") private Optional<String> userSearchFilter;
    // empty constructor
    @Since("7.0")
    public EnableLdapAuthenticationRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public EnableLdapAuthenticationRequest(
        Optional<String> authType,
        Optional<String> groupSearchBaseDN,
        Optional<String> groupSearchCustomFilter,
        Optional<String> groupSearchType,
        Optional<String> searchBindDN,
        Optional<String> searchBindPassword,
        String[] serverURIs,
        Optional<String> userDNTemplate,
        Optional<String> userSearchBaseDN,
        Optional<String> userSearchFilter
    )
    {
        this.authType = (authType == null) ? Optional.<String>empty() : authType;
        this.groupSearchBaseDN = (groupSearchBaseDN == null) ? Optional.<String>empty() : groupSearchBaseDN;
        this.groupSearchCustomFilter = (groupSearchCustomFilter == null) ? Optional.<String>empty() : groupSearchCustomFilter;
        this.groupSearchType = (groupSearchType == null) ? Optional.<String>empty() : groupSearchType;
        this.searchBindDN = (searchBindDN == null) ? Optional.<String>empty() : searchBindDN;
        this.searchBindPassword = (searchBindPassword == null) ? Optional.<String>empty() : searchBindPassword;
        this.serverURIs = serverURIs;
        this.userDNTemplate = (userDNTemplate == null) ? Optional.<String>empty() : userDNTemplate;
        this.userSearchBaseDN = (userSearchBaseDN == null) ? Optional.<String>empty() : userSearchBaseDN;
        this.userSearchFilter = (userSearchFilter == null) ? Optional.<String>empty() : userSearchFilter;
    }

    /** 
     * Identifies which user authentication method to use. Must be one of the following:
     * DirectBind
     * SearchAndBind
     **/
    public Optional<String> getAuthType() { return this.authType; }
   
    public void setAuthType(Optional<String> authType) { 
        this.authType = (authType == null) ? Optional.<String>empty() : authType;
    }
    /** 
     * The base DN of the tree to start the group search (will do a subtree search from here).
     **/
    public Optional<String> getGroupSearchBaseDN() { return this.groupSearchBaseDN; }
   
    public void setGroupSearchBaseDN(Optional<String> groupSearchBaseDN) { 
        this.groupSearchBaseDN = (groupSearchBaseDN == null) ? Optional.<String>empty() : groupSearchBaseDN;
    }
    /** 
     * For use with the CustomFilter search type, an LDAP filter to use to return the DNs of a users groups. The string can have placeholder text of %USERNAME% and %USERDN% to be replaced with their username and full userDN as needed.
     **/
    public Optional<String> getGroupSearchCustomFilter() { return this.groupSearchCustomFilter; }
   
    public void setGroupSearchCustomFilter(Optional<String> groupSearchCustomFilter) { 
        this.groupSearchCustomFilter = (groupSearchCustomFilter == null) ? Optional.<String>empty() : groupSearchCustomFilter;
    }
    /** 
     * Controls the default group search filter used, and must be one of the following:
     * NoGroups: No group support.
     * ActiveDirectory: Nested membership of all of a users AD groups.
     * MemberDN: MemberDN style groups (single level).
     **/
    public Optional<String> getGroupSearchType() { return this.groupSearchType; }
   
    public void setGroupSearchType(Optional<String> groupSearchType) { 
        this.groupSearchType = (groupSearchType == null) ? Optional.<String>empty() : groupSearchType;
    }
    /** 
     * A fully qualified DN to log in with to perform an LDAP search for the user (needs read access to the LDAP directory).
     **/
    public Optional<String> getSearchBindDN() { return this.searchBindDN; }
   
    public void setSearchBindDN(Optional<String> searchBindDN) { 
        this.searchBindDN = (searchBindDN == null) ? Optional.<String>empty() : searchBindDN;
    }
    /** 
     * The password for the searchBindDN account used for searching.
     **/
    public Optional<String> getSearchBindPassword() { return this.searchBindPassword; }
   
    public void setSearchBindPassword(Optional<String> searchBindPassword) { 
        this.searchBindPassword = (searchBindPassword == null) ? Optional.<String>empty() : searchBindPassword;
    }
    /** 
     * A comma-separated list of LDAP server URIs (examples: "ldap://1.2.3.4" and ldaps://1.2.3.4:123")
     **/
    public String[] getServerURIs() { return this.serverURIs; }
   
    public void setServerURIs(String[] serverURIs) { 
        this.serverURIs = serverURIs;
    }
    /** 
     * A string that is used to form a fully qualified user DN. The string should have the placeholder text %USERNAME%, which is replaced with the username of the authenticating user.
     **/
    public Optional<String> getUserDNTemplate() { return this.userDNTemplate; }
   
    public void setUserDNTemplate(Optional<String> userDNTemplate) { 
        this.userDNTemplate = (userDNTemplate == null) ? Optional.<String>empty() : userDNTemplate;
    }
    /** 
     * The base DN of the tree to start the search (will do a subtree search from here).
     **/
    public Optional<String> getUserSearchBaseDN() { return this.userSearchBaseDN; }
   
    public void setUserSearchBaseDN(Optional<String> userSearchBaseDN) { 
        this.userSearchBaseDN = (userSearchBaseDN == null) ? Optional.<String>empty() : userSearchBaseDN;
    }
    /** 
     * The LDAP filter to use. The string should have the placeholder text %USERNAME% which is replaced with the username of the authenticating user. Example: (&(objectClass=person)(sAMAccountName=%USERNAME%)) will use the sAMAccountName field in Active Directory to match the username entered at cluster login.
     **/
    public Optional<String> getUserSearchFilter() { return this.userSearchFilter; }
   
    public void setUserSearchFilter(Optional<String> userSearchFilter) { 
        this.userSearchFilter = (userSearchFilter == null) ? Optional.<String>empty() : userSearchFilter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnableLdapAuthenticationRequest that = (EnableLdapAuthenticationRequest) o;

        return 
            Objects.equals(authType, that.authType) && 
            Objects.equals(groupSearchBaseDN, that.groupSearchBaseDN) && 
            Objects.equals(groupSearchCustomFilter, that.groupSearchCustomFilter) && 
            Objects.equals(groupSearchType, that.groupSearchType) && 
            Objects.equals(searchBindDN, that.searchBindDN) && 
            Objects.equals(searchBindPassword, that.searchBindPassword) && 
            Arrays.equals(serverURIs, that.serverURIs) && 
            Objects.equals(userDNTemplate, that.userDNTemplate) && 
            Objects.equals(userSearchBaseDN, that.userSearchBaseDN) && 
            Objects.equals(userSearchFilter, that.userSearchFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash( authType,groupSearchBaseDN,groupSearchCustomFilter,groupSearchType,searchBindDN,searchBindPassword,(Object[])serverURIs,userDNTemplate,userSearchBaseDN,userSearchFilter );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("authType", authType);
        map.put("groupSearchBaseDN", groupSearchBaseDN);
        map.put("groupSearchCustomFilter", groupSearchCustomFilter);
        map.put("groupSearchType", groupSearchType);
        map.put("searchBindDN", searchBindDN);
        map.put("searchBindPassword", searchBindPassword);
        map.put("serverURIs", serverURIs);
        map.put("userDNTemplate", userDNTemplate);
        map.put("userSearchBaseDN", userSearchBaseDN);
        map.put("userSearchFilter", userSearchFilter);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != authType && authType.isPresent()){
            sb.append(" authType : ").append(gson.toJson(authType)).append(",");
        }
        else{
            sb.append(" authType : ").append("null").append(",");
        }
        if(null != groupSearchBaseDN && groupSearchBaseDN.isPresent()){
            sb.append(" groupSearchBaseDN : ").append(gson.toJson(groupSearchBaseDN)).append(",");
        }
        else{
            sb.append(" groupSearchBaseDN : ").append("null").append(",");
        }
        if(null != groupSearchCustomFilter && groupSearchCustomFilter.isPresent()){
            sb.append(" groupSearchCustomFilter : ").append(gson.toJson(groupSearchCustomFilter)).append(",");
        }
        else{
            sb.append(" groupSearchCustomFilter : ").append("null").append(",");
        }
        if(null != groupSearchType && groupSearchType.isPresent()){
            sb.append(" groupSearchType : ").append(gson.toJson(groupSearchType)).append(",");
        }
        else{
            sb.append(" groupSearchType : ").append("null").append(",");
        }
        if(null != searchBindDN && searchBindDN.isPresent()){
            sb.append(" searchBindDN : ").append(gson.toJson(searchBindDN)).append(",");
        }
        else{
            sb.append(" searchBindDN : ").append("null").append(",");
        }
        if(null != searchBindPassword && searchBindPassword.isPresent()){
            sb.append(" searchBindPassword : ").append(gson.toJson(searchBindPassword)).append(",");
        }
        else{
            sb.append(" searchBindPassword : ").append("null").append(",");
        }
        sb.append(" serverURIs : ").append(gson.toJson(Arrays.toString(serverURIs))).append(",");
        if(null != userDNTemplate && userDNTemplate.isPresent()){
            sb.append(" userDNTemplate : ").append(gson.toJson(userDNTemplate)).append(",");
        }
        else{
            sb.append(" userDNTemplate : ").append("null").append(",");
        }
        if(null != userSearchBaseDN && userSearchBaseDN.isPresent()){
            sb.append(" userSearchBaseDN : ").append(gson.toJson(userSearchBaseDN)).append(",");
        }
        else{
            sb.append(" userSearchBaseDN : ").append("null").append(",");
        }
        if(null != userSearchFilter && userSearchFilter.isPresent()){
            sb.append(" userSearchFilter : ").append(gson.toJson(userSearchFilter)).append(",");
        }
        else{
            sb.append(" userSearchFilter : ").append("null").append(",");
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
                         this.userSearchFilter);
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
