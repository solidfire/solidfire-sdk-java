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
 * The Request object for the "CreateSchedule" API Service call.
 **/
public class CreateScheduleRequest implements Serializable {

    private static final long serialVersionUID = -1371084545L;

    @SerializedName("attributes") private final java.util.Map<String, Object> attributes;
    @SerializedName("hours") private final Optional<Long> hours;
    @SerializedName("minutes") private final Optional<Long> minutes;
    @SerializedName("paused") private final Optional<Boolean> paused;
    @SerializedName("recurring") private final Optional<Boolean> recurring;
    @SerializedName("scheduleName") private final String scheduleName;
    @SerializedName("scheduleType") private final String scheduleType;
    @SerializedName("scheduleInfo") private final ScheduleInfo scheduleInfo;
    @SerializedName("startingDate") private final Optional<String> startingDate;
    @SerializedName("monthdays") private final Optional<Long[]> monthdays;
    @SerializedName("weekdays") private final Optional<Weekday[]> weekdays;

    /**
     * The Request object for the "CreateSchedule" API Service call.
     * @param attributes [required] The "frequency" object is returned in "attributes" to indicate the frequency at which the snapshot will be made.<br/>
     * @param hours (optional) Number of hours between snapshots or hour at which the snapshot will occur in "Days of Week", or "Days of Month" mode.<br/>
     * @param minutes (optional) Number of minutes between snapshots or minute at which the snapshot will occur in "Days of Week", or "Days of Month" mode.<br/>
     * @param paused (optional) Indicates if the schedule should be paused or not.
     * @param recurring (optional) Indicates if the schedule will be recurring or not.
     * @param scheduleName [required] Unique name for the schedule.
     * @param scheduleType [required] Indicates the type of schedule to create.<br/>
     * @param scheduleInfo [required] An object of schedule information about how the snapshot should be created at each scheduled interval.<br/>
     * @param startingDate (optional) Time after which the schedule will be run. If not set the schedule starts immediately. Formatted in UTC time.
     * @param monthdays (optional) The days of the month that a snapshot will be made. <br/>
     * @param weekdays (optional) Day of the week the snapshot is to be created. <br/>
     * @since 8.0
     **/
    @Since("8.0")
    public CreateScheduleRequest(java.util.Map<String, Object> attributes, Optional<Long> hours, Optional<Long> minutes, Optional<Boolean> paused, Optional<Boolean> recurring, String scheduleName, String scheduleType, ScheduleInfo scheduleInfo, Optional<String> startingDate, Optional<Long[]> monthdays, Optional<Weekday[]> weekdays) {
        this.weekdays = (weekdays == null) ? Optional.<Weekday[]>empty() : weekdays;
        this.monthdays = (monthdays == null) ? Optional.<Long[]>empty() : monthdays;
        this.scheduleInfo = scheduleInfo;
        this.attributes = attributes;
        this.recurring = (recurring == null) ? Optional.<Boolean>empty() : recurring;
        this.minutes = (minutes == null) ? Optional.<Long>empty() : minutes;
        this.hours = (hours == null) ? Optional.<Long>empty() : hours;
        this.paused = (paused == null) ? Optional.<Boolean>empty() : paused;
        this.scheduleType = scheduleType;
        this.startingDate = (startingDate == null) ? Optional.<String>empty() : startingDate;
        this.scheduleName = scheduleName;
    }


    /**
     * The "frequency" object is returned in "attributes" to indicate the frequency at which the snapshot will be made.<br/>
     * Valid values for "frequency" are:<br/>
     * Days of Week<br/>
     * Days of Month<br/>
     * Time Interval
     **/
    public java.util.Map<String, Object> getAttributes() {
        return this.attributes;
    }

    /**
     * Number of hours between snapshots or hour at which the snapshot will occur in "Days of Week", or "Days of Month" mode.<br/>
     * Valid values: 0 - 24
     **/
    public Optional<Long> getHours() {
        return this.hours;
    }

    /**
     * Number of minutes between snapshots or minute at which the snapshot will occur in "Days of Week", or "Days of Month" mode.<br/>
     * Valid values: 0 - 59
     **/
    public Optional<Long> getMinutes() {
        return this.minutes;
    }

    /**
     * Indicates if the schedule should be paused or not.
     **/
    public Optional<Boolean> getPaused() {
        return this.paused;
    }

    /**
     * Indicates if the schedule will be recurring or not.
     **/
    public Optional<Boolean> getRecurring() {
        return this.recurring;
    }

    /**
     * Unique name for the schedule.
     **/
    public String getScheduleName() {
        return this.scheduleName;
    }

    /**
     * Indicates the type of schedule to create.<br/>
     * Valid value is:<br/>
     * snapshot
     **/
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * An object of schedule information about how the snapshot should be created at each scheduled interval.<br/>
     * volumeID - The ID of the volume to be included in the snapshot. (Integer)<br/>
     * volumes - A list of volume IDs to be included in the group snapshot. (Array of Integers)<br/>
     * name - The snapshot name to be used. (String)<br/>
     * enableRemoteReplication - Indicates if the snapshot should be included in remote replication. (Boolean)<br/>
     * retention - The amount of time the snapshot will be retained in HH:mm:ss. (String)
     **/
    public ScheduleInfo getScheduleInfo() {
        return this.scheduleInfo;
    }

    /**
     * Time after which the schedule will be run. If not set the schedule starts immediately. Formatted in UTC time.
     **/
    public Optional<String> getStartingDate() {
        return this.startingDate;
    }

