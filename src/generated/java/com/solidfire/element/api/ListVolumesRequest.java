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
 * ListVolumesRequest  
 * The ListVolumes method enables you to retrieve a list of volumes that are in a cluster. You can specify the volumes you want to
 * return in the list by using the available parameters.
 **/

public class ListVolumesRequest implements Serializable {

    public static final long serialVersionUID = -3462654087785048014L;
    @SerializedName("startVolumeID") private Optional<Long> startVolumeID;
    @SerializedName("limit") private Optional<Long> limit;
    @SerializedName("volumeStatus") private Optional<String> volumeStatus;
    @SerializedName("accounts") private Optional<Long[]> accounts;
    @SerializedName("isPaired") private Optional<Boolean> isPaired;
    @SerializedName("volumeIDs") private Optional<Long[]> volumeIDs;
    @SerializedName("volumeName") private Optional<String> volumeName;
    @SerializedName("includeVirtualVolumes") private Optional<Boolean> includeVirtualVolumes;
    @SerializedName("protectionSchemes") private Optional<String[]> protectionSchemes;
    // empty constructor
    @Since("7.0")
    public ListVolumesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVolumesRequest(
        Optional<Long> startVolumeID,
        Optional<Long> limit,
        Optional<String> volumeStatus,
        Optional<Long[]> accounts,
        Optional<Boolean> isPaired,
        Optional<Long[]> volumeIDs,
        Optional<String> volumeName,
        Optional<String[]> protectionSchemes
    )
    {
        this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : startVolumeID;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
        this.volumeStatus = (volumeStatus == null) ? Optional.<String>empty() : volumeStatus;
        this.accounts = (accounts == null) ? Optional.<Long[]>empty() : accounts;
        this.isPaired = (isPaired == null) ? Optional.<Boolean>empty() : isPaired;
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
        this.volumeName = (volumeName == null) ? Optional.<String>empty() : volumeName;
        this.protectionSchemes = (protectionSchemes == null) ? Optional.<String[]>empty() : protectionSchemes;
    }
    // parameterized constructor
    @Since("9.0")
    public ListVolumesRequest(
        Optional<Long> startVolumeID,
        Optional<Long> limit,
        Optional<String> volumeStatus,
        Optional<Long[]> accounts,
        Optional<Boolean> isPaired,
        Optional<Long[]> volumeIDs,
        Optional<String> volumeName,
        Optional<Boolean> includeVirtualVolumes,
        Optional<String[]> protectionSchemes
    )
    {
        this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : startVolumeID;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
        this.volumeStatus = (volumeStatus == null) ? Optional.<String>empty() : volumeStatus;
        this.accounts = (accounts == null) ? Optional.<Long[]>empty() : accounts;
        this.isPaired = (isPaired == null) ? Optional.<Boolean>empty() : isPaired;
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
        this.volumeName = (volumeName == null) ? Optional.<String>empty() : volumeName;
        this.includeVirtualVolumes = (includeVirtualVolumes == null) ? Optional.<Boolean>empty() : includeVirtualVolumes;
        this.protectionSchemes = (protectionSchemes == null) ? Optional.<String[]>empty() : protectionSchemes;
    }

    /** 
     * Only volumes with an ID greater than or equal to this
     * value are returned. Mutually exclusive with the
     * volumeIDs parameter.
     **/
    public Optional<Long> getStartVolumeID() { return this.startVolumeID; }
   
    public void setStartVolumeID(Optional<Long> startVolumeID) { 
        this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : startVolumeID;
    }
    /** 
     * Specifies the maximum number of volume
     * results that are returned. Mutually exclusive with the
     * volumeIDs parameter.
     **/
    public Optional<Long> getLimit() { return this.limit; }
   
    public void setLimit(Optional<Long> limit) { 
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }
    /** 
     * Only volumes with a status equal to the status value are
     * returned.
     * Possible values are:
     * creating
     * snapshotting
     * active
     * deleted
     **/
    public Optional<String> getVolumeStatus() { return this.volumeStatus; }
   
    public void setVolumeStatus(Optional<String> volumeStatus) { 
        this.volumeStatus = (volumeStatus == null) ? Optional.<String>empty() : volumeStatus;
    }
    /** 
     * Returns only the volumes owned by the accounts you specify here. Mutually exclusive with the volumeIDs parameter.
     **/
    public Optional<Long[]> getAccounts() { return this.accounts; }
   
    public void setAccounts(Optional<Long[]> accounts) { 
        this.accounts = (accounts == null) ? Optional.<Long[]>empty() : accounts;
    }
    /** 
     * Returns volumes that are paired or not paired.
     * Possible values are:
     * true: Returns all paired volumes.
     * false: Returns all volumes that are not paired.
     **/
    public Optional<Boolean> getIsPaired() { return this.isPaired; }
   
    public void setIsPaired(Optional<Boolean> isPaired) { 
        this.isPaired = (isPaired == null) ? Optional.<Boolean>empty() : isPaired;
    }
    /** 
     * A list of volume IDs. If you supply this parameter, other
     * parameters operate only on this set of volumes. Mutually
     * exclusive with the accounts, startVolumeID, and limit
     * parameters.
     **/
    public Optional<Long[]> getVolumeIDs() { return this.volumeIDs; }
   
    public void setVolumeIDs(Optional<Long[]> volumeIDs) { 
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
    }
    /** 
     * Only volume object information matching the volume
     * name is returned.
     **/
    public Optional<String> getVolumeName() { return this.volumeName; }
   
