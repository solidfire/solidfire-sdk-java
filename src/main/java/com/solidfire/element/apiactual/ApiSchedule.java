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

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;


/**
 * Schedule is an object containing information about each schedule created to autonomously make a snapshot of a volume.
 * The return object includes information for all schedules. If scheduleID is used to identify a specific schedule then
 * only information for that scheduleID is returned. Schedules information is returned with the API method, see
 * "ListSchedules" on the SolidFire API guide page 245.
 **/
public class ApiSchedule implements Serializable {

    private static final long serialVersionUID = 205995895L;

    @SerializedName("attributes")
    private final java.util.Map<String, Object> attributes;
    @SerializedName("hasError")
    private final Boolean hasError;
    @SerializedName("hours")
    private final Long hours;
    @SerializedName("lastRunStatus")
    private final String lastRunStatus;
    @SerializedName("lastRunTimeStarted")
    private final String lastRunTimeStarted;
    @SerializedName("minutes")
    private final Long minutes;
    @SerializedName("monthdays")
    private final Long[] monthdays;
    @SerializedName("paused")
    private final Boolean paused;
    @SerializedName("recurring")
    private final Boolean recurring;
    @SerializedName("runNextInterval")
    private final Boolean runNextInterval;
    @SerializedName("scheduleID")
    private final Long scheduleID;
    @SerializedName("scheduleInfo")
    private final ApiScheduleInfo scheduleInfo;
    @SerializedName("scheduleName")
    private final String scheduleName;
    @SerializedName("scheduleType")
    private final String scheduleType;
    @SerializedName("startingDate")
    private final String startingDate;
    @SerializedName("toBeDeleted")
    private final Boolean toBeDeleted;
    @SerializedName("weekdays")
    private final ApiWeekday[] weekdays;

    /**
     * Schedule is an object containing information about each schedule created to autonomously make a snapshot of a volume.
     * The return object includes information for all schedules. If scheduleID is used to identify a specific schedule then
     * only information for that scheduleID is returned. Schedules information is returned with the API method, see
     * "ListSchedules" on the SolidFire API guide page 245.
     *
     * @param attributes         [required] Indicates the frequency of the schedule occurrence.<br/>
     * @param hasError           [required] Indicates whether or not the schedule has errors.
     * @param hours              [required] Shows the hours that will elapse before the next snapshot is created.<br/>
     * @param lastRunStatus      [required] Indicates the status of the last scheduled snapshot.<br/>
     * @param lastRunTimeStarted [required] Indicates the last time the schedule started n ISO 8601 date string.
     * @param minutes            [required] Shows the minutes that will elapse before the next snapshot is created.
     * @param monthdays          [required] Shows the days of the month that the next snapshot will be created on.
     * @param paused             [required] Indicates whether or not the schedule is paused.
     * @param recurring          [required] Indicates whether or not the schedule is recurring.
     * @param runNextInterval    [required] Indicates whether or not the schedule will run the next time the scheduler is active.
     *                           When set to "true", the schedule will run the next time the scheduler is active and then reset back to "false".
     * @param scheduleID         [required] Unique ID of the schedule
     * @param scheduleInfo       [required] Includes the unique name given to the schedule, the retention period for the snapshot that was
     *                           created, and the volume ID of the volume from which the snapshot was created.
     * @param scheduleName       [required] Unique name assigned to the schedule.
     * @param scheduleType       [required] Only "snapshot" is supported at this time.
     * @param startingDate       [required] Indicates the date the first time the schedule began of will begin. Formatted in UTC time.
     * @param toBeDeleted        [required] Indicates if the schedule is marked for deletion.
     * @param weekdays           [required] Indicates the days of the week that a snapshot will be made.
     * @since 7.0
     **/
    @Since("7.0")
    public ApiSchedule(java.util.Map<String, Object> attributes, Boolean hasError, Long hours, String lastRunStatus, String lastRunTimeStarted,
                       Long minutes, Long[] monthdays, Boolean paused, Boolean recurring, Boolean runNextInterval, Long scheduleID,
                       ApiScheduleInfo scheduleInfo, String scheduleName, String scheduleType, String startingDate, Boolean toBeDeleted,
                       ApiWeekday[] weekdays) {
        this.weekdays = weekdays;
        this.scheduleID = scheduleID;
        this.lastRunStatus = lastRunStatus;
        this.monthdays = monthdays;
        this.scheduleInfo = scheduleInfo;
        this.attributes = attributes;
        this.recurring = recurring;
        this.minutes = minutes;
        this.hours = hours;
        this.paused = paused;
        this.scheduleType = scheduleType;
        this.runNextInterval = runNextInterval;
        this.startingDate = startingDate;
        this.lastRunTimeStarted = lastRunTimeStarted;
        this.toBeDeleted = toBeDeleted;
        this.scheduleName = scheduleName;
        this.hasError = hasError;
    }


