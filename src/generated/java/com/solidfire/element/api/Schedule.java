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
 * Schedule  
 * Schedule is an object containing information about each schedule created to autonomously make a snapshot of a volume. The return object includes information for all schedules. If scheduleID is used to identify a specific schedule then only information for that scheduleID is returned. Schedules information is returned with the API method, see ListSchedules on the SolidFire API guide.
 **/

public class Schedule implements Serializable {

    public static final long serialVersionUID = 7148660063768788601L;
    @SerializedName("frequency") private Frequency frequency;
    @SerializedName("hasError") private Optional<Boolean> hasError;
    @SerializedName("lastRunStatus") private Optional<String> lastRunStatus;
    @SerializedName("lastRunTimeStarted") private Optional<String> lastRunTimeStarted;
    @SerializedName("name") private String name;
    @SerializedName("paused") private Optional<Boolean> paused;
    @SerializedName("recurring") private Optional<Boolean> recurring;
    @SerializedName("runNextInterval") private Optional<Boolean> runNextInterval;
    @SerializedName("scheduleID") private Optional<Long> scheduleID;
    @SerializedName("scheduleInfo") private ScheduleInfo scheduleInfo;
    @SerializedName("startingDate") private Optional<String> startingDate;
    @SerializedName("toBeDeleted") private Optional<Boolean> toBeDeleted;
    // empty constructor
    @Since("7.0")
    public Schedule() {}

    
    // parameterized constructor
    @Since("7.0")
    public Schedule(
        Frequency frequency,
        Optional<Boolean> hasError,
        Optional<String> lastRunStatus,
        Optional<String> lastRunTimeStarted,
        String name,
        Optional<Boolean> paused,
        Optional<Boolean> recurring,
        Optional<Boolean> runNextInterval,
        Optional<Long> scheduleID,
        ScheduleInfo scheduleInfo,
        Optional<String> startingDate,
        Optional<Boolean> toBeDeleted
    )
    {
        this.frequency = frequency;
        this.hasError = (hasError == null) ? Optional.<Boolean>empty() : hasError;
        this.lastRunStatus = (lastRunStatus == null) ? Optional.<String>empty() : lastRunStatus;
        this.lastRunTimeStarted = (lastRunTimeStarted == null) ? Optional.<String>empty() : lastRunTimeStarted;
        this.name = name;
        this.paused = (paused == null) ? Optional.<Boolean>empty() : paused;
        this.recurring = (recurring == null) ? Optional.<Boolean>empty() : recurring;
        this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : runNextInterval;
        this.scheduleID = (scheduleID == null) ? Optional.<Long>empty() : scheduleID;
        this.scheduleInfo = scheduleInfo;
        this.startingDate = (startingDate == null) ? Optional.<String>empty() : startingDate;
        this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : toBeDeleted;
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
     * Indicates the status of the last scheduled snapshot.
     * Valid values are:
     * Success
     * Failed
     **/
    public Optional<String> getLastRunStatus() { return this.lastRunStatus; }
   
    public void setLastRunStatus(Optional<String> lastRunStatus) { 
        this.lastRunStatus = (lastRunStatus == null) ? Optional.<String>empty() : lastRunStatus;
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
     * Unique name assigned to the schedule.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * Indicates whether or not the schedule is paused.
     **/
    public Optional<Boolean> getPaused() { return this.paused; }
   
    public void setPaused(Optional<Boolean> paused) { 
        this.paused = (paused == null) ? Optional.<Boolean>empty() : paused;
    }
    /** 
     * Indicates whether or not the schedule is recurring.
     **/
    public Optional<Boolean> getRecurring() { return this.recurring; }
   
    public void setRecurring(Optional<Boolean> recurring) { 
        this.recurring = (recurring == null) ? Optional.<Boolean>empty() : recurring;
    }
    /** 
     * Indicates whether or not the schedule will run the next time the scheduler is active. When set to "true", the schedule will run the next time the scheduler is active and then reset back to "false".
     **/
    public Optional<Boolean> getRunNextInterval() { return this.runNextInterval; }
   
    public void setRunNextInterval(Optional<Boolean> runNextInterval) { 
        this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : runNextInterval;
    }
    /** 
     * Unique ID of the schedule
     **/
    public Optional<Long> getScheduleID() { return this.scheduleID; }
   
    public void setScheduleID(Optional<Long> scheduleID) { 
        this.scheduleID = (scheduleID == null) ? Optional.<Long>empty() : scheduleID;
    }
    /** 
     * Includes the unique name given to the schedule, the retention period for the snapshot that was created, and the volume ID of the volume from which the snapshot was created.
     **/
    public ScheduleInfo getScheduleInfo() { return this.scheduleInfo; }
   
    public void setScheduleInfo(ScheduleInfo scheduleInfo) { 
        this.scheduleInfo = scheduleInfo;
    }
    /** 
     * Indicates the date the first time the schedule began of will begin. Formatted in UTC time.
     **/
    public Optional<String> getStartingDate() { return this.startingDate; }
   
    public void setStartingDate(Optional<String> startingDate) { 
        this.startingDate = (startingDate == null) ? Optional.<String>empty() : startingDate;
    }
    /** 
     * Indicates if the schedule is marked for deletion.
     **/
    public Optional<Boolean> getToBeDeleted() { return this.toBeDeleted; }
   
    public void setToBeDeleted(Optional<Boolean> toBeDeleted) { 
        this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : toBeDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule that = (Schedule) o;

        return 
            Objects.equals(frequency, that.frequency) && 
            Objects.equals(hasError, that.hasError) && 
            Objects.equals(lastRunStatus, that.lastRunStatus) && 
            Objects.equals(lastRunTimeStarted, that.lastRunTimeStarted) && 
            Objects.equals(name, that.name) && 
            Objects.equals(paused, that.paused) && 
            Objects.equals(recurring, that.recurring) && 
            Objects.equals(runNextInterval, that.runNextInterval) && 
            Objects.equals(scheduleID, that.scheduleID) && 
            Objects.equals(scheduleInfo, that.scheduleInfo) && 
            Objects.equals(startingDate, that.startingDate) && 
            Objects.equals(toBeDeleted, that.toBeDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash( frequency,hasError,lastRunStatus,lastRunTimeStarted,name,paused,recurring,runNextInterval,scheduleID,scheduleInfo,startingDate,toBeDeleted );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("frequency", frequency);
        map.put("hasError", hasError);
        map.put("lastRunStatus", lastRunStatus);
        map.put("lastRunTimeStarted", lastRunTimeStarted);
        map.put("name", name);
        map.put("paused", paused);
        map.put("recurring", recurring);
        map.put("runNextInterval", runNextInterval);
        map.put("scheduleID", scheduleID);
        map.put("scheduleInfo", scheduleInfo);
        map.put("startingDate", startingDate);
        map.put("toBeDeleted", toBeDeleted);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" frequency : ").append(gson.toJson(frequency)).append(",");
        if(null != hasError && hasError.isPresent()){
            sb.append(" hasError : ").append(gson.toJson(hasError)).append(",");
        }
        else{
            sb.append(" hasError : ").append("null").append(",");
        }
        if(null != lastRunStatus && lastRunStatus.isPresent()){
            sb.append(" lastRunStatus : ").append(gson.toJson(lastRunStatus)).append(",");
        }
        else{
            sb.append(" lastRunStatus : ").append("null").append(",");
        }
        if(null != lastRunTimeStarted && lastRunTimeStarted.isPresent()){
            sb.append(" lastRunTimeStarted : ").append(gson.toJson(lastRunTimeStarted)).append(",");
        }
        else{
            sb.append(" lastRunTimeStarted : ").append("null").append(",");
        }
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        if(null != paused && paused.isPresent()){
            sb.append(" paused : ").append(gson.toJson(paused)).append(",");
        }
        else{
            sb.append(" paused : ").append("null").append(",");
        }
        if(null != recurring && recurring.isPresent()){
            sb.append(" recurring : ").append(gson.toJson(recurring)).append(",");
        }
        else{
            sb.append(" recurring : ").append("null").append(",");
        }
        if(null != runNextInterval && runNextInterval.isPresent()){
            sb.append(" runNextInterval : ").append(gson.toJson(runNextInterval)).append(",");
        }
        else{
            sb.append(" runNextInterval : ").append("null").append(",");
        }
        if(null != scheduleID && scheduleID.isPresent()){
            sb.append(" scheduleID : ").append(gson.toJson(scheduleID)).append(",");
        }
        else{
            sb.append(" scheduleID : ").append("null").append(",");
        }
        sb.append(" scheduleInfo : ").append(gson.toJson(scheduleInfo)).append(",");
        if(null != startingDate && startingDate.isPresent()){
            sb.append(" startingDate : ").append(gson.toJson(startingDate)).append(",");
        }
        else{
            sb.append(" startingDate : ").append("null").append(",");
        }
        if(null != toBeDeleted && toBeDeleted.isPresent()){
            sb.append(" toBeDeleted : ").append(gson.toJson(toBeDeleted)).append(",");
        }
        else{
            sb.append(" toBeDeleted : ").append("null").append(",");
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
        private Frequency frequency;
        private Optional<Boolean> hasError;
        private Optional<String> lastRunStatus;
        private Optional<String> lastRunTimeStarted;
        private String name;
        private Optional<Boolean> paused;
        private Optional<Boolean> recurring;
        private Optional<Boolean> runNextInterval;
        private Optional<Long> scheduleID;
        private ScheduleInfo scheduleInfo;
        private Optional<String> startingDate;
        private Optional<Boolean> toBeDeleted;

        private Builder() { }

        public Schedule build() {
            return new Schedule (
                         this.frequency,
                         this.hasError,
                         this.lastRunStatus,
                         this.lastRunTimeStarted,
                         this.name,
                         this.paused,
                         this.recurring,
                         this.runNextInterval,
                         this.scheduleID,
                         this.scheduleInfo,
                         this.startingDate,
                         this.toBeDeleted);
        }

        private Schedule.Builder buildFrom(final Schedule req) {
            this.frequency = req.frequency;
            this.hasError = req.hasError;
            this.lastRunStatus = req.lastRunStatus;
            this.lastRunTimeStarted = req.lastRunTimeStarted;
            this.name = req.name;
            this.paused = req.paused;
            this.recurring = req.recurring;
            this.runNextInterval = req.runNextInterval;
            this.scheduleID = req.scheduleID;
            this.scheduleInfo = req.scheduleInfo;
            this.startingDate = req.startingDate;
            this.toBeDeleted = req.toBeDeleted;

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

        public Schedule.Builder optionalLastRunStatus(final String lastRunStatus) {
            this.lastRunStatus = (lastRunStatus == null) ? Optional.<String>empty() : Optional.of(lastRunStatus);
            return this;
        }

        public Schedule.Builder optionalLastRunTimeStarted(final String lastRunTimeStarted) {
            this.lastRunTimeStarted = (lastRunTimeStarted == null) ? Optional.<String>empty() : Optional.of(lastRunTimeStarted);
            return this;
        }

        public Schedule.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Schedule.Builder optionalPaused(final Boolean paused) {
            this.paused = (paused == null) ? Optional.<Boolean>empty() : Optional.of(paused);
            return this;
        }

        public Schedule.Builder optionalRecurring(final Boolean recurring) {
            this.recurring = (recurring == null) ? Optional.<Boolean>empty() : Optional.of(recurring);
            return this;
        }

        public Schedule.Builder optionalRunNextInterval(final Boolean runNextInterval) {
            this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : Optional.of(runNextInterval);
            return this;
        }

        public Schedule.Builder optionalScheduleID(final Long scheduleID) {
            this.scheduleID = (scheduleID == null) ? Optional.<Long>empty() : Optional.of(scheduleID);
            return this;
        }

        public Schedule.Builder scheduleInfo(final ScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }

        public Schedule.Builder optionalStartingDate(final String startingDate) {
            this.startingDate = (startingDate == null) ? Optional.<String>empty() : Optional.of(startingDate);
            return this;
        }

        public Schedule.Builder optionalToBeDeleted(final Boolean toBeDeleted) {
            this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : Optional.of(toBeDeleted);
            return this;
        }

    }
}
