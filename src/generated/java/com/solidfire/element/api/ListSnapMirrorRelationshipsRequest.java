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
 * ListSnapMirrorRelationshipsRequest  
 * The SolidFire Element OS web UI uses the ListSnapMirrorRelationships method to list one or all SnapMirror relationships on a SolidFire cluster
 **/

public class ListSnapMirrorRelationshipsRequest implements Serializable {

    public static final long serialVersionUID = -2138217764724709497L;
    @SerializedName("snapMirrorEndpointID") private Optional<Long> snapMirrorEndpointID;
    @SerializedName("destinationVolume") private Optional<SnapMirrorVolumeInfo> destinationVolume;
    @SerializedName("sourceVolume") private Optional<SnapMirrorVolumeInfo> sourceVolume;
    @SerializedName("vserver") private Optional<String> vserver;
    @SerializedName("relationshipID") private Optional<String> relationshipID;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorRelationshipsRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorRelationshipsRequest(
        Optional<Long> snapMirrorEndpointID,
        Optional<SnapMirrorVolumeInfo> destinationVolume,
        Optional<SnapMirrorVolumeInfo> sourceVolume,
        Optional<String> vserver,
        Optional<String> relationshipID
    )
    {
        this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : snapMirrorEndpointID;
        this.destinationVolume = (destinationVolume == null) ? Optional.<SnapMirrorVolumeInfo>empty() : destinationVolume;
        this.sourceVolume = (sourceVolume == null) ? Optional.<SnapMirrorVolumeInfo>empty() : sourceVolume;
        this.vserver = (vserver == null) ? Optional.<String>empty() : vserver;
        this.relationshipID = (relationshipID == null) ? Optional.<String>empty() : relationshipID;
    }

    /** 
     * List only the relationships associated
     * with the specified endpoint ID.
     * If no endpoint ID is provided, the system
     * lists relationships from all known SnapMirror endpoints.
     **/
    public Optional<Long> getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Optional<Long> snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : snapMirrorEndpointID;
    }
    /** 
     * List relationships associated with the specified destination volume.
     **/
    public Optional<SnapMirrorVolumeInfo> getDestinationVolume() { return this.destinationVolume; }
   
    public void setDestinationVolume(Optional<SnapMirrorVolumeInfo> destinationVolume) { 
        this.destinationVolume = (destinationVolume == null) ? Optional.<SnapMirrorVolumeInfo>empty() : destinationVolume;
    }
    /** 
     * List relationships associated with the specified source volume.
     **/
    public Optional<SnapMirrorVolumeInfo> getSourceVolume() { return this.sourceVolume; }
   
    public void setSourceVolume(Optional<SnapMirrorVolumeInfo> sourceVolume) { 
        this.sourceVolume = (sourceVolume == null) ? Optional.<SnapMirrorVolumeInfo>empty() : sourceVolume;
    }
    /** 
     * List relationships on the specified Vserver.
     **/
    public Optional<String> getVserver() { return this.vserver; }
   
    public void setVserver(Optional<String> vserver) { 
        this.vserver = (vserver == null) ? Optional.<String>empty() : vserver;
    }
    /** 
     * List relationships associated with the specified relationshipID.
     **/
    public Optional<String> getRelationshipID() { return this.relationshipID; }
   
    public void setRelationshipID(Optional<String> relationshipID) { 
        this.relationshipID = (relationshipID == null) ? Optional.<String>empty() : relationshipID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorRelationshipsRequest that = (ListSnapMirrorRelationshipsRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(destinationVolume, that.destinationVolume) && 
            Objects.equals(sourceVolume, that.sourceVolume) && 
            Objects.equals(vserver, that.vserver) && 
            Objects.equals(relationshipID, that.relationshipID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,destinationVolume,sourceVolume,vserver,relationshipID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("destinationVolume", destinationVolume);
        map.put("sourceVolume", sourceVolume);
        map.put("vserver", vserver);
        map.put("relationshipID", relationshipID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != snapMirrorEndpointID && snapMirrorEndpointID.isPresent()){
            sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        }
        else{
            sb.append(" snapMirrorEndpointID : ").append("null").append(",");
        }
        if(null != destinationVolume && destinationVolume.isPresent()){
            sb.append(" destinationVolume : ").append(gson.toJson(destinationVolume)).append(",");
        }
        else{
            sb.append(" destinationVolume : ").append("null").append(",");
        }
        if(null != sourceVolume && sourceVolume.isPresent()){
            sb.append(" sourceVolume : ").append(gson.toJson(sourceVolume)).append(",");
        }
        else{
            sb.append(" sourceVolume : ").append("null").append(",");
        }
        if(null != vserver && vserver.isPresent()){
            sb.append(" vserver : ").append(gson.toJson(vserver)).append(",");
        }
        else{
            sb.append(" vserver : ").append("null").append(",");
        }
        if(null != relationshipID && relationshipID.isPresent()){
            sb.append(" relationshipID : ").append(gson.toJson(relationshipID)).append(",");
        }
        else{
            sb.append(" relationshipID : ").append("null").append(",");
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
        private Optional<Long> snapMirrorEndpointID;
        private Optional<SnapMirrorVolumeInfo> destinationVolume;
        private Optional<SnapMirrorVolumeInfo> sourceVolume;
        private Optional<String> vserver;
        private Optional<String> relationshipID;

        private Builder() { }

        public ListSnapMirrorRelationshipsRequest build() {
            return new ListSnapMirrorRelationshipsRequest (
                         this.snapMirrorEndpointID,
                         this.destinationVolume,
                         this.sourceVolume,
                         this.vserver,
                         this.relationshipID);
        }

        private ListSnapMirrorRelationshipsRequest.Builder buildFrom(final ListSnapMirrorRelationshipsRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.destinationVolume = req.destinationVolume;
            this.sourceVolume = req.sourceVolume;
            this.vserver = req.vserver;
            this.relationshipID = req.relationshipID;

            return this;
        }

        public ListSnapMirrorRelationshipsRequest.Builder optionalSnapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : Optional.of(snapMirrorEndpointID);
            return this;
        }

        public ListSnapMirrorRelationshipsRequest.Builder optionalDestinationVolume(final SnapMirrorVolumeInfo destinationVolume) {
            this.destinationVolume = (destinationVolume == null) ? Optional.<SnapMirrorVolumeInfo>empty() : Optional.of(destinationVolume);
            return this;
        }

        public ListSnapMirrorRelationshipsRequest.Builder optionalSourceVolume(final SnapMirrorVolumeInfo sourceVolume) {
            this.sourceVolume = (sourceVolume == null) ? Optional.<SnapMirrorVolumeInfo>empty() : Optional.of(sourceVolume);
            return this;
        }

        public ListSnapMirrorRelationshipsRequest.Builder optionalVserver(final String vserver) {
            this.vserver = (vserver == null) ? Optional.<String>empty() : Optional.of(vserver);
            return this;
        }

        public ListSnapMirrorRelationshipsRequest.Builder optionalRelationshipID(final String relationshipID) {
            this.relationshipID = (relationshipID == null) ? Optional.<String>empty() : Optional.of(relationshipID);
            return this;
        }

    }
}
