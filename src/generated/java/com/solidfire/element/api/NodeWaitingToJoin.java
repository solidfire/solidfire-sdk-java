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

    public static final long serialVersionUID = 4751353832656225215L;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("version") private String version;
    @SerializedName("nodeID") private Optional<Long> nodeID;
    @SerializedName("pendingNodeID") private Optional<Long> pendingNodeID;
    @SerializedName("mip") private Optional<String> mip;
    @SerializedName("cip") private Optional<String> cip;
    @SerializedName("sip") private Optional<String> sip;
    @SerializedName("compatible") private Boolean compatible;
    @SerializedName("chassisType") private Optional<String> chassisType;
    @SerializedName("hostname") private Optional<String> hostname;
    @SerializedName("nodeType") private Optional<String> nodeType;

    // empty constructor
    @Since("7.0")
    public NodeWaitingToJoin() {}

    
    // parameterized constructor
    @Since("7.0")
    public NodeWaitingToJoin(
        Optional<String> name,
        String version,
        Optional<Long> nodeID,
        Optional<Long> pendingNodeID,
        Optional<String> mip,
        Optional<String> cip,
        Optional<String> sip,
        Boolean compatible,
        Optional<String> chassisType,
        Optional<String> hostname,
        Optional<String> nodeType
    )
    {
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.version = version;
        this.nodeID = (nodeID == null) ? Optional.<Long>empty() : nodeID;
        this.pendingNodeID = (pendingNodeID == null) ? Optional.<Long>empty() : pendingNodeID;
        this.mip = (mip == null) ? Optional.<String>empty() : mip;
        this.cip = (cip == null) ? Optional.<String>empty() : cip;
        this.sip = (sip == null) ? Optional.<String>empty() : sip;
        this.compatible = compatible;
        this.chassisType = (chassisType == null) ? Optional.<String>empty() : chassisType;
        this.hostname = (hostname == null) ? Optional.<String>empty() : hostname;
        this.nodeType = (nodeType == null) ? Optional.<String>empty() : nodeType;
    }

    /** 
     **/
    public Optional<String> getName() { return this.name; }
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     **/
    public String getVersion() { return this.version; }
    public void setVersion(String version) { 
        this.version = version;
    }
    /** 
     **/
    public Optional<Long> getNodeID() { return this.nodeID; }
    public void setNodeID(Optional<Long> nodeID) { 
        this.nodeID = (nodeID == null) ? Optional.<Long>empty() : nodeID;
    }
    /** 
     **/
    public Optional<Long> getPendingNodeID() { return this.pendingNodeID; }
    public void setPendingNodeID(Optional<Long> pendingNodeID) { 
        this.pendingNodeID = (pendingNodeID == null) ? Optional.<Long>empty() : pendingNodeID;
    }
    /** 
     **/
    public Optional<String> getMip() { return this.mip; }
    public void setMip(Optional<String> mip) { 
        this.mip = (mip == null) ? Optional.<String>empty() : mip;
    }
    /** 
     **/
    public Optional<String> getCip() { return this.cip; }
    public void setCip(Optional<String> cip) { 
        this.cip = (cip == null) ? Optional.<String>empty() : cip;
    }
    /** 
     **/
    public Optional<String> getSip() { return this.sip; }
    public void setSip(Optional<String> sip) { 
        this.sip = (sip == null) ? Optional.<String>empty() : sip;
    }
    /** 
     **/
    public Boolean getCompatible() { return this.compatible; }
    public void setCompatible(Boolean compatible) { 
        this.compatible = compatible;
    }
    /** 
     **/
    public Optional<String> getChassisType() { return this.chassisType; }
    public void setChassisType(Optional<String> chassisType) { 
        this.chassisType = (chassisType == null) ? Optional.<String>empty() : chassisType;
    }
    /** 
     **/
    public Optional<String> getHostname() { return this.hostname; }
    public void setHostname(Optional<String> hostname) { 
        this.hostname = (hostname == null) ? Optional.<String>empty() : hostname;
    }
    /** 
     **/
    public Optional<String> getNodeType() { return this.nodeType; }
    public void setNodeType(Optional<String> nodeType) { 
        this.nodeType = (nodeType == null) ? Optional.<String>empty() : nodeType;
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
            Objects.equals(sip, that.sip) && 
            Objects.equals(compatible, that.compatible) && 
            Objects.equals(chassisType, that.chassisType) && 
            Objects.equals(hostname, that.hostname) && 
            Objects.equals(nodeType, that.nodeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,version,nodeID,pendingNodeID,mip,cip,sip,compatible,chassisType,hostname,nodeType );
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
        map.put("compatible", compatible);
        map.put("chassisType", chassisType);
        map.put("hostname", hostname);
        map.put("nodeType", nodeType);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != name && name.isPresent()){
            sb.append(" name : ").append(name).append(",");
        }
        sb.append(" version : ").append(version).append(",");
        if(null != nodeID && nodeID.isPresent()){
            sb.append(" nodeID : ").append(nodeID).append(",");
        }
        if(null != pendingNodeID && pendingNodeID.isPresent()){
            sb.append(" pendingNodeID : ").append(pendingNodeID).append(",");
        }
        if(null != mip && mip.isPresent()){
            sb.append(" mip : ").append(mip).append(",");
        }
        if(null != cip && cip.isPresent()){
            sb.append(" cip : ").append(cip).append(",");
        }
        if(null != sip && sip.isPresent()){
            sb.append(" sip : ").append(sip).append(",");
        }
        sb.append(" compatible : ").append(compatible).append(",");
        if(null != chassisType && chassisType.isPresent()){
            sb.append(" chassisType : ").append(chassisType).append(",");
        }
        if(null != hostname && hostname.isPresent()){
            sb.append(" hostname : ").append(hostname).append(",");
        }
        if(null != nodeType && nodeType.isPresent()){
            sb.append(" nodeType : ").append(nodeType).append(",");
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
        private Optional<String> name;
        private String version;
        private Optional<Long> nodeID;
        private Optional<Long> pendingNodeID;
        private Optional<String> mip;
        private Optional<String> cip;
        private Optional<String> sip;
        private Boolean compatible;
        private Optional<String> chassisType;
        private Optional<String> hostname;
        private Optional<String> nodeType;

        private Builder() { }

        public NodeWaitingToJoin build() {
            return new NodeWaitingToJoin (
                         this.name,
                         this.version,
                         this.nodeID,
                         this.pendingNodeID,
                         this.mip,
                         this.cip,
                         this.sip,
                         this.compatible,
                         this.chassisType,
                         this.hostname,
                         this.nodeType);
        }

        private NodeWaitingToJoin.Builder buildFrom(final NodeWaitingToJoin req) {
            this.name = req.name;
            this.version = req.version;
            this.nodeID = req.nodeID;
            this.pendingNodeID = req.pendingNodeID;
            this.mip = req.mip;
            this.cip = req.cip;
            this.sip = req.sip;
            this.compatible = req.compatible;
            this.chassisType = req.chassisType;
            this.hostname = req.hostname;
            this.nodeType = req.nodeType;

            return this;
        }

        public NodeWaitingToJoin.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public NodeWaitingToJoin.Builder version(final String version) {
            this.version = version;
            return this;
        }

        public NodeWaitingToJoin.Builder optionalNodeID(final Long nodeID) {
            this.nodeID = (nodeID == null) ? Optional.<Long>empty() : Optional.of(nodeID);
            return this;
        }

        public NodeWaitingToJoin.Builder optionalPendingNodeID(final Long pendingNodeID) {
            this.pendingNodeID = (pendingNodeID == null) ? Optional.<Long>empty() : Optional.of(pendingNodeID);
            return this;
        }

        public NodeWaitingToJoin.Builder optionalMip(final String mip) {
            this.mip = (mip == null) ? Optional.<String>empty() : Optional.of(mip);
            return this;
        }

        public NodeWaitingToJoin.Builder optionalCip(final String cip) {
            this.cip = (cip == null) ? Optional.<String>empty() : Optional.of(cip);
            return this;
        }

        public NodeWaitingToJoin.Builder optionalSip(final String sip) {
            this.sip = (sip == null) ? Optional.<String>empty() : Optional.of(sip);
            return this;
        }

        public NodeWaitingToJoin.Builder compatible(final Boolean compatible) {
            this.compatible = compatible;
            return this;
        }

        public NodeWaitingToJoin.Builder optionalChassisType(final String chassisType) {
            this.chassisType = (chassisType == null) ? Optional.<String>empty() : Optional.of(chassisType);
            return this;
        }

        public NodeWaitingToJoin.Builder optionalHostname(final String hostname) {
            this.hostname = (hostname == null) ? Optional.<String>empty() : Optional.of(hostname);
            return this;
        }

        public NodeWaitingToJoin.Builder optionalNodeType(final String nodeType) {
            this.nodeType = (nodeType == null) ? Optional.<String>empty() : Optional.of(nodeType);
            return this;
        }

    }
}
