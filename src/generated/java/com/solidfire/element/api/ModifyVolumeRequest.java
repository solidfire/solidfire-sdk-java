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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * The Request object for the "ModifyVolume" API Service call.
 **/
public class ModifyVolumeRequest implements Serializable {

    private static final long serialVersionUID = 207267245L;

    @SerializedName("volumeID") private final Long volumeID;
    @SerializedName("accountID") private final Optional<Long> accountID;
    @SerializedName("access") private final Optional<String> access;
    @SerializedName("setCreateTime") private final Optional<String> setCreateTime;
    @SerializedName("qos") private final Optional<QoS> qos;
    @SerializedName("totalSize") private final Optional<Long> totalSize;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "ModifyVolume" API Service call.
     * @param volumeID [required] VolumeID for the volume to be modified.
     * @param accountID (optional) AccountID to which the volume is reassigned.
     * @param access (optional) Access allowed for the volume.
     * @param setCreateTime (optional) Identify the time at which the volume was created.
     * @param qos (optional) New quality of service settings for this volume.
     * @param totalSize (optional) New size of the volume in bytes.
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public ModifyVolumeRequest(Long volumeID, Optional<Long> accountID, Optional<String> access, Optional<String> setCreateTime, Optional<QoS> qos, Optional<Long> totalSize, Optional<java.util.Map<String, Object>> attributes) {
        this.setCreateTime = (setCreateTime == null) ? Optional.<String>empty() : setCreateTime;
        this.totalSize = (totalSize == null) ? Optional.<Long>empty() : totalSize;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.accountID = (accountID == null) ? Optional.<Long>empty() : accountID;
        this.volumeID = volumeID;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
        this.access = (access == null) ? Optional.<String>empty() : access;
    }


    /**
     * VolumeID for the volume to be modified.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    /**
     * AccountID to which the volume is reassigned.
     * If none is specified, the previous account name is used.
     **/
    public Optional<Long> getAccountID() {
        return this.accountID;
    }

    /**
     * Access allowed for the volume.
     * <br/><b>readOnly</b>: Only read operations are allowed.
     * <br/><b>readWrite</b>: Reads and writes are allowed.
     * <br/><b>locked</b>: No reads or writes are allowed.
     * <br/><b>replicationTarget</b>: Identify a volume as the target volume for a paired set of volumes. If the volume is not paired, the access status is locked.
     * <br/><br/>
     * If unspecified, the access settings of the clone will be the same as the source.
     **/
    public Optional<String> getAccess() {
        return this.access;
    }

    /**
     * Identify the time at which the volume was created.
     **/
    public Optional<String> getSetCreateTime() {
        return this.setCreateTime;
    }

    /**
     * New quality of service settings for this volume.
     **/
    public Optional<QoS> getQos() {
        return this.qos;
    }

    /**
     * New size of the volume in bytes.
     * Size is rounded up to the nearest 1MiB size.
     * This parameter can only be used to *increase* the size of a volume.
     **/
    public Optional<Long> getTotalSize() {
        return this.totalSize;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVolumeRequest that = (ModifyVolumeRequest) o;
        

        return Objects.equals( volumeID , that.volumeID )
            && Objects.equals( accountID , that.accountID )
            && Objects.equals( access , that.access )
            && Objects.equals( setCreateTime , that.setCreateTime )
            && Objects.equals( qos , that.qos )
            && Objects.equals( totalSize , that.totalSize )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, accountID, access, setCreateTime, qos, totalSize, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        if(null != accountID && accountID.isPresent())
            sb.append(" accountID : ").append(accountID.get()).append(",");
        if(null != access && access.isPresent())
            sb.append(" access : ").append(access.get()).append(",");
        if(null != setCreateTime && setCreateTime.isPresent())
            sb.append(" setCreateTime : ").append(setCreateTime.get()).append(",");
        if(null != qos && qos.isPresent())
            sb.append(" qos : ").append(qos.get()).append(",");
        if(null != totalSize && totalSize.isPresent())
            sb.append(" totalSize : ").append(totalSize.get()).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Long volumeID;
        private Optional<Long> accountID;
        private Optional<String> access;
        private Optional<String> setCreateTime;
        private Optional<QoS> qos;
        private Optional<Long> totalSize;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public ModifyVolumeRequest build() {
            return new ModifyVolumeRequest (
                         this.volumeID,
                         this.accountID,
                         this.access,
                         this.setCreateTime,
                         this.qos,
                         this.totalSize,
                         this.attributes            );
        }

        private ModifyVolumeRequest.Builder buildFrom(final ModifyVolumeRequest req) {
            this.volumeID = req.volumeID;
            this.accountID = req.accountID;
            this.access = req.access;
            this.setCreateTime = req.setCreateTime;
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

        public ModifyVolumeRequest.Builder optionalSetCreateTime(final String setCreateTime) {
            this.setCreateTime = (setCreateTime == null) ? Optional.<String>empty() : Optional.of(setCreateTime);
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
