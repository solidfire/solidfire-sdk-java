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
import com.solidfire.core.annotation.Since;

import java.io.Serializable;
import java.util.Objects;


/**
 * Day of the week the snapshot is to be created.
 **/
public class ApiWeekday implements Serializable {

    private static final long serialVersionUID = -2101250842L;

    @SerializedName("day")
    private final Long day;
    @SerializedName("offset")
    private final Long offset;

    /**
     * @param day    [required]  0 - 6 (Sunday - Saturday)
     * @param offset [required]  1 (always)
     * @since 7.0
     **/
    @Since("7.0")
    public ApiWeekday(Long day, Long offset) {
        this.day = day;
        this.offset = offset;
    }

    /**
     * The representation of the day of the week
     * @return 0 - 6 (Sunday - Saturday)
     */
    public Long getDay() {
        return this.day;
    }

    /**
     * The representation of the offset
     * @return 1 (always)
     */
    public Long getOffset() {
        return this.offset;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiWeekday that = (ApiWeekday) o;


        return Objects.equals(day, that.day)
                && Objects.equals(offset, that.offset);
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return Objects.hash(day, offset);
    }


    /** {@inheritDoc} */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        sb.append(" day : ").append(day).append(",");
        sb.append(" offset : ").append(offset);
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
        private Long day;
        private Long offset;

        /** Do not instantiate Builder. */
        private Builder() {
        }

        public ApiWeekday build() {
            return new ApiWeekday(
                    this.day,
                    this.offset);
        }

        private ApiWeekday.Builder buildFrom(final ApiWeekday req) {
            this.day = req.day;
            this.offset = req.offset;

            return this;
        }

        public ApiWeekday.Builder day(final Long day) {
            this.day = day;
            return this;
        }

        public ApiWeekday.Builder offset(final Long offset) {
            this.offset = offset;
            return this;
        }

    }

}
