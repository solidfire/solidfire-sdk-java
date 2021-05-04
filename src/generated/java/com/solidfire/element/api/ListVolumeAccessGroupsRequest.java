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
 * ListVolumeAccessGroupsRequest  
 * ListVolumeAccessGroups enables you to return
 * information about the volume access groups that are
 * currently in the system.
 **/

public class ListVolumeAccessGroupsRequest implements Serializable {

    public static final long serialVersionUID = -7214509188999384185L;
    @SerializedName("startVolumeAccessGroupID") private Optional<Long> startVolumeAccessGroupID;
    @SerializedName("limit") private Optional<Long> limit;
    @SerializedName("volumeAccessGroups") private Optional<Long[]> volumeAccessGroups;
    // empty constructor
    @Since("7.0")
    public ListVolumeAccessGroupsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVolumeAccessGroupsRequest(
        Optional<Long> startVolumeAccessGroupID,
        Optional<Long> limit,
        Optional<Long[]> volumeAccessGroups
    )
    {
        this.startVolumeAccessGroupID = (startVolumeAccessGroupID == null) ? Optional.<Long>empty() : startVolumeAccessGroupID;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
        this.volumeAccessGroups = (volumeAccessGroups == null) ? Optional.<Long[]>empty() : volumeAccessGroups;
    }

    /** 
     * The volume access group ID at which to begin the listing. If unspecified, there is no lower limit (implicitly 0).
     **/
    public Optional<Long> getStartVolumeAccessGroupID() { return this.startVolumeAccessGroupID; }
   
    public void setStartVolumeAccessGroupID(Optional<Long> startVolumeAccessGroupID) { 
        this.startVolumeAccessGroupID = (startVolumeAccessGroupID == null) ? Optional.<Long>empty() : startVolumeAccessGroupID;
    }
    /** 
     * The maximum number of results to return. This can be
     * useful for paging.
     **/
    public Optional<Long> getLimit() { return this.limit; }
   
    public void setLimit(Optional<Long> limit) { 
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }
    /** 
     * The list of ids of the volume access groups you wish to list
     **/
    public Optional<Long[]> getVolumeAccessGroups() { return this.volumeAccessGroups; }
   
    public void setVolumeAccessGroups(Optional<Long[]> volumeAccessGroups) { 
        this.volumeAccessGroups = (volumeAccessGroups == null) ? Optional.<Long[]>empty() : volumeAccessGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumeAccessGroupsRequest that = (ListVolumeAccessGroupsRequest) o;

        return 
            Objects.equals(startVolumeAccessGroupID, that.startVolumeAccessGroupID) && 
            Objects.equals(limit, that.limit) && 
            Objects.equals(volumeAccessGroups, that.volumeAccessGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash( startVolumeAccessGroupID,limit,volumeAccessGroups );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("startVolumeAccessGroupID", startVolumeAccessGroupID);
        map.put("limit", limit);
        map.put("volumeAccessGroups", volumeAccessGroups);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != startVolumeAccessGroupID && startVolumeAccessGroupID.isPresent()){
            sb.append(" startVolumeAccessGroupID : ").append(gson.toJson(startVolumeAccessGroupID)).append(",");
        }
        else{
            sb.append(" startVolumeAccessGroupID : ").append("null").append(",");
        }
        if(null != limit && limit.isPresent()){
            sb.append(" limit : ").append(gson.toJson(limit)).append(",");
        }
        else{
            sb.append(" limit : ").append("null").append(",");
        }
        if(null != volumeAccessGroups && volumeAccessGroups.isPresent()){
            sb.append(" volumeAccessGroups : ").append(gson.toJson(volumeAccessGroups)).append(",");
        }
        else{
            sb.append(" volumeAccessGroups : ").append("null").append(",");
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
        private Optional<Long> startVolumeAccessGroupID;
        private Optional<Long> limit;
        private Optional<Long[]> volumeAccessGroups;

        private Builder() { }

        public ListVolumeAccessGroupsRequest build() {
            return new ListVolumeAccessGroupsRequest (
                         this.startVolumeAccessGroupID,
                         this.limit,
                         this.volumeAccessGroups);
        }

        private ListVolumeAccessGroupsRequest.Builder buildFrom(final ListVolumeAccessGroupsRequest req) {
            this.startVolumeAccessGroupID = req.startVolumeAccessGroupID;
            this.limit = req.limit;
            this.volumeAccessGroups = req.volumeAccessGroups;

            return this;
        }

        public ListVolumeAccessGroupsRequest.Builder optionalStartVolumeAccessGroupID(final Long startVolumeAccessGroupID) {
            this.startVolumeAccessGroupID = (startVolumeAccessGroupID == null) ? Optional.<Long>empty() : Optional.of(startVolumeAccessGroupID);
            return this;
        }

        public ListVolumeAccessGroupsRequest.Builder optionalLimit(final Long limit) {
            this.limit = (limit == null) ? Optional.<Long>empty() : Optional.of(limit);
            return this;
        }

        public ListVolumeAccessGroupsRequest.Builder optionalVolumeAccessGroups(final Long[] volumeAccessGroups) {
            this.volumeAccessGroups = (volumeAccessGroups == null) ? Optional.<Long[]>empty() : Optional.of(volumeAccessGroups);
            return this;
        }

    }
}
