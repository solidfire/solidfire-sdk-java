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
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class VirtualVolumeUnsharedChunkResult implements Serializable {

    public static final long serialVersionUID = 8353668077409552607L;
    @SerializedName("chunks") private Long chunks;
    @SerializedName("scannedChunks") private Long scannedChunks;
    @SerializedName("chunkSize") private Long chunkSize;

    // empty constructor
    @Since("7.0")
    public VirtualVolumeUnsharedChunkResult() {}

    // parameterized constructor
    @Since("7.0")
    public VirtualVolumeUnsharedChunkResult(
        Long chunks,
        Long scannedChunks,
        Long chunkSize
    )
    {
        this.chunks = chunks;
        this.scannedChunks = scannedChunks;
        this.chunkSize = chunkSize;
    }

    /** 
     * Number of allocated/unshared chunks.
     **/
    public Long getChunks() { return this.chunks; }
    public void setChunks(Long chunks) { 
        this.chunks = chunks;
    }
    /** 
     * Number of chunks scanned.
     **/
    public Long getScannedChunks() { return this.scannedChunks; }
    public void setScannedChunks(Long scannedChunks) { 
        this.scannedChunks = scannedChunks;
    }
    /** 
     * Size of each chunk.
     **/
    public Long getChunkSize() { return this.chunkSize; }
    public void setChunkSize(Long chunkSize) { 
        this.chunkSize = chunkSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VirtualVolumeUnsharedChunkResult that = (VirtualVolumeUnsharedChunkResult) o;

        return 
            Objects.equals(chunks, that.chunks) &&
            Objects.equals(scannedChunks, that.scannedChunks) &&
            Objects.equals(chunkSize, that.chunkSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash( chunks, scannedChunks, chunkSize );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("chunks", chunks);
        map.put("scannedChunks", scannedChunks);
        map.put("chunkSize", chunkSize);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" chunks : ").append(chunks).append(",");
        sb.append(" scannedChunks : ").append(scannedChunks).append(",");
        sb.append(" chunkSize : ").append(chunkSize).append(",");
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
        private Long chunks;
        private Long scannedChunks;
        private Long chunkSize;

        private Builder() { }

        public VirtualVolumeUnsharedChunkResult build() {
            return new VirtualVolumeUnsharedChunkResult (
                         this.chunks,
                         this.scannedChunks,
                         this.chunkSize);
        }

        private VirtualVolumeUnsharedChunkResult.Builder buildFrom(final VirtualVolumeUnsharedChunkResult req) {
            this.chunks = req.chunks;
            this.scannedChunks = req.scannedChunks;
            this.chunkSize = req.chunkSize;

            return this;
        }

        public VirtualVolumeUnsharedChunkResult.Builder chunks(final Long chunks) {
            this.chunks = chunks;
            return this;
        }

        public VirtualVolumeUnsharedChunkResult.Builder scannedChunks(final Long scannedChunks) {
            this.scannedChunks = scannedChunks;
            return this;
        }

        public VirtualVolumeUnsharedChunkResult.Builder chunkSize(final Long chunkSize) {
            this.chunkSize = chunkSize;
            return this;
        }

    }
}
