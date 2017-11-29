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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetFeatureStatusRequest  
 * GetFeatureStatus enables you to retrieve the status of a cluster feature.
 **/

public class GetFeatureStatusRequest implements Serializable {

    public static final long serialVersionUID = -6557742284592325892L;
    @SerializedName("feature") private Optional<String> feature;
    // empty constructor
    @Since("7.0")
    public GetFeatureStatusRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetFeatureStatusRequest(
        Optional<String> feature
    )
    {
        this.feature = (feature == null) ? Optional.<String>empty() : feature;
    }

    /** 
     * Specifies the feature for which the status is returned. Valid value is:
     * vvols: Retrieve status for the NetApp SolidFire VVols
     * cluster feature.
     **/
    public Optional<String> getFeature() { return this.feature; }
   
    public void setFeature(Optional<String> feature) { 
        this.feature = (feature == null) ? Optional.<String>empty() : feature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetFeatureStatusRequest that = (GetFeatureStatusRequest) o;

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
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != feature && feature.isPresent()){
            sb.append(" feature : ").append(gson.toJson(feature)).append(",");
        }
        else{
            sb.append(" feature : ").append("null").append(",");
        }
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
        private Optional<String> feature;

        private Builder() { }

        public GetFeatureStatusRequest build() {
            return new GetFeatureStatusRequest (
                         this.feature);
        }

        private GetFeatureStatusRequest.Builder buildFrom(final GetFeatureStatusRequest req) {
            this.feature = req.feature;

            return this;
        }

        public GetFeatureStatusRequest.Builder optionalFeature(final String feature) {
            this.feature = (feature == null) ? Optional.<String>empty() : Optional.of(feature);
            return this;
        }

    }
}
