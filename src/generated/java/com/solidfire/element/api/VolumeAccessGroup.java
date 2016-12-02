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
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ['A volume access group is a useful way of grouping volumes and initiators together for ease of management.', '<br/><br/>', 'Volume Access Group Limits:', '<br/><br/>', '- A volume access group can contain up to sixty-four initiator IQNs.', '- An initiator can only belong to only one volume access group.', '- A volume access group can contain up to two thousand volumes.', '- Each volume access group can belong to a maximum of four other volume access groups.']['A volume access group is a useful way of grouping volumes and initiators together for ease of management.', '<br/><br/>', 'Volume Access Group Limits:', '<br/><br/>', '- A volume access group can contain up to sixty-four initiator IQNs.', '- An initiator can only belong to only one volume access group.', '- A volume access group can contain up to two thousand volumes.', '- Each volume access group can belong to a maximum of four other volume access groups.']['A volume access group is a useful way of grouping volumes and initiators together for ease of management.', '<br/><br/>', 'Volume Access Group Limits:', '<br/><br/>', '- A volume access group can contain up to sixty-four initiator IQNs.', '- An initiator can only belong to only one volume access group.', '- A volume access group can contain up to two thousand volumes.', '- Each volume access group can belong to a maximum of four other volume access groups.']['A volume access group is a useful way of grouping volumes and initiators together for ease of management.', '<br/><br/>', 'Volume Access Group Limits:', '<br/><br/>', '- A volume access group can contain up to sixty-four initiator IQNs.', '- An initiator can only belong to only one volume access group.', '- A volume access group can contain up to two thousand volumes.', '- Each volume access group can belong to a maximum of four other volume access groups.']['A volume access group is a useful way of grouping volumes and initiators together for ease of management.', '<br/><br/>', 'Volume Access Group Limits:', '<br/><br/>', '- A volume access group can contain up to sixty-four initiator IQNs.', '- An initiator can only belong to only one volume access group.', '- A volume access group can contain up to two thousand volumes.', '- Each volume access group can belong to a maximum of four other volume access groups.']['A volume access group is a useful way of grouping volumes and initiators together for ease of management.', '<br/><br/>', 'Volume Access Group Limits:', '<br/><br/>', '- A volume access group can contain up to sixty-four initiator IQNs.', '- An initiator can only belong to only one volume access group.', '- A volume access group can contain up to two thousand volumes.', '- Each volume access group can belong to a maximum of four other volume access groups.']['A volume access group is a useful way of grouping volumes and initiators together for ease of management.', '<br/><br/>', 'Volume Access Group Limits:', '<br/><br/>', '- A volume access group can contain up to sixty-four initiator IQNs.', '- An initiator can only belong to only one volume access group.', '- A volume access group can contain up to two thousand volumes.', '- Each volume access group can belong to a maximum of four other volume access groups.']['A volume access group is a useful way of grouping volumes and initiators together for ease of management.', '<br/><br/>', 'Volume Access Group Limits:', '<br/><br/>', '- A volume access group can contain up to sixty-four initiator IQNs.', '- An initiator can only belong to only one volume access group.', '- A volume access group can contain up to two thousand volumes.', '- Each volume access group can belong to a maximum of four other volume access groups.']
 **/

public class VolumeAccessGroup implements Serializable {

    public static final long serialVersionUID = 143293271697026076L;
    @SerializedName("attributes") private LinkedTreeMap<String, Object> attributes;
    @SerializedName("deletedVolumes") private Long[] deletedVolumes;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("name") private String name;
    @SerializedName("initiatorIDs") private Long[] initiatorIDs;
    @SerializedName("initiators") private String[] initiators;
    @SerializedName("volumes") private Long[] volumes;

    // empty constructor
    @Since("7.0")
    public VolumeAccessGroup() {}

    // parameterized constructor
    @Since("7.0")
    public VolumeAccessGroup(
        LinkedTreeMap<String, Object> attributes,
        Long[] deletedVolumes,
        Long volumeAccessGroupID,
        String name,
        Long[] initiatorIDs,
        String[] initiators,
        Long[] volumes
    )
    {
        this.attributes = attributes;
        this.deletedVolumes = deletedVolumes;
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.name = name;
        this.initiatorIDs = initiatorIDs;
        this.initiators = initiators;
        this.volumes = volumes;
    }

