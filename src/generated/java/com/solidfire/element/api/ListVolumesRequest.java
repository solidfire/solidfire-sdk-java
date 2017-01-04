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
 * ListVolumesRequest  
 **/

public class ListVolumesRequest implements Serializable {

    public static final long serialVersionUID = -2486206820112754562L;
    @SerializedName("startVolumeID") private Optional<VolumeID> startVolumeID;
    @SerializedName("limit") private Optional<Long> limit;
    @SerializedName("volumeStatus") private Optional<String> volumeStatus;
    @SerializedName("accounts") private Optional<AccountID[]> accounts;
    @SerializedName("isPaired") private Optional<Boolean> isPaired;
    @SerializedName("volumeIDs") private Optional<VolumeID[]> volumeIDs;

    // empty constructor
    @Since("7.0")
    public ListVolumesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVolumesRequest(
        Optional<VolumeID> startVolumeID,
        Optional<Long> limit,
        Optional<String> volumeStatus,
        Optional<AccountID[]> accounts,
        Optional<Boolean> isPaired
    )
    {
        this.startVolumeID = (startVolumeID == null) ? Optional.<VolumeID>empty() : startVolumeID;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
        this.volumeStatus = (volumeStatus == null) ? Optional.<String>empty() : volumeStatus;
        this.accounts = (accounts == null) ? Optional.<AccountID[]>empty() : accounts;
        this.isPaired = (isPaired == null) ? Optional.<Boolean>empty() : isPaired;
    }
    // parameterized constructor
    @Since("9.0")
    public ListVolumesRequest(
        Optional<VolumeID> startVolumeID,
        Optional<Long> limit,
        Optional<String> volumeStatus,
        Optional<AccountID[]> accounts,
        Optional<Boolean> isPaired,
        Optional<VolumeID[]> volumeIDs
    )
    {
        this.startVolumeID = (startVolumeID == null) ? Optional.<VolumeID>empty() : startVolumeID;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
        this.volumeStatus = (volumeStatus == null) ? Optional.<String>empty() : volumeStatus;
        this.accounts = (accounts == null) ? Optional.<AccountID[]>empty() : accounts;
        this.isPaired = (isPaired == null) ? Optional.<Boolean>empty() : isPaired;
        this.volumeIDs = (volumeIDs == null) ? Optional.<VolumeID[]>empty() : volumeIDs;
    }

