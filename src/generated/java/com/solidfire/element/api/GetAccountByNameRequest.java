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
 * The Request object for the "GetAccountByName" API Service call.
 **/
public class GetAccountByNameRequest implements Serializable {

    private static final long serialVersionUID = -1865201667L;

    private final String username;

    /**
     * The Request object for the "GetAccountByName" API Service call.
     * @param username [required] Username for the account.
     * @since 7.0
     **/
    @Since("7.0")
    public GetAccountByNameRequest(String username) {
        this.username = username;
    }


    /**
     * Username for the account.
     **/
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetAccountByNameRequest that = (GetAccountByNameRequest) o;
        

        return Objects.equals( username , that.username );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) username );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" username : ").append(username);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder getBuilder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().fromRequest(this);
    }

    public static class Builder {
        private String username;

        private Builder() { }

        public GetAccountByNameRequest toRequest() {
            return new GetAccountByNameRequest (
                         this.username            );
        }

        private GetAccountByNameRequest.Builder fromRequest(final GetAccountByNameRequest req) {
            this.username = req.username;

            return this;
        }

        public GetAccountByNameRequest.Builder withUsername(final String username) {
            this.username = username;
            return this;
        }

    }

}
