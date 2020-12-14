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
 * Account  
 * The object containing information about an account.
 * This object only includes "configured" information about the account, not any runtime or usage information.
 **/

public class Account implements Serializable {

    public static final long serialVersionUID = -5001194202040979403L;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("username") private String username;
    @SerializedName("status") private String status;
    @SerializedName("volumes") private Long[] volumes;
    @SerializedName("initiatorSecret") private Optional<CHAPSecret> initiatorSecret;
    @SerializedName("targetSecret") private Optional<CHAPSecret> targetSecret;
    @SerializedName("storageContainerID") private Optional<java.util.UUID> storageContainerID;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    @SerializedName("enableChap") private Optional<Boolean> enableChap;
    // empty constructor
    @Since("7.0")
    public Account() {}

    
    // parameterized constructor
    @Since("7.0")
    public Account(
        Long accountID,
        String username,
        String status,
        Long[] volumes,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<java.util.UUID> storageContainerID,
        Optional<Attributes> attributes
    )
    {
        this.accountID = accountID;
        this.username = username;
        this.status = status;
        this.volumes = volumes;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
        this.storageContainerID = (storageContainerID == null) ? Optional.<java.util.UUID>empty() : storageContainerID;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("12.0")
    public Account(
        Long accountID,
        String username,
        String status,
        Long[] volumes,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<java.util.UUID> storageContainerID,
        Optional<Attributes> attributes,
        Optional<Boolean> enableChap
    )
    {
        this.accountID = accountID;
        this.username = username;
        this.status = status;
        this.volumes = volumes;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
        this.storageContainerID = (storageContainerID == null) ? Optional.<java.util.UUID>empty() : storageContainerID;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.enableChap = (enableChap == null) ? Optional.<Boolean>empty() : enableChap;
    }

    /** 
     * Unique AccountID for the account.
     **/
    public Long getAccountID() { return this.accountID; }
   
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     * User name for the account.
     **/
    public String getUsername() { return this.username; }
   
    public void setUsername(String username) { 
        this.username = username;
    }
    /** 
     * Current status of the account.
     **/
    public String getStatus() { return this.status; }
   
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     * List of VolumeIDs for Volumes owned by this account.
     **/
    public Long[] getVolumes() { return this.volumes; }
   
    public void setVolumes(Long[] volumes) { 
        this.volumes = volumes;
    }
    /** 
     * CHAP secret to use for the initiator.
     **/
    public Optional<CHAPSecret> getInitiatorSecret() { return this.initiatorSecret; }
   
    public void setInitiatorSecret(Optional<CHAPSecret> initiatorSecret) { 
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
    }
    /** 
     * CHAP secret to use for the target (mutual CHAP authentication).
     **/
    public Optional<CHAPSecret> getTargetSecret() { return this.targetSecret; }
   
    public void setTargetSecret(Optional<CHAPSecret> targetSecret) { 
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
    }
    /** 
     * The id of the storage container associated with the account
     **/
    public Optional<java.util.UUID> getStorageContainerID() { return this.storageContainerID; }
   
    public void setStorageContainerID(Optional<java.util.UUID> storageContainerID) { 
        this.storageContainerID = (storageContainerID == null) ? Optional.<java.util.UUID>empty() : storageContainerID;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
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

        Account that = (Account) o;

        return 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(username, that.username) && 
            Objects.equals(status, that.status) && 
            Arrays.equals(volumes, that.volumes) && 
            Objects.equals(initiatorSecret, that.initiatorSecret) && 
            Objects.equals(targetSecret, that.targetSecret) && 
            Objects.equals(storageContainerID, that.storageContainerID) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(enableChap, that.enableChap);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID,username,status,(Object[])volumes,initiatorSecret,targetSecret,storageContainerID,attributes,enableChap );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountID", accountID);
        map.put("username", username);
        map.put("status", status);
        map.put("volumes", volumes);
        map.put("initiatorSecret", initiatorSecret);
        map.put("targetSecret", targetSecret);
        map.put("storageContainerID", storageContainerID);
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
        sb.append(" username : ").append(gson.toJson(username)).append(",");
        sb.append(" status : ").append(gson.toJson(status)).append(",");
        sb.append(" volumes : ").append(gson.toJson(Arrays.toString(volumes))).append(",");
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
        if(null != storageContainerID && storageContainerID.isPresent()){
            sb.append(" storageContainerID : ").append(gson.toJson(storageContainerID)).append(",");
        }
        else{
            sb.append(" storageContainerID : ").append("null").append(",");
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
        private String username;
        private String status;
        private Long[] volumes;
        private Optional<CHAPSecret> initiatorSecret;
        private Optional<CHAPSecret> targetSecret;
        private Optional<java.util.UUID> storageContainerID;
        private Optional<Attributes> attributes;
        private Optional<Boolean> enableChap;

        private Builder() { }

        public Account build() {
            return new Account (
                         this.accountID,
                         this.username,
                         this.status,
                         this.volumes,
                         this.initiatorSecret,
                         this.targetSecret,
                         this.storageContainerID,
                         this.attributes,
                         this.enableChap);
        }

        private Account.Builder buildFrom(final Account req) {
            this.accountID = req.accountID;
            this.username = req.username;
            this.status = req.status;
            this.volumes = req.volumes;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;
            this.storageContainerID = req.storageContainerID;
            this.attributes = req.attributes;
            this.enableChap = req.enableChap;

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

        public Account.Builder optionalStorageContainerID(final java.util.UUID storageContainerID) {
            this.storageContainerID = (storageContainerID == null) ? Optional.<java.util.UUID>empty() : Optional.of(storageContainerID);
            return this;
        }

        public Account.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

        public Account.Builder optionalEnableChap(final Boolean enableChap) {
            this.enableChap = (enableChap == null) ? Optional.<Boolean>empty() : Optional.of(enableChap);
            return this;
        }

    }
}
