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
 * NetworkInterfaceStats  
 * Statistics for a network interface.
 **/

public class NetworkInterfaceStats implements Serializable {

    public static final long serialVersionUID = -4986827174388536891L;
    @SerializedName("collisions") private Long collisions;
    @SerializedName("name") private String name;
    @SerializedName("rxBytes") private Long rxBytes;
    @SerializedName("rxCrcErrors") private Long rxCrcErrors;
    @SerializedName("rxDropped") private Long rxDropped;
    @SerializedName("rxErrors") private Long rxErrors;
    @SerializedName("rxFifoErrors") private Long rxFifoErrors;
    @SerializedName("rxFrameErrors") private Long rxFrameErrors;
    @SerializedName("rxLengthErrors") private Long rxLengthErrors;
    @SerializedName("rxMissedErrors") private Long rxMissedErrors;
    @SerializedName("rxOverErrors") private Long rxOverErrors;
    @SerializedName("rxPackets") private Long rxPackets;
    @SerializedName("txBytes") private Long txBytes;
    @SerializedName("txCarrierErrors") private Long txCarrierErrors;
    @SerializedName("txErrors") private Long txErrors;
    @SerializedName("txFifoErrors") private Long txFifoErrors;
    @SerializedName("txPackets") private Long txPackets;
    // empty constructor
    @Since("7.0")
    public NetworkInterfaceStats() {}

    
    // parameterized constructor
    @Since("7.0")
    public NetworkInterfaceStats(
        Long collisions,
        String name,
        Long rxBytes,
        Long rxCrcErrors,
        Long rxDropped,
        Long rxErrors,
        Long rxFifoErrors,
        Long rxFrameErrors,
        Long rxLengthErrors,
        Long rxMissedErrors,
        Long rxOverErrors,
        Long rxPackets,
        Long txBytes,
        Long txCarrierErrors,
        Long txErrors,
        Long txFifoErrors,
        Long txPackets
    )
    {
        this.collisions = collisions;
        this.name = name;
        this.rxBytes = rxBytes;
        this.rxCrcErrors = rxCrcErrors;
        this.rxDropped = rxDropped;
        this.rxErrors = rxErrors;
        this.rxFifoErrors = rxFifoErrors;
        this.rxFrameErrors = rxFrameErrors;
        this.rxLengthErrors = rxLengthErrors;
        this.rxMissedErrors = rxMissedErrors;
        this.rxOverErrors = rxOverErrors;
        this.rxPackets = rxPackets;
        this.txBytes = txBytes;
        this.txCarrierErrors = txCarrierErrors;
        this.txErrors = txErrors;
        this.txFifoErrors = txFifoErrors;
        this.txPackets = txPackets;
    }

    /** 
     * Number of collisions detected
     **/
    public Long getCollisions() { return this.collisions; }
   
    public void setCollisions(Long collisions) { 
        this.collisions = collisions;
    }
    /** 
     * Name of the network interface.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * Total bytes received
     **/
    public Long getRxBytes() { return this.rxBytes; }
   
    public void setRxBytes(Long rxBytes) { 
        this.rxBytes = rxBytes;
    }
    /** 
     * Received packets with CRC error
     **/
    public Long getRxCrcErrors() { return this.rxCrcErrors; }
   
    public void setRxCrcErrors(Long rxCrcErrors) { 
        this.rxCrcErrors = rxCrcErrors;
    }
    /** 
     * Number of dropped received packets
     **/
    public Long getRxDropped() { return this.rxDropped; }
   
    public void setRxDropped(Long rxDropped) { 
        this.rxDropped = rxDropped;
    }
    /** 
     * Number of bad packets received
     **/
    public Long getRxErrors() { return this.rxErrors; }
   
    public void setRxErrors(Long rxErrors) { 
        this.rxErrors = rxErrors;
    }
    /** 
     * Number of FIFO overrun errors on receive
     **/
    public Long getRxFifoErrors() { return this.rxFifoErrors; }
   
    public void setRxFifoErrors(Long rxFifoErrors) { 
        this.rxFifoErrors = rxFifoErrors;
    }
    /** 
     * Received packets with frame alignment error
     **/
    public Long getRxFrameErrors() { return this.rxFrameErrors; }
   
    public void setRxFrameErrors(Long rxFrameErrors) { 
        this.rxFrameErrors = rxFrameErrors;
    }
    /** 
     * Received packets with length error
     **/
    public Long getRxLengthErrors() { return this.rxLengthErrors; }
   
    public void setRxLengthErrors(Long rxLengthErrors) { 
        this.rxLengthErrors = rxLengthErrors;
    }
    /** 
     * Number of packets missed by the receiver
     **/
    public Long getRxMissedErrors() { return this.rxMissedErrors; }
   
    public void setRxMissedErrors(Long rxMissedErrors) { 
        this.rxMissedErrors = rxMissedErrors;
    }
    /** 
     * Number of receiver ring buff overflow errors
     **/
    public Long getRxOverErrors() { return this.rxOverErrors; }
   
