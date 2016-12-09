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

public class NetworkConfig implements Serializable {

    public static final long serialVersionUID = -6490718356259567027L;
    @SerializedName("#default") private Optional<Boolean> _default;
    @SerializedName("bond-master") private String bondMaster;
    @SerializedName("virtualNetworkTag") private String virtualNetworkTag;
    @SerializedName("address") private Optional<String> address;
    @SerializedName("auto") private Optional<Boolean> auto;
    @SerializedName("bond-downdelay") private Optional<String> bondDowndelay;
    @SerializedName("bond-fail_over_mac") private Optional<String> bondFailOverMac;
    @SerializedName("bond-primary_reselect") private Optional<String> bondPrimaryReselect;
    @SerializedName("bond-lacp_rate") private Optional<String> bondLacpRate;
    @SerializedName("bond-miimon") private Optional<String> bondMiimon;
    @SerializedName("bond-mode") private Optional<String> bondMode;
    @SerializedName("bond-slaves") private Optional<String> bondSlaves;
    @SerializedName("bond-updelay") private Optional<String> bondUpdelay;
    @SerializedName("broadcast") private Optional<String> broadcast;
    @SerializedName("dns-nameservers") private Optional<String> dnsNameservers;
    @SerializedName("dns-search") private Optional<String> dnsSearch;
    @SerializedName("family") private Optional<String> family;
    @SerializedName("gateway") private Optional<String> gateway;
    @SerializedName("macAddress") private Optional<String> macAddress;
    @SerializedName("macAddressPermanent") private Optional<String> macAddressPermanent;
    @SerializedName("method") private Optional<String> method;
    @SerializedName("mtu") private Optional<String> mtu;
    @SerializedName("netmask") private Optional<String> netmask;
    @SerializedName("network") private Optional<String> network;
    @SerializedName("physical") private Optional<PhysicalAdapter> physical;
    @SerializedName("routes") private Optional<String[]> routes;
    @SerializedName("status") private Optional<String> status;
    @SerializedName("symmetricRouteRules") private Optional<String[]> symmetricRouteRules;
    @SerializedName("upAndRunning") private Optional<Boolean> upAndRunning;

    // empty constructor
    @Since("7.0")
    public NetworkConfig() {}

    
    // parameterized constructor
    @Since("7.0")
    public NetworkConfig(
        Optional<Boolean> _default,
        String bondMaster,
        String virtualNetworkTag,
        Optional<String> address,
        Optional<Boolean> auto,
        Optional<String> bondDowndelay,
        Optional<String> bondFailOverMac,
        Optional<String> bondPrimaryReselect,
        Optional<String> bondLacpRate,
        Optional<String> bondMiimon,
        Optional<String> bondMode,
        Optional<String> bondSlaves,
        Optional<String> bondUpdelay,
        Optional<String> broadcast,
        Optional<String> dnsNameservers,
        Optional<String> dnsSearch,
        Optional<String> family,
        Optional<String> gateway,
        Optional<String> macAddress,
        Optional<String> macAddressPermanent,
        Optional<String> method,
        Optional<String> mtu,
        Optional<String> netmask,
        Optional<String> network,
        Optional<PhysicalAdapter> physical,
        Optional<String[]> routes,
        Optional<String> status,
        Optional<String[]> symmetricRouteRules,
        Optional<Boolean> upAndRunning
    )
    {
        this._default = (_default == null) ? Optional.<Boolean>empty() : _default;
        this.bondMaster = bondMaster;
        this.virtualNetworkTag = virtualNetworkTag;
        this.address = (address == null) ? Optional.<String>empty() : address;
        this.auto = (auto == null) ? Optional.<Boolean>empty() : auto;
        this.bondDowndelay = (bondDowndelay == null) ? Optional.<String>empty() : bondDowndelay;
        this.bondFailOverMac = (bondFailOverMac == null) ? Optional.<String>empty() : bondFailOverMac;
        this.bondPrimaryReselect = (bondPrimaryReselect == null) ? Optional.<String>empty() : bondPrimaryReselect;
        this.bondLacpRate = (bondLacpRate == null) ? Optional.<String>empty() : bondLacpRate;
        this.bondMiimon = (bondMiimon == null) ? Optional.<String>empty() : bondMiimon;
        this.bondMode = (bondMode == null) ? Optional.<String>empty() : bondMode;
        this.bondSlaves = (bondSlaves == null) ? Optional.<String>empty() : bondSlaves;
        this.bondUpdelay = (bondUpdelay == null) ? Optional.<String>empty() : bondUpdelay;
        this.broadcast = (broadcast == null) ? Optional.<String>empty() : broadcast;
        this.dnsNameservers = (dnsNameservers == null) ? Optional.<String>empty() : dnsNameservers;
        this.dnsSearch = (dnsSearch == null) ? Optional.<String>empty() : dnsSearch;
        this.family = (family == null) ? Optional.<String>empty() : family;
        this.gateway = (gateway == null) ? Optional.<String>empty() : gateway;
        this.macAddress = (macAddress == null) ? Optional.<String>empty() : macAddress;
        this.macAddressPermanent = (macAddressPermanent == null) ? Optional.<String>empty() : macAddressPermanent;
        this.method = (method == null) ? Optional.<String>empty() : method;
        this.mtu = (mtu == null) ? Optional.<String>empty() : mtu;
        this.netmask = (netmask == null) ? Optional.<String>empty() : netmask;
        this.network = (network == null) ? Optional.<String>empty() : network;
        this.physical = (physical == null) ? Optional.<PhysicalAdapter>empty() : physical;
        this.routes = (routes == null) ? Optional.<String[]>empty() : routes;
        this.status = (status == null) ? Optional.<String>empty() : status;
        this.symmetricRouteRules = (symmetricRouteRules == null) ? Optional.<String[]>empty() : symmetricRouteRules;
        this.upAndRunning = (upAndRunning == null) ? Optional.<Boolean>empty() : upAndRunning;
    }

