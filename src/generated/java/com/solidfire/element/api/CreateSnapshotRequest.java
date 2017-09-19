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
 * CreateSnapshotRequest  
 * CreateSnapshot enables you to create a point-in-time copy of a volume. You can create a snapshot from any volume or from an existing snapshot. If you do not provide a SnapshotID with this API method, a snapshot is created from the volume's active branch.
 * If the volume from which the snapshot is created is being replicated to a remote cluster, the snapshot can also be replicated to the same target. Use the enableRemoteReplication parameter to enable snapshot replication.
 * Note: Creating a snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
 **/

public class CreateSnapshotRequest implements Serializable {

    public static final long serialVersionUID = 4393987975111566974L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("snapshotID") private Optional<Long> snapshotID;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("enableRemoteReplication") private Optional<Boolean> enableRemoteReplication;
    @SerializedName("retention") private Optional<String> retention;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    @SerializedName("snapMirrorLabel") private Optional<String> snapMirrorLabel;
    // empty constructor
    @Since("7.0")
    public CreateSnapshotRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateSnapshotRequest(
        Long volumeID,
        Optional<Long> snapshotID,
        Optional<String> name,
        Optional<Attributes> attributes
    )
    {
        this.volumeID = volumeID;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("8.0")
    public CreateSnapshotRequest(
        Long volumeID,
        Optional<Long> snapshotID,
        Optional<String> name,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> retention,
        Optional<Attributes> attributes
    )
    {
        this.volumeID = volumeID;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("10.0")
    public CreateSnapshotRequest(
        Long volumeID,
        Optional<Long> snapshotID,
        Optional<String> name,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> retention,
        Optional<Attributes> attributes,
        Optional<String> snapMirrorLabel
    )
    {
        this.volumeID = volumeID;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : snapMirrorLabel;
    }

    /** 
     * Specifies the unique ID of the volume image from which to copy.
     **/
    public Long getVolumeID() { return this.volumeID; }
   
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * Specifies the unique ID of a snapshot from which the new snapshot
     * is made. The snapshotID passed must be a snapshot on the given volume.
     **/
    public Optional<Long> getSnapshotID() { return this.snapshotID; }
   
    public void setSnapshotID(Optional<Long> snapshotID) { 
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
    }
    /** 
     * Specifies a name for the snapshot. If unspecified, the date and time the snapshot was taken is used.
     **/
    public Optional<String> getName() { return this.name; }
   
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * Replicates the snapshot created to a remote cluster.
     * Possible values are:
     * true: The snapshot is replicated to remote storage.
     * false: Default. The snapshot is not replicated.
     **/
    public Optional<Boolean> getEnableRemoteReplication() { return this.enableRemoteReplication; }
   
    public void setEnableRemoteReplication(Optional<Boolean> enableRemoteReplication) { 
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
    }
    /** 
     * Specifies the amount of time for which the snapshot is retained. The format is HH:mm:ss.
     **/
    public Optional<String> getRetention() { return this.retention; }
   
    public void setRetention(Optional<String> retention) { 
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
    }
    /** 
     * List of name-value pairs in JSON object format.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    /** 
     * Label used by SnapMirror software to specify snapshot retention policy on SnapMirror endpoint.
     **/
    public Optional<String> getSnapMirrorLabel() { return this.snapMirrorLabel; }
   
    public void setSnapMirrorLabel(Optional<String> snapMirrorLabel) { 
        this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : snapMirrorLabel;
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
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(snapMirrorLabel, that.snapMirrorLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,snapshotID,name,enableRemoteReplication,retention,attributes,snapMirrorLabel );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("snapshotID", snapshotID);
        map.put("name", name);
        map.put("enableRemoteReplication", enableRemoteReplication);
        map.put("retention", retention);
        map.put("attributes", attributes);
        map.put("snapMirrorLabel", snapMirrorLabel);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(gson.toJson(volumeID)).append(",");
        if(null != snapshotID && snapshotID.isPresent()){
            sb.append(" snapshotID : ").append(gson.toJson(snapshotID)).append(",");
        }
        else{
            sb.append(" snapshotID : ").append("null").append(",");
        }
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(gson.toJson(name)).append(",");
        }
        else{
            sb.append(" name : ").append("null").append(",");
        }
        if(null != enableRemoteReplication && enableRemoteReplication.isPresent()){
            sb.append(" enableRemoteReplication : ").append(gson.toJson(enableRemoteReplication)).append(",");
        }
        else{
            sb.append(" enableRemoteReplication : ").append("null").append(",");
        }
        if(null != retention && retention.isPresent()){
            sb.append(" retention : ").append(gson.toJson(retention)).append(",");
        }
        else{
            sb.append(" retention : ").append("null").append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        }
        else{
            sb.append(" attributes : ").append("null").append(",");
        }
        if(null != snapMirrorLabel && snapMirrorLabel.isPresent()){
            sb.append(" snapMirrorLabel : ").append(gson.toJson(snapMirrorLabel)).append(",");
        }
        else{
            sb.append(" snapMirrorLabel : ").append("null").append(",");
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
        private Optional<Attributes> attributes;
        private Optional<String> snapMirrorLabel;

        private Builder() { }

        public CreateSnapshotRequest build() {
            return new CreateSnapshotRequest (
                         this.volumeID,
                         this.snapshotID,
                         this.name,
                         this.enableRemoteReplication,
                         this.retention,
                         this.attributes,
                         this.snapMirrorLabel);
        }

        private CreateSnapshotRequest.Builder buildFrom(final CreateSnapshotRequest req) {
            this.volumeID = req.volumeID;
            this.snapshotID = req.snapshotID;
            this.name = req.name;
            this.enableRemoteReplication = req.enableRemoteReplication;
            this.retention = req.retention;
            this.attributes = req.attributes;
            this.snapMirrorLabel = req.snapMirrorLabel;

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

        public CreateSnapshotRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

        public CreateSnapshotRequest.Builder optionalSnapMirrorLabel(final String snapMirrorLabel) {
            this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : Optional.of(snapMirrorLabel);
            return this;
        }

    }
}