    public void setRxOverErrors(Long rxOverErrors) { 
        this.rxOverErrors = rxOverErrors;
    }
    /** 
     * Total packets received
     **/
    public Long getRxPackets() { return this.rxPackets; }
   
    public void setRxPackets(Long rxPackets) { 
        this.rxPackets = rxPackets;
    }
    /** 
     * Total bytes transmitted
     **/
    public Long getTxBytes() { return this.txBytes; }
   
    public void setTxBytes(Long txBytes) { 
        this.txBytes = txBytes;
    }
    /** 
     * Number of carrier errors on transmit
     **/
    public Long getTxCarrierErrors() { return this.txCarrierErrors; }
   
    public void setTxCarrierErrors(Long txCarrierErrors) { 
        this.txCarrierErrors = txCarrierErrors;
    }
    /** 
     * Number of packet transmission errors
     **/
    public Long getTxErrors() { return this.txErrors; }
   
    public void setTxErrors(Long txErrors) { 
        this.txErrors = txErrors;
    }
    /** 
     * Number of FIFO overrun errors on transmit
     **/
    public Long getTxFifoErrors() { return this.txFifoErrors; }
   
    public void setTxFifoErrors(Long txFifoErrors) { 
        this.txFifoErrors = txFifoErrors;
    }
    /** 
     * Total packets transmitted
     **/
    public Long getTxPackets() { return this.txPackets; }
   
    public void setTxPackets(Long txPackets) { 
        this.txPackets = txPackets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NetworkInterfaceStats that = (NetworkInterfaceStats) o;

        return 
            Objects.equals(collisions, that.collisions) && 
            Objects.equals(name, that.name) && 
            Objects.equals(rxBytes, that.rxBytes) && 
            Objects.equals(rxCrcErrors, that.rxCrcErrors) && 
            Objects.equals(rxDropped, that.rxDropped) && 
            Objects.equals(rxErrors, that.rxErrors) && 
            Objects.equals(rxFifoErrors, that.rxFifoErrors) && 
            Objects.equals(rxFrameErrors, that.rxFrameErrors) && 
            Objects.equals(rxLengthErrors, that.rxLengthErrors) && 
            Objects.equals(rxMissedErrors, that.rxMissedErrors) && 
            Objects.equals(rxOverErrors, that.rxOverErrors) && 
            Objects.equals(rxPackets, that.rxPackets) && 
            Objects.equals(txBytes, that.txBytes) && 
            Objects.equals(txCarrierErrors, that.txCarrierErrors) && 
            Objects.equals(txErrors, that.txErrors) && 
            Objects.equals(txFifoErrors, that.txFifoErrors) && 
            Objects.equals(txPackets, that.txPackets);
    }

