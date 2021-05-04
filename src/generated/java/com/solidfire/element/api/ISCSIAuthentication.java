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
 * ISCSIAuthentication  
 * Object containing the authentication information for an iSCSI session.
 **/

public class ISCSIAuthentication implements Serializable {

    public static final long serialVersionUID = -3946464430089175418L;
    @SerializedName("authMethod") private String authMethod;
    @SerializedName("direction") private String direction;
    @SerializedName("chapAlgorithm") private String chapAlgorithm;
    @SerializedName("chapUsername") private String chapUsername;
    // empty constructor
    @Since("7.0")
    public ISCSIAuthentication() {}

    
    // parameterized constructor
    @Since("7.0")
    public ISCSIAuthentication(
        String authMethod,
        String direction,
        String chapAlgorithm,
        String chapUsername
    )
    {
        this.authMethod = authMethod;
        this.direction = direction;
        this.chapAlgorithm = chapAlgorithm;
        this.chapUsername = chapUsername;
    }

    /** 
     * The authentication method used during iSCSI session login, e.g. CHAP or None.
     **/
    public String getAuthMethod() { return this.authMethod; }
   
    public void setAuthMethod(String authMethod) { 
        this.authMethod = authMethod;
    }
    /** 
     * The authentication direction, e.g. one-way (initiator only) or two-way (both initiator and target).
     **/
    public String getDirection() { return this.direction; }
   
    public void setDirection(String direction) { 
        this.direction = direction;
    }
    /** 
     * The CHAP algortihm used, e.g. MD5.
     **/
    public String getChapAlgorithm() { return this.chapAlgorithm; }
   
    public void setChapAlgorithm(String chapAlgorithm) { 
        this.chapAlgorithm = chapAlgorithm;
    }
    /** 
     * The CHAP username specified by the initiator during iSCSI session login.
     **/
    public String getChapUsername() { return this.chapUsername; }
   
    public void setChapUsername(String chapUsername) { 
        this.chapUsername = chapUsername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ISCSIAuthentication that = (ISCSIAuthentication) o;

        return 
            Objects.equals(authMethod, that.authMethod) && 
            Objects.equals(direction, that.direction) && 
            Objects.equals(chapAlgorithm, that.chapAlgorithm) && 
            Objects.equals(chapUsername, that.chapUsername);
    }

    @Override
    public int hashCode() {
        return Objects.hash( authMethod,direction,chapAlgorithm,chapUsername );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("authMethod", authMethod);
        map.put("direction", direction);
        map.put("chapAlgorithm", chapAlgorithm);
        map.put("chapUsername", chapUsername);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" authMethod : ").append(gson.toJson(authMethod)).append(",");
        sb.append(" direction : ").append(gson.toJson(direction)).append(",");
        sb.append(" chapAlgorithm : ").append(gson.toJson(chapAlgorithm)).append(",");
        sb.append(" chapUsername : ").append(gson.toJson(chapUsername)).append(",");
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
        private String authMethod;
        private String direction;
        private String chapAlgorithm;
        private String chapUsername;

        private Builder() { }

        public ISCSIAuthentication build() {
            return new ISCSIAuthentication (
                         this.authMethod,
                         this.direction,
                         this.chapAlgorithm,
                         this.chapUsername);
        }

        private ISCSIAuthentication.Builder buildFrom(final ISCSIAuthentication req) {
            this.authMethod = req.authMethod;
            this.direction = req.direction;
            this.chapAlgorithm = req.chapAlgorithm;
            this.chapUsername = req.chapUsername;

            return this;
        }

        public ISCSIAuthentication.Builder authMethod(final String authMethod) {
            this.authMethod = authMethod;
            return this;
        }

        public ISCSIAuthentication.Builder direction(final String direction) {
            this.direction = direction;
            return this;
        }

        public ISCSIAuthentication.Builder chapAlgorithm(final String chapAlgorithm) {
            this.chapAlgorithm = chapAlgorithm;
            return this;
        }

        public ISCSIAuthentication.Builder chapUsername(final String chapUsername) {
            this.chapUsername = chapUsername;
            return this;
        }

    }
}
