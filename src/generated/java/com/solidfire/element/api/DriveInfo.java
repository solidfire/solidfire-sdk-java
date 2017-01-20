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
 * DriveInfo  
 **/

public class DriveInfo implements Serializable {

    public static final long serialVersionUID = -673542924153888415L;
    @SerializedName("capacity") private Long capacity;
    @SerializedName("driveID") private Long driveID;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("serial") private String serial;
    @SerializedName("slot") private Long slot;
    @SerializedName("status") private String status;
    @SerializedName("type") private String type;
    @SerializedName("attributes") private java.util.Map<String, Object> attributes;

    // empty constructor
    @Since("7.0")
    public DriveInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public DriveInfo(
        Long capacity,
        Long driveID,
        Long nodeID,
        String serial,
        Long slot,
        String status,
        String type,
        java.util.Map<String, Object> attributes
    )
    {
        this.capacity = capacity;
        this.driveID = driveID;
        this.nodeID = nodeID;
        this.serial = serial;
        this.slot = slot;
        this.status = status;
        this.type = type;
        this.attributes = attributes;
    }

    /** 
     * Total capacity of the drive, in bytes.
     **/
    public Long getCapacity() { return this.capacity; }
    public void setCapacity(Long capacity) { 
        this.capacity = capacity;
    }
    /** 
     * DriveID for this drive.
     **/
    public Long getDriveID() { return this.driveID; }
    public void setDriveID(Long driveID) { 
        this.driveID = driveID;
    }
    /** 
     * NodeID where this drive is located.
     **/
    public Long getNodeID() { return this.nodeID; }
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     * Drive serial number.
     **/
    public String getSerial() { return this.serial; }
    public void setSerial(String serial) { 
        this.serial = serial;
    }
    /** 
     * Slot number in the server chassis where this drive is located, or -1 if SATADimm used for internal metadata drive.
     **/
    public Long getSlot() { return this.slot; }
    public void setSlot(Long slot) { 
        this.slot = slot;
    }
    /** 
     **/
    public String getStatus() { return this.status; }
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     **/
    public String getType() { return this.type; }
    public void setType(String type) { 
        this.type = type;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public java.util.Map<String, Object> getAttributes() { return this.attributes; }
    public void setAttributes(java.util.Map<String, Object> attributes) { 
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriveInfo that = (DriveInfo) o;

        return 
            Objects.equals(capacity, that.capacity) && 
            Objects.equals(driveID, that.driveID) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(serial, that.serial) && 
            Objects.equals(slot, that.slot) && 
            Objects.equals(status, that.status) && 
            Objects.equals(type, that.type) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( capacity,driveID,nodeID,serial,slot,status,type,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("capacity", capacity);
        map.put("driveID", driveID);
        map.put("nodeID", nodeID);
        map.put("serial", serial);
        map.put("slot", slot);
        map.put("status", status);
        map.put("type", type);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" capacity : ").append(capacity).append(",");
        sb.append(" driveID : ").append(driveID).append(",");
        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" serial : ").append(serial).append(",");
        sb.append(" slot : ").append(slot).append(",");
        sb.append(" status : ").append(status).append(",");
        sb.append(" type : ").append(type).append(",");
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
        private Long capacity;
        private Long driveID;
        private Long nodeID;
        private String serial;
        private Long slot;
        private String status;
        private String type;
        private java.util.Map<String, Object> attributes;

        private Builder() { }

        public DriveInfo build() {
            return new DriveInfo (
                         this.capacity,
                         this.driveID,
                         this.nodeID,
                         this.serial,
                         this.slot,
                         this.status,
                         this.type,
                         this.attributes);
        }

        private DriveInfo.Builder buildFrom(final DriveInfo req) {
            this.capacity = req.capacity;
            this.driveID = req.driveID;
            this.nodeID = req.nodeID;
            this.serial = req.serial;
            this.slot = req.slot;
            this.status = req.status;
            this.type = req.type;
            this.attributes = req.attributes;

            return this;
        }

        public DriveInfo.Builder capacity(final Long capacity) {
            this.capacity = capacity;
            return this;
        }

        public DriveInfo.Builder driveID(final Long driveID) {
            this.driveID = driveID;
            return this;
        }

        public DriveInfo.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public DriveInfo.Builder serial(final String serial) {
            this.serial = serial;
            return this;
        }

        public DriveInfo.Builder slot(final Long slot) {
            this.slot = slot;
            return this;
        }

        public DriveInfo.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public DriveInfo.Builder type(final String type) {
            this.type = type;
            return this;
        }

        public DriveInfo.Builder attributes(final java.util.Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

    }
}
