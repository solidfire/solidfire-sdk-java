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
 * GetHardwareConfigResult  
 **/

public class GetHardwareConfigResult implements Serializable {

    public static final long serialVersionUID = 772021612408529018L;
    @SerializedName("hardwareConfig") private Attributes hardwareConfig;
    // empty constructor
    @Since("7.0")
    public GetHardwareConfigResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetHardwareConfigResult(
        Attributes hardwareConfig
    )
    {
        this.hardwareConfig = hardwareConfig;
    }

    /** 
     * List of hardware information and current settings.
     **/
    public Attributes getHardwareConfig() { return this.hardwareConfig; }
   
    public void setHardwareConfig(Attributes hardwareConfig) { 
        this.hardwareConfig = hardwareConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetHardwareConfigResult that = (GetHardwareConfigResult) o;

        return 
            Objects.equals(hardwareConfig, that.hardwareConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash( hardwareConfig );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("hardwareConfig", hardwareConfig);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" hardwareConfig : ").append(gson.toJson(hardwareConfig)).append(",");
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
        private Attributes hardwareConfig;

        private Builder() { }

        public GetHardwareConfigResult build() {
            return new GetHardwareConfigResult (
                         this.hardwareConfig);
        }

        private GetHardwareConfigResult.Builder buildFrom(final GetHardwareConfigResult req) {
            this.hardwareConfig = req.hardwareConfig;

            return this;
        }

        public GetHardwareConfigResult.Builder hardwareConfig(final Attributes hardwareConfig) {
            this.hardwareConfig = hardwareConfig;
            return this;
        }

    }
}
