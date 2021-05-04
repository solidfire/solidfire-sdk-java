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
 * DeleteAuthSessionResult  
 * Return value from DeleteAuthSession.
 **/

public class DeleteAuthSessionResult implements Serializable {

    public static final long serialVersionUID = 2046952124699213769L;
    @SerializedName("session") private AuthSessionInfo session;
    // empty constructor
    @Since("7.0")
    public DeleteAuthSessionResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteAuthSessionResult(
        AuthSessionInfo session
    )
    {
        this.session = session;
    }

    /** 
     * SessionInfo for the auth session deleted.
     **/
    public AuthSessionInfo getSession() { return this.session; }
   
    public void setSession(AuthSessionInfo session) { 
        this.session = session;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteAuthSessionResult that = (DeleteAuthSessionResult) o;

        return 
            Objects.equals(session, that.session);
    }

    @Override
    public int hashCode() {
        return Objects.hash( session );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("session", session);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" session : ").append(gson.toJson(session)).append(",");
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
        private AuthSessionInfo session;

        private Builder() { }

        public DeleteAuthSessionResult build() {
            return new DeleteAuthSessionResult (
                         this.session);
        }

        private DeleteAuthSessionResult.Builder buildFrom(final DeleteAuthSessionResult req) {
            this.session = req.session;

            return this;
        }

        public DeleteAuthSessionResult.Builder session(final AuthSessionInfo session) {
            this.session = session;
            return this;
        }

    }
}
