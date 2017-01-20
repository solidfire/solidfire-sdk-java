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
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * StorageContainer  
 **/

public class StorageContainer implements Serializable {

    public static final long serialVersionUID = 200561552087079224L;
    @SerializedName("name") private String name;
    @SerializedName("storageContainerID") private java.util.UUID storageContainerID;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("protocolEndpointType") private String protocolEndpointType;
    @SerializedName("initiatorSecret") private String initiatorSecret;
    @SerializedName("targetSecret") private String targetSecret;
    @SerializedName("status") private String status;

    // empty constructor
    @Since("7.0")
    public StorageContainer() {}

    
    // parameterized constructor
    @Since("7.0")
    public StorageContainer(
        String name,
        java.util.UUID storageContainerID,
        Long accountID,
        String protocolEndpointType,
        String initiatorSecret,
        String targetSecret,
        String status
    )
    {
        this.name = name;
        this.storageContainerID = storageContainerID;
        this.accountID = accountID;
        this.protocolEndpointType = protocolEndpointType;
        this.initiatorSecret = initiatorSecret;
        this.targetSecret = targetSecret;
        this.status = status;
    }

    /** 
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     **/
    public java.util.UUID getStorageContainerID() { return this.storageContainerID; }
    public void setStorageContainerID(java.util.UUID storageContainerID) { 
        this.storageContainerID = storageContainerID;
    }
    /** 
     **/
    public Long getAccountID() { return this.accountID; }
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     **/
    public String getProtocolEndpointType() { return this.protocolEndpointType; }
    public void setProtocolEndpointType(String protocolEndpointType) { 
        this.protocolEndpointType = protocolEndpointType;
    }
    /** 
     **/
    public String getInitiatorSecret() { return this.initiatorSecret; }
    public void setInitiatorSecret(String initiatorSecret) { 
        this.initiatorSecret = initiatorSecret;
    }
    /** 
     **/
    public String getTargetSecret() { return this.targetSecret; }
    public void setTargetSecret(String targetSecret) { 
        this.targetSecret = targetSecret;
    }
    /** 
     **/
    public String getStatus() { return this.status; }
    public void setStatus(String status) { 
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StorageContainer that = (StorageContainer) o;

        return 
            Objects.equals(name, that.name) && 
            Objects.equals(storageContainerID, that.storageContainerID) && 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(protocolEndpointType, that.protocolEndpointType) && 
            Objects.equals(initiatorSecret, that.initiatorSecret) && 
            Objects.equals(targetSecret, that.targetSecret) && 
            Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,storageContainerID,accountID,protocolEndpointType,initiatorSecret,targetSecret,status );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("storageContainerID", storageContainerID);
        map.put("accountID", accountID);
        map.put("protocolEndpointType", protocolEndpointType);
        map.put("initiatorSecret", initiatorSecret);
        map.put("targetSecret", targetSecret);
        map.put("status", status);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" name : ").append(name).append(",");
        sb.append(" storageContainerID : ").append(storageContainerID).append(",");
        sb.append(" accountID : ").append(accountID).append(",");
        sb.append(" protocolEndpointType : ").append(protocolEndpointType).append(",");
        sb.append(" initiatorSecret : ").append(initiatorSecret).append(",");
        sb.append(" targetSecret : ").append(targetSecret).append(",");
        sb.append(" status : ").append(status).append(",");
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
        private String name;
        private java.util.UUID storageContainerID;
        private Long accountID;
        private String protocolEndpointType;
        private String initiatorSecret;
        private String targetSecret;
        private String status;

        private Builder() { }

        public StorageContainer build() {
            return new StorageContainer (
                         this.name,
                         this.storageContainerID,
                         this.accountID,
                         this.protocolEndpointType,
                         this.initiatorSecret,
                         this.targetSecret,
                         this.status);
        }

        private StorageContainer.Builder buildFrom(final StorageContainer req) {
            this.name = req.name;
            this.storageContainerID = req.storageContainerID;
            this.accountID = req.accountID;
            this.protocolEndpointType = req.protocolEndpointType;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;
            this.status = req.status;

            return this;
        }

        public StorageContainer.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public StorageContainer.Builder storageContainerID(final java.util.UUID storageContainerID) {
            this.storageContainerID = storageContainerID;
            return this;
        }

        public StorageContainer.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public StorageContainer.Builder protocolEndpointType(final String protocolEndpointType) {
            this.protocolEndpointType = protocolEndpointType;
            return this;
        }

        public StorageContainer.Builder initiatorSecret(final String initiatorSecret) {
            this.initiatorSecret = initiatorSecret;
            return this;
        }

        public StorageContainer.Builder targetSecret(final String targetSecret) {
            this.targetSecret = targetSecret;
            return this;
        }

        public StorageContainer.Builder status(final String status) {
            this.status = status;
            return this;
        }

    }
}
