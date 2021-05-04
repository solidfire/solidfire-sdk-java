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
 * TestAddressAvailabilityRequest  
 * You can use the TestAddressAvailability method to check to see if a certain IP address is inuse on an interface within the storage cluster.
 **/

public class TestAddressAvailabilityRequest implements Serializable {

    public static final long serialVersionUID = 1645060259247823125L;
    @SerializedName("interface") private String iface;
    @SerializedName("address") private String address;
    @SerializedName("virtualNetworkTag") private Optional<Long> virtualNetworkTag;
    @SerializedName("timeout") private Optional<Long> timeout = Optional.of(5L);
    // empty constructor
    @Since("7.0")
    public TestAddressAvailabilityRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public TestAddressAvailabilityRequest(
        String iface,
        String address,
        Optional<Long> virtualNetworkTag,
        Optional<Long> timeout
    )
    {
        this.iface = iface;
        this.address = address;
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
        this.timeout = (timeout == null) ? Optional.<Long>empty() : timeout;
    }

    /** 
     * The target network interface (such as eth0, Bond10G, etc).
     **/
    public String getIface() { return this.iface; }
   
    public void setIface(String iface) { 
        this.iface = iface;
    }
    /** 
     * The IP address to scan for on the target interface.
     **/
    public String getAddress() { return this.address; }
   
    public void setAddress(String address) { 
        this.address = address;
    }
    /** 
     * The target VLAN ID.
     **/
    public Optional<Long> getVirtualNetworkTag() { return this.virtualNetworkTag; }
   
    public void setVirtualNetworkTag(Optional<Long> virtualNetworkTag) { 
        this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : virtualNetworkTag;
    }
    /** 
     * The timeout in seconds for testing the target address.
     **/
    public Optional<Long> getTimeout() { return this.timeout; }
   
    public void setTimeout(Optional<Long> timeout) { 
        this.timeout = (timeout == null) ? Optional.<Long>empty() : timeout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestAddressAvailabilityRequest that = (TestAddressAvailabilityRequest) o;

        return 
            Objects.equals(iface, that.iface) && 
            Objects.equals(address, that.address) && 
            Objects.equals(virtualNetworkTag, that.virtualNetworkTag) && 
            Objects.equals(timeout, that.timeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash( iface,address,virtualNetworkTag,timeout );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("iface", iface);
        map.put("address", address);
        map.put("virtualNetworkTag", virtualNetworkTag);
        map.put("timeout", timeout);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" iface : ").append(gson.toJson(iface)).append(",");
        sb.append(" address : ").append(gson.toJson(address)).append(",");
        if(null != virtualNetworkTag && virtualNetworkTag.isPresent()){
            sb.append(" virtualNetworkTag : ").append(gson.toJson(virtualNetworkTag)).append(",");
        }
        else{
            sb.append(" virtualNetworkTag : ").append("null").append(",");
        }
        if(null != timeout && timeout.isPresent()){
            sb.append(" timeout : ").append(gson.toJson(timeout)).append(",");
        }
        else{
            sb.append(" timeout : ").append("null").append(",");
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
        private String iface;
        private String address;
        private Optional<Long> virtualNetworkTag;
        private Optional<Long> timeout;

        private Builder() { }

        public TestAddressAvailabilityRequest build() {
            return new TestAddressAvailabilityRequest (
                         this.iface,
                         this.address,
                         this.virtualNetworkTag,
                         this.timeout);
        }

        private TestAddressAvailabilityRequest.Builder buildFrom(final TestAddressAvailabilityRequest req) {
            this.iface = req.iface;
            this.address = req.address;
            this.virtualNetworkTag = req.virtualNetworkTag;
            this.timeout = req.timeout;

            return this;
        }

        public TestAddressAvailabilityRequest.Builder iface(final String iface) {
            this.iface = iface;
            return this;
        }

        public TestAddressAvailabilityRequest.Builder address(final String address) {
            this.address = address;
            return this;
        }

        public TestAddressAvailabilityRequest.Builder optionalVirtualNetworkTag(final Long virtualNetworkTag) {
            this.virtualNetworkTag = (virtualNetworkTag == null) ? Optional.<Long>empty() : Optional.of(virtualNetworkTag);
            return this;
        }

        public TestAddressAvailabilityRequest.Builder optionalTimeout(final Long timeout) {
            this.timeout = (timeout == null) ? Optional.<Long>empty() : Optional.of(timeout);
            return this;
        }

    }
}
