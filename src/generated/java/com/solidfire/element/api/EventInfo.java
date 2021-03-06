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
 * EventInfo  
 **/

public class EventInfo implements Serializable {

    public static final long serialVersionUID = 4609108203638338892L;
    @SerializedName("eventID") private Long eventID;
    @SerializedName("severity") private Long severity;
    @SerializedName("eventInfoType") private String eventInfoType;
    @SerializedName("message") private String message;
    @SerializedName("serviceID") private Long serviceID;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("driveID") private Long driveID;
    @SerializedName("driveIDs") private Long[] driveIDs;
    @SerializedName("timeOfReport") private String timeOfReport;
    @SerializedName("timeOfPublish") private String timeOfPublish;
    @SerializedName("details") private Optional<Object> details;
    // empty constructor
    @Since("7.0")
    public EventInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public EventInfo(
        Long eventID,
        Long severity,
        String eventInfoType,
        String message,
        Long serviceID,
        Long nodeID,
        Long driveID,
        Long[] driveIDs,
        String timeOfReport,
        String timeOfPublish,
        Optional<Object> details
    )
    {
        this.eventID = eventID;
        this.severity = severity;
        this.eventInfoType = eventInfoType;
        this.message = message;
        this.serviceID = serviceID;
        this.nodeID = nodeID;
        this.driveID = driveID;
        this.driveIDs = driveIDs;
        this.timeOfReport = timeOfReport;
        this.timeOfPublish = timeOfPublish;
        this.details = (details == null) ? Optional.<Object>empty() : details;
    }

    /** 
     * ID of event.
     **/
    public Long getEventID() { return this.eventID; }
   
    public void setEventID(Long eventID) { 
        this.eventID = eventID;
    }
    /** 
     * Unused
     **/
    public Long getSeverity() { return this.severity; }
   
    public void setSeverity(Long severity) { 
        this.severity = severity;
    }
    /** 
     * Event type.
     **/
    public String getEventInfoType() { return this.eventInfoType; }
   
    public void setEventInfoType(String eventInfoType) { 
        this.eventInfoType = eventInfoType;
    }
    /** 
     * The message associated with the event.
     **/
    public String getMessage() { return this.message; }
   
    public void setMessage(String message) { 
        this.message = message;
    }
    /** 
     * ServiceID associated with the event.
     **/
    public Long getServiceID() { return this.serviceID; }
   
    public void setServiceID(Long serviceID) { 
        this.serviceID = serviceID;
    }
    /** 
     * NodeID associated with the event.
     **/
    public Long getNodeID() { return this.nodeID; }
   
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     * Derived from driveIDs field. Either the first item in driveIDs array, or empty.
     **/
    public Long getDriveID() { return this.driveID; }
   
    public void setDriveID(Long driveID) { 
        this.driveID = driveID;
    }
    /** 
     * Drive IDs associated with the event.
     **/
    public Long[] getDriveIDs() { return this.driveIDs; }
   
    public void setDriveIDs(Long[] driveIDs) { 
        this.driveIDs = driveIDs;
    }
    /** 
     * The time this event was reported.
     **/
    public String getTimeOfReport() { return this.timeOfReport; }
   
    public void setTimeOfReport(String timeOfReport) { 
        this.timeOfReport = timeOfReport;
    }
    /** 
     * The time this event was published into the database.
     **/
    public String getTimeOfPublish() { return this.timeOfPublish; }
   
    public void setTimeOfPublish(String timeOfPublish) { 
        this.timeOfPublish = timeOfPublish;
    }
    /** 
     * Data assoicated with the event, such as data report or exception details.
     **/
    public Optional<Object> getDetails() { return this.details; }
   
