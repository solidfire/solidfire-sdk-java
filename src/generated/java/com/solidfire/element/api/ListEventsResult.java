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

public class ListEventsResult implements Serializable {

    public static final long serialVersionUID = -1047881416L;
    @SerializedName("eventQueueType") private String eventQueueType;
    @SerializedName("events") private EventInfo[] events;

    // empty constructor
    @Since("7.0")
    public ListEventsResult() {}

    // parameterized constructor
    @Since("7.0")
    public ListEventsResult(
        String eventQueueType,
        EventInfo[] events
    )
    {
        this.eventQueueType = eventQueueType;
        this.events = events;
    }

    /** 
     **/
    public String getEventQueueType() { return this.eventQueueType; }
    public void setEventQueueType(String eventQueueType) { 
        this.eventQueueType = eventQueueType;
    }
    /** 
     **/
    public EventInfo[] getEvents() { return this.events; }
    public void setEvents(EventInfo[] events) { 
        this.events = events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListEventsResult that = (ListEventsResult) o;
        return 
            Objects.equals(eventQueueType, that.eventQueueType) &&
            Objects.equals(events, that.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash( eventQueueType, (Object[])events );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("eventQueueType", eventQueueType);
        map.put("events", events);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" eventQueueType : ").append(eventQueueType).append(",");
        sb.append(" events : ").append(Arrays.toString(events)).append(",");
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
        private String eventQueueType;
        private EventInfo[] events;

        private Builder() { }

        public ListEventsResult build() {
            return new ListEventsResult (
                         this.eventQueueType,
                         this.events);
        }

        private ListEventsResult.Builder buildFrom(final ListEventsResult req) {
            this.eventQueueType = req.eventQueueType;
            this.events = req.events;

            return this;
        }

        public ListEventsResult.Builder eventQueueType(final String eventQueueType) {
            this.eventQueueType = eventQueueType;
            return this;
        }

        public ListEventsResult.Builder events(final EventInfo[] events) {
            this.events = events;
            return this;
        }

    }
}
