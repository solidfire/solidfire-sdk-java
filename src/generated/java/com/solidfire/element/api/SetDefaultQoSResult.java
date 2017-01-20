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
 * SetDefaultQoSResult  
 **/

public class SetDefaultQoSResult implements Serializable {

    public static final long serialVersionUID = 7512705930675605256L;
    @SerializedName("minIOPS") private Long minIOPS;
    @SerializedName("maxIOPS") private Long maxIOPS;
    @SerializedName("burstIOPS") private Long burstIOPS;

    // empty constructor
    @Since("7.0")
    public SetDefaultQoSResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public SetDefaultQoSResult(
        Long minIOPS,
        Long maxIOPS,
        Long burstIOPS
    )
    {
        this.minIOPS = minIOPS;
        this.maxIOPS = maxIOPS;
        this.burstIOPS = burstIOPS;
    }

    /** 
     * The minimum number of sustained IOPS that are provided by the cluster to a volume. 
     **/
    public Long getMinIOPS() { return this.minIOPS; }
    public void setMinIOPS(Long minIOPS) { 
        this.minIOPS = minIOPS;
    }
    /** 
     * The maximum number of sustained IOPS that are provided by the cluster to a volume.
     **/
    public Long getMaxIOPS() { return this.maxIOPS; }
    public void setMaxIOPS(Long maxIOPS) { 
        this.maxIOPS = maxIOPS;
    }
    /** 
     * The maximum number of IOPS allowed in a short burst scenario.
     **/
    public Long getBurstIOPS() { return this.burstIOPS; }
    public void setBurstIOPS(Long burstIOPS) { 
        this.burstIOPS = burstIOPS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetDefaultQoSResult that = (SetDefaultQoSResult) o;

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
        sb.append( "{ " );

        sb.append(" minIOPS : ").append(minIOPS).append(",");
        sb.append(" maxIOPS : ").append(maxIOPS).append(",");
        sb.append(" burstIOPS : ").append(burstIOPS).append(",");
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
        private Long minIOPS;
        private Long maxIOPS;
        private Long burstIOPS;

        private Builder() { }

        public SetDefaultQoSResult build() {
            return new SetDefaultQoSResult (
                         this.minIOPS,
                         this.maxIOPS,
                         this.burstIOPS);
        }

        private SetDefaultQoSResult.Builder buildFrom(final SetDefaultQoSResult req) {
            this.minIOPS = req.minIOPS;
            this.maxIOPS = req.maxIOPS;
            this.burstIOPS = req.burstIOPS;

            return this;
        }

        public SetDefaultQoSResult.Builder minIOPS(final Long minIOPS) {
            this.minIOPS = minIOPS;
            return this;
        }

        public SetDefaultQoSResult.Builder maxIOPS(final Long maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }

        public SetDefaultQoSResult.Builder burstIOPS(final Long burstIOPS) {
            this.burstIOPS = burstIOPS;
            return this;
        }

    }
}
