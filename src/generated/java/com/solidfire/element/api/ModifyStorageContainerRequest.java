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
 * ModifyStorageContainerRequest  
 * ModifyStorageContainer enables you to make changes to an existing virtual volume storage container.
 **/

public class ModifyStorageContainerRequest implements Serializable {

    public static final long serialVersionUID = -7163262539814449593L;
    @SerializedName("storageContainerID") private java.util.UUID storageContainerID;
    @SerializedName("initiatorSecret") private Optional<String> initiatorSecret;
    @SerializedName("targetSecret") private Optional<String> targetSecret;
    // empty constructor
    @Since("7.0")
    public ModifyStorageContainerRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyStorageContainerRequest(
        java.util.UUID storageContainerID,
        Optional<String> initiatorSecret,
        Optional<String> targetSecret
    )
    {
        this.storageContainerID = storageContainerID;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<String>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<String>empty() : targetSecret;
    }

    /** 
     * The unique ID of the virtual volume storage container to modify.
     **/
    public java.util.UUID getStorageContainerID() { return this.storageContainerID; }
   
    public void setStorageContainerID(java.util.UUID storageContainerID) { 
        this.storageContainerID = storageContainerID;
    }
    /** 
     * The new secret for CHAP authentication for the initiator.
     **/
    public Optional<String> getInitiatorSecret() { return this.initiatorSecret; }
   
    public void setInitiatorSecret(Optional<String> initiatorSecret) { 
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<String>empty() : initiatorSecret;
    }
    /** 
     * The new secret for CHAP authentication for the target.
     **/
    public Optional<String> getTargetSecret() { return this.targetSecret; }
   
    public void setTargetSecret(Optional<String> targetSecret) { 
        this.targetSecret = (targetSecret == null) ? Optional.<String>empty() : targetSecret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyStorageContainerRequest that = (ModifyStorageContainerRequest) o;

        return 
            Objects.equals(storageContainerID, that.storageContainerID) && 
            Objects.equals(initiatorSecret, that.initiatorSecret) && 
            Objects.equals(targetSecret, that.targetSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash( storageContainerID,initiatorSecret,targetSecret );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("storageContainerID", storageContainerID);
        map.put("initiatorSecret", initiatorSecret);
        map.put("targetSecret", targetSecret);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" storageContainerID : ").append(gson.toJson(storageContainerID)).append(",");
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
        private java.util.UUID storageContainerID;
        private Optional<String> initiatorSecret;
        private Optional<String> targetSecret;

        private Builder() { }

        public ModifyStorageContainerRequest build() {
            return new ModifyStorageContainerRequest (
                         this.storageContainerID,
                         this.initiatorSecret,
                         this.targetSecret);
        }

        private ModifyStorageContainerRequest.Builder buildFrom(final ModifyStorageContainerRequest req) {
            this.storageContainerID = req.storageContainerID;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;

            return this;
        }

        public ModifyStorageContainerRequest.Builder storageContainerID(final java.util.UUID storageContainerID) {
            this.storageContainerID = storageContainerID;
            return this;
        }

        public ModifyStorageContainerRequest.Builder optionalInitiatorSecret(final String initiatorSecret) {
            this.initiatorSecret = (initiatorSecret == null) ? Optional.<String>empty() : Optional.of(initiatorSecret);
            return this;
        }

        public ModifyStorageContainerRequest.Builder optionalTargetSecret(final String targetSecret) {
            this.targetSecret = (targetSecret == null) ? Optional.<String>empty() : Optional.of(targetSecret);
            return this;
        }

    }
}
