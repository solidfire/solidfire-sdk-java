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
 * CloneMultipleVolumesResult  
 **/

public class CloneMultipleVolumesResult implements Serializable {

    public static final long serialVersionUID = 7075378502022330696L;
    @SerializedName("asyncHandle") private Long asyncHandle;
    @SerializedName("groupCloneID") private Long groupCloneID;
    @SerializedName("members") private GroupCloneVolumeMember[] members;
    // empty constructor
    @Since("7.0")
    public CloneMultipleVolumesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public CloneMultipleVolumesResult(
        Long asyncHandle,
        Long groupCloneID,
        GroupCloneVolumeMember[] members
    )
    {
        this.asyncHandle = asyncHandle;
        this.groupCloneID = groupCloneID;
        this.members = members;
    }

    /** 
     * A value returned from an asynchronous method call.
     **/
    public Long getAsyncHandle() { return this.asyncHandle; }
   
    public void setAsyncHandle(Long asyncHandle) { 
        this.asyncHandle = asyncHandle;
    }
    /** 
     * Unique ID of the new group clone.
     **/
    public Long getGroupCloneID() { return this.groupCloneID; }
   
    public void setGroupCloneID(Long groupCloneID) { 
        this.groupCloneID = groupCloneID;
    }
    /** 
     * List of volumeIDs for the source and destination volume pairs.
     **/
    public GroupCloneVolumeMember[] getMembers() { return this.members; }
   
    public void setMembers(GroupCloneVolumeMember[] members) { 
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CloneMultipleVolumesResult that = (CloneMultipleVolumesResult) o;

        return 
            Objects.equals(asyncHandle, that.asyncHandle) && 
            Objects.equals(groupCloneID, that.groupCloneID) && 
            Arrays.equals(members, that.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash( asyncHandle,groupCloneID,(Object[])members );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("asyncHandle", asyncHandle);
        map.put("groupCloneID", groupCloneID);
        map.put("members", members);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" asyncHandle : ").append(gson.toJson(asyncHandle)).append(",");
        sb.append(" groupCloneID : ").append(gson.toJson(groupCloneID)).append(",");
        sb.append(" members : ").append(gson.toJson(Arrays.toString(members))).append(",");
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
        private Long asyncHandle;
        private Long groupCloneID;
        private GroupCloneVolumeMember[] members;

        private Builder() { }

        public CloneMultipleVolumesResult build() {
            return new CloneMultipleVolumesResult (
                         this.asyncHandle,
                         this.groupCloneID,
                         this.members);
        }

        private CloneMultipleVolumesResult.Builder buildFrom(final CloneMultipleVolumesResult req) {
            this.asyncHandle = req.asyncHandle;
            this.groupCloneID = req.groupCloneID;
            this.members = req.members;

            return this;
        }

        public CloneMultipleVolumesResult.Builder asyncHandle(final Long asyncHandle) {
            this.asyncHandle = asyncHandle;
            return this;
        }

        public CloneMultipleVolumesResult.Builder groupCloneID(final Long groupCloneID) {
            this.groupCloneID = groupCloneID;
            return this;
        }

        public CloneMultipleVolumesResult.Builder members(final GroupCloneVolumeMember[] members) {
            this.members = members;
            return this;
        }

    }
}
