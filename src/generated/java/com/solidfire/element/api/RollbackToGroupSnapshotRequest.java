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
 * The Request object for the "RollbackToGroupSnapshot" API Service call.
 **/
public class RollbackToGroupSnapshotRequest  implements Serializable  {

    private static final long serialVersionUID = 1217912347L;

    @SerializedName("groupSnapshotID") private final Long groupSnapshotID;
    @SerializedName("saveCurrentState") private final Boolean saveCurrentState;
    @SerializedName("name") private final Optional<String> name;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "RollbackToGroupSnapshot" API Service call.
     * @param groupSnapshotID [required] Unique ID of the group snapshot.
     * @param saveCurrentState [required] <br/><b>true</b>: The previous active volume image is kept.
     * @param name (optional) Name for the snapshot. If no name is given, then the name of the snapshot being rolled back to is used with 
     * @param attributes (optional) List of Name/Value pairs in JSON object format
     * @since 7.0
     **/
    @Since("7.0")
    public RollbackToGroupSnapshotRequest(Long groupSnapshotID, Boolean saveCurrentState, Optional<String> name, Optional<java.util.Map<String, Object>> attributes) {
        this.groupSnapshotID = groupSnapshotID;
        this.saveCurrentState = saveCurrentState;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }


    /**
     * Unique ID of the group snapshot.
     **/
    public Long getGroupSnapshotID() {
        return this.groupSnapshotID;
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
     * "-copy" appended to the end of the name.
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

        RollbackToGroupSnapshotRequest that = (RollbackToGroupSnapshotRequest) o;
        

        return Objects.equals( groupSnapshotID , that.groupSnapshotID )
            && Objects.equals( saveCurrentState , that.saveCurrentState )
            && Objects.equals( name , that.name )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( groupSnapshotID, saveCurrentState, name, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" groupSnapshotID : ").append(groupSnapshotID).append(",");
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

    public static Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Long groupSnapshotID;
        private Boolean saveCurrentState;
        private Optional<String> name;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public RollbackToGroupSnapshotRequest build() {
            return new RollbackToGroupSnapshotRequest (
                         this.groupSnapshotID,
                         this.saveCurrentState,
                         this.name,
                         this.attributes            );
        }

        private RollbackToGroupSnapshotRequest.Builder buildFrom(final RollbackToGroupSnapshotRequest req) {
            this.groupSnapshotID = req.groupSnapshotID;
            this.saveCurrentState = req.saveCurrentState;
            this.name = req.name;
            this.attributes = req.attributes;

            return this;
        }

        public RollbackToGroupSnapshotRequest.Builder groupSnapshotID(final Long groupSnapshotID) {
            this.groupSnapshotID = groupSnapshotID;
            return this;
        }

        public RollbackToGroupSnapshotRequest.Builder saveCurrentState(final Boolean saveCurrentState) {
            this.saveCurrentState = saveCurrentState;
            return this;
        }

        public RollbackToGroupSnapshotRequest.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public RollbackToGroupSnapshotRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
