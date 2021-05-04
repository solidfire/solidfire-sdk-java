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
 * ListEventsRequest  
 * ListEvents returns events detected on the cluster, sorted from oldest to newest.
 **/

public class ListEventsRequest implements Serializable {

    public static final long serialVersionUID = 829864358201180124L;
    @SerializedName("maxEvents") private Optional<Long> maxEvents;
    @SerializedName("startEventID") private Optional<Long> startEventID;
    @SerializedName("endEventID") private Optional<Long> endEventID;
    @SerializedName("eventType") private Optional<String> eventType;
    @SerializedName("serviceID") private Optional<Long> serviceID;
    @SerializedName("nodeID") private Optional<Long> nodeID;
    @SerializedName("driveID") private Optional<Long> driveID;
    @SerializedName("startReportTime") private Optional<String> startReportTime;
    @SerializedName("endReportTime") private Optional<String> endReportTime;
    @SerializedName("startPublishTime") private Optional<String> startPublishTime;
    @SerializedName("endPublishTime") private Optional<String> endPublishTime;
    // empty constructor
    @Since("7.0")
    public ListEventsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListEventsRequest(
        Optional<Long> maxEvents,
        Optional<Long> startEventID,
        Optional<Long> endEventID,
        Optional<Long> serviceID,
        Optional<Long> nodeID,
        Optional<Long> driveID,
        Optional<String> startReportTime,
        Optional<String> endReportTime,
        Optional<String> startPublishTime,
        Optional<String> endPublishTime
    )
    {
        this.maxEvents = (maxEvents == null) ? Optional.<Long>empty() : maxEvents;
        this.startEventID = (startEventID == null) ? Optional.<Long>empty() : startEventID;
        this.endEventID = (endEventID == null) ? Optional.<Long>empty() : endEventID;
        this.serviceID = (serviceID == null) ? Optional.<Long>empty() : serviceID;
        this.nodeID = (nodeID == null) ? Optional.<Long>empty() : nodeID;
        this.driveID = (driveID == null) ? Optional.<Long>empty() : driveID;
        this.startReportTime = (startReportTime == null) ? Optional.<String>empty() : startReportTime;
        this.endReportTime = (endReportTime == null) ? Optional.<String>empty() : endReportTime;
        this.startPublishTime = (startPublishTime == null) ? Optional.<String>empty() : startPublishTime;
        this.endPublishTime = (endPublishTime == null) ? Optional.<String>empty() : endPublishTime;
    }
    // parameterized constructor
    @Since("10.0")
    public ListEventsRequest(
        Optional<Long> maxEvents,
        Optional<Long> startEventID,
        Optional<Long> endEventID,
        Optional<String> eventType,
        Optional<Long> serviceID,
        Optional<Long> nodeID,
        Optional<Long> driveID,
        Optional<String> startReportTime,
        Optional<String> endReportTime,
        Optional<String> startPublishTime,
        Optional<String> endPublishTime
    )
    {
        this.maxEvents = (maxEvents == null) ? Optional.<Long>empty() : maxEvents;
        this.startEventID = (startEventID == null) ? Optional.<Long>empty() : startEventID;
        this.endEventID = (endEventID == null) ? Optional.<Long>empty() : endEventID;
        this.eventType = (eventType == null) ? Optional.<String>empty() : eventType;
        this.serviceID = (serviceID == null) ? Optional.<Long>empty() : serviceID;
        this.nodeID = (nodeID == null) ? Optional.<Long>empty() : nodeID;
        this.driveID = (driveID == null) ? Optional.<Long>empty() : driveID;
        this.startReportTime = (startReportTime == null) ? Optional.<String>empty() : startReportTime;
        this.endReportTime = (endReportTime == null) ? Optional.<String>empty() : endReportTime;
        this.startPublishTime = (startPublishTime == null) ? Optional.<String>empty() : startPublishTime;
        this.endPublishTime = (endPublishTime == null) ? Optional.<String>empty() : endPublishTime;
    }

    /** 
     * Specifies the maximum number of events to return.
     **/
    public Optional<Long> getMaxEvents() { return this.maxEvents; }
   
    public void setMaxEvents(Optional<Long> maxEvents) { 
        this.maxEvents = (maxEvents == null) ? Optional.<Long>empty() : maxEvents;
    }
    /** 
     * Specifies the beginning of a range of events to return.
     **/
    public Optional<Long> getStartEventID() { return this.startEventID; }
   
    public void setStartEventID(Optional<Long> startEventID) { 
        this.startEventID = (startEventID == null) ? Optional.<Long>empty() : startEventID;
    }
    /** 
     * Specifies the end of a range of events to return.
     **/
    public Optional<Long> getEndEventID() { return this.endEventID; }
   
    public void setEndEventID(Optional<Long> endEventID) { 
        this.endEventID = (endEventID == null) ? Optional.<Long>empty() : endEventID;
    }
    /** 
     * Specifies the type of events to return.
     **/
    public Optional<String> getEventType() { return this.eventType; }
   
