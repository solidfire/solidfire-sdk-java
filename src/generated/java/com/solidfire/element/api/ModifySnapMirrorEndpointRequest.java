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
 * ModifySnapMirrorEndpointRequest  
 * The SolidFire Element OS web UI uses the ModifySnapMirrorEndpoint method to change the name and management attributes for a SnapMirror endpoint.
 **/

public class ModifySnapMirrorEndpointRequest implements Serializable {

    public static final long serialVersionUID = -6986565176396185447L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("managementIP") private Optional<String> managementIP;
    @SerializedName("username") private Optional<String> username;
    @SerializedName("password") private Optional<String> password;

    
    // parameterized constructor
    @Since("7.0")
    public ModifySnapMirrorEndpointRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ModifySnapMirrorEndpointRequest(
        Long snapMirrorEndpointID,
        Optional<String> managementIP,
        Optional<String> username,
        Optional<String> password
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.managementIP = (managementIP == null) ? Optional.<String>empty() : managementIP;
        this.username = (username == null) ? Optional.<String>empty() : username;
        this.password = (password == null) ? Optional.<String>empty() : password;
    }

    /** 
     * The SnapMirror endpoint to modify.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The new management IP Address for the ONTAP system.
     **/
    public Optional<String> getManagementIP() { return this.managementIP; }
   
    public void setManagementIP(Optional<String> managementIP) { 
        this.managementIP = (managementIP == null) ? Optional.<String>empty() : managementIP;
    }
    /** 
     * The new management username for the ONTAP system.
     **/
    public Optional<String> getUsername() { return this.username; }
   
    public void setUsername(Optional<String> username) { 
        this.username = (username == null) ? Optional.<String>empty() : username;
    }
    /** 
     * The new management password for the ONTAP system.
     **/
    public Optional<String> getPassword() { return this.password; }
   
    public void setPassword(Optional<String> password) { 
        this.password = (password == null) ? Optional.<String>empty() : password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifySnapMirrorEndpointRequest that = (ModifySnapMirrorEndpointRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(managementIP, that.managementIP) && 
            Objects.equals(username, that.username) && 
            Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,managementIP,username,password );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("managementIP", managementIP);
        map.put("username", username);
        map.put("password", password);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        if(null != managementIP && managementIP.isPresent()){
            sb.append(" managementIP : ").append(gson.toJson(managementIP)).append(",");
        }
        else{
            sb.append(" managementIP : ").append("null").append(",");
        }
        if(null != username && username.isPresent()){
            sb.append(" username : ").append(gson.toJson(username)).append(",");
        }
        else{
            sb.append(" username : ").append("null").append(",");
        }
        if(null != password && password.isPresent()){
            sb.append(" password : ").append(gson.toJson(password)).append(",");
        }
        else{
            sb.append(" password : ").append("null").append(",");
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
        private Optional<String> managementIP;
        private Optional<String> username;
        private Optional<String> password;

        private Builder() { }

        public ModifySnapMirrorEndpointRequest build() {
            return new ModifySnapMirrorEndpointRequest (
                         this.snapMirrorEndpointID,
                         this.managementIP,
                         this.username,
                         this.password);
        }

        private ModifySnapMirrorEndpointRequest.Builder buildFrom(final ModifySnapMirrorEndpointRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.managementIP = req.managementIP;
            this.username = req.username;
            this.password = req.password;

            return this;
        }

        public ModifySnapMirrorEndpointRequest.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public ModifySnapMirrorEndpointRequest.Builder optionalManagementIP(final String managementIP) {
            this.managementIP = (managementIP == null) ? Optional.<String>empty() : Optional.of(managementIP);
            return this;
        }

        public ModifySnapMirrorEndpointRequest.Builder optionalUsername(final String username) {
            this.username = (username == null) ? Optional.<String>empty() : Optional.of(username);
            return this;
        }

        public ModifySnapMirrorEndpointRequest.Builder optionalPassword(final String password) {
            this.password = (password == null) ? Optional.<String>empty() : Optional.of(password);
            return this;
        }

    }
}
