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

public class GetVolumeAccessGroupEfficiencyRequest implements Serializable {

    public static final long serialVersionUID = -2608069424773464920L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;

    // empty constructor
    @Since("7.0")
    public GetVolumeAccessGroupEfficiencyRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetVolumeAccessGroupEfficiencyRequest(
        Long volumeAccessGroupID
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
    }

    /** 
     * Specifies the volume access group for which capacity is computed.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetVolumeAccessGroupEfficiencyRequest that = (GetVolumeAccessGroupEfficiencyRequest) o;

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

        public GetVolumeAccessGroupEfficiencyRequest build() {
            return new GetVolumeAccessGroupEfficiencyRequest (
                         this.volumeAccessGroupID);
        }

        private GetVolumeAccessGroupEfficiencyRequest.Builder buildFrom(final GetVolumeAccessGroupEfficiencyRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;

            return this;
        }

        public GetVolumeAccessGroupEfficiencyRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

    }
}
