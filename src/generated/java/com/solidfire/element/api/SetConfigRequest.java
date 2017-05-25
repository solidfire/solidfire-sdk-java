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
 * SetConfigRequest  
 * The SetConfig API method enables you to set all the configuration information for the node. This includes the same information available via calls to SetClusterConfig and SetNetworkConfig in one API method. 
 * Note: This method is available only through the per-node API endpoint 5.0 or later.
 * Caution: Changing the "bond-mode" on a node can cause a temporary loss of network connectivity. Exercise caution when using this method.
 **/

public class SetConfigRequest implements Serializable {

    public static final long serialVersionUID = -8478027765607540632L;
    @SerializedName("config") private ConfigParams config;
    // empty constructor
    @Since("7.0")
    public SetConfigRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetConfigRequest(
        ConfigParams config
    )
    {
        this.config = config;
    }

    /** 
     * Objects that you want changed for the cluster interface settings.
     **/
    public ConfigParams getConfig() { return this.config; }
    public void setConfig(ConfigParams config) { 
        this.config = config;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetConfigRequest that = (SetConfigRequest) o;

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
        private ConfigParams config;

        private Builder() { }

        public SetConfigRequest build() {
            return new SetConfigRequest (
                         this.config);
        }

        private SetConfigRequest.Builder buildFrom(final SetConfigRequest req) {
            this.config = req.config;

            return this;
        }

        public SetConfigRequest.Builder config(final ConfigParams config) {
            this.config = config;
            return this;
        }

    }
}
