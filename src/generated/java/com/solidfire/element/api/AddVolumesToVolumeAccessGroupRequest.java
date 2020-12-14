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
 * AddVolumesToVolumeAccessGroupRequest  
 * AddVolumesToVolumeAccessGroup enables you to add
 * volumes to a specified volume access group.
 **/

public class AddVolumesToVolumeAccessGroupRequest implements Serializable {

    public static final long serialVersionUID = -6688834230373210984L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("volumes") private Long[] volumes;
    // empty constructor
    @Since("7.0")
    public AddVolumesToVolumeAccessGroupRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddVolumesToVolumeAccessGroupRequest(
        Long volumeAccessGroupID,
        Long[] volumes
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.volumes = volumes;
    }

    /** 
     * The ID of the volume access group to which volumes are added.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
   
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    /** 
     * The list of volumes to add to the volume access
     * group.
     **/
    public Long[] getVolumes() { return this.volumes; }
   
    public void setVolumes(Long[] volumes) { 
        this.volumes = volumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddVolumesToVolumeAccessGroupRequest that = (AddVolumesToVolumeAccessGroupRequest) o;

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
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(gson.toJson(volumeAccessGroupID)).append(",");
        sb.append(" volumes : ").append(gson.toJson(Arrays.toString(volumes))).append(",");
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

        public AddVolumesToVolumeAccessGroupRequest build() {
            return new AddVolumesToVolumeAccessGroupRequest (
                         this.volumeAccessGroupID,
                         this.volumes);
        }

        private AddVolumesToVolumeAccessGroupRequest.Builder buildFrom(final AddVolumesToVolumeAccessGroupRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.volumes = req.volumes;

            return this;
        }

        public AddVolumesToVolumeAccessGroupRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public AddVolumesToVolumeAccessGroupRequest.Builder volumes(final Long[] volumes) {
            this.volumes = volumes;
            return this;
        }

    }
}
