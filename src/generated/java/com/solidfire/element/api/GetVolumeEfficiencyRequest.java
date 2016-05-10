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
 * The Request object for the "GetVolumeEfficiency" API Service call.
 **/
public class GetVolumeEfficiencyRequest implements Serializable {

    private static final long serialVersionUID = 467440763L;

    private final Long volumeID;
    private final Optional<Boolean> force;

    /**
     * The Request object for the "GetVolumeEfficiency" API Service call.
     * @param volumeID [required] Specifies the volume for which capacity is computed.
     * @param force (optional) 
     * @since 7.0
     **/
    @Since("7.0")
    public GetVolumeEfficiencyRequest(Long volumeID, Optional<Boolean> force) {
        this.volumeID = volumeID;
        this.force = (force == null) ? Optional.<Boolean>empty() : force;
    }


    /**
     * Specifies the volume for which capacity is computed.
     **/
    public Long getVolumeID() {
        return this.volumeID;
    }
    public Optional<Boolean> getForce() {
        return this.force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetVolumeEfficiencyRequest that = (GetVolumeEfficiencyRequest) o;
        

        return Objects.equals( volumeID , that.volumeID )
            && Objects.equals( force , that.force );
    }

    @Override
    public int hashCode() {

        return Objects.hash( volumeID, force );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        if(null != force && force.isPresent())
            sb.append(" force : ").append(force.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder getBuilder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().fromRequest(this);
    }

    public static class Builder {
        private Long volumeID;
        private Optional<Boolean> force;

        private Builder() { }

        public GetVolumeEfficiencyRequest toRequest() {
            return new GetVolumeEfficiencyRequest (
                         this.volumeID,
                         this.force            );
        }

        private GetVolumeEfficiencyRequest.Builder fromRequest(final GetVolumeEfficiencyRequest req) {
            this.volumeID = req.volumeID;
            this.force = req.force;

            return this;
        }

        public GetVolumeEfficiencyRequest.Builder withVolumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public GetVolumeEfficiencyRequest.Builder withOptionalForce(final Boolean force) {
            this.force = (force == null) ? Optional.<Boolean>empty() : Optional.of(force);
            return this;
        }

    }

}
