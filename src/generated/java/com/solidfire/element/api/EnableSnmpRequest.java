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
 * EnableSnmpRequest  
 * EnableSnmp enables you to enable SNMP on cluster nodes. When you enable SNMP, the action applies to all nodes in the cluster, and
 * the values that are passed replace, in whole, all values set in any previous call to EnableSnmp.
 **/

public class EnableSnmpRequest implements Serializable {

    public static final long serialVersionUID = 342069301080215652L;
    @SerializedName("snmpV3Enabled") private Boolean snmpV3Enabled;
    // empty constructor
    @Since("7.0")
    public EnableSnmpRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public EnableSnmpRequest(
        Boolean snmpV3Enabled
    )
    {
        this.snmpV3Enabled = snmpV3Enabled;
    }

    /** 
     * If set to "true", then SNMP v3 is enabled on each node in the
     * cluster. If set to "false", then SNMP v2 is enabled.
     **/
    public Boolean getSnmpV3Enabled() { return this.snmpV3Enabled; }
   
    public void setSnmpV3Enabled(Boolean snmpV3Enabled) { 
        this.snmpV3Enabled = snmpV3Enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnableSnmpRequest that = (EnableSnmpRequest) o;

        return 
            Objects.equals(snmpV3Enabled, that.snmpV3Enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snmpV3Enabled );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snmpV3Enabled", snmpV3Enabled);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snmpV3Enabled : ").append(gson.toJson(snmpV3Enabled)).append(",");
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
        private Boolean snmpV3Enabled;

        private Builder() { }

        public EnableSnmpRequest build() {
            return new EnableSnmpRequest (
                         this.snmpV3Enabled);
        }

        private EnableSnmpRequest.Builder buildFrom(final EnableSnmpRequest req) {
            this.snmpV3Enabled = req.snmpV3Enabled;

            return this;
        }

        public EnableSnmpRequest.Builder snmpV3Enabled(final Boolean snmpV3Enabled) {
            this.snmpV3Enabled = snmpV3Enabled;
            return this;
        }

    }
}
