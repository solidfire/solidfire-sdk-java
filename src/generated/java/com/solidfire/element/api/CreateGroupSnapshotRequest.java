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
 * CreateGroupSnapshotRequest  
 * CreateGroupSnapshot enables you to create a point-in-time copy of a group of volumes. You can use this snapshot later as a backup or rollback to ensure the data on the group of volumes is consistent for the point in time that you created the snapshot.
 * Note: Creating a group snapshot is allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
 **/

public class CreateGroupSnapshotRequest implements Serializable {

    public static final long serialVersionUID = -692185104190075271L;
    @SerializedName("volumes") private Long[] volumes;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("enableRemoteReplication") private Optional<Boolean> enableRemoteReplication;
    @SerializedName("expirationTime") private Optional<String> expirationTime;
    @SerializedName("retention") private Optional<String> retention;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    @SerializedName("snapMirrorLabel") private Optional<String> snapMirrorLabel;
    @SerializedName("ensureSerialCreation") private Optional<Boolean> ensureSerialCreation;
    // empty constructor
    @Since("7.0")
    public CreateGroupSnapshotRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateGroupSnapshotRequest(
        Long[] volumes,
        Optional<String> name,
        Optional<String> expirationTime,
        Optional<Attributes> attributes
    )
    {
        this.volumes = volumes;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("8.0")
    public CreateGroupSnapshotRequest(
        Long[] volumes,
        Optional<String> name,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> expirationTime,
        Optional<String> retention,
        Optional<Attributes> attributes
    )
    {
        this.volumes = volumes;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("10.0")
    public CreateGroupSnapshotRequest(
        Long[] volumes,
        Optional<String> name,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> expirationTime,
        Optional<String> retention,
        Optional<Attributes> attributes,
        Optional<String> snapMirrorLabel
    )
    {
        this.volumes = volumes;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : snapMirrorLabel;
    }
    // parameterized constructor
    @Since("12.0")
    public CreateGroupSnapshotRequest(
        Long[] volumes,
        Optional<String> name,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> expirationTime,
        Optional<String> retention,
        Optional<Attributes> attributes,
        Optional<String> snapMirrorLabel,
        Optional<Boolean> ensureSerialCreation
    )
    {
        this.volumes = volumes;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : snapMirrorLabel;
        this.ensureSerialCreation = (ensureSerialCreation == null) ? Optional.<Boolean>empty() : ensureSerialCreation;
    }

    /** 
     * Unique ID of the volume image from which to copy.
     **/
    public Long[] getVolumes() { return this.volumes; }
   
    public void setVolumes(Long[] volumes) { 
        this.volumes = volumes;
    }
    /** 
     * Name for the group snapshot. If unspecified, the date and time the group snapshot was taken is used.
     **/
    public Optional<String> getName() { return this.name; }
   
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * Replicates the snapshot created to remote storage.
     * Possible values are:
     * true: The snapshot is replicated to remote storage.
     * false: Default. The snapshot is not replicated.
     **/
    public Optional<Boolean> getEnableRemoteReplication() { return this.enableRemoteReplication; }
   
    public void setEnableRemoteReplication(Optional<Boolean> enableRemoteReplication) { 
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
    }
    /** 
     * Specify the time after which the snapshot can be removed. Cannot be used with retention.
     * If neither 'expirationTime' nor 'retention' is specified, the group snapshot will be retained until
     * manually deleted.
     * The format is: 
     *   ISO 8601 date string for time based expiration, otherwise it will not expire.
     *   'null' is the snapshot is to be retained permanently.
     *   'fifo' causes the snapshot to be preserved on a First-In-First-Out basis, relative to other FIFO
     *        snapshots on the volume. The API will fail if no FIFO space is available
     * Warning: Due to a bug, 'expirationTime' does not work correctly prior to magnesium-patch5. Use 'retention' instead.
     **/
    public Optional<String> getExpirationTime() { return this.expirationTime; }
   
    public void setExpirationTime(Optional<String> expirationTime) { 
        this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : expirationTime;
    }
    /** 
     * This operates the same as the expirationTime option, except the time format is HH:MM:SS.
     * If neither 'expirationTime' nor 'retention' is specified, the group snapshot will be retained until
     * manually deleted.
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
    /** 
     * Specify if the snapshot creation should be failed if a previous snapshot replication is in progress.
     * Possible values are:
     * true: This ensures only one snapshot is being replicated at a time by failing this snapshot creation.
     * false: Default. This allows creation of snapshot if another snapshot replication is still in progress.
     **/
    public Optional<Boolean> getEnsureSerialCreation() { return this.ensureSerialCreation; }
   
    public void setEnsureSerialCreation(Optional<Boolean> ensureSerialCreation) { 
        this.ensureSerialCreation = (ensureSerialCreation == null) ? Optional.<Boolean>empty() : ensureSerialCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateGroupSnapshotRequest that = (CreateGroupSnapshotRequest) o;

        return 
            Arrays.equals(volumes, that.volumes) && 
            Objects.equals(name, that.name) && 
            Objects.equals(enableRemoteReplication, that.enableRemoteReplication) && 
            Objects.equals(expirationTime, that.expirationTime) && 
            Objects.equals(retention, that.retention) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(snapMirrorLabel, that.snapMirrorLabel) && 
            Objects.equals(ensureSerialCreation, that.ensureSerialCreation);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])volumes,name,enableRemoteReplication,expirationTime,retention,attributes,snapMirrorLabel,ensureSerialCreation );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumes", volumes);
        map.put("name", name);
        map.put("enableRemoteReplication", enableRemoteReplication);
        map.put("expirationTime", expirationTime);
        map.put("retention", retention);
        map.put("attributes", attributes);
        map.put("snapMirrorLabel", snapMirrorLabel);
        map.put("ensureSerialCreation", ensureSerialCreation);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumes : ").append(gson.toJson(Arrays.toString(volumes))).append(",");
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
        if(null != expirationTime && expirationTime.isPresent()){
            sb.append(" expirationTime : ").append(gson.toJson(expirationTime)).append(",");
        }
        else{
            sb.append(" expirationTime : ").append("null").append(",");
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
        if(null != ensureSerialCreation && ensureSerialCreation.isPresent()){
            sb.append(" ensureSerialCreation : ").append(gson.toJson(ensureSerialCreation)).append(",");
        }
        else{
            sb.append(" ensureSerialCreation : ").append("null").append(",");
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
        private Long[] volumes;
        private Optional<String> name;
        private Optional<Boolean> enableRemoteReplication;
        private Optional<String> expirationTime;
        private Optional<String> retention;
        private Optional<Attributes> attributes;
        private Optional<String> snapMirrorLabel;
        private Optional<Boolean> ensureSerialCreation;

        private Builder() { }

        public CreateGroupSnapshotRequest build() {
            return new CreateGroupSnapshotRequest (
                         this.volumes,
                         this.name,
                         this.enableRemoteReplication,
                         this.expirationTime,
                         this.retention,
                         this.attributes,
                         this.snapMirrorLabel,
                         this.ensureSerialCreation);
        }

        private CreateGroupSnapshotRequest.Builder buildFrom(final CreateGroupSnapshotRequest req) {
            this.volumes = req.volumes;
            this.name = req.name;
            this.enableRemoteReplication = req.enableRemoteReplication;
            this.expirationTime = req.expirationTime;
            this.retention = req.retention;
            this.attributes = req.attributes;
            this.snapMirrorLabel = req.snapMirrorLabel;
            this.ensureSerialCreation = req.ensureSerialCreation;

            return this;
        }

        public CreateGroupSnapshotRequest.Builder volumes(final Long[] volumes) {
            this.volumes = volumes;
            return this;
        }

        public CreateGroupSnapshotRequest.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public CreateGroupSnapshotRequest.Builder optionalEnableRemoteReplication(final Boolean enableRemoteReplication) {
            this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : Optional.of(enableRemoteReplication);
            return this;
        }

        public CreateGroupSnapshotRequest.Builder optionalExpirationTime(final String expirationTime) {
            this.expirationTime = (expirationTime == null) ? Optional.<String>empty() : Optional.of(expirationTime);
            return this;
        }

        public CreateGroupSnapshotRequest.Builder optionalRetention(final String retention) {
            this.retention = (retention == null) ? Optional.<String>empty() : Optional.of(retention);
            return this;
        }

        public CreateGroupSnapshotRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

        public CreateGroupSnapshotRequest.Builder optionalSnapMirrorLabel(final String snapMirrorLabel) {
            this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : Optional.of(snapMirrorLabel);
            return this;
        }

        public CreateGroupSnapshotRequest.Builder optionalEnsureSerialCreation(final Boolean ensureSerialCreation) {
            this.ensureSerialCreation = (ensureSerialCreation == null) ? Optional.<Boolean>empty() : Optional.of(ensureSerialCreation);
            return this;
        }

    }
}
