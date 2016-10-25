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
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * The Request object for the "ListVolumes" API Service call.
 **/
public class ListVolumesRequest  implements Serializable  {

    private static final long serialVersionUID = -337491134L;

    @SerializedName("startVolumeID") private Optional<Long> startVolumeID;
    @SerializedName("limit") private Optional<Long> limit;
    @SerializedName("volumeStatus") private Optional<String> volumeStatus;
    @SerializedName("accounts") private Optional<Long[]> accounts;
    @SerializedName("isPaired") private Optional<Boolean> isPaired;
    @SerializedName("volumeIDs") private Optional<Long[]> volumeIDs;

    /**
     * The Request object for the "ListVolumes" API Service call.
     * @param startVolumeID (optional) The ID of the first volume to list.
     * @param limit (optional) The maximum number of volumes to return from the API.
     * @param volumeStatus (optional) If specified, filter to only volumes with the provided status.
     * @param accounts (optional) If specified, only fetch volumes which belong to the provided accounts.
     * @param isPaired (optional) If specified, only fetch volumes which are paired (if true) or non-paired (if false).
     * @since 8.0
     **/
    @Since("8.0")
    public ListVolumesRequest(Optional<Long> startVolumeID, Optional<Long> limit, Optional<String> volumeStatus, Optional<Long[]> accounts, Optional<Boolean> isPaired) {
        this.volumeStatus = (volumeStatus == null) ? Optional.<String>empty() : volumeStatus;
        this.isPaired = (isPaired == null) ? Optional.<Boolean>empty() : isPaired;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
        this.volumeIDs = Optional.<Long[]>empty();
        this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : startVolumeID;
        this.accounts = (accounts == null) ? Optional.<Long[]>empty() : accounts;
    }

    /**
     * The Request object for the "ListVolumes" API Service call.
     * @param startVolumeID (optional) The ID of the first volume to list.
     * @param limit (optional) The maximum number of volumes to return from the API.
     * @param volumeStatus (optional) If specified, filter to only volumes with the provided status.
     * @param accounts (optional) If specified, only fetch volumes which belong to the provided accounts.
     * @param isPaired (optional) If specified, only fetch volumes which are paired (if true) or non-paired (if false).
     * @param volumeIDs (optional) If specified, only fetch volumes specified in this list.
     * @since 9.0
     **/
    @Since("9.0")
    public ListVolumesRequest(Optional<Long> startVolumeID, Optional<Long> limit, Optional<String> volumeStatus, Optional<Long[]> accounts, Optional<Boolean> isPaired, Optional<Long[]> volumeIDs) {
        this.volumeStatus = (volumeStatus == null) ? Optional.<String>empty() : volumeStatus;
        this.isPaired = (isPaired == null) ? Optional.<Boolean>empty() : isPaired;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
        this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : startVolumeID;
        this.accounts = (accounts == null) ? Optional.<Long[]>empty() : accounts;
    }

    
    /**
     * The Request object for the "ListVolumes" API Service call.
     * Empty constructor to support serialization.
     * @since 8.0
     **/
    @Since("8.0")
    public ListVolumesRequest() {}


    /**
     * The ID of the first volume to list.
     * This can be useful for paging results.
     * By default, this starts at the lowest VolumeID.
     **/
    public Optional<Long> getStartVolumeID() {
        return this.startVolumeID;
    }

    public void setStartVolumeID(Long startVolumeID) {
        this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : Optional.of(startVolumeID);
    }



    /**
     * The maximum number of volumes to return from the API.
     **/
    public Optional<Long> getLimit() {
        return this.limit;
    }

    public void setLimit(Long limit) {
        this.limit = (limit == null) ? Optional.<Long>empty() : Optional.of(limit);
    }



    /**
     * If specified, filter to only volumes with the provided status.
     * By default, list all volumes.
     **/
    public Optional<String> getVolumeStatus() {
        return this.volumeStatus;
    }

