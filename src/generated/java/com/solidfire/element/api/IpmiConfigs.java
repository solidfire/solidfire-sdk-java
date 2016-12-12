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

import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class IpmiConfigs implements Serializable {

    public static final long serialVersionUID = 985109278515802845L;
    @SerializedName("ipmiConfig") private IpmiConfig[] ipmiConfig;

    // empty constructor
    @Since("7.0")
    public IpmiConfigs() {}

    
    // parameterized constructor
    @Since("7.0")
    public IpmiConfigs(
        IpmiConfig[] ipmiConfig
    )
    {
        this.ipmiConfig = ipmiConfig;
    }

    /** 
     **/
    public IpmiConfig[] getIpmiConfig() { return this.ipmiConfig; }
    public void setIpmiConfig(IpmiConfig[] ipmiConfig) { 
        this.ipmiConfig = ipmiConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IpmiConfigs that = (IpmiConfigs) o;

        return 
            Arrays.equals(ipmiConfig, that.ipmiConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])ipmiConfig );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("ipmiConfig", ipmiConfig);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" ipmiConfig : ").append(Arrays.toString(ipmiConfig)).append(",");
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
        private IpmiConfig[] ipmiConfig;

        private Builder() { }

        public IpmiConfigs build() {
            return new IpmiConfigs (
                         this.ipmiConfig);
        }

        private IpmiConfigs.Builder buildFrom(final IpmiConfigs req) {
            this.ipmiConfig = req.ipmiConfig;

            return this;
        }

        public IpmiConfigs.Builder ipmiConfig(final IpmiConfig[] ipmiConfig) {
            this.ipmiConfig = ipmiConfig;
            return this;
        }

    }
}
