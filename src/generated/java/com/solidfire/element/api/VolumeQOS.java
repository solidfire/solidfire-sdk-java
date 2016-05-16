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
 * Quality of Service (QoS) Result values are used on SolidFire volumes to provision performance expectations.
 **/
public class VolumeQOS implements Serializable {

    private static final long serialVersionUID = 881549954L;

    private final Long minIOPS;
    private final Long maxIOPS;
    private final Long burstIOPS;
    private final Long burstTime;
    private final Object curve;

    /**
     * Quality of Service (QoS) Result values are used on SolidFire volumes to provision performance expectations.
     * @param minIOPS [required] Desired minimum 4KB IOPS to guarantee.
     * @param maxIOPS [required] Desired maximum 4KB IOPS allowed over an extended period of time.
     * @param burstIOPS [required] Maximum &quot;peak&quot; 4KB IOPS allowed for short periods of time.
     * @param burstTime [required] The length of time burst IOPS is allowed.
     * @param curve [required] The curve is a set of key-value pairs.
     * @since 7.0
     **/
    @Since("7.0")
    public VolumeQOS(Long minIOPS, Long maxIOPS, Long burstIOPS, Long burstTime, Object curve) {
        this.curve = curve;
        this.burstIOPS = burstIOPS;
        this.burstTime = burstTime;
        this.maxIOPS = maxIOPS;
        this.minIOPS = minIOPS;
    }


    /**
     * Desired minimum 4KB IOPS to guarantee.
     * The allowed IOPS will only drop below this level if all volumes have been capped
     * at their min IOPS value and there is still insufficient performance capacity.
     **/
    public Long getMinIOPS() {
        return this.minIOPS;
    }

    /**
     * Desired maximum 4KB IOPS allowed over an extended period of time.
     **/
    public Long getMaxIOPS() {
        return this.maxIOPS;
    }

    /**
     * Maximum &quot;peak&quot; 4KB IOPS allowed for short periods of time.
     * Allows for bursts of I/O activity over the normal max IOPS value.
     **/
    public Long getBurstIOPS() {
        return this.burstIOPS;
    }

    /**
     * The length of time burst IOPS is allowed.
     * The value returned is represented in time units of seconds.
     * <br/><b>Note</b>: this value is calculated by the system based on IOPS set for QoS.
     **/
    public Long getBurstTime() {
        return this.burstTime;
    }

    /**
     * The curve is a set of key-value pairs.
     * The keys are I/O sizes in bytes.
     * The values represent the cost performing an IOP at a specific I/O size.
     * The curve is calculated relative to a 4096 byte operation set at 100 IOPS.
     **/
    public Object getCurve() {
        return this.curve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumeQOS that = (VolumeQOS) o;
        

        return Objects.equals( minIOPS , that.minIOPS )
            && Objects.equals( maxIOPS , that.maxIOPS )
            && Objects.equals( burstIOPS , that.burstIOPS )
            && Objects.equals( burstTime , that.burstTime )
            && Objects.equals( curve , that.curve );
    }

    @Override
    public int hashCode() {

        return Objects.hash( minIOPS, maxIOPS, burstIOPS, burstTime, curve );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" minIOPS : ").append(minIOPS).append(",");
        sb.append(" maxIOPS : ").append(maxIOPS).append(",");
        sb.append(" burstIOPS : ").append(burstIOPS).append(",");
        sb.append(" burstTime : ").append(burstTime).append(",");
        sb.append(" curve : ").append(curve);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
