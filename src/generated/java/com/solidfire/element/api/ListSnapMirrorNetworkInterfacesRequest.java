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
 * ListSnapMirrorNetworkInterfacesRequest  
 * The SolidFire Element OS web UI uses the ListSnapMirrorNetworkInterfaces method to list all available SnapMirror interfaces on a remote ONTAP system
 **/

public class ListSnapMirrorNetworkInterfacesRequest implements Serializable {

    public static final long serialVersionUID = -1026275567536144845L;
    @SerializedName("snapMirrorEndpointID") private Optional<Long> snapMirrorEndpointID;
    @SerializedName("interfaceRole") private Optional<String> interfaceRole;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorNetworkInterfacesRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorNetworkInterfacesRequest(
        Optional<Long> snapMirrorEndpointID,
        Optional<String> interfaceRole
    )
    {
        this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : snapMirrorEndpointID;
        this.interfaceRole = (interfaceRole == null) ? Optional.<String>empty() : interfaceRole;
    }

    /** 
     * Return only the network interfaces associated with the specified endpoint ID.
     * If no endpoint ID is provided, the system lists interfaces
     * from all known SnapMirror endpoints.
     **/
    public Optional<Long> getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Optional<Long> snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : snapMirrorEndpointID;
    }
    /** 
     * List only the network interface serving the specified role.
     **/
    public Optional<String> getInterfaceRole() { return this.interfaceRole; }
   
    public void setInterfaceRole(Optional<String> interfaceRole) { 
        this.interfaceRole = (interfaceRole == null) ? Optional.<String>empty() : interfaceRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorNetworkInterfacesRequest that = (ListSnapMirrorNetworkInterfacesRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(interfaceRole, that.interfaceRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,interfaceRole );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("interfaceRole", interfaceRole);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != snapMirrorEndpointID && snapMirrorEndpointID.isPresent()){
            sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        }
        else{
            sb.append(" snapMirrorEndpointID : ").append("null").append(",");
        }
        if(null != interfaceRole && interfaceRole.isPresent()){
            sb.append(" interfaceRole : ").append(gson.toJson(interfaceRole)).append(",");
        }
        else{
            sb.append(" interfaceRole : ").append("null").append(",");
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
        private Optional<Long> snapMirrorEndpointID;
        private Optional<String> interfaceRole;

        private Builder() { }

        public ListSnapMirrorNetworkInterfacesRequest build() {
            return new ListSnapMirrorNetworkInterfacesRequest (
                         this.snapMirrorEndpointID,
                         this.interfaceRole);
        }

        private ListSnapMirrorNetworkInterfacesRequest.Builder buildFrom(final ListSnapMirrorNetworkInterfacesRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.interfaceRole = req.interfaceRole;

            return this;
        }

        public ListSnapMirrorNetworkInterfacesRequest.Builder optionalSnapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : Optional.of(snapMirrorEndpointID);
            return this;
        }

        public ListSnapMirrorNetworkInterfacesRequest.Builder optionalInterfaceRole(final String interfaceRole) {
            this.interfaceRole = (interfaceRole == null) ? Optional.<String>empty() : Optional.of(interfaceRole);
            return this;
        }

    }
}
