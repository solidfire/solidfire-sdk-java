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
 * 
 **/
public class DriveHardware  implements Serializable  {

    private static final long serialVersionUID = -1082137014L;

    @SerializedName("canonicalName") private final String canonicalName;
    @SerializedName("connected") private final Boolean connected;
    @SerializedName("dev") private final Long dev;
    @SerializedName("devPath") private final String devPath;
    @SerializedName("driveType") private final String driveType;
    @SerializedName("lifeRemainingPercent") private final Long lifeRemainingPercent;
    @SerializedName("lifetimeReadBytes") private final Long lifetimeReadBytes;
    @SerializedName("lifetimeWriteBytes") private final Long lifetimeWriteBytes;
    @SerializedName("name") private final String name;
    @SerializedName("path") private final String path;
    @SerializedName("pathLink") private final String pathLink;
    @SerializedName("powerOnHours") private final Long powerOnHours;
    @SerializedName("product") private final String product;
    @SerializedName("reallocatedSectors") private final Long reallocatedSectors;
    @SerializedName("reserveCapacityPercent") private final Long reserveCapacityPercent;
    @SerializedName("scsiCompatId") private final String scsiCompatId;
    @SerializedName("scsiState") private final String scsiState;
    @SerializedName("securityAtMaximum") private final Boolean securityAtMaximum;
    @SerializedName("securityEnabled") private final Boolean securityEnabled;
    @SerializedName("securityFrozen") private final Boolean securityFrozen;
    @SerializedName("securityLocked") private final Boolean securityLocked;
    @SerializedName("securitySupported") private final Boolean securitySupported;
    @SerializedName("serial") private final String serial;
    @SerializedName("size") private final Long size;
    @SerializedName("slot") private final Long slot;
    @SerializedName("smartSsdWriteCapable") private final Optional<Boolean> smartSsdWriteCapable;
    @SerializedName("uuid") private final java.util.UUID uuid;
    @SerializedName("vendor") private final String vendor;
    @SerializedName("version") private final String version;

