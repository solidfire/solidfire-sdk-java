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
 * 
 **/

public class DriveHardwareInfo implements Serializable {

    public static final long serialVersionUID = -8893614935301879707L;
    @SerializedName("description") private String description;
    @SerializedName("dev") private String dev;
    @SerializedName("devpath") private String devpath;
    @SerializedName("driveSecurityAtMaximum") private Boolean driveSecurityAtMaximum;
    @SerializedName("driveSecurityFrozen") private Boolean driveSecurityFrozen;
    @SerializedName("driveSecurityLocked") private Boolean driveSecurityLocked;
    @SerializedName("logicalname") private String logicalname;
    @SerializedName("product") private String product;
    @SerializedName("scsiCompatID") private String scsiCompatID;
    @SerializedName("securityFeatureEnabled") private Boolean securityFeatureEnabled;
    @SerializedName("securityFeatureSupported") private Boolean securityFeatureSupported;
    @SerializedName("serial") private String serial;
    @SerializedName("size") private Long size;
    @SerializedName("uuid") private java.util.UUID uuid;
    @SerializedName("version") private String version;

    // empty constructor
    @Since("7.0")
    public DriveHardwareInfo() {}

    // parameterized constructor
    @Since("7.0")
    public DriveHardwareInfo(
        String description,
        String dev,
        String devpath,
        Boolean driveSecurityAtMaximum,
        Boolean driveSecurityFrozen,
        Boolean driveSecurityLocked,
        String logicalname,
        String product,
        String scsiCompatID,
        Boolean securityFeatureEnabled,
        Boolean securityFeatureSupported,
        String serial,
        Long size,
        java.util.UUID uuid,
        String version
    )
    {
        this.description = description;
        this.dev = dev;
        this.devpath = devpath;
        this.driveSecurityAtMaximum = driveSecurityAtMaximum;
        this.driveSecurityFrozen = driveSecurityFrozen;
        this.driveSecurityLocked = driveSecurityLocked;
        this.logicalname = logicalname;
        this.product = product;
        this.scsiCompatID = scsiCompatID;
        this.securityFeatureEnabled = securityFeatureEnabled;
        this.securityFeatureSupported = securityFeatureSupported;
        this.serial = serial;
        this.size = size;
        this.uuid = uuid;
        this.version = version;
    }

