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
 * ListGroupSnapshotsRequest  
 * ListGroupSnapshots enables you to get information about all group snapshots that have been created.
 **/

public class ListGroupSnapshotsRequest implements Serializable {

    public static final long serialVersionUID = -3340540672327782327L;
    @SerializedName("volumes") private Optional<Long[]> volumes;
    @SerializedName("groupSnapshotID") private Optional<Long> groupSnapshotID;
    // empty constructor
    @Since("7.0")
    public ListGroupSnapshotsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListGroupSnapshotsRequest(
        Optional<Long[]> volumes
    )
    {
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
    }
    // parameterized constructor
    @Since("9.0")
    public ListGroupSnapshotsRequest(
        Optional<Long[]> volumes,
        Optional<Long> groupSnapshotID
    )
    {
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
        this.groupSnapshotID = (groupSnapshotID == null) ? Optional.<Long>empty() : groupSnapshotID;
    }

    /** 
     * An array of unique volume IDs to query. If you do not
     * specify this parameter, all group snapshots on the cluster
     * are included.
     **/
    public Optional<Long[]> getVolumes() { return this.volumes; }
   
    public void setVolumes(Optional<Long[]> volumes) { 
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
    }
    /** 
     * Retrieves information for a specific group snapshot ID.
     **/
    public Optional<Long> getGroupSnapshotID() { return this.groupSnapshotID; }
   
    public void setGroupSnapshotID(Optional<Long> groupSnapshotID) { 
        this.groupSnapshotID = (groupSnapshotID == null) ? Optional.<Long>empty() : groupSnapshotID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListGroupSnapshotsRequest that = (ListGroupSnapshotsRequest) o;

        return 
            Objects.equals(volumes, that.volumes) && 
            Objects.equals(groupSnapshotID, that.groupSnapshotID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumes,groupSnapshotID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumes", volumes);
        map.put("groupSnapshotID", groupSnapshotID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != volumes && volumes.isPresent()){
            sb.append(" volumes : ").append(gson.toJson(volumes)).append(",");
        }
        else{
            sb.append(" volumes : ").append("null").append(",");
        }
        if(null != groupSnapshotID && groupSnapshotID.isPresent()){
            sb.append(" groupSnapshotID : ").append(gson.toJson(groupSnapshotID)).append(",");
        }
        else{
            sb.append(" groupSnapshotID : ").append("null").append(",");
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
        private Optional<Long[]> volumes;
        private Optional<Long> groupSnapshotID;

        private Builder() { }

        public ListGroupSnapshotsRequest build() {
            return new ListGroupSnapshotsRequest (
                         this.volumes,
                         this.groupSnapshotID);
        }

        private ListGroupSnapshotsRequest.Builder buildFrom(final ListGroupSnapshotsRequest req) {
            this.volumes = req.volumes;
            this.groupSnapshotID = req.groupSnapshotID;

            return this;
        }

        public ListGroupSnapshotsRequest.Builder optionalVolumes(final Long[] volumes) {
            this.volumes = (volumes == null) ? Optional.<Long[]>empty() : Optional.of(volumes);
            return this;
        }

        public ListGroupSnapshotsRequest.Builder optionalGroupSnapshotID(final Long groupSnapshotID) {
            this.groupSnapshotID = (groupSnapshotID == null) ? Optional.<Long>empty() : Optional.of(groupSnapshotID);
            return this;
        }

    }
}
