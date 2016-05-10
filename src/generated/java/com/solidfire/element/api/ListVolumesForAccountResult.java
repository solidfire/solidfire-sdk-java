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
 * The object returned by the "ListVolumesForAccount" API Service call.
 **/
public class ListVolumesForAccountResult implements Serializable {

    private static final long serialVersionUID = 1137518633L;

    private final Volume[] volumes;

    /**
     * The object returned by the "ListVolumesForAccount" API Service call.
     * @param volumes [required] List of volumes.
     * @since 7.0
     **/
    @Since("7.0")
    public ListVolumesForAccountResult(Volume[] volumes) {
        this.volumes = volumes;
    }


    /**
     * List of volumes.
     **/
    public Volume[] getVolumes() {
        return this.volumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVolumesForAccountResult that = (ListVolumesForAccountResult) o;
        

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
}
