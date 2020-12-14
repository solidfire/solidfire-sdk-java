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
 * EnableMaintenanceModeRequest  
 * Prepare a node for maintenance. Maintenance includes anything that will require the node to be powered-off or restarted.
 **/

public class EnableMaintenanceModeRequest implements Serializable {

    public static final long serialVersionUID = 137538952821791884L;
    @SerializedName("nodes") private Long[] nodes;
    @SerializedName("perMinutePrimarySwapLimit") private Optional<Long> perMinutePrimarySwapLimit;
    @SerializedName("timeout") private Optional<String> timeout;
    @SerializedName("forceWithUnresolvedFaults") private Optional<Boolean> forceWithUnresolvedFaults;
    // empty constructor
    @Since("7.0")
    public EnableMaintenanceModeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public EnableMaintenanceModeRequest(
        Long[] nodes,
        Optional<Long> perMinutePrimarySwapLimit,
        Optional<String> timeout,
        Optional<Boolean> forceWithUnresolvedFaults
    )
    {
        this.nodes = nodes;
        this.perMinutePrimarySwapLimit = (perMinutePrimarySwapLimit == null) ? Optional.<Long>empty() : perMinutePrimarySwapLimit;
        this.timeout = (timeout == null) ? Optional.<String>empty() : timeout;
        this.forceWithUnresolvedFaults = (forceWithUnresolvedFaults == null) ? Optional.<Boolean>empty() : forceWithUnresolvedFaults;
    }

    /** 
     * List of NodeIDs to put in maintenance mode
     **/
    public Long[] getNodes() { return this.nodes; }
   
    public void setNodes(Long[] nodes) { 
        this.nodes = nodes;
    }
    /** 
     * Number of primaries to swap per minute. If not specified, all will be swapped at once.
     **/
    public Optional<Long> getPerMinutePrimarySwapLimit() { return this.perMinutePrimarySwapLimit; }
   
    public void setPerMinutePrimarySwapLimit(Optional<Long> perMinutePrimarySwapLimit) { 
        this.perMinutePrimarySwapLimit = (perMinutePrimarySwapLimit == null) ? Optional.<Long>empty() : perMinutePrimarySwapLimit;
    }
    /** 
     * How long to allow maintenance mode to remain enabled before automatically disabling.
     * Formatted in HH:mm:ss.
     * If not specified, it will remain enabled until explicitly disabled
     **/
    public Optional<String> getTimeout() { return this.timeout; }
   
    public void setTimeout(Optional<String> timeout) { 
        this.timeout = (timeout == null) ? Optional.<String>empty() : timeout;
    }
    /** 
     * Force maintenance mode to be enabled even with blocking cluster faults present.
     **/
    public Optional<Boolean> getForceWithUnresolvedFaults() { return this.forceWithUnresolvedFaults; }
   
    public void setForceWithUnresolvedFaults(Optional<Boolean> forceWithUnresolvedFaults) { 
        this.forceWithUnresolvedFaults = (forceWithUnresolvedFaults == null) ? Optional.<Boolean>empty() : forceWithUnresolvedFaults;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnableMaintenanceModeRequest that = (EnableMaintenanceModeRequest) o;

        return 
            Arrays.equals(nodes, that.nodes) && 
            Objects.equals(perMinutePrimarySwapLimit, that.perMinutePrimarySwapLimit) && 
            Objects.equals(timeout, that.timeout) && 
            Objects.equals(forceWithUnresolvedFaults, that.forceWithUnresolvedFaults);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])nodes,perMinutePrimarySwapLimit,timeout,forceWithUnresolvedFaults );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodes", nodes);
        map.put("perMinutePrimarySwapLimit", perMinutePrimarySwapLimit);
        map.put("timeout", timeout);
        map.put("forceWithUnresolvedFaults", forceWithUnresolvedFaults);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" nodes : ").append(gson.toJson(Arrays.toString(nodes))).append(",");
        if(null != perMinutePrimarySwapLimit && perMinutePrimarySwapLimit.isPresent()){
            sb.append(" perMinutePrimarySwapLimit : ").append(gson.toJson(perMinutePrimarySwapLimit)).append(",");
        }
        else{
            sb.append(" perMinutePrimarySwapLimit : ").append("null").append(",");
        }
        if(null != timeout && timeout.isPresent()){
            sb.append(" timeout : ").append(gson.toJson(timeout)).append(",");
        }
        else{
            sb.append(" timeout : ").append("null").append(",");
        }
        if(null != forceWithUnresolvedFaults && forceWithUnresolvedFaults.isPresent()){
            sb.append(" forceWithUnresolvedFaults : ").append(gson.toJson(forceWithUnresolvedFaults)).append(",");
        }
        else{
            sb.append(" forceWithUnresolvedFaults : ").append("null").append(",");
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
        private Long[] nodes;
        private Optional<Long> perMinutePrimarySwapLimit;
        private Optional<String> timeout;
        private Optional<Boolean> forceWithUnresolvedFaults;

        private Builder() { }

        public EnableMaintenanceModeRequest build() {
            return new EnableMaintenanceModeRequest (
                         this.nodes,
                         this.perMinutePrimarySwapLimit,
                         this.timeout,
                         this.forceWithUnresolvedFaults);
        }

        private EnableMaintenanceModeRequest.Builder buildFrom(final EnableMaintenanceModeRequest req) {
            this.nodes = req.nodes;
            this.perMinutePrimarySwapLimit = req.perMinutePrimarySwapLimit;
            this.timeout = req.timeout;
            this.forceWithUnresolvedFaults = req.forceWithUnresolvedFaults;

            return this;
        }

        public EnableMaintenanceModeRequest.Builder nodes(final Long[] nodes) {
            this.nodes = nodes;
            return this;
        }

        public EnableMaintenanceModeRequest.Builder optionalPerMinutePrimarySwapLimit(final Long perMinutePrimarySwapLimit) {
            this.perMinutePrimarySwapLimit = (perMinutePrimarySwapLimit == null) ? Optional.<Long>empty() : Optional.of(perMinutePrimarySwapLimit);
            return this;
        }

        public EnableMaintenanceModeRequest.Builder optionalTimeout(final String timeout) {
            this.timeout = (timeout == null) ? Optional.<String>empty() : Optional.of(timeout);
            return this;
        }

        public EnableMaintenanceModeRequest.Builder optionalForceWithUnresolvedFaults(final Boolean forceWithUnresolvedFaults) {
            this.forceWithUnresolvedFaults = (forceWithUnresolvedFaults == null) ? Optional.<Boolean>empty() : Optional.of(forceWithUnresolvedFaults);
            return this;
        }

    }
}
