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
 * GetSnmpACLResult  
 **/

public class GetSnmpACLResult implements Serializable {

    public static final long serialVersionUID = 5085918780635082491L;
    @SerializedName("networks") private Optional<SnmpNetwork[]> networks;
    @SerializedName("usmUsers") private Optional<SnmpV3UsmUser[]> usmUsers;

    // empty constructor
    @Since("7.0")
    public GetSnmpACLResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetSnmpACLResult(
        Optional<SnmpNetwork[]> networks,
        Optional<SnmpV3UsmUser[]> usmUsers
    )
    {
        this.networks = (networks == null) ? Optional.<SnmpNetwork[]>empty() : networks;
        this.usmUsers = (usmUsers == null) ? Optional.<SnmpV3UsmUser[]>empty() : usmUsers;
    }

    /** 
     * List of networks and what type of access they have to the SNMP servers running on the cluster nodes. Present if SNMP v3 is disabled.
     **/
    public Optional<SnmpNetwork[]> getNetworks() { return this.networks; }
    public void setNetworks(Optional<SnmpNetwork[]> networks) { 
        this.networks = (networks == null) ? Optional.<SnmpNetwork[]>empty() : networks;
    }
    /** 
     * List of users and the type of access they have to the SNMP servers running on the cluster nodes. Present if SNMP v3 is enabled.
     **/
    public Optional<SnmpV3UsmUser[]> getUsmUsers() { return this.usmUsers; }
    public void setUsmUsers(Optional<SnmpV3UsmUser[]> usmUsers) { 
        this.usmUsers = (usmUsers == null) ? Optional.<SnmpV3UsmUser[]>empty() : usmUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSnmpACLResult that = (GetSnmpACLResult) o;

        return 
            Objects.equals(networks, that.networks) && 
            Objects.equals(usmUsers, that.usmUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash( networks,usmUsers );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("networks", networks);
        map.put("usmUsers", usmUsers);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != networks && networks.isPresent()){
            sb.append(" networks : ").append(networks).append(",");
        }
        if(null != usmUsers && usmUsers.isPresent()){
            sb.append(" usmUsers : ").append(usmUsers).append(",");
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
        private Optional<SnmpNetwork[]> networks;
        private Optional<SnmpV3UsmUser[]> usmUsers;

        private Builder() { }

        public GetSnmpACLResult build() {
            return new GetSnmpACLResult (
                         this.networks,
                         this.usmUsers);
        }

        private GetSnmpACLResult.Builder buildFrom(final GetSnmpACLResult req) {
            this.networks = req.networks;
            this.usmUsers = req.usmUsers;

            return this;
        }

        public GetSnmpACLResult.Builder optionalNetworks(final SnmpNetwork[] networks) {
            this.networks = (networks == null) ? Optional.<SnmpNetwork[]>empty() : Optional.of(networks);
            return this;
        }

        public GetSnmpACLResult.Builder optionalUsmUsers(final SnmpV3UsmUser[] usmUsers) {
            this.usmUsers = (usmUsers == null) ? Optional.<SnmpV3UsmUser[]>empty() : Optional.of(usmUsers);
            return this;
        }

    }
}
