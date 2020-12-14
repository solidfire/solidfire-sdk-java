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
 * ControlPowerRequest  
 * ControlPower can be used to reboot or halt a node.
 **/

public class ControlPowerRequest implements Serializable {

    public static final long serialVersionUID = -2767271627915744177L;
    @SerializedName("action") private String action;
    @SerializedName("wakeupDelay") private Optional<String> wakeupDelay;
    @SerializedName("force") private Boolean force;
    // empty constructor
    @Since("7.0")
    public ControlPowerRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ControlPowerRequest(
        String action,
        Optional<String> wakeupDelay,
        Boolean force
    )
    {
        this.action = action;
        this.wakeupDelay = (wakeupDelay == null) ? Optional.<String>empty() : wakeupDelay;
        this.force = force;
    }

    /** 
     * The action to take (Must be either Halt or Restart).
     **/
    public String getAction() { return this.action; }
   
    public void setAction(String action) { 
        this.action = action;
    }
    /** 
     * The delay in seconds to wait before powering on.  This is only usable when action=Halt.
     **/
    public Optional<String> getWakeupDelay() { return this.wakeupDelay; }
   
    public void setWakeupDelay(Optional<String> wakeupDelay) { 
        this.wakeupDelay = (wakeupDelay == null) ? Optional.<String>empty() : wakeupDelay;
    }
    /** 
     * Required for the command to succeed.
     **/
    public Boolean getForce() { return this.force; }
   
    public void setForce(Boolean force) { 
        this.force = force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ControlPowerRequest that = (ControlPowerRequest) o;

        return 
            Objects.equals(action, that.action) && 
            Objects.equals(wakeupDelay, that.wakeupDelay) && 
            Objects.equals(force, that.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash( action,wakeupDelay,force );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("action", action);
        map.put("wakeupDelay", wakeupDelay);
        map.put("force", force);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" action : ").append(gson.toJson(action)).append(",");
        if(null != wakeupDelay && wakeupDelay.isPresent()){
            sb.append(" wakeupDelay : ").append(gson.toJson(wakeupDelay)).append(",");
        }
        else{
            sb.append(" wakeupDelay : ").append("null").append(",");
        }
        sb.append(" force : ").append(gson.toJson(force)).append(",");
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
        private String action;
        private Optional<String> wakeupDelay;
        private Boolean force;

        private Builder() { }

        public ControlPowerRequest build() {
            return new ControlPowerRequest (
                         this.action,
                         this.wakeupDelay,
                         this.force);
        }

        private ControlPowerRequest.Builder buildFrom(final ControlPowerRequest req) {
            this.action = req.action;
            this.wakeupDelay = req.wakeupDelay;
            this.force = req.force;

            return this;
        }

        public ControlPowerRequest.Builder action(final String action) {
            this.action = action;
            return this;
        }

        public ControlPowerRequest.Builder optionalWakeupDelay(final String wakeupDelay) {
            this.wakeupDelay = (wakeupDelay == null) ? Optional.<String>empty() : Optional.of(wakeupDelay);
            return this;
        }

        public ControlPowerRequest.Builder force(final Boolean force) {
            this.force = force;
            return this;
        }

    }
}
