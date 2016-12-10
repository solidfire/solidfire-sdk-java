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
 * 
 **/

public class CreateClusterSupportBundleRequest implements Serializable {

    public static final long serialVersionUID = -2593092364381709057L;
    @SerializedName("allowIncomplete") private Optional<Boolean> allowIncomplete;
    @SerializedName("bundleName") private Optional<String> bundleName;
    @SerializedName("extraArgs") private Optional<String> extraArgs;
    @SerializedName("mvip") private Optional<String> mvip;
    @SerializedName("nodes") private Optional<String> nodes;
    @SerializedName("password") private String password;
    @SerializedName("username") private String username;

    // empty constructor
    @Since("7.0")
    public CreateClusterSupportBundleRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateClusterSupportBundleRequest(
        Optional<Boolean> allowIncomplete,
        Optional<String> bundleName,
        Optional<String> extraArgs,
        Optional<String> mvip,
        Optional<String> nodes,
        String password,
        String username
    )
    {
        this.allowIncomplete = (allowIncomplete == null) ? Optional.<Boolean>empty() : allowIncomplete;
        this.bundleName = (bundleName == null) ? Optional.<String>empty() : bundleName;
        this.extraArgs = (extraArgs == null) ? Optional.<String>empty() : extraArgs;
        this.mvip = (mvip == null) ? Optional.<String>empty() : mvip;
        this.nodes = (nodes == null) ? Optional.<String>empty() : nodes;
        this.password = password;
        this.username = username;
    }

    /** 
     * Allows the script to continue to run if bundles cannot be gathered from one or more of the nodes.
     **/
    public Optional<Boolean> getAllowIncomplete() { return this.allowIncomplete; }
    public void setAllowIncomplete(Optional<Boolean> allowIncomplete) { 
        this.allowIncomplete = (allowIncomplete == null) ? Optional.<Boolean>empty() : allowIncomplete;
    }
    /** 
     * Unique name for each support bundle created. If no name is provided, then 'supportbundle' and the node name is used as a file name.
     **/
    public Optional<String> getBundleName() { return this.bundleName; }
    public void setBundleName(Optional<String> bundleName) { 
        this.bundleName = (bundleName == null) ? Optional.<String>empty() : bundleName;
    }
    /** 
     * This parameter is fed to the sf_make_support_bundle script. Should be used only at the request of SolidFire Support.
     **/
    public Optional<String> getExtraArgs() { return this.extraArgs; }
    public void setExtraArgs(Optional<String> extraArgs) { 
        this.extraArgs = (extraArgs == null) ? Optional.<String>empty() : extraArgs;
    }
    /** 
     * The mvip of the cluster. Bundles will be gathered from all nodes in the cluster.
     * REQUIRED if 'nodes' are not specified.
     **/
    public Optional<String> getMvip() { return this.mvip; }
    public void setMvip(Optional<String> mvip) { 
        this.mvip = (mvip == null) ? Optional.<String>empty() : mvip;
    }
    /** 
     * The IP addresses of the nodes from which to gather bundles. Use either 'nodes' or 'mvip', but not both to specify which nodes to gather from.
     * REQUIRED if 'nodes' are not specified.
     **/
    public Optional<String> getNodes() { return this.nodes; }
    public void setNodes(Optional<String> nodes) { 
        this.nodes = (nodes == null) ? Optional.<String>empty() : nodes;
    }
    /** 
     * The cluster password. Note: This password will be visible as text when entered.
     **/
    public String getPassword() { return this.password; }
    public void setPassword(String password) { 
        this.password = password;
    }
    /** 
     * The admin user name. Any level of 'admin' can be used.
     **/
    public String getUsername() { return this.username; }
    public void setUsername(String username) { 
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateClusterSupportBundleRequest that = (CreateClusterSupportBundleRequest) o;

        return 
            Objects.equals(allowIncomplete, that.allowIncomplete) && 
            Objects.equals(bundleName, that.bundleName) && 
            Objects.equals(extraArgs, that.extraArgs) && 
            Objects.equals(mvip, that.mvip) && 
            Objects.equals(nodes, that.nodes) && 
            Objects.equals(password, that.password) && 
            Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash( allowIncomplete,bundleName,extraArgs,mvip,nodes,password,username );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("allowIncomplete", allowIncomplete);
        map.put("bundleName", bundleName);
        map.put("extraArgs", extraArgs);
        map.put("mvip", mvip);
        map.put("nodes", nodes);
        map.put("password", password);
        map.put("username", username);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != allowIncomplete && allowIncomplete.isPresent()){
            sb.append(" allowIncomplete : ").append(allowIncomplete).append(",");
        }
        if(null != bundleName && bundleName.isPresent()){
            sb.append(" bundleName : ").append(bundleName).append(",");
        }
        if(null != extraArgs && extraArgs.isPresent()){
            sb.append(" extraArgs : ").append(extraArgs).append(",");
        }
        if(null != mvip && mvip.isPresent()){
            sb.append(" mvip : ").append(mvip).append(",");
        }
        if(null != nodes && nodes.isPresent()){
            sb.append(" nodes : ").append(nodes).append(",");
        }
        sb.append(" password : ").append(password).append(",");
        sb.append(" username : ").append(username).append(",");
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
        private Optional<Boolean> allowIncomplete;
        private Optional<String> bundleName;
        private Optional<String> extraArgs;
        private Optional<String> mvip;
        private Optional<String> nodes;
        private String password;
        private String username;

        private Builder() { }

        public CreateClusterSupportBundleRequest build() {
            return new CreateClusterSupportBundleRequest (
                         this.allowIncomplete,
                         this.bundleName,
                         this.extraArgs,
                         this.mvip,
                         this.nodes,
                         this.password,
                         this.username);
        }

        private CreateClusterSupportBundleRequest.Builder buildFrom(final CreateClusterSupportBundleRequest req) {
            this.allowIncomplete = req.allowIncomplete;
            this.bundleName = req.bundleName;
            this.extraArgs = req.extraArgs;
            this.mvip = req.mvip;
            this.nodes = req.nodes;
            this.password = req.password;
            this.username = req.username;

            return this;
        }

        public CreateClusterSupportBundleRequest.Builder optionalAllowIncomplete(final Boolean allowIncomplete) {
            this.allowIncomplete = (allowIncomplete == null) ? Optional.<Boolean>empty() : Optional.of(allowIncomplete);
            return this;
        }

        public CreateClusterSupportBundleRequest.Builder optionalBundleName(final String bundleName) {
            this.bundleName = (bundleName == null) ? Optional.<String>empty() : Optional.of(bundleName);
            return this;
        }

        public CreateClusterSupportBundleRequest.Builder optionalExtraArgs(final String extraArgs) {
            this.extraArgs = (extraArgs == null) ? Optional.<String>empty() : Optional.of(extraArgs);
            return this;
        }

        public CreateClusterSupportBundleRequest.Builder optionalMvip(final String mvip) {
            this.mvip = (mvip == null) ? Optional.<String>empty() : Optional.of(mvip);
            return this;
        }

        public CreateClusterSupportBundleRequest.Builder optionalNodes(final String nodes) {
            this.nodes = (nodes == null) ? Optional.<String>empty() : Optional.of(nodes);
            return this;
        }

        public CreateClusterSupportBundleRequest.Builder password(final String password) {
            this.password = password;
            return this;
        }

        public CreateClusterSupportBundleRequest.Builder username(final String username) {
            this.username = username;
            return this;
        }

    }
}
