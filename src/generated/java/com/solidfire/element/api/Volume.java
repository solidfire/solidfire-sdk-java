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
 * Volume  
 * Volumes Info is an object containing information about a volume.
 * The return objects only include "configured" information about the volume and not runtime or usage information.
 * Information about paired volumes will also be returned.
 **/

public class Volume implements Serializable {

    public static final long serialVersionUID = -7686354995119743056L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("name") private String name;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("createTime") private String createTime;
    @SerializedName("status") private String status;
    @SerializedName("access") private String access;
    @SerializedName("enable512e") private Boolean enable512e;
    @SerializedName("iqn") private Optional<String> iqn;
    @SerializedName("scsiEUIDeviceID") private String scsiEUIDeviceID;
    @SerializedName("scsiNAADeviceID") private String scsiNAADeviceID;
    @SerializedName("qos") private VolumeQOS qos;
    @SerializedName("volumeAccessGroups") private Long[] volumeAccessGroups;
    @SerializedName("volumePairs") private VolumePair[] volumePairs;
    @SerializedName("deleteTime") private Optional<String> deleteTime;
    @SerializedName("purgeTime") private Optional<String> purgeTime;
    @SerializedName("sliceCount") private Long sliceCount;
    @SerializedName("totalSize") private Long totalSize;
    @SerializedName("blockSize") private Long blockSize;
    @SerializedName("virtualVolumeID") private Optional<java.util.UUID> virtualVolumeID;
    @SerializedName("attributes") private Attributes attributes;

    // empty constructor
    @Since("7.0")
    public Volume() {}

    
    // parameterized constructor
    @Since("7.0")
    public Volume(
        Long volumeID,
        String name,
        Long accountID,
        String createTime,
        String status,
        String access,
        Boolean enable512e,
        Optional<String> iqn,
        String scsiEUIDeviceID,
        String scsiNAADeviceID,
        VolumeQOS qos,
        Long[] volumeAccessGroups,
        VolumePair[] volumePairs,
        Optional<String> deleteTime,
        Optional<String> purgeTime,
        Long sliceCount,
        Long totalSize,
        Optional<java.util.UUID> virtualVolumeID,
        Attributes attributes
    )
    {
        this.volumeID = volumeID;
        this.name = name;
        this.accountID = accountID;
        this.createTime = createTime;
        this.status = status;
        this.access = access;
        this.enable512e = enable512e;
        this.iqn = (iqn == null) ? Optional.<String>empty() : iqn;
        this.scsiEUIDeviceID = scsiEUIDeviceID;
        this.scsiNAADeviceID = scsiNAADeviceID;
        this.qos = qos;
        this.volumeAccessGroups = volumeAccessGroups;
        this.volumePairs = volumePairs;
        this.deleteTime = (deleteTime == null) ? Optional.<String>empty() : deleteTime;
        this.purgeTime = (purgeTime == null) ? Optional.<String>empty() : purgeTime;
        this.sliceCount = sliceCount;
        this.totalSize = totalSize;
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<java.util.UUID>empty() : virtualVolumeID;
        this.attributes = attributes;
    }
    // parameterized constructor
    @Since("8.0")
    public Volume(
        Long volumeID,
        String name,
        Long accountID,
        String createTime,
        String status,
        String access,
        Boolean enable512e,
        Optional<String> iqn,
        String scsiEUIDeviceID,
        String scsiNAADeviceID,
        VolumeQOS qos,
        Long[] volumeAccessGroups,
        VolumePair[] volumePairs,
        Optional<String> deleteTime,
        Optional<String> purgeTime,
        Long sliceCount,
        Long totalSize,
        Long blockSize,
        Optional<java.util.UUID> virtualVolumeID,
        Attributes attributes
    )
    {
        this.volumeID = volumeID;
        this.name = name;
        this.accountID = accountID;
        this.createTime = createTime;
        this.status = status;
        this.access = access;
        this.enable512e = enable512e;
        this.iqn = (iqn == null) ? Optional.<String>empty() : iqn;
        this.scsiEUIDeviceID = scsiEUIDeviceID;
        this.scsiNAADeviceID = scsiNAADeviceID;
        this.qos = qos;
        this.volumeAccessGroups = volumeAccessGroups;
        this.volumePairs = volumePairs;
        this.deleteTime = (deleteTime == null) ? Optional.<String>empty() : deleteTime;
        this.purgeTime = (purgeTime == null) ? Optional.<String>empty() : purgeTime;
        this.sliceCount = sliceCount;
        this.totalSize = totalSize;
        this.blockSize = blockSize;
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<java.util.UUID>empty() : virtualVolumeID;
        this.attributes = attributes;
    }

