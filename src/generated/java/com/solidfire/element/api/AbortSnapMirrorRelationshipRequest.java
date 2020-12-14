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
 * AbortSnapMirrorRelationshipRequest  
 * The SolidFire Element OS web UI uses the AbortSnapMirrorRelationship method to stop SnapMirror transfers that have started but are not yet complete.
 **/

public class AbortSnapMirrorRelationshipRequest implements Serializable {

    public static final long serialVersionUID = 3100917634746542939L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("destinationVolume") private SnapMirrorVolumeInfo destinationVolume;
    @SerializedName("clearCheckpoint") private Optional<Boolean> clearCheckpoint;

    
    // parameterized constructor
    @Since("7.0")
    public AbortSnapMirrorRelationshipRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public AbortSnapMirrorRelationshipRequest(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo destinationVolume,
        Optional<Boolean> clearCheckpoint
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.destinationVolume = destinationVolume;
        this.clearCheckpoint = (clearCheckpoint == null) ? Optional.<Boolean>empty() : clearCheckpoint;
    }

    /** 
     * The endpoint ID of the remote ONTAP storage system communicating with the SolidFire cluster.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The destination volume in the SnapMirror relationship.
     **/
    public SnapMirrorVolumeInfo getDestinationVolume() { return this.destinationVolume; }
   
    public void setDestinationVolume(SnapMirrorVolumeInfo destinationVolume) { 
        this.destinationVolume = destinationVolume;
    }
    /** 
     * Determines whether or not to clear the restart checkpoint.
     **/
    public Optional<Boolean> getClearCheckpoint() { return this.clearCheckpoint; }
   
    public void setClearCheckpoint(Optional<Boolean> clearCheckpoint) { 
        this.clearCheckpoint = (clearCheckpoint == null) ? Optional.<Boolean>empty() : clearCheckpoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbortSnapMirrorRelationshipRequest that = (AbortSnapMirrorRelationshipRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(destinationVolume, that.destinationVolume) && 
            Objects.equals(clearCheckpoint, that.clearCheckpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,destinationVolume,clearCheckpoint );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("destinationVolume", destinationVolume);
        map.put("clearCheckpoint", clearCheckpoint);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" destinationVolume : ").append(gson.toJson(destinationVolume)).append(",");
        if(null != clearCheckpoint && clearCheckpoint.isPresent()){
            sb.append(" clearCheckpoint : ").append(gson.toJson(clearCheckpoint)).append(",");
        }
        else{
            sb.append(" clearCheckpoint : ").append("null").append(",");
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
        private Long snapMirrorEndpointID;
        private SnapMirrorVolumeInfo destinationVolume;
        private Optional<Boolean> clearCheckpoint;

        private Builder() { }

        public AbortSnapMirrorRelationshipRequest build() {
            return new AbortSnapMirrorRelationshipRequest (
                         this.snapMirrorEndpointID,
                         this.destinationVolume,
                         this.clearCheckpoint);
        }

        private AbortSnapMirrorRelationshipRequest.Builder buildFrom(final AbortSnapMirrorRelationshipRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.destinationVolume = req.destinationVolume;
            this.clearCheckpoint = req.clearCheckpoint;

            return this;
        }

        public AbortSnapMirrorRelationshipRequest.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public AbortSnapMirrorRelationshipRequest.Builder destinationVolume(final SnapMirrorVolumeInfo destinationVolume) {
            this.destinationVolume = destinationVolume;
            return this;
        }

        public AbortSnapMirrorRelationshipRequest.Builder optionalClearCheckpoint(final Boolean clearCheckpoint) {
            this.clearCheckpoint = (clearCheckpoint == null) ? Optional.<Boolean>empty() : Optional.of(clearCheckpoint);
            return this;
        }

    }
}
