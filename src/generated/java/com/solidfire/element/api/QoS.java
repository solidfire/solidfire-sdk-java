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
 * ['Quality of Service (QoS) values are used on SolidFire volumes to provision performance expectations.', 'Minimum, maximum and burst QoS values can be set within the ranges specified in the QoS table below.', '<br/><br/>', 'Volumes created without specified QoS values are created with the Default values listed below.', 'Default values can be found by running the GetDefaultQoS method.', '<br/><br/>', '<b>minIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 100, Max: 15,000<br/>', '<b>maxIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>', '<b>burstIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>']['Quality of Service (QoS) values are used on SolidFire volumes to provision performance expectations.', 'Minimum, maximum and burst QoS values can be set within the ranges specified in the QoS table below.', '<br/><br/>', 'Volumes created without specified QoS values are created with the Default values listed below.', 'Default values can be found by running the GetDefaultQoS method.', '<br/><br/>', '<b>minIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 100, Max: 15,000<br/>', '<b>maxIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>', '<b>burstIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>']['Quality of Service (QoS) values are used on SolidFire volumes to provision performance expectations.', 'Minimum, maximum and burst QoS values can be set within the ranges specified in the QoS table below.', '<br/><br/>', 'Volumes created without specified QoS values are created with the Default values listed below.', 'Default values can be found by running the GetDefaultQoS method.', '<br/><br/>', '<b>minIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 100, Max: 15,000<br/>', '<b>maxIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>', '<b>burstIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>']['Quality of Service (QoS) values are used on SolidFire volumes to provision performance expectations.', 'Minimum, maximum and burst QoS values can be set within the ranges specified in the QoS table below.', '<br/><br/>', 'Volumes created without specified QoS values are created with the Default values listed below.', 'Default values can be found by running the GetDefaultQoS method.', '<br/><br/>', '<b>minIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 100, Max: 15,000<br/>', '<b>maxIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>', '<b>burstIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>']['Quality of Service (QoS) values are used on SolidFire volumes to provision performance expectations.', 'Minimum, maximum and burst QoS values can be set within the ranges specified in the QoS table below.', '<br/><br/>', 'Volumes created without specified QoS values are created with the Default values listed below.', 'Default values can be found by running the GetDefaultQoS method.', '<br/><br/>', '<b>minIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 100, Max: 15,000<br/>', '<b>maxIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>', '<b>burstIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>']['Quality of Service (QoS) values are used on SolidFire volumes to provision performance expectations.', 'Minimum, maximum and burst QoS values can be set within the ranges specified in the QoS table below.', '<br/><br/>', 'Volumes created without specified QoS values are created with the Default values listed below.', 'Default values can be found by running the GetDefaultQoS method.', '<br/><br/>', '<b>minIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 100, Max: 15,000<br/>', '<b>maxIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>', '<b>burstIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>']['Quality of Service (QoS) values are used on SolidFire volumes to provision performance expectations.', 'Minimum, maximum and burst QoS values can be set within the ranges specified in the QoS table below.', '<br/><br/>', 'Volumes created without specified QoS values are created with the Default values listed below.', 'Default values can be found by running the GetDefaultQoS method.', '<br/><br/>', '<b>minIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 100, Max: 15,000<br/>', '<b>maxIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>', '<b>burstIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>']['Quality of Service (QoS) values are used on SolidFire volumes to provision performance expectations.', 'Minimum, maximum and burst QoS values can be set within the ranges specified in the QoS table below.', '<br/><br/>', 'Volumes created without specified QoS values are created with the Default values listed below.', 'Default values can be found by running the GetDefaultQoS method.', '<br/><br/>', '<b>minIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 100, Max: 15,000<br/>', '<b>maxIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>', '<b>burstIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>']['Quality of Service (QoS) values are used on SolidFire volumes to provision performance expectations.', 'Minimum, maximum and burst QoS values can be set within the ranges specified in the QoS table below.', '<br/><br/>', 'Volumes created without specified QoS values are created with the Default values listed below.', 'Default values can be found by running the GetDefaultQoS method.', '<br/><br/>', '<b>minIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 100, Max: 15,000<br/>', '<b>maxIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>', '<b>burstIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>']
 **/

public class QoS implements Serializable {

    public static final long serialVersionUID = 1023223855695272644L;
    @SerializedName("minIOPS") private Optional<Long> minIOPS;
    @SerializedName("maxIOPS") private Optional<Long> maxIOPS;
    @SerializedName("burstIOPS") private Optional<Long> burstIOPS;
    @SerializedName("burstTime") private Optional<Long> burstTime;

    // empty constructor
    @Since("7.0")
    public QoS() {}

    
    // parameterized constructor
    @Since("7.0")
    public QoS(
        Optional<Long> minIOPS,
        Optional<Long> maxIOPS,
        Optional<Long> burstIOPS,
        Optional<Long> burstTime
    )
    {
        this.minIOPS = (minIOPS == null) ? Optional.<Long>empty() : minIOPS;
        this.maxIOPS = (maxIOPS == null) ? Optional.<Long>empty() : maxIOPS;
        this.burstIOPS = (burstIOPS == null) ? Optional.<Long>empty() : burstIOPS;
        this.burstTime = (burstTime == null) ? Optional.<Long>empty() : burstTime;
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
     * <br/><b>Note</b>: this value is calculated by the system based on IOPS set for QoS.
     **/
    public Optional<Long> getBurstTime() { return this.burstTime; }
    public void setBurstTime(Optional<Long> burstTime) { 
        this.burstTime = (burstTime == null) ? Optional.<Long>empty() : burstTime;
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
            Objects.equals(burstTime, that.burstTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash( minIOPS,maxIOPS,burstIOPS,burstTime );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("minIOPS", minIOPS);
        map.put("maxIOPS", maxIOPS);
        map.put("burstIOPS", burstIOPS);
        map.put("burstTime", burstTime);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != minIOPS && minIOPS.isPresent()){
            sb.append(" minIOPS : ").append(minIOPS).append(",");
        }
        if(null != maxIOPS && maxIOPS.isPresent()){
            sb.append(" maxIOPS : ").append(maxIOPS).append(",");
        }
        if(null != burstIOPS && burstIOPS.isPresent()){
            sb.append(" burstIOPS : ").append(burstIOPS).append(",");
        }
        if(null != burstTime && burstTime.isPresent()){
            sb.append(" burstTime : ").append(burstTime).append(",");
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

        private Builder() { }

        public QoS build() {
            return new QoS (
                         this.minIOPS,
                         this.maxIOPS,
                         this.burstIOPS,
                         this.burstTime);
        }

        private QoS.Builder buildFrom(final QoS req) {
            this.minIOPS = req.minIOPS;
            this.maxIOPS = req.maxIOPS;
            this.burstIOPS = req.burstIOPS;
            this.burstTime = req.burstTime;

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

    }
}