    /**
     * Indicates the frequency of the schedule occurrence.<br/>
     * Valid values are:<br/>
     * Day of Week<br/>
     * Day of Month<br/>
     * Time Interval
     **/
    public java.util.Map<String, Object> getAttributes() {
        return this.attributes;
    }

    /**
     * Indicates whether or not the schedule has errors.
     **/
    public Boolean getHasError() {
        return this.hasError;
    }

    /**
     * Shows the hours that will elapse before the next snapshot is created.<br/>
     * Valid values are: 0 - 24
     **/
    public Long getHours() {
        return this.hours;
    }

    /**
     * Indicates the status of the last scheduled snapshot.<br/>
     * Valid values are:<br/>
     * Success<br/>
     * Failed
     **/
    public String getLastRunStatus() {
        return this.lastRunStatus;
    }

    /**
     * Indicates the last time the schedule started n ISO 8601 date string.
     * Valid values are:<br/>
     * Success<br/>
     * Failed
     **/
    public String getLastRunTimeStarted() {
        return this.lastRunTimeStarted;
    }

    /**
     * Shows the minutes that will elapse before the next snapshot is created.
     * Valid values are: 0 - 59
     **/
    public Long getMinutes() {
        return this.minutes;
    }

    /**
     * Shows the days of the month that the next snapshot will be created on.
     * Valid values are: 0 - 31
     **/
    public Long[] getMonthdays() {
        return this.monthdays;
    }

    /**
     * Indicates whether or not the schedule is paused.
     **/
    public Boolean getPaused() {
        return this.paused;
    }

    /**
     * Indicates whether or not the schedule is recurring.
     **/
    public Boolean getRecurring() {
        return this.recurring;
    }

    /**
     * Indicates whether or not the schedule will run the next time the scheduler is active.
     * When set to "true", the schedule will run the next time the scheduler is active and then reset back to "false".
     **/
    public Boolean getRunNextInterval() {
        return this.runNextInterval;
    }

    /**
     * Unique ID of the schedule
     **/
    public Long getScheduleID() {
        return this.scheduleID;
    }

    /**
     * Includes the unique name given to the schedule, the retention period for the snapshot that was created, and the
     * volume ID of the volume from which the snapshot was created.
     **/
    public ApiScheduleInfo getScheduleInfo() {
        return this.scheduleInfo;
    }

    /**
     * Unique name assigned to the schedule.
     **/
    public String getScheduleName() {
        return this.scheduleName;
    }

    /**
     * Only "snapshot" is supported at this time.
     **/
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * Indicates the date the first time the schedule began of will begin. Formatted in UTC time.
     **/
    public String getStartingDate() {
        return this.startingDate;
    }

    /**
     * Indicates if the schedule is marked for deletion.
     **/
    public Boolean getToBeDeleted() {
        return this.toBeDeleted;
    }

    /**
     * Indicates the days of the week that a snapshot will be made.
     **/
    public ApiWeekday[] getWeekdays() {
        return this.weekdays;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiSchedule that = (ApiSchedule) o;


        return Objects.equals(attributes, that.attributes)
                && Objects.equals(hasError, that.hasError)
                && Objects.equals(hours, that.hours)
                && Objects.equals(lastRunStatus, that.lastRunStatus)
                && Objects.equals(lastRunTimeStarted, that.lastRunTimeStarted)
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
        return Objects.hash(attributes, hasError, hours, lastRunStatus, lastRunTimeStarted, minutes, monthdays, paused, recurring,
                runNextInterval, scheduleID, scheduleInfo, scheduleName, scheduleType, startingDate, toBeDeleted, weekdays);
    }


