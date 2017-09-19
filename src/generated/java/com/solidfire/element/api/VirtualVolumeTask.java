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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * VirtualVolumeTask  
 **/

public class VirtualVolumeTask implements Serializable {

    public static final long serialVersionUID = 6792984935426811173L;
    @SerializedName("virtualVolumeTaskID") private java.util.UUID virtualVolumeTaskID;
    @SerializedName("virtualvolumeID") private java.util.UUID virtualvolumeID;
    @SerializedName("cloneVirtualVolumeID") private java.util.UUID cloneVirtualVolumeID;
    @SerializedName("status") private String status;
    @SerializedName("operation") private String operation;
    @SerializedName("virtualVolumeHostID") private java.util.UUID virtualVolumeHostID;
    @SerializedName("parentMetadata") private Attributes parentMetadata;
    @SerializedName("parentTotalSize") private Long parentTotalSize;
    @SerializedName("parentUsedSize") private Long parentUsedSize;
    @SerializedName("cancelled") private Boolean cancelled;
    // empty constructor
    @Since("7.0")
    public VirtualVolumeTask() {}

    
    // parameterized constructor
    @Since("7.0")
    public VirtualVolumeTask(
        java.util.UUID virtualVolumeTaskID,
        java.util.UUID virtualvolumeID,
        java.util.UUID cloneVirtualVolumeID,
        String status,
        String operation,
        java.util.UUID virtualVolumeHostID,
        Attributes parentMetadata,
        Long parentTotalSize,
        Long parentUsedSize,
        Boolean cancelled
    )
    {
        this.virtualVolumeTaskID = virtualVolumeTaskID;
        this.virtualvolumeID = virtualvolumeID;
        this.cloneVirtualVolumeID = cloneVirtualVolumeID;
        this.status = status;
        this.operation = operation;
        this.virtualVolumeHostID = virtualVolumeHostID;
        this.parentMetadata = parentMetadata;
        this.parentTotalSize = parentTotalSize;
        this.parentUsedSize = parentUsedSize;
        this.cancelled = cancelled;
    }

    /** 
     * 
     **/
    public java.util.UUID getVirtualVolumeTaskID() { return this.virtualVolumeTaskID; }
   
    public void setVirtualVolumeTaskID(java.util.UUID virtualVolumeTaskID) { 
        this.virtualVolumeTaskID = virtualVolumeTaskID;
    }
    /** 
     * 
     **/
    public java.util.UUID getVirtualvolumeID() { return this.virtualvolumeID; }
   
    public void setVirtualvolumeID(java.util.UUID virtualvolumeID) { 
        this.virtualvolumeID = virtualvolumeID;
    }
    /** 
     * 
     **/
    public java.util.UUID getCloneVirtualVolumeID() { return this.cloneVirtualVolumeID; }
   
    public void setCloneVirtualVolumeID(java.util.UUID cloneVirtualVolumeID) { 
        this.cloneVirtualVolumeID = cloneVirtualVolumeID;
    }
    /** 
     * 
     **/
    public String getStatus() { return this.status; }
   
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     * 
     **/
    public String getOperation() { return this.operation; }
   
    public void setOperation(String operation) { 
        this.operation = operation;
    }
    /** 
     * 
     **/
    public java.util.UUID getVirtualVolumeHostID() { return this.virtualVolumeHostID; }
   
    public void setVirtualVolumeHostID(java.util.UUID virtualVolumeHostID) { 
        this.virtualVolumeHostID = virtualVolumeHostID;
    }
    /** 
     * 
     **/
    public Attributes getParentMetadata() { return this.parentMetadata; }
   
    public void setParentMetadata(Attributes parentMetadata) { 
        this.parentMetadata = parentMetadata;
    }
    /** 
     * 
     **/
    public Long getParentTotalSize() { return this.parentTotalSize; }
   
    public void setParentTotalSize(Long parentTotalSize) { 
        this.parentTotalSize = parentTotalSize;
    }
    /** 
     * 
     **/
    public Long getParentUsedSize() { return this.parentUsedSize; }
   
    public void setParentUsedSize(Long parentUsedSize) { 
        this.parentUsedSize = parentUsedSize;
    }
    /** 
     * 
     **/
    public Boolean getCancelled() { return this.cancelled; }
   
