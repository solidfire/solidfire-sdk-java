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
 * DriveStats  
 **/

public class DriveStats implements Serializable {

    public static final long serialVersionUID = 215354036034394227L;
    @SerializedName("activeSessions") private Optional<Long> activeSessions;
    @SerializedName("driveID") private Optional<Long> driveID;
    @SerializedName("failedDieCount") private Long failedDieCount;
    @SerializedName("lifeRemainingPercent") private Long lifeRemainingPercent;
    @SerializedName("lifetimeReadBytes") private Long lifetimeReadBytes;
    @SerializedName("lifetimeWriteBytes") private Long lifetimeWriteBytes;
    @SerializedName("powerOnHours") private Long powerOnHours;
    @SerializedName("readBytes") private Long readBytes;
    @SerializedName("readOps") private Long readOps;
    @SerializedName("reallocatedSectors") private Long reallocatedSectors;
    @SerializedName("reserveCapacityPercent") private Long reserveCapacityPercent;
    @SerializedName("timestamp") private String timestamp;
    @SerializedName("totalCapacity") private Long totalCapacity;
    @SerializedName("usedCapacity") private Optional<Long> usedCapacity;
    @SerializedName("usedMemory") private Long usedMemory;
    @SerializedName("writeBytes") private Long writeBytes;
    @SerializedName("writeOps") private Long writeOps;

    // empty constructor
    @Since("7.0")
    public DriveStats() {}

    
    // parameterized constructor
    @Since("7.0")
    public DriveStats(
        Optional<Long> activeSessions,
        Optional<Long> driveID,
        Long failedDieCount,
        Long lifeRemainingPercent,
        Long lifetimeReadBytes,
        Long lifetimeWriteBytes,
        Long powerOnHours,
        Long readBytes,
        Long readOps,
        Long reallocatedSectors,
        Long reserveCapacityPercent,
        String timestamp,
        Long totalCapacity,
        Optional<Long> usedCapacity,
        Long usedMemory,
        Long writeBytes,
        Long writeOps
    )
    {
        this.activeSessions = (activeSessions == null) ? Optional.<Long>empty() : activeSessions;
        this.driveID = (driveID == null) ? Optional.<Long>empty() : driveID;
        this.failedDieCount = failedDieCount;
        this.lifeRemainingPercent = lifeRemainingPercent;
        this.lifetimeReadBytes = lifetimeReadBytes;
        this.lifetimeWriteBytes = lifetimeWriteBytes;
        this.powerOnHours = powerOnHours;
        this.readBytes = readBytes;
        this.readOps = readOps;
        this.reallocatedSectors = reallocatedSectors;
        this.reserveCapacityPercent = reserveCapacityPercent;
        this.timestamp = timestamp;
        this.totalCapacity = totalCapacity;
        this.usedCapacity = (usedCapacity == null) ? Optional.<Long>empty() : usedCapacity;
        this.usedMemory = usedMemory;
        this.writeBytes = writeBytes;
        this.writeOps = writeOps;
    }

