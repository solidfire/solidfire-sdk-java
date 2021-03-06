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
 * ListVolumesForAccountRequest  
 * ListVolumesForAccount returns the list of active and (pending) deleted volumes for an account.
 **/

public class ListVolumesForAccountRequest implements Serializable {

    public static final long serialVersionUID = 1116235882734239902L;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("startVolumeID") private Optional<Long> startVolumeID;
    @SerializedName("limit") private Optional<Long> limit;
    @SerializedName("includeVirtualVolumes") private Optional<Boolean> includeVirtualVolumes;
    // empty constructor
    @Since("7.0")
    public ListVolumesForAccountRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVolumesForAccountRequest(
        Long accountID,
        Optional<Long> startVolumeID,
        Optional<Long> limit
    )
    {
        this.accountID = accountID;
        this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : startVolumeID;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }
    // parameterized constructor
    @Since("9.0")
    public ListVolumesForAccountRequest(
        Long accountID,
        Optional<Long> startVolumeID,
        Optional<Long> limit,
        Optional<Boolean> includeVirtualVolumes
    )
    {
        this.accountID = accountID;
        this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : startVolumeID;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
        this.includeVirtualVolumes = (includeVirtualVolumes == null) ? Optional.<Boolean>empty() : includeVirtualVolumes;
    }

    /** 
     * Returns all volumes owned by this AccountID.
     **/
    public Long getAccountID() { return this.accountID; }
   
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     * The ID of the first volume to list.
     * This can be useful for paging results.
     * By default, this starts at the lowest VolumeID.
     **/
    public Optional<Long> getStartVolumeID() { return this.startVolumeID; }
   
    public void setStartVolumeID(Optional<Long> startVolumeID) { 
        this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : startVolumeID;
    }
    /** 
     * The maximum number of volumes to return from the API.
     **/
    public Optional<Long> getLimit() { return this.limit; }
   
    public void setLimit(Optional<Long> limit) { 
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }
    /** 
     * Specifies that virtual volumes are included in the response by default.
     * To exclude virtual volumes, set to false.
     **/
    public Optional<Boolean> getIncludeVirtualVolumes() { return this.includeVirtualVolumes; }
   
    public void setIncludeVirtualVolumes(Optional<Boolean> includeVirtualVolumes) { 
        this.includeVirtualVolumes = (includeVirtualVolumes == null) ? Optional.<Boolean>empty() : includeVirtualVolumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumesForAccountRequest that = (ListVolumesForAccountRequest) o;

        return 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(startVolumeID, that.startVolumeID) && 
            Objects.equals(limit, that.limit) && 
            Objects.equals(includeVirtualVolumes, that.includeVirtualVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID,startVolumeID,limit,includeVirtualVolumes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountID", accountID);
        map.put("startVolumeID", startVolumeID);
        map.put("limit", limit);
        map.put("includeVirtualVolumes", includeVirtualVolumes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" accountID : ").append(gson.toJson(accountID)).append(",");
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
        if(null != includeVirtualVolumes && includeVirtualVolumes.isPresent()){
            sb.append(" includeVirtualVolumes : ").append(gson.toJson(includeVirtualVolumes)).append(",");
        }
        else{
            sb.append(" includeVirtualVolumes : ").append("null").append(",");
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
        private Long accountID;
        private Optional<Long> startVolumeID;
        private Optional<Long> limit;
        private Optional<Boolean> includeVirtualVolumes;

        private Builder() { }

        public ListVolumesForAccountRequest build() {
            return new ListVolumesForAccountRequest (
                         this.accountID,
                         this.startVolumeID,
                         this.limit,
                         this.includeVirtualVolumes);
        }

        private ListVolumesForAccountRequest.Builder buildFrom(final ListVolumesForAccountRequest req) {
            this.accountID = req.accountID;
            this.startVolumeID = req.startVolumeID;
            this.limit = req.limit;
            this.includeVirtualVolumes = req.includeVirtualVolumes;

            return this;
        }

        public ListVolumesForAccountRequest.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public ListVolumesForAccountRequest.Builder optionalStartVolumeID(final Long startVolumeID) {
            this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : Optional.of(startVolumeID);
            return this;
        }

        public ListVolumesForAccountRequest.Builder optionalLimit(final Long limit) {
            this.limit = (limit == null) ? Optional.<Long>empty() : Optional.of(limit);
            return this;
        }

        public ListVolumesForAccountRequest.Builder optionalIncludeVirtualVolumes(final Boolean includeVirtualVolumes) {
            this.includeVirtualVolumes = (includeVirtualVolumes == null) ? Optional.<Boolean>empty() : Optional.of(includeVirtualVolumes);
            return this;
        }

    }
}
