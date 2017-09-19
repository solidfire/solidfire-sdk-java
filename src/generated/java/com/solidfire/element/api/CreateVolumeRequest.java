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
 * CreateVolumeRequest  
 * CreateVolume enables you to create a new (empty) volume on the cluster. As soon as the volume creation is complete, the volume is
 * available for connection via iSCSI.
 **/

public class CreateVolumeRequest implements Serializable {

    public static final long serialVersionUID = -2940272812178167538L;
    @SerializedName("name") private String name;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("totalSize") private Long totalSize;
    @SerializedName("enable512e") private Boolean enable512e;
    @SerializedName("qos") private Optional<QoS> qos;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    @SerializedName("associateWithQoSPolicy") private Optional<Boolean> associateWithQoSPolicy;
    @SerializedName("qosPolicyID") private Optional<Long> qosPolicyID;
    // empty constructor
    @Since("7.0")
    public CreateVolumeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateVolumeRequest(
        String name,
        Long accountID,
        Long totalSize,
        Boolean enable512e,
        Optional<QoS> qos,
        Optional<Attributes> attributes
    )
    {
        this.name = name;
        this.accountID = accountID;
        this.totalSize = totalSize;
        this.enable512e = enable512e;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("10.0")
    public CreateVolumeRequest(
        String name,
        Long accountID,
        Long totalSize,
        Boolean enable512e,
        Optional<QoS> qos,
        Optional<Attributes> attributes,
        Optional<Boolean> associateWithQoSPolicy,
        Optional<Long> qosPolicyID
    )
    {
        this.name = name;
        this.accountID = accountID;
        this.totalSize = totalSize;
        this.enable512e = enable512e;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.associateWithQoSPolicy = (associateWithQoSPolicy == null) ? Optional.<Boolean>empty() : associateWithQoSPolicy;
        this.qosPolicyID = (qosPolicyID == null) ? Optional.<Long>empty() : qosPolicyID;
    }

    /** 
     * The name of the volume access group (might be user specified).
     * Not required to be unique, but recommended.
     * Might be 1 to 64 characters in length.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * AccountID for the owner of this volume.
     **/
    public Long getAccountID() { return this.accountID; }
   
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     * Total size of the volume, in bytes. Size is rounded up to
     * the nearest 1MB size.
     **/
    public Long getTotalSize() { return this.totalSize; }
   
    public void setTotalSize(Long totalSize) { 
        this.totalSize = totalSize;
    }
    /** 
     * Specifies whether 512e emulation is enabled or not. Possible values are:
     * true: The volume provides 512-byte sector emulation.
     * false: 512e emulation is not enabled.
     **/
    public Boolean getEnable512e() { return this.enable512e; }
   
    public void setEnable512e(Boolean enable512e) { 
        this.enable512e = enable512e;
    }
    /** 
     * Initial quality of service settings for this volume. Default
     * values are used if none are specified. Valid settings are:
     * minIOPS
     * maxIOPS
     * burstIOPS
     * You can get the default values for a volume by using the GetDefaultQoS method.
     **/
    public Optional<QoS> getQos() { return this.qos; }
   
    public void setQos(Optional<QoS> qos) { 
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
    }
    /** 
     * The list of name-value pairs in JSON object format.
     * Total attribute size must be less than 1000B, or 1KB,
     * including JSON formatting characters.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    /** 
     * Associate the volume with the specified QoS policy.
     * Possible values:
     * true: Associate the volume with the QoS policy specified in the QoSPolicyID parameter.
     * false: Do not assosciate the volume with the QoS policy specified in the QoSPolicyID parameter. When false, any existing policy association is removed regardless of whether you specify a QoS policy in the QoSPolicyID parameter.
     **/
    public Optional<Boolean> getAssociateWithQoSPolicy() { return this.associateWithQoSPolicy; }
   
    public void setAssociateWithQoSPolicy(Optional<Boolean> associateWithQoSPolicy) { 
        this.associateWithQoSPolicy = (associateWithQoSPolicy == null) ? Optional.<Boolean>empty() : associateWithQoSPolicy;
    }
    /** 
     * The ID for the policy whose QoS settings should be applied to the specified volumes.
     * This parameter is mutually exclusive with the qos parameter.
     **/
    public Optional<Long> getQosPolicyID() { return this.qosPolicyID; }
   
    public void setQosPolicyID(Optional<Long> qosPolicyID) { 
        this.qosPolicyID = (qosPolicyID == null) ? Optional.<Long>empty() : qosPolicyID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateVolumeRequest that = (CreateVolumeRequest) o;

        return 
            Objects.equals(name, that.name) && 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(totalSize, that.totalSize) && 
            Objects.equals(enable512e, that.enable512e) && 
            Objects.equals(qos, that.qos) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(associateWithQoSPolicy, that.associateWithQoSPolicy) && 
            Objects.equals(qosPolicyID, that.qosPolicyID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,accountID,totalSize,enable512e,qos,attributes,associateWithQoSPolicy,qosPolicyID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("accountID", accountID);
        map.put("totalSize", totalSize);
        map.put("enable512e", enable512e);
        map.put("qos", qos);
        map.put("attributes", attributes);
        map.put("associateWithQoSPolicy", associateWithQoSPolicy);
        map.put("qosPolicyID", qosPolicyID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" accountID : ").append(gson.toJson(accountID)).append(",");
        sb.append(" totalSize : ").append(gson.toJson(totalSize)).append(",");
        sb.append(" enable512e : ").append(gson.toJson(enable512e)).append(",");
        if(null != qos && qos.isPresent()){
            sb.append(" qos : ").append(gson.toJson(qos)).append(",");
        }
        else{
            sb.append(" qos : ").append("null").append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        }
        else{
            sb.append(" attributes : ").append("null").append(",");
        }
        if(null != associateWithQoSPolicy && associateWithQoSPolicy.isPresent()){
            sb.append(" associateWithQoSPolicy : ").append(gson.toJson(associateWithQoSPolicy)).append(",");
        }
        else{
            sb.append(" associateWithQoSPolicy : ").append("null").append(",");
        }
        if(null != qosPolicyID && qosPolicyID.isPresent()){
            sb.append(" qosPolicyID : ").append(gson.toJson(qosPolicyID)).append(",");
        }
        else{
            sb.append(" qosPolicyID : ").append("null").append(",");
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
        private Long accountID;
        private Long totalSize;
        private Boolean enable512e;
        private Optional<QoS> qos;
        private Optional<Attributes> attributes;
        private Optional<Boolean> associateWithQoSPolicy;
        private Optional<Long> qosPolicyID;

        private Builder() { }

        public CreateVolumeRequest build() {
            return new CreateVolumeRequest (
                         this.name,
                         this.accountID,
                         this.totalSize,
                         this.enable512e,
                         this.qos,
                         this.attributes,
                         this.associateWithQoSPolicy,
                         this.qosPolicyID);
        }

        private CreateVolumeRequest.Builder buildFrom(final CreateVolumeRequest req) {
            this.name = req.name;
            this.accountID = req.accountID;
            this.totalSize = req.totalSize;
            this.enable512e = req.enable512e;
            this.qos = req.qos;
            this.attributes = req.attributes;
            this.associateWithQoSPolicy = req.associateWithQoSPolicy;
            this.qosPolicyID = req.qosPolicyID;

            return this;
        }

        public CreateVolumeRequest.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public CreateVolumeRequest.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public CreateVolumeRequest.Builder totalSize(final Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public CreateVolumeRequest.Builder enable512e(final Boolean enable512e) {
            this.enable512e = enable512e;
            return this;
        }

        public CreateVolumeRequest.Builder optionalQos(final QoS qos) {
            this.qos = (qos == null) ? Optional.<QoS>empty() : Optional.of(qos);
            return this;
        }

        public CreateVolumeRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

        public CreateVolumeRequest.Builder optionalAssociateWithQoSPolicy(final Boolean associateWithQoSPolicy) {
            this.associateWithQoSPolicy = (associateWithQoSPolicy == null) ? Optional.<Boolean>empty() : Optional.of(associateWithQoSPolicy);
            return this;
        }

        public CreateVolumeRequest.Builder optionalQosPolicyID(final Long qosPolicyID) {
            this.qosPolicyID = (qosPolicyID == null) ? Optional.<Long>empty() : Optional.of(qosPolicyID);
            return this;
        }

    }
}
