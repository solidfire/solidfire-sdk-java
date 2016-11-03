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

public class VirtualVolumeInfo implements Serializable {

    public static final long serialVersionUID = -3100253211114290874L;
    @SerializedName("virtualVolumeID") private UUIDNullable virtualVolumeID;
    @SerializedName("parentVirtualVolumeID") private UUIDNullable parentVirtualVolumeID;
    @SerializedName("storageContainerID") private UUIDNullable storageContainerID;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("snapshotID") private Long snapshotID;
    @SerializedName("virtualVolumeType") private String virtualVolumeType;
    @SerializedName("status") private String status;
    @SerializedName("bindings") private Long[] bindings;
    @SerializedName("children") private UUIDNullable[] children;
    @SerializedName("metadata") private java.util.Map<String, Object> metadata;

    // empty constructor
    @Since("7.0")
    public VirtualVolumeInfo() {}

    // parameterized constructor
    @Since("7.0")
    public VirtualVolumeInfo(
        UUIDNullable virtualVolumeID,
        UUIDNullable parentVirtualVolumeID,
        UUIDNullable storageContainerID,
        Long volumeID,
        Long snapshotID,
        String virtualVolumeType,
        String status,
        Long[] bindings,
        UUIDNullable[] children,
        java.util.Map<String, Object> metadata
    )
    {
        this.virtualVolumeID = virtualVolumeID;
        this.parentVirtualVolumeID = parentVirtualVolumeID;
        this.storageContainerID = storageContainerID;
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
        this.virtualVolumeType = virtualVolumeType;
        this.status = status;
        this.bindings = bindings;
        this.children = children;
        this.metadata = metadata;
    }

