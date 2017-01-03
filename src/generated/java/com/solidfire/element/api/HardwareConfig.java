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
 * HardwareConfig  
 **/

public class HardwareConfig implements Serializable {

    public static final long serialVersionUID = 5656038675960507532L;
    @SerializedName("scsiBusInternalDriver") private String scsiBusInternalDriver;
    @SerializedName("networkDriver") private String[] networkDriver;
    @SerializedName("biosRevision") private String biosRevision;
    @SerializedName("slotOffset") private Long slotOffset;
    @SerializedName("numCpu") private Long numCpu;
    @SerializedName("sliceDrives") private String[] sliceDrives;
    @SerializedName("numDrives") private Long numDrives;
    @SerializedName("kernelCrashDump") private KernelCrashDump kernelCrashDump;
    @SerializedName("blockDriveSizeBytes") private Long blockDriveSizeBytes;
    @SerializedName("cpuModel") private String cpuModel;
    @SerializedName("bmcFirmwareRevision") private String bmcFirmwareRevision;
    @SerializedName("cpuCoresEnabled") private Long cpuCoresEnabled;
    @SerializedName("fibreChannelModel") private String fibreChannelModel;
    @SerializedName("chassisType") private String chassisType;
    @SerializedName("bmcIpmiVersion") private String bmcIpmiVersion;
    @SerializedName("nodeType") private String nodeType;
    @SerializedName("solidfireDefaults") private SolidfireDefaults solidfireDefaults;
    @SerializedName("idracVersion") private String idracVersion;
    @SerializedName("blockDrives") private String[] blockDrives;
    @SerializedName("biosVendor") private String biosVendor;
    @SerializedName("fibreChannelFirmwareRevision") private String fibreChannelFirmwareRevision;
    @SerializedName("scsiBusExternalDriver") private String scsiBusExternalDriver;
    @SerializedName("numDrivesInternal") private Long numDrivesInternal;
    @SerializedName("sliceDriveSizeBytes") private Long sliceDriveSizeBytes;
    @SerializedName("biosVersion") private String biosVersion;
    @SerializedName("memoryMhz") private Long memoryMhz;
    @SerializedName("cpuCores") private Long cpuCores;
    @SerializedName("rootDrive") private String rootDrive;
    @SerializedName("driveSizeBytesInternal") private Long driveSizeBytesInternal;
    @SerializedName("lifecycleVersion") private String lifecycleVersion;
    @SerializedName("memoryGB") private Long memoryGB;
    @SerializedName("cpuThreads") private Long cpuThreads;

    // empty constructor
    @Since("7.0")
    public HardwareConfig() {}

    
    // parameterized constructor
    @Since("7.0")
    public HardwareConfig(
        String scsiBusInternalDriver,
        String[] networkDriver,
        String biosRevision,
        Long slotOffset,
        Long numCpu,
        String[] sliceDrives,
        Long numDrives,
        KernelCrashDump kernelCrashDump,
        Long blockDriveSizeBytes,
        String cpuModel,
        String bmcFirmwareRevision,
        Long cpuCoresEnabled,
        String fibreChannelModel,
        String chassisType,
        String bmcIpmiVersion,
        String nodeType,
        SolidfireDefaults solidfireDefaults,
        String idracVersion,
        String[] blockDrives,
        String biosVendor,
        String fibreChannelFirmwareRevision,
        String scsiBusExternalDriver,
        Long numDrivesInternal,
        Long sliceDriveSizeBytes,
        String biosVersion,
        Long memoryMhz,
        Long cpuCores,
        String rootDrive,
        Long driveSizeBytesInternal,
        String lifecycleVersion,
        Long memoryGB,
        Long cpuThreads
    )
    {
        this.scsiBusInternalDriver = scsiBusInternalDriver;
        this.networkDriver = networkDriver;
        this.biosRevision = biosRevision;
        this.slotOffset = slotOffset;
        this.numCpu = numCpu;
        this.sliceDrives = sliceDrives;
        this.numDrives = numDrives;
        this.kernelCrashDump = kernelCrashDump;
        this.blockDriveSizeBytes = blockDriveSizeBytes;
        this.cpuModel = cpuModel;
        this.bmcFirmwareRevision = bmcFirmwareRevision;
        this.cpuCoresEnabled = cpuCoresEnabled;
        this.fibreChannelModel = fibreChannelModel;
        this.chassisType = chassisType;
        this.bmcIpmiVersion = bmcIpmiVersion;
        this.nodeType = nodeType;
        this.solidfireDefaults = solidfireDefaults;
        this.idracVersion = idracVersion;
        this.blockDrives = blockDrives;
        this.biosVendor = biosVendor;
        this.fibreChannelFirmwareRevision = fibreChannelFirmwareRevision;
        this.scsiBusExternalDriver = scsiBusExternalDriver;
        this.numDrivesInternal = numDrivesInternal;
        this.sliceDriveSizeBytes = sliceDriveSizeBytes;
        this.biosVersion = biosVersion;
        this.memoryMhz = memoryMhz;
        this.cpuCores = cpuCores;
        this.rootDrive = rootDrive;
        this.driveSizeBytesInternal = driveSizeBytesInternal;
        this.lifecycleVersion = lifecycleVersion;
        this.memoryGB = memoryGB;
        this.cpuThreads = cpuThreads;
    }

