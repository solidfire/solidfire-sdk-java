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

import com.solidfire.gson.Gson;
import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * NetworkConfig  
 **/

public class NetworkConfig implements Serializable {

    public static final long serialVersionUID = -7180868741251971960L;
    @SerializedName("#default") private Optional<Boolean> _default;
    @SerializedName("bond-master") private Optional<String> bondMaster;
    @SerializedName("virtualNetworkTag") private Optional<String> virtualNetworkTag;
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
    @SerializedName("routes") private Optional<Attributes[]> routes;
    @SerializedName("status") private Optional<String> status;
    @SerializedName("symmetricRouteRules") private Optional<String[]> symmetricRouteRules;
    @SerializedName("upAndRunning") private Optional<Boolean> upAndRunning;
    @SerializedName("bond-xmit_hash_policy") private Optional<String> bondXmitHashPolicy;
    @SerializedName("bond-ad_num_ports") private Optional<String> bondAdNumPorts;
    @SerializedName("interfaceName") private Optional<String> interfaceName;
    // empty constructor
    @Since("7.0")
    public NetworkConfig() {}

    
    // parameterized constructor
    @Since("7.0")
    public NetworkConfig(
        Optional<Boolean> _default,
        Optional<String> bondMaster,
        Optional<String> virtualNetworkTag,
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
        Optional<Attributes[]> routes,
        Optional<String> status,
        Optional<String[]> symmetricRouteRules,
        Optional<Boolean> upAndRunning,
        Optional<String> bondXmitHashPolicy,
        Optional<String> bondAdNumPorts,
        Optional<String> interfaceName
    )
    {
        this._default = (_default == null) ? Optional.<Boolean>empty() : _default;
        this.bondMaster = (bondMaster == null) ? Optional.<String>empty() : bondMaster;
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<String>empty() : virtualNetworkTag;
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
        this.routes = (routes == null) ? Optional.<Attributes[]>empty() : routes;
        this.status = (status == null) ? Optional.<String>empty() : status;
        this.symmetricRouteRules = (symmetricRouteRules == null) ? Optional.<String[]>empty() : symmetricRouteRules;
        this.upAndRunning = (upAndRunning == null) ? Optional.<Boolean>empty() : upAndRunning;
        this.bondXmitHashPolicy = (bondXmitHashPolicy == null) ? Optional.<String>empty() : bondXmitHashPolicy;
        this.bondAdNumPorts = (bondAdNumPorts == null) ? Optional.<String>empty() : bondAdNumPorts;
        this.interfaceName = (interfaceName == null) ? Optional.<String>empty() : interfaceName;
    }

    /** 
     * 
     **/
    public Optional<Boolean> get_default() { return this._default; }
   
    public void set_default(Optional<Boolean> _default) { 
        this._default = (_default == null) ? Optional.<Boolean>empty() : _default;
    }
    /** 
     * 
     **/
    public Optional<String> getBondMaster() { return this.bondMaster; }
   
    public void setBondMaster(Optional<String> bondMaster) { 
        this.bondMaster = (bondMaster == null) ? Optional.<String>empty() : bondMaster;
    }
    /** 
     * 
     **/
    public Optional<String> getVirtualNetworkTag() { return this.virtualNetworkTag; }
   
    public void setVirtualNetworkTag(Optional<String> virtualNetworkTag) { 
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<String>empty() : virtualNetworkTag;
    }
    /** 
     * 
     **/
    public Optional<String> getAddress() { return this.address; }
   
    public void setAddress(Optional<String> address) { 
        this.address = (address == null) ? Optional.<String>empty() : address;
    }
    /** 
     * 
     **/
    public Optional<Boolean> getAuto() { return this.auto; }
   
    public void setAuto(Optional<Boolean> auto) { 
        this.auto = (auto == null) ? Optional.<Boolean>empty() : auto;
    }
    /** 
     * 
     **/
    public Optional<String> getBondDowndelay() { return this.bondDowndelay; }
   
    public void setBondDowndelay(Optional<String> bondDowndelay) { 
        this.bondDowndelay = (bondDowndelay == null) ? Optional.<String>empty() : bondDowndelay;
    }
    /** 
     * 
     **/
    public Optional<String> getBondFailOverMac() { return this.bondFailOverMac; }
   
