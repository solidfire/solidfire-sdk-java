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
 * CreateStorageContainerRequest  
 **/

public class CreateStorageContainerRequest implements Serializable {

    public static final long serialVersionUID = -4364938993852415356L;
    @SerializedName("name") private String name;
    @SerializedName("initiatorSecret") private Optional<String> initiatorSecret;
    @SerializedName("targetSecret") private Optional<String> targetSecret;

    // empty constructor
    @Since("7.0")
    public CreateStorageContainerRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateStorageContainerRequest(
        String name,
        Optional<String> initiatorSecret,
        Optional<String> targetSecret
    )
    {
        this.name = name;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<String>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<String>empty() : targetSecret;
    }

    /** 
     * Name of the storage container.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * The secret for CHAP authentication for the initiator
     **/
    public Optional<String> getInitiatorSecret() { return this.initiatorSecret; }
    public void setInitiatorSecret(Optional<String> initiatorSecret) { 
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<String>empty() : initiatorSecret;
    }
    /** 
     * The secret for CHAP authentication for the target
     **/
    public Optional<String> getTargetSecret() { return this.targetSecret; }
    public void setTargetSecret(Optional<String> targetSecret) { 
        this.targetSecret = (targetSecret == null) ? Optional.<String>empty() : targetSecret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateStorageContainerRequest that = (CreateStorageContainerRequest) o;

        return 
            Objects.equals(name, that.name) && 
            Objects.equals(initiatorSecret, that.initiatorSecret) && 
            Objects.equals(targetSecret, that.targetSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,initiatorSecret,targetSecret );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("initiatorSecret", initiatorSecret);
        map.put("targetSecret", targetSecret);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" name : ").append(name).append(",");
        if(null != initiatorSecret && initiatorSecret.isPresent()){
            sb.append(" initiatorSecret : ").append(initiatorSecret).append(",");
        }
        if(null != targetSecret && targetSecret.isPresent()){
            sb.append(" targetSecret : ").append(targetSecret).append(",");
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
        private String name;
        private Optional<String> initiatorSecret;
        private Optional<String> targetSecret;

        private Builder() { }

        public CreateStorageContainerRequest build() {
            return new CreateStorageContainerRequest (
                         this.name,
                         this.initiatorSecret,
                         this.targetSecret);
        }

        private CreateStorageContainerRequest.Builder buildFrom(final CreateStorageContainerRequest req) {
            this.name = req.name;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;

            return this;
        }

        public CreateStorageContainerRequest.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public CreateStorageContainerRequest.Builder optionalInitiatorSecret(final String initiatorSecret) {
            this.initiatorSecret = (initiatorSecret == null) ? Optional.<String>empty() : Optional.of(initiatorSecret);
            return this;
        }

        public CreateStorageContainerRequest.Builder optionalTargetSecret(final String targetSecret) {
            this.targetSecret = (targetSecret == null) ? Optional.<String>empty() : Optional.of(targetSecret);
            return this;
        }

    }
}
