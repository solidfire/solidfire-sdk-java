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
 * RekeySoftwareEncryptionAtRestMasterKeyRequest  
 * Rekey the Software Encryption At Rest Master Key used to encrypt the DEKs (Data Encryption Keys).
 **/

public class RekeySoftwareEncryptionAtRestMasterKeyRequest implements Serializable {

    public static final long serialVersionUID = -5787967566636841178L;
    @SerializedName("keyManagementType") private Optional<String> keyManagementType;
    @SerializedName("keyProviderID") private Optional<Long> keyProviderID = Optional.of(0L);

    
    // parameterized constructor
    @Since("7.0")
    public RekeySoftwareEncryptionAtRestMasterKeyRequest(
    )
    {
    }
    // parameterized constructor
    @Since("12.0")
    public RekeySoftwareEncryptionAtRestMasterKeyRequest(
        Optional<String> keyManagementType,
        Optional<Long> keyProviderID
    )
    {
        this.keyManagementType = (keyManagementType == null) ? Optional.<String>empty() : keyManagementType;
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
    }

    /** 
     * The type of Key Management used to manage the Master Key. Possible values are:
     * **Internal:** Rekey using Internal Key Management.
     * **External:** Rekey using External Key Management.
     * If this parameter is not specified, the rekey operation is performed using the existing Key Management configuration.
     **/
    public Optional<String> getKeyManagementType() { return this.keyManagementType; }
   
    public void setKeyManagementType(Optional<String> keyManagementType) { 
        this.keyManagementType = (keyManagementType == null) ? Optional.<String>empty() : keyManagementType;
    }
    /** 
     * The ID of the Key Provider to use. This is a unique value returned as part of one of the CreateKeyProvider* methods. Required when keyManagementType is "External", invalid otherwise.
     **/
    public Optional<Long> getKeyProviderID() { return this.keyProviderID; }
   
    public void setKeyProviderID(Optional<Long> keyProviderID) { 
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RekeySoftwareEncryptionAtRestMasterKeyRequest that = (RekeySoftwareEncryptionAtRestMasterKeyRequest) o;

        return 
            Objects.equals(keyManagementType, that.keyManagementType) && 
            Objects.equals(keyProviderID, that.keyProviderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( keyManagementType,keyProviderID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("keyManagementType", keyManagementType);
        map.put("keyProviderID", keyProviderID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != keyManagementType && keyManagementType.isPresent()){
            sb.append(" keyManagementType : ").append(gson.toJson(keyManagementType)).append(",");
        }
        else{
            sb.append(" keyManagementType : ").append("null").append(",");
        }
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
        private Optional<String> keyManagementType;
        private Optional<Long> keyProviderID;

        private Builder() { }

        public RekeySoftwareEncryptionAtRestMasterKeyRequest build() {
            return new RekeySoftwareEncryptionAtRestMasterKeyRequest (
                         this.keyManagementType,
                         this.keyProviderID);
        }

        private RekeySoftwareEncryptionAtRestMasterKeyRequest.Builder buildFrom(final RekeySoftwareEncryptionAtRestMasterKeyRequest req) {
            this.keyManagementType = req.keyManagementType;
            this.keyProviderID = req.keyProviderID;

            return this;
        }

        public RekeySoftwareEncryptionAtRestMasterKeyRequest.Builder optionalKeyManagementType(final String keyManagementType) {
            this.keyManagementType = (keyManagementType == null) ? Optional.<String>empty() : Optional.of(keyManagementType);
            return this;
        }

        public RekeySoftwareEncryptionAtRestMasterKeyRequest.Builder optionalKeyProviderID(final Long keyProviderID) {
            this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : Optional.of(keyProviderID);
            return this;
        }

    }
}
