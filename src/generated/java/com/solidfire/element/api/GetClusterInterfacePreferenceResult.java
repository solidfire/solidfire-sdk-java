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
 * GetClusterInterfacePreferenceResult  
 **/

public class GetClusterInterfacePreferenceResult implements Serializable {

    public static final long serialVersionUID = -8349245021150500901L;
    @SerializedName("preference") private ClusterInterfacePreference preference;
    // empty constructor
    @Since("7.0")
    public GetClusterInterfacePreferenceResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetClusterInterfacePreferenceResult(
        ClusterInterfacePreference preference
    )
    {
        this.preference = preference;
    }

    /** 
     * The cluster interface preference for the given name.
     **/
    public ClusterInterfacePreference getPreference() { return this.preference; }
   
    public void setPreference(ClusterInterfacePreference preference) { 
        this.preference = preference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClusterInterfacePreferenceResult that = (GetClusterInterfacePreferenceResult) o;

        return 
            Objects.equals(preference, that.preference);
    }

    @Override
    public int hashCode() {
        return Objects.hash( preference );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("preference", preference);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" preference : ").append(gson.toJson(preference)).append(",");
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
        private ClusterInterfacePreference preference;

        private Builder() { }

        public GetClusterInterfacePreferenceResult build() {
            return new GetClusterInterfacePreferenceResult (
                         this.preference);
        }

        private GetClusterInterfacePreferenceResult.Builder buildFrom(final GetClusterInterfacePreferenceResult req) {
            this.preference = req.preference;

            return this;
        }

        public GetClusterInterfacePreferenceResult.Builder preference(final ClusterInterfacePreference preference) {
            this.preference = preference;
            return this;
        }

    }
}
