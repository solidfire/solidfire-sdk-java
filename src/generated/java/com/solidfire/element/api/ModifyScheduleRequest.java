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
 * The Request object for the "ModifySchedule" API Service call.
 **/
public class ModifyScheduleRequest  implements Serializable  {

    private static final long serialVersionUID = 79798341L;

    @SerializedName("schedule") private final Schedule schedule;

    /**
     * The Request object for the "ModifySchedule" API Service call.
     * @param schedule [required] The "Schedule" object will be used to modify an existing schedule.<br/>
     * @since 8.0
     **/
    @Since("8.0")
    public ModifyScheduleRequest(Schedule schedule) {
        this.schedule = schedule;
    }


    /**
     * The "Schedule" object will be used to modify an existing schedule.<br/>
     * The ScheduleID property is required.<br/>
     * Frequency property must be of type that inherits from Frequency. Valid types are:<br/>
     * DaysOfMonthFrequency<br/>
     * DaysOrWeekFrequency<br/>
     * TimeIntervalFrequency
     **/
    public Schedule getSchedule() {
        return this.schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyScheduleRequest that = (ModifyScheduleRequest) o;
        

        return Objects.equals( schedule , that.schedule );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) schedule );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" schedule : ").append(schedule);
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

        public ModifyScheduleRequest build() {
            return new ModifyScheduleRequest (
                         this.schedule            );
        }

        private ModifyScheduleRequest.Builder buildFrom(final ModifyScheduleRequest req) {
            this.schedule = req.schedule;

            return this;
        }

        public ModifyScheduleRequest.Builder schedule(final Schedule schedule) {
            this.schedule = schedule;
            return this;
        }

    }

}