    public void setBondFailOverMac(Optional<String> bondFailOverMac) { 
        this.bondFailOverMac = (bondFailOverMac == null) ? Optional.<String>empty() : bondFailOverMac;
    }
    /** 
     * 
     **/
    public Optional<String> getBondPrimaryReselect() { return this.bondPrimaryReselect; }
   
    public void setBondPrimaryReselect(Optional<String> bondPrimaryReselect) { 
        this.bondPrimaryReselect = (bondPrimaryReselect == null) ? Optional.<String>empty() : bondPrimaryReselect;
    }
    /** 
     * 
     **/
    public Optional<String> getBondLacpRate() { return this.bondLacpRate; }
   
    public void setBondLacpRate(Optional<String> bondLacpRate) { 
        this.bondLacpRate = (bondLacpRate == null) ? Optional.<String>empty() : bondLacpRate;
    }
    /** 
     * 
     **/
    public Optional<String> getBondMiimon() { return this.bondMiimon; }
   
    public void setBondMiimon(Optional<String> bondMiimon) { 
        this.bondMiimon = (bondMiimon == null) ? Optional.<String>empty() : bondMiimon;
    }
    /** 
     * 
     **/
    public Optional<String> getBondMode() { return this.bondMode; }
   
    public void setBondMode(Optional<String> bondMode) { 
        this.bondMode = (bondMode == null) ? Optional.<String>empty() : bondMode;
    }
    /** 
     * 
     **/
    public Optional<String> getBondSlaves() { return this.bondSlaves; }
   
    public void setBondSlaves(Optional<String> bondSlaves) { 
        this.bondSlaves = (bondSlaves == null) ? Optional.<String>empty() : bondSlaves;
    }
    /** 
     * 
     **/
    public Optional<String> getBondUpdelay() { return this.bondUpdelay; }
   
    public void setBondUpdelay(Optional<String> bondUpdelay) { 
        this.bondUpdelay = (bondUpdelay == null) ? Optional.<String>empty() : bondUpdelay;
    }
    /** 
     * 
     **/
    public Optional<String> getDnsNameservers() { return this.dnsNameservers; }
   
    public void setDnsNameservers(Optional<String> dnsNameservers) { 
        this.dnsNameservers = (dnsNameservers == null) ? Optional.<String>empty() : dnsNameservers;
    }
    /** 
     * 
     **/
    public Optional<String> getDnsSearch() { return this.dnsSearch; }
   
    public void setDnsSearch(Optional<String> dnsSearch) { 
        this.dnsSearch = (dnsSearch == null) ? Optional.<String>empty() : dnsSearch;
    }
    /** 
     * 
     **/
    public Optional<String> getFamily() { return this.family; }
   
    public void setFamily(Optional<String> family) { 
        this.family = (family == null) ? Optional.<String>empty() : family;
    }
    /** 
     * 
     **/
    public Optional<String> getGateway() { return this.gateway; }
   
    public void setGateway(Optional<String> gateway) { 
        this.gateway = (gateway == null) ? Optional.<String>empty() : gateway;
    }
    /** 
     * 
     **/
    public Optional<String> getMacAddress() { return this.macAddress; }
   
    public void setMacAddress(Optional<String> macAddress) { 
        this.macAddress = (macAddress == null) ? Optional.<String>empty() : macAddress;
    }
    /** 
     * 
     **/
    public Optional<String> getMacAddressPermanent() { return this.macAddressPermanent; }
   
    public void setMacAddressPermanent(Optional<String> macAddressPermanent) { 
        this.macAddressPermanent = (macAddressPermanent == null) ? Optional.<String>empty() : macAddressPermanent;
    }
    /** 
     * 
     **/
    public Optional<String> getMethod() { return this.method; }
   
    public void setMethod(Optional<String> method) { 
        this.method = (method == null) ? Optional.<String>empty() : method;
    }
    /** 
     * 
     **/
    public Optional<String> getMtu() { return this.mtu; }
   
    public void setMtu(Optional<String> mtu) { 
        this.mtu = (mtu == null) ? Optional.<String>empty() : mtu;
    }
    /** 
     * 
     **/
    public Optional<String> getNetmask() { return this.netmask; }
   
    public void setNetmask(Optional<String> netmask) { 
        this.netmask = (netmask == null) ? Optional.<String>empty() : netmask;
    }
    /** 
     * 
     **/
    public Optional<String> getNetwork() { return this.network; }
   
