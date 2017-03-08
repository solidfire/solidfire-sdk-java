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
 * AddedNode  
 **/

public class AddedNode implements Serializable {

    public static final long serialVersionUID = 7770473146706377395L;
    @SerializedName("nodeID") private Optional<Long> nodeID;
    @SerializedName("pendingNodeID") private Long pendingNodeID;
    @SerializedName("activeNodeKey") private Optional<String> activeNodeKey;
    @SerializedName("assignedNodeID") private Optional<Long> assignedNodeID;
    @SerializedName("asyncHandle") private Optional<Long> asyncHandle;
    @SerializedName("cip") private Optional<String> cip;
    @SerializedName("mip") private Optional<String> mip;
    @SerializedName("platformInfo") private Optional<Platform> platformInfo;
    @SerializedName("sip") private Optional<String> sip;
    @SerializedName("softwareVersion") private Optional<String> softwareVersion;

    // empty constructor
    @Since("7.0")
    public AddedNode() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddedNode(
        Optional<Long> nodeID,
        Long pendingNodeID,
        Optional<String> activeNodeKey,
        Optional<Long> assignedNodeID,
        Optional<Long> asyncHandle,
        Optional<String> cip,
        Optional<String> mip,
        Optional<Platform> platformInfo,
        Optional<String> sip,
        Optional<String> softwareVersion
    )
    {
        this.nodeID = (nodeID == null) ? Optional.<Long>empty() : nodeID;
        this.pendingNodeID = pendingNodeID;
        this.activeNodeKey = (activeNodeKey == null) ? Optional.<String>empty() : activeNodeKey;
        this.assignedNodeID = (assignedNodeID == null) ? Optional.<Long>empty() : assignedNodeID;
        this.asyncHandle = (asyncHandle == null) ? Optional.<Long>empty() : asyncHandle;
        this.cip = (cip == null) ? Optional.<String>empty() : cip;
        this.mip = (mip == null) ? Optional.<String>empty() : mip;
        this.platformInfo = (platformInfo == null) ? Optional.<Platform>empty() : platformInfo;
        this.sip = (sip == null) ? Optional.<String>empty() : sip;
        this.softwareVersion = (softwareVersion == null) ? Optional.<String>empty() : softwareVersion;
    }

