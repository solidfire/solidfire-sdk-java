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
 * RemoveInitiatorsFromVolumeAccessGroupRequest  
 * RemoveInitiatorsFromVolumeAccessGroup enables
 * you to remove initiators from a specified volume access
 * group.
 **/

public class RemoveInitiatorsFromVolumeAccessGroupRequest implements Serializable {

    public static final long serialVersionUID = -2730673756923075972L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("initiators") private String[] initiators;
    @SerializedName("deleteOrphanInitiators") private Optional<Boolean> deleteOrphanInitiators = Optional.of(true);
    // empty constructor
    @Since("7.0")
    public RemoveInitiatorsFromVolumeAccessGroupRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RemoveInitiatorsFromVolumeAccessGroupRequest(
        Long volumeAccessGroupID,
        String[] initiators
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.initiators = initiators;
    }
    // parameterized constructor
    @Since("9.0")
    public RemoveInitiatorsFromVolumeAccessGroupRequest(
        Long volumeAccessGroupID,
        String[] initiators,
        Optional<Boolean> deleteOrphanInitiators
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.initiators = initiators;
        this.deleteOrphanInitiators = (deleteOrphanInitiators == null) ? Optional.<Boolean>empty() : deleteOrphanInitiators;
    }

    /** 
     * The ID of the volume access group
     * from which the initiators are removed.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
   
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    /** 
     * The list of initiators to remove from the volume
     * access group.
     **/
    public String[] getInitiators() { return this.initiators; }
   
    public void setInitiators(String[] initiators) { 
        this.initiators = initiators;
    }
    /** 
     * true: Default. Delete initiator objects after they are removed from a volume access group.
     * false: Do not delete initiator objects after they are removed from a volume access group.
     **/
    public Optional<Boolean> getDeleteOrphanInitiators() { return this.deleteOrphanInitiators; }
   
    public void setDeleteOrphanInitiators(Optional<Boolean> deleteOrphanInitiators) { 
        this.deleteOrphanInitiators = (deleteOrphanInitiators == null) ? Optional.<Boolean>empty() : deleteOrphanInitiators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveInitiatorsFromVolumeAccessGroupRequest that = (RemoveInitiatorsFromVolumeAccessGroupRequest) o;

        return 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) && 
            Arrays.equals(initiators, that.initiators) && 
            Objects.equals(deleteOrphanInitiators, that.deleteOrphanInitiators);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID,(Object[])initiators,deleteOrphanInitiators );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("initiators", initiators);
        map.put("deleteOrphanInitiators", deleteOrphanInitiators);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(gson.toJson(volumeAccessGroupID)).append(",");
        sb.append(" initiators : ").append(gson.toJson(Arrays.toString(initiators))).append(",");
        if(null != deleteOrphanInitiators && deleteOrphanInitiators.isPresent()){
            sb.append(" deleteOrphanInitiators : ").append(gson.toJson(deleteOrphanInitiators)).append(",");
        }
        else{
            sb.append(" deleteOrphanInitiators : ").append("null").append(",");
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
        private Long volumeAccessGroupID;
        private String[] initiators;
        private Optional<Boolean> deleteOrphanInitiators;

        private Builder() { }

        public RemoveInitiatorsFromVolumeAccessGroupRequest build() {
            return new RemoveInitiatorsFromVolumeAccessGroupRequest (
                         this.volumeAccessGroupID,
                         this.initiators,
                         this.deleteOrphanInitiators);
        }

        private RemoveInitiatorsFromVolumeAccessGroupRequest.Builder buildFrom(final RemoveInitiatorsFromVolumeAccessGroupRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.initiators = req.initiators;
            this.deleteOrphanInitiators = req.deleteOrphanInitiators;

            return this;
        }

        public RemoveInitiatorsFromVolumeAccessGroupRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public RemoveInitiatorsFromVolumeAccessGroupRequest.Builder initiators(final String[] initiators) {
            this.initiators = initiators;
            return this;
        }

        public RemoveInitiatorsFromVolumeAccessGroupRequest.Builder optionalDeleteOrphanInitiators(final Boolean deleteOrphanInitiators) {
            this.deleteOrphanInitiators = (deleteOrphanInitiators == null) ? Optional.<Boolean>empty() : Optional.of(deleteOrphanInitiators);
            return this;
        }

    }
}