    public void setEventType(Optional<String> eventType) { 
        this.eventType = (eventType == null) ? Optional.<String>empty() : eventType;
    }
    /** 
     * Specifies that only events with this ServiceID will be returned.
     **/
    public Optional<Long> getServiceID() { return this.serviceID; }
   
    public void setServiceID(Optional<Long> serviceID) { 
        this.serviceID = (serviceID == null) ? Optional.<Long>empty() : serviceID;
    }
    /** 
     * Specifies that only events with this NodeID will be returned.
     **/
    public Optional<Long> getNodeID() { return this.nodeID; }
   
    public void setNodeID(Optional<Long> nodeID) { 
        this.nodeID = (nodeID == null) ? Optional.<Long>empty() : nodeID;
    }
    /** 
     * Specifies that only events with this DriveID will be returned.
     **/
    public Optional<Long> getDriveID() { return this.driveID; }
   
    public void setDriveID(Optional<Long> driveID) { 
        this.driveID = (driveID == null) ? Optional.<Long>empty() : driveID;
    }
    /** 
     * Specifies that only events reported after this time will be returned.
     **/
    public Optional<String> getStartReportTime() { return this.startReportTime; }
   
    public void setStartReportTime(Optional<String> startReportTime) { 
        this.startReportTime = (startReportTime == null) ? Optional.<String>empty() : startReportTime;
    }
    /** 
     * Specifies that only events reported earlier than this time will be returned.
     **/
    public Optional<String> getEndReportTime() { return this.endReportTime; }
   
    public void setEndReportTime(Optional<String> endReportTime) { 
        this.endReportTime = (endReportTime == null) ? Optional.<String>empty() : endReportTime;
    }
    /** 
     * Specifies that only events published after this time will be returned.
     **/
    public Optional<String> getStartPublishTime() { return this.startPublishTime; }
   
    public void setStartPublishTime(Optional<String> startPublishTime) { 
        this.startPublishTime = (startPublishTime == null) ? Optional.<String>empty() : startPublishTime;
    }
    /** 
     * Specifies that only events published earlier than this time will be returned.
     **/
    public Optional<String> getEndPublishTime() { return this.endPublishTime; }
   
