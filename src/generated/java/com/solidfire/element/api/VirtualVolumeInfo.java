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
 * VirtualVolumeInfo  
 **/

public class VirtualVolumeInfo implements Serializable {

    public static final long serialVersionUID = 6505173434057088271L;
    @SerializedName("virtualVolumeID") private java.util.UUID virtualVolumeID;
    @SerializedName("parentVirtualVolumeID") private java.util.UUID parentVirtualVolumeID;
    @SerializedName("storageContainerID") private java.util.UUID storageContainerID;
    @SerializedName("storageContainer") private StorageContainer storageContainer;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("snapshotID") private Long snapshotID;
    @SerializedName("virtualVolumeType") private String virtualVolumeType;
    @SerializedName("status") private String status;
    @SerializedName("bindings") private Long[] bindings;
    @SerializedName("children") private java.util.UUID[] children;
    @SerializedName("metadata") private java.util.Map<String, Object> metadata;
    @SerializedName("snapshotInfo") private Snapshot snapshotInfo;
    @SerializedName("volumeInfo") private Volume volumeInfo;

    // empty constructor
    @Since("7.0")
    public VirtualVolumeInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public VirtualVolumeInfo(
        java.util.UUID virtualVolumeID,
        java.util.UUID parentVirtualVolumeID,
        java.util.UUID storageContainerID,
        StorageContainer storageContainer,
        Long volumeID,
        Long snapshotID,
        String virtualVolumeType,
        String status,
        Long[] bindings,
        java.util.UUID[] children,
        java.util.Map<String, Object> metadata,
        Snapshot snapshotInfo,
        Volume volumeInfo
    )
    {
        this.virtualVolumeID = virtualVolumeID;
        this.parentVirtualVolumeID = parentVirtualVolumeID;
        this.storageContainerID = storageContainerID;
        this.storageContainer = storageContainer;
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
        this.virtualVolumeType = virtualVolumeType;
        this.status = status;
        this.bindings = bindings;
        this.children = children;
        this.metadata = metadata;
        this.snapshotInfo = snapshotInfo;
        this.volumeInfo = volumeInfo;
    }