    /** 
     **/
    public String getScsiBusInternalDriver() { return this.scsiBusInternalDriver; }
    public void setScsiBusInternalDriver(String scsiBusInternalDriver) { 
        this.scsiBusInternalDriver = scsiBusInternalDriver;
    }
    /** 
     **/
    public String[] getNetworkDriver() { return this.networkDriver; }
    public void setNetworkDriver(String[] networkDriver) { 
        this.networkDriver = networkDriver;
    }
    /** 
     **/
    public String getBiosRevision() { return this.biosRevision; }
    public void setBiosRevision(String biosRevision) { 
        this.biosRevision = biosRevision;
    }
    /** 
     **/
    public Long getSlotOffset() { return this.slotOffset; }
    public void setSlotOffset(Long slotOffset) { 
        this.slotOffset = slotOffset;
    }
    /** 
     **/
    public Long getNumCpu() { return this.numCpu; }
    public void setNumCpu(Long numCpu) { 
        this.numCpu = numCpu;
    }
    /** 
     **/
    public String[] getSliceDrives() { return this.sliceDrives; }
    public void setSliceDrives(String[] sliceDrives) { 
        this.sliceDrives = sliceDrives;
    }
    /** 
     **/
    public Long getNumDrives() { return this.numDrives; }
    public void setNumDrives(Long numDrives) { 
        this.numDrives = numDrives;
    }
    /** 
     **/
    public KernelCrashDump getKernelCrashDump() { return this.kernelCrashDump; }
    public void setKernelCrashDump(KernelCrashDump kernelCrashDump) { 
        this.kernelCrashDump = kernelCrashDump;
    }
    /** 
     **/
    public Long getBlockDriveSizeBytes() { return this.blockDriveSizeBytes; }
    public void setBlockDriveSizeBytes(Long blockDriveSizeBytes) { 
        this.blockDriveSizeBytes = blockDriveSizeBytes;
    }
    /** 
     **/
    public String getCpuModel() { return this.cpuModel; }
    public void setCpuModel(String cpuModel) { 
        this.cpuModel = cpuModel;
    }
    /** 
     **/
    public String getBmcFirmwareRevision() { return this.bmcFirmwareRevision; }
    public void setBmcFirmwareRevision(String bmcFirmwareRevision) { 
        this.bmcFirmwareRevision = bmcFirmwareRevision;
    }
    /** 
     **/
    public Long getCpuCoresEnabled() { return this.cpuCoresEnabled; }
    public void setCpuCoresEnabled(Long cpuCoresEnabled) { 
        this.cpuCoresEnabled = cpuCoresEnabled;
    }
    /** 
     **/
    public String getFibreChannelModel() { return this.fibreChannelModel; }
    public void setFibreChannelModel(String fibreChannelModel) { 
        this.fibreChannelModel = fibreChannelModel;
    }
    /** 
     **/
    public String getChassisType() { return this.chassisType; }
    public void setChassisType(String chassisType) { 
        this.chassisType = chassisType;
    }
    /** 
     **/
    public String getBmcIpmiVersion() { return this.bmcIpmiVersion; }
    public void setBmcIpmiVersion(String bmcIpmiVersion) { 
        this.bmcIpmiVersion = bmcIpmiVersion;
    }
    /** 
     **/
    public String getNodeType() { return this.nodeType; }
    public void setNodeType(String nodeType) { 
        this.nodeType = nodeType;
    }
    /** 
     **/
    public SolidfireDefaults getSolidfireDefaults() { return this.solidfireDefaults; }
    public void setSolidfireDefaults(SolidfireDefaults solidfireDefaults) { 
        this.solidfireDefaults = solidfireDefaults;
    }
    /** 
     **/
    public String getIdracVersion() { return this.idracVersion; }
    public void setIdracVersion(String idracVersion) { 
        this.idracVersion = idracVersion;
    }
    /** 
     **/
    public String[] getBlockDrives() { return this.blockDrives; }
    public void setBlockDrives(String[] blockDrives) { 
        this.blockDrives = blockDrives;
    }
    /** 
     **/
    public String getBiosVendor() { return this.biosVendor; }
    public void setBiosVendor(String biosVendor) { 
        this.biosVendor = biosVendor;
    }
    /** 
     **/
    public String getFibreChannelFirmwareRevision() { return this.fibreChannelFirmwareRevision; }
    public void setFibreChannelFirmwareRevision(String fibreChannelFirmwareRevision) { 
        this.fibreChannelFirmwareRevision = fibreChannelFirmwareRevision;
    }
    /** 
     **/
    public String getScsiBusExternalDriver() { return this.scsiBusExternalDriver; }
    public void setScsiBusExternalDriver(String scsiBusExternalDriver) { 
        this.scsiBusExternalDriver = scsiBusExternalDriver;
    }
    /** 
     **/
    public Long getNumDrivesInternal() { return this.numDrivesInternal; }
    public void setNumDrivesInternal(Long numDrivesInternal) { 
        this.numDrivesInternal = numDrivesInternal;
    }
    /** 
     **/
    public Long getSliceDriveSizeBytes() { return this.sliceDriveSizeBytes; }
    public void setSliceDriveSizeBytes(Long sliceDriveSizeBytes) { 
        this.sliceDriveSizeBytes = sliceDriveSizeBytes;
    }
    /** 
     **/
    public String getBiosVersion() { return this.biosVersion; }
    public void setBiosVersion(String biosVersion) { 
        this.biosVersion = biosVersion;
    }
    /** 
     **/
    public Long getMemoryMhz() { return this.memoryMhz; }
    public void setMemoryMhz(Long memoryMhz) { 
        this.memoryMhz = memoryMhz;
    }
    /** 
     **/
    public Long getCpuCores() { return this.cpuCores; }
    public void setCpuCores(Long cpuCores) { 
        this.cpuCores = cpuCores;
    }
    /** 
     **/
    public String getRootDrive() { return this.rootDrive; }
    public void setRootDrive(String rootDrive) { 
        this.rootDrive = rootDrive;
    }
    /** 
     **/
    public Long getDriveSizeBytesInternal() { return this.driveSizeBytesInternal; }
    public void setDriveSizeBytesInternal(Long driveSizeBytesInternal) { 
        this.driveSizeBytesInternal = driveSizeBytesInternal;
    }
    /** 
     **/
    public String getLifecycleVersion() { return this.lifecycleVersion; }
    public void setLifecycleVersion(String lifecycleVersion) { 
        this.lifecycleVersion = lifecycleVersion;
    }
    /** 
     **/
    public Long getMemoryGB() { return this.memoryGB; }
    public void setMemoryGB(Long memoryGB) { 
        this.memoryGB = memoryGB;
    }
    /** 
     **/
    public Long getCpuThreads() { return this.cpuThreads; }
    public void setCpuThreads(Long cpuThreads) { 
        this.cpuThreads = cpuThreads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HardwareConfig that = (HardwareConfig) o;

        return 
            Objects.equals(scsiBusInternalDriver, that.scsiBusInternalDriver) && 
            Arrays.equals(networkDriver, that.networkDriver) && 
            Objects.equals(biosRevision, that.biosRevision) && 
            Objects.equals(slotOffset, that.slotOffset) && 
            Objects.equals(numCpu, that.numCpu) && 
            Arrays.equals(sliceDrives, that.sliceDrives) && 
            Objects.equals(numDrives, that.numDrives) && 
            Objects.equals(kernelCrashDump, that.kernelCrashDump) && 
            Objects.equals(blockDriveSizeBytes, that.blockDriveSizeBytes) && 
            Objects.equals(cpuModel, that.cpuModel) && 
            Objects.equals(bmcFirmwareRevision, that.bmcFirmwareRevision) && 
            Objects.equals(cpuCoresEnabled, that.cpuCoresEnabled) && 
            Objects.equals(fibreChannelModel, that.fibreChannelModel) && 
            Objects.equals(chassisType, that.chassisType) && 
            Objects.equals(bmcIpmiVersion, that.bmcIpmiVersion) && 
            Objects.equals(nodeType, that.nodeType) && 
            Objects.equals(solidfireDefaults, that.solidfireDefaults) && 
            Objects.equals(idracVersion, that.idracVersion) && 
            Arrays.equals(blockDrives, that.blockDrives) && 
            Objects.equals(biosVendor, that.biosVendor) && 
            Objects.equals(fibreChannelFirmwareRevision, that.fibreChannelFirmwareRevision) && 
            Objects.equals(scsiBusExternalDriver, that.scsiBusExternalDriver) && 
            Objects.equals(numDrivesInternal, that.numDrivesInternal) && 
            Objects.equals(sliceDriveSizeBytes, that.sliceDriveSizeBytes) && 
            Objects.equals(biosVersion, that.biosVersion) && 
            Objects.equals(memoryMhz, that.memoryMhz) && 
            Objects.equals(cpuCores, that.cpuCores) && 
            Objects.equals(rootDrive, that.rootDrive) && 
            Objects.equals(driveSizeBytesInternal, that.driveSizeBytesInternal) && 
            Objects.equals(lifecycleVersion, that.lifecycleVersion) && 
            Objects.equals(memoryGB, that.memoryGB) && 
            Objects.equals(cpuThreads, that.cpuThreads);
    }

