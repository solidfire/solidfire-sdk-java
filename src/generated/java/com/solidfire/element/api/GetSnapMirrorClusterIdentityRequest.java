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
 * GetSnapMirrorClusterIdentityRequest  
 * The SolidFire Element OS web UI uses GetSnapMirrorClusterIdentity to get identity information about the ONTAP cluster.
 **/

public class GetSnapMirrorClusterIdentityRequest implements Serializable {

    public static final long serialVersionUID = -2095526954048740853L;
    @SerializedName("snapMirrorEndpointID") private Optional<Long> snapMirrorEndpointID;

    
    // parameterized constructor
    @Since("7.0")
    public GetSnapMirrorClusterIdentityRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public GetSnapMirrorClusterIdentityRequest(
        Optional<Long> snapMirrorEndpointID
    )
    {
        this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : snapMirrorEndpointID;
    }

    /** 
     * If provided, the system lists the cluster identity of the endpoint with the specified snapMirrorEndpointID.
     * If not provided, the system lists the cluster identity of all known SnapMirror endpoints.
     **/
    public Optional<Long> getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Optional<Long> snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : snapMirrorEndpointID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSnapMirrorClusterIdentityRequest that = (GetSnapMirrorClusterIdentityRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
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

        private Builder() { }

        public GetSnapMirrorClusterIdentityRequest build() {
            return new GetSnapMirrorClusterIdentityRequest (
                         this.snapMirrorEndpointID);
        }

        private GetSnapMirrorClusterIdentityRequest.Builder buildFrom(final GetSnapMirrorClusterIdentityRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;

            return this;
        }

        public GetSnapMirrorClusterIdentityRequest.Builder optionalSnapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : Optional.of(snapMirrorEndpointID);
            return this;
        }

    }
}
