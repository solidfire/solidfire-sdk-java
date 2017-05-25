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
 * RemoveVolumesFromVolumeAccessGroupRequest  
 * The RemoveVolumeFromVolumeAccessGroup method enables you to remove volumes from a volume access group.
 **/

public class RemoveVolumesFromVolumeAccessGroupRequest implements Serializable {

    public static final long serialVersionUID = -1586126254405022680L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("volumes") private Long[] volumes;
    // empty constructor
    @Since("7.0")
    public RemoveVolumesFromVolumeAccessGroupRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RemoveVolumesFromVolumeAccessGroupRequest(
        Long volumeAccessGroupID,
        Long[] volumes
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.volumes = volumes;
    }

    /** 
     * The ID of the volume access group to remove volumes from.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    /** 
     * The ID of the volume access group to remove volumes from.
     **/
    public Long[] getVolumes() { return this.volumes; }
    public void setVolumes(Long[] volumes) { 
        this.volumes = volumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveVolumesFromVolumeAccessGroupRequest that = (RemoveVolumesFromVolumeAccessGroupRequest) o;

        return 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) && 
            Arrays.equals(volumes, that.volumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID,(Object[])volumes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("volumes", volumes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        sb.append(" volumes : ").append(Arrays.toString(volumes)).append(",");
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
        private Long volumeAccessGroupID;
        private Long[] volumes;

        private Builder() { }

        public RemoveVolumesFromVolumeAccessGroupRequest build() {
            return new RemoveVolumesFromVolumeAccessGroupRequest (
                         this.volumeAccessGroupID,
                         this.volumes);
        }

        private RemoveVolumesFromVolumeAccessGroupRequest.Builder buildFrom(final RemoveVolumesFromVolumeAccessGroupRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.volumes = req.volumes;

            return this;
        }

        public RemoveVolumesFromVolumeAccessGroupRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public RemoveVolumesFromVolumeAccessGroupRequest.Builder volumes(final Long[] volumes) {
            this.volumes = volumes;
            return this;
        }

    }
}
