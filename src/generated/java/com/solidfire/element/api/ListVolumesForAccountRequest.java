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
 * ListVolumesForAccountRequest  
 * ListVolumesForAccount returns the list of active AND (pending) deleted volumes for an account.
 **/

public class ListVolumesForAccountRequest implements Serializable {

    public static final long serialVersionUID = -1670455153649335890L;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("startVolumeID") private Optional<Long> startVolumeID;
    @SerializedName("limit") private Optional<Long> limit;

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

    /** 
     * The ID of the account to list the volumes for.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumesForAccountRequest that = (ListVolumesForAccountRequest) o;

        return 
            Objects.equals(accountID, that.accountID) && 
            Objects.equals(startVolumeID, that.startVolumeID) && 
            Objects.equals(limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountID,startVolumeID,limit );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountID", accountID);
        map.put("startVolumeID", startVolumeID);
        map.put("limit", limit);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" accountID : ").append(accountID).append(",");
        if(null != startVolumeID && startVolumeID.isPresent()){
            sb.append(" startVolumeID : ").append(startVolumeID).append(",");
        }
        if(null != limit && limit.isPresent()){
            sb.append(" limit : ").append(limit).append(",");
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

        private Builder() { }

        public ListVolumesForAccountRequest build() {
            return new ListVolumesForAccountRequest (
                         this.accountID,
                         this.startVolumeID,
                         this.limit);
        }

        private ListVolumesForAccountRequest.Builder buildFrom(final ListVolumesForAccountRequest req) {
            this.accountID = req.accountID;
            this.startVolumeID = req.startVolumeID;
            this.limit = req.limit;

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

    }
}
