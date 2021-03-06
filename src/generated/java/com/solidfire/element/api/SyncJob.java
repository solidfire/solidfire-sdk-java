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
 * SyncJob  
 **/

public class SyncJob implements Serializable {

    public static final long serialVersionUID = 3623611509302376888L;
    @SerializedName("bytesPerSecond") private Double bytesPerSecond;
    @SerializedName("currentBytes") private Long currentBytes;
    @SerializedName("dstServiceID") private Long dstServiceID;
    @SerializedName("elapsedTime") private Double elapsedTime;
    @SerializedName("percentComplete") private Double percentComplete;
    @SerializedName("remainingTime") private Optional<Long> remainingTime;
    @SerializedName("sliceID") private Long sliceID;
    @SerializedName("srcServiceID") private Long srcServiceID;
    @SerializedName("totalBytes") private Long totalBytes;
    @SerializedName("type") private String type;
    @SerializedName("cloneID") private Long cloneID;
    @SerializedName("dstVolumeID") private Long dstVolumeID;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("snapshotID") private Long snapshotID;
    @SerializedName("srcVolumeID") private Long srcVolumeID;
    @SerializedName("blocksPerSecond") private Double blocksPerSecond;
    @SerializedName("stage") private String stage;
    @SerializedName("groupCloneID") private Optional<Long> groupCloneID;
    // empty constructor
    @Since("7.0")
    public SyncJob() {}

    
    // parameterized constructor
    @Since("7.0")
    public SyncJob(
        Double bytesPerSecond,
        Long currentBytes,
        Long dstServiceID,
        Double elapsedTime,
        Double percentComplete,
        Optional<Long> remainingTime,
        Long sliceID,
        Long srcServiceID,
        Long totalBytes,
        String type,
        Long cloneID,
        Long dstVolumeID,
        Long nodeID,
        Long snapshotID,
        Long srcVolumeID,
        Double blocksPerSecond,
        String stage,
        Optional<Long> groupCloneID
    )
    {
        this.bytesPerSecond = bytesPerSecond;
        this.currentBytes = currentBytes;
        this.dstServiceID = dstServiceID;
        this.elapsedTime = elapsedTime;
        this.percentComplete = percentComplete;
        this.remainingTime = (remainingTime == null) ? Optional.<Long>empty() : remainingTime;
        this.sliceID = sliceID;
        this.srcServiceID = srcServiceID;
        this.totalBytes = totalBytes;
        this.type = type;
        this.cloneID = cloneID;
        this.dstVolumeID = dstVolumeID;
        this.nodeID = nodeID;
        this.snapshotID = snapshotID;
        this.srcVolumeID = srcVolumeID;
        this.blocksPerSecond = blocksPerSecond;
        this.stage = stage;
        this.groupCloneID = (groupCloneID == null) ? Optional.<Long>empty() : groupCloneID;
    }

    /** 
     * 
     **/
    public Double getBytesPerSecond() { return this.bytesPerSecond; }
   
    public void setBytesPerSecond(Double bytesPerSecond) { 
        this.bytesPerSecond = bytesPerSecond;
    }
    /** 
     * 
     **/
    public Long getCurrentBytes() { return this.currentBytes; }
   
    public void setCurrentBytes(Long currentBytes) { 
        this.currentBytes = currentBytes;
    }
    /** 
     * 
     **/
    public Long getDstServiceID() { return this.dstServiceID; }
   
    public void setDstServiceID(Long dstServiceID) { 
        this.dstServiceID = dstServiceID;
    }
    /** 
     * 
     **/
    public Double getElapsedTime() { return this.elapsedTime; }
   
    public void setElapsedTime(Double elapsedTime) { 
        this.elapsedTime = elapsedTime;
    }
    /** 
     * 
     **/
    public Double getPercentComplete() { return this.percentComplete; }
   
    public void setPercentComplete(Double percentComplete) { 
        this.percentComplete = percentComplete;
    }
    /** 
     * 
     **/
    public Optional<Long> getRemainingTime() { return this.remainingTime; }
   
    public void setRemainingTime(Optional<Long> remainingTime) { 
        this.remainingTime = (remainingTime == null) ? Optional.<Long>empty() : remainingTime;
    }
    /** 
     * 
     **/
    public Long getSliceID() { return this.sliceID; }
   
    public void setSliceID(Long sliceID) { 
        this.sliceID = sliceID;
    }
    /** 
     * 
     **/
    public Long getSrcServiceID() { return this.srcServiceID; }
   
    public void setSrcServiceID(Long srcServiceID) { 
        this.srcServiceID = srcServiceID;
    }
    /** 
     * 
     **/
    public Long getTotalBytes() { return this.totalBytes; }
   
    public void setTotalBytes(Long totalBytes) { 
        this.totalBytes = totalBytes;
    }
    /** 
     * The type of syncing taking place. It will be one of block, slice, clone, or remote.
     **/
    public String getType() { return this.type; }
   
    public void setType(String type) { 
        this.type = type;
    }
    /** 
     * 
     **/
    public Long getCloneID() { return this.cloneID; }
   
