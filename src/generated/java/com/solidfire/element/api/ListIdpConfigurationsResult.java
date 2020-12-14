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
 * ListIdpConfigurationsResult  
 **/

public class ListIdpConfigurationsResult implements Serializable {

    public static final long serialVersionUID = -74800407112618034L;
    @SerializedName("idpConfigInfos") private IdpConfigInfo[] idpConfigInfos;
    // empty constructor
    @Since("7.0")
    public ListIdpConfigurationsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListIdpConfigurationsResult(
        IdpConfigInfo[] idpConfigInfos
    )
    {
        this.idpConfigInfos = idpConfigInfos;
    }

    /** 
     * Information around the third party Identity Provider (IdP) configuration(s).
     **/
    public IdpConfigInfo[] getIdpConfigInfos() { return this.idpConfigInfos; }
   
    public void setIdpConfigInfos(IdpConfigInfo[] idpConfigInfos) { 
        this.idpConfigInfos = idpConfigInfos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListIdpConfigurationsResult that = (ListIdpConfigurationsResult) o;

        return 
            Arrays.equals(idpConfigInfos, that.idpConfigInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])idpConfigInfos );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("idpConfigInfos", idpConfigInfos);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" idpConfigInfos : ").append(gson.toJson(Arrays.toString(idpConfigInfos))).append(",");
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
        private IdpConfigInfo[] idpConfigInfos;

        private Builder() { }

        public ListIdpConfigurationsResult build() {
            return new ListIdpConfigurationsResult (
                         this.idpConfigInfos);
        }

        private ListIdpConfigurationsResult.Builder buildFrom(final ListIdpConfigurationsResult req) {
            this.idpConfigInfos = req.idpConfigInfos;

            return this;
        }

        public ListIdpConfigurationsResult.Builder idpConfigInfos(final IdpConfigInfo[] idpConfigInfos) {
            this.idpConfigInfos = idpConfigInfos;
            return this;
        }

    }
}
