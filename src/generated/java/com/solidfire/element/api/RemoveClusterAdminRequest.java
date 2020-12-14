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
 * RemoveClusterAdminRequest  
 * One can use this API to remove a local cluster admin, an LDAP cluster admin, or a third 
 * party Identity Provider (IdP) cluster admin.  
 * One cannot remove the administrator cluster admin account.  
 * When an IdP Admin is removed that has authenticated sessions associated with a third party 
 * Identity Provider (IdP), those sessions will either logout or possibly experience a loss of 
 * access rights within their current session.  The access rights loss will depend on whether the 
 * removed IdP cluster admin matched one of multiple IdP cluster admins from a given user's 
 * SAML Attributes and the remaining set of matching IdP cluster admins results in a reduced 
 * set of aggregate access rights.  
 * Other cluster admin user types will be logged out upon their cluster admin removal.
 **/

public class RemoveClusterAdminRequest implements Serializable {

    public static final long serialVersionUID = -8686765444087178008L;
    @SerializedName("clusterAdminID") private Long clusterAdminID;
    // empty constructor
    @Since("7.0")
    public RemoveClusterAdminRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public RemoveClusterAdminRequest(
        Long clusterAdminID
    )
    {
        this.clusterAdminID = clusterAdminID;
    }

    /** 
     * ClusterAdminID for the cluster admin to remove.
     **/
    public Long getClusterAdminID() { return this.clusterAdminID; }
   
    public void setClusterAdminID(Long clusterAdminID) { 
        this.clusterAdminID = clusterAdminID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveClusterAdminRequest that = (RemoveClusterAdminRequest) o;

        return 
            Objects.equals(clusterAdminID, that.clusterAdminID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterAdminID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterAdminID", clusterAdminID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" clusterAdminID : ").append(gson.toJson(clusterAdminID)).append(",");
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
        private Long clusterAdminID;

        private Builder() { }

        public RemoveClusterAdminRequest build() {
            return new RemoveClusterAdminRequest (
                         this.clusterAdminID);
        }

        private RemoveClusterAdminRequest.Builder buildFrom(final RemoveClusterAdminRequest req) {
            this.clusterAdminID = req.clusterAdminID;

            return this;
        }

        public RemoveClusterAdminRequest.Builder clusterAdminID(final Long clusterAdminID) {
            this.clusterAdminID = clusterAdminID;
            return this;
        }

    }
}
