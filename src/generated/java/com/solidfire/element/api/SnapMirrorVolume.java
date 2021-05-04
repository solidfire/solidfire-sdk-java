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
 * SnapMirrorVolume  
 * The snapMirrorVolume object contains information about an ONTAP volume.
 **/

public class SnapMirrorVolume implements Serializable {

    public static final long serialVersionUID = -6833219318359084186L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("name") private String name;
    @SerializedName("type") private String type;
    @SerializedName("vserver") private String vserver;
    @SerializedName("aggrName") private String aggrName;
    @SerializedName("state") private String state;
    @SerializedName("size") private String size;
    @SerializedName("availSize") private String availSize;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorVolume(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorVolume(
        Long snapMirrorEndpointID,
        String name,
        String type,
        String vserver,
        String aggrName,
        String state,
        String size,
        String availSize
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.name = name;
        this.type = type;
        this.vserver = vserver;
        this.aggrName = aggrName;
        this.state = state;
        this.size = size;
        this.availSize = availSize;
    }

    /** 
     * The ID of the destination ONTAP system.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The name of the volume.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * The type of the volume.
     * Possible values:
     * rw: Read-write volume
     * ls: Loadsharing-volume
     * dp: Data protection volume
     **/
    public String getType() { return this.type; }
   
    public void setType(String type) { 
        this.type = type;
    }
    /** 
     * The name of the Vserver that owns this volume.
     **/
    public String getVserver() { return this.vserver; }
   
    public void setVserver(String vserver) { 
        this.vserver = vserver;
    }
    /** 
     * The containing aggregate name.
     **/
    public String getAggrName() { return this.aggrName; }
   
    public void setAggrName(String aggrName) { 
        this.aggrName = aggrName;
    }
    /** 
     * The state of volume.
     * Possible values:
     * online
     * restricted
     * offline
     * mixed
     **/
    public String getState() { return this.state; }
   
    public void setState(String state) { 
        this.state = state;
    }
    /** 
     * The total filesystem size (in bytes) of the volume.
     **/
    public String getSize() { return this.size; }
   
    public void setSize(String size) { 
        this.size = size;
    }
    /** 
     * The size (in bytes) of the available space in the volume.
     **/
    public String getAvailSize() { return this.availSize; }
   
    public void setAvailSize(String availSize) { 
        this.availSize = availSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorVolume that = (SnapMirrorVolume) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(name, that.name) && 
            Objects.equals(type, that.type) && 
            Objects.equals(vserver, that.vserver) && 
            Objects.equals(aggrName, that.aggrName) && 
            Objects.equals(state, that.state) && 
            Objects.equals(size, that.size) && 
            Objects.equals(availSize, that.availSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,name,type,vserver,aggrName,state,size,availSize );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("name", name);
        map.put("type", type);
        map.put("vserver", vserver);
        map.put("aggrName", aggrName);
        map.put("state", state);
        map.put("size", size);
        map.put("availSize", availSize);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" type : ").append(gson.toJson(type)).append(",");
        sb.append(" vserver : ").append(gson.toJson(vserver)).append(",");
        sb.append(" aggrName : ").append(gson.toJson(aggrName)).append(",");
        sb.append(" state : ").append(gson.toJson(state)).append(",");
        sb.append(" size : ").append(gson.toJson(size)).append(",");
        sb.append(" availSize : ").append(gson.toJson(availSize)).append(",");
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
        private String name;
        private String type;
        private String vserver;
        private String aggrName;
        private String state;
        private String size;
        private String availSize;

        private Builder() { }

        public SnapMirrorVolume build() {
            return new SnapMirrorVolume (
                         this.snapMirrorEndpointID,
                         this.name,
                         this.type,
                         this.vserver,
                         this.aggrName,
                         this.state,
                         this.size,
                         this.availSize);
        }

        private SnapMirrorVolume.Builder buildFrom(final SnapMirrorVolume req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.name = req.name;
            this.type = req.type;
            this.vserver = req.vserver;
            this.aggrName = req.aggrName;
            this.state = req.state;
            this.size = req.size;
            this.availSize = req.availSize;

            return this;
        }

        public SnapMirrorVolume.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public SnapMirrorVolume.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public SnapMirrorVolume.Builder type(final String type) {
            this.type = type;
            return this;
        }

        public SnapMirrorVolume.Builder vserver(final String vserver) {
            this.vserver = vserver;
            return this;
        }

        public SnapMirrorVolume.Builder aggrName(final String aggrName) {
            this.aggrName = aggrName;
            return this;
        }

        public SnapMirrorVolume.Builder state(final String state) {
            this.state = state;
            return this;
        }

        public SnapMirrorVolume.Builder size(final String size) {
            this.size = size;
            return this;
        }

        public SnapMirrorVolume.Builder availSize(final String availSize) {
            this.availSize = availSize;
            return this;
        }

    }
}
