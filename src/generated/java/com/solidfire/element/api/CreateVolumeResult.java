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
 * CreateVolumeResult  
 **/

public class CreateVolumeResult implements Serializable {

    public static final long serialVersionUID = 2889880193310552919L;
    @SerializedName("volume") private Optional<Volume> volume;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("curve") private java.util.Map<String,Long> curve;

    // empty constructor
    @Since("7.0")
    public CreateVolumeResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateVolumeResult(
        Optional<Volume> volume,
        Long volumeID,
        java.util.Map<String,Long> curve
    )
    {
        this.volume = (volume == null) ? Optional.<Volume>empty() : volume;
        this.volumeID = volumeID;
        this.curve = curve;
    }

    /** 
     * 
     **/
    public Optional<Volume> getVolume() { return this.volume; }
    public void setVolume(Optional<Volume> volume) { 
        this.volume = (volume == null) ? Optional.<Volume>empty() : volume;
    }
    /** 
     * VolumeID for the newly created volume.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * The curve is a set of key-value pairs.
     * The keys are I/O sizes in bytes.
     * The values represent the cost performing an IOP at a specific I/O size.
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

        CreateVolumeResult that = (CreateVolumeResult) o;

        return 
            Objects.equals(volume, that.volume) && 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(curve, that.curve);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volume,volumeID,curve );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volume", volume);
        map.put("volumeID", volumeID);
        map.put("curve", curve);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != volume && volume.isPresent()){
            sb.append(" volume : ").append(volume).append(",");
        }
        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" curve : ").append(curve).append(",");
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
        private Optional<Volume> volume;
        private Long volumeID;
        private java.util.Map<String,Long> curve;

        private Builder() { }

        public CreateVolumeResult build() {
            return new CreateVolumeResult (
                         this.volume,
                         this.volumeID,
                         this.curve);
        }

        private CreateVolumeResult.Builder buildFrom(final CreateVolumeResult req) {
            this.volume = req.volume;
            this.volumeID = req.volumeID;
            this.curve = req.curve;

            return this;
        }

        public CreateVolumeResult.Builder optional(final Volume volume) {
            this.volume = (volume == null) ? Optional.<Volume>empty() : Optional.of(volume);
            return this;
        }

        public CreateVolumeResult.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public CreateVolumeResult.Builder curve(final java.util.Map<String,Long> curve) {
            this.curve = curve;
            return this;
        }

    }
}