    /** 
     **/
    public String getDescription() { return this.description; }
    public void setDescription(String description) { 
        this.description = description;
    }
    /** 
     **/
    public String getDev() { return this.dev; }
    public void setDev(String dev) { 
        this.dev = dev;
    }
    /** 
     **/
    public String getDevpath() { return this.devpath; }
    public void setDevpath(String devpath) { 
        this.devpath = devpath;
    }
    /** 
     **/
    public Boolean getDriveSecurityAtMaximum() { return this.driveSecurityAtMaximum; }
    public void setDriveSecurityAtMaximum(Boolean driveSecurityAtMaximum) { 
        this.driveSecurityAtMaximum = driveSecurityAtMaximum;
    }
    /** 
     **/
    public Boolean getDriveSecurityFrozen() { return this.driveSecurityFrozen; }
    public void setDriveSecurityFrozen(Boolean driveSecurityFrozen) { 
        this.driveSecurityFrozen = driveSecurityFrozen;
    }
    /** 
     **/
    public Boolean getDriveSecurityLocked() { return this.driveSecurityLocked; }
    public void setDriveSecurityLocked(Boolean driveSecurityLocked) { 
        this.driveSecurityLocked = driveSecurityLocked;
    }
    /** 
     **/
    public String getLogicalname() { return this.logicalname; }
    public void setLogicalname(String logicalname) { 
        this.logicalname = logicalname;
    }
    /** 
     **/
    public String getProduct() { return this.product; }
    public void setProduct(String product) { 
        this.product = product;
    }
    /** 
     **/
    public String getScsiCompatID() { return this.scsiCompatID; }
    public void setScsiCompatID(String scsiCompatID) { 
        this.scsiCompatID = scsiCompatID;
    }
    /** 
     **/
    public Boolean getSecurityFeatureEnabled() { return this.securityFeatureEnabled; }
    public void setSecurityFeatureEnabled(Boolean securityFeatureEnabled) { 
        this.securityFeatureEnabled = securityFeatureEnabled;
    }
    /** 
     **/
    public Boolean getSecurityFeatureSupported() { return this.securityFeatureSupported; }
    public void setSecurityFeatureSupported(Boolean securityFeatureSupported) { 
        this.securityFeatureSupported = securityFeatureSupported;
    }
    /** 
     **/
    public String getSerial() { return this.serial; }
    public void setSerial(String serial) { 
        this.serial = serial;
    }
    /** 
     **/
    public Long getSize() { return this.size; }
    public void setSize(Long size) { 
        this.size = size;
    }
    /** 
     **/
    public java.util.UUID getUuid() { return this.uuid; }
    public void setUuid(java.util.UUID uuid) { 
        this.uuid = uuid;
    }
    /** 
     **/
    public String getVersion() { return this.version; }
    public void setVersion(String version) { 
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriveHardwareInfo that = (DriveHardwareInfo) o;

        return 
            Objects.equals(description, that.description) &&
            Objects.equals(dev, that.dev) &&
            Objects.equals(devpath, that.devpath) &&
            Objects.equals(driveSecurityAtMaximum, that.driveSecurityAtMaximum) &&
            Objects.equals(driveSecurityFrozen, that.driveSecurityFrozen) &&
            Objects.equals(driveSecurityLocked, that.driveSecurityLocked) &&
            Objects.equals(logicalname, that.logicalname) &&
            Objects.equals(product, that.product) &&
            Objects.equals(scsiCompatID, that.scsiCompatID) &&
            Objects.equals(securityFeatureEnabled, that.securityFeatureEnabled) &&
            Objects.equals(securityFeatureSupported, that.securityFeatureSupported) &&
            Objects.equals(serial, that.serial) &&
            Objects.equals(size, that.size) &&
            Objects.equals(uuid, that.uuid) &&
            Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash( description, dev, devpath, driveSecurityAtMaximum, driveSecurityFrozen, driveSecurityLocked, logicalname, product, scsiCompatID, securityFeatureEnabled, securityFeatureSupported, serial, size, uuid, version );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("description", description);
        map.put("dev", dev);
        map.put("devpath", devpath);
        map.put("driveSecurityAtMaximum", driveSecurityAtMaximum);
        map.put("driveSecurityFrozen", driveSecurityFrozen);
        map.put("driveSecurityLocked", driveSecurityLocked);
        map.put("logicalname", logicalname);
        map.put("product", product);
        map.put("scsiCompatID", scsiCompatID);
        map.put("securityFeatureEnabled", securityFeatureEnabled);
        map.put("securityFeatureSupported", securityFeatureSupported);
        map.put("serial", serial);
        map.put("size", size);
        map.put("uuid", uuid);
        map.put("version", version);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" description : ").append(description).append(",");
        sb.append(" dev : ").append(dev).append(",");
        sb.append(" devpath : ").append(devpath).append(",");
        sb.append(" driveSecurityAtMaximum : ").append(driveSecurityAtMaximum).append(",");
        sb.append(" driveSecurityFrozen : ").append(driveSecurityFrozen).append(",");
        sb.append(" driveSecurityLocked : ").append(driveSecurityLocked).append(",");
        sb.append(" logicalname : ").append(logicalname).append(",");
        sb.append(" product : ").append(product).append(",");
        sb.append(" scsiCompatID : ").append(scsiCompatID).append(",");
        sb.append(" securityFeatureEnabled : ").append(securityFeatureEnabled).append(",");
        sb.append(" securityFeatureSupported : ").append(securityFeatureSupported).append(",");
        sb.append(" serial : ").append(serial).append(",");
        sb.append(" size : ").append(size).append(",");
        sb.append(" uuid : ").append(uuid).append(",");
        sb.append(" version : ").append(version).append(",");
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
        private String description;
        private String dev;
        private String devpath;
        private Boolean driveSecurityAtMaximum;
        private Boolean driveSecurityFrozen;
        private Boolean driveSecurityLocked;
        private String logicalname;
        private String product;
        private String scsiCompatID;
        private Boolean securityFeatureEnabled;
        private Boolean securityFeatureSupported;
        private String serial;
        private Long size;
        private java.util.UUID uuid;
        private String version;

