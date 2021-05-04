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
 * ListSnapMirrorSchedulesResult  
 **/

public class ListSnapMirrorSchedulesResult implements Serializable {

    public static final long serialVersionUID = 125982440034489118L;
    @SerializedName("snapMirrorSchedules") private SnapMirrorJobScheduleCronInfo[] snapMirrorSchedules;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorSchedulesResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorSchedulesResult(
        SnapMirrorJobScheduleCronInfo[] snapMirrorSchedules
    )
    {
        this.snapMirrorSchedules = snapMirrorSchedules;
    }

    /** 
     * A list of the SnapMirror schedules on the remote ONTAP cluster.
     **/
    public SnapMirrorJobScheduleCronInfo[] getSnapMirrorSchedules() { return this.snapMirrorSchedules; }
   
    public void setSnapMirrorSchedules(SnapMirrorJobScheduleCronInfo[] snapMirrorSchedules) { 
        this.snapMirrorSchedules = snapMirrorSchedules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorSchedulesResult that = (ListSnapMirrorSchedulesResult) o;

        return 
            Arrays.equals(snapMirrorSchedules, that.snapMirrorSchedules);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])snapMirrorSchedules );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorSchedules", snapMirrorSchedules);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorSchedules : ").append(gson.toJson(Arrays.toString(snapMirrorSchedules))).append(",");
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
        private SnapMirrorJobScheduleCronInfo[] snapMirrorSchedules;

        private Builder() { }

        public ListSnapMirrorSchedulesResult build() {
            return new ListSnapMirrorSchedulesResult (
                         this.snapMirrorSchedules);
        }

        private ListSnapMirrorSchedulesResult.Builder buildFrom(final ListSnapMirrorSchedulesResult req) {
            this.snapMirrorSchedules = req.snapMirrorSchedules;

            return this;
        }

        public ListSnapMirrorSchedulesResult.Builder snapMirrorSchedules(final SnapMirrorJobScheduleCronInfo[] snapMirrorSchedules) {
            this.snapMirrorSchedules = snapMirrorSchedules;
            return this;
        }

    }
}
