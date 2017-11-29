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
 * ListSnapshotsRequest  
 * ListSnapshots enables you to return the attributes of each snapshot taken on the volume. Information about snapshots that reside on the target cluster is displayed on the source cluster when this method is called from the source cluster.
 **/

public class ListSnapshotsRequest implements Serializable {

    public static final long serialVersionUID = 7504471757588992322L;
    @SerializedName("volumeID") private Optional<Long> volumeID;
    @SerializedName("snapshotID") private Optional<Long> snapshotID;
    // empty constructor
    @Since("7.0")
    public ListSnapshotsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapshotsRequest(
        Optional<Long> volumeID,
        Optional<Long> snapshotID
    )
    {
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
    }

    /** 
     * Retrieves snapshots for a volume. If volumeID is not provided,
     * all snapshots for all volumes are returned.
     **/
    public Optional<Long> getVolumeID() { return this.volumeID; }
   
    public void setVolumeID(Optional<Long> volumeID) { 
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
    }
    /** 
     * Retrieves information for a specific snapshot ID.
     **/
    public Optional<Long> getSnapshotID() { return this.snapshotID; }
   
    public void setSnapshotID(Optional<Long> snapshotID) { 
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapshotsRequest that = (ListSnapshotsRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(snapshotID, that.snapshotID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,snapshotID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("snapshotID", snapshotID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != volumeID && volumeID.isPresent()){
            sb.append(" volumeID : ").append(gson.toJson(volumeID)).append(",");
        }
        else{
            sb.append(" volumeID : ").append("null").append(",");
        }
        if(null != snapshotID && snapshotID.isPresent()){
            sb.append(" snapshotID : ").append(gson.toJson(snapshotID)).append(",");
        }
        else{
            sb.append(" snapshotID : ").append("null").append(",");
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
        private Optional<Long> volumeID;
        private Optional<Long> snapshotID;

        private Builder() { }

        public ListSnapshotsRequest build() {
            return new ListSnapshotsRequest (
                         this.volumeID,
                         this.snapshotID);
        }

        private ListSnapshotsRequest.Builder buildFrom(final ListSnapshotsRequest req) {
            this.volumeID = req.volumeID;
            this.snapshotID = req.snapshotID;

            return this;
        }

        public ListSnapshotsRequest.Builder optionalVolumeID(final Long volumeID) {
            this.volumeID = (volumeID == null) ? Optional.<Long>empty() : Optional.of(volumeID);
            return this;
        }

        public ListSnapshotsRequest.Builder optionalSnapshotID(final Long snapshotID) {
            this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : Optional.of(snapshotID);
            return this;
        }

    }
}
