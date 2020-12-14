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
 * ModifySnapMirrorEndpointResult  
 **/

public class ModifySnapMirrorEndpointResult implements Serializable {

    public static final long serialVersionUID = -2121064283250190482L;
    @SerializedName("snapMirrorEndpoint") private SnapMirrorEndpoint snapMirrorEndpoint;

    
    // parameterized constructor
    @Since("7.0")
    public ModifySnapMirrorEndpointResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ModifySnapMirrorEndpointResult(
        SnapMirrorEndpoint snapMirrorEndpoint
    )
    {
        this.snapMirrorEndpoint = snapMirrorEndpoint;
    }

    /** 
     * Information about the modified SnapMirror endpoint.
     **/
    public SnapMirrorEndpoint getSnapMirrorEndpoint() { return this.snapMirrorEndpoint; }
   
    public void setSnapMirrorEndpoint(SnapMirrorEndpoint snapMirrorEndpoint) { 
        this.snapMirrorEndpoint = snapMirrorEndpoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifySnapMirrorEndpointResult that = (ModifySnapMirrorEndpointResult) o;

        return 
            Objects.equals(snapMirrorEndpoint, that.snapMirrorEndpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpoint );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpoint", snapMirrorEndpoint);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpoint : ").append(gson.toJson(snapMirrorEndpoint)).append(",");
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
        private SnapMirrorEndpoint snapMirrorEndpoint;

        private Builder() { }

        public ModifySnapMirrorEndpointResult build() {
            return new ModifySnapMirrorEndpointResult (
                         this.snapMirrorEndpoint);
        }

        private ModifySnapMirrorEndpointResult.Builder buildFrom(final ModifySnapMirrorEndpointResult req) {
            this.snapMirrorEndpoint = req.snapMirrorEndpoint;

            return this;
        }

        public ModifySnapMirrorEndpointResult.Builder snapMirrorEndpoint(final SnapMirrorEndpoint snapMirrorEndpoint) {
            this.snapMirrorEndpoint = snapMirrorEndpoint;
            return this;
        }

    }
}
