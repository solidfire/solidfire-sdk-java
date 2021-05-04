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
 * SetLldpConfigRequest  
 * Sets LLDP configuration options. If an option isn't set in the request, then it is unchanged from the previous value.
 **/

public class SetLldpConfigRequest implements Serializable {

    public static final long serialVersionUID = 1724952247423377374L;
    @SerializedName("lldpConfig") private LldpConfig lldpConfig;

    
    // parameterized constructor
    @Since("7.0")
    public SetLldpConfigRequest(
    )
    {
    }
    // parameterized constructor
    @Since("11.0")
    public SetLldpConfigRequest(
        LldpConfig lldpConfig
    )
    {
        this.lldpConfig = lldpConfig;
    }

    /** 
     * LLDP configuration to be set
     **/
    public LldpConfig getLldpConfig() { return this.lldpConfig; }
   
    public void setLldpConfig(LldpConfig lldpConfig) { 
        this.lldpConfig = lldpConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetLldpConfigRequest that = (SetLldpConfigRequest) o;

        return 
            Objects.equals(lldpConfig, that.lldpConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash( lldpConfig );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("lldpConfig", lldpConfig);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" lldpConfig : ").append(gson.toJson(lldpConfig)).append(",");
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
        private LldpConfig lldpConfig;

        private Builder() { }

        public SetLldpConfigRequest build() {
            return new SetLldpConfigRequest (
                         this.lldpConfig);
        }

        private SetLldpConfigRequest.Builder buildFrom(final SetLldpConfigRequest req) {
            this.lldpConfig = req.lldpConfig;

            return this;
        }

        public SetLldpConfigRequest.Builder lldpConfig(final LldpConfig lldpConfig) {
            this.lldpConfig = lldpConfig;
            return this;
        }

    }
}