        private Builder() { }

        public DriveHardwareInfo build() {
            return new DriveHardwareInfo (
                         this.description,
                         this.dev,
                         this.devpath,
                         this.driveSecurityAtMaximum,
                         this.driveSecurityFrozen,
                         this.driveSecurityLocked,
                         this.logicalname,
                         this.product,
                         this.scsiCompatID,
                         this.securityFeatureEnabled,
                         this.securityFeatureSupported,
                         this.serial,
                         this.size,
                         this.uuid,
                         this.version);
        }

        private DriveHardwareInfo.Builder buildFrom(final DriveHardwareInfo req) {
            this.description = req.description;
            this.dev = req.dev;
            this.devpath = req.devpath;
            this.driveSecurityAtMaximum = req.driveSecurityAtMaximum;
            this.driveSecurityFrozen = req.driveSecurityFrozen;
            this.driveSecurityLocked = req.driveSecurityLocked;
            this.logicalname = req.logicalname;
            this.product = req.product;
            this.scsiCompatID = req.scsiCompatID;
            this.securityFeatureEnabled = req.securityFeatureEnabled;
            this.securityFeatureSupported = req.securityFeatureSupported;
            this.serial = req.serial;
            this.size = req.size;
            this.uuid = req.uuid;
            this.version = req.version;

            return this;
        }

        public DriveHardwareInfo.Builder description(final String description) {
            this.description = description;
            return this;
        }

        public DriveHardwareInfo.Builder dev(final String dev) {
            this.dev = dev;
            return this;
        }

        public DriveHardwareInfo.Builder devpath(final String devpath) {
            this.devpath = devpath;
            return this;
        }

        public DriveHardwareInfo.Builder driveSecurityAtMaximum(final Boolean driveSecurityAtMaximum) {
            this.driveSecurityAtMaximum = driveSecurityAtMaximum;
            return this;
        }

        public DriveHardwareInfo.Builder driveSecurityFrozen(final Boolean driveSecurityFrozen) {
            this.driveSecurityFrozen = driveSecurityFrozen;
            return this;
        }

        public DriveHardwareInfo.Builder driveSecurityLocked(final Boolean driveSecurityLocked) {
            this.driveSecurityLocked = driveSecurityLocked;
            return this;
        }

        public DriveHardwareInfo.Builder logicalname(final String logicalname) {
            this.logicalname = logicalname;
            return this;
        }

        public DriveHardwareInfo.Builder product(final String product) {
            this.product = product;
            return this;
        }

        public DriveHardwareInfo.Builder scsiCompatID(final String scsiCompatID) {
            this.scsiCompatID = scsiCompatID;
            return this;
        }

        public DriveHardwareInfo.Builder securityFeatureEnabled(final Boolean securityFeatureEnabled) {
            this.securityFeatureEnabled = securityFeatureEnabled;
            return this;
        }

        public DriveHardwareInfo.Builder securityFeatureSupported(final Boolean securityFeatureSupported) {
            this.securityFeatureSupported = securityFeatureSupported;
            return this;
        }

        public DriveHardwareInfo.Builder serial(final String serial) {
            this.serial = serial;
            return this;
        }

        public DriveHardwareInfo.Builder size(final Long size) {
            this.size = size;
            return this;
        }

        public DriveHardwareInfo.Builder uuid(final java.util.UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public DriveHardwareInfo.Builder version(final String version) {
            this.version = version;
            return this;
        }

    }
}
