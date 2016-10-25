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
 * The Request object for the "CreateStorageContainer" API Service call.
 **/
public class CreateStorageContainerRequest  implements Serializable  {

    private static final long serialVersionUID = 1180538485L;

    @SerializedName("name") private String name;
    @SerializedName("callingHostID") private Optional<java.util.UUID> callingHostID;
    @SerializedName("initiatorSecret") private Optional<CHAPSecret> initiatorSecret;
    @SerializedName("targetSecret") private Optional<CHAPSecret> targetSecret;

    /**
     * The Request object for the "CreateStorageContainer" API Service call.
     * @param name [required] Name of the storage container.
     * @param callingHostID (optional) Non-storagecontainer account that will become a storage container.
     * @param initiatorSecret (optional) The secret for CHAP authentication for the initiator
     * @param targetSecret (optional) The secret for CHAP authentication for the target
     * @since 9.0
     **/
    @Since("9.0")
    public CreateStorageContainerRequest(String name, Optional<java.util.UUID> callingHostID, Optional<CHAPSecret> initiatorSecret, Optional<CHAPSecret> targetSecret) {
        this.name = name;
        this.callingHostID = (callingHostID == null) ? Optional.<java.util.UUID>empty() : callingHostID;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
    }

    
    /**
     * The Request object for the "CreateStorageContainer" API Service call.
     * Empty constructor to support serialization.
     * @since 9.0
     **/
    @Since("9.0")
    public CreateStorageContainerRequest() {}


    /**
     * Name of the storage container.
     **/
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Non-storagecontainer account that will become a storage container.
     **/
    public Optional<java.util.UUID> getCallingHostID() {
        return this.callingHostID;
    }

    public void setCallingHostID(Optional<java.util.UUID> callingHostID) {
        this.callingHostID = callingHostID;
    }

    /**
     * The secret for CHAP authentication for the initiator
     **/
    public Optional<CHAPSecret> getInitiatorSecret() {
        return this.initiatorSecret;
    }

    public void setInitiatorSecret(Optional<CHAPSecret> initiatorSecret) {
        this.initiatorSecret = initiatorSecret;
    }

    /**
     * The secret for CHAP authentication for the target
     **/
    public Optional<CHAPSecret> getTargetSecret() {
        return this.targetSecret;
    }

    public void setTargetSecret(Optional<CHAPSecret> targetSecret) {
        this.targetSecret = targetSecret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateStorageContainerRequest that = (CreateStorageContainerRequest) o;
        

        return Objects.equals( name , that.name )
            && Objects.equals( callingHostID , that.callingHostID )
            && Objects.equals( initiatorSecret , that.initiatorSecret )
            && Objects.equals( targetSecret , that.targetSecret );
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, callingHostID, initiatorSecret, targetSecret );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" name : ").append(name).append(",");
        if(null != callingHostID && callingHostID.isPresent())
            sb.append(" callingHostID : ").append(callingHostID.get()).append(",");
        if(null != initiatorSecret && initiatorSecret.isPresent())
            sb.append(" initiatorSecret : ").append(initiatorSecret.get()).append(",");
        if(null != targetSecret && targetSecret.isPresent())
            sb.append(" targetSecret : ").append(targetSecret.get());
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
        private Optional<java.util.UUID> callingHostID;
        private Optional<CHAPSecret> initiatorSecret;
        private Optional<CHAPSecret> targetSecret;

        private Builder() { }

        public CreateStorageContainerRequest build() {
            return new CreateStorageContainerRequest (
                         this.name,
                         this.callingHostID,
                         this.initiatorSecret,
                         this.targetSecret            );
        }

        private CreateStorageContainerRequest.Builder buildFrom(final CreateStorageContainerRequest req) {
            this.name = req.name;
            this.callingHostID = req.callingHostID;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;

            return this;
        }

        public CreateStorageContainerRequest.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public CreateStorageContainerRequest.Builder optionalCallingHostID(final java.util.UUID callingHostID) {
            this.callingHostID = (callingHostID == null) ? Optional.<java.util.UUID>empty() : Optional.of(callingHostID);
            return this;
        }

        public CreateStorageContainerRequest.Builder optionalInitiatorSecret(final CHAPSecret initiatorSecret) {
            this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(initiatorSecret);
            return this;
        }

        public CreateStorageContainerRequest.Builder optionalTargetSecret(final CHAPSecret targetSecret) {
            this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(targetSecret);
            return this;
        }

    }

}
