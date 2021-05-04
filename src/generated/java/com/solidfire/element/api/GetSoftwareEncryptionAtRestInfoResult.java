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
 * GetSoftwareEncryptionAtRestInfoResult  
 * Software Encryption-At-Rest (SEAR) Info object returns information the cluster uses to encrypt data at rest.
 **/

public class GetSoftwareEncryptionAtRestInfoResult implements Serializable {

    public static final long serialVersionUID = 7588592542000395345L;
    @SerializedName("masterKeyInfo") private Optional<EncryptionKeyInfo> masterKeyInfo;
    @SerializedName("rekeyMasterKeyAsyncResultID") private Optional<Long> rekeyMasterKeyAsyncResultID;
    @SerializedName("state") private String state;
    @SerializedName("version") private Long version;
    // empty constructor
    @Since("7.0")
    public GetSoftwareEncryptionAtRestInfoResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetSoftwareEncryptionAtRestInfoResult(
        Optional<EncryptionKeyInfo> masterKeyInfo,
        Optional<Long> rekeyMasterKeyAsyncResultID,
        String state,
        Long version
    )
    {
        this.masterKeyInfo = (masterKeyInfo == null) ? Optional.<EncryptionKeyInfo>empty() : masterKeyInfo;
        this.rekeyMasterKeyAsyncResultID = (rekeyMasterKeyAsyncResultID == null) ? Optional.<Long>empty() : rekeyMasterKeyAsyncResultID;
        this.state = state;
        this.version = version;
    }

    /** 
     * Information about the current SEAR master key.
     **/
    public Optional<EncryptionKeyInfo> getMasterKeyInfo() { return this.masterKeyInfo; }
   
    public void setMasterKeyInfo(Optional<EncryptionKeyInfo> masterKeyInfo) { 
        this.masterKeyInfo = (masterKeyInfo == null) ? Optional.<EncryptionKeyInfo>empty() : masterKeyInfo;
    }
    /** 
     * The async result ID of the current or most recent rekey operation (if any), if it hasn't been deleted yet. GetAsyncResult output will include a SearRekeyMasterKeyInfo.
     **/
    public Optional<Long> getRekeyMasterKeyAsyncResultID() { return this.rekeyMasterKeyAsyncResultID; }
   
    public void setRekeyMasterKeyAsyncResultID(Optional<Long> rekeyMasterKeyAsyncResultID) { 
        this.rekeyMasterKeyAsyncResultID = (rekeyMasterKeyAsyncResultID == null) ? Optional.<Long>empty() : rekeyMasterKeyAsyncResultID;
    }
    /** 
     * The current Software Encryption At Rest state. Possible values are "disabled" or "enabled".
     **/
    public String getState() { return this.state; }
   
    public void setState(String state) { 
        this.state = state;
    }
    /** 
     * A version number that is incremented each time SEAR is enabled.
     **/
    public Long getVersion() { return this.version; }
   
    public void setVersion(Long version) { 
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSoftwareEncryptionAtRestInfoResult that = (GetSoftwareEncryptionAtRestInfoResult) o;

        return 
            Objects.equals(masterKeyInfo, that.masterKeyInfo) && 
            Objects.equals(rekeyMasterKeyAsyncResultID, that.rekeyMasterKeyAsyncResultID) && 
            Objects.equals(state, that.state) && 
            Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash( masterKeyInfo,rekeyMasterKeyAsyncResultID,state,version );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("masterKeyInfo", masterKeyInfo);
        map.put("rekeyMasterKeyAsyncResultID", rekeyMasterKeyAsyncResultID);
        map.put("state", state);
        map.put("version", version);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != masterKeyInfo && masterKeyInfo.isPresent()){
            sb.append(" masterKeyInfo : ").append(gson.toJson(masterKeyInfo)).append(",");
        }
        else{
            sb.append(" masterKeyInfo : ").append("null").append(",");
        }
        if(null != rekeyMasterKeyAsyncResultID && rekeyMasterKeyAsyncResultID.isPresent()){
            sb.append(" rekeyMasterKeyAsyncResultID : ").append(gson.toJson(rekeyMasterKeyAsyncResultID)).append(",");
        }
        else{
            sb.append(" rekeyMasterKeyAsyncResultID : ").append("null").append(",");
        }
        sb.append(" state : ").append(gson.toJson(state)).append(",");
        sb.append(" version : ").append(gson.toJson(version)).append(",");
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
        private Optional<EncryptionKeyInfo> masterKeyInfo;
        private Optional<Long> rekeyMasterKeyAsyncResultID;
        private String state;
        private Long version;

        private Builder() { }

        public GetSoftwareEncryptionAtRestInfoResult build() {
            return new GetSoftwareEncryptionAtRestInfoResult (
                         this.masterKeyInfo,
                         this.rekeyMasterKeyAsyncResultID,
                         this.state,
                         this.version);
        }

        private GetSoftwareEncryptionAtRestInfoResult.Builder buildFrom(final GetSoftwareEncryptionAtRestInfoResult req) {
            this.masterKeyInfo = req.masterKeyInfo;
            this.rekeyMasterKeyAsyncResultID = req.rekeyMasterKeyAsyncResultID;
            this.state = req.state;
            this.version = req.version;

            return this;
        }

        public GetSoftwareEncryptionAtRestInfoResult.Builder optionalMasterKeyInfo(final EncryptionKeyInfo masterKeyInfo) {
            this.masterKeyInfo = (masterKeyInfo == null) ? Optional.<EncryptionKeyInfo>empty() : Optional.of(masterKeyInfo);
            return this;
        }

        public GetSoftwareEncryptionAtRestInfoResult.Builder optionalRekeyMasterKeyAsyncResultID(final Long rekeyMasterKeyAsyncResultID) {
            this.rekeyMasterKeyAsyncResultID = (rekeyMasterKeyAsyncResultID == null) ? Optional.<Long>empty() : Optional.of(rekeyMasterKeyAsyncResultID);
            return this;
        }

        public GetSoftwareEncryptionAtRestInfoResult.Builder state(final String state) {
            this.state = state;
            return this;
        }

        public GetSoftwareEncryptionAtRestInfoResult.Builder version(final Long version) {
            this.version = version;
            return this;
        }

    }
}