    public void setDetails(Optional<Object> details) { 
        this.details = (details == null) ? Optional.<Object>empty() : details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventInfo that = (EventInfo) o;

        return 
            Objects.equals(eventID, that.eventID) && 
            Objects.equals(severity, that.severity) && 
            Objects.equals(eventInfoType, that.eventInfoType) && 
            Objects.equals(message, that.message) && 
            Objects.equals(serviceID, that.serviceID) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(driveID, that.driveID) && 
            Arrays.equals(driveIDs, that.driveIDs) && 
            Objects.equals(timeOfReport, that.timeOfReport) && 
            Objects.equals(timeOfPublish, that.timeOfPublish) && 
            Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash( eventID,severity,eventInfoType,message,serviceID,nodeID,driveID,(Object[])driveIDs,timeOfReport,timeOfPublish,details );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("eventID", eventID);
        map.put("severity", severity);
        map.put("eventInfoType", eventInfoType);
        map.put("message", message);
        map.put("serviceID", serviceID);
        map.put("nodeID", nodeID);
        map.put("driveID", driveID);
        map.put("driveIDs", driveIDs);
        map.put("timeOfReport", timeOfReport);
        map.put("timeOfPublish", timeOfPublish);
        map.put("details", details);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" eventID : ").append(gson.toJson(eventID)).append(",");
        sb.append(" severity : ").append(gson.toJson(severity)).append(",");
        sb.append(" eventInfoType : ").append(gson.toJson(eventInfoType)).append(",");
        sb.append(" message : ").append(gson.toJson(message)).append(",");
        sb.append(" serviceID : ").append(gson.toJson(serviceID)).append(",");
        sb.append(" nodeID : ").append(gson.toJson(nodeID)).append(",");
        sb.append(" driveID : ").append(gson.toJson(driveID)).append(",");
        sb.append(" driveIDs : ").append(gson.toJson(Arrays.toString(driveIDs))).append(",");
        sb.append(" timeOfReport : ").append(gson.toJson(timeOfReport)).append(",");
        sb.append(" timeOfPublish : ").append(gson.toJson(timeOfPublish)).append(",");
        if(null != details && details.isPresent()){
            sb.append(" details : ").append(gson.toJson(details)).append(",");
        }
        else{
            sb.append(" details : ").append("null").append(",");
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
        private Long eventID;
        private Long severity;
        private String eventInfoType;
        private String message;
        private Long serviceID;
        private Long nodeID;
        private Long driveID;
        private Long[] driveIDs;
        private String timeOfReport;
        private String timeOfPublish;
        private Optional<Object> details;

        private Builder() { }

        public EventInfo build() {
            return new EventInfo (
                         this.eventID,
                         this.severity,
                         this.eventInfoType,
                         this.message,
                         this.serviceID,
                         this.nodeID,
                         this.driveID,
                         this.driveIDs,
                         this.timeOfReport,
                         this.timeOfPublish,
                         this.details);
        }

        private EventInfo.Builder buildFrom(final EventInfo req) {
            this.eventID = req.eventID;
            this.severity = req.severity;
            this.eventInfoType = req.eventInfoType;
            this.message = req.message;
            this.serviceID = req.serviceID;
            this.nodeID = req.nodeID;
            this.driveID = req.driveID;
            this.driveIDs = req.driveIDs;
            this.timeOfReport = req.timeOfReport;
            this.timeOfPublish = req.timeOfPublish;
            this.details = req.details;

            return this;
        }

        public EventInfo.Builder eventID(final Long eventID) {
            this.eventID = eventID;
            return this;
        }

        public EventInfo.Builder severity(final Long severity) {
            this.severity = severity;
            return this;
        }

        public EventInfo.Builder eventInfoType(final String eventInfoType) {
            this.eventInfoType = eventInfoType;
            return this;
        }

        public EventInfo.Builder message(final String message) {
            this.message = message;
            return this;
        }

        public EventInfo.Builder serviceID(final Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        public EventInfo.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public EventInfo.Builder driveID(final Long driveID) {
            this.driveID = driveID;
            return this;
        }

        public EventInfo.Builder driveIDs(final Long[] driveIDs) {
            this.driveIDs = driveIDs;
            return this;
        }

        public EventInfo.Builder timeOfReport(final String timeOfReport) {
            this.timeOfReport = timeOfReport;
            return this;
        }

        public EventInfo.Builder timeOfPublish(final String timeOfPublish) {
            this.timeOfPublish = timeOfPublish;
            return this;
        }

        public EventInfo.Builder optionalDetails(final Object details) {
            this.details = (details == null) ? Optional.<Object>empty() : Optional.of(details);
            return this;
        }

    }
}
