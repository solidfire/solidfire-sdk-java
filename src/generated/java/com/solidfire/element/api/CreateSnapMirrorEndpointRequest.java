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
 * CreateSnapMirrorEndpointRequest  
 * The SolidFire Element OS web UI uses the CreateSnapMirrorEndpoint method to create a relationship with a remote SnapMirror endpoint.
 **/

public class CreateSnapMirrorEndpointRequest implements Serializable {

    public static final long serialVersionUID = -7382461869800017325L;
    @SerializedName("managementIP") private String managementIP;
    @SerializedName("username") private String username;
    @SerializedName("password") private String password;

    
    // parameterized constructor
    @Since("7.0")
    public CreateSnapMirrorEndpointRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public CreateSnapMirrorEndpointRequest(
        String managementIP,
        String username,
        String password
    )
    {
        this.managementIP = managementIP;
        this.username = username;
        this.password = password;
    }

    /** 
     * The management IP address of the remote SnapMirror endpoint.
     **/
    public String getManagementIP() { return this.managementIP; }
   
    public void setManagementIP(String managementIP) { 
        this.managementIP = managementIP;
    }
    /** 
     * The management username for the ONTAP system.
     **/
    public String getUsername() { return this.username; }
   
    public void setUsername(String username) { 
        this.username = username;
    }
    /** 
     * The management password for the ONTAP system.
     **/
    public String getPassword() { return this.password; }
   
    public void setPassword(String password) { 
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateSnapMirrorEndpointRequest that = (CreateSnapMirrorEndpointRequest) o;

        return 
            Objects.equals(managementIP, that.managementIP) && 
            Objects.equals(username, that.username) && 
            Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash( managementIP,username,password );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
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

        sb.append(" managementIP : ").append(gson.toJson(managementIP)).append(",");
        sb.append(" username : ").append(gson.toJson(username)).append(",");
        sb.append(" password : ").append(gson.toJson(password)).append(",");
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
        private String managementIP;
        private String username;
        private String password;

        private Builder() { }

        public CreateSnapMirrorEndpointRequest build() {
            return new CreateSnapMirrorEndpointRequest (
                         this.managementIP,
                         this.username,
                         this.password);
        }

        private CreateSnapMirrorEndpointRequest.Builder buildFrom(final CreateSnapMirrorEndpointRequest req) {
            this.managementIP = req.managementIP;
            this.username = req.username;
            this.password = req.password;

            return this;
        }

        public CreateSnapMirrorEndpointRequest.Builder managementIP(final String managementIP) {
            this.managementIP = managementIP;
            return this;
        }

        public CreateSnapMirrorEndpointRequest.Builder username(final String username) {
            this.username = username;
            return this;
        }

        public CreateSnapMirrorEndpointRequest.Builder password(final String password) {
            this.password = password;
            return this;
        }

    }
}
