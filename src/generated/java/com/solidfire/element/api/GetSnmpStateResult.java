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

public class GetSnmpStateResult implements Serializable {

    public static final long serialVersionUID = 6113235952334962570L;
    @SerializedName("enabled") private Boolean enabled;
    @SerializedName("snmpV3Enabled") private Boolean snmpV3Enabled;

    // empty constructor
    @Since("7.0")
    public GetSnmpStateResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetSnmpStateResult(
        Boolean enabled,
        Boolean snmpV3Enabled
    )
    {
        this.enabled = enabled;
        this.snmpV3Enabled = snmpV3Enabled;
    }

    /** 
     * If the nodes in the cluster are configured for SNMP.
     **/
    public Boolean getEnabled() { return this.enabled; }
    public void setEnabled(Boolean enabled) { 
        this.enabled = enabled;
    }
    /** 
     * If the node in the cluster is configured for SNMP v3.
     **/
    public Boolean getSnmpV3Enabled() { return this.snmpV3Enabled; }
    public void setSnmpV3Enabled(Boolean snmpV3Enabled) { 
        this.snmpV3Enabled = snmpV3Enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSnmpStateResult that = (GetSnmpStateResult) o;

        return 
            Objects.equals(enabled, that.enabled) && 
            Objects.equals(snmpV3Enabled, that.snmpV3Enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash( enabled,snmpV3Enabled );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("enabled", enabled);
        map.put("snmpV3Enabled", snmpV3Enabled);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" enabled : ").append(enabled).append(",");
        sb.append(" snmpV3Enabled : ").append(snmpV3Enabled).append(",");
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
        private Boolean enabled;
        private Boolean snmpV3Enabled;

        private Builder() { }

        public GetSnmpStateResult build() {
            return new GetSnmpStateResult (
                         this.enabled,
                         this.snmpV3Enabled);
        }

        private GetSnmpStateResult.Builder buildFrom(final GetSnmpStateResult req) {
            this.enabled = req.enabled;
            this.snmpV3Enabled = req.snmpV3Enabled;

            return this;
        }

        public GetSnmpStateResult.Builder enabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public GetSnmpStateResult.Builder snmpV3Enabled(final Boolean snmpV3Enabled) {
            this.snmpV3Enabled = snmpV3Enabled;
            return this;
        }

    }
}
