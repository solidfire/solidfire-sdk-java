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
 * 
 **/
public class CloneMultipleVolumeParams  implements Serializable  {

    private static final long serialVersionUID = 80805354L;

    @SerializedName("volumeID") private final Long volumeID;
    @SerializedName("access") private final Optional<String> access;
    @SerializedName("name") private final Optional<String> name;
    @SerializedName("newAccountID") private final Optional<Long> newAccountID;
    @SerializedName("newSize") private final Optional<Long> newSize;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * 
     * @param volumeID [required] Required parameter for "volumes" array: volumeID.
     * @param access (optional) Access settings for the new volume.
     * @param name (optional) New name for the clone.
     * @param newAccountID (optional) Account ID for the new volume.
     * @param newSize (optional) New size Total size of the volume, in bytes. Size is rounded up to the nearest 1MB size.
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public CloneMultipleVolumeParams(Long volumeID, Optional<String> access, Optional<String> name, Optional<Long> newAccountID, Optional<Long> newSize, Optional<java.util.Map<String, Object>> attributes) {
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.newSize = (newSize == null) ? Optional.<Long>empty() : newSize;
        this.newAccountID = (newAccountID == null) ? Optional.<Long>empty() : newAccountID;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.volumeID = volumeID;
        this.access = (access == null) ? Optional.<String>empty() : access;
    }


    /**
     * Required parameter for "volumes" array: volumeID.
     **/
    public Long getVolumeID() {
        return this.volumeID;
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
     * New name for the clone.
     **/
    public Optional<String> getName() {
        return this.name;
    }

    /**
     * Account ID for the new volume.
     **/
    public Optional<Long> getNewAccountID() {
        return this.newAccountID;
    }

    /**
     * New size Total size of the volume, in bytes. Size is rounded up to the nearest 1MB size.
     **/
    public Optional<Long> getNewSize() {
        return this.newSize;
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

        CloneMultipleVolumeParams that = (CloneMultipleVolumeParams) o;
        

        return Objects.equals( volumeID , that.volumeID )
            && Objects.equals( access , that.access )
            && Objects.equals( name , that.name )
            && Objects.equals( newAccountID , that.newAccountID )
            && Objects.equals( newSize , that.newSize )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, access, name, newAccountID, newSize, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        if(null != access && access.isPresent())
            sb.append(" access : ").append(access.get()).append(",");
        if(null != name && name.isPresent())
            sb.append(" name : ").append(name.get()).append(",");
        if(null != newAccountID && newAccountID.isPresent())
            sb.append(" newAccountID : ").append(newAccountID.get()).append(",");
        if(null != newSize && newSize.isPresent())
            sb.append(" newSize : ").append(newSize.get()).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
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
        private Optional<String> access;
        private Optional<String> name;
        private Optional<Long> newAccountID;
        private Optional<Long> newSize;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public CloneMultipleVolumeParams build() {
            return new CloneMultipleVolumeParams (
                         this.volumeID,
                         this.access,
                         this.name,
                         this.newAccountID,
                         this.newSize,
                         this.attributes            );
        }

        private CloneMultipleVolumeParams.Builder buildFrom(final CloneMultipleVolumeParams req) {
            this.volumeID = req.volumeID;
            this.access = req.access;
            this.name = req.name;
            this.newAccountID = req.newAccountID;
            this.newSize = req.newSize;
            this.attributes = req.attributes;

            return this;
        }

        public CloneMultipleVolumeParams.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public CloneMultipleVolumeParams.Builder optionalAccess(final String access) {
            this.access = (access == null) ? Optional.<String>empty() : Optional.of(access);
            return this;
        }

        public CloneMultipleVolumeParams.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public CloneMultipleVolumeParams.Builder optionalNewAccountID(final Long newAccountID) {
            this.newAccountID = (newAccountID == null) ? Optional.<Long>empty() : Optional.of(newAccountID);
            return this;
        }

        public CloneMultipleVolumeParams.Builder optionalNewSize(final Long newSize) {
            this.newSize = (newSize == null) ? Optional.<Long>empty() : Optional.of(newSize);
            return this;
        }

        public CloneMultipleVolumeParams.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