    /** 
     **/
    public Optional<Boolean> get_default() { return this._default; }
    public void set_default(Optional<Boolean> _default) { 
        this._default = (_default == null) ? Optional.<Boolean>empty() : _default;
    }
    /** 
     **/
    public String getBondMaster() { return this.bondMaster; }
    public void setBondMaster(String bondMaster) { 
        this.bondMaster = bondMaster;
    }
    /** 
     **/
    public String getVirtualNetworkTag() { return this.virtualNetworkTag; }
    public void setVirtualNetworkTag(String virtualNetworkTag) { 
        this.virtualNetworkTag = virtualNetworkTag;
    }
    /** 
     **/
    public Optional<String> getAddress() { return this.address; }
    public void setAddress(Optional<String> address) { 
        this.address = (address == null) ? Optional.<String>empty() : address;
    }
    /** 
     **/
    public Optional<Boolean> getAuto() { return this.auto; }
    public void setAuto(Optional<Boolean> auto) { 
        this.auto = (auto == null) ? Optional.<Boolean>empty() : auto;
    }
    /** 
     **/
    public Optional<String> getBondDowndelay() { return this.bondDowndelay; }
    public void setBondDowndelay(Optional<String> bondDowndelay) { 
        this.bondDowndelay = (bondDowndelay == null) ? Optional.<String>empty() : bondDowndelay;
    }
    /** 
     **/
    public Optional<String> getBondFailOverMac() { return this.bondFailOverMac; }
    public void setBondFailOverMac(Optional<String> bondFailOverMac) { 
        this.bondFailOverMac = (bondFailOverMac == null) ? Optional.<String>empty() : bondFailOverMac;
    }
    /** 
     **/
    public Optional<String> getBondPrimaryReselect() { return this.bondPrimaryReselect; }
    public void setBondPrimaryReselect(Optional<String> bondPrimaryReselect) { 
        this.bondPrimaryReselect = (bondPrimaryReselect == null) ? Optional.<String>empty() : bondPrimaryReselect;
    }
    /** 
     **/
    public Optional<String> getBondLacpRate() { return this.bondLacpRate; }
    public void setBondLacpRate(Optional<String> bondLacpRate) { 
        this.bondLacpRate = (bondLacpRate == null) ? Optional.<String>empty() : bondLacpRate;
    }
    /** 
     **/
    public Optional<String> getBondMiimon() { return this.bondMiimon; }
    public void setBondMiimon(Optional<String> bondMiimon) { 
        this.bondMiimon = (bondMiimon == null) ? Optional.<String>empty() : bondMiimon;
    }
    /** 
     **/
    public Optional<String> getBondMode() { return this.bondMode; }
    public void setBondMode(Optional<String> bondMode) { 
        this.bondMode = (bondMode == null) ? Optional.<String>empty() : bondMode;
    }
    /** 
     **/
    public Optional<String> getBondSlaves() { return this.bondSlaves; }
    public void setBondSlaves(Optional<String> bondSlaves) { 
        this.bondSlaves = (bondSlaves == null) ? Optional.<String>empty() : bondSlaves;
    }
    /** 
     **/
    public Optional<String> getBondUpdelay() { return this.bondUpdelay; }
    public void setBondUpdelay(Optional<String> bondUpdelay) { 
        this.bondUpdelay = (bondUpdelay == null) ? Optional.<String>empty() : bondUpdelay;
    }
    /** 
     **/
    public Optional<String> getBroadcast() { return this.broadcast; }
    public void setBroadcast(Optional<String> broadcast) { 
        this.broadcast = (broadcast == null) ? Optional.<String>empty() : broadcast;
    }
    /** 
     **/
    public Optional<String> getDnsNameservers() { return this.dnsNameservers; }
    public void setDnsNameservers(Optional<String> dnsNameservers) { 
        this.dnsNameservers = (dnsNameservers == null) ? Optional.<String>empty() : dnsNameservers;
    }
    /** 
     **/
    public Optional<String> getDnsSearch() { return this.dnsSearch; }
    public void setDnsSearch(Optional<String> dnsSearch) { 
        this.dnsSearch = (dnsSearch == null) ? Optional.<String>empty() : dnsSearch;
    }
    /** 
     **/
    public Optional<String> getFamily() { return this.family; }
    public void setFamily(Optional<String> family) { 
        this.family = (family == null) ? Optional.<String>empty() : family;
    }
    /** 
     **/
    public Optional<String> getGateway() { return this.gateway; }
    public void setGateway(Optional<String> gateway) { 
        this.gateway = (gateway == null) ? Optional.<String>empty() : gateway;
    }
    /** 
     **/
    public Optional<String> getMacAddress() { return this.macAddress; }
    public void setMacAddress(Optional<String> macAddress) { 
        this.macAddress = (macAddress == null) ? Optional.<String>empty() : macAddress;
    }
    /** 
     **/
    public Optional<String> getMacAddressPermanent() { return this.macAddressPermanent; }
    public void setMacAddressPermanent(Optional<String> macAddressPermanent) { 
        this.macAddressPermanent = (macAddressPermanent == null) ? Optional.<String>empty() : macAddressPermanent;
    }
    /** 
     **/
    public Optional<String> getMethod() { return this.method; }
    public void setMethod(Optional<String> method) { 
        this.method = (method == null) ? Optional.<String>empty() : method;
    }
    /** 
     **/
    public Optional<String> getMtu() { return this.mtu; }
    public void setMtu(Optional<String> mtu) { 
        this.mtu = (mtu == null) ? Optional.<String>empty() : mtu;
    }
    /** 
     **/
    public Optional<String> getNetmask() { return this.netmask; }
    public void setNetmask(Optional<String> netmask) { 
        this.netmask = (netmask == null) ? Optional.<String>empty() : netmask;
    }
    /** 
     **/
    public Optional<String> getNetwork() { return this.network; }
    public void setNetwork(Optional<String> network) { 
        this.network = (network == null) ? Optional.<String>empty() : network;
    }
    /** 
     **/
    public Optional<PhysicalAdapter> getPhysical() { return this.physical; }
    public void setPhysical(Optional<PhysicalAdapter> physical) { 
        this.physical = (physical == null) ? Optional.<PhysicalAdapter>empty() : physical;
    }
    /** 
     **/
    public Optional<String[]> getRoutes() { return this.routes; }
    public void setRoutes(Optional<String[]> routes) { 
        this.routes = (routes == null) ? Optional.<String[]>empty() : routes;
    }
    /** 
     **/
    public Optional<String> getStatus() { return this.status; }
    public void setStatus(Optional<String> status) { 
        this.status = (status == null) ? Optional.<String>empty() : status;
    }
    /** 
     **/
    public Optional<String[]> getSymmetricRouteRules() { return this.symmetricRouteRules; }
    public void setSymmetricRouteRules(Optional<String[]> symmetricRouteRules) { 
        this.symmetricRouteRules = (symmetricRouteRules == null) ? Optional.<String[]>empty() : symmetricRouteRules;
    }
    /** 
     **/
    public Optional<Boolean> getUpAndRunning() { return this.upAndRunning; }
    public void setUpAndRunning(Optional<Boolean> upAndRunning) { 
        this.upAndRunning = (upAndRunning == null) ? Optional.<Boolean>empty() : upAndRunning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NetworkConfig that = (NetworkConfig) o;

        return 
            Objects.equals(_default, that._default) && 
            Objects.equals(bondMaster, that.bondMaster) && 
            Objects.equals(virtualNetworkTag, that.virtualNetworkTag) && 
            Objects.equals(address, that.address) && 
            Objects.equals(auto, that.auto) && 
            Objects.equals(bondDowndelay, that.bondDowndelay) && 
            Objects.equals(bondFailOverMac, that.bondFailOverMac) && 
            Objects.equals(bondPrimaryReselect, that.bondPrimaryReselect) && 
            Objects.equals(bondLacpRate, that.bondLacpRate) && 
            Objects.equals(bondMiimon, that.bondMiimon) && 
            Objects.equals(bondMode, that.bondMode) && 
            Objects.equals(bondSlaves, that.bondSlaves) && 
            Objects.equals(bondUpdelay, that.bondUpdelay) && 
            Objects.equals(broadcast, that.broadcast) && 
            Objects.equals(dnsNameservers, that.dnsNameservers) && 
            Objects.equals(dnsSearch, that.dnsSearch) && 
            Objects.equals(family, that.family) && 
            Objects.equals(gateway, that.gateway) && 
            Objects.equals(macAddress, that.macAddress) && 
            Objects.equals(macAddressPermanent, that.macAddressPermanent) && 
            Objects.equals(method, that.method) && 
            Objects.equals(mtu, that.mtu) && 
            Objects.equals(netmask, that.netmask) && 
            Objects.equals(network, that.network) && 
            Objects.equals(physical, that.physical) && 
            Objects.equals(routes, that.routes) && 
            Objects.equals(status, that.status) && 
            Objects.equals(symmetricRouteRules, that.symmetricRouteRules) && 
            Objects.equals(upAndRunning, that.upAndRunning);
    }

