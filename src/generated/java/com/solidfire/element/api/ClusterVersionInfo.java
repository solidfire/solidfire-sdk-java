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
 * ClusterVersionInfo  
 * Version information for a node in the cluster.
 **/

public class ClusterVersionInfo implements Serializable {

    public static final long serialVersionUID = -4232836006568542040L;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("nodeVersion") private String nodeVersion;
    @SerializedName("nodeInternalRevision") private String nodeInternalRevision;

    // empty constructor
    @Since("7.0")
    public ClusterVersionInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public ClusterVersionInfo(
        Long nodeID,
        String nodeVersion,
        String nodeInternalRevision
    )
    {
        this.nodeID = nodeID;
        this.nodeVersion = nodeVersion;
        this.nodeInternalRevision = nodeInternalRevision;
    }

    /** 
     **/
    public Long getNodeID() { return this.nodeID; }
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     **/
    public String getNodeVersion() { return this.nodeVersion; }
    public void setNodeVersion(String nodeVersion) { 
        this.nodeVersion = nodeVersion;
    }
    /** 
     **/
    public String getNodeInternalRevision() { return this.nodeInternalRevision; }
    public void setNodeInternalRevision(String nodeInternalRevision) { 
        this.nodeInternalRevision = nodeInternalRevision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterVersionInfo that = (ClusterVersionInfo) o;

        return 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(nodeVersion, that.nodeVersion) && 
            Objects.equals(nodeInternalRevision, that.nodeInternalRevision);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeID,nodeVersion,nodeInternalRevision );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("nodeID", nodeID);
        map.put("nodeVersion", nodeVersion);
        map.put("nodeInternalRevision", nodeInternalRevision);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" nodeVersion : ").append(nodeVersion).append(",");
        sb.append(" nodeInternalRevision : ").append(nodeInternalRevision).append(",");
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
        private Long nodeID;
        private String nodeVersion;
        private String nodeInternalRevision;

        private Builder() { }

        public ClusterVersionInfo build() {
            return new ClusterVersionInfo (
                         this.nodeID,
                         this.nodeVersion,
                         this.nodeInternalRevision);
        }

        private ClusterVersionInfo.Builder buildFrom(final ClusterVersionInfo req) {
            this.nodeID = req.nodeID;
            this.nodeVersion = req.nodeVersion;
            this.nodeInternalRevision = req.nodeInternalRevision;

            return this;
        }

        public ClusterVersionInfo.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public ClusterVersionInfo.Builder nodeVersion(final String nodeVersion) {
            this.nodeVersion = nodeVersion;
            return this;
        }

        public ClusterVersionInfo.Builder nodeInternalRevision(final String nodeInternalRevision) {
            this.nodeInternalRevision = nodeInternalRevision;
            return this;
        }

    }
}
