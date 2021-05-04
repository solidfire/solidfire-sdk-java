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
 * ModifyVolumeRequest  
 * ModifyVolume enables you to modify settings on an existing volume. You can make modifications to one volume at a time and
 * changes take place immediately. If you do not specify QoS values when you modify a volume, they remain the same as before the modification. You can retrieve
 * default QoS values for a newly created volume by running the GetDefaultQoS method.
 * When you need to increase the size of a volume that is being replicated, do so in the following order to prevent replication errors:
 * 1. Increase the size of the "Replication Target" volume.
 * 2. Increase the size of the source or "Read / Write" volume.
 * Both the target and source volumes must be of the same size.
 * Note: If you change the "access" status to locked or target, all existing iSCSI connections are terminated.
 **/

public class ModifyVolumeRequest implements Serializable {

    public static final long serialVersionUID = -2790085437577927897L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("accountID") private Optional<Long> accountID;
    @SerializedName("access") private Optional<String> access;
    @SerializedName("qos") private Optional<QoS> qos;
    @SerializedName("totalSize") private Optional<Long> totalSize;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    @SerializedName("associateWithQoSPolicy") private Optional<Boolean> associateWithQoSPolicy;
    @SerializedName("qosPolicyID") private Optional<Long> qosPolicyID;
    @SerializedName("enableSnapMirrorReplication") private Optional<Boolean> enableSnapMirrorReplication;
    @SerializedName("fifoSize") private Optional<Long> fifoSize;
    @SerializedName("minFifoSize") private Optional<Long> minFifoSize;
    // empty constructor
    @Since("7.0")
    public ModifyVolumeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyVolumeRequest(
        Long volumeID,
        Optional<Long> accountID,
        Optional<String> access,
        Optional<QoS> qos,
        Optional<Long> totalSize,
        Optional<Attributes> attributes
    )
    {
        this.volumeID = volumeID;
        this.accountID = (accountID == null) ? Optional.<Long>empty() : accountID;
        this.access = (access == null) ? Optional.<String>empty() : access;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("10.0")
    public ModifyVolumeRequest(
        Long volumeID,
        Optional<Long> accountID,
        Optional<String> access,
        Optional<QoS> qos,
        Optional<Long> totalSize,
        Optional<Attributes> attributes,
        Optional<Boolean> associateWithQoSPolicy,
        Optional<Long> qosPolicyID,
        Optional<Boolean> enableSnapMirrorReplication
    )
    {
        this.volumeID = volumeID;
        this.accountID = (accountID == null) ? Optional.<Long>empty() : accountID;
        this.access = (access == null) ? Optional.<String>empty() : access;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.associateWithQoSPolicy = (associateWithQoSPolicy == null) ? Optional.<Boolean>empty() : associateWithQoSPolicy;
        this.qosPolicyID = (qosPolicyID == null) ? Optional.<Long>empty() : qosPolicyID;
        this.enableSnapMirrorReplication = (enableSnapMirrorReplication == null) ? Optional.<Boolean>empty() : enableSnapMirrorReplication;
    }
    // parameterized constructor
    @Since("12.0")
    public ModifyVolumeRequest(
        Long volumeID,
        Optional<Long> accountID,
        Optional<String> access,
        Optional<QoS> qos,
        Optional<Long> totalSize,
        Optional<Attributes> attributes,
        Optional<Boolean> associateWithQoSPolicy,
        Optional<Long> qosPolicyID,
        Optional<Boolean> enableSnapMirrorReplication,
        Optional<Long> fifoSize,
        Optional<Long> minFifoSize
    )
    {
        this.volumeID = volumeID;
        this.accountID = (accountID == null) ? Optional.<Long>empty() : accountID;
        this.access = (access == null) ? Optional.<String>empty() : access;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.associateWithQoSPolicy = (associateWithQoSPolicy == null) ? Optional.<Boolean>empty() : associateWithQoSPolicy;
        this.qosPolicyID = (qosPolicyID == null) ? Optional.<Long>empty() : qosPolicyID;
        this.enableSnapMirrorReplication = (enableSnapMirrorReplication == null) ? Optional.<Boolean>empty() : enableSnapMirrorReplication;
        this.fifoSize = (fifoSize == null) ? Optional.<Long>empty() : fifoSize;
        this.minFifoSize = (minFifoSize == null) ? Optional.<Long>empty() : minFifoSize;
    }

    /** 
     * VolumeID for the volume to be modified.
     **/
    public Long getVolumeID() { return this.volumeID; }
   
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * AccountID to which the volume is reassigned. If unspecified, the previous account name is used.
     **/
    public Optional<Long> getAccountID() { return this.accountID; }
   
    public void setAccountID(Optional<Long> accountID) { 
        this.accountID = (accountID == null) ? Optional.<Long>empty() : accountID;
    }
    /** 
     * Specifies the access allowed for the volume. Possible values are:
     * readOnly: Only read operations are allowed.
     * readWrite: Reads and writes are allowed.
     * locked: No reads or writes are allowed.
     * If not specified, the access value does not change.
     * replicationTarget: Identify a volume as the target volume
     * for a paired set of volumes. If the volume is not paired, the
     * access status is locked.
     * If a value is not specified, the access value does not change.
     **/
    public Optional<String> getAccess() { return this.access; }
   
    public void setAccess(Optional<String> access) { 
        this.access = (access == null) ? Optional.<String>empty() : access;
    }
    /** 
     * New QoS settings for this volume. If not specified,
     * the QoS settings are not changed.
     **/
    public Optional<QoS> getQos() { return this.qos; }
   
    public void setQos(Optional<QoS> qos) { 
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
    }
    /** 
     * New size of the volume in bytes. 1000000000 is equal to 1GB.
     * Size is rounded up to the nearest 1MB. This parameter
     * can only be used to increase the size of a volume.
     **/
    public Optional<Long> getTotalSize() { return this.totalSize; }
   
    public void setTotalSize(Optional<Long> totalSize) { 
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
    }
    /** 
     * List of name-value pairs in JSON object format.
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
     * The volume will not maintain any association with the policy; this is an alternate way to apply QoS settings to the volume.
     * This parameter and the qos parameter cannot be specified at the same time.
     **/
    public Optional<Long> getQosPolicyID() { return this.qosPolicyID; }
   
    public void setQosPolicyID(Optional<Long> qosPolicyID) { 
        this.qosPolicyID = (qosPolicyID == null) ? Optional.<Long>empty() : qosPolicyID;
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
    /** 
     * Specifies the maximum number of FIFO (First-In-First-Out) snapshots supported by the volume.
     * Note that FIFO and non-FIFO snapshots both use the same pool of available snapshot slots on a volume.
     * Use this option to limit FIFO snapshot consumption of the available snapshot slots.
     * Also note this cannot be modified such that it is less than the current FIFO snapshot count.
     **/
    public Optional<Long> getFifoSize() { return this.fifoSize; }
   
    public void setFifoSize(Optional<Long> fifoSize) { 
        this.fifoSize = (fifoSize == null) ? Optional.<Long>empty() : fifoSize;
    }
    /** 
     * Specifies the number of snapshot slots that are reserved for only FIFO (First-In-First-Out) snapshots.
     * Since FIFO and non-FIFO snapshots share the same pool, the minFifoSize reduces the total number of
     * possible non-FIFO snapshots by the same amount.
     * Note this cannot be modified such that it conflicts with the current non-FIFO snapshot count.
     **/
    public Optional<Long> getMinFifoSize() { return this.minFifoSize; }
   
    public void setMinFifoSize(Optional<Long> minFifoSize) { 
        this.minFifoSize = (minFifoSize == null) ? Optional.<Long>empty() : minFifoSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVolumeRequest that = (ModifyVolumeRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(access, that.access) && 
            Objects.equals(qos, that.qos) && 
            Objects.equals(totalSize, that.totalSize) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(associateWithQoSPolicy, that.associateWithQoSPolicy) && 
            Objects.equals(qosPolicyID, that.qosPolicyID) && 
            Objects.equals(enableSnapMirrorReplication, that.enableSnapMirrorReplication) && 
            Objects.equals(fifoSize, that.fifoSize) && 
            Objects.equals(minFifoSize, that.minFifoSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,accountID,access,qos,totalSize,attributes,associateWithQoSPolicy,qosPolicyID,enableSnapMirrorReplication,fifoSize,minFifoSize );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("accountID", accountID);
        map.put("access", access);
        map.put("qos", qos);
        map.put("totalSize", totalSize);
        map.put("attributes", attributes);
        map.put("associateWithQoSPolicy", associateWithQoSPolicy);
        map.put("qosPolicyID", qosPolicyID);
        map.put("enableSnapMirrorReplication", enableSnapMirrorReplication);
        map.put("fifoSize", fifoSize);
        map.put("minFifoSize", minFifoSize);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(gson.toJson(volumeID)).append(",");
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
        if(null != enableSnapMirrorReplication && enableSnapMirrorReplication.isPresent()){
            sb.append(" enableSnapMirrorReplication : ").append(gson.toJson(enableSnapMirrorReplication)).append(",");
        }
        else{
            sb.append(" enableSnapMirrorReplication : ").append("null").append(",");
        }
        if(null != fifoSize && fifoSize.isPresent()){
            sb.append(" fifoSize : ").append(gson.toJson(fifoSize)).append(",");
        }
        else{
            sb.append(" fifoSize : ").append("null").append(",");
        }
        if(null != minFifoSize && minFifoSize.isPresent()){
            sb.append(" minFifoSize : ").append(gson.toJson(minFifoSize)).append(",");
        }
        else{
            sb.append(" minFifoSize : ").append("null").append(",");
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
        private Long volumeID;
        private Optional<Long> accountID;
        private Optional<String> access;
        private Optional<QoS> qos;
        private Optional<Long> totalSize;
        private Optional<Attributes> attributes;
        private Optional<Boolean> associateWithQoSPolicy;
        private Optional<Long> qosPolicyID;
        private Optional<Boolean> enableSnapMirrorReplication;
        private Optional<Long> fifoSize;
        private Optional<Long> minFifoSize;

        private Builder() { }

        public ModifyVolumeRequest build() {
            return new ModifyVolumeRequest (
                         this.volumeID,
                         this.accountID,
                         this.access,
                         this.qos,
                         this.totalSize,
                         this.attributes,
                         this.associateWithQoSPolicy,
                         this.qosPolicyID,
                         this.enableSnapMirrorReplication,
                         this.fifoSize,
                         this.minFifoSize);
        }

        private ModifyVolumeRequest.Builder buildFrom(final ModifyVolumeRequest req) {
            this.volumeID = req.volumeID;
            this.accountID = req.accountID;
            this.access = req.access;
            this.qos = req.qos;
            this.totalSize = req.totalSize;
            this.attributes = req.attributes;
            this.associateWithQoSPolicy = req.associateWithQoSPolicy;
            this.qosPolicyID = req.qosPolicyID;
            this.enableSnapMirrorReplication = req.enableSnapMirrorReplication;
            this.fifoSize = req.fifoSize;
            this.minFifoSize = req.minFifoSize;

            return this;
        }

        public ModifyVolumeRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public ModifyVolumeRequest.Builder optionalAccountID(final Long accountID) {
            this.accountID = (accountID == null) ? Optional.<Long>empty() : Optional.of(accountID);
            return this;
        }

        public ModifyVolumeRequest.Builder optionalAccess(final String access) {
            this.access = (access == null) ? Optional.<String>empty() : Optional.of(access);
            return this;
        }

        public ModifyVolumeRequest.Builder optionalQos(final QoS qos) {
            this.qos = (qos == null) ? Optional.<QoS>empty() : Optional.of(qos);
            return this;
        }

        public ModifyVolumeRequest.Builder optionalTotalSize(final Long totalSize) {
            this.totalSize = (totalSize == null) ? Optional.<Long>empty() : Optional.of(totalSize);
            return this;
        }

        public ModifyVolumeRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

        public ModifyVolumeRequest.Builder optionalAssociateWithQoSPolicy(final Boolean associateWithQoSPolicy) {
            this.associateWithQoSPolicy = (associateWithQoSPolicy == null) ? Optional.<Boolean>empty() : Optional.of(associateWithQoSPolicy);
            return this;
        }

        public ModifyVolumeRequest.Builder optionalQosPolicyID(final Long qosPolicyID) {
            this.qosPolicyID = (qosPolicyID == null) ? Optional.<Long>empty() : Optional.of(qosPolicyID);
            return this;
        }

        public ModifyVolumeRequest.Builder optionalEnableSnapMirrorReplication(final Boolean enableSnapMirrorReplication) {
            this.enableSnapMirrorReplication = (enableSnapMirrorReplication == null) ? Optional.<Boolean>empty() : Optional.of(enableSnapMirrorReplication);
            return this;
        }

        public ModifyVolumeRequest.Builder optionalFifoSize(final Long fifoSize) {
            this.fifoSize = (fifoSize == null) ? Optional.<Long>empty() : Optional.of(fifoSize);
            return this;
        }

        public ModifyVolumeRequest.Builder optionalMinFifoSize(final Long minFifoSize) {
            this.minFifoSize = (minFifoSize == null) ? Optional.<Long>empty() : Optional.of(minFifoSize);
            return this;
        }

    }
}
