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
 * ListSnapMirrorAggregatesResult  
 **/

public class ListSnapMirrorAggregatesResult implements Serializable {

    public static final long serialVersionUID = -7208744190457826080L;
    @SerializedName("snapMirrorAggregates") private SnapMirrorAggregate[] snapMirrorAggregates;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorAggregatesResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorAggregatesResult(
        SnapMirrorAggregate[] snapMirrorAggregates
    )
    {
        this.snapMirrorAggregates = snapMirrorAggregates;
    }

    /** 
     * A list of the aggregates available on the ONTAP storage system.
     **/
    public SnapMirrorAggregate[] getSnapMirrorAggregates() { return this.snapMirrorAggregates; }
   
    public void setSnapMirrorAggregates(SnapMirrorAggregate[] snapMirrorAggregates) { 
        this.snapMirrorAggregates = snapMirrorAggregates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorAggregatesResult that = (ListSnapMirrorAggregatesResult) o;

        return 
            Arrays.equals(snapMirrorAggregates, that.snapMirrorAggregates);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])snapMirrorAggregates );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorAggregates", snapMirrorAggregates);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorAggregates : ").append(gson.toJson(Arrays.toString(snapMirrorAggregates))).append(",");
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
        private SnapMirrorAggregate[] snapMirrorAggregates;

        private Builder() { }

        public ListSnapMirrorAggregatesResult build() {
            return new ListSnapMirrorAggregatesResult (
                         this.snapMirrorAggregates);
        }

        private ListSnapMirrorAggregatesResult.Builder buildFrom(final ListSnapMirrorAggregatesResult req) {
            this.snapMirrorAggregates = req.snapMirrorAggregates;

            return this;
        }

        public ListSnapMirrorAggregatesResult.Builder snapMirrorAggregates(final SnapMirrorAggregate[] snapMirrorAggregates) {
            this.snapMirrorAggregates = snapMirrorAggregates;
            return this;
        }

    }
}
