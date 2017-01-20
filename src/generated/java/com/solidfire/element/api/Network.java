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
 * Network  
 **/

public class Network implements Serializable {

    public static final long serialVersionUID = 270234649463754293L;
    @SerializedName("Bond10G") private Optional<NetworkConfig> bond10G;
    @SerializedName("Bond1G") private Optional<NetworkConfig> bond1G;
    @SerializedName("eth0") private Optional<NetworkConfig> eth0;
    @SerializedName("eth1") private Optional<NetworkConfig> eth1;
    @SerializedName("eth2") private Optional<NetworkConfig> eth2;
    @SerializedName("eth3") private Optional<NetworkConfig> eth3;
    @SerializedName("lo") private Optional<NetworkConfig> lo;

    // empty constructor
    @Since("7.0")
    public Network() {}

    
    // parameterized constructor
    @Since("7.0")
    public Network(
        Optional<NetworkConfig> bond10G,
        Optional<NetworkConfig> bond1G,
        Optional<NetworkConfig> eth0,
        Optional<NetworkConfig> eth1,
        Optional<NetworkConfig> eth2,
        Optional<NetworkConfig> eth3,
        Optional<NetworkConfig> lo
    )
    {
        this.bond10G = (bond10G == null) ? Optional.<NetworkConfig>empty() : bond10G;
        this.bond1G = (bond1G == null) ? Optional.<NetworkConfig>empty() : bond1G;
        this.eth0 = (eth0 == null) ? Optional.<NetworkConfig>empty() : eth0;
        this.eth1 = (eth1 == null) ? Optional.<NetworkConfig>empty() : eth1;
        this.eth2 = (eth2 == null) ? Optional.<NetworkConfig>empty() : eth2;
        this.eth3 = (eth3 == null) ? Optional.<NetworkConfig>empty() : eth3;
        this.lo = (lo == null) ? Optional.<NetworkConfig>empty() : lo;
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
    /** 
     **/
    public Optional<NetworkConfig> getEth0() { return this.eth0; }
    public void setEth0(Optional<NetworkConfig> eth0) { 
        this.eth0 = (eth0 == null) ? Optional.<NetworkConfig>empty() : eth0;
    }
    /** 
     **/
    public Optional<NetworkConfig> getEth1() { return this.eth1; }
    public void setEth1(Optional<NetworkConfig> eth1) { 
        this.eth1 = (eth1 == null) ? Optional.<NetworkConfig>empty() : eth1;
    }
    /** 
     **/
    public Optional<NetworkConfig> getEth2() { return this.eth2; }
    public void setEth2(Optional<NetworkConfig> eth2) { 
        this.eth2 = (eth2 == null) ? Optional.<NetworkConfig>empty() : eth2;
    }
    /** 
     **/
    public Optional<NetworkConfig> getEth3() { return this.eth3; }
    public void setEth3(Optional<NetworkConfig> eth3) { 
        this.eth3 = (eth3 == null) ? Optional.<NetworkConfig>empty() : eth3;
    }
    /** 
     **/
    public Optional<NetworkConfig> getLo() { return this.lo; }
    public void setLo(Optional<NetworkConfig> lo) { 
        this.lo = (lo == null) ? Optional.<NetworkConfig>empty() : lo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Network that = (Network) o;

        return 
            Objects.equals(bond10G, that.bond10G) && 
            Objects.equals(bond1G, that.bond1G) && 
            Objects.equals(eth0, that.eth0) && 
            Objects.equals(eth1, that.eth1) && 
            Objects.equals(eth2, that.eth2) && 
            Objects.equals(eth3, that.eth3) && 
            Objects.equals(lo, that.lo);
    }

    @Override
    public int hashCode() {
        return Objects.hash( bond10G,bond1G,eth0,eth1,eth2,eth3,lo );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("bond10G", bond10G);
        map.put("bond1G", bond1G);
        map.put("eth0", eth0);
        map.put("eth1", eth1);
        map.put("eth2", eth2);
        map.put("eth3", eth3);
        map.put("lo", lo);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != bond10G && bond10G.isPresent()){
            sb.append(" bond10G : ").append(bond10G).append(",");
        }
        if(null != bond1G && bond1G.isPresent()){
            sb.append(" bond1G : ").append(bond1G).append(",");
        }
        if(null != eth0 && eth0.isPresent()){
            sb.append(" eth0 : ").append(eth0).append(",");
        }
        if(null != eth1 && eth1.isPresent()){
            sb.append(" eth1 : ").append(eth1).append(",");
        }
        if(null != eth2 && eth2.isPresent()){
            sb.append(" eth2 : ").append(eth2).append(",");
        }
        if(null != eth3 && eth3.isPresent()){
            sb.append(" eth3 : ").append(eth3).append(",");
        }
        if(null != lo && lo.isPresent()){
            sb.append(" lo : ").append(lo).append(",");
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
        private Optional<NetworkConfig> eth0;
        private Optional<NetworkConfig> eth1;
        private Optional<NetworkConfig> eth2;
        private Optional<NetworkConfig> eth3;
        private Optional<NetworkConfig> lo;

        private Builder() { }

        public Network build() {
            return new Network (
                         this.bond10G,
                         this.bond1G,
                         this.eth0,
                         this.eth1,
                         this.eth2,
                         this.eth3,
                         this.lo);
        }

        private Network.Builder buildFrom(final Network req) {
            this.bond10G = req.bond10G;
            this.bond1G = req.bond1G;
            this.eth0 = req.eth0;
            this.eth1 = req.eth1;
            this.eth2 = req.eth2;
            this.eth3 = req.eth3;
            this.lo = req.lo;

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

        public Network.Builder optionalEth0(final NetworkConfig eth0) {
            this.eth0 = (eth0 == null) ? Optional.<NetworkConfig>empty() : Optional.of(eth0);
            return this;
        }

        public Network.Builder optionalEth1(final NetworkConfig eth1) {
            this.eth1 = (eth1 == null) ? Optional.<NetworkConfig>empty() : Optional.of(eth1);
            return this;
        }

        public Network.Builder optionalEth2(final NetworkConfig eth2) {
            this.eth2 = (eth2 == null) ? Optional.<NetworkConfig>empty() : Optional.of(eth2);
            return this;
        }

        public Network.Builder optionalEth3(final NetworkConfig eth3) {
            this.eth3 = (eth3 == null) ? Optional.<NetworkConfig>empty() : Optional.of(eth3);
            return this;
        }

        public Network.Builder optionalLo(final NetworkConfig lo) {
            this.lo = (lo == null) ? Optional.<NetworkConfig>empty() : Optional.of(lo);
            return this;
        }

    }
}
