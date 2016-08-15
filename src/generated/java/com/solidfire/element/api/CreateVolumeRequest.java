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

import com.google.gson.annotations.SerializedName;
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
 * The Request object for the "CreateVolume" API Service call.
 **/
public class CreateVolumeRequest  implements Serializable  {

    private static final long serialVersionUID = 2095583324L;

    @SerializedName("name") private final String name;
    @SerializedName("accountID") private final Long accountID;
    @SerializedName("totalSize") private final Long totalSize;
    @SerializedName("enable512e") private final Boolean enable512e;
    @SerializedName("qos") private final Optional<QoS> qos;
    @SerializedName("attributes") private final Optional<java.util.Map<String, Object>> attributes;

    /**
     * The Request object for the "CreateVolume" API Service call.
     * @param name [required] Name of the volume.
     * @param accountID [required] AccountID for the owner of this volume.
     * @param totalSize [required] Total size of the volume, in bytes. Size is rounded up to the nearest 1MB size.
     * @param enable512e [required] Should the volume provides 512-byte sector emulation?
     * @param qos (optional) Initial quality of service settings for this volume.
     * @param attributes (optional) List of Name/Value pairs in JSON object format.
     * @since 7.0
     **/
    @Since("7.0")
    public CreateVolumeRequest(String name, Long accountID, Long totalSize, Boolean enable512e, Optional<QoS> qos, Optional<java.util.Map<String, Object>> attributes) {
        this.name = name;
        this.totalSize = totalSize;
        this.enable512e = enable512e;
        this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : attributes;
        this.accountID = accountID;
        this.qos = (qos == null) ? Optional.<QoS>empty() : qos;
    }


    /**
     * Name of the volume.
     * Not required to be unique, but it is recommended.
     * May be 1 to 64 characters in length.
     **/
    public String getName() {
        return this.name;
    }

    /**
     * AccountID for the owner of this volume.
     **/
    public Long getAccountID() {
        return this.accountID;
    }

    /**
     * Total size of the volume, in bytes. Size is rounded up to the nearest 1MB size.
     **/
    public Long getTotalSize() {
        return this.totalSize;
    }

    /**
     * Should the volume provides 512-byte sector emulation?
     **/
    public Boolean getEnable512e() {
        return this.enable512e;
    }

    /**
     * Initial quality of service settings for this volume.
     * <br/><br/>
     * Volumes created without specified QoS values are created with the default values for QoS.
     * Default values for a volume can be found by running the GetDefaultQoS method.
     **/
    public Optional<QoS> getQos() {
        return this.qos;
    }

    /**
     * List of Name/Value pairs in JSON object format.
     **/
    public Optional<java.util.Map<String, Object>> getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateVolumeRequest that = (CreateVolumeRequest) o;
        

        return Objects.equals( name , that.name )
            && Objects.equals( accountID , that.accountID )
            && Objects.equals( totalSize , that.totalSize )
            && Objects.equals( enable512e , that.enable512e )
            && Objects.equals( qos , that.qos )
            && Objects.equals( attributes , that.attributes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, accountID, totalSize, enable512e, qos, attributes );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" name : ").append(name).append(",");
        sb.append(" accountID : ").append(accountID).append(",");
        sb.append(" totalSize : ").append(totalSize).append(",");
        sb.append(" enable512e : ").append(enable512e).append(",");
        if(null != qos && qos.isPresent())
            sb.append(" qos : ").append(qos.get()).append(",");
        if(null != attributes && attributes.isPresent())
            sb.append(" attributes : ").append(attributes.get());
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
        private Optional<java.util.Map<String, Object>> attributes;

        private Builder() { }

        public CreateVolumeRequest build() {
            return new CreateVolumeRequest (
                         this.name,
                         this.accountID,
                         this.totalSize,
                         this.enable512e,
                         this.qos,
                         this.attributes            );
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

        public CreateVolumeRequest.Builder optionalAttributes(final java.util.Map<String, Object> attributes) {
            this.attributes = (attributes == null) ? Optional.<java.util.Map<String, Object>>empty() : Optional.of(attributes);
            return this;
        }

    }

}
