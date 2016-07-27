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
 * Volumes Info is an object containing information about a volume.
 **/
public class Volume  implements Serializable  {

    private static final long serialVersionUID = -1140192989L;

    @SerializedName("volumeID") private final Long volumeID;
    @SerializedName("name") private final String name;
    @SerializedName("accountID") private final Long accountID;
    @SerializedName("createTime") private final String createTime;
    @SerializedName("status") private final String status;
    @SerializedName("access") private final String access;
    @SerializedName("enable512e") private final Boolean enable512e;
    @SerializedName("iqn") private final String iqn;
    @SerializedName("scsiEUIDeviceID") private final String scsiEUIDeviceID;
    @SerializedName("scsiNAADeviceID") private final String scsiNAADeviceID;
    @SerializedName("qos") private final VolumeQOS qos;
    @SerializedName("volumeAccessGroups") private final Long[] volumeAccessGroups;
    @SerializedName("volumePairs") private final VolumePair[] volumePairs;
    @SerializedName("deleteTime") private final Optional<String> deleteTime;
    @SerializedName("purgeTime") private final Optional<String> purgeTime;
    @SerializedName("sliceCount") private final Long sliceCount;
    @SerializedName("totalSize") private final Long totalSize;
    @SerializedName("blockSize") private final Long blockSize;
    @SerializedName("virtualVolumeID") private final String virtualVolumeID;
    @SerializedName("attributes") private final java.util.Map<String, Object> attributes;

    /**
     * Volumes Info is an object containing information about a volume.
     * The return objects only include &quot;configured&quot; information about the volume and not runtime or usage information.
     * Information about paired volumes will also be returned.
     * @param volumeID [required] Unique VolumeID for the volume.
     * @param name [required] Name of the volume as provided at creation time.
     * @param accountID [required] Unique AccountID for the account.
     * @param createTime [required] UTC formatted time the volume was created.
     * @param status [required] Current status of the volume
     * @param access [required] Access allowed for the volume
     * @param enable512e [required] If &quot;true&quot;, the volume provides 512 byte sector emulation.
     * @param iqn [required] Volume iSCSI Qualified Name.
     * @param scsiEUIDeviceID [required] Globally unique SCSI device identifier for the volume in EUI-64 based 16-byte format.
     * @param scsiNAADeviceID [required] Globally unique SCSI device identifier for the volume in NAA IEEE Registered Extended format.
     * @param qos [required] Quality of service settings for this volume.
     * @param volumeAccessGroups [required] List of volume access groups to which a volume belongs.
     * @param volumePairs [required] Information about a paired volume.
     * @param deleteTime (optional) The time this volume was deleted.
     * @param purgeTime (optional) The time this volume will be purged from the system.
     * @param sliceCount [required] The number of slices backing this volume.
     * @param totalSize [required] Total size of this volume in bytes.
     * @param virtualVolumeID [required] Virtual volume ID this volume backs.
     * @param attributes [required] List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public Volume(Long volumeID, String name, Long accountID, String createTime, String status, String access, Boolean enable512e, String iqn, String scsiEUIDeviceID, String scsiNAADeviceID, VolumeQOS qos, Long[] volumeAccessGroups, VolumePair[] volumePairs, Optional<String> deleteTime, Optional<String> purgeTime, Long sliceCount, Long totalSize, String virtualVolumeID, java.util.Map<String, Object> attributes) {
        this.name = name;
        this.volumeAccessGroups = volumeAccessGroups;
        this.createTime = createTime;
        this.scsiNAADeviceID = scsiNAADeviceID;
        this.totalSize = totalSize;
        this.virtualVolumeID = virtualVolumeID;
        this.enable512e = enable512e;
        this.iqn = iqn;
        this.blockSize = null;
        this.attributes = attributes;
        this.accountID = accountID;
        this.volumePairs = volumePairs;
        this.status = status;
        this.purgeTime = (purgeTime == null) ? Optional.<String>empty() : purgeTime;
        this.deleteTime = (deleteTime == null) ? Optional.<String>empty() : deleteTime;
        this.volumeID = volumeID;
        this.scsiEUIDeviceID = scsiEUIDeviceID;
        this.qos = qos;
        this.sliceCount = sliceCount;
        this.access = access;
    }

    /**
     * Volumes Info is an object containing information about a volume.
     * The return objects only include &quot;configured&quot; information about the volume and not runtime or usage information.
     * Information about paired volumes will also be returned.
     * @param volumeID [required] Unique VolumeID for the volume.
     * @param name [required] Name of the volume as provided at creation time.
     * @param accountID [required] Unique AccountID for the account.
     * @param createTime [required] UTC formatted time the volume was created.
     * @param status [required] Current status of the volume
     * @param access [required] Access allowed for the volume
     * @param enable512e [required] If &quot;true&quot;, the volume provides 512 byte sector emulation.
     * @param iqn [required] Volume iSCSI Qualified Name.
     * @param scsiEUIDeviceID [required] Globally unique SCSI device identifier for the volume in EUI-64 based 16-byte format.
     * @param scsiNAADeviceID [required] Globally unique SCSI device identifier for the volume in NAA IEEE Registered Extended format.
     * @param qos [required] Quality of service settings for this volume.
     * @param volumeAccessGroups [required] List of volume access groups to which a volume belongs.
     * @param volumePairs [required] Information about a paired volume.
     * @param deleteTime (optional) The time this volume was deleted.
     * @param purgeTime (optional) The time this volume will be purged from the system.
     * @param sliceCount [required] The number of slices backing this volume.
     * @param totalSize [required] Total size of this volume in bytes.
     * @param blockSize [required] Size of the blocks on the volume.
     * @param virtualVolumeID [required] Virtual volume ID this volume backs.
     * @param attributes [required] List of Name/Value pairs in JSON object format.
     * @since 8.0
     **/
    @Since("8.0")
    public Volume(Long volumeID, String name, Long accountID, String createTime, String status, String access, Boolean enable512e, String iqn, String scsiEUIDeviceID, String scsiNAADeviceID, VolumeQOS qos, Long[] volumeAccessGroups, VolumePair[] volumePairs, Optional<String> deleteTime, Optional<String> purgeTime, Long sliceCount, Long totalSize, Long blockSize, String virtualVolumeID, java.util.Map<String, Object> attributes) {
        this.name = name;
        this.volumeAccessGroups = volumeAccessGroups;
        this.createTime = createTime;
        this.scsiNAADeviceID = scsiNAADeviceID;
        this.totalSize = totalSize;
        this.virtualVolumeID = virtualVolumeID;
        this.enable512e = enable512e;
        this.iqn = iqn;
        this.blockSize = blockSize;
        this.attributes = attributes;
        this.accountID = accountID;
        this.volumePairs = volumePairs;
        this.status = status;
        this.purgeTime = (purgeTime == null) ? Optional.<String>empty() : purgeTime;
        this.deleteTime = (deleteTime == null) ? Optional.<String>empty() : deleteTime;
        this.volumeID = volumeID;
        this.scsiEUIDeviceID = scsiEUIDeviceID;
        this.qos = qos;
        this.sliceCount = sliceCount;
        this.access = access;
    }


