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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * The Request object for the "CreateSnapshot" API Service call.
 **/
public class CreateSnapshotRequest implements Serializable {

    private static final long serialVersionUID = -1494750176L;

    @SerializedName("volumeID") private final long volumeID;
    @SerializedName("snapshotID") private final Optional<Long> snapshotID;
    @SerializedName("name") private final Optional<String> name;
    @SerializedName("enableRemoteReplication") private final Optional<Boolean> enableRemoteReplication;
    @SerializedName("retention") private final Optional<String> retention;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "CreateSnapshot" API Service call.
     * @param volumeID [required] ID of the volume image from which to copy.
     * @param snapshotID (optional) Unique ID of a snapshot from which the new snapshot is made.
     * @param name (optional) A name for the snapshot.
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public CreateSnapshotRequest(long volumeID, Optional<Long> snapshotID, Optional<String> name, Optional<java.util.Map<String, Object>> attributes) {
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.retention = Optional.<String>empty();
        this.enableRemoteReplication = Optional.<Boolean>empty();
        this.volumeID = volumeID;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
    }

    /**
     * The Request object for the "CreateSnapshot" API Service call.
     * @param volumeID [required] ID of the volume image from which to copy.
     * @param snapshotID (optional) Unique ID of a snapshot from which the new snapshot is made.
     * @param name (optional) A name for the snapshot.
     * @param enableRemoteReplication (optional) Identifies if snapshot is enabled for remote replication.
     * @param retention (optional) The amount of time the snapshot will be retained. Enter in HH:mm:ss
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 8.0
     **/
    @Since("8.0")
    public CreateSnapshotRequest(long volumeID, Optional<Long> snapshotID, Optional<String> name, Optional<Boolean> enableRemoteReplication, Optional<String> retention, Optional<java.util.Map<String, Object>> attributes) {
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.volumeID = volumeID;
        this.snapshotID = (snapshotID == null) ? Optional.<Long>empty() : snapshotID;
    }


    /**
     * ID of the volume image from which to copy.
     **/
    public long getVolumeID() {
        return this.volumeID;
    }

    /**
     * Unique ID of a snapshot from which the new snapshot is made.
     * The snapshotID passed must be a snapshot on the given volume.
     * If a SnapshotID is not provided, a snapshot is created from the volume&#39;s active branch.
     **/
    public Optional<Long> getSnapshotID() {
        return this.snapshotID;
    }

    /**
     * A name for the snapshot.
     * If no name is provided, the date and time the snapshot was taken is used.
     **/
    public Optional<String> getName() {
        return this.name;
    }

    /**
     * Identifies if snapshot is enabled for remote replication.
     * @since 8.0 
     **/

    @Since("8.0")
    public Optional<Boolean> getEnableRemoteReplication() {
        return this.enableRemoteReplication;
    }

    /**
     * The amount of time the snapshot will be retained. Enter in HH:mm:ss
     * @since 8.0 
     **/

    @Since("8.0")
    public Optional<String> getRetention() {
        return this.retention;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateSnapshotRequest that = (CreateSnapshotRequest) o;
        

        return Objects.equals( volumeID , that.volumeID )
            && Objects.equals( snapshotID , that.snapshotID )
            && Objects.equals( name , that.name )
            && Objects.equals( enableRemoteReplication , that.enableRemoteReplication )
            && Objects.equals( retention , that.retention )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, snapshotID, name, enableRemoteReplication, retention, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        if(null != snapshotID && snapshotID.isPresent())
            sb.append(" snapshotID : ").append(snapshotID.get()).append(",");
        if(null != name && name.isPresent())
            sb.append(" name : ").append(name.get()).append(",");
        if(null != enableRemoteReplication && enableRemoteReplication.isPresent())
            sb.append(" enableRemoteReplication : ").append(enableRemoteReplication.get()).append(",");
        if(null != retention && retention.isPresent())
            sb.append(" retention : ").append(retention.get()).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private long volumeID;
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
                         this.attributes            );
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

        public CreateSnapshotRequest.Builder volumeID(final long volumeID) {
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
