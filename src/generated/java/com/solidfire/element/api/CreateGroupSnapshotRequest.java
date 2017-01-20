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
 * CreateGroupSnapshotRequest  
 **/

public class CreateGroupSnapshotRequest implements Serializable {

    public static final long serialVersionUID = 8808255094235679875L;
    @SerializedName("volumes") private Long[] volumes;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("enableRemoteReplication") private Optional<Boolean> enableRemoteReplication;
    @SerializedName("retention") private Optional<String> retention;
    @SerializedName("attributes") private Optional<java.util.Map<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public CreateGroupSnapshotRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateGroupSnapshotRequest(
        Long[] volumes,
        Optional<String> name,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.volumes = volumes;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }
    // parameterized constructor
    @Since("8.0")
    public CreateGroupSnapshotRequest(
        Long[] volumes,
        Optional<String> name,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> retention,
        Optional<java.util.Map<String, Object>> attributes
    )
    {
        this.volumes = volumes;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
    }

    /** 
     * Unique ID of the volume image from which to copy.
     **/
    public Long[] getVolumes() { return this.volumes; }
    public void setVolumes(Long[] volumes) { 
        this.volumes = volumes;
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

        CreateGroupSnapshotRequest that = (CreateGroupSnapshotRequest) o;

        return 
            Arrays.equals(volumes, that.volumes) && 
            Objects.equals(name, that.name) && 
            Objects.equals(enableRemoteReplication, that.enableRemoteReplication) && 
            Objects.equals(retention, that.retention) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])volumes,name,enableRemoteReplication,retention,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumes", volumes);
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

        sb.append(" volumes : ").append(Arrays.toString(volumes)).append(",");
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
        private Long[] volumes;
        private Optional<String> name;
        private Optional<Boolean> enableRemoteReplication;
        private Optional<String> retention;
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public CreateGroupSnapshotRequest build() {
            return new CreateGroupSnapshotRequest (
                         this.volumes,
                         this.name,
                         this.enableRemoteReplication,
                         this.retention,
                         this.attributes);
        }

        private CreateGroupSnapshotRequest.Builder buildFrom(final CreateGroupSnapshotRequest req) {
            this.volumes = req.volumes;
            this.name = req.name;
            this.enableRemoteReplication = req.enableRemoteReplication;
            this.retention = req.retention;
            this.attributes = req.attributes;

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

        public CreateGroupSnapshotRequest.Builder optionalRetention(final String retention) {
            this.retention = (retention == null) ? Optional.<String>empty() : Optional.of(retention);
            return this;
        }

        public CreateGroupSnapshotRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
