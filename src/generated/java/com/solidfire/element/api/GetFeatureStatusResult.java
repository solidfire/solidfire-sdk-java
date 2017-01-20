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
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetFeatureStatusResult  
 **/

public class GetFeatureStatusResult implements Serializable {

    public static final long serialVersionUID = -4559506767700064138L;
    @SerializedName("features") private FeatureObject[] features;

    // empty constructor
    @Since("7.0")
    public GetFeatureStatusResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetFeatureStatusResult(
        FeatureObject[] features
    )
    {
        this.features = features;
    }

    /** 
     * An array of feature objects indicating the feature name and its status.
     **/
    public FeatureObject[] getFeatures() { return this.features; }
    public void setFeatures(FeatureObject[] features) { 
        this.features = features;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetFeatureStatusResult that = (GetFeatureStatusResult) o;

        return 
            Arrays.equals(features, that.features);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])features );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("features", features);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" features : ").append(Arrays.toString(features)).append(",");
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
        private FeatureObject[] features;

        private Builder() { }

        public GetFeatureStatusResult build() {
            return new GetFeatureStatusResult (
                         this.features);
        }

        private GetFeatureStatusResult.Builder buildFrom(final GetFeatureStatusResult req) {
            this.features = req.features;

            return this;
        }

        public GetFeatureStatusResult.Builder features(final FeatureObject[] features) {
            this.features = features;
            return this;
        }

    }
}
