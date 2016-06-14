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
public class DriveHardwareInfo implements Serializable {

    private static final long serialVersionUID = -1725509272L;

    @SerializedName("description") private final String description;
    @SerializedName("dev") private final String dev;
    @SerializedName("devpath") private final String devpath;
    @SerializedName("driveSecurityAtMaximum") private final Boolean driveSecurityAtMaximum;
    @SerializedName("driveSecurityFrozen") private final Boolean driveSecurityFrozen;
    @SerializedName("driveSecurityLocked") private final Boolean driveSecurityLocked;
    @SerializedName("logicalname") private final String logicalname;
    @SerializedName("product") private final String product;
    @SerializedName("securityFeatureEnabled") private final Boolean securityFeatureEnabled;
    @SerializedName("securityFeatureSupported") private final Boolean securityFeatureSupported;
    @SerializedName("serial") private final String serial;
    @SerializedName("size") private final Long size;
    @SerializedName("uuid") private final String uuid;
    @SerializedName("version") private final String version;

    /**
     * 
     * @param description [required] 
     * @param dev [required] 
     * @param devpath [required] 
     * @param driveSecurityAtMaximum [required] 
     * @param driveSecurityFrozen [required] 
     * @param driveSecurityLocked [required] 
     * @param logicalname [required] 
     * @param product [required] 
     * @param securityFeatureEnabled [required] 
     * @param securityFeatureSupported [required] 
     * @param serial [required] 
     * @param size [required] 
     * @param uuid [required] 
     * @param version [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public DriveHardwareInfo(String description, String dev, String devpath, Boolean driveSecurityAtMaximum, Boolean driveSecurityFrozen, Boolean driveSecurityLocked, String logicalname, String product, Boolean securityFeatureEnabled, Boolean securityFeatureSupported, String serial, Long size, String uuid, String version) {
        this.serial = serial;
        this.size = size;
        this.description = description;
        this.uuid = uuid;
        this.devpath = devpath;
        this.driveSecurityAtMaximum = driveSecurityAtMaximum;
        this.logicalname = logicalname;
        this.version = version;
        this.dev = dev;
        this.securityFeatureSupported = securityFeatureSupported;
        this.driveSecurityLocked = driveSecurityLocked;
        this.securityFeatureEnabled = securityFeatureEnabled;
        this.driveSecurityFrozen = driveSecurityFrozen;
        this.product = product;
    }

    public String getDescription() {
        return this.description;
    }
    public String getDev() {
        return this.dev;
    }
    public String getDevpath() {
        return this.devpath;
    }
    public Boolean getDriveSecurityAtMaximum() {
        return this.driveSecurityAtMaximum;
    }
    public Boolean getDriveSecurityFrozen() {
        return this.driveSecurityFrozen;
    }
    public Boolean getDriveSecurityLocked() {
        return this.driveSecurityLocked;
    }
    public String getLogicalname() {
        return this.logicalname;
    }
    public String getProduct() {
        return this.product;
    }
    public Boolean getSecurityFeatureEnabled() {
        return this.securityFeatureEnabled;
    }
    public Boolean getSecurityFeatureSupported() {
        return this.securityFeatureSupported;
    }
    public String getSerial() {
        return this.serial;
    }
    public Long getSize() {
        return this.size;
    }
    public String getUuid() {
        return this.uuid;
    }
    public String getVersion() {
        return this.version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriveHardwareInfo that = (DriveHardwareInfo) o;
        

        return Objects.equals( description , that.description )
            && Objects.equals( dev , that.dev )
            && Objects.equals( devpath , that.devpath )
            && Objects.equals( driveSecurityAtMaximum , that.driveSecurityAtMaximum )
            && Objects.equals( driveSecurityFrozen , that.driveSecurityFrozen )
            && Objects.equals( driveSecurityLocked , that.driveSecurityLocked )
            && Objects.equals( logicalname , that.logicalname )
            && Objects.equals( product , that.product )
            && Objects.equals( securityFeatureEnabled , that.securityFeatureEnabled )
            && Objects.equals( securityFeatureSupported , that.securityFeatureSupported )
            && Objects.equals( serial , that.serial )
            && Objects.equals( size , that.size )
            && Objects.equals( uuid , that.uuid )
            && Objects.equals( version , that.version );
    }

    @Override
    public int hashCode() {
        return Objects.hash( description, dev, devpath, driveSecurityAtMaximum, driveSecurityFrozen, driveSecurityLocked, logicalname, product, securityFeatureEnabled, securityFeatureSupported, serial, size, uuid, version );
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
        sb.append(" securityFeatureEnabled : ").append(securityFeatureEnabled).append(",");
        sb.append(" securityFeatureSupported : ").append(securityFeatureSupported).append(",");
        sb.append(" serial : ").append(serial).append(",");
        sb.append(" size : ").append(size).append(",");
        sb.append(" uuid : ").append(uuid).append(",");
        sb.append(" version : ").append(version);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
