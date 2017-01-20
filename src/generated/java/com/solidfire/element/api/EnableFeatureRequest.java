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
 * EnableFeatureRequest  
 **/

public class EnableFeatureRequest implements Serializable {

    public static final long serialVersionUID = -2330061482927933548L;
    @SerializedName("feature") private String feature;

    // empty constructor
    @Since("7.0")
    public EnableFeatureRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public EnableFeatureRequest(
        String feature
    )
    {
        this.feature = feature;
    }

    /** 
     * Valid values: vvols: Enable the Virtual Volumes (VVOLs) cluster feature.
     **/
    public String getFeature() { return this.feature; }
    public void setFeature(String feature) { 
        this.feature = feature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnableFeatureRequest that = (EnableFeatureRequest) o;

        return 
            Objects.equals(feature, that.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash( feature );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("feature", feature);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" feature : ").append(feature).append(",");
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
                         this.feature);
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
