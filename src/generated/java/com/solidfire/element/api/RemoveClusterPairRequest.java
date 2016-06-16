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
 * The Request object for the "RemoveClusterPair" API Service call.
 **/
public class RemoveClusterPairRequest implements Serializable {

    private static final long serialVersionUID = 1684976798L;

    @SerializedName("clusterPairID") private final Long clusterPairID;

    /**
     * The Request object for the "RemoveClusterPair" API Service call.
     * @param clusterPairID [required] Unique identifier used to pair two clusters.
     * @since 7.0
     **/
    @Since("7.0")
    public RemoveClusterPairRequest(Long clusterPairID) {
        this.clusterPairID = clusterPairID;
    }


    /**
     * Unique identifier used to pair two clusters.
     **/
    public Long getClusterPairID() {
        return this.clusterPairID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveClusterPairRequest that = (RemoveClusterPairRequest) o;
        

        return Objects.equals( clusterPairID , that.clusterPairID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) clusterPairID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterPairID : ").append(clusterPairID);
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
        private Long clusterPairID;

        private Builder() { }

        public RemoveClusterPairRequest build() {
            return new RemoveClusterPairRequest (
                         this.clusterPairID            );
        }

        private RemoveClusterPairRequest.Builder buildFrom(final RemoveClusterPairRequest req) {
            this.clusterPairID = req.clusterPairID;

            return this;
        }

        public RemoveClusterPairRequest.Builder clusterPairID(final Long clusterPairID) {
            this.clusterPairID = clusterPairID;
            return this;
        }

    }

}
