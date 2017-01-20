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
 * ModifyVolumeRequest  
 **/

public class ModifyVolumeRequest implements Serializable {

    public static final long serialVersionUID = 1830159049354327053L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("accountID") private Optional<Long> accountID;
    @SerializedName("access") private Optional<String> access;
    @SerializedName("qos") private Optional<QoS> qos;
    @SerializedName("totalSize") private Optional<Long> totalSize;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

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
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.volumeID = volumeID;
        this.accountID = (accountID == null) ? Optional.<Long>empty() : accountID;
        this.access = (access == null) ? Optional.<String>empty() : access;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * VolumeID for the volume to be modified.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * AccountID to which the volume is reassigned.
     * If none is specified, the previous account name is used.
     **/
    public Optional<Long> getAccountID() { return this.accountID; }
    public void setAccountID(Optional<Long> accountID) { 
        this.accountID = (accountID == null) ? Optional.<Long>empty() : accountID;
    }
    /** 
     * Access allowed for the volume.
     * readOnly: Only read operations are allowed.
     * readWrite: Reads and writes are allowed.
     * locked: No reads or writes are allowed.
     * replicationTarget: Identify a volume as the target volume for a paired set of volumes. If the volume is not paired, the access status is locked.
     * 
     * If unspecified, the access settings of the clone will be the same as the source.
     **/
    public Optional<String> getAccess() { return this.access; }
    public void setAccess(Optional<String> access) { 
        this.access = (access == null) ? Optional.<String>empty() : access;
    }
    /** 
     * New quality of service settings for this volume.
     **/
    public Optional<QoS> getQos() { return this.qos; }
    public void setQos(Optional<QoS> qos) { 
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
    }
    /** 
     * New size of the volume in bytes.
     * Size is rounded up to the nearest 1MiB size.
     * This parameter can only be used to *increase* the size of a volume.
     **/
    public Optional<Long> getTotalSize() { return this.totalSize; }
    public void setTotalSize(Optional<Long> totalSize) { 
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<java.util.Map<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
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
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,accountID,access,qos,totalSize,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("accountID", accountID);
        map.put("access", access);
        map.put("qos", qos);
        map.put("totalSize", totalSize);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        if(null != accountID && accountID.isPresent()){
            sb.append(" accountID : ").append(accountID).append(",");
        }
        if(null != access && access.isPresent()){
            sb.append(" access : ").append(access).append(",");
        }
        if(null != qos && qos.isPresent()){
            sb.append(" qos : ").append(qos).append(",");
        }
        if(null != totalSize && totalSize.isPresent()){
            sb.append(" totalSize : ").append(totalSize).append(",");
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
        private Long volumeID;
        private Optional<Long> accountID;
        private Optional<String> access;
        private Optional<QoS> qos;
        private Optional<Long> totalSize;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public ModifyVolumeRequest build() {
            return new ModifyVolumeRequest (
                         this.volumeID,
                         this.accountID,
                         this.access,
                         this.qos,
                         this.totalSize,
                         this.attributes);
        }

        private ModifyVolumeRequest.Builder buildFrom(final ModifyVolumeRequest req) {
            this.volumeID = req.volumeID;
            this.accountID = req.accountID;
            this.access = req.access;
            this.qos = req.qos;
            this.totalSize = req.totalSize;
            this.attributes = req.attributes;

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

        public ModifyVolumeRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
