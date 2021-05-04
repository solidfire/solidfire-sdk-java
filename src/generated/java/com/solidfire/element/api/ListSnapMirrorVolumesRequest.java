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
 * ListSnapMirrorVolumesRequest  
 * The SolidFire Element OS web UI uses the ListSnapMirrorVolumes method to list all SnapMirror volumes available on a remote ONTAP system.
 **/

public class ListSnapMirrorVolumesRequest implements Serializable {

    public static final long serialVersionUID = -7113657745717721575L;
    @SerializedName("snapMirrorEndpointID") private Optional<Long> snapMirrorEndpointID;
    @SerializedName("vserver") private Optional<String> vserver;
    @SerializedName("name") private Optional<String> name;
    @SerializedName("type") private Optional<String> type;

    
    // parameterized constructor
    @Since("7.0")
    public ListSnapMirrorVolumesRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListSnapMirrorVolumesRequest(
        Optional<Long> snapMirrorEndpointID,
        Optional<String> vserver,
        Optional<String> name,
        Optional<String> type
    )
    {
        this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : snapMirrorEndpointID;
        this.vserver = (vserver == null) ? Optional.<String>empty() : vserver;
        this.name = (name == null) ? Optional.<String>empty() : name;
        this.type = (type == null) ? Optional.<String>empty() : type;
    }

    /** 
     * List only the volumes associated
     * with the specified endpoint ID.
     * If no endpoint ID is provided, the system
     * lists volumes from all known SnapMirror endpoints.
     **/
    public Optional<Long> getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Optional<Long> snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : snapMirrorEndpointID;
    }
    /** 
     * List volumes hosted on the specified Vserver.
     * The Vserver must be of type "data".
     **/
    public Optional<String> getVserver() { return this.vserver; }
   
    public void setVserver(Optional<String> vserver) { 
        this.vserver = (vserver == null) ? Optional.<String>empty() : vserver;
    }
    /** 
     * List only ONTAP volumes with the specified name.
     **/
    public Optional<String> getName() { return this.name; }
   
    public void setName(Optional<String> name) { 
        this.name = (name == null) ? Optional.<String>empty() : name;
    }
    /** 
     * List only ONTAP volumes of the specified type.
     * Possible values:
     * rw: Read-write volumes
     * ls: Load-sharing volumes
     * dp: Data protection volumes
     **/
    public Optional<String> getType() { return this.type; }
   
    public void setType(Optional<String> type) { 
        this.type = (type == null) ? Optional.<String>empty() : type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListSnapMirrorVolumesRequest that = (ListSnapMirrorVolumesRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(vserver, that.vserver) && 
            Objects.equals(name, that.name) && 
            Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,vserver,name,type );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("vserver", vserver);
        map.put("name", name);
        map.put("type", type);
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
        if(null != vserver && vserver.isPresent()){
            sb.append(" vserver : ").append(gson.toJson(vserver)).append(",");
        }
        else{
            sb.append(" vserver : ").append("null").append(",");
        }
        if(null != name && name.isPresent()){
            sb.append(" name : ").append(gson.toJson(name)).append(",");
        }
        else{
            sb.append(" name : ").append("null").append(",");
        }
        if(null != type && type.isPresent()){
            sb.append(" type : ").append(gson.toJson(type)).append(",");
        }
        else{
            sb.append(" type : ").append("null").append(",");
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
        private Optional<String> vserver;
        private Optional<String> name;
        private Optional<String> type;

        private Builder() { }

        public ListSnapMirrorVolumesRequest build() {
            return new ListSnapMirrorVolumesRequest (
                         this.snapMirrorEndpointID,
                         this.vserver,
                         this.name,
                         this.type);
        }

        private ListSnapMirrorVolumesRequest.Builder buildFrom(final ListSnapMirrorVolumesRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.vserver = req.vserver;
            this.name = req.name;
            this.type = req.type;

            return this;
        }

        public ListSnapMirrorVolumesRequest.Builder optionalSnapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = (snapMirrorEndpointID == null) ? Optional.<Long>empty() : Optional.of(snapMirrorEndpointID);
            return this;
        }

        public ListSnapMirrorVolumesRequest.Builder optionalVserver(final String vserver) {
            this.vserver = (vserver == null) ? Optional.<String>empty() : Optional.of(vserver);
            return this;
        }

        public ListSnapMirrorVolumesRequest.Builder optionalName(final String name) {
            this.name = (name == null) ? Optional.<String>empty() : Optional.of(name);
            return this;
        }

        public ListSnapMirrorVolumesRequest.Builder optionalType(final String type) {
            this.type = (type == null) ? Optional.<String>empty() : Optional.of(type);
            return this;
        }

    }
}