    @Override
    public int hashCode() {
        return Objects.hash( collisions,name,rxBytes,rxCrcErrors,rxDropped,rxErrors,rxFifoErrors,rxFrameErrors,rxLengthErrors,rxMissedErrors,rxOverErrors,rxPackets,txBytes,txCarrierErrors,txErrors,txFifoErrors,txPackets );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("collisions", collisions);
        map.put("name", name);
        map.put("rxBytes", rxBytes);
        map.put("rxCrcErrors", rxCrcErrors);
        map.put("rxDropped", rxDropped);
        map.put("rxErrors", rxErrors);
        map.put("rxFifoErrors", rxFifoErrors);
        map.put("rxFrameErrors", rxFrameErrors);
        map.put("rxLengthErrors", rxLengthErrors);
        map.put("rxMissedErrors", rxMissedErrors);
        map.put("rxOverErrors", rxOverErrors);
        map.put("rxPackets", rxPackets);
        map.put("txBytes", txBytes);
        map.put("txCarrierErrors", txCarrierErrors);
        map.put("txErrors", txErrors);
        map.put("txFifoErrors", txFifoErrors);
        map.put("txPackets", txPackets);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" collisions : ").append(gson.toJson(collisions)).append(",");
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" rxBytes : ").append(gson.toJson(rxBytes)).append(",");
        sb.append(" rxCrcErrors : ").append(gson.toJson(rxCrcErrors)).append(",");
        sb.append(" rxDropped : ").append(gson.toJson(rxDropped)).append(",");
        sb.append(" rxErrors : ").append(gson.toJson(rxErrors)).append(",");
        sb.append(" rxFifoErrors : ").append(gson.toJson(rxFifoErrors)).append(",");
        sb.append(" rxFrameErrors : ").append(gson.toJson(rxFrameErrors)).append(",");
        sb.append(" rxLengthErrors : ").append(gson.toJson(rxLengthErrors)).append(",");
        sb.append(" rxMissedErrors : ").append(gson.toJson(rxMissedErrors)).append(",");
        sb.append(" rxOverErrors : ").append(gson.toJson(rxOverErrors)).append(",");
        sb.append(" rxPackets : ").append(gson.toJson(rxPackets)).append(",");
        sb.append(" txBytes : ").append(gson.toJson(txBytes)).append(",");
        sb.append(" txCarrierErrors : ").append(gson.toJson(txCarrierErrors)).append(",");
        sb.append(" txErrors : ").append(gson.toJson(txErrors)).append(",");
        sb.append(" txFifoErrors : ").append(gson.toJson(txFifoErrors)).append(",");
        sb.append(" txPackets : ").append(gson.toJson(txPackets)).append(",");
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
        private Long collisions;
        private String name;
        private Long rxBytes;
        private Long rxCrcErrors;
        private Long rxDropped;
        private Long rxErrors;
        private Long rxFifoErrors;
        private Long rxFrameErrors;
        private Long rxLengthErrors;
        private Long rxMissedErrors;
        private Long rxOverErrors;
        private Long rxPackets;
        private Long txBytes;
        private Long txCarrierErrors;
        private Long txErrors;
        private Long txFifoErrors;
        private Long txPackets;

        private Builder() { }

        public NetworkInterfaceStats build() {
            return new NetworkInterfaceStats (
                         this.collisions,
                         this.name,
                         this.rxBytes,
                         this.rxCrcErrors,
                         this.rxDropped,
                         this.rxErrors,
                         this.rxFifoErrors,
                         this.rxFrameErrors,
                         this.rxLengthErrors,
                         this.rxMissedErrors,
                         this.rxOverErrors,
                         this.rxPackets,
                         this.txBytes,
                         this.txCarrierErrors,
                         this.txErrors,
                         this.txFifoErrors,
                         this.txPackets);
        }

        private NetworkInterfaceStats.Builder buildFrom(final NetworkInterfaceStats req) {
            this.collisions = req.collisions;
            this.name = req.name;
            this.rxBytes = req.rxBytes;
            this.rxCrcErrors = req.rxCrcErrors;
            this.rxDropped = req.rxDropped;
            this.rxErrors = req.rxErrors;
            this.rxFifoErrors = req.rxFifoErrors;
            this.rxFrameErrors = req.rxFrameErrors;
            this.rxLengthErrors = req.rxLengthErrors;
            this.rxMissedErrors = req.rxMissedErrors;
            this.rxOverErrors = req.rxOverErrors;
            this.rxPackets = req.rxPackets;
            this.txBytes = req.txBytes;
            this.txCarrierErrors = req.txCarrierErrors;
            this.txErrors = req.txErrors;
            this.txFifoErrors = req.txFifoErrors;
            this.txPackets = req.txPackets;

            return this;
        }

        public NetworkInterfaceStats.Builder collisions(final Long collisions) {
            this.collisions = collisions;
            return this;
        }

        public NetworkInterfaceStats.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public NetworkInterfaceStats.Builder rxBytes(final Long rxBytes) {
            this.rxBytes = rxBytes;
            return this;
        }

        public NetworkInterfaceStats.Builder rxCrcErrors(final Long rxCrcErrors) {
            this.rxCrcErrors = rxCrcErrors;
            return this;
        }

        public NetworkInterfaceStats.Builder rxDropped(final Long rxDropped) {
            this.rxDropped = rxDropped;
            return this;
        }

        public NetworkInterfaceStats.Builder rxErrors(final Long rxErrors) {
            this.rxErrors = rxErrors;
            return this;
        }

        public NetworkInterfaceStats.Builder rxFifoErrors(final Long rxFifoErrors) {
            this.rxFifoErrors = rxFifoErrors;
            return this;
        }

        public NetworkInterfaceStats.Builder rxFrameErrors(final Long rxFrameErrors) {
            this.rxFrameErrors = rxFrameErrors;
            return this;
        }

        public NetworkInterfaceStats.Builder rxLengthErrors(final Long rxLengthErrors) {
            this.rxLengthErrors = rxLengthErrors;
            return this;
        }

        public NetworkInterfaceStats.Builder rxMissedErrors(final Long rxMissedErrors) {
            this.rxMissedErrors = rxMissedErrors;
            return this;
        }

        public NetworkInterfaceStats.Builder rxOverErrors(final Long rxOverErrors) {
            this.rxOverErrors = rxOverErrors;
            return this;
        }

        public NetworkInterfaceStats.Builder rxPackets(final Long rxPackets) {
            this.rxPackets = rxPackets;
            return this;
        }

        public NetworkInterfaceStats.Builder txBytes(final Long txBytes) {
            this.txBytes = txBytes;
            return this;
        }

        public NetworkInterfaceStats.Builder txCarrierErrors(final Long txCarrierErrors) {
            this.txCarrierErrors = txCarrierErrors;
            return this;
        }

        public NetworkInterfaceStats.Builder txErrors(final Long txErrors) {
            this.txErrors = txErrors;
            return this;
        }

        public NetworkInterfaceStats.Builder txFifoErrors(final Long txFifoErrors) {
            this.txFifoErrors = txFifoErrors;
            return this;
        }

        public NetworkInterfaceStats.Builder txPackets(final Long txPackets) {
            this.txPackets = txPackets;
            return this;
        }

    }
}
