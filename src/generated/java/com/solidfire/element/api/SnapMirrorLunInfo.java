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
 * SnapMirrorLunInfo  
 * The snapMirrorLunInfo object contains information about the ONTAP LUN object.
 **/

public class SnapMirrorLunInfo implements Serializable {

    public static final long serialVersionUID = -6516070115106119471L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("creationTimestamp") private String creationTimestamp;
    @SerializedName("lunName") private String lunName;
    @SerializedName("path") private String path;
    @SerializedName("size") private Long size;
    @SerializedName("sizeUsed") private Long sizeUsed;
    @SerializedName("state") private String state;
    @SerializedName("volume") private String volume;
    @SerializedName("vserver") private String vserver;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorLunInfo(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorLunInfo(
        Long snapMirrorEndpointID,
        String creationTimestamp,
        String lunName,
        String path,
        Long size,
        Long sizeUsed,
        String state,
        String volume,
        String vserver
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.creationTimestamp = creationTimestamp;
        this.lunName = lunName;
        this.path = path;
        this.size = size;
        this.sizeUsed = sizeUsed;
        this.state = state;
        this.volume = volume;
        this.vserver = vserver;
    }

    /** 
     * The ID of the destination ONTAP system.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The creation time of the LUN.
     **/
    public String getCreationTimestamp() { return this.creationTimestamp; }
   
    public void setCreationTimestamp(String creationTimestamp) { 
        this.creationTimestamp = creationTimestamp;
    }
    /** 
     * The name of the LUN.
     **/
    public String getLunName() { return this.lunName; }
   
    public void setLunName(String lunName) { 
        this.lunName = lunName;
    }
    /** 
     * The path of the LUN.
     **/
    public String getPath() { return this.path; }
   
    public void setPath(String path) { 
        this.path = path;
    }
    /** 
     * The size of the LUN in bytes.
     **/
    public Long getSize() { return this.size; }
   
    public void setSize(Long size) { 
        this.size = size;
    }
    /** 
     * The number of bytes used by the LUN.
     **/
    public Long getSizeUsed() { return this.sizeUsed; }
   
    public void setSizeUsed(Long sizeUsed) { 
        this.sizeUsed = sizeUsed;
    }
    /** 
     * The current access state of the LUN.
     * Possible values:
     * online
     * offline
     * foreign_lun_error
     * nvfail
     * space_error
     **/
    public String getState() { return this.state; }
   
    public void setState(String state) { 
        this.state = state;
    }
    /** 
     * The name of the volume that contains the LUN.
     **/
    public String getVolume() { return this.volume; }
   
    public void setVolume(String volume) { 
        this.volume = volume;
    }
    /** 
     * The Vserver that contains the LUN.
     **/
    public String getVserver() { return this.vserver; }
   
    public void setVserver(String vserver) { 
        this.vserver = vserver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorLunInfo that = (SnapMirrorLunInfo) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(creationTimestamp, that.creationTimestamp) && 
            Objects.equals(lunName, that.lunName) && 
            Objects.equals(path, that.path) && 
            Objects.equals(size, that.size) && 
            Objects.equals(sizeUsed, that.sizeUsed) && 
            Objects.equals(state, that.state) && 
            Objects.equals(volume, that.volume) && 
            Objects.equals(vserver, that.vserver);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,creationTimestamp,lunName,path,size,sizeUsed,state,volume,vserver );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("creationTimestamp", creationTimestamp);
        map.put("lunName", lunName);
        map.put("path", path);
        map.put("size", size);
        map.put("sizeUsed", sizeUsed);
        map.put("state", state);
        map.put("volume", volume);
        map.put("vserver", vserver);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" creationTimestamp : ").append(gson.toJson(creationTimestamp)).append(",");
        sb.append(" lunName : ").append(gson.toJson(lunName)).append(",");
        sb.append(" path : ").append(gson.toJson(path)).append(",");
        sb.append(" size : ").append(gson.toJson(size)).append(",");
        sb.append(" sizeUsed : ").append(gson.toJson(sizeUsed)).append(",");
        sb.append(" state : ").append(gson.toJson(state)).append(",");
        sb.append(" volume : ").append(gson.toJson(volume)).append(",");
        sb.append(" vserver : ").append(gson.toJson(vserver)).append(",");
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
        private String creationTimestamp;
        private String lunName;
        private String path;
        private Long size;
        private Long sizeUsed;
        private String state;
        private String volume;
        private String vserver;

        private Builder() { }

        public SnapMirrorLunInfo build() {
            return new SnapMirrorLunInfo (
                         this.snapMirrorEndpointID,
                         this.creationTimestamp,
                         this.lunName,
                         this.path,
                         this.size,
                         this.sizeUsed,
                         this.state,
                         this.volume,
                         this.vserver);
        }

        private SnapMirrorLunInfo.Builder buildFrom(final SnapMirrorLunInfo req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.creationTimestamp = req.creationTimestamp;
            this.lunName = req.lunName;
            this.path = req.path;
            this.size = req.size;
            this.sizeUsed = req.sizeUsed;
            this.state = req.state;
            this.volume = req.volume;
            this.vserver = req.vserver;

            return this;
        }

        public SnapMirrorLunInfo.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public SnapMirrorLunInfo.Builder creationTimestamp(final String creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public SnapMirrorLunInfo.Builder lunName(final String lunName) {
            this.lunName = lunName;
            return this;
        }

        public SnapMirrorLunInfo.Builder path(final String path) {
            this.path = path;
            return this;
        }

        public SnapMirrorLunInfo.Builder size(final Long size) {
            this.size = size;
            return this;
        }

        public SnapMirrorLunInfo.Builder sizeUsed(final Long sizeUsed) {
            this.sizeUsed = sizeUsed;
            return this;
        }

        public SnapMirrorLunInfo.Builder state(final String state) {
            this.state = state;
            return this;
        }

        public SnapMirrorLunInfo.Builder volume(final String volume) {
            this.volume = volume;
            return this;
        }

        public SnapMirrorLunInfo.Builder vserver(final String vserver) {
            this.vserver = vserver;
            return this;
        }

    }
}
