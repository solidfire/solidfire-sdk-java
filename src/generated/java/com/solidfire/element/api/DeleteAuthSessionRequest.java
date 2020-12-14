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
 * DeleteAuthSessionRequest  
 * Deletes an individual auth session
 * If the calling user is not in the ClusterAdmins / Administrator AccessGroup, only auth session belonging 
 * to the calling user can be deleted.
 **/

public class DeleteAuthSessionRequest implements Serializable {

    public static final long serialVersionUID = -173678916141884364L;
    @SerializedName("sessionID") private java.util.UUID sessionID;
    // empty constructor
    @Since("7.0")
    public DeleteAuthSessionRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteAuthSessionRequest(
        java.util.UUID sessionID
    )
    {
        this.sessionID = sessionID;
    }

    /** 
     * UUID for the auth session to be deleted.
     **/
    public java.util.UUID getSessionID() { return this.sessionID; }
   
    public void setSessionID(java.util.UUID sessionID) { 
        this.sessionID = sessionID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteAuthSessionRequest that = (DeleteAuthSessionRequest) o;

        return 
            Objects.equals(sessionID, that.sessionID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( sessionID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("sessionID", sessionID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" sessionID : ").append(gson.toJson(sessionID)).append(",");
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
        private java.util.UUID sessionID;

        private Builder() { }

        public DeleteAuthSessionRequest build() {
            return new DeleteAuthSessionRequest (
                         this.sessionID);
        }

        private DeleteAuthSessionRequest.Builder buildFrom(final DeleteAuthSessionRequest req) {
            this.sessionID = req.sessionID;

            return this;
        }

        public DeleteAuthSessionRequest.Builder sessionID(final java.util.UUID sessionID) {
            this.sessionID = sessionID;
            return this;
        }

    }
}
