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
 * SnapMirrorVserverAggregateInfo  
 * The snapMirrorVserverAggregateInfo object contains information about the available data Storage Virtual Machines (also called Vservers) at the destination ONTAP cluster.
 **/

public class SnapMirrorVserverAggregateInfo implements Serializable {

    public static final long serialVersionUID = 8518537893613435765L;
    @SerializedName("aggrName") private String aggrName;
    @SerializedName("aggrAvailSize") private Long aggrAvailSize;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorVserverAggregateInfo(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorVserverAggregateInfo(
        String aggrName,
        Long aggrAvailSize
    )
    {
        this.aggrName = aggrName;
        this.aggrAvailSize = aggrAvailSize;
    }

    /** 
     * The name of the aggregate assigned to a Vserver.
     **/
    public String getAggrName() { return this.aggrName; }
   
    public void setAggrName(String aggrName) { 
        this.aggrName = aggrName;
    }
    /** 
     * The assigned aggregate's available size.
     **/
    public Long getAggrAvailSize() { return this.aggrAvailSize; }
   
    public void setAggrAvailSize(Long aggrAvailSize) { 
        this.aggrAvailSize = aggrAvailSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorVserverAggregateInfo that = (SnapMirrorVserverAggregateInfo) o;

        return 
            Objects.equals(aggrName, that.aggrName) && 
            Objects.equals(aggrAvailSize, that.aggrAvailSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash( aggrName,aggrAvailSize );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("aggrName", aggrName);
        map.put("aggrAvailSize", aggrAvailSize);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" aggrName : ").append(gson.toJson(aggrName)).append(",");
        sb.append(" aggrAvailSize : ").append(gson.toJson(aggrAvailSize)).append(",");
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
        private String aggrName;
        private Long aggrAvailSize;

        private Builder() { }

        public SnapMirrorVserverAggregateInfo build() {
            return new SnapMirrorVserverAggregateInfo (
                         this.aggrName,
                         this.aggrAvailSize);
        }

        private SnapMirrorVserverAggregateInfo.Builder buildFrom(final SnapMirrorVserverAggregateInfo req) {
            this.aggrName = req.aggrName;
            this.aggrAvailSize = req.aggrAvailSize;

            return this;
        }

        public SnapMirrorVserverAggregateInfo.Builder aggrName(final String aggrName) {
            this.aggrName = aggrName;
            return this;
        }

        public SnapMirrorVserverAggregateInfo.Builder aggrAvailSize(final Long aggrAvailSize) {
            this.aggrAvailSize = aggrAvailSize;
            return this;
        }

    }
}
