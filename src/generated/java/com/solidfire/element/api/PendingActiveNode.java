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
 **/

public class PendingActiveNode implements Serializable {

    public static final long serialVersionUID = 6847418537242966542L;
    @SerializedName("activeNodeKey") private String activeNodeKey;
    @SerializedName("assignedNodeID") private Long assignedNodeID;
    @SerializedName("asyncHandle") private Long asyncHandle;
    @SerializedName("cip") private String cip;
    @SerializedName("mip") private String mip;
    @SerializedName("pendingNodeID") private Long pendingNodeID;
    @SerializedName("platformInfo") private Platform platformInfo;
    @SerializedName("sip") private String sip;
    @SerializedName("softwareVersion") private String softwareVersion;

    // empty constructor
    @Since("7.0")
    public PendingActiveNode() {}

    
    // parameterized constructor
    @Since("7.0")
    public PendingActiveNode(
        String activeNodeKey,
        Long assignedNodeID,
        Long asyncHandle,
        String cip,
        String mip,
        Long pendingNodeID,
        Platform platformInfo,
        String sip,
        String softwareVersion
    )
    {
        this.activeNodeKey = activeNodeKey;
        this.assignedNodeID = assignedNodeID;
        this.asyncHandle = asyncHandle;
        this.cip = cip;
        this.mip = mip;
        this.pendingNodeID = pendingNodeID;
        this.platformInfo = platformInfo;
        this.sip = sip;
        this.softwareVersion = softwareVersion;
    }

    /** 
     **/
    public String getActiveNodeKey() { return this.activeNodeKey; }
    public void setActiveNodeKey(String activeNodeKey) { 
        this.activeNodeKey = activeNodeKey;
    }
    /** 
     **/
    public Long getAssignedNodeID() { return this.assignedNodeID; }
    public void setAssignedNodeID(Long assignedNodeID) { 
        this.assignedNodeID = assignedNodeID;
    }
    /** 
     **/
    public Long getAsyncHandle() { return this.asyncHandle; }
    public void setAsyncHandle(Long asyncHandle) { 
        this.asyncHandle = asyncHandle;
    }
    /** 
     **/
    public String getCip() { return this.cip; }
    public void setCip(String cip) { 
        this.cip = cip;
    }
    /** 
     **/
    public String getMip() { return this.mip; }
    public void setMip(String mip) { 
        this.mip = mip;
    }
    /** 
     **/
    public Long getPendingNodeID() { return this.pendingNodeID; }
    public void setPendingNodeID(Long pendingNodeID) { 
        this.pendingNodeID = pendingNodeID;
    }
    /** 
     **/
    public Platform getPlatformInfo() { return this.platformInfo; }
    public void setPlatformInfo(Platform platformInfo) { 
        this.platformInfo = platformInfo;
    }
    /** 
     **/
    public String getSip() { return this.sip; }
    public void setSip(String sip) { 
        this.sip = sip;
    }
    /** 
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
            Objects.equals(assignedNodeID, that.assignedNodeID) && 
            Objects.equals(asyncHandle, that.asyncHandle) && 
            Objects.equals(cip, that.cip) && 
            Objects.equals(mip, that.mip) && 
            Objects.equals(pendingNodeID, that.pendingNodeID) && 
            Objects.equals(platformInfo, that.platformInfo) && 
            Objects.equals(sip, that.sip) && 
            Objects.equals(softwareVersion, that.softwareVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash( activeNodeKey,assignedNodeID,asyncHandle,cip,mip,pendingNodeID,platformInfo,sip,softwareVersion );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("activeNodeKey", activeNodeKey);
        map.put("assignedNodeID", assignedNodeID);
        map.put("asyncHandle", asyncHandle);
        map.put("cip", cip);
        map.put("mip", mip);
        map.put("pendingNodeID", pendingNodeID);
        map.put("platformInfo", platformInfo);
        map.put("sip", sip);
        map.put("softwareVersion", softwareVersion);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" activeNodeKey : ").append(activeNodeKey).append(",");
        sb.append(" assignedNodeID : ").append(assignedNodeID).append(",");
        sb.append(" asyncHandle : ").append(asyncHandle).append(",");
        sb.append(" cip : ").append(cip).append(",");
        sb.append(" mip : ").append(mip).append(",");
        sb.append(" pendingNodeID : ").append(pendingNodeID).append(",");
        sb.append(" platformInfo : ").append(platformInfo).append(",");
        sb.append(" sip : ").append(sip).append(",");
        sb.append(" softwareVersion : ").append(softwareVersion).append(",");
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
        private Long assignedNodeID;
        private Long asyncHandle;
        private String cip;
        private String mip;
        private Long pendingNodeID;
        private Platform platformInfo;
        private String sip;
        private String softwareVersion;

        private Builder() { }

        public PendingActiveNode build() {
            return new PendingActiveNode (
                         this.activeNodeKey,
                         this.assignedNodeID,
                         this.asyncHandle,
                         this.cip,
                         this.mip,
                         this.pendingNodeID,
                         this.platformInfo,
                         this.sip,
                         this.softwareVersion);
        }

        private PendingActiveNode.Builder buildFrom(final PendingActiveNode req) {
            this.activeNodeKey = req.activeNodeKey;
            this.assignedNodeID = req.assignedNodeID;
            this.asyncHandle = req.asyncHandle;
            this.cip = req.cip;
            this.mip = req.mip;
            this.pendingNodeID = req.pendingNodeID;
            this.platformInfo = req.platformInfo;
            this.sip = req.sip;
            this.softwareVersion = req.softwareVersion;

            return this;
        }

        public PendingActiveNode.Builder activeNodeKey(final String activeNodeKey) {
            this.activeNodeKey = activeNodeKey;
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

        public PendingActiveNode.Builder pendingNodeID(final Long pendingNodeID) {
            this.pendingNodeID = pendingNodeID;
            return this;
        }

        public PendingActiveNode.Builder platformInfo(final Platform platformInfo) {
            this.platformInfo = platformInfo;
            return this;
        }

        public PendingActiveNode.Builder sip(final String sip) {
            this.sip = sip;
            return this;
        }

        public PendingActiveNode.Builder softwareVersion(final String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }

    }
}
