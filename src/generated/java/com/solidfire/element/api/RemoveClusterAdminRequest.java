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
 * The Request object for the "RemoveClusterAdmin" API Service call.
 **/
public class RemoveClusterAdminRequest implements Serializable {

    private static final long serialVersionUID = -1300089122L;

    private final Long clusterAdminID;

    /**
     * The Request object for the "RemoveClusterAdmin" API Service call.
     * @param clusterAdminID [required] ClusterAdminID for the Cluster Admin to remove.
     * @since 7.0
     **/
    @Since("7.0")
    public RemoveClusterAdminRequest(Long clusterAdminID) {
        this.clusterAdminID = clusterAdminID;
    }


    /**
     * ClusterAdminID for the Cluster Admin to remove.
     **/
    public Long getClusterAdminID() {
        return this.clusterAdminID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveClusterAdminRequest that = (RemoveClusterAdminRequest) o;
        

        return Objects.equals( clusterAdminID , that.clusterAdminID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) clusterAdminID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterAdminID : ").append(clusterAdminID);
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
        private Long clusterAdminID;

        private Builder() { }

        public RemoveClusterAdminRequest toRequest() {
            return new RemoveClusterAdminRequest (
                         this.clusterAdminID            );
        }

        private RemoveClusterAdminRequest.Builder fromRequest(final RemoveClusterAdminRequest req) {
            this.clusterAdminID = req.clusterAdminID;

            return this;
        }

        public RemoveClusterAdminRequest.Builder withClusterAdminID(final Long clusterAdminID) {
            this.clusterAdminID = clusterAdminID;
            return this;
        }

    }

}