    /** 
     * List of name/value pairs
     **/
    public LinkedTreeMap<String, Object> getAttributes() { return this.attributes; }
    public void setAttributes(LinkedTreeMap<String, Object> attributes) { 
        this.attributes = attributes;
    }
    /** 
     * A list of deleted volumes that have yet to be purged from the VAG.
     **/
    public Long[] getDeletedVolumes() { return this.deletedVolumes; }
    public void setDeletedVolumes(Long[] deletedVolumes) { 
        this.deletedVolumes = deletedVolumes;
    }
    /** 
     * Unique ID for this volume access group.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    /** 
     * Name of the volume access group.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * A list of IDs of initiators that are mapped to the VAG.
     **/
    public Long[] getInitiatorIDs() { return this.initiatorIDs; }
    public void setInitiatorIDs(Long[] initiatorIDs) { 
        this.initiatorIDs = initiatorIDs;
    }
    /** 
     * List of unique initiator names belonging to the volume access group.
     **/
    public String[] getInitiators() { return this.initiators; }
    public void setInitiators(String[] initiators) { 
        this.initiators = initiators;
    }
    /** 
     * List of volumes belonging to the volume access group.
     **/
    public Long[] getVolumes() { return this.volumes; }
    public void setVolumes(Long[] volumes) { 
        this.volumes = volumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VolumeAccessGroup that = (VolumeAccessGroup) o;

        return 
            Objects.equals(attributes, that.attributes) &&
            Arrays.equals(deletedVolumes, that.deletedVolumes) &&
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) &&
            Objects.equals(name, that.name) &&
            Arrays.equals(initiatorIDs, that.initiatorIDs) &&
            Arrays.equals(initiators, that.initiators) &&
            Arrays.equals(volumes, that.volumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( attributes, (Object[])deletedVolumes, volumeAccessGroupID, name, (Object[])initiatorIDs, (Object[])initiators, (Object[])volumes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("attributes", attributes);
        map.put("deletedVolumes", deletedVolumes);
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("name", name);
        map.put("initiatorIDs", initiatorIDs);
        map.put("initiators", initiators);
        map.put("volumes", volumes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" attributes : ").append(attributes).append(",");
        sb.append(" deletedVolumes : ").append(Arrays.toString(deletedVolumes)).append(",");
        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" initiatorIDs : ").append(Arrays.toString(initiatorIDs)).append(",");
        sb.append(" initiators : ").append(Arrays.toString(initiators)).append(",");
        sb.append(" volumes : ").append(Arrays.toString(volumes)).append(",");
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
        private LinkedTreeMap<String, Object> attributes;
        private Long[] deletedVolumes;
        private Long volumeAccessGroupID;
        private String name;
        private Long[] initiatorIDs;
        private String[] initiators;
        private Long[] volumes;

        private Builder() { }

        public VolumeAccessGroup build() {
            return new VolumeAccessGroup (
                         this.attributes,
                         this.deletedVolumes,
                         this.volumeAccessGroupID,
                         this.name,
                         this.initiatorIDs,
                         this.initiators,
                         this.volumes);
        }

        private VolumeAccessGroup.Builder buildFrom(final VolumeAccessGroup req) {
            this.attributes = req.attributes;
            this.deletedVolumes = req.deletedVolumes;
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.name = req.name;
            this.initiatorIDs = req.initiatorIDs;
            this.initiators = req.initiators;
            this.volumes = req.volumes;

            return this;
        }

        public VolumeAccessGroup.Builder attributes(final LinkedTreeMap<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

        public VolumeAccessGroup.Builder deletedVolumes(final Long[] deletedVolumes) {
            this.deletedVolumes = deletedVolumes;
            return this;
        }

        public VolumeAccessGroup.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public VolumeAccessGroup.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public VolumeAccessGroup.Builder initiatorIDs(final Long[] initiatorIDs) {
            this.initiatorIDs = initiatorIDs;
            return this;
        }

        public VolumeAccessGroup.Builder initiators(final String[] initiators) {
            this.initiators = initiators;
            return this;
        }

        public VolumeAccessGroup.Builder volumes(final Long[] volumes) {
            this.volumes = volumes;
            return this;
        }

    }
}
