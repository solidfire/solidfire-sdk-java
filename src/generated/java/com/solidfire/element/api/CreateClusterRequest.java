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
 * CreateClusterRequest  
 * The CreateCluster method enables you to initialize the node in a cluster that has ownership of the "mvip" and "svip" addresses. Each new cluster is initialized using the management IP (MIP) of the first node in the cluster. This method also automatically adds all the nodes being configured into the cluster. You only need to use this method once each time a new cluster is initialized.
 * Note: You need to log in to the node that is used as the master node for the cluster. After you log in, run the GetBootstrapConfig method on the node to get the IP addresses for the rest of the nodes that you want to include in the
 * cluster. Then, run the CreateCluster method.
 **/

public class CreateClusterRequest implements Serializable {

    public static final long serialVersionUID = 7702417218072577040L;
    @SerializedName("acceptEula") private Optional<Boolean> acceptEula;
    @SerializedName("serialNumber") private Optional<String> serialNumber;
    @SerializedName("orderNumber") private Optional<String> orderNumber;
    @SerializedName("mvip") private String mvip;
    @SerializedName("svip") private String svip;
    @SerializedName("username") private String username;
    @SerializedName("password") private String password;
    @SerializedName("nodes") private String[] nodes;
    @SerializedName("attributes") private Optional<Attributes> attributes;
    @SerializedName("enableSoftwareEncryptionAtRest") private Optional<Boolean> enableSoftwareEncryptionAtRest;
    // empty constructor
    @Since("7.0")
    public CreateClusterRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreateClusterRequest(
        Optional<Boolean> acceptEula,
        String mvip,
        String svip,
        String username,
        String password,
        String[] nodes,
        Optional<Attributes> attributes
    )
    {
        this.acceptEula = (acceptEula == null) ? Optional.<Boolean>empty() : acceptEula;
        this.mvip = mvip;
        this.svip = svip;
        this.username = username;
        this.password = password;
        this.nodes = nodes;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    // parameterized constructor
    @Since("12.0")
    public CreateClusterRequest(
        Optional<Boolean> acceptEula,
        Optional<String> serialNumber,
        Optional<String> orderNumber,
        String mvip,
        String svip,
        String username,
        String password,
        String[] nodes,
        Optional<Attributes> attributes,
        Optional<Boolean> enableSoftwareEncryptionAtRest
    )
    {
        this.acceptEula = (acceptEula == null) ? Optional.<Boolean>empty() : acceptEula;
        this.serialNumber = (serialNumber == null) ? Optional.<String>empty() : serialNumber;
        this.orderNumber = (orderNumber == null) ? Optional.<String>empty() : orderNumber;
        this.mvip = mvip;
        this.svip = svip;
        this.username = username;
        this.password = password;
        this.nodes = nodes;
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
        this.enableSoftwareEncryptionAtRest = (enableSoftwareEncryptionAtRest == null) ? Optional.<Boolean>empty() : enableSoftwareEncryptionAtRest;
    }

    /** 
     * Required to indicate your acceptance of the End User License
     * Agreement when creating this cluster. To accept the EULA,
     * set this parameter to true.
     **/
    public Optional<Boolean> getAcceptEula() { return this.acceptEula; }
   
    public void setAcceptEula(Optional<Boolean> acceptEula) { 
        this.acceptEula = (acceptEula == null) ? Optional.<Boolean>empty() : acceptEula;
    }
    /** 
     * Nine-digit alphanumeric Serial Number.
     * May be required on software-based platforms.
     **/
    public Optional<String> getSerialNumber() { return this.serialNumber; }
   
    public void setSerialNumber(Optional<String> serialNumber) { 
        this.serialNumber = (serialNumber == null) ? Optional.<String>empty() : serialNumber;
    }
    /** 
     * Alphanumeric sales order number.
     * May be required on software-based platforms.
     **/
    public Optional<String> getOrderNumber() { return this.orderNumber; }
   
    public void setOrderNumber(Optional<String> orderNumber) { 
        this.orderNumber = (orderNumber == null) ? Optional.<String>empty() : orderNumber;
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
     * Username for the cluster admin.
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
     * List of name-value pairs in JSON object format.
     **/
    public Optional<Attributes> getAttributes() { return this.attributes; }
   
    public void setAttributes(Optional<Attributes> attributes) { 
        this.attributes = (attributes == null) ? Optional.<Attributes>empty() : attributes;
    }
    /** 
     * Enable this flag to use software-based encryption-at-rest.
     * Defaults to true on SolidFire software-only clusters.
     * Defaults to false on all other clusters.
     **/
    public Optional<Boolean> getEnableSoftwareEncryptionAtRest() { return this.enableSoftwareEncryptionAtRest; }
   
    public void setEnableSoftwareEncryptionAtRest(Optional<Boolean> enableSoftwareEncryptionAtRest) { 
        this.enableSoftwareEncryptionAtRest = (enableSoftwareEncryptionAtRest == null) ? Optional.<Boolean>empty() : enableSoftwareEncryptionAtRest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateClusterRequest that = (CreateClusterRequest) o;

        return 
            Objects.equals(acceptEula, that.acceptEula) && 
            Objects.equals(serialNumber, that.serialNumber) && 
            Objects.equals(orderNumber, that.orderNumber) && 
            Objects.equals(mvip, that.mvip) && 
            Objects.equals(svip, that.svip) && 
            Objects.equals(username, that.username) && 
            Objects.equals(password, that.password) && 
            Arrays.equals(nodes, that.nodes) && 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(enableSoftwareEncryptionAtRest, that.enableSoftwareEncryptionAtRest);
    }

    @Override
    public int hashCode() {
        return Objects.hash( acceptEula,serialNumber,orderNumber,mvip,svip,username,password,(Object[])nodes,attributes,enableSoftwareEncryptionAtRest );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("acceptEula", acceptEula);
        map.put("serialNumber", serialNumber);
        map.put("orderNumber", orderNumber);
        map.put("mvip", mvip);
        map.put("svip", svip);
        map.put("username", username);
        map.put("password", password);
        map.put("nodes", nodes);
        map.put("attributes", attributes);
        map.put("enableSoftwareEncryptionAtRest", enableSoftwareEncryptionAtRest);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != acceptEula && acceptEula.isPresent()){
            sb.append(" acceptEula : ").append(gson.toJson(acceptEula)).append(",");
        }
        else{
            sb.append(" acceptEula : ").append("null").append(",");
        }
        if(null != serialNumber && serialNumber.isPresent()){
            sb.append(" serialNumber : ").append(gson.toJson(serialNumber)).append(",");
        }
        else{
            sb.append(" serialNumber : ").append("null").append(",");
        }
        if(null != orderNumber && orderNumber.isPresent()){
            sb.append(" orderNumber : ").append(gson.toJson(orderNumber)).append(",");
        }
        else{
            sb.append(" orderNumber : ").append("null").append(",");
        }
        sb.append(" mvip : ").append(gson.toJson(mvip)).append(",");
        sb.append(" svip : ").append(gson.toJson(svip)).append(",");
        sb.append(" username : ").append(gson.toJson(username)).append(",");
        sb.append(" password : ").append(gson.toJson(password)).append(",");
        sb.append(" nodes : ").append(gson.toJson(Arrays.toString(nodes))).append(",");
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(gson.toJson(attributes)).append(",");
        }
        else{
            sb.append(" attributes : ").append("null").append(",");
        }
        if(null != enableSoftwareEncryptionAtRest && enableSoftwareEncryptionAtRest.isPresent()){
            sb.append(" enableSoftwareEncryptionAtRest : ").append(gson.toJson(enableSoftwareEncryptionAtRest)).append(",");
        }
        else{
            sb.append(" enableSoftwareEncryptionAtRest : ").append("null").append(",");
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
        private Optional<String> serialNumber;
        private Optional<String> orderNumber;
        private String mvip;
        private String svip;
        private String username;
        private String password;
        private String[] nodes;
        private Optional<Attributes> attributes;
        private Optional<Boolean> enableSoftwareEncryptionAtRest;

        private Builder() { }

        public CreateClusterRequest build() {
            return new CreateClusterRequest (
                         this.acceptEula,
                         this.serialNumber,
                         this.orderNumber,
                         this.mvip,
                         this.svip,
                         this.username,
                         this.password,
                         this.nodes,
                         this.attributes,
                         this.enableSoftwareEncryptionAtRest);
        }

        private CreateClusterRequest.Builder buildFrom(final CreateClusterRequest req) {
            this.acceptEula = req.acceptEula;
            this.serialNumber = req.serialNumber;
            this.orderNumber = req.orderNumber;
            this.mvip = req.mvip;
            this.svip = req.svip;
            this.username = req.username;
            this.password = req.password;
            this.nodes = req.nodes;
            this.attributes = req.attributes;
            this.enableSoftwareEncryptionAtRest = req.enableSoftwareEncryptionAtRest;

            return this;
        }

        public CreateClusterRequest.Builder optionalAcceptEula(final Boolean acceptEula) {
            this.acceptEula = (acceptEula == null) ? Optional.<Boolean>empty() : Optional.of(acceptEula);
            return this;
        }

        public CreateClusterRequest.Builder optionalSerialNumber(final String serialNumber) {
            this.serialNumber = (serialNumber == null) ? Optional.<String>empty() : Optional.of(serialNumber);
            return this;
        }

        public CreateClusterRequest.Builder optionalOrderNumber(final String orderNumber) {
            this.orderNumber = (orderNumber == null) ? Optional.<String>empty() : Optional.of(orderNumber);
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

        public CreateClusterRequest.Builder optionalEnableSoftwareEncryptionAtRest(final Boolean enableSoftwareEncryptionAtRest) {
            this.enableSoftwareEncryptionAtRest = (enableSoftwareEncryptionAtRest == null) ? Optional.<Boolean>empty() : Optional.of(enableSoftwareEncryptionAtRest);
            return this;
        }

    }
}
