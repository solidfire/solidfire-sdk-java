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
 * 
 **/

public class AddAccountRequest implements Serializable {

    public static final long serialVersionUID = 7556277751663032568L;
    @SerializedName("username") private String username;
    @SerializedName("initiatorSecret") private Optional<CHAPSecret> initiatorSecret;
    @SerializedName("targetSecret") private Optional<CHAPSecret> targetSecret;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public AddAccountRequest() {}

    // parameterized constructor
    @Since("7.0")
    public AddAccountRequest(
        String username,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.username = username;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * Unique username for this account.
     * (May be 1 to 64 characters in length).
     **/
    public String getUsername() { return this.username; }
    public void setUsername(String username) { 
        this.username = username;
    }
    /** 
     * CHAP secret to use for the initiator.
     * Should be 12-16 characters long and impenetrable.
     * The CHAP initiator secrets must be unique and cannot be the same as the target CHAP secret.
     * <br/><br/>
     * If not specified, a random secret is created.
     **/
    public Optional<CHAPSecret> getInitiatorSecret() { return this.initiatorSecret; }
    public void setInitiatorSecret(Optional<CHAPSecret> initiatorSecret) { 
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
    }
    /** 
     * CHAP secret to use for the target (mutual CHAP authentication).
     * Should be 12-16 characters long and impenetrable.
     * The CHAP target secrets must be unique and cannot be the same as the initiator CHAP secret.
     * <br/><br/>
     * If not specified, a random secret is created.
     **/
    public Optional<CHAPSecret> getTargetSecret() { return this.targetSecret; }
    public void setTargetSecret(Optional<CHAPSecret> targetSecret) { 
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<java.util.Map<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddAccountRequest that = (AddAccountRequest) o;
        return 
            Objects.equals(username, that.username) &&
            Objects.equals(initiatorSecret.orElse(null), that.initiatorSecret.orElse(null)) &&
            Objects.equals(targetSecret.orElse(null), that.targetSecret.orElse(null)) &&
            Objects.equals(attributes.orElse(null), that.attributes.orElse(null));
    }

    @Override
    public int hashCode() {
        return Objects.hash( username, initiatorSecret, targetSecret, attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("initiatorSecret", initiatorSecret);
        map.put("targetSecret", targetSecret);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" username : ").append(username).append(",");
        if(null != initiatorSecret && initiatorSecret.isPresent()){
            sb.append(" initiatorSecret : ").append(initiatorSecret.orElse(null)).append(",");
        }
        if(null != targetSecret && targetSecret.isPresent()){
            sb.append(" targetSecret : ").append(targetSecret.orElse(null)).append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes.orElse(null)).append(",");
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
        private String username;
        private Optional<CHAPSecret> initiatorSecret;
        private Optional<CHAPSecret> targetSecret;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public AddAccountRequest build() {
            return new AddAccountRequest (
                         this.username,
                         this.initiatorSecret,
                         this.targetSecret,
                         this.attributes);
        }

        private AddAccountRequest.Builder buildFrom(final AddAccountRequest req) {
            this.username = req.username;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;
            this.attributes = req.attributes;

            return this;
        }

        public AddAccountRequest.Builder username(final String username) {
            this.username = username;
            return this;
        }

        public AddAccountRequest.Builder optionalInitiatorSecret(final CHAPSecret initiatorSecret) {
            this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(initiatorSecret);
            return this;
        }

        public AddAccountRequest.Builder optionalTargetSecret(final CHAPSecret targetSecret) {
            this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(targetSecret);
            return this;
        }

        public AddAccountRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
