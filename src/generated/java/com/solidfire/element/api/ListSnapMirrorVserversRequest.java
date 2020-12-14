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
 * ListSnapMirrorVserversRequest  
 * The SolidFire Element OS web UI uses the ListSnapMirrorVservers method to list all SnapMirror Vservers available on a remote ONTAP system.
 **/

public class ListSnapMirrorVserversRequest implements Serializable {

    public static final long serialVersionUID = -58677770072474775L;
    @SerializedName("snapMirrorEndpointID") private Optional<Long> snapMirrorEndpointID;
    @SerializedName("vserverType") private Optional<String> vserverType;
    @SerializedName("vserverName") private Optional<String> vserverName;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorVserversRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorVserversRequest(
        Optional<Long> snapMirrorEndpointID,
        Optional<String> vserverType,
        Optional<String> vserverName
    )
    {
        this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : snapMirrorEndpointID;
        this.vserverType = (vserverType == null) ? Optional.<String>empty() : vserverType;
        this.vserverName = (vserverName == null) ? Optional.<String>empty() : vserverName;
    }

    /** 
     * List only the Vservers associated with the specified endpoint ID.
     * If no endpoint ID is provided, the system lists
     * Vservers from all known SnapMirror endpoints.
     **/
    public Optional<Long> getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Optional<Long> snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : snapMirrorEndpointID;
    }
    /** 
     * List only Vservers of the specified type.
     * Possible values:
     * admin
     * data
     * node
     * system
     **/
    public Optional<String> getVserverType() { return this.vserverType; }
   
    public void setVserverType(Optional<String> vserverType) { 
        this.vserverType = (vserverType == null) ? Optional.<String>empty() : vserverType;
    }
    /** 
     * List only Vservers with the specified name.
     **/
    public Optional<String> getVserverName() { return this.vserverName; }
   
    public void setVserverName(Optional<String> vserverName) { 
        this.vserverName = (vserverName == null) ? Optional.<String>empty() : vserverName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorVserversRequest that = (ListSnapMirrorVserversRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(vserverType, that.vserverType) && 
            Objects.equals(vserverName, that.vserverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,vserverType,vserverName );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("vserverType", vserverType);
        map.put("vserverName", vserverName);
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
        if(null != vserverType && vserverType.isPresent()){
            sb.append(" vserverType : ").append(gson.toJson(vserverType)).append(",");
        }
        else{
            sb.append(" vserverType : ").append("null").append(",");
        }
        if(null != vserverName && vserverName.isPresent()){
            sb.append(" vserverName : ").append(gson.toJson(vserverName)).append(",");
        }
        else{
            sb.append(" vserverName : ").append("null").append(",");
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
        private Optional<String> vserverType;
        private Optional<String> vserverName;

        private Builder() { }

        public ListSnapMirrorVserversRequest build() {
            return new ListSnapMirrorVserversRequest (
                         this.snapMirrorEndpointID,
                         this.vserverType,
                         this.vserverName);
        }

        private ListSnapMirrorVserversRequest.Builder buildFrom(final ListSnapMirrorVserversRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.vserverType = req.vserverType;
            this.vserverName = req.vserverName;

            return this;
        }

        public ListSnapMirrorVserversRequest.Builder optionalSnapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : Optional.of(snapMirrorEndpointID);
            return this;
        }

        public ListSnapMirrorVserversRequest.Builder optionalVserverType(final String vserverType) {
            this.vserverType = (vserverType == null) ? Optional.<String>empty() : Optional.of(vserverType);
            return this;
        }

        public ListSnapMirrorVserversRequest.Builder optionalVserverName(final String vserverName) {
            this.vserverName = (vserverName == null) ? Optional.<String>empty() : Optional.of(vserverName);
            return this;
        }

    }
}
