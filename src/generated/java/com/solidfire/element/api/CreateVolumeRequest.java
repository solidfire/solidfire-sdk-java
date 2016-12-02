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
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class CreateVolumeRequest implements Serializable {

    public static final long serialVersionUID = 5050439057400185898L;
    @SerializedName("name") private String name;
    @SerializedName("accountID") private Long accountID;
    @SerializedName("totalSize") private Long totalSize;
    @SerializedName("enable512e") private Boolean enable512e;
    @SerializedName("qos") private Optional<QoS> qos;
    @SerializedName("attributes") private Optional<LinkedTreeMap<String, Object>> attributes;

    // empty constructor
    @Since("7.0")
    public CreateVolumeRequest() {}

    // parameterized constructor
    @Since("7.0")
    public CreateVolumeRequest(
        String name,
        Long accountID,
        Long totalSize,
        Boolean enable512e,
        Optional<QoS> qos,
        Optional<LinkedTreeMap<String, Object>> attributes
    )
    {
        this.name = name;
        this.accountID = accountID;
        this.totalSize = totalSize;
        this.enable512e = enable512e;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
        this.attributes = (attributes == null) ? Optional.<LinkedTreeMap<String, Object>>empty() : attributes;
    }

    /** 
     * Name of the volume.
     * Not required to be unique, but it is recommended.
     * May be 1 to 64 characters in length.
     **/
    public String getName() { return this.name; }
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * AccountID for the owner of this volume.
     **/
    public Long getAccountID() { return this.accountID; }
    public void setAccountID(Long accountID) { 
        this.accountID = accountID;
    }
    /** 
     * Total size of the volume, in bytes. Size is rounded up to the nearest 1MB size.
     **/
    public Long getTotalSize() { return this.totalSize; }
    public void setTotalSize(Long totalSize) { 
        this.totalSize = totalSize;
    }
    /** 
     * Should the volume provides 512-byte sector emulation?
     **/
    public Boolean getEnable512e() { return this.enable512e; }
    public void setEnable512e(Boolean enable512e) { 
        this.enable512e = enable512e;
    }
    /** 
     * Initial quality of service settings for this volume.
     * <br/><br/>
     * Volumes created without specified QoS values are created with the default values for QoS.
     * Default values for a volume can be found by running the GetDefaultQoS method.
     **/
    public Optional<QoS> getQos() { return this.qos; }
    public void setQos(Optional<QoS> qos) { 
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
    }
    /** 
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<LinkedTreeMap<String, Object>> getAttributes() { return this.attributes; }
    public void setAttributes(Optional<LinkedTreeMap<String, Object>> attributes) { 
        this.attributes = (attributes == null) ? Optional.<LinkedTreeMap<String, Object>>empty() : attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateVolumeRequest that = (CreateVolumeRequest) o;

        return 
            Objects.equals(name, that.name) &&
            Objects.equals(accountID, that.accountID) &&
            Objects.equals(totalSize, that.totalSize) &&
            Objects.equals(enable512e, that.enable512e) &&
            Objects.equals(qos, that.qos) &&
            Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, accountID, totalSize, enable512e, qos, attributes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("accountID", accountID);
        map.put("totalSize", totalSize);
        map.put("enable512e", enable512e);
        map.put("qos", qos);
        map.put("attributes", attributes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" name : ").append(name).append(",");
        sb.append(" accountID : ").append(accountID).append(",");
        sb.append(" totalSize : ").append(totalSize).append(",");
        sb.append(" enable512e : ").append(enable512e).append(",");
        if(null != qos && qos.isPresent()){
            sb.append(" qos : ").append(qos).append(",");
        }
        if(null != attributes && attributes.isPresent()){
            sb.append(" attributes : ").append(attributes).append(",");
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
        private String name;
        private Long accountID;
        private Long totalSize;
        private Boolean enable512e;
        private Optional<QoS> qos;
        private Optional<LinkedTreeMap<String, Object>> attributes;

        private Builder() { }

        public CreateVolumeRequest build() {
            return new CreateVolumeRequest (
                         this.name,
                         this.accountID,
                         this.totalSize,
                         this.enable512e,
                         this.qos,
                         this.attributes);
        }

        private CreateVolumeRequest.Builder buildFrom(final CreateVolumeRequest req) {
            this.name = req.name;
            this.accountID = req.accountID;
            this.totalSize = req.totalSize;
            this.enable512e = req.enable512e;
            this.qos = req.qos;
            this.attributes = req.attributes;

            return this;
        }

        public CreateVolumeRequest.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public CreateVolumeRequest.Builder accountID(final Long accountID) {
            this.accountID = accountID;
            return this;
        }

        public CreateVolumeRequest.Builder totalSize(final Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public CreateVolumeRequest.Builder enable512e(final Boolean enable512e) {
            this.enable512e = enable512e;
            return this;
        }

        public CreateVolumeRequest.Builder optionalQos(final QoS qos) {
            this.qos = (qos == null) ? Optional.<QoS>empty() : Optional.of(qos);
            return this;
        }

        public CreateVolumeRequest.Builder optionalAttributes(final LinkedTreeMap<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<LinkedTreeMap<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }
}
