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
 * ModifyQoSPolicyRequest  
 * You can use the ModifyQoSPolicy method to modify an existing QoSPolicy on the system.
 **/

public class ModifyQoSPolicyRequest implements Serializable {

    public static final long serialVersionUID = -7869108708824023129L;
    @SerializedName("qosPolicyID") private Long qosPolicyID;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("qos") private Optional<QoS> qos;

    
    // parameterized constructor
    @Since("7.0")
    public ModifyQoSPolicyRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ModifyQoSPolicyRequest(
        Long qosPolicyID,
        Optional<String> name,
        Optional<QoS> qos
    )
    {
        this.qosPolicyID = qosPolicyID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
    }

    /** 
     * The ID of the policy to be modified.
     **/
    public Long getQosPolicyID() { return this.qosPolicyID; }
   
    public void setQosPolicyID(Long qosPolicyID) { 
        this.qosPolicyID = qosPolicyID;
    }
    /** 
     * If supplied, the name of the QoS Policy (e.g. gold, platinum, silver) is changed to this value.
     **/
    public Optional<String> getName() { return this.name; }
   
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * If supplied, the QoS settings for this policy are changed to these sttings.
     * You can supply partial QoS values and only change some of the QoS settings.
     **/
    public Optional<QoS> getQos() { return this.qos; }
   
    public void setQos(Optional<QoS> qos) { 
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyQoSPolicyRequest that = (ModifyQoSPolicyRequest) o;

        return 
            Objects.equals(qosPolicyID, that.qosPolicyID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(qos, that.qos);
    }

    @Override
    public int hashCode() {
        return Objects.hash( qosPolicyID,name,qos );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("qosPolicyID", qosPolicyID);
        map.put("name", name);
        map.put("qos", qos);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" qosPolicyID : ").append(gson.toJson(qosPolicyID)).append(",");
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(gson.toJson(name)).append(",");
        }
        else{
            sb.append(" name : ").append("null").append(",");
        }
        if(null != qos && qos.isPresent()){
            sb.append(" qos : ").append(gson.toJson(qos)).append(",");
        }
        else{
            sb.append(" qos : ").append("null").append(",");
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
        private Long qosPolicyID;
        private Optional<String> name;
        private Optional<QoS> qos;

        private Builder() { }

        public ModifyQoSPolicyRequest build() {
            return new ModifyQoSPolicyRequest (
                         this.qosPolicyID,
                         this.name,
                         this.qos);
        }

        private ModifyQoSPolicyRequest.Builder buildFrom(final ModifyQoSPolicyRequest req) {
            this.qosPolicyID = req.qosPolicyID;
            this.name = req.name;
            this.qos = req.qos;

            return this;
        }

        public ModifyQoSPolicyRequest.Builder qosPolicyID(final Long qosPolicyID) {
            this.qosPolicyID = qosPolicyID;
            return this;
        }

        public ModifyQoSPolicyRequest.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public ModifyQoSPolicyRequest.Builder optionalQos(final QoS qos) {
            this.qos = (qos == null) ? Optional.<QoS>empty() : Optional.of(qos);
            return this;
        }

    }
}
