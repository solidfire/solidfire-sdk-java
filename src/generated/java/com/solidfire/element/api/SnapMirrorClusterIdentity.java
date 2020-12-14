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
 * SnapMirrorClusterIdentity  
 * The snapMirrorClusterIdentity object contains identification information about the remote ONTAP cluster in a SnapMirror relationship.
 **/

public class SnapMirrorClusterIdentity implements Serializable {

    public static final long serialVersionUID = 7301982996631610725L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("clusterName") private String clusterName;
    @SerializedName("clusterUUID") private String clusterUUID;
    @SerializedName("clusterSerialNumber") private String clusterSerialNumber;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorClusterIdentity(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorClusterIdentity(
        Long snapMirrorEndpointID,
        String clusterName,
        String clusterUUID,
        String clusterSerialNumber
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.clusterName = clusterName;
        this.clusterUUID = clusterUUID;
        this.clusterSerialNumber = clusterSerialNumber;
    }

    /** 
     * The ID of the destination ONTAP system.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The name of the destination ONTAP cluster.
     **/
    public String getClusterName() { return this.clusterName; }
   
    public void setClusterName(String clusterName) { 
        this.clusterName = clusterName;
    }
    /** 
     * The 128-bit universally-unique identifier of the destination ONTAP cluster.
     **/
    public String getClusterUUID() { return this.clusterUUID; }
   
    public void setClusterUUID(String clusterUUID) { 
        this.clusterUUID = clusterUUID;
    }
    /** 
     * The serial number of the destination ONTAP cluster.
     **/
    public String getClusterSerialNumber() { return this.clusterSerialNumber; }
   
    public void setClusterSerialNumber(String clusterSerialNumber) { 
        this.clusterSerialNumber = clusterSerialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorClusterIdentity that = (SnapMirrorClusterIdentity) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(clusterName, that.clusterName) && 
            Objects.equals(clusterUUID, that.clusterUUID) && 
            Objects.equals(clusterSerialNumber, that.clusterSerialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,clusterName,clusterUUID,clusterSerialNumber );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("clusterName", clusterName);
        map.put("clusterUUID", clusterUUID);
        map.put("clusterSerialNumber", clusterSerialNumber);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" clusterName : ").append(gson.toJson(clusterName)).append(",");
        sb.append(" clusterUUID : ").append(gson.toJson(clusterUUID)).append(",");
        sb.append(" clusterSerialNumber : ").append(gson.toJson(clusterSerialNumber)).append(",");
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
        private Long snapMirrorEndpointID;
        private String clusterName;
        private String clusterUUID;
        private String clusterSerialNumber;

        private Builder() { }

        public SnapMirrorClusterIdentity build() {
            return new SnapMirrorClusterIdentity (
                         this.snapMirrorEndpointID,
                         this.clusterName,
                         this.clusterUUID,
                         this.clusterSerialNumber);
        }

        private SnapMirrorClusterIdentity.Builder buildFrom(final SnapMirrorClusterIdentity req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.clusterName = req.clusterName;
            this.clusterUUID = req.clusterUUID;
            this.clusterSerialNumber = req.clusterSerialNumber;

            return this;
        }

        public SnapMirrorClusterIdentity.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public SnapMirrorClusterIdentity.Builder clusterName(final String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public SnapMirrorClusterIdentity.Builder clusterUUID(final String clusterUUID) {
            this.clusterUUID = clusterUUID;
            return this;
        }

        public SnapMirrorClusterIdentity.Builder clusterSerialNumber(final String clusterSerialNumber) {
            this.clusterSerialNumber = clusterSerialNumber;
            return this;
        }

    }
}
