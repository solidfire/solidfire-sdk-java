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
 * PendingActiveNode  
 * A pending active node refers to a pending node that is in the process of joining a cluster as an active node.
 * When the node becomes active, any drives associated with the node will become available for addition to the cluster.
 **/

public class PendingActiveNode implements Serializable {

    public static final long serialVersionUID = 1115508474245101288L;
    @SerializedName("activeNodeKey") private String activeNodeKey;
    @SerializedName("pendingActiveNodeID") private Long pendingActiveNodeID;
    @SerializedName("pendingNodeID") private Long pendingNodeID;
    @SerializedName("assignedNodeID") private Long assignedNodeID;
    @SerializedName("asyncHandle") private Long asyncHandle;
    @SerializedName("cip") private String cip;
    @SerializedName("mip") private String mip;
    @SerializedName("sip") private String sip;
    @SerializedName("platformInfo") private Platform platformInfo;
    @SerializedName("role") private String role;
    @SerializedName("softwareVersion") private String softwareVersion;
    // empty constructor
    @Since("7.0")
    public PendingActiveNode() {}

    
    // parameterized constructor
    @Since("7.0")
    public PendingActiveNode(
        String activeNodeKey,
        Long pendingActiveNodeID,
        Long pendingNodeID,
        Long assignedNodeID,
        Long asyncHandle,
        String cip,
        String mip,
        String sip,
        Platform platformInfo,
        String role,
        String softwareVersion
    )
    {
        this.activeNodeKey = activeNodeKey;
        this.pendingActiveNodeID = pendingActiveNodeID;
        this.pendingNodeID = pendingNodeID;
        this.assignedNodeID = assignedNodeID;
        this.asyncHandle = asyncHandle;
        this.cip = cip;
        this.mip = mip;
        this.sip = sip;
        this.platformInfo = platformInfo;
        this.role = role;
        this.softwareVersion = softwareVersion;
    }

    /** 
     * 
     **/
    public String getActiveNodeKey() { return this.activeNodeKey; }
   
    public void setActiveNodeKey(String activeNodeKey) { 
        this.activeNodeKey = activeNodeKey;
    }
    /** 
     * 
     **/
    public Long getPendingActiveNodeID() { return this.pendingActiveNodeID; }
   
    public void setPendingActiveNodeID(Long pendingActiveNodeID) { 
        this.pendingActiveNodeID = pendingActiveNodeID;
    }
    /** 
     * 
     **/
    public Long getPendingNodeID() { return this.pendingNodeID; }
   
    public void setPendingNodeID(Long pendingNodeID) { 
        this.pendingNodeID = pendingNodeID;
    }
    /** 
     * 
     **/
    public Long getAssignedNodeID() { return this.assignedNodeID; }
   
    public void setAssignedNodeID(Long assignedNodeID) { 
        this.assignedNodeID = assignedNodeID;
    }
    /** 
     * 
     **/
    public Long getAsyncHandle() { return this.asyncHandle; }
   
    public void setAsyncHandle(Long asyncHandle) { 
        this.asyncHandle = asyncHandle;
    }
    /** 
     * IP address used for both intra-cluster and inter-cluster communication.
     **/
    public String getCip() { return this.cip; }
   
    public void setCip(String cip) { 
        this.cip = cip;
    }
    /** 
     * IP address used for the per-node API and UI.
     **/
    public String getMip() { return this.mip; }
   
    public void setMip(String mip) { 
        this.mip = mip;
    }
    /** 
     * IP address used for iSCSI traffic.
     **/
    public String getSip() { return this.sip; }
   
    public void setSip(String sip) { 
        this.sip = sip;
    }
    /** 
     * Information about the node's hardware.
     **/
    public Platform getPlatformInfo() { return this.platformInfo; }
   
    public void setPlatformInfo(Platform platformInfo) { 
        this.platformInfo = platformInfo;
    }
    /** 
     * The node's role in the cluster. Possible values are Management, Storage, Compute, and Witness.
     **/
    public String getRole() { return this.role; }
   
    public void setRole(String role) { 
        this.role = role;
    }
    /** 
     * The version of SolidFire software currently running on this node.
     **/
    public String getSoftwareVersion() { return this.softwareVersion; }
   