    /** 
     **/
    public Optional<Long> getActiveSessions() { return this.activeSessions; }
    public void setActiveSessions(Optional<Long> activeSessions) { 
        this.activeSessions = (activeSessions == null) ? Optional.<Long>empty() : activeSessions;
    }
    /** 
     **/
    public Optional<Long> getDriveID() { return this.driveID; }
    public void setDriveID(Optional<Long> driveID) { 
        this.driveID = (driveID == null) ? Optional.<Long>empty() : driveID;
    }
    /** 
     **/
    public Long getFailedDieCount() { return this.failedDieCount; }
    public void setFailedDieCount(Long failedDieCount) { 
        this.failedDieCount = failedDieCount;
    }
    /** 
     **/
    public Long getLifeRemainingPercent() { return this.lifeRemainingPercent; }
    public void setLifeRemainingPercent(Long lifeRemainingPercent) { 
        this.lifeRemainingPercent = lifeRemainingPercent;
    }
    /** 
     **/
    public Long getLifetimeReadBytes() { return this.lifetimeReadBytes; }
    public void setLifetimeReadBytes(Long lifetimeReadBytes) { 
        this.lifetimeReadBytes = lifetimeReadBytes;
    }
    /** 
     **/
    public Long getLifetimeWriteBytes() { return this.lifetimeWriteBytes; }
    public void setLifetimeWriteBytes(Long lifetimeWriteBytes) { 
        this.lifetimeWriteBytes = lifetimeWriteBytes;
    }
    /** 
     **/
    public Long getPowerOnHours() { return this.powerOnHours; }
    public void setPowerOnHours(Long powerOnHours) { 
        this.powerOnHours = powerOnHours;
    }
    /** 
     **/
    public Long getReadBytes() { return this.readBytes; }
    public void setReadBytes(Long readBytes) { 
        this.readBytes = readBytes;
    }
    /** 
     **/
    public Long getReadOps() { return this.readOps; }
    public void setReadOps(Long readOps) { 
        this.readOps = readOps;
    }
    /** 
     **/
    public Long getReallocatedSectors() { return this.reallocatedSectors; }
    public void setReallocatedSectors(Long reallocatedSectors) { 
        this.reallocatedSectors = reallocatedSectors;
    }
    /** 
     **/
    public Long getReserveCapacityPercent() { return this.reserveCapacityPercent; }
    public void setReserveCapacityPercent(Long reserveCapacityPercent) { 
        this.reserveCapacityPercent = reserveCapacityPercent;
    }
    /** 
     **/
    public String getTimestamp() { return this.timestamp; }
    public void setTimestamp(String timestamp) { 
        this.timestamp = timestamp;
    }
    /** 
     **/
    public Long getTotalCapacity() { return this.totalCapacity; }
    public void setTotalCapacity(Long totalCapacity) { 
        this.totalCapacity = totalCapacity;
    }
    /** 
     **/
    public Optional<Long> getUsedCapacity() { return this.usedCapacity; }
    public void setUsedCapacity(Optional<Long> usedCapacity) { 
        this.usedCapacity = (usedCapacity == null) ? Optional.<Long>empty() : usedCapacity;
    }
    /** 
     **/
    public Long getUsedMemory() { return this.usedMemory; }
    public void setUsedMemory(Long usedMemory) { 
        this.usedMemory = usedMemory;
    }
    /** 
     **/
    public Long getWriteBytes() { return this.writeBytes; }
    public void setWriteBytes(Long writeBytes) { 
        this.writeBytes = writeBytes;
    }
    /** 
     **/
    public Long getWriteOps() { return this.writeOps; }
    public void setWriteOps(Long writeOps) { 
        this.writeOps = writeOps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriveStats that = (DriveStats) o;

        return 
            Objects.equals(activeSessions, that.activeSessions) && 
            Objects.equals(driveID, that.driveID) && 
            Objects.equals(failedDieCount, that.failedDieCount) && 
            Objects.equals(lifeRemainingPercent, that.lifeRemainingPercent) && 
            Objects.equals(lifetimeReadBytes, that.lifetimeReadBytes) && 
            Objects.equals(lifetimeWriteBytes, that.lifetimeWriteBytes) && 
            Objects.equals(powerOnHours, that.powerOnHours) && 
            Objects.equals(readBytes, that.readBytes) && 
            Objects.equals(readOps, that.readOps) && 
            Objects.equals(reallocatedSectors, that.reallocatedSectors) && 
            Objects.equals(reserveCapacityPercent, that.reserveCapacityPercent) && 
            Objects.equals(timestamp, that.timestamp) && 
            Objects.equals(totalCapacity, that.totalCapacity) && 
            Objects.equals(usedCapacity, that.usedCapacity) && 
            Objects.equals(usedMemory, that.usedMemory) && 
            Objects.equals(writeBytes, that.writeBytes) && 
            Objects.equals(writeOps, that.writeOps);
    }

    @Override
    public int hashCode() {
        return Objects.hash( activeSessions,driveID,failedDieCount,lifeRemainingPercent,lifetimeReadBytes,lifetimeWriteBytes,powerOnHours,readBytes,readOps,reallocatedSectors,reserveCapacityPercent,timestamp,totalCapacity,usedCapacity,usedMemory,writeBytes,writeOps );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("activeSessions", activeSessions);
        map.put("driveID", driveID);
        map.put("failedDieCount", failedDieCount);
        map.put("lifeRemainingPercent", lifeRemainingPercent);
        map.put("lifetimeReadBytes", lifetimeReadBytes);
        map.put("lifetimeWriteBytes", lifetimeWriteBytes);
        map.put("powerOnHours", powerOnHours);
        map.put("readBytes", readBytes);
        map.put("readOps", readOps);
        map.put("reallocatedSectors", reallocatedSectors);
        map.put("reserveCapacityPercent", reserveCapacityPercent);
        map.put("timestamp", timestamp);
        map.put("totalCapacity", totalCapacity);
        map.put("usedCapacity", usedCapacity);
        map.put("usedMemory", usedMemory);
        map.put("writeBytes", writeBytes);
        map.put("writeOps", writeOps);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != activeSessions && activeSessions.isPresent()){
            sb.append(" activeSessions : ").append(activeSessions).append(",");
        }
        if(null != driveID && driveID.isPresent()){
            sb.append(" driveID : ").append(driveID).append(",");
        }
        sb.append(" failedDieCount : ").append(failedDieCount).append(",");
        sb.append(" lifeRemainingPercent : ").append(lifeRemainingPercent).append(",");
        sb.append(" lifetimeReadBytes : ").append(lifetimeReadBytes).append(",");
        sb.append(" lifetimeWriteBytes : ").append(lifetimeWriteBytes).append(",");
        sb.append(" powerOnHours : ").append(powerOnHours).append(",");
        sb.append(" readBytes : ").append(readBytes).append(",");
        sb.append(" readOps : ").append(readOps).append(",");
        sb.append(" reallocatedSectors : ").append(reallocatedSectors).append(",");
        sb.append(" reserveCapacityPercent : ").append(reserveCapacityPercent).append(",");
        sb.append(" timestamp : ").append(timestamp).append(",");
        sb.append(" totalCapacity : ").append(totalCapacity).append(",");
        if(null != usedCapacity && usedCapacity.isPresent()){
            sb.append(" usedCapacity : ").append(usedCapacity).append(",");
        }
        sb.append(" usedMemory : ").append(usedMemory).append(",");
        sb.append(" writeBytes : ").append(writeBytes).append(",");
        sb.append(" writeOps : ").append(writeOps).append(",");
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
        private Optional<Long> activeSessions;
        private Optional<Long> driveID;
        private Long failedDieCount;
        private Long lifeRemainingPercent;
        private Long lifetimeReadBytes;
        private Long lifetimeWriteBytes;
        private Long powerOnHours;
        private Long readBytes;
        private Long readOps;
        private Long reallocatedSectors;
        private Long reserveCapacityPercent;
        private String timestamp;
        private Long totalCapacity;
        private Optional<Long> usedCapacity;
        private Long usedMemory;
        private Long writeBytes;
        private Long writeOps;

