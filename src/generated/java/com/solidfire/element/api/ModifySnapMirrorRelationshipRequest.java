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
 * ModifySnapMirrorRelationshipRequest  
 * You can use ModifySnapMirrorRelationship to change the intervals at which a scheduled snapshot occurs. You can also delete or pause a schedule by using this method.
 **/

public class ModifySnapMirrorRelationshipRequest implements Serializable {

    public static final long serialVersionUID = -4979622284910246667L;
    @SerializedName("destinationVolume") private SnapMirrorVolumeInfo destinationVolume;
    @SerializedName("maxTransferRate") private Optional<Long> maxTransferRate;
    @SerializedName("policyName") private Optional<String> policyName;
    @SerializedName("scheduleName") private Optional<String> scheduleName;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;

    
    // parameterized constructor
    @Since("7.0")
    public ModifySnapMirrorRelationshipRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ModifySnapMirrorRelationshipRequest(
        SnapMirrorVolumeInfo destinationVolume,
        Optional<Long> maxTransferRate,
        Optional<String> policyName,
        Optional<String> scheduleName,
        Long snapMirrorEndpointID
    )
    {
        this.destinationVolume = destinationVolume;
        this.maxTransferRate = (maxTransferRate == null) ? Optional.<Long>empty() : maxTransferRate;
        this.policyName = (policyName == null) ? Optional.<String>empty() : policyName;
        this.scheduleName = (scheduleName == null) ? Optional.<String>empty() : scheduleName;
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
    /** 
     * Specifies the name of the ONTAP SnapMirror policy for the relationship.
     **/
    public Optional<String> getPolicyName() { return this.policyName; }
   
    public void setPolicyName(Optional<String> policyName) { 
        this.policyName = (policyName == null) ? Optional.<String>empty() : policyName;
    }
    /** 
     * The name of the pre-existing cron schedule on the ONTAP system that is used to update the SnapMirror relationship.
     **/
    public Optional<String> getScheduleName() { return this.scheduleName; }
   
    public void setScheduleName(Optional<String> scheduleName) { 
        this.scheduleName = (scheduleName == null) ? Optional.<String>empty() : scheduleName;
    }
    /** 
     * The endpoint ID of the remote ONTAP storage system communicating with the SolidFire cluster.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifySnapMirrorRelationshipRequest that = (ModifySnapMirrorRelationshipRequest) o;

        return 
            Objects.equals(destinationVolume, that.destinationVolume) && 
            Objects.equals(maxTransferRate, that.maxTransferRate) && 
            Objects.equals(policyName, that.policyName) && 
            Objects.equals(scheduleName, that.scheduleName) && 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( destinationVolume,maxTransferRate,policyName,scheduleName,snapMirrorEndpointID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("destinationVolume", destinationVolume);
        map.put("maxTransferRate", maxTransferRate);
        map.put("policyName", policyName);
        map.put("scheduleName", scheduleName);
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" destinationVolume : ").append(gson.toJson(destinationVolume)).append(",");
        if(null != maxTransferRate && maxTransferRate.isPresent()){
            sb.append(" maxTransferRate : ").append(gson.toJson(maxTransferRate)).append(",");
        }
        else{
            sb.append(" maxTransferRate : ").append("null").append(",");
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
        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
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
        private SnapMirrorVolumeInfo destinationVolume;
        private Optional<Long> maxTransferRate;
        private Optional<String> policyName;
        private Optional<String> scheduleName;
        private Long snapMirrorEndpointID;

        private Builder() { }

        public ModifySnapMirrorRelationshipRequest build() {
            return new ModifySnapMirrorRelationshipRequest (
                         this.destinationVolume,
                         this.maxTransferRate,
                         this.policyName,
                         this.scheduleName,
                         this.snapMirrorEndpointID);
        }

        private ModifySnapMirrorRelationshipRequest.Builder buildFrom(final ModifySnapMirrorRelationshipRequest req) {
            this.destinationVolume = req.destinationVolume;
            this.maxTransferRate = req.maxTransferRate;
            this.policyName = req.policyName;
            this.scheduleName = req.scheduleName;
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;

            return this;
        }

        public ModifySnapMirrorRelationshipRequest.Builder destinationVolume(final SnapMirrorVolumeInfo destinationVolume) {
            this.destinationVolume = destinationVolume;
            return this;
        }

        public ModifySnapMirrorRelationshipRequest.Builder optionalMaxTransferRate(final Long maxTransferRate) {
            this.maxTransferRate = (maxTransferRate == null) ? Optional.<Long>empty() : Optional.of(maxTransferRate);
            return this;
        }

        public ModifySnapMirrorRelationshipRequest.Builder optionalPolicyName(final String policyName) {
            this.policyName = (policyName == null) ? Optional.<String>empty() : Optional.of(policyName);
            return this;
        }

        public ModifySnapMirrorRelationshipRequest.Builder optionalScheduleName(final String scheduleName) {
            this.scheduleName = (scheduleName == null) ? Optional.<String>empty() : Optional.of(scheduleName);
            return this;
        }

        public ModifySnapMirrorRelationshipRequest.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

    }
}
