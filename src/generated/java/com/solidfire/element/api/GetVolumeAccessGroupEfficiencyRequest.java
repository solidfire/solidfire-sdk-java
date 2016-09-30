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
 * The Request object for the "GetVolumeAccessGroupEfficiency" API Service call.
 **/
public class GetVolumeAccessGroupEfficiencyRequest  implements Serializable  {

    private static final long serialVersionUID = -1603593939L;

    @SerializedName("volumeAccessGroupID") private final Long volumeAccessGroupID;

    /**
     * The Request object for the "GetVolumeAccessGroupEfficiency" API Service call.
     * @param volumeAccessGroupID [required] Specifies the volume access group for which capacity is computed.
     * @since 7.0
     **/
    @Since("7.0")
    public GetVolumeAccessGroupEfficiencyRequest(Long volumeAccessGroupID) {
        this.volumeAccessGroupID = volumeAccessGroupID;
    }


    /**
     * Specifies the volume access group for which capacity is computed.
     **/
    public Long getVolumeAccessGroupID() {
        return this.volumeAccessGroupID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetVolumeAccessGroupEfficiencyRequest that = (GetVolumeAccessGroupEfficiencyRequest) o;
        

        return Objects.equals( volumeAccessGroupID , that.volumeAccessGroupID );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) volumeAccessGroupID );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

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
        private Long volumeAccessGroupID;

        private Builder() { }

        public GetVolumeAccessGroupEfficiencyRequest build() {
            return new GetVolumeAccessGroupEfficiencyRequest (
                         this.volumeAccessGroupID            );
        }

        private GetVolumeAccessGroupEfficiencyRequest.Builder buildFrom(final GetVolumeAccessGroupEfficiencyRequest req) {
            this.volumeAccessGroupID = req.volumeAccessGroupID;

            return this;
        }

        public GetVolumeAccessGroupEfficiencyRequest.Builder volumeAccessGroupID(final Long volumeAccessGroupID) {
            this.volumeAccessGroupID = volumeAccessGroupID;
            return this;
        }

    }

}
