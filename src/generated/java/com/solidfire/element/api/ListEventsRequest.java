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

import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class ListEventsRequest implements Serializable {

    public static final long serialVersionUID = -6442141863228186837L;
    @SerializedName("maxEvents") private Optional<Long> maxEvents;
    @SerializedName("startEventID") private Optional<Long> startEventID;
    @SerializedName("endEventID") private Optional<Long> endEventID;
    @SerializedName("eventQueueType") private Optional<String> eventQueueType;

    // empty constructor
    @Since("7.0")
    public ListEventsRequest() {}

    // parameterized constructor
    @Since("7.0")
    public ListEventsRequest(
        Optional<Long> maxEvents,
        Optional<Long> startEventID,
        Optional<Long> endEventID,
        Optional<String> eventQueueType
    )
    {
        this.maxEvents = (maxEvents == null) ? Optional.<Long>empty() : maxEvents;
        this.startEventID = (startEventID == null) ? Optional.<Long>empty() : startEventID;
        this.endEventID = (endEventID == null) ? Optional.<Long>empty() : endEventID;
        this.eventQueueType = (eventQueueType == null) ? Optional.<String>empty() : eventQueueType;
    }

    /** 
     * Specifies the maximum number of events to return.
     **/
    public Optional<Long> getMaxEvents() { return this.maxEvents; }
    public void setMaxEvents(Optional<Long> maxEvents) { 
        this.maxEvents = (maxEvents == null) ? Optional.<Long>empty() : maxEvents;
    }
    /** 
     * Identifies the beginning of a range of events to return.
     **/
    public Optional<Long> getStartEventID() { return this.startEventID; }
    public void setStartEventID(Optional<Long> startEventID) { 
        this.startEventID = (startEventID == null) ? Optional.<Long>empty() : startEventID;
    }
    /** 
     * Identifies the end of a range of events to return.
     **/
    public Optional<Long> getEndEventID() { return this.endEventID; }
    public void setEndEventID(Optional<Long> endEventID) { 
        this.endEventID = (endEventID == null) ? Optional.<Long>empty() : endEventID;
    }
    /** 
     **/
    public Optional<String> getEventQueueType() { return this.eventQueueType; }
    public void setEventQueueType(Optional<String> eventQueueType) { 
        this.eventQueueType = (eventQueueType == null) ? Optional.<String>empty() : eventQueueType;
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
            Objects.equals(eventQueueType, that.eventQueueType);
    }

    @Override
    public int hashCode() {
        return Objects.hash( maxEvents, startEventID, endEventID, eventQueueType );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("maxEvents", maxEvents);
        map.put("startEventID", startEventID);
        map.put("endEventID", endEventID);
        map.put("eventQueueType", eventQueueType);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != maxEvents && maxEvents.isPresent()){
            sb.append(" maxEvents : ").append(maxEvents.get()).append(",");
        }
        if(null != startEventID && startEventID.isPresent()){
            sb.append(" startEventID : ").append(startEventID.get()).append(",");
        }
        if(null != endEventID && endEventID.isPresent()){
            sb.append(" endEventID : ").append(endEventID.get()).append(",");
        }
        if(null != eventQueueType && eventQueueType.isPresent()){
            sb.append(" eventQueueType : ").append(eventQueueType.get()).append(",");
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
        private Optional<String> eventQueueType;

        private Builder() { }

        public ListEventsRequest build() {
            return new ListEventsRequest (
                         this.maxEvents,
                         this.startEventID,
                         this.endEventID,
                         this.eventQueueType);
        }

        private ListEventsRequest.Builder buildFrom(final ListEventsRequest req) {
            this.maxEvents = req.maxEvents;
            this.startEventID = req.startEventID;
            this.endEventID = req.endEventID;
            this.eventQueueType = req.eventQueueType;

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

        public ListEventsRequest.Builder optionalEventQueueType(final String eventQueueType) {
            this.eventQueueType = (eventQueueType == null) ? Optional.<String>empty() : Optional.of(eventQueueType);
            return this;
        }

    }
}