    /**
     * Unique VolumeID for the volume.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    /**
     * Name of the volume as provided at creation time.
     **/
    public String getName() {
        return this.name;
    }

    /**
     * Unique AccountID for the account.
     **/
    public Long getAccountID() {
        return this.accountID;
    }

    /**
     * UTC formatted time the volume was created.
     **/
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * Current status of the volume
     * init: A volume that is being initialized and is not ready for connections.
     * active: An active volume ready for connections.
     **/
    public String getStatus() {
        return this.status;
    }

    /**
     * Access allowed for the volume
     * <br/><b>readOnly</b>: Only read operations are allowed.
     * <br/><b>readWrite</b>: Reads and writes are allowed.
     * <br/><b>locked</b>: No reads or writes are allowed.
     * <br/><b>replicationTarget</b>: Designated as a target volume in a replicated volume pair.
     **/
    public String getAccess() {
        return this.access;
    }

    /**
     * If &quot;true&quot;, the volume provides 512 byte sector emulation.
     **/
    public Boolean getEnable512e() {
        return this.enable512e;
    }

    /**
     * Volume iSCSI Qualified Name.
     **/
    public String getIqn() {
        return this.iqn;
    }

    /**
     * Globally unique SCSI device identifier for the volume in EUI-64 based 16-byte format.
     **/
    public String getScsiEUIDeviceID() {
        return this.scsiEUIDeviceID;
    }

    /**
     * Globally unique SCSI device identifier for the volume in NAA IEEE Registered Extended format.
     **/
    public String getScsiNAADeviceID() {
        return this.scsiNAADeviceID;
    }

    /**
     * Quality of service settings for this volume.
     **/
    public VolumeQOS getQos() {
        return this.qos;
    }

