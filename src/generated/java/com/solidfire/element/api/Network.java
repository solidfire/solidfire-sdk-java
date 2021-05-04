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
 * Network  
 **/

public class Network implements Serializable {

    public static final long serialVersionUID = -5902569041573144166L;
    @SerializedName("Bond1G") private Optional<NetworkConfig> bond1G;
    @SerializedName("Bond10G") private Optional<NetworkConfig> bond10G;
    @SerializedName("net0") private Optional<NetworkConfig> net0;
    @SerializedName("net1") private Optional<NetworkConfig> net1;
    @SerializedName("eth0") private Optional<NetworkConfig> eth0;
    @SerializedName("eth1") private Optional<NetworkConfig> eth1;
    @SerializedName("eth2") private Optional<NetworkConfig> eth2;
    @SerializedName("eth3") private Optional<NetworkConfig> eth3;
    @SerializedName("eth4") private Optional<NetworkConfig> eth4;
    @SerializedName("eth5") private Optional<NetworkConfig> eth5;
    @SerializedName("lo") private Optional<NetworkConfig> lo;
    @SerializedName("team0") private Optional<NetworkConfig> team0;
    @SerializedName("team1") private Optional<NetworkConfig> team1;
    // empty constructor
    @Since("7.0")
    public Network() {}

    
    // parameterized constructor
    @Since("7.0")
    public Network(
        Optional<NetworkConfig> bond1G,
        Optional<NetworkConfig> bond10G,
        Optional<NetworkConfig> net0,
        Optional<NetworkConfig> net1,
        Optional<NetworkConfig> eth0,
        Optional<NetworkConfig> eth1,
        Optional<NetworkConfig> eth2,
        Optional<NetworkConfig> eth3,
        Optional<NetworkConfig> eth4,
        Optional<NetworkConfig> eth5,
        Optional<NetworkConfig> lo,
        Optional<NetworkConfig> team0,
        Optional<NetworkConfig> team1
    )
    {
        this.bond1G = (bond1G == null) ? Optional.<NetworkConfig>empty() : bond1G;
        this.bond10G = (bond10G == null) ? Optional.<NetworkConfig>empty() : bond10G;
        this.net0 = (net0 == null) ? Optional.<NetworkConfig>empty() : net0;
        this.net1 = (net1 == null) ? Optional.<NetworkConfig>empty() : net1;
        this.eth0 = (eth0 == null) ? Optional.<NetworkConfig>empty() : eth0;
        this.eth1 = (eth1 == null) ? Optional.<NetworkConfig>empty() : eth1;
        this.eth2 = (eth2 == null) ? Optional.<NetworkConfig>empty() : eth2;
        this.eth3 = (eth3 == null) ? Optional.<NetworkConfig>empty() : eth3;
        this.eth4 = (eth4 == null) ? Optional.<NetworkConfig>empty() : eth4;
        this.eth5 = (eth5 == null) ? Optional.<NetworkConfig>empty() : eth5;
        this.lo = (lo == null) ? Optional.<NetworkConfig>empty() : lo;
        this.team0 = (team0 == null) ? Optional.<NetworkConfig>empty() : team0;
        this.team1 = (team1 == null) ? Optional.<NetworkConfig>empty() : team1;
    }

    /** 
     * Name of the storage node network interface used for management traffic.
     **/
    public Optional<NetworkConfig> getBond1G() { return this.bond1G; }
   
    public void setBond1G(Optional<NetworkConfig> bond1G) { 
        this.bond1G = (bond1G == null) ? Optional.<NetworkConfig>empty() : bond1G;
    }
    /** 
     * Name of the storage node network interface used for storage and cluster traffic.
     **/
    public Optional<NetworkConfig> getBond10G() { return this.bond10G; }
   
    public void setBond10G(Optional<NetworkConfig> bond10G) { 
        this.bond10G = (bond10G == null) ? Optional.<NetworkConfig>empty() : bond10G;
    }
    /** 
     * Name of the witness node network interface used for management traffic.
     **/
    public Optional<NetworkConfig> getNet0() { return this.net0; }
   
    public void setNet0(Optional<NetworkConfig> net0) { 
        this.net0 = (net0 == null) ? Optional.<NetworkConfig>empty() : net0;
    }
    /** 
     * Name of the witness node network interface used for storage and cluster traffic.
     **/
    public Optional<NetworkConfig> getNet1() { return this.net1; }
   