    public void setCloneID(Long cloneID) { 
        this.cloneID = cloneID;
    }
    /** 
     * 
     **/
    public Long getDstVolumeID() { return this.dstVolumeID; }
   
    public void setDstVolumeID(Long dstVolumeID) { 
        this.dstVolumeID = dstVolumeID;
    }
    /** 
     * 
     **/
    public Long getNodeID() { return this.nodeID; }
   
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     * 
     **/
    public Long getSnapshotID() { return this.snapshotID; }
   
    public void setSnapshotID(Long snapshotID) { 
        this.snapshotID = snapshotID;
    }
    /** 
     * 
     **/
    public Long getSrcVolumeID() { return this.srcVolumeID; }
   
    public void setSrcVolumeID(Long srcVolumeID) { 
        this.srcVolumeID = srcVolumeID;
    }
    /** 
     * 
     **/
    public Double getBlocksPerSecond() { return this.blocksPerSecond; }
   
    public void setBlocksPerSecond(Double blocksPerSecond) { 
        this.blocksPerSecond = blocksPerSecond;
    }
    /** 
     * 
     **/
    public String getStage() { return this.stage; }
   
    public void setStage(String stage) { 
        this.stage = stage;
    }
    /** 
     * 
     **/
    public Optional<Long> getGroupCloneID() { return this.groupCloneID; }
   
