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
 **/

public class ListVirtualVolumesRequest implements Serializable {

    public static final long serialVersionUID = -1561321066464562588L;
    @SerializedName("details") private Optional<Boolean> details;
    @SerializedName("limit") private Optional<Long> limit;
    @SerializedName("recursive") private Optional<Boolean> recursive;
    @SerializedName("startVirtualVolumeID") private Optional<java.util.UUID> startVirtualVolumeID;
    @SerializedName("virtualVolumeIDs") private Optional<java.util.UUID[]> virtualVolumeIDs;

    // empty constructor
    @Since("7.0")
    public ListVirtualVolumesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVirtualVolumesRequest(
        Optional<Boolean> details,
        Optional<Long> limit,
        Optional<Boolean> recursive,
        Optional<java.util.UUID> startVirtualVolumeID,
        Optional<java.util.UUID[]> virtualVolumeIDs
    )
    {
        this.details = (details == null) ? Optional.<Boolean>empty() : details;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
        this.recursive = (recursive == null) ? Optional.<Boolean>empty() : recursive;
        this.startVirtualVolumeID = (startVirtualVolumeID == null) ? Optional.<java.util.UUID>empty() : startVirtualVolumeID;
        this.virtualVolumeIDs = (virtualVolumeIDs == null) ? Optional.<java.util.UUID[]>empty() : virtualVolumeIDs;
    }

    /** 
     * Possible values:true: Include more details about each VVOL in the response.false: Include the standard level of detail about each VVOL in the response.
     **/
    public Optional<Boolean> getDetails() { return this.details; }
    public void setDetails(Optional<Boolean> details) { 
        this.details = (details == null) ? Optional.<Boolean>empty() : details;
    }
    /** 
     * The maximum number of virtual volumes to list.
     **/
    public Optional<Long> getLimit() { return this.limit; }
    public void setLimit(Optional<Long> limit) { 
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }
    /** 
     * Possible values:true: Include information about the children of each VVOL in the response.false: Do not include information about the children of each VVOL in the response.
     **/
    public Optional<Boolean> getRecursive() { return this.recursive; }
    public void setRecursive(Optional<Boolean> recursive) { 
        this.recursive = (recursive == null) ? Optional.<Boolean>empty() : recursive;
    }
    /** 
     * The ID of the virtual volume at which to begin the list.
     **/
    public Optional<java.util.UUID> getStartVirtualVolumeID() { return this.startVirtualVolumeID; }
    public void setStartVirtualVolumeID(Optional<java.util.UUID> startVirtualVolumeID) { 
        this.startVirtualVolumeID = (startVirtualVolumeID == null) ? Optional.<java.util.UUID>empty() : startVirtualVolumeID;
    }
    /** 
     * A list of virtual volume  IDs for which to retrieve information. If you specify this parameter, the method returns information about only these virtual volumes.
     **/
    public Optional<java.util.UUID[]> getVirtualVolumeIDs() { return this.virtualVolumeIDs; }
    public void setVirtualVolumeIDs(Optional<java.util.UUID[]> virtualVolumeIDs) { 
        this.virtualVolumeIDs = (virtualVolumeIDs == null) ? Optional.<java.util.UUID[]>empty() : virtualVolumeIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualVolumesRequest that = (ListVirtualVolumesRequest) o;

        return 
            Objects.equals(details, that.details) && 
            Objects.equals(limit, that.limit) && 
            Objects.equals(recursive, that.recursive) && 
            Objects.equals(startVirtualVolumeID, that.startVirtualVolumeID) && 
            Objects.equals(virtualVolumeIDs, that.virtualVolumeIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( details,limit,recursive,startVirtualVolumeID,virtualVolumeIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("details", details);
        map.put("limit", limit);
        map.put("recursive", recursive);
        map.put("startVirtualVolumeID", startVirtualVolumeID);
        map.put("virtualVolumeIDs", virtualVolumeIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != details && details.isPresent()){
            sb.append(" details : ").append(details).append(",");
        }
        if(null != limit && limit.isPresent()){
            sb.append(" limit : ").append(limit).append(",");
        }
        if(null != recursive && recursive.isPresent()){
            sb.append(" recursive : ").append(recursive).append(",");
        }
        if(null != startVirtualVolumeID && startVirtualVolumeID.isPresent()){
            sb.append(" startVirtualVolumeID : ").append(startVirtualVolumeID).append(",");
        }
        if(null != virtualVolumeIDs && virtualVolumeIDs.isPresent()){
            sb.append(" virtualVolumeIDs : ").append(virtualVolumeIDs).append(",");
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
        private Optional<Boolean> details;
        private Optional<Long> limit;
        private Optional<Boolean> recursive;
        private Optional<java.util.UUID> startVirtualVolumeID;
        private Optional<java.util.UUID[]> virtualVolumeIDs;

        private Builder() { }

        public ListVirtualVolumesRequest build() {
            return new ListVirtualVolumesRequest (
                         this.details,
                         this.limit,
                         this.recursive,
                         this.startVirtualVolumeID,
                         this.virtualVolumeIDs);
        }

        private ListVirtualVolumesRequest.Builder buildFrom(final ListVirtualVolumesRequest req) {
            this.details = req.details;
            this.limit = req.limit;
            this.recursive = req.recursive;
            this.startVirtualVolumeID = req.startVirtualVolumeID;
            this.virtualVolumeIDs = req.virtualVolumeIDs;

            return this;
        }

        public ListVirtualVolumesRequest.Builder optionalDetails(final Boolean details) {
            this.details = (details == null) ? Optional.<Boolean>empty() : Optional.of(details);
            return this;
        }

        public ListVirtualVolumesRequest.Builder optionalLimit(final Long limit) {
            this.limit = (limit == null) ? Optional.<Long>empty() : Optional.of(limit);
            return this;
        }

        public ListVirtualVolumesRequest.Builder optionalRecursive(final Boolean recursive) {
            this.recursive = (recursive == null) ? Optional.<Boolean>empty() : Optional.of(recursive);
            return this;
        }

        public ListVirtualVolumesRequest.Builder optionalStartVirtualVolumeID(final java.util.UUID startVirtualVolumeID) {
            this.startVirtualVolumeID = (startVirtualVolumeID == null) ? Optional.<java.util.UUID>empty() : Optional.of(startVirtualVolumeID);
            return this;
        }

        public ListVirtualVolumesRequest.Builder optionalVirtualVolumeIDs(final java.util.UUID[] virtualVolumeIDs) {
            this.virtualVolumeIDs = (virtualVolumeIDs == null) ? Optional.<java.util.UUID[]>empty() : Optional.of(virtualVolumeIDs);
            return this;
        }

    }
}
