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
 * The object returned by the "GetSnmpInfo" API Service call.
 **/
public class GetSnmpInfoResult  implements Serializable  {

    private static final long serialVersionUID = -1622974191L;

    @SerializedName("networks") private final SnmpNetwork[] networks;
    @SerializedName("enabled") private final Boolean enabled;
    @SerializedName("snmpV3Enabled") private final Boolean snmpV3Enabled;
    @SerializedName("usmUsers") private final SnmpV3UsmUser[] usmUsers;

    /**
     * The object returned by the "GetSnmpInfo" API Service call.
     * @param networks [required] List of networks and access types enabled for SNMP.
     * @param enabled [required] If the nodes in the cluster are configured for SNMP.
     * @param snmpV3Enabled [required] If the nodes in the cluster are configured for SNMP v3.
     * @param usmUsers [required] If SNMP v3 is enabled, the values returned is a list of user access parameters for SNMP information from the cluster. This will be returned instead of the &quot;networks&quot; parameter.
     * @since 7.0
     **/
    @Since("7.0")
    public GetSnmpInfoResult(SnmpNetwork[] networks, Boolean enabled, Boolean snmpV3Enabled, SnmpV3UsmUser[] usmUsers) {
        this.networks = networks;
        this.enabled = enabled;
        this.snmpV3Enabled = snmpV3Enabled;
        this.usmUsers = usmUsers;
    }


    /**
     * List of networks and access types enabled for SNMP.
     * <br/><br/>
     * <b>Note</b>: &quot;networks&quot; will only be present if SNMP V3 is disabled.
     **/
    public SnmpNetwork[] getNetworks() {
        return this.networks;
    }

    /**
     * If the nodes in the cluster are configured for SNMP.
     **/
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * If the nodes in the cluster are configured for SNMP v3.
     **/
    public Boolean getSnmpV3Enabled() {
        return this.snmpV3Enabled;
    }

    /**
     * If SNMP v3 is enabled, the values returned is a list of user access parameters for SNMP information from the cluster. This will be returned instead of the &quot;networks&quot; parameter.
     **/
    public SnmpV3UsmUser[] getUsmUsers() {
        return this.usmUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSnmpInfoResult that = (GetSnmpInfoResult) o;
        

        return Objects.deepEquals( networks , that.networks )
            && Objects.equals( enabled , that.enabled )
            && Objects.equals( snmpV3Enabled , that.snmpV3Enabled )
            && Objects.deepEquals( usmUsers , that.usmUsers );
    }

    @Override
    public int hashCode() {
        return Objects.hash( networks, enabled, snmpV3Enabled, usmUsers );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" networks : ").append(Arrays.toString(networks)).append(",");
        sb.append(" enabled : ").append(enabled).append(",");
        sb.append(" snmpV3Enabled : ").append(snmpV3Enabled).append(",");
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
        private Boolean enabled;
        private Boolean snmpV3Enabled;
        private SnmpV3UsmUser[] usmUsers;

        private Builder() { }

        public GetSnmpInfoResult build() {
            return new GetSnmpInfoResult (
                         this.networks,
                         this.enabled,
                         this.snmpV3Enabled,
                         this.usmUsers            );
        }

        private GetSnmpInfoResult.Builder buildFrom(final GetSnmpInfoResult req) {
            this.networks = req.networks;
            this.enabled = req.enabled;
            this.snmpV3Enabled = req.snmpV3Enabled;
            this.usmUsers = req.usmUsers;

            return this;
        }

        public GetSnmpInfoResult.Builder networks(final SnmpNetwork[] networks) {
            this.networks = networks;
            return this;
        }

        public GetSnmpInfoResult.Builder enabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public GetSnmpInfoResult.Builder snmpV3Enabled(final Boolean snmpV3Enabled) {
            this.snmpV3Enabled = snmpV3Enabled;
            return this;
        }

        public GetSnmpInfoResult.Builder usmUsers(final SnmpV3UsmUser[] usmUsers) {
            this.usmUsers = usmUsers;
            return this;
        }

    }

}
