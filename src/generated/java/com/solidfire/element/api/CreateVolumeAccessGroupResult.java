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
 * CreateVolumeAccessGroupResult  
 **/

public class CreateVolumeAccessGroupResult implements Serializable {

    public static final long serialVersionUID = -3703710454092842045L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("volumeAccessGroup") private Optional<VolumeAccessGroup> volumeAccessGroup;

    // empty constructor
    @Since("7.0")
    public CreateVolumeAccessGroupResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateVolumeAccessGroupResult(
        Long volumeAccessGroupID,
        Optional<VolumeAccessGroup> volumeAccessGroup
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.volumeAccessGroup = (volumeAccessGroup == null) ? Optional.<VolumeAccessGroup>empty() : volumeAccessGroup;
    }

    /** 
     * The ID for the newly-created volume access group.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    /** 
     * 
     **/
    public Optional<VolumeAccessGroup> getVolumeAccessGroup() { return this.volumeAccessGroup; }
    public void setVolumeAccessGroup(Optional<VolumeAccessGroup> volumeAccessGroup) { 
        this.volumeAccessGroup = (volumeAccessGroup == null) ? Optional.<VolumeAccessGroup>empty() : volumeAccessGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateVolumeAccessGroupResult that = (CreateVolumeAccessGroupResult) o;

        return 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) && 
            Objects.equals(volumeAccessGroup, that.volumeAccessGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID,volumeAccessGroup );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("volumeAccessGroup", volumeAccessGroup);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        if(null != volumeAccessGroup && volumeAccessGroup.isPresent()){
            sb.append(" volumeAccessGroup : ").append(volumeAccessGroup).append(",");
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
        private Long volumeAccessGroupID;
        private Optional<VolumeAccessGroup> volumeAccessGroup;

        private Builder() { }

        public CreateVolumeAccessGroupResult build() {
            return new CreateVolumeAccessGroupResult (
                         this.volumeAccessGroupID,
                         this.volumeAccessGroup);
        }

        private CreateVolumeAccessGroupResult.Builder buildFrom(final CreateVolumeAccessGroupResult req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.volumeAccessGroup = req.volumeAccessGroup;

            return this;
        }

        public CreateVolumeAccessGroupResult.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public CreateVolumeAccessGroupResult.Builder optional(final VolumeAccessGroup volumeAccessGroup) {
            this.volumeAccessGroup = (volumeAccessGroup == null) ? Optional.<VolumeAccessGroup>empty() : Optional.of(volumeAccessGroup);
            return this;
        }

    }
}
