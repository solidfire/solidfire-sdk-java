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
 * QoSPolicy  
 * The QoSPolicy object contains information about a QoS policy on the cluster.
 **/

public class QoSPolicy implements Serializable {

    public static final long serialVersionUID = 4756775153267147590L;
    @SerializedName("qosPolicyID") private Long qosPolicyID;
    @SerializedName("name") private String name;
    @SerializedName("volumeIDs") private Long[] volumeIDs;
    @SerializedName("qos") private VolumeQOS qos;

    
    // parameterized constructor
    @Since("7.0")
    public QoSPolicy(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public QoSPolicy(
        Long qosPolicyID,
        String name,
        Long[] volumeIDs,
        VolumeQOS qos
    )
    {
        this.qosPolicyID = qosPolicyID;
        this.name = name;
        this.volumeIDs = volumeIDs;
        this.qos = qos;
    }

    /** 
     * A unique integer identifier for the QoSPolicy auto-assigned by the SolidFire cluster.
     **/
    public Long getQosPolicyID() { return this.qosPolicyID; }
   
    public void setQosPolicyID(Long qosPolicyID) { 
        this.qosPolicyID = qosPolicyID;
    }
    /** 
     * The name of the QoS policy. For example: gold, platinum, or silver.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * A list of volumes associated with this policy.
     **/
    public Long[] getVolumeIDs() { return this.volumeIDs; }
   
    public void setVolumeIDs(Long[] volumeIDs) { 
        this.volumeIDs = volumeIDs;
    }
    /** 
     * Quality of service settings for this volume.
     **/
    public VolumeQOS getQos() { return this.qos; }
   
    public void setQos(VolumeQOS qos) { 
        this.qos = qos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QoSPolicy that = (QoSPolicy) o;

        return 
            Objects.equals(qosPolicyID, that.qosPolicyID) && 
            Objects.equals(name, that.name) && 
            Arrays.equals(volumeIDs, that.volumeIDs) && 
            Objects.equals(qos, that.qos);
    }

    @Override
    public int hashCode() {
        return Objects.hash( qosPolicyID,name,(Object[])volumeIDs,qos );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("qosPolicyID", qosPolicyID);
        map.put("name", name);
        map.put("volumeIDs", volumeIDs);
        map.put("qos", qos);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" qosPolicyID : ").append(gson.toJson(qosPolicyID)).append(",");
        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" volumeIDs : ").append(gson.toJson(Arrays.toString(volumeIDs))).append(",");
        sb.append(" qos : ").append(gson.toJson(qos)).append(",");
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
        private Long qosPolicyID;
        private String name;
        private Long[] volumeIDs;
        private VolumeQOS qos;

        private Builder() { }

        public QoSPolicy build() {
            return new QoSPolicy (
                         this.qosPolicyID,
                         this.name,
                         this.volumeIDs,
                         this.qos);
        }

        private QoSPolicy.Builder buildFrom(final QoSPolicy req) {
            this.qosPolicyID = req.qosPolicyID;
            this.name = req.name;
            this.volumeIDs = req.volumeIDs;
            this.qos = req.qos;

            return this;
        }

        public QoSPolicy.Builder qosPolicyID(final Long qosPolicyID) {
            this.qosPolicyID = qosPolicyID;
            return this;
        }

        public QoSPolicy.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public QoSPolicy.Builder volumeIDs(final Long[] volumeIDs) {
            this.volumeIDs = volumeIDs;
            return this;
        }

        public QoSPolicy.Builder qos(final VolumeQOS qos) {
            this.qos = qos;
            return this;
        }

    }
}
