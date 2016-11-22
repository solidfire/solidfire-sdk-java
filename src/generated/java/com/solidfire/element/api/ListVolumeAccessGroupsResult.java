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

public class ListVolumeAccessGroupsResult implements Serializable {

    public static final long serialVersionUID = 1766897459L;
    @SerializedName("volumeAccessGroups") private VolumeAccessGroup[] volumeAccessGroups;
    @SerializedName("volumeAccessGroupsNotFound") private Long[] volumeAccessGroupsNotFound;

    // empty constructor
    @Since("7.0")
    public ListVolumeAccessGroupsResult() {}

    // parameterized constructor
    @Since("7.0")
    public ListVolumeAccessGroupsResult(
        VolumeAccessGroup[] volumeAccessGroups,
        Long[] volumeAccessGroupsNotFound
    )
    {
        this.volumeAccessGroups = volumeAccessGroups;
        this.volumeAccessGroupsNotFound = volumeAccessGroupsNotFound;
    }

    /** 
     * A list of objects describing each volume access group.
     **/
    public VolumeAccessGroup[] getVolumeAccessGroups() { return this.volumeAccessGroups; }
    public void setVolumeAccessGroups(VolumeAccessGroup[] volumeAccessGroups) { 
        this.volumeAccessGroups = volumeAccessGroups;
    }
    /** 
     * A list of volume access groups not found by the system. Present if you used the "volumeAccessGroups" parameter and the system was unable to find one or more volume access groups that you specified.
     **/
    public Long[] getVolumeAccessGroupsNotFound() { return this.volumeAccessGroupsNotFound; }
    public void setVolumeAccessGroupsNotFound(Long[] volumeAccessGroupsNotFound) { 
        this.volumeAccessGroupsNotFound = volumeAccessGroupsNotFound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumeAccessGroupsResult that = (ListVolumeAccessGroupsResult) o;
        return 
            Arrays.equals(volumeAccessGroups, that.volumeAccessGroups) &&
            Arrays.equals(volumeAccessGroupsNotFound, that.volumeAccessGroupsNotFound);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])volumeAccessGroups, (Object[])volumeAccessGroupsNotFound );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroups", volumeAccessGroups);
        map.put("volumeAccessGroupsNotFound", volumeAccessGroupsNotFound);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroups : ").append(Arrays.toString(volumeAccessGroups)).append(",");
        sb.append(" volumeAccessGroupsNotFound : ").append(Arrays.toString(volumeAccessGroupsNotFound)).append(",");
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
        private VolumeAccessGroup[] volumeAccessGroups;
        private Long[] volumeAccessGroupsNotFound;

        private Builder() { }

        public ListVolumeAccessGroupsResult build() {
            return new ListVolumeAccessGroupsResult (
                         this.volumeAccessGroups,
                         this.volumeAccessGroupsNotFound);
        }

        private ListVolumeAccessGroupsResult.Builder buildFrom(final ListVolumeAccessGroupsResult req) {
            this.volumeAccessGroups = req.volumeAccessGroups;
            this.volumeAccessGroupsNotFound = req.volumeAccessGroupsNotFound;

            return this;
        }

        public ListVolumeAccessGroupsResult.Builder volumeAccessGroups(final VolumeAccessGroup[] volumeAccessGroups) {
            this.volumeAccessGroups = volumeAccessGroups;
            return this;
        }

        public ListVolumeAccessGroupsResult.Builder volumeAccessGroupsNotFound(final Long[] volumeAccessGroupsNotFound) {
            this.volumeAccessGroupsNotFound = volumeAccessGroupsNotFound;
            return this;
        }

    }
}
