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
 * ModifyKeyServerKmipResult  
 **/

public class ModifyKeyServerKmipResult implements Serializable {

    public static final long serialVersionUID = -7477184104835150005L;
    @SerializedName("kmipKeyServer") private KeyServerKmip kmipKeyServer;
    // empty constructor
    @Since("7.0")
    public ModifyKeyServerKmipResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyKeyServerKmipResult(
        KeyServerKmip kmipKeyServer
    )
    {
        this.kmipKeyServer = kmipKeyServer;
    }

    /** 
     * The resulting KMIP (Key Management Interoperability Protocol) Key Server after the modifications have been applied.
     **/
    public KeyServerKmip getKmipKeyServer() { return this.kmipKeyServer; }
   
    public void setKmipKeyServer(KeyServerKmip kmipKeyServer) { 
        this.kmipKeyServer = kmipKeyServer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyKeyServerKmipResult that = (ModifyKeyServerKmipResult) o;

        return 
            Objects.equals(kmipKeyServer, that.kmipKeyServer);
    }

    @Override
    public int hashCode() {
        return Objects.hash( kmipKeyServer );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("kmipKeyServer", kmipKeyServer);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" kmipKeyServer : ").append(gson.toJson(kmipKeyServer)).append(",");
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
        private KeyServerKmip kmipKeyServer;

        private Builder() { }

        public ModifyKeyServerKmipResult build() {
            return new ModifyKeyServerKmipResult (
                         this.kmipKeyServer);
        }

        private ModifyKeyServerKmipResult.Builder buildFrom(final ModifyKeyServerKmipResult req) {
            this.kmipKeyServer = req.kmipKeyServer;

            return this;
        }

        public ModifyKeyServerKmipResult.Builder kmipKeyServer(final KeyServerKmip kmipKeyServer) {
            this.kmipKeyServer = kmipKeyServer;
            return this;
        }

    }
}