    public void setVolumeStatus(String volumeStatus) {
        this.volumeStatus = (volumeStatus == null) ? Optional.<String>empty() : Optional.of(volumeStatus);
    }



    /**
     * If specified, only fetch volumes which belong to the provided accounts.
     * By default, list volumes for all accounts.
     **/
    public Optional<Long[]> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(Long[] accounts) {
        this.accounts = (accounts == null) ? Optional.<Long[]>empty() : Optional.of(accounts);
    }



    /**
     * If specified, only fetch volumes which are paired (if true) or non-paired (if false).
     * By default, list all volumes regardless of their pairing status.
     **/
    public Optional<Boolean> getIsPaired() {
        return this.isPaired;
    }

    public void setIsPaired(Boolean isPaired) {
        this.isPaired = (isPaired == null) ? Optional.<Boolean>empty() : Optional.of(isPaired);
    }



    /**
     * If specified, only fetch volumes specified in this list.
     * This option cannot be specified if startVolumeID, limit, or accounts option is specified.
     * @since 9.0 
     **/

    @Since("9.0")
    public Optional<Long[]> getVolumeIDs() {
        return this.volumeIDs;
    }

    public void setVolumeIDs(Long[] volumeIDs) {
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : Optional.of(volumeIDs);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumesRequest that = (ListVolumesRequest) o;
        

        return Objects.equals( startVolumeID , that.startVolumeID )
            && Objects.equals( limit , that.limit )
            && Objects.equals( volumeStatus , that.volumeStatus )
            && Objects.deepEquals( accounts , that.accounts )
            && Objects.equals( isPaired , that.isPaired )
            && Objects.deepEquals( volumeIDs , that.volumeIDs );
    }

    @Override
    public int hashCode() {
        return Objects.hash( startVolumeID, limit, volumeStatus, accounts, isPaired, volumeIDs );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != startVolumeID && startVolumeID.isPresent())
            sb.append(" startVolumeID : ").append(startVolumeID.get()).append(",");
        if(null != limit && limit.isPresent())
            sb.append(" limit : ").append(limit.get()).append(",");
        if(null != volumeStatus && volumeStatus.isPresent())
            sb.append(" volumeStatus : ").append(volumeStatus.get()).append(",");
        if(null != accounts && accounts.isPresent())
            sb.append(" accounts : ").append(Arrays.toString(accounts.get())).append(",");
        if(null != isPaired && isPaired.isPresent())
            sb.append(" isPaired : ").append(isPaired.get()).append(",");
        if(null != volumeIDs && volumeIDs.isPresent())
            sb.append(" volumeIDs : ").append(Arrays.toString(volumeIDs.get()));
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
        private Optional<String> volumeStatus;
        private Optional<Long[]> accounts;
        private Optional<Boolean> isPaired;
        private Optional<Long[]> volumeIDs;

        private Builder() { }

        public ListVolumesRequest build() {
            return new ListVolumesRequest (
                         this.startVolumeID,
                         this.limit,
                         this.volumeStatus,
                         this.accounts,
                         this.isPaired,
                         this.volumeIDs            );
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

        public ListVolumesRequest.Builder optionalStartVolumeID(final Long startVolumeID) {
            this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : Optional.of(startVolumeID);
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

        public ListVolumesRequest.Builder optionalAccounts(final Long[] accounts) {
            this.accounts = (accounts == null) ? Optional.<Long[]>empty() : Optional.of(accounts);
            return this;
        }

        public ListVolumesRequest.Builder optionalIsPaired(final Boolean isPaired) {
            this.isPaired = (isPaired == null) ? Optional.<Boolean>empty() : Optional.of(isPaired);
            return this;
        }

        public ListVolumesRequest.Builder optionalVolumeIDs(final Long[] volumeIDs) {
            this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : Optional.of(volumeIDs);
            return this;
        }

    }

}