    /** {@inheritDoc} */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        sb.append(" attributes : ").append(attributes).append(",");
        sb.append(" hasError : ").append(hasError).append(",");
        sb.append(" hours : ").append(hours).append(",");
        sb.append(" lastRunStatus : ").append(lastRunStatus).append(",");
        sb.append(" lastRunTimeStarted : ").append(lastRunTimeStarted).append(",");
        sb.append(" minutes : ").append(minutes).append(",");
        sb.append(" monthdays : ").append(Arrays.toString(monthdays)).append(",");
        sb.append(" paused : ").append(paused).append(",");
        sb.append(" recurring : ").append(recurring).append(",");
        sb.append(" runNextInterval : ").append(runNextInterval).append(",");
        sb.append(" scheduleID : ").append(scheduleID).append(",");
        sb.append(" scheduleInfo : ").append(scheduleInfo).append(",");
        sb.append(" scheduleName : ").append(scheduleName).append(",");
        sb.append(" scheduleType : ").append(scheduleType).append(",");
        sb.append(" startingDate : ").append(startingDate).append(",");
        sb.append(" toBeDeleted : ").append(toBeDeleted).append(",");
        sb.append(" weekdays : ").append(Arrays.toString(weekdays));
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
        private java.util.Map<String, Object> attributes;
        private Boolean hasError;
        private Long hours;
        private String lastRunStatus;
        private String lastRunTimeStarted;
        private Long minutes;
        private Long[] monthdays;
        private Boolean paused;
        private Boolean recurring;
        private Boolean runNextInterval;
        private Long scheduleID;
        private ApiScheduleInfo scheduleInfo;
        private String scheduleName;
        private String scheduleType;
        private String startingDate;
        private Boolean toBeDeleted;
        private ApiWeekday[] weekdays;

        /** Do not instantiate Builder. */
        private Builder() {
        }

        public ApiSchedule build() {
            return new ApiSchedule(
                    this.attributes,
                    this.hasError,
                    this.hours,
                    this.lastRunStatus,
                    this.lastRunTimeStarted,
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

        private ApiSchedule.Builder buildFrom(final ApiSchedule req) {
            this.attributes = req.attributes;
            this.hasError = req.hasError;
            this.hours = req.hours;
            this.lastRunStatus = req.lastRunStatus;
            this.lastRunTimeStarted = req.lastRunTimeStarted;
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

        public ApiSchedule.Builder attributes(final java.util.Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

        public ApiSchedule.Builder hasError(final Boolean hasError) {
            this.hasError = hasError;
            return this;
        }

        public ApiSchedule.Builder hours(final Long hours) {
            this.hours = hours;
            return this;
        }

        public ApiSchedule.Builder lastRunStatus(final String lastRunStatus) {
            this.lastRunStatus = lastRunStatus;
            return this;
        }

        public ApiSchedule.Builder lastRunTimeStart(final String lastRunTimeStart) {
            this.lastRunTimeStarted = lastRunTimeStart;
            return this;
        }

        public ApiSchedule.Builder minutes(final Long minutes) {
            this.minutes = minutes;
            return this;
        }

        public ApiSchedule.Builder monthdays(final Long[] monthdays) {
            this.monthdays = monthdays;
            return this;
        }

        public ApiSchedule.Builder paused(final Boolean paused) {
            this.paused = paused;
            return this;
        }

        public ApiSchedule.Builder recurring(final Boolean recurring) {
            this.recurring = recurring;
            return this;
        }

        public ApiSchedule.Builder runNextInterval(final Boolean runNextInterval) {
            this.runNextInterval = runNextInterval;
            return this;
        }

        public ApiSchedule.Builder scheduleID(final Long scheduleID) {
            this.scheduleID = scheduleID;
            return this;
        }

        public ApiSchedule.Builder scheduleInfo(final ApiScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }

        public ApiSchedule.Builder scheduleName(final String scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }

        public ApiSchedule.Builder scheduleType(final String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }

        public ApiSchedule.Builder startingDate(final String startingDate) {
            this.startingDate = startingDate;
            return this;
        }

        public ApiSchedule.Builder toBeDeleted(final Boolean toBeDeleted) {
            this.toBeDeleted = toBeDeleted;
            return this;
        }

        public ApiSchedule.Builder weekdays(final ApiWeekday[] weekdays) {
            this.weekdays = weekdays;
            return this;
        }

    }

}
