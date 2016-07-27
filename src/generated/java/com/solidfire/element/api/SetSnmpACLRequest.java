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
 * The Request object for the "SetSnmpACL" API Service call.
 **/
public class SetSnmpACLRequest  implements Serializable  {

    private static final long serialVersionUID = 1142496615L;

    @SerializedName("networks") private final SnmpNetwork[] networks;
    @SerializedName("usmUsers") private final SnmpV3UsmUser[] usmUsers;

    /**
     * The Request object for the "SetSnmpACL" API Service call.
     * @param networks [required] List of networks and what type of access they have to the SNMP servers running on the cluster nodes. See SNMP Network Object for possible &quot;networks&quot; values. REQUIRED if SNMP v# is disabled.
     * @param usmUsers [required] List of users and the type of access they have to the SNMP servers running on the cluster nodes. REQUIRED if SNMP v3 is enabled.
     * @since 8.0
     **/
    @Since("8.0")
    public SetSnmpACLRequest(SnmpNetwork[] networks, SnmpV3UsmUser[] usmUsers) {
        this.networks = networks;
        this.usmUsers = usmUsers;
    }


    /**
     * List of networks and what type of access they have to the SNMP servers running on the cluster nodes. See SNMP Network Object for possible &quot;networks&quot; values. REQUIRED if SNMP v# is disabled.
     **/
    public SnmpNetwork[] getNetworks() {
        return this.networks;
    }

    /**
     * List of users and the type of access they have to the SNMP servers running on the cluster nodes. REQUIRED if SNMP v3 is enabled.
     **/
    public SnmpV3UsmUser[] getUsmUsers() {
        return this.usmUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetSnmpACLRequest that = (SetSnmpACLRequest) o;
        

        return Objects.deepEquals( networks , that.networks )
            && Objects.deepEquals( usmUsers , that.usmUsers );
    }

    @Override
    public int hashCode() {
        return Objects.hash( networks, usmUsers );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" networks : ").append(Arrays.toString(networks)).append(",");
        sb.append(" usmUsers : ").append(Arrays.toString(usmUsers));
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
        private SnmpNetwork[] networks;
        private SnmpV3UsmUser[] usmUsers;

        private Builder() { }

        public SetSnmpACLRequest build() {
            return new SetSnmpACLRequest (
                         this.networks,
                         this.usmUsers            );
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
