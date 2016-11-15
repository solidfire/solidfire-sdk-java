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
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class GetVolumeEfficiencyRequest implements Serializable {

    public static final long serialVersionUID = 6871428855542224054L;
    @SerializedName("volumeID") private Long volumeID;
    @SerializedName("force") private Optional<Boolean> force;

    // empty constructor
    @Since("7.0")
    public GetVolumeEfficiencyRequest() {}

    // parameterized constructor
    @Since("7.0")
    public GetVolumeEfficiencyRequest(
        Long volumeID,
        Optional<Boolean> force
    )
    {
        this.volumeID = volumeID;
        this.force = (force == null) ? Optional.<Boolean>empty() : force;
    }

    /** 
     * Specifies the volume for which capacity is computed.
     **/
    public Long getVolumeID() { return this.volumeID; }
    public void setVolumeID(Long volumeID) { 
        this.volumeID = volumeID;
    }
    /** 
     **/
    public Optional<Boolean> getForce() { return this.force; }
    public void setForce(Optional<Boolean> force) { 
        this.force = (force == null) ? Optional.<Boolean>empty() : force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetVolumeEfficiencyRequest that = (GetVolumeEfficiencyRequest) o;
        return 
            Objects.equals(volumeID, that.volumeID) &&
            Objects.equals(force, that.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash( volumeID, force );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("volumeID", volumeID);
        map.put("force", force);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" volumeID : ").append(volumeID).append(",");
        if(null != force && force.isPresent()){
            sb.append(" force : ").append(force.get()).append(",");
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
        private Long volumeID;
        private Optional<Boolean> force;

        private Builder() { }

        public GetVolumeEfficiencyRequest build() {
            return new GetVolumeEfficiencyRequest (
                         this.volumeID,
                         this.force);
        }

        private GetVolumeEfficiencyRequest.Builder buildFrom(final GetVolumeEfficiencyRequest req) {
            this.volumeID = req.volumeID;
            this.force = req.force;

            return this;
        }

        public GetVolumeEfficiencyRequest.Builder volumeID(final Long volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        public GetVolumeEfficiencyRequest.Builder optionalForce(final Boolean force) {
            this.force = (force == null) ? Optional.<Boolean>empty() : Optional.of(force);
            return this;
        }

    }
}