    @Override
    public int hashCode() {
        return Objects.hash( scsiBusInternalDriver,(Object[])networkDriver,biosRevision,slotOffset,numCpu,(Object[])sliceDrives,numDrives,kernelCrashDump,blockDriveSizeBytes,cpuModel,bmcFirmwareRevision,cpuCoresEnabled,fibreChannelModel,chassisType,bmcIpmiVersion,nodeType,solidfireDefaults,idracVersion,(Object[])blockDrives,biosVendor,fibreChannelFirmwareRevision,scsiBusExternalDriver,numDrivesInternal,sliceDriveSizeBytes,biosVersion,memoryMhz,cpuCores,rootDrive,driveSizeBytesInternal,lifecycleVersion,memoryGB,cpuThreads );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("scsiBusInternalDriver", scsiBusInternalDriver);
        map.put("networkDriver", networkDriver);
        map.put("biosRevision", biosRevision);
        map.put("slotOffset", slotOffset);
        map.put("numCpu", numCpu);
        map.put("sliceDrives", sliceDrives);
        map.put("numDrives", numDrives);
        map.put("kernelCrashDump", kernelCrashDump);
        map.put("blockDriveSizeBytes", blockDriveSizeBytes);
        map.put("cpuModel", cpuModel);
        map.put("bmcFirmwareRevision", bmcFirmwareRevision);
        map.put("cpuCoresEnabled", cpuCoresEnabled);
        map.put("fibreChannelModel", fibreChannelModel);
        map.put("chassisType", chassisType);
        map.put("bmcIpmiVersion", bmcIpmiVersion);
        map.put("nodeType", nodeType);
        map.put("solidfireDefaults", solidfireDefaults);
        map.put("idracVersion", idracVersion);
        map.put("blockDrives", blockDrives);
        map.put("biosVendor", biosVendor);
        map.put("fibreChannelFirmwareRevision", fibreChannelFirmwareRevision);
        map.put("scsiBusExternalDriver", scsiBusExternalDriver);
        map.put("numDrivesInternal", numDrivesInternal);
        map.put("sliceDriveSizeBytes", sliceDriveSizeBytes);
        map.put("biosVersion", biosVersion);
        map.put("memoryMhz", memoryMhz);
        map.put("cpuCores", cpuCores);
        map.put("rootDrive", rootDrive);
        map.put("driveSizeBytesInternal", driveSizeBytesInternal);
        map.put("lifecycleVersion", lifecycleVersion);
        map.put("memoryGB", memoryGB);
        map.put("cpuThreads", cpuThreads);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" scsiBusInternalDriver : ").append(scsiBusInternalDriver).append(",");
        sb.append(" networkDriver : ").append(Arrays.toString(networkDriver)).append(",");
        sb.append(" biosRevision : ").append(biosRevision).append(",");
        sb.append(" slotOffset : ").append(slotOffset).append(",");
        sb.append(" numCpu : ").append(numCpu).append(",");
        sb.append(" sliceDrives : ").append(Arrays.toString(sliceDrives)).append(",");
        sb.append(" numDrives : ").append(numDrives).append(",");
        sb.append(" kernelCrashDump : ").append(kernelCrashDump).append(",");
        sb.append(" blockDriveSizeBytes : ").append(blockDriveSizeBytes).append(",");
        sb.append(" cpuModel : ").append(cpuModel).append(",");
        sb.append(" bmcFirmwareRevision : ").append(bmcFirmwareRevision).append(",");
        sb.append(" cpuCoresEnabled : ").append(cpuCoresEnabled).append(",");
        sb.append(" fibreChannelModel : ").append(fibreChannelModel).append(",");
        sb.append(" chassisType : ").append(chassisType).append(",");
        sb.append(" bmcIpmiVersion : ").append(bmcIpmiVersion).append(",");
        sb.append(" nodeType : ").append(nodeType).append(",");
        sb.append(" solidfireDefaults : ").append(solidfireDefaults).append(",");
        sb.append(" idracVersion : ").append(idracVersion).append(",");
        sb.append(" blockDrives : ").append(Arrays.toString(blockDrives)).append(",");
        sb.append(" biosVendor : ").append(biosVendor).append(",");
        sb.append(" fibreChannelFirmwareRevision : ").append(fibreChannelFirmwareRevision).append(",");
        sb.append(" scsiBusExternalDriver : ").append(scsiBusExternalDriver).append(",");
        sb.append(" numDrivesInternal : ").append(numDrivesInternal).append(",");
        sb.append(" sliceDriveSizeBytes : ").append(sliceDriveSizeBytes).append(",");
        sb.append(" biosVersion : ").append(biosVersion).append(",");
        sb.append(" memoryMhz : ").append(memoryMhz).append(",");
        sb.append(" cpuCores : ").append(cpuCores).append(",");
        sb.append(" rootDrive : ").append(rootDrive).append(",");
        sb.append(" driveSizeBytesInternal : ").append(driveSizeBytesInternal).append(",");
        sb.append(" lifecycleVersion : ").append(lifecycleVersion).append(",");
        sb.append(" memoryGB : ").append(memoryGB).append(",");
        sb.append(" cpuThreads : ").append(cpuThreads).append(",");
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
        private String scsiBusInternalDriver;
        private String[] networkDriver;
        private String biosRevision;
        private Long slotOffset;
        private Long numCpu;
        private String[] sliceDrives;
        private Long numDrives;
        private KernelCrashDump kernelCrashDump;
        private Long blockDriveSizeBytes;
        private String cpuModel;
        private String bmcFirmwareRevision;
        private Long cpuCoresEnabled;
        private String fibreChannelModel;
        private String chassisType;
        private String bmcIpmiVersion;
        private String nodeType;
        private SolidfireDefaults solidfireDefaults;
        private String idracVersion;
        private String[] blockDrives;
        private String biosVendor;
        private String fibreChannelFirmwareRevision;
        private String scsiBusExternalDriver;
        private Long numDrivesInternal;
        private Long sliceDriveSizeBytes;
        private String biosVersion;
        private Long memoryMhz;
        private Long cpuCores;
        private String rootDrive;
        private Long driveSizeBytesInternal;
        private String lifecycleVersion;
        private Long memoryGB;
        private Long cpuThreads;

