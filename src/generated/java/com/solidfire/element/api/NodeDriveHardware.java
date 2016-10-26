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
public class NodeDriveHardware  implements Serializable  {

    private static final long serialVersionUID = -751505842L;

    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("result") private DrivesHardware result;

    /**
     * 
     * @param nodeID [required] 
     * @param result [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public NodeDriveHardware(Long nodeID, DrivesHardware result) {
        this.nodeID = nodeID;
        this.result = result;
    }

    
    /**
     * 
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public NodeDriveHardware() {}

    public Long getNodeID() {
        return this.nodeID;
    }

    public void setNodeID(Long nodeID) {
        this.nodeID = nodeID;
    }


    public DrivesHardware getResult() {
        return this.result;
    }

    public void setResult(DrivesHardware result) {
        this.result = result;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeDriveHardware that = (NodeDriveHardware) o;
        

        return Objects.equals( nodeID , that.nodeID )
            && Objects.equals( result , that.result );
    }

    @Override
    public int hashCode() {
        return Objects.hash( nodeID, result );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" result : ").append(result);
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
        private DrivesHardware result;

        private Builder() { }

        public NodeDriveHardware build() {
            return new NodeDriveHardware (
                         this.nodeID,
                         this.result            );
        }

        private NodeDriveHardware.Builder buildFrom(final NodeDriveHardware req) {
            this.nodeID = req.nodeID;
            this.result = req.result;

            return this;
        }

        public NodeDriveHardware.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public NodeDriveHardware.Builder result(final DrivesHardware result) {
            this.result = result;
            return this;
        }

    }

}