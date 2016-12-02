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
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class GetScheduleRequest implements Serializable {

    public static final long serialVersionUID = 8629386455849003456L;
    @SerializedName("scheduleID") private Long scheduleID;

    // empty constructor
    @Since("7.0")
    public GetScheduleRequest() {}

    // parameterized constructor
    @Since("7.0")
    public GetScheduleRequest(
        Long scheduleID
    )
    {
        this.scheduleID = scheduleID;
    }

    /** 
     * Unique ID of the schedule or multiple schedules to display
     **/
    public Long getScheduleID() { return this.scheduleID; }
    public void setScheduleID(Long scheduleID) { 
        this.scheduleID = scheduleID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetScheduleRequest that = (GetScheduleRequest) o;

        return 
            Objects.equals(scheduleID, that.scheduleID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( scheduleID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("scheduleID", scheduleID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" scheduleID : ").append(scheduleID).append(",");
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
        private Long scheduleID;

        private Builder() { }

        public GetScheduleRequest build() {
            return new GetScheduleRequest (
                         this.scheduleID);
        }

        private GetScheduleRequest.Builder buildFrom(final GetScheduleRequest req) {
            this.scheduleID = req.scheduleID;

            return this;
        }

        public GetScheduleRequest.Builder scheduleID(final Long scheduleID) {
            this.scheduleID = scheduleID;
            return this;
        }

    }
}
