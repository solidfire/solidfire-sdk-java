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
 * CreateSnapshotRequest  
 * CreateSnapshot is used to create a point-in-time copy of a volume.
 * A snapshot can be created from any volume or from an existing snapshot.
 * 
 * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3.
 * Snapshots are not created when cluster fullness is at stage 4 or 5.
 **/

public class CreateSnapshotRequest implements Serializable {

    public static final long serialVersionUID = 4393987975111566974L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("snapshotID") private Optional<Long> snapshotID;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("enableRemoteReplication") private Optional<Boolean> enableRemoteReplication;
    @SerializedName("retention") private Optional<String> retention;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public CreateSnapshotRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateSnapshotRequest(
        Long volumeID,
        Optional<Long> snapshotID,
        Optional<String> name,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.volumeID = volumeID;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }
    // parameterized constructor
    @Since("8.0")
    public CreateSnapshotRequest(
        Long volumeID,
        Optional<Long> snapshotID,
        Optional<String> name,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> retention,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.volumeID = volumeID;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * ID of the volume image from which to copy.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * Unique ID of a snapshot from which the new snapshot is made.
     * The snapshotID passed must be a snapshot on the given volume.
     * If a SnapshotID is not provided, a snapshot is created from the volume's active branch.
     **/
    public Optional<Long> getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Optional<Long> snapshotID) { 
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
    }
    /** 
     * A name for the snapshot.
     * If no name is provided, the date and time the snapshot was taken is used.
     **/
    public Optional<String> getName() { return this.name; }
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * Identifies if snapshot is enabled for remote replication.
     **/
    public Optional<Boolean> getEnableRemoteReplication() { return this.enableRemoteReplication; }
    public void setEnableRemoteReplication(Optional<Boolean> enableRemoteReplication) { 
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
    }
    /** 
     * The amount of time the snapshot will be retained. Enter in HH:mm:ss
     **/
    public Optional<String> getRetention() { return this.retention; }
    public void setRetention(Optional<String> retention) { 
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<java.util.Map<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateSnapshotRequest that = (CreateSnapshotRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(snapshotID, that.snapshotID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(enableRemoteReplication, that.enableRemoteReplication) && 
            Objects.equals(retention, that.retention) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,snapshotID,name,enableRemoteReplication,retention,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("snapshotID", snapshotID);
        map.put("name", name);
        map.put("enableRemoteReplication", enableRemoteReplication);
        map.put("retention", retention);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        if(null != snapshotID && snapshotID.isPresent()){
            sb.append(" snapshotID : ").append(snapshotID).append(",");
        }
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(name).append(",");
        }
        if(null != enableRemoteReplication && enableRemoteReplication.isPresent()){
            sb.append(" enableRemoteReplication : ").append(enableRemoteReplication).append(",");
        }
        if(null != retention && retention.isPresent()){
            sb.append(" retention : ").append(retention).append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes).append(",");
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
        private Long volumeID;
        private Optional<Long> snapshotID;
        private Optional<String> name;
        private Optional<Boolean> enableRemoteReplication;
        private Optional<String> retention;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public CreateSnapshotRequest build() {
            return new CreateSnapshotRequest (
                         this.volumeID,
                         this.snapshotID,
                         this.name,
                         this.enableRemoteReplication,
                         this.retention,
                         this.attributes);
        }

        private CreateSnapshotRequest.Builder buildFrom(final CreateSnapshotRequest req) {
            this.volumeID = req.volumeID;
            this.snapshotID = req.snapshotID;
            this.name = req.name;
            this.enableRemoteReplication = req.enableRemoteReplication;
            this.retention = req.retention;
            this.attributes = req.attributes;

            return this;
        }

        public CreateSnapshotRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public CreateSnapshotRequest.Builder optionalSnapshotID(final Long snapshotID) {
            this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : Optional.of(snapshotID);
            return this;
        }

        public CreateSnapshotRequest.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public CreateSnapshotRequest.Builder optionalEnableRemoteReplication(final Boolean enableRemoteReplication) {
            this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : Optional.of(enableRemoteReplication);
            return this;
        }

        public CreateSnapshotRequest.Builder optionalRetention(final String retention) {
            this.retention = (retention == null) ? Optional.<String>empty() : Optional.of(retention);
            return this;
        }

        public CreateSnapshotRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
