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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * CreateClusterRequest  
 * The CreateCluster method is used to initialize the node in a cluster that has ownership of the "mvip" and "svip" addresses. Each new cluster is initialized using the MIP of the first node in the cluster. This method also automatically adds all the nodes being configured into the cluster. The method is used only once each time a new cluster is initialized.
 * 
 * Note: You need to log into the node that is used as the master node for the cluster. Once logged in, run the GetBootstrapConfig method on the node to get the IP addresses for the rest of the nodes that you want to include in the cluster. Then run the CreateCluster method.
 **/

public class CreateClusterRequest implements Serializable {

    public static final long serialVersionUID = 1893097687519200263L;
    @SerializedName("acceptEula") private Optional<Boolean> acceptEula;
    @SerializedName("mvip") private String mvip;
    @SerializedName("svip") private String svip;
    @SerializedName("repCount") private Long repCount;
    @SerializedName("username") private String username;
    @SerializedName("password") private String password;
    @SerializedName("nodes") private String[] nodes;
    @SerializedName("attributes") private Optional<Attributes> attributes;

    // empty constructor
    @Since("7.0")
    public CreateClusterRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateClusterRequest(
        Optional<Boolean> acceptEula,
        String mvip,
        String svip,
        Long repCount,
        String username,
        String password,
        String[] nodes,
        Optional<Attributes> attributes
    )
    {
        this.acceptEula = (acceptEula == null) ? Optional.<Boolean>empty() : acceptEula;
        this.mvip = mvip;
        this.svip = svip;
        this.repCount = repCount;
        this.username = username;
        this.password = password;
        this.nodes = nodes;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    /** 
     * Indicate your acceptance of the End User License Agreement when creating this cluster. To accept the EULA, set this parameter to true.
     **/
    public Optional<Boolean> getAcceptEula() { return this.acceptEula; }
    public void setAcceptEula(Optional<Boolean> acceptEula) { 
        this.acceptEula = (acceptEula == null) ? Optional.<Boolean>empty() : acceptEula;
    }
    /** 
     * Floating (virtual) IP address for the cluster on the management network.
     **/
    public String getMvip() { return this.mvip; }
    public void setMvip(String mvip) { 
        this.mvip = mvip;
    }
    /** 
     * Floating (virtual) IP address for the cluster on the storage (iSCSI) network.
     **/
    public String getSvip() { return this.svip; }
    public void setSvip(String svip) { 
        this.svip = svip;
    }
    /** 
     * Number of replicas of each piece of data to store in the cluster. Valid value is "2".
     **/
    public Long getRepCount() { return this.repCount; }
    public void setRepCount(Long repCount) { 
        this.repCount = repCount;
    }
    /** 
     * User name for the cluster admin.
     **/
    public String getUsername() { return this.username; }
    public void setUsername(String username) { 
        this.username = username;
    }
    /** 
     * Initial password for the cluster admin account.
     **/
    public String getPassword() { return this.password; }
    public void setPassword(String password) { 
        this.password = password;
    }
    /** 
     * CIP/SIP addresses of the initial set of nodes making up the cluster. This node's IP must be in the list.
     **/
    public String[] getNodes() { return this.nodes; }
    public void setNodes(String[] nodes) { 
        this.nodes = nodes;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateClusterRequest that = (CreateClusterRequest) o;

        return 
            Objects.equals(acceptEula, that.acceptEula) && 
            Objects.equals(mvip, that.mvip) && 
            Objects.equals(svip, that.svip) && 
            Objects.equals(repCount, that.repCount) && 
            Objects.equals(username, that.username) && 
            Objects.equals(password, that.password) && 
            Arrays.equals(nodes, that.nodes) && 
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( acceptEula,mvip,svip,repCount,username,password,(Object[])nodes,attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("acceptEula", acceptEula);
        map.put("mvip", mvip);
        map.put("svip", svip);
        map.put("repCount", repCount);
        map.put("username", username);
        map.put("password", password);
        map.put("nodes", nodes);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != acceptEula && acceptEula.isPresent()){
            sb.append(" acceptEula : ").append(acceptEula).append(",");
        }
        sb.append(" mvip : ").append(mvip).append(",");
        sb.append(" svip : ").append(svip).append(",");
        sb.append(" repCount : ").append(repCount).append(",");
        sb.append(" username : ").append(username).append(",");
        sb.append(" password : ").append(password).append(",");
        sb.append(" nodes : ").append(Arrays.toString(nodes)).append(",");
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes).append(",");
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
        private Optional<Boolean> acceptEula;
        private String mvip;
        private String svip;
        private Long repCount;
        private String username;
        private String password;
        private String[] nodes;
        private Optional<Attributes> attributes;

        private Builder() { }

        public CreateClusterRequest build() {
            return new CreateClusterRequest (
                         this.acceptEula,
                         this.mvip,
                         this.svip,
                         this.repCount,
                         this.username,
                         this.password,
                         this.nodes,
                         this.attributes);
        }

        private CreateClusterRequest.Builder buildFrom(final CreateClusterRequest req) {
            this.acceptEula = req.acceptEula;
            this.mvip = req.mvip;
            this.svip = req.svip;
            this.repCount = req.repCount;
            this.username = req.username;
            this.password = req.password;
            this.nodes = req.nodes;
            this.attributes = req.attributes;

            return this;
        }

        public CreateClusterRequest.Builder optionalAcceptEula(final Boolean acceptEula) {
            this.acceptEula = (acceptEula == null) ? Optional.<Boolean>empty() : Optional.of(acceptEula);
            return this;
        }

        public CreateClusterRequest.Builder mvip(final String mvip) {
            this.mvip = mvip;
            return this;
        }

        public CreateClusterRequest.Builder svip(final String svip) {
            this.svip = svip;
            return this;
        }

        public CreateClusterRequest.Builder repCount(final Long repCount) {
            this.repCount = repCount;
            return this;
        }

        public CreateClusterRequest.Builder username(final String username) {
            this.username = username;
            return this;
        }

        public CreateClusterRequest.Builder password(final String password) {
            this.password = password;
            return this;
        }

        public CreateClusterRequest.Builder nodes(final String[] nodes) {
            this.nodes = nodes;
            return this;
        }

        public CreateClusterRequest.Builder optionalAttributes(final Attributes attributes) {
            this.attributes = (attributes == null) ? Optional.<Attributes>empty() : Optional.of(attributes);
            return this;
        }

    }
}
