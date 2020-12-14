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
 * ScheduleObject  
 * ScheduleObject is an object containing information about each schedule created to autonomously make a snapshot of a volume. The return object includes information for all schedules. If scheduleID is used to identify a specific schedule then only information for that scheduleID is returned. Schedules information is returned with the API method, see ListSchedules on the SolidFire API guide.
 **/

public class ScheduleObject implements Serializable {

    public static final long serialVersionUID = -5417102458558914590L;
    @SerializedName("scheduleName") private String scheduleName;
    @SerializedName("monthdays") private Optional<Long[]> monthdays;
    @SerializedName("weekdays") private Optional<DayOfWeek[]> weekdays;
    @SerializedName("hours") private Long hours;
    @SerializedName("minutes") private Long minutes;
    @SerializedName("scheduleType") private String scheduleType;
    @SerializedName("attributes") private Attributes attributes;
    @SerializedName("hasError") private Optional<Boolean> hasError;
    @SerializedName("lastRunStatus") private Optional<String> lastRunStatus;
    @SerializedName("lastRunTimeStarted") private Optional<String> lastRunTimeStarted;
    @SerializedName("paused") private Optional<Boolean> paused;
    @SerializedName("recurring") private Optional<Boolean> recurring;
    @SerializedName("runNextInterval") private Optional<Boolean> runNextInterval;
    @SerializedName("scheduleID") private Optional<Long> scheduleID;
    @SerializedName("scheduleInfo") private ScheduleInfoObject scheduleInfo;
    @SerializedName("startingDate") private Optional<String> startingDate;
    @SerializedName("toBeDeleted") private Optional<Boolean> toBeDeleted;
    @SerializedName("snapMirrorLabel") private Optional<String> snapMirrorLabel;
    // empty constructor
    @Since("7.0")
    public ScheduleObject() {}

    
    // parameterized constructor
    @Since("7.0")
    public ScheduleObject(
        String scheduleName,
        Optional<Long[]> monthdays,
        Optional<DayOfWeek[]> weekdays,
        Long hours,
        Long minutes,
        String scheduleType,
        Attributes attributes,
        Optional<Boolean> hasError,
        Optional<String> lastRunStatus,
        Optional<String> lastRunTimeStarted,
        Optional<Boolean> paused,
        Optional<Boolean> recurring,
        Optional<Boolean> runNextInterval,
        Optional<Long> scheduleID,
        ScheduleInfoObject scheduleInfo,
        Optional<String> startingDate,
        Optional<Boolean> toBeDeleted
    )
    {
        this.scheduleName = scheduleName;
        this.monthdays = (monthdays == null) ? Optional.<Long[]>empty() : monthdays;
        this.weekdays = (weekdays == null) ? Optional.<DayOfWeek[]>empty() : weekdays;
        this.hours = hours;
        this.minutes = minutes;
        this.scheduleType = scheduleType;
        this.attributes = attributes;
        this.hasError = (hasError == null) ? Optional.<Boolean>empty() : hasError;
        this.lastRunStatus = (lastRunStatus == null) ? Optional.<String>empty() : lastRunStatus;
        this.lastRunTimeStarted = (lastRunTimeStarted == null) ? Optional.<String>empty() : lastRunTimeStarted;
        this.paused = (paused == null) ? Optional.<Boolean>empty() : paused;
        this.recurring = (recurring == null) ? Optional.<Boolean>empty() : recurring;
        this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : runNextInterval;
        this.scheduleID = (scheduleID == null) ? Optional.<Long>empty() : scheduleID;
        this.scheduleInfo = scheduleInfo;
        this.startingDate = (startingDate == null) ? Optional.<String>empty() : startingDate;
        this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : toBeDeleted;
    }
    // parameterized constructor
    @Since("10.0")
    public ScheduleObject(
        String scheduleName,
        Optional<Long[]> monthdays,
        Optional<DayOfWeek[]> weekdays,
        Long hours,
        Long minutes,
        String scheduleType,
        Attributes attributes,
        Optional<Boolean> hasError,
        Optional<String> lastRunStatus,
        Optional<String> lastRunTimeStarted,
        Optional<Boolean> paused,
        Optional<Boolean> recurring,
        Optional<Boolean> runNextInterval,
        Optional<Long> scheduleID,
        ScheduleInfoObject scheduleInfo,
        Optional<String> startingDate,
        Optional<Boolean> toBeDeleted,
        Optional<String> snapMirrorLabel
    )
    {
        this.scheduleName = scheduleName;
        this.monthdays = (monthdays == null) ? Optional.<Long[]>empty() : monthdays;
        this.weekdays = (weekdays == null) ? Optional.<DayOfWeek[]>empty() : weekdays;
        this.hours = hours;
        this.minutes = minutes;
        this.scheduleType = scheduleType;
        this.attributes = attributes;
        this.hasError = (hasError == null) ? Optional.<Boolean>empty() : hasError;
        this.lastRunStatus = (lastRunStatus == null) ? Optional.<String>empty() : lastRunStatus;
        this.lastRunTimeStarted = (lastRunTimeStarted == null) ? Optional.<String>empty() : lastRunTimeStarted;
        this.paused = (paused == null) ? Optional.<Boolean>empty() : paused;
        this.recurring = (recurring == null) ? Optional.<Boolean>empty() : recurring;
        this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : runNextInterval;
        this.scheduleID = (scheduleID == null) ? Optional.<Long>empty() : scheduleID;
        this.scheduleInfo = scheduleInfo;
        this.startingDate = (startingDate == null) ? Optional.<String>empty() : startingDate;
        this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : toBeDeleted;
        this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : snapMirrorLabel;
    }

