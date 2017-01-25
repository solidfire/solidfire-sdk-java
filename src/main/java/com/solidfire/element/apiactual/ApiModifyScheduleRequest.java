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
package com.solidfire.element.apiactual;

import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;


/**
 * The Request object for the "ModifySchedule" API Service call.
 **/
public class ApiModifyScheduleRequest implements Serializable {

    private static final long serialVersionUID = 2033174218L;

    @SerializedName("attributes")
    private final Optional<java.util.Map<String, Object>> attributes;
    @SerializedName("hours")
    private final Optional<Long> hours;
    @SerializedName("minutes")
    private final Optional<Long> minutes;
    @SerializedName("monthdays")
    private final Optional<Long[]> monthdays;
    @SerializedName("paused")
    private final Optional<Boolean> paused;
    @SerializedName("recurring")
    private final Optional<Boolean> recurring;
    @SerializedName("runNextInterval")
    private final Optional<Boolean> runNextInterval;
    @SerializedName("scheduleID")
    private final Long scheduleID;
    @SerializedName("scheduleInfo")
    private final Optional<ApiScheduleInfo> scheduleInfo;
    @SerializedName("scheduleName")
    private final Optional<String> scheduleName;
    @SerializedName("scheduleType")
    private final Optional<String> scheduleType;
    @SerializedName("startingDate")
    private final Optional<String> startingDate;
    @SerializedName("toBeDeleted")
    private final Optional<Boolean> toBeDeleted;
    @SerializedName("weekdays")
    private final Optional<ApiWeekday[]> weekdays;

    /**
     * The Request object for the "ModifySchedule" API Service call.
     *
     * @param attributes      (optional) The "frequency" object is returned in "attributes" to indicate the frequency at which the snapshot will be made.<br/>
     * @param hours           (optional) Number of hours between snapshots or hour at which the snapshot will occur in "Days of Week", or "Days of Month" mode.<br/>
     * @param minutes         (optional) Number of minutes between snapshots or minute at which the snapshot will occur in "Days of Week", or "Days of Month" mode.<br/>
     * @param monthdays       (optional) The days of the month that a snapshot will be made. <br/>
     * @param paused          (optional) Indicates if the schedule should be paused or not.
     * @param recurring       (optional) Indicates if the schedule will be recurring or not.
     * @param runNextInterval (optional) Use to choose to run the schedule when the scheduler the next time the scheduler is active. When set to "true", the schedule will run the next time the scheduler is active and then reset back to "false".
     * @param scheduleID      [required] Unique ID of the schedule.
     * @param scheduleInfo    (optional) An object of schedule information about how the snapshot should be created at each scheduled interval.<br/>
     * @param scheduleName    (optional) Unique name for the schedule.
     * @param scheduleType    (optional) Only "snapshot" is supported at this time.
     * @param startingDate    (optional) Indicates the date the first time the schedule began or will begin.
     * @param toBeDeleted     (optional) Indicates if the schedule is marked for deletion.
     * @param weekdays        (optional) Day of the week the snapshot is to be created. The day of the week starts at Sunday with the value of "0" and an offset of "1." Monday has a value of "1" with an offset of "1", etc.
     * @since 8.0
     **/
    @Since("8.0")
    public ApiModifyScheduleRequest(Optional<java.util.Map<String, Object>> attributes, Optional<Long> hours, Optional<Long> minutes, Optional<Long[]> monthdays, Optional<Boolean> paused, Optional<Boolean> recurring, Optional<Boolean> runNextInterval, Long scheduleID, Optional<ApiScheduleInfo> scheduleInfo, Optional<String> scheduleName, Optional<String> scheduleType, Optional<String> startingDate, Optional<Boolean> toBeDeleted, Optional<ApiWeekday[]> weekdays) {
        this.weekdays = (weekdays == null) ? Optional.<ApiWeekday[]>empty() : weekdays;
        this.scheduleID = scheduleID;
        this.monthdays = (monthdays == null) ? Optional.<Long[]>empty() : monthdays;
        this.scheduleInfo = (scheduleInfo == null) ? Optional.<ApiScheduleInfo>empty() : scheduleInfo;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.recurring = (recurring == null) ? Optional.<Boolean>empty() : recurring;
        this.minutes = (minutes == null) ? Optional.<Long>empty() : minutes;
        this.hours = (hours == null) ? Optional.<Long>empty() : hours;
        this.paused = (paused == null) ? Optional.<Boolean>empty() : paused;
        this.scheduleType = (scheduleType == null) ? Optional.<String>empty() : scheduleType;
        this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : runNextInterval;
        this.startingDate = (startingDate == null) ? Optional.<String>empty() : startingDate;
        this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : toBeDeleted;
        this.scheduleName = (scheduleName == null) ? Optional.<String>empty() : scheduleName;
    }


