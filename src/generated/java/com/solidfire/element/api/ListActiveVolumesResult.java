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

import com.solidfire.gson.annotations.SerializedName;
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
 * The object returned by the "ListActiveVolumes" API Service call.
 **/
public class ListActiveVolumesResult  implements Serializable  {

    private static final long serialVersionUID = -1292530807L;

    @SerializedName("volumes") private Volume[] volumes;

    /**
     * The object returned by the "ListActiveVolumes" API Service call.
     * @param volumes [required] List of active volumes.
     * @since 7.0
     **/
    @Since("7.0")
    public ListActiveVolumesResult(Volume[] volumes) {
        this.volumes = volumes;
    }

    
    /**
     * The object returned by the "ListActiveVolumes" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public ListActiveVolumesResult() {}


    /**
     * List of active volumes.
     **/
    public Volume[] getVolumes() {
        return this.volumes;
    }

    public void setVolumes(Volume[] volumes) {
        this.volumes = volumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListActiveVolumesResult that = (ListActiveVolumesResult) o;
        

        return Objects.deepEquals( volumes , that.volumes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) volumes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumes : ").append(Arrays.toString(volumes));
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
        private Volume[] volumes;

        private Builder() { }

        public ListActiveVolumesResult build() {
            return new ListActiveVolumesResult (
                         this.volumes            );
        }

        private ListActiveVolumesResult.Builder buildFrom(final ListActiveVolumesResult req) {
            this.volumes = req.volumes;

            return this;
        }

        public ListActiveVolumesResult.Builder volumes(final Volume[] volumes) {
            this.volumes = volumes;
            return this;
        }

    }

}
