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
 * DeleteSnapMirrorEndpointsRequest  
 * The SolidFire Element OS web UI uses DeleteSnapMirrorEndpoints to delete one or more SnapMirror endpoints from the system.
 **/

public class DeleteSnapMirrorEndpointsRequest implements Serializable {

    public static final long serialVersionUID = 5609523756365363436L;
    @SerializedName("snapMirrorEndpointIDs") private Long[] snapMirrorEndpointIDs;

    
    // parameterized constructor
    @Since("7.0")
    public DeleteSnapMirrorEndpointsRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public DeleteSnapMirrorEndpointsRequest(
        Long[] snapMirrorEndpointIDs
    )
    {
        this.snapMirrorEndpointIDs = snapMirrorEndpointIDs;
    }

    /** 
     * An array of IDs of SnapMirror endpoints to delete.
     **/
    public Long[] getSnapMirrorEndpointIDs() { return this.snapMirrorEndpointIDs; }
   
    public void setSnapMirrorEndpointIDs(Long[] snapMirrorEndpointIDs) { 
        this.snapMirrorEndpointIDs = snapMirrorEndpointIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteSnapMirrorEndpointsRequest that = (DeleteSnapMirrorEndpointsRequest) o;

        return 
            Arrays.equals(snapMirrorEndpointIDs, that.snapMirrorEndpointIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])snapMirrorEndpointIDs );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointIDs", snapMirrorEndpointIDs);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointIDs : ").append(gson.toJson(Arrays.toString(snapMirrorEndpointIDs))).append(",");
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
        private Long[] snapMirrorEndpointIDs;

        private Builder() { }

        public DeleteSnapMirrorEndpointsRequest build() {
            return new DeleteSnapMirrorEndpointsRequest (
                         this.snapMirrorEndpointIDs);
        }

        private DeleteSnapMirrorEndpointsRequest.Builder buildFrom(final DeleteSnapMirrorEndpointsRequest req) {
            this.snapMirrorEndpointIDs = req.snapMirrorEndpointIDs;

            return this;
        }

        public DeleteSnapMirrorEndpointsRequest.Builder snapMirrorEndpointIDs(final Long[] snapMirrorEndpointIDs) {
            this.snapMirrorEndpointIDs = snapMirrorEndpointIDs;
            return this;
        }

    }
}
