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
 * RtfiInfo  
 **/

public class RtfiInfo implements Serializable {

    public static final long serialVersionUID = 2818977902491736813L;
    @SerializedName("mipi") private String mipi;
    @SerializedName("generation") private Long generation;
    @SerializedName("statusUrlLogfile") private String statusUrlLogfile;
    @SerializedName("build") private String build;
    @SerializedName("statusUrlAll") private String statusUrlAll;
    @SerializedName("generationNext") private Long generationNext;
    @SerializedName("mip") private String mip;
    @SerializedName("statusUrlCurrent") private String statusUrlCurrent;
    @SerializedName("options") private java.util.Map<String, Object> options;

    // empty constructor
    @Since("7.0")
    public RtfiInfo() {}

    
    // parameterized constructor
    @Since("7.0")
    public RtfiInfo(
        String mipi,
        Long generation,
        String statusUrlLogfile,
        String build,
        String statusUrlAll,
        Long generationNext,
        String mip,
        String statusUrlCurrent,
        java.util.Map<String, Object> options
    )
    {
        this.mipi = mipi;
        this.generation = generation;
        this.statusUrlLogfile = statusUrlLogfile;
        this.build = build;
        this.statusUrlAll = statusUrlAll;
        this.generationNext = generationNext;
        this.mip = mip;
        this.statusUrlCurrent = statusUrlCurrent;
        this.options = options;
    }

    /** 
     **/
    public String getMipi() { return this.mipi; }
    public void setMipi(String mipi) { 
        this.mipi = mipi;
    }
    /** 
     **/
    public Long getGeneration() { return this.generation; }
    public void setGeneration(Long generation) { 
        this.generation = generation;
    }
    /** 
     **/
    public String getStatusUrlLogfile() { return this.statusUrlLogfile; }
    public void setStatusUrlLogfile(String statusUrlLogfile) { 
        this.statusUrlLogfile = statusUrlLogfile;
    }
    /** 
     **/
    public String getBuild() { return this.build; }
    public void setBuild(String build) { 
        this.build = build;
    }
    /** 
     **/
    public String getStatusUrlAll() { return this.statusUrlAll; }
    public void setStatusUrlAll(String statusUrlAll) { 
        this.statusUrlAll = statusUrlAll;
    }
    /** 
     **/
    public Long getGenerationNext() { return this.generationNext; }
    public void setGenerationNext(Long generationNext) { 
        this.generationNext = generationNext;
    }
    /** 
     **/
    public String getMip() { return this.mip; }
    public void setMip(String mip) { 
        this.mip = mip;
    }
    /** 
     **/
    public String getStatusUrlCurrent() { return this.statusUrlCurrent; }
    public void setStatusUrlCurrent(String statusUrlCurrent) { 
        this.statusUrlCurrent = statusUrlCurrent;
    }
    /** 
     **/
    public java.util.Map<String, Object> getOptions() { return this.options; }
    public void setOptions(java.util.Map<String, Object> options) { 
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RtfiInfo that = (RtfiInfo) o;

        return 
            Objects.equals(mipi, that.mipi) && 
            Objects.equals(generation, that.generation) && 
            Objects.equals(statusUrlLogfile, that.statusUrlLogfile) && 
            Objects.equals(build, that.build) && 
            Objects.equals(statusUrlAll, that.statusUrlAll) && 
            Objects.equals(generationNext, that.generationNext) && 
            Objects.equals(mip, that.mip) && 
            Objects.equals(statusUrlCurrent, that.statusUrlCurrent) && 
            Objects.equals(options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash( mipi,generation,statusUrlLogfile,build,statusUrlAll,generationNext,mip,statusUrlCurrent,options );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("mipi", mipi);
        map.put("generation", generation);
        map.put("statusUrlLogfile", statusUrlLogfile);
        map.put("build", build);
        map.put("statusUrlAll", statusUrlAll);
        map.put("generationNext", generationNext);
        map.put("mip", mip);
        map.put("statusUrlCurrent", statusUrlCurrent);
        map.put("options", options);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" mipi : ").append(mipi).append(",");
        sb.append(" generation : ").append(generation).append(",");
        sb.append(" statusUrlLogfile : ").append(statusUrlLogfile).append(",");
        sb.append(" build : ").append(build).append(",");
        sb.append(" statusUrlAll : ").append(statusUrlAll).append(",");
        sb.append(" generationNext : ").append(generationNext).append(",");
        sb.append(" mip : ").append(mip).append(",");
        sb.append(" statusUrlCurrent : ").append(statusUrlCurrent).append(",");
        sb.append(" options : ").append(options).append(",");
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
        private String mipi;
        private Long generation;
        private String statusUrlLogfile;
        private String build;
        private String statusUrlAll;
        private Long generationNext;
        private String mip;
        private String statusUrlCurrent;
        private java.util.Map<String, Object> options;

        private Builder() { }

        public RtfiInfo build() {
            return new RtfiInfo (
                         this.mipi,
                         this.generation,
                         this.statusUrlLogfile,
                         this.build,
                         this.statusUrlAll,
                         this.generationNext,
                         this.mip,
                         this.statusUrlCurrent,
                         this.options);
        }

        private RtfiInfo.Builder buildFrom(final RtfiInfo req) {
            this.mipi = req.mipi;
            this.generation = req.generation;
            this.statusUrlLogfile = req.statusUrlLogfile;
            this.build = req.build;
            this.statusUrlAll = req.statusUrlAll;
            this.generationNext = req.generationNext;
            this.mip = req.mip;
            this.statusUrlCurrent = req.statusUrlCurrent;
            this.options = req.options;

            return this;
        }

        public RtfiInfo.Builder mipi(final String mipi) {
            this.mipi = mipi;
            return this;
        }

        public RtfiInfo.Builder generation(final Long generation) {
            this.generation = generation;
            return this;
        }

        public RtfiInfo.Builder statusUrlLogfile(final String statusUrlLogfile) {
            this.statusUrlLogfile = statusUrlLogfile;
            return this;
        }

        public RtfiInfo.Builder build(final String build) {
            this.build = build;
            return this;
        }

        public RtfiInfo.Builder statusUrlAll(final String statusUrlAll) {
            this.statusUrlAll = statusUrlAll;
            return this;
        }

        public RtfiInfo.Builder generationNext(final Long generationNext) {
            this.generationNext = generationNext;
            return this;
        }

        public RtfiInfo.Builder mip(final String mip) {
            this.mip = mip;
            return this;
        }

        public RtfiInfo.Builder statusUrlCurrent(final String statusUrlCurrent) {
            this.statusUrlCurrent = statusUrlCurrent;
            return this;
        }

        public RtfiInfo.Builder options(final java.util.Map<String, Object> options) {
            this.options = options;
            return this;
        }

    }
}
