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

import com.solidfire.javautil.Optional;

import com.solidfire.client.ApiException;
import com.solidfire.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import com.solidfire.annotation.Since;

import static com.solidfire.javautil.Optional.of;


/**
 * The object returned by the "ListVolumeAccessGroups" API Service call.
 **/
public class ListVolumeAccessGroupsResult implements Serializable {

    private static final long serialVersionUID = -1397612580L;

    private final VolumeAccessGroup[] volumeAccessGroups;

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
     * List of volume access groups.
     **/
    public VolumeAccessGroup[] getVolumeAccessGroups() {
        return this.volumeAccessGroups;
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
}