    /** 
     * The ID of the first volume to list.
     * This can be useful for paging results.
     * By default, this starts at the lowest VolumeID.
     **/
    public Optional<VolumeID> getStartVolumeID() { return this.startVolumeID; }
    public void setStartVolumeID(Optional<VolumeID> startVolumeID) { 
        this.startVolumeID = (startVolumeID == null) ? Optional.<VolumeID>empty() : startVolumeID;
    }
    /** 
     * The maximum number of volumes to return from the API.
     **/
    public Optional<Long> getLimit() { return this.limit; }
    public void setLimit(Optional<Long> limit) { 
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }
    /** 
     * If specified, filter to only volumes with the provided status.
     * By default, list all volumes.
     **/
    public Optional<String> getVolumeStatus() { return this.volumeStatus; }
    public void setVolumeStatus(Optional<String> volumeStatus) { 
        this.volumeStatus = (volumeStatus == null) ? Optional.<String>empty() : volumeStatus;
    }
    /** 
     * If specified, only fetch volumes which belong to the provided accounts.
     * By default, list volumes for all accounts.
     **/
    public Optional<AccountID[]> getAccounts() { return this.accounts; }
    public void setAccounts(Optional<AccountID[]> accounts) { 
        this.accounts = (accounts == null) ? Optional.<AccountID[]>empty() : accounts;
    }
    /** 
     * If specified, only fetch volumes which are paired (if true) or non-paired (if false).
     * By default, list all volumes regardless of their pairing status.
     **/
    public Optional<Boolean> getIsPaired() { return this.isPaired; }
    public void setIsPaired(Optional<Boolean> isPaired) { 
        this.isPaired = (isPaired == null) ? Optional.<Boolean>empty() : isPaired;
    }
    /** 
     * If specified, only fetch volumes specified in this list.
     * This option cannot be specified if startVolumeID, limit, or accounts option is specified.
     **/
    public Optional<VolumeID[]> getVolumeIDs() { return this.volumeIDs; }
    public void setVolumeIDs(Optional<VolumeID[]> volumeIDs) { 
        this.volumeIDs = (volumeIDs == null) ? Optional.<VolumeID[]>empty() : volumeIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumesRequest that = (ListVolumesRequest) o;

        return 
            Objects.equals(startVolumeID, that.startVolumeID) && 
            Objects.equals(limit, that.limit) && 
            Objects.equals(volumeStatus, that.volumeStatus) && 
            Objects.equals(accounts, that.accounts) && 
            Objects.equals(isPaired, that.isPaired) && 
            Objects.equals(volumeIDs, that.volumeIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( startVolumeID,limit,volumeStatus,accounts,isPaired,volumeIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("startVolumeID", startVolumeID);
        map.put("limit", limit);
        map.put("volumeStatus", volumeStatus);
        map.put("accounts", accounts);
        map.put("isPaired", isPaired);
        map.put("volumeIDs", volumeIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != startVolumeID && startVolumeID.isPresent()){
            sb.append(" startVolumeID : ").append(startVolumeID).append(",");
        }
        if(null != limit && limit.isPresent()){
            sb.append(" limit : ").append(limit).append(",");
        }
        if(null != volumeStatus && volumeStatus.isPresent()){
            sb.append(" volumeStatus : ").append(volumeStatus).append(",");
        }
        if(null != accounts && accounts.isPresent()){
            sb.append(" accounts : ").append(accounts).append(",");
        }
        if(null != isPaired && isPaired.isPresent()){
            sb.append(" isPaired : ").append(isPaired).append(",");
        }
        if(null != volumeIDs && volumeIDs.isPresent()){
            sb.append(" volumeIDs : ").append(volumeIDs).append(",");
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
        private Optional<VolumeID> startVolumeID;
        private Optional<Long> limit;
        private Optional<String> volumeStatus;
        private Optional<AccountID[]> accounts;
        private Optional<Boolean> isPaired;
        private Optional<VolumeID[]> volumeIDs;

        private Builder() { }

        public ListVolumesRequest build() {
            return new ListVolumesRequest (
                         this.startVolumeID,
                         this.limit,
                         this.volumeStatus,
                         this.accounts,
                         this.isPaired,
                         this.volumeIDs);
        }

        private ListVolumesRequest.Builder buildFrom(final ListVolumesRequest req) {
            this.startVolumeID = req.startVolumeID;
            this.limit = req.limit;
            this.volumeStatus = req.volumeStatus;
            this.accounts = req.accounts;
            this.isPaired = req.isPaired;
            this.volumeIDs = req.volumeIDs;

            return this;
        }

        public ListVolumesRequest.Builder optionalStartVolumeID(final VolumeID startVolumeID) {
            this.startVolumeID = (startVolumeID == null) ? Optional.<VolumeID>empty() : Optional.of(startVolumeID);
            return this;
        }

        public ListVolumesRequest.Builder optionalLimit(final Long limit) {
            this.limit = (limit == null) ? Optional.<Long>empty() : Optional.of(limit);
            return this;
        }

        public ListVolumesRequest.Builder optionalVolumeStatus(final String volumeStatus) {
            this.volumeStatus = (volumeStatus == null) ? Optional.<String>empty() : Optional.of(volumeStatus);
            return this;
        }

        public ListVolumesRequest.Builder optionalAccounts(final AccountID[] accounts) {
            this.accounts = (accounts == null) ? Optional.<AccountID[]>empty() : Optional.of(accounts);
            return this;
        }

        public ListVolumesRequest.Builder optionalIsPaired(final Boolean isPaired) {
            this.isPaired = (isPaired == null) ? Optional.<Boolean>empty() : Optional.of(isPaired);
            return this;
        }

        public ListVolumesRequest.Builder optionalVolumeIDs(final VolumeID[] volumeIDs) {
            this.volumeIDs = (volumeIDs == null) ? Optional.<VolumeID[]>empty() : Optional.of(volumeIDs);
            return this;
        }

    }
}
