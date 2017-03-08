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
 * ListSnapshotsRequest  
 * ListSnapshots is used to return the attributes of each snapshot taken on the volume.
 **/

public class ListSnapshotsRequest implements Serializable {

    public static final long serialVersionUID = 7504471757588992322L;
    @SerializedName("volumeID") private Optional<Long> volumeID;
    @SerializedName("internal") private Optional<Boolean> internal;

    // empty constructor
    @Since("7.0")
    public ListSnapshotsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapshotsRequest(
        Optional<Long> volumeID,
        Optional<Boolean> internal
    )
    {
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
        this.internal = (internal == null) ? Optional.<Boolean>empty() : internal;
    }

    /** 
     * The volume to list snapshots for.
     * If not provided, all snapshots for all volumes are returned.
     **/
    public Optional<Long> getVolumeID() { return this.volumeID; }
    public void setVolumeID(Optional<Long> volumeID) { 
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
    }
    /** 
     * 
     **/
    public Optional<Boolean> getInternal() { return this.internal; }
    public void setInternal(Optional<Boolean> internal) { 
        this.internal = (internal == null) ? Optional.<Boolean>empty() : internal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapshotsRequest that = (ListSnapshotsRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(internal, that.internal);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,internal );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("internal", internal);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != volumeID && volumeID.isPresent()){
            sb.append(" volumeID : ").append(volumeID).append(",");
        }
        if(null != internal && internal.isPresent()){
            sb.append(" internal : ").append(internal).append(",");
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
        private Optional<Boolean> internal;

        private Builder() { }

        public ListSnapshotsRequest build() {
            return new ListSnapshotsRequest (
                         this.volumeID,
                         this.internal);
        }

        private ListSnapshotsRequest.Builder buildFrom(final ListSnapshotsRequest req) {
            this.volumeID = req.volumeID;
            this.internal = req.internal;

            return this;
        }

        public ListSnapshotsRequest.Builder optional(final Long volumeID) {
            this.volumeID = (volumeID == null) ? Optional.<Long>empty() : Optional.of(volumeID);
            return this;
        }

        public ListSnapshotsRequest.Builder optional(final Boolean internal) {
            this.internal = (internal == null) ? Optional.<Boolean>empty() : Optional.of(internal);
            return this;
        }

    }
}