    /** 
     **/
    public java.util.UUID getVirtualVolumeID() { return this.virtualVolumeID; }
    public void setVirtualVolumeID(java.util.UUID virtualVolumeID) { 
        this.virtualVolumeID = virtualVolumeID;
    }
    /** 
     **/
    public java.util.UUID getParentVirtualVolumeID() { return this.parentVirtualVolumeID; }
    public void setParentVirtualVolumeID(java.util.UUID parentVirtualVolumeID) { 
        this.parentVirtualVolumeID = parentVirtualVolumeID;
    }
    /** 
     **/
    public java.util.UUID getStorageContainerID() { return this.storageContainerID; }
    public void setStorageContainerID(java.util.UUID storageContainerID) { 
        this.storageContainerID = storageContainerID;
    }
    /** 
     **/
    public StorageContainer getStorageContainer() { return this.storageContainer; }
    public void setStorageContainer(StorageContainer storageContainer) { 
        this.storageContainer = storageContainer;
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
    public java.util.UUID[] getChildren() { return this.children; }
    public void setChildren(java.util.UUID[] children) { 
        this.children = children;
    }
    /** 
     **/
    public java.util.Map<String, Object> getMetadata() { return this.metadata; }
    public void setMetadata(java.util.Map<String, Object> metadata) { 
        this.metadata = metadata;
    }
    /** 
     **/
    public Snapshot getSnapshotInfo() { return this.snapshotInfo; }
    public void setSnapshotInfo(Snapshot snapshotInfo) { 
        this.snapshotInfo = snapshotInfo;
    }
    /** 
     **/
    public Volume getVolumeInfo() { return this.volumeInfo; }
    public void setVolumeInfo(Volume volumeInfo) { 
        this.volumeInfo = volumeInfo;
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
            Objects.equals(storageContainer, that.storageContainer) && 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(snapshotID, that.snapshotID) && 
            Objects.equals(virtualVolumeType, that.virtualVolumeType) && 
            Objects.equals(status, that.status) && 
            Arrays.equals(bindings, that.bindings) && 
            Arrays.equals(children, that.children) && 
            Objects.equals(metadata, that.metadata) && 
            Objects.equals(snapshotInfo, that.snapshotInfo) && 
            Objects.equals(volumeInfo, that.volumeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeID,parentVirtualVolumeID,storageContainerID,storageContainer,volumeID,snapshotID,virtualVolumeType,status,(Object[])bindings,(Object[])children,metadata,snapshotInfo,volumeInfo );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeID", virtualVolumeID);
        map.put("parentVirtualVolumeID", parentVirtualVolumeID);
        map.put("storageContainerID", storageContainerID);
        map.put("storageContainer", storageContainer);
        map.put("volumeID", volumeID);
        map.put("snapshotID", snapshotID);
        map.put("virtualVolumeType", virtualVolumeType);
        map.put("status", status);
        map.put("bindings", bindings);
        map.put("children", children);
        map.put("metadata", metadata);
        map.put("snapshotInfo", snapshotInfo);
        map.put("volumeInfo", volumeInfo);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualVolumeID : ").append(virtualVolumeID).append(",");
        sb.append(" parentVirtualVolumeID : ").append(parentVirtualVolumeID).append(",");
        sb.append(" storageContainerID : ").append(storageContainerID).append(",");
        sb.append(" storageContainer : ").append(storageContainer).append(",");
        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" snapshotID : ").append(snapshotID).append(",");
        sb.append(" virtualVolumeType : ").append(virtualVolumeType).append(",");
        sb.append(" status : ").append(status).append(",");
        sb.append(" bindings : ").append(Arrays.toString(bindings)).append(",");
        sb.append(" children : ").append(Arrays.toString(children)).append(",");
        sb.append(" metadata : ").append(metadata).append(",");
        sb.append(" snapshotInfo : ").append(snapshotInfo).append(",");
        sb.append(" volumeInfo : ").append(volumeInfo).append(",");
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
        private java.util.UUID virtualVolumeID;
        private java.util.UUID parentVirtualVolumeID;
        private java.util.UUID storageContainerID;
        private StorageContainer storageContainer;
        private Long volumeID;
        private Long snapshotID;
        private String virtualVolumeType;
        private String status;
        private Long[] bindings;
        private java.util.UUID[] children;
        private java.util.Map<String, Object> metadata;
        private Snapshot snapshotInfo;
        private Volume volumeInfo;

        private Builder() { }

        public VirtualVolumeInfo build() {
            return new VirtualVolumeInfo (
                         this.virtualVolumeID,
                         this.parentVirtualVolumeID,
                         this.storageContainerID,
                         this.storageContainer,
                         this.volumeID,
                         this.snapshotID,
                         this.virtualVolumeType,
                         this.status,
                         this.bindings,
                         this.children,
                         this.metadata,
                         this.snapshotInfo,
                         this.volumeInfo);
        }

        private VirtualVolumeInfo.Builder buildFrom(final VirtualVolumeInfo req) {
            this.virtualVolumeID = req.virtualVolumeID;
            this.parentVirtualVolumeID = req.parentVirtualVolumeID;
            this.storageContainerID = req.storageContainerID;
            this.storageContainer = req.storageContainer;
            this.volumeID = req.volumeID;
            this.snapshotID = req.snapshotID;
            this.virtualVolumeType = req.virtualVolumeType;
            this.status = req.status;
            this.bindings = req.bindings;
            this.children = req.children;
            this.metadata = req.metadata;
            this.snapshotInfo = req.snapshotInfo;
            this.volumeInfo = req.volumeInfo;

            return this;
        }

        public VirtualVolumeInfo.Builder virtualVolumeID(final java.util.UUID virtualVolumeID) {
            this.virtualVolumeID = virtualVolumeID;
            return this;
        }

        public VirtualVolumeInfo.Builder parentVirtualVolumeID(final java.util.UUID parentVirtualVolumeID) {
            this.parentVirtualVolumeID = parentVirtualVolumeID;
            return this;
        }

        public VirtualVolumeInfo.Builder storageContainerID(final java.util.UUID storageContainerID) {
            this.storageContainerID = storageContainerID;
            return this;
        }

        public VirtualVolumeInfo.Builder storageContainer(final StorageContainer storageContainer) {
            this.storageContainer = storageContainer;
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

        public VirtualVolumeInfo.Builder children(final java.util.UUID[] children) {
            this.children = children;
            return this;
        }

        public VirtualVolumeInfo.Builder metadata(final java.util.Map<String, Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public VirtualVolumeInfo.Builder snapshotInfo(final Snapshot snapshotInfo) {
            this.snapshotInfo = snapshotInfo;
            return this;
        }

        public VirtualVolumeInfo.Builder volumeInfo(final Volume volumeInfo) {
            this.volumeInfo = volumeInfo;
            return this;
        }

    }
}