    /** 
     * 
     **/
    public String getScheduleName() { return this.scheduleName; }
   
    public void setScheduleName(String scheduleName) { 
        this.scheduleName = scheduleName;
    }
    /** 
     * 
     **/
    public Optional<Long[]> getMonthdays() { return this.monthdays; }
   
    public void setMonthdays(Optional<Long[]> monthdays) { 
        this.monthdays = (monthdays == null) ? Optional.<Long[]>empty() : monthdays;
    }
    /** 
     * 
     **/
    public Optional<DayOfWeek[]> getWeekdays() { return this.weekdays; }
   
    public void setWeekdays(Optional<DayOfWeek[]> weekdays) { 
        this.weekdays = (weekdays == null) ? Optional.<DayOfWeek[]>empty() : weekdays;
    }
    /** 
     * 
     **/
    public Long getHours() { return this.hours; }
   
    public void setHours(Long hours) { 
        this.hours = hours;
    }
    /** 
     * 
     **/
    public Long getMinutes() { return this.minutes; }
   
    public void setMinutes(Long minutes) { 
        this.minutes = minutes;
    }
    /** 
     * 
     **/
    public String getScheduleType() { return this.scheduleType; }
   
    public void setScheduleType(String scheduleType) { 
        this.scheduleType = scheduleType;
    }
    /** 
     * 
     **/
    public Attributes getAttributes() { return this.attributes; }
   