    public void setEndPublishTime(Optional<String> endPublishTime) { 
        this.endPublishTime = (endPublishTime == null) ? Optional.<String>empty() : endPublishTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListEventsRequest that = (ListEventsRequest) o;

        return 
            Objects.equals(maxEvents, that.maxEvents) && 
            Objects.equals(startEventID, that.startEventID) && 
            Objects.equals(endEventID, that.endEventID) && 
            Objects.equals(eventType, that.eventType) && 
            Objects.equals(serviceID, that.serviceID) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(driveID, that.driveID) && 
            Objects.equals(startReportTime, that.startReportTime) && 
            Objects.equals(endReportTime, that.endReportTime) && 
            Objects.equals(startPublishTime, that.startPublishTime) && 
            Objects.equals(endPublishTime, that.endPublishTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash( maxEvents,startEventID,endEventID,eventType,serviceID,nodeID,driveID,startReportTime,endReportTime,startPublishTime,endPublishTime );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("maxEvents", maxEvents);
        map.put("startEventID", startEventID);
        map.put("endEventID", endEventID);
        map.put("eventType", eventType);
        map.put("serviceID", serviceID);
        map.put("nodeID", nodeID);
        map.put("driveID", driveID);
        map.put("startReportTime", startReportTime);
        map.put("endReportTime", endReportTime);
        map.put("startPublishTime", startPublishTime);
        map.put("endPublishTime", endPublishTime);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != maxEvents && maxEvents.isPresent()){
            sb.append(" maxEvents : ").append(gson.toJson(maxEvents)).append(",");
        }
        else{
            sb.append(" maxEvents : ").append("null").append(",");
        }
        if(null != startEventID && startEventID.isPresent()){
            sb.append(" startEventID : ").append(gson.toJson(startEventID)).append(",");
        }
        else{
            sb.append(" startEventID : ").append("null").append(",");
        }
        if(null != endEventID && endEventID.isPresent()){
            sb.append(" endEventID : ").append(gson.toJson(endEventID)).append(",");
        }
        else{
            sb.append(" endEventID : ").append("null").append(",");
        }
        if(null != eventType && eventType.isPresent()){
            sb.append(" eventType : ").append(gson.toJson(eventType)).append(",");
        }
        else{
            sb.append(" eventType : ").append("null").append(",");
        }
        if(null != serviceID && serviceID.isPresent()){
            sb.append(" serviceID : ").append(gson.toJson(serviceID)).append(",");
        }
        else{
            sb.append(" serviceID : ").append("null").append(",");
        }
        if(null != nodeID && nodeID.isPresent()){
            sb.append(" nodeID : ").append(gson.toJson(nodeID)).append(",");
        }
        else{
            sb.append(" nodeID : ").append("null").append(",");
        }
        if(null != driveID && driveID.isPresent()){
            sb.append(" driveID : ").append(gson.toJson(driveID)).append(",");
        }
        else{
            sb.append(" driveID : ").append("null").append(",");
        }
        if(null != startReportTime && startReportTime.isPresent()){
            sb.append(" startReportTime : ").append(gson.toJson(startReportTime)).append(",");
        }
        else{
            sb.append(" startReportTime : ").append("null").append(",");
        }
        if(null != endReportTime && endReportTime.isPresent()){
            sb.append(" endReportTime : ").append(gson.toJson(endReportTime)).append(",");
        }
        else{
            sb.append(" endReportTime : ").append("null").append(",");
        }
        if(null != startPublishTime && startPublishTime.isPresent()){
            sb.append(" startPublishTime : ").append(gson.toJson(startPublishTime)).append(",");
        }
        else{
            sb.append(" startPublishTime : ").append("null").append(",");
        }
        if(null != endPublishTime && endPublishTime.isPresent()){
            sb.append(" endPublishTime : ").append(gson.toJson(endPublishTime)).append(",");
        }
        else{
            sb.append(" endPublishTime : ").append("null").append(",");
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
        private Optional<Long> maxEvents;
        private Optional<Long> startEventID;
        private Optional<Long> endEventID;
        private Optional<String> eventType;
        private Optional<Long> serviceID;
        private Optional<Long> nodeID;
        private Optional<Long> driveID;
        private Optional<String> startReportTime;
        private Optional<String> endReportTime;
        private Optional<String> startPublishTime;
        private Optional<String> endPublishTime;

        private Builder() { }

        public ListEventsRequest build() {
            return new ListEventsRequest (
                         this.maxEvents,
                         this.startEventID,
                         this.endEventID,
                         this.eventType,
                         this.serviceID,
                         this.nodeID,
                         this.driveID,
                         this.startReportTime,
                         this.endReportTime,
                         this.startPublishTime,
                         this.endPublishTime);
        }

        private ListEventsRequest.Builder buildFrom(final ListEventsRequest req) {
            this.maxEvents = req.maxEvents;
            this.startEventID = req.startEventID;
            this.endEventID = req.endEventID;
            this.eventType = req.eventType;
            this.serviceID = req.serviceID;
            this.nodeID = req.nodeID;
            this.driveID = req.driveID;
            this.startReportTime = req.startReportTime;
            this.endReportTime = req.endReportTime;
            this.startPublishTime = req.startPublishTime;
            this.endPublishTime = req.endPublishTime;

            return this;
        }

        public ListEventsRequest.Builder optionalMaxEvents(final Long maxEvents) {
            this.maxEvents = (maxEvents == null) ? Optional.<Long>empty() : Optional.of(maxEvents);
            return this;
        }

        public ListEventsRequest.Builder optionalStartEventID(final Long startEventID) {
            this.startEventID = (startEventID == null) ? Optional.<Long>empty() : Optional.of(startEventID);
            return this;
        }

        public ListEventsRequest.Builder optionalEndEventID(final Long endEventID) {
            this.endEventID = (endEventID == null) ? Optional.<Long>empty() : Optional.of(endEventID);
            return this;
        }

        public ListEventsRequest.Builder optionalEventType(final String eventType) {
            this.eventType = (eventType == null) ? Optional.<String>empty() : Optional.of(eventType);
            return this;
        }

        public ListEventsRequest.Builder optionalServiceID(final Long serviceID) {
            this.serviceID = (serviceID == null) ? Optional.<Long>empty() : Optional.of(serviceID);
            return this;
        }

        public ListEventsRequest.Builder optionalNodeID(final Long nodeID) {
            this.nodeID = (nodeID == null) ? Optional.<Long>empty() : Optional.of(nodeID);
            return this;
        }

        public ListEventsRequest.Builder optionalDriveID(final Long driveID) {
            this.driveID = (driveID == null) ? Optional.<Long>empty() : Optional.of(driveID);
            return this;
        }

        public ListEventsRequest.Builder optionalStartReportTime(final String startReportTime) {
            this.startReportTime = (startReportTime == null) ? Optional.<String>empty() : Optional.of(startReportTime);
            return this;
        }

        public ListEventsRequest.Builder optionalEndReportTime(final String endReportTime) {
            this.endReportTime = (endReportTime == null) ? Optional.<String>empty() : Optional.of(endReportTime);
            return this;
        }

        public ListEventsRequest.Builder optionalStartPublishTime(final String startPublishTime) {
            this.startPublishTime = (startPublishTime == null) ? Optional.<String>empty() : Optional.of(startPublishTime);
            return this;
        }

        public ListEventsRequest.Builder optionalEndPublishTime(final String endPublishTime) {
            this.endPublishTime = (endPublishTime == null) ? Optional.<String>empty() : Optional.of(endPublishTime);
            return this;
        }

    }
}
