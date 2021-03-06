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
 * DeleteAuthSessionsByUsernameRequest  
 * Deletes all auth sessions for the given user.
 * A caller not in AccessGroup ClusterAdmins / Administrator may only delete their own sessions.
 * A caller with ClusterAdmins / Administrator privileges may delete sessions belonging to any user.
 * To see the list of sessions that could be deleted, use ListAuthSessionsByUsername with the same parameters.
 **/

public class DeleteAuthSessionsByUsernameRequest implements Serializable {

    public static final long serialVersionUID = 5572315853242121158L;
    @SerializedName("username") private Optional<String> username;
    @SerializedName("authMethod") private Optional<String> authMethod;
    // empty constructor
    @Since("7.0")
    public DeleteAuthSessionsByUsernameRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteAuthSessionsByUsernameRequest(
        Optional<String> username,
        Optional<String> authMethod
    )
    {
        this.username = (username == null) ? Optional.<String>empty() : username;
        this.authMethod = (authMethod == null) ? Optional.<String>empty() : authMethod;
    }

    /** 
     * Name that uniquely identifies the user.
     * When authMethod is Cluster, this specifies the ClusterAdmin username.
     * When authMethod is Ldap, this specifies the user's LDAP DN.
     * When authMethod is Idp, this may specify the user's IdP uid or NameID. If the IdP is not configured to return either, this specifies a random UUID issued when the session was created.
     * Only a caller in the ClusterAdmins / Administrator AccessGroup can provide this parameter.
     **/
    public Optional<String> getUsername() { return this.username; }
   
    public void setUsername(Optional<String> username) { 
        this.username = (username == null) ? Optional.<String>empty() : username;
    }
    /** 
     * Authentication method of the user sessions to be deleted.
     * Only a caller in the ClusterAdmins / Administrator AccessGroup can provide this parameter.
     **/
    public Optional<String> getAuthMethod() { return this.authMethod; }
   
    public void setAuthMethod(Optional<String> authMethod) { 
        this.authMethod = (authMethod == null) ? Optional.<String>empty() : authMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteAuthSessionsByUsernameRequest that = (DeleteAuthSessionsByUsernameRequest) o;

        return 
            Objects.equals(username, that.username) && 
            Objects.equals(authMethod, that.authMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash( username,authMethod );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("authMethod", authMethod);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != username && username.isPresent()){
            sb.append(" username : ").append(gson.toJson(username)).append(",");
        }
        else{
            sb.append(" username : ").append("null").append(",");
        }
        if(null != authMethod && authMethod.isPresent()){
            sb.append(" authMethod : ").append(gson.toJson(authMethod)).append(",");
        }
        else{
            sb.append(" authMethod : ").append("null").append(",");
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
        private Optional<String> username;
        private Optional<String> authMethod;

        private Builder() { }

        public DeleteAuthSessionsByUsernameRequest build() {
            return new DeleteAuthSessionsByUsernameRequest (
                         this.username,
                         this.authMethod);
        }

        private DeleteAuthSessionsByUsernameRequest.Builder buildFrom(final DeleteAuthSessionsByUsernameRequest req) {
            this.username = req.username;
            this.authMethod = req.authMethod;

            return this;
        }

        public DeleteAuthSessionsByUsernameRequest.Builder optionalUsername(final String username) {
            this.username = (username == null) ? Optional.<String>empty() : Optional.of(username);
            return this;
        }

        public DeleteAuthSessionsByUsernameRequest.Builder optionalAuthMethod(final String authMethod) {
            this.authMethod = (authMethod == null) ? Optional.<String>empty() : Optional.of(authMethod);
            return this;
        }

    }
}
