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
 * ScheduleInfoObject  
 **/

public class ScheduleInfoObject implements Serializable {

    public static final long serialVersionUID = 8712871946735705L;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("volumeID") private Optional<Long> volumeID;
    @SerializedName("volumes") private Optional<Long[]> volumes;
    @SerializedName("enableRemoteReplication") private Optional<Boolean> enableRemoteReplication;
    @SerializedName("retention") private Optional<String> retention;
    // empty constructor
    @Since("7.0")
    public ScheduleInfoObject() {}

    
    // parameterized constructor
    @Since("7.0")
    public ScheduleInfoObject(
        Optional<String> name,
        Optional<Long> volumeID,
        Optional<Long[]> volumes,
        Optional<Boolean> enableRemoteReplication,
        Optional<String> retention
    )
    {
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
    }

    /** 
     * 
     **/
    public Optional<String> getName() { return this.name; }
   
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * 
     **/
    public Optional<Long> getVolumeID() { return this.volumeID; }
   
    public void setVolumeID(Optional<Long> volumeID) { 
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
    }
    /** 
     * 
     **/
    public Optional<Long[]> getVolumes() { return this.volumes; }
   
    public void setVolumes(Optional<Long[]> volumes) { 
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
    }
    /** 
     * Indicates if the snapshot should be included in remote replication.
     **/
    public Optional<Boolean> getEnableRemoteReplication() { return this.enableRemoteReplication; }
   
    public void setEnableRemoteReplication(Optional<Boolean> enableRemoteReplication) { 
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
    }
    /** 
     * The amount of time the snapshot will be retained in HH:mm:ss.
     **/
    public Optional<String> getRetention() { return this.retention; }
   
    public void setRetention(Optional<String> retention) { 
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleInfoObject that = (ScheduleInfoObject) o;

        return 
            Objects.equals(name, that.name) && 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(volumes, that.volumes) && 
            Objects.equals(enableRemoteReplication, that.enableRemoteReplication) && 
            Objects.equals(retention, that.retention);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,volumeID,volumes,enableRemoteReplication,retention );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("volumeID", volumeID);
        map.put("volumes", volumes);
        map.put("enableRemoteReplication", enableRemoteReplication);
        map.put("retention", retention);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != name && name.isPresent()){
            sb.append(" name : ").append(gson.toJson(name)).append(",");
        }
        else{
            sb.append(" name : ").append("null").append(",");
        }
        if(null != volumeID && volumeID.isPresent()){
            sb.append(" volumeID : ").append(gson.toJson(volumeID)).append(",");
        }
        else{
            sb.append(" volumeID : ").append("null").append(",");
        }
        if(null != volumes && volumes.isPresent()){
            sb.append(" volumes : ").append(gson.toJson(volumes)).append(",");
        }
        else{
            sb.append(" volumes : ").append("null").append(",");
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
        private Optional<String> name;
        private Optional<Long> volumeID;
        private Optional<Long[]> volumes;
        private Optional<Boolean> enableRemoteReplication;
        private Optional<String> retention;

        private Builder() { }

        public ScheduleInfoObject build() {
            return new ScheduleInfoObject (
                         this.name,
                         this.volumeID,
                         this.volumes,
                         this.enableRemoteReplication,
                         this.retention);
        }

        private ScheduleInfoObject.Builder buildFrom(final ScheduleInfoObject req) {
            this.name = req.name;
            this.volumeID = req.volumeID;
            this.volumes = req.volumes;
            this.enableRemoteReplication = req.enableRemoteReplication;
            this.retention = req.retention;

            return this;
        }

        public ScheduleInfoObject.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public ScheduleInfoObject.Builder optionalVolumeID(final Long volumeID) {
            this.volumeID = (volumeID == null) ? Optional.<Long>empty() : Optional.of(volumeID);
            return this;
        }

        public ScheduleInfoObject.Builder optionalVolumes(final Long[] volumes) {
            this.volumes = (volumes == null) ? Optional.<Long[]>empty() : Optional.of(volumes);
            return this;
        }

        public ScheduleInfoObject.Builder optionalEnableRemoteReplication(final Boolean enableRemoteReplication) {
            this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : Optional.of(enableRemoteReplication);
            return this;
        }

        public ScheduleInfoObject.Builder optionalRetention(final String retention) {
            this.retention = (retention == null) ? Optional.<String>empty() : Optional.of(retention);
            return this;
        }

    }
}
