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
 * The object returned by the "ListClusterAdmins" API Service call.
 **/
public class ListClusterAdminsResult  implements Serializable  {

    private static final long serialVersionUID = 1108634933L;

    @SerializedName("clusterAdmins") private final ClusterAdmin[] clusterAdmins;

    /**
     * The object returned by the "ListClusterAdmins" API Service call.
     * @param clusterAdmins [required] Information about the cluster admin.
     * @since 7.0
     **/
    @Since("7.0")
    public ListClusterAdminsResult(ClusterAdmin[] clusterAdmins) {
        this.clusterAdmins = clusterAdmins;
    }


    /**
     * Information about the cluster admin.
     **/
    public ClusterAdmin[] getClusterAdmins() {
        return this.clusterAdmins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListClusterAdminsResult that = (ListClusterAdminsResult) o;
        

        return Objects.deepEquals( clusterAdmins , that.clusterAdmins );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) clusterAdmins );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" clusterAdmins : ").append(Arrays.toString(clusterAdmins));
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
        private ClusterAdmin[] clusterAdmins;

        private Builder() { }

        public ListClusterAdminsResult build() {
            return new ListClusterAdminsResult (
                         this.clusterAdmins            );
        }

        private ListClusterAdminsResult.Builder buildFrom(final ListClusterAdminsResult req) {
            this.clusterAdmins = req.clusterAdmins;

            return this;
        }

        public ListClusterAdminsResult.Builder clusterAdmins(final ClusterAdmin[] clusterAdmins) {
            this.clusterAdmins = clusterAdmins;
            return this;
        }

    }

}
