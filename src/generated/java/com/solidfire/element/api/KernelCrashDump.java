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

public class KernelCrashDump implements Serializable {

    public static final long serialVersionUID = 8968604396374954485L;
    @SerializedName("kernelCrashDumpMinFreeGb") private Long kernelCrashDumpMinFreeGb;
    @SerializedName("kernelCrashDumpDirectory") private String kernelCrashDumpDirectory;
    @SerializedName("kernelCrashDumpKernelOptions") private String kernelCrashDumpKernelOptions;
    @SerializedName("kernelCrashDumpMakedumpfileLevel") private Long kernelCrashDumpMakedumpfileLevel;
    @SerializedName("kernelCrashDumpDefaultState") private String kernelCrashDumpDefaultState;

    // empty constructor
    @Since("7.0")
    public KernelCrashDump() {}

    // parameterized constructor
    @Since("7.0")
    public KernelCrashDump(
        Long kernelCrashDumpMinFreeGb,
        String kernelCrashDumpDirectory,
        String kernelCrashDumpKernelOptions,
        Long kernelCrashDumpMakedumpfileLevel,
        String kernelCrashDumpDefaultState
    )
    {
        this.kernelCrashDumpMinFreeGb = kernelCrashDumpMinFreeGb;
        this.kernelCrashDumpDirectory = kernelCrashDumpDirectory;
        this.kernelCrashDumpKernelOptions = kernelCrashDumpKernelOptions;
        this.kernelCrashDumpMakedumpfileLevel = kernelCrashDumpMakedumpfileLevel;
        this.kernelCrashDumpDefaultState = kernelCrashDumpDefaultState;
    }

    /** 
     **/
    public Long getKernelCrashDumpMinFreeGb() { return this.kernelCrashDumpMinFreeGb; }
    public void setKernelCrashDumpMinFreeGb(Long kernelCrashDumpMinFreeGb) { 
        this.kernelCrashDumpMinFreeGb = kernelCrashDumpMinFreeGb;
    }
    /** 
     **/
    public String getKernelCrashDumpDirectory() { return this.kernelCrashDumpDirectory; }
    public void setKernelCrashDumpDirectory(String kernelCrashDumpDirectory) { 
        this.kernelCrashDumpDirectory = kernelCrashDumpDirectory;
    }
    /** 
     **/
    public String getKernelCrashDumpKernelOptions() { return this.kernelCrashDumpKernelOptions; }
    public void setKernelCrashDumpKernelOptions(String kernelCrashDumpKernelOptions) { 
        this.kernelCrashDumpKernelOptions = kernelCrashDumpKernelOptions;
    }
    /** 
     **/
    public Long getKernelCrashDumpMakedumpfileLevel() { return this.kernelCrashDumpMakedumpfileLevel; }
    public void setKernelCrashDumpMakedumpfileLevel(Long kernelCrashDumpMakedumpfileLevel) { 
        this.kernelCrashDumpMakedumpfileLevel = kernelCrashDumpMakedumpfileLevel;
    }
    /** 
     **/
    public String getKernelCrashDumpDefaultState() { return this.kernelCrashDumpDefaultState; }
    public void setKernelCrashDumpDefaultState(String kernelCrashDumpDefaultState) { 
        this.kernelCrashDumpDefaultState = kernelCrashDumpDefaultState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KernelCrashDump that = (KernelCrashDump) o;
        return 
            Objects.equals(kernelCrashDumpMinFreeGb, that.kernelCrashDumpMinFreeGb) &&
            Objects.equals(kernelCrashDumpDirectory, that.kernelCrashDumpDirectory) &&
            Objects.equals(kernelCrashDumpKernelOptions, that.kernelCrashDumpKernelOptions) &&
            Objects.equals(kernelCrashDumpMakedumpfileLevel, that.kernelCrashDumpMakedumpfileLevel) &&
            Objects.equals(kernelCrashDumpDefaultState, that.kernelCrashDumpDefaultState);
    }

