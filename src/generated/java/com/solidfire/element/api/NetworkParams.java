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
 * NetworkParams  
 **/

public class NetworkParams implements Serializable {

    public static final long serialVersionUID = -2403556666437707874L;
    @SerializedName("Bond10G") private Optional<NetworkConfigParams> bond10G;
    @SerializedName("Bond1G") private Optional<NetworkConfigParams> bond1G;
    @SerializedName("eth0") private Optional<NetworkConfigParams> eth0;
    @SerializedName("eth1") private Optional<NetworkConfigParams> eth1;
    @SerializedName("eth2") private Optional<NetworkConfigParams> eth2;
    @SerializedName("eth3") private Optional<NetworkConfigParams> eth3;
    @SerializedName("lo") private Optional<NetworkConfigParams> lo;
    // empty constructor
    @Since("7.0")
    public NetworkParams() {}

    
    // parameterized constructor
    @Since("7.0")
    public NetworkParams(
        Optional<NetworkConfigParams> bond10G,
        Optional<NetworkConfigParams> bond1G,
        Optional<NetworkConfigParams> eth0,
        Optional<NetworkConfigParams> eth1,
        Optional<NetworkConfigParams> eth2,
        Optional<NetworkConfigParams> eth3,
        Optional<NetworkConfigParams> lo
    )
    {
        this.bond10G = (bond10G == null) ? Optional.<NetworkConfigParams>empty() : bond10G;
        this.bond1G = (bond1G == null) ? Optional.<NetworkConfigParams>empty() : bond1G;
        this.eth0 = (eth0 == null) ? Optional.<NetworkConfigParams>empty() : eth0;
        this.eth1 = (eth1 == null) ? Optional.<NetworkConfigParams>empty() : eth1;
        this.eth2 = (eth2 == null) ? Optional.<NetworkConfigParams>empty() : eth2;
        this.eth3 = (eth3 == null) ? Optional.<NetworkConfigParams>empty() : eth3;
        this.lo = (lo == null) ? Optional.<NetworkConfigParams>empty() : lo;
    }

    /** 
     * 
     **/
    public Optional<NetworkConfigParams> getBond10G() { return this.bond10G; }
    public void setBond10G(Optional<NetworkConfigParams> bond10G) { 
        this.bond10G = (bond10G == null) ? Optional.<NetworkConfigParams>empty() : bond10G;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfigParams> getBond1G() { return this.bond1G; }
    public void setBond1G(Optional<NetworkConfigParams> bond1G) { 
        this.bond1G = (bond1G == null) ? Optional.<NetworkConfigParams>empty() : bond1G;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfigParams> getEth0() { return this.eth0; }
    public void setEth0(Optional<NetworkConfigParams> eth0) { 
        this.eth0 = (eth0 == null) ? Optional.<NetworkConfigParams>empty() : eth0;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfigParams> getEth1() { return this.eth1; }
    public void setEth1(Optional<NetworkConfigParams> eth1) { 
        this.eth1 = (eth1 == null) ? Optional.<NetworkConfigParams>empty() : eth1;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfigParams> getEth2() { return this.eth2; }
    public void setEth2(Optional<NetworkConfigParams> eth2) { 
        this.eth2 = (eth2 == null) ? Optional.<NetworkConfigParams>empty() : eth2;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfigParams> getEth3() { return this.eth3; }
    public void setEth3(Optional<NetworkConfigParams> eth3) { 
        this.eth3 = (eth3 == null) ? Optional.<NetworkConfigParams>empty() : eth3;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfigParams> getLo() { return this.lo; }
    public void setLo(Optional<NetworkConfigParams> lo) { 
        this.lo = (lo == null) ? Optional.<NetworkConfigParams>empty() : lo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NetworkParams that = (NetworkParams) o;

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
        private Optional<NetworkConfigParams> bond10G;
        private Optional<NetworkConfigParams> bond1G;
        private Optional<NetworkConfigParams> eth0;
        private Optional<NetworkConfigParams> eth1;
        private Optional<NetworkConfigParams> eth2;
        private Optional<NetworkConfigParams> eth3;
        private Optional<NetworkConfigParams> lo;

        private Builder() { }

        public NetworkParams build() {
            return new NetworkParams (
                         this.bond10G,
                         this.bond1G,
                         this.eth0,
                         this.eth1,
                         this.eth2,
                         this.eth3,
                         this.lo);
        }

        private NetworkParams.Builder buildFrom(final NetworkParams req) {
            this.bond10G = req.bond10G;
            this.bond1G = req.bond1G;
            this.eth0 = req.eth0;
            this.eth1 = req.eth1;
            this.eth2 = req.eth2;
            this.eth3 = req.eth3;
            this.lo = req.lo;

            return this;
        }

        public NetworkParams.Builder optionalBond10G(final NetworkConfigParams bond10G) {
            this.bond10G = (bond10G == null) ? Optional.<NetworkConfigParams>empty() : Optional.of(bond10G);
            return this;
        }

        public NetworkParams.Builder optionalBond1G(final NetworkConfigParams bond1G) {
            this.bond1G = (bond1G == null) ? Optional.<NetworkConfigParams>empty() : Optional.of(bond1G);
            return this;
        }

        public NetworkParams.Builder optionalEth0(final NetworkConfigParams eth0) {
            this.eth0 = (eth0 == null) ? Optional.<NetworkConfigParams>empty() : Optional.of(eth0);
            return this;
        }

        public NetworkParams.Builder optionalEth1(final NetworkConfigParams eth1) {
            this.eth1 = (eth1 == null) ? Optional.<NetworkConfigParams>empty() : Optional.of(eth1);
            return this;
        }

        public NetworkParams.Builder optionalEth2(final NetworkConfigParams eth2) {
            this.eth2 = (eth2 == null) ? Optional.<NetworkConfigParams>empty() : Optional.of(eth2);
            return this;
        }

        public NetworkParams.Builder optionalEth3(final NetworkConfigParams eth3) {
            this.eth3 = (eth3 == null) ? Optional.<NetworkConfigParams>empty() : Optional.of(eth3);
            return this;
        }

        public NetworkParams.Builder optionalLo(final NetworkConfigParams lo) {
            this.lo = (lo == null) ? Optional.<NetworkConfigParams>empty() : Optional.of(lo);
            return this;
        }

    }
}