    public void setSoftwareVersion(String softwareVersion) { 
        this.softwareVersion = softwareVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PendingActiveNode that = (PendingActiveNode) o;

        return 
            Objects.equals(activeNodeKey, that.activeNodeKey) && 
            Objects.equals(pendingActiveNodeID, that.pendingActiveNodeID) && 
            Objects.equals(pendingNodeID, that.pendingNodeID) && 
            Objects.equals(assignedNodeID, that.assignedNodeID) && 
            Objects.equals(asyncHandle, that.asyncHandle) && 
            Objects.equals(cip, that.cip) && 
            Objects.equals(mip, that.mip) && 
            Objects.equals(sip, that.sip) && 
            Objects.equals(platformInfo, that.platformInfo) && 
            Objects.equals(role, that.role) && 
            Objects.equals(softwareVersion, that.softwareVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash( activeNodeKey,pendingActiveNodeID,pendingNodeID,assignedNodeID,asyncHandle,cip,mip,sip,platformInfo,role,softwareVersion );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("activeNodeKey", activeNodeKey);
        map.put("pendingActiveNodeID", pendingActiveNodeID);
        map.put("pendingNodeID", pendingNodeID);
        map.put("assignedNodeID", assignedNodeID);
        map.put("asyncHandle", asyncHandle);
        map.put("cip", cip);
        map.put("mip", mip);
        map.put("sip", sip);
        map.put("platformInfo", platformInfo);
        map.put("role", role);
        map.put("softwareVersion", softwareVersion);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" activeNodeKey : ").append(gson.toJson(activeNodeKey)).append(",");
        sb.append(" pendingActiveNodeID : ").append(gson.toJson(pendingActiveNodeID)).append(",");
        sb.append(" pendingNodeID : ").append(gson.toJson(pendingNodeID)).append(",");
        sb.append(" assignedNodeID : ").append(gson.toJson(assignedNodeID)).append(",");
        sb.append(" asyncHandle : ").append(gson.toJson(asyncHandle)).append(",");
        sb.append(" cip : ").append(gson.toJson(cip)).append(",");
        sb.append(" mip : ").append(gson.toJson(mip)).append(",");
        sb.append(" sip : ").append(gson.toJson(sip)).append(",");
        sb.append(" platformInfo : ").append(gson.toJson(platformInfo)).append(",");
        sb.append(" role : ").append(gson.toJson(role)).append(",");
        sb.append(" softwareVersion : ").append(gson.toJson(softwareVersion)).append(",");
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
        private String activeNodeKey;
        private Long pendingActiveNodeID;
        private Long pendingNodeID;
        private Long assignedNodeID;
        private Long asyncHandle;
        private String cip;
        private String mip;
        private String sip;
        private Platform platformInfo;
        private String role;
        private String softwareVersion;

        private Builder() { }

        public PendingActiveNode build() {
            return new PendingActiveNode (
                         this.activeNodeKey,
                         this.pendingActiveNodeID,
                         this.pendingNodeID,
                         this.assignedNodeID,
                         this.asyncHandle,
                         this.cip,
                         this.mip,
                         this.sip,
                         this.platformInfo,
                         this.role,
                         this.softwareVersion);
        }

        private PendingActiveNode.Builder buildFrom(final PendingActiveNode req) {
            this.activeNodeKey = req.activeNodeKey;
            this.pendingActiveNodeID = req.pendingActiveNodeID;
            this.pendingNodeID = req.pendingNodeID;
            this.assignedNodeID = req.assignedNodeID;
            this.asyncHandle = req.asyncHandle;
            this.cip = req.cip;
            this.mip = req.mip;
            this.sip = req.sip;
            this.platformInfo = req.platformInfo;
            this.role = req.role;
            this.softwareVersion = req.softwareVersion;

            return this;
        }

        public PendingActiveNode.Builder activeNodeKey(final String activeNodeKey) {
            this.activeNodeKey = activeNodeKey;
            return this;
        }

        public PendingActiveNode.Builder pendingActiveNodeID(final Long pendingActiveNodeID) {
            this.pendingActiveNodeID = pendingActiveNodeID;
            return this;
        }

        public PendingActiveNode.Builder pendingNodeID(final Long pendingNodeID) {
            this.pendingNodeID = pendingNodeID;
            return this;
        }

        public PendingActiveNode.Builder assignedNodeID(final Long assignedNodeID) {
            this.assignedNodeID = assignedNodeID;
            return this;
        }

        public PendingActiveNode.Builder asyncHandle(final Long asyncHandle) {
            this.asyncHandle = asyncHandle;
            return this;
        }

        public PendingActiveNode.Builder cip(final String cip) {
            this.cip = cip;
            return this;
        }

        public PendingActiveNode.Builder mip(final String mip) {
            this.mip = mip;
            return this;
        }

        public PendingActiveNode.Builder sip(final String sip) {
            this.sip = sip;
            return this;
        }

        public PendingActiveNode.Builder platformInfo(final Platform platformInfo) {
            this.platformInfo = platformInfo;
            return this;
        }

        public PendingActiveNode.Builder role(final String role) {
            this.role = role;
            return this;
        }

        public PendingActiveNode.Builder softwareVersion(final String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }

    }
}
