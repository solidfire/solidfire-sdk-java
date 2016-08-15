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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * The Request object for the "ListActiveVolumes" API Service call.
 **/
public class ListActiveVolumesRequest  implements Serializable  {

    private static final long serialVersionUID = -1455059609L;

    @SerializedName("startVolumeID") private final Optional<Long> startVolumeID;
    @SerializedName("limit") private final Optional<Long> limit;

    /**
     * The Request object for the "ListActiveVolumes" API Service call.
     * @param startVolumeID (optional) The ID of the first volume to list.
     * @param limit (optional) The maximum number of volumes to return from the API.
     * @since 7.0
     **/
    @Since("7.0")
    public ListActiveVolumesRequest(Optional<Long> startVolumeID, Optional<Long> limit) {
        this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : startVolumeID;
        this.limit = (limit == null) ? Optional.<Long>empty() : limit;
    }


    /**
     * The ID of the first volume to list.
     * This can be useful for paging results.
     * By default, this starts at the lowest VolumeID.
     **/
    public Optional<Long> getStartVolumeID() {
        return this.startVolumeID;
    }

    /**
     * The maximum number of volumes to return from the API.
     **/
    public Optional<Long> getLimit() {
        return this.limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListActiveVolumesRequest that = (ListActiveVolumesRequest) o;
        

        return Objects.equals( startVolumeID , that.startVolumeID )
            && Objects.equals( limit , that.limit );
    }

    @Override
    public int hashCode() {
        return Objects.hash( startVolumeID, limit );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != startVolumeID && startVolumeID.isPresent())
            sb.append(" startVolumeID : ").append(startVolumeID.get()).append(",");
        if(null != limit && limit.isPresent())
            sb.append(" limit : ").append(limit.get());
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
        private Optional<Long> startVolumeID;
        private Optional<Long> limit;

        private Builder() { }

        public ListActiveVolumesRequest build() {
            return new ListActiveVolumesRequest (
                         this.startVolumeID,
                         this.limit            );
        }

        private ListActiveVolumesRequest.Builder buildFrom(final ListActiveVolumesRequest req) {
            this.startVolumeID = req.startVolumeID;
            this.limit = req.limit;

            return this;
        }

        public ListActiveVolumesRequest.Builder optionalStartVolumeID(final Long startVolumeID) {
            this.startVolumeID = (startVolumeID == null) ? Optional.<Long>empty() : Optional.of(startVolumeID);
            return this;
        }

        public ListActiveVolumesRequest.Builder optionalLimit(final Long limit) {
            this.limit = (limit == null) ? Optional.<Long>empty() : Optional.of(limit);
            return this;
        }

    }

}