        private Builder() { }

        public DriveStats build() {
            return new DriveStats (
                         this.activeSessions,
                         this.driveID,
                         this.failedDieCount,
                         this.lifeRemainingPercent,
                         this.lifetimeReadBytes,
                         this.lifetimeWriteBytes,
                         this.powerOnHours,
                         this.readBytes,
                         this.readOps,
                         this.reallocatedSectors,
                         this.reserveCapacityPercent,
                         this.timestamp,
                         this.totalCapacity,
                         this.usedCapacity,
                         this.usedMemory,
                         this.writeBytes,
                         this.writeOps);
        }

        private DriveStats.Builder buildFrom(final DriveStats req) {
            this.activeSessions = req.activeSessions;
            this.driveID = req.driveID;
            this.failedDieCount = req.failedDieCount;
            this.lifeRemainingPercent = req.lifeRemainingPercent;
            this.lifetimeReadBytes = req.lifetimeReadBytes;
            this.lifetimeWriteBytes = req.lifetimeWriteBytes;
            this.powerOnHours = req.powerOnHours;
            this.readBytes = req.readBytes;
            this.readOps = req.readOps;
            this.reallocatedSectors = req.reallocatedSectors;
            this.reserveCapacityPercent = req.reserveCapacityPercent;
            this.timestamp = req.timestamp;
            this.totalCapacity = req.totalCapacity;
            this.usedCapacity = req.usedCapacity;
            this.usedMemory = req.usedMemory;
            this.writeBytes = req.writeBytes;
            this.writeOps = req.writeOps;

            return this;
        }

        public DriveStats.Builder optionalActiveSessions(final Long activeSessions) {
            this.activeSessions = (activeSessions == null) ? Optional.<Long>empty() : Optional.of(activeSessions);
            return this;
        }

        public DriveStats.Builder optionalDriveID(final Long driveID) {
            this.driveID = (driveID == null) ? Optional.<Long>empty() : Optional.of(driveID);
            return this;
        }

        public DriveStats.Builder failedDieCount(final Long failedDieCount) {
            this.failedDieCount = failedDieCount;
            return this;
        }

        public DriveStats.Builder lifeRemainingPercent(final Long lifeRemainingPercent) {
            this.lifeRemainingPercent = lifeRemainingPercent;
            return this;
        }

        public DriveStats.Builder lifetimeReadBytes(final Long lifetimeReadBytes) {
            this.lifetimeReadBytes = lifetimeReadBytes;
            return this;
        }

        public DriveStats.Builder lifetimeWriteBytes(final Long lifetimeWriteBytes) {
            this.lifetimeWriteBytes = lifetimeWriteBytes;
            return this;
        }

        public DriveStats.Builder powerOnHours(final Long powerOnHours) {
            this.powerOnHours = powerOnHours;
            return this;
        }

        public DriveStats.Builder readBytes(final Long readBytes) {
            this.readBytes = readBytes;
            return this;
        }

        public DriveStats.Builder readOps(final Long readOps) {
            this.readOps = readOps;
            return this;
        }

        public DriveStats.Builder reallocatedSectors(final Long reallocatedSectors) {
            this.reallocatedSectors = reallocatedSectors;
            return this;
        }

        public DriveStats.Builder reserveCapacityPercent(final Long reserveCapacityPercent) {
            this.reserveCapacityPercent = reserveCapacityPercent;
            return this;
        }

        public DriveStats.Builder timestamp(final String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public DriveStats.Builder totalCapacity(final Long totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }

        public DriveStats.Builder optionalUsedCapacity(final Long usedCapacity) {
            this.usedCapacity = (usedCapacity == null) ? Optional.<Long>empty() : Optional.of(usedCapacity);
            return this;
        }

        public DriveStats.Builder usedMemory(final Long usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }

        public DriveStats.Builder writeBytes(final Long writeBytes) {
            this.writeBytes = writeBytes;
            return this;
        }

        public DriveStats.Builder writeOps(final Long writeOps) {
            this.writeOps = writeOps;
            return this;
        }

    }
}
