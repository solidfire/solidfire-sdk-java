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
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ListDriveStatsResult  
 **/

public class ListDriveStatsResult implements Serializable {

    public static final long serialVersionUID = 6820387811661575860L;
    @SerializedName("driveStats") private DriveStats[] driveStats;
    @SerializedName("errors") private java.util.Map<String, Object>[] errors;

    // empty constructor
    @Since("7.0")
    public ListDriveStatsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListDriveStatsResult(
        DriveStats[] driveStats,
        java.util.Map<String, Object>[] errors
    )
    {
        this.driveStats = driveStats;
        this.errors = errors;
    }

    /** 
     * List of drive activity information for each drive.
     **/
    public DriveStats[] getDriveStats() { return this.driveStats; }
    public void setDriveStats(DriveStats[] driveStats) { 
        this.driveStats = driveStats;
    }
    /** 
     * If there are errors retrieving information about a drive, this list contains the driveID and associated error message. Always present, and empty if there are no errors.
     **/
    public java.util.Map<String, Object>[] getErrors() { return this.errors; }
    public void setErrors(java.util.Map<String, Object>[] errors) { 
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListDriveStatsResult that = (ListDriveStatsResult) o;

        return 
            Arrays.equals(driveStats, that.driveStats) && 
            Arrays.equals(errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])driveStats,(Object[])errors );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("driveStats", driveStats);
        map.put("errors", errors);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" driveStats : ").append(Arrays.toString(driveStats)).append(",");
        sb.append(" errors : ").append(Arrays.toString(errors)).append(",");
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
        private DriveStats[] driveStats;
        private java.util.Map<String, Object>[] errors;

        private Builder() { }

        public ListDriveStatsResult build() {
            return new ListDriveStatsResult (
                         this.driveStats,
                         this.errors);
        }

        private ListDriveStatsResult.Builder buildFrom(final ListDriveStatsResult req) {
            this.driveStats = req.driveStats;
            this.errors = req.errors;

            return this;
        }

        public ListDriveStatsResult.Builder driveStats(final DriveStats[] driveStats) {
            this.driveStats = driveStats;
            return this;
        }

        public ListDriveStatsResult.Builder errors(final java.util.Map<String, Object>[] errors) {
            this.errors = errors;
            return this;
        }

    }
}