    /** 
     **/
    public UUIDNullable getVirtualVolumeID() { return this.virtualVolumeID; }
    public void setVirtualVolumeID(UUIDNullable virtualVolumeID) { 
        this.virtualVolumeID = virtualVolumeID;
    }
    /** 
     **/
    public UUIDNullable getParentVirtualVolumeID() { return this.parentVirtualVolumeID; }
    public void setParentVirtualVolumeID(UUIDNullable parentVirtualVolumeID) { 
        this.parentVirtualVolumeID = parentVirtualVolumeID;
    }
    /** 
     **/
    public UUIDNullable getStorageContainerID() { return this.storageContainerID; }
    public void setStorageContainerID(UUIDNullable storageContainerID) { 
        this.storageContainerID = storageContainerID;
    }
    /** 
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     **/
    public Long getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Long snapshotID) { 
        this.snapshotID = snapshotID;
    }
    /** 
     **/
    public String getVirtualVolumeType() { return this.virtualVolumeType; }
    public void setVirtualVolumeType(String virtualVolumeType) { 
        this.virtualVolumeType = virtualVolumeType;
    }
    /** 
     **/
    public String getStatus() { return this.status; }
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     **/
    public Long[] getBindings() { return this.bindings; }
    public void setBindings(Long[] bindings) { 
        this.bindings = bindings;
    }
    /** 
     **/
    public UUIDNullable[] getChildren() { return this.children; }
    public void setChildren(UUIDNullable[] children) { 
        this.children = children;
    }
    /** 
     **/
    public java.util.Map<String, Object> getMetadata() { return this.metadata; }
    public void setMetadata(java.util.Map<String, Object> metadata) { 
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualVolumeInfo that = (VirtualVolumeInfo) o;
        return 
            Objects.equals(virtualVolumeID, that.virtualVolumeID) &&
            Objects.equals(parentVirtualVolumeID, that.parentVirtualVolumeID) &&
            Objects.equals(storageContainerID, that.storageContainerID) &&
            Objects.equals(volumeID, that.volumeID) &&
            Objects.equals(snapshotID, that.snapshotID) &&
            Objects.equals(virtualVolumeType, that.virtualVolumeType) &&
            Objects.equals(status, that.status) &&
            Objects.equals(bindings, that.bindings) &&
            Objects.equals(children, that.children) &&
            Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeID, parentVirtualVolumeID, storageContainerID, volumeID, snapshotID, virtualVolumeType, status, (Object[])bindings, (Object[])children, metadata );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeID", virtualVolumeID);
        map.put("parentVirtualVolumeID", parentVirtualVolumeID);
        map.put("storageContainerID", storageContainerID);
        map.put("volumeID", volumeID);
        map.put("snapshotID", snapshotID);
        map.put("virtualVolumeType", virtualVolumeType);
        map.put("status", status);
        map.put("bindings", bindings);
        map.put("children", children);
        map.put("metadata", metadata);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualVolumeID : ").append(virtualVolumeID).append(",");
        sb.append(" parentVirtualVolumeID : ").append(parentVirtualVolumeID).append(",");
        sb.append(" storageContainerID : ").append(storageContainerID).append(",");
        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" snapshotID : ").append(snapshotID).append(",");
        sb.append(" virtualVolumeType : ").append(virtualVolumeType).append(",");
        sb.append(" status : ").append(status).append(",");
        sb.append(" bindings : ").append(Arrays.toString(bindings)).append(",");
        sb.append(" children : ").append(Arrays.toString(children)).append(",");
        sb.append(" metadata : ").append(metadata).append(",");
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
        private UUIDNullable virtualVolumeID;
        private UUIDNullable parentVirtualVolumeID;
        private UUIDNullable storageContainerID;
        private Long volumeID;
        private Long snapshotID;
        private String virtualVolumeType;
        private String status;
        private Long[] bindings;
        private UUIDNullable[] children;
        private java.util.Map<String, Object> metadata;

        private Builder() { }

        public VirtualVolumeInfo build() {
            return new VirtualVolumeInfo (
                         this.virtualVolumeID,
                         this.parentVirtualVolumeID,
                         this.storageContainerID,
                         this.volumeID,
                         this.snapshotID,
                         this.virtualVolumeType,
                         this.status,
                         this.bindings,
                         this.children,
                         this.metadata);
        }

        private VirtualVolumeInfo.Builder buildFrom(final VirtualVolumeInfo req) {
            this.virtualVolumeID = req.virtualVolumeID;
            this.parentVirtualVolumeID = req.parentVirtualVolumeID;
            this.storageContainerID = req.storageContainerID;
            this.volumeID = req.volumeID;
            this.snapshotID = req.snapshotID;
            this.virtualVolumeType = req.virtualVolumeType;
            this.status = req.status;
            this.bindings = req.bindings;
            this.children = req.children;
            this.metadata = req.metadata;

            return this;
        }

        public VirtualVolumeInfo.Builder virtualVolumeID(final UUIDNullable virtualVolumeID) {
            this.virtualVolumeID = virtualVolumeID;
            return this;
        }

        public VirtualVolumeInfo.Builder parentVirtualVolumeID(final UUIDNullable parentVirtualVolumeID) {
            this.parentVirtualVolumeID = parentVirtualVolumeID;
            return this;
        }

        public VirtualVolumeInfo.Builder storageContainerID(final UUIDNullable storageContainerID) {
            this.storageContainerID = storageContainerID;
            return this;
        }

        public VirtualVolumeInfo.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public VirtualVolumeInfo.Builder snapshotID(final Long snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

        public VirtualVolumeInfo.Builder virtualVolumeType(final String virtualVolumeType) {
            this.virtualVolumeType = virtualVolumeType;
            return this;
        }

        public VirtualVolumeInfo.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public VirtualVolumeInfo.Builder bindings(final Long[] bindings) {
            this.bindings = bindings;
            return this;
        }

        public VirtualVolumeInfo.Builder children(final UUIDNullable[] children) {
            this.children = children;
            return this;
        }

        public VirtualVolumeInfo.Builder metadata(final java.util.Map<String, Object> metadata) {
            this.metadata = metadata;
            return this;
        }

    }
}
