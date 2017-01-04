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
 * CloneVolumeRequest  
 **/

public class CloneVolumeRequest implements Serializable {

    public static final long serialVersionUID = -768791333545216038L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("name") private String name;
    @SerializedName("newAccountID") private Optional<Long> newAccountID;
    @SerializedName("newSize") private Optional<Long> newSize;
    @SerializedName("access") private Optional<String> access;
    @SerializedName("snapshotID") private Optional<Long> snapshotID;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public CloneVolumeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CloneVolumeRequest(
        Long volumeID,
        String name,
        Optional<Long> newAccountID,
        Optional<Long> newSize,
        Optional<String> access,
        Optional<Long> snapshotID,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.volumeID = volumeID;
        this.name = name;
        this.newAccountID = (newAccountID == null) ? Optional.<Long>empty() : newAccountID;
        this.newSize = (newSize == null) ? Optional.<Long>empty() : newSize;
        this.access = (access == null) ? Optional.<String>empty() : access;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * The ID of the volume to clone.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * The name for the newly-created volume.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * AccountID for the owner of the new volume.
     * If unspecified, the AccountID of the owner of the volume being cloned is used.
     **/
    public Optional<Long> getNewAccountID() { return this.newAccountID; }
    public void setNewAccountID(Optional<Long> newAccountID) { 
        this.newAccountID = (newAccountID == null) ? Optional.<Long>empty() : newAccountID;
    }
    /** 
     * New size of the volume, in bytes.
     * May be greater or less than the size of the volume being cloned.
     * If unspecified, the clone's volume size will be the same as the source volume.
     * Size is rounded up to the nearest 1 MiB.
     **/
    public Optional<Long> getNewSize() { return this.newSize; }
    public void setNewSize(Optional<Long> newSize) { 
        this.newSize = (newSize == null) ? Optional.<Long>empty() : newSize;
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
    public Optional<String> getAccess() { return this.access; }
    public void setAccess(Optional<String> access) { 
        this.access = (access == null) ? Optional.<String>empty() : access;
    }
    /** 
     * ID of the snapshot to use as the source of the clone.
     * If unspecified, the clone will be created with a snapshot of the active volume.
     **/
    public Optional<Long> getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Optional<Long> snapshotID) { 
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
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

        CloneVolumeRequest that = (CloneVolumeRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(newAccountID, that.newAccountID) && 
            Objects.equals(newSize, that.newSize) && 
            Objects.equals(access, that.access) && 
            Objects.equals(snapshotID, that.snapshotID) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,name,newAccountID,newSize,access,snapshotID,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("name", name);
        map.put("newAccountID", newAccountID);
        map.put("newSize", newSize);
        map.put("access", access);
        map.put("snapshotID", snapshotID);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" name : ").append(name).append(",");
        if(null != newAccountID && newAccountID.isPresent()){
            sb.append(" newAccountID : ").append(newAccountID).append(",");
        }
        if(null != newSize && newSize.isPresent()){
            sb.append(" newSize : ").append(newSize).append(",");
        }
        if(null != access && access.isPresent()){
            sb.append(" access : ").append(access).append(",");
        }
        if(null != snapshotID && snapshotID.isPresent()){
            sb.append(" snapshotID : ").append(snapshotID).append(",");
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
                         this.attributes);
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
