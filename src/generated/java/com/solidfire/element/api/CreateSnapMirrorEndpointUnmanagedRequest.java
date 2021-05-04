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
 * CreateSnapMirrorEndpointUnmanagedRequest  
 * The SolidFire system uses the CreateSnapMirrorEndpointUnmanaged method to enable remote, unmanaged SnapMirror endpoints to communicate with a SolidFire cluster.
 * Unmanaged endpoints cannot be administered using the SolidFire SnapMirror APIs. They must be managed with ONTAP management software or APIs.
 **/

public class CreateSnapMirrorEndpointUnmanagedRequest implements Serializable {

    public static final long serialVersionUID = -754380917108895959L;
    @SerializedName("clusterName") private String clusterName;
    @SerializedName("ipAddresses") private String[] ipAddresses;

    
    // parameterized constructor
    @Since("7.0")
    public CreateSnapMirrorEndpointUnmanagedRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public CreateSnapMirrorEndpointUnmanagedRequest(
        String clusterName,
        String[] ipAddresses
    )
    {
        this.clusterName = clusterName;
        this.ipAddresses = ipAddresses;
    }

    /** 
     * The name of the endpoint.
     **/
    public String getClusterName() { return this.clusterName; }
   
    public void setClusterName(String clusterName) { 
        this.clusterName = clusterName;
    }
    /** 
     * The list of IP addresses for a cluster of ONTAP storage systems that should communicate with this SolidFire cluster.
     **/
    public String[] getIpAddresses() { return this.ipAddresses; }
   
    public void setIpAddresses(String[] ipAddresses) { 
        this.ipAddresses = ipAddresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateSnapMirrorEndpointUnmanagedRequest that = (CreateSnapMirrorEndpointUnmanagedRequest) o;

        return 
            Objects.equals(clusterName, that.clusterName) && 
            Arrays.equals(ipAddresses, that.ipAddresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash( clusterName,(Object[])ipAddresses );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("clusterName", clusterName);
        map.put("ipAddresses", ipAddresses);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" clusterName : ").append(gson.toJson(clusterName)).append(",");
        sb.append(" ipAddresses : ").append(gson.toJson(Arrays.toString(ipAddresses))).append(",");
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
        private String clusterName;
        private String[] ipAddresses;

        private Builder() { }

        public CreateSnapMirrorEndpointUnmanagedRequest build() {
            return new CreateSnapMirrorEndpointUnmanagedRequest (
                         this.clusterName,
                         this.ipAddresses);
        }

        private CreateSnapMirrorEndpointUnmanagedRequest.Builder buildFrom(final CreateSnapMirrorEndpointUnmanagedRequest req) {
            this.clusterName = req.clusterName;
            this.ipAddresses = req.ipAddresses;

            return this;
        }

        public CreateSnapMirrorEndpointUnmanagedRequest.Builder clusterName(final String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public CreateSnapMirrorEndpointUnmanagedRequest.Builder ipAddresses(final String[] ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

    }
}
