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
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class TestPingRequest implements Serializable {

    public static final long serialVersionUID = 8242775352369429256L;
    @SerializedName("attempts") private Optional<Long> attempts;
    @SerializedName("hosts") private Optional<String> hosts;
    @SerializedName("totalTimeoutSec") private Optional<Long> totalTimeoutSec;
    @SerializedName("packetSize") private Optional<Long> packetSize;
    @SerializedName("pingTimeoutMsec") private Optional<Long> pingTimeoutMsec;

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
        Optional<Long> pingTimeoutMsec
    )
    {
        this.attempts = (attempts == null) ? Optional.<Long>empty() : attempts;
        this.hosts = (hosts == null) ? Optional.<String>empty() : hosts;
        this.totalTimeoutSec = (totalTimeoutSec == null) ? Optional.<Long>empty() : totalTimeoutSec;
        this.packetSize = (packetSize == null) ? Optional.<Long>empty() : packetSize;
        this.pingTimeoutMsec = (pingTimeoutMsec == null) ? Optional.<Long>empty() : pingTimeoutMsec;
    }

    /** 
     * Specifies the number of times the system should repeat the test ping. Default is 5.
     **/
    public Optional<Long> getAttempts() { return this.attempts; }
    public void setAttempts(Optional<Long> attempts) { 
        this.attempts = (attempts == null) ? Optional.<Long>empty() : attempts;
    }
    /** 
     * Specify address or hostnames of devices to ping.
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
     * Specify the number of bytes to send in the ICMP packet sent to each IP. Number be less than the maximum MTU specified in the network configuration.
     **/
    public Optional<Long> getPacketSize() { return this.packetSize; }
    public void setPacketSize(Optional<Long> packetSize) { 
        this.packetSize = (packetSize == null) ? Optional.<Long>empty() : packetSize;
    }
    /** 
     * Specify the number of milliseconds to wait for each individual ping response. Default is 500ms.
     **/
    public Optional<Long> getPingTimeoutMsec() { return this.pingTimeoutMsec; }
    public void setPingTimeoutMsec(Optional<Long> pingTimeoutMsec) { 
        this.pingTimeoutMsec = (pingTimeoutMsec == null) ? Optional.<Long>empty() : pingTimeoutMsec;
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
            Objects.equals(pingTimeoutMsec, that.pingTimeoutMsec);
    }

    @Override
    public int hashCode() {
        return Objects.hash( attempts, hosts, totalTimeoutSec, packetSize, pingTimeoutMsec );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("attempts", attempts);
        map.put("hosts", hosts);
        map.put("totalTimeoutSec", totalTimeoutSec);
        map.put("packetSize", packetSize);
        map.put("pingTimeoutMsec", pingTimeoutMsec);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != attempts && attempts.isPresent()){
            sb.append(" attempts : ").append(attempts).append(",");
        }
        if(null != hosts && hosts.isPresent()){
            sb.append(" hosts : ").append(hosts).append(",");
        }
        if(null != totalTimeoutSec && totalTimeoutSec.isPresent()){
            sb.append(" totalTimeoutSec : ").append(totalTimeoutSec).append(",");
        }
        if(null != packetSize && packetSize.isPresent()){
            sb.append(" packetSize : ").append(packetSize).append(",");
        }
        if(null != pingTimeoutMsec && pingTimeoutMsec.isPresent()){
            sb.append(" pingTimeoutMsec : ").append(pingTimeoutMsec).append(",");
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

        private Builder() { }

        public TestPingRequest build() {
            return new TestPingRequest (
                         this.attempts,
                         this.hosts,
                         this.totalTimeoutSec,
                         this.packetSize,
                         this.pingTimeoutMsec);
        }

        private TestPingRequest.Builder buildFrom(final TestPingRequest req) {
            this.attempts = req.attempts;
            this.hosts = req.hosts;
            this.totalTimeoutSec = req.totalTimeoutSec;
            this.packetSize = req.packetSize;
            this.pingTimeoutMsec = req.pingTimeoutMsec;

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

    }
}
