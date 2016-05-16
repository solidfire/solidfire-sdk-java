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
public class NetworkConfig implements Serializable {

    private static final long serialVersionUID = -1871865662L;

    private final Optional<Boolean> Default;
    private final Optional<String> address;
    private final Optional<Boolean> auto;
    private final Optional<Long> bondDowndelay;
    private final Optional<String> bondFailOverMac;
    private final Optional<String> bondPrimaryReselect;
    private final Optional<String> bondLacpRate;
    private final Optional<Long> bondMiimon;
    private final Optional<String> bondMode;
    private final Optional<String> bondSlaves;
    private final Optional<Long> bondUpdelay;
    private final Optional<String> broadcast;
    private final Optional<String> dnsNameservers;
    private final Optional<String> dnsSearch;
    private final Optional<String> family;
    private final Optional<String> gateway;
    private final Optional<String> macAddress;
    private final Optional<String> macAddressPermanent;
    private final Optional<String> method;
    private final Optional<String> mtu;
    private final Optional<String> netmask;
    private final Optional<String> network;
    private final Optional<PhysicalAdapter> physical;
    private final Optional<String[]> routes;
    private final Optional<String> status;
    private final Optional<String[]> symmetricRouteRules;
    private final Optional<Boolean> upAndRunning;

    /**
     * 
     * @param Default (optional) 
     * @param address (optional) 
     * @param auto (optional) 
     * @param bondDowndelay (optional) 
     * @param bondFailOverMac (optional) 
     * @param bondPrimaryReselect (optional) 
     * @param bondLacpRate (optional) 
     * @param bondMiimon (optional) 
     * @param bondMode (optional) 
     * @param bondSlaves (optional) 
     * @param bondUpdelay (optional) 
     * @param broadcast (optional) 
     * @param dnsNameservers (optional) 
     * @param dnsSearch (optional) 
     * @param family (optional) 
     * @param gateway (optional) 
     * @param macAddress (optional) 
     * @param macAddressPermanent (optional) 
     * @param method (optional) 
     * @param mtu (optional) 
     * @param netmask (optional) 
     * @param network (optional) 
     * @param physical (optional) 
     * @param routes (optional) 
     * @param status (optional) 
     * @param symmetricRouteRules (optional) 
     * @param upAndRunning (optional) 
     * @since 7.0
     **/
    @Since("7.0")
    public NetworkConfig(Optional<Boolean> Default, Optional<String> address, Optional<Boolean> auto, Optional<Long> bondDowndelay, Optional<String> bondFailOverMac, Optional<String> bondPrimaryReselect, Optional<String> bondLacpRate, Optional<Long> bondMiimon, Optional<String> bondMode, Optional<String> bondSlaves, Optional<Long> bondUpdelay, Optional<String> broadcast, Optional<String> dnsNameservers, Optional<String> dnsSearch, Optional<String> family, Optional<String> gateway, Optional<String> macAddress, Optional<String> macAddressPermanent, Optional<String> method, Optional<String> mtu, Optional<String> netmask, Optional<String> network, Optional<PhysicalAdapter> physical, Optional<String[]> routes, Optional<String> status, Optional<String[]> symmetricRouteRules, Optional<Boolean> upAndRunning) {
        this.network = (network == null) ? Optional.<String>empty() : network;
        this.method = (method == null) ? Optional.<String>empty() : method;
        this.dnsNameservers = (dnsNameservers == null) ? Optional.<String>empty() : dnsNameservers;
        this.auto = (auto == null) ? Optional.<Boolean>empty() : auto;
        this.macAddress = (macAddress == null) ? Optional.<String>empty() : macAddress;
        this.Default = (Default == null) ? Optional.<Boolean>empty() : Default;
        this.routes = (routes == null) ? Optional.<String[]>empty() : routes;
        this.macAddressPermanent = (macAddressPermanent == null) ? Optional.<String>empty() : macAddressPermanent;
        this.bondLacpRate = (bondLacpRate == null) ? Optional.<String>empty() : bondLacpRate;
        this.bondMiimon = (bondMiimon == null) ? Optional.<Long>empty() : bondMiimon;
        this.dnsSearch = (dnsSearch == null) ? Optional.<String>empty() : dnsSearch;
        this.netmask = (netmask == null) ? Optional.<String>empty() : netmask;
        this.symmetricRouteRules = (symmetricRouteRules == null) ? Optional.<String[]>empty() : symmetricRouteRules;
        this.gateway = (gateway == null) ? Optional.<String>empty() : gateway;
        this.bondDowndelay = (bondDowndelay == null) ? Optional.<Long>empty() : bondDowndelay;
        this.bondPrimaryReselect = (bondPrimaryReselect == null) ? Optional.<String>empty() : bondPrimaryReselect;
        this.broadcast = (broadcast == null) ? Optional.<String>empty() : broadcast;
        this.status = (status == null) ? Optional.<String>empty() : status;
        this.upAndRunning = (upAndRunning == null) ? Optional.<Boolean>empty() : upAndRunning;
        this.bondFailOverMac = (bondFailOverMac == null) ? Optional.<String>empty() : bondFailOverMac;
        this.bondSlaves = (bondSlaves == null) ? Optional.<String>empty() : bondSlaves;
        this.mtu = (mtu == null) ? Optional.<String>empty() : mtu;
        this.address = (address == null) ? Optional.<String>empty() : address;
        this.bondUpdelay = (bondUpdelay == null) ? Optional.<Long>empty() : bondUpdelay;
        this.bondMode = (bondMode == null) ? Optional.<String>empty() : bondMode;
        this.family = (family == null) ? Optional.<String>empty() : family;
        this.physical = (physical == null) ? Optional.<PhysicalAdapter>empty() : physical;
    }

