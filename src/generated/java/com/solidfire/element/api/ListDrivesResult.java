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
 * The object returned by the "ListDrives" API Service call.
 **/
public class ListDrivesResult  implements Serializable  {

    private static final long serialVersionUID = -657498322L;

    @SerializedName("drives") private DriveInfo[] drives;

    /**
     * The object returned by the "ListDrives" API Service call.
     * @param drives [required] Information for the drives that are connected to the cluster.
     * @since 7.0
     **/
    @Since("7.0")
    public ListDrivesResult(DriveInfo[] drives) {
        this.drives = drives;
    }

    
    /**
     * The object returned by the "ListDrives" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public ListDrivesResult() {}


    /**
     * Information for the drives that are connected to the cluster.
     **/
    public DriveInfo[] getDrives() {
        return this.drives;
    }

    public void setDrives(DriveInfo[] drives) {
        this.drives = drives;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListDrivesResult that = (ListDrivesResult) o;
        

        return Objects.deepEquals( drives , that.drives );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) drives );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" drives : ").append(Arrays.toString(drives));
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
        private DriveInfo[] drives;

        private Builder() { }

        public ListDrivesResult build() {
            return new ListDrivesResult (
                         this.drives            );
        }

        private ListDrivesResult.Builder buildFrom(final ListDrivesResult req) {
            this.drives = req.drives;

            return this;
        }

        public ListDrivesResult.Builder drives(final DriveInfo[] drives) {
            this.drives = drives;
            return this;
        }

    }

}
