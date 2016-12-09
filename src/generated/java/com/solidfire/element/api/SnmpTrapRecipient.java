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
 * Host that is to receive the traps generated by the cluster.
 **/

public class SnmpTrapRecipient implements Serializable {

    public static final long serialVersionUID = -7686465021384105517L;
    @SerializedName("host") private String host;
    @SerializedName("community") private String community;
    @SerializedName("port") private Long port;

    // empty constructor
    @Since("7.0")
    public SnmpTrapRecipient() {}

    
    // parameterized constructor
    @Since("7.0")
    public SnmpTrapRecipient(
        String host,
        String community,
        Long port
    )
    {
        this.host = host;
        this.community = community;
        this.port = port;
    }

    /** 
     * The IP address or host name of the target network management station.
     **/
    public String getHost() { return this.host; }
    public void setHost(String host) { 
        this.host = host;
    }
    /** 
     * SNMP community string.
     **/
    public String getCommunity() { return this.community; }
    public void setCommunity(String community) { 
        this.community = community;
    }
    /** 
     * The UDP port number on the host where the trap is to be sent. Valid range is 1 - 65535. 0 (zero) is not a valid port number. Default is 162.
     **/
    public Long getPort() { return this.port; }
    public void setPort(Long port) { 
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnmpTrapRecipient that = (SnmpTrapRecipient) o;

        return 
            Objects.equals(host, that.host) && 
            Objects.equals(community, that.community) && 
            Objects.equals(port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash( host,community,port );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("host", host);
        map.put("community", community);
        map.put("port", port);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" host : ").append(host).append(",");
        sb.append(" community : ").append(community).append(",");
        sb.append(" port : ").append(port).append(",");
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
        private String host;
        private String community;
        private Long port;

        private Builder() { }

        public SnmpTrapRecipient build() {
            return new SnmpTrapRecipient (
                         this.host,
                         this.community,
                         this.port);
        }

        private SnmpTrapRecipient.Builder buildFrom(final SnmpTrapRecipient req) {
            this.host = req.host;
            this.community = req.community;
            this.port = req.port;

            return this;
        }

        public SnmpTrapRecipient.Builder host(final String host) {
            this.host = host;
            return this;
        }

        public SnmpTrapRecipient.Builder community(final String community) {
            this.community = community;
            return this;
        }

        public SnmpTrapRecipient.Builder port(final Long port) {
            this.port = port;
            return this;
        }

    }
}
