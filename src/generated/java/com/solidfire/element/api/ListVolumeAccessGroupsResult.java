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
 * The object returned by the "ListVolumeAccessGroups" API Service call.
 **/
public class ListVolumeAccessGroupsResult  implements Serializable  {

    private static final long serialVersionUID = 1985813315L;

    @SerializedName("volumeAccessGroups") private VolumeAccessGroup[] volumeAccessGroups;

    /**
     * The object returned by the "ListVolumeAccessGroups" API Service call.
     * @param volumeAccessGroups [required] List of volume access groups.
     * @since 7.0
     **/
    @Since("7.0")
    public ListVolumeAccessGroupsResult(VolumeAccessGroup[] volumeAccessGroups) {
        this.volumeAccessGroups = volumeAccessGroups;
    }

    
    /**
     * The object returned by the "ListVolumeAccessGroups" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public ListVolumeAccessGroupsResult() {}


    /**
     * List of volume access groups.
     **/
    public VolumeAccessGroup[] getVolumeAccessGroups() {
        return this.volumeAccessGroups;
    }

    public void setVolumeAccessGroups(VolumeAccessGroup[] volumeAccessGroups) {
        this.volumeAccessGroups = volumeAccessGroups;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumeAccessGroupsResult that = (ListVolumeAccessGroupsResult) o;
        

        return Objects.deepEquals( volumeAccessGroups , that.volumeAccessGroups );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) volumeAccessGroups );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeAccessGroups : ").append(Arrays.toString(volumeAccessGroups));
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
        private VolumeAccessGroup[] volumeAccessGroups;

        private Builder() { }

        public ListVolumeAccessGroupsResult build() {
            return new ListVolumeAccessGroupsResult (
                         this.volumeAccessGroups            );
        }

        private ListVolumeAccessGroupsResult.Builder buildFrom(final ListVolumeAccessGroupsResult req) {
            this.volumeAccessGroups = req.volumeAccessGroups;

            return this;
        }

        public ListVolumeAccessGroupsResult.Builder volumeAccessGroups(final VolumeAccessGroup[] volumeAccessGroups) {
            this.volumeAccessGroups = volumeAccessGroups;
            return this;
        }

    }

}
