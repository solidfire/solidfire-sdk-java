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

public class ListGroupSnapshotsResult implements Serializable {

    public static final long serialVersionUID = 1065628803L;
    @SerializedName("groupSnapshots") private GroupSnapshot[] groupSnapshots;

    // empty constructor
    @Since("7.0")
    public ListGroupSnapshotsResult() {}

    // parameterized constructor
    @Since("7.0")
    public ListGroupSnapshotsResult(
        GroupSnapshot[] groupSnapshots
    )
    {
        this.groupSnapshots = groupSnapshots;
    }

    /** 
     * List of Group Snapshots.
     **/
    public GroupSnapshot[] getGroupSnapshots() { return this.groupSnapshots; }
    public void setGroupSnapshots(GroupSnapshot[] groupSnapshots) { 
        this.groupSnapshots = groupSnapshots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListGroupSnapshotsResult that = (ListGroupSnapshotsResult) o;
        return 
            Arrays.equals(groupSnapshots, that.groupSnapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])groupSnapshots );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("groupSnapshots", groupSnapshots);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" groupSnapshots : ").append(Arrays.toString(groupSnapshots)).append(",");
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
        private GroupSnapshot[] groupSnapshots;

        private Builder() { }

        public ListGroupSnapshotsResult build() {
            return new ListGroupSnapshotsResult (
                         this.groupSnapshots);
        }

        private ListGroupSnapshotsResult.Builder buildFrom(final ListGroupSnapshotsResult req) {
            this.groupSnapshots = req.groupSnapshots;

            return this;
        }

        public ListGroupSnapshotsResult.Builder groupSnapshots(final GroupSnapshot[] groupSnapshots) {
            this.groupSnapshots = groupSnapshots;
            return this;
        }

    }
}
