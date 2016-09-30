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
 * The Request object for the "TestPing" API Service call.
 **/
public class TestPingRequest  implements Serializable  {

    private static final long serialVersionUID = -966237040L;

    @SerializedName("attempts") private final Optional<Long> attempts;
    @SerializedName("hosts") private final Optional<String> hosts;
    @SerializedName("totalTimeoutSec") private final Optional<Long> totalTimeoutSec;
    @SerializedName("packetSize") private final Optional<Long> packetSize;
    @SerializedName("pingTimeoutMsec") private final Optional<Long> pingTimeoutMsec;

    /**
     * The Request object for the "TestPing" API Service call.
     * @param attempts (optional) Specifies the number of times the system should repeat the test ping. Default is 5.
     * @param hosts (optional) Specify address or hostnames of devices to ping.
     * @param totalTimeoutSec (optional) Specifies the length of time the ping should wait for a system response before issuing the next ping attempt or ending the process.
     * @param packetSize (optional) Specify the number of bytes to send in the ICMP packet sent to each IP. Number be less than the maximum MTU specified in the network configuration.
     * @param pingTimeoutMsec (optional) Specify the number of milliseconds to wait for each individual ping response. Default is 500ms.
     * @since 7.0
     **/
    @Since("7.0")
    public TestPingRequest(Optional<Long> attempts, Optional<String> hosts, Optional<Long> totalTimeoutSec, Optional<Long> packetSize, Optional<Long> pingTimeoutMsec) {
        this.attempts = (attempts == null) ? Optional.<Long>empty() : attempts;
        this.packetSize = (packetSize == null) ? Optional.<Long>empty() : packetSize;
        this.hosts = (hosts == null) ? Optional.<String>empty() : hosts;
        this.pingTimeoutMsec = (pingTimeoutMsec == null) ? Optional.<Long>empty() : pingTimeoutMsec;
        this.totalTimeoutSec = (totalTimeoutSec == null) ? Optional.<Long>empty() : totalTimeoutSec;
    }


    /**
     * Specifies the number of times the system should repeat the test ping. Default is 5.
     **/
    public Optional<Long> getAttempts() {
        return this.attempts;
    }

    /**
     * Specify address or hostnames of devices to ping.
     **/
    public Optional<String> getHosts() {
        return this.hosts;
    }

    /**
     * Specifies the length of time the ping should wait for a system response before issuing the next ping attempt or ending the process.
     **/
    public Optional<Long> getTotalTimeoutSec() {
        return this.totalTimeoutSec;
    }

    /**
     * Specify the number of bytes to send in the ICMP packet sent to each IP. Number be less than the maximum MTU specified in the network configuration.
     **/
    public Optional<Long> getPacketSize() {
        return this.packetSize;
    }

    /**
     * Specify the number of milliseconds to wait for each individual ping response. Default is 500ms.
     **/
    public Optional<Long> getPingTimeoutMsec() {
        return this.pingTimeoutMsec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestPingRequest that = (TestPingRequest) o;
        

        return Objects.equals( attempts , that.attempts )
            && Objects.equals( hosts , that.hosts )
            && Objects.equals( totalTimeoutSec , that.totalTimeoutSec )
            && Objects.equals( packetSize , that.packetSize )
            && Objects.equals( pingTimeoutMsec , that.pingTimeoutMsec );
    }

    @Override
    public int hashCode() {
        return Objects.hash( attempts, hosts, totalTimeoutSec, packetSize, pingTimeoutMsec );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != attempts && attempts.isPresent())
            sb.append(" attempts : ").append(attempts.get()).append(",");
        if(null != hosts && hosts.isPresent())
            sb.append(" hosts : ").append(hosts.get()).append(",");
        if(null != totalTimeoutSec && totalTimeoutSec.isPresent())
            sb.append(" totalTimeoutSec : ").append(totalTimeoutSec.get()).append(",");
        if(null != packetSize && packetSize.isPresent())
            sb.append(" packetSize : ").append(packetSize.get()).append(",");
        if(null != pingTimeoutMsec && pingTimeoutMsec.isPresent())
            sb.append(" pingTimeoutMsec : ").append(pingTimeoutMsec.get());
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
                         this.pingTimeoutMsec            );
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