    @Override
    public int hashCode() {
        return Objects.hash( kernelCrashDumpMinFreeGb, kernelCrashDumpDirectory, kernelCrashDumpKernelOptions, kernelCrashDumpMakedumpfileLevel, kernelCrashDumpDefaultState );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("kernelCrashDumpMinFreeGb", kernelCrashDumpMinFreeGb);
        map.put("kernelCrashDumpDirectory", kernelCrashDumpDirectory);
        map.put("kernelCrashDumpKernelOptions", kernelCrashDumpKernelOptions);
        map.put("kernelCrashDumpMakedumpfileLevel", kernelCrashDumpMakedumpfileLevel);
        map.put("kernelCrashDumpDefaultState", kernelCrashDumpDefaultState);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" kernelCrashDumpMinFreeGb : ").append(kernelCrashDumpMinFreeGb).append(",");
        sb.append(" kernelCrashDumpDirectory : ").append(kernelCrashDumpDirectory).append(",");
        sb.append(" kernelCrashDumpKernelOptions : ").append(kernelCrashDumpKernelOptions).append(",");
        sb.append(" kernelCrashDumpMakedumpfileLevel : ").append(kernelCrashDumpMakedumpfileLevel).append(",");
        sb.append(" kernelCrashDumpDefaultState : ").append(kernelCrashDumpDefaultState).append(",");
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
        private Long kernelCrashDumpMinFreeGb;
        private String kernelCrashDumpDirectory;
        private String kernelCrashDumpKernelOptions;
        private Long kernelCrashDumpMakedumpfileLevel;
        private String kernelCrashDumpDefaultState;

        private Builder() { }

        public KernelCrashDump build() {
            return new KernelCrashDump (
                         this.kernelCrashDumpMinFreeGb,
                         this.kernelCrashDumpDirectory,
                         this.kernelCrashDumpKernelOptions,
                         this.kernelCrashDumpMakedumpfileLevel,
                         this.kernelCrashDumpDefaultState);
        }

        private KernelCrashDump.Builder buildFrom(final KernelCrashDump req) {
            this.kernelCrashDumpMinFreeGb = req.kernelCrashDumpMinFreeGb;
            this.kernelCrashDumpDirectory = req.kernelCrashDumpDirectory;
            this.kernelCrashDumpKernelOptions = req.kernelCrashDumpKernelOptions;
            this.kernelCrashDumpMakedumpfileLevel = req.kernelCrashDumpMakedumpfileLevel;
            this.kernelCrashDumpDefaultState = req.kernelCrashDumpDefaultState;

            return this;
        }

        public KernelCrashDump.Builder kernelCrashDumpMinFreeGb(final Long kernelCrashDumpMinFreeGb) {
            this.kernelCrashDumpMinFreeGb = kernelCrashDumpMinFreeGb;
            return this;
        }

        public KernelCrashDump.Builder kernelCrashDumpDirectory(final String kernelCrashDumpDirectory) {
            this.kernelCrashDumpDirectory = kernelCrashDumpDirectory;
            return this;
        }

        public KernelCrashDump.Builder kernelCrashDumpKernelOptions(final String kernelCrashDumpKernelOptions) {
            this.kernelCrashDumpKernelOptions = kernelCrashDumpKernelOptions;
            return this;
        }

        public KernelCrashDump.Builder kernelCrashDumpMakedumpfileLevel(final Long kernelCrashDumpMakedumpfileLevel) {
            this.kernelCrashDumpMakedumpfileLevel = kernelCrashDumpMakedumpfileLevel;
            return this;
        }

        public KernelCrashDump.Builder kernelCrashDumpDefaultState(final String kernelCrashDumpDefaultState) {
            this.kernelCrashDumpDefaultState = kernelCrashDumpDefaultState;
            return this;
        }

    }
}
