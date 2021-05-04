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
 * Drive  
 **/

public class Drive implements Serializable {

    public static final long serialVersionUID = -725931006276895601L;
    @SerializedName("driveID") private Long driveID;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("assignedService") private Optional<Long> assignedService;
    @SerializedName("asyncResultIDs") private Long[] asyncResultIDs;
    @SerializedName("capacity") private Long capacity;
    @SerializedName("usableCapacity") private Long usableCapacity;
    @SerializedName("segmentFileSize") private Long segmentFileSize;
    @SerializedName("serial") private String serial;
    @SerializedName("slot") private Optional<Long> slot;
    @SerializedName("driveStatus") private String driveStatus;
    @SerializedName("driveFailureDetail") private Optional<String> driveFailureDetail;
    @SerializedName("driveSecurityFaultReason") private Optional<String> driveSecurityFaultReason;
    @SerializedName("keyProviderID") private Optional<Long> keyProviderID;
    @SerializedName("keyID") private Optional<java.util.UUID> keyID;
    @SerializedName("driveType") private String driveType;
    @SerializedName("reservedSliceFileCapacity") private Optional<Long> reservedSliceFileCapacity;
    @SerializedName("customerSliceFileCapacity") private Optional<Long> customerSliceFileCapacity;
    @SerializedName("smartSsdWriteCapable") private Optional<Boolean> smartSsdWriteCapable;
    @SerializedName("skipLabel") private Optional<Boolean> skipLabel;
    @SerializedName("attributes") private Attributes attributes;
    // empty constructor
    @Since("7.0")
    public Drive() {}

    
    // parameterized constructor
    @Since("7.0")
    public Drive(
        Long driveID,
        Long nodeID,
        Optional<Long> assignedService,
        Long[] asyncResultIDs,
        Long capacity,
        String serial,
        Optional<Long> slot,
        String driveStatus,
        Optional<String> driveFailureDetail,
        Optional<String> driveSecurityFaultReason,
        Optional<Long> keyProviderID,
        Optional<java.util.UUID> keyID,
        String driveType,
        Optional<Long> reservedSliceFileCapacity,
        Optional<Long> customerSliceFileCapacity,
        Optional<Boolean> smartSsdWriteCapable,
        Attributes attributes
    )
    {
        this.driveID = driveID;
        this.nodeID = nodeID;
        this.assignedService = (assignedService == null) ? Optional.<Long>empty() : assignedService;
        this.asyncResultIDs = asyncResultIDs;
        this.capacity = capacity;
        this.serial = serial;
        this.slot = (slot == null) ? Optional.<Long>empty() : slot;
        this.driveStatus = driveStatus;
        this.driveFailureDetail = (driveFailureDetail == null) ? Optional.<String>empty() : driveFailureDetail;
        this.driveSecurityFaultReason = (driveSecurityFaultReason == null) ? Optional.<String>empty() : driveSecurityFaultReason;
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
        this.keyID = (keyID == null) ? Optional.<java.util.UUID>empty() : keyID;
        this.driveType = driveType;
        this.reservedSliceFileCapacity = (reservedSliceFileCapacity == null) ? Optional.<Long>empty() : reservedSliceFileCapacity;
        this.customerSliceFileCapacity = (customerSliceFileCapacity == null) ? Optional.<Long>empty() : customerSliceFileCapacity;
        this.smartSsdWriteCapable = (smartSsdWriteCapable == null) ? Optional.<Boolean>empty() : smartSsdWriteCapable;
        this.attributes = attributes;
    }
    // parameterized constructor
    @Since("11.0")
    public Drive(
        Long driveID,
        Long nodeID,
        Optional<Long> assignedService,
        Long[] asyncResultIDs,
        Long capacity,
        Long usableCapacity,
        Long segmentFileSize,
        String serial,
        Optional<Long> slot,
        String driveStatus,
        Optional<String> driveFailureDetail,
        Optional<String> driveSecurityFaultReason,
        Optional<Long> keyProviderID,
        Optional<java.util.UUID> keyID,
        String driveType,
        Optional<Long> reservedSliceFileCapacity,
        Optional<Long> customerSliceFileCapacity,
        Optional<Boolean> smartSsdWriteCapable,
        Attributes attributes
    )
    {
        this.driveID = driveID;
        this.nodeID = nodeID;
        this.assignedService = (assignedService == null) ? Optional.<Long>empty() : assignedService;
        this.asyncResultIDs = asyncResultIDs;
        this.capacity = capacity;
        this.usableCapacity = usableCapacity;
        this.segmentFileSize = segmentFileSize;
        this.serial = serial;
        this.slot = (slot == null) ? Optional.<Long>empty() : slot;
        this.driveStatus = driveStatus;
        this.driveFailureDetail = (driveFailureDetail == null) ? Optional.<String>empty() : driveFailureDetail;
        this.driveSecurityFaultReason = (driveSecurityFaultReason == null) ? Optional.<String>empty() : driveSecurityFaultReason;
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
        this.keyID = (keyID == null) ? Optional.<java.util.UUID>empty() : keyID;
        this.driveType = driveType;
        this.reservedSliceFileCapacity = (reservedSliceFileCapacity == null) ? Optional.<Long>empty() : reservedSliceFileCapacity;
        this.customerSliceFileCapacity = (customerSliceFileCapacity == null) ? Optional.<Long>empty() : customerSliceFileCapacity;
        this.smartSsdWriteCapable = (smartSsdWriteCapable == null) ? Optional.<Boolean>empty() : smartSsdWriteCapable;
        this.attributes = attributes;
    }
    // parameterized constructor
    @Since("12.0")
    public Drive(
        Long driveID,
        Long nodeID,
        Optional<Long> assignedService,
        Long[] asyncResultIDs,
        Long capacity,
        Long usableCapacity,
        Long segmentFileSize,
        String serial,
        Optional<Long> slot,
        String driveStatus,
        Optional<String> driveFailureDetail,
        Optional<String> driveSecurityFaultReason,
        Optional<Long> keyProviderID,
        Optional<java.util.UUID> keyID,
        String driveType,
        Optional<Long> reservedSliceFileCapacity,
        Optional<Long> customerSliceFileCapacity,
        Optional<Boolean> smartSsdWriteCapable,
        Optional<Boolean> skipLabel,
        Attributes attributes
    )
    {
        this.driveID = driveID;
        this.nodeID = nodeID;
        this.assignedService = (assignedService == null) ? Optional.<Long>empty() : assignedService;
        this.asyncResultIDs = asyncResultIDs;
        this.capacity = capacity;
        this.usableCapacity = usableCapacity;
        this.segmentFileSize = segmentFileSize;
        this.serial = serial;
        this.slot = (slot == null) ? Optional.<Long>empty() : slot;
        this.driveStatus = driveStatus;
        this.driveFailureDetail = (driveFailureDetail == null) ? Optional.<String>empty() : driveFailureDetail;
        this.driveSecurityFaultReason = (driveSecurityFaultReason == null) ? Optional.<String>empty() : driveSecurityFaultReason;
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
        this.keyID = (keyID == null) ? Optional.<java.util.UUID>empty() : keyID;
        this.driveType = driveType;
        this.reservedSliceFileCapacity = (reservedSliceFileCapacity == null) ? Optional.<Long>empty() : reservedSliceFileCapacity;
        this.customerSliceFileCapacity = (customerSliceFileCapacity == null) ? Optional.<Long>empty() : customerSliceFileCapacity;
        this.smartSsdWriteCapable = (smartSsdWriteCapable == null) ? Optional.<Boolean>empty() : smartSsdWriteCapable;
        this.skipLabel = (skipLabel == null) ? Optional.<Boolean>empty() : skipLabel;
        this.attributes = attributes;
    }

