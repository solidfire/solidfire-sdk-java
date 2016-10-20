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
 * The Request object for the "ModifyAccount" API Service call.
 **/
public class ModifyAccountRequest  implements Serializable , IAccountRequest {

    private static final long serialVersionUID = -1770709149L;

    @SerializedName("accountID") private Long accountID;
    @SerializedName("username") private Optional<String> username;
    @SerializedName("status") private Optional<String> status;
    @SerializedName("initiatorSecret") private Optional<CHAPSecret> initiatorSecret;
    @SerializedName("targetSecret") private Optional<CHAPSecret> targetSecret;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "ModifyAccount" API Service call.
     * @param accountID [required] AccountID for the account to modify.
     * @param username (optional) Change the username of the account to this value.
     * @param status (optional) Status of the account.
     * @param initiatorSecret (optional) CHAP secret to use for the initiator.
     * @param targetSecret (optional) CHAP secret to use for the target (mutual CHAP authentication).
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public ModifyAccountRequest(Long accountID, Optional<String> username, Optional<String> status, Optional<CHAPSecret> initiatorSecret, Optional<CHAPSecret> targetSecret, Optional<java.util.Map<String, Object>> attributes) {
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.username = (username == null) ? Optional.<String>empty() : username;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.accountID = accountID;
        this.status = (status == null) ? Optional.<String>empty() : status;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
    }

    
    /**
     * The Request object for the "ModifyAccount" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public ModifyAccountRequest() {}


    /**
     * AccountID for the account to modify.
     **/
    public Long getAccountID() {
        return this.accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    /**
     * Change the username of the account to this value.
     **/
    public Optional<String> getUsername() {
        return this.username;
    }

    public void setUsername(Optional<String> username) {
        this.username = username;
    }

    /**
     * Status of the account.
     **/
    public Optional<String> getStatus() {
        return this.status;
    }

    public void setStatus(Optional<String> status) {
        this.status = status;
    }

    /**
     * CHAP secret to use for the initiator.
     * Should be 12-16 characters long and impenetrable.
     **/
    public Optional<CHAPSecret> getInitiatorSecret() {
        return this.initiatorSecret;
    }

    public void setInitiatorSecret(Optional<CHAPSecret> initiatorSecret) {
        this.initiatorSecret = initiatorSecret;
    }

    /**
     * CHAP secret to use for the target (mutual CHAP authentication).
     * Should be 12-16 characters long and impenetrable.
     **/
    public Optional<CHAPSecret> getTargetSecret() {
        return this.targetSecret;
    }

    public void setTargetSecret(Optional<CHAPSecret> targetSecret) {
        this.targetSecret = targetSecret;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(Optional<java.util.Map<String, Object>> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyAccountRequest that = (ModifyAccountRequest) o;
        

        return Objects.equals( accountID , that.accountID )
            && Objects.equals( username , that.username )
            && Objects.equals( status , that.status )
            && Objects.equals( initiatorSecret , that.initiatorSecret )
            && Objects.equals( targetSecret , that.targetSecret )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID, username, status, initiatorSecret, targetSecret, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" accountID : ").append(accountID).append(",");
        if(null != username && username.isPresent())
            sb.append(" username : ").append(username.get()).append(",");
        if(null != status && status.isPresent())
            sb.append(" status : ").append(status.get()).append(",");
        if(null != initiatorSecret && initiatorSecret.isPresent())
            sb.append(" initiatorSecret : ").append(initiatorSecret.get()).append(",");
        if(null != targetSecret && targetSecret.isPresent())
            sb.append(" targetSecret : ").append(targetSecret.get()).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
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
        private Long accountID;
        private Optional<String> username;
        private Optional<String> status;
        private Optional<CHAPSecret> initiatorSecret;
        private Optional<CHAPSecret> targetSecret;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public ModifyAccountRequest build() {
            return new ModifyAccountRequest (
                         this.accountID,
                         this.username,
                         this.status,
                         this.initiatorSecret,
                         this.targetSecret,
                         this.attributes            );
        }

        private ModifyAccountRequest.Builder buildFrom(final ModifyAccountRequest req) {
            this.accountID = req.accountID;
            this.username = req.username;
            this.status = req.status;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;
            this.attributes = req.attributes;

            return this;
        }

        public ModifyAccountRequest.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public ModifyAccountRequest.Builder optionalUsername(final String username) {
            this.username = (username == null) ? Optional.<String>empty() : Optional.of(username);
            return this;
        }

        public ModifyAccountRequest.Builder optionalStatus(final String status) {
            this.status = (status == null) ? Optional.<String>empty() : Optional.of(status);
            return this;
        }

        public ModifyAccountRequest.Builder optionalInitiatorSecret(final CHAPSecret initiatorSecret) {
            this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(initiatorSecret);
            return this;
        }

        public ModifyAccountRequest.Builder optionalTargetSecret(final CHAPSecret targetSecret) {
            this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(targetSecret);
            return this;
        }

        public ModifyAccountRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