    public void setNet1(Optional<NetworkConfig> net1) { 
        this.net1 = (net1 == null) ? Optional.<NetworkConfig>empty() : net1;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfig> getEth0() { return this.eth0; }
   
    public void setEth0(Optional<NetworkConfig> eth0) { 
        this.eth0 = (eth0 == null) ? Optional.<NetworkConfig>empty() : eth0;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfig> getEth1() { return this.eth1; }
   
    public void setEth1(Optional<NetworkConfig> eth1) { 
        this.eth1 = (eth1 == null) ? Optional.<NetworkConfig>empty() : eth1;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfig> getEth2() { return this.eth2; }
   
    public void setEth2(Optional<NetworkConfig> eth2) { 
        this.eth2 = (eth2 == null) ? Optional.<NetworkConfig>empty() : eth2;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfig> getEth3() { return this.eth3; }
   
    public void setEth3(Optional<NetworkConfig> eth3) { 
        this.eth3 = (eth3 == null) ? Optional.<NetworkConfig>empty() : eth3;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfig> getEth4() { return this.eth4; }
   
    public void setEth4(Optional<NetworkConfig> eth4) { 
        this.eth4 = (eth4 == null) ? Optional.<NetworkConfig>empty() : eth4;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfig> getEth5() { return this.eth5; }
   
    public void setEth5(Optional<NetworkConfig> eth5) { 
        this.eth5 = (eth5 == null) ? Optional.<NetworkConfig>empty() : eth5;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfig> getLo() { return this.lo; }
   
    public void setLo(Optional<NetworkConfig> lo) { 
        this.lo = (lo == null) ? Optional.<NetworkConfig>empty() : lo;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfig> getTeam0() { return this.team0; }
   
    public void setTeam0(Optional<NetworkConfig> team0) { 
        this.team0 = (team0 == null) ? Optional.<NetworkConfig>empty() : team0;
    }
    /** 
     * 
     **/
    public Optional<NetworkConfig> getTeam1() { return this.team1; }
   
    public void setTeam1(Optional<NetworkConfig> team1) { 
        this.team1 = (team1 == null) ? Optional.<NetworkConfig>empty() : team1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Network that = (Network) o;

        return 
            Objects.equals(bond1G, that.bond1G) && 
            Objects.equals(bond10G, that.bond10G) && 
            Objects.equals(net0, that.net0) && 
            Objects.equals(net1, that.net1) && 
            Objects.equals(eth0, that.eth0) && 
            Objects.equals(eth1, that.eth1) && 
            Objects.equals(eth2, that.eth2) && 
            Objects.equals(eth3, that.eth3) && 
            Objects.equals(eth4, that.eth4) && 
            Objects.equals(eth5, that.eth5) && 
            Objects.equals(lo, that.lo) && 
            Objects.equals(team0, that.team0) && 
            Objects.equals(team1, that.team1);
    }

    @Override
    public int hashCode() {
        return Objects.hash( bond1G,bond10G,net0,net1,eth0,eth1,eth2,eth3,eth4,eth5,lo,team0,team1 );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("bond1G", bond1G);
        map.put("bond10G", bond10G);
        map.put("net0", net0);
        map.put("net1", net1);
        map.put("eth0", eth0);
        map.put("eth1", eth1);
        map.put("eth2", eth2);
        map.put("eth3", eth3);
        map.put("eth4", eth4);
        map.put("eth5", eth5);
        map.put("lo", lo);
        map.put("team0", team0);
        map.put("team1", team1);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != bond1G && bond1G.isPresent()){
            sb.append(" bond1G : ").append(gson.toJson(bond1G)).append(",");
        }
        else{
            sb.append(" bond1G : ").append("null").append(",");
        }
        if(null != bond10G && bond10G.isPresent()){
            sb.append(" bond10G : ").append(gson.toJson(bond10G)).append(",");
        }
        else{
            sb.append(" bond10G : ").append("null").append(",");
        }
        if(null != net0 && net0.isPresent()){
            sb.append(" net0 : ").append(gson.toJson(net0)).append(",");
        }
        else{
            sb.append(" net0 : ").append("null").append(",");
        }
        if(null != net1 && net1.isPresent()){
            sb.append(" net1 : ").append(gson.toJson(net1)).append(",");
        }
        else{
            sb.append(" net1 : ").append("null").append(",");
        }
        if(null != eth0 && eth0.isPresent()){
            sb.append(" eth0 : ").append(gson.toJson(eth0)).append(",");
        }
        else{
            sb.append(" eth0 : ").append("null").append(",");
        }
        if(null != eth1 && eth1.isPresent()){
            sb.append(" eth1 : ").append(gson.toJson(eth1)).append(",");
        }
        else{
            sb.append(" eth1 : ").append("null").append(",");
        }
        if(null != eth2 && eth2.isPresent()){
            sb.append(" eth2 : ").append(gson.toJson(eth2)).append(",");
        }
        else{
            sb.append(" eth2 : ").append("null").append(",");
        }
        if(null != eth3 && eth3.isPresent()){
            sb.append(" eth3 : ").append(gson.toJson(eth3)).append(",");
        }
        else{
            sb.append(" eth3 : ").append("null").append(",");
        }
        if(null != eth4 && eth4.isPresent()){
            sb.append(" eth4 : ").append(gson.toJson(eth4)).append(",");
        }
        else{
            sb.append(" eth4 : ").append("null").append(",");
        }
        if(null != eth5 && eth5.isPresent()){
            sb.append(" eth5 : ").append(gson.toJson(eth5)).append(",");
        }
        else{
            sb.append(" eth5 : ").append("null").append(",");
        }
        if(null != lo && lo.isPresent()){
            sb.append(" lo : ").append(gson.toJson(lo)).append(",");
        }
        else{
            sb.append(" lo : ").append("null").append(",");
        }
        if(null != team0 && team0.isPresent()){
            sb.append(" team0 : ").append(gson.toJson(team0)).append(",");
        }
        else{
            sb.append(" team0 : ").append("null").append(",");
        }
        if(null != team1 && team1.isPresent()){
            sb.append(" team1 : ").append(gson.toJson(team1)).append(",");
        }
        else{
            sb.append(" team1 : ").append("null").append(",");
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
        private Optional<NetworkConfig> bond1G;
        private Optional<NetworkConfig> bond10G;
        private Optional<NetworkConfig> net0;
        private Optional<NetworkConfig> net1;
        private Optional<NetworkConfig> eth0;
        private Optional<NetworkConfig> eth1;
        private Optional<NetworkConfig> eth2;
        private Optional<NetworkConfig> eth3;
        private Optional<NetworkConfig> eth4;
        private Optional<NetworkConfig> eth5;
        private Optional<NetworkConfig> lo;
        private Optional<NetworkConfig> team0;
        private Optional<NetworkConfig> team1;

        private Builder() { }

        public Network build() {
            return new Network (
                         this.bond1G,
                         this.bond10G,
                         this.net0,
                         this.net1,
                         this.eth0,
                         this.eth1,
                         this.eth2,
                         this.eth3,
                         this.eth4,
                         this.eth5,
                         this.lo,
                         this.team0,
                         this.team1);
        }

        private Network.Builder buildFrom(final Network req) {
            this.bond1G = req.bond1G;
            this.bond10G = req.bond10G;
            this.net0 = req.net0;
            this.net1 = req.net1;
            this.eth0 = req.eth0;
            this.eth1 = req.eth1;
            this.eth2 = req.eth2;
            this.eth3 = req.eth3;
            this.eth4 = req.eth4;
            this.eth5 = req.eth5;
            this.lo = req.lo;
            this.team0 = req.team0;
            this.team1 = req.team1;

            return this;
        }

        public Network.Builder optionalBond1G(final NetworkConfig bond1G) {
            this.bond1G = (bond1G == null) ? Optional.<NetworkConfig>empty() : Optional.of(bond1G);
            return this;
        }

        public Network.Builder optionalBond10G(final NetworkConfig bond10G) {
            this.bond10G = (bond10G == null) ? Optional.<NetworkConfig>empty() : Optional.of(bond10G);
            return this;
        }

        public Network.Builder optionalNet0(final NetworkConfig net0) {
            this.net0 = (net0 == null) ? Optional.<NetworkConfig>empty() : Optional.of(net0);
            return this;
        }

        public Network.Builder optionalNet1(final NetworkConfig net1) {
            this.net1 = (net1 == null) ? Optional.<NetworkConfig>empty() : Optional.of(net1);
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

        public Network.Builder optionalEth4(final NetworkConfig eth4) {
            this.eth4 = (eth4 == null) ? Optional.<NetworkConfig>empty() : Optional.of(eth4);
            return this;
        }

        public Network.Builder optionalEth5(final NetworkConfig eth5) {
            this.eth5 = (eth5 == null) ? Optional.<NetworkConfig>empty() : Optional.of(eth5);
            return this;
        }

        public Network.Builder optionalLo(final NetworkConfig lo) {
            this.lo = (lo == null) ? Optional.<NetworkConfig>empty() : Optional.of(lo);
            return this;
        }

        public Network.Builder optionalTeam0(final NetworkConfig team0) {
            this.team0 = (team0 == null) ? Optional.<NetworkConfig>empty() : Optional.of(team0);
            return this;
        }

        public Network.Builder optionalTeam1(final NetworkConfig team1) {
            this.team1 = (team1 == null) ? Optional.<NetworkConfig>empty() : Optional.of(team1);
            return this;
        }

    }
}
