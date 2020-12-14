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
 * ListActivePairedVolumesRequest  
 * ListActivePairedVolumes enables you to list all the active volumes paired with a volume. This method returns information about volumes with active and pending pairings.
 **/

public class ListActivePairedVolumesRequest implements Serializable {

    public static final long serialVersionUID = 6136511316053406527L;
    @SerializedName("startVolumeID") private Optional<Long> startVolumeID;
    @SerializedName("limit") private Optional<Long> limit;
    // empty constructor
    @Since("7.0")
    public ListActivePairedVolumesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListActivePairedVolumesRequest(
        Optional<Long> startVolumeID,
        Optional<Long> limit
    )
    {
        this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : startVolumeID;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }

    /** 
     * The beginning of the range of active paired volumes to return.
     **/
    public Optional<Long> getStartVolumeID() { return this.startVolumeID; }
   
    public void setStartVolumeID(Optional<Long> startVolumeID) { 
        this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : startVolumeID;
    }
    /** 
     * Maximum number of active paired volumes to return.
     **/
    public Optional<Long> getLimit() { return this.limit; }
   
    public void setLimit(Optional<Long> limit) { 
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListActivePairedVolumesRequest that = (ListActivePairedVolumesRequest) o;

        return 
            Objects.equals(startVolumeID, that.startVolumeID) && 
            Objects.equals(limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash( startVolumeID,limit );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("startVolumeID", startVolumeID);
        map.put("limit", limit);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != startVolumeID && startVolumeID.isPresent()){
            sb.append(" startVolumeID : ").append(gson.toJson(startVolumeID)).append(",");
        }
        else{
            sb.append(" startVolumeID : ").append("null").append(",");
        }
        if(null != limit && limit.isPresent()){
            sb.append(" limit : ").append(gson.toJson(limit)).append(",");
        }
        else{
            sb.append(" limit : ").append("null").append(",");
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
        private Optional<Long> startVolumeID;
        private Optional<Long> limit;

        private Builder() { }

        public ListActivePairedVolumesRequest build() {
            return new ListActivePairedVolumesRequest (
                         this.startVolumeID,
                         this.limit);
        }

        private ListActivePairedVolumesRequest.Builder buildFrom(final ListActivePairedVolumesRequest req) {
            this.startVolumeID = req.startVolumeID;
            this.limit = req.limit;

            return this;
        }

        public ListActivePairedVolumesRequest.Builder optionalStartVolumeID(final Long startVolumeID) {
            this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : Optional.of(startVolumeID);
            return this;
        }

        public ListActivePairedVolumesRequest.Builder optionalLimit(final Long limit) {
            this.limit = (limit == null) ? Optional.<Long>empty() : Optional.of(limit);
            return this;
        }

    }
}
