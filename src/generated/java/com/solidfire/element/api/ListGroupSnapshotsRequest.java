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
 * The Request object for the "ListGroupSnapshots" API Service call.
 **/
public class ListGroupSnapshotsRequest implements Serializable {

    private static final long serialVersionUID = 1188122552L;

    @SerializedName("volumeID") private final Optional<Long> volumeID;

    /**
     * The Request object for the "ListGroupSnapshots" API Service call.
     * @param volumeID (optional) An array of unique volume IDs to query.
     * @since 7.0
     **/
    @Since("7.0")
    public ListGroupSnapshotsRequest(Optional<Long> volumeID) {
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
    }


    /**
     * An array of unique volume IDs to query.
     * If this parameter is not specified, all group snapshots on the cluster will be included.
     **/
    public Optional<Long> getVolumeID() {
        return this.volumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListGroupSnapshotsRequest that = (ListGroupSnapshotsRequest) o;
        

        return Objects.equals( volumeID , that.volumeID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) volumeID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != volumeID && volumeID.isPresent())
            sb.append(" volumeID : ").append(volumeID.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Optional<Long> volumeID;

        private Builder() { }

        public ListGroupSnapshotsRequest build() {
            return new ListGroupSnapshotsRequest (
                         this.volumeID            );
        }

        private ListGroupSnapshotsRequest.Builder buildFrom(final ListGroupSnapshotsRequest req) {
            this.volumeID = req.volumeID;

            return this;
        }

        public ListGroupSnapshotsRequest.Builder optionalVolumeID(final Long volumeID) {
            this.volumeID = (volumeID == null) ? Optional.<Long>empty() : Optional.of(volumeID);
            return this;
        }

    }

}
