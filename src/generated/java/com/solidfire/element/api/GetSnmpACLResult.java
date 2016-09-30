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
 * The object returned by the "GetSnmpACL" API Service call.
 **/
public class GetSnmpACLResult  implements Serializable  {

    private static final long serialVersionUID = -1538058029L;

    @SerializedName("networks") private final SnmpNetwork[] networks;
    @SerializedName("usmUsers") private final SnmpV3UsmUser[] usmUsers;

    /**
     * The object returned by the "GetSnmpACL" API Service call.
     * @param networks [required] List of networks and what type of access they have to the SNMP servers running on the cluster nodes. Present if SNMP v3 is disabled.
     * @param usmUsers [required] List of users and the type of access they have to the SNMP servers running on the cluster nodes. Present if SNMP v3 is enabled.
     * @since 7.0
     **/
    @Since("7.0")
    public GetSnmpACLResult(SnmpNetwork[] networks, SnmpV3UsmUser[] usmUsers) {
        this.networks = networks;
        this.usmUsers = usmUsers;
    }


    /**
     * List of networks and what type of access they have to the SNMP servers running on the cluster nodes. Present if SNMP v3 is disabled.
     **/
    public SnmpNetwork[] getNetworks() {
        return this.networks;
    }

    /**
     * List of users and the type of access they have to the SNMP servers running on the cluster nodes. Present if SNMP v3 is enabled.
     **/
    public SnmpV3UsmUser[] getUsmUsers() {
        return this.usmUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSnmpACLResult that = (GetSnmpACLResult) o;
        

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

        public GetSnmpACLResult build() {
            return new GetSnmpACLResult (
                         this.networks,
                         this.usmUsers            );
        }

        private GetSnmpACLResult.Builder buildFrom(final GetSnmpACLResult req) {
            this.networks = req.networks;
            this.usmUsers = req.usmUsers;

            return this;
        }

        public GetSnmpACLResult.Builder networks(final SnmpNetwork[] networks) {
            this.networks = networks;
            return this;
        }

        public GetSnmpACLResult.Builder usmUsers(final SnmpV3UsmUser[] usmUsers) {
            this.usmUsers = usmUsers;
            return this;
        }

    }

}
