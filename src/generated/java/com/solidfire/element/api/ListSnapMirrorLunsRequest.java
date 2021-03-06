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
 * ListSnapMirrorLunsRequest  
 * The SolidFire Element OS web UI uses the ListSnapMirrorLuns method to list the LUN information for the SnapMirror relationship from the remote ONTAP cluster.
 **/

public class ListSnapMirrorLunsRequest implements Serializable {

    public static final long serialVersionUID = 8212591500435335398L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("destinationVolume") private SnapMirrorVolumeInfo destinationVolume;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorLunsRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorLunsRequest(
        Long snapMirrorEndpointID,
        SnapMirrorVolumeInfo destinationVolume
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.destinationVolume = destinationVolume;
    }

    /** 
     * List only the LUN information associated with the specified endpoint ID.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The destination volume in the SnapMirror relationship.
     **/
    public SnapMirrorVolumeInfo getDestinationVolume() { return this.destinationVolume; }
   
    public void setDestinationVolume(SnapMirrorVolumeInfo destinationVolume) { 
        this.destinationVolume = destinationVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorLunsRequest that = (ListSnapMirrorLunsRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(destinationVolume, that.destinationVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,destinationVolume );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("destinationVolume", destinationVolume);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" destinationVolume : ").append(gson.toJson(destinationVolume)).append(",");
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
        private Long snapMirrorEndpointID;
        private SnapMirrorVolumeInfo destinationVolume;

        private Builder() { }

        public ListSnapMirrorLunsRequest build() {
            return new ListSnapMirrorLunsRequest (
                         this.snapMirrorEndpointID,
                         this.destinationVolume);
        }

        private ListSnapMirrorLunsRequest.Builder buildFrom(final ListSnapMirrorLunsRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.destinationVolume = req.destinationVolume;

            return this;
        }

        public ListSnapMirrorLunsRequest.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public ListSnapMirrorLunsRequest.Builder destinationVolume(final SnapMirrorVolumeInfo destinationVolume) {
            this.destinationVolume = destinationVolume;
            return this;
        }

    }
}
