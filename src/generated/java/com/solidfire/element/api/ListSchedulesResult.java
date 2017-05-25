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
 * ListSchedulesResult  
 **/

public class ListSchedulesResult implements Serializable {

    public static final long serialVersionUID = -3087136691982177742L;
    @SerializedName("schedules") private Schedule[] schedules;
    // empty constructor
    @Since("7.0")
    public ListSchedulesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListSchedulesResult(
        Schedule[] schedules
    )
    {
        this.schedules = schedules;
    }

    /** 
     * The list of schedules currently on the cluster.
     **/
    public Schedule[] getSchedules() { return this.schedules; }
    public void setSchedules(Schedule[] schedules) { 
        this.schedules = schedules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSchedulesResult that = (ListSchedulesResult) o;

        return 
            Arrays.equals(schedules, that.schedules);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])schedules );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("schedules", schedules);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" schedules : ").append(Arrays.toString(schedules)).append(",");
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
        private Schedule[] schedules;

        private Builder() { }

        public ListSchedulesResult build() {
            return new ListSchedulesResult (
                         this.schedules);
        }

        private ListSchedulesResult.Builder buildFrom(final ListSchedulesResult req) {
            this.schedules = req.schedules;

            return this;
        }

        public ListSchedulesResult.Builder schedules(final Schedule[] schedules) {
            this.schedules = schedules;
            return this;
        }

    }
}