        private Builder() { }

        public HardwareConfig build() {
            return new HardwareConfig (
                         this.scsiBusInternalDriver,
                         this.networkDriver,
                         this.biosRevision,
                         this.slotOffset,
                         this.numCpu,
                         this.sliceDrives,
                         this.numDrives,
                         this.kernelCrashDump,
                         this.blockDriveSizeBytes,
                         this.cpuModel,
                         this.bmcFirmwareRevision,
                         this.cpuCoresEnabled,
                         this.fibreChannelModel,
                         this.chassisType,
                         this.bmcIpmiVersion,
                         this.nodeType,
                         this.solidfireDefaults,
                         this.idracVersion,
                         this.blockDrives,
                         this.biosVendor,
                         this.fibreChannelFirmwareRevision,
                         this.scsiBusExternalDriver,
                         this.numDrivesInternal,
                         this.sliceDriveSizeBytes,
                         this.biosVersion,
                         this.memoryMhz,
                         this.cpuCores,
                         this.rootDrive,
                         this.driveSizeBytesInternal,
                         this.lifecycleVersion,
                         this.memoryGB,
                         this.cpuThreads);
        }

        private HardwareConfig.Builder buildFrom(final HardwareConfig req) {
            this.scsiBusInternalDriver = req.scsiBusInternalDriver;
            this.networkDriver = req.networkDriver;
            this.biosRevision = req.biosRevision;
            this.slotOffset = req.slotOffset;
            this.numCpu = req.numCpu;
            this.sliceDrives = req.sliceDrives;
            this.numDrives = req.numDrives;
            this.kernelCrashDump = req.kernelCrashDump;
            this.blockDriveSizeBytes = req.blockDriveSizeBytes;
            this.cpuModel = req.cpuModel;
            this.bmcFirmwareRevision = req.bmcFirmwareRevision;
            this.cpuCoresEnabled = req.cpuCoresEnabled;
            this.fibreChannelModel = req.fibreChannelModel;
            this.chassisType = req.chassisType;
            this.bmcIpmiVersion = req.bmcIpmiVersion;
            this.nodeType = req.nodeType;
            this.solidfireDefaults = req.solidfireDefaults;
            this.idracVersion = req.idracVersion;
            this.blockDrives = req.blockDrives;
            this.biosVendor = req.biosVendor;
            this.fibreChannelFirmwareRevision = req.fibreChannelFirmwareRevision;
            this.scsiBusExternalDriver = req.scsiBusExternalDriver;
            this.numDrivesInternal = req.numDrivesInternal;
            this.sliceDriveSizeBytes = req.sliceDriveSizeBytes;
            this.biosVersion = req.biosVersion;
            this.memoryMhz = req.memoryMhz;
            this.cpuCores = req.cpuCores;
            this.rootDrive = req.rootDrive;
            this.driveSizeBytesInternal = req.driveSizeBytesInternal;
            this.lifecycleVersion = req.lifecycleVersion;
            this.memoryGB = req.memoryGB;
            this.cpuThreads = req.cpuThreads;

            return this;
        }

