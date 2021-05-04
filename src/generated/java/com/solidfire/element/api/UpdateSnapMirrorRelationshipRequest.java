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
 * UpdateSnapMirrorRelationshipRequest  
 * The SolidFire Element OS web UI uses the UpdateSnapMirrorRelationship method to make the destination volume in a SnapMirror relationship an up-to-date mirror of the source volume.
 **/

public class UpdateSnapMirrorRelationshipRequest implements Serializable {

    public static final long serialVersionUID = 3436586994614198623L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("destinationVolume") private SnapMirrorVolumeInfo destinationVolume;
    @SerializedName("maxTransferRate") private Optional<Long> maxTransferRate;

    
    // parameterized constructor
    @Since("7.0")
    public UpdateSnapMirrorRelationshipRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public UpdateSnapMirrorRelationshipRequest(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo destinationVolume,
        Optional<Long> maxTransferRate
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.destinationVolume = destinationVolume;
        this.maxTransferRate = (maxTransferRate == null) ? Optional.<Long>empty() : maxTransferRate;
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
     * Specifies the maximum data transfer rate
     * between the volumes in kilobytes per second.
     * The default value, 0, is unlimited and permits the SnapMirror
     * relationship to fully utilize the available network bandwidth.
     **/
    public Optional<Long> getMaxTransferRate() { return this.maxTransferRate; }
   
    public void setMaxTransferRate(Optional<Long> maxTransferRate) { 
        this.maxTransferRate = (maxTransferRate == null) ? Optional.<Long>empty() : maxTransferRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpdateSnapMirrorRelationshipRequest that = (UpdateSnapMirrorRelationshipRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(destinationVolume, that.destinationVolume) && 
            Objects.equals(maxTransferRate, that.maxTransferRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,destinationVolume,maxTransferRate );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("destinationVolume", destinationVolume);
        map.put("maxTransferRate", maxTransferRate);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" destinationVolume : ").append(gson.toJson(destinationVolume)).append(",");
        if(null != maxTransferRate && maxTransferRate.isPresent()){
            sb.append(" maxTransferRate : ").append(gson.toJson(maxTransferRate)).append(",");
        }
        else{
            sb.append(" maxTransferRate : ").append("null").append(",");
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
        private Optional<Long> maxTransferRate;

        private Builder() { }

        public UpdateSnapMirrorRelationshipRequest build() {
            return new UpdateSnapMirrorRelationshipRequest (
                         this.snapMirrorEndpointID,
                         this.destinationVolume,
                         this.maxTransferRate);
        }

        private UpdateSnapMirrorRelationshipRequest.Builder buildFrom(final UpdateSnapMirrorRelationshipRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.destinationVolume = req.destinationVolume;
            this.maxTransferRate = req.maxTransferRate;

            return this;
        }

        public UpdateSnapMirrorRelationshipRequest.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public UpdateSnapMirrorRelationshipRequest.Builder destinationVolume(final SnapMirrorVolumeInfo destinationVolume) {
            this.destinationVolume = destinationVolume;
            return this;
        }

        public UpdateSnapMirrorRelationshipRequest.Builder optionalMaxTransferRate(final Long maxTransferRate) {
            this.maxTransferRate = (maxTransferRate == null) ? Optional.<Long>empty() : Optional.of(maxTransferRate);
            return this;
        }

    }
}
