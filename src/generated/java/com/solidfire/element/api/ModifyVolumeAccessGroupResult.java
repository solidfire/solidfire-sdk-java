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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ModifyVolumeAccessGroupResult  
 **/

public class ModifyVolumeAccessGroupResult implements Serializable {

    public static final long serialVersionUID = 2898879091933680714L;
    @SerializedName("volumeAccessGroup") private VolumeAccessGroup volumeAccessGroup;
    // empty constructor
    @Since("7.0")
    public ModifyVolumeAccessGroupResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyVolumeAccessGroupResult(
        VolumeAccessGroup volumeAccessGroup
    )
    {
        this.volumeAccessGroup = volumeAccessGroup;
    }

    /** 
     * An object containing information about the newly modified volume access group.
     **/
    public VolumeAccessGroup getVolumeAccessGroup() { return this.volumeAccessGroup; }
    public void setVolumeAccessGroup(VolumeAccessGroup volumeAccessGroup) { 
        this.volumeAccessGroup = volumeAccessGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVolumeAccessGroupResult that = (ModifyVolumeAccessGroupResult) o;

        return 
            Objects.equals(volumeAccessGroup, that.volumeAccessGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroup );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroup", volumeAccessGroup);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroup : ").append(volumeAccessGroup).append(",");
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
        private VolumeAccessGroup volumeAccessGroup;

        private Builder() { }

        public ModifyVolumeAccessGroupResult build() {
            return new ModifyVolumeAccessGroupResult (
                         this.volumeAccessGroup);
        }

        private ModifyVolumeAccessGroupResult.Builder buildFrom(final ModifyVolumeAccessGroupResult req) {
            this.volumeAccessGroup = req.volumeAccessGroup;

            return this;
        }

        public ModifyVolumeAccessGroupResult.Builder volumeAccessGroup(final VolumeAccessGroup volumeAccessGroup) {
            this.volumeAccessGroup = volumeAccessGroup;
            return this;
        }

    }
}
