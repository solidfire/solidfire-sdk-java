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
 * The hardwareInfo object contains detailed information about the hardware and status of each node in the cluster.  You can retrieve this information with the API method GetHardwareInfo. 
 **/

public class HardwareInfo implements Serializable {

    public static final long serialVersionUID = -2700695853978027936L;
    @SerializedName("bus") private java.util.Map<String, Object> bus;
    @SerializedName("driveHardware") private DriveHardware[] driveHardware;
    @SerializedName("fibreChannelPorts") private Long[] fibreChannelPorts;
    @SerializedName("hardwareConfig") private java.util.Map<String, Object> hardwareConfig;
    @SerializedName("kernelCrashDumpState") private String kernelCrashDumpState;
    @SerializedName("memory") private java.util.Map<String, Object> memory;
    @SerializedName("network") private java.util.Map<String, Object> network;
    @SerializedName("networkInterfaces") private java.util.Map<String, Object> networkInterfaces;
    @SerializedName("nvram") private java.util.Map<String, Object> nvram;
    @SerializedName("origin") private String origin;
    @SerializedName("platform") private java.util.Map<String, Object> platform;
    @SerializedName("serial") private String serial;
    @SerializedName("storage") private java.util.Map<String, Object> storage;
    @SerializedName("sysinfo") private java.util.Map<String, Object> sysinfo;
    @SerializedName("system") private java.util.Map<String, Object> system;
    @SerializedName("uuid") private java.util.UUID uuid;

    // empty constructor
    @Since("7.0")
    public HardwareInfo() {}

    // parameterized constructor
    @Since("7.0")
    public HardwareInfo(
        java.util.Map<String, Object> bus,
        DriveHardware[] driveHardware,
        Long[] fibreChannelPorts,
        java.util.Map<String, Object> hardwareConfig,
        String kernelCrashDumpState,
        java.util.Map<String, Object> memory,
        java.util.Map<String, Object> network,
        java.util.Map<String, Object> networkInterfaces,
        java.util.Map<String, Object> nvram,
        String origin,
        java.util.Map<String, Object> platform,
        String serial,
        java.util.Map<String, Object> storage,
        java.util.Map<String, Object> sysinfo,
        java.util.Map<String, Object> system,
        java.util.UUID uuid
    )
    {
        this.bus = bus;
        this.driveHardware = driveHardware;
        this.fibreChannelPorts = fibreChannelPorts;
        this.hardwareConfig = hardwareConfig;
        this.kernelCrashDumpState = kernelCrashDumpState;
        this.memory = memory;
        this.network = network;
        this.networkInterfaces = networkInterfaces;
        this.nvram = nvram;
        this.origin = origin;
        this.platform = platform;
        this.serial = serial;
        this.storage = storage;
        this.sysinfo = sysinfo;
        this.system = system;
        this.uuid = uuid;
    }

