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
 * AddInitiatorsToVolumeAccessGroupRequest  
 * AddInitiatorsToVolumeAccessGroup enables you
 * to add initiators to a specified volume access group.
 **/

public class AddInitiatorsToVolumeAccessGroupRequest implements Serializable {

    public static final long serialVersionUID = -4986889355987786020L;
    @SerializedName("volumeAccessGroupID") private Long volumeAccessGroupID;
    @SerializedName("initiators") private String[] initiators;
    // empty constructor
    @Since("7.0")
    public AddInitiatorsToVolumeAccessGroupRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddInitiatorsToVolumeAccessGroupRequest(
        Long volumeAccessGroupID,
        String[] initiators
    )
    {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.initiators = initiators;
    }

    /** 
     * The ID of the volume access group
     * to modify.
     **/
    public Long getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
   
    public void setVolumeAccessGroupID(Long volumeAccessGroupID) { 
        this.volumeAccessGroupID = volumeAccessGroupID;
    }
    /** 
     * The list of initiators to add to the volume access
     * group.
     **/
    public String[] getInitiators() { return this.initiators; }
   
    public void setInitiators(String[] initiators) { 
        this.initiators = initiators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddInitiatorsToVolumeAccessGroupRequest that = (AddInitiatorsToVolumeAccessGroupRequest) o;

        return 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID) && 
            Arrays.equals(initiators, that.initiators);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeAccessGroupID,(Object[])initiators );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        map.put("initiators", initiators);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupID : ").append(gson.toJson(volumeAccessGroupID)).append(",");
        sb.append(" initiators : ").append(gson.toJson(Arrays.toString(initiators))).append(",");
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

        private Builder() { }

        public AddInitiatorsToVolumeAccessGroupRequest build() {
            return new AddInitiatorsToVolumeAccessGroupRequest (
                         this.volumeAccessGroupID,
                         this.initiators);
        }

        private AddInitiatorsToVolumeAccessGroupRequest.Builder buildFrom(final AddInitiatorsToVolumeAccessGroupRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;
            this.initiators = req.initiators;

            return this;
        }

        public AddInitiatorsToVolumeAccessGroupRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

        public AddInitiatorsToVolumeAccessGroupRequest.Builder initiators(final String[] initiators) {
            this.initiators = initiators;
            return this;
        }

    }
}
