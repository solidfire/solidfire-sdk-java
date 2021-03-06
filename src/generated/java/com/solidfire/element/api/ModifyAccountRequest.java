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
 * ModifyAccountRequest  
 * ModifyAccount enables you to modify an existing account.
 * When you lock an account, any existing connections from that account are immediately terminated. When you change an account's
 * CHAP settings, any existing connections remain active, and the new CHAP settings are used on subsequent connections or
 * reconnections.
 * To clear an account's attributes, specify {} for the attributes parameter.
 **/

public class ModifyAccountRequest implements Serializable {

    public static final long serialVersionUID = -9190428568264494567L;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("username") private Optional<String> username;
    @SerializedName("status") private Optional<String> status;
    @SerializedName("initiatorSecret") private Optional<CHAPSecret> initiatorSecret;
    @SerializedName("targetSecret") private Optional<CHAPSecret> targetSecret;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    @SerializedName("enableChap") private Optional<Boolean> enableChap;
    // empty constructor
    @Since("7.0")
    public ModifyAccountRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyAccountRequest(
        Long accountID,
        Optional<String> username,
        Optional<String> status,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<Attributes> attributes
    )
    {
        this.accountID = accountID;
        this.username = (username == null) ? Optional.<String>empty() : username;
        this.status = (status == null) ? Optional.<String>empty() : status;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("12.0")
    public ModifyAccountRequest(
        Long accountID,
        Optional<String> username,
        Optional<String> status,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<Attributes> attributes,
        Optional<Boolean> enableChap
    )
    {
        this.accountID = accountID;
        this.username = (username == null) ? Optional.<String>empty() : username;
        this.status = (status == null) ? Optional.<String>empty() : status;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.enableChap = (enableChap == null) ? Optional.<Boolean>empty() : enableChap;
    }

    /** 
     * Specifies the AccountID for the account to be modified.
     **/
    public Long getAccountID() { return this.accountID; }
   
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     * Specifies the username associated with the
     * account. (Might be 1 to 64 characters in length).
     **/
    public Optional<String> getUsername() { return this.username; }
   
    public void setUsername(Optional<String> username) { 
        this.username = (username == null) ? Optional.<String>empty() : username;
    }
    /** 
     * Sets the status for the account. Possible values are:
     * active: The account is active and connections are allowed.
     * locked: The account is locked and connections are refused.
     **/
    public Optional<String> getStatus() { return this.status; }
   
    public void setStatus(Optional<String> status) { 
        this.status = (status == null) ? Optional.<String>empty() : status;
    }
    /** 
     * The CHAP secret to use for the initiator.
     **/
    public Optional<CHAPSecret> getInitiatorSecret() { return this.initiatorSecret; }
   
    public void setInitiatorSecret(Optional<CHAPSecret> initiatorSecret) { 
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
    }
    /** 
     * The CHAP secret to use for the target (mutual CHAP authentication).
     **/
    public Optional<CHAPSecret> getTargetSecret() { return this.targetSecret; }
   
    public void setTargetSecret(Optional<CHAPSecret> targetSecret) { 
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
    }
    /** 
     * List of name-value pairs in JSON object format.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    /** 
     * Specify if chap account credentials can be used by an initiator to access volumes.
     **/
    public Optional<Boolean> getEnableChap() { return this.enableChap; }
   
    public void setEnableChap(Optional<Boolean> enableChap) { 
        this.enableChap = (enableChap == null) ? Optional.<Boolean>empty() : enableChap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyAccountRequest that = (ModifyAccountRequest) o;

        return 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(username, that.username) && 
            Objects.equals(status, that.status) && 
            Objects.equals(initiatorSecret, that.initiatorSecret) && 
            Objects.equals(targetSecret, that.targetSecret) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(enableChap, that.enableChap);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID,username,status,initiatorSecret,targetSecret,attributes,enableChap );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountID", accountID);
        map.put("username", username);
        map.put("status", status);
        map.put("initiatorSecret", initiatorSecret);
        map.put("targetSecret", targetSecret);
        map.put("attributes", attributes);
        map.put("enableChap", enableChap);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" accountID : ").append(gson.toJson(accountID)).append(",");
        if(null != username && username.isPresent()){
            sb.append(" username : ").append(gson.toJson(username)).append(",");
        }
        else{
            sb.append(" username : ").append("null").append(",");
        }
        if(null != status && status.isPresent()){
            sb.append(" status : ").append(gson.toJson(status)).append(",");
        }
        else{
            sb.append(" status : ").append("null").append(",");
        }
        if(null != initiatorSecret && initiatorSecret.isPresent()){
            sb.append(" initiatorSecret : ").append(gson.toJson(initiatorSecret)).append(",");
        }
        else{
            sb.append(" initiatorSecret : ").append("null").append(",");
        }
        if(null != targetSecret && targetSecret.isPresent()){
            sb.append(" targetSecret : ").append(gson.toJson(targetSecret)).append(",");
        }
        else{
            sb.append(" targetSecret : ").append("null").append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        }
        else{
            sb.append(" attributes : ").append("null").append(",");
        }
        if(null != enableChap && enableChap.isPresent()){
            sb.append(" enableChap : ").append(gson.toJson(enableChap)).append(",");
        }
        else{
            sb.append(" enableChap : ").append("null").append(",");
        }
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
        private Optional<Attributes> attributes;
        private Optional<Boolean> enableChap;

        private Builder() { }

        public ModifyAccountRequest build() {
            return new ModifyAccountRequest (
                         this.accountID,
                         this.username,
                         this.status,
                         this.initiatorSecret,
                         this.targetSecret,
                         this.attributes,
                         this.enableChap);
        }

        private ModifyAccountRequest.Builder buildFrom(final ModifyAccountRequest req) {
            this.accountID = req.accountID;
            this.username = req.username;
            this.status = req.status;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;
            this.attributes = req.attributes;
            this.enableChap = req.enableChap;

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

        public ModifyAccountRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

        public ModifyAccountRequest.Builder optionalEnableChap(final Boolean enableChap) {
            this.enableChap = (enableChap == null) ? Optional.<Boolean>empty() : Optional.of(enableChap);
            return this;
        }

    }
}
