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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * Version information for a node in the cluster.
 **/
public class ClusterVersionInfo implements Serializable {

    private static final long serialVersionUID = -1305118966L;

    @SerializedName("nodeID") private final Long nodeID;
    @SerializedName("nodeVersion") private final String nodeVersion;
    @SerializedName("nodeInternalRevision") private final String nodeInternalRevision;

    /**
     * Version information for a node in the cluster.
     * @param nodeID [required] 
     * @param nodeVersion [required] 
     * @param nodeInternalRevision [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public ClusterVersionInfo(Long nodeID, String nodeVersion, String nodeInternalRevision) {
        this.nodeID = nodeID;
        this.nodeVersion = nodeVersion;
        this.nodeInternalRevision = nodeInternalRevision;
    }

    public Long getNodeID() {
        return this.nodeID;
    }
    public String getNodeVersion() {
        return this.nodeVersion;
    }
    public String getNodeInternalRevision() {
        return this.nodeInternalRevision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClusterVersionInfo that = (ClusterVersionInfo) o;
        

        return Objects.equals( nodeID , that.nodeID )
            && Objects.equals( nodeVersion , that.nodeVersion )
            && Objects.equals( nodeInternalRevision , that.nodeInternalRevision );
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeID, nodeVersion, nodeInternalRevision );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" nodeVersion : ").append(nodeVersion).append(",");
        sb.append(" nodeInternalRevision : ").append(nodeInternalRevision);
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }
}
