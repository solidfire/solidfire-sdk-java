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

import com.solidfire.javautil.Optional;

import com.solidfire.client.ApiException;
import com.solidfire.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import com.solidfire.annotation.Since;

import static com.solidfire.javautil.Optional.of;


/**
 * Quality of Service (QoS) values are used on SolidFire volumes to provision performance expectations.
 **/
public class QoS implements Serializable {

    private static final long serialVersionUID = -1729670674L;

    private final Optional<Long> minIOPS;
    private final Optional<Long> maxIOPS;
    private final Optional<Long> burstIOPS;
    private final Optional<Long> burstTime;

    /**
     * Quality of Service (QoS) values are used on SolidFire volumes to provision performance expectations.
     * Minimum, maximum and burst QoS values can be set within the ranges specified in the QoS table below.
     * <br/><br/>
     * Volumes created without specified QoS values are created with the Default values listed below.
     * Default values can be found by running the GetDefaultQoS method.
     * <br/><br/>
     * <b>minIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 100, Max: 15,000<br/>
     * <b>maxIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>
     * <b>burstIOPS</b> Min: 100/50 (v7.0/v8.0), Default: 15,000, Max: 100,000<br/>
     * @param minIOPS (optional) Desired minimum 4KB IOPS to guarantee.
     * @param maxIOPS (optional) Desired maximum 4KB IOPS allowed over an extended period of time.
     * @param burstIOPS (optional) Maximum &quot;peak&quot; 4KB IOPS allowed for short periods of time.
     * @param burstTime (optional) The length of time burst IOPS is allowed.
     * @since 7.0
     **/
    @Since("7.0")
    public QoS(Optional<Long> minIOPS, Optional<Long> maxIOPS, Optional<Long> burstIOPS, Optional<Long> burstTime) {
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
    public Optional<Long> getMinIOPS() {
        return this.minIOPS;
    }

    /**
     * Desired maximum 4KB IOPS allowed over an extended period of time.
     **/
    public Optional<Long> getMaxIOPS() {
        return this.maxIOPS;
    }

    /**
     * Maximum &quot;peak&quot; 4KB IOPS allowed for short periods of time.
     * Allows for bursts of I/O activity over the normal max IOPS value.
     **/
    public Optional<Long> getBurstIOPS() {
        return this.burstIOPS;
    }

    /**
     * The length of time burst IOPS is allowed.
     * The value returned is represented in time units of seconds.
     * <br/><b>Note</b>: this value is calculated by the system based on IOPS set for QoS.
     **/
    public Optional<Long> getBurstTime() {
        return this.burstTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QoS that = (QoS) o;
        

        return Objects.equals( minIOPS , that.minIOPS )
            && Objects.equals( maxIOPS , that.maxIOPS )
            && Objects.equals( burstIOPS , that.burstIOPS )
            && Objects.equals( burstTime , that.burstTime );
    }

    @Override
    public int hashCode() {

        return Objects.hash( minIOPS, maxIOPS, burstIOPS, burstTime );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != minIOPS && minIOPS.isPresent())
            sb.append(" minIOPS : ").append(minIOPS.get()).append(",");
        if(null != maxIOPS && maxIOPS.isPresent())
            sb.append(" maxIOPS : ").append(maxIOPS.get()).append(",");
        if(null != burstIOPS && burstIOPS.isPresent())
            sb.append(" burstIOPS : ").append(burstIOPS.get()).append(",");
        if(null != burstTime && burstTime.isPresent())
            sb.append(" burstTime : ").append(burstTime.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
