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
 * The Request object for the "RemoveNodes" API Service call.
 **/
public class RemoveNodesRequest implements Serializable {

    private static final long serialVersionUID = 245470440L;

    private final Long[] nodes;

    /**
     * The Request object for the "RemoveNodes" API Service call.
     * @param nodes [required] List of NodeIDs for the nodes to be removed.
     * @since 7.0
     **/
    @Since("7.0")
    public RemoveNodesRequest(Long[] nodes) {
        this.nodes = nodes;
    }


    /**
     * List of NodeIDs for the nodes to be removed.
     **/
    public Long[] getNodes() {
        return this.nodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveNodesRequest that = (RemoveNodesRequest) o;
        

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

    public static final Builder getBuilder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().fromRequest(this);
    }

    public static class Builder {
        private Long[] nodes;

        private Builder() { }

        public RemoveNodesRequest toRequest() {
            return new RemoveNodesRequest (
                         this.nodes            );
        }

        private RemoveNodesRequest.Builder fromRequest(final RemoveNodesRequest req) {
            this.nodes = req.nodes;

            return this;
        }

        public RemoveNodesRequest.Builder withNodes(final Long[] nodes) {
            this.nodes = nodes;
            return this;
        }

    }

}
