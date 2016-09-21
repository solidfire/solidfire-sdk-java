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
 * The Request object for the "RemoveVolumePair" API Service call.
 **/
public class RemoveVolumePairRequest  implements Serializable  {

    private static final long serialVersionUID = -502731008L;

    @SerializedName("volumeID") private final Long volumeID;

    /**
     * The Request object for the "RemoveVolumePair" API Service call.
     * @param volumeID [required] ID of the volume on which to stop the replication process.
     * @since 7.0
     **/
    @Since("7.0")
    public RemoveVolumePairRequest(Long volumeID) {
        this.volumeID = volumeID;
    }


    /**
     * ID of the volume on which to stop the replication process.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemoveVolumePairRequest that = (RemoveVolumePairRequest) o;
        

        return Objects.equals( volumeID , that.volumeID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) volumeID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID);
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

        private Builder() { }

        public RemoveVolumePairRequest build() {
            return new RemoveVolumePairRequest (
                         this.volumeID            );
        }

        private RemoveVolumePairRequest.Builder buildFrom(final RemoveVolumePairRequest req) {
            this.volumeID = req.volumeID;

            return this;
        }

        public RemoveVolumePairRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

    }

}
