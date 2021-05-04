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
 * DayOfWeek  
 * DayOfWeek is an object that contains information about the day of the week for a Schedule
 **/

public class DayOfWeek implements Serializable {

    public static final long serialVersionUID = -3176653568217671256L;
    @SerializedName("day") private Long day;
    @SerializedName("offset") private Long offset;
    // empty constructor
    @Since("7.0")
    public DayOfWeek() {}

    
    // parameterized constructor
    @Since("7.0")
    public DayOfWeek(
        Long day,
        Long offset
    )
    {
        this.day = day;
        this.offset = offset;
    }

    /** 
     * A number that represenents a day of the week.  Must be 0-6 (Sunday-Saturday)
     **/
    public Long getDay() { return this.day; }
   
    public void setDay(Long day) { 
        this.day = day;
    }
    /** 
     * The offset into the month, in weeks.  For example, if the schedule should apply every week, offset=1. Every second week of the month, would be offset=2
     **/
    public Long getOffset() { return this.offset; }
   
    public void setOffset(Long offset) { 
        this.offset = offset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DayOfWeek that = (DayOfWeek) o;

        return 
            Objects.equals(day, that.day) && 
            Objects.equals(offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash( day,offset );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("day", day);
        map.put("offset", offset);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" day : ").append(gson.toJson(day)).append(",");
        sb.append(" offset : ").append(gson.toJson(offset)).append(",");
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
        private Long day;
        private Long offset;

        private Builder() { }

        public DayOfWeek build() {
            return new DayOfWeek (
                         this.day,
                         this.offset);
        }

        private DayOfWeek.Builder buildFrom(final DayOfWeek req) {
            this.day = req.day;
            this.offset = req.offset;

            return this;
        }

        public DayOfWeek.Builder day(final Long day) {
            this.day = day;
            return this;
        }

        public DayOfWeek.Builder offset(final Long offset) {
            this.offset = offset;
            return this;
        }

    }
}
