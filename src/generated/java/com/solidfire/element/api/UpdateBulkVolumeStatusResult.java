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
 * The object returned by the "UpdateBulkVolumeStatus" API Service call.
 **/
public class UpdateBulkVolumeStatusResult  implements Serializable  {

    private static final long serialVersionUID = -242779232L;

    @SerializedName("status") private String status;
    @SerializedName("url") private String url;
    @SerializedName("attributes") private java.util.Map<String, Object> attributes;

    /**
     * The object returned by the "UpdateBulkVolumeStatus" API Service call.
     * @param status [required] Status of the session requested. Returned status:<br/>
     * @param url [required] The URL to access the node's web server provided only if the session is still active.
     * @param attributes [required] Returns attributes that were specified in the BulkVolumeStatusUpdate method. Values are returned if they have changed or not.
     * @since 7.0
     **/
    @Since("7.0")
    public UpdateBulkVolumeStatusResult(String status, String url, java.util.Map<String, Object> attributes) {
        this.status = status;
        this.url = url;
        this.attributes = attributes;
    }

    
    /**
     * The object returned by the "UpdateBulkVolumeStatus" API Service call.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public UpdateBulkVolumeStatusResult() {}


    /**
     * Status of the session requested. Returned status:<br/>
     * <br/><b>preparing</b>
     * <br/><b>active</b>
     * <br/><b>done</b>
     * <br/><b>failed</b>
     **/
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The URL to access the node's web server provided only if the session is still active.
     **/
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Returns attributes that were specified in the BulkVolumeStatusUpdate method. Values are returned if they have changed or not.
     **/
    public java.util.Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(java.util.Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpdateBulkVolumeStatusResult that = (UpdateBulkVolumeStatusResult) o;
        

        return Objects.equals( status , that.status )
            && Objects.equals( url , that.url )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( status, url, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" status : ").append(status).append(",");
        sb.append(" url : ").append(url).append(",");
        sb.append(" attributes : ").append(attributes);
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
        private String status;
        private String url;
        private java.util.Map<String, Object> attributes;

        private Builder() { }

        public UpdateBulkVolumeStatusResult build() {
            return new UpdateBulkVolumeStatusResult (
                         this.status,
                         this.url,
                         this.attributes            );
        }

        private UpdateBulkVolumeStatusResult.Builder buildFrom(final UpdateBulkVolumeStatusResult req) {
            this.status = req.status;
            this.url = req.url;
            this.attributes = req.attributes;

            return this;
        }

        public UpdateBulkVolumeStatusResult.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public UpdateBulkVolumeStatusResult.Builder url(final String url) {
            this.url = url;
            return this;
        }

        public UpdateBulkVolumeStatusResult.Builder attributes(final java.util.Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

    }

}
