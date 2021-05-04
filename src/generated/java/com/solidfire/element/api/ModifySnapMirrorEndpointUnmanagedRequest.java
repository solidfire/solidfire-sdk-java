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
 * ModifySnapMirrorEndpointUnmanagedRequest  
 * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
 **/

public class ModifySnapMirrorEndpointUnmanagedRequest implements Serializable {

    public static final long serialVersionUID = 4482247570981873772L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("clusterName") private Optional<String> clusterName;
    @SerializedName("ipAddresses") private Optional<String[]> ipAddresses;

    
    // parameterized constructor
    @Since("7.0")
    public ModifySnapMirrorEndpointUnmanagedRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ModifySnapMirrorEndpointUnmanagedRequest(
        Long snapMirrorEndpointID,
        Optional<String> clusterName,
        Optional<String[]> ipAddresses
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.clusterName = (clusterName == null) ? Optional.<String>empty() : clusterName;
        this.ipAddresses = (ipAddresses == null) ? Optional.<String[]>empty() : ipAddresses;
    }

    /** 
     * The SnapMirror endpoint to modify.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The new name of the endpoint.
     **/
    public Optional<String> getClusterName() { return this.clusterName; }
   
    public void setClusterName(Optional<String> clusterName) { 
        this.clusterName = (clusterName == null) ? Optional.<String>empty() : clusterName;
    }
    /** 
     * The new list of IP addresses for a cluster of ONTAP storage systems that should communicate with this SolidFire cluster.
     **/
    public Optional<String[]> getIpAddresses() { return this.ipAddresses; }
   
    public void setIpAddresses(Optional<String[]> ipAddresses) { 
        this.ipAddresses = (ipAddresses == null) ? Optional.<String[]>empty() : ipAddresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifySnapMirrorEndpointUnmanagedRequest that = (ModifySnapMirrorEndpointUnmanagedRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(clusterName, that.clusterName) && 
            Objects.equals(ipAddresses, that.ipAddresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,clusterName,ipAddresses );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("clusterName", clusterName);
        map.put("ipAddresses", ipAddresses);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        if(null != clusterName && clusterName.isPresent()){
            sb.append(" clusterName : ").append(gson.toJson(clusterName)).append(",");
        }
        else{
            sb.append(" clusterName : ").append("null").append(",");
        }
        if(null != ipAddresses && ipAddresses.isPresent()){
            sb.append(" ipAddresses : ").append(gson.toJson(ipAddresses)).append(",");
        }
        else{
            sb.append(" ipAddresses : ").append("null").append(",");
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
        private Long snapMirrorEndpointID;
        private Optional<String> clusterName;
        private Optional<String[]> ipAddresses;

        private Builder() { }

        public ModifySnapMirrorEndpointUnmanagedRequest build() {
            return new ModifySnapMirrorEndpointUnmanagedRequest (
                         this.snapMirrorEndpointID,
                         this.clusterName,
                         this.ipAddresses);
        }

        private ModifySnapMirrorEndpointUnmanagedRequest.Builder buildFrom(final ModifySnapMirrorEndpointUnmanagedRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.clusterName = req.clusterName;
            this.ipAddresses = req.ipAddresses;

            return this;
        }

        public ModifySnapMirrorEndpointUnmanagedRequest.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public ModifySnapMirrorEndpointUnmanagedRequest.Builder optionalClusterName(final String clusterName) {
            this.clusterName = (clusterName == null) ? Optional.<String>empty() : Optional.of(clusterName);
            return this;
        }

        public ModifySnapMirrorEndpointUnmanagedRequest.Builder optionalIpAddresses(final String[] ipAddresses) {
            this.ipAddresses = (ipAddresses == null) ? Optional.<String[]>empty() : Optional.of(ipAddresses);
            return this;
        }

    }
}
