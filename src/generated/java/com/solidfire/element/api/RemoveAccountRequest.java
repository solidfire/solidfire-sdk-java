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

import com.google.gson.annotations.SerializedName;
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
 * The Request object for the "RemoveAccount" API Service call.
 **/
public class RemoveAccountRequest implements Serializable {

    private static final long serialVersionUID = -820575074L;

    @SerializedName("accountID") private final long accountID;

    /**
     * The Request object for the "RemoveAccount" API Service call.
     * @param accountID [required] AccountID for the account to remove.
     * @since 7.0
     **/
    @Since("7.0")
    public RemoveAccountRequest(long accountID) {
        this.accountID = accountID;
    }


    /**
     * AccountID for the account to remove.
     **/
    public long getAccountID() {
        return this.accountID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveAccountRequest that = (RemoveAccountRequest) o;
        

        return Objects.equals( accountID , that.accountID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) accountID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" accountID : ").append(accountID);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private long accountID;

        private Builder() { }

        public RemoveAccountRequest build() {
            return new RemoveAccountRequest (
                         this.accountID            );
        }

        private RemoveAccountRequest.Builder buildFrom(final RemoveAccountRequest req) {
            this.accountID = req.accountID;

            return this;
        }

        public RemoveAccountRequest.Builder accountID(final long accountID) {
            this.accountID = accountID;
            return this;
        }

    }

}
