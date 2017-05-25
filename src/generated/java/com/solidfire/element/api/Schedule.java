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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * Schedule  
 * Schedule is an object containing information about each schedule created to autonomously make a snapshot of a volume. The return object includes information for all schedules. If scheduleID is used to identify a specific schedule then only information for that scheduleID is returned. Schedules information is returned with the API method, see ListSchedules on the SolidFire API guide page 245.
 **/

public class Schedule implements Serializable {

    public static final long serialVersionUID = 6700622192482002213L;
    @SerializedName("toBeDeleted") private Optional<Boolean> toBeDeleted;
    @SerializedName("name") private String name;
    @SerializedName("runNextInterval") private Optional<Boolean> runNextInterval;
    @SerializedName("recurring") private Optional<Boolean> recurring;
    @SerializedName("scheduleInfo") private ScheduleInfo scheduleInfo;
    @SerializedName("lastRunTimeStarted") private Optional<String> lastRunTimeStarted;
    @SerializedName("paused") private Optional<Boolean> paused;
    @SerializedName("frequency") private Frequency frequency;
    @SerializedName("hasError") private Optional<Boolean> hasError;
    @SerializedName("startingDate") private Optional<String> startingDate;
    @SerializedName("scheduleID") private Optional<Long> scheduleID;
    @SerializedName("lastRunStatus") private Optional<String> lastRunStatus;
    // empty constructor
    @Since("7.0")
    public Schedule() {}

    
    // parameterized constructor
    @Since("7.0")
    public Schedule(
        Optional<Boolean> toBeDeleted,
        String name,
        Optional<Boolean> runNextInterval,
        Optional<Boolean> recurring,
        ScheduleInfo scheduleInfo,
        Optional<String> lastRunTimeStarted,
        Optional<Boolean> paused,
        Frequency frequency,
        Optional<Boolean> hasError,
        Optional<String> startingDate,
        Optional<Long> scheduleID,
        Optional<String> lastRunStatus
    )
    {
        this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : toBeDeleted;
        this.name = name;
        this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : runNextInterval;
        this.recurring = (recurring == null) ? Optional.<Boolean>empty() : recurring;
        this.scheduleInfo = scheduleInfo;
        this.lastRunTimeStarted = (lastRunTimeStarted == null) ? Optional.<String>empty() : lastRunTimeStarted;
        this.paused = (paused == null) ? Optional.<Boolean>empty() : paused;
        this.frequency = frequency;
        this.hasError = (hasError == null) ? Optional.<Boolean>empty() : hasError;
        this.startingDate = (startingDate == null) ? Optional.<String>empty() : startingDate;
        this.scheduleID = (scheduleID == null) ? Optional.<Long>empty() : scheduleID;
        this.lastRunStatus = (lastRunStatus == null) ? Optional.<String>empty() : lastRunStatus;
    }

