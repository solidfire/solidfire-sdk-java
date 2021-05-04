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
 * Initiator  
 * Object containing the characteristics of an iSCSI or Fibre Channel initiator.
 **/

public class Initiator implements Serializable {

    public static final long serialVersionUID = 1620235834622318691L;
    @SerializedName("alias") private String alias;
    @SerializedName("initiatorID") private Long initiatorID;
    @SerializedName("initiatorName") private String initiatorName;
    @SerializedName("volumeAccessGroups") private Long[] volumeAccessGroups;
    @SerializedName("attributes") private Attributes attributes;
    @SerializedName("requireChap") private Boolean requireChap;
    @SerializedName("chapUsername") private Optional<String> chapUsername;
    @SerializedName("initiatorSecret") private Optional<CHAPSecret> initiatorSecret;
    @SerializedName("targetSecret") private Optional<CHAPSecret> targetSecret;
    @SerializedName("virtualNetworkIDs") private Long[] virtualNetworkIDs;
    // empty constructor
    @Since("7.0")
    public Initiator() {}

    
    // parameterized constructor
    @Since("7.0")
    public Initiator(
        String alias,
        Long initiatorID,
        String initiatorName,
        Long[] volumeAccessGroups,
        Attributes attributes
    )
    {
        this.alias = alias;
        this.initiatorID = initiatorID;
        this.initiatorName = initiatorName;
        this.volumeAccessGroups = volumeAccessGroups;
        this.attributes = attributes;
    }
    // parameterized constructor
    @Since("11.0")
    public Initiator(
        String alias,
        Long initiatorID,
        String initiatorName,
        Long[] volumeAccessGroups,
        Attributes attributes,
        Boolean requireChap,
        Optional<String> chapUsername,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret
    )
    {
        this.alias = alias;
        this.initiatorID = initiatorID;
        this.initiatorName = initiatorName;
        this.volumeAccessGroups = volumeAccessGroups;
        this.attributes = attributes;
        this.requireChap = requireChap;
        this.chapUsername = (chapUsername == null) ? Optional.<String>empty() : chapUsername;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
    }
    // parameterized constructor
    @Since("12.0")
    public Initiator(
        String alias,
        Long initiatorID,
        String initiatorName,
        Long[] volumeAccessGroups,
        Attributes attributes,
        Boolean requireChap,
        Optional<String> chapUsername,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Long[] virtualNetworkIDs
    )
    {
        this.alias = alias;
        this.initiatorID = initiatorID;
        this.initiatorName = initiatorName;
        this.volumeAccessGroups = volumeAccessGroups;
        this.attributes = attributes;
        this.requireChap = requireChap;
        this.chapUsername = (chapUsername == null) ? Optional.<String>empty() : chapUsername;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
        this.virtualNetworkIDs = virtualNetworkIDs;
    }

    /** 
     * The initiator's friendly name.
     **/
    public String getAlias() { return this.alias; }
   
    public void setAlias(String alias) { 
        this.alias = alias;
    }
    /** 
     * The initiator object's numeric ID.
     **/
    public Long getInitiatorID() { return this.initiatorID; }
   
    public void setInitiatorID(Long initiatorID) { 
        this.initiatorID = initiatorID;
    }
    /** 
     * The initiator's unique iSCSI or FC storage protocol name
     **/
    public String getInitiatorName() { return this.initiatorName; }
   
    public void setInitiatorName(String initiatorName) { 
        this.initiatorName = initiatorName;
    }
    /** 
     * A list of volumeAccessGroupIDs the initiator is a member of.
     **/
    public Long[] getVolumeAccessGroups() { return this.volumeAccessGroups; }
   
    public void setVolumeAccessGroups(Long[] volumeAccessGroups) { 
        this.volumeAccessGroups = volumeAccessGroups;
    }
    /** 
     * A set of JSON attributes assigned to this initiator.
     **/
    public Attributes getAttributes() { return this.attributes; }
   
    public void setAttributes(Attributes attributes) { 
        this.attributes = attributes;
    }
    /** 
     * True if CHAP authentication is required for this initiator.
     **/
    public Boolean getRequireChap() { return this.requireChap; }
   
    public void setRequireChap(Boolean requireChap) { 
        this.requireChap = requireChap;
    }
    /** 
     * The unique CHAP username associated with this initiator.
     **/
    public Optional<String> getChapUsername() { return this.chapUsername; }
   
    public void setChapUsername(Optional<String> chapUsername) { 
        this.chapUsername = (chapUsername == null) ? Optional.<String>empty() : chapUsername;
    }
    /** 
     * The CHAP secret used to authenticate the initiator.
     **/
    public Optional<CHAPSecret> getInitiatorSecret() { return this.initiatorSecret; }
   
    public void setInitiatorSecret(Optional<CHAPSecret> initiatorSecret) { 
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
    }
    /** 
     * The CHAP secret used to authenticate the target (mutual CHAP authentication).
     **/
    public Optional<CHAPSecret> getTargetSecret() { return this.targetSecret; }
   
