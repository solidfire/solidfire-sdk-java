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
 * The Request object for the "CloneVolume" API Service call.
 **/
public class CloneVolumeRequest implements Serializable {

    private static final long serialVersionUID = 1308498277L;

    @SerializedName("volumeID") private final Long volumeID;
    @SerializedName("name") private final String name;
    @SerializedName("newAccountID") private final Optional<Long> newAccountID;
    @SerializedName("newSize") private final Optional<Long> newSize;
    @SerializedName("access") private final Optional<String> access;
    @SerializedName("snapshotID") private final Optional<Long> snapshotID;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "CloneVolume" API Service call.
     * @param volumeID [required] The ID of the volume to clone.
     * @param name [required] The name for the newly-created volume.
     * @param newAccountID (optional) AccountID for the owner of the new volume.
     * @param newSize (optional) New size of the volume, in bytes.
     * @param access (optional) Access settings for the new volume.
     * @param snapshotID (optional) ID of the snapshot to use as the source of the clone.
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public CloneVolumeRequest(Long volumeID, String name, Optional<Long> newAccountID, Optional<Long> newSize, Optional<String> access, Optional<Long> snapshotID, Optional<java.util.Map<String, Object>> attributes) {
        this.name = name;
        this.newSize = (newSize == null) ? Optional.<Long>empty() : newSize;
        this.newAccountID = (newAccountID == null) ? Optional.<Long>empty() : newAccountID;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.volumeID = volumeID;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
        this.access = (access == null) ? Optional.<String>empty() : access;
    }


    /**
     * The ID of the volume to clone.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    /**
     * The name for the newly-created volume.
     **/
    public String getName() {
        return this.name;
    }

    /**
     * AccountID for the owner of the new volume.
     * If unspecified, the AccountID of the owner of the volume being cloned is used.
     **/
    public Optional<Long> getNewAccountID() {
        return this.newAccountID;
    }

    /**
     * New size of the volume, in bytes.
     * May be greater or less than the size of the volume being cloned.
     * If unspecified, the clone&#39;s volume size will be the same as the source volume.
     * Size is rounded up to the nearest 1 MiB.
     **/
    public Optional<Long> getNewSize() {
        return this.newSize;
    }

    /**
     * Access settings for the new volume.
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
     * ID of the snapshot to use as the source of the clone.
     * If unspecified, the clone will be created with a snapshot of the active volume.
     **/
    public Optional<Long> getSnapshotID() {
        return this.snapshotID;
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

        CloneVolumeRequest that = (CloneVolumeRequest) o;
        

        return Objects.equals( volumeID , that.volumeID )
            && Objects.equals( name , that.name )
            && Objects.equals( newAccountID , that.newAccountID )
            && Objects.equals( newSize , that.newSize )
            && Objects.equals( access , that.access )
            && Objects.equals( snapshotID , that.snapshotID )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, name, newAccountID, newSize, access, snapshotID, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" name : ").append(name).append(",");
        if(null != newAccountID && newAccountID.isPresent())
            sb.append(" newAccountID : ").append(newAccountID.get()).append(",");
        if(null != newSize && newSize.isPresent())
            sb.append(" newSize : ").append(newSize.get()).append(",");
        if(null != access && access.isPresent())
            sb.append(" access : ").append(access.get()).append(",");
        if(null != snapshotID && snapshotID.isPresent())
            sb.append(" snapshotID : ").append(snapshotID.get()).append(",");
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
        private String name;
        private Optional<Long> newAccountID;
        private Optional<Long> newSize;
        private Optional<String> access;
        private Optional<Long> snapshotID;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public CloneVolumeRequest build() {
            return new CloneVolumeRequest (
                         this.volumeID,
                         this.name,
                         this.newAccountID,
                         this.newSize,
                         this.access,
                         this.snapshotID,
                         this.attributes            );
        }

        private CloneVolumeRequest.Builder buildFrom(final CloneVolumeRequest req) {
            this.volumeID = req.volumeID;
            this.name = req.name;
            this.newAccountID = req.newAccountID;
            this.newSize = req.newSize;
            this.access = req.access;
            this.snapshotID = req.snapshotID;
            this.attributes = req.attributes;

            return this;
        }

        public CloneVolumeRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public CloneVolumeRequest.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public CloneVolumeRequest.Builder optionalNewAccountID(final Long newAccountID) {
            this.newAccountID = (newAccountID == null) ? Optional.<Long>empty() : Optional.of(newAccountID);
            return this;
        }

        public CloneVolumeRequest.Builder optionalNewSize(final Long newSize) {
            this.newSize = (newSize == null) ? Optional.<Long>empty() : Optional.of(newSize);
            return this;
        }

        public CloneVolumeRequest.Builder optionalAccess(final String access) {
            this.access = (access == null) ? Optional.<String>empty() : Optional.of(access);
            return this;
        }

        public CloneVolumeRequest.Builder optionalSnapshotID(final Long snapshotID) {
            this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : Optional.of(snapshotID);
            return this;
        }

        public CloneVolumeRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
