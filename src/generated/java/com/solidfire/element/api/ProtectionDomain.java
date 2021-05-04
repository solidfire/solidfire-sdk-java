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
 * ProtectionDomain  
 * A ProtectionDomain is the Name and Type of a ProtectionDomain.
 **/

public class ProtectionDomain implements Serializable {

    public static final long serialVersionUID = -586075957493505900L;
    @SerializedName("protectionDomainType") private String protectionDomainType;
    @SerializedName("protectionDomainName") private String protectionDomainName;
    // empty constructor
    @Since("7.0")
    public ProtectionDomain() {}

    
    // parameterized constructor
    @Since("7.0")
    public ProtectionDomain(
        String protectionDomainType,
        String protectionDomainName
    )
    {
        this.protectionDomainType = protectionDomainType;
        this.protectionDomainName = protectionDomainName;
    }

    /** 
     * The type of the ProtectionDomain.
     **/
    public String getProtectionDomainType() { return this.protectionDomainType; }
   
    public void setProtectionDomainType(String protectionDomainType) { 
        this.protectionDomainType = protectionDomainType;
    }
    /** 
     * The name of the ProtectionDomain.
     **/
    public String getProtectionDomainName() { return this.protectionDomainName; }
   
    public void setProtectionDomainName(String protectionDomainName) { 
        this.protectionDomainName = protectionDomainName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProtectionDomain that = (ProtectionDomain) o;

        return 
            Objects.equals(protectionDomainType, that.protectionDomainType) && 
            Objects.equals(protectionDomainName, that.protectionDomainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash( protectionDomainType,protectionDomainName );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("protectionDomainType", protectionDomainType);
        map.put("protectionDomainName", protectionDomainName);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" protectionDomainType : ").append(gson.toJson(protectionDomainType)).append(",");
        sb.append(" protectionDomainName : ").append(gson.toJson(protectionDomainName)).append(",");
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
        private String protectionDomainType;
        private String protectionDomainName;

        private Builder() { }

        public ProtectionDomain build() {
            return new ProtectionDomain (
                         this.protectionDomainType,
                         this.protectionDomainName);
        }

        private ProtectionDomain.Builder buildFrom(final ProtectionDomain req) {
            this.protectionDomainType = req.protectionDomainType;
            this.protectionDomainName = req.protectionDomainName;

            return this;
        }

        public ProtectionDomain.Builder protectionDomainType(final String protectionDomainType) {
            this.protectionDomainType = protectionDomainType;
            return this;
        }

        public ProtectionDomain.Builder protectionDomainName(final String protectionDomainName) {
            this.protectionDomainName = protectionDomainName;
            return this;
        }

    }
}
