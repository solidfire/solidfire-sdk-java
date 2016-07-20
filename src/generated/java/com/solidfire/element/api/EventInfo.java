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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * 
 **/
public class EventInfo implements Serializable {

    private static final long serialVersionUID = 1638238257L;

    @SerializedName("eventID") private final Long eventID;
    @SerializedName("severity") private final Long severity;
    @SerializedName("eventInfoType") private final String eventInfoType;
    @SerializedName("message") private final String message;
    @SerializedName("serviceID") private final Long serviceID;
    @SerializedName("nodeID") private final Long nodeID;
    @SerializedName("driveID") private final Long driveID;
    @SerializedName("timeOfReport") private final String timeOfReport;
    @SerializedName("timeOfPublish") private final String timeOfPublish;
    @SerializedName("details") private final Object details;

    /**
     * 
     * @param eventID [required] 
     * @param severity [required] 
     * @param eventInfoType [required] 
     * @param message [required] 
     * @param serviceID [required] 
     * @param nodeID [required] 
     * @param driveID [required] 
     * @param timeOfReport [required] 
     * @param timeOfPublish [required] 
     * @param details [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public EventInfo(Long eventID, Long severity, String eventInfoType, String message, Long serviceID, Long nodeID, Long driveID, String timeOfReport, String timeOfPublish, Object details) {
        this.eventID = eventID;
        this.timeOfReport = timeOfReport;
        this.details = details;
        this.message = message;
        this.severity = severity;
        this.timeOfPublish = timeOfPublish;
        this.driveID = driveID;
        this.nodeID = nodeID;
        this.serviceID = serviceID;
        this.eventInfoType = eventInfoType;
    }

    public Long getEventID() {
        return this.eventID;
    }
    public Long getSeverity() {
        return this.severity;
    }
    public String getEventInfoType() {
        return this.eventInfoType;
    }
    public String getMessage() {
        return this.message;
    }
    public Long getServiceID() {
        return this.serviceID;
    }
    public Long getNodeID() {
        return this.nodeID;
    }
    public Long getDriveID() {
        return this.driveID;
    }
    public String getTimeOfReport() {
        return this.timeOfReport;
    }
    public String getTimeOfPublish() {
        return this.timeOfPublish;
    }
    public Object getDetails() {
        return this.details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventInfo that = (EventInfo) o;
        

        return Objects.equals( eventID , that.eventID )
            && Objects.equals( severity , that.severity )
            && Objects.equals( eventInfoType , that.eventInfoType )
            && Objects.equals( message , that.message )
            && Objects.equals( serviceID , that.serviceID )
            && Objects.equals( nodeID , that.nodeID )
            && Objects.equals( driveID , that.driveID )
            && Objects.equals( timeOfReport , that.timeOfReport )
            && Objects.equals( timeOfPublish , that.timeOfPublish )
            && Objects.equals( details , that.details );
    }

    @Override
    public int hashCode() {
        return Objects.hash( eventID, severity, eventInfoType, message, serviceID, nodeID, driveID, timeOfReport, timeOfPublish, details );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" eventID : ").append(eventID).append(",");
        sb.append(" severity : ").append(severity).append(",");
        sb.append(" eventInfoType : ").append(eventInfoType).append(",");
        sb.append(" message : ").append(message).append(",");
        sb.append(" serviceID : ").append(serviceID).append(",");
        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" driveID : ").append(driveID).append(",");
        sb.append(" timeOfReport : ").append(timeOfReport).append(",");
        sb.append(" timeOfPublish : ").append(timeOfPublish).append(",");
        sb.append(" details : ").append(details);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
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
        private String timeOfReport;
        private String timeOfPublish;
        private Object details;

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
                         this.timeOfReport,
                         this.timeOfPublish,
                         this.details            );
        }

        private EventInfo.Builder buildFrom(final EventInfo req) {
            this.eventID = req.eventID;
            this.severity = req.severity;
            this.eventInfoType = req.eventInfoType;
            this.message = req.message;
            this.serviceID = req.serviceID;
            this.nodeID = req.nodeID;
            this.driveID = req.driveID;
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

        public EventInfo.Builder timeOfReport(final String timeOfReport) {
            this.timeOfReport = timeOfReport;
            return this;
        }

        public EventInfo.Builder timeOfPublish(final String timeOfPublish) {
            this.timeOfPublish = timeOfPublish;
            return this;
        }

        public EventInfo.Builder details(final Object details) {
            this.details = details;
            return this;
        }

    }

}
