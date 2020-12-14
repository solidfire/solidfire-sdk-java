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
 * SnapMirrorVserver  
 * The snapMirrorVserver object contains information about the Storage Virtual Machines (or Vservers) at the destination ONTAP cluster.
 **/

public class SnapMirrorVserver implements Serializable {

    public static final long serialVersionUID = -8239798336437013643L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("vserverName") private String vserverName;
    @SerializedName("vserverType") private String vserverType;
    @SerializedName("vserverSubtype") private String vserverSubtype;
    @SerializedName("rootVolume") private String rootVolume;
    @SerializedName("rootVolumeAggregate") private String rootVolumeAggregate;
    @SerializedName("vserverAggregateInfo") private SnapMirrorVserverAggregateInfo[] vserverAggregateInfo;
    @SerializedName("adminState") private String adminState;
    @SerializedName("operationalState") private String operationalState;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorVserver(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorVserver(
        Long snapMirrorEndpointID,
        String vserverName,
        String vserverType,
        String vserverSubtype,
        String rootVolume,
        String rootVolumeAggregate,
        SnapMirrorVserverAggregateInfo[] vserverAggregateInfo,
        String adminState,
        String operationalState
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.vserverName = vserverName;
        this.vserverType = vserverType;
        this.vserverSubtype = vserverSubtype;
        this.rootVolume = rootVolume;
        this.rootVolumeAggregate = rootVolumeAggregate;
        this.vserverAggregateInfo = vserverAggregateInfo;
        this.adminState = adminState;
        this.operationalState = operationalState;
    }

    /** 
     * The ID of the destination ONTAP system.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The name of the Vserver.
     **/
    public String getVserverName() { return this.vserverName; }
   
    public void setVserverName(String vserverName) { 
        this.vserverName = vserverName;
    }
    /** 
     * The type of the Vserver.
     * Possible values:
     * data
     * admin
     * system
     * node
     **/
    public String getVserverType() { return this.vserverType; }
   
    public void setVserverType(String vserverType) { 
        this.vserverType = vserverType;
    }
    /** 
     * The subtype of the Vserver.
     * Possible values:
     * default
     * dp_destination
     * data
     * sync_source
     * sync_destination
     **/
    public String getVserverSubtype() { return this.vserverSubtype; }
   
    public void setVserverSubtype(String vserverSubtype) { 
        this.vserverSubtype = vserverSubtype;
    }
    /** 
     * The root volume of the Vserver.
     **/
    public String getRootVolume() { return this.rootVolume; }
   
    public void setRootVolume(String rootVolume) { 
        this.rootVolume = rootVolume;
    }
    /** 
     * The aggregate on which the root volume will be created.
     **/
    public String getRootVolumeAggregate() { return this.rootVolumeAggregate; }
   
    public void setRootVolumeAggregate(String rootVolumeAggregate) { 
        this.rootVolumeAggregate = rootVolumeAggregate;
    }
    /** 
     * An array of SnapMirrorVserverAggregateInfo objects.
     **/
    public SnapMirrorVserverAggregateInfo[] getVserverAggregateInfo() { return this.vserverAggregateInfo; }
   
    public void setVserverAggregateInfo(SnapMirrorVserverAggregateInfo[] vserverAggregateInfo) { 
        this.vserverAggregateInfo = vserverAggregateInfo;
    }
    /** 
     * The detailed administrative state of the Vserver.
     * Possible values:
     * running
     * stopped
     * starting
     * stopping
     * initialized
     * deleting
     **/
    public String getAdminState() { return this.adminState; }
   
    public void setAdminState(String adminState) { 
        this.adminState = adminState;
    }
    /** 
     * The basic operational state of the Vserver.
     * Possible values:
     * running
     * stopped
     **/
    public String getOperationalState() { return this.operationalState; }
   
    public void setOperationalState(String operationalState) { 
        this.operationalState = operationalState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorVserver that = (SnapMirrorVserver) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(vserverName, that.vserverName) && 
            Objects.equals(vserverType, that.vserverType) && 
            Objects.equals(vserverSubtype, that.vserverSubtype) && 
            Objects.equals(rootVolume, that.rootVolume) && 
            Objects.equals(rootVolumeAggregate, that.rootVolumeAggregate) && 
            Arrays.equals(vserverAggregateInfo, that.vserverAggregateInfo) && 
            Objects.equals(adminState, that.adminState) && 
            Objects.equals(operationalState, that.operationalState);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,vserverName,vserverType,vserverSubtype,rootVolume,rootVolumeAggregate,(Object[])vserverAggregateInfo,adminState,operationalState );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("vserverName", vserverName);
        map.put("vserverType", vserverType);
        map.put("vserverSubtype", vserverSubtype);
        map.put("rootVolume", rootVolume);
        map.put("rootVolumeAggregate", rootVolumeAggregate);
        map.put("vserverAggregateInfo", vserverAggregateInfo);
        map.put("adminState", adminState);
        map.put("operationalState", operationalState);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" vserverName : ").append(gson.toJson(vserverName)).append(",");
        sb.append(" vserverType : ").append(gson.toJson(vserverType)).append(",");
        sb.append(" vserverSubtype : ").append(gson.toJson(vserverSubtype)).append(",");
        sb.append(" rootVolume : ").append(gson.toJson(rootVolume)).append(",");
        sb.append(" rootVolumeAggregate : ").append(gson.toJson(rootVolumeAggregate)).append(",");
        sb.append(" vserverAggregateInfo : ").append(gson.toJson(Arrays.toString(vserverAggregateInfo))).append(",");
        sb.append(" adminState : ").append(gson.toJson(adminState)).append(",");
        sb.append(" operationalState : ").append(gson.toJson(operationalState)).append(",");
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
        private String vserverName;
        private String vserverType;
        private String vserverSubtype;
        private String rootVolume;
        private String rootVolumeAggregate;
        private SnapMirrorVserverAggregateInfo[] vserverAggregateInfo;
        private String adminState;
        private String operationalState;

