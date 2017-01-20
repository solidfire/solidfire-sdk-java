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
 * GetClusterHardwareInfoResult  
 **/

public class GetClusterHardwareInfoResult implements Serializable {

    public static final long serialVersionUID = -1610865166151041756L;
    @SerializedName("clusterHardwareInfo") private ClusterHardwareInfo clusterHardwareInfo;

    // empty constructor
    @Since("7.0")
    public GetClusterHardwareInfoResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetClusterHardwareInfoResult(
        ClusterHardwareInfo clusterHardwareInfo
    )
    {
        this.clusterHardwareInfo = clusterHardwareInfo;
    }

    /** 
     * Hardware information for all nodes and drives in the cluster. Each object in this output is labeled with the nodeID of the given node.
     **/
    public ClusterHardwareInfo getClusterHardwareInfo() { return this.clusterHardwareInfo; }
    public void setClusterHardwareInfo(ClusterHardwareInfo clusterHardwareInfo) { 
        this.clusterHardwareInfo = clusterHardwareInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClusterHardwareInfoResult that = (GetClusterHardwareInfoResult) o;

        return 
            Objects.equals(clusterHardwareInfo, that.clusterHardwareInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterHardwareInfo );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterHardwareInfo", clusterHardwareInfo);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterHardwareInfo : ").append(clusterHardwareInfo).append(",");
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
        private ClusterHardwareInfo clusterHardwareInfo;

        private Builder() { }

        public GetClusterHardwareInfoResult build() {
            return new GetClusterHardwareInfoResult (
                         this.clusterHardwareInfo);
        }

        private GetClusterHardwareInfoResult.Builder buildFrom(final GetClusterHardwareInfoResult req) {
            this.clusterHardwareInfo = req.clusterHardwareInfo;

            return this;
        }

        public GetClusterHardwareInfoResult.Builder clusterHardwareInfo(final ClusterHardwareInfo clusterHardwareInfo) {
            this.clusterHardwareInfo = clusterHardwareInfo;
            return this;
        }

    }
}
