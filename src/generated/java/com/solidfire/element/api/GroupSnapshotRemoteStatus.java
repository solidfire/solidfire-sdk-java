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
 * GroupSnapshotRemoteStatus  
 **/

public class GroupSnapshotRemoteStatus implements Serializable {

    public static final long serialVersionUID = 9043780627454567574L;
    @SerializedName("remoteStatus") private String remoteStatus;
    // empty constructor
    @Since("7.0")
    public GroupSnapshotRemoteStatus() {}

    
    // parameterized constructor
    @Since("7.0")
    public GroupSnapshotRemoteStatus(
        String remoteStatus
    )
    {
        this.remoteStatus = remoteStatus;
    }

    /** 
     * Current status of the remote group snapshot on the target cluster as seen on the source cluster
     **/
    public String getRemoteStatus() { return this.remoteStatus; }
   
    public void setRemoteStatus(String remoteStatus) { 
        this.remoteStatus = remoteStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupSnapshotRemoteStatus that = (GroupSnapshotRemoteStatus) o;

        return 
            Objects.equals(remoteStatus, that.remoteStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash( remoteStatus );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("remoteStatus", remoteStatus);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" remoteStatus : ").append(gson.toJson(remoteStatus)).append(",");
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
        private String remoteStatus;

        private Builder() { }

        public GroupSnapshotRemoteStatus build() {
            return new GroupSnapshotRemoteStatus (
                         this.remoteStatus);
        }

        private GroupSnapshotRemoteStatus.Builder buildFrom(final GroupSnapshotRemoteStatus req) {
            this.remoteStatus = req.remoteStatus;

            return this;
        }

        public GroupSnapshotRemoteStatus.Builder remoteStatus(final String remoteStatus) {
            this.remoteStatus = remoteStatus;
            return this;
        }

    }
}
