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
 * SnapMirrorRelationship  
 * The snapMirrorRelationship object contains information about a SnapMirror relationship between a SolidFire volume and an ONTAP volume.
 **/

public class SnapMirrorRelationship implements Serializable {

    public static final long serialVersionUID = 7498008048433991219L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("clusterName") private String clusterName;
    @SerializedName("snapMirrorRelationshipID") private String snapMirrorRelationshipID;
    @SerializedName("sourceVolume") private SnapMirrorVolumeInfo sourceVolume;
    @SerializedName("destinationVolume") private SnapMirrorVolumeInfo destinationVolume;
    @SerializedName("currentMaxTransferRate") private Long currentMaxTransferRate;
    @SerializedName("isHealthy") private Boolean isHealthy;
    @SerializedName("lagtime") private Long lagtime;
    @SerializedName("lastTransferDuration") private Long lastTransferDuration;
    @SerializedName("lastTransferError") private String lastTransferError;
    @SerializedName("lastTransferSize") private Long lastTransferSize;
    @SerializedName("lastTransferEndTimestamp") private String lastTransferEndTimestamp;
    @SerializedName("lastTransferType") private String lastTransferType;
    @SerializedName("maxTransferRate") private Long maxTransferRate;
    @SerializedName("mirrorState") private String mirrorState;
    @SerializedName("newestSnapshot") private String newestSnapshot;
    @SerializedName("policyName") private String policyName;
    @SerializedName("policyType") private String policyType;
    @SerializedName("relationshipStatus") private String relationshipStatus;
    @SerializedName("releationshipType") private String releationshipType;
    @SerializedName("scheduleName") private String scheduleName;
    @SerializedName("unhealthyReason") private String unhealthyReason;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorRelationship(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorRelationship(
        Long snapMirrorEndpointID,
        String clusterName,
        String snapMirrorRelationshipID,
        SnapMirrorVolumeInfo sourceVolume,
        SnapMirrorVolumeInfo destinationVolume,
        Long currentMaxTransferRate,
        Boolean isHealthy,
        Long lagtime,
        Long lastTransferDuration,
        String lastTransferError,
        Long lastTransferSize,
        String lastTransferEndTimestamp,
        String lastTransferType,
        Long maxTransferRate,
        String mirrorState,
        String newestSnapshot,
        String policyName,
        String policyType,
        String relationshipStatus,
        String releationshipType,
        String scheduleName,
        String unhealthyReason
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.clusterName = clusterName;
        this.snapMirrorRelationshipID = snapMirrorRelationshipID;
        this.sourceVolume = sourceVolume;
        this.destinationVolume = destinationVolume;
        this.currentMaxTransferRate = currentMaxTransferRate;
        this.isHealthy = isHealthy;
        this.lagtime = lagtime;
        this.lastTransferDuration = lastTransferDuration;
        this.lastTransferError = lastTransferError;
        this.lastTransferSize = lastTransferSize;
        this.lastTransferEndTimestamp = lastTransferEndTimestamp;
        this.lastTransferType = lastTransferType;
        this.maxTransferRate = maxTransferRate;
        this.mirrorState = mirrorState;
        this.newestSnapshot = newestSnapshot;
        this.policyName = policyName;
        this.policyType = policyType;
        this.relationshipStatus = relationshipStatus;
        this.releationshipType = releationshipType;
        this.scheduleName = scheduleName;
        this.unhealthyReason = unhealthyReason;
    }

    /** 
     * The ID of the destination ONTAP system.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The name of the destination ONTAP cluster.
     **/
    public String getClusterName() { return this.clusterName; }
   
    public void setClusterName(String clusterName) { 
        this.clusterName = clusterName;
    }
    /** 
     * The unique identifier for each snapMirrorRelationship object
     * in an array as would be returned in ListSnapMirrorRelationships.
     * This UUID is created and returned from the ONTAP system.
     **/
    public String getSnapMirrorRelationshipID() { return this.snapMirrorRelationshipID; }
   
    public void setSnapMirrorRelationshipID(String snapMirrorRelationshipID) { 
        this.snapMirrorRelationshipID = snapMirrorRelationshipID;
    }
    /** 
     * An object describing the source volume.
     **/
    public SnapMirrorVolumeInfo getSourceVolume() { return this.sourceVolume; }
   
    public void setSourceVolume(SnapMirrorVolumeInfo sourceVolume) { 
        this.sourceVolume = sourceVolume;
    }
    /** 
     * An object describing the destination volume.
     **/
    public SnapMirrorVolumeInfo getDestinationVolume() { return this.destinationVolume; }
   
    public void setDestinationVolume(SnapMirrorVolumeInfo destinationVolume) { 
        this.destinationVolume = destinationVolume;
    }
    /** 
     * The current maximum transfer rate between the
     * source and destination volumes, in kilobytes per second.
     **/
    public Long getCurrentMaxTransferRate() { return this.currentMaxTransferRate; }
   
    public void setCurrentMaxTransferRate(Long currentMaxTransferRate) { 
        this.currentMaxTransferRate = currentMaxTransferRate;
    }
    /** 
     * Whether the relationship is healthy or not.
     * Possible values:
     * true:  The relationship is healthy.
     * false: The relationship is not healthy. This can be caused by a manual or
     *        scheduled update failing or being aborted, or by the last scheduled
     *        update being delayed.
     **/
    public Boolean getIsHealthy() { return this.isHealthy; }
   
    public void setIsHealthy(Boolean isHealthy) { 
        this.isHealthy = isHealthy;
    }
    /** 
     * The amount of time in seconds by which the data on the
     * destination volume lags behind the data on the source volume.
     **/
    public Long getLagtime() { return this.lagtime; }
   
    public void setLagtime(Long lagtime) { 
        this.lagtime = lagtime;
    }
    /** 
     * The amount of time in seconds it took for the last transfer to complete.
     **/
    public Long getLastTransferDuration() { return this.lastTransferDuration; }
   
    public void setLastTransferDuration(Long lastTransferDuration) { 
        this.lastTransferDuration = lastTransferDuration;
    }
    /** 
     * A message describing the cause of the last transfer failure.
     **/
    public String getLastTransferError() { return this.lastTransferError; }
   
    public void setLastTransferError(String lastTransferError) { 
        this.lastTransferError = lastTransferError;
    }
    /** 
     * The total number of bytes transferred during the last transfer.
     **/
    public Long getLastTransferSize() { return this.lastTransferSize; }
   
    public void setLastTransferSize(Long lastTransferSize) { 
        this.lastTransferSize = lastTransferSize;
    }
    /** 
     * The timestamp of the end of the last transfer.
     **/
    public String getLastTransferEndTimestamp() { return this.lastTransferEndTimestamp; }
   
    public void setLastTransferEndTimestamp(String lastTransferEndTimestamp) { 
        this.lastTransferEndTimestamp = lastTransferEndTimestamp;
    }
    /** 
     * The type of the previous transfer in the relationship.
     **/
    public String getLastTransferType() { return this.lastTransferType; }
   
    public void setLastTransferType(String lastTransferType) { 
        this.lastTransferType = lastTransferType;
    }
    /** 
     * Specifies the maximum data transfer rate
     * between the volumes in kilobytes per second.
     * The default value, 0, is unlimited and permits the SnapMirror
     * relationship to fully utilize the available network bandwidth.
     **/
    public Long getMaxTransferRate() { return this.maxTransferRate; }
   
    public void setMaxTransferRate(Long maxTransferRate) { 
        this.maxTransferRate = maxTransferRate;
    }
    /** 
     * The mirror state of the SnapMirror relationship.
     * Possible values:
     * uninitialized: The destination volume has not been initialized.
     * snapmirrored:  The destination volume has been initialized and is ready to recieve SnapMirror updates.
     * broken-off:    The destination volume is read-write and snapshots are present.
     **/
    public String getMirrorState() { return this.mirrorState; }
   
    public void setMirrorState(String mirrorState) { 
        this.mirrorState = mirrorState;
    }
    /** 
     * The name of the newest Snapshot copy on the destination volume.
     **/
    public String getNewestSnapshot() { return this.newestSnapshot; }
   
    public void setNewestSnapshot(String newestSnapshot) { 
        this.newestSnapshot = newestSnapshot;
    }
    /** 
     * Specifies the name of the ONTAP SnapMirror policy for the relationship.
     * A list of available policies can be retrieved with ListSnapMirrorPolicies.
     * Example values are "MirrorLatest" and "MirrorAndVault".
     **/
    public String getPolicyName() { return this.policyName; }
   
    public void setPolicyName(String policyName) { 
        this.policyName = policyName;
    }
    /** 
     * The type of the ONTAP SnapMirror policy for the relationship.
     * See ListSnapMirrorPolicies. Examples are: "async_mirror" or "mirror_vault"
     **/
    public String getPolicyType() { return this.policyType; }
   
    public void setPolicyType(String policyType) { 
        this.policyType = policyType;
    }
    /** 
     * The status of the SnapMirror relationship.
     * Possible values:
     * idle
     * transferring
     * checking
     * quiescing
     * quiesced
     * queued
     * preparing
     * finalizing
     * aborting
     * breaking
     **/
    public String getRelationshipStatus() { return this.relationshipStatus; }
   
    public void setRelationshipStatus(String relationshipStatus) { 
        this.relationshipStatus = relationshipStatus;
    }
    /** 
     * The type of the SnapMirror relationship.
     * On SolidFire systems, this value is always "extended_data_protection".
     **/
    public String getReleationshipType() { return this.releationshipType; }
   
    public void setReleationshipType(String releationshipType) { 
        this.releationshipType = releationshipType;
    }
    /** 
     * The name of the pre-existing cron schedule on the ONTAP
     * system that is used to update the SnapMirror relationship.
     * A list of available schedules can be retrieved with ListSnapMirrorSchedules.
     **/
    public String getScheduleName() { return this.scheduleName; }
   
    public void setScheduleName(String scheduleName) { 
        this.scheduleName = scheduleName;
    }
    /** 
     * The reason the relationship is not healthy.
     **/
    public String getUnhealthyReason() { return this.unhealthyReason; }
   
    public void setUnhealthyReason(String unhealthyReason) { 
        this.unhealthyReason = unhealthyReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorRelationship that = (SnapMirrorRelationship) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(clusterName, that.clusterName) && 
            Objects.equals(snapMirrorRelationshipID, that.snapMirrorRelationshipID) && 
            Objects.equals(sourceVolume, that.sourceVolume) && 
            Objects.equals(destinationVolume, that.destinationVolume) && 
            Objects.equals(currentMaxTransferRate, that.currentMaxTransferRate) && 
            Objects.equals(isHealthy, that.isHealthy) && 
            Objects.equals(lagtime, that.lagtime) && 
            Objects.equals(lastTransferDuration, that.lastTransferDuration) && 
            Objects.equals(lastTransferError, that.lastTransferError) && 
            Objects.equals(lastTransferSize, that.lastTransferSize) && 
            Objects.equals(lastTransferEndTimestamp, that.lastTransferEndTimestamp) && 
            Objects.equals(lastTransferType, that.lastTransferType) && 
            Objects.equals(maxTransferRate, that.maxTransferRate) && 
            Objects.equals(mirrorState, that.mirrorState) && 
            Objects.equals(newestSnapshot, that.newestSnapshot) && 
            Objects.equals(policyName, that.policyName) && 
            Objects.equals(policyType, that.policyType) && 
            Objects.equals(relationshipStatus, that.relationshipStatus) && 
            Objects.equals(releationshipType, that.releationshipType) && 
            Objects.equals(scheduleName, that.scheduleName) && 
            Objects.equals(unhealthyReason, that.unhealthyReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,clusterName,snapMirrorRelationshipID,sourceVolume,destinationVolume,currentMaxTransferRate,isHealthy,lagtime,lastTransferDuration,lastTransferError,lastTransferSize,lastTransferEndTimestamp,lastTransferType,maxTransferRate,mirrorState,newestSnapshot,policyName,policyType,relationshipStatus,releationshipType,scheduleName,unhealthyReason );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("clusterName", clusterName);
        map.put("snapMirrorRelationshipID", snapMirrorRelationshipID);
        map.put("sourceVolume", sourceVolume);
        map.put("destinationVolume", destinationVolume);
        map.put("currentMaxTransferRate", currentMaxTransferRate);
        map.put("isHealthy", isHealthy);
        map.put("lagtime", lagtime);
        map.put("lastTransferDuration", lastTransferDuration);
        map.put("lastTransferError", lastTransferError);
        map.put("lastTransferSize", lastTransferSize);
        map.put("lastTransferEndTimestamp", lastTransferEndTimestamp);
        map.put("lastTransferType", lastTransferType);
        map.put("maxTransferRate", maxTransferRate);
        map.put("mirrorState", mirrorState);
        map.put("newestSnapshot", newestSnapshot);
        map.put("policyName", policyName);
        map.put("policyType", policyType);
        map.put("relationshipStatus", relationshipStatus);
        map.put("releationshipType", releationshipType);
        map.put("scheduleName", scheduleName);
        map.put("unhealthyReason", unhealthyReason);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" clusterName : ").append(gson.toJson(clusterName)).append(",");
        sb.append(" snapMirrorRelationshipID : ").append(gson.toJson(snapMirrorRelationshipID)).append(",");
        sb.append(" sourceVolume : ").append(gson.toJson(sourceVolume)).append(",");
        sb.append(" destinationVolume : ").append(gson.toJson(destinationVolume)).append(",");
        sb.append(" currentMaxTransferRate : ").append(gson.toJson(currentMaxTransferRate)).append(",");
        sb.append(" isHealthy : ").append(gson.toJson(isHealthy)).append(",");
        sb.append(" lagtime : ").append(gson.toJson(lagtime)).append(",");
        sb.append(" lastTransferDuration : ").append(gson.toJson(lastTransferDuration)).append(",");
        sb.append(" lastTransferError : ").append(gson.toJson(lastTransferError)).append(",");
        sb.append(" lastTransferSize : ").append(gson.toJson(lastTransferSize)).append(",");
        sb.append(" lastTransferEndTimestamp : ").append(gson.toJson(lastTransferEndTimestamp)).append(",");
        sb.append(" lastTransferType : ").append(gson.toJson(lastTransferType)).append(",");
        sb.append(" maxTransferRate : ").append(gson.toJson(maxTransferRate)).append(",");
        sb.append(" mirrorState : ").append(gson.toJson(mirrorState)).append(",");
        sb.append(" newestSnapshot : ").append(gson.toJson(newestSnapshot)).append(",");
        sb.append(" policyName : ").append(gson.toJson(policyName)).append(",");
        sb.append(" policyType : ").append(gson.toJson(policyType)).append(",");
        sb.append(" relationshipStatus : ").append(gson.toJson(relationshipStatus)).append(",");
        sb.append(" releationshipType : ").append(gson.toJson(releationshipType)).append(",");
        sb.append(" scheduleName : ").append(gson.toJson(scheduleName)).append(",");
        sb.append(" unhealthyReason : ").append(gson.toJson(unhealthyReason)).append(",");
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
        private String clusterName;
        private String snapMirrorRelationshipID;
        private SnapMirrorVolumeInfo sourceVolume;
        private SnapMirrorVolumeInfo destinationVolume;
        private Long currentMaxTransferRate;
        private Boolean isHealthy;
        private Long lagtime;
        private Long lastTransferDuration;
        private String lastTransferError;
        private Long lastTransferSize;
        private String lastTransferEndTimestamp;
        private String lastTransferType;
        private Long maxTransferRate;
        private String mirrorState;
        private String newestSnapshot;
        private String policyName;
        private String policyType;
        private String relationshipStatus;
        private String releationshipType;
        private String scheduleName;
        private String unhealthyReason;

        private Builder() { }

        public SnapMirrorRelationship build() {
            return new SnapMirrorRelationship (
                         this.snapMirrorEndpointID,
                         this.clusterName,
                         this.snapMirrorRelationshipID,
                         this.sourceVolume,
                         this.destinationVolume,
                         this.currentMaxTransferRate,
                         this.isHealthy,
                         this.lagtime,
                         this.lastTransferDuration,
                         this.lastTransferError,
                         this.lastTransferSize,
                         this.lastTransferEndTimestamp,
                         this.lastTransferType,
                         this.maxTransferRate,
                         this.mirrorState,
                         this.newestSnapshot,
                         this.policyName,
                         this.policyType,
                         this.relationshipStatus,
                         this.releationshipType,
                         this.scheduleName,
                         this.unhealthyReason);
        }

        private SnapMirrorRelationship.Builder buildFrom(final SnapMirrorRelationship req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.clusterName = req.clusterName;
            this.snapMirrorRelationshipID = req.snapMirrorRelationshipID;
            this.sourceVolume = req.sourceVolume;
            this.destinationVolume = req.destinationVolume;
            this.currentMaxTransferRate = req.currentMaxTransferRate;
            this.isHealthy = req.isHealthy;
            this.lagtime = req.lagtime;
            this.lastTransferDuration = req.lastTransferDuration;
            this.lastTransferError = req.lastTransferError;
            this.lastTransferSize = req.lastTransferSize;
            this.lastTransferEndTimestamp = req.lastTransferEndTimestamp;
            this.lastTransferType = req.lastTransferType;
            this.maxTransferRate = req.maxTransferRate;
            this.mirrorState = req.mirrorState;
            this.newestSnapshot = req.newestSnapshot;
            this.policyName = req.policyName;
            this.policyType = req.policyType;
            this.relationshipStatus = req.relationshipStatus;
            this.releationshipType = req.releationshipType;
            this.scheduleName = req.scheduleName;
            this.unhealthyReason = req.unhealthyReason;

            return this;
        }

        public SnapMirrorRelationship.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public SnapMirrorRelationship.Builder clusterName(final String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public SnapMirrorRelationship.Builder snapMirrorRelationshipID(final String snapMirrorRelationshipID) {
            this.snapMirrorRelationshipID = snapMirrorRelationshipID;
            return this;
        }

        public SnapMirrorRelationship.Builder sourceVolume(final SnapMirrorVolumeInfo sourceVolume) {
            this.sourceVolume = sourceVolume;
            return this;
        }

        public SnapMirrorRelationship.Builder destinationVolume(final SnapMirrorVolumeInfo destinationVolume) {
            this.destinationVolume = destinationVolume;
            return this;
        }

        public SnapMirrorRelationship.Builder currentMaxTransferRate(final Long currentMaxTransferRate) {
            this.currentMaxTransferRate = currentMaxTransferRate;
            return this;
        }

        public SnapMirrorRelationship.Builder isHealthy(final Boolean isHealthy) {
            this.isHealthy = isHealthy;
            return this;
        }

        public SnapMirrorRelationship.Builder lagtime(final Long lagtime) {
            this.lagtime = lagtime;
            return this;
        }

        public SnapMirrorRelationship.Builder lastTransferDuration(final Long lastTransferDuration) {
            this.lastTransferDuration = lastTransferDuration;
            return this;
        }

        public SnapMirrorRelationship.Builder lastTransferError(final String lastTransferError) {
            this.lastTransferError = lastTransferError;
            return this;
        }

        public SnapMirrorRelationship.Builder lastTransferSize(final Long lastTransferSize) {
            this.lastTransferSize = lastTransferSize;
            return this;
        }

        public SnapMirrorRelationship.Builder lastTransferEndTimestamp(final String lastTransferEndTimestamp) {
            this.lastTransferEndTimestamp = lastTransferEndTimestamp;
            return this;
        }

        public SnapMirrorRelationship.Builder lastTransferType(final String lastTransferType) {
            this.lastTransferType = lastTransferType;
            return this;
        }

        public SnapMirrorRelationship.Builder maxTransferRate(final Long maxTransferRate) {
            this.maxTransferRate = maxTransferRate;
            return this;
        }

        public SnapMirrorRelationship.Builder mirrorState(final String mirrorState) {
            this.mirrorState = mirrorState;
            return this;
        }

        public SnapMirrorRelationship.Builder newestSnapshot(final String newestSnapshot) {
            this.newestSnapshot = newestSnapshot;
            return this;
        }

        public SnapMirrorRelationship.Builder policyName(final String policyName) {
            this.policyName = policyName;
            return this;
        }

        public SnapMirrorRelationship.Builder policyType(final String policyType) {
            this.policyType = policyType;
            return this;
        }

        public SnapMirrorRelationship.Builder relationshipStatus(final String relationshipStatus) {
            this.relationshipStatus = relationshipStatus;
            return this;
        }

        public SnapMirrorRelationship.Builder releationshipType(final String releationshipType) {
            this.releationshipType = releationshipType;
            return this;
        }

        public SnapMirrorRelationship.Builder scheduleName(final String scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }

        public SnapMirrorRelationship.Builder unhealthyReason(final String unhealthyReason) {
            this.unhealthyReason = unhealthyReason;
            return this;
        }

    }
}
