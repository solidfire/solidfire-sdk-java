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
 * 
 **/

public class FeatureObject implements Serializable {

    public static final long serialVersionUID = -1569252747237563646L;
    @SerializedName("enabled") private Boolean enabled;
    @SerializedName("feature") private String feature;

    // empty constructor
    @Since("7.0")
    public FeatureObject() {}

    // parameterized constructor
    @Since("7.0")
    public FeatureObject(
        Boolean enabled,
        String feature
    )
    {
        this.enabled = enabled;
        this.feature = feature;
    }

    /** 
     * True if the feature is enabled, otherwise false.
     **/
    public Boolean getEnabled() { return this.enabled; }
    public void setEnabled(Boolean enabled) { 
        this.enabled = enabled;
    }
    /** 
     * The name of the feature.
     **/
    public String getFeature() { return this.feature; }
    public void setFeature(String feature) { 
        this.feature = feature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeatureObject that = (FeatureObject) o;
        return 
            Objects.equals(enabled, that.enabled) &&
            Objects.equals(feature, that.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash( enabled, feature );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("enabled", enabled);
        map.put("feature", feature);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" enabled : ").append(enabled).append(",");
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
        private Boolean enabled;
        private String feature;

        private Builder() { }

        public FeatureObject build() {
            return new FeatureObject (
                         this.enabled,
                         this.feature);
        }

        private FeatureObject.Builder buildFrom(final FeatureObject req) {
            this.enabled = req.enabled;
            this.feature = req.feature;

            return this;
        }

        public FeatureObject.Builder enabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public FeatureObject.Builder feature(final String feature) {
            this.feature = feature;
            return this;
        }

    }
}
