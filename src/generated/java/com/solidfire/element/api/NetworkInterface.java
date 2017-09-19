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
 * NetworkInterface  
 **/

public class NetworkInterface implements Serializable {

    public static final long serialVersionUID = -5263858092411106865L;
    @SerializedName("address") private String address;
    @SerializedName("broadcast") private String broadcast;
    @SerializedName("macAddress") private String macAddress;
    @SerializedName("mtu") private Long mtu;
    @SerializedName("name") private String name;
    @SerializedName("netmask") private String netmask;
    @SerializedName("status") private String status;
    @SerializedName("type") private String type;
    @SerializedName("virtualNetworkTag") private Long virtualNetworkTag;
    @SerializedName("namespace") private Optional<Boolean> namespace;
    // empty constructor
    @Since("7.0")
    public NetworkInterface() {}

    
    // parameterized constructor
    @Since("7.0")
    public NetworkInterface(
        String address,
        String broadcast,
        String macAddress,
        Long mtu,
        String name,
        String netmask,
        String status,
        String type,
        Long virtualNetworkTag,
        Optional<Boolean> namespace
    )
    {
        this.address = address;
        this.broadcast = broadcast;
        this.macAddress = macAddress;
        this.mtu = mtu;
        this.name = name;
        this.netmask = netmask;
        this.status = status;
        this.type = type;
        this.virtualNetworkTag = virtualNetworkTag;
        this.namespace = (namespace == null) ? Optional.<Boolean>empty() : namespace;
    }

    /** 
     * IP address of the network.
     **/
    public String getAddress() { return this.address; }
   
    public void setAddress(String address) { 
        this.address = address;
    }
    /** 
     * Address of NTP broadcast.
     **/
    public String getBroadcast() { return this.broadcast; }
   
    public void setBroadcast(String broadcast) { 
        this.broadcast = broadcast;
    }
    /** 
     * Address used to configure the interface.
     **/
    public String getMacAddress() { return this.macAddress; }
   
    public void setMacAddress(String macAddress) { 
        this.macAddress = macAddress;
    }
    /** 
     * Packet size on the network interface.
     **/
    public Long getMtu() { return this.mtu; }
   
    public void setMtu(Long mtu) { 
        this.mtu = mtu;
    }
    /** 
     * Name of the network interface.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * Netmask for the network interface.
     **/
    public String getNetmask() { return this.netmask; }
   
    public void setNetmask(String netmask) { 
        this.netmask = netmask;
    }
    /** 
     * Status of the network.
     **/
    public String getStatus() { return this.status; }
   
    public void setStatus(String status) { 
        this.status = status;
    }
    /** 
     * The type of network, ie, BondMaster.
     **/
    public String getType() { return this.type; }
   
    public void setType(String type) { 
        this.type = type;
    }
    /** 
     * Virtual Network Tag if on virtual network.
     **/
    public Long getVirtualNetworkTag() { return this.virtualNetworkTag; }
   
    public void setVirtualNetworkTag(Long virtualNetworkTag) { 
        this.virtualNetworkTag = virtualNetworkTag;
    }
    /** 
     * 
     **/
    public Optional<Boolean> getNamespace() { return this.namespace; }
   
    public void setNamespace(Optional<Boolean> namespace) { 
        this.namespace = (namespace == null) ? Optional.<Boolean>empty() : namespace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NetworkInterface that = (NetworkInterface) o;

        return 
            Objects.equals(address, that.address) && 
            Objects.equals(broadcast, that.broadcast) && 
            Objects.equals(macAddress, that.macAddress) && 
            Objects.equals(mtu, that.mtu) && 
            Objects.equals(name, that.name) && 
            Objects.equals(netmask, that.netmask) && 
            Objects.equals(status, that.status) && 
            Objects.equals(type, that.type) && 
            Objects.equals(virtualNetworkTag, that.virtualNetworkTag) && 
            Objects.equals(namespace, that.namespace);
    }

    @Override
    public int hashCode() {
        return Objects.hash( address,broadcast,macAddress,mtu,name,netmask,status,type,virtualNetworkTag,namespace );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("address", address);
        map.put("broadcast", broadcast);
        map.put("macAddress", macAddress);
        map.put("mtu", mtu);
        map.put("name", name);
        map.put("netmask", netmask);
        map.put("status", status);
        map.put("type", type);
        map.put("virtualNetworkTag", virtualNetworkTag);
        map.put("namespace", namespace);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" address : ").append(gson.toJson(address)).append(",");
        sb.append(" broadcast : ").append(gson.toJson(broadcast)).append(",");
        sb.append(" macAddress : ").append(gson.toJson(macAddress)).append(",");
        sb.append(" mtu : ").append(gson.toJson(mtu)).append(",");
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" netmask : ").append(gson.toJson(netmask)).append(",");
        sb.append(" status : ").append(gson.toJson(status)).append(",");
        sb.append(" type : ").append(gson.toJson(type)).append(",");
        sb.append(" virtualNetworkTag : ").append(gson.toJson(virtualNetworkTag)).append(",");
        if(null != namespace && namespace.isPresent()){
            sb.append(" namespace : ").append(gson.toJson(namespace)).append(",");
        }
        else{
            sb.append(" namespace : ").append("null").append(",");
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
        private String address;
        private String broadcast;
        private String macAddress;
        private Long mtu;
        private String name;
        private String netmask;
        private String status;
        private String type;
        private Long virtualNetworkTag;
        private Optional<Boolean> namespace;

        private Builder() { }

        public NetworkInterface build() {
            return new NetworkInterface (
                         this.address,
                         this.broadcast,
                         this.macAddress,
                         this.mtu,
                         this.name,
                         this.netmask,
                         this.status,
                         this.type,
                         this.virtualNetworkTag,
                         this.namespace);
        }

        private NetworkInterface.Builder buildFrom(final NetworkInterface req) {
            this.address = req.address;
            this.broadcast = req.broadcast;
            this.macAddress = req.macAddress;
            this.mtu = req.mtu;
            this.name = req.name;
            this.netmask = req.netmask;
            this.status = req.status;
            this.type = req.type;
            this.virtualNetworkTag = req.virtualNetworkTag;
            this.namespace = req.namespace;

            return this;
        }

        public NetworkInterface.Builder address(final String address) {
            this.address = address;
            return this;
        }

        public NetworkInterface.Builder broadcast(final String broadcast) {
            this.broadcast = broadcast;
            return this;
        }

        public NetworkInterface.Builder macAddress(final String macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        public NetworkInterface.Builder mtu(final Long mtu) {
            this.mtu = mtu;
            return this;
        }

        public NetworkInterface.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public NetworkInterface.Builder netmask(final String netmask) {
            this.netmask = netmask;
            return this;
        }

        public NetworkInterface.Builder status(final String status) {
            this.status = status;
            return this;
        }

        public NetworkInterface.Builder type(final String type) {
            this.type = type;
            return this;
        }

        public NetworkInterface.Builder virtualNetworkTag(final Long virtualNetworkTag) {
            this.virtualNetworkTag = virtualNetworkTag;
            return this;
        }

        public NetworkInterface.Builder optionalNamespace(final Boolean namespace) {
            this.namespace = (namespace == null) ? Optional.<Boolean>empty() : Optional.of(namespace);
            return this;
        }

    }
}
