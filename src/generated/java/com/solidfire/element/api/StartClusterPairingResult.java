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
 * The object returned by the "StartClusterPairing" API Service call.
 **/
public class StartClusterPairingResult implements Serializable {

    private static final long serialVersionUID = -1770259800L;

    @SerializedName("clusterPairingKey") private final String clusterPairingKey;
    @SerializedName("clusterPairID") private final Long clusterPairID;

    /**
     * The object returned by the "StartClusterPairing" API Service call.
     * @param clusterPairingKey [required] A string of characters that is used by the "CompleteClusterPairing" API method.
     * @param clusterPairID [required] Unique identifier for the cluster pair.
     * @since 7.0
     **/
    @Since("7.0")
    public StartClusterPairingResult(String clusterPairingKey, Long clusterPairID) {
        this.clusterPairingKey = clusterPairingKey;
        this.clusterPairID = clusterPairID;
    }


    /**
     * A string of characters that is used by the "CompleteClusterPairing" API method.
     **/
    public String getClusterPairingKey() {
        return this.clusterPairingKey;
    }

    /**
     * Unique identifier for the cluster pair.
     **/
    public Long getClusterPairID() {
        return this.clusterPairID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StartClusterPairingResult that = (StartClusterPairingResult) o;
        

        return Objects.equals( clusterPairingKey , that.clusterPairingKey )
            && Objects.equals( clusterPairID , that.clusterPairID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterPairingKey, clusterPairID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterPairingKey : ").append(clusterPairingKey).append(",");
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
        private String clusterPairingKey;
        private Long clusterPairID;

        private Builder() { }

        public StartClusterPairingResult build() {
            return new StartClusterPairingResult (
                         this.clusterPairingKey,
                         this.clusterPairID            );
        }

        private StartClusterPairingResult.Builder buildFrom(final StartClusterPairingResult req) {
            this.clusterPairingKey = req.clusterPairingKey;
            this.clusterPairID = req.clusterPairID;

            return this;
        }

        public StartClusterPairingResult.Builder clusterPairingKey(final String clusterPairingKey) {
            this.clusterPairingKey = clusterPairingKey;
            return this;
        }

        public StartClusterPairingResult.Builder clusterPairID(final Long clusterPairID) {
            this.clusterPairID = clusterPairID;
            return this;
        }

    }

}
