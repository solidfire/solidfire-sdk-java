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
 * VolumeQOS  
 * Quality of Service (QoS) Result values are used on SolidFire volumes to provision performance expectations.
 **/

public class VolumeQOS implements Serializable {

    public static final long serialVersionUID = 6126287686446078816L;
    @SerializedName("minIOPS") private Long minIOPS;
    @SerializedName("maxIOPS") private Long maxIOPS;
    @SerializedName("burstIOPS") private Long burstIOPS;
    @SerializedName("burstTime") private Long burstTime;
    @SerializedName("curve") private java.util.Map<String,Long> curve;
    // empty constructor
    @Since("7.0")
    public VolumeQOS() {}

    
    // parameterized constructor
    @Since("7.0")
    public VolumeQOS(
        Long minIOPS,
        Long maxIOPS,
        Long burstIOPS,
        Long burstTime,
        java.util.Map<String,Long> curve
    )
    {
        this.minIOPS = minIOPS;
        this.maxIOPS = maxIOPS;
        this.burstIOPS = burstIOPS;
        this.burstTime = burstTime;
        this.curve = curve;
    }

    /** 
     * Desired minimum 4KB IOPS to guarantee.
     * The allowed IOPS will only drop below this level if all volumes have been capped
     * at their min IOPS value and there is still insufficient performance capacity.
     **/
    public Long getMinIOPS() { return this.minIOPS; }
   
    public void setMinIOPS(Long minIOPS) { 
        this.minIOPS = minIOPS;
    }
    /** 
     * Desired maximum 4KB IOPS allowed over an extended period of time.
     **/
    public Long getMaxIOPS() { return this.maxIOPS; }
   
    public void setMaxIOPS(Long maxIOPS) { 
        this.maxIOPS = maxIOPS;
    }
    /** 
     * Maximum "peak" 4KB IOPS allowed for short periods of time.
     * Allows for bursts of I/O activity over the normal max IOPS value.
     **/
    public Long getBurstIOPS() { return this.burstIOPS; }
   
    public void setBurstIOPS(Long burstIOPS) { 
        this.burstIOPS = burstIOPS;
    }
    /** 
     * The length of time burst IOPS is allowed.
     * The value returned is represented in time units of seconds.
     * Note: this value is calculated by the system based on IOPS set for QoS.
     **/
    public Long getBurstTime() { return this.burstTime; }
   
    public void setBurstTime(Long burstTime) { 
        this.burstTime = burstTime;
    }
    /** 
     * The curve is a set of key-value pairs.
     * The keys are I/O sizes in bytes.
     * The values represent the cost of performing an IOP at a specific I/O size.
     * The curve is calculated relative to a 4096 byte operation set at 100 IOPS.
     **/
    public java.util.Map<String,Long> getCurve() { return this.curve; }
   
    public void setCurve(java.util.Map<String,Long> curve) { 
        this.curve = curve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumeQOS that = (VolumeQOS) o;

        return 
            Objects.equals(minIOPS, that.minIOPS) && 
            Objects.equals(maxIOPS, that.maxIOPS) && 
            Objects.equals(burstIOPS, that.burstIOPS) && 
            Objects.equals(burstTime, that.burstTime) && 
            Objects.equals(curve, that.curve);
    }

    @Override
    public int hashCode() {
        return Objects.hash( minIOPS,maxIOPS,burstIOPS,burstTime,curve );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("minIOPS", minIOPS);
        map.put("maxIOPS", maxIOPS);
        map.put("burstIOPS", burstIOPS);
        map.put("burstTime", burstTime);
        map.put("curve", curve);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" minIOPS : ").append(gson.toJson(minIOPS)).append(",");
        sb.append(" maxIOPS : ").append(gson.toJson(maxIOPS)).append(",");
        sb.append(" burstIOPS : ").append(gson.toJson(burstIOPS)).append(",");
        sb.append(" burstTime : ").append(gson.toJson(burstTime)).append(",");
        sb.append(" curve : ").append(gson.toJson(curve)).append(",");
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
        private Long minIOPS;
        private Long maxIOPS;
        private Long burstIOPS;
        private Long burstTime;
        private java.util.Map<String,Long> curve;

        private Builder() { }

        public VolumeQOS build() {
            return new VolumeQOS (
                         this.minIOPS,
                         this.maxIOPS,
                         this.burstIOPS,
                         this.burstTime,
                         this.curve);
        }

        private VolumeQOS.Builder buildFrom(final VolumeQOS req) {
            this.minIOPS = req.minIOPS;
            this.maxIOPS = req.maxIOPS;
            this.burstIOPS = req.burstIOPS;
            this.burstTime = req.burstTime;
            this.curve = req.curve;

            return this;
        }

        public VolumeQOS.Builder minIOPS(final Long minIOPS) {
            this.minIOPS = minIOPS;
            return this;
        }

        public VolumeQOS.Builder maxIOPS(final Long maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }

        public VolumeQOS.Builder burstIOPS(final Long burstIOPS) {
            this.burstIOPS = burstIOPS;
            return this;
        }

        public VolumeQOS.Builder burstTime(final Long burstTime) {
            this.burstTime = burstTime;
            return this;
        }

        public VolumeQOS.Builder curve(final java.util.Map<String,Long> curve) {
            this.curve = curve;
            return this;
        }

    }
}
