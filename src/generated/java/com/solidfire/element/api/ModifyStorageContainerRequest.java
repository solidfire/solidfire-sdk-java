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
 * The Request object for the "ModifyStorageContainer" API Service call.
 **/
public class ModifyStorageContainerRequest  implements Serializable  {

    private static final long serialVersionUID = 1863590016L;

    @SerializedName("storageContainerID") private java.util.UUID storageContainerID;
    @SerializedName("initiatorSecret") private Optional<CHAPSecret> initiatorSecret;
    @SerializedName("targetSecret") private Optional<CHAPSecret> targetSecret;
    @SerializedName("callingHostID") private Optional<java.util.UUID> callingHostID;

    /**
     * The Request object for the "ModifyStorageContainer" API Service call.
     * @param storageContainerID [required] 
     * @param initiatorSecret (optional) 
     * @param targetSecret (optional) 
     * @param callingHostID (optional) 
     * @since 9.0
     **/
    @Since("9.0")
    public ModifyStorageContainerRequest(java.util.UUID storageContainerID, Optional<CHAPSecret> initiatorSecret, Optional<CHAPSecret> targetSecret, Optional<java.util.UUID> callingHostID) {
        this.storageContainerID = storageContainerID;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
        this.callingHostID = (callingHostID == null) ? Optional.<java.util.UUID>empty() : callingHostID;
    }

    
    /**
     * The Request object for the "ModifyStorageContainer" API Service call.
     * Empty constructor to support serialization.
     * @since 9.0
     **/
    @Since("9.0")
    public ModifyStorageContainerRequest() {}

    public java.util.UUID getStorageContainerID() {
        return this.storageContainerID;
    }

    public void setStorageContainerID(java.util.UUID storageContainerID) {
        this.storageContainerID = storageContainerID;
    }
    public Optional<CHAPSecret> getInitiatorSecret() {
        return this.initiatorSecret;
    }

    public void setInitiatorSecret(Optional<CHAPSecret> initiatorSecret) {
        this.initiatorSecret = initiatorSecret;
    }
    public Optional<CHAPSecret> getTargetSecret() {
        return this.targetSecret;
    }

    public void setTargetSecret(Optional<CHAPSecret> targetSecret) {
        this.targetSecret = targetSecret;
    }
    public Optional<java.util.UUID> getCallingHostID() {
        return this.callingHostID;
    }

    public void setCallingHostID(Optional<java.util.UUID> callingHostID) {
        this.callingHostID = callingHostID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyStorageContainerRequest that = (ModifyStorageContainerRequest) o;
        

        return Objects.equals( storageContainerID , that.storageContainerID )
            && Objects.equals( initiatorSecret , that.initiatorSecret )
            && Objects.equals( targetSecret , that.targetSecret )
            && Objects.equals( callingHostID , that.callingHostID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( storageContainerID, initiatorSecret, targetSecret, callingHostID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" storageContainerID : ").append(storageContainerID).append(",");
        if(null != initiatorSecret && initiatorSecret.isPresent())
            sb.append(" initiatorSecret : ").append(initiatorSecret.get()).append(",");
        if(null != targetSecret && targetSecret.isPresent())
            sb.append(" targetSecret : ").append(targetSecret.get()).append(",");
        if(null != callingHostID && callingHostID.isPresent())
            sb.append(" callingHostID : ").append(callingHostID.get());
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
        private Optional<CHAPSecret> initiatorSecret;
        private Optional<CHAPSecret> targetSecret;
        private Optional<java.util.UUID> callingHostID;

        private Builder() { }

        public ModifyStorageContainerRequest build() {
            return new ModifyStorageContainerRequest (
                         this.storageContainerID,
                         this.initiatorSecret,
                         this.targetSecret,
                         this.callingHostID            );
        }

        private ModifyStorageContainerRequest.Builder buildFrom(final ModifyStorageContainerRequest req) {
            this.storageContainerID = req.storageContainerID;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;
            this.callingHostID = req.callingHostID;

            return this;
        }

        public ModifyStorageContainerRequest.Builder storageContainerID(final java.util.UUID storageContainerID) {
            this.storageContainerID = storageContainerID;
            return this;
        }

        public ModifyStorageContainerRequest.Builder optionalInitiatorSecret(final CHAPSecret initiatorSecret) {
            this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(initiatorSecret);
            return this;
        }

        public ModifyStorageContainerRequest.Builder optionalTargetSecret(final CHAPSecret targetSecret) {
            this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(targetSecret);
            return this;
        }

        public ModifyStorageContainerRequest.Builder optionalCallingHostID(final java.util.UUID callingHostID) {
            this.callingHostID = (callingHostID == null) ? Optional.<java.util.UUID>empty() : Optional.of(callingHostID);
            return this;
        }

    }

}
