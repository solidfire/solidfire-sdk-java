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
 * GetClusterInfoResult  
 **/

public class GetClusterInfoResult implements Serializable {

    public static final long serialVersionUID = -4404543425795269763L;
    @SerializedName("clusterInfo") private ClusterInfo clusterInfo;
    // empty constructor
    @Since("7.0")
    public GetClusterInfoResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetClusterInfoResult(
        ClusterInfo clusterInfo
    )
    {
        this.clusterInfo = clusterInfo;
    }

    /** 
     * 
     **/
    public ClusterInfo getClusterInfo() { return this.clusterInfo; }
   
    public void setClusterInfo(ClusterInfo clusterInfo) { 
        this.clusterInfo = clusterInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClusterInfoResult that = (GetClusterInfoResult) o;

        return 
            Objects.equals(clusterInfo, that.clusterInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterInfo );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterInfo", clusterInfo);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" clusterInfo : ").append(gson.toJson(clusterInfo)).append(",");
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
        private ClusterInfo clusterInfo;

        private Builder() { }

        public GetClusterInfoResult build() {
            return new GetClusterInfoResult (
                         this.clusterInfo);
        }

        private GetClusterInfoResult.Builder buildFrom(final GetClusterInfoResult req) {
            this.clusterInfo = req.clusterInfo;

            return this;
        }

        public GetClusterInfoResult.Builder clusterInfo(final ClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }

    }
}
