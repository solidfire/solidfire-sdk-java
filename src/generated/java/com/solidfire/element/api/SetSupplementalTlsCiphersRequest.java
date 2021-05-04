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
 * SetSupplementalTlsCiphersRequest  
 * You can use the SetSupplementalTlsCiphers method to specify the list of supplemental TLS ciphers.
 **/

public class SetSupplementalTlsCiphersRequest implements Serializable {

    public static final long serialVersionUID = 198914107418622136L;
    @SerializedName("supplementalCiphers") private String[] supplementalCiphers;
    // empty constructor
    @Since("7.0")
    public SetSupplementalTlsCiphersRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetSupplementalTlsCiphersRequest(
        String[] supplementalCiphers
    )
    {
        this.supplementalCiphers = supplementalCiphers;
    }

    /** 
     * The supplemental cipher suite names using the OpenSSL naming scheme. Use of cipher suite names is case-insensitive.
     **/
    public String[] getSupplementalCiphers() { return this.supplementalCiphers; }
   
    public void setSupplementalCiphers(String[] supplementalCiphers) { 
        this.supplementalCiphers = supplementalCiphers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetSupplementalTlsCiphersRequest that = (SetSupplementalTlsCiphersRequest) o;

        return 
            Arrays.equals(supplementalCiphers, that.supplementalCiphers);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])supplementalCiphers );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("supplementalCiphers", supplementalCiphers);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" supplementalCiphers : ").append(gson.toJson(Arrays.toString(supplementalCiphers))).append(",");
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
        private String[] supplementalCiphers;

        private Builder() { }

        public SetSupplementalTlsCiphersRequest build() {
            return new SetSupplementalTlsCiphersRequest (
                         this.supplementalCiphers);
        }

        private SetSupplementalTlsCiphersRequest.Builder buildFrom(final SetSupplementalTlsCiphersRequest req) {
            this.supplementalCiphers = req.supplementalCiphers;

            return this;
        }

        public SetSupplementalTlsCiphersRequest.Builder supplementalCiphers(final String[] supplementalCiphers) {
            this.supplementalCiphers = supplementalCiphers;
            return this;
        }

    }
}
