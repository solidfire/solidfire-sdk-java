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
 * ModifyVolumesRequest  
 * ModifyVolumes allows you to configure up to 500 existing volumes at one time. Changes take place immediately.
 * If ModifyVolumes fails to modify any of the specified volumes, none of the specified volumes are changed.
 * If you do not specify QoS values when you modify volumes, the QoS values for each volume remain unchanged.
 * You can retrieve default QoS values for a newly created volume by running the GetDefaultQoS method.
 * When you need to increase the size of volumes that are being replicated, do so in the following order
 * to prevent replication errors:
 *    Increase the size of the "Replication Target" volume.
 *    Increase the size of the source or "Read / Write" volume.
 * Both the target and source volumes must be of the same size.
 * NOTE: If you change access status to locked or replicationTarget all existing iSCSI connections are terminated.
 **/

public class ModifyVolumesRequest implements Serializable {

    public static final long serialVersionUID = 7282354359061091888L;
    @SerializedName("volumeIDs") private Long[] volumeIDs;
    @SerializedName("accountID") private Optional<Long> accountID;
    @SerializedName("access") private Optional<String> access;
    @SerializedName("qos") private Optional<QoS> qos;
    @SerializedName("totalSize") private Optional<Long> totalSize;
    @SerializedName("associateWithQoSPolicy") private Optional<Boolean> associateWithQoSPolicy;
    @SerializedName("qosPolicyID") private Optional<Long> qosPolicyID;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    @SerializedName("enableSnapMirrorReplication") private Optional<Boolean> enableSnapMirrorReplication;
    // empty constructor
    @Since("7.0")
    public ModifyVolumesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyVolumesRequest(
        Long[] volumeIDs,
        Optional<Long> accountID,
        Optional<String> access,
        Optional<QoS> qos,
        Optional<Long> totalSize,
        Optional<Attributes> attributes
    )
    {
        this.volumeIDs = volumeIDs;
        this.accountID = (accountID == null) ? Optional.<Long>empty() : accountID;
        this.access = (access == null) ? Optional.<String>empty() : access;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("10.0")
    public ModifyVolumesRequest(
        Long[] volumeIDs,
        Optional<Long> accountID,
        Optional<String> access,
        Optional<QoS> qos,
        Optional<Long> totalSize,
        Optional<Boolean> associateWithQoSPolicy,
        Optional<Long> qosPolicyID,
        Optional<Attributes> attributes,
        Optional<Boolean> enableSnapMirrorReplication
    )
    {
        this.volumeIDs = volumeIDs;
        this.accountID = (accountID == null) ? Optional.<Long>empty() : accountID;
        this.access = (access == null) ? Optional.<String>empty() : access;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
        this.associateWithQoSPolicy = (associateWithQoSPolicy == null) ? Optional.<Boolean>empty() : associateWithQoSPolicy;
        this.qosPolicyID = (qosPolicyID == null) ? Optional.<Long>empty() : qosPolicyID;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.enableSnapMirrorReplication = (enableSnapMirrorReplication == null) ? Optional.<Boolean>empty() : enableSnapMirrorReplication;
    }

    /** 
     * A list of volumeIDs for the volumes to be modified.
     **/
    public Long[] getVolumeIDs() { return this.volumeIDs; }
   
    public void setVolumeIDs(Long[] volumeIDs) { 
        this.volumeIDs = volumeIDs;
    }
    /** 
     * AccountID to which the volume is reassigned. If none is specified, the previous account name is used.
     **/
    public Optional<Long> getAccountID() { return this.accountID; }
   
    public void setAccountID(Optional<Long> accountID) { 
        this.accountID = (accountID == null) ? Optional.<Long>empty() : accountID;
    }
    /** 
     * Access allowed for the volume. Possible values:readOnly: Only read operations are allowed.readWrite: Reads and writes are allowed.locked: No reads or writes are allowed.If not specified, the access value does not change.replicationTarget: Identify a volume as the target volume for a paired set of volumes. If the volume is not paired, the access status is locked.If a value is not specified, the access value does not change. 
     **/
    public Optional<String> getAccess() { return this.access; }
   
    public void setAccess(Optional<String> access) { 
        this.access = (access == null) ? Optional.<String>empty() : access;
    }
    /** 
     * New quality of service settings for this volume.If not specified, the QoS settings are not changed.
     **/
    public Optional<QoS> getQos() { return this.qos; }
   
    public void setQos(Optional<QoS> qos) { 
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
    }
    /** 
     * New size of the volume in bytes. 1000000000 is equal to 1GB. Size is rounded up to the nearest 1MB in size. This parameter can only be used to increase the size of a volume.
     **/
    public Optional<Long> getTotalSize() { return this.totalSize; }
   
    public void setTotalSize(Optional<Long> totalSize) { 
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
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
    /** 
     * List of name/value pairs in JSON object format.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    /** 
     * Determines whether the volume can be used for replication with SnapMirror endpoints.
     * Possible values:
     * true
     * false
     **/
    public Optional<Boolean> getEnableSnapMirrorReplication() { return this.enableSnapMirrorReplication; }
   
    public void setEnableSnapMirrorReplication(Optional<Boolean> enableSnapMirrorReplication) { 
        this.enableSnapMirrorReplication = (enableSnapMirrorReplication == null) ? Optional.<Boolean>empty() : enableSnapMirrorReplication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVolumesRequest that = (ModifyVolumesRequest) o;

        return 
            Arrays.equals(volumeIDs, that.volumeIDs) && 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(access, that.access) && 
            Objects.equals(qos, that.qos) && 
            Objects.equals(totalSize, that.totalSize) && 
            Objects.equals(associateWithQoSPolicy, that.associateWithQoSPolicy) && 
            Objects.equals(qosPolicyID, that.qosPolicyID) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(enableSnapMirrorReplication, that.enableSnapMirrorReplication);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])volumeIDs,accountID,access,qos,totalSize,associateWithQoSPolicy,qosPolicyID,attributes,enableSnapMirrorReplication );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeIDs", volumeIDs);
        map.put("accountID", accountID);
        map.put("access", access);
        map.put("qos", qos);
        map.put("totalSize", totalSize);
        map.put("associateWithQoSPolicy", associateWithQoSPolicy);
        map.put("qosPolicyID", qosPolicyID);
        map.put("attributes", attributes);
        map.put("enableSnapMirrorReplication", enableSnapMirrorReplication);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeIDs : ").append(gson.toJson(Arrays.toString(volumeIDs))).append(",");
        if(null != accountID && accountID.isPresent()){
            sb.append(" accountID : ").append(gson.toJson(accountID)).append(",");
        }
        else{
            sb.append(" accountID : ").append("null").append(",");
        }
        if(null != access && access.isPresent()){
            sb.append(" access : ").append(gson.toJson(access)).append(",");
        }
        else{
            sb.append(" access : ").append("null").append(",");
        }
        if(null != qos && qos.isPresent()){
            sb.append(" qos : ").append(gson.toJson(qos)).append(",");
        }
        else{
            sb.append(" qos : ").append("null").append(",");
        }
        if(null != totalSize && totalSize.isPresent()){
            sb.append(" totalSize : ").append(gson.toJson(totalSize)).append(",");
        }
        else{
            sb.append(" totalSize : ").append("null").append(",");
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
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        }
        else{
            sb.append(" attributes : ").append("null").append(",");
        }
        if(null != enableSnapMirrorReplication && enableSnapMirrorReplication.isPresent()){
            sb.append(" enableSnapMirrorReplication : ").append(gson.toJson(enableSnapMirrorReplication)).append(",");
        }
        else{
            sb.append(" enableSnapMirrorReplication : ").append("null").append(",");
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
        private Long[] volumeIDs;
        private Optional<Long> accountID;
        private Optional<String> access;
        private Optional<QoS> qos;
        private Optional<Long> totalSize;
        private Optional<Boolean> associateWithQoSPolicy;
        private Optional<Long> qosPolicyID;
        private Optional<Attributes> attributes;
        private Optional<Boolean> enableSnapMirrorReplication;

        private Builder() { }

        public ModifyVolumesRequest build() {
            return new ModifyVolumesRequest (
                         this.volumeIDs,
                         this.accountID,
                         this.access,
                         this.qos,
                         this.totalSize,
                         this.associateWithQoSPolicy,
                         this.qosPolicyID,
                         this.attributes,
                         this.enableSnapMirrorReplication);
        }

        private ModifyVolumesRequest.Builder buildFrom(final ModifyVolumesRequest req) {
            this.volumeIDs = req.volumeIDs;
            this.accountID = req.accountID;
            this.access = req.access;
            this.qos = req.qos;
            this.totalSize = req.totalSize;
            this.associateWithQoSPolicy = req.associateWithQoSPolicy;
            this.qosPolicyID = req.qosPolicyID;
            this.attributes = req.attributes;
            this.enableSnapMirrorReplication = req.enableSnapMirrorReplication;

            return this;
        }

        public ModifyVolumesRequest.Builder volumeIDs(final Long[] volumeIDs) {
            this.volumeIDs = volumeIDs;
            return this;
        }

        public ModifyVolumesRequest.Builder optionalAccountID(final Long accountID) {
            this.accountID = (accountID == null) ? Optional.<Long>empty() : Optional.of(accountID);
            return this;
        }

        public ModifyVolumesRequest.Builder optionalAccess(final String access) {
            this.access = (access == null) ? Optional.<String>empty() : Optional.of(access);
            return this;
        }

        public ModifyVolumesRequest.Builder optionalQos(final QoS qos) {
            this.qos = (qos == null) ? Optional.<QoS>empty() : Optional.of(qos);
            return this;
        }

        public ModifyVolumesRequest.Builder optionalTotalSize(final Long totalSize) {
            this.totalSize = (totalSize == null) ? Optional.<Long>empty() : Optional.of(totalSize);
            return this;
        }

        public ModifyVolumesRequest.Builder optionalAssociateWithQoSPolicy(final Boolean associateWithQoSPolicy) {
            this.associateWithQoSPolicy = (associateWithQoSPolicy == null) ? Optional.<Boolean>empty() : Optional.of(associateWithQoSPolicy);
            return this;
        }

        public ModifyVolumesRequest.Builder optionalQosPolicyID(final Long qosPolicyID) {
            this.qosPolicyID = (qosPolicyID == null) ? Optional.<Long>empty() : Optional.of(qosPolicyID);
            return this;
        }

        public ModifyVolumesRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

        public ModifyVolumesRequest.Builder optionalEnableSnapMirrorReplication(final Boolean enableSnapMirrorReplication) {
            this.enableSnapMirrorReplication = (enableSnapMirrorReplication == null) ? Optional.<Boolean>empty() : Optional.of(enableSnapMirrorReplication);
            return this;
        }

    }
}
