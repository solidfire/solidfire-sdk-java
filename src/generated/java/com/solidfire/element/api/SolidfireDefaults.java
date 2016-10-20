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
 * 
 **/
public class SolidfireDefaults  implements Serializable  {

    private static final long serialVersionUID = 2127016438L;

    @SerializedName("sliceFileLogFileCapacity") private Long sliceFileLogFileCapacity;
    @SerializedName("postCallbackThreadCount") private Long postCallbackThreadCount;
    @SerializedName("cpuDmaLatency") private Long cpuDmaLatency;
    @SerializedName("bufferCacheGB") private Long bufferCacheGB;
    @SerializedName("maxIncomingSliceSyncs") private Long maxIncomingSliceSyncs;
    @SerializedName("configuredIops") private Long configuredIops;
    @SerializedName("sCacheFileCapacity") private Long sCacheFileCapacity;

    /**
     * 
     * @param sliceFileLogFileCapacity [required] 
     * @param postCallbackThreadCount [required] 
     * @param cpuDmaLatency [required] 
     * @param bufferCacheGB [required] 
     * @param maxIncomingSliceSyncs [required] 
     * @param configuredIops [required] 
     * @param sCacheFileCapacity [required] 
     * @since 7.0
     **/
    @Since("7.0")
    public SolidfireDefaults(Long sliceFileLogFileCapacity, Long postCallbackThreadCount, Long cpuDmaLatency, Long bufferCacheGB, Long maxIncomingSliceSyncs, Long configuredIops, Long sCacheFileCapacity) {
        this.maxIncomingSliceSyncs = maxIncomingSliceSyncs;
        this.sliceFileLogFileCapacity = sliceFileLogFileCapacity;
        this.configuredIops = configuredIops;
        this.cpuDmaLatency = cpuDmaLatency;
        this.postCallbackThreadCount = postCallbackThreadCount;
        this.sCacheFileCapacity = sCacheFileCapacity;
        this.bufferCacheGB = bufferCacheGB;
    }

    
    /**
     * 
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public SolidfireDefaults() {}

    public Long getSliceFileLogFileCapacity() {
        return this.sliceFileLogFileCapacity;
    }

    public void setSliceFileLogFileCapacity(Long sliceFileLogFileCapacity) {
        this.sliceFileLogFileCapacity = sliceFileLogFileCapacity;
    }
    public Long getPostCallbackThreadCount() {
        return this.postCallbackThreadCount;
    }

    public void setPostCallbackThreadCount(Long postCallbackThreadCount) {
        this.postCallbackThreadCount = postCallbackThreadCount;
    }
    public Long getCpuDmaLatency() {
        return this.cpuDmaLatency;
    }

    public void setCpuDmaLatency(Long cpuDmaLatency) {
        this.cpuDmaLatency = cpuDmaLatency;
    }
    public Long getBufferCacheGB() {
        return this.bufferCacheGB;
    }

    public void setBufferCacheGB(Long bufferCacheGB) {
        this.bufferCacheGB = bufferCacheGB;
    }
    public Long getMaxIncomingSliceSyncs() {
        return this.maxIncomingSliceSyncs;
    }

    public void setMaxIncomingSliceSyncs(Long maxIncomingSliceSyncs) {
        this.maxIncomingSliceSyncs = maxIncomingSliceSyncs;
    }
    public Long getConfiguredIops() {
        return this.configuredIops;
    }

    public void setConfiguredIops(Long configuredIops) {
        this.configuredIops = configuredIops;
    }
    public Long getSCacheFileCapacity() {
        return this.sCacheFileCapacity;
    }

    public void setSCacheFileCapacity(Long sCacheFileCapacity) {
        this.sCacheFileCapacity = sCacheFileCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SolidfireDefaults that = (SolidfireDefaults) o;
        

        return Objects.equals( sliceFileLogFileCapacity , that.sliceFileLogFileCapacity )
            && Objects.equals( postCallbackThreadCount , that.postCallbackThreadCount )
            && Objects.equals( cpuDmaLatency , that.cpuDmaLatency )
            && Objects.equals( bufferCacheGB , that.bufferCacheGB )
            && Objects.equals( maxIncomingSliceSyncs , that.maxIncomingSliceSyncs )
            && Objects.equals( configuredIops , that.configuredIops )
            && Objects.equals( sCacheFileCapacity , that.sCacheFileCapacity );
    }

    @Override
    public int hashCode() {
        return Objects.hash( sliceFileLogFileCapacity, postCallbackThreadCount, cpuDmaLatency, bufferCacheGB, maxIncomingSliceSyncs, configuredIops, sCacheFileCapacity );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" sliceFileLogFileCapacity : ").append(sliceFileLogFileCapacity).append(",");
        sb.append(" postCallbackThreadCount : ").append(postCallbackThreadCount).append(",");
        sb.append(" cpuDmaLatency : ").append(cpuDmaLatency).append(",");
        sb.append(" bufferCacheGB : ").append(bufferCacheGB).append(",");
        sb.append(" maxIncomingSliceSyncs : ").append(maxIncomingSliceSyncs).append(",");
        sb.append(" configuredIops : ").append(configuredIops).append(",");
        sb.append(" sCacheFileCapacity : ").append(sCacheFileCapacity);
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
        private Long sliceFileLogFileCapacity;
        private Long postCallbackThreadCount;
        private Long cpuDmaLatency;
        private Long bufferCacheGB;
        private Long maxIncomingSliceSyncs;
        private Long configuredIops;
        private Long sCacheFileCapacity;

        private Builder() { }

        public SolidfireDefaults build() {
            return new SolidfireDefaults (
                         this.sliceFileLogFileCapacity,
                         this.postCallbackThreadCount,
                         this.cpuDmaLatency,
                         this.bufferCacheGB,
                         this.maxIncomingSliceSyncs,
                         this.configuredIops,
                         this.sCacheFileCapacity            );
        }

        private SolidfireDefaults.Builder buildFrom(final SolidfireDefaults req) {
            this.sliceFileLogFileCapacity = req.sliceFileLogFileCapacity;
            this.postCallbackThreadCount = req.postCallbackThreadCount;
            this.cpuDmaLatency = req.cpuDmaLatency;
            this.bufferCacheGB = req.bufferCacheGB;
            this.maxIncomingSliceSyncs = req.maxIncomingSliceSyncs;
            this.configuredIops = req.configuredIops;
            this.sCacheFileCapacity = req.sCacheFileCapacity;

            return this;
        }

        public SolidfireDefaults.Builder sliceFileLogFileCapacity(final Long sliceFileLogFileCapacity) {
            this.sliceFileLogFileCapacity = sliceFileLogFileCapacity;
            return this;
        }

        public SolidfireDefaults.Builder postCallbackThreadCount(final Long postCallbackThreadCount) {
            this.postCallbackThreadCount = postCallbackThreadCount;
            return this;
        }

        public SolidfireDefaults.Builder cpuDmaLatency(final Long cpuDmaLatency) {
            this.cpuDmaLatency = cpuDmaLatency;
            return this;
        }

        public SolidfireDefaults.Builder bufferCacheGB(final Long bufferCacheGB) {
            this.bufferCacheGB = bufferCacheGB;
            return this;
        }

        public SolidfireDefaults.Builder maxIncomingSliceSyncs(final Long maxIncomingSliceSyncs) {
            this.maxIncomingSliceSyncs = maxIncomingSliceSyncs;
            return this;
        }

        public SolidfireDefaults.Builder configuredIops(final Long configuredIops) {
            this.configuredIops = configuredIops;
            return this;
        }

        public SolidfireDefaults.Builder sCacheFileCapacity(final Long sCacheFileCapacity) {
            this.sCacheFileCapacity = sCacheFileCapacity;
            return this;
        }

    }

}