    @Override
    public int hashCode() {
        return Objects.hash( _default,bondMaster,virtualNetworkTag,address,auto,bondDowndelay,bondFailOverMac,bondPrimaryReselect,bondLacpRate,bondMiimon,bondMode,bondSlaves,bondUpdelay,broadcast,dnsNameservers,dnsSearch,family,gateway,macAddress,macAddressPermanent,method,mtu,netmask,network,physical,routes,status,symmetricRouteRules,upAndRunning );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("_default", _default);
        map.put("bondMaster", bondMaster);
        map.put("virtualNetworkTag", virtualNetworkTag);
        map.put("address", address);
        map.put("auto", auto);
        map.put("bondDowndelay", bondDowndelay);
        map.put("bondFailOverMac", bondFailOverMac);
        map.put("bondPrimaryReselect", bondPrimaryReselect);
        map.put("bondLacpRate", bondLacpRate);
        map.put("bondMiimon", bondMiimon);
        map.put("bondMode", bondMode);
        map.put("bondSlaves", bondSlaves);
        map.put("bondUpdelay", bondUpdelay);
        map.put("broadcast", broadcast);
        map.put("dnsNameservers", dnsNameservers);
        map.put("dnsSearch", dnsSearch);
        map.put("family", family);
        map.put("gateway", gateway);
        map.put("macAddress", macAddress);
        map.put("macAddressPermanent", macAddressPermanent);
        map.put("method", method);
        map.put("mtu", mtu);
        map.put("netmask", netmask);
        map.put("network", network);
        map.put("physical", physical);
        map.put("routes", routes);
        map.put("status", status);
        map.put("symmetricRouteRules", symmetricRouteRules);
        map.put("upAndRunning", upAndRunning);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != _default && _default.isPresent()){
            sb.append(" _default : ").append(_default).append(",");
        }
        sb.append(" bondMaster : ").append(bondMaster).append(",");
        sb.append(" virtualNetworkTag : ").append(virtualNetworkTag).append(",");
        if(null != address && address.isPresent()){
            sb.append(" address : ").append(address).append(",");
        }
        if(null != auto && auto.isPresent()){
            sb.append(" auto : ").append(auto).append(",");
        }
        if(null != bondDowndelay && bondDowndelay.isPresent()){
            sb.append(" bondDowndelay : ").append(bondDowndelay).append(",");
        }
        if(null != bondFailOverMac && bondFailOverMac.isPresent()){
            sb.append(" bondFailOverMac : ").append(bondFailOverMac).append(",");
        }
        if(null != bondPrimaryReselect && bondPrimaryReselect.isPresent()){
            sb.append(" bondPrimaryReselect : ").append(bondPrimaryReselect).append(",");
        }
        if(null != bondLacpRate && bondLacpRate.isPresent()){
            sb.append(" bondLacpRate : ").append(bondLacpRate).append(",");
        }
        if(null != bondMiimon && bondMiimon.isPresent()){
            sb.append(" bondMiimon : ").append(bondMiimon).append(",");
        }
        if(null != bondMode && bondMode.isPresent()){
            sb.append(" bondMode : ").append(bondMode).append(",");
        }
        if(null != bondSlaves && bondSlaves.isPresent()){
            sb.append(" bondSlaves : ").append(bondSlaves).append(",");
        }
        if(null != bondUpdelay && bondUpdelay.isPresent()){
            sb.append(" bondUpdelay : ").append(bondUpdelay).append(",");
        }
        if(null != broadcast && broadcast.isPresent()){
            sb.append(" broadcast : ").append(broadcast).append(",");
        }
        if(null != dnsNameservers && dnsNameservers.isPresent()){
            sb.append(" dnsNameservers : ").append(dnsNameservers).append(",");
        }
        if(null != dnsSearch && dnsSearch.isPresent()){
            sb.append(" dnsSearch : ").append(dnsSearch).append(",");
        }
        if(null != family && family.isPresent()){
            sb.append(" family : ").append(family).append(",");
        }
        if(null != gateway && gateway.isPresent()){
            sb.append(" gateway : ").append(gateway).append(",");
        }
        if(null != macAddress && macAddress.isPresent()){
            sb.append(" macAddress : ").append(macAddress).append(",");
        }
        if(null != macAddressPermanent && macAddressPermanent.isPresent()){
            sb.append(" macAddressPermanent : ").append(macAddressPermanent).append(",");
        }
        if(null != method && method.isPresent()){
            sb.append(" method : ").append(method).append(",");
        }
        if(null != mtu && mtu.isPresent()){
            sb.append(" mtu : ").append(mtu).append(",");
        }
        if(null != netmask && netmask.isPresent()){
            sb.append(" netmask : ").append(netmask).append(",");
        }
        if(null != network && network.isPresent()){
            sb.append(" network : ").append(network).append(",");
        }
        if(null != physical && physical.isPresent()){
            sb.append(" physical : ").append(physical).append(",");
        }
        if(null != routes && routes.isPresent()){
            sb.append(" routes : ").append(routes).append(",");
        }
        if(null != status && status.isPresent()){
            sb.append(" status : ").append(status).append(",");
        }
        if(null != symmetricRouteRules && symmetricRouteRules.isPresent()){
            sb.append(" symmetricRouteRules : ").append(symmetricRouteRules).append(",");
        }
        if(null != upAndRunning && upAndRunning.isPresent()){
            sb.append(" upAndRunning : ").append(upAndRunning).append(",");
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
        private Optional<Boolean> _default;
        private String bondMaster;
        private String virtualNetworkTag;
        private Optional<String> address;
        private Optional<Boolean> auto;
        private Optional<String> bondDowndelay;
        private Optional<String> bondFailOverMac;
        private Optional<String> bondPrimaryReselect;
        private Optional<String> bondLacpRate;
        private Optional<String> bondMiimon;
        private Optional<String> bondMode;
        private Optional<String> bondSlaves;
        private Optional<String> bondUpdelay;
        private Optional<String> broadcast;
        private Optional<String> dnsNameservers;
        private Optional<String> dnsSearch;
        private Optional<String> family;
        private Optional<String> gateway;
        private Optional<String> macAddress;
        private Optional<String> macAddressPermanent;
        private Optional<String> method;
        private Optional<String> mtu;
        private Optional<String> netmask;
        private Optional<String> network;
        private Optional<PhysicalAdapter> physical;
        private Optional<String[]> routes;
        private Optional<String> status;
        private Optional<String[]> symmetricRouteRules;
        private Optional<Boolean> upAndRunning;

        private Builder() { }

        public NetworkConfig build() {
            return new NetworkConfig (
                         this._default,
                         this.bondMaster,
                         this.virtualNetworkTag,
                         this.address,
                         this.auto,
                         this.bondDowndelay,
                         this.bondFailOverMac,
                         this.bondPrimaryReselect,
                         this.bondLacpRate,
                         this.bondMiimon,
                         this.bondMode,
                         this.bondSlaves,
                         this.bondUpdelay,
                         this.broadcast,
                         this.dnsNameservers,
                         this.dnsSearch,
                         this.family,
                         this.gateway,
                         this.macAddress,
                         this.macAddressPermanent,
                         this.method,
                         this.mtu,
                         this.netmask,
                         this.network,
                         this.physical,
                         this.routes,
                         this.status,
                         this.symmetricRouteRules,
                         this.upAndRunning);
        }

        private NetworkConfig.Builder buildFrom(final NetworkConfig req) {
            this._default = req._default;
            this.bondMaster = req.bondMaster;
            this.virtualNetworkTag = req.virtualNetworkTag;
            this.address = req.address;
            this.auto = req.auto;
            this.bondDowndelay = req.bondDowndelay;
            this.bondFailOverMac = req.bondFailOverMac;
            this.bondPrimaryReselect = req.bondPrimaryReselect;
            this.bondLacpRate = req.bondLacpRate;
            this.bondMiimon = req.bondMiimon;
            this.bondMode = req.bondMode;
            this.bondSlaves = req.bondSlaves;
            this.bondUpdelay = req.bondUpdelay;
            this.broadcast = req.broadcast;
            this.dnsNameservers = req.dnsNameservers;
            this.dnsSearch = req.dnsSearch;
            this.family = req.family;
            this.gateway = req.gateway;
            this.macAddress = req.macAddress;
            this.macAddressPermanent = req.macAddressPermanent;
            this.method = req.method;
            this.mtu = req.mtu;
            this.netmask = req.netmask;
            this.network = req.network;
            this.physical = req.physical;
            this.routes = req.routes;
            this.status = req.status;
            this.symmetricRouteRules = req.symmetricRouteRules;
            this.upAndRunning = req.upAndRunning;

            return this;
        }

        public NetworkConfig.Builder optional_default(final Boolean _default) {
            this._default = (_default == null) ? Optional.<Boolean>empty() : Optional.of(_default);
            return this;
        }

        public NetworkConfig.Builder bondMaster(final String bondMaster) {
            this.bondMaster = bondMaster;
            return this;
        }

        public NetworkConfig.Builder virtualNetworkTag(final String virtualNetworkTag) {
            this.virtualNetworkTag = virtualNetworkTag;
            return this;
        }

        public NetworkConfig.Builder optionalAddress(final String address) {
            this.address = (address == null) ? Optional.<String>empty() : Optional.of(address);
            return this;
        }

        public NetworkConfig.Builder optionalAuto(final Boolean auto) {
            this.auto = (auto == null) ? Optional.<Boolean>empty() : Optional.of(auto);
            return this;
        }

        public NetworkConfig.Builder optionalBondDowndelay(final String bondDowndelay) {
            this.bondDowndelay = (bondDowndelay == null) ? Optional.<String>empty() : Optional.of(bondDowndelay);
            return this;
        }

        public NetworkConfig.Builder optionalBondFailOverMac(final String bondFailOverMac) {
            this.bondFailOverMac = (bondFailOverMac == null) ? Optional.<String>empty() : Optional.of(bondFailOverMac);
            return this;
        }

        public NetworkConfig.Builder optionalBondPrimaryReselect(final String bondPrimaryReselect) {
            this.bondPrimaryReselect = (bondPrimaryReselect == null) ? Optional.<String>empty() : Optional.of(bondPrimaryReselect);
            return this;
        }

        public NetworkConfig.Builder optionalBondLacpRate(final String bondLacpRate) {
            this.bondLacpRate = (bondLacpRate == null) ? Optional.<String>empty() : Optional.of(bondLacpRate);
            return this;
        }

        public NetworkConfig.Builder optionalBondMiimon(final String bondMiimon) {
            this.bondMiimon = (bondMiimon == null) ? Optional.<String>empty() : Optional.of(bondMiimon);
            return this;
        }

        public NetworkConfig.Builder optionalBondMode(final String bondMode) {
            this.bondMode = (bondMode == null) ? Optional.<String>empty() : Optional.of(bondMode);
            return this;
        }

        public NetworkConfig.Builder optionalBondSlaves(final String bondSlaves) {
            this.bondSlaves = (bondSlaves == null) ? Optional.<String>empty() : Optional.of(bondSlaves);
            return this;
        }

        public NetworkConfig.Builder optionalBondUpdelay(final String bondUpdelay) {
            this.bondUpdelay = (bondUpdelay == null) ? Optional.<String>empty() : Optional.of(bondUpdelay);
            return this;
        }

        public NetworkConfig.Builder optionalBroadcast(final String broadcast) {
            this.broadcast = (broadcast == null) ? Optional.<String>empty() : Optional.of(broadcast);
            return this;
        }

        public NetworkConfig.Builder optionalDnsNameservers(final String dnsNameservers) {
            this.dnsNameservers = (dnsNameservers == null) ? Optional.<String>empty() : Optional.of(dnsNameservers);
            return this;
        }

        public NetworkConfig.Builder optionalDnsSearch(final String dnsSearch) {
            this.dnsSearch = (dnsSearch == null) ? Optional.<String>empty() : Optional.of(dnsSearch);
            return this;
        }

        public NetworkConfig.Builder optionalFamily(final String family) {
            this.family = (family == null) ? Optional.<String>empty() : Optional.of(family);
            return this;
        }

        public NetworkConfig.Builder optionalGateway(final String gateway) {
            this.gateway = (gateway == null) ? Optional.<String>empty() : Optional.of(gateway);
            return this;
        }

        public NetworkConfig.Builder optionalMacAddress(final String macAddress) {
            this.macAddress = (macAddress == null) ? Optional.<String>empty() : Optional.of(macAddress);
            return this;
        }

        public NetworkConfig.Builder optionalMacAddressPermanent(final String macAddressPermanent) {
            this.macAddressPermanent = (macAddressPermanent == null) ? Optional.<String>empty() : Optional.of(macAddressPermanent);
            return this;
        }

        public NetworkConfig.Builder optionalMethod(final String method) {
            this.method = (method == null) ? Optional.<String>empty() : Optional.of(method);
            return this;
        }

        public NetworkConfig.Builder optionalMtu(final String mtu) {
            this.mtu = (mtu == null) ? Optional.<String>empty() : Optional.of(mtu);
            return this;
        }

        public NetworkConfig.Builder optionalNetmask(final String netmask) {
            this.netmask = (netmask == null) ? Optional.<String>empty() : Optional.of(netmask);
            return this;
        }

        public NetworkConfig.Builder optionalNetwork(final String network) {
            this.network = (network == null) ? Optional.<String>empty() : Optional.of(network);
            return this;
        }

        public NetworkConfig.Builder optionalPhysical(final PhysicalAdapter physical) {
            this.physical = (physical == null) ? Optional.<PhysicalAdapter>empty() : Optional.of(physical);
            return this;
        }

        public NetworkConfig.Builder optionalRoutes(final String[] routes) {
            this.routes = (routes == null) ? Optional.<String[]>empty() : Optional.of(routes);
            return this;
        }

        public NetworkConfig.Builder optionalStatus(final String status) {
            this.status = (status == null) ? Optional.<String>empty() : Optional.of(status);
            return this;
        }

        public NetworkConfig.Builder optionalSymmetricRouteRules(final String[] symmetricRouteRules) {
            this.symmetricRouteRules = (symmetricRouteRules == null) ? Optional.<String[]>empty() : Optional.of(symmetricRouteRules);
            return this;
        }

        public NetworkConfig.Builder optionalUpAndRunning(final Boolean upAndRunning) {
            this.upAndRunning = (upAndRunning == null) ? Optional.<Boolean>empty() : Optional.of(upAndRunning);
            return this;
        }

    }
}
