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

public class Network implements Serializable {

    public static final long serialVersionUID = 8968856628286036613L;
    @SerializedName("Bond10G") private Optional<NetworkConfig> bond10G;
    @SerializedName("Bond1G") private Optional<NetworkConfig> bond1G;

    // empty constructor
    @Since("7.0")
    public Network() {}

    // parameterized constructor
    @Since("7.0")
    public Network(
        Optional<NetworkConfig> bond10G,
        Optional<NetworkConfig> bond1G
    )
    {
        this.bond10G = (bond10G == null) ? Optional.<NetworkConfig>empty() : bond10G;
        this.bond1G = (bond1G == null) ? Optional.<NetworkConfig>empty() : bond1G;
    }

    /** 
     **/
    public Optional<NetworkConfig> getBond10G() { return this.bond10G; }
    public void setBond10G(Optional<NetworkConfig> bond10G) { 
        this.bond10G = (bond10G == null) ? Optional.<NetworkConfig>empty() : bond10G;
    }
    /** 
     **/
    public Optional<NetworkConfig> getBond1G() { return this.bond1G; }
    public void setBond1G(Optional<NetworkConfig> bond1G) { 
        this.bond1G = (bond1G == null) ? Optional.<NetworkConfig>empty() : bond1G;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Network that = (Network) o;
        return 
            Objects.equals(bond10G, that.bond10G) &&
            Objects.equals(bond1G, that.bond1G);
    }

    @Override
    public int hashCode() {
        return Objects.hash( bond10G, bond1G );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("bond10G", bond10G);
        map.put("bond1G", bond1G);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != bond10G && bond10G.isPresent()){
            sb.append(" bond10G : ").append(bond10G.get()).append(",");
        }
        if(null != bond1G && bond1G.isPresent()){
            sb.append(" bond1G : ").append(bond1G.get()).append(",");
        }
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
        private Optional<NetworkConfig> bond10G;
        private Optional<NetworkConfig> bond1G;

        private Builder() { }

        public Network build() {
            return new Network (
                         this.bond10G,
                         this.bond1G);
        }

        private Network.Builder buildFrom(final Network req) {
            this.bond10G = req.bond10G;
            this.bond1G = req.bond1G;

            return this;
        }

        public Network.Builder optionalBond10G(final NetworkConfig bond10G) {
            this.bond10G = (bond10G == null) ? Optional.<NetworkConfig>empty() : Optional.of(bond10G);
            return this;
        }

        public Network.Builder optionalBond1G(final NetworkConfig bond1G) {
            this.bond1G = (bond1G == null) ? Optional.<NetworkConfig>empty() : Optional.of(bond1G);
            return this;
        }

    }
}
