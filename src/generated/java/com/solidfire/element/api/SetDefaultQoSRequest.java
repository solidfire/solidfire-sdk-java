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
 * SetDefaultQoSRequest  
 * SetDefaultQoS enables you to configure the default Quality of Service (QoS) values (measured in inputs and outputs per second, or
 * IOPS) for a volume. For more information about QoS in a SolidFire cluster, see the User Guide.
 **/

public class SetDefaultQoSRequest implements Serializable {

    public static final long serialVersionUID = 4925472714342295001L;
    @SerializedName("minIOPS") private Optional<Long> minIOPS;
    @SerializedName("maxIOPS") private Optional<Long> maxIOPS;
    @SerializedName("burstIOPS") private Optional<Long> burstIOPS;
    // empty constructor
    @Since("7.0")
    public SetDefaultQoSRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetDefaultQoSRequest(
        Optional<Long> minIOPS,
        Optional<Long> maxIOPS,
        Optional<Long> burstIOPS
    )
    {
        this.minIOPS = (minIOPS == null) ? Optional.<Long>empty() : minIOPS;
        this.maxIOPS = (maxIOPS == null) ? Optional.<Long>empty() : maxIOPS;
        this.burstIOPS = (burstIOPS == null) ? Optional.<Long>empty() : burstIOPS;
    }

    /** 
     * The minimum number of sustained IOPS provided by the cluster to a
     * volume.
     **/
    public Optional<Long> getMinIOPS() { return this.minIOPS; }
   
    public void setMinIOPS(Optional<Long> minIOPS) { 
        this.minIOPS = (minIOPS == null) ? Optional.<Long>empty() : minIOPS;
    }
    /** 
     * The maximum number of sustained IOPS provided by the cluster to a
     * volume.
     **/
    public Optional<Long> getMaxIOPS() { return this.maxIOPS; }
   
    public void setMaxIOPS(Optional<Long> maxIOPS) { 
        this.maxIOPS = (maxIOPS == null) ? Optional.<Long>empty() : maxIOPS;
    }
    /** 
     * The maximum number of IOPS allowed in a short burst scenario.
     **/
    public Optional<Long> getBurstIOPS() { return this.burstIOPS; }
   
    public void setBurstIOPS(Optional<Long> burstIOPS) { 
        this.burstIOPS = (burstIOPS == null) ? Optional.<Long>empty() : burstIOPS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetDefaultQoSRequest that = (SetDefaultQoSRequest) o;

        return 
            Objects.equals(minIOPS, that.minIOPS) && 
            Objects.equals(maxIOPS, that.maxIOPS) && 
            Objects.equals(burstIOPS, that.burstIOPS);
    }

    @Override
    public int hashCode() {
        return Objects.hash( minIOPS,maxIOPS,burstIOPS );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("minIOPS", minIOPS);
        map.put("maxIOPS", maxIOPS);
        map.put("burstIOPS", burstIOPS);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != minIOPS && minIOPS.isPresent()){
            sb.append(" minIOPS : ").append(gson.toJson(minIOPS)).append(",");
        }
        else{
            sb.append(" minIOPS : ").append("null").append(",");
        }
        if(null != maxIOPS && maxIOPS.isPresent()){
            sb.append(" maxIOPS : ").append(gson.toJson(maxIOPS)).append(",");
        }
        else{
            sb.append(" maxIOPS : ").append("null").append(",");
        }
        if(null != burstIOPS && burstIOPS.isPresent()){
            sb.append(" burstIOPS : ").append(gson.toJson(burstIOPS)).append(",");
        }
        else{
            sb.append(" burstIOPS : ").append("null").append(",");
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
        private Optional<Long> minIOPS;
        private Optional<Long> maxIOPS;
        private Optional<Long> burstIOPS;

        private Builder() { }

        public SetDefaultQoSRequest build() {
            return new SetDefaultQoSRequest (
                         this.minIOPS,
                         this.maxIOPS,
                         this.burstIOPS);
        }

        private SetDefaultQoSRequest.Builder buildFrom(final SetDefaultQoSRequest req) {
            this.minIOPS = req.minIOPS;
            this.maxIOPS = req.maxIOPS;
            this.burstIOPS = req.burstIOPS;

            return this;
        }

        public SetDefaultQoSRequest.Builder optionalMinIOPS(final Long minIOPS) {
            this.minIOPS = (minIOPS == null) ? Optional.<Long>empty() : Optional.of(minIOPS);
            return this;
        }

        public SetDefaultQoSRequest.Builder optionalMaxIOPS(final Long maxIOPS) {
            this.maxIOPS = (maxIOPS == null) ? Optional.<Long>empty() : Optional.of(maxIOPS);
            return this;
        }

        public SetDefaultQoSRequest.Builder optionalBurstIOPS(final Long burstIOPS) {
            this.burstIOPS = (burstIOPS == null) ? Optional.<Long>empty() : Optional.of(burstIOPS);
            return this;
        }

    }
}
