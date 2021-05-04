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
 * ModifyInitiator  
 * Object containing characteristics of each initiator to modify.
 **/

public class ModifyInitiator implements Serializable {

    public static final long serialVersionUID = -7729645372437453800L;
    @SerializedName("initiatorID") private Long initiatorID;
    @SerializedName("alias") private Optional<String> alias;
    @SerializedName("volumeAccessGroupID") private Optional<Long> volumeAccessGroupID;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    @SerializedName("requireChap") private Optional<Boolean> requireChap;
    @SerializedName("chapUsername") private Optional<String> chapUsername;
    @SerializedName("initiatorSecret") private Optional<CHAPSecret> initiatorSecret;
    @SerializedName("targetSecret") private Optional<CHAPSecret> targetSecret;
    @SerializedName("virtualNetworkIDs") private Optional<Long[]> virtualNetworkIDs;
    // empty constructor
    @Since("7.0")
    public ModifyInitiator() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyInitiator(
        Long initiatorID,
        Optional<String> alias,
        Optional<Long> volumeAccessGroupID,
        Optional<Attributes> attributes,
        Optional<Boolean> requireChap,
        Optional<String> chapUsername,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret
    )
    {
        this.initiatorID = initiatorID;
        this.alias = (alias == null) ? Optional.<String>empty() : alias;
        this.volumeAccessGroupID = (volumeAccessGroupID == null) ? Optional.<Long>empty() : volumeAccessGroupID;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.requireChap = (requireChap == null) ? Optional.<Boolean>empty() : requireChap;
        this.chapUsername = (chapUsername == null) ? Optional.<String>empty() : chapUsername;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
    }
    // parameterized constructor
    @Since("12.0")
    public ModifyInitiator(
        Long initiatorID,
        Optional<String> alias,
        Optional<Long> volumeAccessGroupID,
        Optional<Attributes> attributes,
        Optional<Boolean> requireChap,
        Optional<String> chapUsername,
        Optional<CHAPSecret> initiatorSecret,
        Optional<CHAPSecret> targetSecret,
        Optional<Long[]> virtualNetworkIDs
    )
    {
        this.initiatorID = initiatorID;
        this.alias = (alias == null) ? Optional.<String>empty() : alias;
        this.volumeAccessGroupID = (volumeAccessGroupID == null) ? Optional.<Long>empty() : volumeAccessGroupID;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.requireChap = (requireChap == null) ? Optional.<Boolean>empty() : requireChap;
        this.chapUsername = (chapUsername == null) ? Optional.<String>empty() : chapUsername;
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
        this.virtualNetworkIDs = (virtualNetworkIDs == null) ? Optional.<Long[]>empty() : virtualNetworkIDs;
    }

    /** 
     * The numeric ID of the initiator to modify.
     **/
    public Long getInitiatorID() { return this.initiatorID; }
   
    public void setInitiatorID(Long initiatorID) { 
        this.initiatorID = initiatorID;
    }
    /** 
     * A new friendly name to assign to the initiator.
     **/
    public Optional<String> getAlias() { return this.alias; }
   
    public void setAlias(Optional<String> alias) { 
        this.alias = (alias == null) ? Optional.<String>empty() : alias;
    }
    /** 
     * The ID of the volume access group to which the newly created initiator should be added.
     * If the initiator was previously in a different volume access group, it is removed from the old volume access group.
     * If this key is present but null, the initiator is removed from its current volume access group
     * but not placed in any new volume access group.
     **/
    public Optional<Long> getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
   
    public void setVolumeAccessGroupID(Optional<Long> volumeAccessGroupID) { 
        this.volumeAccessGroupID = (volumeAccessGroupID == null) ? Optional.<Long>empty() : volumeAccessGroupID;
    }
    /** 
     * A new set of JSON attributes assigned to this initiator.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    /** 
     * "requireChap" determines if the initiator is required to use CHAP during session login. CHAP is optional if "requireChap" is false.
     **/
    public Optional<Boolean> getRequireChap() { return this.requireChap; }
   
    public void setRequireChap(Optional<Boolean> requireChap) { 
        this.requireChap = (requireChap == null) ? Optional.<Boolean>empty() : requireChap;
    }
    /** 
     * The CHAP username for this initiator. Defaults to the initiator name (IQN) if not specified during creation and "requireChap" is true.
     **/
    public Optional<String> getChapUsername() { return this.chapUsername; }
   
    public void setChapUsername(Optional<String> chapUsername) { 
        this.chapUsername = (chapUsername == null) ? Optional.<String>empty() : chapUsername;
    }
    /** 
     * The CHAP secret used for authentication of the initiator. Defaults to a randomly generated secret if not specified during creation and "requireChap" is true.
     **/
    public Optional<CHAPSecret> getInitiatorSecret() { return this.initiatorSecret; }
   
    public void setInitiatorSecret(Optional<CHAPSecret> initiatorSecret) { 
        this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : initiatorSecret;
    }
    /** 
     * The CHAP secret used for authentication of the target. Defaults to a randomly generated secret if not specified during creation and "requireChap" is true.
     **/
    public Optional<CHAPSecret> getTargetSecret() { return this.targetSecret; }
   
