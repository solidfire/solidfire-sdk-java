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
 **/

public class ListVirtualVolumeTasksResult implements Serializable {

    public static final long serialVersionUID = 7921986552949263824L;
    @SerializedName("tasks") private VirtualVolumeTask[] tasks;

    // empty constructor
    @Since("7.0")
    public ListVirtualVolumeTasksResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVirtualVolumeTasksResult(
        VirtualVolumeTask[] tasks
    )
    {
        this.tasks = tasks;
    }

    /** 
     * List of VVol Async Tasks.
     **/
    public VirtualVolumeTask[] getTasks() { return this.tasks; }
    public void setTasks(VirtualVolumeTask[] tasks) { 
        this.tasks = tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualVolumeTasksResult that = (ListVirtualVolumeTasksResult) o;

        return 
            Arrays.equals(tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])tasks );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("tasks", tasks);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" tasks : ").append(Arrays.toString(tasks)).append(",");
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
        private VirtualVolumeTask[] tasks;

        private Builder() { }

        public ListVirtualVolumeTasksResult build() {
            return new ListVirtualVolumeTasksResult (
                         this.tasks);
        }

        private ListVirtualVolumeTasksResult.Builder buildFrom(final ListVirtualVolumeTasksResult req) {
            this.tasks = req.tasks;

            return this;
        }

        public ListVirtualVolumeTasksResult.Builder tasks(final VirtualVolumeTask[] tasks) {
            this.tasks = tasks;
            return this;
        }

    }
}