    public void setAttributes(Attributes attributes) { 
        this.attributes = attributes;
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
    public ScheduleInfoObject getScheduleInfo() { return this.scheduleInfo; }
   
    public void setScheduleInfo(ScheduleInfoObject scheduleInfo) { 
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
    /** 
     * The snapMirrorLabel to be applied to the created Snapshot or Group Snapshot, contained in the scheduleInfo.
     **/
    public Optional<String> getSnapMirrorLabel() { return this.snapMirrorLabel; }
   
    public void setSnapMirrorLabel(Optional<String> snapMirrorLabel) { 
        this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : snapMirrorLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleObject that = (ScheduleObject) o;

        return 
            Objects.equals(scheduleName, that.scheduleName) && 
            Objects.equals(monthdays, that.monthdays) && 
            Objects.equals(weekdays, that.weekdays) && 
            Objects.equals(hours, that.hours) && 
            Objects.equals(minutes, that.minutes) && 
            Objects.equals(scheduleType, that.scheduleType) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(hasError, that.hasError) && 
            Objects.equals(lastRunStatus, that.lastRunStatus) && 
            Objects.equals(lastRunTimeStarted, that.lastRunTimeStarted) && 
            Objects.equals(paused, that.paused) && 
            Objects.equals(recurring, that.recurring) && 
            Objects.equals(runNextInterval, that.runNextInterval) && 
            Objects.equals(scheduleID, that.scheduleID) && 
            Objects.equals(scheduleInfo, that.scheduleInfo) && 
            Objects.equals(startingDate, that.startingDate) && 
            Objects.equals(toBeDeleted, that.toBeDeleted) && 
            Objects.equals(snapMirrorLabel, that.snapMirrorLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash( scheduleName,monthdays,weekdays,hours,minutes,scheduleType,attributes,hasError,lastRunStatus,lastRunTimeStarted,paused,recurring,runNextInterval,scheduleID,scheduleInfo,startingDate,toBeDeleted,snapMirrorLabel );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("scheduleName", scheduleName);
        map.put("monthdays", monthdays);
        map.put("weekdays", weekdays);
        map.put("hours", hours);
        map.put("minutes", minutes);
        map.put("scheduleType", scheduleType);
        map.put("attributes", attributes);
        map.put("hasError", hasError);
        map.put("lastRunStatus", lastRunStatus);
        map.put("lastRunTimeStarted", lastRunTimeStarted);
        map.put("paused", paused);
        map.put("recurring", recurring);
        map.put("runNextInterval", runNextInterval);
        map.put("scheduleID", scheduleID);
        map.put("scheduleInfo", scheduleInfo);
        map.put("startingDate", startingDate);
        map.put("toBeDeleted", toBeDeleted);
        map.put("snapMirrorLabel", snapMirrorLabel);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" scheduleName : ").append(gson.toJson(scheduleName)).append(",");
        if(null != monthdays && monthdays.isPresent()){
            sb.append(" monthdays : ").append(gson.toJson(monthdays)).append(",");
        }
        else{
            sb.append(" monthdays : ").append("null").append(",");
        }
        if(null != weekdays && weekdays.isPresent()){
            sb.append(" weekdays : ").append(gson.toJson(weekdays)).append(",");
        }
        else{
            sb.append(" weekdays : ").append("null").append(",");
        }
        sb.append(" hours : ").append(gson.toJson(hours)).append(",");
        sb.append(" minutes : ").append(gson.toJson(minutes)).append(",");
        sb.append(" scheduleType : ").append(gson.toJson(scheduleType)).append(",");
        sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
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
        if(null != snapMirrorLabel && snapMirrorLabel.isPresent()){
            sb.append(" snapMirrorLabel : ").append(gson.toJson(snapMirrorLabel)).append(",");
        }
        else{
            sb.append(" snapMirrorLabel : ").append("null").append(",");
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
        private String scheduleName;
        private Optional<Long[]> monthdays;
        private Optional<DayOfWeek[]> weekdays;
        private Long hours;
        private Long minutes;
        private String scheduleType;
        private Attributes attributes;
        private Optional<Boolean> hasError;
        private Optional<String> lastRunStatus;
        private Optional<String> lastRunTimeStarted;
        private Optional<Boolean> paused;
        private Optional<Boolean> recurring;
        private Optional<Boolean> runNextInterval;
        private Optional<Long> scheduleID;
        private ScheduleInfoObject scheduleInfo;
        private Optional<String> startingDate;
        private Optional<Boolean> toBeDeleted;
        private Optional<String> snapMirrorLabel;

        private Builder() { }

        public ScheduleObject build() {
            return new ScheduleObject (
                         this.scheduleName,
                         this.monthdays,
                         this.weekdays,
                         this.hours,
                         this.minutes,
                         this.scheduleType,
                         this.attributes,
                         this.hasError,
                         this.lastRunStatus,
                         this.lastRunTimeStarted,
                         this.paused,
                         this.recurring,
                         this.runNextInterval,
                         this.scheduleID,
                         this.scheduleInfo,
                         this.startingDate,
                         this.toBeDeleted,
                         this.snapMirrorLabel);
        }

        private ScheduleObject.Builder buildFrom(final ScheduleObject req) {
            this.scheduleName = req.scheduleName;
            this.monthdays = req.monthdays;
            this.weekdays = req.weekdays;
            this.hours = req.hours;
            this.minutes = req.minutes;
            this.scheduleType = req.scheduleType;
            this.attributes = req.attributes;
            this.hasError = req.hasError;
            this.lastRunStatus = req.lastRunStatus;
            this.lastRunTimeStarted = req.lastRunTimeStarted;
            this.paused = req.paused;
            this.recurring = req.recurring;
            this.runNextInterval = req.runNextInterval;
            this.scheduleID = req.scheduleID;
            this.scheduleInfo = req.scheduleInfo;
            this.startingDate = req.startingDate;
            this.toBeDeleted = req.toBeDeleted;
            this.snapMirrorLabel = req.snapMirrorLabel;

            return this;
        }

        public ScheduleObject.Builder scheduleName(final String scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }

        public ScheduleObject.Builder optionalMonthdays(final Long[] monthdays) {
            this.monthdays = (monthdays == null) ? Optional.<Long[]>empty() : Optional.of(monthdays);
            return this;
        }

        public ScheduleObject.Builder optionalWeekdays(final DayOfWeek[] weekdays) {
            this.weekdays = (weekdays == null) ? Optional.<DayOfWeek[]>empty() : Optional.of(weekdays);
            return this;
        }

        public ScheduleObject.Builder hours(final Long hours) {
            this.hours = hours;
            return this;
        }

        public ScheduleObject.Builder minutes(final Long minutes) {
            this.minutes = minutes;
            return this;
        }

        public ScheduleObject.Builder scheduleType(final String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }

        public ScheduleObject.Builder attributes(final Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public ScheduleObject.Builder optionalHasError(final Boolean hasError) {
            this.hasError = (hasError == null) ? Optional.<Boolean>empty() : Optional.of(hasError);
            return this;
        }

        public ScheduleObject.Builder optionalLastRunStatus(final String lastRunStatus) {
            this.lastRunStatus = (lastRunStatus == null) ? Optional.<String>empty() : Optional.of(lastRunStatus);
            return this;
        }

        public ScheduleObject.Builder optionalLastRunTimeStarted(final String lastRunTimeStarted) {
            this.lastRunTimeStarted = (lastRunTimeStarted == null) ? Optional.<String>empty() : Optional.of(lastRunTimeStarted);
            return this;
        }

        public ScheduleObject.Builder optionalPaused(final Boolean paused) {
            this.paused = (paused == null) ? Optional.<Boolean>empty() : Optional.of(paused);
            return this;
        }

        public ScheduleObject.Builder optionalRecurring(final Boolean recurring) {
            this.recurring = (recurring == null) ? Optional.<Boolean>empty() : Optional.of(recurring);
            return this;
        }

        public ScheduleObject.Builder optionalRunNextInterval(final Boolean runNextInterval) {
            this.runNextInterval = (runNextInterval == null) ? Optional.<Boolean>empty() : Optional.of(runNextInterval);
            return this;
        }

        public ScheduleObject.Builder optionalScheduleID(final Long scheduleID) {
            this.scheduleID = (scheduleID == null) ? Optional.<Long>empty() : Optional.of(scheduleID);
            return this;
        }

        public ScheduleObject.Builder scheduleInfo(final ScheduleInfoObject scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }

        public ScheduleObject.Builder optionalStartingDate(final String startingDate) {
            this.startingDate = (startingDate == null) ? Optional.<String>empty() : Optional.of(startingDate);
            return this;
        }

        public ScheduleObject.Builder optionalToBeDeleted(final Boolean toBeDeleted) {
            this.toBeDeleted = (toBeDeleted == null) ? Optional.<Boolean>empty() : Optional.of(toBeDeleted);
            return this;
        }

        public ScheduleObject.Builder optionalSnapMirrorLabel(final String snapMirrorLabel) {
            this.snapMirrorLabel = (snapMirrorLabel == null) ? Optional.<String>empty() : Optional.of(snapMirrorLabel);
            return this;
        }

    }
}
