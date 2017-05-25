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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetConfigResult  
 **/

public class GetConfigResult implements Serializable {

    public static final long serialVersionUID = 4288838430898243154L;
    @SerializedName("config") private Config config;
    // empty constructor
    @Since("7.0")
    public GetConfigResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetConfigResult(
        Config config
    )
    {
        this.config = config;
    }

    /** 
     * The details of the cluster. Values returned in "config": cluster- Cluster information that identifies how the node communicates with the cluster it is associated with. (Object) network - Network information for bonding and Ethernet connections. (Object)
     **/
    public Config getConfig() { return this.config; }
    public void setConfig(Config config) { 
        this.config = config;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetConfigResult that = (GetConfigResult) o;

        return 
            Objects.equals(config, that.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash( config );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("config", config);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" config : ").append(config).append(",");
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
        private Config config;

        private Builder() { }

        public GetConfigResult build() {
            return new GetConfigResult (
                         this.config);
        }

        private GetConfigResult.Builder buildFrom(final GetConfigResult req) {
            this.config = req.config;

            return this;
        }

        public GetConfigResult.Builder config(final Config config) {
            this.config = config;
            return this;
        }

    }
}
