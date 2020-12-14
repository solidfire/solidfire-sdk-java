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
 * CreateKeyServerKmipRequest  
 * Creates a KMIP (Key Management Interoperability Protocol) Key Server with the specified attributes. The server will not be contacted as part of this operation so it need not exist or be configured prior.
 * For clustered Key Server configurations, the hostnames or IP Addresses, of all server nodes, must be provided in the kmipKeyServerHostnames parameter.
 **/

public class CreateKeyServerKmipRequest implements Serializable {

    public static final long serialVersionUID = 580793406004880719L;
    @SerializedName("kmipCaCertificate") private String kmipCaCertificate;
    @SerializedName("kmipClientCertificate") private String kmipClientCertificate;
    @SerializedName("kmipKeyServerHostnames") private String[] kmipKeyServerHostnames;
    @SerializedName("kmipKeyServerName") private String kmipKeyServerName;
    @SerializedName("kmipKeyServerPort") private Optional<Long> kmipKeyServerPort;
    // empty constructor
    @Since("7.0")
    public CreateKeyServerKmipRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateKeyServerKmipRequest(
        String kmipCaCertificate,
        String kmipClientCertificate,
        String[] kmipKeyServerHostnames,
        String kmipKeyServerName,
        Optional<Long> kmipKeyServerPort
    )
    {
        this.kmipCaCertificate = kmipCaCertificate;
        this.kmipClientCertificate = kmipClientCertificate;
        this.kmipKeyServerHostnames = kmipKeyServerHostnames;
        this.kmipKeyServerName = kmipKeyServerName;
        this.kmipKeyServerPort = (kmipKeyServerPort == null) ? Optional.<Long>empty() : kmipKeyServerPort;
    }

    /** 
     * The public key certificate of the external key server's root CA. This will be used to verify the certificate presented by external key server in the TLS communication.
     * For key server clusters where individual servers use different CAs, provide a concatenated string containing the root certificates of all the CAs.
     **/
    public String getKmipCaCertificate() { return this.kmipCaCertificate; }
   
    public void setKmipCaCertificate(String kmipCaCertificate) { 
        this.kmipCaCertificate = kmipCaCertificate;
    }
    /** 
     * A PEM format Base64 encoded PKCS#10 X.509 certificate used by the Solidfire KMIP client.
     **/
    public String getKmipClientCertificate() { return this.kmipClientCertificate; }
   
    public void setKmipClientCertificate(String kmipClientCertificate) { 
        this.kmipClientCertificate = kmipClientCertificate;
    }
    /** 
     * Array of the hostnames or IP addresses associated with this KMIP Key Server. Multiple hostnames or IP addresses must only be provided if the key servers are in a clustered configuration.
     **/
    public String[] getKmipKeyServerHostnames() { return this.kmipKeyServerHostnames; }
   
    public void setKmipKeyServerHostnames(String[] kmipKeyServerHostnames) { 
        this.kmipKeyServerHostnames = kmipKeyServerHostnames;
    }
    /** 
     * The name of the KMIP Key Server.  This name is only used for display purposes and does not need to be unique.
     **/
    public String getKmipKeyServerName() { return this.kmipKeyServerName; }
   
    public void setKmipKeyServerName(String kmipKeyServerName) { 
        this.kmipKeyServerName = kmipKeyServerName;
    }
    /** 
     * The port number associated with this KMIP Key Server (typically 5696).
     **/
    public Optional<Long> getKmipKeyServerPort() { return this.kmipKeyServerPort; }
   
    public void setKmipKeyServerPort(Optional<Long> kmipKeyServerPort) { 
        this.kmipKeyServerPort = (kmipKeyServerPort == null) ? Optional.<Long>empty() : kmipKeyServerPort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateKeyServerKmipRequest that = (CreateKeyServerKmipRequest) o;

        return 
            Objects.equals(kmipCaCertificate, that.kmipCaCertificate) && 
            Objects.equals(kmipClientCertificate, that.kmipClientCertificate) && 
            Arrays.equals(kmipKeyServerHostnames, that.kmipKeyServerHostnames) && 
            Objects.equals(kmipKeyServerName, that.kmipKeyServerName) && 
            Objects.equals(kmipKeyServerPort, that.kmipKeyServerPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash( kmipCaCertificate,kmipClientCertificate,(Object[])kmipKeyServerHostnames,kmipKeyServerName,kmipKeyServerPort );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("kmipCaCertificate", kmipCaCertificate);
        map.put("kmipClientCertificate", kmipClientCertificate);
        map.put("kmipKeyServerHostnames", kmipKeyServerHostnames);
        map.put("kmipKeyServerName", kmipKeyServerName);
        map.put("kmipKeyServerPort", kmipKeyServerPort);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" kmipCaCertificate : ").append(gson.toJson(kmipCaCertificate)).append(",");
        sb.append(" kmipClientCertificate : ").append(gson.toJson(kmipClientCertificate)).append(",");
        sb.append(" kmipKeyServerHostnames : ").append(gson.toJson(Arrays.toString(kmipKeyServerHostnames))).append(",");
        sb.append(" kmipKeyServerName : ").append(gson.toJson(kmipKeyServerName)).append(",");
        if(null != kmipKeyServerPort && kmipKeyServerPort.isPresent()){
            sb.append(" kmipKeyServerPort : ").append(gson.toJson(kmipKeyServerPort)).append(",");
        }
        else{
            sb.append(" kmipKeyServerPort : ").append("null").append(",");
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
        private String kmipCaCertificate;
        private String kmipClientCertificate;
        private String[] kmipKeyServerHostnames;
        private String kmipKeyServerName;
        private Optional<Long> kmipKeyServerPort;

        private Builder() { }

        public CreateKeyServerKmipRequest build() {
            return new CreateKeyServerKmipRequest (
                         this.kmipCaCertificate,
                         this.kmipClientCertificate,
                         this.kmipKeyServerHostnames,
                         this.kmipKeyServerName,
                         this.kmipKeyServerPort);
        }

        private CreateKeyServerKmipRequest.Builder buildFrom(final CreateKeyServerKmipRequest req) {
            this.kmipCaCertificate = req.kmipCaCertificate;
            this.kmipClientCertificate = req.kmipClientCertificate;
            this.kmipKeyServerHostnames = req.kmipKeyServerHostnames;
            this.kmipKeyServerName = req.kmipKeyServerName;
            this.kmipKeyServerPort = req.kmipKeyServerPort;

            return this;
        }

        public CreateKeyServerKmipRequest.Builder kmipCaCertificate(final String kmipCaCertificate) {
            this.kmipCaCertificate = kmipCaCertificate;
            return this;
        }

        public CreateKeyServerKmipRequest.Builder kmipClientCertificate(final String kmipClientCertificate) {
            this.kmipClientCertificate = kmipClientCertificate;
            return this;
        }

        public CreateKeyServerKmipRequest.Builder kmipKeyServerHostnames(final String[] kmipKeyServerHostnames) {
            this.kmipKeyServerHostnames = kmipKeyServerHostnames;
            return this;
        }

        public CreateKeyServerKmipRequest.Builder kmipKeyServerName(final String kmipKeyServerName) {
            this.kmipKeyServerName = kmipKeyServerName;
            return this;
        }

        public CreateKeyServerKmipRequest.Builder optionalKmipKeyServerPort(final Long kmipKeyServerPort) {
            this.kmipKeyServerPort = (kmipKeyServerPort == null) ? Optional.<Long>empty() : Optional.of(kmipKeyServerPort);
            return this;
        }

    }
}