    /**
     * List of volume access groups to which a volume belongs.
     **/
    public Long[] getVolumeAccessGroups() {
        return this.volumeAccessGroups;
    }

    /**
     * Information about a paired volume.
     * Available only if a volume is paired.
     * @see VolumePairs for return values.
     **/
    public VolumePair[] getVolumePairs() {
        return this.volumePairs;
    }

    /**
     * The time this volume was deleted.
     * If this has no value, the volume has not yet been deleted.
     **/
    public Optional<String> getDeleteTime() {
        return this.deleteTime;
    }

    /**
     * The time this volume will be purged from the system.
     * If this has no value, the volume has not yet been deleted (and is not scheduled for purging).
     **/
    public Optional<String> getPurgeTime() {
        return this.purgeTime;
    }

    /**
     * The number of slices backing this volume.
     * In the current software, this value will always be 1.
     **/
    public Long getSliceCount() {
        return this.sliceCount;
    }

    /**
     * Total size of this volume in bytes.
     **/
    public Long getTotalSize() {
        return this.totalSize;
    }

    /**
     * Size of the blocks on the volume.
     * @since 8.0 
     **/

    @Since("8.0")
    public Long getBlockSize() {
        return this.blockSize;
    }

    /**
     * Virtual volume ID this volume backs.
     **/
    public String getVirtualVolumeID() {
        return this.virtualVolumeID;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public java.util.Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Volume that = (Volume) o;
        

        return Objects.equals( volumeID , that.volumeID )
            && Objects.equals( name , that.name )
            && Objects.equals( accountID , that.accountID )
            && Objects.equals( createTime , that.createTime )
            && Objects.equals( status , that.status )
            && Objects.equals( access , that.access )
            && Objects.equals( enable512e , that.enable512e )
            && Objects.equals( iqn , that.iqn )
            && Objects.equals( scsiEUIDeviceID , that.scsiEUIDeviceID )
            && Objects.equals( scsiNAADeviceID , that.scsiNAADeviceID )
            && Objects.equals( qos , that.qos )
            && Objects.deepEquals( volumeAccessGroups , that.volumeAccessGroups )
            && Objects.deepEquals( volumePairs , that.volumePairs )
            && Objects.equals( deleteTime , that.deleteTime )
            && Objects.equals( purgeTime , that.purgeTime )
            && Objects.equals( sliceCount , that.sliceCount )
            && Objects.equals( totalSize , that.totalSize )
            && Objects.equals( blockSize , that.blockSize )
            && Objects.equals( virtualVolumeID , that.virtualVolumeID )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, name, accountID, createTime, status, access, enable512e, iqn, scsiEUIDeviceID, scsiNAADeviceID, qos, volumeAccessGroups, volumePairs, deleteTime, purgeTime, sliceCount, totalSize, blockSize, virtualVolumeID, attributes );
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
        sb.append(" iqn : ").append(iqn).append(",");
        sb.append(" scsiEUIDeviceID : ").append(scsiEUIDeviceID).append(",");
        sb.append(" scsiNAADeviceID : ").append(scsiNAADeviceID).append(",");
        sb.append(" qos : ").append(qos).append(",");
        sb.append(" volumeAccessGroups : ").append(Arrays.toString(volumeAccessGroups)).append(",");
        sb.append(" volumePairs : ").append(Arrays.toString(volumePairs)).append(",");
        if(null != deleteTime && deleteTime.isPresent())
            sb.append(" deleteTime : ").append(deleteTime.get()).append(",");
        if(null != purgeTime && purgeTime.isPresent())
            sb.append(" purgeTime : ").append(purgeTime.get()).append(",");
        sb.append(" sliceCount : ").append(sliceCount).append(",");
        sb.append(" totalSize : ").append(totalSize).append(",");
        sb.append(" blockSize : ").append(blockSize).append(",");
        sb.append(" virtualVolumeID : ").append(virtualVolumeID).append(",");
        sb.append(" attributes : ").append(attributes);
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
        private Long accountID;
        private String createTime;
        private String status;
        private String access;
        private Boolean enable512e;
        private String iqn;
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
        private String virtualVolumeID;
        private java.util.Map<String, Object> attributes;

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
                         this.attributes            );
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

        public Volume.Builder iqn(final String iqn) {
            this.iqn = iqn;
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

        public Volume.Builder virtualVolumeID(final String virtualVolumeID) {
            this.virtualVolumeID = virtualVolumeID;
            return this;
        }

        public Volume.Builder attributes(final java.util.Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

    }

}
