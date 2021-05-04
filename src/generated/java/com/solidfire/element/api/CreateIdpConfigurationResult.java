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
 * CreateIdpConfigurationResult  
 **/

public class CreateIdpConfigurationResult implements Serializable {

    public static final long serialVersionUID = 1873784357834586659L;
    @SerializedName("idpConfigInfo") private IdpConfigInfo idpConfigInfo;
    // empty constructor
    @Since("7.0")
    public CreateIdpConfigurationResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateIdpConfigurationResult(
        IdpConfigInfo idpConfigInfo
    )
    {
        this.idpConfigInfo = idpConfigInfo;
    }

    /** 
     * Information around the third party Identity Provider (IdP) configuration.
     **/
    public IdpConfigInfo getIdpConfigInfo() { return this.idpConfigInfo; }
   
    public void setIdpConfigInfo(IdpConfigInfo idpConfigInfo) { 
        this.idpConfigInfo = idpConfigInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateIdpConfigurationResult that = (CreateIdpConfigurationResult) o;

        return 
            Objects.equals(idpConfigInfo, that.idpConfigInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash( idpConfigInfo );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("idpConfigInfo", idpConfigInfo);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" idpConfigInfo : ").append(gson.toJson(idpConfigInfo)).append(",");
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
        private IdpConfigInfo idpConfigInfo;

        private Builder() { }

        public CreateIdpConfigurationResult build() {
            return new CreateIdpConfigurationResult (
                         this.idpConfigInfo);
        }

        private CreateIdpConfigurationResult.Builder buildFrom(final CreateIdpConfigurationResult req) {
            this.idpConfigInfo = req.idpConfigInfo;

            return this;
        }

        public CreateIdpConfigurationResult.Builder idpConfigInfo(final IdpConfigInfo idpConfigInfo) {
            this.idpConfigInfo = idpConfigInfo;
            return this;
        }

    }
}