    public void setNetwork(Optional<String> network) { 
        this.network = (network == null) ? Optional.<String>empty() : network;
    }
    /** 
     * 
     **/
    public Optional<PhysicalAdapter> getPhysical() { return this.physical; }
   
    public void setPhysical(Optional<PhysicalAdapter> physical) { 
        this.physical = (physical == null) ? Optional.<PhysicalAdapter>empty() : physical;
    }
    /** 
     * 
     **/
    public Optional<Attributes[]> getRoutes() { return this.routes; }
   
    public void setRoutes(Optional<Attributes[]> routes) { 
        this.routes = (routes == null) ? Optional.<Attributes[]>empty() : routes;
    }
    /** 
     * 
     **/
    public Optional<String> getStatus() { return this.status; }
   
    public void setStatus(Optional<String> status) { 
        this.status = (status == null) ? Optional.<String>empty() : status;
    }
    /** 
     * 
     **/
    public Optional<String[]> getSymmetricRouteRules() { return this.symmetricRouteRules; }
   
    public void setSymmetricRouteRules(Optional<String[]> symmetricRouteRules) { 
        this.symmetricRouteRules = (symmetricRouteRules == null) ? Optional.<String[]>empty() : symmetricRouteRules;
    }
    /** 
     * 
     **/
    public Optional<Boolean> getUpAndRunning() { return this.upAndRunning; }
   
    public void setUpAndRunning(Optional<Boolean> upAndRunning) { 
        this.upAndRunning = (upAndRunning == null) ? Optional.<Boolean>empty() : upAndRunning;
    }
    /** 
     * 
     **/
    public Optional<String> getBondXmitHashPolicy() { return this.bondXmitHashPolicy; }
   
    public void setBondXmitHashPolicy(Optional<String> bondXmitHashPolicy) { 
        this.bondXmitHashPolicy = (bondXmitHashPolicy == null) ? Optional.<String>empty() : bondXmitHashPolicy;
    }
    /** 
     * 
     **/
    public Optional<String> getBondAdNumPorts() { return this.bondAdNumPorts; }
   
    public void setBondAdNumPorts(Optional<String> bondAdNumPorts) { 
        this.bondAdNumPorts = (bondAdNumPorts == null) ? Optional.<String>empty() : bondAdNumPorts;
    }
    /** 
     * The name of the interface.
     **/
    public Optional<String> getInterfaceName() { return this.interfaceName; }
   
