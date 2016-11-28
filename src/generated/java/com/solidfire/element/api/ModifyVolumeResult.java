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

public class ModifyVolumeResult implements Serializable {

    public static final long serialVersionUID = 7716152308587193073L;
    @SerializedName("volume") private Volume volume;

    // empty constructor
    @Since("7.0")
    public ModifyVolumeResult() {}

    // parameterized constructor
    @Since("7.0")
    public ModifyVolumeResult(
        Volume volume
    )
    {
        this.volume = volume;
    }

    /** 
     * Object containing information about the newly modified volume.
     **/
    public Volume getVolume() { return this.volume; }
    public void setVolume(Volume volume) { 
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVolumeResult that = (ModifyVolumeResult) o;

        return 
            Objects.equals(volume, that.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volume );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volume", volume);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volume : ").append(volume).append(",");
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
        private Volume volume;

        private Builder() { }

        public ModifyVolumeResult build() {
            return new ModifyVolumeResult (
                         this.volume);
        }

        private ModifyVolumeResult.Builder buildFrom(final ModifyVolumeResult req) {
            this.volume = req.volume;

            return this;
        }

        public ModifyVolumeResult.Builder volume(final Volume volume) {
            this.volume = volume;
            return this;
        }

    }
}
