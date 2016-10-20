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
 * The object returned by the "GetVirtualVolumeCount" API Service call.
 **/
public class GetVirtualVolumeCountResult  implements Serializable  {

    private static final long serialVersionUID = -876061185L;

    @SerializedName("count") private Long count;

    /**
     * The object returned by the "GetVirtualVolumeCount" API Service call.
     * @param count [required] The number of virtual volumes currently in the system.
     * @since 7.0
     **/
    @Since("7.0")
    public GetVirtualVolumeCountResult(Long count) {
        this.count = count;
    }

    
    /**
     * The object returned by the "GetVirtualVolumeCount" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public GetVirtualVolumeCountResult() {}


    /**
     * The number of virtual volumes currently in the system.
     **/
    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetVirtualVolumeCountResult that = (GetVirtualVolumeCountResult) o;
        

        return Objects.equals( count , that.count );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) count );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" count : ").append(count);
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
        private Long count;

        private Builder() { }

        public GetVirtualVolumeCountResult build() {
            return new GetVirtualVolumeCountResult (
                         this.count            );
        }

        private GetVirtualVolumeCountResult.Builder buildFrom(final GetVirtualVolumeCountResult req) {
            this.count = req.count;

            return this;
        }

        public GetVirtualVolumeCountResult.Builder count(final Long count) {
            this.count = count;
            return this;
        }

    }

}
