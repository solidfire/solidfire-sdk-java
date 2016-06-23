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
 * 
 **/
public class ScheduleInfo implements Serializable {

    private static final long serialVersionUID = 1734093909L;

    @SerializedName("volumeID") private final Optional<Long> volumeID;
    @SerializedName("volumes") private final Optional<Long[]> volumes;
    @SerializedName("name") private final Optional<String> name;
    @SerializedName("enableRemoteReplication") private final Optional<Boolean> enableRemoteReplication;
    @SerializedName("retention") private final Optional<String> retention;

    /**
     * 
     * @param volumeID (optional) The ID of the volume to be included in the snapshot.
     * @param volumes (optional) A list of volume IDs to be included in the group snapshot.
     * @param name (optional) The snapshot name to be used. 
     * @param enableRemoteReplication (optional) Indicates if the snapshot should be included in remote replication.
     * @param retention (optional) The amount of time the snapshot will be retained in HH:mm:ss.
     * @since 7.0
     **/
    @Since("7.0")
    public ScheduleInfo(Optional<Long> volumeID, Optional<Long[]> volumes, Optional<String> name, Optional<Boolean> enableRemoteReplication, Optional<String> retention) {
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.volumes = (volumes == null) ? Optional.<Long[]>empty() : volumes;
        this.retention = (retention == null) ? Optional.<String>empty() : retention;
        this.enableRemoteReplication = (enableRemoteReplication == null) ? Optional.<Boolean>empty() : enableRemoteReplication;
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
    }


    /**
     * The ID of the volume to be included in the snapshot.
     **/
    public Optional<Long> getVolumeID() {
        return this.volumeID;
    }

    /**
     * A list of volume IDs to be included in the group snapshot.
     **/
    public Optional<Long[]> getVolumes() {
        return this.volumes;
    }

    /**
     * The snapshot name to be used. 
     **/
    public Optional<String> getName() {
        return this.name;
    }

    /**
     * Indicates if the snapshot should be included in remote replication.
     **/
    public Optional<Boolean> getEnableRemoteReplication() {
        return this.enableRemoteReplication;
    }

    /**
     * The amount of time the snapshot will be retained in HH:mm:ss.
     **/
    public Optional<String> getRetention() {
        return this.retention;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleInfo that = (ScheduleInfo) o;
        

        return Objects.equals( volumeID , that.volumeID )
            && Objects.deepEquals( volumes , that.volumes )
            && Objects.equals( name , that.name )
            && Objects.equals( enableRemoteReplication , that.enableRemoteReplication )
            && Objects.equals( retention , that.retention );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, volumes, name, enableRemoteReplication, retention );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != volumeID && volumeID.isPresent())
            sb.append(" volumeID : ").append(volumeID.get()).append(",");
        if(null != volumes && volumes.isPresent())
            sb.append(" volumes : ").append(Arrays.toString(volumes.get())).append(",");
        if(null != name && name.isPresent())
            sb.append(" name : ").append(name.get()).append(",");
        if(null != enableRemoteReplication && enableRemoteReplication.isPresent())
            sb.append(" enableRemoteReplication : ").append(enableRemoteReplication.get()).append(",");
        if(null != retention && retention.isPresent())
            sb.append(" retention : ").append(retention.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
