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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetClusterCapacityResult  
 **/

public class GetClusterCapacityResult implements Serializable {

    public static final long serialVersionUID = 3740042992965786005L;
    @SerializedName("clusterCapacity") private ClusterCapacity clusterCapacity;
    // empty constructor
    @Since("7.0")
    public GetClusterCapacityResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetClusterCapacityResult(
        ClusterCapacity clusterCapacity
    )
    {
        this.clusterCapacity = clusterCapacity;
    }

    /** 
     * 
     **/
    public ClusterCapacity getClusterCapacity() { return this.clusterCapacity; }
    public void setClusterCapacity(ClusterCapacity clusterCapacity) { 
        this.clusterCapacity = clusterCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClusterCapacityResult that = (GetClusterCapacityResult) o;

        return 
            Objects.equals(clusterCapacity, that.clusterCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterCapacity );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterCapacity", clusterCapacity);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterCapacity : ").append(clusterCapacity).append(",");
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
        private ClusterCapacity clusterCapacity;

        private Builder() { }

        public GetClusterCapacityResult build() {
            return new GetClusterCapacityResult (
                         this.clusterCapacity);
        }

        private GetClusterCapacityResult.Builder buildFrom(final GetClusterCapacityResult req) {
            this.clusterCapacity = req.clusterCapacity;

            return this;
        }

        public GetClusterCapacityResult.Builder clusterCapacity(final ClusterCapacity clusterCapacity) {
            this.clusterCapacity = clusterCapacity;
            return this;
        }

    }
}
