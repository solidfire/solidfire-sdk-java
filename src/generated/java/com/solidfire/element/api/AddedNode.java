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
 * 
 **/
public class AddedNode  implements Serializable  {

    private static final long serialVersionUID = -457533113L;

    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("pendingNodeID") private Long pendingNodeID;

    /**
     * 
     * @param nodeID [required] 
     * @param pendingNodeID [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public AddedNode(Long nodeID, Long pendingNodeID) {
        this.nodeID = nodeID;
        this.pendingNodeID = pendingNodeID;
    }

    
    /**
     * 
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public AddedNode() {}

    public Long getNodeID() {
        return this.nodeID;
    }

    public void setNodeID(Long nodeID) {
        this.nodeID = nodeID;
    }


    public Long getPendingNodeID() {
        return this.pendingNodeID;
    }

    public void setPendingNodeID(Long pendingNodeID) {
        this.pendingNodeID = pendingNodeID;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddedNode that = (AddedNode) o;
        

        return Objects.equals( nodeID , that.nodeID )
            && Objects.equals( pendingNodeID , that.pendingNodeID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeID, pendingNodeID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" pendingNodeID : ").append(pendingNodeID);
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
        private Long pendingNodeID;

        private Builder() { }

        public AddedNode build() {
            return new AddedNode (
                         this.nodeID,
                         this.pendingNodeID            );
        }

        private AddedNode.Builder buildFrom(final AddedNode req) {
            this.nodeID = req.nodeID;
            this.pendingNodeID = req.pendingNodeID;

            return this;
        }

        public AddedNode.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public AddedNode.Builder pendingNodeID(final Long pendingNodeID) {
            this.pendingNodeID = pendingNodeID;
            return this;
        }

    }

}
