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
 * The Request object for the "EnableFeature" API Service call.
 **/
public class EnableFeatureRequest  implements Serializable  {

    private static final long serialVersionUID = 634293620L;

    @SerializedName("feature") private String feature;

    /**
     * The Request object for the "EnableFeature" API Service call.
     * @param feature [required] Valid values:<br/>
     * @since 9.0
     **/
    @Since("9.0")
    public EnableFeatureRequest(String feature) {
        this.feature = feature;
    }

    
    /**
     * The Request object for the "EnableFeature" API Service call.
     * Empty constructor to support serialization.
     * @since 9.0
     **/
    @Since("9.0")
    public EnableFeatureRequest() {}


    /**
     * Valid values:<br/>
     * <b>vvols</b>: Enable the Virtual Volumes (VVOLs) cluster feature.
     **/
    public String getFeature() {
        return this.feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnableFeatureRequest that = (EnableFeatureRequest) o;
        

        return Objects.equals( feature , that.feature );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) feature );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" feature : ").append(feature);
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
        private String feature;

        private Builder() { }

        public EnableFeatureRequest build() {
            return new EnableFeatureRequest (
                         this.feature            );
        }

        private EnableFeatureRequest.Builder buildFrom(final EnableFeatureRequest req) {
            this.feature = req.feature;

            return this;
        }

        public EnableFeatureRequest.Builder feature(final String feature) {
            this.feature = feature;
            return this;
        }

    }

}
