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

public class ListVolumeStatsByVolumeAccessGroupRequest implements Serializable {

    public static final long serialVersionUID = -1261879009386913207L;
    @SerializedName("volumeAccessGroups") private Optional<Long[]> volumeAccessGroups;

    // empty constructor
    @Since("7.0")
    public ListVolumeStatsByVolumeAccessGroupRequest() {}

    // parameterized constructor
    @Since("7.0")
    public ListVolumeStatsByVolumeAccessGroupRequest(
        Optional<Long[]> volumeAccessGroups
    )
    {
        this.volumeAccessGroups = (volumeAccessGroups == null) ? Optional.<Long[]>empty() : volumeAccessGroups;
    }

    /** 
     * An array of VolumeAccessGroupIDs for which volume activity is returned.
     * If no VolumeAccessGroupID is specified, stats for all volume access groups is returned.
     **/
    public Optional<Long[]> getVolumeAccessGroups() { return this.volumeAccessGroups; }
    public void setVolumeAccessGroups(Optional<Long[]> volumeAccessGroups) { 
        this.volumeAccessGroups = (volumeAccessGroups == null) ? Optional.<Long[]>empty() : volumeAccessGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumeStatsByVolumeAccessGroupRequest that = (ListVolumeStatsByVolumeAccessGroupRequest) o;
        return 
            Arrays.equals(volumeAccessGroups, that.volumeAccessGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroups );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroups", volumeAccessGroups);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != volumeAccessGroups && volumeAccessGroups.isPresent()){
            sb.append(" volumeAccessGroups : ").append(volumeAccessGroups.get()).append(",");
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
        private Optional<Long[]> volumeAccessGroups;

        private Builder() { }

        public ListVolumeStatsByVolumeAccessGroupRequest build() {
            return new ListVolumeStatsByVolumeAccessGroupRequest (
                         this.volumeAccessGroups);
        }

        private ListVolumeStatsByVolumeAccessGroupRequest.Builder buildFrom(final ListVolumeStatsByVolumeAccessGroupRequest req) {
            this.volumeAccessGroups = req.volumeAccessGroups;

            return this;
        }

        public ListVolumeStatsByVolumeAccessGroupRequest.Builder optionalVolumeAccessGroups(final Long[] volumeAccessGroups) {
            this.volumeAccessGroups = (volumeAccessGroups == null) ? Optional.<Long[]>empty() : Optional.of(volumeAccessGroups);
            return this;
        }

    }
}
