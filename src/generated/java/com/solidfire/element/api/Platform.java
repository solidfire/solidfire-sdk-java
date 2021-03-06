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
 * Platform  
 **/

public class Platform implements Serializable {

    public static final long serialVersionUID = -6341906535361145265L;
    @SerializedName("nodeType") private String nodeType;
    @SerializedName("chassisType") private String chassisType;
    @SerializedName("cpuModel") private String cpuModel;
    @SerializedName("nodeMemoryGB") private Long nodeMemoryGB;
    @SerializedName("platformConfigVersion") private Optional<String> platformConfigVersion;
    @SerializedName("containerized") private Optional<Boolean> containerized;
    // empty constructor
    @Since("7.0")
    public Platform() {}

    
    // parameterized constructor
    @Since("7.0")
    public Platform(
        String nodeType,
        String chassisType,
        String cpuModel,
        Long nodeMemoryGB,
        Optional<String> platformConfigVersion
    )
    {
        this.nodeType = nodeType;
        this.chassisType = chassisType;
        this.cpuModel = cpuModel;
        this.nodeMemoryGB = nodeMemoryGB;
        this.platformConfigVersion = (platformConfigVersion == null) ? Optional.<String>empty() : platformConfigVersion;
    }
    // parameterized constructor
    @Since("12.0")
    public Platform(
        String nodeType,
        String chassisType,
        String cpuModel,
        Long nodeMemoryGB,
        Optional<String> platformConfigVersion,
        Optional<Boolean> containerized
    )
    {
        this.nodeType = nodeType;
        this.chassisType = chassisType;
        this.cpuModel = cpuModel;
        this.nodeMemoryGB = nodeMemoryGB;
        this.platformConfigVersion = (platformConfigVersion == null) ? Optional.<String>empty() : platformConfigVersion;
        this.containerized = (containerized == null) ? Optional.<Boolean>empty() : containerized;
    }

    /** 
     * SolidFire's name for this platform.
     **/
    public String getNodeType() { return this.nodeType; }
   
    public void setNodeType(String nodeType) { 
        this.nodeType = nodeType;
    }
    /** 
     * Name of the chassis (example: "R620").
     **/
    public String getChassisType() { return this.chassisType; }
   
    public void setChassisType(String chassisType) { 
        this.chassisType = chassisType;
    }
    /** 
     * The model of CPU used on this platform.
     **/
    public String getCpuModel() { return this.cpuModel; }
   
    public void setCpuModel(String cpuModel) { 
        this.cpuModel = cpuModel;
    }
    /** 
     * The amount of memory on this platform in GiB.
     **/
    public Long getNodeMemoryGB() { return this.nodeMemoryGB; }
   
    public void setNodeMemoryGB(Long nodeMemoryGB) { 
        this.nodeMemoryGB = nodeMemoryGB;
    }
    /** 
     * 
     **/
    public Optional<String> getPlatformConfigVersion() { return this.platformConfigVersion; }
   
    public void setPlatformConfigVersion(Optional<String> platformConfigVersion) { 
        this.platformConfigVersion = (platformConfigVersion == null) ? Optional.<String>empty() : platformConfigVersion;
    }
    /** 
     * Whether Element software is running inside a container.
     **/
    public Optional<Boolean> getContainerized() { return this.containerized; }
   
    public void setContainerized(Optional<Boolean> containerized) { 
        this.containerized = (containerized == null) ? Optional.<Boolean>empty() : containerized;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Platform that = (Platform) o;

        return 
            Objects.equals(nodeType, that.nodeType) && 
            Objects.equals(chassisType, that.chassisType) && 
            Objects.equals(cpuModel, that.cpuModel) && 
            Objects.equals(nodeMemoryGB, that.nodeMemoryGB) && 
            Objects.equals(platformConfigVersion, that.platformConfigVersion) && 
            Objects.equals(containerized, that.containerized);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeType,chassisType,cpuModel,nodeMemoryGB,platformConfigVersion,containerized );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodeType", nodeType);
        map.put("chassisType", chassisType);
        map.put("cpuModel", cpuModel);
        map.put("nodeMemoryGB", nodeMemoryGB);
        map.put("platformConfigVersion", platformConfigVersion);
        map.put("containerized", containerized);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" nodeType : ").append(gson.toJson(nodeType)).append(",");
        sb.append(" chassisType : ").append(gson.toJson(chassisType)).append(",");
        sb.append(" cpuModel : ").append(gson.toJson(cpuModel)).append(",");
        sb.append(" nodeMemoryGB : ").append(gson.toJson(nodeMemoryGB)).append(",");
        if(null != platformConfigVersion && platformConfigVersion.isPresent()){
            sb.append(" platformConfigVersion : ").append(gson.toJson(platformConfigVersion)).append(",");
        }
        else{
            sb.append(" platformConfigVersion : ").append("null").append(",");
        }
        if(null != containerized && containerized.isPresent()){
            sb.append(" containerized : ").append(gson.toJson(containerized)).append(",");
        }
        else{
            sb.append(" containerized : ").append("null").append(",");
        }
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
        private String nodeType;
        private String chassisType;
        private String cpuModel;
        private Long nodeMemoryGB;
        private Optional<String> platformConfigVersion;
        private Optional<Boolean> containerized;

        private Builder() { }

        public Platform build() {
            return new Platform (
                         this.nodeType,
                         this.chassisType,
                         this.cpuModel,
                         this.nodeMemoryGB,
                         this.platformConfigVersion,
                         this.containerized);
        }

        private Platform.Builder buildFrom(final Platform req) {
            this.nodeType = req.nodeType;
            this.chassisType = req.chassisType;
            this.cpuModel = req.cpuModel;
            this.nodeMemoryGB = req.nodeMemoryGB;
            this.platformConfigVersion = req.platformConfigVersion;
            this.containerized = req.containerized;

            return this;
        }

        public Platform.Builder nodeType(final String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        public Platform.Builder chassisType(final String chassisType) {
            this.chassisType = chassisType;
            return this;
        }

        public Platform.Builder cpuModel(final String cpuModel) {
            this.cpuModel = cpuModel;
            return this;
        }

        public Platform.Builder nodeMemoryGB(final Long nodeMemoryGB) {
            this.nodeMemoryGB = nodeMemoryGB;
            return this;
        }

        public Platform.Builder optionalPlatformConfigVersion(final String platformConfigVersion) {
            this.platformConfigVersion = (platformConfigVersion == null) ? Optional.<String>empty() : Optional.of(platformConfigVersion);
            return this;
        }

        public Platform.Builder optionalContainerized(final Boolean containerized) {
            this.containerized = (containerized == null) ? Optional.<Boolean>empty() : Optional.of(containerized);
            return this;
        }

    }
}
