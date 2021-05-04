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
 * TestPingRequest  
 * The TestPing API allows to test the reachability to IP address(s) using ICMP packets. Source address(v4 or v6), interface and vlan tag can be specified. If not Bond1G/10G network is used to reach the target address.
 * The test uses the appropriate MTU sizes for each packet based on the MTU settings in the network configuration.
 * Note: This method is available only through the per-node API endpoint 5.0 or later.
 **/

public class TestPingRequest implements Serializable {

    public static final long serialVersionUID = 1529531461108078410L;
    @SerializedName("attempts") private Optional<Long> attempts;
    @SerializedName("hosts") private Optional<String> hosts;
    @SerializedName("totalTimeoutSec") private Optional<Long> totalTimeoutSec;
    @SerializedName("packetSize") private Optional<Long> packetSize;
    @SerializedName("pingTimeoutMsec") private Optional<Long> pingTimeoutMsec;
    @SerializedName("prohibitFragmentation") private Optional<Boolean> prohibitFragmentation;
    @SerializedName("sourceAddressV4") private Optional<String> sourceAddressV4;
    @SerializedName("sourceAddressV6") private Optional<String> sourceAddressV6;
    @SerializedName("interface") private Optional<String> iface;
    @SerializedName("virtualNetworkTag") private Optional<Long> virtualNetworkTag;
    // empty constructor
    @Since("7.0")
    public TestPingRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public TestPingRequest(
        Optional<Long> attempts,
        Optional<String> hosts,
        Optional<Long> totalTimeoutSec,
        Optional<Long> packetSize,
        Optional<Long> pingTimeoutMsec,
        Optional<Boolean> prohibitFragmentation,
        Optional<String> sourceAddressV4,
        Optional<String> sourceAddressV6,
        Optional<String> iface,
        Optional<Long> virtualNetworkTag
    )
    {
        this.attempts = (attempts == null) ? Optional.<Long>empty() : attempts;
        this.hosts = (hosts == null) ? Optional.<String>empty() : hosts;
        this.totalTimeoutSec = (totalTimeoutSec == null) ? Optional.<Long>empty() : totalTimeoutSec;
        this.packetSize = (packetSize == null) ? Optional.<Long>empty() : packetSize;
        this.pingTimeoutMsec = (pingTimeoutMsec == null) ? Optional.<Long>empty() : pingTimeoutMsec;
        this.prohibitFragmentation = (prohibitFragmentation == null) ? Optional.<Boolean>empty() : prohibitFragmentation;
        this.sourceAddressV4 = (sourceAddressV4 == null) ? Optional.<String>empty() : sourceAddressV4;
        this.sourceAddressV6 = (sourceAddressV6 == null) ? Optional.<String>empty() : sourceAddressV6;
        this.iface = (iface == null) ? Optional.<String>empty() : iface;
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
    }

    /** 
     * Specifies the number of times the system
     * should repeat the test ping. The default value is 5.
     **/
    public Optional<Long> getAttempts() { return this.attempts; }
   
    public void setAttempts(Optional<Long> attempts) { 
        this.attempts = (attempts == null) ? Optional.<Long>empty() : attempts;
    }
    /** 
     * Specifies a comma-separated list of addresses or hostnames of devices to ping.
     **/
    public Optional<String> getHosts() { return this.hosts; }
   
    public void setHosts(Optional<String> hosts) { 
        this.hosts = (hosts == null) ? Optional.<String>empty() : hosts;
    }
    /** 
     * Specifies the length of time the ping should wait for a system response before issuing the next ping attempt or ending the process.
     **/
    public Optional<Long> getTotalTimeoutSec() { return this.totalTimeoutSec; }
   
    public void setTotalTimeoutSec(Optional<Long> totalTimeoutSec) { 
        this.totalTimeoutSec = (totalTimeoutSec == null) ? Optional.<Long>empty() : totalTimeoutSec;
    }
    /** 
     * Specifies the number of bytes to send in the ICMP packet that is sent to each IP. The number must be less than the maximum MTU specified in the network configuration.
     **/
    public Optional<Long> getPacketSize() { return this.packetSize; }
   
    public void setPacketSize(Optional<Long> packetSize) { 
        this.packetSize = (packetSize == null) ? Optional.<Long>empty() : packetSize;
    }
    /** 
     * Specifies the number of milliseconds to wait for each individual ping response. The default value is 500 ms.
     **/
    public Optional<Long> getPingTimeoutMsec() { return this.pingTimeoutMsec; }
   
    public void setPingTimeoutMsec(Optional<Long> pingTimeoutMsec) { 
        this.pingTimeoutMsec = (pingTimeoutMsec == null) ? Optional.<Long>empty() : pingTimeoutMsec;
    }
    /** 
     * Specifies that the Do not Fragment (DF) flag is enabled for the ICMP packets.
     **/
    public Optional<Boolean> getProhibitFragmentation() { return this.prohibitFragmentation; }
   
