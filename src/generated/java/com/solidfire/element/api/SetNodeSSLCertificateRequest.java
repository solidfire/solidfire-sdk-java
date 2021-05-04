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
 * SetNodeSSLCertificateRequest  
 * You can use the SetNodeSSLCertificate method to set a user SSL certificate and private key for the management node.
 **/

public class SetNodeSSLCertificateRequest implements Serializable {

    public static final long serialVersionUID = 2538066499224674210L;
    @SerializedName("certificate") private String certificate;
    @SerializedName("privateKey") private String privateKey;
    // empty constructor
    @Since("7.0")
    public SetNodeSSLCertificateRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetNodeSSLCertificateRequest(
        String certificate,
        String privateKey
    )
    {
        this.certificate = certificate;
        this.privateKey = privateKey;
    }

    /** 
     * The PEM-encoded text version of the certificate.
     **/
    public String getCertificate() { return this.certificate; }
   
    public void setCertificate(String certificate) { 
        this.certificate = certificate;
    }
    /** 
     * The PEM-encoded text version of the private key.
     **/
    public String getPrivateKey() { return this.privateKey; }
   
    public void setPrivateKey(String privateKey) { 
        this.privateKey = privateKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetNodeSSLCertificateRequest that = (SetNodeSSLCertificateRequest) o;

        return 
            Objects.equals(certificate, that.certificate) && 
            Objects.equals(privateKey, that.privateKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash( certificate,privateKey );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("certificate", certificate);
        map.put("privateKey", privateKey);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" certificate : ").append(gson.toJson(certificate)).append(",");
        sb.append(" privateKey : ").append(gson.toJson(privateKey)).append(",");
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
        private String certificate;
        private String privateKey;

        private Builder() { }

        public SetNodeSSLCertificateRequest build() {
            return new SetNodeSSLCertificateRequest (
                         this.certificate,
                         this.privateKey);
        }

        private SetNodeSSLCertificateRequest.Builder buildFrom(final SetNodeSSLCertificateRequest req) {
            this.certificate = req.certificate;
            this.privateKey = req.privateKey;

            return this;
        }

        public SetNodeSSLCertificateRequest.Builder certificate(final String certificate) {
            this.certificate = certificate;
            return this;
        }

        public SetNodeSSLCertificateRequest.Builder privateKey(final String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

    }
}
