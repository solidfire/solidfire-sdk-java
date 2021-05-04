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
 * GetClientCertificateSignRequestResult  
 **/

public class GetClientCertificateSignRequestResult implements Serializable {

    public static final long serialVersionUID = -4447120950541575132L;
    @SerializedName("clientCertificateSignRequest") private String clientCertificateSignRequest;
    // empty constructor
    @Since("7.0")
    public GetClientCertificateSignRequestResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetClientCertificateSignRequestResult(
        String clientCertificateSignRequest
    )
    {
        this.clientCertificateSignRequest = clientCertificateSignRequest;
    }

    /** 
     * A PEM format Base64 encoded PKCS#10 X.509 client certificate sign request.
     **/
    public String getClientCertificateSignRequest() { return this.clientCertificateSignRequest; }
   
    public void setClientCertificateSignRequest(String clientCertificateSignRequest) { 
        this.clientCertificateSignRequest = clientCertificateSignRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClientCertificateSignRequestResult that = (GetClientCertificateSignRequestResult) o;

        return 
            Objects.equals(clientCertificateSignRequest, that.clientCertificateSignRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clientCertificateSignRequest );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clientCertificateSignRequest", clientCertificateSignRequest);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" clientCertificateSignRequest : ").append(gson.toJson(clientCertificateSignRequest)).append(",");
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
        private String clientCertificateSignRequest;

        private Builder() { }

        public GetClientCertificateSignRequestResult build() {
            return new GetClientCertificateSignRequestResult (
                         this.clientCertificateSignRequest);
        }

        private GetClientCertificateSignRequestResult.Builder buildFrom(final GetClientCertificateSignRequestResult req) {
            this.clientCertificateSignRequest = req.clientCertificateSignRequest;

            return this;
        }

        public GetClientCertificateSignRequestResult.Builder clientCertificateSignRequest(final String clientCertificateSignRequest) {
            this.clientCertificateSignRequest = clientCertificateSignRequest;
            return this;
        }

    }
}
