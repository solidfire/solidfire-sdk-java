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
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetAccountByNameRequest  
 **/

public class GetAccountByNameRequest implements Serializable {

    public static final long serialVersionUID = -6774078436625157895L;
    @SerializedName("username") private String username;

    // empty constructor
    @Since("7.0")
    public GetAccountByNameRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetAccountByNameRequest(
        String username
    )
    {
        this.username = username;
    }

    /** 
     * Username for the account.
     **/
    public String getUsername() { return this.username; }
    public void setUsername(String username) { 
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetAccountByNameRequest that = (GetAccountByNameRequest) o;

        return 
            Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash( username );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" username : ").append(username).append(",");
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
        private String username;

        private Builder() { }

        public GetAccountByNameRequest build() {
            return new GetAccountByNameRequest (
                         this.username);
        }

        private GetAccountByNameRequest.Builder buildFrom(final GetAccountByNameRequest req) {
            this.username = req.username;

            return this;
        }

        public GetAccountByNameRequest.Builder username(final String username) {
            this.username = username;
            return this;
        }

    }
}
