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

public class GetVolumeAccessGroupLunAssignmentsResult implements Serializable {

    public static final long serialVersionUID = 7463507992215591007L;
    @SerializedName("volumeAccessGroupLunAssignments") private VolumeAccessGroupLunAssignments volumeAccessGroupLunAssignments;

    // empty constructor
    @Since("7.0")
    public GetVolumeAccessGroupLunAssignmentsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetVolumeAccessGroupLunAssignmentsResult(
        VolumeAccessGroupLunAssignments volumeAccessGroupLunAssignments
    )
    {
        this.volumeAccessGroupLunAssignments = volumeAccessGroupLunAssignments;
    }

    /** 
     * List of all physical Fibre Channel ports, or a port for a single node.
     **/
    public VolumeAccessGroupLunAssignments getVolumeAccessGroupLunAssignments() { return this.volumeAccessGroupLunAssignments; }
    public void setVolumeAccessGroupLunAssignments(VolumeAccessGroupLunAssignments volumeAccessGroupLunAssignments) { 
        this.volumeAccessGroupLunAssignments = volumeAccessGroupLunAssignments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetVolumeAccessGroupLunAssignmentsResult that = (GetVolumeAccessGroupLunAssignmentsResult) o;

        return 
            Objects.equals(volumeAccessGroupLunAssignments, that.volumeAccessGroupLunAssignments);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupLunAssignments );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroupLunAssignments", volumeAccessGroupLunAssignments);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupLunAssignments : ").append(volumeAccessGroupLunAssignments).append(",");
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
        private VolumeAccessGroupLunAssignments volumeAccessGroupLunAssignments;

        private Builder() { }

        public GetVolumeAccessGroupLunAssignmentsResult build() {
            return new GetVolumeAccessGroupLunAssignmentsResult (
                         this.volumeAccessGroupLunAssignments);
        }

        private GetVolumeAccessGroupLunAssignmentsResult.Builder buildFrom(final GetVolumeAccessGroupLunAssignmentsResult req) {
            this.volumeAccessGroupLunAssignments = req.volumeAccessGroupLunAssignments;

            return this;
        }

        public GetVolumeAccessGroupLunAssignmentsResult.Builder volumeAccessGroupLunAssignments(final VolumeAccessGroupLunAssignments volumeAccessGroupLunAssignments) {
            this.volumeAccessGroupLunAssignments = volumeAccessGroupLunAssignments;
            return this;
        }

    }
}
