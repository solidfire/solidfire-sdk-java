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
 * ListVirtualVolumeTasksRequest  
 * ListVirtualVolumeTasks returns a list of virtual volume tasks in the system.
 **/

public class ListVirtualVolumeTasksRequest implements Serializable {

    public static final long serialVersionUID = -7489968190759697393L;
    @SerializedName("virtualVolumeTaskIDs") private Optional<java.util.UUID[]> virtualVolumeTaskIDs;
    // empty constructor
    @Since("7.0")
    public ListVirtualVolumeTasksRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVirtualVolumeTasksRequest(
        Optional<java.util.UUID[]> virtualVolumeTaskIDs
    )
    {
        this.virtualVolumeTaskIDs = (virtualVolumeTaskIDs == null) ? Optional.<java.util.UUID[]>empty() : virtualVolumeTaskIDs;
    }

    /** 
     * A list of virtual volume task IDs for which to retrieve information. If you omit this parameter, the method returns information about all virtual volume tasks.
     **/
    public Optional<java.util.UUID[]> getVirtualVolumeTaskIDs() { return this.virtualVolumeTaskIDs; }
   
    public void setVirtualVolumeTaskIDs(Optional<java.util.UUID[]> virtualVolumeTaskIDs) { 
        this.virtualVolumeTaskIDs = (virtualVolumeTaskIDs == null) ? Optional.<java.util.UUID[]>empty() : virtualVolumeTaskIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualVolumeTasksRequest that = (ListVirtualVolumeTasksRequest) o;

        return 
            Objects.equals(virtualVolumeTaskIDs, that.virtualVolumeTaskIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeTaskIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualVolumeTaskIDs", virtualVolumeTaskIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != virtualVolumeTaskIDs && virtualVolumeTaskIDs.isPresent()){
            sb.append(" virtualVolumeTaskIDs : ").append(gson.toJson(virtualVolumeTaskIDs)).append(",");
        }
        else{
            sb.append(" virtualVolumeTaskIDs : ").append("null").append(",");
        }
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
        private Optional<java.util.UUID[]> virtualVolumeTaskIDs;

        private Builder() { }

        public ListVirtualVolumeTasksRequest build() {
            return new ListVirtualVolumeTasksRequest (
                         this.virtualVolumeTaskIDs);
        }

        private ListVirtualVolumeTasksRequest.Builder buildFrom(final ListVirtualVolumeTasksRequest req) {
            this.virtualVolumeTaskIDs = req.virtualVolumeTaskIDs;

            return this;
        }

        public ListVirtualVolumeTasksRequest.Builder optionalVirtualVolumeTaskIDs(final java.util.UUID[] virtualVolumeTaskIDs) {
            this.virtualVolumeTaskIDs = (virtualVolumeTaskIDs == null) ? Optional.<java.util.UUID[]>empty() : Optional.of(virtualVolumeTaskIDs);
            return this;
        }

    }
}
