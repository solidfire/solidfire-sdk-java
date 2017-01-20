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
 * MetadataHosts  
 * The volume services on which the volume metadata resides.
 **/

public class MetadataHosts implements Serializable {

    public static final long serialVersionUID = 3637395578922517425L;
    @SerializedName("deadSecondaries") private Long[] deadSecondaries;
    @SerializedName("liveSecondaries") private Long[] liveSecondaries;
    @SerializedName("primary") private Long primary;

    // empty constructor
    @Since("7.0")
    public MetadataHosts() {}

    
    // parameterized constructor
    @Since("7.0")
    public MetadataHosts(
        Long[] deadSecondaries,
        Long[] liveSecondaries,
        Long primary
    )
    {
        this.deadSecondaries = deadSecondaries;
        this.liveSecondaries = liveSecondaries;
        this.primary = primary;
    }

    /** 
     * Secondary metadata (slice) services that are in a dead state.
     **/
    public Long[] getDeadSecondaries() { return this.deadSecondaries; }
    public void setDeadSecondaries(Long[] deadSecondaries) { 
        this.deadSecondaries = deadSecondaries;
    }
    /** 
     * Secondary metadata (slice) services that are currently in a "live" state.
     **/
    public Long[] getLiveSecondaries() { return this.liveSecondaries; }
    public void setLiveSecondaries(Long[] liveSecondaries) { 
        this.liveSecondaries = liveSecondaries;
    }
    /** 
     * The primary metadata (slice) services hosting the volume.
     **/
    public Long getPrimary() { return this.primary; }
    public void setPrimary(Long primary) { 
        this.primary = primary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetadataHosts that = (MetadataHosts) o;

        return 
            Arrays.equals(deadSecondaries, that.deadSecondaries) && 
            Arrays.equals(liveSecondaries, that.liveSecondaries) && 
            Objects.equals(primary, that.primary);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])deadSecondaries,(Object[])liveSecondaries,primary );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("deadSecondaries", deadSecondaries);
        map.put("liveSecondaries", liveSecondaries);
        map.put("primary", primary);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" deadSecondaries : ").append(Arrays.toString(deadSecondaries)).append(",");
        sb.append(" liveSecondaries : ").append(Arrays.toString(liveSecondaries)).append(",");
        sb.append(" primary : ").append(primary).append(",");
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
        private Long[] deadSecondaries;
        private Long[] liveSecondaries;
        private Long primary;

        private Builder() { }

        public MetadataHosts build() {
            return new MetadataHosts (
                         this.deadSecondaries,
                         this.liveSecondaries,
                         this.primary);
        }

        private MetadataHosts.Builder buildFrom(final MetadataHosts req) {
            this.deadSecondaries = req.deadSecondaries;
            this.liveSecondaries = req.liveSecondaries;
            this.primary = req.primary;

            return this;
        }

        public MetadataHosts.Builder deadSecondaries(final Long[] deadSecondaries) {
            this.deadSecondaries = deadSecondaries;
            return this;
        }

        public MetadataHosts.Builder liveSecondaries(final Long[] liveSecondaries) {
            this.liveSecondaries = liveSecondaries;
            return this;
        }

        public MetadataHosts.Builder primary(final Long primary) {
            this.primary = primary;
            return this;
        }

    }
}
