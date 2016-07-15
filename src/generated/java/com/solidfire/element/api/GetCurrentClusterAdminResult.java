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
 * The object returned by the "GetCurrentClusterAdmin" API Service call.
 **/
public class GetCurrentClusterAdminResult implements Serializable {

    private static final long serialVersionUID = -1693804383L;

    @SerializedName("clusterAdmin") private final ClusterAdmin clusterAdmin;

    /**
     * The object returned by the "GetCurrentClusterAdmin" API Service call.
     * @param clusterAdmin [required] Information about all cluster and LDAP administrators that exist for a cluster.
     * @since 7.0
     **/
    @Since("7.0")
    public GetCurrentClusterAdminResult(ClusterAdmin clusterAdmin) {
        this.clusterAdmin = clusterAdmin;
    }


    /**
     * Information about all cluster and LDAP administrators that exist for a cluster.
     **/
    public ClusterAdmin getClusterAdmin() {
        return this.clusterAdmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetCurrentClusterAdminResult that = (GetCurrentClusterAdminResult) o;
        

        return Objects.equals( clusterAdmin , that.clusterAdmin );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) clusterAdmin );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterAdmin : ").append(clusterAdmin);
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
        private ClusterAdmin clusterAdmin;

        private Builder() { }

        public GetCurrentClusterAdminResult build() {
            return new GetCurrentClusterAdminResult (
                         this.clusterAdmin            );
        }

        private GetCurrentClusterAdminResult.Builder buildFrom(final GetCurrentClusterAdminResult req) {
            this.clusterAdmin = req.clusterAdmin;

            return this;
        }

        public GetCurrentClusterAdminResult.Builder clusterAdmin(final ClusterAdmin clusterAdmin) {
            this.clusterAdmin = clusterAdmin;
            return this;
        }

    }

}
