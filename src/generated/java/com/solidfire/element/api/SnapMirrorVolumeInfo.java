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
 * SnapMirrorVolumeInfo  
 * The snapMirrorVolumeInfo object contains information about a volume location in a SnapMirror relationship, such as its name and type.
 **/

public class SnapMirrorVolumeInfo implements Serializable {

    public static final long serialVersionUID = 1293944744178099640L;
    @SerializedName("type") private String type;
    @SerializedName("volumeID") private Optional<Long> volumeID;
    @SerializedName("vserver") private Optional<String> vserver;
    @SerializedName("name") private String name;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorVolumeInfo(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorVolumeInfo(
        String type,
        Optional<Long> volumeID,
        Optional<String> vserver,
        String name
    )
    {
        this.type = type;
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
        this.vserver = (vserver == null) ? Optional.<String>empty() : vserver;
        this.name = name;
    }

    /** 
     * The type of volume.
     * Possible values:
     * solidfire: The volume resides on a SolidFire cluster.
     * ontap:     The volume resides on a remote ONTAP cluster.
     **/
    public String getType() { return this.type; }
   
    public void setType(String type) { 
        this.type = type;
    }
    /** 
     * The ID of the volume. Only valid if "type" is solidfire.
     **/
    public Optional<Long> getVolumeID() { return this.volumeID; }
   
    public void setVolumeID(Optional<Long> volumeID) { 
        this.volumeID = (volumeID == null) ? Optional.<Long>empty() : volumeID;
    }
    /** 
     * The name of the Vserver that owns this volume. Only valid if "type" is ONTAP.
     **/
    public Optional<String> getVserver() { return this.vserver; }
   
    public void setVserver(Optional<String> vserver) { 
        this.vserver = (vserver == null) ? Optional.<String>empty() : vserver;
    }
    /** 
     * The name of the volume.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorVolumeInfo that = (SnapMirrorVolumeInfo) o;

        return 
            Objects.equals(type, that.type) && 
            Objects.equals(volumeID, that.volumeID) && 
            Objects.equals(vserver, that.vserver) && 
            Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash( type,volumeID,vserver,name );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("type", type);
        map.put("volumeID", volumeID);
        map.put("vserver", vserver);
        map.put("name", name);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" type : ").append(gson.toJson(type)).append(",");
        if(null != volumeID && volumeID.isPresent()){
            sb.append(" volumeID : ").append(gson.toJson(volumeID)).append(",");
        }
        else{
            sb.append(" volumeID : ").append("null").append(",");
        }
        if(null != vserver && vserver.isPresent()){
            sb.append(" vserver : ").append(gson.toJson(vserver)).append(",");
        }
        else{
            sb.append(" vserver : ").append("null").append(",");
        }
        sb.append(" name : ").append(gson.toJson(name)).append(",");
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
        private String type;
        private Optional<Long> volumeID;
        private Optional<String> vserver;
        private String name;

        private Builder() { }

        public SnapMirrorVolumeInfo build() {
            return new SnapMirrorVolumeInfo (
                         this.type,
                         this.volumeID,
                         this.vserver,
                         this.name);
        }

        private SnapMirrorVolumeInfo.Builder buildFrom(final SnapMirrorVolumeInfo req) {
            this.type = req.type;
            this.volumeID = req.volumeID;
            this.vserver = req.vserver;
            this.name = req.name;

            return this;
        }

        public SnapMirrorVolumeInfo.Builder type(final String type) {
            this.type = type;
            return this;
        }

        public SnapMirrorVolumeInfo.Builder optionalVolumeID(final Long volumeID) {
            this.volumeID = (volumeID == null) ? Optional.<Long>empty() : Optional.of(volumeID);
            return this;
        }

        public SnapMirrorVolumeInfo.Builder optionalVserver(final String vserver) {
            this.vserver = (vserver == null) ? Optional.<String>empty() : Optional.of(vserver);
            return this;
        }

        public SnapMirrorVolumeInfo.Builder name(final String name) {
            this.name = name;
            return this;
        }

    }
}
