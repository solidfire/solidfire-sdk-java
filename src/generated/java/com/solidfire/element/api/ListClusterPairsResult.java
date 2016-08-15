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
 * The object returned by the "ListClusterPairs" API Service call.
 **/
public class ListClusterPairsResult  implements Serializable  {

    private static final long serialVersionUID = -1996808640L;

    @SerializedName("clusterPairs") private final PairedCluster[] clusterPairs;

    /**
     * The object returned by the "ListClusterPairs" API Service call.
     * @param clusterPairs [required] Information about each paired cluster.
     * @since 7.0
     **/
    @Since("7.0")
    public ListClusterPairsResult(PairedCluster[] clusterPairs) {
        this.clusterPairs = clusterPairs;
    }


    /**
     * Information about each paired cluster.
     **/
    public PairedCluster[] getClusterPairs() {
        return this.clusterPairs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListClusterPairsResult that = (ListClusterPairsResult) o;
        

        return Objects.deepEquals( clusterPairs , that.clusterPairs );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) clusterPairs );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterPairs : ").append(Arrays.toString(clusterPairs));
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
        private PairedCluster[] clusterPairs;

        private Builder() { }

        public ListClusterPairsResult build() {
            return new ListClusterPairsResult (
                         this.clusterPairs            );
        }

        private ListClusterPairsResult.Builder buildFrom(final ListClusterPairsResult req) {
            this.clusterPairs = req.clusterPairs;

            return this;
        }

        public ListClusterPairsResult.Builder clusterPairs(final PairedCluster[] clusterPairs) {
            this.clusterPairs = clusterPairs;
            return this;
        }

    }

}
