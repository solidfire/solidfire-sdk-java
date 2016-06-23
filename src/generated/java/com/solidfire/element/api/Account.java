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
 * The object containing information about an account.
 **/
public class Account implements Serializable {

    private static final long serialVersionUID = -153016324L;

    @SerializedName("accountID") private final long accountID;
    @SerializedName("username") private final String username;
    @SerializedName("status") private final String status;
    @SerializedName("volumes") private final Long[] volumes;
    @SerializedName("initiatorSecret") private final Optional<String> initiatorSecret;
    @SerializedName("targetSecret") private final Optional<String> targetSecret;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The object containing information about an account.
     * This object only includes &quot;configured&quot; information about the account, not any runtime or usage information.
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
    public Account(long accountID, String username, String status, Long[] volumes, Optional<String> initiatorSecret, Optional<String> targetSecret, Optional<java.util.Map<String, Object>> attributes) {
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<String>empty() : initiatorSecret;
        this.username = username;
        this.volumes = volumes;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.accountID = accountID;
        this.status = status;
        this.targetSecret = (targetSecret == null) ? Optional.<String>empty() : targetSecret;
    }


    /**
     * Unique AccountID for the account.
     **/
    public long getAccountID() {
        return this.accountID;
    }

    /**
     * User name for the account.
     **/
    public String getUsername() {
        return this.username;
    }

    /**
     * Current status of the account.
     **/
    public String getStatus() {
        return this.status;
    }

    /**
     * List of VolumeIDs for Volumes owned by this account.
     **/
    public Long[] getVolumes() {
        return this.volumes;
    }

    /**
     * CHAP secret to use for the initiator.
     **/
    public Optional<String> getInitiatorSecret() {
        return this.initiatorSecret;
    }

    /**
     * CHAP secret to use for the target (mutual CHAP authentication).
     **/
    public Optional<String> getTargetSecret() {
        return this.targetSecret;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
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
}
