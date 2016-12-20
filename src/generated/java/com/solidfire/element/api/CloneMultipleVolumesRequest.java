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

public class CloneMultipleVolumesRequest implements Serializable {

    public static final long serialVersionUID = -6275597178319531856L;
    @SerializedName("volumes") private CloneMultipleVolumeParams[] volumes;
    @SerializedName("access") private Optional<String> access;
    @SerializedName("groupSnapshotID") private Optional<Long> groupSnapshotID;
    @SerializedName("newAccountID") private Optional<Long> newAccountID;

    // empty constructor
    @Since("7.0")
    public CloneMultipleVolumesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CloneMultipleVolumesRequest(
        CloneMultipleVolumeParams[] volumes,
        Optional<String> access,
        Optional<Long> groupSnapshotID,
        Optional<Long> newAccountID
    )
    {
        this.volumes = volumes;
        this.access = (access == null) ? Optional.<String>empty() : access;
        this.groupSnapshotID = (groupSnapshotID == null) ? Optional.<Long>empty() : groupSnapshotID;
        this.newAccountID = (newAccountID == null) ? Optional.<Long>empty() : newAccountID;
    }

    /** 
     * Array of Unique ID for each volume to include in the clone with optional parameters. If optional parameters are not specified, the values will be inherited from the source volumes.
     **/
    public CloneMultipleVolumeParams[] getVolumes() { return this.volumes; }
    public void setVolumes(CloneMultipleVolumeParams[] volumes) { 
        this.volumes = volumes;
    }
    /** 
     * New default access method for the new volumes if not overridden by information passed in the volumes array.
     * <br/><b>readOnly</b>: Only read operations are allowed.
     * <br/><b>readWrite</b>: Reads and writes are allowed.
     * <br/><b>locked</b>: No reads or writes are allowed.
     * <br/><b>replicationTarget</b>: Identify a volume as the target volume for a paired set of volumes. If the volume is not paired, the access status is locked.
     * <br/><br/>
     * If unspecified, the access settings of the clone will be the same as the source.
     **/
    public Optional<String> getAccess() { return this.access; }
    public void setAccess(Optional<String> access) { 
        this.access = (access == null) ? Optional.<String>empty() : access;
    }
    /** 
     * ID of the group snapshot to use as a basis for the clone.
     **/
    public Optional<Long> getGroupSnapshotID() { return this.groupSnapshotID; }
    public void setGroupSnapshotID(Optional<Long> groupSnapshotID) { 
        this.groupSnapshotID = (groupSnapshotID == null) ? Optional.<Long>empty() : groupSnapshotID;
    }
    /** 
     * New account ID for the volumes if not overridden by information passed in the volumes array.
     **/
    public Optional<Long> getNewAccountID() { return this.newAccountID; }
    public void setNewAccountID(Optional<Long> newAccountID) { 
        this.newAccountID = (newAccountID == null) ? Optional.<Long>empty() : newAccountID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CloneMultipleVolumesRequest that = (CloneMultipleVolumesRequest) o;

        return 
            Arrays.equals(volumes, that.volumes) && 
            Objects.equals(access, that.access) && 
            Objects.equals(groupSnapshotID, that.groupSnapshotID) && 
            Objects.equals(newAccountID, that.newAccountID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])volumes,access,groupSnapshotID,newAccountID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumes", volumes);
        map.put("access", access);
        map.put("groupSnapshotID", groupSnapshotID);
        map.put("newAccountID", newAccountID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumes : ").append(Arrays.toString(volumes)).append(",");
        if(null != access && access.isPresent()){
            sb.append(" access : ").append(access).append(",");
        }
        if(null != groupSnapshotID && groupSnapshotID.isPresent()){
            sb.append(" groupSnapshotID : ").append(groupSnapshotID).append(",");
        }
        if(null != newAccountID && newAccountID.isPresent()){
            sb.append(" newAccountID : ").append(newAccountID).append(",");
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
        private CloneMultipleVolumeParams[] volumes;
        private Optional<String> access;
        private Optional<Long> groupSnapshotID;
        private Optional<Long> newAccountID;

        private Builder() { }

        public CloneMultipleVolumesRequest build() {
            return new CloneMultipleVolumesRequest (
                         this.volumes,
                         this.access,
                         this.groupSnapshotID,
                         this.newAccountID);
        }

        private CloneMultipleVolumesRequest.Builder buildFrom(final CloneMultipleVolumesRequest req) {
            this.volumes = req.volumes;
            this.access = req.access;
            this.groupSnapshotID = req.groupSnapshotID;
            this.newAccountID = req.newAccountID;

            return this;
        }

        public CloneMultipleVolumesRequest.Builder volumes(final CloneMultipleVolumeParams[] volumes) {
            this.volumes = volumes;
            return this;
        }

        public CloneMultipleVolumesRequest.Builder optionalAccess(final String access) {
            this.access = (access == null) ? Optional.<String>empty() : Optional.of(access);
            return this;
        }

        public CloneMultipleVolumesRequest.Builder optionalGroupSnapshotID(final Long groupSnapshotID) {
            this.groupSnapshotID = (groupSnapshotID == null) ? Optional.<Long>empty() : Optional.of(groupSnapshotID);
            return this;
        }

        public CloneMultipleVolumesRequest.Builder optionalNewAccountID(final Long newAccountID) {
            this.newAccountID = (newAccountID == null) ? Optional.<Long>empty() : Optional.of(newAccountID);
            return this;
        }

    }
}
