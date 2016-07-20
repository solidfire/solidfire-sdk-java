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
 * The object returned by the "GetVolumeAccessGroupLunAssignments" API Service call.
 **/
public class GetVolumeAccessGroupLunAssignmentsResult implements Serializable {

    private static final long serialVersionUID = -2068855983L;

    @SerializedName("volumeAccessGroupLunAssignments") private final VolumeAccessGroupLunAssignments volumeAccessGroupLunAssignments;

    /**
     * The object returned by the "GetVolumeAccessGroupLunAssignments" API Service call.
     * @param volumeAccessGroupLunAssignments [required] List of all physical Fibre Channel ports, or a port for a single node.
     * @since 7.0
     **/
    @Since("7.0")
    public GetVolumeAccessGroupLunAssignmentsResult(VolumeAccessGroupLunAssignments volumeAccessGroupLunAssignments) {
        this.volumeAccessGroupLunAssignments = volumeAccessGroupLunAssignments;
    }


    /**
     * List of all physical Fibre Channel ports, or a port for a single node.
     **/
    public VolumeAccessGroupLunAssignments getVolumeAccessGroupLunAssignments() {
        return this.volumeAccessGroupLunAssignments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetVolumeAccessGroupLunAssignmentsResult that = (GetVolumeAccessGroupLunAssignmentsResult) o;
        

        return Objects.equals( volumeAccessGroupLunAssignments , that.volumeAccessGroupLunAssignments );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) volumeAccessGroupLunAssignments );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroupLunAssignments : ").append(volumeAccessGroupLunAssignments);
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
        private VolumeAccessGroupLunAssignments volumeAccessGroupLunAssignments;

        private Builder() { }

        public GetVolumeAccessGroupLunAssignmentsResult build() {
            return new GetVolumeAccessGroupLunAssignmentsResult (
                         this.volumeAccessGroupLunAssignments            );
        }

        private GetVolumeAccessGroupLunAssignmentsResult.Builder buildFrom(final GetVolumeAccessGroupLunAssignmentsResult req) {
            this.volumeAccessGroupLunAssignments = req.volumeAccessGroupLunAssignments;

            return this;
        }

        public GetVolumeAccessGroupLunAssignmentsResult.Builder volumeAccessGroupLunAssignments(final VolumeAccessGroupLunAssignments volumeAccessGroupLunAssignments) {
            this.volumeAccessGroupLunAssignments = volumeAccessGroupLunAssignments;
            return this;
        }

    }

}
