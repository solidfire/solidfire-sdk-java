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
 * ListVolumeStatsRequest  
 * ListVolumeStats returns high-level activity measurements for a single volume, list of volumes, or all volumes (if you omit the volumeIDs parameter). Measurement values are cumulative from the creation of the volume.
 **/

public class ListVolumeStatsRequest implements Serializable {

    public static final long serialVersionUID = -7670078818681522628L;
    @SerializedName("volumeIDs") private Optional<Long[]> volumeIDs;
    // empty constructor
    @Since("7.0")
    public ListVolumeStatsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVolumeStatsRequest(
        Optional<Long[]> volumeIDs
    )
    {
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
    }

    /** 
     * A list of volume IDs of volumes from which to retrieve activity information.
     **/
    public Optional<Long[]> getVolumeIDs() { return this.volumeIDs; }
   
    public void setVolumeIDs(Optional<Long[]> volumeIDs) { 
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumeStatsRequest that = (ListVolumeStatsRequest) o;

        return 
            Objects.equals(volumeIDs, that.volumeIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeIDs", volumeIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != volumeIDs && volumeIDs.isPresent()){
            sb.append(" volumeIDs : ").append(gson.toJson(volumeIDs)).append(",");
        }
        else{
            sb.append(" volumeIDs : ").append("null").append(",");
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
        private Optional<Long[]> volumeIDs;

        private Builder() { }

        public ListVolumeStatsRequest build() {
            return new ListVolumeStatsRequest (
                         this.volumeIDs);
        }

        private ListVolumeStatsRequest.Builder buildFrom(final ListVolumeStatsRequest req) {
            this.volumeIDs = req.volumeIDs;

            return this;
        }

        public ListVolumeStatsRequest.Builder optionalVolumeIDs(final Long[] volumeIDs) {
            this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : Optional.of(volumeIDs);
            return this;
        }

    }
}
