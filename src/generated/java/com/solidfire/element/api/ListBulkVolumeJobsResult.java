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
 * 
 **/

public class ListBulkVolumeJobsResult implements Serializable {

    public static final long serialVersionUID = 7680581996036886373L;
    @SerializedName("bulkVolumeJobs") private BulkVolumeJob[] bulkVolumeJobs;

    // empty constructor
    @Since("7.0")
    public ListBulkVolumeJobsResult() {}

    // parameterized constructor
    @Since("7.0")
    public ListBulkVolumeJobsResult(
        BulkVolumeJob[] bulkVolumeJobs
    )
    {
        this.bulkVolumeJobs = bulkVolumeJobs;
    }

    /** 
     * An array of information for each bulk volume job.
     **/
    public BulkVolumeJob[] getBulkVolumeJobs() { return this.bulkVolumeJobs; }
    public void setBulkVolumeJobs(BulkVolumeJob[] bulkVolumeJobs) { 
        this.bulkVolumeJobs = bulkVolumeJobs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListBulkVolumeJobsResult that = (ListBulkVolumeJobsResult) o;
        return 
            Objects.equals(bulkVolumeJobs, that.bulkVolumeJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])bulkVolumeJobs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("bulkVolumeJobs", bulkVolumeJobs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" bulkVolumeJobs : ").append(Arrays.toString(bulkVolumeJobs)).append(",");
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
        private BulkVolumeJob[] bulkVolumeJobs;

        private Builder() { }

        public ListBulkVolumeJobsResult build() {
            return new ListBulkVolumeJobsResult (
                         this.bulkVolumeJobs);
        }

        private ListBulkVolumeJobsResult.Builder buildFrom(final ListBulkVolumeJobsResult req) {
            this.bulkVolumeJobs = req.bulkVolumeJobs;

            return this;
        }

        public ListBulkVolumeJobsResult.Builder bulkVolumeJobs(final BulkVolumeJob[] bulkVolumeJobs) {
            this.bulkVolumeJobs = bulkVolumeJobs;
            return this;
        }

    }
}
