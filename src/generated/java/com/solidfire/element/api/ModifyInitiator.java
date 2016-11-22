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
 * ['Object containing characteristics of each initiator to modify']
 **/

public class ModifyInitiator implements Serializable {

    public static final long serialVersionUID = 2549938854226075210L;
    @SerializedName("initiatorID") private Long initiatorID;
    @SerializedName("alias") private Optional<String> alias;
    @SerializedName("volumeAccessGroupID") private Optional<Long> volumeAccessGroupID;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public ModifyInitiator() {}

    // parameterized constructor
    @Since("7.0")
    public ModifyInitiator(
        Long initiatorID,
        Optional<String> alias,
        Optional<Long> volumeAccessGroupID,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.initiatorID = initiatorID;
        this.alias = (alias == null) ? Optional.<String>empty() : alias;
        this.volumeAccessGroupID = (volumeAccessGroupID == null) ? Optional.<Long>empty() : volumeAccessGroupID;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * (Required) The numeric ID of the initiator to modify. (Integer)
     **/
    public Long getInitiatorID() { return this.initiatorID; }
    public void setInitiatorID(Long initiatorID) { 
        this.initiatorID = initiatorID;
    }
    /** 
     * (Optional) A new friendly name to assign to the initiator. (String)
     **/
    public Optional<String> getAlias() { return this.alias; }
    public void setAlias(Optional<String> alias) { 
        this.alias = (alias == null) ? Optional.<String>empty() : alias;
    }
    /** 
     * (Optional) The ID of the volume access group into to which the newly created initiator should be added. If the initiator was previously in a different volume access group, it is removed from the old volume access group. If this key is present but null, the initiator is removed from its current volume access group, but not placed in any new volume access group. (Integer)
     **/
    public Optional<Long> getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
    public void setVolumeAccessGroupID(Optional<Long> volumeAccessGroupID) { 
        this.volumeAccessGroupID = (volumeAccessGroupID == null) ? Optional.<Long>empty() : volumeAccessGroupID;
    }
    /** 
     * (Optional) A new set of JSON attributes assigned to this initiator. (JSON Object)
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<java.util.Map<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
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
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( initiatorID, alias, volumeAccessGroupID, attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("initiatorID", initiatorID);
        map.put("alias", alias);
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" initiatorID : ").append(initiatorID).append(",");
        if(null != alias && alias.isPresent()){
            sb.append(" alias : ").append(alias.get()).append(",");
        }
        if(null != volumeAccessGroupID && volumeAccessGroupID.isPresent()){
            sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID.get()).append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes.get()).append(",");
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
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public ModifyInitiator build() {
            return new ModifyInitiator (
                         this.initiatorID,
                         this.alias,
                         this.volumeAccessGroupID,
                         this.attributes);
        }

        private ModifyInitiator.Builder buildFrom(final ModifyInitiator req) {
            this.initiatorID = req.initiatorID;
            this.alias = req.alias;
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.attributes = req.attributes;

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

        public ModifyInitiator.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
