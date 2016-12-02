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
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ['Object containing characteristics of each new initiator.']
 **/

public class CreateInitiator implements Serializable {

    public static final long serialVersionUID = 5723732916272205312L;
    @SerializedName("name") private String name;
    @SerializedName("alias") private Optional<String> alias;
    @SerializedName("volumeAccessGroupID") private Optional<Long> volumeAccessGroupID;
    @SerializedName("attributes") private Optional<LinkedTreeMap<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public CreateInitiator() {}

    // parameterized constructor
    @Since("7.0")
    public CreateInitiator(
        String name,
        Optional<String> alias,
        Optional<Long> volumeAccessGroupID,
        Optional<LinkedTreeMap<String, Object>> attributes
    )
    {
        this.name = name;
        this.alias = (alias == null) ? Optional.<String>empty() : alias;
        this.volumeAccessGroupID = (volumeAccessGroupID == null) ? Optional.<Long>empty() : volumeAccessGroupID;
        this.attributes = (attributes == null) ? Optional.<LinkedTreeMap<String, Object>>empty() : attributes;
    }

    /** 
     * (Required) The name of the initiator (IQN or WWPN) to create. (String)
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * (Optional) The friendly name to assign to this initiator. (String)
     **/
    public Optional<String> getAlias() { return this.alias; }
    public void setAlias(Optional<String> alias) { 
        this.alias = (alias == null) ? Optional.<String>empty() : alias;
    }
    /** 
     * (Optional) The ID of the volume access group into to which this newly created initiator will be added. (Integer)
     **/
    public Optional<Long> getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
    public void setVolumeAccessGroupID(Optional<Long> volumeAccessGroupID) { 
        this.volumeAccessGroupID = (volumeAccessGroupID == null) ? Optional.<Long>empty() : volumeAccessGroupID;
    }
    /** 
     * (Optional) A set of JSON attributes assigned to this initiator. (JSON Object)
     **/
    public Optional<LinkedTreeMap<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<LinkedTreeMap<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<LinkedTreeMap<String, Object>>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateInitiator that = (CreateInitiator) o;

        return 
            Objects.equals(name, that.name) &&
            Objects.equals(alias, that.alias) &&
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) &&
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, alias, volumeAccessGroupID, attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("alias", alias);
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" name : ").append(name).append(",");
        if(null != alias && alias.isPresent()){
            sb.append(" alias : ").append(alias).append(",");
        }
        if(null != volumeAccessGroupID && volumeAccessGroupID.isPresent()){
            sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes).append(",");
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
        private Optional<String> alias;
        private Optional<Long> volumeAccessGroupID;
        private Optional<LinkedTreeMap<String, Object>> attributes;

        private Builder() { }

        public CreateInitiator build() {
            return new CreateInitiator (
                         this.name,
                         this.alias,
                         this.volumeAccessGroupID,
                         this.attributes);
        }

        private CreateInitiator.Builder buildFrom(final CreateInitiator req) {
            this.name = req.name;
            this.alias = req.alias;
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.attributes = req.attributes;

            return this;
        }

        public CreateInitiator.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public CreateInitiator.Builder optionalAlias(final String alias) {
            this.alias = (alias == null) ? Optional.<String>empty() : Optional.of(alias);
            return this;
        }

        public CreateInitiator.Builder optionalVolumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = (volumeAccessGroupID == null) ? Optional.<Long>empty() : Optional.of(volumeAccessGroupID);
            return this;
        }

        public CreateInitiator.Builder optionalAttributes(final LinkedTreeMap<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<LinkedTreeMap<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
