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
 * The object returned by the "CreateVolume" API Service call.
 **/
public class CreateVolumeResult  implements Serializable  {

    private static final long serialVersionUID = -1333016570L;

    @SerializedName("volumeID") private final Long volumeID;
    @SerializedName("curve") private final java.util.Map<String,Long> curve;

    /**
     * The object returned by the "CreateVolume" API Service call.
     * @param volumeID [required] VolumeID for the newly created volume.
     * @param curve [required] The curve is a set of key-value pairs.
     * @since 7.0
     **/
    @Since("7.0")
    public CreateVolumeResult(Long volumeID, java.util.Map<String,Long> curve) {
        this.volumeID = volumeID;
        this.curve = curve;
    }


    /**
     * VolumeID for the newly created volume.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    /**
     * The curve is a set of key-value pairs.
     * The keys are I/O sizes in bytes.
     * The values represent the cost performing an IOP at a specific I/O size.
     * The curve is calculated relative to a 4096 byte operation set at 100 IOPS.
     **/
    public java.util.Map<String,Long> getCurve() {
        return this.curve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateVolumeResult that = (CreateVolumeResult) o;
        

        return Objects.equals( volumeID , that.volumeID )
            && Objects.equals( curve , that.curve );
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, curve );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        sb.append(" curve : ").append(curve);
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
        private Long volumeID;
        private java.util.Map<String,Long> curve;

        private Builder() { }

        public CreateVolumeResult build() {
            return new CreateVolumeResult (
                         this.volumeID,
                         this.curve            );
        }

        private CreateVolumeResult.Builder buildFrom(final CreateVolumeResult req) {
            this.volumeID = req.volumeID;
            this.curve = req.curve;

            return this;
        }

        public CreateVolumeResult.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public CreateVolumeResult.Builder curve(final java.util.Map<String,Long> curve) {
            this.curve = curve;
            return this;
        }

    }

}
