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
 * The object returned by the "GetClusterHardwareInfo" API Service call.
 **/
public class GetClusterHardwareInfoResult  implements Serializable  {

    private static final long serialVersionUID = -616052708L;

    @SerializedName("clusterHardwareInfo") private final ClusterHardwareInfo clusterHardwareInfo;

    /**
     * The object returned by the "GetClusterHardwareInfo" API Service call.
     * @param clusterHardwareInfo [required] Hardware information for all nodes and drives in the cluster. Each object in this output is labeled with the nodeID of the given node.
     * @since 7.0
     **/
    @Since("7.0")
    public GetClusterHardwareInfoResult(ClusterHardwareInfo clusterHardwareInfo) {
        this.clusterHardwareInfo = clusterHardwareInfo;
    }


    /**
     * Hardware information for all nodes and drives in the cluster. Each object in this output is labeled with the nodeID of the given node.
     **/
    public ClusterHardwareInfo getClusterHardwareInfo() {
        return this.clusterHardwareInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClusterHardwareInfoResult that = (GetClusterHardwareInfoResult) o;
        

        return Objects.equals( clusterHardwareInfo , that.clusterHardwareInfo );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) clusterHardwareInfo );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterHardwareInfo : ").append(clusterHardwareInfo);
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
                         this.clusterHardwareInfo            );
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