        public HardwareConfig.Builder scsiBusInternalDriver(final String scsiBusInternalDriver) {
            this.scsiBusInternalDriver = scsiBusInternalDriver;
            return this;
        }

        public HardwareConfig.Builder networkDriver(final String[] networkDriver) {
            this.networkDriver = networkDriver;
            return this;
        }

        public HardwareConfig.Builder biosRevision(final String biosRevision) {
            this.biosRevision = biosRevision;
            return this;
        }

        public HardwareConfig.Builder slotOffset(final Long slotOffset) {
            this.slotOffset = slotOffset;
            return this;
        }

        public HardwareConfig.Builder numCpu(final Long numCpu) {
            this.numCpu = numCpu;
            return this;
        }

        public HardwareConfig.Builder sliceDrives(final String[] sliceDrives) {
            this.sliceDrives = sliceDrives;
            return this;
        }

        public HardwareConfig.Builder numDrives(final Long numDrives) {
            this.numDrives = numDrives;
            return this;
        }

        public HardwareConfig.Builder kernelCrashDump(final KernelCrashDump kernelCrashDump) {
            this.kernelCrashDump = kernelCrashDump;
            return this;
        }

        public HardwareConfig.Builder blockDriveSizeBytes(final Long blockDriveSizeBytes) {
            this.blockDriveSizeBytes = blockDriveSizeBytes;
            return this;
        }