    /** 
     * Motherboard media bus information.
     **/
    public java.util.Map<String, Object> getBus() { return this.bus; }
    public void setBus(java.util.Map<String, Object> bus) { 
        this.bus = bus;
    }
    /** 
     * A list of information for each drive in the node.
     **/
    public DriveHardware[] getDriveHardware() { return this.driveHardware; }
    public void setDriveHardware(DriveHardware[] driveHardware) { 
        this.driveHardware = driveHardware;
    }
    /** 
     * A list of  ports on the node.
     **/
    public Long[] getFibreChannelPorts() { return this.fibreChannelPorts; }
    public void setFibreChannelPorts(Long[] fibreChannelPorts) { 
        this.fibreChannelPorts = fibreChannelPorts;
    }
    /** 
     * Motherboard peripheral configuration information.
     **/
    public java.util.Map<String, Object> getHardwareConfig() { return this.hardwareConfig; }
    public void setHardwareConfig(java.util.Map<String, Object> hardwareConfig) { 
        this.hardwareConfig = hardwareConfig;
    }
    /** 
     * The crash dump configuration of the operating system kernel.
     **/
    public String getKernelCrashDumpState() { return this.kernelCrashDumpState; }
    public void setKernelCrashDumpState(String kernelCrashDumpState) { 
        this.kernelCrashDumpState = kernelCrashDumpState;
    }
    /** 
     * Firmware and system memory hardware information.
     **/
    public java.util.Map<String, Object> getMemory() { return this.memory; }
    public void setMemory(java.util.Map<String, Object> memory) { 
        this.memory = memory;
    }
    /** 
     * Descriptions of the hardware of each of the node's network interfaces.
     **/
    public java.util.Map<String, Object> getNetwork() { return this.network; }
    public void setNetwork(java.util.Map<String, Object> network) { 
        this.network = network;
    }
    /** 
     * The status of the node's network interfaces.
     **/
    public java.util.Map<String, Object> getNetworkInterfaces() { return this.networkInterfaces; }
    public void setNetworkInterfaces(java.util.Map<String, Object> networkInterfaces) { 
        this.networkInterfaces = networkInterfaces;
    }
    /** 
     * NVRAM statistics for the node.
     **/
    public java.util.Map<String, Object> getNvram() { return this.nvram; }
    public void setNvram(java.util.Map<String, Object> nvram) { 
        this.nvram = nvram;
    }
    /** 
     * The vendor of the motherboard.
     **/
    public String getOrigin() { return this.origin; }
    public void setOrigin(String origin) { 
        this.origin = origin;
    }
    /** 
     * A description of the chassis platform.
     **/
    public java.util.Map<String, Object> getPlatform() { return this.platform; }
    public void setPlatform(java.util.Map<String, Object> platform) { 
        this.platform = platform;
    }
    /** 
     * The serial number of the chassis.
     **/
    public String getSerial() { return this.serial; }
    public void setSerial(String serial) { 
        this.serial = serial;
    }
    /** 
     * Storage controller information.
     **/
    public java.util.Map<String, Object> getStorage() { return this.storage; }
    public void setStorage(java.util.Map<String, Object> storage) { 
        this.storage = storage;
    }
    /** 
     * Operating system memory usage and performance information.
     **/
    public java.util.Map<String, Object> getSysinfo() { return this.sysinfo; }
    public void setSysinfo(java.util.Map<String, Object> sysinfo) { 
        this.sysinfo = sysinfo;
    }
    /** 
     * The type of node chassis.
     **/
    public java.util.Map<String, Object> getSystem() { return this.system; }
    public void setSystem(java.util.Map<String, Object> system) { 
        this.system = system;
    }
    /** 
     * The unique ID of the node.
     **/
    public java.util.UUID getUuid() { return this.uuid; }
    public void setUuid(java.util.UUID uuid) { 
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HardwareInfo that = (HardwareInfo) o;
        return 
            Objects.equals(bus, that.bus) &&
            Arrays.equals(driveHardware, that.driveHardware) &&
            Arrays.equals(fibreChannelPorts, that.fibreChannelPorts) &&
            Objects.equals(hardwareConfig, that.hardwareConfig) &&
            Objects.equals(kernelCrashDumpState, that.kernelCrashDumpState) &&
            Objects.equals(memory, that.memory) &&
            Objects.equals(network, that.network) &&
            Objects.equals(networkInterfaces, that.networkInterfaces) &&
            Objects.equals(nvram, that.nvram) &&
            Objects.equals(origin, that.origin) &&
            Objects.equals(platform, that.platform) &&
            Objects.equals(serial, that.serial) &&
            Objects.equals(storage, that.storage) &&
            Objects.equals(sysinfo, that.sysinfo) &&
            Objects.equals(system, that.system) &&
            Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash( bus, (Object[])driveHardware, (Object[])fibreChannelPorts, hardwareConfig, kernelCrashDumpState, memory, network, networkInterfaces, nvram, origin, platform, serial, storage, sysinfo, system, uuid );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("bus", bus);
        map.put("driveHardware", driveHardware);
        map.put("fibreChannelPorts", fibreChannelPorts);
        map.put("hardwareConfig", hardwareConfig);
        map.put("kernelCrashDumpState", kernelCrashDumpState);
        map.put("memory", memory);
        map.put("network", network);
        map.put("networkInterfaces", networkInterfaces);
        map.put("nvram", nvram);
        map.put("origin", origin);
        map.put("platform", platform);
        map.put("serial", serial);
        map.put("storage", storage);
        map.put("sysinfo", sysinfo);
        map.put("system", system);
        map.put("uuid", uuid);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" bus : ").append(bus).append(",");
        sb.append(" driveHardware : ").append(Arrays.toString(driveHardware)).append(",");
        sb.append(" fibreChannelPorts : ").append(Arrays.toString(fibreChannelPorts)).append(",");
        sb.append(" hardwareConfig : ").append(hardwareConfig).append(",");
        sb.append(" kernelCrashDumpState : ").append(kernelCrashDumpState).append(",");
        sb.append(" memory : ").append(memory).append(",");
        sb.append(" network : ").append(network).append(",");
        sb.append(" networkInterfaces : ").append(networkInterfaces).append(",");
        sb.append(" nvram : ").append(nvram).append(",");
        sb.append(" origin : ").append(origin).append(",");
        sb.append(" platform : ").append(platform).append(",");
        sb.append(" serial : ").append(serial).append(",");
        sb.append(" storage : ").append(storage).append(",");
        sb.append(" sysinfo : ").append(sysinfo).append(",");
        sb.append(" system : ").append(system).append(",");
        sb.append(" uuid : ").append(uuid).append(",");
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
        private java.util.Map<String, Object> bus;
        private DriveHardware[] driveHardware;
        private Long[] fibreChannelPorts;
        private java.util.Map<String, Object> hardwareConfig;
        private String kernelCrashDumpState;
        private java.util.Map<String, Object> memory;
        private java.util.Map<String, Object> network;
        private java.util.Map<String, Object> networkInterfaces;
        private java.util.Map<String, Object> nvram;
        private String origin;
        private java.util.Map<String, Object> platform;
        private String serial;
        private java.util.Map<String, Object> storage;
        private java.util.Map<String, Object> sysinfo;
        private java.util.Map<String, Object> system;
        private java.util.UUID uuid;

