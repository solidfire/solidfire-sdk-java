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
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * AddLdapClusterAdminResult  
 **/

public class AddLdapClusterAdminResult implements Serializable {

    public static final long serialVersionUID = -211857056885111049L;
    @SerializedName("clusterAdminID") private Optional<Long> clusterAdminID;

    // empty constructor
    @Since("7.0")
    public AddLdapClusterAdminResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddLdapClusterAdminResult(
        Optional<Long> clusterAdminID
    )
    {
        this.clusterAdminID = (clusterAdminID == null) ? Optional.<Long>empty() : clusterAdminID;
    }

    /** 
     * 
     **/
    public Optional<Long> getClusterAdminID() { return this.clusterAdminID; }
    public void setClusterAdminID(Optional<Long> clusterAdminID) { 
        this.clusterAdminID = (clusterAdminID == null) ? Optional.<Long>empty() : clusterAdminID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddLdapClusterAdminResult that = (AddLdapClusterAdminResult) o;

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
        sb.append( "{ " );

        if(null != clusterAdminID && clusterAdminID.isPresent()){
            sb.append(" clusterAdminID : ").append(clusterAdminID).append(",");
        }
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
        private Optional<Long> clusterAdminID;

        private Builder() { }

        public AddLdapClusterAdminResult build() {
            return new AddLdapClusterAdminResult (
                         this.clusterAdminID);
        }

        private AddLdapClusterAdminResult.Builder buildFrom(final AddLdapClusterAdminResult req) {
            this.clusterAdminID = req.clusterAdminID;

            return this;
        }

        public AddLdapClusterAdminResult.Builder optional(final Long clusterAdminID) {
            this.clusterAdminID = (clusterAdminID == null) ? Optional.<Long>empty() : Optional.of(clusterAdminID);
            return this;
        }

    }
}
