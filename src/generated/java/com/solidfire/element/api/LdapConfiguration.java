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
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ['LDAP Configuration object returns information about the LDAP configuration on SolidFire storage. LDAP information is returned with the API method GetLdapConfiguration.']
 **/

public class LdapConfiguration implements Serializable {

    public static final long serialVersionUID = -4900050528922714170L;
    @SerializedName("authType") private String authType;
    @SerializedName("enabled") private Boolean enabled;
    @SerializedName("groupSearchBaseDN") private String groupSearchBaseDN;
    @SerializedName("groupSearchCustomFilter") private String groupSearchCustomFilter;
    @SerializedName("groupSearchType") private String groupSearchType;
    @SerializedName("searchBindDN") private String searchBindDN;
    @SerializedName("serverURIs") private String[] serverURIs;
    @SerializedName("userDNTemplate") private String userDNTemplate;
    @SerializedName("userSearchBaseDN") private String userSearchBaseDN;
    @SerializedName("userSearchFilter") private String userSearchFilter;

    // empty constructor
    @Since("7.0")
    public LdapConfiguration() {}

    // parameterized constructor
    @Since("7.0")
    public LdapConfiguration(
        String authType,
        Boolean enabled,
        String groupSearchBaseDN,
        String groupSearchCustomFilter,
        String groupSearchType,
        String searchBindDN,
        String[] serverURIs,
        String userDNTemplate,
        String userSearchBaseDN,
        String userSearchFilter
    )
    {
        this.authType = authType;
        this.enabled = enabled;
        this.groupSearchBaseDN = groupSearchBaseDN;
        this.groupSearchCustomFilter = groupSearchCustomFilter;
        this.groupSearchType = groupSearchType;
        this.searchBindDN = searchBindDN;
        this.serverURIs = serverURIs;
        this.userDNTemplate = userDNTemplate;
        this.userSearchBaseDN = userSearchBaseDN;
        this.userSearchFilter = userSearchFilter;
    }

    /** 
     * Identifies which user authentcation method will be used. <br/>
     * Valid values:<br/>
     * <b>DirectBind</b><br/>
     * <b>SearchAndBind</b>
     **/
    public String getAuthType() { return this.authType; }
    public void setAuthType(String authType) { 
        this.authType = authType;
    }
    /** 
     * Identifies whether or not the system is enabled for LDAP. <br/>
     * Valid values:<br/>
     * <b>true</b><br/>
     * <b>false</b>
     **/
    public Boolean getEnabled() { return this.enabled; }
    public void setEnabled(Boolean enabled) { 
        this.enabled = enabled;
    }
    /** 
     * The base DN of the tree to start the group search (will do a subtree search from here).
     **/
    public String getGroupSearchBaseDN() { return this.groupSearchBaseDN; }
    public void setGroupSearchBaseDN(String groupSearchBaseDN) { 
        this.groupSearchBaseDN = groupSearchBaseDN;
    }
    /** 
     * The custom search filter used.
     **/
    public String getGroupSearchCustomFilter() { return this.groupSearchCustomFilter; }
    public void setGroupSearchCustomFilter(String groupSearchCustomFilter) { 
        this.groupSearchCustomFilter = groupSearchCustomFilter;
    }
    /** 
     * Controls the default group search filter used, can be one of the following:<br/>
     * <b>NoGroups</b>: No group support.<br/>
     * <b>ActiveDirectory</b>: Nested membership of all of a user's AD groups.<br/>
     * <b>MemberDN</b>: MemberDN style groups (single-level).
     **/
    public String getGroupSearchType() { return this.groupSearchType; }
    public void setGroupSearchType(String groupSearchType) { 
        this.groupSearchType = groupSearchType;
    }
    /** 
     * A fully qualified DN to log in with to perform an LDAP search for the user (needs read access to the LDAP directory).
     **/
    public String getSearchBindDN() { return this.searchBindDN; }
    public void setSearchBindDN(String searchBindDN) { 
        this.searchBindDN = searchBindDN;
    }
    /** 
     * A comma-separated list of LDAP server URIs (examples: "ldap://1.2.3.4" and ldaps://1.2.3.4:123")
     **/
    public String[] getServerURIs() { return this.serverURIs; }
    public void setServerURIs(String[] serverURIs) { 
        this.serverURIs = serverURIs;
    }
    /** 
     * A string that is used to form a fully qualified user DN.
     **/
    public String getUserDNTemplate() { return this.userDNTemplate; }
    public void setUserDNTemplate(String userDNTemplate) { 
        this.userDNTemplate = userDNTemplate;
    }
    /** 
     * The base DN of the tree used to start the search (will do a subtree search from here).
     **/
    public String getUserSearchBaseDN() { return this.userSearchBaseDN; }
    public void setUserSearchBaseDN(String userSearchBaseDN) { 
        this.userSearchBaseDN = userSearchBaseDN;
    }
    /** 
     * The LDAP filter used.
     **/
    public String getUserSearchFilter() { return this.userSearchFilter; }
    public void setUserSearchFilter(String userSearchFilter) { 
        this.userSearchFilter = userSearchFilter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LdapConfiguration that = (LdapConfiguration) o;

        return 
            Objects.equals(authType, that.authType) &&
            Objects.equals(enabled, that.enabled) &&
            Objects.equals(groupSearchBaseDN, that.groupSearchBaseDN) &&
            Objects.equals(groupSearchCustomFilter, that.groupSearchCustomFilter) &&
            Objects.equals(groupSearchType, that.groupSearchType) &&
            Objects.equals(searchBindDN, that.searchBindDN) &&
            Arrays.equals(serverURIs, that.serverURIs) &&
            Objects.equals(userDNTemplate, that.userDNTemplate) &&
            Objects.equals(userSearchBaseDN, that.userSearchBaseDN) &&
            Objects.equals(userSearchFilter, that.userSearchFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash( authType, enabled, groupSearchBaseDN, groupSearchCustomFilter, groupSearchType, searchBindDN, (Object[])serverURIs, userDNTemplate, userSearchBaseDN, userSearchFilter );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("authType", authType);
        map.put("enabled", enabled);
        map.put("groupSearchBaseDN", groupSearchBaseDN);
        map.put("groupSearchCustomFilter", groupSearchCustomFilter);
        map.put("groupSearchType", groupSearchType);
        map.put("searchBindDN", searchBindDN);
        map.put("serverURIs", serverURIs);
        map.put("userDNTemplate", userDNTemplate);
        map.put("userSearchBaseDN", userSearchBaseDN);
        map.put("userSearchFilter", userSearchFilter);
        return map;
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
        sb.append(" userSearchFilter : ").append(userSearchFilter).append(",");
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
                         this.userSearchFilter);
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
