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
 * Fibre channel port info results for a node.
 **/
public class NodeFibreChannelPortInfoResult  implements Serializable  {

    private static final long serialVersionUID = -473622851L;

    @SerializedName("nodeID") private final Long nodeID;
    @SerializedName("result") private final FibreChannelPortList result;

    /**
     * Fibre channel port info results for a node.
     * @param nodeID [required] The ID of the Fibre Channel node.
     * @param result [required] Contains a list of information about the Fibre Channel ports.
     * @since 7.0
     **/
    @Since("7.0")
    public NodeFibreChannelPortInfoResult(Long nodeID, FibreChannelPortList result) {
        this.nodeID = nodeID;
        this.result = result;
    }


    /**
     * The ID of the Fibre Channel node.
     **/
    public Long getNodeID() {
        return this.nodeID;
    }

    /**
     * Contains a list of information about the Fibre Channel ports.
     **/
    public FibreChannelPortList getResult() {
        return this.result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeFibreChannelPortInfoResult that = (NodeFibreChannelPortInfoResult) o;
        

        return Objects.equals( nodeID , that.nodeID )
            && Objects.equals( result , that.result );
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeID, result );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" result : ").append(result);
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
        private Long nodeID;
        private FibreChannelPortList result;

        private Builder() { }

        public NodeFibreChannelPortInfoResult build() {
            return new NodeFibreChannelPortInfoResult (
                         this.nodeID,
                         this.result            );
        }

        private NodeFibreChannelPortInfoResult.Builder buildFrom(final NodeFibreChannelPortInfoResult req) {
            this.nodeID = req.nodeID;
            this.result = req.result;

            return this;
        }

        public NodeFibreChannelPortInfoResult.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public NodeFibreChannelPortInfoResult.Builder result(final FibreChannelPortList result) {
            this.result = result;
            return this;
        }

    }

}
