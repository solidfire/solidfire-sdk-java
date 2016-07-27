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
 * The object returned by the "ListNodeStats" API Service call.
 **/
public class ListNodeStatsResult  implements Serializable  {

    private static final long serialVersionUID = 1393950355L;

    @SerializedName("nodeStats") private final NodeStatsNodes nodeStats;

    /**
     * The object returned by the "ListNodeStats" API Service call.
     * @param nodeStats [required] Node activity information for all nodes.
     * @since 7.0
     **/
    @Since("7.0")
    public ListNodeStatsResult(NodeStatsNodes nodeStats) {
        this.nodeStats = nodeStats;
    }


    /**
     * Node activity information for all nodes.
     **/
    public NodeStatsNodes getNodeStats() {
        return this.nodeStats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNodeStatsResult that = (ListNodeStatsResult) o;
        

        return Objects.equals( nodeStats , that.nodeStats );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) nodeStats );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodeStats : ").append(nodeStats);
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
        private NodeStatsNodes nodeStats;

        private Builder() { }

        public ListNodeStatsResult build() {
            return new ListNodeStatsResult (
                         this.nodeStats            );
        }

        private ListNodeStatsResult.Builder buildFrom(final ListNodeStatsResult req) {
            this.nodeStats = req.nodeStats;

            return this;
        }

        public ListNodeStatsResult.Builder nodeStats(final NodeStatsNodes nodeStats) {
            this.nodeStats = nodeStats;
            return this;
        }

    }

}
