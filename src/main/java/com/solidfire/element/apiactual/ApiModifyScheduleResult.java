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
import com.solidfire.jsvcgen.annotation.Since;

import java.io.Serializable;
import java.util.Objects;


/**
 * The object returned by the "ModifySchedule" API Service call.
 **/
public class ApiModifyScheduleResult implements Serializable {

    private static final long serialVersionUID = 46176850L;

    @SerializedName("schedule")
    private final ApiSchedule schedule;

    /**
     * The object returned by the "ModifySchedule" API Service call.
     *
     * @param schedule [required] Schedule attributes with modifications.
     * @since 7.0
     **/
    @Since("7.0")
    public ApiModifyScheduleResult(ApiSchedule schedule) {
        this.schedule = schedule;
    }


    /**
     * Schedule attributes with modifications.
     **/
    public ApiSchedule getSchedule() {
        return this.schedule;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiModifyScheduleResult that = (ApiModifyScheduleResult) o;


        return Objects.equals(schedule, that.schedule);
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash((Object) schedule);
    }


    /** {@inheritDoc} */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        sb.append(" schedule : ").append(schedule);
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
        private ApiSchedule schedule;

        /** Do not instantiate Builder. */
        private Builder() {
        }

        public ApiModifyScheduleResult build() {
            return new ApiModifyScheduleResult(
                    this.schedule);
        }

        private ApiModifyScheduleResult.Builder buildFrom(final ApiModifyScheduleResult req) {
            this.schedule = req.schedule;

            return this;
        }

        public ApiModifyScheduleResult.Builder schedule(final ApiSchedule schedule) {
            this.schedule = schedule;
            return this;
        }

    }

}