    public void setTargetSecret(Optional<CHAPSecret> targetSecret) { 
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
    }
    /** 
     * A list of virtual network identifiers associated with this initiator.
     * The initiator is restricted to use the virtual networks specified.
     * The initiator can use any network if no virtual networks are specified.
     **/
    public Long[] getVirtualNetworkIDs() { return this.virtualNetworkIDs; }
   
    public void setVirtualNetworkIDs(Long[] virtualNetworkIDs) { 
        this.virtualNetworkIDs = virtualNetworkIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Initiator that = (Initiator) o;

        return 
            Objects.equals(alias, that.alias) && 
            Objects.equals(initiatorID, that.initiatorID) && 
            Objects.equals(initiatorName, that.initiatorName) && 
            Arrays.equals(volumeAccessGroups, that.volumeAccessGroups) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(requireChap, that.requireChap) && 
            Objects.equals(chapUsername, that.chapUsername) && 
            Objects.equals(initiatorSecret, that.initiatorSecret) && 
            Objects.equals(targetSecret, that.targetSecret) && 
            Arrays.equals(virtualNetworkIDs, that.virtualNetworkIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( alias,initiatorID,initiatorName,(Object[])volumeAccessGroups,attributes,requireChap,chapUsername,initiatorSecret,targetSecret,(Object[])virtualNetworkIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("alias", alias);
        map.put("initiatorID", initiatorID);
        map.put("initiatorName", initiatorName);
        map.put("volumeAccessGroups", volumeAccessGroups);
        map.put("attributes", attributes);
        map.put("requireChap", requireChap);
        map.put("chapUsername", chapUsername);
        map.put("initiatorSecret", initiatorSecret);
        map.put("targetSecret", targetSecret);
        map.put("virtualNetworkIDs", virtualNetworkIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" alias : ").append(gson.toJson(alias)).append(",");
        sb.append(" initiatorID : ").append(gson.toJson(initiatorID)).append(",");
        sb.append(" initiatorName : ").append(gson.toJson(initiatorName)).append(",");
        sb.append(" volumeAccessGroups : ").append(gson.toJson(Arrays.toString(volumeAccessGroups))).append(",");
        sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        sb.append(" requireChap : ").append(gson.toJson(requireChap)).append(",");
        if(null != chapUsername && chapUsername.isPresent()){
            sb.append(" chapUsername : ").append(gson.toJson(chapUsername)).append(",");
        }
        else{
            sb.append(" chapUsername : ").append("null").append(",");
        }
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
        sb.append(" virtualNetworkIDs : ").append(gson.toJson(Arrays.toString(virtualNetworkIDs))).append(",");
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
        private String alias;
        private Long initiatorID;
        private String initiatorName;
        private Long[] volumeAccessGroups;
        private Attributes attributes;
        private Boolean requireChap;
        private Optional<String> chapUsername;
        private Optional<CHAPSecret> initiatorSecret;
        private Optional<CHAPSecret> targetSecret;
        private Long[] virtualNetworkIDs;

        private Builder() { }

        public Initiator build() {
            return new Initiator (
                         this.alias,
                         this.initiatorID,
                         this.initiatorName,
                         this.volumeAccessGroups,
                         this.attributes,
                         this.requireChap,
                         this.chapUsername,
                         this.initiatorSecret,
                         this.targetSecret,
                         this.virtualNetworkIDs);
        }

        private Initiator.Builder buildFrom(final Initiator req) {
            this.alias = req.alias;
            this.initiatorID = req.initiatorID;
            this.initiatorName = req.initiatorName;
            this.volumeAccessGroups = req.volumeAccessGroups;
            this.attributes = req.attributes;
            this.requireChap = req.requireChap;
            this.chapUsername = req.chapUsername;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;
            this.virtualNetworkIDs = req.virtualNetworkIDs;

            return this;
        }

        public Initiator.Builder alias(final String alias) {
            this.alias = alias;
            return this;
        }

        public Initiator.Builder initiatorID(final Long initiatorID) {
            this.initiatorID = initiatorID;
            return this;
        }

        public Initiator.Builder initiatorName(final String initiatorName) {
            this.initiatorName = initiatorName;
            return this;
        }

        public Initiator.Builder volumeAccessGroups(final Long[] volumeAccessGroups) {
            this.volumeAccessGroups = volumeAccessGroups;
            return this;
        }

        public Initiator.Builder attributes(final Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Initiator.Builder requireChap(final Boolean requireChap) {
            this.requireChap = requireChap;
            return this;
        }

        public Initiator.Builder optionalChapUsername(final String chapUsername) {
            this.chapUsername = (chapUsername == null) ? Optional.<String>empty() : Optional.of(chapUsername);
            return this;
        }

        public Initiator.Builder optionalInitiatorSecret(final CHAPSecret initiatorSecret) {
            this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(initiatorSecret);
            return this;
        }

        public Initiator.Builder optionalTargetSecret(final CHAPSecret targetSecret) {
            this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(targetSecret);
            return this;
        }

        public Initiator.Builder virtualNetworkIDs(final Long[] virtualNetworkIDs) {
            this.virtualNetworkIDs = virtualNetworkIDs;
            return this;
        }

    }
}