    public void setCancelled(Boolean cancelled) { 
        this.cancelled = cancelled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualVolumeTask that = (VirtualVolumeTask) o;

        return 
            Objects.equals(virtualVolumeTaskID, that.virtualVolumeTaskID) && 
            Objects.equals(virtualvolumeID, that.virtualvolumeID) && 
            Objects.equals(cloneVirtualVolumeID, that.cloneVirtualVolumeID) && 
            Objects.equals(status, that.status) && 
            Objects.equals(operation, that.operation) && 
            Objects.equals(virtualVolumeHostID, that.virtualVolumeHostID) && 
            Objects.equals(parentMetadata, that.parentMetadata) && 
            Objects.equals(parentTotalSize, that.parentTotalSize) && 
            Objects.equals(parentUsedSize, that.parentUsedSize) && 
            Objects.equals(cancelled, that.cancelled);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeTaskID,virtualvolumeID,cloneVirtualVolumeID,status,operation,virtualVolumeHostID,parentMetadata,parentTotalSize,parentUsedSize,cancelled );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeTaskID", virtualVolumeTaskID);
        map.put("virtualvolumeID", virtualvolumeID);
        map.put("cloneVirtualVolumeID", cloneVirtualVolumeID);
        map.put("status", status);
        map.put("operation", operation);
        map.put("virtualVolumeHostID", virtualVolumeHostID);
        map.put("parentMetadata", parentMetadata);
        map.put("parentTotalSize", parentTotalSize);
        map.put("parentUsedSize", parentUsedSize);
        map.put("cancelled", cancelled);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" virtualVolumeTaskID : ").append(gson.toJson(virtualVolumeTaskID)).append(",");
        sb.append(" virtualvolumeID : ").append(gson.toJson(virtualvolumeID)).append(",");
        sb.append(" cloneVirtualVolumeID : ").append(gson.toJson(cloneVirtualVolumeID)).append(",");
        sb.append(" status : ").append(gson.toJson(status)).append(",");
        sb.append(" operation : ").append(gson.toJson(operation)).append(",");
        sb.append(" virtualVolumeHostID : ").append(gson.toJson(virtualVolumeHostID)).append(",");
        sb.append(" parentMetadata : ").append(gson.toJson(parentMetadata)).append(",");
        sb.append(" parentTotalSize : ").append(gson.toJson(parentTotalSize)).append(",");
        sb.append(" parentUsedSize : ").append(gson.toJson(parentUsedSize)).append(",");
        sb.append(" cancelled : ").append(gson.toJson(cancelled)).append(",");
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
        private java.util.UUID virtualVolumeTaskID;
        private java.util.UUID virtualvolumeID;
        private java.util.UUID cloneVirtualVolumeID;
        private String status;
        private String operation;
        private java.util.UUID virtualVolumeHostID;
        private Attributes parentMetadata;
        private Long parentTotalSize;
        private Long parentUsedSize;
        private Boolean cancelled;

        private Builder() { }

        public VirtualVolumeTask build() {
            return new VirtualVolumeTask (
                         this.virtualVolumeTaskID,
                         this.virtualvolumeID,
                         this.cloneVirtualVolumeID,
                         this.status,
                         this.operation,
                         this.virtualVolumeHostID,
                         this.parentMetadata,
                         this.parentTotalSize,
                         this.parentUsedSize,
                         this.cancelled);
        }

        private VirtualVolumeTask.Builder buildFrom(final VirtualVolumeTask req) {
            this.virtualVolumeTaskID = req.virtualVolumeTaskID;
            this.virtualvolumeID = req.virtualvolumeID;
            this.cloneVirtualVolumeID = req.cloneVirtualVolumeID;
            this.status = req.status;
            this.operation = req.operation;
            this.virtualVolumeHostID = req.virtualVolumeHostID;
            this.parentMetadata = req.parentMetadata;
            this.parentTotalSize = req.parentTotalSize;
            this.parentUsedSize = req.parentUsedSize;
            this.cancelled = req.cancelled;

            return this;
        }

        public VirtualVolumeTask.Builder virtualVolumeTaskID(final java.util.UUID virtualVolumeTaskID) {
            this.virtualVolumeTaskID = virtualVolumeTaskID;
            return this;
        }

        public VirtualVolumeTask.Builder virtualvolumeID(final java.util.UUID virtualvolumeID) {
            this.virtualvolumeID = virtualvolumeID;
            return this;
        }

        public VirtualVolumeTask.Builder cloneVirtualVolumeID(final java.util.UUID cloneVirtualVolumeID) {
            this.cloneVirtualVolumeID = cloneVirtualVolumeID;
            return this;
        }

        public VirtualVolumeTask.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public VirtualVolumeTask.Builder operation(final String operation) {
            this.operation = operation;
            return this;
        }

        public VirtualVolumeTask.Builder virtualVolumeHostID(final java.util.UUID virtualVolumeHostID) {
            this.virtualVolumeHostID = virtualVolumeHostID;
            return this;
        }

        public VirtualVolumeTask.Builder parentMetadata(final Attributes parentMetadata) {
            this.parentMetadata = parentMetadata;
            return this;
        }

        public VirtualVolumeTask.Builder parentTotalSize(final Long parentTotalSize) {
            this.parentTotalSize = parentTotalSize;
            return this;
        }

        public VirtualVolumeTask.Builder parentUsedSize(final Long parentUsedSize) {
            this.parentUsedSize = parentUsedSize;
            return this;
        }

        public VirtualVolumeTask.Builder cancelled(final Boolean cancelled) {
            this.cancelled = cancelled;
            return this;
        }

    }
}
