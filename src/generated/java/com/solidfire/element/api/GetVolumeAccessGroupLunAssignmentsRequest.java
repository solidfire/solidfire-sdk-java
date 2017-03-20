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
 * GetVolumeAccessGroupLunAssignmentsRequest  
 * The GetVolumeAccessGroupLunAssignments is used to return information LUN mappings of a specified volume access group.
 **/

public class GetVolumeAccessGroupLunAssignmentsRequest implements Serializable {

    public static final long serialVersionUID = -5760890499027616714L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;

    // empty constructor
    @Since("7.0")
    public GetVolumeAccessGroupLunAssignmentsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetVolumeAccessGroupLunAssignmentsRequest(
        Long volumeAccessGroupID
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
    }

    /** 
     * Unique volume access group ID used to return information.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetVolumeAccessGroupLunAssignmentsRequest that = (GetVolumeAccessGroupLunAssignmentsRequest) o;

        return 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
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

        private Builder() { }

        public GetVolumeAccessGroupLunAssignmentsRequest build() {
            return new GetVolumeAccessGroupLunAssignmentsRequest (
                         this.volumeAccessGroupID);
        }

        private GetVolumeAccessGroupLunAssignmentsRequest.Builder buildFrom(final GetVolumeAccessGroupLunAssignmentsRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;

            return this;
        }

        public GetVolumeAccessGroupLunAssignmentsRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

    }
}
