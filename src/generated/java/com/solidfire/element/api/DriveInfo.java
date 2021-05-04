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
 * DriveInfo  
 **/

public class DriveInfo implements Serializable {

    public static final long serialVersionUID = -3414215038889344580L;
    @SerializedName("capacity") private Long capacity;
    @SerializedName("usableCapacity") private Long usableCapacity;
    @SerializedName("segmentFileSize") private Long segmentFileSize;
    @SerializedName("driveID") private Long driveID;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("serial") private String serial;
    @SerializedName("chassisSlot") private String chassisSlot;
    @SerializedName("slot") private Long slot;
    @SerializedName("status") private String status;
    @SerializedName("driveFailureDetail") private Optional<String> driveFailureDetail;
    @SerializedName("driveSecurityFaultReason") private Optional<String> driveSecurityFaultReason;
    @SerializedName("keyProviderID") private Optional<Long> keyProviderID;
    @SerializedName("keyID") private Optional<java.util.UUID> keyID;
    @SerializedName("type") private String type;
    @SerializedName("attributes") private Attributes attributes;
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
        Optional<String> driveFailureDetail,
        Optional<String> driveSecurityFaultReason,
        Optional<Long> keyProviderID,
        Optional<java.util.UUID> keyID,
        String type,
        Attributes attributes
    )
    {
        this.capacity = capacity;
        this.driveID = driveID;
        this.nodeID = nodeID;
        this.serial = serial;
        this.slot = slot;
        this.status = status;
        this.driveFailureDetail = (driveFailureDetail == null) ? Optional.<String>empty() : driveFailureDetail;
        this.driveSecurityFaultReason = (driveSecurityFaultReason == null) ? Optional.<String>empty() : driveSecurityFaultReason;
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
        this.keyID = (keyID == null) ? Optional.<java.util.UUID>empty() : keyID;
        this.type = type;
        this.attributes = attributes;
    }
    // parameterized constructor
    @Since("10.0")
    public DriveInfo(
        Long capacity,
        Long driveID,
        Long nodeID,
        String serial,
        String chassisSlot,
        Long slot,
        String status,
        Optional<String> driveFailureDetail,
        Optional<String> driveSecurityFaultReason,
        Optional<Long> keyProviderID,
        Optional<java.util.UUID> keyID,
        String type,
        Attributes attributes
    )
    {
        this.capacity = capacity;
        this.driveID = driveID;
        this.nodeID = nodeID;
        this.serial = serial;
        this.chassisSlot = chassisSlot;
        this.slot = slot;
        this.status = status;
        this.driveFailureDetail = (driveFailureDetail == null) ? Optional.<String>empty() : driveFailureDetail;
        this.driveSecurityFaultReason = (driveSecurityFaultReason == null) ? Optional.<String>empty() : driveSecurityFaultReason;
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
        this.keyID = (keyID == null) ? Optional.<java.util.UUID>empty() : keyID;
        this.type = type;
        this.attributes = attributes;
    }
    // parameterized constructor
    @Since("11.0")
    public DriveInfo(
        Long capacity,
        Long usableCapacity,
        Long segmentFileSize,
        Long driveID,
        Long nodeID,
        String serial,
        String chassisSlot,
        Long slot,
        String status,
        Optional<String> driveFailureDetail,
        Optional<String> driveSecurityFaultReason,
        Optional<Long> keyProviderID,
        Optional<java.util.UUID> keyID,
        String type,
        Attributes attributes
    )
    {
        this.capacity = capacity;
        this.usableCapacity = usableCapacity;
        this.segmentFileSize = segmentFileSize;
        this.driveID = driveID;
        this.nodeID = nodeID;
        this.serial = serial;
        this.chassisSlot = chassisSlot;
        this.slot = slot;
        this.status = status;
        this.driveFailureDetail = (driveFailureDetail == null) ? Optional.<String>empty() : driveFailureDetail;
        this.driveSecurityFaultReason = (driveSecurityFaultReason == null) ? Optional.<String>empty() : driveSecurityFaultReason;
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
        this.keyID = (keyID == null) ? Optional.<java.util.UUID>empty() : keyID;
        this.type = type;
        this.attributes = attributes;
    }

    /** 
     * Total Raw capacity of the drive, in bytes.
     **/
    public Long getCapacity() { return this.capacity; }
   
    public void setCapacity(Long capacity) { 
        this.capacity = capacity;
    }
    /** 
     * Total Usable capacity of the drive, in bytes.
     **/
    public Long getUsableCapacity() { return this.usableCapacity; }
   
    public void setUsableCapacity(Long usableCapacity) { 
        this.usableCapacity = usableCapacity;
    }
    /** 
     * Segment File Size of the drive, in bytes.
     **/
    public Long getSegmentFileSize() { return this.segmentFileSize; }
   
    public void setSegmentFileSize(Long segmentFileSize) { 
        this.segmentFileSize = segmentFileSize;
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
     * For HCI platforms, this value is the node letter and slot number in the server chassis where this drive is located.
     * For legacy platforms, the slot number is a string representation of the 'slot' integer.
     **/
    public String getChassisSlot() { return this.chassisSlot; }
   
    public void setChassisSlot(String chassisSlot) { 
        this.chassisSlot = chassisSlot;
    }
    /** 
     * Slot number in the server chassis where this drive is located, or -1 if SATADimm used for internal metadata drive.
     **/
    public Long getSlot() { return this.slot; }
   
    public void setSlot(Long slot) { 
        this.slot = slot;
    }
    /** 
     * 
     **/
    public String getStatus() { return this.status; }
   
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     * If a drive's status is 'Failed', this field provides more detail on why the drive was marked failed.
     **/
    public Optional<String> getDriveFailureDetail() { return this.driveFailureDetail; }
   
    public void setDriveFailureDetail(Optional<String> driveFailureDetail) { 
        this.driveFailureDetail = (driveFailureDetail == null) ? Optional.<String>empty() : driveFailureDetail;
    }
    /** 
     * If enabling or disabling drive security failed, this is the reason why it failed.
     * If the value is 'none', there was no failure.
     **/
    public Optional<String> getDriveSecurityFaultReason() { return this.driveSecurityFaultReason; }
   
    public void setDriveSecurityFaultReason(Optional<String> driveSecurityFaultReason) { 
        this.driveSecurityFaultReason = (driveSecurityFaultReason == null) ? Optional.<String>empty() : driveSecurityFaultReason;
    }
    /** 
     * Identifies the provider of the authentication key for unlocking this drive.
     **/
    public Optional<Long> getKeyProviderID() { return this.keyProviderID; }
   
    public void setKeyProviderID(Optional<Long> keyProviderID) { 
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
    }
    /** 
     * The keyID used by the key provider to acquire the authentication key for unlocking this drive.
     **/
    public Optional<java.util.UUID> getKeyID() { return this.keyID; }
   
    public void setKeyID(Optional<java.util.UUID> keyID) { 
        this.keyID = (keyID == null) ? Optional.<java.util.UUID>empty() : keyID;
    }
    /** 
     * 
     **/
    public String getType() { return this.type; }
   
    public void setType(String type) { 
        this.type = type;
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

        DriveInfo that = (DriveInfo) o;

        return 
            Objects.equals(capacity, that.capacity) && 
            Objects.equals(usableCapacity, that.usableCapacity) && 
            Objects.equals(segmentFileSize, that.segmentFileSize) && 
            Objects.equals(driveID, that.driveID) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(serial, that.serial) && 
            Objects.equals(chassisSlot, that.chassisSlot) && 
            Objects.equals(slot, that.slot) && 
            Objects.equals(status, that.status) && 
            Objects.equals(driveFailureDetail, that.driveFailureDetail) && 
            Objects.equals(driveSecurityFaultReason, that.driveSecurityFaultReason) && 
            Objects.equals(keyProviderID, that.keyProviderID) && 
            Objects.equals(keyID, that.keyID) && 
            Objects.equals(type, that.type) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( capacity,usableCapacity,segmentFileSize,driveID,nodeID,serial,chassisSlot,slot,status,driveFailureDetail,driveSecurityFaultReason,keyProviderID,keyID,type,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("capacity", capacity);
        map.put("usableCapacity", usableCapacity);
        map.put("segmentFileSize", segmentFileSize);
        map.put("driveID", driveID);
        map.put("nodeID", nodeID);
        map.put("serial", serial);
        map.put("chassisSlot", chassisSlot);
        map.put("slot", slot);
        map.put("status", status);
        map.put("driveFailureDetail", driveFailureDetail);
        map.put("driveSecurityFaultReason", driveSecurityFaultReason);
        map.put("keyProviderID", keyProviderID);
        map.put("keyID", keyID);
        map.put("type", type);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" capacity : ").append(gson.toJson(capacity)).append(",");
        sb.append(" usableCapacity : ").append(gson.toJson(usableCapacity)).append(",");
        sb.append(" segmentFileSize : ").append(gson.toJson(segmentFileSize)).append(",");
        sb.append(" driveID : ").append(gson.toJson(driveID)).append(",");
        sb.append(" nodeID : ").append(gson.toJson(nodeID)).append(",");
        sb.append(" serial : ").append(gson.toJson(serial)).append(",");
        sb.append(" chassisSlot : ").append(gson.toJson(chassisSlot)).append(",");
        sb.append(" slot : ").append(gson.toJson(slot)).append(",");
        sb.append(" status : ").append(gson.toJson(status)).append(",");
        if(null != driveFailureDetail && driveFailureDetail.isPresent()){
            sb.append(" driveFailureDetail : ").append(gson.toJson(driveFailureDetail)).append(",");
        }
        else{
            sb.append(" driveFailureDetail : ").append("null").append(",");
        }
        if(null != driveSecurityFaultReason && driveSecurityFaultReason.isPresent()){
            sb.append(" driveSecurityFaultReason : ").append(gson.toJson(driveSecurityFaultReason)).append(",");
        }
        else{
            sb.append(" driveSecurityFaultReason : ").append("null").append(",");
        }
        if(null != keyProviderID && keyProviderID.isPresent()){
            sb.append(" keyProviderID : ").append(gson.toJson(keyProviderID)).append(",");
        }
        else{
            sb.append(" keyProviderID : ").append("null").append(",");
        }
        if(null != keyID && keyID.isPresent()){
            sb.append(" keyID : ").append(gson.toJson(keyID)).append(",");
        }
        else{
            sb.append(" keyID : ").append("null").append(",");
        }
        sb.append(" type : ").append(gson.toJson(type)).append(",");
        sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
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
        private Long usableCapacity;
        private Long segmentFileSize;
        private Long driveID;
        private Long nodeID;
        private String serial;
        private String chassisSlot;
        private Long slot;
        private String status;
        private Optional<String> driveFailureDetail;
        private Optional<String> driveSecurityFaultReason;
        private Optional<Long> keyProviderID;
        private Optional<java.util.UUID> keyID;
        private String type;
        private Attributes attributes;

        private Builder() { }

        public DriveInfo build() {
            return new DriveInfo (
                         this.capacity,
                         this.usableCapacity,
                         this.segmentFileSize,
                         this.driveID,
                         this.nodeID,
                         this.serial,
                         this.chassisSlot,
                         this.slot,
                         this.status,
                         this.driveFailureDetail,
                         this.driveSecurityFaultReason,
                         this.keyProviderID,
                         this.keyID,
                         this.type,
                         this.attributes);
        }

        private DriveInfo.Builder buildFrom(final DriveInfo req) {
            this.capacity = req.capacity;
            this.usableCapacity = req.usableCapacity;
            this.segmentFileSize = req.segmentFileSize;
            this.driveID = req.driveID;
            this.nodeID = req.nodeID;
            this.serial = req.serial;
            this.chassisSlot = req.chassisSlot;
            this.slot = req.slot;
            this.status = req.status;
            this.driveFailureDetail = req.driveFailureDetail;
            this.driveSecurityFaultReason = req.driveSecurityFaultReason;
            this.keyProviderID = req.keyProviderID;
            this.keyID = req.keyID;
            this.type = req.type;
            this.attributes = req.attributes;

            return this;
        }

        public DriveInfo.Builder capacity(final Long capacity) {
            this.capacity = capacity;
            return this;
        }

        public DriveInfo.Builder usableCapacity(final Long usableCapacity) {
            this.usableCapacity = usableCapacity;
            return this;
        }

        public DriveInfo.Builder segmentFileSize(final Long segmentFileSize) {
            this.segmentFileSize = segmentFileSize;
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

        public DriveInfo.Builder chassisSlot(final String chassisSlot) {
            this.chassisSlot = chassisSlot;
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

        public DriveInfo.Builder optionalDriveFailureDetail(final String driveFailureDetail) {
            this.driveFailureDetail = (driveFailureDetail == null) ? Optional.<String>empty() : Optional.of(driveFailureDetail);
            return this;
        }

        public DriveInfo.Builder optionalDriveSecurityFaultReason(final String driveSecurityFaultReason) {
            this.driveSecurityFaultReason = (driveSecurityFaultReason == null) ? Optional.<String>empty() : Optional.of(driveSecurityFaultReason);
            return this;
        }

        public DriveInfo.Builder optionalKeyProviderID(final Long keyProviderID) {
            this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : Optional.of(keyProviderID);
            return this;
        }

        public DriveInfo.Builder optionalKeyID(final java.util.UUID keyID) {
            this.keyID = (keyID == null) ? Optional.<java.util.UUID>empty() : Optional.of(keyID);
            return this;
        }

        public DriveInfo.Builder type(final String type) {
            this.type = type;
            return this;
        }

        public DriveInfo.Builder attributes(final Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

    }
}
