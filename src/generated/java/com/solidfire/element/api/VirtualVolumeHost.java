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
 * 
 **/
public class VirtualVolumeHost  implements Serializable  {

    private static final long serialVersionUID = -1206323719L;

    @SerializedName("virtualVolumeHostID") private final java.util.UUID virtualVolumeHostID;
    @SerializedName("clusterID") private final java.util.UUID clusterID;
    @SerializedName("visibleProtocolEndpointIDs") private final java.util.UUID[] visibleProtocolEndpointIDs;
    @SerializedName("bindings") private final Long[] bindings;
    @SerializedName("initiatorNames") private final String[] initiatorNames;
    @SerializedName("hostAddress") private final String hostAddress;

    /**
     * 
     * @param virtualVolumeHostID [required] 
     * @param clusterID [required] 
     * @param visibleProtocolEndpointIDs [required] 
     * @param bindings [required] 
     * @param initiatorNames [required] 
     * @param hostAddress [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public VirtualVolumeHost(java.util.UUID virtualVolumeHostID, java.util.UUID clusterID, java.util.UUID[] visibleProtocolEndpointIDs, Long[] bindings, String[] initiatorNames, String hostAddress) {
        this.bindings = bindings;
        this.visibleProtocolEndpointIDs = visibleProtocolEndpointIDs;
        this.virtualVolumeHostID = virtualVolumeHostID;
        this.clusterID = clusterID;
        this.hostAddress = hostAddress;
        this.initiatorNames = initiatorNames;
    }

    public java.util.UUID getVirtualVolumeHostID() {
        return this.virtualVolumeHostID;
    }
    public java.util.UUID getClusterID() {
        return this.clusterID;
    }
    public java.util.UUID[] getVisibleProtocolEndpointIDs() {
        return this.visibleProtocolEndpointIDs;
    }
    public Long[] getBindings() {
        return this.bindings;
    }
    public String[] getInitiatorNames() {
        return this.initiatorNames;
    }
    public String getHostAddress() {
        return this.hostAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualVolumeHost that = (VirtualVolumeHost) o;
        

        return Objects.equals( virtualVolumeHostID , that.virtualVolumeHostID )
            && Objects.equals( clusterID , that.clusterID )
            && Objects.deepEquals( visibleProtocolEndpointIDs , that.visibleProtocolEndpointIDs )
            && Objects.deepEquals( bindings , that.bindings )
            && Objects.deepEquals( initiatorNames , that.initiatorNames )
            && Objects.equals( hostAddress , that.hostAddress );
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualVolumeHostID, clusterID, visibleProtocolEndpointIDs, bindings, initiatorNames, hostAddress );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualVolumeHostID : ").append(virtualVolumeHostID).append(",");
        sb.append(" clusterID : ").append(clusterID).append(",");
        sb.append(" visibleProtocolEndpointIDs : ").append(Arrays.toString(visibleProtocolEndpointIDs)).append(",");
        sb.append(" bindings : ").append(Arrays.toString(bindings)).append(",");
        sb.append(" initiatorNames : ").append(Arrays.toString(initiatorNames)).append(",");
        sb.append(" hostAddress : ").append(hostAddress);
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
        private java.util.UUID virtualVolumeHostID;
        private java.util.UUID clusterID;
        private java.util.UUID[] visibleProtocolEndpointIDs;
        private Long[] bindings;
        private String[] initiatorNames;
        private String hostAddress;

        private Builder() { }

        public VirtualVolumeHost build() {
            return new VirtualVolumeHost (
                         this.virtualVolumeHostID,
                         this.clusterID,
                         this.visibleProtocolEndpointIDs,
                         this.bindings,
                         this.initiatorNames,
                         this.hostAddress            );
        }

        private VirtualVolumeHost.Builder buildFrom(final VirtualVolumeHost req) {
            this.virtualVolumeHostID = req.virtualVolumeHostID;
            this.clusterID = req.clusterID;
            this.visibleProtocolEndpointIDs = req.visibleProtocolEndpointIDs;
            this.bindings = req.bindings;
            this.initiatorNames = req.initiatorNames;
            this.hostAddress = req.hostAddress;

            return this;
        }

        public VirtualVolumeHost.Builder virtualVolumeHostID(final java.util.UUID virtualVolumeHostID) {
            this.virtualVolumeHostID = virtualVolumeHostID;
            return this;
        }

        public VirtualVolumeHost.Builder clusterID(final java.util.UUID clusterID) {
            this.clusterID = clusterID;
            return this;
        }

        public VirtualVolumeHost.Builder visibleProtocolEndpointIDs(final java.util.UUID[] visibleProtocolEndpointIDs) {
            this.visibleProtocolEndpointIDs = visibleProtocolEndpointIDs;
            return this;
        }

        public VirtualVolumeHost.Builder bindings(final Long[] bindings) {
            this.bindings = bindings;
            return this;
        }

        public VirtualVolumeHost.Builder initiatorNames(final String[] initiatorNames) {
            this.initiatorNames = initiatorNames;
            return this;
        }

        public VirtualVolumeHost.Builder hostAddress(final String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }

    }

}