        private Builder() { }

        public HardwareInfo build() {
            return new HardwareInfo (
                         this.bus,
                         this.driveHardware,
                         this.fibreChannelPorts,
                         this.hardwareConfig,
                         this.kernelCrashDumpState,
                         this.memory,
                         this.network,
                         this.networkInterfaces,
                         this.nvram,
                         this.origin,
                         this.platform,
                         this.serial,
                         this.storage,
                         this.sysinfo,
                         this.system,
                         this.uuid);
        }

        private HardwareInfo.Builder buildFrom(final HardwareInfo req) {
            this.bus = req.bus;
            this.driveHardware = req.driveHardware;
            this.fibreChannelPorts = req.fibreChannelPorts;
            this.hardwareConfig = req.hardwareConfig;
            this.kernelCrashDumpState = req.kernelCrashDumpState;
            this.memory = req.memory;
            this.network = req.network;
            this.networkInterfaces = req.networkInterfaces;
            this.nvram = req.nvram;
            this.origin = req.origin;
            this.platform = req.platform;
            this.serial = req.serial;
            this.storage = req.storage;
            this.sysinfo = req.sysinfo;
            this.system = req.system;
            this.uuid = req.uuid;

            return this;
        }

        public HardwareInfo.Builder bus(final java.util.Map<String, Object> bus) {
            this.bus = bus;
            return this;
        }

        public HardwareInfo.Builder driveHardware(final DriveHardware[] driveHardware) {
            this.driveHardware = driveHardware;
            return this;
        }

        public HardwareInfo.Builder fibreChannelPorts(final Long[] fibreChannelPorts) {
            this.fibreChannelPorts = fibreChannelPorts;
            return this;
        }

        public HardwareInfo.Builder hardwareConfig(final java.util.Map<String, Object> hardwareConfig) {
            this.hardwareConfig = hardwareConfig;
            return this;
        }

        public HardwareInfo.Builder kernelCrashDumpState(final String kernelCrashDumpState) {
            this.kernelCrashDumpState = kernelCrashDumpState;
            return this;
        }

        public HardwareInfo.Builder memory(final java.util.Map<String, Object> memory) {
            this.memory = memory;
            return this;
        }

        public HardwareInfo.Builder network(final java.util.Map<String, Object> network) {
            this.network = network;
            return this;
        }

        public HardwareInfo.Builder networkInterfaces(final java.util.Map<String, Object> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public HardwareInfo.Builder nvram(final java.util.Map<String, Object> nvram) {
            this.nvram = nvram;
            return this;
        }

        public HardwareInfo.Builder origin(final String origin) {
            this.origin = origin;
            return this;
        }

        public HardwareInfo.Builder platform(final java.util.Map<String, Object> platform) {
            this.platform = platform;
            return this;
        }

        public HardwareInfo.Builder serial(final String serial) {
            this.serial = serial;
            return this;
        }

        public HardwareInfo.Builder storage(final java.util.Map<String, Object> storage) {
            this.storage = storage;
            return this;
        }

        public HardwareInfo.Builder sysinfo(final java.util.Map<String, Object> sysinfo) {
            this.sysinfo = sysinfo;
            return this;
        }

        public HardwareInfo.Builder system(final java.util.Map<String, Object> system) {
            this.system = system;
            return this;
        }

        public HardwareInfo.Builder uuid(final java.util.UUID uuid) {
            this.uuid = uuid;
            return this;
        }

    }
}
