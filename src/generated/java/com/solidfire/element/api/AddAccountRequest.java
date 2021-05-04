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
 * AddAccountRequest  
 * You can use AddAccount to add a new account to the system. You can create new volumes under the new account. The CHAP settings you specify for the account apply to all volumes owned by the account.
 **/

public class AddAccountRequest implements Serializable {

    public static final long serialVersionUID = -6914920960546283091L;
    @SerializedName("username") private String username;
    @SerializedName("initiatorSecret") private Optional<CHAPSecret> initiatorSecret;
    @SerializedName("targetSecret") private Optional<CHAPSecret> targetSecret;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    @SerializedName("enableChap") private Optional<Boolean> enableChap;
    // empty constructor
    @Since("7.0")
    public AddAccountRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddAccountRequest(
        String username,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<Attributes> attributes
    )
    {
        this.username = username;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("12.0")
    public AddAccountRequest(
        String username,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<Attributes> attributes,
        Optional<Boolean> enableChap
    )
    {
        this.username = username;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.enableChap = (enableChap == null) ? Optional.<Boolean>empty() : enableChap;
    }

    /** 
     * Specifies the username for this account. (Might be 1 to 64 characters in length).
     **/
    public String getUsername() { return this.username; }
   
    public void setUsername(String username) { 
        this.username = username;
    }
    /** 
     * The CHAP secret to use for the initiator.
     * If unspecified, a random secret is created.
     **/
    public Optional<CHAPSecret> getInitiatorSecret() { return this.initiatorSecret; }
   
    public void setInitiatorSecret(Optional<CHAPSecret> initiatorSecret) { 
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
    }
    /** 
     * The CHAP secret to use for the target (mutual CHAP authentication).
     * If unspecified, a random secret is created.
     **/
    public Optional<CHAPSecret> getTargetSecret() { return this.targetSecret; }
   
    public void setTargetSecret(Optional<CHAPSecret> targetSecret) { 
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
    }
    /** 
     * List of name-value pairs in JSON object format.
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

        AddAccountRequest that = (AddAccountRequest) o;

        return 
            Objects.equals(username, that.username) && 
            Objects.equals(initiatorSecret, that.initiatorSecret) && 
            Objects.equals(targetSecret, that.targetSecret) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(enableChap, that.enableChap);
    }

    @Override
    public int hashCode() {
        return Objects.hash( username,initiatorSecret,targetSecret,attributes,enableChap );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("initiatorSecret", initiatorSecret);
        map.put("targetSecret", targetSecret);
        map.put("attributes", attributes);
        map.put("enableChap", enableChap);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" username : ").append(gson.toJson(username)).append(",");
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
        private String username;
        private Optional<CHAPSecret> initiatorSecret;
        private Optional<CHAPSecret> targetSecret;
        private Optional<Attributes> attributes;
        private Optional<Boolean> enableChap;

        private Builder() { }

        public AddAccountRequest build() {
            return new AddAccountRequest (
                         this.username,
                         this.initiatorSecret,
                         this.targetSecret,
                         this.attributes,
                         this.enableChap);
        }

        private AddAccountRequest.Builder buildFrom(final AddAccountRequest req) {
            this.username = req.username;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;
            this.attributes = req.attributes;
            this.enableChap = req.enableChap;

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

        public AddAccountRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

        public AddAccountRequest.Builder optionalEnableChap(final Boolean enableChap) {
            this.enableChap = (enableChap == null) ? Optional.<Boolean>empty() : Optional.of(enableChap);
            return this;
        }

    }
}
