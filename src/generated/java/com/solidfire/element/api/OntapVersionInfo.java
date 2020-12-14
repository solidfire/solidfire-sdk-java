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
 * OntapVersionInfo  
 * The ontapVersionInfo object contains information about the API version of the ONTAP cluster in a SnapMirror relationship. The SolidFire Element OS web UI uses the GetOntapVersionInfo API methods to get this information.
 **/

public class OntapVersionInfo implements Serializable {

    public static final long serialVersionUID = 7506610278696113493L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("clientAPIMajorVersion") private String clientAPIMajorVersion;
    @SerializedName("clientAPIMinorVersion") private String clientAPIMinorVersion;
    @SerializedName("ontapAPIMajorVersion") private String ontapAPIMajorVersion;
    @SerializedName("ontapAPIMinorVersion") private String ontapAPIMinorVersion;
    @SerializedName("ontapVersion") private String ontapVersion;

    
    // parameterized constructor
    @Since("7.0")
    public OntapVersionInfo(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public OntapVersionInfo(
        Long snapMirrorEndpointID,
        String clientAPIMajorVersion,
        String clientAPIMinorVersion,
        String ontapAPIMajorVersion,
        String ontapAPIMinorVersion,
        String ontapVersion
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.clientAPIMajorVersion = clientAPIMajorVersion;
        this.clientAPIMinorVersion = clientAPIMinorVersion;
        this.ontapAPIMajorVersion = ontapAPIMajorVersion;
        this.ontapAPIMinorVersion = ontapAPIMinorVersion;
        this.ontapVersion = ontapVersion;
    }

    /** 
     * The ID of the destination ONTAP system.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The ONTAP API major version in use by the SolidFire API client.
     **/
    public String getClientAPIMajorVersion() { return this.clientAPIMajorVersion; }
   
    public void setClientAPIMajorVersion(String clientAPIMajorVersion) { 
        this.clientAPIMajorVersion = clientAPIMajorVersion;
    }
    /** 
     * The ONTAP API minor version in use by the SolidFire API client.
     **/
    public String getClientAPIMinorVersion() { return this.clientAPIMinorVersion; }
   
    public void setClientAPIMinorVersion(String clientAPIMinorVersion) { 
        this.clientAPIMinorVersion = clientAPIMinorVersion;
    }
    /** 
     * The current API major version supported by the ONTAP system.
     **/
    public String getOntapAPIMajorVersion() { return this.ontapAPIMajorVersion; }
   
    public void setOntapAPIMajorVersion(String ontapAPIMajorVersion) { 
        this.ontapAPIMajorVersion = ontapAPIMajorVersion;
    }
    /** 
     * The current API minor version supported by the ONTAP system.
     **/
    public String getOntapAPIMinorVersion() { return this.ontapAPIMinorVersion; }
   
    public void setOntapAPIMinorVersion(String ontapAPIMinorVersion) { 
        this.ontapAPIMinorVersion = ontapAPIMinorVersion;
    }
    /** 
     * The current software version running on the ONTAP cluster.
     **/
    public String getOntapVersion() { return this.ontapVersion; }
   
    public void setOntapVersion(String ontapVersion) { 
        this.ontapVersion = ontapVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OntapVersionInfo that = (OntapVersionInfo) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(clientAPIMajorVersion, that.clientAPIMajorVersion) && 
            Objects.equals(clientAPIMinorVersion, that.clientAPIMinorVersion) && 
            Objects.equals(ontapAPIMajorVersion, that.ontapAPIMajorVersion) && 
            Objects.equals(ontapAPIMinorVersion, that.ontapAPIMinorVersion) && 
            Objects.equals(ontapVersion, that.ontapVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,clientAPIMajorVersion,clientAPIMinorVersion,ontapAPIMajorVersion,ontapAPIMinorVersion,ontapVersion );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("clientAPIMajorVersion", clientAPIMajorVersion);
        map.put("clientAPIMinorVersion", clientAPIMinorVersion);
        map.put("ontapAPIMajorVersion", ontapAPIMajorVersion);
        map.put("ontapAPIMinorVersion", ontapAPIMinorVersion);
        map.put("ontapVersion", ontapVersion);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" clientAPIMajorVersion : ").append(gson.toJson(clientAPIMajorVersion)).append(",");
        sb.append(" clientAPIMinorVersion : ").append(gson.toJson(clientAPIMinorVersion)).append(",");
        sb.append(" ontapAPIMajorVersion : ").append(gson.toJson(ontapAPIMajorVersion)).append(",");
        sb.append(" ontapAPIMinorVersion : ").append(gson.toJson(ontapAPIMinorVersion)).append(",");
        sb.append(" ontapVersion : ").append(gson.toJson(ontapVersion)).append(",");
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
        private String clientAPIMajorVersion;
        private String clientAPIMinorVersion;
        private String ontapAPIMajorVersion;
        private String ontapAPIMinorVersion;
        private String ontapVersion;

        private Builder() { }

        public OntapVersionInfo build() {
            return new OntapVersionInfo (
                         this.snapMirrorEndpointID,
                         this.clientAPIMajorVersion,
                         this.clientAPIMinorVersion,
                         this.ontapAPIMajorVersion,
                         this.ontapAPIMinorVersion,
                         this.ontapVersion);
        }

        private OntapVersionInfo.Builder buildFrom(final OntapVersionInfo req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.clientAPIMajorVersion = req.clientAPIMajorVersion;
            this.clientAPIMinorVersion = req.clientAPIMinorVersion;
            this.ontapAPIMajorVersion = req.ontapAPIMajorVersion;
            this.ontapAPIMinorVersion = req.ontapAPIMinorVersion;
            this.ontapVersion = req.ontapVersion;

            return this;
        }

        public OntapVersionInfo.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public OntapVersionInfo.Builder clientAPIMajorVersion(final String clientAPIMajorVersion) {
            this.clientAPIMajorVersion = clientAPIMajorVersion;
            return this;
        }

        public OntapVersionInfo.Builder clientAPIMinorVersion(final String clientAPIMinorVersion) {
            this.clientAPIMinorVersion = clientAPIMinorVersion;
            return this;
        }

        public OntapVersionInfo.Builder ontapAPIMajorVersion(final String ontapAPIMajorVersion) {
            this.ontapAPIMajorVersion = ontapAPIMajorVersion;
            return this;
        }

        public OntapVersionInfo.Builder ontapAPIMinorVersion(final String ontapAPIMinorVersion) {
            this.ontapAPIMinorVersion = ontapAPIMinorVersion;
            return this;
        }

        public OntapVersionInfo.Builder ontapVersion(final String ontapVersion) {
            this.ontapVersion = ontapVersion;
            return this;
        }

    }
}
