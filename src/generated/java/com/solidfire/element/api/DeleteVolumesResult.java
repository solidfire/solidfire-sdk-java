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
 * 
 **/

public class DeleteVolumesResult implements Serializable {

    public static final long serialVersionUID = 3323553014043122426L;
    @SerializedName("volumes") private Volume[] volumes;
    @SerializedName("curve") private VolumeQOS curve;

    // empty constructor
    @Since("7.0")
    public DeleteVolumesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteVolumesResult(
        Volume[] volumes,
        VolumeQOS curve
    )
    {
        this.volumes = volumes;
        this.curve = curve;
    }

    /** 
     * Information about the newly deleted volume.
     **/
    public Volume[] getVolumes() { return this.volumes; }
    public void setVolumes(Volume[] volumes) { 
        this.volumes = volumes;
    }
    /** 
     **/
    public VolumeQOS getCurve() { return this.curve; }
    public void setCurve(VolumeQOS curve) { 
        this.curve = curve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteVolumesResult that = (DeleteVolumesResult) o;

        return 
            Arrays.equals(volumes, that.volumes) && 
            Objects.equals(curve, that.curve);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])volumes,curve );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumes", volumes);
        map.put("curve", curve);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumes : ").append(Arrays.toString(volumes)).append(",");
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
        private Volume[] volumes;
        private VolumeQOS curve;

        private Builder() { }

        public DeleteVolumesResult build() {
            return new DeleteVolumesResult (
                         this.volumes,
                         this.curve);
        }

        private DeleteVolumesResult.Builder buildFrom(final DeleteVolumesResult req) {
            this.volumes = req.volumes;
            this.curve = req.curve;

            return this;
        }

        public DeleteVolumesResult.Builder volumes(final Volume[] volumes) {
            this.volumes = volumes;
            return this;
        }

        public DeleteVolumesResult.Builder curve(final VolumeQOS curve) {
            this.curve = curve;
            return this;
        }

    }
}
