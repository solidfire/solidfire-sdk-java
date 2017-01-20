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
 * RollbackToSnapshotRequest  
 **/

public class RollbackToSnapshotRequest implements Serializable {

    public static final long serialVersionUID = 507001222139064364L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("snapshotID") private Long snapshotID;
    @SerializedName("saveCurrentState") private Boolean saveCurrentState;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public RollbackToSnapshotRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RollbackToSnapshotRequest(
        Long volumeID,
        Long snapshotID,
        Boolean saveCurrentState,
        Optional<String> name,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.volumeID = volumeID;
        this.snapshotID = snapshotID;
        this.saveCurrentState = saveCurrentState;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * VolumeID for the volume.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     * ID of a previously created snapshot on the given volume.
     **/
    public Long getSnapshotID() { return this.snapshotID; }
    public void setSnapshotID(Long snapshotID) { 
        this.snapshotID = snapshotID;
    }
    /** 
     * true: The previous active volume image is kept.
     * false: (default) The previous active volume image is deleted.
     **/
    public Boolean getSaveCurrentState() { return this.saveCurrentState; }
    public void setSaveCurrentState(Boolean saveCurrentState) { 
        this.saveCurrentState = saveCurrentState;
    }
    /** 
     * Name for the snapshot. If no name is given, then the name of the snapshot being rolled back to is used with 
     * "-copy" appended to the end of the name.
     **/
    public Optional<String> getName() { return this.name; }
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * List of Name/Value pairs in JSON object format
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<java.util.Map<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RollbackToSnapshotRequest that = (RollbackToSnapshotRequest) o;

        return 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(snapshotID, that.snapshotID) && 
            Objects.equals(saveCurrentState, that.saveCurrentState) && 
            Objects.equals(name, that.name) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID,snapshotID,saveCurrentState,name,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("snapshotID", snapshotID);
        map.put("saveCurrentState", saveCurrentState);
        map.put("name", name);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" snapshotID : ").append(snapshotID).append(",");
        sb.append(" saveCurrentState : ").append(saveCurrentState).append(",");
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(name).append(",");
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
        private Long snapshotID;
        private Boolean saveCurrentState;
        private Optional<String> name;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public RollbackToSnapshotRequest build() {
            return new RollbackToSnapshotRequest (
                         this.volumeID,
                         this.snapshotID,
                         this.saveCurrentState,
                         this.name,
                         this.attributes);
        }

        private RollbackToSnapshotRequest.Builder buildFrom(final RollbackToSnapshotRequest req) {
            this.volumeID = req.volumeID;
            this.snapshotID = req.snapshotID;
            this.saveCurrentState = req.saveCurrentState;
            this.name = req.name;
            this.attributes = req.attributes;

            return this;
        }

        public RollbackToSnapshotRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public RollbackToSnapshotRequest.Builder snapshotID(final Long snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

        public RollbackToSnapshotRequest.Builder saveCurrentState(final Boolean saveCurrentState) {
            this.saveCurrentState = saveCurrentState;
            return this;
        }

        public RollbackToSnapshotRequest.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public RollbackToSnapshotRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
