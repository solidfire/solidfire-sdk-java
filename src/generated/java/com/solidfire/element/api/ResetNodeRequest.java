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
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ResetNodeRequest  
 * Allows you to reset a node to the SolidFire factory settings. All data will be deleted from the node when you call this method. A node participating in a cluster cannot be reset.
 **/

public class ResetNodeRequest implements Serializable {

    public static final long serialVersionUID = 7770460626963941644L;
    @SerializedName("build") private String build;
    @SerializedName("force") private Boolean force;
    @SerializedName("options") private Optional<String> options;
    @SerializedName("reboot") private Optional<Boolean> reboot;

    // empty constructor
    @Since("7.0")
    public ResetNodeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ResetNodeRequest(
        String build,
        Boolean force,
        Optional<String> options,
        Optional<Boolean> reboot
    )
    {
        this.build = build;
        this.force = force;
        this.options = (options == null) ? Optional.<String>empty() : options;
        this.reboot = (reboot == null) ? Optional.<Boolean>empty() : reboot;
    }

    /** 
     * Used to specify the URL to a remote Element software image to which the node will be reset.
     **/
    public String getBuild() { return this.build; }
    public void setBuild(String build) { 
        this.build = build;
    }
    /** 
     * The force parameter must be included in order to successfully reset the node.
     **/
    public Boolean getForce() { return this.force; }
    public void setForce(Boolean force) { 
        this.force = force;
    }
    /** 
     * Used to enter specifications for running the reset operation.
     **/
    public Optional<String> getOptions() { return this.options; }
    public void setOptions(Optional<String> options) { 
        this.options = (options == null) ? Optional.<String>empty() : options;
    }
    /** 
     * Should it be rebooted?
     **/
    public Optional<Boolean> getReboot() { return this.reboot; }
    public void setReboot(Optional<Boolean> reboot) { 
        this.reboot = (reboot == null) ? Optional.<Boolean>empty() : reboot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResetNodeRequest that = (ResetNodeRequest) o;

        return 
            Objects.equals(build, that.build) && 
            Objects.equals(force, that.force) && 
            Objects.equals(options, that.options) && 
            Objects.equals(reboot, that.reboot);
    }

    @Override
    public int hashCode() {
        return Objects.hash( build,force,options,reboot );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("build", build);
        map.put("force", force);
        map.put("options", options);
        map.put("reboot", reboot);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" build : ").append(build).append(",");
        sb.append(" force : ").append(force).append(",");
        if(null != options && options.isPresent()){
            sb.append(" options : ").append(options).append(",");
        }
        if(null != reboot && reboot.isPresent()){
            sb.append(" reboot : ").append(reboot).append(",");
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
        private String build;
        private Boolean force;
        private Optional<String> options;
        private Optional<Boolean> reboot;

        private Builder() { }

        public ResetNodeRequest build() {
            return new ResetNodeRequest (
                         this.build,
                         this.force,
                         this.options,
                         this.reboot);
        }

        private ResetNodeRequest.Builder buildFrom(final ResetNodeRequest req) {
            this.build = req.build;
            this.force = req.force;
            this.options = req.options;
            this.reboot = req.reboot;

            return this;
        }

        public ResetNodeRequest.Builder build(final String build) {
            this.build = build;
            return this;
        }

        public ResetNodeRequest.Builder force(final Boolean force) {
            this.force = force;
            return this;
        }

        public ResetNodeRequest.Builder optionalOptions(final String options) {
            this.options = (options == null) ? Optional.<String>empty() : Optional.of(options);
            return this;
        }

        public ResetNodeRequest.Builder optionalReboot(final Boolean reboot) {
            this.reboot = (reboot == null) ? Optional.<Boolean>empty() : Optional.of(reboot);
            return this;
        }

    }
}