    /** 
     * Unique VolumeID for the volume.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * Name of the volume as provided at creation time.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * Unique AccountID for the account.
     **/
    public Long getAccountID() { return this.accountID; }
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     * UTC formatted time the volume was created.
     **/
    public String getCreateTime() { return this.createTime; }
    public void setCreateTime(String createTime) { 
        this.createTime = createTime;
    }
    /** 
     * Current status of the volume
     * init: A volume that is being initialized and is not ready for connections.
     * active: An active volume ready for connections.
     **/
    public String getStatus() { return this.status; }
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     * Access allowed for the volume
     * readOnly: Only read operations are allowed.
     * readWrite: Reads and writes are allowed.
     * locked: No reads or writes are allowed.
     * replicationTarget: Designated as a target volume in a replicated volume pair.
     **/
    public String getAccess() { return this.access; }
    public void setAccess(String access) { 
        this.access = access;
    }
    /** 
     * If "true", the volume provides 512 byte sector emulation.
     **/
    public Boolean getEnable512e() { return this.enable512e; }
    public void setEnable512e(Boolean enable512e) { 
        this.enable512e = enable512e;
    }
    /** 
     * Volume iSCSI Qualified Name.
     **/
    public Optional<String> getIqn() { return this.iqn; }
    public void setIqn(Optional<String> iqn) { 
        this.iqn = (iqn == null) ? Optional.<String>empty() : iqn;
    }
    /** 
     * Globally unique SCSI device identifier for the volume in EUI-64 based 16-byte format.
     **/
    public String getScsiEUIDeviceID() { return this.scsiEUIDeviceID; }
    public void setScsiEUIDeviceID(String scsiEUIDeviceID) { 
        this.scsiEUIDeviceID = scsiEUIDeviceID;
    }
    /** 
     * Globally unique SCSI device identifier for the volume in NAA IEEE Registered Extended format.
     **/
    public String getScsiNAADeviceID() { return this.scsiNAADeviceID; }
    public void setScsiNAADeviceID(String scsiNAADeviceID) { 
        this.scsiNAADeviceID = scsiNAADeviceID;
    }
    /** 
     * Quality of service settings for this volume.
     **/
    public VolumeQOS getQos() { return this.qos; }
    public void setQos(VolumeQOS qos) { 
        this.qos = qos;
    }
    /** 
     * List of volume access groups to which a volume beintegers.
     **/
    public Long[] getVolumeAccessGroups() { return this.volumeAccessGroups; }
    public void setVolumeAccessGroups(Long[] volumeAccessGroups) { 
        this.volumeAccessGroups = volumeAccessGroups;
    }
    /** 
     * Information about a paired volume.
     * Available only if a volume is paired.
     * @see VolumePairs for return values.
     **/
    public VolumePair[] getVolumePairs() { return this.volumePairs; }
    public void setVolumePairs(VolumePair[] volumePairs) { 
        this.volumePairs = volumePairs;
    }
    /** 
     * The time this volume was deleted.
     * If this has no value, the volume has not yet been deleted.
     **/
    public Optional<String> getDeleteTime() { return this.deleteTime; }
    public void setDeleteTime(Optional<String> deleteTime) { 
        this.deleteTime = (deleteTime == null) ? Optional.<String>empty() : deleteTime;
    }
    /** 
     * The time this volume will be purged from the system.
     * If this has no value, the volume has not yet been deleted (and is not scheduled for purging).
     **/
    public Optional<String> getPurgeTime() { return this.purgeTime; }
    public void setPurgeTime(Optional<String> purgeTime) { 
        this.purgeTime = (purgeTime == null) ? Optional.<String>empty() : purgeTime;
    }
    /** 
     * The number of slices backing this volume.
     * In the current software, this value will always be 1.
     **/
    public Long getSliceCount() { return this.sliceCount; }
    public void setSliceCount(Long sliceCount) { 
        this.sliceCount = sliceCount;
    }
    /** 
     * Total size of this volume in bytes.
     **/
    public Long getTotalSize() { return this.totalSize; }
    public void setTotalSize(Long totalSize) { 
        this.totalSize = totalSize;
    }
    /** 
     * Size of the blocks on the volume.
     **/
    public Long getBlockSize() { return this.blockSize; }
    public void setBlockSize(Long blockSize) { 
        this.blockSize = blockSize;
    }
    /** 
     * Virtual volume ID this volume backs.
     **/
    public Optional<java.util.UUID> getVirtualVolumeID() { return this.virtualVolumeID; }
    public void setVirtualVolumeID(Optional<java.util.UUID> virtualVolumeID) { 
        this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<java.util.UUID>empty() : virtualVolumeID;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Attributes getAttributes() { return this.attributes; }
    public void setAttributes(Attributes attributes) { 
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Volume that = (Volume) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(createTime, that.createTime) && 
            Objects.equals(status, that.status) && 
            Objects.equals(access, that.access) && 
            Objects.equals(enable512e, that.enable512e) && 
            Objects.equals(iqn, that.iqn) && 
            Objects.equals(scsiEUIDeviceID, that.scsiEUIDeviceID) && 
            Objects.equals(scsiNAADeviceID, that.scsiNAADeviceID) && 
            Objects.equals(qos, that.qos) && 
            Arrays.equals(volumeAccessGroups, that.volumeAccessGroups) && 
            Arrays.equals(volumePairs, that.volumePairs) && 
            Objects.equals(deleteTime, that.deleteTime) && 
            Objects.equals(purgeTime, that.purgeTime) && 
            Objects.equals(sliceCount, that.sliceCount) && 
            Objects.equals(totalSize, that.totalSize) && 
            Objects.equals(blockSize, that.blockSize) && 
            Objects.equals(virtualVolumeID, that.virtualVolumeID) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,name,accountID,createTime,status,access,enable512e,iqn,scsiEUIDeviceID,scsiNAADeviceID,qos,(Object[])volumeAccessGroups,(Object[])volumePairs,deleteTime,purgeTime,sliceCount,totalSize,blockSize,virtualVolumeID,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("name", name);
        map.put("accountID", accountID);
        map.put("createTime", createTime);
        map.put("status", status);
        map.put("access", access);
        map.put("enable512e", enable512e);
        map.put("iqn", iqn);
        map.put("scsiEUIDeviceID", scsiEUIDeviceID);
        map.put("scsiNAADeviceID", scsiNAADeviceID);
        map.put("qos", qos);
        map.put("volumeAccessGroups", volumeAccessGroups);
        map.put("volumePairs", volumePairs);
        map.put("deleteTime", deleteTime);
        map.put("purgeTime", purgeTime);
        map.put("sliceCount", sliceCount);
        map.put("totalSize", totalSize);
        map.put("blockSize", blockSize);
        map.put("virtualVolumeID", virtualVolumeID);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" accountID : ").append(accountID).append(",");
        sb.append(" createTime : ").append(createTime).append(",");
        sb.append(" status : ").append(status).append(",");
        sb.append(" access : ").append(access).append(",");
        sb.append(" enable512e : ").append(enable512e).append(",");
        if(null != iqn && iqn.isPresent()){
            sb.append(" iqn : ").append(iqn).append(",");
        }
        sb.append(" scsiEUIDeviceID : ").append(scsiEUIDeviceID).append(",");
        sb.append(" scsiNAADeviceID : ").append(scsiNAADeviceID).append(",");
        sb.append(" qos : ").append(qos).append(",");
        sb.append(" volumeAccessGroups : ").append(Arrays.toString(volumeAccessGroups)).append(",");
        sb.append(" volumePairs : ").append(Arrays.toString(volumePairs)).append(",");
        if(null != deleteTime && deleteTime.isPresent()){
            sb.append(" deleteTime : ").append(deleteTime).append(",");
        }
        if(null != purgeTime && purgeTime.isPresent()){
            sb.append(" purgeTime : ").append(purgeTime).append(",");
        }
        sb.append(" sliceCount : ").append(sliceCount).append(",");
        sb.append(" totalSize : ").append(totalSize).append(",");
        sb.append(" blockSize : ").append(blockSize).append(",");
        if(null != virtualVolumeID && virtualVolumeID.isPresent()){
            sb.append(" virtualVolumeID : ").append(virtualVolumeID).append(",");
        }
        sb.append(" attributes : ").append(attributes).append(",");
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
        private Long accountID;
        private String createTime;
        private String status;
        private String access;
        private Boolean enable512e;
        private Optional<String> iqn;
        private String scsiEUIDeviceID;
        private String scsiNAADeviceID;
        private VolumeQOS qos;
        private Long[] volumeAccessGroups;
        private VolumePair[] volumePairs;
        private Optional<String> deleteTime;
        private Optional<String> purgeTime;
        private Long sliceCount;
        private Long totalSize;
        private Long blockSize;
        private Optional<java.util.UUID> virtualVolumeID;
        private Attributes attributes;

        private Builder() { }

        public Volume build() {
            return new Volume (
                         this.volumeID,
                         this.name,
                         this.accountID,
                         this.createTime,
                         this.status,
                         this.access,
                         this.enable512e,
                         this.iqn,
                         this.scsiEUIDeviceID,
                         this.scsiNAADeviceID,
                         this.qos,
                         this.volumeAccessGroups,
                         this.volumePairs,
                         this.deleteTime,
                         this.purgeTime,
                         this.sliceCount,
                         this.totalSize,
                         this.blockSize,
                         this.virtualVolumeID,
                         this.attributes);
        }

        private Volume.Builder buildFrom(final Volume req) {
            this.volumeID = req.volumeID;
            this.name = req.name;
            this.accountID = req.accountID;
            this.createTime = req.createTime;
            this.status = req.status;
            this.access = req.access;
            this.enable512e = req.enable512e;
            this.iqn = req.iqn;
            this.scsiEUIDeviceID = req.scsiEUIDeviceID;
            this.scsiNAADeviceID = req.scsiNAADeviceID;
            this.qos = req.qos;
            this.volumeAccessGroups = req.volumeAccessGroups;
            this.volumePairs = req.volumePairs;
            this.deleteTime = req.deleteTime;
            this.purgeTime = req.purgeTime;
            this.sliceCount = req.sliceCount;
            this.totalSize = req.totalSize;
            this.blockSize = req.blockSize;
            this.virtualVolumeID = req.virtualVolumeID;
            this.attributes = req.attributes;

            return this;
        }

        public Volume.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public Volume.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Volume.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public Volume.Builder createTime(final String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Volume.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public Volume.Builder access(final String access) {
            this.access = access;
            return this;
        }

        public Volume.Builder enable512e(final Boolean enable512e) {
            this.enable512e = enable512e;
            return this;
        }

        public Volume.Builder optionalIqn(final String iqn) {
            this.iqn = (iqn == null) ? Optional.<String>empty() : Optional.of(iqn);
            return this;
        }

        public Volume.Builder scsiEUIDeviceID(final String scsiEUIDeviceID) {
            this.scsiEUIDeviceID = scsiEUIDeviceID;
            return this;
        }

        public Volume.Builder scsiNAADeviceID(final String scsiNAADeviceID) {
            this.scsiNAADeviceID = scsiNAADeviceID;
            return this;
        }

        public Volume.Builder qos(final VolumeQOS qos) {
            this.qos = qos;
            return this;
        }

        public Volume.Builder volumeAccessGroups(final Long[] volumeAccessGroups) {
            this.volumeAccessGroups = volumeAccessGroups;
            return this;
        }

        public Volume.Builder volumePairs(final VolumePair[] volumePairs) {
            this.volumePairs = volumePairs;
            return this;
        }

        public Volume.Builder optionalDeleteTime(final String deleteTime) {
            this.deleteTime = (deleteTime == null) ? Optional.<String>empty() : Optional.of(deleteTime);
            return this;
        }

        public Volume.Builder optionalPurgeTime(final String purgeTime) {
            this.purgeTime = (purgeTime == null) ? Optional.<String>empty() : Optional.of(purgeTime);
            return this;
        }

        public Volume.Builder sliceCount(final Long sliceCount) {
            this.sliceCount = sliceCount;
            return this;
        }

        public Volume.Builder totalSize(final Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public Volume.Builder blockSize(final Long blockSize) {
            this.blockSize = blockSize;
            return this;
        }

        public Volume.Builder optionalVirtualVolumeID(final java.util.UUID virtualVolumeID) {
            this.virtualVolumeID = (virtualVolumeID == null) ? Optional.<java.util.UUID>empty() : Optional.of(virtualVolumeID);
            return this;
        }

        public Volume.Builder attributes(final Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

    }
}
