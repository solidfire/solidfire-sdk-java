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
 * CreateSnapMirrorRelationshipRequest  
 * The SolidFire Element OS web UI uses the CreateSnapMirrorRelationship method to create a SnapMirror extended data protection relationship between a source and destination endpoint.
 **/

public class CreateSnapMirrorRelationshipRequest implements Serializable {

    public static final long serialVersionUID = -4962558132474087629L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("sourceVolume") private SnapMirrorVolumeInfo sourceVolume;
    @SerializedName("destinationVolume") private SnapMirrorVolumeInfo destinationVolume;
    @SerializedName("relationshipType") private Optional<String> relationshipType;
    @SerializedName("policyName") private Optional<String> policyName;
    @SerializedName("scheduleName") private Optional<String> scheduleName;
    @SerializedName("maxTransferRate") private Optional<Long> maxTransferRate;

    
    // parameterized constructor
    @Since("7.0")
    public CreateSnapMirrorRelationshipRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public CreateSnapMirrorRelationshipRequest(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo sourceVolume,
        SnapMirrorVolumeInfo destinationVolume,
        Optional<String> relationshipType,
        Optional<String> policyName,
        Optional<String> scheduleName,
        Optional<Long> maxTransferRate
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.sourceVolume = sourceVolume;
        this.destinationVolume = destinationVolume;
        this.relationshipType = (relationshipType == null) ? Optional.<String>empty() : relationshipType;
        this.policyName = (policyName == null) ? Optional.<String>empty() : policyName;
        this.scheduleName = (scheduleName == null) ? Optional.<String>empty() : scheduleName;
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
     * The source volume in the relationship.
     **/
    public SnapMirrorVolumeInfo getSourceVolume() { return this.sourceVolume; }
   
    public void setSourceVolume(SnapMirrorVolumeInfo sourceVolume) { 
        this.sourceVolume = sourceVolume;
    }
    /** 
     * The destination volume in the relationship.
     **/
    public SnapMirrorVolumeInfo getDestinationVolume() { return this.destinationVolume; }
   
    public void setDestinationVolume(SnapMirrorVolumeInfo destinationVolume) { 
        this.destinationVolume = destinationVolume;
    }
    /** 
     * The type of relationship.
     * On SolidFire systems, this value is always "extended_data_protection".
     **/
    public Optional<String> getRelationshipType() { return this.relationshipType; }
   
    public void setRelationshipType(Optional<String> relationshipType) { 
        this.relationshipType = (relationshipType == null) ? Optional.<String>empty() : relationshipType;
    }
    /** 
     * Specifies the name of the ONTAP SnapMirror policy for the relationship.
     * If not specified, the default policy name is MirrorLatest.
     **/
    public Optional<String> getPolicyName() { return this.policyName; }
   
    public void setPolicyName(Optional<String> policyName) { 
        this.policyName = (policyName == null) ? Optional.<String>empty() : policyName;
    }
    /** 
     * The name of the preexisting cron schedule on the ONTAP system
     * that is used to update the SnapMirror relationship.
     * If no schedule is designated, snapMirror updates are not scheduled
     * and must be updated manually.
     **/
    public Optional<String> getScheduleName() { return this.scheduleName; }
   
    public void setScheduleName(Optional<String> scheduleName) { 
        this.scheduleName = (scheduleName == null) ? Optional.<String>empty() : scheduleName;
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

        CreateSnapMirrorRelationshipRequest that = (CreateSnapMirrorRelationshipRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(sourceVolume, that.sourceVolume) && 
            Objects.equals(destinationVolume, that.destinationVolume) && 
            Objects.equals(relationshipType, that.relationshipType) && 
            Objects.equals(policyName, that.policyName) && 
            Objects.equals(scheduleName, that.scheduleName) && 
            Objects.equals(maxTransferRate, that.maxTransferRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,sourceVolume,destinationVolume,relationshipType,policyName,scheduleName,maxTransferRate );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("sourceVolume", sourceVolume);
        map.put("destinationVolume", destinationVolume);
        map.put("relationshipType", relationshipType);
        map.put("policyName", policyName);
        map.put("scheduleName", scheduleName);
        map.put("maxTransferRate", maxTransferRate);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" sourceVolume : ").append(gson.toJson(sourceVolume)).append(",");
        sb.append(" destinationVolume : ").append(gson.toJson(destinationVolume)).append(",");
        if(null != relationshipType && relationshipType.isPresent()){
            sb.append(" relationshipType : ").append(gson.toJson(relationshipType)).append(",");
        }
        else{
            sb.append(" relationshipType : ").append("null").append(",");
        }
        if(null != policyName && policyName.isPresent()){
            sb.append(" policyName : ").append(gson.toJson(policyName)).append(",");
        }
        else{
            sb.append(" policyName : ").append("null").append(",");
        }
        if(null != scheduleName && scheduleName.isPresent()){
            sb.append(" scheduleName : ").append(gson.toJson(scheduleName)).append(",");
        }
        else{
            sb.append(" scheduleName : ").append("null").append(",");
        }
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
        private SnapMirrorVolumeInfo sourceVolume;
        private SnapMirrorVolumeInfo destinationVolume;
        private Optional<String> relationshipType;
        private Optional<String> policyName;
        private Optional<String> scheduleName;
        private Optional<Long> maxTransferRate;

        private Builder() { }

        public CreateSnapMirrorRelationshipRequest build() {
            return new CreateSnapMirrorRelationshipRequest (
                         this.snapMirrorEndpointID,
                         this.sourceVolume,
                         this.destinationVolume,
                         this.relationshipType,
                         this.policyName,
                         this.scheduleName,
                         this.maxTransferRate);
        }

        private CreateSnapMirrorRelationshipRequest.Builder buildFrom(final CreateSnapMirrorRelationshipRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.sourceVolume = req.sourceVolume;
            this.destinationVolume = req.destinationVolume;
            this.relationshipType = req.relationshipType;
            this.policyName = req.policyName;
            this.scheduleName = req.scheduleName;
            this.maxTransferRate = req.maxTransferRate;

            return this;
        }

        public CreateSnapMirrorRelationshipRequest.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public CreateSnapMirrorRelationshipRequest.Builder sourceVolume(final SnapMirrorVolumeInfo sourceVolume) {
            this.sourceVolume = sourceVolume;
            return this;
        }

        public CreateSnapMirrorRelationshipRequest.Builder destinationVolume(final SnapMirrorVolumeInfo destinationVolume) {
            this.destinationVolume = destinationVolume;
            return this;
        }

        public CreateSnapMirrorRelationshipRequest.Builder optionalRelationshipType(final String relationshipType) {
            this.relationshipType = (relationshipType == null) ? Optional.<String>empty() : Optional.of(relationshipType);
            return this;
        }

        public CreateSnapMirrorRelationshipRequest.Builder optionalPolicyName(final String policyName) {
            this.policyName = (policyName == null) ? Optional.<String>empty() : Optional.of(policyName);
            return this;
        }

        public CreateSnapMirrorRelationshipRequest.Builder optionalScheduleName(final String scheduleName) {
            this.scheduleName = (scheduleName == null) ? Optional.<String>empty() : Optional.of(scheduleName);
            return this;
        }

        public CreateSnapMirrorRelationshipRequest.Builder optionalMaxTransferRate(final Long maxTransferRate) {
            this.maxTransferRate = (maxTransferRate == null) ? Optional.<Long>empty() : Optional.of(maxTransferRate);
            return this;
        }

    }
}
