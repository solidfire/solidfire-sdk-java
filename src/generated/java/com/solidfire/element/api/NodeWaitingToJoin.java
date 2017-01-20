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
 * NodeWaitingToJoin  
 **/

public class NodeWaitingToJoin implements Serializable {

    public static final long serialVersionUID = -3355207600302107126L;
    @SerializedName("name") private String name;
    @SerializedName("version") private String version;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("pendingNodeID") private Long pendingNodeID;
    @SerializedName("mip") private String mip;
    @SerializedName("cip") private String cip;
    @SerializedName("sip") private String sip;

    // empty constructor
    @Since("7.0")
    public NodeWaitingToJoin() {}

    
    // parameterized constructor
    @Since("7.0")
    public NodeWaitingToJoin(
        String name,
        String version,
        Long nodeID,
        Long pendingNodeID,
        String mip,
        String cip,
        String sip
    )
    {
        this.name = name;
        this.version = version;
        this.nodeID = nodeID;
        this.pendingNodeID = pendingNodeID;
        this.mip = mip;
        this.cip = cip;
        this.sip = sip;
    }

    /** 
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     **/
    public String getVersion() { return this.version; }
    public void setVersion(String version) { 
        this.version = version;
    }
    /** 
     **/
    public Long getNodeID() { return this.nodeID; }
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     **/
    public Long getPendingNodeID() { return this.pendingNodeID; }
    public void setPendingNodeID(Long pendingNodeID) { 
        this.pendingNodeID = pendingNodeID;
    }
    /** 
     **/
    public String getMip() { return this.mip; }
    public void setMip(String mip) { 
        this.mip = mip;
    }
    /** 
     **/
    public String getCip() { return this.cip; }
    public void setCip(String cip) { 
        this.cip = cip;
    }
    /** 
     **/
    public String getSip() { return this.sip; }
    public void setSip(String sip) { 
        this.sip = sip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeWaitingToJoin that = (NodeWaitingToJoin) o;

        return 
            Objects.equals(name, that.name) && 
            Objects.equals(version, that.version) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(pendingNodeID, that.pendingNodeID) && 
            Objects.equals(mip, that.mip) && 
            Objects.equals(cip, that.cip) && 
            Objects.equals(sip, that.sip);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,version,nodeID,pendingNodeID,mip,cip,sip );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("version", version);
        map.put("nodeID", nodeID);
        map.put("pendingNodeID", pendingNodeID);
        map.put("mip", mip);
        map.put("cip", cip);
        map.put("sip", sip);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" name : ").append(name).append(",");
        sb.append(" version : ").append(version).append(",");
        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" pendingNodeID : ").append(pendingNodeID).append(",");
        sb.append(" mip : ").append(mip).append(",");
        sb.append(" cip : ").append(cip).append(",");
        sb.append(" sip : ").append(sip).append(",");
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
        private String name;
        private String version;
        private Long nodeID;
        private Long pendingNodeID;
        private String mip;
        private String cip;
        private String sip;

        private Builder() { }

        public NodeWaitingToJoin build() {
            return new NodeWaitingToJoin (
                         this.name,
                         this.version,
                         this.nodeID,
                         this.pendingNodeID,
                         this.mip,
                         this.cip,
                         this.sip);
        }

        private NodeWaitingToJoin.Builder buildFrom(final NodeWaitingToJoin req) {
            this.name = req.name;
            this.version = req.version;
            this.nodeID = req.nodeID;
            this.pendingNodeID = req.pendingNodeID;
            this.mip = req.mip;
            this.cip = req.cip;
            this.sip = req.sip;

            return this;
        }

        public NodeWaitingToJoin.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public NodeWaitingToJoin.Builder version(final String version) {
            this.version = version;
            return this;
        }

        public NodeWaitingToJoin.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public NodeWaitingToJoin.Builder pendingNodeID(final Long pendingNodeID) {
            this.pendingNodeID = pendingNodeID;
            return this;
        }

        public NodeWaitingToJoin.Builder mip(final String mip) {
            this.mip = mip;
            return this;
        }

        public NodeWaitingToJoin.Builder cip(final String cip) {
            this.cip = cip;
            return this;
        }

        public NodeWaitingToJoin.Builder sip(final String sip) {
            this.sip = sip;
            return this;
        }

    }
}