    /**
     * 
     * @param canonicalName [required] 
     * @param connected [required] 
     * @param dev [required] 
     * @param devPath [required] 
     * @param driveType [required] 
     * @param lifeRemainingPercent [required] 
     * @param lifetimeReadBytes [required] 
     * @param lifetimeWriteBytes [required] 
     * @param name [required] 
     * @param path [required] 
     * @param pathLink [required] 
     * @param powerOnHours [required] 
     * @param product [required] 
     * @param reallocatedSectors [required] 
     * @param reserveCapacityPercent [required] 
     * @param scsiCompatId [required] 
     * @param scsiState [required] 
     * @param securityAtMaximum [required] 
     * @param securityEnabled [required] 
     * @param securityFrozen [required] 
     * @param securityLocked [required] 
     * @param securitySupported [required] 
     * @param serial [required] 
     * @param size [required] 
     * @param slot [required] 
     * @param smartSsdWriteCapable (optional) 
     * @param uuid [required] 
     * @param vendor [required] 
     * @param version [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public DriveHardware(String canonicalName, Boolean connected, Long dev, String devPath, String driveType, Long lifeRemainingPercent, Long lifetimeReadBytes, Long lifetimeWriteBytes, String name, String path, String pathLink, Long powerOnHours, String product, Long reallocatedSectors, Long reserveCapacityPercent, String scsiCompatId, String scsiState, Boolean securityAtMaximum, Boolean securityEnabled, Boolean securityFrozen, Boolean securityLocked, Boolean securitySupported, String serial, Long size, Long slot, Optional<Boolean> smartSsdWriteCapable, java.util.UUID uuid, String vendor, String version) {
        this.serial = serial;
        this.name = name;
        this.securityLocked = securityLocked;
        this.path = path;
        this.reallocatedSectors = reallocatedSectors;
        this.size = size;
        this.lifetimeWriteBytes = lifetimeWriteBytes;
        this.securitySupported = securitySupported;
        this.pathLink = pathLink;
        this.uuid = uuid;
        this.securityAtMaximum = securityAtMaximum;
        this.scsiCompatId = scsiCompatId;
        this.securityEnabled = securityEnabled;
        this.scsiState = scsiState;
        this.driveType = driveType;
        this.version = version;
        this.canonicalName = canonicalName;
        this.dev = dev;
        this.securityFrozen = securityFrozen;
        this.devPath = devPath;
        this.smartSsdWriteCapable = (smartSsdWriteCapable == null) ? Optional.<Boolean>empty() : smartSsdWriteCapable;
        this.connected = connected;
        this.reserveCapacityPercent = reserveCapacityPercent;
        this.vendor = vendor;
        this.slot = slot;
        this.lifetimeReadBytes = lifetimeReadBytes;
        this.lifeRemainingPercent = lifeRemainingPercent;
        this.product = product;
        this.powerOnHours = powerOnHours;
    }

    public String getCanonicalName() {
        return this.canonicalName;
    }
    public Boolean getConnected() {
        return this.connected;
    }
    public Long getDev() {
        return this.dev;
    }
    public String getDevPath() {
        return this.devPath;
    }
    public String getDriveType() {
        return this.driveType;
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
    public String getName() {
        return this.name;
    }
    public String getPath() {
        return this.path;
    }
    public String getPathLink() {
        return this.pathLink;
    }
    public Long getPowerOnHours() {
        return this.powerOnHours;
    }
    public String getProduct() {
        return this.product;
    }
    public Long getReallocatedSectors() {
        return this.reallocatedSectors;
    }
    public Long getReserveCapacityPercent() {
        return this.reserveCapacityPercent;
    }
    public String getScsiCompatId() {
        return this.scsiCompatId;
    }
    public String getScsiState() {
        return this.scsiState;
    }
    public Boolean getSecurityAtMaximum() {
        return this.securityAtMaximum;
    }
    public Boolean getSecurityEnabled() {
        return this.securityEnabled;
    }
    public Boolean getSecurityFrozen() {
        return this.securityFrozen;
    }
    public Boolean getSecurityLocked() {
        return this.securityLocked;
    }
    public Boolean getSecuritySupported() {
        return this.securitySupported;
    }
    public String getSerial() {
        return this.serial;
    }
    public Long getSize() {
        return this.size;
    }
    public Long getSlot() {
        return this.slot;
    }
    public Optional<Boolean> getSmartSsdWriteCapable() {
        return this.smartSsdWriteCapable;
    }
    public java.util.UUID getUuid() {
        return this.uuid;
    }
    public String getVendor() {
        return this.vendor;
    }
    public String getVersion() {
        return this.version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriveHardware that = (DriveHardware) o;
        

        return Objects.equals( canonicalName , that.canonicalName )
            && Objects.equals( connected , that.connected )
            && Objects.equals( dev , that.dev )
            && Objects.equals( devPath , that.devPath )
            && Objects.equals( driveType , that.driveType )
            && Objects.equals( lifeRemainingPercent , that.lifeRemainingPercent )
            && Objects.equals( lifetimeReadBytes , that.lifetimeReadBytes )
            && Objects.equals( lifetimeWriteBytes , that.lifetimeWriteBytes )
            && Objects.equals( name , that.name )
            && Objects.equals( path , that.path )
            && Objects.equals( pathLink , that.pathLink )
            && Objects.equals( powerOnHours , that.powerOnHours )
            && Objects.equals( product , that.product )
            && Objects.equals( reallocatedSectors , that.reallocatedSectors )
            && Objects.equals( reserveCapacityPercent , that.reserveCapacityPercent )
            && Objects.equals( scsiCompatId , that.scsiCompatId )
            && Objects.equals( scsiState , that.scsiState )
            && Objects.equals( securityAtMaximum , that.securityAtMaximum )
            && Objects.equals( securityEnabled , that.securityEnabled )
            && Objects.equals( securityFrozen , that.securityFrozen )
            && Objects.equals( securityLocked , that.securityLocked )
            && Objects.equals( securitySupported , that.securitySupported )
            && Objects.equals( serial , that.serial )
            && Objects.equals( size , that.size )
            && Objects.equals( slot , that.slot )
            && Objects.equals( smartSsdWriteCapable , that.smartSsdWriteCapable )
            && Objects.equals( uuid , that.uuid )
            && Objects.equals( vendor , that.vendor )
            && Objects.equals( version , that.version );
    }

    @Override
    public int hashCode() {
        return Objects.hash( canonicalName, connected, dev, devPath, driveType, lifeRemainingPercent, lifetimeReadBytes, lifetimeWriteBytes, name, path, pathLink, powerOnHours, product, reallocatedSectors, reserveCapacityPercent, scsiCompatId, scsiState, securityAtMaximum, securityEnabled, securityFrozen, securityLocked, securitySupported, serial, size, slot, smartSsdWriteCapable, uuid, vendor, version );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" canonicalName : ").append(canonicalName).append(",");
        sb.append(" connected : ").append(connected).append(",");
        sb.append(" dev : ").append(dev).append(",");
        sb.append(" devPath : ").append(devPath).append(",");
        sb.append(" driveType : ").append(driveType).append(",");
        sb.append(" lifeRemainingPercent : ").append(lifeRemainingPercent).append(",");
        sb.append(" lifetimeReadBytes : ").append(lifetimeReadBytes).append(",");
        sb.append(" lifetimeWriteBytes : ").append(lifetimeWriteBytes).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" path : ").append(path).append(",");
        sb.append(" pathLink : ").append(pathLink).append(",");
        sb.append(" powerOnHours : ").append(powerOnHours).append(",");
        sb.append(" product : ").append(product).append(",");
        sb.append(" reallocatedSectors : ").append(reallocatedSectors).append(",");
        sb.append(" reserveCapacityPercent : ").append(reserveCapacityPercent).append(",");
        sb.append(" scsiCompatId : ").append(scsiCompatId).append(",");
        sb.append(" scsiState : ").append(scsiState).append(",");
        sb.append(" securityAtMaximum : ").append(securityAtMaximum).append(",");
        sb.append(" securityEnabled : ").append(securityEnabled).append(",");
        sb.append(" securityFrozen : ").append(securityFrozen).append(",");
        sb.append(" securityLocked : ").append(securityLocked).append(",");
        sb.append(" securitySupported : ").append(securitySupported).append(",");
        sb.append(" serial : ").append(serial).append(",");
        sb.append(" size : ").append(size).append(",");
        sb.append(" slot : ").append(slot).append(",");
        if(null != smartSsdWriteCapable && smartSsdWriteCapable.isPresent())
            sb.append(" smartSsdWriteCapable : ").append(smartSsdWriteCapable.get()).append(",");
        sb.append(" uuid : ").append(uuid).append(",");
        sb.append(" vendor : ").append(vendor).append(",");
        sb.append(" version : ").append(version);
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
        private String canonicalName;
        private Boolean connected;
        private Long dev;
        private String devPath;
        private String driveType;
        private Long lifeRemainingPercent;
        private Long lifetimeReadBytes;
        private Long lifetimeWriteBytes;
        private String name;
        private String path;
        private String pathLink;
        private Long powerOnHours;
        private String product;
        private Long reallocatedSectors;
        private Long reserveCapacityPercent;
        private String scsiCompatId;
        private String scsiState;
        private Boolean securityAtMaximum;
        private Boolean securityEnabled;
        private Boolean securityFrozen;
        private Boolean securityLocked;
        private Boolean securitySupported;
        private String serial;
        private Long size;
        private Long slot;
        private Optional<Boolean> smartSsdWriteCapable;
        private java.util.UUID uuid;
        private String vendor;
        private String version;

        private Builder() { }

        public DriveHardware build() {
            return new DriveHardware (
                         this.canonicalName,
                         this.connected,
                         this.dev,
                         this.devPath,
                         this.driveType,
                         this.lifeRemainingPercent,
                         this.lifetimeReadBytes,
                         this.lifetimeWriteBytes,
                         this.name,
                         this.path,
                         this.pathLink,
                         this.powerOnHours,
                         this.product,
                         this.reallocatedSectors,
                         this.reserveCapacityPercent,
                         this.scsiCompatId,
                         this.scsiState,
                         this.securityAtMaximum,
                         this.securityEnabled,
                         this.securityFrozen,
                         this.securityLocked,
                         this.securitySupported,
                         this.serial,
                         this.size,
                         this.slot,
                         this.smartSsdWriteCapable,
                         this.uuid,
                         this.vendor,
                         this.version            );
        }

        private DriveHardware.Builder buildFrom(final DriveHardware req) {
            this.canonicalName = req.canonicalName;
            this.connected = req.connected;
            this.dev = req.dev;
            this.devPath = req.devPath;
            this.driveType = req.driveType;
            this.lifeRemainingPercent = req.lifeRemainingPercent;
            this.lifetimeReadBytes = req.lifetimeReadBytes;
            this.lifetimeWriteBytes = req.lifetimeWriteBytes;
            this.name = req.name;
            this.path = req.path;
            this.pathLink = req.pathLink;
            this.powerOnHours = req.powerOnHours;
            this.product = req.product;
            this.reallocatedSectors = req.reallocatedSectors;
            this.reserveCapacityPercent = req.reserveCapacityPercent;
            this.scsiCompatId = req.scsiCompatId;
            this.scsiState = req.scsiState;
            this.securityAtMaximum = req.securityAtMaximum;
            this.securityEnabled = req.securityEnabled;
            this.securityFrozen = req.securityFrozen;
            this.securityLocked = req.securityLocked;
            this.securitySupported = req.securitySupported;
            this.serial = req.serial;
            this.size = req.size;
            this.slot = req.slot;
            this.smartSsdWriteCapable = req.smartSsdWriteCapable;
            this.uuid = req.uuid;
            this.vendor = req.vendor;
            this.version = req.version;

            return this;
        }

        public DriveHardware.Builder canonicalName(final String canonicalName) {
            this.canonicalName = canonicalName;
            return this;
        }

        public DriveHardware.Builder connected(final Boolean connected) {
            this.connected = connected;
            return this;
        }

        public DriveHardware.Builder dev(final Long dev) {
            this.dev = dev;
            return this;
        }

        public DriveHardware.Builder devPath(final String devPath) {
            this.devPath = devPath;
            return this;
        }

        public DriveHardware.Builder driveType(final String driveType) {
            this.driveType = driveType;
            return this;
        }

        public DriveHardware.Builder lifeRemainingPercent(final Long lifeRemainingPercent) {
            this.lifeRemainingPercent = lifeRemainingPercent;
            return this;
        }

        public DriveHardware.Builder lifetimeReadBytes(final Long lifetimeReadBytes) {
            this.lifetimeReadBytes = lifetimeReadBytes;
            return this;
        }

        public DriveHardware.Builder lifetimeWriteBytes(final Long lifetimeWriteBytes) {
            this.lifetimeWriteBytes = lifetimeWriteBytes;
            return this;
        }

        public DriveHardware.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public DriveHardware.Builder path(final String path) {
            this.path = path;
            return this;
        }

        public DriveHardware.Builder pathLink(final String pathLink) {
            this.pathLink = pathLink;
            return this;
        }

        public DriveHardware.Builder powerOnHours(final Long powerOnHours) {
            this.powerOnHours = powerOnHours;
            return this;
        }

        public DriveHardware.Builder product(final String product) {
            this.product = product;
            return this;
        }

        public DriveHardware.Builder reallocatedSectors(final Long reallocatedSectors) {
            this.reallocatedSectors = reallocatedSectors;
            return this;
        }

        public DriveHardware.Builder reserveCapacityPercent(final Long reserveCapacityPercent) {
            this.reserveCapacityPercent = reserveCapacityPercent;
            return this;
        }

        public DriveHardware.Builder scsiCompatId(final String scsiCompatId) {
            this.scsiCompatId = scsiCompatId;
            return this;
        }

        public DriveHardware.Builder scsiState(final String scsiState) {
            this.scsiState = scsiState;
            return this;
        }

        public DriveHardware.Builder securityAtMaximum(final Boolean securityAtMaximum) {
            this.securityAtMaximum = securityAtMaximum;
            return this;
        }

        public DriveHardware.Builder securityEnabled(final Boolean securityEnabled) {
            this.securityEnabled = securityEnabled;
            return this;
        }

        public DriveHardware.Builder securityFrozen(final Boolean securityFrozen) {
            this.securityFrozen = securityFrozen;
            return this;
        }

        public DriveHardware.Builder securityLocked(final Boolean securityLocked) {
            this.securityLocked = securityLocked;
            return this;
        }

        public DriveHardware.Builder securitySupported(final Boolean securitySupported) {
            this.securitySupported = securitySupported;
            return this;
        }

        public DriveHardware.Builder serial(final String serial) {
            this.serial = serial;
            return this;
        }

        public DriveHardware.Builder size(final Long size) {
            this.size = size;
            return this;
        }

        public DriveHardware.Builder slot(final Long slot) {
            this.slot = slot;
            return this;
        }

        public DriveHardware.Builder optionalSmartSsdWriteCapable(final Boolean smartSsdWriteCapable) {
            this.smartSsdWriteCapable = (smartSsdWriteCapable == null) ? Optional.<Boolean>empty() : Optional.of(smartSsdWriteCapable);
            return this;
        }

        public DriveHardware.Builder uuid(final java.util.UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public DriveHardware.Builder vendor(final String vendor) {
            this.vendor = vendor;
            return this;
        }

        public DriveHardware.Builder version(final String version) {
            this.version = version;
            return this;
        }

    }

}
