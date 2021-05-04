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
 * SnapMirrorJobScheduleCronInfo  
 * The snapMirrorJobScheduleCronInfo object contains information about a cron job schedule on the ONTAP system.
 **/

public class SnapMirrorJobScheduleCronInfo implements Serializable {

    public static final long serialVersionUID = -7750321656153607960L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("jobScheduleName") private String jobScheduleName;
    @SerializedName("jobScheduleDescription") private String jobScheduleDescription;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorJobScheduleCronInfo(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorJobScheduleCronInfo(
        Long snapMirrorEndpointID,
        String jobScheduleName,
        String jobScheduleDescription
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.jobScheduleName = jobScheduleName;
        this.jobScheduleDescription = jobScheduleDescription;
    }

    /** 
     * The ID of the destination ONTAP system.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The name of the job schedule.
     **/
    public String getJobScheduleName() { return this.jobScheduleName; }
   
    public void setJobScheduleName(String jobScheduleName) { 
        this.jobScheduleName = jobScheduleName;
    }
    /** 
     * An automatically-generated human-readable summary of the schedule.
     **/
    public String getJobScheduleDescription() { return this.jobScheduleDescription; }
   
    public void setJobScheduleDescription(String jobScheduleDescription) { 
        this.jobScheduleDescription = jobScheduleDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorJobScheduleCronInfo that = (SnapMirrorJobScheduleCronInfo) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(jobScheduleName, that.jobScheduleName) && 
            Objects.equals(jobScheduleDescription, that.jobScheduleDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,jobScheduleName,jobScheduleDescription );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("jobScheduleName", jobScheduleName);
        map.put("jobScheduleDescription", jobScheduleDescription);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" jobScheduleName : ").append(gson.toJson(jobScheduleName)).append(",");
        sb.append(" jobScheduleDescription : ").append(gson.toJson(jobScheduleDescription)).append(",");
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
        private Long snapMirrorEndpointID;
        private String jobScheduleName;
        private String jobScheduleDescription;

        private Builder() { }

        public SnapMirrorJobScheduleCronInfo build() {
            return new SnapMirrorJobScheduleCronInfo (
                         this.snapMirrorEndpointID,
                         this.jobScheduleName,
                         this.jobScheduleDescription);
        }

        private SnapMirrorJobScheduleCronInfo.Builder buildFrom(final SnapMirrorJobScheduleCronInfo req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.jobScheduleName = req.jobScheduleName;
            this.jobScheduleDescription = req.jobScheduleDescription;

            return this;
        }

        public SnapMirrorJobScheduleCronInfo.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public SnapMirrorJobScheduleCronInfo.Builder jobScheduleName(final String jobScheduleName) {
            this.jobScheduleName = jobScheduleName;
            return this;
        }

        public SnapMirrorJobScheduleCronInfo.Builder jobScheduleDescription(final String jobScheduleDescription) {
            this.jobScheduleDescription = jobScheduleDescription;
            return this;
        }

    }
}
