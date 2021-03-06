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
 * ListSyncJobsResult  
 **/

public class ListSyncJobsResult implements Serializable {

    public static final long serialVersionUID = 3294374750234544238L;
    @SerializedName("syncJobs") private SyncJob[] syncJobs;
    // empty constructor
    @Since("7.0")
    public ListSyncJobsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListSyncJobsResult(
        SyncJob[] syncJobs
    )
    {
        this.syncJobs = syncJobs;
    }

    /** 
     * 
     **/
    public SyncJob[] getSyncJobs() { return this.syncJobs; }
   
    public void setSyncJobs(SyncJob[] syncJobs) { 
        this.syncJobs = syncJobs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSyncJobsResult that = (ListSyncJobsResult) o;

        return 
            Arrays.equals(syncJobs, that.syncJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])syncJobs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("syncJobs", syncJobs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" syncJobs : ").append(gson.toJson(Arrays.toString(syncJobs))).append(",");
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
        private SyncJob[] syncJobs;

        private Builder() { }

        public ListSyncJobsResult build() {
            return new ListSyncJobsResult (
                         this.syncJobs);
        }

        private ListSyncJobsResult.Builder buildFrom(final ListSyncJobsResult req) {
            this.syncJobs = req.syncJobs;

            return this;
        }

        public ListSyncJobsResult.Builder syncJobs(final SyncJob[] syncJobs) {
            this.syncJobs = syncJobs;
            return this;
        }

    }
}
