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

public class DaysOfMonthFrequency implements Frequency, Serializable {

    private static final long serialVersionUID = 1L;

    private final long minutes;
    private final long hours;
    private final long[] monthdays;

    public DaysOfMonthFrequency(final long minutes, final long hours, final long[] monthdays) {
        this.minutes = minutes;
        this.hours = hours;
        this.monthdays = monthdays;
    }

    /**
     * Getter for property 'minutes'.
     *
     * @return Value for property 'minutes'.
     */
    public long getMinutes() {
        return this.minutes;
    }

    /**
     * Getter for property 'hours'.
     *
     * @return Value for property 'hours'.
     */
    public long getHours() {
        return this.hours;
    }

    /**
     * Getter for property 'monthdays'.
     *
     * @return Value for property 'monthdays'.
     */
    public long[] getMonthdays() {
        return this.monthdays;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DaysOfMonthFrequency that = (DaysOfMonthFrequency) o;


        return Objects.equals(minutes, that.minutes)
                && Objects.equals(hours, that.hours)
                && Objects.deepEquals(monthdays, that.monthdays);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(minutes, hours, monthdays);
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
        sb.append(" monthdays : ").append(Arrays.toString(monthdays));
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
        private long minutes;
        private long hours;
        private long[] monthdays;

        /**
         * Do not instantiate Builder.
         */
        private Builder() {
        }

        public DaysOfMonthFrequency build() {
            return new DaysOfMonthFrequency(
                    this.minutes,
                    this.hours,
                    this.monthdays);
        }

        private DaysOfMonthFrequency.Builder buildFrom(final DaysOfMonthFrequency req) {
            this.minutes = req.minutes;
            this.hours = req.hours;
            this.monthdays = req.monthdays;

            return this;
        }

        public DaysOfMonthFrequency.Builder minutes(final long minutes) {
            this.minutes = minutes;
            return this;
        }

        public DaysOfMonthFrequency.Builder hours(final long hours) {
            this.hours = hours;
            return this;
        }

        public DaysOfMonthFrequency.Builder monthdays(final long[] monthdays) {
            this.monthdays = monthdays;
            return this;
        }
    }
}
