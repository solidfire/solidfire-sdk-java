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
 * 
 **/

public class ModifyVolumesRequest implements Serializable {

    public static final long serialVersionUID = 9020809531737148478L;
    @SerializedName("volumeIDs") private Long[] volumeIDs;
    @SerializedName("accountID") private Optional<Long> accountID;
    @SerializedName("access") private Optional<String> access;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;
    @SerializedName("qos") private Optional<QoS> qos;
    @SerializedName("totalSize") private Optional<Long> totalSize;

    // empty constructor
    @Since("7.0")
    public ModifyVolumesRequest() {}

    // parameterized constructor
    @Since("7.0")
    public ModifyVolumesRequest(
        Long[] volumeIDs,
        Optional<Long> accountID,
        Optional<String> access,
        Optional<java.util.Map<String, Object>> attributes,
        Optional<QoS> qos,
        Optional<Long> totalSize
    )
    {
        this.volumeIDs = volumeIDs;
        this.accountID = (accountID == null) ? Optional.<Long>empty() : accountID;
        this.access = (access == null) ? Optional.<String>empty() : access;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
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
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<java.util.Map<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVolumesRequest that = (ModifyVolumesRequest) o;

        return 
            Arrays.equals(volumeIDs, that.volumeIDs) &&
            Objects.equals(accountID, that.accountID) &&
            Objects.equals(access, that.access) &&
            Objects.equals(attributes, that.attributes) &&
            Objects.equals(qos, that.qos) &&
            Objects.equals(totalSize, that.totalSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])volumeIDs, accountID, access, attributes, qos, totalSize );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeIDs", volumeIDs);
        map.put("accountID", accountID);
        map.put("access", access);
        map.put("attributes", attributes);
        map.put("qos", qos);
        map.put("totalSize", totalSize);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeIDs : ").append(Arrays.toString(volumeIDs)).append(",");
        if(null != accountID && accountID.isPresent()){
            sb.append(" accountID : ").append(accountID).append(",");
        }
        if(null != access && access.isPresent()){
            sb.append(" access : ").append(access).append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes).append(",");
        }
        if(null != qos && qos.isPresent()){
            sb.append(" qos : ").append(qos).append(",");
        }
        if(null != totalSize && totalSize.isPresent()){
            sb.append(" totalSize : ").append(totalSize).append(",");
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
        private Optional<java.util.Map<String, Object>> attributes;
        private Optional<QoS> qos;
        private Optional<Long> totalSize;

        private Builder() { }

        public ModifyVolumesRequest build() {
            return new ModifyVolumesRequest (
                         this.volumeIDs,
                         this.accountID,
                         this.access,
                         this.attributes,
                         this.qos,
                         this.totalSize);
        }

        private ModifyVolumesRequest.Builder buildFrom(final ModifyVolumesRequest req) {
            this.volumeIDs = req.volumeIDs;
            this.accountID = req.accountID;
            this.access = req.access;
            this.attributes = req.attributes;
            this.qos = req.qos;
            this.totalSize = req.totalSize;

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

        public ModifyVolumesRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
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

    }
}
