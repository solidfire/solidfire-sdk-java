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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetCurrentClusterAdminResult  
 **/

public class GetCurrentClusterAdminResult implements Serializable {

    public static final long serialVersionUID = -4184634859010412437L;
    @SerializedName("clusterAdmin") private ClusterAdmin clusterAdmin;
    // empty constructor
    @Since("7.0")
    public GetCurrentClusterAdminResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetCurrentClusterAdminResult(
        ClusterAdmin clusterAdmin
    )
    {
        this.clusterAdmin = clusterAdmin;
    }

    /** 
     * Information about the calling ClusterAdmin.
     * In case the returned ClusterAdmin object has authMethod value of Ldap or Idp: 
     *         The access field may contain data aggregated from multiple LdapAdmins or IdpAdmins.
     *         If this is the case, the clusterAdminId will be set to -1 to indicate that there may not be a unique, 1:1 mapping of the calling ClusterAdmin with a ClusterAdmin on the cluster.
     **/
    public ClusterAdmin getClusterAdmin() { return this.clusterAdmin; }
   
    public void setClusterAdmin(ClusterAdmin clusterAdmin) { 
        this.clusterAdmin = clusterAdmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetCurrentClusterAdminResult that = (GetCurrentClusterAdminResult) o;

        return 
            Objects.equals(clusterAdmin, that.clusterAdmin);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterAdmin );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterAdmin", clusterAdmin);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" clusterAdmin : ").append(gson.toJson(clusterAdmin)).append(",");
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
        private ClusterAdmin clusterAdmin;

        private Builder() { }

        public GetCurrentClusterAdminResult build() {
            return new GetCurrentClusterAdminResult (
                         this.clusterAdmin);
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
