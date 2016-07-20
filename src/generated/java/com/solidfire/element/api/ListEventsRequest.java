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
 * The Request object for the "ListEvents" API Service call.
 **/
public class ListEventsRequest implements Serializable {

    private static final long serialVersionUID = 625801347L;

    @SerializedName("maxEvents") private final Optional<Long> maxEvents;
    @SerializedName("startEventID") private final Optional<Long> startEventID;
    @SerializedName("endEventID") private final Optional<Long> endEventID;
    @SerializedName("eventQueueType") private final Optional<String> eventQueueType;

    /**
     * The Request object for the "ListEvents" API Service call.
     * @param maxEvents (optional) 
     * @param startEventID (optional) 
     * @param endEventID (optional) 
     * @param eventQueueType (optional) 
     * @since 7.0
     **/
    @Since("7.0")
    public ListEventsRequest(Optional<Long> maxEvents, Optional<Long> startEventID, Optional<Long> endEventID, Optional<String> eventQueueType) {
        this.maxEvents = (maxEvents == null) ? Optional.<Long>empty() : maxEvents;
        this.startEventID = (startEventID == null) ? Optional.<Long>empty() : startEventID;
        this.endEventID = (endEventID == null) ? Optional.<Long>empty() : endEventID;
        this.eventQueueType = (eventQueueType == null) ? Optional.<String>empty() : eventQueueType;
    }

    public Optional<Long> getMaxEvents() {
        return this.maxEvents;
    }
    public Optional<Long> getStartEventID() {
        return this.startEventID;
    }
    public Optional<Long> getEndEventID() {
        return this.endEventID;
    }
    public Optional<String> getEventQueueType() {
        return this.eventQueueType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListEventsRequest that = (ListEventsRequest) o;
        

        return Objects.equals( maxEvents , that.maxEvents )
            && Objects.equals( startEventID , that.startEventID )
            && Objects.equals( endEventID , that.endEventID )
            && Objects.equals( eventQueueType , that.eventQueueType );
    }

    @Override
    public int hashCode() {
        return Objects.hash( maxEvents, startEventID, endEventID, eventQueueType );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != maxEvents && maxEvents.isPresent())
            sb.append(" maxEvents : ").append(maxEvents.get()).append(",");
        if(null != startEventID && startEventID.isPresent())
            sb.append(" startEventID : ").append(startEventID.get()).append(",");
        if(null != endEventID && endEventID.isPresent())
            sb.append(" endEventID : ").append(endEventID.get()).append(",");
        if(null != eventQueueType && eventQueueType.isPresent())
            sb.append(" eventQueueType : ").append(eventQueueType.get());
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
                         this.eventQueueType            );
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