        private Builder() { }

        public SnapMirrorVserver build() {
            return new SnapMirrorVserver (
                         this.snapMirrorEndpointID,
                         this.vserverName,
                         this.vserverType,
                         this.vserverSubtype,
                         this.rootVolume,
                         this.rootVolumeAggregate,
                         this.vserverAggregateInfo,
                         this.adminState,
                         this.operationalState);
        }

        private SnapMirrorVserver.Builder buildFrom(final SnapMirrorVserver req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.vserverName = req.vserverName;
            this.vserverType = req.vserverType;
            this.vserverSubtype = req.vserverSubtype;
            this.rootVolume = req.rootVolume;
            this.rootVolumeAggregate = req.rootVolumeAggregate;
            this.vserverAggregateInfo = req.vserverAggregateInfo;
            this.adminState = req.adminState;
            this.operationalState = req.operationalState;

            return this;
        }

        public SnapMirrorVserver.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public SnapMirrorVserver.Builder vserverName(final String vserverName) {
            this.vserverName = vserverName;
            return this;
        }

        public SnapMirrorVserver.Builder vserverType(final String vserverType) {
            this.vserverType = vserverType;
            return this;
        }

        public SnapMirrorVserver.Builder vserverSubtype(final String vserverSubtype) {
            this.vserverSubtype = vserverSubtype;
            return this;
        }

        public SnapMirrorVserver.Builder rootVolume(final String rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }

        public SnapMirrorVserver.Builder rootVolumeAggregate(final String rootVolumeAggregate) {
            this.rootVolumeAggregate = rootVolumeAggregate;
            return this;
        }

        public SnapMirrorVserver.Builder vserverAggregateInfo(final SnapMirrorVserverAggregateInfo[] vserverAggregateInfo) {
            this.vserverAggregateInfo = vserverAggregateInfo;
            return this;
        }

        public SnapMirrorVserver.Builder adminState(final String adminState) {
            this.adminState = adminState;
            return this;
        }

        public SnapMirrorVserver.Builder operationalState(final String operationalState) {
            this.operationalState = operationalState;
            return this;
        }

    }
}