    public void setInterfaceName(Optional<String> interfaceName) { 
        this.interfaceName = (interfaceName == null) ? Optional.<String>empty() : interfaceName;
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
            Objects.equals(upAndRunning, that.upAndRunning) && 
            Objects.equals(bondXmitHashPolicy, that.bondXmitHashPolicy) && 
            Objects.equals(bondAdNumPorts, that.bondAdNumPorts) && 
            Objects.equals(interfaceName, that.interfaceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash( _default,bondMaster,virtualNetworkTag,address,auto,bondDowndelay,bondFailOverMac,bondPrimaryReselect,bondLacpRate,bondMiimon,bondMode,bondSlaves,bondUpdelay,dnsNameservers,dnsSearch,family,gateway,macAddress,macAddressPermanent,method,mtu,netmask,network,physical,routes,status,symmetricRouteRules,upAndRunning,bondXmitHashPolicy,bondAdNumPorts,interfaceName );
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
        map.put("bondXmitHashPolicy", bondXmitHashPolicy);
        map.put("bondAdNumPorts", bondAdNumPorts);
        map.put("interfaceName", interfaceName);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != _default && _default.isPresent()){
            sb.append(" _default : ").append(gson.toJson(_default)).append(",");
        }
        else{
            sb.append(" _default : ").append("null").append(",");
        }
        if(null != bondMaster && bondMaster.isPresent()){
            sb.append(" bondMaster : ").append(gson.toJson(bondMaster)).append(",");
        }
        else{
            sb.append(" bondMaster : ").append("null").append(",");
        }
        if(null != virtualNetworkTag && virtualNetworkTag.isPresent()){
            sb.append(" virtualNetworkTag : ").append(gson.toJson(virtualNetworkTag)).append(",");
        }
        else{
            sb.append(" virtualNetworkTag : ").append("null").append(",");
        }
        if(null != address && address.isPresent()){
            sb.append(" address : ").append(gson.toJson(address)).append(",");
        }
        else{
            sb.append(" address : ").append("null").append(",");
        }
        if(null != auto && auto.isPresent()){
            sb.append(" auto : ").append(gson.toJson(auto)).append(",");
        }
        else{
            sb.append(" auto : ").append("null").append(",");
        }
        if(null != bondDowndelay && bondDowndelay.isPresent()){
            sb.append(" bondDowndelay : ").append(gson.toJson(bondDowndelay)).append(",");
        }
        else{
            sb.append(" bondDowndelay : ").append("null").append(",");
        }
        if(null != bondFailOverMac && bondFailOverMac.isPresent()){
            sb.append(" bondFailOverMac : ").append(gson.toJson(bondFailOverMac)).append(",");
        }
        else{
            sb.append(" bondFailOverMac : ").append("null").append(",");
        }
        if(null != bondPrimaryReselect && bondPrimaryReselect.isPresent()){
            sb.append(" bondPrimaryReselect : ").append(gson.toJson(bondPrimaryReselect)).append(",");
        }
        else{
            sb.append(" bondPrimaryReselect : ").append("null").append(",");
        }
        if(null != bondLacpRate && bondLacpRate.isPresent()){
            sb.append(" bondLacpRate : ").append(gson.toJson(bondLacpRate)).append(",");
        }
        else{
            sb.append(" bondLacpRate : ").append("null").append(",");
        }
        if(null != bondMiimon && bondMiimon.isPresent()){
            sb.append(" bondMiimon : ").append(gson.toJson(bondMiimon)).append(",");
        }
        else{
            sb.append(" bondMiimon : ").append("null").append(",");
        }
        if(null != bondMode && bondMode.isPresent()){
            sb.append(" bondMode : ").append(gson.toJson(bondMode)).append(",");
        }
        else{
            sb.append(" bondMode : ").append("null").append(",");
        }
        if(null != bondSlaves && bondSlaves.isPresent()){
            sb.append(" bondSlaves : ").append(gson.toJson(bondSlaves)).append(",");
        }
        else{
            sb.append(" bondSlaves : ").append("null").append(",");
        }
        if(null != bondUpdelay && bondUpdelay.isPresent()){
            sb.append(" bondUpdelay : ").append(gson.toJson(bondUpdelay)).append(",");
        }
        else{
            sb.append(" bondUpdelay : ").append("null").append(",");
        }
        if(null != dnsNameservers && dnsNameservers.isPresent()){
            sb.append(" dnsNameservers : ").append(gson.toJson(dnsNameservers)).append(",");
        }
        else{
            sb.append(" dnsNameservers : ").append("null").append(",");
        }
        if(null != dnsSearch && dnsSearch.isPresent()){
            sb.append(" dnsSearch : ").append(gson.toJson(dnsSearch)).append(",");
        }
        else{
            sb.append(" dnsSearch : ").append("null").append(",");
        }
        if(null != family && family.isPresent()){
            sb.append(" family : ").append(gson.toJson(family)).append(",");
        }
        else{
            sb.append(" family : ").append("null").append(",");
        }
        if(null != gateway && gateway.isPresent()){
            sb.append(" gateway : ").append(gson.toJson(gateway)).append(",");
        }
        else{
            sb.append(" gateway : ").append("null").append(",");
        }
        if(null != macAddress && macAddress.isPresent()){
            sb.append(" macAddress : ").append(gson.toJson(macAddress)).append(",");
        }
        else{
            sb.append(" macAddress : ").append("null").append(",");
        }
        if(null != macAddressPermanent && macAddressPermanent.isPresent()){
            sb.append(" macAddressPermanent : ").append(gson.toJson(macAddressPermanent)).append(",");
        }
        else{
            sb.append(" macAddressPermanent : ").append("null").append(",");
        }
        if(null != method && method.isPresent()){
            sb.append(" method : ").append(gson.toJson(method)).append(",");
        }
        else{
            sb.append(" method : ").append("null").append(",");
        }
        if(null != mtu && mtu.isPresent()){
            sb.append(" mtu : ").append(gson.toJson(mtu)).append(",");
        }
        else{
            sb.append(" mtu : ").append("null").append(",");
        }
        if(null != netmask && netmask.isPresent()){
            sb.append(" netmask : ").append(gson.toJson(netmask)).append(",");
        }
        else{
            sb.append(" netmask : ").append("null").append(",");
        }
        if(null != network && network.isPresent()){
            sb.append(" network : ").append(gson.toJson(network)).append(",");
        }
        else{
            sb.append(" network : ").append("null").append(",");
        }
        if(null != physical && physical.isPresent()){
            sb.append(" physical : ").append(gson.toJson(physical)).append(",");
        }
        else{
            sb.append(" physical : ").append("null").append(",");
        }
        if(null != routes && routes.isPresent()){
            sb.append(" routes : ").append(gson.toJson(routes)).append(",");
        }
        else{
            sb.append(" routes : ").append("null").append(",");
        }
        if(null != status && status.isPresent()){
            sb.append(" status : ").append(gson.toJson(status)).append(",");
        }
        else{
            sb.append(" status : ").append("null").append(",");
        }
        if(null != symmetricRouteRules && symmetricRouteRules.isPresent()){
            sb.append(" symmetricRouteRules : ").append(gson.toJson(symmetricRouteRules)).append(",");
        }
        else{
            sb.append(" symmetricRouteRules : ").append("null").append(",");
        }
        if(null != upAndRunning && upAndRunning.isPresent()){
            sb.append(" upAndRunning : ").append(gson.toJson(upAndRunning)).append(",");
        }
        else{
            sb.append(" upAndRunning : ").append("null").append(",");
        }
        if(null != bondXmitHashPolicy && bondXmitHashPolicy.isPresent()){
            sb.append(" bondXmitHashPolicy : ").append(gson.toJson(bondXmitHashPolicy)).append(",");
        }
        else{
            sb.append(" bondXmitHashPolicy : ").append("null").append(",");
        }
        if(null != bondAdNumPorts && bondAdNumPorts.isPresent()){
            sb.append(" bondAdNumPorts : ").append(gson.toJson(bondAdNumPorts)).append(",");
        }
        else{
            sb.append(" bondAdNumPorts : ").append("null").append(",");
        }
        if(null != interfaceName && interfaceName.isPresent()){
            sb.append(" interfaceName : ").append(gson.toJson(interfaceName)).append(",");
        }
        else{
            sb.append(" interfaceName : ").append("null").append(",");
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
        private Optional<String> bondMaster;
        private Optional<String> virtualNetworkTag;
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
        private Optional<Attributes[]> routes;
        private Optional<String> status;
        private Optional<String[]> symmetricRouteRules;
        private Optional<Boolean> upAndRunning;
        private Optional<String> bondXmitHashPolicy;
        private Optional<String> bondAdNumPorts;
        private Optional<String> interfaceName;

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
                         this.upAndRunning,
                         this.bondXmitHashPolicy,
                         this.bondAdNumPorts,
                         this.interfaceName);
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
            this.bondXmitHashPolicy = req.bondXmitHashPolicy;
            this.bondAdNumPorts = req.bondAdNumPorts;
            this.interfaceName = req.interfaceName;

            return this;
        }

