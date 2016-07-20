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
 * List of fibre channel port info results grouped by node.
 **/
public class ListNodeFibreChannelPortInfoResult implements Serializable {

    private static final long serialVersionUID = 994815780L;

    @SerializedName("nodes") private final NodeFibreChannelPortInfoResult[] nodes;

    /**
     * List of fibre channel port info results grouped by node.
     * @param nodes [required] List of fibre channel port info results grouped by node.
     * @since 7.0
     **/
    @Since("7.0")
    public ListNodeFibreChannelPortInfoResult(NodeFibreChannelPortInfoResult[] nodes) {
        this.nodes = nodes;
    }


    /**
     * List of fibre channel port info results grouped by node.
     **/
    public NodeFibreChannelPortInfoResult[] getNodes() {
        return this.nodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNodeFibreChannelPortInfoResult that = (ListNodeFibreChannelPortInfoResult) o;
        

        return Objects.deepEquals( nodes , that.nodes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) nodes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodes : ").append(Arrays.toString(nodes));
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
        private NodeFibreChannelPortInfoResult[] nodes;

        private Builder() { }

        public ListNodeFibreChannelPortInfoResult build() {
            return new ListNodeFibreChannelPortInfoResult (
                         this.nodes            );
        }

        private ListNodeFibreChannelPortInfoResult.Builder buildFrom(final ListNodeFibreChannelPortInfoResult req) {
            this.nodes = req.nodes;

            return this;
        }

        public ListNodeFibreChannelPortInfoResult.Builder nodes(final NodeFibreChannelPortInfoResult[] nodes) {
            this.nodes = nodes;
            return this;
        }

    }

}