    public void setTargetSecret(Optional<CHAPSecret> targetSecret) { 
        this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : targetSecret;
    }
    /** 
     * The list of virtual network identifiers associated with this initiator.
     * If one or more are defined, this initiator will only be able to login to the specified virtual networks.
     * If no virtual networks are defined this initiator can login to all networks.
     **/
    public Optional<Long[]> getVirtualNetworkIDs() { return this.virtualNetworkIDs; }
   
    public void setVirtualNetworkIDs(Optional<Long[]> virtualNetworkIDs) { 
        this.virtualNetworkIDs = (virtualNetworkIDs == null) ? Optional.<Long[]>empty() : virtualNetworkIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyInitiator that = (ModifyInitiator) o;

        return 
            Objects.equals(initiatorID, that.initiatorID) && 
            Objects.equals(alias, that.alias) && 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(requireChap, that.requireChap) && 
            Objects.equals(chapUsername, that.chapUsername) && 
            Objects.equals(initiatorSecret, that.initiatorSecret) && 
            Objects.equals(targetSecret, that.targetSecret) && 
            Objects.equals(virtualNetworkIDs, that.virtualNetworkIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( initiatorID,alias,volumeAccessGroupID,attributes,requireChap,chapUsername,initiatorSecret,targetSecret,virtualNetworkIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("initiatorID", initiatorID);
        map.put("alias", alias);
        map.put("volumeAccessGroupID", volumeAccessGroupID);
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

        sb.append(" initiatorID : ").append(gson.toJson(initiatorID)).append(",");
        if(null != alias && alias.isPresent()){
            sb.append(" alias : ").append(gson.toJson(alias)).append(",");
        }
        else{
            sb.append(" alias : ").append("null").append(",");
        }
        if(null != volumeAccessGroupID && volumeAccessGroupID.isPresent()){
            sb.append(" volumeAccessGroupID : ").append(gson.toJson(volumeAccessGroupID)).append(",");
        }
        else{
            sb.append(" volumeAccessGroupID : ").append("null").append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        }
        else{
            sb.append(" attributes : ").append("null").append(",");
        }
        if(null != requireChap && requireChap.isPresent()){
            sb.append(" requireChap : ").append(gson.toJson(requireChap)).append(",");
        }
        else{
            sb.append(" requireChap : ").append("null").append(",");
        }
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
        if(null != virtualNetworkIDs && virtualNetworkIDs.isPresent()){
            sb.append(" virtualNetworkIDs : ").append(gson.toJson(virtualNetworkIDs)).append(",");
        }
        else{
            sb.append(" virtualNetworkIDs : ").append("null").append(",");
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
        private Long initiatorID;
        private Optional<String> alias;
        private Optional<Long> volumeAccessGroupID;
        private Optional<Attributes> attributes;
        private Optional<Boolean> requireChap;
        private Optional<String> chapUsername;
        private Optional<CHAPSecret> initiatorSecret;
        private Optional<CHAPSecret> targetSecret;
        private Optional<Long[]> virtualNetworkIDs;

        private Builder() { }

        public ModifyInitiator build() {
            return new ModifyInitiator (
                         this.initiatorID,
                         this.alias,
                         this.volumeAccessGroupID,
                         this.attributes,
                         this.requireChap,
                         this.chapUsername,
                         this.initiatorSecret,
                         this.targetSecret,
                         this.virtualNetworkIDs);
        }

        private ModifyInitiator.Builder buildFrom(final ModifyInitiator req) {
            this.initiatorID = req.initiatorID;
            this.alias = req.alias;
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.attributes = req.attributes;
            this.requireChap = req.requireChap;
            this.chapUsername = req.chapUsername;
            this.initiatorSecret = req.initiatorSecret;
            this.targetSecret = req.targetSecret;
            this.virtualNetworkIDs = req.virtualNetworkIDs;

            return this;
        }

        public ModifyInitiator.Builder initiatorID(final Long initiatorID) {
            this.initiatorID = initiatorID;
            return this;
        }

        public ModifyInitiator.Builder optionalAlias(final String alias) {
            this.alias = (alias == null) ? Optional.<String>empty() : Optional.of(alias);
            return this;
        }

        public ModifyInitiator.Builder optionalVolumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = (volumeAccessGroupID == null) ? Optional.<Long>empty() : Optional.of(volumeAccessGroupID);
            return this;
        }

        public ModifyInitiator.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

        public ModifyInitiator.Builder optionalRequireChap(final Boolean requireChap) {
            this.requireChap = (requireChap == null) ? Optional.<Boolean>empty() : Optional.of(requireChap);
            return this;
        }

        public ModifyInitiator.Builder optionalChapUsername(final String chapUsername) {
            this.chapUsername = (chapUsername == null) ? Optional.<String>empty() : Optional.of(chapUsername);
            return this;
        }

        public ModifyInitiator.Builder optionalInitiatorSecret(final CHAPSecret initiatorSecret) {
            this.initiatorSecret = (initiatorSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(initiatorSecret);
            return this;
        }

        public ModifyInitiator.Builder optionalTargetSecret(final CHAPSecret targetSecret) {
            this.targetSecret = (targetSecret == null) ? Optional.<CHAPSecret>empty() : Optional.of(targetSecret);
            return this;
        }

        public ModifyInitiator.Builder optionalVirtualNetworkIDs(final Long[] virtualNetworkIDs) {
            this.virtualNetworkIDs = (virtualNetworkIDs == null) ? Optional.<Long[]>empty() : Optional.of(virtualNetworkIDs);
            return this;
        }

    }
}
