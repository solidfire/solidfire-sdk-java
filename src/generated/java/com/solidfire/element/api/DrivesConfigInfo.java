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
 **/

public class DrivesConfigInfo implements Serializable {

    public static final long serialVersionUID = -5022669741868595811L;
    @SerializedName("drives") private DriveConfigInfo[] drives;
    @SerializedName("numBlockActual") private Long numBlockActual;
    @SerializedName("numBlockExpected") private Long numBlockExpected;
    @SerializedName("numSliceActual") private Long numSliceActual;
    @SerializedName("numSliceExpected") private Long numSliceExpected;
    @SerializedName("numTotalActual") private Long numTotalActual;
    @SerializedName("numTotalExpected") private Long numTotalExpected;

    // empty constructor
    @Since("7.0")
    public DrivesConfigInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public DrivesConfigInfo(
        DriveConfigInfo[] drives,
        Long numBlockActual,
        Long numBlockExpected,
        Long numSliceActual,
        Long numSliceExpected,
        Long numTotalActual,
        Long numTotalExpected
    )
    {
        this.drives = drives;
        this.numBlockActual = numBlockActual;
        this.numBlockExpected = numBlockExpected;
        this.numSliceActual = numSliceActual;
        this.numSliceExpected = numSliceExpected;
        this.numTotalActual = numTotalActual;
        this.numTotalExpected = numTotalExpected;
    }

    /** 
     **/
    public DriveConfigInfo[] getDrives() { return this.drives; }
    public void setDrives(DriveConfigInfo[] drives) { 
        this.drives = drives;
    }
    /** 
     **/
    public Long getNumBlockActual() { return this.numBlockActual; }
    public void setNumBlockActual(Long numBlockActual) { 
        this.numBlockActual = numBlockActual;
    }
    /** 
     **/
    public Long getNumBlockExpected() { return this.numBlockExpected; }
    public void setNumBlockExpected(Long numBlockExpected) { 
        this.numBlockExpected = numBlockExpected;
    }
    /** 
     **/
    public Long getNumSliceActual() { return this.numSliceActual; }
    public void setNumSliceActual(Long numSliceActual) { 
        this.numSliceActual = numSliceActual;
    }
    /** 
     **/
    public Long getNumSliceExpected() { return this.numSliceExpected; }
    public void setNumSliceExpected(Long numSliceExpected) { 
        this.numSliceExpected = numSliceExpected;
    }
    /** 
     **/
    public Long getNumTotalActual() { return this.numTotalActual; }
    public void setNumTotalActual(Long numTotalActual) { 
        this.numTotalActual = numTotalActual;
    }
    /** 
     **/
    public Long getNumTotalExpected() { return this.numTotalExpected; }
    public void setNumTotalExpected(Long numTotalExpected) { 
        this.numTotalExpected = numTotalExpected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrivesConfigInfo that = (DrivesConfigInfo) o;

        return 
            Arrays.equals(drives, that.drives) && 
            Objects.equals(numBlockActual, that.numBlockActual) && 
            Objects.equals(numBlockExpected, that.numBlockExpected) && 
            Objects.equals(numSliceActual, that.numSliceActual) && 
            Objects.equals(numSliceExpected, that.numSliceExpected) && 
            Objects.equals(numTotalActual, that.numTotalActual) && 
            Objects.equals(numTotalExpected, that.numTotalExpected);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])drives,numBlockActual,numBlockExpected,numSliceActual,numSliceExpected,numTotalActual,numTotalExpected );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("drives", drives);
        map.put("numBlockActual", numBlockActual);
        map.put("numBlockExpected", numBlockExpected);
        map.put("numSliceActual", numSliceActual);
        map.put("numSliceExpected", numSliceExpected);
        map.put("numTotalActual", numTotalActual);
        map.put("numTotalExpected", numTotalExpected);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" drives : ").append(Arrays.toString(drives)).append(",");
        sb.append(" numBlockActual : ").append(numBlockActual).append(",");
        sb.append(" numBlockExpected : ").append(numBlockExpected).append(",");
        sb.append(" numSliceActual : ").append(numSliceActual).append(",");
        sb.append(" numSliceExpected : ").append(numSliceExpected).append(",");
        sb.append(" numTotalActual : ").append(numTotalActual).append(",");
        sb.append(" numTotalExpected : ").append(numTotalExpected).append(",");
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
        private DriveConfigInfo[] drives;
        private Long numBlockActual;
        private Long numBlockExpected;
        private Long numSliceActual;
        private Long numSliceExpected;
        private Long numTotalActual;
        private Long numTotalExpected;

        private Builder() { }

        public DrivesConfigInfo build() {
            return new DrivesConfigInfo (
                         this.drives,
                         this.numBlockActual,
                         this.numBlockExpected,
                         this.numSliceActual,
                         this.numSliceExpected,
                         this.numTotalActual,
                         this.numTotalExpected);
        }

        private DrivesConfigInfo.Builder buildFrom(final DrivesConfigInfo req) {
            this.drives = req.drives;
            this.numBlockActual = req.numBlockActual;
            this.numBlockExpected = req.numBlockExpected;
            this.numSliceActual = req.numSliceActual;
            this.numSliceExpected = req.numSliceExpected;
            this.numTotalActual = req.numTotalActual;
            this.numTotalExpected = req.numTotalExpected;

            return this;
        }

        public DrivesConfigInfo.Builder drives(final DriveConfigInfo[] drives) {
            this.drives = drives;
            return this;
        }

        public DrivesConfigInfo.Builder numBlockActual(final Long numBlockActual) {
            this.numBlockActual = numBlockActual;
            return this;
        }

        public DrivesConfigInfo.Builder numBlockExpected(final Long numBlockExpected) {
            this.numBlockExpected = numBlockExpected;
            return this;
        }

        public DrivesConfigInfo.Builder numSliceActual(final Long numSliceActual) {
            this.numSliceActual = numSliceActual;
            return this;
        }

        public DrivesConfigInfo.Builder numSliceExpected(final Long numSliceExpected) {
            this.numSliceExpected = numSliceExpected;
            return this;
        }

        public DrivesConfigInfo.Builder numTotalActual(final Long numTotalActual) {
            this.numTotalActual = numTotalActual;
            return this;
        }

        public DrivesConfigInfo.Builder numTotalExpected(final Long numTotalExpected) {
            this.numTotalExpected = numTotalExpected;
            return this;
        }

    }
}