    public void setGroupCloneID(Optional<Long> groupCloneID) { 
        this.groupCloneID = (groupCloneID == null) ? Optional.<Long>empty() : groupCloneID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SyncJob that = (SyncJob) o;

        return 
            Objects.equals(bytesPerSecond, that.bytesPerSecond) && 
            Objects.equals(currentBytes, that.currentBytes) && 
            Objects.equals(dstServiceID, that.dstServiceID) && 
            Objects.equals(elapsedTime, that.elapsedTime) && 
            Objects.equals(percentComplete, that.percentComplete) && 
            Objects.equals(remainingTime, that.remainingTime) && 
            Objects.equals(sliceID, that.sliceID) && 
            Objects.equals(srcServiceID, that.srcServiceID) && 
            Objects.equals(totalBytes, that.totalBytes) && 
            Objects.equals(type, that.type) && 
            Objects.equals(cloneID, that.cloneID) && 
            Objects.equals(dstVolumeID, that.dstVolumeID) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(snapshotID, that.snapshotID) && 
            Objects.equals(srcVolumeID, that.srcVolumeID) && 
            Objects.equals(blocksPerSecond, that.blocksPerSecond) && 
            Objects.equals(stage, that.stage) && 
            Objects.equals(groupCloneID, that.groupCloneID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( bytesPerSecond,currentBytes,dstServiceID,elapsedTime,percentComplete,remainingTime,sliceID,srcServiceID,totalBytes,type,cloneID,dstVolumeID,nodeID,snapshotID,srcVolumeID,blocksPerSecond,stage,groupCloneID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("bytesPerSecond", bytesPerSecond);
        map.put("currentBytes", currentBytes);
        map.put("dstServiceID", dstServiceID);
        map.put("elapsedTime", elapsedTime);
        map.put("percentComplete", percentComplete);
        map.put("remainingTime", remainingTime);
        map.put("sliceID", sliceID);
        map.put("srcServiceID", srcServiceID);
        map.put("totalBytes", totalBytes);
        map.put("type", type);
        map.put("cloneID", cloneID);
        map.put("dstVolumeID", dstVolumeID);
        map.put("nodeID", nodeID);
        map.put("snapshotID", snapshotID);
        map.put("srcVolumeID", srcVolumeID);
        map.put("blocksPerSecond", blocksPerSecond);
        map.put("stage", stage);
        map.put("groupCloneID", groupCloneID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" bytesPerSecond : ").append(gson.toJson(bytesPerSecond)).append(",");
        sb.append(" currentBytes : ").append(gson.toJson(currentBytes)).append(",");
        sb.append(" dstServiceID : ").append(gson.toJson(dstServiceID)).append(",");
        sb.append(" elapsedTime : ").append(gson.toJson(elapsedTime)).append(",");
        sb.append(" percentComplete : ").append(gson.toJson(percentComplete)).append(",");
        if(null != remainingTime && remainingTime.isPresent()){
            sb.append(" remainingTime : ").append(gson.toJson(remainingTime)).append(",");
        }
        else{
            sb.append(" remainingTime : ").append("null").append(",");
        }
        sb.append(" sliceID : ").append(gson.toJson(sliceID)).append(",");
        sb.append(" srcServiceID : ").append(gson.toJson(srcServiceID)).append(",");
        sb.append(" totalBytes : ").append(gson.toJson(totalBytes)).append(",");
        sb.append(" type : ").append(gson.toJson(type)).append(",");
        sb.append(" cloneID : ").append(gson.toJson(cloneID)).append(",");
        sb.append(" dstVolumeID : ").append(gson.toJson(dstVolumeID)).append(",");
        sb.append(" nodeID : ").append(gson.toJson(nodeID)).append(",");
        sb.append(" snapshotID : ").append(gson.toJson(snapshotID)).append(",");
        sb.append(" srcVolumeID : ").append(gson.toJson(srcVolumeID)).append(",");
        sb.append(" blocksPerSecond : ").append(gson.toJson(blocksPerSecond)).append(",");
        sb.append(" stage : ").append(gson.toJson(stage)).append(",");
        if(null != groupCloneID && groupCloneID.isPresent()){
            sb.append(" groupCloneID : ").append(gson.toJson(groupCloneID)).append(",");
        }
        else{
            sb.append(" groupCloneID : ").append("null").append(",");
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
        private Double bytesPerSecond;
        private Long currentBytes;
        private Long dstServiceID;
        private Double elapsedTime;
        private Double percentComplete;
        private Optional<Long> remainingTime;
        private Long sliceID;
        private Long srcServiceID;
        private Long totalBytes;
        private String type;
        private Long cloneID;
        private Long dstVolumeID;
        private Long nodeID;
        private Long snapshotID;
        private Long srcVolumeID;
        private Double blocksPerSecond;
        private String stage;
        private Optional<Long> groupCloneID;

        private Builder() { }

        public SyncJob build() {
            return new SyncJob (
                         this.bytesPerSecond,
                         this.currentBytes,
                         this.dstServiceID,
                         this.elapsedTime,
                         this.percentComplete,
                         this.remainingTime,
                         this.sliceID,
                         this.srcServiceID,
                         this.totalBytes,
                         this.type,
                         this.cloneID,
                         this.dstVolumeID,
                         this.nodeID,
                         this.snapshotID,
                         this.srcVolumeID,
                         this.blocksPerSecond,
                         this.stage,
                         this.groupCloneID);
        }

        private SyncJob.Builder buildFrom(final SyncJob req) {
            this.bytesPerSecond = req.bytesPerSecond;
            this.currentBytes = req.currentBytes;
            this.dstServiceID = req.dstServiceID;
            this.elapsedTime = req.elapsedTime;
            this.percentComplete = req.percentComplete;
            this.remainingTime = req.remainingTime;
            this.sliceID = req.sliceID;
            this.srcServiceID = req.srcServiceID;
            this.totalBytes = req.totalBytes;
            this.type = req.type;
            this.cloneID = req.cloneID;
            this.dstVolumeID = req.dstVolumeID;
            this.nodeID = req.nodeID;
            this.snapshotID = req.snapshotID;
            this.srcVolumeID = req.srcVolumeID;
            this.blocksPerSecond = req.blocksPerSecond;
            this.stage = req.stage;
            this.groupCloneID = req.groupCloneID;

            return this;
        }

        public SyncJob.Builder bytesPerSecond(final Double bytesPerSecond) {
            this.bytesPerSecond = bytesPerSecond;
            return this;
        }

        public SyncJob.Builder currentBytes(final Long currentBytes) {
            this.currentBytes = currentBytes;
            return this;
        }

        public SyncJob.Builder dstServiceID(final Long dstServiceID) {
            this.dstServiceID = dstServiceID;
            return this;
        }

        public SyncJob.Builder elapsedTime(final Double elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }

        public SyncJob.Builder percentComplete(final Double percentComplete) {
            this.percentComplete = percentComplete;
            return this;
        }

        public SyncJob.Builder optionalRemainingTime(final Long remainingTime) {
            this.remainingTime = (remainingTime == null) ? Optional.<Long>empty() : Optional.of(remainingTime);
            return this;
        }

        public SyncJob.Builder sliceID(final Long sliceID) {
            this.sliceID = sliceID;
            return this;
        }

        public SyncJob.Builder srcServiceID(final Long srcServiceID) {
            this.srcServiceID = srcServiceID;
            return this;
        }

        public SyncJob.Builder totalBytes(final Long totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }

        public SyncJob.Builder type(final String type) {
            this.type = type;
            return this;
        }

        public SyncJob.Builder cloneID(final Long cloneID) {
            this.cloneID = cloneID;
            return this;
        }

        public SyncJob.Builder dstVolumeID(final Long dstVolumeID) {
            this.dstVolumeID = dstVolumeID;
            return this;
        }

        public SyncJob.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public SyncJob.Builder snapshotID(final Long snapshotID) {
            this.snapshotID = snapshotID;
            return this;
        }

        public SyncJob.Builder srcVolumeID(final Long srcVolumeID) {
            this.srcVolumeID = srcVolumeID;
            return this;
        }

        public SyncJob.Builder blocksPerSecond(final Double blocksPerSecond) {
            this.blocksPerSecond = blocksPerSecond;
            return this;
        }

        public SyncJob.Builder stage(final String stage) {
            this.stage = stage;
            return this;
        }

        public SyncJob.Builder optionalGroupCloneID(final Long groupCloneID) {
            this.groupCloneID = (groupCloneID == null) ? Optional.<Long>empty() : Optional.of(groupCloneID);
            return this;
        }

    }
}
