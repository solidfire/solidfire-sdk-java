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
 * AuthSessionInfo  
 * Contains a information about an auth session.
 **/

public class AuthSessionInfo implements Serializable {

    public static final long serialVersionUID = -3004078740507978815L;
    @SerializedName("clusterAdminIDs") private Long[] clusterAdminIDs;
    @SerializedName("username") private String username;
    @SerializedName("sessionID") private java.util.UUID sessionID;
    @SerializedName("sessionCreationTime") private String sessionCreationTime;
    @SerializedName("finalTimeout") private String finalTimeout;
    @SerializedName("lastAccessTimeout") private String lastAccessTimeout;
    @SerializedName("accessGroupList") private String[] accessGroupList;
    @SerializedName("authMethod") private String authMethod;
    @SerializedName("idpConfigVersion") private Long idpConfigVersion;
    // empty constructor
    @Since("7.0")
    public AuthSessionInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public AuthSessionInfo(
        Long[] clusterAdminIDs,
        String username,
        java.util.UUID sessionID,
        String sessionCreationTime,
        String finalTimeout,
        String lastAccessTimeout,
        String[] accessGroupList,
        String authMethod,
        Long idpConfigVersion
    )
    {
        this.clusterAdminIDs = clusterAdminIDs;
        this.username = username;
        this.sessionID = sessionID;
        this.sessionCreationTime = sessionCreationTime;
        this.finalTimeout = finalTimeout;
        this.lastAccessTimeout = lastAccessTimeout;
        this.accessGroupList = accessGroupList;
        this.authMethod = authMethod;
        this.idpConfigVersion = idpConfigVersion;
    }

    /** 
     * Cluster AdminID(s) associated with this session.  For sessions related to LDAP or 
     * a third party Identity Provider (IdP), this will be an aggregate list of matching 
     * Cluster AdminIDs associated with this session.
     **/
    public Long[] getClusterAdminIDs() { return this.clusterAdminIDs; }
   
    public void setClusterAdminIDs(Long[] clusterAdminIDs) { 
        this.clusterAdminIDs = clusterAdminIDs;
    }
    /** 
     * Username associated with this session.  For sessions related to LDAP 
     * this will be the user's LDAP DN.  For sessions related to a third party 
     * Identity Provider (IdP), this will be an arbitrary name-value pair that will be 
     * used for auditing operations within the session.  It will not necessarily match 
     * a cluster admin name on the cluster.  For example, a SAML Subject NameID, 
     * but this will be dictated by the configuration of the IdP and the resultant content 
     * of the SAML assertion.
     **/
    public String getUsername() { return this.username; }
   
    public void setUsername(String username) { 
        this.username = username;
    }
    /** 
     * UUID for this session.
     **/
    public java.util.UUID getSessionID() { return this.sessionID; }
   
    public void setSessionID(java.util.UUID sessionID) { 
        this.sessionID = sessionID;
    }
    /** 
     * Time at which the session was created.
     **/
    public String getSessionCreationTime() { return this.sessionCreationTime; }
   
    public void setSessionCreationTime(String sessionCreationTime) { 
        this.sessionCreationTime = sessionCreationTime;
    }
    /** 
     * Time at which the session becomes invalid.
     * This is set when the session is created and cannot be changed.
     **/
    public String getFinalTimeout() { return this.finalTimeout; }
   
    public void setFinalTimeout(String finalTimeout) { 
        this.finalTimeout = finalTimeout;
    }
    /** 
     * Time at which the session becomes invalid due to inactivity.
     * It is set to a new value when the session is accessed for use, 
     * up to the time where the session becomes invalid due to finalTimeout being reached.
     **/
    public String getLastAccessTimeout() { return this.lastAccessTimeout; }
   
    public void setLastAccessTimeout(String lastAccessTimeout) { 
        this.lastAccessTimeout = lastAccessTimeout;
    }
    /** 
     * List of access groups for the user.
     **/
    public String[] getAccessGroupList() { return this.accessGroupList; }
   
    public void setAccessGroupList(String[] accessGroupList) { 
        this.accessGroupList = accessGroupList;
    }
    /** 
     * Method in which the cluster admin was authenticated.
     **/
    public String getAuthMethod() { return this.authMethod; }
   
    public void setAuthMethod(String authMethod) { 
        this.authMethod = authMethod;
    }
    /** 
     * IdP configuration version when the session was created.
     **/
    public Long getIdpConfigVersion() { return this.idpConfigVersion; }
   
