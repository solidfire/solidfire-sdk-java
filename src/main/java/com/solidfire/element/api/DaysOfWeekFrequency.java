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
package com.solidfire.element.api;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class DaysOfWeekFrequency implements Frequency, Serializable {

    private static final Long serialVersionUID = 1L;

    private final Long minutes;
    private final Long hours;
    private final Weekday[] weekdays;

    public DaysOfWeekFrequency(final Long minutes, final Long hours, final Weekday[] weekdays) {
        this.minutes = minutes;
        this.hours = hours;
        this.weekdays = weekdays;
    }

    /**
     * Getter for property 'minutes'.
     *
     * @return Value for property 'minutes'.
     */
    public Long getMinutes() {
        return this.minutes;
    }

    /**
     * Getter for property 'hours'.
     *
     * @return Value for property 'hours'.
     */
    public Long getHours() {
        return this.hours;
    }

    /**
     * Getter for property 'weekdays'.
     *
     * @return Value for property 'weekdays'.
     */
    public Weekday[] getWeekdays() {
        return this.weekdays;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DaysOfWeekFrequency that = (DaysOfWeekFrequency) o;


        return Objects.equals(minutes, that.minutes)
                && Objects.equals(hours, that.hours)
                && Objects.deepEquals(weekdays, that.weekdays);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(minutes, hours, weekdays);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append(" minutes : ").append(minutes).append(",");
        sb.append(" hours : ").append(hours).append(",");
        sb.append(" weekdays : ").append(Arrays.toString(weekdays));
        sb.append(" }");

        return sb.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Long minutes;
        private Long hours;
        private Weekday[] weekdays;

        /**
         * Do not instantiate Builder.
         */
        private Builder() {
        }

        public DaysOfWeekFrequency build() {
            return new DaysOfWeekFrequency(
                    this.minutes,
                    this.hours,
                    this.weekdays);
        }

        private DaysOfWeekFrequency.Builder buildFrom(final DaysOfWeekFrequency req) {
            this.minutes = req.minutes;
            this.hours = req.hours;
            this.weekdays = req.weekdays;

            return this;
        }

        public DaysOfWeekFrequency.Builder minutes(final Long minutes) {
            this.minutes = minutes;
            return this;
        }

        public DaysOfWeekFrequency.Builder hours(final Long hours) {
            this.hours = hours;
            return this;
        }

        public DaysOfWeekFrequency.Builder weekdays(final Weekday[] weekdays) {
            this.weekdays = weekdays;
            return this;
        }
    }
}
