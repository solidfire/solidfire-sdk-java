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
 * The Request object for the "RollbackToSnapshot" API Service call.
 **/
public class RollbackToSnapshotRequest implements Serializable {

    private static final long serialVersionUID = -517674510L;

    private final Long volumeID;
    private final Long snapshotID;
    private final Boolean saveCurrentState;
    private final Optional<String> name;
    private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "RollbackToSnapshot" API Service call.
     * @param volumeID [required] VolumeID for the volume.
     * @param snapshotID [required] ID of a previously created snapshot on the given volume.
     * @param saveCurrentState [required] <br/><b>true</b>: The previous active volume image is kept.
     * @param name (optional) Name for the snapshot. If no name is given, then the name of the snapshot being rolled back to is used with 
     * @param attributes (optional) List of Name/Value pairs in JSON object format
     * @since 7.0
     **/
    @Since("7.0")
    public RollbackToSnapshotRequest(Long volumeID, Long snapshotID, Boolean saveCurrentState, Optional<String> name, Optional<java.util.Map<String, Object>> attributes) {
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.saveCurrentState = saveCurrentState;
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
    }


    /**
     * VolumeID for the volume.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    /**
     * ID of a previously created snapshot on the given volume.
     **/
    public Long getSnapshotID() {
        return this.snapshotID;
    }

    /**
     * <br/><b>true</b>: The previous active volume image is kept.
     * <br/><b>false</b>: (default) The previous active volume image is deleted.
     **/
    public Boolean getSaveCurrentState() {
        return this.saveCurrentState;
    }

    /**
     * Name for the snapshot. If no name is given, then the name of the snapshot being rolled back to is used with 
     * &quot;-copy&quot; appended to the end of the name.
     **/
    public Optional<String> getName() {
        return this.name;
    }

    /**
     * List of Name/Value pairs in JSON object format
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RollbackToSnapshotRequest that = (RollbackToSnapshotRequest) o;
        

        return Objects.equals( volumeID , that.volumeID )
            && Objects.equals( snapshotID , that.snapshotID )
            && Objects.equals( saveCurrentState , that.saveCurrentState )
            && Objects.equals( name , that.name )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {

        return Objects.hash( volumeID, snapshotID, saveCurrentState, name, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" snapshotID : ").append(snapshotID).append(",");
        sb.append(" saveCurrentState : ").append(saveCurrentState).append(",");
        if(null != name && name.isPresent())
            sb.append(" name : ").append(name.get()).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder getBuilder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().fromRequest(this);
    }

    public static class Builder {
        private Long volumeID;
        private Long snapshotID;
        private Boolean saveCurrentState;
        private Optional<String> name;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public RollbackToSnapshotRequest toRequest() {
            return new RollbackToSnapshotRequest (
                         this.volumeID,
                         this.snapshotID,
                         this.saveCurrentState,
                         this.name,
                         this.attributes            );
        }

        private RollbackToSnapshotRequest.Builder fromRequest(final RollbackToSnapshotRequest req) {
            this.volumeID = req.volumeID;
            this.snapshotID = req.snapshotID;
            this.saveCurrentState = req.saveCurrentState;
            this.name = req.name;
            this.attributes = req.attributes;

            return this;
        }

        public RollbackToSnapshotRequest.Builder withVolumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public RollbackToSnapshotRequest.Builder withSnapshotID(final Long snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

        public RollbackToSnapshotRequest.Builder withSaveCurrentState(final Boolean saveCurrentState) {
            this.saveCurrentState = saveCurrentState;
            return this;
        }

        public RollbackToSnapshotRequest.Builder withOptionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public RollbackToSnapshotRequest.Builder withOptionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
