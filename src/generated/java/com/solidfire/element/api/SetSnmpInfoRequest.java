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
 * SetSnmpInfoRequest  
 * SetSnmpInfo enables you to configure SNMP version 2 and version 3 on cluster nodes. The values you set with this interface apply to
 * all nodes in the cluster, and the values that are passed replace, in whole, all values set in any previous call to SetSnmpInfo.
 * Note: SetSnmpInfo is deprecated. Use the EnableSnmp and SetSnmpACL methods instead.
 **/

public class SetSnmpInfoRequest implements Serializable {

    public static final long serialVersionUID = 8894765621542502170L;
    @SerializedName("networks") private Optional<SnmpNetwork[]> networks;
    @SerializedName("enabled") private Optional<Boolean> enabled;
    @SerializedName("snmpV3Enabled") private Optional<Boolean> snmpV3Enabled;
    @SerializedName("usmUsers") private Optional<SnmpV3UsmUser[]> usmUsers;
    // empty constructor
    @Since("7.0")
    public SetSnmpInfoRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetSnmpInfoRequest(
        Optional<SnmpNetwork[]> networks,
        Optional<Boolean> enabled,
        Optional<Boolean> snmpV3Enabled,
        Optional<SnmpV3UsmUser[]> usmUsers
    )
    {
        this.networks = (networks == null) ? Optional.<SnmpNetwork[]>empty() : networks;
        this.enabled = (enabled == null) ? Optional.<Boolean>empty() : enabled;
        this.snmpV3Enabled = (snmpV3Enabled == null) ? Optional.<Boolean>empty() : snmpV3Enabled;
        this.usmUsers = (usmUsers == null) ? Optional.<SnmpV3UsmUser[]>empty() : usmUsers;
    }

    /** 
     * List of networks and what type of access they have to the
     * SNMP servers running on the cluster nodes. See the SNMP
     * Network Object for possible "networks" values. This parameter is required only for SNMP v2.
     **/
    public Optional<SnmpNetwork[]> getNetworks() { return this.networks; }
   
    public void setNetworks(Optional<SnmpNetwork[]> networks) { 
        this.networks = (networks == null) ? Optional.<SnmpNetwork[]>empty() : networks;
    }
    /** 
     * If set to true, SNMP is enabled on each node in the cluster.
     **/
    public Optional<Boolean> getEnabled() { return this.enabled; }
   
    public void setEnabled(Optional<Boolean> enabled) { 
        this.enabled = (enabled == null) ? Optional.<Boolean>empty() : enabled;
    }
    /** 
     * If set to true, SNMP v3 is enabled on each node in the cluster.
     **/
    public Optional<Boolean> getSnmpV3Enabled() { return this.snmpV3Enabled; }
   
    public void setSnmpV3Enabled(Optional<Boolean> snmpV3Enabled) { 
        this.snmpV3Enabled = (snmpV3Enabled == null) ? Optional.<Boolean>empty() : snmpV3Enabled;
    }
    /** 
     * If SNMP v3 is enabled, this value must be passed in place of the networks parameter. This parameter is required only for SNMP v3.
     **/
    public Optional<SnmpV3UsmUser[]> getUsmUsers() { return this.usmUsers; }
   
    public void setUsmUsers(Optional<SnmpV3UsmUser[]> usmUsers) { 
        this.usmUsers = (usmUsers == null) ? Optional.<SnmpV3UsmUser[]>empty() : usmUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetSnmpInfoRequest that = (SetSnmpInfoRequest) o;

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
        if(null != enabled && enabled.isPresent()){
            sb.append(" enabled : ").append(gson.toJson(enabled)).append(",");
        }
        else{
            sb.append(" enabled : ").append("null").append(",");
        }
        if(null != snmpV3Enabled && snmpV3Enabled.isPresent()){
            sb.append(" snmpV3Enabled : ").append(gson.toJson(snmpV3Enabled)).append(",");
        }
        else{
            sb.append(" snmpV3Enabled : ").append("null").append(",");
        }
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
        private Optional<Boolean> enabled;
        private Optional<Boolean> snmpV3Enabled;
        private Optional<SnmpV3UsmUser[]> usmUsers;

        private Builder() { }

        public SetSnmpInfoRequest build() {
            return new SetSnmpInfoRequest (
                         this.networks,
                         this.enabled,
                         this.snmpV3Enabled,
                         this.usmUsers);
        }

        private SetSnmpInfoRequest.Builder buildFrom(final SetSnmpInfoRequest req) {
            this.networks = req.networks;
            this.enabled = req.enabled;
            this.snmpV3Enabled = req.snmpV3Enabled;
            this.usmUsers = req.usmUsers;

            return this;
        }

        public SetSnmpInfoRequest.Builder optionalNetworks(final SnmpNetwork[] networks) {
            this.networks = (networks == null) ? Optional.<SnmpNetwork[]>empty() : Optional.of(networks);
            return this;
        }

        public SetSnmpInfoRequest.Builder optionalEnabled(final Boolean enabled) {
            this.enabled = (enabled == null) ? Optional.<Boolean>empty() : Optional.of(enabled);
            return this;
        }

        public SetSnmpInfoRequest.Builder optionalSnmpV3Enabled(final Boolean snmpV3Enabled) {
            this.snmpV3Enabled = (snmpV3Enabled == null) ? Optional.<Boolean>empty() : Optional.of(snmpV3Enabled);
            return this;
        }

        public SetSnmpInfoRequest.Builder optionalUsmUsers(final SnmpV3UsmUser[] usmUsers) {
            this.usmUsers = (usmUsers == null) ? Optional.<SnmpV3UsmUser[]>empty() : Optional.of(usmUsers);
            return this;
        }

    }
}