        public NetworkConfig.Builder optional_default(final Boolean _default) {
            this._default = (_default == null) ? Optional.<Boolean>empty() : Optional.of(_default);
            return this;
        }

        public NetworkConfig.Builder optionalBondMaster(final String bondMaster) {
            this.bondMaster = (bondMaster == null) ? Optional.<String>empty() : Optional.of(bondMaster);
            return this;
        }

        public NetworkConfig.Builder optionalVirtualNetworkTag(final String virtualNetworkTag) {
            this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<String>empty() : Optional.of(virtualNetworkTag);
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

        public NetworkConfig.Builder optionalRoutes(final Attributes[] routes) {
            this.routes = (routes == null) ? Optional.<Attributes[]>empty() : Optional.of(routes);
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

        public NetworkConfig.Builder optionalBondXmitHashPolicy(final String bondXmitHashPolicy) {
            this.bondXmitHashPolicy = (bondXmitHashPolicy == null) ? Optional.<String>empty() : Optional.of(bondXmitHashPolicy);
            return this;
        }

        public NetworkConfig.Builder optionalBondAdNumPorts(final String bondAdNumPorts) {
            this.bondAdNumPorts = (bondAdNumPorts == null) ? Optional.<String>empty() : Optional.of(bondAdNumPorts);
            return this;
        }

        public NetworkConfig.Builder optionalInterfaceName(final String interfaceName) {
            this.interfaceName = (interfaceName == null) ? Optional.<String>empty() : Optional.of(interfaceName);
            return this;
        }

    }
}
