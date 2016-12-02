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
 * 
 **/

public class SetSnmpACLRequest implements Serializable {

    public static final long serialVersionUID = 6271612792860104518L;
    @SerializedName("networks") private SnmpNetwork[] networks;
    @SerializedName("usmUsers") private SnmpV3UsmUser[] usmUsers;

    // empty constructor
    @Since("7.0")
    public SetSnmpACLRequest() {}

    // parameterized constructor
    @Since("7.0")
    public SetSnmpACLRequest(
        SnmpNetwork[] networks,
        SnmpV3UsmUser[] usmUsers
    )
    {
        this.networks = networks;
        this.usmUsers = usmUsers;
    }

    /** 
     * List of networks and what type of access they have to the SNMP servers running on the cluster nodes. See SNMP Network Object for possible "networks" values. REQUIRED if SNMP v# is disabled.
     **/
    public SnmpNetwork[] getNetworks() { return this.networks; }
    public void setNetworks(SnmpNetwork[] networks) { 
        this.networks = networks;
    }
    /** 
     * List of users and the type of access they have to the SNMP servers running on the cluster nodes. REQUIRED if SNMP v3 is enabled.
     **/
    public SnmpV3UsmUser[] getUsmUsers() { return this.usmUsers; }
    public void setUsmUsers(SnmpV3UsmUser[] usmUsers) { 
        this.usmUsers = usmUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetSnmpACLRequest that = (SetSnmpACLRequest) o;

        return 
            Arrays.equals(networks, that.networks) &&
            Arrays.equals(usmUsers, that.usmUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])networks, (Object[])usmUsers );
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

        sb.append(" networks : ").append(Arrays.toString(networks)).append(",");
        sb.append(" usmUsers : ").append(Arrays.toString(usmUsers)).append(",");
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
        private SnmpNetwork[] networks;
        private SnmpV3UsmUser[] usmUsers;

        private Builder() { }

        public SetSnmpACLRequest build() {
            return new SetSnmpACLRequest (
                         this.networks,
                         this.usmUsers);
        }

        private SetSnmpACLRequest.Builder buildFrom(final SetSnmpACLRequest req) {
            this.networks = req.networks;
            this.usmUsers = req.usmUsers;

            return this;
        }

        public SetSnmpACLRequest.Builder networks(final SnmpNetwork[] networks) {
            this.networks = networks;
            return this;
        }

        public SetSnmpACLRequest.Builder usmUsers(final SnmpV3UsmUser[] usmUsers) {
            this.usmUsers = usmUsers;
            return this;
        }

    }
}