    /** 
     * Indicates if the schedule is marked for deletion.
     **/
    public Optional<Boolean> getToBeDeleted() { return this.toBeDeleted; }
    public void setToBeDeleted(Optional<Boolean> toBeDeleted) { 
        this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : toBeDeleted;
    }
    /** 
     * Unique name assigned to the schedule.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * Indicates whether or not the schedule will run the next time the scheduler is active. When set to "true", the schedule will run the next time the scheduler is active and then reset back to "false".
     **/
    public Optional<Boolean> getRunNextInterval() { return this.runNextInterval; }
    public void setRunNextInterval(Optional<Boolean> runNextInterval) { 
        this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : runNextInterval;
    }
    /** 
     * Indicates whether or not the schedule is recurring.
     **/
    public Optional<Boolean> getRecurring() { return this.recurring; }
    public void setRecurring(Optional<Boolean> recurring) { 
        this.recurring = (recurring == null) ? Optional.<Boolean>empty() : recurring;
    }
    /** 
     * Includes the unique name given to the schedule, the retention period for the snapshot that was created, and the volume ID of the volume from which the snapshot was created.
     **/
    public ScheduleInfo getScheduleInfo() { return this.scheduleInfo; }
    public void setScheduleInfo(ScheduleInfo scheduleInfo) { 
        this.scheduleInfo = scheduleInfo;
    }
    /** 
     * Indicates the last time the schedule started n ISO 8601 date string.
     * Valid values are:
     * Success
     * Failed
     **/
    public Optional<String> getLastRunTimeStarted() { return this.lastRunTimeStarted; }
    public void setLastRunTimeStarted(Optional<String> lastRunTimeStarted) { 
        this.lastRunTimeStarted = (lastRunTimeStarted == null) ? Optional.<String>empty() : lastRunTimeStarted;
    }
    /** 
     * Indicates whether or not the schedule is paused.
     **/
    public Optional<Boolean> getPaused() { return this.paused; }
    public void setPaused(Optional<Boolean> paused) { 
        this.paused = (paused == null) ? Optional.<Boolean>empty() : paused;
    }
    /** 
     * Indicates the frequency of the schedule occurrence. Set this to a type that inherits from Frequency.
     * Valid types are:
     * DayOfWeekFrequency
     * DayOfMonthFrequency
     * TimeIntervalFrequency
     **/
    public Frequency getFrequency() { return this.frequency; }
    public void setFrequency(Frequency frequency) { 
        this.frequency = frequency;
    }
    /** 
     * Indicates whether or not the schedule has errors.
     **/
    public Optional<Boolean> getHasError() { return this.hasError; }
    public void setHasError(Optional<Boolean> hasError) { 
        this.hasError = (hasError == null) ? Optional.<Boolean>empty() : hasError;
    }
    /** 
     * Indicates the date the first time the schedule began of will begin. Formatted in UTC time.
     **/
    public Optional<String> getStartingDate() { return this.startingDate; }
    public void setStartingDate(Optional<String> startingDate) { 
        this.startingDate = (startingDate == null) ? Optional.<String>empty() : startingDate;
    }
    /** 
     * Unique ID of the schedule
     **/
    public Optional<Long> getScheduleID() { return this.scheduleID; }
    public void setScheduleID(Optional<Long> scheduleID) { 
        this.scheduleID = (scheduleID == null) ? Optional.<Long>empty() : scheduleID;
    }
    /** 
     * Indicates the status of the last scheduled snapshot.
     * Valid values are:
     * Success
     * Failed
     **/
    public Optional<String> getLastRunStatus() { return this.lastRunStatus; }
    public void setLastRunStatus(Optional<String> lastRunStatus) { 
        this.lastRunStatus = (lastRunStatus == null) ? Optional.<String>empty() : lastRunStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule that = (Schedule) o;

        return 
            Objects.equals(toBeDeleted, that.toBeDeleted) && 
            Objects.equals(name, that.name) && 
            Objects.equals(runNextInterval, that.runNextInterval) && 
            Objects.equals(recurring, that.recurring) && 
            Objects.equals(scheduleInfo, that.scheduleInfo) && 
            Objects.equals(lastRunTimeStarted, that.lastRunTimeStarted) && 
            Objects.equals(paused, that.paused) && 
            Objects.equals(frequency, that.frequency) && 
            Objects.equals(hasError, that.hasError) && 
            Objects.equals(startingDate, that.startingDate) && 
            Objects.equals(scheduleID, that.scheduleID) && 
            Objects.equals(lastRunStatus, that.lastRunStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash( toBeDeleted,name,runNextInterval,recurring,scheduleInfo,lastRunTimeStarted,paused,frequency,hasError,startingDate,scheduleID,lastRunStatus );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("toBeDeleted", toBeDeleted);
        map.put("name", name);
        map.put("runNextInterval", runNextInterval);
        map.put("recurring", recurring);
        map.put("scheduleInfo", scheduleInfo);
        map.put("lastRunTimeStarted", lastRunTimeStarted);
        map.put("paused", paused);
        map.put("frequency", frequency);
        map.put("hasError", hasError);
        map.put("startingDate", startingDate);
        map.put("scheduleID", scheduleID);
        map.put("lastRunStatus", lastRunStatus);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != toBeDeleted && toBeDeleted.isPresent()){
            sb.append(" toBeDeleted : ").append(toBeDeleted).append(",");
        }
        sb.append(" name : ").append(name).append(",");
        if(null != runNextInterval && runNextInterval.isPresent()){
            sb.append(" runNextInterval : ").append(runNextInterval).append(",");
        }
        if(null != recurring && recurring.isPresent()){
            sb.append(" recurring : ").append(recurring).append(",");
        }
        sb.append(" scheduleInfo : ").append(scheduleInfo).append(",");
        if(null != lastRunTimeStarted && lastRunTimeStarted.isPresent()){
            sb.append(" lastRunTimeStarted : ").append(lastRunTimeStarted).append(",");
        }
        if(null != paused && paused.isPresent()){
            sb.append(" paused : ").append(paused).append(",");
        }
        sb.append(" frequency : ").append(frequency).append(",");
        if(null != hasError && hasError.isPresent()){
            sb.append(" hasError : ").append(hasError).append(",");
        }
        if(null != startingDate && startingDate.isPresent()){
            sb.append(" startingDate : ").append(startingDate).append(",");
        }
        if(null != scheduleID && scheduleID.isPresent()){
            sb.append(" scheduleID : ").append(scheduleID).append(",");
        }
        if(null != lastRunStatus && lastRunStatus.isPresent()){
            sb.append(" lastRunStatus : ").append(lastRunStatus).append(",");
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
        private Optional<Boolean> toBeDeleted;
        private String name;
        private Optional<Boolean> runNextInterval;
        private Optional<Boolean> recurring;
        private ScheduleInfo scheduleInfo;
        private Optional<String> lastRunTimeStarted;
        private Optional<Boolean> paused;
        private Frequency frequency;
        private Optional<Boolean> hasError;
        private Optional<String> startingDate;
        private Optional<Long> scheduleID;
        private Optional<String> lastRunStatus;

        private Builder() { }

        public Schedule build() {
            return new Schedule (
                         this.toBeDeleted,
                         this.name,
                         this.runNextInterval,
                         this.recurring,
                         this.scheduleInfo,
                         this.lastRunTimeStarted,
                         this.paused,
                         this.frequency,
                         this.hasError,
                         this.startingDate,
                         this.scheduleID,
                         this.lastRunStatus);
        }

        private Schedule.Builder buildFrom(final Schedule req) {
            this.toBeDeleted = req.toBeDeleted;
            this.name = req.name;
            this.runNextInterval = req.runNextInterval;
            this.recurring = req.recurring;
            this.scheduleInfo = req.scheduleInfo;
            this.lastRunTimeStarted = req.lastRunTimeStarted;
            this.paused = req.paused;
            this.frequency = req.frequency;
            this.hasError = req.hasError;
            this.startingDate = req.startingDate;
            this.scheduleID = req.scheduleID;
            this.lastRunStatus = req.lastRunStatus;

            return this;
        }

        public Schedule.Builder optionalToBeDeleted(final Boolean toBeDeleted) {
            this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : Optional.of(toBeDeleted);
            return this;
        }

        public Schedule.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Schedule.Builder optionalRunNextInterval(final Boolean runNextInterval) {
            this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : Optional.of(runNextInterval);
            return this;
        }

        public Schedule.Builder optionalRecurring(final Boolean recurring) {
            this.recurring = (recurring == null) ? Optional.<Boolean>empty() : Optional.of(recurring);
            return this;
        }

        public Schedule.Builder scheduleInfo(final ScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }

        public Schedule.Builder optionalLastRunTimeStarted(final String lastRunTimeStarted) {
            this.lastRunTimeStarted = (lastRunTimeStarted == null) ? Optional.<String>empty() : Optional.of(lastRunTimeStarted);
            return this;
        }

        public Schedule.Builder optionalPaused(final Boolean paused) {
            this.paused = (paused == null) ? Optional.<Boolean>empty() : Optional.of(paused);
            return this;
        }

        public Schedule.Builder frequency(final Frequency frequency) {
            this.frequency = frequency;
            return this;
        }

        public Schedule.Builder optionalHasError(final Boolean hasError) {
            this.hasError = (hasError == null) ? Optional.<Boolean>empty() : Optional.of(hasError);
            return this;
        }

        public Schedule.Builder optionalStartingDate(final String startingDate) {
            this.startingDate = (startingDate == null) ? Optional.<String>empty() : Optional.of(startingDate);
            return this;
        }

        public Schedule.Builder optionalScheduleID(final Long scheduleID) {
            this.scheduleID = (scheduleID == null) ? Optional.<Long>empty() : Optional.of(scheduleID);
            return this;
        }

        public Schedule.Builder optionalLastRunStatus(final String lastRunStatus) {
            this.lastRunStatus = (lastRunStatus == null) ? Optional.<String>empty() : Optional.of(lastRunStatus);
            return this;
        }

    }
}
