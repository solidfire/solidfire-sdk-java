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

import com.solidfire.javautil.Optional;

import com.solidfire.client.ApiException;
import com.solidfire.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import com.solidfire.annotation.Since;

import static com.solidfire.javautil.Optional.of;


/**
 * A volume access group is a useful way of grouping volumes and initiators together for ease of management.
 **/
public class VolumeAccessGroup implements Serializable {

    private static final long serialVersionUID = 1947505380L;

    private final Long volumeAccessGroupID;
    private final String name;
    private final String[] initiators;
    private final Long[] volumes;

    /**
     * A volume access group is a useful way of grouping volumes and initiators together for ease of management.
     * <br/><br/>
     * Volume Access Group Limits:
     * <br/><br/>
     * - A volume access group can contain up to sixty-four initiator IQNs.
     * - An initiator can only belong to only one volume access group.
     * - A volume access group can contain up to two thousand volumes.
     * - Each volume access group can belong to a maximum of four other volume access groups.
     * @param volumeAccessGroupID [required] Unique ID for this volume access group.
     * @param name [required] Name of the volume access group.
     * @param initiators [required] List of unique initiator names belonging to the volume access group.
     * @param volumes [required] List of volumes belonging to the volume access group.
     * @since 7.0
     **/
    @Since("7.0")
    public VolumeAccessGroup(Long volumeAccessGroupID, String name, String[] initiators, Long[] volumes) {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.name = name;
        this.initiators = initiators;
        this.volumes = volumes;
    }


    /**
     * Unique ID for this volume access group.
     **/
    public Long getVolumeAccessGroupID() {
        return this.volumeAccessGroupID;
    }

    /**
     * Name of the volume access group.
     **/
    public String getName() {
        return this.name;
    }

    /**
     * List of unique initiator names belonging to the volume access group.
     **/
    public String[] getInitiators() {
        return this.initiators;
    }

    /**
     * List of volumes belonging to the volume access group.
     **/
    public Long[] getVolumes() {
        return this.volumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumeAccessGroup that = (VolumeAccessGroup) o;
        

        return Objects.equals( volumeAccessGroupID , that.volumeAccessGroupID )
            && Objects.equals( name , that.name )
            && Objects.deepEquals( initiators , that.initiators )
            && Objects.deepEquals( volumes , that.volumes );
    }

    @Override
    public int hashCode() {

        return Objects.hash( volumeAccessGroupID, name, initiators, volumes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" initiators : ").append(Arrays.toString(initiators)).append(",");
        sb.append(" volumes : ").append(Arrays.toString(volumes));
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
