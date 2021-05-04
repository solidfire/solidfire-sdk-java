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
 * DriveConfigInfo  
 **/

public class DriveConfigInfo implements Serializable {

    public static final long serialVersionUID = -4739662799171799582L;
    @SerializedName("canonicalName") private String canonicalName;
    @SerializedName("connected") private Boolean connected;
    @SerializedName("dev") private Long dev;
    @SerializedName("devPath") private String devPath;
    @SerializedName("driveType") private String driveType;
    @SerializedName("product") private String product;
    @SerializedName("name") private String name;
    @SerializedName("path") private String path;
    @SerializedName("pathLink") private String pathLink;
    @SerializedName("scsiCompatId") private String scsiCompatId;
    @SerializedName("smartSsdWriteCapable") private Optional<Boolean> smartSsdWriteCapable;
    @SerializedName("securityEnabled") private Boolean securityEnabled;
    @SerializedName("securityFrozen") private Boolean securityFrozen;
    @SerializedName("securityLocked") private Boolean securityLocked;
    @SerializedName("securitySupported") private Boolean securitySupported;
    @SerializedName("size") private Long size;
    @SerializedName("slot") private Long slot;
    @SerializedName("uuid") private java.util.UUID uuid;
    @SerializedName("vendor") private String vendor;
    @SerializedName("version") private String version;
    @SerializedName("securityAtMaximum") private Boolean securityAtMaximum;
    @SerializedName("serial") private String serial;
    @SerializedName("scsiState") private String scsiState;
    // empty constructor
    @Since("7.0")
    public DriveConfigInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public DriveConfigInfo(
        String canonicalName,
        Boolean connected,
        Long dev,
        String devPath,
        String driveType,
        String product,
        String name,
        String path,
        String pathLink,
        String scsiCompatId,
        Optional<Boolean> smartSsdWriteCapable,
        Boolean securityEnabled,
        Boolean securityFrozen,
        Boolean securityLocked,
        Boolean securitySupported,
        Long size,
        Long slot,
        java.util.UUID uuid,
        String vendor,
        String version,
        Boolean securityAtMaximum,
        String serial,
        String scsiState
    )
    {
        this.canonicalName = canonicalName;
        this.connected = connected;
        this.dev = dev;
        this.devPath = devPath;
        this.driveType = driveType;
        this.product = product;
        this.name = name;
        this.path = path;
        this.pathLink = pathLink;
        this.scsiCompatId = scsiCompatId;
        this.smartSsdWriteCapable = (smartSsdWriteCapable == null) ? Optional.<Boolean>empty() : smartSsdWriteCapable;
        this.securityEnabled = securityEnabled;
        this.securityFrozen = securityFrozen;
        this.securityLocked = securityLocked;
        this.securitySupported = securitySupported;
        this.size = size;
        this.slot = slot;
        this.uuid = uuid;
        this.vendor = vendor;
        this.version = version;
        this.securityAtMaximum = securityAtMaximum;
        this.serial = serial;
        this.scsiState = scsiState;
    }

    /** 
     * 
     **/
    public String getCanonicalName() { return this.canonicalName; }
   
    public void setCanonicalName(String canonicalName) { 
        this.canonicalName = canonicalName;
    }
    /** 
     * 
     **/
    public Boolean getConnected() { return this.connected; }
   
    public void setConnected(Boolean connected) { 
        this.connected = connected;
    }
    /** 
     * 
     **/
    public Long getDev() { return this.dev; }
   
    public void setDev(Long dev) { 
        this.dev = dev;
    }
    /** 
     * 
     **/
    public String getDevPath() { return this.devPath; }
   
    public void setDevPath(String devPath) { 
        this.devPath = devPath;
    }
    /** 
     * 
     **/
    public String getDriveType() { return this.driveType; }
   
    public void setDriveType(String driveType) { 
        this.driveType = driveType;
    }
    /** 
     * 
     **/
    public String getProduct() { return this.product; }
   
    public void setProduct(String product) { 
        this.product = product;
    }
    /** 
     * 
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * 
     **/
    public String getPath() { return this.path; }
   
    public void setPath(String path) { 
        this.path = path;
    }
    /** 
     * 
     **/
    public String getPathLink() { return this.pathLink; }
   