    public void setProhibitFragmentation(Optional<Boolean> prohibitFragmentation) { 
        this.prohibitFragmentation = (prohibitFragmentation == null) ? Optional.<Boolean>empty() : prohibitFragmentation;
    }
    /** 
     * The ipv4 source address to be used in the ICMP ping packets
     * sourceAddressV4 or sourceAddressV6 is required
     **/
    public Optional<String> getSourceAddressV4() { return this.sourceAddressV4; }
   
    public void setSourceAddressV4(Optional<String> sourceAddressV4) { 
        this.sourceAddressV4 = (sourceAddressV4 == null) ? Optional.<String>empty() : sourceAddressV4;
    }
    /** 
     * The ipv6 source address to be used in the ICMP ping packets
     * sourceAddressV4 or sourceAddressV6 is required
     **/
    public Optional<String> getSourceAddressV6() { return this.sourceAddressV6; }
   
    public void setSourceAddressV6(Optional<String> sourceAddressV6) { 
        this.sourceAddressV6 = (sourceAddressV6 == null) ? Optional.<String>empty() : sourceAddressV6;
    }
    /** 
     * Existing interface on which the temporary vlan interface is created
     **/
    public Optional<String> getIface() { return this.iface; }
   
    public void setIface(Optional<String> iface) { 
        this.iface = (iface == null) ? Optional.<String>empty() : iface;
    }
    /** 
     * VLAN on which host addresses reachability needs to be tested
     * The temporary vlan interface is created with this tag
     **/
    public Optional<Long> getVirtualNetworkTag() { return this.virtualNetworkTag; }
   