    public void setVolumeName(Optional<String> volumeName) { 
        this.volumeName = (volumeName == null) ? Optional.<String>empty() : volumeName;
    }
    /** 
     * Specifies that virtual volumes are included in the response by default.
     * To exclude virtual volumes, set to false.
     **/
    public Optional<Boolean> getIncludeVirtualVolumes() { return this.includeVirtualVolumes; }
   
    public void setIncludeVirtualVolumes(Optional<Boolean> includeVirtualVolumes) { 
        this.includeVirtualVolumes = (includeVirtualVolumes == null) ? Optional.<Boolean>empty() : includeVirtualVolumes;
    }
    /** 
     * Only volumes that are using one of the protection schemes in this set are returned.
     **/
    public Optional<String[]> getProtectionSchemes() { return this.protectionSchemes; }
   
    public void setProtectionSchemes(Optional<String[]> protectionSchemes) { 
        this.protectionSchemes = (protectionSchemes == null) ? Optional.<String[]>empty() : protectionSchemes;
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
            Objects.equals(volumeIDs, that.volumeIDs) && 
            Objects.equals(volumeName, that.volumeName) && 
            Objects.equals(includeVirtualVolumes, that.includeVirtualVolumes) && 
            Objects.equals(protectionSchemes, that.protectionSchemes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( startVolumeID,limit,volumeStatus,accounts,isPaired,volumeIDs,volumeName,includeVirtualVolumes,protectionSchemes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("startVolumeID", startVolumeID);
        map.put("limit", limit);
        map.put("volumeStatus", volumeStatus);
        map.put("accounts", accounts);
        map.put("isPaired", isPaired);
        map.put("volumeIDs", volumeIDs);
        map.put("volumeName", volumeName);
        map.put("includeVirtualVolumes", includeVirtualVolumes);
        map.put("protectionSchemes", protectionSchemes);
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
        if(null != volumeStatus && volumeStatus.isPresent()){
            sb.append(" volumeStatus : ").append(gson.toJson(volumeStatus)).append(",");
        }
        else{
            sb.append(" volumeStatus : ").append("null").append(",");
        }
        if(null != accounts && accounts.isPresent()){
            sb.append(" accounts : ").append(gson.toJson(accounts)).append(",");
        }
        else{
            sb.append(" accounts : ").append("null").append(",");
        }
        if(null != isPaired && isPaired.isPresent()){
            sb.append(" isPaired : ").append(gson.toJson(isPaired)).append(",");
        }
        else{
            sb.append(" isPaired : ").append("null").append(",");
        }
        if(null != volumeIDs && volumeIDs.isPresent()){
            sb.append(" volumeIDs : ").append(gson.toJson(volumeIDs)).append(",");
        }
        else{
            sb.append(" volumeIDs : ").append("null").append(",");
        }
        if(null != volumeName && volumeName.isPresent()){
            sb.append(" volumeName : ").append(gson.toJson(volumeName)).append(",");
        }
        else{
            sb.append(" volumeName : ").append("null").append(",");
        }
        if(null != includeVirtualVolumes && includeVirtualVolumes.isPresent()){
            sb.append(" includeVirtualVolumes : ").append(gson.toJson(includeVirtualVolumes)).append(",");
        }
        else{
            sb.append(" includeVirtualVolumes : ").append("null").append(",");
        }
        if(null != protectionSchemes && protectionSchemes.isPresent()){
            sb.append(" protectionSchemes : ").append(gson.toJson(protectionSchemes)).append(",");
        }
        else{
            sb.append(" protectionSchemes : ").append("null").append(",");
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
        private Optional<String> volumeStatus;
        private Optional<Long[]> accounts;
        private Optional<Boolean> isPaired;
        private Optional<Long[]> volumeIDs;
        private Optional<String> volumeName;
        private Optional<Boolean> includeVirtualVolumes;
        private Optional<String[]> protectionSchemes;

        private Builder() { }

        public ListVolumesRequest build() {
            return new ListVolumesRequest (
                         this.startVolumeID,
                         this.limit,
                         this.volumeStatus,
                         this.accounts,
                         this.isPaired,
                         this.volumeIDs,
                         this.volumeName,
                         this.includeVirtualVolumes,
                         this.protectionSchemes);
        }

        private ListVolumesRequest.Builder buildFrom(final ListVolumesRequest req) {
            this.startVolumeID = req.startVolumeID;
            this.limit = req.limit;
            this.volumeStatus = req.volumeStatus;
            this.accounts = req.accounts;
            this.isPaired = req.isPaired;
            this.volumeIDs = req.volumeIDs;
            this.volumeName = req.volumeName;
            this.includeVirtualVolumes = req.includeVirtualVolumes;
            this.protectionSchemes = req.protectionSchemes;

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

        public ListVolumesRequest.Builder optionalVolumeName(final String volumeName) {
            this.volumeName = (volumeName == null) ? Optional.<String>empty() : Optional.of(volumeName);
            return this;
        }

        public ListVolumesRequest.Builder optionalIncludeVirtualVolumes(final Boolean includeVirtualVolumes) {
            this.includeVirtualVolumes = (includeVirtualVolumes == null) ? Optional.<Boolean>empty() : Optional.of(includeVirtualVolumes);
            return this;
        }

        public ListVolumesRequest.Builder optionalProtectionSchemes(final String[] protectionSchemes) {
            this.protectionSchemes = (protectionSchemes == null) ? Optional.<String[]>empty() : Optional.of(protectionSchemes);
            return this;
        }

    }
}
