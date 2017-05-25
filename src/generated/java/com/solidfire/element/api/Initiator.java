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
 * Object containing characteristics of each initiator
 **/

public class Initiator implements Serializable {

    public static final long serialVersionUID = -8416369643469274318L;
    @SerializedName("alias") private String alias;
    @SerializedName("initiatorID") private Long initiatorID;
    @SerializedName("initiatorName") private String initiatorName;
    @SerializedName("volumeAccessGroups") private Long[] volumeAccessGroups;
    @SerializedName("attributes") private Attributes attributes;
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

    /** 
     * The friendly name assigned to this initiator. (String)
     **/
    public String getAlias() { return this.alias; }
    public void setAlias(String alias) { 
        this.alias = alias;
    }
    /** 
     * The numeric ID of the initiator that has been created. (Integer)
     **/
    public Long getInitiatorID() { return this.initiatorID; }
    public void setInitiatorID(Long initiatorID) { 
        this.initiatorID = initiatorID;
    }
    /** 
     * The name of the initiator that has been created. (String)
     **/
    public String getInitiatorName() { return this.initiatorName; }
    public void setInitiatorName(String initiatorName) { 
        this.initiatorName = initiatorName;
    }
    /** 
     * A list of volumeAccessGroupIDs to which this initiator beintegers. (Array of Integers)
     **/
    public Long[] getVolumeAccessGroups() { return this.volumeAccessGroups; }
    public void setVolumeAccessGroups(Long[] volumeAccessGroups) { 
        this.volumeAccessGroups = volumeAccessGroups;
    }
    /** 
     * A set of JSON attributes assigned to this initiator. (JSON Object)
     **/
    public Attributes getAttributes() { return this.attributes; }
    public void setAttributes(Attributes attributes) { 
        this.attributes = attributes;
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
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( alias,initiatorID,initiatorName,(Object[])volumeAccessGroups,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("alias", alias);
        map.put("initiatorID", initiatorID);
        map.put("initiatorName", initiatorName);
        map.put("volumeAccessGroups", volumeAccessGroups);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" alias : ").append(alias).append(",");
        sb.append(" initiatorID : ").append(initiatorID).append(",");
        sb.append(" initiatorName : ").append(initiatorName).append(",");
        sb.append(" volumeAccessGroups : ").append(Arrays.toString(volumeAccessGroups)).append(",");
        sb.append(" attributes : ").append(attributes).append(",");
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

        private Builder() { }

        public Initiator build() {
            return new Initiator (
                         this.alias,
                         this.initiatorID,
                         this.initiatorName,
                         this.volumeAccessGroups,
                         this.attributes);
        }

        private Initiator.Builder buildFrom(final Initiator req) {
            this.alias = req.alias;
            this.initiatorID = req.initiatorID;
            this.initiatorName = req.initiatorName;
            this.volumeAccessGroups = req.volumeAccessGroups;
            this.attributes = req.attributes;

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

    }
}
