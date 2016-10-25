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
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * 
 **/
public class PhysicalAdapter  implements Serializable  {

    private static final long serialVersionUID = -669387540L;

    @SerializedName("address") private Optional<String> address;
    @SerializedName("macAddress") private Optional<String> macAddress;
    @SerializedName("macAddressPermanent") private Optional<String> macAddressPermanent;
    @SerializedName("mtu") private Optional<String> mtu;
    @SerializedName("netmask") private Optional<String> netmask;
    @SerializedName("network") private Optional<String> network;
    @SerializedName("upAndRunning") private Optional<Boolean> upAndRunning;

    /**
     * 
     * @param address (optional) 
     * @param macAddress (optional) 
     * @param macAddressPermanent (optional) 
     * @param mtu (optional) 
     * @param netmask (optional) 
     * @param network (optional) 
     * @param upAndRunning (optional) 
     * @since 7.0
     **/
    @Since("7.0")
    public PhysicalAdapter(Optional<String> address, Optional<String> macAddress, Optional<String> macAddressPermanent, Optional<String> mtu, Optional<String> netmask, Optional<String> network, Optional<Boolean> upAndRunning) {
        this.network = (network == null) ? Optional.<String>empty() : network;
        this.macAddress = (macAddress == null) ? Optional.<String>empty() : macAddress;
        this.macAddressPermanent = (macAddressPermanent == null) ? Optional.<String>empty() : macAddressPermanent;
        this.netmask = (netmask == null) ? Optional.<String>empty() : netmask;
        this.upAndRunning = (upAndRunning == null) ? Optional.<Boolean>empty() : upAndRunning;
        this.mtu = (mtu == null) ? Optional.<String>empty() : mtu;
        this.address = (address == null) ? Optional.<String>empty() : address;
    }

    
    /**
     * 
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public PhysicalAdapter() {}

    public Optional<String> getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = (address == null) ? Optional.<String>empty() : Optional.of(address);
    }


    public Optional<String> getMacAddress() {
        return this.macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = (macAddress == null) ? Optional.<String>empty() : Optional.of(macAddress);
    }


    public Optional<String> getMacAddressPermanent() {
        return this.macAddressPermanent;
    }

    public void setMacAddressPermanent(String macAddressPermanent) {
        this.macAddressPermanent = (macAddressPermanent == null) ? Optional.<String>empty() : Optional.of(macAddressPermanent);
    }


    public Optional<String> getMtu() {
        return this.mtu;
    }

    public void setMtu(String mtu) {
        this.mtu = (mtu == null) ? Optional.<String>empty() : Optional.of(mtu);
    }


    public Optional<String> getNetmask() {
        return this.netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = (netmask == null) ? Optional.<String>empty() : Optional.of(netmask);
    }


    public Optional<String> getNetwork() {
        return this.network;
    }

    public void setNetwork(String network) {
        this.network = (network == null) ? Optional.<String>empty() : Optional.of(network);
    }


    public Optional<Boolean> getUpAndRunning() {
        return this.upAndRunning;
    }

    public void setUpAndRunning(Boolean upAndRunning) {
        this.upAndRunning = (upAndRunning == null) ? Optional.<Boolean>empty() : Optional.of(upAndRunning);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhysicalAdapter that = (PhysicalAdapter) o;
        

        return Objects.equals( address , that.address )
            && Objects.equals( macAddress , that.macAddress )
            && Objects.equals( macAddressPermanent , that.macAddressPermanent )
            && Objects.equals( mtu , that.mtu )
            && Objects.equals( netmask , that.netmask )
            && Objects.equals( network , that.network )
            && Objects.equals( upAndRunning , that.upAndRunning );
    }

    @Override
    public int hashCode() {
        return Objects.hash( address, macAddress, macAddressPermanent, mtu, netmask, network, upAndRunning );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != address && address.isPresent())
            sb.append(" address : ").append(address.get()).append(",");
        if(null != macAddress && macAddress.isPresent())
            sb.append(" macAddress : ").append(macAddress.get()).append(",");
        if(null != macAddressPermanent && macAddressPermanent.isPresent())
            sb.append(" macAddressPermanent : ").append(macAddressPermanent.get()).append(",");
        if(null != mtu && mtu.isPresent())
            sb.append(" mtu : ").append(mtu.get()).append(",");
        if(null != netmask && netmask.isPresent())
            sb.append(" netmask : ").append(netmask.get()).append(",");
        if(null != network && network.isPresent())
            sb.append(" network : ").append(network.get()).append(",");
        if(null != upAndRunning && upAndRunning.isPresent())
            sb.append(" upAndRunning : ").append(upAndRunning.get());
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
        private Optional<String> address;
        private Optional<String> macAddress;
        private Optional<String> macAddressPermanent;
        private Optional<String> mtu;
        private Optional<String> netmask;
        private Optional<String> network;
        private Optional<Boolean> upAndRunning;

        private Builder() { }

        public PhysicalAdapter build() {
            return new PhysicalAdapter (
                         this.address,
                         this.macAddress,
                         this.macAddressPermanent,
                         this.mtu,
                         this.netmask,
                         this.network,
                         this.upAndRunning            );
        }

        private PhysicalAdapter.Builder buildFrom(final PhysicalAdapter req) {
            this.address = req.address;
            this.macAddress = req.macAddress;
            this.macAddressPermanent = req.macAddressPermanent;
            this.mtu = req.mtu;
            this.netmask = req.netmask;
            this.network = req.network;
            this.upAndRunning = req.upAndRunning;

            return this;
        }

        public PhysicalAdapter.Builder optionalAddress(final String address) {
            this.address = (address == null) ? Optional.<String>empty() : Optional.of(address);
            return this;
        }

        public PhysicalAdapter.Builder optionalMacAddress(final String macAddress) {
            this.macAddress = (macAddress == null) ? Optional.<String>empty() : Optional.of(macAddress);
            return this;
        }

        public PhysicalAdapter.Builder optionalMacAddressPermanent(final String macAddressPermanent) {
            this.macAddressPermanent = (macAddressPermanent == null) ? Optional.<String>empty() : Optional.of(macAddressPermanent);
            return this;
        }

        public PhysicalAdapter.Builder optionalMtu(final String mtu) {
            this.mtu = (mtu == null) ? Optional.<String>empty() : Optional.of(mtu);
            return this;
        }

        public PhysicalAdapter.Builder optionalNetmask(final String netmask) {
            this.netmask = (netmask == null) ? Optional.<String>empty() : Optional.of(netmask);
            return this;
        }

        public PhysicalAdapter.Builder optionalNetwork(final String network) {
            this.network = (network == null) ? Optional.<String>empty() : Optional.of(network);
            return this;
        }

        public PhysicalAdapter.Builder optionalUpAndRunning(final Boolean upAndRunning) {
            this.upAndRunning = (upAndRunning == null) ? Optional.<Boolean>empty() : Optional.of(upAndRunning);
            return this;
        }

    }

}
