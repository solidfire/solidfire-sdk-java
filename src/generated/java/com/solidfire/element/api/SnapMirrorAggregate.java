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
 * SnapMirrorAggregate  
 * The snapMirrorAggregate object contains information about the available ONTAP aggregates, which are collections of disks made available to volumes as storage. You can get this information using the ListSnapMirrorAggregates API method.
 **/

public class SnapMirrorAggregate implements Serializable {

    public static final long serialVersionUID = -1980756098300170637L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("aggregateName") private String aggregateName;
    @SerializedName("nodeName") private String nodeName;
    @SerializedName("sizeAvailable") private Long sizeAvailable;
    @SerializedName("sizeTotal") private Long sizeTotal;
    @SerializedName("percentUsedCapacity") private Long percentUsedCapacity;
    @SerializedName("volumeCount") private Long volumeCount;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorAggregate(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorAggregate(
        Long snapMirrorEndpointID,
        String aggregateName,
        String nodeName,
        Long sizeAvailable,
        Long sizeTotal,
        Long percentUsedCapacity,
        Long volumeCount
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.aggregateName = aggregateName;
        this.nodeName = nodeName;
        this.sizeAvailable = sizeAvailable;
        this.sizeTotal = sizeTotal;
        this.percentUsedCapacity = percentUsedCapacity;
        this.volumeCount = volumeCount;
    }

    /** 
     * The ID of the destination ONTAP system.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The name of the aggregate.
     **/
    public String getAggregateName() { return this.aggregateName; }
   
    public void setAggregateName(String aggregateName) { 
        this.aggregateName = aggregateName;
    }
    /** 
     * The name of the ONTAP node that owns this aggregate.
     **/
    public String getNodeName() { return this.nodeName; }
   
    public void setNodeName(String nodeName) { 
        this.nodeName = nodeName;
    }
    /** 
     * The number of available bytes remaining in the aggregate.
     **/
    public Long getSizeAvailable() { return this.sizeAvailable; }
   
    public void setSizeAvailable(Long sizeAvailable) { 
        this.sizeAvailable = sizeAvailable;
    }
    /** 
     * The total size (int bytes) of the aggregate.
     **/
    public Long getSizeTotal() { return this.sizeTotal; }
   
    public void setSizeTotal(Long sizeTotal) { 
        this.sizeTotal = sizeTotal;
    }
    /** 
     * The percentage of disk space currently in use.
     **/
    public Long getPercentUsedCapacity() { return this.percentUsedCapacity; }
   
    public void setPercentUsedCapacity(Long percentUsedCapacity) { 
        this.percentUsedCapacity = percentUsedCapacity;
    }
    /** 
     * The number of volumes in the aggregate.
     **/
    public Long getVolumeCount() { return this.volumeCount; }
   
    public void setVolumeCount(Long volumeCount) { 
        this.volumeCount = volumeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorAggregate that = (SnapMirrorAggregate) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(aggregateName, that.aggregateName) && 
            Objects.equals(nodeName, that.nodeName) && 
            Objects.equals(sizeAvailable, that.sizeAvailable) && 
            Objects.equals(sizeTotal, that.sizeTotal) && 
            Objects.equals(percentUsedCapacity, that.percentUsedCapacity) && 
            Objects.equals(volumeCount, that.volumeCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,aggregateName,nodeName,sizeAvailable,sizeTotal,percentUsedCapacity,volumeCount );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("aggregateName", aggregateName);
        map.put("nodeName", nodeName);
        map.put("sizeAvailable", sizeAvailable);
        map.put("sizeTotal", sizeTotal);
        map.put("percentUsedCapacity", percentUsedCapacity);
        map.put("volumeCount", volumeCount);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" aggregateName : ").append(gson.toJson(aggregateName)).append(",");
        sb.append(" nodeName : ").append(gson.toJson(nodeName)).append(",");
        sb.append(" sizeAvailable : ").append(gson.toJson(sizeAvailable)).append(",");
        sb.append(" sizeTotal : ").append(gson.toJson(sizeTotal)).append(",");
        sb.append(" percentUsedCapacity : ").append(gson.toJson(percentUsedCapacity)).append(",");
        sb.append(" volumeCount : ").append(gson.toJson(volumeCount)).append(",");
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
        private String aggregateName;
        private String nodeName;
        private Long sizeAvailable;
        private Long sizeTotal;
        private Long percentUsedCapacity;
        private Long volumeCount;

        private Builder() { }

        public SnapMirrorAggregate build() {
            return new SnapMirrorAggregate (
                         this.snapMirrorEndpointID,
                         this.aggregateName,
                         this.nodeName,
                         this.sizeAvailable,
                         this.sizeTotal,
                         this.percentUsedCapacity,
                         this.volumeCount);
        }

        private SnapMirrorAggregate.Builder buildFrom(final SnapMirrorAggregate req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.aggregateName = req.aggregateName;
            this.nodeName = req.nodeName;
            this.sizeAvailable = req.sizeAvailable;
            this.sizeTotal = req.sizeTotal;
            this.percentUsedCapacity = req.percentUsedCapacity;
            this.volumeCount = req.volumeCount;

            return this;
        }

        public SnapMirrorAggregate.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public SnapMirrorAggregate.Builder aggregateName(final String aggregateName) {
            this.aggregateName = aggregateName;
            return this;
        }

        public SnapMirrorAggregate.Builder nodeName(final String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        public SnapMirrorAggregate.Builder sizeAvailable(final Long sizeAvailable) {
            this.sizeAvailable = sizeAvailable;
            return this;
        }

        public SnapMirrorAggregate.Builder sizeTotal(final Long sizeTotal) {
            this.sizeTotal = sizeTotal;
            return this;
        }

        public SnapMirrorAggregate.Builder percentUsedCapacity(final Long percentUsedCapacity) {
            this.percentUsedCapacity = percentUsedCapacity;
            return this;
        }

        public SnapMirrorAggregate.Builder volumeCount(final Long volumeCount) {
            this.volumeCount = volumeCount;
            return this;
        }

    }
}
