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
 * ListSnapMirrorEndpointsRequest  
 * The SolidFire Element OS web UI uses the ListSnapMirrorEndpoints method to list all SnapMirror endpoints that the SolidFire cluster is communicating with.
 **/

public class ListSnapMirrorEndpointsRequest implements Serializable {

    public static final long serialVersionUID = -4227477565872607266L;
    @SerializedName("snapMirrorEndpointIDs") private Optional<Long[]> snapMirrorEndpointIDs;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorEndpointsRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorEndpointsRequest(
        Optional<Long[]> snapMirrorEndpointIDs
    )
    {
        this.snapMirrorEndpointIDs = (snapMirrorEndpointIDs == null) ? Optional.<Long[]>empty() : snapMirrorEndpointIDs;
    }

    /** 
     * Return only the objects associated with these IDs.
     * If no IDs are provided or the array is empty,
     * the method returns all SnapMirror endpoint IDs.
     **/
    public Optional<Long[]> getSnapMirrorEndpointIDs() { return this.snapMirrorEndpointIDs; }
   
    public void setSnapMirrorEndpointIDs(Optional<Long[]> snapMirrorEndpointIDs) { 
        this.snapMirrorEndpointIDs = (snapMirrorEndpointIDs == null) ? Optional.<Long[]>empty() : snapMirrorEndpointIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorEndpointsRequest that = (ListSnapMirrorEndpointsRequest) o;

        return 
            Objects.equals(snapMirrorEndpointIDs, that.snapMirrorEndpointIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointIDs );
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

        if(null != snapMirrorEndpointIDs && snapMirrorEndpointIDs.isPresent()){
            sb.append(" snapMirrorEndpointIDs : ").append(gson.toJson(snapMirrorEndpointIDs)).append(",");
        }
        else{
            sb.append(" snapMirrorEndpointIDs : ").append("null").append(",");
        }
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
        private Optional<Long[]> snapMirrorEndpointIDs;

        private Builder() { }

        public ListSnapMirrorEndpointsRequest build() {
            return new ListSnapMirrorEndpointsRequest (
                         this.snapMirrorEndpointIDs);
        }

        private ListSnapMirrorEndpointsRequest.Builder buildFrom(final ListSnapMirrorEndpointsRequest req) {
            this.snapMirrorEndpointIDs = req.snapMirrorEndpointIDs;

            return this;
        }

        public ListSnapMirrorEndpointsRequest.Builder optionalSnapMirrorEndpointIDs(final Long[] snapMirrorEndpointIDs) {
            this.snapMirrorEndpointIDs = (snapMirrorEndpointIDs == null) ? Optional.<Long[]>empty() : Optional.of(snapMirrorEndpointIDs);
            return this;
        }

    }
}
