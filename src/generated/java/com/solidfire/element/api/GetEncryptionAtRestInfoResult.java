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
 * GetEncryptionAtRestInfoResult  
 **/

public class GetEncryptionAtRestInfoResult implements Serializable {

    public static final long serialVersionUID = 374466650199754284L;
    @SerializedName("authenticationKeyInfo") private Optional<EncryptionKeyInfo> authenticationKeyInfo;
    @SerializedName("state") private String state;

    
    // parameterized constructor
    @Since("7.0")
    public GetEncryptionAtRestInfoResult(
    )
    {
    }
    // parameterized constructor
    @Since("12.0")
    public GetEncryptionAtRestInfoResult(
        Optional<EncryptionKeyInfo> authenticationKeyInfo,
        String state
    )
    {
        this.authenticationKeyInfo = (authenticationKeyInfo == null) ? Optional.<EncryptionKeyInfo>empty() : authenticationKeyInfo;
        this.state = state;
    }

    /** 
     * Information about the encryption key that's being used for the Encryption At Rest feature.
     **/
    public Optional<EncryptionKeyInfo> getAuthenticationKeyInfo() { return this.authenticationKeyInfo; }
   
    public void setAuthenticationKeyInfo(Optional<EncryptionKeyInfo> authenticationKeyInfo) { 
        this.authenticationKeyInfo = (authenticationKeyInfo == null) ? Optional.<EncryptionKeyInfo>empty() : authenticationKeyInfo;
    }
    /** 
     * The current Encryption At Rest state. Possible values are "disabled", "enabling", "enabled" or "disabling".
     **/
    public String getState() { return this.state; }
   
    public void setState(String state) { 
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetEncryptionAtRestInfoResult that = (GetEncryptionAtRestInfoResult) o;

        return 
            Objects.equals(authenticationKeyInfo, that.authenticationKeyInfo) && 
            Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash( authenticationKeyInfo,state );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("authenticationKeyInfo", authenticationKeyInfo);
        map.put("state", state);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != authenticationKeyInfo && authenticationKeyInfo.isPresent()){
            sb.append(" authenticationKeyInfo : ").append(gson.toJson(authenticationKeyInfo)).append(",");
        }
        else{
            sb.append(" authenticationKeyInfo : ").append("null").append(",");
        }
        sb.append(" state : ").append(gson.toJson(state)).append(",");
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
        private Optional<EncryptionKeyInfo> authenticationKeyInfo;
        private String state;

        private Builder() { }

        public GetEncryptionAtRestInfoResult build() {
            return new GetEncryptionAtRestInfoResult (
                         this.authenticationKeyInfo,
                         this.state);
        }

        private GetEncryptionAtRestInfoResult.Builder buildFrom(final GetEncryptionAtRestInfoResult req) {
            this.authenticationKeyInfo = req.authenticationKeyInfo;
            this.state = req.state;

            return this;
        }

        public GetEncryptionAtRestInfoResult.Builder optionalAuthenticationKeyInfo(final EncryptionKeyInfo authenticationKeyInfo) {
            this.authenticationKeyInfo = (authenticationKeyInfo == null) ? Optional.<EncryptionKeyInfo>empty() : Optional.of(authenticationKeyInfo);
            return this;
        }

        public GetEncryptionAtRestInfoResult.Builder state(final String state) {
            this.state = state;
            return this;
        }

    }
}
