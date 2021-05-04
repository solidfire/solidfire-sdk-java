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
 * QoS  
 * Quality of Service (QoS) values are used on SolidFire volumes to provision performance expectations.
 * Minimum, maximum and burst QoS values can be set within the ranges specified in the QoS table below.
 * 
 * Volumes created without specified QoS values are created with the Default values listed below.
 * Default values can be found by running the GetDefaultQoS method.
 * 
 * minIOPS Min: 100/50 (v7.0/v8.0), Default: 100, Max: 15,000
 * maxIOPS Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000
 * burstIOPS Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000
 **/

public class QoS implements Serializable {

    public static final long serialVersionUID = 1651154100712193840L;
    @SerializedName("minIOPS") private Optional<Long> minIOPS;
    @SerializedName("maxIOPS") private Optional<Long> maxIOPS;
    @SerializedName("burstIOPS") private Optional<Long> burstIOPS;
    @SerializedName("burstTime") private Optional<Long> burstTime;
    @SerializedName("curve") private Optional<Attributes> curve;
    // empty constructor
    @Since("7.0")
    public QoS() {}

    
    // parameterized constructor
    @Since("7.0")
    public QoS(
        Optional<Long> minIOPS,
        Optional<Long> maxIOPS,
        Optional<Long> burstIOPS,
        Optional<Long> burstTime,
        Optional<Attributes> curve
    )
    {
        this.minIOPS = (minIOPS == null) ? Optional.<Long>empty() : minIOPS;
        this.maxIOPS = (maxIOPS == null) ? Optional.<Long>empty() : maxIOPS;
        this.burstIOPS = (burstIOPS == null) ? Optional.<Long>empty() : burstIOPS;
        this.burstTime = (burstTime == null) ? Optional.<Long>empty() : burstTime;
        this.curve = (curve == null) ? Optional.<Attributes>empty() : curve;
    }

    /** 
     * Desired minimum 4KB IOPS to guarantee.
     * The allowed IOPS will only drop below this level if all volumes have been capped
     * at their minimum IOPS value and there is still insufficient performance capacity.
     **/
    public Optional<Long> getMinIOPS() { return this.minIOPS; }
   
    public void setMinIOPS(Optional<Long> minIOPS) { 
        this.minIOPS = (minIOPS == null) ? Optional.<Long>empty() : minIOPS;
    }
    /** 
     * Desired maximum 4KB IOPS allowed over an extended period of time.
     **/
    public Optional<Long> getMaxIOPS() { return this.maxIOPS; }
   
    public void setMaxIOPS(Optional<Long> maxIOPS) { 
        this.maxIOPS = (maxIOPS == null) ? Optional.<Long>empty() : maxIOPS;
    }
    /** 
     * Maximum "peak" 4KB IOPS allowed for short periods of time.
     * Allows for bursts of I/O activity over the normal max IOPS value.
     **/
    public Optional<Long> getBurstIOPS() { return this.burstIOPS; }
   
    public void setBurstIOPS(Optional<Long> burstIOPS) { 
        this.burstIOPS = (burstIOPS == null) ? Optional.<Long>empty() : burstIOPS;
    }
    /** 
     * The length of time burst IOPS is allowed.
     * The value returned is represented in time units of seconds.
     * Note: this value is calculated by the system based on IOPS set for QoS.
     **/
    public Optional<Long> getBurstTime() { return this.burstTime; }
   
    public void setBurstTime(Optional<Long> burstTime) { 
        this.burstTime = (burstTime == null) ? Optional.<Long>empty() : burstTime;
    }
    /** 
     * The curve is a set of key-value pairs.
     * The keys are I/O sizes in bytes.
     * The values represent the cost of performing an IOP at a specific I/O size.
     * The curve is calculated relative to a 4096 byte operation set at 100 IOPS.
     **/
    public Optional<Attributes> getCurve() { return this.curve; }
   
    public void setCurve(Optional<Attributes> curve) { 
        this.curve = (curve == null) ? Optional.<Attributes>empty() : curve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QoS that = (QoS) o;

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

        if(null != minIOPS && minIOPS.isPresent()){
            sb.append(" minIOPS : ").append(gson.toJson(minIOPS)).append(",");
        }
        else{
            sb.append(" minIOPS : ").append("null").append(",");
        }
        if(null != maxIOPS && maxIOPS.isPresent()){
            sb.append(" maxIOPS : ").append(gson.toJson(maxIOPS)).append(",");
        }
        else{
            sb.append(" maxIOPS : ").append("null").append(",");
        }
        if(null != burstIOPS && burstIOPS.isPresent()){
            sb.append(" burstIOPS : ").append(gson.toJson(burstIOPS)).append(",");
        }
        else{
            sb.append(" burstIOPS : ").append("null").append(",");
        }
        if(null != burstTime && burstTime.isPresent()){
            sb.append(" burstTime : ").append(gson.toJson(burstTime)).append(",");
        }
        else{
            sb.append(" burstTime : ").append("null").append(",");
        }
        if(null != curve && curve.isPresent()){
            sb.append(" curve : ").append(gson.toJson(curve)).append(",");
        }
        else{
            sb.append(" curve : ").append("null").append(",");
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
        private Optional<Long> minIOPS;
        private Optional<Long> maxIOPS;
        private Optional<Long> burstIOPS;
        private Optional<Long> burstTime;
        private Optional<Attributes> curve;

        private Builder() { }

        public QoS build() {
            return new QoS (
                         this.minIOPS,
                         this.maxIOPS,
                         this.burstIOPS,
                         this.burstTime,
                         this.curve);
        }

        private QoS.Builder buildFrom(final QoS req) {
            this.minIOPS = req.minIOPS;
            this.maxIOPS = req.maxIOPS;
            this.burstIOPS = req.burstIOPS;
            this.burstTime = req.burstTime;
            this.curve = req.curve;

            return this;
        }

        public QoS.Builder optionalMinIOPS(final Long minIOPS) {
            this.minIOPS = (minIOPS == null) ? Optional.<Long>empty() : Optional.of(minIOPS);
            return this;
        }

        public QoS.Builder optionalMaxIOPS(final Long maxIOPS) {
            this.maxIOPS = (maxIOPS == null) ? Optional.<Long>empty() : Optional.of(maxIOPS);
            return this;
        }

        public QoS.Builder optionalBurstIOPS(final Long burstIOPS) {
            this.burstIOPS = (burstIOPS == null) ? Optional.<Long>empty() : Optional.of(burstIOPS);
            return this;
        }

        public QoS.Builder optionalBurstTime(final Long burstTime) {
            this.burstTime = (burstTime == null) ? Optional.<Long>empty() : Optional.of(burstTime);
            return this;
        }

        public QoS.Builder optionalCurve(final Attributes curve) {
            this.curve = (curve == null) ? Optional.<Attributes>empty() : Optional.of(curve);
            return this;
        }

    }
}
