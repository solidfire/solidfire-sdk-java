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
 * ListKeyServersKmipResult  
 **/

public class ListKeyServersKmipResult implements Serializable {

    public static final long serialVersionUID = 5308748007283789728L;
    @SerializedName("kmipKeyServers") private KeyServerKmip[] kmipKeyServers;
    // empty constructor
    @Since("7.0")
    public ListKeyServersKmipResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListKeyServersKmipResult(
        KeyServerKmip[] kmipKeyServers
    )
    {
        this.kmipKeyServers = kmipKeyServers;
    }

    /** 
     * The complete list of KMIP (Key Management Interoperability Protocol) Key Servers which have been created via CreateKeyServerKmip.
     **/
    public KeyServerKmip[] getKmipKeyServers() { return this.kmipKeyServers; }
   
    public void setKmipKeyServers(KeyServerKmip[] kmipKeyServers) { 
        this.kmipKeyServers = kmipKeyServers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListKeyServersKmipResult that = (ListKeyServersKmipResult) o;

        return 
            Arrays.equals(kmipKeyServers, that.kmipKeyServers);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])kmipKeyServers );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("kmipKeyServers", kmipKeyServers);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" kmipKeyServers : ").append(gson.toJson(Arrays.toString(kmipKeyServers))).append(",");
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
        private KeyServerKmip[] kmipKeyServers;

        private Builder() { }

        public ListKeyServersKmipResult build() {
            return new ListKeyServersKmipResult (
                         this.kmipKeyServers);
        }

        private ListKeyServersKmipResult.Builder buildFrom(final ListKeyServersKmipResult req) {
            this.kmipKeyServers = req.kmipKeyServers;

            return this;
        }

        public ListKeyServersKmipResult.Builder kmipKeyServers(final KeyServerKmip[] kmipKeyServers) {
            this.kmipKeyServers = kmipKeyServers;
            return this;
        }

    }
}
