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
 * DeleteVolumesRequest  
 * DeleteVolumes marks multiple (up to 500) active volumes for deletion.
 * Once marked, the volumes are purged (permanently deleted) after the cleanup interval elapses.
 * The cleanup interval can be set in the SetClusterSettings method.
 * For more information on using this method, see SetClusterSettings on page 1.
 * After making a request to delete volumes, any active iSCSI connections to the volumes are immediately terminated
 * and no further connections are allowed while the volumes are in this state.
 * A marked volume is not returned in target discovery requests.
 * Any snapshots of a volume that has been marked for deletion are not affected.
 * Snapshots are kept until the volume is purged from the system.
 * If a volume is marked for deletion and has a bulk volume read or bulk volume write operation in progress,
 * the bulk volume read or write operation is stopped.
 * If the volumes you delete are paired with a volume, replication between the paired volumes is suspended
 * and no data is transferred to them or from them while in a deleted state.
 * The remote volumes the deleted volumes were paired with enter into a PausedMisconfigured state
 * and data is no longer sent to them or from the deleted volumes.
 * Until the deleted volumes are purged, they can be restored and data transfers resume.
 * If the deleted volumes are purged from the system, the volumes they were paired with enter into a
 * StoppedMisconfigured state and the volume pairing status is removed.
 * The purged volumes become permanently unavailable.
 **/

public class DeleteVolumesRequest implements Serializable {

    public static final long serialVersionUID = -8702971183368756605L;
    @SerializedName("accountIDs") private Optional<Long[]> accountIDs;
    @SerializedName("volumeAccessGroupIDs") private Optional<Long[]> volumeAccessGroupIDs;
    @SerializedName("volumeIDs") private Optional<Long[]> volumeIDs;
    // empty constructor
    @Since("7.0")
    public DeleteVolumesRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteVolumesRequest(
        Optional<Long[]> accountIDs,
        Optional<Long[]> volumeAccessGroupIDs,
        Optional<Long[]> volumeIDs
    )
    {
        this.accountIDs = (accountIDs == null) ? Optional.<Long[]>empty() : accountIDs;
        this.volumeAccessGroupIDs = (volumeAccessGroupIDs == null) ? Optional.<Long[]>empty() : volumeAccessGroupIDs;
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
    }

    /** 
     * A list of account IDs. All volumes from these accounts are deleted from the system. 
     **/
    public Optional<Long[]> getAccountIDs() { return this.accountIDs; }
    public void setAccountIDs(Optional<Long[]> accountIDs) { 
        this.accountIDs = (accountIDs == null) ? Optional.<Long[]>empty() : accountIDs;
    }
    /** 
     * A list of volume access group IDs. All of the volumes from all of the volume access groups you specify in this list are deleted from the system.
     **/
    public Optional<Long[]> getVolumeAccessGroupIDs() { return this.volumeAccessGroupIDs; }
    public void setVolumeAccessGroupIDs(Optional<Long[]> volumeAccessGroupIDs) { 
        this.volumeAccessGroupIDs = (volumeAccessGroupIDs == null) ? Optional.<Long[]>empty() : volumeAccessGroupIDs;
    }
    /** 
     * The list of IDs of the volumes to delete from the system.
     **/
    public Optional<Long[]> getVolumeIDs() { return this.volumeIDs; }
    public void setVolumeIDs(Optional<Long[]> volumeIDs) { 
        this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : volumeIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteVolumesRequest that = (DeleteVolumesRequest) o;

        return 
            Objects.equals(accountIDs, that.accountIDs) && 
            Objects.equals(volumeAccessGroupIDs, that.volumeAccessGroupIDs) && 
            Objects.equals(volumeIDs, that.volumeIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( accountIDs,volumeAccessGroupIDs,volumeIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("accountIDs", accountIDs);
        map.put("volumeAccessGroupIDs", volumeAccessGroupIDs);
        map.put("volumeIDs", volumeIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != accountIDs && accountIDs.isPresent()){
            sb.append(" accountIDs : ").append(accountIDs).append(",");
        }
        if(null != volumeAccessGroupIDs && volumeAccessGroupIDs.isPresent()){
            sb.append(" volumeAccessGroupIDs : ").append(volumeAccessGroupIDs).append(",");
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
        private Optional<Long[]> accountIDs;
        private Optional<Long[]> volumeAccessGroupIDs;
        private Optional<Long[]> volumeIDs;

        private Builder() { }

        public DeleteVolumesRequest build() {
            return new DeleteVolumesRequest (
                         this.accountIDs,
                         this.volumeAccessGroupIDs,
                         this.volumeIDs);
        }

        private DeleteVolumesRequest.Builder buildFrom(final DeleteVolumesRequest req) {
            this.accountIDs = req.accountIDs;
            this.volumeAccessGroupIDs = req.volumeAccessGroupIDs;
            this.volumeIDs = req.volumeIDs;

            return this;
        }

        public DeleteVolumesRequest.Builder optionalAccountIDs(final Long[] accountIDs) {
            this.accountIDs = (accountIDs == null) ? Optional.<Long[]>empty() : Optional.of(accountIDs);
            return this;
        }

        public DeleteVolumesRequest.Builder optionalVolumeAccessGroupIDs(final Long[] volumeAccessGroupIDs) {
            this.volumeAccessGroupIDs = (volumeAccessGroupIDs == null) ? Optional.<Long[]>empty() : Optional.of(volumeAccessGroupIDs);
            return this;
        }

        public DeleteVolumesRequest.Builder optionalVolumeIDs(final Long[] volumeIDs) {
            this.volumeIDs = (volumeIDs == null) ? Optional.<Long[]>empty() : Optional.of(volumeIDs);
            return this;
        }

    }
}
