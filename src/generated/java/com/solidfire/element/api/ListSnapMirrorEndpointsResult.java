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
 * ListSnapMirrorEndpointsResult  
 **/

public class ListSnapMirrorEndpointsResult implements Serializable {

    public static final long serialVersionUID = -620589272489337034L;
    @SerializedName("snapMirrorEndpoints") private SnapMirrorEndpoint[] snapMirrorEndpoints;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorEndpointsResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorEndpointsResult(
        SnapMirrorEndpoint[] snapMirrorEndpoints
    )
    {
        this.snapMirrorEndpoints = snapMirrorEndpoints;
    }

    /** 
     * A list of existing SnapMirror endpoints.
     **/
    public SnapMirrorEndpoint[] getSnapMirrorEndpoints() { return this.snapMirrorEndpoints; }
   
    public void setSnapMirrorEndpoints(SnapMirrorEndpoint[] snapMirrorEndpoints) { 
        this.snapMirrorEndpoints = snapMirrorEndpoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorEndpointsResult that = (ListSnapMirrorEndpointsResult) o;

        return 
            Arrays.equals(snapMirrorEndpoints, that.snapMirrorEndpoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])snapMirrorEndpoints );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpoints", snapMirrorEndpoints);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpoints : ").append(gson.toJson(Arrays.toString(snapMirrorEndpoints))).append(",");
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
        private SnapMirrorEndpoint[] snapMirrorEndpoints;

        private Builder() { }

        public ListSnapMirrorEndpointsResult build() {
            return new ListSnapMirrorEndpointsResult (
                         this.snapMirrorEndpoints);
        }

        private ListSnapMirrorEndpointsResult.Builder buildFrom(final ListSnapMirrorEndpointsResult req) {
            this.snapMirrorEndpoints = req.snapMirrorEndpoints;

            return this;
        }

        public ListSnapMirrorEndpointsResult.Builder snapMirrorEndpoints(final SnapMirrorEndpoint[] snapMirrorEndpoints) {
            this.snapMirrorEndpoints = snapMirrorEndpoints;
            return this;
        }

    }
}
