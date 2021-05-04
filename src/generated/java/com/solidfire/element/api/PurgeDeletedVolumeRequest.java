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
 * PurgeDeletedVolumeRequest  
 * PurgeDeletedVolume immediately and permanently purges a volume that has been deleted. You must delete a volume using
 * DeleteVolume before it can be purged. Volumes are purged automatically after a period of time, so usage of this method is not
 * typically required.
 **/

public class PurgeDeletedVolumeRequest implements Serializable {

    public static final long serialVersionUID = -2755628554746102799L;
    @SerializedName("volumeID") private Long volumeID;
    // empty constructor
    @Since("7.0")
    public PurgeDeletedVolumeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public PurgeDeletedVolumeRequest(
        Long volumeID
    )
    {
        this.volumeID = volumeID;
    }

    /** 
     * The ID of the volume to be purged.
     **/
    public Long getVolumeID() { return this.volumeID; }
   
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PurgeDeletedVolumeRequest that = (PurgeDeletedVolumeRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(gson.toJson(volumeID)).append(",");
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
        private Long volumeID;

        private Builder() { }

        public PurgeDeletedVolumeRequest build() {
            return new PurgeDeletedVolumeRequest (
                         this.volumeID);
        }

        private PurgeDeletedVolumeRequest.Builder buildFrom(final PurgeDeletedVolumeRequest req) {
            this.volumeID = req.volumeID;

            return this;
        }

        public PurgeDeletedVolumeRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

    }
}
