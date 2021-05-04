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
 * EncryptionKeyInfo  
 * Information of a key managed by the Key Service.
 **/

public class EncryptionKeyInfo implements Serializable {

    public static final long serialVersionUID = 1149428233751075440L;
    @SerializedName("keyCreatedTime") private Optional<String> keyCreatedTime;
    @SerializedName("keyID") private Optional<java.util.UUID> keyID;
    @SerializedName("keyManagementType") private String keyManagementType;
    @SerializedName("keyProviderID") private Optional<Long> keyProviderID;
    // empty constructor
    @Since("7.0")
    public EncryptionKeyInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public EncryptionKeyInfo(
        Optional<String> keyCreatedTime,
        Optional<java.util.UUID> keyID,
        String keyManagementType,
        Optional<Long> keyProviderID
    )
    {
        this.keyCreatedTime = (keyCreatedTime == null) ? Optional.<String>empty() : keyCreatedTime;
        this.keyID = (keyID == null) ? Optional.<java.util.UUID>empty() : keyID;
        this.keyManagementType = keyManagementType;
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
    }

    /** 
     * The creation timestamp of the master key. Note that this timestamp is produced by the cluster and may not exactly match the timestamp on the external key server (if any). Feature-specific and not always shown.
     **/
    public Optional<String> getKeyCreatedTime() { return this.keyCreatedTime; }
   
    public void setKeyCreatedTime(Optional<String> keyCreatedTime) { 
        this.keyCreatedTime = (keyCreatedTime == null) ? Optional.<String>empty() : keyCreatedTime;
    }
    /** 
     * The ID of the key, if any. Note that for keys managed by KMIP servers, this is not the key's KMIP ID, but is an attribute added to the key in the form of "x-SolidFire-KeyID-<keyID>".
     **/
    public Optional<java.util.UUID> getKeyID() { return this.keyID; }
   
    public void setKeyID(Optional<java.util.UUID> keyID) { 
        this.keyID = (keyID == null) ? Optional.<java.util.UUID>empty() : keyID;
    }
    /** 
     * The type of key management being used to manage this key. Possible values are "internal" and "external".
     **/
    public String getKeyManagementType() { return this.keyManagementType; }
   
    public void setKeyManagementType(String keyManagementType) { 
        this.keyManagementType = keyManagementType;
    }
    /** 
     * The ID of the provider that owns the key. Only shown when this key is being managed by External Key Management.
     **/
    public Optional<Long> getKeyProviderID() { return this.keyProviderID; }
   
    public void setKeyProviderID(Optional<Long> keyProviderID) { 
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EncryptionKeyInfo that = (EncryptionKeyInfo) o;

        return 
            Objects.equals(keyCreatedTime, that.keyCreatedTime) && 
            Objects.equals(keyID, that.keyID) && 
            Objects.equals(keyManagementType, that.keyManagementType) && 
            Objects.equals(keyProviderID, that.keyProviderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( keyCreatedTime,keyID,keyManagementType,keyProviderID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("keyCreatedTime", keyCreatedTime);
        map.put("keyID", keyID);
        map.put("keyManagementType", keyManagementType);
        map.put("keyProviderID", keyProviderID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != keyCreatedTime && keyCreatedTime.isPresent()){
            sb.append(" keyCreatedTime : ").append(gson.toJson(keyCreatedTime)).append(",");
        }
        else{
            sb.append(" keyCreatedTime : ").append("null").append(",");
        }
        if(null != keyID && keyID.isPresent()){
            sb.append(" keyID : ").append(gson.toJson(keyID)).append(",");
        }
        else{
            sb.append(" keyID : ").append("null").append(",");
        }
        sb.append(" keyManagementType : ").append(gson.toJson(keyManagementType)).append(",");
        if(null != keyProviderID && keyProviderID.isPresent()){
            sb.append(" keyProviderID : ").append(gson.toJson(keyProviderID)).append(",");
        }
        else{
            sb.append(" keyProviderID : ").append("null").append(",");
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
        private Optional<String> keyCreatedTime;
        private Optional<java.util.UUID> keyID;
        private String keyManagementType;
        private Optional<Long> keyProviderID;

        private Builder() { }

        public EncryptionKeyInfo build() {
            return new EncryptionKeyInfo (
                         this.keyCreatedTime,
                         this.keyID,
                         this.keyManagementType,
                         this.keyProviderID);
        }

        private EncryptionKeyInfo.Builder buildFrom(final EncryptionKeyInfo req) {
            this.keyCreatedTime = req.keyCreatedTime;
            this.keyID = req.keyID;
            this.keyManagementType = req.keyManagementType;
            this.keyProviderID = req.keyProviderID;

            return this;
        }

        public EncryptionKeyInfo.Builder optionalKeyCreatedTime(final String keyCreatedTime) {
            this.keyCreatedTime = (keyCreatedTime == null) ? Optional.<String>empty() : Optional.of(keyCreatedTime);
            return this;
        }

        public EncryptionKeyInfo.Builder optionalKeyID(final java.util.UUID keyID) {
            this.keyID = (keyID == null) ? Optional.<java.util.UUID>empty() : Optional.of(keyID);
            return this;
        }

        public EncryptionKeyInfo.Builder keyManagementType(final String keyManagementType) {
            this.keyManagementType = keyManagementType;
            return this;
        }

        public EncryptionKeyInfo.Builder optionalKeyProviderID(final Long keyProviderID) {
            this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : Optional.of(keyProviderID);
            return this;
        }

    }
}