    /** 
     * 
     **/
    public Optional<Long> getNodeID() { return this.nodeID; }
    public void setNodeID(Optional<Long> nodeID) { 
        this.nodeID = (nodeID == null) ? Optional.<Long>empty() : nodeID;
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
    public Optional<String> getActiveNodeKey() { return this.activeNodeKey; }
    public void setActiveNodeKey(Optional<String> activeNodeKey) { 
        this.activeNodeKey = (activeNodeKey == null) ? Optional.<String>empty() : activeNodeKey;
    }
    /** 
     * 
     **/
    public Optional<Long> getAssignedNodeID() { return this.assignedNodeID; }
    public void setAssignedNodeID(Optional<Long> assignedNodeID) { 
        this.assignedNodeID = (assignedNodeID == null) ? Optional.<Long>empty() : assignedNodeID;
    }
    /** 
     * 
     **/
    public Optional<Long> getAsyncHandle() { return this.asyncHandle; }
    public void setAsyncHandle(Optional<Long> asyncHandle) { 
        this.asyncHandle = (asyncHandle == null) ? Optional.<Long>empty() : asyncHandle;
    }
    /** 
     * 
     **/
    public Optional<String> getCip() { return this.cip; }
    public void setCip(Optional<String> cip) { 
        this.cip = (cip == null) ? Optional.<String>empty() : cip;
    }
    /** 
     * 
     **/
    public Optional<String> getMip() { return this.mip; }
    public void setMip(Optional<String> mip) { 
        this.mip = (mip == null) ? Optional.<String>empty() : mip;
    }
    /** 
     * 
     **/
    public Optional<Platform> getPlatformInfo() { return this.platformInfo; }
    public void setPlatformInfo(Optional<Platform> platformInfo) { 
        this.platformInfo = (platformInfo == null) ? Optional.<Platform>empty() : platformInfo;
    }
    /** 
     * 
     **/
    public Optional<String> getSip() { return this.sip; }
    public void setSip(Optional<String> sip) { 
        this.sip = (sip == null) ? Optional.<String>empty() : sip;
    }
    /** 
     * 
     **/
    public Optional<String> getSoftwareVersion() { return this.softwareVersion; }
    public void setSoftwareVersion(Optional<String> softwareVersion) { 
        this.softwareVersion = (softwareVersion == null) ? Optional.<String>empty() : softwareVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddedNode that = (AddedNode) o;

        return 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(pendingNodeID, that.pendingNodeID) && 
            Objects.equals(activeNodeKey, that.activeNodeKey) && 
            Objects.equals(assignedNodeID, that.assignedNodeID) && 
            Objects.equals(asyncHandle, that.asyncHandle) && 
            Objects.equals(cip, that.cip) && 
            Objects.equals(mip, that.mip) && 
            Objects.equals(platformInfo, that.platformInfo) && 
            Objects.equals(sip, that.sip) && 
            Objects.equals(softwareVersion, that.softwareVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeID,pendingNodeID,activeNodeKey,assignedNodeID,asyncHandle,cip,mip,platformInfo,sip,softwareVersion );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodeID", nodeID);
        map.put("pendingNodeID", pendingNodeID);
        map.put("activeNodeKey", activeNodeKey);
        map.put("assignedNodeID", assignedNodeID);
        map.put("asyncHandle", asyncHandle);
        map.put("cip", cip);
        map.put("mip", mip);
        map.put("platformInfo", platformInfo);
        map.put("sip", sip);
        map.put("softwareVersion", softwareVersion);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != nodeID && nodeID.isPresent()){
            sb.append(" nodeID : ").append(nodeID).append(",");
        }
        sb.append(" pendingNodeID : ").append(pendingNodeID).append(",");
        if(null != activeNodeKey && activeNodeKey.isPresent()){
            sb.append(" activeNodeKey : ").append(activeNodeKey).append(",");
        }
        if(null != assignedNodeID && assignedNodeID.isPresent()){
            sb.append(" assignedNodeID : ").append(assignedNodeID).append(",");
        }
        if(null != asyncHandle && asyncHandle.isPresent()){
            sb.append(" asyncHandle : ").append(asyncHandle).append(",");
        }
        if(null != cip && cip.isPresent()){
            sb.append(" cip : ").append(cip).append(",");
        }
        if(null != mip && mip.isPresent()){
            sb.append(" mip : ").append(mip).append(",");
        }
        if(null != platformInfo && platformInfo.isPresent()){
            sb.append(" platformInfo : ").append(platformInfo).append(",");
        }
        if(null != sip && sip.isPresent()){
            sb.append(" sip : ").append(sip).append(",");
        }
        if(null != softwareVersion && softwareVersion.isPresent()){
            sb.append(" softwareVersion : ").append(softwareVersion).append(",");
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
        private Optional<Long> nodeID;
        private Long pendingNodeID;
        private Optional<String> activeNodeKey;
        private Optional<Long> assignedNodeID;
        private Optional<Long> asyncHandle;
        private Optional<String> cip;
        private Optional<String> mip;
        private Optional<Platform> platformInfo;
        private Optional<String> sip;
        private Optional<String> softwareVersion;

        private Builder() { }

        public AddedNode build() {
            return new AddedNode (
                         this.nodeID,
                         this.pendingNodeID,
                         this.activeNodeKey,
                         this.assignedNodeID,
                         this.asyncHandle,
                         this.cip,
                         this.mip,
                         this.platformInfo,
                         this.sip,
                         this.softwareVersion);
        }

        private AddedNode.Builder buildFrom(final AddedNode req) {
            this.nodeID = req.nodeID;
            this.pendingNodeID = req.pendingNodeID;
            this.activeNodeKey = req.activeNodeKey;
            this.assignedNodeID = req.assignedNodeID;
            this.asyncHandle = req.asyncHandle;
            this.cip = req.cip;
            this.mip = req.mip;
            this.platformInfo = req.platformInfo;
            this.sip = req.sip;
            this.softwareVersion = req.softwareVersion;

            return this;
        }

        public AddedNode.Builder optional(final Long nodeID) {
            this.nodeID = (nodeID == null) ? Optional.<Long>empty() : Optional.of(nodeID);
            return this;
        }

        public AddedNode.Builder pendingNodeID(final Long pendingNodeID) {
            this.pendingNodeID = pendingNodeID;
            return this;
        }

        public AddedNode.Builder optional(final String activeNodeKey) {
            this.activeNodeKey = (activeNodeKey == null) ? Optional.<String>empty() : Optional.of(activeNodeKey);
            return this;
        }

        public AddedNode.Builder optional(final Long assignedNodeID) {
            this.assignedNodeID = (assignedNodeID == null) ? Optional.<Long>empty() : Optional.of(assignedNodeID);
            return this;
        }

        public AddedNode.Builder optional(final Long asyncHandle) {
            this.asyncHandle = (asyncHandle == null) ? Optional.<Long>empty() : Optional.of(asyncHandle);
            return this;
        }

        public AddedNode.Builder optional(final String cip) {
            this.cip = (cip == null) ? Optional.<String>empty() : Optional.of(cip);
            return this;
        }

        public AddedNode.Builder optional(final String mip) {
            this.mip = (mip == null) ? Optional.<String>empty() : Optional.of(mip);
            return this;
        }

        public AddedNode.Builder optional(final Platform platformInfo) {
            this.platformInfo = (platformInfo == null) ? Optional.<Platform>empty() : Optional.of(platformInfo);
            return this;
        }

        public AddedNode.Builder optional(final String sip) {
            this.sip = (sip == null) ? Optional.<String>empty() : Optional.of(sip);
            return this;
        }

        public AddedNode.Builder optional(final String softwareVersion) {
            this.softwareVersion = (softwareVersion == null) ? Optional.<String>empty() : Optional.of(softwareVersion);
            return this;
        }

    }
}
