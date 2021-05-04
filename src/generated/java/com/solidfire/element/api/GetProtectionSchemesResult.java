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
 * GetProtectionSchemesResult  
 **/

public class GetProtectionSchemesResult implements Serializable {

    public static final long serialVersionUID = 4927729219440499587L;
    @SerializedName("protectionSchemes") private java.util.Map<String,ProtectionSchemeInfo> protectionSchemes;
    // empty constructor
    @Since("7.0")
    public GetProtectionSchemesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetProtectionSchemesResult(
        java.util.Map<String,ProtectionSchemeInfo> protectionSchemes
    )
    {
        this.protectionSchemes = protectionSchemes;
    }

    /** 
     * The available protection schemes
     **/
    public java.util.Map<String,ProtectionSchemeInfo> getProtectionSchemes() { return this.protectionSchemes; }
   
    public void setProtectionSchemes(java.util.Map<String,ProtectionSchemeInfo> protectionSchemes) { 
        this.protectionSchemes = protectionSchemes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetProtectionSchemesResult that = (GetProtectionSchemesResult) o;

        return 
            Objects.equals(protectionSchemes, that.protectionSchemes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( protectionSchemes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("protectionSchemes", protectionSchemes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" protectionSchemes : ").append(gson.toJson(protectionSchemes)).append(",");
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
        private java.util.Map<String,ProtectionSchemeInfo> protectionSchemes;

        private Builder() { }

        public GetProtectionSchemesResult build() {
            return new GetProtectionSchemesResult (
                         this.protectionSchemes);
        }

        private GetProtectionSchemesResult.Builder buildFrom(final GetProtectionSchemesResult req) {
            this.protectionSchemes = req.protectionSchemes;

            return this;
        }

        public GetProtectionSchemesResult.Builder protectionSchemes(final java.util.Map<String,ProtectionSchemeInfo> protectionSchemes) {
            this.protectionSchemes = protectionSchemes;
            return this;
        }

    }
}
