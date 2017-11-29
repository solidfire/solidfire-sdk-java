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
 * ModifyGroupSnapshotResult  
 **/

public class ModifyGroupSnapshotResult implements Serializable {

    public static final long serialVersionUID = -4654919035054599527L;
    @SerializedName("groupSnapshot") private GroupSnapshot groupSnapshot;
    // empty constructor
    @Since("8.0")

    public ModifyGroupSnapshotResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyGroupSnapshotResult(
        GroupSnapshot groupSnapshot
    )
    {
        this.groupSnapshot = groupSnapshot;
    }

    /** 
     * 
     **/
    public GroupSnapshot getGroupSnapshot() { return this.groupSnapshot; }
   
    public void setGroupSnapshot(GroupSnapshot groupSnapshot) { 
        this.groupSnapshot = groupSnapshot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyGroupSnapshotResult that = (ModifyGroupSnapshotResult) o;

        return 
            Objects.equals(groupSnapshot, that.groupSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash( groupSnapshot );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("groupSnapshot", groupSnapshot);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" groupSnapshot : ").append(gson.toJson(groupSnapshot)).append(",");
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
        private GroupSnapshot groupSnapshot;

        private Builder() { }

        public ModifyGroupSnapshotResult build() {
            return new ModifyGroupSnapshotResult (
                         this.groupSnapshot);
        }

        private ModifyGroupSnapshotResult.Builder buildFrom(final ModifyGroupSnapshotResult req) {
            this.groupSnapshot = req.groupSnapshot;

            return this;
        }

        public ModifyGroupSnapshotResult.Builder groupSnapshot(final GroupSnapshot groupSnapshot) {
            this.groupSnapshot = groupSnapshot;
            return this;
        }

    }
}