    public Optional<Boolean> getDefault() {
        return this.Default;
    }
    public Optional<String> getAddress() {
        return this.address;
    }
    public Optional<Boolean> getAuto() {
        return this.auto;
    }
    public Optional<Long> getBondDowndelay() {
        return this.bondDowndelay;
    }
    public Optional<String> getBondFailOverMac() {
        return this.bondFailOverMac;
    }
    public Optional<String> getBondPrimaryReselect() {
        return this.bondPrimaryReselect;
    }
    public Optional<String> getBondLacpRate() {
        return this.bondLacpRate;
    }
    public Optional<Long> getBondMiimon() {
        return this.bondMiimon;
    }
    public Optional<String> getBondMode() {
        return this.bondMode;
    }
    public Optional<String> getBondSlaves() {
        return this.bondSlaves;
    }
    public Optional<Long> getBondUpdelay() {
        return this.bondUpdelay;
    }
    public Optional<String> getBroadcast() {
        return this.broadcast;
    }
    public Optional<String> getDnsNameservers() {
        return this.dnsNameservers;
    }
    public Optional<String> getDnsSearch() {
        return this.dnsSearch;
    }
    public Optional<String> getFamily() {
        return this.family;
    }
    public Optional<String> getGateway() {
        return this.gateway;
    }
    public Optional<String> getMacAddress() {
        return this.macAddress;
    }
    public Optional<String> getMacAddressPermanent() {
        return this.macAddressPermanent;
    }
    public Optional<String> getMethod() {
        return this.method;
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
    public Optional<PhysicalAdapter> getPhysical() {
        return this.physical;
    }
    public Optional<String[]> getRoutes() {
        return this.routes;
    }
    public Optional<String> getStatus() {
        return this.status;
    }
    public Optional<String[]> getSymmetricRouteRules() {
        return this.symmetricRouteRules;
    }
    public Optional<Boolean> getUpAndRunning() {
        return this.upAndRunning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NetworkConfig that = (NetworkConfig) o;
        

        return Objects.equals( Default , that.Default )
            && Objects.equals( address , that.address )
            && Objects.equals( auto , that.auto )
            && Objects.equals( bondDowndelay , that.bondDowndelay )
            && Objects.equals( bondFailOverMac , that.bondFailOverMac )
            && Objects.equals( bondPrimaryReselect , that.bondPrimaryReselect )
            && Objects.equals( bondLacpRate , that.bondLacpRate )
            && Objects.equals( bondMiimon , that.bondMiimon )
            && Objects.equals( bondMode , that.bondMode )
            && Objects.equals( bondSlaves , that.bondSlaves )
            && Objects.equals( bondUpdelay , that.bondUpdelay )
            && Objects.equals( broadcast , that.broadcast )
            && Objects.equals( dnsNameservers , that.dnsNameservers )
            && Objects.equals( dnsSearch , that.dnsSearch )
            && Objects.equals( family , that.family )
            && Objects.equals( gateway , that.gateway )
            && Objects.equals( macAddress , that.macAddress )
            && Objects.equals( macAddressPermanent , that.macAddressPermanent )
            && Objects.equals( method , that.method )
            && Objects.equals( mtu , that.mtu )
            && Objects.equals( netmask , that.netmask )
            && Objects.equals( network , that.network )
            && Objects.equals( physical , that.physical )
            && Objects.deepEquals( routes , that.routes )
            && Objects.equals( status , that.status )
            && Objects.deepEquals( symmetricRouteRules , that.symmetricRouteRules )
            && Objects.equals( upAndRunning , that.upAndRunning );
    }

    @Override
    public int hashCode() {
        return Objects.hash( Default, address, auto, bondDowndelay, bondFailOverMac, bondPrimaryReselect, bondLacpRate, bondMiimon, bondMode, bondSlaves, bondUpdelay, broadcast, dnsNameservers, dnsSearch, family, gateway, macAddress, macAddressPermanent, method, mtu, netmask, network, physical, routes, status, symmetricRouteRules, upAndRunning );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != Default && Default.isPresent())
            sb.append(" Default : ").append(Default.get()).append(",");
        if(null != address && address.isPresent())
            sb.append(" address : ").append(address.get()).append(",");
        if(null != auto && auto.isPresent())
            sb.append(" auto : ").append(auto.get()).append(",");
        if(null != bondDowndelay && bondDowndelay.isPresent())
            sb.append(" bondDowndelay : ").append(bondDowndelay.get()).append(",");
        if(null != bondFailOverMac && bondFailOverMac.isPresent())
            sb.append(" bondFailOverMac : ").append(bondFailOverMac.get()).append(",");
        if(null != bondPrimaryReselect && bondPrimaryReselect.isPresent())
            sb.append(" bondPrimaryReselect : ").append(bondPrimaryReselect.get()).append(",");
        if(null != bondLacpRate && bondLacpRate.isPresent())
            sb.append(" bondLacpRate : ").append(bondLacpRate.get()).append(",");
        if(null != bondMiimon && bondMiimon.isPresent())
            sb.append(" bondMiimon : ").append(bondMiimon.get()).append(",");
        if(null != bondMode && bondMode.isPresent())
            sb.append(" bondMode : ").append(bondMode.get()).append(",");
        if(null != bondSlaves && bondSlaves.isPresent())
            sb.append(" bondSlaves : ").append(bondSlaves.get()).append(",");
        if(null != bondUpdelay && bondUpdelay.isPresent())
            sb.append(" bondUpdelay : ").append(bondUpdelay.get()).append(",");
        if(null != broadcast && broadcast.isPresent())
            sb.append(" broadcast : ").append(broadcast.get()).append(",");
        if(null != dnsNameservers && dnsNameservers.isPresent())
            sb.append(" dnsNameservers : ").append(dnsNameservers.get()).append(",");
        if(null != dnsSearch && dnsSearch.isPresent())
            sb.append(" dnsSearch : ").append(dnsSearch.get()).append(",");
        if(null != family && family.isPresent())
            sb.append(" family : ").append(family.get()).append(",");
        if(null != gateway && gateway.isPresent())
            sb.append(" gateway : ").append(gateway.get()).append(",");
        if(null != macAddress && macAddress.isPresent())
            sb.append(" macAddress : ").append(macAddress.get()).append(",");
        if(null != macAddressPermanent && macAddressPermanent.isPresent())
            sb.append(" macAddressPermanent : ").append(macAddressPermanent.get()).append(",");
        if(null != method && method.isPresent())
            sb.append(" method : ").append(method.get()).append(",");
        if(null != mtu && mtu.isPresent())
            sb.append(" mtu : ").append(mtu.get()).append(",");
        if(null != netmask && netmask.isPresent())
            sb.append(" netmask : ").append(netmask.get()).append(",");
        if(null != network && network.isPresent())
            sb.append(" network : ").append(network.get()).append(",");
        if(null != physical && physical.isPresent())
            sb.append(" physical : ").append(physical.get()).append(",");
        if(null != routes && routes.isPresent())
            sb.append(" routes : ").append(Arrays.toString(routes.get())).append(",");
        if(null != status && status.isPresent())
            sb.append(" status : ").append(status.get()).append(",");
        if(null != symmetricRouteRules && symmetricRouteRules.isPresent())
            sb.append(" symmetricRouteRules : ").append(Arrays.toString(symmetricRouteRules.get())).append(",");
        if(null != upAndRunning && upAndRunning.isPresent())
            sb.append(" upAndRunning : ").append(upAndRunning.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
