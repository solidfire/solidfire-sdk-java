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

import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * FibreChannelSession contains information about each Fibre Channel session that is visible to the cluster and what target ports it is visible on.
 **/
public class FibreChannelSession  implements Serializable  {

    private static final long serialVersionUID = -1073846206L;

    @SerializedName("initiatorWWPN") private final String initiatorWWPN;
    @SerializedName("nodeID") private final Long nodeID;
    @SerializedName("serviceID") private final Long serviceID;
    @SerializedName("targetWWPN") private final String targetWWPN;
    @SerializedName("volumeAccessGroupID") private final Long volumeAccessGroupID;

    /**
     * FibreChannelSession contains information about each Fibre Channel session that is visible to the cluster and what target ports it is visible on.
     * @param initiatorWWPN [required] The WWPN of the initiator which is logged into the target port.
     * @param nodeID [required] The node owning the Fibre Channel session.
     * @param serviceID [required] The service ID of the FService owning this Fibre Channel session
     * @param targetWWPN [required] The WWPN of the target port involved in this session.
     * @param volumeAccessGroupID [required] The ID of the volume access group to which the initiatorWWPN belongs. If not in a volume access group, the value will be null.
     * @since 7.0
     **/
    @Since("7.0")
    public FibreChannelSession(String initiatorWWPN, Long nodeID, Long serviceID, String targetWWPN, Long volumeAccessGroupID) {
        this.volumeAccessGroupID = volumeAccessGroupID;
        this.initiatorWWPN = initiatorWWPN;
        this.nodeID = nodeID;
        this.serviceID = serviceID;
        this.targetWWPN = targetWWPN;
    }


    /**
     * The WWPN of the initiator which is logged into the target port.
     **/
    public String getInitiatorWWPN() {
        return this.initiatorWWPN;
    }

    /**
     * The node owning the Fibre Channel session.
     **/
    public Long getNodeID() {
        return this.nodeID;
    }

    /**
     * The service ID of the FService owning this Fibre Channel session
     **/
    public Long getServiceID() {
        return this.serviceID;
    }

    /**
     * The WWPN of the target port involved in this session.
     **/
    public String getTargetWWPN() {
        return this.targetWWPN;
    }

    /**
     * The ID of the volume access group to which the initiatorWWPN belongs. If not in a volume access group, the value will be null.
     **/
    public Long getVolumeAccessGroupID() {
        return this.volumeAccessGroupID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FibreChannelSession that = (FibreChannelSession) o;
        

        return Objects.equals( initiatorWWPN , that.initiatorWWPN )
            && Objects.equals( nodeID , that.nodeID )
            && Objects.equals( serviceID , that.serviceID )
            && Objects.equals( targetWWPN , that.targetWWPN )
            && Objects.equals( volumeAccessGroupID , that.volumeAccessGroupID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( initiatorWWPN, nodeID, serviceID, targetWWPN, volumeAccessGroupID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" initiatorWWPN : ").append(initiatorWWPN).append(",");
        sb.append(" nodeID : ").append(nodeID).append(",");
        sb.append(" serviceID : ").append(serviceID).append(",");
        sb.append(" targetWWPN : ").append(targetWWPN).append(",");
        sb.append(" volumeAccessGroupID : ").append(volumeAccessGroupID);
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
        private Long volumeAccessGroupID;

        private Builder() { }

        public FibreChannelSession build() {
            return new FibreChannelSession (
                         this.initiatorWWPN,
                         this.nodeID,
                         this.serviceID,
                         this.targetWWPN,
                         this.volumeAccessGroupID            );
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

        public FibreChannelSession.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

    }

}
