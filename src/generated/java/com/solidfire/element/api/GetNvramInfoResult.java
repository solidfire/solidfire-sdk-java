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
 * The object returned by the "GetNvramInfo" API Service call.
 **/
public class GetNvramInfoResult  implements Serializable  {

    private static final long serialVersionUID = 1656914543L;

    @SerializedName("nvramInfo") private java.util.Map<String, Object> nvramInfo;

    /**
     * The object returned by the "GetNvramInfo" API Service call.
     * @param nvramInfo [required] Arrays of events and errors detected on the NVRAM card.
     * @since 7.0
     **/
    @Since("7.0")
    public GetNvramInfoResult(java.util.Map<String, Object> nvramInfo) {
        this.nvramInfo = nvramInfo;
    }

    
    /**
     * The object returned by the "GetNvramInfo" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public GetNvramInfoResult() {}


    /**
     * Arrays of events and errors detected on the NVRAM card.
     **/
    public java.util.Map<String, Object> getNvramInfo() {
        return this.nvramInfo;
    }

    public void setNvramInfo(java.util.Map<String, Object> nvramInfo) {
        this.nvramInfo = nvramInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetNvramInfoResult that = (GetNvramInfoResult) o;
        

        return Objects.equals( nvramInfo , that.nvramInfo );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) nvramInfo );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nvramInfo : ").append(nvramInfo);
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
        private java.util.Map<String, Object> nvramInfo;

        private Builder() { }

        public GetNvramInfoResult build() {
            return new GetNvramInfoResult (
                         this.nvramInfo            );
        }

        private GetNvramInfoResult.Builder buildFrom(final GetNvramInfoResult req) {
            this.nvramInfo = req.nvramInfo;

            return this;
        }

        public GetNvramInfoResult.Builder nvramInfo(final java.util.Map<String, Object> nvramInfo) {
            this.nvramInfo = nvramInfo;
            return this;
        }

    }

}
