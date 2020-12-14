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
 * RollbackToGroupSnapshotRequest  
 * RollbackToGroupSnapshot enables you to roll back all individual volumes in a snapshot group to each volume's individual snapshot.
 * Note: Rolling back to a group snapshot creates a temporary snapshot of each volume within the group snapshot.
 * Snapshots are allowed if cluster fullness is at stage 2 or 3. Snapshots are not created when cluster fullness is at stage 4 or 5.
 **/

public class RollbackToGroupSnapshotRequest implements Serializable {

    public static final long serialVersionUID = 4457916347133241425L;
    @SerializedName("groupSnapshotID") private Long groupSnapshotID;
    @SerializedName("saveCurrentState") private Boolean saveCurrentState;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    // empty constructor
    @Since("7.0")
    public RollbackToGroupSnapshotRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RollbackToGroupSnapshotRequest(
        Long groupSnapshotID,
        Boolean saveCurrentState,
        Optional<String> name,
        Optional<Attributes> attributes
    )
    {
        this.groupSnapshotID = groupSnapshotID;
        this.saveCurrentState = saveCurrentState;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * Specifies the unique ID of the group snapshot.
     **/
    public Long getGroupSnapshotID() { return this.groupSnapshotID; }
   
    public void setGroupSnapshotID(Long groupSnapshotID) { 
        this.groupSnapshotID = groupSnapshotID;
    }
    /** 
     * Specifies whether to save an active volume image or delete it. Values are:
     * true: The previous active volume image is kept.
     * false: (default) The previous active volume image is deleted.
     **/
    public Boolean getSaveCurrentState() { return this.saveCurrentState; }
   
    public void setSaveCurrentState(Boolean saveCurrentState) { 
        this.saveCurrentState = saveCurrentState;
    }
    /** 
     * Name for the group snapshot of the volume's
     * current state that is created if "saveCurrentState" is
     * set to true. If you do not give a name, the
     * name of the snapshots (group and individual
     * volume) are set to a timestamp of the time that
     * the rollback occurred.
     **/
    public Optional<String> getName() { return this.name; }
   
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * List of name-value pairs in JSON object format.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RollbackToGroupSnapshotRequest that = (RollbackToGroupSnapshotRequest) o;

        return 
            Objects.equals(groupSnapshotID, that.groupSnapshotID) && 
            Objects.equals(saveCurrentState, that.saveCurrentState) && 
            Objects.equals(name, that.name) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( groupSnapshotID,saveCurrentState,name,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("groupSnapshotID", groupSnapshotID);
        map.put("saveCurrentState", saveCurrentState);
        map.put("name", name);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" groupSnapshotID : ").append(gson.toJson(groupSnapshotID)).append(",");
        sb.append(" saveCurrentState : ").append(gson.toJson(saveCurrentState)).append(",");
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(gson.toJson(name)).append(",");
        }
        else{
            sb.append(" name : ").append("null").append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        }
        else{
            sb.append(" attributes : ").append("null").append(",");
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
        private Long groupSnapshotID;
        private Boolean saveCurrentState;
        private Optional<String> name;
        private Optional<Attributes> attributes;

        private Builder() { }

        public RollbackToGroupSnapshotRequest build() {
            return new RollbackToGroupSnapshotRequest (
                         this.groupSnapshotID,
                         this.saveCurrentState,
                         this.name,
                         this.attributes);
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

        public RollbackToGroupSnapshotRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
