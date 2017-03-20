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
 * GetScheduleResult  
 **/

public class GetScheduleResult implements Serializable {

    public static final long serialVersionUID = 1475592162045554801L;
    @SerializedName("schedule") private Schedule schedule;

    // empty constructor
    @Since("7.0")
    public GetScheduleResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetScheduleResult(
        Schedule schedule
    )
    {
        this.schedule = schedule;
    }

    /** 
     * The schedule attributes.
     **/
    public Schedule getSchedule() { return this.schedule; }
    public void setSchedule(Schedule schedule) { 
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetScheduleResult that = (GetScheduleResult) o;

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
        sb.append( "{ " );

        sb.append(" schedule : ").append(schedule).append(",");
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

        public GetScheduleResult build() {
            return new GetScheduleResult (
                         this.schedule);
        }

        private GetScheduleResult.Builder buildFrom(final GetScheduleResult req) {
            this.schedule = req.schedule;

            return this;
        }

        public GetScheduleResult.Builder schedule(final Schedule schedule) {
            this.schedule = schedule;
            return this;
        }

    }
}
