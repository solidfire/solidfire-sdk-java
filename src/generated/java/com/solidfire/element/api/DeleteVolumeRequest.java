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
 * DeleteVolumeRequest  
 * DeleteVolume marks an active volume for deletion.
 * It is purged (permanently deleted) after the cleanup interval elapses.
 * After making a request to delete a volume, any active iSCSI connections to the volume is immediately terminated and no further connections are allowed while the volume is in this state.
 * It is not returned in target discovery requests.
 * 
 * Any snapshots of a volume that has been marked to delete are not affected.
 * Snapshots are kept until the volume is purged from the system.
 * 
 * If a volume is marked for deletion, and it has a bulk volume read or bulk volume write operation in progress, the bulk volume operation is stopped.
 * 
 * If the volume you delete is paired with a volume, replication between the paired volumes is suspended and no data is transferred to it or from it while in a deleted state.
 * The remote volume the deleted volume was paired with enters into a PausedMisconfigured state and data is no integerer sent to it or from the deleted volume.
 * Until the deleted volume is purged, it can be restored and data transfers resumes.
 * If the deleted volume gets purged from the system, the volume it was paired with enters into a StoppedMisconfigured state and the volume pairing status is removed.
 * The purged volume becomes permanently unavailable.
 **/

public class DeleteVolumeRequest implements Serializable {

    public static final long serialVersionUID = -5304170858071823429L;
    @SerializedName("volumeID") private Long volumeID;

    // empty constructor
    @Since("7.0")
    public DeleteVolumeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteVolumeRequest(
        Long volumeID
    )
    {
        this.volumeID = volumeID;
    }

    /** 
     * The ID of the volume to delete.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteVolumeRequest that = (DeleteVolumeRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
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
        private Long volumeID;

        private Builder() { }

        public DeleteVolumeRequest build() {
            return new DeleteVolumeRequest (
                         this.volumeID);
        }

        private DeleteVolumeRequest.Builder buildFrom(final DeleteVolumeRequest req) {
            this.volumeID = req.volumeID;

            return this;
        }

        public DeleteVolumeRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

    }
}
