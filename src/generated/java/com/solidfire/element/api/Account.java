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
 * The object containing information about an account.
 **/
public class Account  implements Serializable  {

    private static final long serialVersionUID = 2129640835L;

    @SerializedName("accountID") private Long accountID;
    @SerializedName("username") private String username;
    @SerializedName("status") private String status;
    @SerializedName("volumes") private Long[] volumes;
    @SerializedName("initiatorSecret") private Optional<CHAPSecret> initiatorSecret;
    @SerializedName("targetSecret") private Optional<CHAPSecret> targetSecret;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    /**
     * The object containing information about an account.
     * This object only includes "configured" information about the account, not any runtime or usage information.
     * @param accountID [required] Unique AccountID for the account.
     * @param username [required] User name for the account.
     * @param status [required] Current status of the account.
     * @param volumes [required] List of VolumeIDs for Volumes owned by this account.
     * @param initiatorSecret (optional) CHAP secret to use for the initiator.
     * @param targetSecret (optional) CHAP secret to use for the target (mutual CHAP authentication).
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public Account(Long accountID, String username, String status, Long[] volumes, Optional<CHAPSecret> initiatorSecret, Optional<CHAPSecret> targetSecret, Optional<java.util.Map<String, Object>> attributes) {
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.username = username;
        this.volumes = volumes;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.accountID = accountID;
        this.status = status;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
    }

    
    /**
     * The object containing information about an account.
     * This object only includes "configured" information about the account, not any runtime or usage information.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public Account() {}


    /**
     * Unique AccountID for the account.
     **/
    public Long getAccountID() {
        return this.accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }



    /**
     * User name for the account.
     **/
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    /**
     * Current status of the account.
     **/
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    /**
     * List of VolumeIDs for Volumes owned by this account.
     **/
    public Long[] getVolumes() {
        return this.volumes;
    }

    public void setVolumes(Long[] volumes) {
        this.volumes = volumes;
    }



    /**
     * CHAP secret to use for the initiator.
     **/
    public Optional<CHAPSecret> getInitiatorSecret() {
        return this.initiatorSecret;
    }

    public void setInitiatorSecret(CHAPSecret initiatorSecret) {
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(initiatorSecret);
    }



    /**
     * CHAP secret to use for the target (mutual CHAP authentication).
     **/
    public Optional<CHAPSecret> getTargetSecret() {
        return this.targetSecret;
    }

    public void setTargetSecret(CHAPSecret targetSecret) {
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(targetSecret);
    }



    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(java.util.Map<String, Object> attributes) {
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account that = (Account) o;
        

        return Objects.equals( accountID , that.accountID )
            && Objects.equals( username , that.username )
            && Objects.equals( status , that.status )
            && Objects.deepEquals( volumes , that.volumes )
            && Objects.equals( initiatorSecret , that.initiatorSecret )
            && Objects.equals( targetSecret , that.targetSecret )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID, username, status, volumes, initiatorSecret, targetSecret, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" accountID : ").append(accountID).append(",");
        sb.append(" username : ").append(username).append(",");
        sb.append(" status : ").append(status).append(",");
        sb.append(" volumes : ").append(Arrays.toString(volumes)).append(",");
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
        private String username;
        private String status;
        private Long[] volumes;
        private Optional<CHAPSecret> initiatorSecret;
        private Optional<CHAPSecret> targetSecret;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public Account build() {
            return new Account (
                         this.accountID,
                         this.username,
                         this.status,
                         this.volumes,
                         this.initiatorSecret,
                         this.targetSecret,
                         this.attributes            );
        }

        private Account.Builder buildFrom(final Account req) {
            this.accountID = req.accountID;
            this.username = req.username;
            this.status = req.status;
            this.volumes = req.volumes;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;
            this.attributes = req.attributes;

            return this;
        }

        public Account.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public Account.Builder username(final String username) {
            this.username = username;
            return this;
        }

        public Account.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public Account.Builder volumes(final Long[] volumes) {
            this.volumes = volumes;
            return this;
        }

        public Account.Builder optionalInitiatorSecret(final CHAPSecret initiatorSecret) {
            this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(initiatorSecret);
            return this;
        }

        public Account.Builder optionalTargetSecret(final CHAPSecret targetSecret) {
            this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(targetSecret);
            return this;
        }

        public Account.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