    public void setIdpConfigVersion(Long idpConfigVersion) { 
        this.idpConfigVersion = idpConfigVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthSessionInfo that = (AuthSessionInfo) o;

        return 
            Arrays.equals(clusterAdminIDs, that.clusterAdminIDs) && 
            Objects.equals(username, that.username) && 
            Objects.equals(sessionID, that.sessionID) && 
            Objects.equals(sessionCreationTime, that.sessionCreationTime) && 
            Objects.equals(finalTimeout, that.finalTimeout) && 
            Objects.equals(lastAccessTimeout, that.lastAccessTimeout) && 
            Arrays.equals(accessGroupList, that.accessGroupList) && 
            Objects.equals(authMethod, that.authMethod) && 
            Objects.equals(idpConfigVersion, that.idpConfigVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])clusterAdminIDs,username,sessionID,sessionCreationTime,finalTimeout,lastAccessTimeout,(Object[])accessGroupList,authMethod,idpConfigVersion );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterAdminIDs", clusterAdminIDs);
        map.put("username", username);
        map.put("sessionID", sessionID);
        map.put("sessionCreationTime", sessionCreationTime);
        map.put("finalTimeout", finalTimeout);
        map.put("lastAccessTimeout", lastAccessTimeout);
        map.put("accessGroupList", accessGroupList);
        map.put("authMethod", authMethod);
        map.put("idpConfigVersion", idpConfigVersion);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" clusterAdminIDs : ").append(gson.toJson(Arrays.toString(clusterAdminIDs))).append(",");
        sb.append(" username : ").append(gson.toJson(username)).append(",");
        sb.append(" sessionID : ").append(gson.toJson(sessionID)).append(",");
        sb.append(" sessionCreationTime : ").append(gson.toJson(sessionCreationTime)).append(",");
        sb.append(" finalTimeout : ").append(gson.toJson(finalTimeout)).append(",");
        sb.append(" lastAccessTimeout : ").append(gson.toJson(lastAccessTimeout)).append(",");
        sb.append(" accessGroupList : ").append(gson.toJson(Arrays.toString(accessGroupList))).append(",");
        sb.append(" authMethod : ").append(gson.toJson(authMethod)).append(",");
        sb.append(" idpConfigVersion : ").append(gson.toJson(idpConfigVersion)).append(",");
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
        private Long[] clusterAdminIDs;
        private String username;
        private java.util.UUID sessionID;
        private String sessionCreationTime;
        private String finalTimeout;
        private String lastAccessTimeout;
        private String[] accessGroupList;
        private String authMethod;
        private Long idpConfigVersion;

        private Builder() { }

        public AuthSessionInfo build() {
            return new AuthSessionInfo (
                         this.clusterAdminIDs,
                         this.username,
                         this.sessionID,
                         this.sessionCreationTime,
                         this.finalTimeout,
                         this.lastAccessTimeout,
                         this.accessGroupList,
                         this.authMethod,
                         this.idpConfigVersion);
        }

        private AuthSessionInfo.Builder buildFrom(final AuthSessionInfo req) {
            this.clusterAdminIDs = req.clusterAdminIDs;
            this.username = req.username;
            this.sessionID = req.sessionID;
            this.sessionCreationTime = req.sessionCreationTime;
            this.finalTimeout = req.finalTimeout;
            this.lastAccessTimeout = req.lastAccessTimeout;
            this.accessGroupList = req.accessGroupList;
            this.authMethod = req.authMethod;
            this.idpConfigVersion = req.idpConfigVersion;

            return this;
        }

        public AuthSessionInfo.Builder clusterAdminIDs(final Long[] clusterAdminIDs) {
            this.clusterAdminIDs = clusterAdminIDs;
            return this;
        }

        public AuthSessionInfo.Builder username(final String username) {
            this.username = username;
            return this;
        }

        public AuthSessionInfo.Builder sessionID(final java.util.UUID sessionID) {
            this.sessionID = sessionID;
            return this;
        }

        public AuthSessionInfo.Builder sessionCreationTime(final String sessionCreationTime) {
            this.sessionCreationTime = sessionCreationTime;
            return this;
        }

        public AuthSessionInfo.Builder finalTimeout(final String finalTimeout) {
            this.finalTimeout = finalTimeout;
            return this;
        }

        public AuthSessionInfo.Builder lastAccessTimeout(final String lastAccessTimeout) {
            this.lastAccessTimeout = lastAccessTimeout;
            return this;
        }

        public AuthSessionInfo.Builder accessGroupList(final String[] accessGroupList) {
            this.accessGroupList = accessGroupList;
            return this;
        }

        public AuthSessionInfo.Builder authMethod(final String authMethod) {
            this.authMethod = authMethod;
            return this;
        }

        public AuthSessionInfo.Builder idpConfigVersion(final Long idpConfigVersion) {
            this.idpConfigVersion = idpConfigVersion;
            return this;
        }

    }
}