    /**
     * The "frequency" object is returned in "attributes" to indicate the frequency at which the snapshot will be made.<br/>
     * Valid values for "frequency" are:<br/>
     * Days of Week<br/>
     * Days of Month<br/>
     * Time Interval
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
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
     * The days of the month that a snapshot will be made. <br/>
     * Valid values: 1 - 31
     **/
    public Optional<Long[]> getMonthdays() {
        return this.monthdays;
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
     * Use to choose to run the schedule when the scheduler the next time the scheduler is active. When set to "true", the schedule will run the next time the scheduler is active and then reset back to "false".
     **/
    public Optional<Boolean> getRunNextInterval() {
        return this.runNextInterval;
    }

    /**
     * Unique ID of the schedule.
     **/
    public Long getScheduleID() {
        return this.scheduleID;
    }

    /**
     * An object of schedule information about how the snapshot should be created at each scheduled interval.<br/>
     * volumeID - The ID of the volume to be included in the snapshot. (Integer)<br/>
     * volumes - A list of volume IDs to be included in the group snapshot. (Array of Integers)<br/>
     * name - The snapshot name to be used. (String)<br/>
     * enableRemoteReplication - Indicates if the snapshot should be included in remote replication. (Boolean)<br/>
     * retention - The amount of time the snapshot will be retained in HH:mm:ss. (String)
     **/
    public Optional<ApiScheduleInfo> getScheduleInfo() {
        return this.scheduleInfo;
    }

    /**
     * Unique name for the schedule.
     **/
    public Optional<String> getScheduleName() {
        return this.scheduleName;
    }

    /**
     * Only "snapshot" is supported at this time.
     **/
    public Optional<String> getScheduleType() {
        return this.scheduleType;
    }

    /**
     * Indicates the date the first time the schedule began or will begin.
     **/
    public Optional<String> getStartingDate() {
        return this.startingDate;
    }

    /**
     * Indicates if the schedule is marked for deletion.
     **/
    public Optional<Boolean> getToBeDeleted() {
        return this.toBeDeleted;
    }

    /**
     * Day of the week the snapshot is to be created. The day of the week starts at Sunday with the value of "0" and an offset of "1." Monday has a value of "1" with an offset of "1", etc.
     **/
    public Optional<ApiWeekday[]> getWeekdays() {
        return this.weekdays;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiModifyScheduleRequest that = (ApiModifyScheduleRequest) o;


        return Objects.equals(attributes, that.attributes)
                && Objects.equals(hours, that.hours)
                && Objects.equals(minutes, that.minutes)
                && Objects.deepEquals(monthdays, that.monthdays)
                && Objects.equals(paused, that.paused)
                && Objects.equals(recurring, that.recurring)
                && Objects.equals(runNextInterval, that.runNextInterval)
                && Objects.equals(scheduleID, that.scheduleID)
                && Objects.equals(scheduleInfo, that.scheduleInfo)
                && Objects.equals(scheduleName, that.scheduleName)
                && Objects.equals(scheduleType, that.scheduleType)
                && Objects.equals(startingDate, that.startingDate)
                && Objects.equals(toBeDeleted, that.toBeDeleted)
                && Objects.deepEquals(weekdays, that.weekdays);
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(attributes, hours, minutes, monthdays, paused, recurring, runNextInterval, scheduleID, scheduleInfo, scheduleName, scheduleType, startingDate, toBeDeleted, weekdays);
    }


    /** {@inheritDoc} */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        if (null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get()).append(",");
        if (null != hours && hours.isPresent())
            sb.append(" hours : ").append(hours.get()).append(",");
        if (null != minutes && minutes.isPresent())
            sb.append(" minutes : ").append(minutes.get()).append(",");
        if (null != monthdays && monthdays.isPresent())
            sb.append(" monthdays : ").append(Arrays.toString(monthdays.get())).append(",");
        if (null != paused && paused.isPresent())
            sb.append(" paused : ").append(paused.get()).append(",");
        if (null != recurring && recurring.isPresent())
            sb.append(" recurring : ").append(recurring.get()).append(",");
        if (null != runNextInterval && runNextInterval.isPresent())
            sb.append(" runNextInterval : ").append(runNextInterval.get()).append(",");
        sb.append(" scheduleID : ").append(scheduleID).append(",");
        if (null != scheduleInfo && scheduleInfo.isPresent())
            sb.append(" scheduleInfo : ").append(scheduleInfo.get()).append(",");
        if (null != scheduleName && scheduleName.isPresent())
            sb.append(" scheduleName : ").append(scheduleName.get()).append(",");
        if (null != scheduleType && scheduleType.isPresent())
            sb.append(" scheduleType : ").append(scheduleType.get()).append(",");
        if (null != startingDate && startingDate.isPresent())
            sb.append(" startingDate : ").append(startingDate.get()).append(",");
        if (null != toBeDeleted && toBeDeleted.isPresent())
            sb.append(" toBeDeleted : ").append(toBeDeleted.get()).append(",");
        if (null != weekdays && weekdays.isPresent())
            sb.append(" weekdays : ").append(Arrays.toString(weekdays.get()));
        sb.append(" }");

        if (sb.lastIndexOf(", }") != -1)
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
        private Optional<java.util.Map<String, Object>> attributes;
        private Optional<Long> hours;
        private Optional<Long> minutes;
        private Optional<Long[]> monthdays;
        private Optional<Boolean> paused;
        private Optional<Boolean> recurring;
        private Optional<Boolean> runNextInterval;
        private Long scheduleID;
        private Optional<ApiScheduleInfo> scheduleInfo;
        private Optional<String> scheduleName;
        private Optional<String> scheduleType;
        private Optional<String> startingDate;
        private Optional<Boolean> toBeDeleted;
        private Optional<ApiWeekday[]> weekdays;

        /** Do not instantiate Builder. */
        private Builder() {
        }

        public ApiModifyScheduleRequest build() {
            return new ApiModifyScheduleRequest(
                    this.attributes,
                    this.hours,
                    this.minutes,
                    this.monthdays,
                    this.paused,
                    this.recurring,
                    this.runNextInterval,
                    this.scheduleID,
                    this.scheduleInfo,
                    this.scheduleName,
                    this.scheduleType,
                    this.startingDate,
                    this.toBeDeleted,
                    this.weekdays);
        }

        private ApiModifyScheduleRequest.Builder buildFrom(final ApiModifyScheduleRequest req) {
            this.attributes = req.attributes;
            this.hours = req.hours;
            this.minutes = req.minutes;
            this.monthdays = req.monthdays;
            this.paused = req.paused;
            this.recurring = req.recurring;
            this.runNextInterval = req.runNextInterval;
            this.scheduleID = req.scheduleID;
            this.scheduleInfo = req.scheduleInfo;
            this.scheduleName = req.scheduleName;
            this.scheduleType = req.scheduleType;
            this.startingDate = req.startingDate;
            this.toBeDeleted = req.toBeDeleted;
            this.weekdays = req.weekdays;

            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalHours(final Long hours) {
            this.hours = (hours == null) ? Optional.<Long>empty() : Optional.of(hours);
            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalMinutes(final Long minutes) {
            this.minutes = (minutes == null) ? Optional.<Long>empty() : Optional.of(minutes);
            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalMonthdays(final Long[] monthdays) {
            this.monthdays = (monthdays == null) ? Optional.<Long[]>empty() : Optional.of(monthdays);
            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalPaused(final Boolean paused) {
            this.paused = (paused == null) ? Optional.<Boolean>empty() : Optional.of(paused);
            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalRecurring(final Boolean recurring) {
            this.recurring = (recurring == null) ? Optional.<Boolean>empty() : Optional.of(recurring);
            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalRunNextInterval(final Boolean runNextInterval) {
            this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : Optional.of(runNextInterval);
            return this;
        }

        public ApiModifyScheduleRequest.Builder scheduleID(final Long scheduleID) {
            this.scheduleID = scheduleID;
            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalScheduleInfo(final ApiScheduleInfo scheduleInfo) {
            this.scheduleInfo = (scheduleInfo == null) ? Optional.<ApiScheduleInfo>empty() : Optional.of(scheduleInfo);
            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalScheduleName(final String scheduleName) {
            this.scheduleName = (scheduleName == null) ? Optional.<String>empty() : Optional.of(scheduleName);
            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalScheduleType(final String scheduleType) {
            this.scheduleType = (scheduleType == null) ? Optional.<String>empty() : Optional.of(scheduleType);
            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalStartingDate(final String startingDate) {
            this.startingDate = (startingDate == null) ? Optional.<String>empty() : Optional.of(startingDate);
            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalToBeDeleted(final Boolean toBeDeleted) {
            this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : Optional.of(toBeDeleted);
            return this;
        }

        public ApiModifyScheduleRequest.Builder optionalWeekdays(final ApiWeekday[] weekdays) {
            this.weekdays = (weekdays == null) ? Optional.<ApiWeekday[]>empty() : Optional.of(weekdays);
            return this;
        }

    }

}
