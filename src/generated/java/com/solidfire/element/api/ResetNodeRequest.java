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
 * ResetNodeRequest  
 * The ResetNode API method enables you to reset a node to the factory settings. All data, packages (software upgrades, and so on),
 * configurations, and log files are deleted from the node when you call this method. However, network settings for the node are
 * preserved during this operation. Nodes that are participating in a cluster cannot be reset to the factory settings.
 * The ResetNode API can only be used on nodes that are in an "Available" state. It cannot be used on nodes that are "Active" in a
 * cluster, or in a "Pending" state.
 * Caution: This method clears any data that is on the node. Exercise caution when using this method.
 * Note: This method is available only through the per-node API endpoint 5.0 or later.
 **/

public class ResetNodeRequest implements Serializable {

    public static final long serialVersionUID = 5186430259296960348L;
    @SerializedName("build") private String build;
    @SerializedName("force") private Boolean force;
    @SerializedName("reboot") private Optional<Boolean> reboot;
    @SerializedName("options") private Optional<String> options;
    // empty constructor
    @Since("7.0")
    public ResetNodeRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ResetNodeRequest(
        String build,
        Boolean force
    )
    {
        this.build = build;
        this.force = force;
    }
    // parameterized constructor
    @Since("9.0")
    public ResetNodeRequest(
        String build,
        Boolean force,
        Optional<Boolean> reboot,
        Optional<String> options
    )
    {
        this.build = build;
        this.force = force;
        this.reboot = (reboot == null) ? Optional.<Boolean>empty() : reboot;
        this.options = (options == null) ? Optional.<String>empty() : options;
    }

    /** 
     * Specifies the URL to a remote Element software image to which the node will
     * be reset.
     **/
    public String getBuild() { return this.build; }
   
    public void setBuild(String build) { 
        this.build = build;
    }
    /** 
     * Required parameter to successfully reset the node.
     **/
    public Boolean getForce() { return this.force; }
   
    public void setForce(Boolean force) { 
        this.force = force;
    }
    /** 
     * Set to true if you want to reboot the node.
     **/
    public Optional<Boolean> getReboot() { return this.reboot; }
   
    public void setReboot(Optional<Boolean> reboot) { 
        this.reboot = (reboot == null) ? Optional.<Boolean>empty() : reboot;
    }
    /** 
     * Used to enter specifications for running the reset operation.
     * Available options:
     * 'edebug': '',
     * 'sf_auto': '0',
     * 'sf_bond_mode': 'ActivePassive',
     * 'sf_check_hardware': '0',
     * 'sf_disable_otpw': '0',
     * 'sf_fa_host': '',
     * 'sf_hostname': 'SF-FA18',
     * 'sf_inplace': '1',
     * 'sf_inplace_die_action': 'kexec',
     * 'sf_inplace_safe': '0',
     * 'sf_keep_cluster_config': '0',
     * 'sf_keep_data': '0',
     * 'sf_keep_hostname': '0',
     * 'sf_keep_network_config': '0',
     * 'sf_keep_paths': '/var/log/hardware.xml
     * 'sf_max_archives': '5',
     * 'sf_nvram_size': '',
     * 'sf_oldroot': '',
     * 'sf_postinst_erase_root_drive': '0',
     * 'sf_root_drive': '',
     * 'sf_rtfi_cleanup_state': '',
     * 'sf_secure_erase': '1',
     * 'sf_secure_erase_retries': '5',
     * 'sf_slice_size': '',
     * 'sf_ssh_key': '1',
     * 'sf_ssh_root': '1',
     * 'sf_start_rtfi': '1',
     * 'sf_status_httpserver': '1',
     * 'sf_status_httpserver_stop_delay': '5m',
     * 'sf_status_inject_failure': '',
     * 'sf_status_json': '0',
     * 'sf_support_host': 'sfsupport.solidfire.com',
     * 'sf_test_hardware': '0',
     * 'sf_upgrade': '0',
     * 'sf_upgrade_firmware': '0',
     * 'sf_upload_logs_url': ''
     **/
    public Optional<String> getOptions() { return this.options; }
   
    public void setOptions(Optional<String> options) { 
        this.options = (options == null) ? Optional.<String>empty() : options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResetNodeRequest that = (ResetNodeRequest) o;

        return 
            Objects.equals(build, that.build) && 
            Objects.equals(force, that.force) && 
            Objects.equals(reboot, that.reboot) && 
            Objects.equals(options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash( build,force,reboot,options );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("build", build);
        map.put("force", force);
        map.put("reboot", reboot);
        map.put("options", options);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" build : ").append(gson.toJson(build)).append(",");
        sb.append(" force : ").append(gson.toJson(force)).append(",");
        if(null != reboot && reboot.isPresent()){
            sb.append(" reboot : ").append(gson.toJson(reboot)).append(",");
        }
        else{
            sb.append(" reboot : ").append("null").append(",");
        }
        if(null != options && options.isPresent()){
            sb.append(" options : ").append(gson.toJson(options)).append(",");
        }
        else{
            sb.append(" options : ").append("null").append(",");
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
        private Optional<Boolean> reboot;
        private Optional<String> options;

        private Builder() { }

        public ResetNodeRequest build() {
            return new ResetNodeRequest (
                         this.build,
                         this.force,
                         this.reboot,
                         this.options);
        }

        private ResetNodeRequest.Builder buildFrom(final ResetNodeRequest req) {
            this.build = req.build;
            this.force = req.force;
            this.reboot = req.reboot;
            this.options = req.options;

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

        public ResetNodeRequest.Builder optionalReboot(final Boolean reboot) {
            this.reboot = (reboot == null) ? Optional.<Boolean>empty() : Optional.of(reboot);
            return this;
        }

        public ResetNodeRequest.Builder optionalOptions(final String options) {
            this.options = (options == null) ? Optional.<String>empty() : Optional.of(options);
            return this;
        }

    }
}
