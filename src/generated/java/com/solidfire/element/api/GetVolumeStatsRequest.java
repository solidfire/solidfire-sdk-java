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
 * GetVolumeStatsRequest  
 **/

public class GetVolumeStatsRequest implements Serializable {

    public static final long serialVersionUID = 1223689704598366419L;
    @SerializedName("volumeID") private Long volumeID;

    // empty constructor
    @Since("7.0")
    public GetVolumeStatsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetVolumeStatsRequest(
        Long volumeID
    )
    {
        this.volumeID = volumeID;
    }

    /** 
     * Specifies the volume for which statistics is gathered.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetVolumeStatsRequest that = (GetVolumeStatsRequest) o;

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

        public GetVolumeStatsRequest build() {
            return new GetVolumeStatsRequest (
                         this.volumeID);
        }

        private GetVolumeStatsRequest.Builder buildFrom(final GetVolumeStatsRequest req) {
            this.volumeID = req.volumeID;

            return this;
        }

        public GetVolumeStatsRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

    }
}
