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
 * SnapMirrorNode  
 * The snapMirrorNode object contains information about the nodes of the destination ONTAP cluster in a SnapMirror relationship.
 **/

public class SnapMirrorNode implements Serializable {

    public static final long serialVersionUID = 1997701335409116933L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("name") private String name;
    @SerializedName("model") private String model;
    @SerializedName("serialNumber") private String serialNumber;
    @SerializedName("productVersion") private String productVersion;
    @SerializedName("isNodeHealthy") private String isNodeHealthy;
    @SerializedName("isNodeEligible") private String isNodeEligible;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorNode(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorNode(
        Long snapMirrorEndpointID,
        String name,
        String model,
        String serialNumber,
        String productVersion,
        String isNodeHealthy,
        String isNodeEligible
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.name = name;
        this.model = model;
        this.serialNumber = serialNumber;
        this.productVersion = productVersion;
        this.isNodeHealthy = isNodeHealthy;
        this.isNodeEligible = isNodeEligible;
    }

    /** 
     * The ID of the destination ONTAP system.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The name of the ONTAP node.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * The model of the ONTAP node.
     **/
    public String getModel() { return this.model; }
   
    public void setModel(String model) { 
        this.model = model;
    }
    /** 
     * The serial number of the ONTAP node.
     **/
    public String getSerialNumber() { return this.serialNumber; }
   
    public void setSerialNumber(String serialNumber) { 
        this.serialNumber = serialNumber;
    }
    /** 
     * The ONTAP product version.
     **/
    public String getProductVersion() { return this.productVersion; }
   
    public void setProductVersion(String productVersion) { 
        this.productVersion = productVersion;
    }
    /** 
     * The health of a node in the ONTAP cluster.
     * Possible values:
     * true
     * false
     **/
    public String getIsNodeHealthy() { return this.isNodeHealthy; }
   
    public void setIsNodeHealthy(String isNodeHealthy) { 
        this.isNodeHealthy = isNodeHealthy;
    }
    /** 
     * Whether or not the node is eligible to participate in a ONTAP cluster.
     * Possible values:
     * true
     * false
     **/
    public String getIsNodeEligible() { return this.isNodeEligible; }
   
    public void setIsNodeEligible(String isNodeEligible) { 
        this.isNodeEligible = isNodeEligible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorNode that = (SnapMirrorNode) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(model, that.model) && 
            Objects.equals(serialNumber, that.serialNumber) && 
            Objects.equals(productVersion, that.productVersion) && 
            Objects.equals(isNodeHealthy, that.isNodeHealthy) && 
            Objects.equals(isNodeEligible, that.isNodeEligible);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,name,model,serialNumber,productVersion,isNodeHealthy,isNodeEligible );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("name", name);
        map.put("model", model);
        map.put("serialNumber", serialNumber);
        map.put("productVersion", productVersion);
        map.put("isNodeHealthy", isNodeHealthy);
        map.put("isNodeEligible", isNodeEligible);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" model : ").append(gson.toJson(model)).append(",");
        sb.append(" serialNumber : ").append(gson.toJson(serialNumber)).append(",");
        sb.append(" productVersion : ").append(gson.toJson(productVersion)).append(",");
        sb.append(" isNodeHealthy : ").append(gson.toJson(isNodeHealthy)).append(",");
        sb.append(" isNodeEligible : ").append(gson.toJson(isNodeEligible)).append(",");
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
        private Long snapMirrorEndpointID;
        private String name;
        private String model;
        private String serialNumber;
        private String productVersion;
        private String isNodeHealthy;
        private String isNodeEligible;

        private Builder() { }

        public SnapMirrorNode build() {
            return new SnapMirrorNode (
                         this.snapMirrorEndpointID,
                         this.name,
                         this.model,
                         this.serialNumber,
                         this.productVersion,
                         this.isNodeHealthy,
                         this.isNodeEligible);
        }

        private SnapMirrorNode.Builder buildFrom(final SnapMirrorNode req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.name = req.name;
            this.model = req.model;
            this.serialNumber = req.serialNumber;
            this.productVersion = req.productVersion;
            this.isNodeHealthy = req.isNodeHealthy;
            this.isNodeEligible = req.isNodeEligible;

            return this;
        }

        public SnapMirrorNode.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public SnapMirrorNode.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public SnapMirrorNode.Builder model(final String model) {
            this.model = model;
            return this;
        }

        public SnapMirrorNode.Builder serialNumber(final String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public SnapMirrorNode.Builder productVersion(final String productVersion) {
            this.productVersion = productVersion;
            return this;
        }

        public SnapMirrorNode.Builder isNodeHealthy(final String isNodeHealthy) {
            this.isNodeHealthy = isNodeHealthy;
            return this;
        }

        public SnapMirrorNode.Builder isNodeEligible(final String isNodeEligible) {
            this.isNodeEligible = isNodeEligible;
            return this;
        }

    }
}
