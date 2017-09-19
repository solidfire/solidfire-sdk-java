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
 * FibreChannelSession  
 * FibreChannelSession contains information about each Fibre Channel session that is visible to the cluster and what target ports it is visible on.
 **/

public class FibreChannelSession implements Serializable {

    public static final long serialVersionUID = 8264333238023851936L;
    @SerializedName("initiatorWWPN") private String initiatorWWPN;
    @SerializedName("nodeID") private Long nodeID;
    @SerializedName("serviceID") private Long serviceID;
    @SerializedName("targetWWPN") private String targetWWPN;
    @SerializedName("volumeAccessGroupID") private Optional<Long> volumeAccessGroupID;
    // empty constructor
    @Since("7.0")
    public FibreChannelSession() {}

    
    // parameterized constructor
    @Since("7.0")
    public FibreChannelSession(
        String initiatorWWPN,
        Long nodeID,
        Long serviceID,
        String targetWWPN,
        Optional<Long> volumeAccessGroupID
    )
    {
        this.initiatorWWPN = initiatorWWPN;
        this.nodeID = nodeID;
        this.serviceID = serviceID;
        this.targetWWPN = targetWWPN;
        this.volumeAccessGroupID = (volumeAccessGroupID == null) ? Optional.<Long>empty() : volumeAccessGroupID;
    }

    /** 
     * The WWPN of the initiator which is logged into the target port.
     **/
    public String getInitiatorWWPN() { return this.initiatorWWPN; }
   
    public void setInitiatorWWPN(String initiatorWWPN) { 
        this.initiatorWWPN = initiatorWWPN;
    }
    /** 
     * The node owning the Fibre Channel session.
     **/
    public Long getNodeID() { return this.nodeID; }
   
    public void setNodeID(Long nodeID) { 
        this.nodeID = nodeID;
    }
    /** 
     * The service ID of the FService owning this Fibre Channel session
     **/
    public Long getServiceID() { return this.serviceID; }
   
    public void setServiceID(Long serviceID) { 
        this.serviceID = serviceID;
    }
    /** 
     * The WWPN of the target port involved in this session.
     **/
    public String getTargetWWPN() { return this.targetWWPN; }
   
    public void setTargetWWPN(String targetWWPN) { 
        this.targetWWPN = targetWWPN;
    }
    /** 
     * The ID of the volume access group to which the initiatorWWPN beintegers. If not in a volume access group, the value will be null.
     **/
    public Optional<Long> getVolumeAccessGroupID() { return this.volumeAccessGroupID; }
   
    public void setVolumeAccessGroupID(Optional<Long> volumeAccessGroupID) { 
        this.volumeAccessGroupID = (volumeAccessGroupID == null) ? Optional.<Long>empty() : volumeAccessGroupID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FibreChannelSession that = (FibreChannelSession) o;

        return 
            Objects.equals(initiatorWWPN, that.initiatorWWPN) && 
            Objects.equals(nodeID, that.nodeID) && 
            Objects.equals(serviceID, that.serviceID) && 
            Objects.equals(targetWWPN, that.targetWWPN) && 
            Objects.equals(volumeAccessGroupID, that.volumeAccessGroupID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( initiatorWWPN,nodeID,serviceID,targetWWPN,volumeAccessGroupID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("initiatorWWPN", initiatorWWPN);
        map.put("nodeID", nodeID);
        map.put("serviceID", serviceID);
        map.put("targetWWPN", targetWWPN);
        map.put("volumeAccessGroupID", volumeAccessGroupID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" initiatorWWPN : ").append(gson.toJson(initiatorWWPN)).append(",");
        sb.append(" nodeID : ").append(gson.toJson(nodeID)).append(",");
        sb.append(" serviceID : ").append(gson.toJson(serviceID)).append(",");
        sb.append(" targetWWPN : ").append(gson.toJson(targetWWPN)).append(",");
        if(null != volumeAccessGroupID && volumeAccessGroupID.isPresent()){
            sb.append(" volumeAccessGroupID : ").append(gson.toJson(volumeAccessGroupID)).append(",");
        }
        else{
            sb.append(" volumeAccessGroupID : ").append("null").append(",");
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
        private String initiatorWWPN;
        private Long nodeID;
        private Long serviceID;
        private String targetWWPN;
        private Optional<Long> volumeAccessGroupID;

        private Builder() { }

        public FibreChannelSession build() {
            return new FibreChannelSession (
                         this.initiatorWWPN,
                         this.nodeID,
                         this.serviceID,
                         this.targetWWPN,
                         this.volumeAccessGroupID);
        }

        private FibreChannelSession.Builder buildFrom(final FibreChannelSession req) {
            this.initiatorWWPN = req.initiatorWWPN;
            this.nodeID = req.nodeID;
            this.serviceID = req.serviceID;
            this.targetWWPN = req.targetWWPN;
            this.volumeAccessGroupID = req.volumeAccessGroupID;

            return this;
        }

        public FibreChannelSession.Builder initiatorWWPN(final String initiatorWWPN) {
            this.initiatorWWPN = initiatorWWPN;
            return this;
        }

        public FibreChannelSession.Builder nodeID(final Long nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public FibreChannelSession.Builder serviceID(final Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        public FibreChannelSession.Builder targetWWPN(final String targetWWPN) {
            this.targetWWPN = targetWWPN;
            return this;
        }

        public FibreChannelSession.Builder optionalVolumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = (volumeAccessGroupID == null) ? Optional.<Long>empty() : Optional.of(volumeAccessGroupID);
            return this;
        }

    }
}
