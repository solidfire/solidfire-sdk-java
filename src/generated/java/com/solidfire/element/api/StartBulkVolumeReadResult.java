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
 * The object returned by the "StartBulkVolumeRead" API Service call.
 **/
public class StartBulkVolumeReadResult  implements Serializable  {

    private static final long serialVersionUID = 1212553501L;

    @SerializedName("asyncHandle") private final Long asyncHandle;
    @SerializedName("key") private final String key;
    @SerializedName("url") private final String url;

    /**
     * The object returned by the "StartBulkVolumeRead" API Service call.
     * @param asyncHandle [required] ID of the async process to be checked for completion.
     * @param key [required] Opaque key uniquely identifying the session.
     * @param url [required] URL to access the node's web server
     * @since 7.0
     **/
    @Since("7.0")
    public StartBulkVolumeReadResult(Long asyncHandle, String key, String url) {
        this.asyncHandle = asyncHandle;
        this.key = key;
        this.url = url;
    }


    /**
     * ID of the async process to be checked for completion.
     **/
    public Long getAsyncHandle() {
        return this.asyncHandle;
    }

    /**
     * Opaque key uniquely identifying the session.
     **/
    public String getKey() {
        return this.key;
    }

    /**
     * URL to access the node's web server
     **/
    public String getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StartBulkVolumeReadResult that = (StartBulkVolumeReadResult) o;
        

        return Objects.equals( asyncHandle , that.asyncHandle )
            && Objects.equals( key , that.key )
            && Objects.equals( url , that.url );
    }

    @Override
    public int hashCode() {
        return Objects.hash( asyncHandle, key, url );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" asyncHandle : ").append(asyncHandle).append(",");
        sb.append(" key : ").append(key).append(",");
        sb.append(" url : ").append(url);
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
        private Long asyncHandle;
        private String key;
        private String url;

        private Builder() { }

        public StartBulkVolumeReadResult build() {
            return new StartBulkVolumeReadResult (
                         this.asyncHandle,
                         this.key,
                         this.url            );
        }

        private StartBulkVolumeReadResult.Builder buildFrom(final StartBulkVolumeReadResult req) {
            this.asyncHandle = req.asyncHandle;
            this.key = req.key;
            this.url = req.url;

            return this;
        }

        public StartBulkVolumeReadResult.Builder asyncHandle(final Long asyncHandle) {
            this.asyncHandle = asyncHandle;
            return this;
        }

        public StartBulkVolumeReadResult.Builder key(final String key) {
            this.key = key;
            return this;
        }

        public StartBulkVolumeReadResult.Builder url(final String url) {
            this.url = url;
            return this;
        }

    }

}
