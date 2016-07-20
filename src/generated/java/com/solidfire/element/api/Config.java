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

import com.google.gson.annotations.SerializedName;
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
 * 
 **/
public class Config implements Serializable {

    private static final long serialVersionUID = 826439339L;

    @SerializedName("cluster") private final ClusterConfig cluster;
    @SerializedName("network") private final Network network;

    /**
     * 
     * @param cluster [required] 
     * @param network [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public Config(ClusterConfig cluster, Network network) {
        this.cluster = cluster;
        this.network = network;
    }

    public ClusterConfig getCluster() {
        return this.cluster;
    }
    public Network getNetwork() {
        return this.network;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Config that = (Config) o;
        

        return Objects.equals( cluster , that.cluster )
            && Objects.equals( network , that.network );
    }

    @Override
    public int hashCode() {
        return Objects.hash( cluster, network );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" cluster : ").append(cluster).append(",");
        sb.append(" network : ").append(network);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private ClusterConfig cluster;
        private Network network;

        private Builder() { }

        public Config build() {
            return new Config (
                         this.cluster,
                         this.network            );
        }

        private Config.Builder buildFrom(final Config req) {
            this.cluster = req.cluster;
            this.network = req.network;

            return this;
        }

        public Config.Builder cluster(final ClusterConfig cluster) {
            this.cluster = cluster;
            return this;
        }

        public Config.Builder network(final Network network) {
            this.network = network;
            return this;
        }

    }

}