        public HardwareConfig.Builder cpuModel(final String cpuModel) {
            this.cpuModel = cpuModel;
            return this;
        }

        public HardwareConfig.Builder bmcFirmwareRevision(final String bmcFirmwareRevision) {
            this.bmcFirmwareRevision = bmcFirmwareRevision;
            return this;
        }

        public HardwareConfig.Builder cpuCoresEnabled(final Long cpuCoresEnabled) {
            this.cpuCoresEnabled = cpuCoresEnabled;
            return this;
        }

        public HardwareConfig.Builder fibreChannelModel(final String fibreChannelModel) {
            this.fibreChannelModel = fibreChannelModel;
            return this;
        }

        public HardwareConfig.Builder chassisType(final String chassisType) {
            this.chassisType = chassisType;
            return this;
        }

        public HardwareConfig.Builder bmcIpmiVersion(final String bmcIpmiVersion) {
            this.bmcIpmiVersion = bmcIpmiVersion;
            return this;
        }

        public HardwareConfig.Builder nodeType(final String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        public HardwareConfig.Builder solidfireDefaults(final SolidfireDefaults solidfireDefaults) {
            this.solidfireDefaults = solidfireDefaults;
            return this;
        }

        public HardwareConfig.Builder idracVersion(final String idracVersion) {
            this.idracVersion = idracVersion;
            return this;
        }

        public HardwareConfig.Builder blockDrives(final String[] blockDrives) {
            this.blockDrives = blockDrives;
            return this;
        }

        public HardwareConfig.Builder biosVendor(final String biosVendor) {
            this.biosVendor = biosVendor;
            return this;
        }

        public HardwareConfig.Builder fibreChannelFirmwareRevision(final String fibreChannelFirmwareRevision) {
            this.fibreChannelFirmwareRevision = fibreChannelFirmwareRevision;
            return this;
        }

        public HardwareConfig.Builder scsiBusExternalDriver(final String scsiBusExternalDriver) {
            this.scsiBusExternalDriver = scsiBusExternalDriver;
            return this;
        }

        public HardwareConfig.Builder numDrivesInternal(final Long numDrivesInternal) {
            this.numDrivesInternal = numDrivesInternal;
            return this;
        }

        public HardwareConfig.Builder sliceDriveSizeBytes(final Long sliceDriveSizeBytes) {
            this.sliceDriveSizeBytes = sliceDriveSizeBytes;
            return this;
        }

        public HardwareConfig.Builder biosVersion(final String biosVersion) {
            this.biosVersion = biosVersion;
            return this;
        }

        public HardwareConfig.Builder memoryMhz(final Long memoryMhz) {
            this.memoryMhz = memoryMhz;
            return this;
        }

        public HardwareConfig.Builder cpuCores(final Long cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }

        public HardwareConfig.Builder rootDrive(final String rootDrive) {
            this.rootDrive = rootDrive;
            return this;
        }

        public HardwareConfig.Builder driveSizeBytesInternal(final Long driveSizeBytesInternal) {
            this.driveSizeBytesInternal = driveSizeBytesInternal;
            return this;
        }

        public HardwareConfig.Builder lifecycleVersion(final String lifecycleVersion) {
            this.lifecycleVersion = lifecycleVersion;
            return this;
        }

        public HardwareConfig.Builder memoryGB(final Long memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }

        public HardwareConfig.Builder cpuThreads(final Long cpuThreads) {
            this.cpuThreads = cpuThreads;
            return this;
        }

    }
}
