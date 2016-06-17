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
public class DriveHardware implements Serializable {

    private static final long serialVersionUID = -1165736218L;

    @SerializedName("canonicalName") private final String canonicalName;
    @SerializedName("connected") private final boolean connected;
    @SerializedName("dev") private final long dev;
    @SerializedName("devPath") private final String devPath;
    @SerializedName("driveType") private final String driveType;
    @SerializedName("lifeRemainingPercent") private final long lifeRemainingPercent;
    @SerializedName("lifetimeReadBytes") private final long lifetimeReadBytes;
    @SerializedName("lifetimeWriteBytes") private final long lifetimeWriteBytes;
    @SerializedName("name") private final String name;
    @SerializedName("path") private final String path;
    @SerializedName("pathLink") private final String pathLink;
    @SerializedName("powerOnHours") private final long powerOnHours;
    @SerializedName("product") private final String product;
    @SerializedName("reallocatedSectors") private final long reallocatedSectors;
    @SerializedName("reserveCapacityPercent") private final long reserveCapacityPercent;
    @SerializedName("scsiCompatId") private final String scsiCompatId;
    @SerializedName("scsiState") private final String scsiState;
    @SerializedName("securityAtMaximum") private final boolean securityAtMaximum;
    @SerializedName("securityEnabled") private final boolean securityEnabled;
    @SerializedName("securityFrozen") private final boolean securityFrozen;
    @SerializedName("securityLocked") private final boolean securityLocked;
    @SerializedName("securitySupported") private final boolean securitySupported;
    @SerializedName("serial") private final String serial;
    @SerializedName("size") private final long size;
    @SerializedName("slot") private final long slot;
    @SerializedName("smartSsdWriteCapable") private final boolean smartSsdWriteCapable;
    @SerializedName("uuid") private final String uuid;
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
     * @param smartSsdWriteCapable [required] 
     * @param uuid [required] 
     * @param vendor [required] 
     * @param version [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public DriveHardware(String canonicalName, boolean connected, long dev, String devPath, String driveType, long lifeRemainingPercent, long lifetimeReadBytes, long lifetimeWriteBytes, String name, String path, String pathLink, long powerOnHours, String product, long reallocatedSectors, long reserveCapacityPercent, String scsiCompatId, String scsiState, boolean securityAtMaximum, boolean securityEnabled, boolean securityFrozen, boolean securityLocked, boolean securitySupported, String serial, long size, long slot, boolean smartSsdWriteCapable, String uuid, String vendor, String version) {
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
        this.smartSsdWriteCapable = smartSsdWriteCapable;
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
    public boolean getConnected() {
        return this.connected;
    }
    public long getDev() {
        return this.dev;
    }
    public String getDevPath() {
        return this.devPath;
    }
    public String getDriveType() {
        return this.driveType;
    }
    public long getLifeRemainingPercent() {
        return this.lifeRemainingPercent;
    }
    public long getLifetimeReadBytes() {
        return this.lifetimeReadBytes;
    }
    public long getLifetimeWriteBytes() {
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
    public long getPowerOnHours() {
        return this.powerOnHours;
    }
    public String getProduct() {
        return this.product;
    }
    public long getReallocatedSectors() {
        return this.reallocatedSectors;
    }
    public long getReserveCapacityPercent() {
        return this.reserveCapacityPercent;
    }
    public String getScsiCompatId() {
        return this.scsiCompatId;
    }
    public String getScsiState() {
        return this.scsiState;
    }
    public boolean getSecurityAtMaximum() {
        return this.securityAtMaximum;
    }
    public boolean getSecurityEnabled() {
        return this.securityEnabled;
    }
    public boolean getSecurityFrozen() {
        return this.securityFrozen;
    }
    public boolean getSecurityLocked() {
        return this.securityLocked;
    }
    public boolean getSecuritySupported() {
        return this.securitySupported;
    }
    public String getSerial() {
        return this.serial;
    }
    public long getSize() {
        return this.size;
    }
    public long getSlot() {
        return this.slot;
    }
    public boolean getSmartSsdWriteCapable() {
        return this.smartSsdWriteCapable;
    }
    public String getUuid() {
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
        sb.append(" smartSsdWriteCapable : ").append(smartSsdWriteCapable).append(",");
        sb.append(" uuid : ").append(uuid).append(",");
        sb.append(" vendor : ").append(vendor).append(",");
        sb.append(" version : ").append(version);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
