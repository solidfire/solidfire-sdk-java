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
 * RestoreDeletedVolumeRequest  
 * RestoreDeletedVolume marks a deleted volume as active again. This action makes the volume immediately available for iSCSI connection.
 **/

public class RestoreDeletedVolumeRequest implements Serializable {

    public static final long serialVersionUID = -7965212706191378862L;
    @SerializedName("volumeID") private Long volumeID;
    // empty constructor
    @Since("7.0")
    public RestoreDeletedVolumeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RestoreDeletedVolumeRequest(
        Long volumeID
    )
    {
        this.volumeID = volumeID;
    }

    /** 
     * VolumeID of the deleted volume to be restored.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RestoreDeletedVolumeRequest that = (RestoreDeletedVolumeRequest) o;

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
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
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

        public RestoreDeletedVolumeRequest build() {
            return new RestoreDeletedVolumeRequest (
                         this.volumeID);
        }

        private RestoreDeletedVolumeRequest.Builder buildFrom(final RestoreDeletedVolumeRequest req) {
            this.volumeID = req.volumeID;

            return this;
        }

        public RestoreDeletedVolumeRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

    }
}