    public void setPathLink(String pathLink) { 
        this.pathLink = pathLink;
    }
    /** 
     * 
     **/
    public String getScsiCompatId() { return this.scsiCompatId; }
   
    public void setScsiCompatId(String scsiCompatId) { 
        this.scsiCompatId = scsiCompatId;
    }
    /** 
     * 
     **/
    public Optional<Boolean> getSmartSsdWriteCapable() { return this.smartSsdWriteCapable; }
   
    public void setSmartSsdWriteCapable(Optional<Boolean> smartSsdWriteCapable) { 
        this.smartSsdWriteCapable = (smartSsdWriteCapable == null) ? Optional.<Boolean>empty() : smartSsdWriteCapable;
    }
    /** 
     * 
     **/
    public Boolean getSecurityEnabled() { return this.securityEnabled; }
   
    public void setSecurityEnabled(Boolean securityEnabled) { 
        this.securityEnabled = securityEnabled;
    }
    /** 
     * 
     **/
    public Boolean getSecurityFrozen() { return this.securityFrozen; }
   
    public void setSecurityFrozen(Boolean securityFrozen) { 
        this.securityFrozen = securityFrozen;
    }
    /** 
     * 
     **/
    public Boolean getSecurityLocked() { return this.securityLocked; }
   
    public void setSecurityLocked(Boolean securityLocked) { 
        this.securityLocked = securityLocked;
    }
    /** 
     * 
     **/
    public Boolean getSecuritySupported() { return this.securitySupported; }
   
    public void setSecuritySupported(Boolean securitySupported) { 
        this.securitySupported = securitySupported;
    }
    /** 
     * 
     **/
    public Long getSize() { return this.size; }
   
    public void setSize(Long size) { 
        this.size = size;
    }
    /** 
     * 
     **/
    public Long getSlot() { return this.slot; }
   
    public void setSlot(Long slot) { 
        this.slot = slot;
    }
    /** 
     * 
     **/
    public java.util.UUID getUuid() { return this.uuid; }
   
    public void setUuid(java.util.UUID uuid) { 
        this.uuid = uuid;
    }
    /** 
     * 
     **/
    public String getVendor() { return this.vendor; }
   
    public void setVendor(String vendor) { 
        this.vendor = vendor;
    }
    /** 
     * 
     **/
    public String getVersion() { return this.version; }
   
    public void setVersion(String version) { 
        this.version = version;
    }
    /** 
     * 
     **/
    public Boolean getSecurityAtMaximum() { return this.securityAtMaximum; }
   
    public void setSecurityAtMaximum(Boolean securityAtMaximum) { 
        this.securityAtMaximum = securityAtMaximum;
    }
    /** 
     * 
     **/
    public String getSerial() { return this.serial; }
   
    public void setSerial(String serial) { 
        this.serial = serial;
    }
    /** 
     * 
     **/
    public String getScsiState() { return this.scsiState; }
   
    public void setScsiState(String scsiState) { 
        this.scsiState = scsiState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriveConfigInfo that = (DriveConfigInfo) o;

        return 
            Objects.equals(canonicalName, that.canonicalName) && 
            Objects.equals(connected, that.connected) && 
            Objects.equals(dev, that.dev) && 
            Objects.equals(devPath, that.devPath) && 
            Objects.equals(driveType, that.driveType) && 
            Objects.equals(product, that.product) && 
            Objects.equals(name, that.name) && 
            Objects.equals(path, that.path) && 
            Objects.equals(pathLink, that.pathLink) && 
            Objects.equals(scsiCompatId, that.scsiCompatId) && 
            Objects.equals(smartSsdWriteCapable, that.smartSsdWriteCapable) && 
            Objects.equals(securityEnabled, that.securityEnabled) && 
            Objects.equals(securityFrozen, that.securityFrozen) && 
            Objects.equals(securityLocked, that.securityLocked) && 
            Objects.equals(securitySupported, that.securitySupported) && 
            Objects.equals(size, that.size) && 
            Objects.equals(slot, that.slot) && 
            Objects.equals(uuid, that.uuid) && 
            Objects.equals(vendor, that.vendor) && 
            Objects.equals(version, that.version) && 
            Objects.equals(securityAtMaximum, that.securityAtMaximum) && 
            Objects.equals(serial, that.serial) && 
            Objects.equals(scsiState, that.scsiState);
    }

