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
 * ListNetworkInterfaceStatsResult  
 **/

public class ListNetworkInterfaceStatsResult implements Serializable {

    public static final long serialVersionUID = -8154208123096107224L;
    @SerializedName("networkInterfaceStats") private NetworkInterfaceStats[] networkInterfaceStats;

    
    // parameterized constructor
    @Since("7.0")
    public ListNetworkInterfaceStatsResult(
    )
    {
    }
    // parameterized constructor
    @Since("12.0")
    public ListNetworkInterfaceStatsResult(
        NetworkInterfaceStats[] networkInterfaceStats
    )
    {
        this.networkInterfaceStats = networkInterfaceStats;
    }

    /** 
     * Statistics for the network interfaces on the node.
     **/
    public NetworkInterfaceStats[] getNetworkInterfaceStats() { return this.networkInterfaceStats; }
   
    public void setNetworkInterfaceStats(NetworkInterfaceStats[] networkInterfaceStats) { 
        this.networkInterfaceStats = networkInterfaceStats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNetworkInterfaceStatsResult that = (ListNetworkInterfaceStatsResult) o;

        return 
            Arrays.equals(networkInterfaceStats, that.networkInterfaceStats);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])networkInterfaceStats );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("networkInterfaceStats", networkInterfaceStats);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" networkInterfaceStats : ").append(gson.toJson(Arrays.toString(networkInterfaceStats))).append(",");
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
        private NetworkInterfaceStats[] networkInterfaceStats;

        private Builder() { }

        public ListNetworkInterfaceStatsResult build() {
            return new ListNetworkInterfaceStatsResult (
                         this.networkInterfaceStats);
        }

        private ListNetworkInterfaceStatsResult.Builder buildFrom(final ListNetworkInterfaceStatsResult req) {
            this.networkInterfaceStats = req.networkInterfaceStats;

            return this;
        }

        public ListNetworkInterfaceStatsResult.Builder networkInterfaceStats(final NetworkInterfaceStats[] networkInterfaceStats) {
            this.networkInterfaceStats = networkInterfaceStats;
            return this;
        }

    }
}