    /**
     * The days of the month that a snapshot will be made. <br/>
     * Valid values: 1 - 31
     **/
    public Optional<Long[]> getMonthdays() {
        return this.monthdays;
    }

    /**
     * Day of the week the snapshot is to be created. <br/>
     * Required values: <br/>
     * day: 0 - 6 (Sunday - Saturday)<br/>
     * offset: 1
     **/
    public Optional<Weekday[]> getWeekdays() {
        return this.weekdays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateScheduleRequest that = (CreateScheduleRequest) o;
        

        return Objects.equals( attributes , that.attributes )
            && Objects.equals( hours , that.hours )
            && Objects.equals( minutes , that.minutes )
            && Objects.equals( paused , that.paused )
            && Objects.equals( recurring , that.recurring )
            && Objects.equals( scheduleName , that.scheduleName )
            && Objects.equals( scheduleType , that.scheduleType )
            && Objects.equals( scheduleInfo , that.scheduleInfo )
            && Objects.equals( startingDate , that.startingDate )
            && Objects.deepEquals( monthdays , that.monthdays )
            && Objects.deepEquals( weekdays , that.weekdays );
    }

    @Override
    public int hashCode() {
        return Objects.hash( attributes, hours, minutes, paused, recurring, scheduleName, scheduleType, scheduleInfo, startingDate, monthdays, weekdays );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" attributes : ").append(attributes).append(",");
        if(null != hours && hours.isPresent())
            sb.append(" hours : ").append(hours.get()).append(",");
        if(null != minutes && minutes.isPresent())
            sb.append(" minutes : ").append(minutes.get()).append(",");
        if(null != paused && paused.isPresent())
            sb.append(" paused : ").append(paused.get()).append(",");
        if(null != recurring && recurring.isPresent())
            sb.append(" recurring : ").append(recurring.get()).append(",");
        sb.append(" scheduleName : ").append(scheduleName).append(",");
        sb.append(" scheduleType : ").append(scheduleType).append(",");
        sb.append(" scheduleInfo : ").append(scheduleInfo).append(",");
        if(null != startingDate && startingDate.isPresent())
            sb.append(" startingDate : ").append(startingDate.get()).append(",");
        if(null != monthdays && monthdays.isPresent())
            sb.append(" monthdays : ").append(Arrays.toString(monthdays.get())).append(",");
        if(null != weekdays && weekdays.isPresent())
            sb.append(" weekdays : ").append(Arrays.toString(weekdays.get()));
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
        private java.util.Map<String, Object> attributes;
        private Optional<Long> hours;
        private Optional<Long> minutes;
        private Optional<Boolean> paused;
        private Optional<Boolean> recurring;
        private String scheduleName;
        private String scheduleType;
        private ScheduleInfo scheduleInfo;
        private Optional<String> startingDate;
        private Optional<Long[]> monthdays;
        private Optional<Weekday[]> weekdays;

        private Builder() { }

        public CreateScheduleRequest build() {
            return new CreateScheduleRequest (
                         this.attributes,
                         this.hours,
                         this.minutes,
                         this.paused,
                         this.recurring,
                         this.scheduleName,
                         this.scheduleType,
                         this.scheduleInfo,
                         this.startingDate,
                         this.monthdays,
                         this.weekdays            );
        }

        private CreateScheduleRequest.Builder buildFrom(final CreateScheduleRequest req) {
            this.attributes = req.attributes;
            this.hours = req.hours;
            this.minutes = req.minutes;
            this.paused = req.paused;
            this.recurring = req.recurring;
            this.scheduleName = req.scheduleName;
            this.scheduleType = req.scheduleType;
            this.scheduleInfo = req.scheduleInfo;
            this.startingDate = req.startingDate;
            this.monthdays = req.monthdays;
            this.weekdays = req.weekdays;

            return this;
        }

        public CreateScheduleRequest.Builder attributes(final java.util.Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

        public CreateScheduleRequest.Builder optionalHours(final Long hours) {
            this.hours = (hours == null) ? Optional.<Long>empty() : Optional.of(hours);
            return this;
        }

        public CreateScheduleRequest.Builder optionalMinutes(final Long minutes) {
            this.minutes = (minutes == null) ? Optional.<Long>empty() : Optional.of(minutes);
            return this;
        }

        public CreateScheduleRequest.Builder optionalPaused(final Boolean paused) {
            this.paused = (paused == null) ? Optional.<Boolean>empty() : Optional.of(paused);
            return this;
        }

        public CreateScheduleRequest.Builder optionalRecurring(final Boolean recurring) {
            this.recurring = (recurring == null) ? Optional.<Boolean>empty() : Optional.of(recurring);
            return this;
        }

        public CreateScheduleRequest.Builder scheduleName(final String scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }

        public CreateScheduleRequest.Builder scheduleType(final String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }

        public CreateScheduleRequest.Builder scheduleInfo(final ScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }

        public CreateScheduleRequest.Builder optionalStartingDate(final String startingDate) {
            this.startingDate = (startingDate == null) ? Optional.<String>empty() : Optional.of(startingDate);
            return this;
        }

        public CreateScheduleRequest.Builder optionalMonthdays(final Long[] monthdays) {
            this.monthdays = (monthdays == null) ? Optional.<Long[]>empty() : Optional.of(monthdays);
            return this;
        }

        public CreateScheduleRequest.Builder optionalWeekdays(final Weekday[] weekdays) {
            this.weekdays = (weekdays == null) ? Optional.<Weekday[]>empty() : Optional.of(weekdays);
            return this;
        }

    }

}
