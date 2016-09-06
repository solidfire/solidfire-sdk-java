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
 * The Request object for the "EnableSnmp" API Service call.
 **/
public class EnableSnmpRequest  implements Serializable  {

    private static final long serialVersionUID = 424594038L;

    @SerializedName("snmpV3Enabled") private final Boolean snmpV3Enabled;

    /**
     * The Request object for the "EnableSnmp" API Service call.
     * @param snmpV3Enabled [required] If set to "true", then SNMP v3 is enabled on each node in the cluster. If set to "false", then SNMP v2 is enabled.
     * @since 7.0
     **/
    @Since("7.0")
    public EnableSnmpRequest(Boolean snmpV3Enabled) {
        this.snmpV3Enabled = snmpV3Enabled;
    }


    /**
     * If set to "true", then SNMP v3 is enabled on each node in the cluster. If set to "false", then SNMP v2 is enabled.
     **/
    public Boolean getSnmpV3Enabled() {
        return this.snmpV3Enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnableSnmpRequest that = (EnableSnmpRequest) o;
        

        return Objects.equals( snmpV3Enabled , that.snmpV3Enabled );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) snmpV3Enabled );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" snmpV3Enabled : ").append(snmpV3Enabled);
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
                         this.snmpV3Enabled            );
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
