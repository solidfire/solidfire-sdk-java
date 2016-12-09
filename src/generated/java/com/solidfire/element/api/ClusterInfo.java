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
 * Cluster Info object returns information the node uses to communicate with the cluster.
 **/

public class ClusterInfo implements Serializable {

    public static final long serialVersionUID = 6937143244161912485L;
    @SerializedName("attributes") private java.util.Map<String, Object> attributes;
    @SerializedName("encryptionAtRestState") private String encryptionAtRestState;
    @SerializedName("ensemble") private String[] ensemble;
    @SerializedName("mvip") private String mvip;
    @SerializedName("mvipNodeID") private Long mvipNodeID;
    @SerializedName("name") private String name;
    @SerializedName("repCount") private Long repCount;
    @SerializedName("state") private String state;
    @SerializedName("svip") private String svip;
    @SerializedName("svipNodeID") private Long svipNodeID;
    @SerializedName("uniqueID") private String uniqueID;
    @SerializedName("uuid") private java.util.UUID uuid;

    // empty constructor
    @Since("7.0")
    public ClusterInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public ClusterInfo(
        java.util.Map<String, Object> attributes,
        String encryptionAtRestState,
        String[] ensemble,
        String mvip,
        Long mvipNodeID,
        String name,
        Long repCount,
        String state,
        String svip,
        Long svipNodeID,
        String uniqueID,
        java.util.UUID uuid
    )
    {
        this.attributes = attributes;
        this.encryptionAtRestState = encryptionAtRestState;
        this.ensemble = ensemble;
        this.mvip = mvip;
        this.mvipNodeID = mvipNodeID;
        this.name = name;
        this.repCount = repCount;
        this.state = state;
        this.svip = svip;
        this.svipNodeID = svipNodeID;
        this.uniqueID = uniqueID;
        this.uuid = uuid;
    }

    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public java.util.Map<String, Object> getAttributes() { return this.attributes; }
    public void setAttributes(java.util.Map<String, Object> attributes) { 
        this.attributes = attributes;
    }
    /** 
     * Encryption at rest state.
     **/
    public String getEncryptionAtRestState() { return this.encryptionAtRestState; }
    public void setEncryptionAtRestState(String encryptionAtRestState) { 
        this.encryptionAtRestState = encryptionAtRestState;
    }
    /** 
     * Array of Node IP addresses that are participating in the cluster.
     **/
    public String[] getEnsemble() { return this.ensemble; }
    public void setEnsemble(String[] ensemble) { 
        this.ensemble = ensemble;
    }
    /** 
     * Management network interface.
     **/
    public String getMvip() { return this.mvip; }
    public void setMvip(String mvip) { 
        this.mvip = mvip;
    }
    /** 
     * Node holding the master MVIP address
     **/
    public Long getMvipNodeID() { return this.mvipNodeID; }
    public void setMvipNodeID(Long mvipNodeID) { 
        this.mvipNodeID = mvipNodeID;
    }
    /** 
     * Unique cluster name.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * Number of replicas of each piece of data to store in the cluster.
     * Valid value is 2
     **/
    public Long getRepCount() { return this.repCount; }
    public void setRepCount(Long repCount) { 
        this.repCount = repCount;
    }
    /** 
     **/
    public String getState() { return this.state; }
    public void setState(String state) { 
        this.state = state;
    }
    /** 
     * Storage virtual IP
     **/
    public String getSvip() { return this.svip; }
    public void setSvip(String svip) { 
        this.svip = svip;
    }
    /** 
     * Node holding the master SVIP address.
     **/
    public Long getSvipNodeID() { return this.svipNodeID; }
    public void setSvipNodeID(Long svipNodeID) { 
        this.svipNodeID = svipNodeID;
    }
    /** 
     * Unique ID for the cluster.
     **/
    public String getUniqueID() { return this.uniqueID; }
    public void setUniqueID(String uniqueID) { 
        this.uniqueID = uniqueID;
    }
    /** 
     **/
    public java.util.UUID getUuid() { return this.uuid; }
    public void setUuid(java.util.UUID uuid) { 
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterInfo that = (ClusterInfo) o;

        return 
            Objects.equals(attributes, that.attributes) && 
            Objects.equals(encryptionAtRestState, that.encryptionAtRestState) && 
            Arrays.equals(ensemble, that.ensemble) && 
            Objects.equals(mvip, that.mvip) && 
            Objects.equals(mvipNodeID, that.mvipNodeID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(repCount, that.repCount) && 
            Objects.equals(state, that.state) && 
            Objects.equals(svip, that.svip) && 
            Objects.equals(svipNodeID, that.svipNodeID) && 
            Objects.equals(uniqueID, that.uniqueID) && 
            Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash( attributes,encryptionAtRestState,(Object[])ensemble,mvip,mvipNodeID,name,repCount,state,svip,svipNodeID,uniqueID,uuid );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("attributes", attributes);
        map.put("encryptionAtRestState", encryptionAtRestState);
        map.put("ensemble", ensemble);
        map.put("mvip", mvip);
        map.put("mvipNodeID", mvipNodeID);
        map.put("name", name);
        map.put("repCount", repCount);
        map.put("state", state);
        map.put("svip", svip);
        map.put("svipNodeID", svipNodeID);
        map.put("uniqueID", uniqueID);
        map.put("uuid", uuid);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" attributes : ").append(attributes).append(",");
        sb.append(" encryptionAtRestState : ").append(encryptionAtRestState).append(",");
        sb.append(" ensemble : ").append(Arrays.toString(ensemble)).append(",");
        sb.append(" mvip : ").append(mvip).append(",");
        sb.append(" mvipNodeID : ").append(mvipNodeID).append(",");
        sb.append(" name : ").append(name).append(",");
        sb.append(" repCount : ").append(repCount).append(",");
        sb.append(" state : ").append(state).append(",");
        sb.append(" svip : ").append(svip).append(",");
        sb.append(" svipNodeID : ").append(svipNodeID).append(",");
        sb.append(" uniqueID : ").append(uniqueID).append(",");
        sb.append(" uuid : ").append(uuid).append(",");
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
        private java.util.Map<String, Object> attributes;
        private String encryptionAtRestState;
        private String[] ensemble;
        private String mvip;
        private Long mvipNodeID;
        private String name;
        private Long repCount;
        private String state;
        private String svip;
        private Long svipNodeID;
        private String uniqueID;
        private java.util.UUID uuid;

        private Builder() { }

        public ClusterInfo build() {
            return new ClusterInfo (
                         this.attributes,
                         this.encryptionAtRestState,
                         this.ensemble,
                         this.mvip,
                         this.mvipNodeID,
                         this.name,
                         this.repCount,
                         this.state,
                         this.svip,
                         this.svipNodeID,
                         this.uniqueID,
                         this.uuid);
        }

        private ClusterInfo.Builder buildFrom(final ClusterInfo req) {
            this.attributes = req.attributes;
            this.encryptionAtRestState = req.encryptionAtRestState;
            this.ensemble = req.ensemble;
            this.mvip = req.mvip;
            this.mvipNodeID = req.mvipNodeID;
            this.name = req.name;
            this.repCount = req.repCount;
            this.state = req.state;
            this.svip = req.svip;
            this.svipNodeID = req.svipNodeID;
            this.uniqueID = req.uniqueID;
            this.uuid = req.uuid;

            return this;
        }

        public ClusterInfo.Builder attributes(final java.util.Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }

        public ClusterInfo.Builder encryptionAtRestState(final String encryptionAtRestState) {
            this.encryptionAtRestState = encryptionAtRestState;
            return this;
        }

        public ClusterInfo.Builder ensemble(final String[] ensemble) {
            this.ensemble = ensemble;
            return this;
        }

        public ClusterInfo.Builder mvip(final String mvip) {
            this.mvip = mvip;
            return this;
        }

        public ClusterInfo.Builder mvipNodeID(final Long mvipNodeID) {
            this.mvipNodeID = mvipNodeID;
            return this;
        }

        public ClusterInfo.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public ClusterInfo.Builder repCount(final Long repCount) {
            this.repCount = repCount;
            return this;
        }

        public ClusterInfo.Builder state(final String state) {
            this.state = state;
            return this;
        }

        public ClusterInfo.Builder svip(final String svip) {
            this.svip = svip;
            return this;
        }

        public ClusterInfo.Builder svipNodeID(final Long svipNodeID) {
            this.svipNodeID = svipNodeID;
            return this;
        }

        public ClusterInfo.Builder uniqueID(final String uniqueID) {
            this.uniqueID = uniqueID;
            return this;
        }

        public ClusterInfo.Builder uuid(final java.util.UUID uuid) {
            this.uuid = uuid;
            return this;
        }

    }
}