    /** 
     * A unique identifier for this drive.
     **/
    public Long getDriveID() { return this.driveID; }
   
    public void setDriveID(Long driveID) { 
        this.driveID = driveID;
    }
    /** 
     * The node this drive is located.
     * If the drive has been physically removed from the node, this is where it was last seen.
     **/
    public Long getNodeID() { return this.nodeID; }
   
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     * If this drive is hosting a service, the identifier for that service.
     **/
    public Optional<Long> getAssignedService() { return this.assignedService; }
   
    public void setAssignedService(Optional<Long> assignedService) { 
        this.assignedService = (assignedService == null) ? Optional.<Long>empty() : assignedService;
    }
    /** 
     * The list of asynchronous jobs currently running on the drive (for example: a secure erase job).
     **/
    public Long[] getAsyncResultIDs() { return this.asyncResultIDs; }
   
    public void setAsyncResultIDs(Long[] asyncResultIDs) { 
        this.asyncResultIDs = asyncResultIDs;
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
     * The manufacturer's serial number for this drive.
     **/
    public String getSerial() { return this.serial; }
   
    public void setSerial(String serial) { 
        this.serial = serial;
    }
    /** 
     * Slot number in the server chassis where this drive is located.
     * If the drive has been physically removed from the node, this will not have a value.
     **/
    public Optional<Long> getSlot() { return this.slot; }
   
    public void setSlot(Optional<Long> slot) { 
        this.slot = (slot == null) ? Optional.<Long>empty() : slot;
    }
    /** 
     * The current status of this drive.
     **/
    public String getDriveStatus() { return this.driveStatus; }
   
    public void setDriveStatus(String driveStatus) { 
        this.driveStatus = driveStatus;
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
     * The type of this drive.
     **/
    public String getDriveType() { return this.driveType; }
   
    public void setDriveType(String driveType) { 
        this.driveType = driveType;
    }
    /** 
     * 
     **/
    public Optional<Long> getReservedSliceFileCapacity() { return this.reservedSliceFileCapacity; }
   
    public void setReservedSliceFileCapacity(Optional<Long> reservedSliceFileCapacity) { 
        this.reservedSliceFileCapacity = (reservedSliceFileCapacity == null) ? Optional.<Long>empty() : reservedSliceFileCapacity;
    }
    /** 
     * 
     **/
    public Optional<Long> getCustomerSliceFileCapacity() { return this.customerSliceFileCapacity; }
   
    public void setCustomerSliceFileCapacity(Optional<Long> customerSliceFileCapacity) { 
        this.customerSliceFileCapacity = (customerSliceFileCapacity == null) ? Optional.<Long>empty() : customerSliceFileCapacity;
    }
    /** 
     **/
    public Optional<Boolean> getSmartSsdWriteCapable() { return this.smartSsdWriteCapable; }
   
    public void setSmartSsdWriteCapable(Optional<Boolean> smartSsdWriteCapable) { 
        this.smartSsdWriteCapable = (smartSsdWriteCapable == null) ? Optional.<Boolean>empty() : smartSsdWriteCapable;
    }
    /** 
     * Whether or not Element software will avoid writing to LBA 0 of this drive.
     **/
    public Optional<Boolean> getSkipLabel() { return this.skipLabel; }
   
    public void setSkipLabel(Optional<Boolean> skipLabel) { 
        this.skipLabel = (skipLabel == null) ? Optional.<Boolean>empty() : skipLabel;
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

        Drive that = (Drive) o;

        return 
            Objects.equals(driveID, that.driveID) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(assignedService, that.assignedService) && 
            Arrays.equals(asyncResultIDs, that.asyncResultIDs) && 
            Objects.equals(capacity, that.capacity) && 
            Objects.equals(usableCapacity, that.usableCapacity) && 
            Objects.equals(segmentFileSize, that.segmentFileSize) && 
            Objects.equals(serial, that.serial) && 
            Objects.equals(slot, that.slot) && 
            Objects.equals(driveStatus, that.driveStatus) && 
            Objects.equals(driveFailureDetail, that.driveFailureDetail) && 
            Objects.equals(driveSecurityFaultReason, that.driveSecurityFaultReason) && 
            Objects.equals(keyProviderID, that.keyProviderID) && 
            Objects.equals(keyID, that.keyID) && 
            Objects.equals(driveType, that.driveType) && 
            Objects.equals(reservedSliceFileCapacity, that.reservedSliceFileCapacity) && 
            Objects.equals(customerSliceFileCapacity, that.customerSliceFileCapacity) && 
            Objects.equals(smartSsdWriteCapable, that.smartSsdWriteCapable) && 
            Objects.equals(skipLabel, that.skipLabel) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( driveID,nodeID,assignedService,(Object[])asyncResultIDs,capacity,usableCapacity,segmentFileSize,serial,slot,driveStatus,driveFailureDetail,driveSecurityFaultReason,keyProviderID,keyID,driveType,reservedSliceFileCapacity,customerSliceFileCapacity,smartSsdWriteCapable,skipLabel,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("driveID", driveID);
        map.put("nodeID", nodeID);
        map.put("assignedService", assignedService);
        map.put("asyncResultIDs", asyncResultIDs);
        map.put("capacity", capacity);
        map.put("usableCapacity", usableCapacity);
        map.put("segmentFileSize", segmentFileSize);
        map.put("serial", serial);
        map.put("slot", slot);
        map.put("driveStatus", driveStatus);
        map.put("driveFailureDetail", driveFailureDetail);
        map.put("driveSecurityFaultReason", driveSecurityFaultReason);
        map.put("keyProviderID", keyProviderID);
        map.put("keyID", keyID);
        map.put("driveType", driveType);
        map.put("reservedSliceFileCapacity", reservedSliceFileCapacity);
        map.put("customerSliceFileCapacity", customerSliceFileCapacity);
        map.put("smartSsdWriteCapable", smartSsdWriteCapable);
        map.put("skipLabel", skipLabel);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" driveID : ").append(gson.toJson(driveID)).append(",");
        sb.append(" nodeID : ").append(gson.toJson(nodeID)).append(",");
        if(null != assignedService && assignedService.isPresent()){
            sb.append(" assignedService : ").append(gson.toJson(assignedService)).append(",");
        }
        else{
            sb.append(" assignedService : ").append("null").append(",");
        }
        sb.append(" asyncResultIDs : ").append(gson.toJson(Arrays.toString(asyncResultIDs))).append(",");
        sb.append(" capacity : ").append(gson.toJson(capacity)).append(",");
        sb.append(" usableCapacity : ").append(gson.toJson(usableCapacity)).append(",");
        sb.append(" segmentFileSize : ").append(gson.toJson(segmentFileSize)).append(",");
        sb.append(" serial : ").append(gson.toJson(serial)).append(",");
        if(null != slot && slot.isPresent()){
            sb.append(" slot : ").append(gson.toJson(slot)).append(",");
        }
        else{
            sb.append(" slot : ").append("null").append(",");
        }
        sb.append(" driveStatus : ").append(gson.toJson(driveStatus)).append(",");
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
        sb.append(" driveType : ").append(gson.toJson(driveType)).append(",");
        if(null != reservedSliceFileCapacity && reservedSliceFileCapacity.isPresent()){
            sb.append(" reservedSliceFileCapacity : ").append(gson.toJson(reservedSliceFileCapacity)).append(",");
        }
        else{
            sb.append(" reservedSliceFileCapacity : ").append("null").append(",");
        }
        if(null != customerSliceFileCapacity && customerSliceFileCapacity.isPresent()){
            sb.append(" customerSliceFileCapacity : ").append(gson.toJson(customerSliceFileCapacity)).append(",");
        }
        else{
            sb.append(" customerSliceFileCapacity : ").append("null").append(",");
        }
        if(null != smartSsdWriteCapable && smartSsdWriteCapable.isPresent()){
            sb.append(" smartSsdWriteCapable : ").append(gson.toJson(smartSsdWriteCapable)).append(",");
        }
        else{
            sb.append(" smartSsdWriteCapable : ").append("null").append(",");
        }
        if(null != skipLabel && skipLabel.isPresent()){
            sb.append(" skipLabel : ").append(gson.toJson(skipLabel)).append(",");
        }
        else{
            sb.append(" skipLabel : ").append("null").append(",");
        }
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
        private Long driveID;
        private Long nodeID;
        private Optional<Long> assignedService;
        private Long[] asyncResultIDs;
        private Long capacity;
        private Long usableCapacity;
        private Long segmentFileSize;
        private String serial;
        private Optional<Long> slot;
        private String driveStatus;
        private Optional<String> driveFailureDetail;
        private Optional<String> driveSecurityFaultReason;
        private Optional<Long> keyProviderID;
        private Optional<java.util.UUID> keyID;
        private String driveType;
        private Optional<Long> reservedSliceFileCapacity;
        private Optional<Long> customerSliceFileCapacity;
        private Optional<Boolean> smartSsdWriteCapable;
        private Optional<Boolean> skipLabel;
        private Attributes attributes;

        private Builder() { }

        public Drive build() {
            return new Drive (
                         this.driveID,
                         this.nodeID,
                         this.assignedService,
                         this.asyncResultIDs,
                         this.capacity,
                         this.usableCapacity,
                         this.segmentFileSize,
                         this.serial,
                         this.slot,
                         this.driveStatus,
                         this.driveFailureDetail,
                         this.driveSecurityFaultReason,
                         this.keyProviderID,
                         this.keyID,
                         this.driveType,
                         this.reservedSliceFileCapacity,
                         this.customerSliceFileCapacity,
                         this.smartSsdWriteCapable,
                         this.skipLabel,
                         this.attributes);
        }

        private Drive.Builder buildFrom(final Drive req) {
            this.driveID = req.driveID;
            this.nodeID = req.nodeID;
            this.assignedService = req.assignedService;
            this.asyncResultIDs = req.asyncResultIDs;
            this.capacity = req.capacity;
            this.usableCapacity = req.usableCapacity;
            this.segmentFileSize = req.segmentFileSize;
            this.serial = req.serial;
            this.slot = req.slot;
            this.driveStatus = req.driveStatus;
            this.driveFailureDetail = req.driveFailureDetail;
            this.driveSecurityFaultReason = req.driveSecurityFaultReason;
            this.keyProviderID = req.keyProviderID;
            this.keyID = req.keyID;
            this.driveType = req.driveType;
            this.reservedSliceFileCapacity = req.reservedSliceFileCapacity;
            this.customerSliceFileCapacity = req.customerSliceFileCapacity;
            this.smartSsdWriteCapable = req.smartSsdWriteCapable;
            this.skipLabel = req.skipLabel;
            this.attributes = req.attributes;

            return this;
        }

        public Drive.Builder driveID(final Long driveID) {
            this.driveID = driveID;
            return this;
        }

        public Drive.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public Drive.Builder optionalAssignedService(final Long assignedService) {
            this.assignedService = (assignedService == null) ? Optional.<Long>empty() : Optional.of(assignedService);
            return this;
        }

        public Drive.Builder asyncResultIDs(final Long[] asyncResultIDs) {
            this.asyncResultIDs = asyncResultIDs;
            return this;
        }

        public Drive.Builder capacity(final Long capacity) {
            this.capacity = capacity;
            return this;
        }

        public Drive.Builder usableCapacity(final Long usableCapacity) {
            this.usableCapacity = usableCapacity;
            return this;
        }

        public Drive.Builder segmentFileSize(final Long segmentFileSize) {
            this.segmentFileSize = segmentFileSize;
            return this;
        }

        public Drive.Builder serial(final String serial) {
            this.serial = serial;
            return this;
        }

        public Drive.Builder optionalSlot(final Long slot) {
            this.slot = (slot == null) ? Optional.<Long>empty() : Optional.of(slot);
            return this;
        }

        public Drive.Builder driveStatus(final String driveStatus) {
            this.driveStatus = driveStatus;
            return this;
        }

        public Drive.Builder optionalDriveFailureDetail(final String driveFailureDetail) {
            this.driveFailureDetail = (driveFailureDetail == null) ? Optional.<String>empty() : Optional.of(driveFailureDetail);
            return this;
        }

        public Drive.Builder optionalDriveSecurityFaultReason(final String driveSecurityFaultReason) {
            this.driveSecurityFaultReason = (driveSecurityFaultReason == null) ? Optional.<String>empty() : Optional.of(driveSecurityFaultReason);
            return this;
        }

        public Drive.Builder optionalKeyProviderID(final Long keyProviderID) {
            this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : Optional.of(keyProviderID);
            return this;
        }

        public Drive.Builder optionalKeyID(final java.util.UUID keyID) {
            this.keyID = (keyID == null) ? Optional.<java.util.UUID>empty() : Optional.of(keyID);
            return this;
        }

        public Drive.Builder driveType(final String driveType) {
            this.driveType = driveType;
            return this;
        }

        public Drive.Builder optionalReservedSliceFileCapacity(final Long reservedSliceFileCapacity) {
            this.reservedSliceFileCapacity = (reservedSliceFileCapacity == null) ? Optional.<Long>empty() : Optional.of(reservedSliceFileCapacity);
            return this;
        }

        public Drive.Builder optionalCustomerSliceFileCapacity(final Long customerSliceFileCapacity) {
            this.customerSliceFileCapacity = (customerSliceFileCapacity == null) ? Optional.<Long>empty() : Optional.of(customerSliceFileCapacity);
            return this;
        }

        public Drive.Builder optionalSmartSsdWriteCapable(final Boolean smartSsdWriteCapable) {
            this.smartSsdWriteCapable = (smartSsdWriteCapable == null) ? Optional.<Boolean>empty() : Optional.of(smartSsdWriteCapable);
            return this;
        }

        public Drive.Builder optionalSkipLabel(final Boolean skipLabel) {
            this.skipLabel = (skipLabel == null) ? Optional.<Boolean>empty() : Optional.of(skipLabel);
            return this;
        }

        public Drive.Builder attributes(final Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

    }
}
