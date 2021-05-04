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
 * GetNodeSSLCertificateResult  
 **/

public class GetNodeSSLCertificateResult implements Serializable {

    public static final long serialVersionUID = -4789567314908537996L;
    @SerializedName("certificate") private String certificate;
    @SerializedName("details") private Attributes details;

    
    // parameterized constructor
    @Since("7.0")
    public GetNodeSSLCertificateResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public GetNodeSSLCertificateResult(
        String certificate,
        Attributes details
    )
    {
        this.certificate = certificate;
        this.details = details;
    }

    /** 
     * The full PEM-encoded test of the certificate.
     **/
    public String getCertificate() { return this.certificate; }
   
    public void setCertificate(String certificate) { 
        this.certificate = certificate;
    }
    /** 
     * The decoded information of the certificate.
     **/
    public Attributes getDetails() { return this.details; }
   
    public void setDetails(Attributes details) { 
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetNodeSSLCertificateResult that = (GetNodeSSLCertificateResult) o;

        return 
            Objects.equals(certificate, that.certificate) && 
            Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash( certificate,details );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("certificate", certificate);
        map.put("details", details);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" certificate : ").append(gson.toJson(certificate)).append(",");
        sb.append(" details : ").append(gson.toJson(details)).append(",");
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
        private Attributes details;

        private Builder() { }

        public GetNodeSSLCertificateResult build() {
            return new GetNodeSSLCertificateResult (
                         this.certificate,
                         this.details);
        }

        private GetNodeSSLCertificateResult.Builder buildFrom(final GetNodeSSLCertificateResult req) {
            this.certificate = req.certificate;
            this.details = req.details;

            return this;
        }

        public GetNodeSSLCertificateResult.Builder certificate(final String certificate) {
            this.certificate = certificate;
            return this;
        }

        public GetNodeSSLCertificateResult.Builder details(final Attributes details) {
            this.details = details;
            return this;
        }

    }
}
