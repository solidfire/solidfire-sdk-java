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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;


/**
 * The object returned by the "ListSchedules" API Service call.
 **/
public class ApiListSchedulesResult implements Serializable {

    private static final long serialVersionUID = 1370282927L;

    @SerializedName("schedules")
    private final ApiSchedule[] schedules;

    /**
     * The object returned by the "ListSchedules" API Service call.
     *
     * @param schedules [required] The list of schedules currently on the cluster.
     * @since 7.0
     **/
    @Since("7.0")
    public ApiListSchedulesResult(ApiSchedule[] schedules) {
        this.schedules = schedules;
    }


    /**
     * The list of schedules currently on the cluster.
     **/
    public ApiSchedule[] getSchedules() {
        return this.schedules;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiListSchedulesResult that = (ApiListSchedulesResult) o;


        return Objects.deepEquals(schedules, that.schedules);
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash((Object) schedules);
    }


    /** {@inheritDoc} */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        sb.append(" schedules : ").append(Arrays.toString(schedules));
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
        private ApiSchedule[] schedules;

        /** Do not instantiate Builder. */
        private Builder() {
        }

        public ApiListSchedulesResult build() {
            return new ApiListSchedulesResult(
                    this.schedules);
        }

        private ApiListSchedulesResult.Builder buildFrom(final ApiListSchedulesResult req) {
            this.schedules = req.schedules;

            return this;
        }

        public ApiListSchedulesResult.Builder schedules(final ApiSchedule[] schedules) {
            this.schedules = schedules;
            return this;
        }

    }

}
