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
 * DeleteSnapMirrorRelationshipsRequest  
 * The SolidFire Element OS web UI uses the DeleteSnapMirrorRelationships method to remove one or more SnapMirror relationships between a source and destination endpoint.
 **/

public class DeleteSnapMirrorRelationshipsRequest implements Serializable {

    public static final long serialVersionUID = -8741175875450520493L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("destinationVolumes") private SnapMirrorVolumeInfo[] destinationVolumes;

    
    // parameterized constructor
    @Since("7.0")
    public DeleteSnapMirrorRelationshipsRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public DeleteSnapMirrorRelationshipsRequest(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo[] destinationVolumes
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.destinationVolumes = destinationVolumes;
    }

    /** 
     * The endpoint ID of the remote ONTAP storage system communicating
     * with the SolidFire cluster.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The destination volume or volumes in the SnapMirror relationship.
     **/
    public SnapMirrorVolumeInfo[] getDestinationVolumes() { return this.destinationVolumes; }
   
    public void setDestinationVolumes(SnapMirrorVolumeInfo[] destinationVolumes) { 
        this.destinationVolumes = destinationVolumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteSnapMirrorRelationshipsRequest that = (DeleteSnapMirrorRelationshipsRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Arrays.equals(destinationVolumes, that.destinationVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,(Object[])destinationVolumes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("destinationVolumes", destinationVolumes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" destinationVolumes : ").append(gson.toJson(Arrays.toString(destinationVolumes))).append(",");
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
        private Long snapMirrorEndpointID;
        private SnapMirrorVolumeInfo[] destinationVolumes;

        private Builder() { }

        public DeleteSnapMirrorRelationshipsRequest build() {
            return new DeleteSnapMirrorRelationshipsRequest (
                         this.snapMirrorEndpointID,
                         this.destinationVolumes);
        }

        private DeleteSnapMirrorRelationshipsRequest.Builder buildFrom(final DeleteSnapMirrorRelationshipsRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.destinationVolumes = req.destinationVolumes;

            return this;
        }

        public DeleteSnapMirrorRelationshipsRequest.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public DeleteSnapMirrorRelationshipsRequest.Builder destinationVolumes(final SnapMirrorVolumeInfo[] destinationVolumes) {
            this.destinationVolumes = destinationVolumes;
            return this;
        }

    }
}
