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
 * CreateSnapMirrorVolumeRequest  
 * The SolidFire Element OS web UI uses the CreateSnapMirrorVolume method to create a volume on the remote ONTAP system.
 **/

public class CreateSnapMirrorVolumeRequest implements Serializable {

    public static final long serialVersionUID = 8239871756309998429L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("vserver") private String vserver;
    @SerializedName("name") private String name;
    @SerializedName("type") private Optional<String> type;
    @SerializedName("aggregate") private String aggregate;
    @SerializedName("size") private Long size;

    
    // parameterized constructor
    @Since("7.0")
    public CreateSnapMirrorVolumeRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public CreateSnapMirrorVolumeRequest(
        Long snapMirrorEndpointID,
        String vserver,
        String name,
        Optional<String> type,
        String aggregate,
        Long size
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.vserver = vserver;
        this.name = name;
        this.type = (type == null) ? Optional.<String>empty() : type;
        this.aggregate = aggregate;
        this.size = size;
    }

    /** 
     * The endpoint ID of the remote ONTAP storage system communicating with the SolidFire cluster.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The name of the Vserver.
     **/
    public String getVserver() { return this.vserver; }
   
    public void setVserver(String vserver) { 
        this.vserver = vserver;
    }
    /** 
     * The destination ONTAP volume name.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * The volume type.
     * Possible values:
     * rw: Read-write volume
     * ls: Load-sharing volume
     * dp: Data protection volume
     * If no type is provided the default type is dp.
     **/
    public Optional<String> getType() { return this.type; }
   
    public void setType(Optional<String> type) { 
        this.type = (type == null) ? Optional.<String>empty() : type;
    }
    /** 
     * The containing ONTAP aggregate in which to create the volume.
     * You can use ListSnapMirrorAggregates to get
     * information about available ONTAP aggregates.
     **/
    public String getAggregate() { return this.aggregate; }
   
    public void setAggregate(String aggregate) { 
        this.aggregate = aggregate;
    }
    /** 
     * The size of the volume in bytes.
     **/
    public Long getSize() { return this.size; }
   
    public void setSize(Long size) { 
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateSnapMirrorVolumeRequest that = (CreateSnapMirrorVolumeRequest) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(vserver, that.vserver) && 
            Objects.equals(name, that.name) && 
            Objects.equals(type, that.type) && 
            Objects.equals(aggregate, that.aggregate) && 
            Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,vserver,name,type,aggregate,size );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("vserver", vserver);
        map.put("name", name);
        map.put("type", type);
        map.put("aggregate", aggregate);
        map.put("size", size);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" vserver : ").append(gson.toJson(vserver)).append(",");
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        if(null != type && type.isPresent()){
            sb.append(" type : ").append(gson.toJson(type)).append(",");
        }
        else{
            sb.append(" type : ").append("null").append(",");
        }
        sb.append(" aggregate : ").append(gson.toJson(aggregate)).append(",");
        sb.append(" size : ").append(gson.toJson(size)).append(",");
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
        private String vserver;
        private String name;
        private Optional<String> type;
        private String aggregate;
        private Long size;

        private Builder() { }

        public CreateSnapMirrorVolumeRequest build() {
            return new CreateSnapMirrorVolumeRequest (
                         this.snapMirrorEndpointID,
                         this.vserver,
                         this.name,
                         this.type,
                         this.aggregate,
                         this.size);
        }

        private CreateSnapMirrorVolumeRequest.Builder buildFrom(final CreateSnapMirrorVolumeRequest req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.vserver = req.vserver;
            this.name = req.name;
            this.type = req.type;
            this.aggregate = req.aggregate;
            this.size = req.size;

            return this;
        }

        public CreateSnapMirrorVolumeRequest.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public CreateSnapMirrorVolumeRequest.Builder vserver(final String vserver) {
            this.vserver = vserver;
            return this;
        }

        public CreateSnapMirrorVolumeRequest.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public CreateSnapMirrorVolumeRequest.Builder optionalType(final String type) {
            this.type = (type == null) ? Optional.<String>empty() : Optional.of(type);
            return this;
        }

        public CreateSnapMirrorVolumeRequest.Builder aggregate(final String aggregate) {
            this.aggregate = aggregate;
            return this;
        }

        public CreateSnapMirrorVolumeRequest.Builder size(final Long size) {
            this.size = size;
            return this;
        }

    }
}
