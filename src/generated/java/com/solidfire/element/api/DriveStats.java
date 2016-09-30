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
public class DriveStats  implements Serializable  {

    private static final long serialVersionUID = 471126863L;

    @SerializedName("activeSessions") private final Long activeSessions;
    @SerializedName("failedDieCount") private final Long failedDieCount;
    @SerializedName("lifeRemainingPercent") private final Long lifeRemainingPercent;
    @SerializedName("lifetimeReadBytes") private final Long lifetimeReadBytes;
    @SerializedName("lifetimeWriteBytes") private final Long lifetimeWriteBytes;
    @SerializedName("powerOnHours") private final Long powerOnHours;
    @SerializedName("readBytes") private final Long readBytes;
    @SerializedName("readOps") private final Long readOps;
    @SerializedName("reallocatedSectors") private final Long reallocatedSectors;
    @SerializedName("reserveCapacityPercent") private final Long reserveCapacityPercent;
    @SerializedName("timestamp") private final String timestamp;
    @SerializedName("totalCapacity") private final Long totalCapacity;
    @SerializedName("usedCapacity") private final Optional<Long> usedCapacity;
    @SerializedName("usedMemory") private final Long usedMemory;
    @SerializedName("writeBytes") private final Long writeBytes;
    @SerializedName("writeOps") private final Long writeOps;

    /**
     * 
     * @param activeSessions [required] 
     * @param failedDieCount [required] 
     * @param lifeRemainingPercent [required] 
     * @param lifetimeReadBytes [required] 
     * @param lifetimeWriteBytes [required] 
     * @param powerOnHours [required] 
     * @param readBytes [required] 
     * @param readOps [required] 
     * @param reallocatedSectors [required] 
     * @param reserveCapacityPercent [required] 
     * @param timestamp [required] 
     * @param totalCapacity [required] 
     * @param usedCapacity (optional) 
     * @param usedMemory [required] 
     * @param writeBytes [required] 
     * @param writeOps [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public DriveStats(Long activeSessions, Long failedDieCount, Long lifeRemainingPercent, Long lifetimeReadBytes, Long lifetimeWriteBytes, Long powerOnHours, Long readBytes, Long readOps, Long reallocatedSectors, Long reserveCapacityPercent, String timestamp, Long totalCapacity, Optional<Long> usedCapacity, Long usedMemory, Long writeBytes, Long writeOps) {
        this.writeOps = writeOps;
        this.activeSessions = activeSessions;
        this.reallocatedSectors = reallocatedSectors;
        this.timestamp = timestamp;
        this.usedMemory = usedMemory;
        this.lifetimeWriteBytes = lifetimeWriteBytes;
        this.readOps = readOps;
        this.failedDieCount = failedDieCount;
        this.writeBytes = writeBytes;
        this.totalCapacity = totalCapacity;
        this.readBytes = readBytes;
        this.reserveCapacityPercent = reserveCapacityPercent;
        this.lifetimeReadBytes = lifetimeReadBytes;
        this.lifeRemainingPercent = lifeRemainingPercent;
        this.usedCapacity = (usedCapacity == null) ? Optional.<Long>empty() : usedCapacity;
        this.powerOnHours = powerOnHours;
    }

    public Long getActiveSessions() {
        return this.activeSessions;
    }
    public Long getFailedDieCount() {
        return this.failedDieCount;
    }
    public Long getLifeRemainingPercent() {
        return this.lifeRemainingPercent;
    }
    public Long getLifetimeReadBytes() {
        return this.lifetimeReadBytes;
    }
    public Long getLifetimeWriteBytes() {
        return this.lifetimeWriteBytes;
    }
    public Long getPowerOnHours() {
        return this.powerOnHours;
    }
    public Long getReadBytes() {
        return this.readBytes;
    }
    public Long getReadOps() {
        return this.readOps;
    }
    public Long getReallocatedSectors() {
        return this.reallocatedSectors;
    }
    public Long getReserveCapacityPercent() {
        return this.reserveCapacityPercent;
    }
    public String getTimestamp() {
        return this.timestamp;
    }
    public Long getTotalCapacity() {
        return this.totalCapacity;
    }
    public Optional<Long> getUsedCapacity() {
        return this.usedCapacity;
    }
    public Long getUsedMemory() {
        return this.usedMemory;
    }
    public Long getWriteBytes() {
        return this.writeBytes;
    }
    public Long getWriteOps() {
        return this.writeOps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriveStats that = (DriveStats) o;
        

        return Objects.equals( activeSessions , that.activeSessions )
            && Objects.equals( failedDieCount , that.failedDieCount )
            && Objects.equals( lifeRemainingPercent , that.lifeRemainingPercent )
            && Objects.equals( lifetimeReadBytes , that.lifetimeReadBytes )
            && Objects.equals( lifetimeWriteBytes , that.lifetimeWriteBytes )
            && Objects.equals( powerOnHours , that.powerOnHours )
            && Objects.equals( readBytes , that.readBytes )
            && Objects.equals( readOps , that.readOps )
            && Objects.equals( reallocatedSectors , that.reallocatedSectors )
            && Objects.equals( reserveCapacityPercent , that.reserveCapacityPercent )
            && Objects.equals( timestamp , that.timestamp )
            && Objects.equals( totalCapacity , that.totalCapacity )
            && Objects.equals( usedCapacity , that.usedCapacity )
            && Objects.equals( usedMemory , that.usedMemory )
            && Objects.equals( writeBytes , that.writeBytes )
            && Objects.equals( writeOps , that.writeOps );
    }

    @Override
    public int hashCode() {
        return Objects.hash( activeSessions, failedDieCount, lifeRemainingPercent, lifetimeReadBytes, lifetimeWriteBytes, powerOnHours, readBytes, readOps, reallocatedSectors, reserveCapacityPercent, timestamp, totalCapacity, usedCapacity, usedMemory, writeBytes, writeOps );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" activeSessions : ").append(activeSessions).append(",");
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
        if(null != usedCapacity && usedCapacity.isPresent())
            sb.append(" usedCapacity : ").append(usedCapacity.get()).append(",");
        sb.append(" usedMemory : ").append(usedMemory).append(",");
        sb.append(" writeBytes : ").append(writeBytes).append(",");
        sb.append(" writeOps : ").append(writeOps);
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
        private Long activeSessions;
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
                         this.writeOps            );
        }

        private DriveStats.Builder buildFrom(final DriveStats req) {
            this.activeSessions = req.activeSessions;
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

        public DriveStats.Builder activeSessions(final Long activeSessions) {
            this.activeSessions = activeSessions;
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
