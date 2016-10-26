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
public class VirtualVolumeInfo  implements Serializable  {

    private static final long serialVersionUID = -1843250825L;

    @SerializedName("virtualVolumeID") private java.util.UUID virtualVolumeID;
    @SerializedName("parentVirtualVolumeID") private java.util.UUID parentVirtualVolumeID;
    @SerializedName("storageContainerID") private java.util.UUID storageContainerID;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("snapshotID") private Long snapshotID;
    @SerializedName("virtualVolumeType") private String virtualVolumeType;
    @SerializedName("status") private String status;
    @SerializedName("bindings") private Long[] bindings;
    @SerializedName("children") private java.util.UUID[] children;
    @SerializedName("metadata") private java.util.Map<String, Object> metadata;

    /**
     * 
     * @param virtualVolumeID [required] 
     * @param parentVirtualVolumeID [required] 
     * @param storageContainerID [required] 
     * @param volumeID [required] 
     * @param snapshotID [required] 
     * @param virtualVolumeType [required] 
     * @param status [required] 
     * @param bindings [required] 
     * @param children [required] 
     * @param metadata [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public VirtualVolumeInfo(java.util.UUID virtualVolumeID, java.util.UUID parentVirtualVolumeID, java.util.UUID storageContainerID, Long volumeID, Long snapshotID, String virtualVolumeType, String status, Long[] bindings, java.util.UUID[] children, java.util.Map<String, Object> metadata) {
        this.parentVirtualVolumeID = parentVirtualVolumeID;
        this.children = children;
        this.storageContainerID = storageContainerID;
        this.bindings = bindings;
        this.virtualVolumeID = virtualVolumeID;
        this.status = status;
        this.metadata = metadata;
        this.volumeID = volumeID;
        this.virtualVolumeType = virtualVolumeType;
        this.snapshotID = snapshotID;
    }

    
    /**
     * 
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public VirtualVolumeInfo() {}

    public java.util.UUID getVirtualVolumeID() {
        return this.virtualVolumeID;
    }

    public void setVirtualVolumeID(java.util.UUID virtualVolumeID) {
        this.virtualVolumeID = virtualVolumeID;
    }


    public java.util.UUID getParentVirtualVolumeID() {
        return this.parentVirtualVolumeID;
    }

    public void setParentVirtualVolumeID(java.util.UUID parentVirtualVolumeID) {
        this.parentVirtualVolumeID = parentVirtualVolumeID;
    }


    public java.util.UUID getStorageContainerID() {
        return this.storageContainerID;
    }

    public void setStorageContainerID(java.util.UUID storageContainerID) {
        this.storageContainerID = storageContainerID;
    }


    public Long getVolumeID() {
        return this.volumeID;
    }

    public void setVolumeID(Long volumeID) {
        this.volumeID = volumeID;
    }


    public Long getSnapshotID() {
        return this.snapshotID;
    }

    public void setSnapshotID(Long snapshotID) {
        this.snapshotID = snapshotID;
    }


    public String getVirtualVolumeType() {
        return this.virtualVolumeType;
    }

    public void setVirtualVolumeType(String virtualVolumeType) {
        this.virtualVolumeType = virtualVolumeType;
    }


    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Long[] getBindings() {
        return this.bindings;
    }

    public void setBindings(Long[] bindings) {
        this.bindings = bindings;
    }


    public java.util.UUID[] getChildren() {
        return this.children;
    }

    public void setChildren(java.util.UUID[] children) {
        this.children = children;
    }


    public java.util.Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public void setMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualVolumeInfo that = (VirtualVolumeInfo) o;
        

        return Objects.equals( virtualVolumeID , that.virtualVolumeID )
            && Objects.equals( parentVirtualVolumeID , that.parentVirtualVolumeID )
            && Objects.equals( storageContainerID , that.storageContainerID )
            && Objects.equals( volumeID , that.volumeID )
            && Objects.equals( snapshotID , that.snapshotID )
            && Objects.equals( virtualVolumeType , that.virtualVolumeType )
            && Objects.equals( status , that.status )
            && Objects.deepEquals( bindings , that.bindings )
            && Objects.deepEquals( children , that.children )
            && Objects.equals( metadata , that.metadata );
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeID, parentVirtualVolumeID, storageContainerID, volumeID, snapshotID, virtualVolumeType, status, bindings, children, metadata );
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
        sb.append(" metadata : ").append(metadata);
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
        private Long volumeID;
        private Long snapshotID;
        private String virtualVolumeType;
        private String status;
        private Long[] bindings;
        private java.util.UUID[] children;
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
                         this.metadata            );
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

    }

}