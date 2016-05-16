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
public class PhysicalAdapter implements Serializable {

    private static final long serialVersionUID = -1235345165L;

    private final Optional<String> address;
    private final Optional<String> macAddress;
    private final Optional<String> macAddressPermanent;
    private final Optional<String> mtu;
    private final Optional<String> netmask;
    private final Optional<String> network;
    private final Optional<Boolean> upAndRunning;

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

    public Optional<String> getAddress() {
        return this.address;
    }
    public Optional<String> getMacAddress() {
        return this.macAddress;
    }
    public Optional<String> getMacAddressPermanent() {
        return this.macAddressPermanent;
    }
    public Optional<String> getMtu() {
        return this.mtu;
    }
    public Optional<String> getNetmask() {
        return this.netmask;
    }
    public Optional<String> getNetwork() {
        return this.network;
    }
    public Optional<Boolean> getUpAndRunning() {
        return this.upAndRunning;
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
}
