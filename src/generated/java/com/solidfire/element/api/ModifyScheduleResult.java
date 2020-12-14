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
 * ModifyScheduleResult  
 **/

public class ModifyScheduleResult implements Serializable {

    public static final long serialVersionUID = -6133099805641503022L;
    @SerializedName("schedule") private Optional<Schedule> schedule;
    // empty constructor
    @Since("7.0")
    public ModifyScheduleResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyScheduleResult(
        Optional<Schedule> schedule
    )
    {
        this.schedule = (schedule == null) ? Optional.<Schedule>empty() : schedule;
    }

    /** 
     * 
     **/
    public Optional<Schedule> getSchedule() { return this.schedule; }
   
    public void setSchedule(Optional<Schedule> schedule) { 
        this.schedule = (schedule == null) ? Optional.<Schedule>empty() : schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyScheduleResult that = (ModifyScheduleResult) o;

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

        if(null != schedule && schedule.isPresent()){
            sb.append(" schedule : ").append(gson.toJson(schedule)).append(",");
        }
        else{
            sb.append(" schedule : ").append("null").append(",");
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
        private Optional<Schedule> schedule;

        private Builder() { }

        public ModifyScheduleResult build() {
            return new ModifyScheduleResult (
                         this.schedule);
        }

        private ModifyScheduleResult.Builder buildFrom(final ModifyScheduleResult req) {
            this.schedule = req.schedule;

            return this;
        }

        public ModifyScheduleResult.Builder optionalSchedule(final Schedule schedule) {
            this.schedule = (schedule == null) ? Optional.<Schedule>empty() : Optional.of(schedule);
            return this;
        }

    }
}
