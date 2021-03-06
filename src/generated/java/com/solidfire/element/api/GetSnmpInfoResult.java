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
 * GetSnmpInfoResult  
 **/

public class GetSnmpInfoResult implements Serializable {

    public static final long serialVersionUID = -3944650280790738737L;
    @SerializedName("networks") private Optional<SnmpNetwork[]> networks;
    @SerializedName("enabled") private Boolean enabled;
    @SerializedName("snmpV3Enabled") private Boolean snmpV3Enabled;
    @SerializedName("usmUsers") private Optional<SnmpV3UsmUser[]> usmUsers;
    // empty constructor
    @Since("7.0")
    public GetSnmpInfoResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetSnmpInfoResult(
        Optional<SnmpNetwork[]> networks,
        Boolean enabled,
        Boolean snmpV3Enabled,
        Optional<SnmpV3UsmUser[]> usmUsers
    )
    {
        this.networks = (networks == null) ? Optional.<SnmpNetwork[]>empty() : networks;
        this.enabled = enabled;
        this.snmpV3Enabled = snmpV3Enabled;
        this.usmUsers = (usmUsers == null) ? Optional.<SnmpV3UsmUser[]>empty() : usmUsers;
    }

    /** 
     * List of networks and access types enabled for SNMP.
     * 
     * Note: "networks" will only be present if SNMP V3 is disabled.
     **/
    public Optional<SnmpNetwork[]> getNetworks() { return this.networks; }
   
    public void setNetworks(Optional<SnmpNetwork[]> networks) { 
        this.networks = (networks == null) ? Optional.<SnmpNetwork[]>empty() : networks;
    }
    /** 
     * If the nodes in the cluster are configured for SNMP.
     **/
    public Boolean getEnabled() { return this.enabled; }
   
    public void setEnabled(Boolean enabled) { 
        this.enabled = enabled;
    }
    /** 
     * If the nodes in the cluster are configured for SNMP v3.
     **/
    public Boolean getSnmpV3Enabled() { return this.snmpV3Enabled; }
   
    public void setSnmpV3Enabled(Boolean snmpV3Enabled) { 
        this.snmpV3Enabled = snmpV3Enabled;
    }
    /** 
     * If SNMP v3 is enabled, the values returned is a list of user access parameters for SNMP information from the cluster. This will be returned instead of the "networks" parameter.
     **/
    public Optional<SnmpV3UsmUser[]> getUsmUsers() { return this.usmUsers; }
   
    public void setUsmUsers(Optional<SnmpV3UsmUser[]> usmUsers) { 
        this.usmUsers = (usmUsers == null) ? Optional.<SnmpV3UsmUser[]>empty() : usmUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSnmpInfoResult that = (GetSnmpInfoResult) o;

        return 
            Objects.equals(networks, that.networks) && 
            Objects.equals(enabled, that.enabled) && 
            Objects.equals(snmpV3Enabled, that.snmpV3Enabled) && 
            Objects.equals(usmUsers, that.usmUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash( networks,enabled,snmpV3Enabled,usmUsers );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("networks", networks);
        map.put("enabled", enabled);
        map.put("snmpV3Enabled", snmpV3Enabled);
        map.put("usmUsers", usmUsers);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != networks && networks.isPresent()){
            sb.append(" networks : ").append(gson.toJson(networks)).append(",");
        }
        else{
            sb.append(" networks : ").append("null").append(",");
        }
        sb.append(" enabled : ").append(gson.toJson(enabled)).append(",");
        sb.append(" snmpV3Enabled : ").append(gson.toJson(snmpV3Enabled)).append(",");
        if(null != usmUsers && usmUsers.isPresent()){
            sb.append(" usmUsers : ").append(gson.toJson(usmUsers)).append(",");
        }
        else{
            sb.append(" usmUsers : ").append("null").append(",");
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
        private Boolean enabled;
        private Boolean snmpV3Enabled;
        private Optional<SnmpV3UsmUser[]> usmUsers;

        private Builder() { }

        public GetSnmpInfoResult build() {
            return new GetSnmpInfoResult (
                         this.networks,
                         this.enabled,
                         this.snmpV3Enabled,
                         this.usmUsers);
        }

        private GetSnmpInfoResult.Builder buildFrom(final GetSnmpInfoResult req) {
            this.networks = req.networks;
            this.enabled = req.enabled;
            this.snmpV3Enabled = req.snmpV3Enabled;
            this.usmUsers = req.usmUsers;

            return this;
        }

        public GetSnmpInfoResult.Builder optionalNetworks(final SnmpNetwork[] networks) {
            this.networks = (networks == null) ? Optional.<SnmpNetwork[]>empty() : Optional.of(networks);
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

        public GetSnmpInfoResult.Builder optionalUsmUsers(final SnmpV3UsmUser[] usmUsers) {
            this.usmUsers = (usmUsers == null) ? Optional.<SnmpV3UsmUser[]>empty() : Optional.of(usmUsers);
            return this;
        }

    }
}