    @Override
    public int hashCode() {
        return Objects.hash( canonicalName,connected,dev,devPath,driveType,product,name,path,pathLink,scsiCompatId,smartSsdWriteCapable,securityEnabled,securityFrozen,securityLocked,securitySupported,size,slot,uuid,vendor,version,securityAtMaximum,serial,scsiState );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("canonicalName", canonicalName);
        map.put("connected", connected);
        map.put("dev", dev);
        map.put("devPath", devPath);
        map.put("driveType", driveType);
        map.put("product", product);
        map.put("name", name);
        map.put("path", path);
        map.put("pathLink", pathLink);
        map.put("scsiCompatId", scsiCompatId);
        map.put("smartSsdWriteCapable", smartSsdWriteCapable);
        map.put("securityEnabled", securityEnabled);
        map.put("securityFrozen", securityFrozen);
        map.put("securityLocked", securityLocked);
        map.put("securitySupported", securitySupported);
        map.put("size", size);
        map.put("slot", slot);
        map.put("uuid", uuid);
        map.put("vendor", vendor);
        map.put("version", version);
        map.put("securityAtMaximum", securityAtMaximum);
        map.put("serial", serial);
        map.put("scsiState", scsiState);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" canonicalName : ").append(gson.toJson(canonicalName)).append(",");
        sb.append(" connected : ").append(gson.toJson(connected)).append(",");
        sb.append(" dev : ").append(gson.toJson(dev)).append(",");
        sb.append(" devPath : ").append(gson.toJson(devPath)).append(",");
        sb.append(" driveType : ").append(gson.toJson(driveType)).append(",");
        sb.append(" product : ").append(gson.toJson(product)).append(",");
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" path : ").append(gson.toJson(path)).append(",");
        sb.append(" pathLink : ").append(gson.toJson(pathLink)).append(",");
        sb.append(" scsiCompatId : ").append(gson.toJson(scsiCompatId)).append(",");
        if(null != smartSsdWriteCapable && smartSsdWriteCapable.isPresent()){
            sb.append(" smartSsdWriteCapable : ").append(gson.toJson(smartSsdWriteCapable)).append(",");
        }
        else{
            sb.append(" smartSsdWriteCapable : ").append("null").append(",");
        }
        sb.append(" securityEnabled : ").append(gson.toJson(securityEnabled)).append(",");
        sb.append(" securityFrozen : ").append(gson.toJson(securityFrozen)).append(",");
        sb.append(" securityLocked : ").append(gson.toJson(securityLocked)).append(",");
        sb.append(" securitySupported : ").append(gson.toJson(securitySupported)).append(",");
        sb.append(" size : ").append(gson.toJson(size)).append(",");
        sb.append(" slot : ").append(gson.toJson(slot)).append(",");
        sb.append(" uuid : ").append(gson.toJson(uuid)).append(",");
        sb.append(" vendor : ").append(gson.toJson(vendor)).append(",");
        sb.append(" version : ").append(gson.toJson(version)).append(",");
        sb.append(" securityAtMaximum : ").append(gson.toJson(securityAtMaximum)).append(",");
        sb.append(" serial : ").append(gson.toJson(serial)).append(",");
        sb.append(" scsiState : ").append(gson.toJson(scsiState)).append(",");
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
        private String product;
        private String name;
        private String path;
        private String pathLink;
        private String scsiCompatId;
        private Optional<Boolean> smartSsdWriteCapable;
        private Boolean securityEnabled;
        private Boolean securityFrozen;
        private Boolean securityLocked;
        private Boolean securitySupported;
        private Long size;
        private Long slot;
        private java.util.UUID uuid;
        private String vendor;
        private String version;
        private Boolean securityAtMaximum;
        private String serial;
        private String scsiState;

        private Builder() { }

        public DriveConfigInfo build() {
            return new DriveConfigInfo (
                         this.canonicalName,
                         this.connected,
                         this.dev,
                         this.devPath,
                         this.driveType,
                         this.product,
                         this.name,
                         this.path,
                         this.pathLink,
                         this.scsiCompatId,
                         this.smartSsdWriteCapable,
                         this.securityEnabled,
                         this.securityFrozen,
                         this.securityLocked,
                         this.securitySupported,
                         this.size,
                         this.slot,
                         this.uuid,
                         this.vendor,
                         this.version,
                         this.securityAtMaximum,
                         this.serial,
                         this.scsiState);
        }

        private DriveConfigInfo.Builder buildFrom(final DriveConfigInfo req) {
            this.canonicalName = req.canonicalName;
            this.connected = req.connected;
            this.dev = req.dev;
            this.devPath = req.devPath;
            this.driveType = req.driveType;
            this.product = req.product;
            this.name = req.name;
            this.path = req.path;
            this.pathLink = req.pathLink;
            this.scsiCompatId = req.scsiCompatId;
            this.smartSsdWriteCapable = req.smartSsdWriteCapable;
            this.securityEnabled = req.securityEnabled;
            this.securityFrozen = req.securityFrozen;
            this.securityLocked = req.securityLocked;
            this.securitySupported = req.securitySupported;
            this.size = req.size;
            this.slot = req.slot;
            this.uuid = req.uuid;
            this.vendor = req.vendor;
            this.version = req.version;
            this.securityAtMaximum = req.securityAtMaximum;
            this.serial = req.serial;
            this.scsiState = req.scsiState;

            return this;
        }

        public DriveConfigInfo.Builder canonicalName(final String canonicalName) {
            this.canonicalName = canonicalName;
            return this;
        }

        public DriveConfigInfo.Builder connected(final Boolean connected) {
            this.connected = connected;
            return this;
        }

        public DriveConfigInfo.Builder dev(final Long dev) {
            this.dev = dev;
            return this;
        }

        public DriveConfigInfo.Builder devPath(final String devPath) {
            this.devPath = devPath;
            return this;
        }

        public DriveConfigInfo.Builder driveType(final String driveType) {
            this.driveType = driveType;
            return this;
        }

        public DriveConfigInfo.Builder product(final String product) {
            this.product = product;
            return this;
        }

        public DriveConfigInfo.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public DriveConfigInfo.Builder path(final String path) {
            this.path = path;
            return this;
        }

        public DriveConfigInfo.Builder pathLink(final String pathLink) {
            this.pathLink = pathLink;
            return this;
        }

        public DriveConfigInfo.Builder scsiCompatId(final String scsiCompatId) {
            this.scsiCompatId = scsiCompatId;
            return this;
        }

        public DriveConfigInfo.Builder optionalSmartSsdWriteCapable(final Boolean smartSsdWriteCapable) {
            this.smartSsdWriteCapable = (smartSsdWriteCapable == null) ? Optional.<Boolean>empty() : Optional.of(smartSsdWriteCapable);
            return this;
        }

        public DriveConfigInfo.Builder securityEnabled(final Boolean securityEnabled) {
            this.securityEnabled = securityEnabled;
            return this;
        }

        public DriveConfigInfo.Builder securityFrozen(final Boolean securityFrozen) {
            this.securityFrozen = securityFrozen;
            return this;
        }

        public DriveConfigInfo.Builder securityLocked(final Boolean securityLocked) {
            this.securityLocked = securityLocked;
            return this;
        }

        public DriveConfigInfo.Builder securitySupported(final Boolean securitySupported) {
            this.securitySupported = securitySupported;
            return this;
        }

        public DriveConfigInfo.Builder size(final Long size) {
            this.size = size;
            return this;
        }

        public DriveConfigInfo.Builder slot(final Long slot) {
            this.slot = slot;
            return this;
        }

        public DriveConfigInfo.Builder uuid(final java.util.UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public DriveConfigInfo.Builder vendor(final String vendor) {
            this.vendor = vendor;
            return this;
        }

        public DriveConfigInfo.Builder version(final String version) {
            this.version = version;
            return this;
        }

        public DriveConfigInfo.Builder securityAtMaximum(final Boolean securityAtMaximum) {
            this.securityAtMaximum = securityAtMaximum;
            return this;
        }

        public DriveConfigInfo.Builder serial(final String serial) {
            this.serial = serial;
            return this;
        }

        public DriveConfigInfo.Builder scsiState(final String scsiState) {
            this.scsiState = scsiState;
            return this;
        }

    }
}
