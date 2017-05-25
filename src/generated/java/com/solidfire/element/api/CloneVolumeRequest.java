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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * CloneVolumeRequest  
 * CloneVolume enables you to create a copy of a volume. This method is asynchronous and might take a variable amount of time to complete. The cloning process begins immediately when you make the CloneVolume request and is representative of the state of the volume when the API method is issued. You can use the GetAsyncResult method to determine when the cloning process is complete and the new volume is available for connections. You can use ListSyncJobs to see the progress of creating the clone.
 * Note: The initial attributes and QoS settings for the volume are inherited from the volume being cloned. You can change these settings with ModifyVolume.
 * Note: Cloned volumes do not inherit volume access group memberships from the source volume.
 **/

public class CloneVolumeRequest implements Serializable {

    public static final long serialVersionUID = 513126381279753378L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("name") private String name;
    @SerializedName("newAccountID") private Optional<Long> newAccountID;
    @SerializedName("newSize") private Optional<Long> newSize;
    @SerializedName("access") private Optional<String> access;
    @SerializedName("snapshotID") private Optional<Long> snapshotID;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    @SerializedName("enable512e") private Optional<Boolean> enable512e;
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
        Optional<Attributes> attributes,
        Optional<Boolean> enable512e
    )
    {
        this.volumeID = volumeID;
        this.name = name;
        this.newAccountID = (newAccountID == null) ? Optional.<Long>empty() : newAccountID;
        this.newSize = (newSize == null) ? Optional.<Long>empty() : newSize;
        this.access = (access == null) ? Optional.<String>empty() : access;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.enable512e = (enable512e == null) ? Optional.<Boolean>empty() : enable512e;
    }

    /** 
     * VolumeID for the volume to be cloned.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * The name of the new cloned volume. Might be 1 to 64 characters in length.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * AccountID for the owner of the new volume. If unspecified, the
     * accountID of the owner of the volume being cloned is used.
     **/
    public Optional<Long> getNewAccountID() { return this.newAccountID; }
    public void setNewAccountID(Optional<Long> newAccountID) { 
        this.newAccountID = (newAccountID == null) ? Optional.<Long>empty() : newAccountID;
    }
    /** 
     * New size of the volume, in bytes. Might be greater or less than the size of
     * the volume being cloned. If unspecified, the volume size is not
     * changed. Size is rounded to the nearest 1MB.
     **/
    public Optional<Long> getNewSize() { return this.newSize; }
    public void setNewSize(Optional<Long> newSize) { 
        this.newSize = (newSize == null) ? Optional.<Long>empty() : newSize;
    }
    /** 
     * Specifies the level of access allowed for the new volume. Possible values are:
     * readOnly: Only read operations are allowed.
     * readWrite: Reads and writes are allowed.
     * locked: No reads or writes are allowed. If unspecified, the level of access of the volume being cloned is used.
     * replicationTarget: Identify a volume as the target volume for a
     * paired set of volumes. If the volume is not paired, the access status is
     * locked.
     * If a value is not specified, the access value does not change.
     **/
    public Optional<String> getAccess() { return this.access; }
    public void setAccess(Optional<String> access) { 
        this.access = (access == null) ? Optional.<String>empty() : access;
    }
    /** 
     * ID of the snapshot that is used as the source of the clone. If no ID is
     * provided, the current active volume is used.
     **/
    public Optional<Long> getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Optional<Long> snapshotID) { 
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
    }
    /** 
     * List of name-value pairs in JSON object format.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    /** 
     * Should the volume provide 512-byte sector emulation?
     **/
    public Optional<Boolean> getEnable512e() { return this.enable512e; }
    public void setEnable512e(Optional<Boolean> enable512e) { 
        this.enable512e = (enable512e == null) ? Optional.<Boolean>empty() : enable512e;
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
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(enable512e, that.enable512e);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,name,newAccountID,newSize,access,snapshotID,attributes,enable512e );
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
        map.put("enable512e", enable512e);
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
        if(null != enable512e && enable512e.isPresent()){
            sb.append(" enable512e : ").append(enable512e).append(",");
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
        private Optional<Attributes> attributes;
        private Optional<Boolean> enable512e;

        private Builder() { }

        public CloneVolumeRequest build() {
            return new CloneVolumeRequest (
                         this.volumeID,
                         this.name,
                         this.newAccountID,
                         this.newSize,
                         this.access,
                         this.snapshotID,
                         this.attributes,
                         this.enable512e);
        }

        private CloneVolumeRequest.Builder buildFrom(final CloneVolumeRequest req) {
            this.volumeID = req.volumeID;
            this.name = req.name;
            this.newAccountID = req.newAccountID;
            this.newSize = req.newSize;
            this.access = req.access;
            this.snapshotID = req.snapshotID;
            this.attributes = req.attributes;
            this.enable512e = req.enable512e;

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

        public CloneVolumeRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

        public CloneVolumeRequest.Builder optionalEnable512e(final Boolean enable512e) {
            this.enable512e = (enable512e == null) ? Optional.<Boolean>empty() : Optional.of(enable512e);
            return this;
        }

    }
}