    public void setVirtualNetworkTag(Optional<Long> virtualNetworkTag) { 
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestPingRequest that = (TestPingRequest) o;

        return 
            Objects.equals(attempts, that.attempts) && 
            Objects.equals(hosts, that.hosts) && 
            Objects.equals(totalTimeoutSec, that.totalTimeoutSec) && 
            Objects.equals(packetSize, that.packetSize) && 
            Objects.equals(pingTimeoutMsec, that.pingTimeoutMsec) && 
            Objects.equals(prohibitFragmentation, that.prohibitFragmentation) && 
            Objects.equals(sourceAddressV4, that.sourceAddressV4) && 
            Objects.equals(sourceAddressV6, that.sourceAddressV6) && 
            Objects.equals(iface, that.iface) && 
            Objects.equals(virtualNetworkTag, that.virtualNetworkTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash( attempts,hosts,totalTimeoutSec,packetSize,pingTimeoutMsec,prohibitFragmentation,sourceAddressV4,sourceAddressV6,iface,virtualNetworkTag );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("attempts", attempts);
        map.put("hosts", hosts);
        map.put("totalTimeoutSec", totalTimeoutSec);
        map.put("packetSize", packetSize);
        map.put("pingTimeoutMsec", pingTimeoutMsec);
        map.put("prohibitFragmentation", prohibitFragmentation);
        map.put("sourceAddressV4", sourceAddressV4);
        map.put("sourceAddressV6", sourceAddressV6);
        map.put("iface", iface);
        map.put("virtualNetworkTag", virtualNetworkTag);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != attempts && attempts.isPresent()){
            sb.append(" attempts : ").append(gson.toJson(attempts)).append(",");
        }
        else{
            sb.append(" attempts : ").append("null").append(",");
        }
        if(null != hosts && hosts.isPresent()){
            sb.append(" hosts : ").append(gson.toJson(hosts)).append(",");
        }
        else{
            sb.append(" hosts : ").append("null").append(",");
        }
        if(null != totalTimeoutSec && totalTimeoutSec.isPresent()){
            sb.append(" totalTimeoutSec : ").append(gson.toJson(totalTimeoutSec)).append(",");
        }
        else{
            sb.append(" totalTimeoutSec : ").append("null").append(",");
        }
        if(null != packetSize && packetSize.isPresent()){
            sb.append(" packetSize : ").append(gson.toJson(packetSize)).append(",");
        }
        else{
            sb.append(" packetSize : ").append("null").append(",");
        }
        if(null != pingTimeoutMsec && pingTimeoutMsec.isPresent()){
            sb.append(" pingTimeoutMsec : ").append(gson.toJson(pingTimeoutMsec)).append(",");
        }
        else{
            sb.append(" pingTimeoutMsec : ").append("null").append(",");
        }
        if(null != prohibitFragmentation && prohibitFragmentation.isPresent()){
            sb.append(" prohibitFragmentation : ").append(gson.toJson(prohibitFragmentation)).append(",");
        }
        else{
            sb.append(" prohibitFragmentation : ").append("null").append(",");
        }
        if(null != sourceAddressV4 && sourceAddressV4.isPresent()){
            sb.append(" sourceAddressV4 : ").append(gson.toJson(sourceAddressV4)).append(",");
        }
        else{
            sb.append(" sourceAddressV4 : ").append("null").append(",");
        }
        if(null != sourceAddressV6 && sourceAddressV6.isPresent()){
            sb.append(" sourceAddressV6 : ").append(gson.toJson(sourceAddressV6)).append(",");
        }
        else{
            sb.append(" sourceAddressV6 : ").append("null").append(",");
        }
        if(null != iface && iface.isPresent()){
            sb.append(" iface : ").append(gson.toJson(iface)).append(",");
        }
        else{
            sb.append(" iface : ").append("null").append(",");
        }
        if(null != virtualNetworkTag && virtualNetworkTag.isPresent()){
            sb.append(" virtualNetworkTag : ").append(gson.toJson(virtualNetworkTag)).append(",");
        }
        else{
            sb.append(" virtualNetworkTag : ").append("null").append(",");
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
        private Optional<Long> attempts;
        private Optional<String> hosts;
        private Optional<Long> totalTimeoutSec;
        private Optional<Long> packetSize;
        private Optional<Long> pingTimeoutMsec;
        private Optional<Boolean> prohibitFragmentation;
        private Optional<String> sourceAddressV4;
        private Optional<String> sourceAddressV6;
        private Optional<String> iface;
        private Optional<Long> virtualNetworkTag;

        private Builder() { }

        public TestPingRequest build() {
            return new TestPingRequest (
                         this.attempts,
                         this.hosts,
                         this.totalTimeoutSec,
                         this.packetSize,
                         this.pingTimeoutMsec,
                         this.prohibitFragmentation,
                         this.sourceAddressV4,
                         this.sourceAddressV6,
                         this.iface,
                         this.virtualNetworkTag);
        }

        private TestPingRequest.Builder buildFrom(final TestPingRequest req) {
            this.attempts = req.attempts;
            this.hosts = req.hosts;
            this.totalTimeoutSec = req.totalTimeoutSec;
            this.packetSize = req.packetSize;
            this.pingTimeoutMsec = req.pingTimeoutMsec;
            this.prohibitFragmentation = req.prohibitFragmentation;
            this.sourceAddressV4 = req.sourceAddressV4;
            this.sourceAddressV6 = req.sourceAddressV6;
            this.iface = req.iface;
            this.virtualNetworkTag = req.virtualNetworkTag;

            return this;
        }

        public TestPingRequest.Builder optionalAttempts(final Long attempts) {
            this.attempts = (attempts == null) ? Optional.<Long>empty() : Optional.of(attempts);
            return this;
        }

        public TestPingRequest.Builder optionalHosts(final String hosts) {
            this.hosts = (hosts == null) ? Optional.<String>empty() : Optional.of(hosts);
            return this;
        }

        public TestPingRequest.Builder optionalTotalTimeoutSec(final Long totalTimeoutSec) {
            this.totalTimeoutSec = (totalTimeoutSec == null) ? Optional.<Long>empty() : Optional.of(totalTimeoutSec);
            return this;
        }

        public TestPingRequest.Builder optionalPacketSize(final Long packetSize) {
            this.packetSize = (packetSize == null) ? Optional.<Long>empty() : Optional.of(packetSize);
            return this;
        }

        public TestPingRequest.Builder optionalPingTimeoutMsec(final Long pingTimeoutMsec) {
            this.pingTimeoutMsec = (pingTimeoutMsec == null) ? Optional.<Long>empty() : Optional.of(pingTimeoutMsec);
            return this;
        }

        public TestPingRequest.Builder optionalProhibitFragmentation(final Boolean prohibitFragmentation) {
            this.prohibitFragmentation = (prohibitFragmentation == null) ? Optional.<Boolean>empty() : Optional.of(prohibitFragmentation);
            return this;
        }

        public TestPingRequest.Builder optionalSourceAddressV4(final String sourceAddressV4) {
            this.sourceAddressV4 = (sourceAddressV4 == null) ? Optional.<String>empty() : Optional.of(sourceAddressV4);
            return this;
        }

        public TestPingRequest.Builder optionalSourceAddressV6(final String sourceAddressV6) {
            this.sourceAddressV6 = (sourceAddressV6 == null) ? Optional.<String>empty() : Optional.of(sourceAddressV6);
            return this;
        }

        public TestPingRequest.Builder optionalIface(final String iface) {
            this.iface = (iface == null) ? Optional.<String>empty() : Optional.of(iface);
            return this;
        }

        public TestPingRequest.Builder optionalVirtualNetworkTag(final Long virtualNetworkTag) {
            this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : Optional.of(virtualNetworkTag);
            return this;
        }

    }
}
