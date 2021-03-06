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
 * CreateScheduleRequest  
 * CreateSchedule enables you to schedule an automatic snapshot of a volume at a defined interval.
 * You can use the created snapshot later as a backup or rollback to ensure the data on a volume or group of volumes is consistent for
 * the point in time in which the snapshot was created.
 * If you schedule a snapshot to run at a time period that is not divisible by 5 minutes, the snapshot runs at the next time period
 * that is divisible by 5 minutes. For example, if you schedule a snapshot to run at 12:42:00 UTC, it runs at 12:45:00 UTC.
 * Note: You can create snapshots if cluster fullness is at stage 1, 2 or 3. You cannot create snapshots after cluster fullness reaches stage 4 or 5.
 **/

public class CreateScheduleRequest implements Serializable {

    public static final long serialVersionUID = 1801898553998718803L;
    @SerializedName("schedule") private Schedule schedule;
    // empty constructor
    @Since("7.0")
    public CreateScheduleRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateScheduleRequest(
        Schedule schedule
    )
    {
        this.schedule = schedule;
    }

    /** 
     * The "Schedule" object will be used to create a new schedule.
     * Do not set ScheduleID property, it will be ignored.
     * Frequency property must be of type that inherits from Frequency. Valid types are:
     * DaysOfMonthFrequency
     * DaysOrWeekFrequency
     * TimeIntervalFrequency
     **/
    public Schedule getSchedule() { return this.schedule; }
   
    public void setSchedule(Schedule schedule) { 
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateScheduleRequest that = (CreateScheduleRequest) o;

        return 
            Objects.equals(schedule, that.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash( schedule );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("schedule", schedule);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" schedule : ").append(gson.toJson(schedule)).append(",");
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
        private Schedule schedule;

        private Builder() { }

        public CreateScheduleRequest build() {
            return new CreateScheduleRequest (
                         this.schedule);
        }

        private CreateScheduleRequest.Builder buildFrom(final CreateScheduleRequest req) {
            this.schedule = req.schedule;

            return this;
        }

        public CreateScheduleRequest.Builder schedule(final Schedule schedule) {
            this.schedule = schedule;
            return this;
        }

    }
}
