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
 * BlockSizeHistogram  
 **/

public class BlockSizeHistogram implements Serializable {

    public static final long serialVersionUID = 5194308614406399074L;
    @SerializedName("Bucket512To4095") private Long bucket512To4095;
    @SerializedName("bucket4096to8191") private Long bucket4096to8191;
    @SerializedName("Bucket8192To16383") private Long bucket8192To16383;
    @SerializedName("Bucket16384To32767") private Long bucket16384To32767;
    @SerializedName("Bucket32768To65535") private Long bucket32768To65535;
    @SerializedName("Bucket65536To131071") private Long bucket65536To131071;
    @SerializedName("Bucket131072Plus") private Long bucket131072Plus;
    // empty constructor
    @Since("7.0")
    public BlockSizeHistogram() {}

    
    // parameterized constructor
    @Since("7.0")
    public BlockSizeHistogram(
        Long bucket512To4095,
        Long bucket4096to8191,
        Long bucket8192To16383,
        Long bucket16384To32767,
        Long bucket32768To65535,
        Long bucket65536To131071,
        Long bucket131072Plus
    )
    {
        this.bucket512To4095 = bucket512To4095;
        this.bucket4096to8191 = bucket4096to8191;
        this.bucket8192To16383 = bucket8192To16383;
        this.bucket16384To32767 = bucket16384To32767;
        this.bucket32768To65535 = bucket32768To65535;
        this.bucket65536To131071 = bucket65536To131071;
        this.bucket131072Plus = bucket131072Plus;
    }

    /** 
     * Number of block size samples between 512 and 4095 bytes
     **/
    public Long getBucket512To4095() { return this.bucket512To4095; }
   
    public void setBucket512To4095(Long bucket512To4095) { 
        this.bucket512To4095 = bucket512To4095;
    }
    /** 
     * Number of block size samples between 4096 and 8191 bytes
     **/
    public Long getBucket4096to8191() { return this.bucket4096to8191; }
   
    public void setBucket4096to8191(Long bucket4096to8191) { 
        this.bucket4096to8191 = bucket4096to8191;
    }
    /** 
     * Number of block size samples between 8192 and 16383 bytes
     **/
    public Long getBucket8192To16383() { return this.bucket8192To16383; }
   
    public void setBucket8192To16383(Long bucket8192To16383) { 
        this.bucket8192To16383 = bucket8192To16383;
    }
    /** 
     * Number of block size samples between 16384 and 32767 bytes
     **/
    public Long getBucket16384To32767() { return this.bucket16384To32767; }
   
    public void setBucket16384To32767(Long bucket16384To32767) { 
        this.bucket16384To32767 = bucket16384To32767;
    }
    /** 
     * Number of block size samples between 32768 and 65535 bytes
     **/
    public Long getBucket32768To65535() { return this.bucket32768To65535; }
   
    public void setBucket32768To65535(Long bucket32768To65535) { 
        this.bucket32768To65535 = bucket32768To65535;
    }
    /** 
     * Number of block size samples between 65536 and 131071 bytes
     **/
    public Long getBucket65536To131071() { return this.bucket65536To131071; }
   
    public void setBucket65536To131071(Long bucket65536To131071) { 
        this.bucket65536To131071 = bucket65536To131071;
    }
    /** 
     * Number of block size samples greater than or equal to 131072 bytes
     **/
    public Long getBucket131072Plus() { return this.bucket131072Plus; }
   
    public void setBucket131072Plus(Long bucket131072Plus) { 
        this.bucket131072Plus = bucket131072Plus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlockSizeHistogram that = (BlockSizeHistogram) o;

        return 
            Objects.equals(bucket512To4095, that.bucket512To4095) && 
            Objects.equals(bucket4096to8191, that.bucket4096to8191) && 
            Objects.equals(bucket8192To16383, that.bucket8192To16383) && 
            Objects.equals(bucket16384To32767, that.bucket16384To32767) && 
            Objects.equals(bucket32768To65535, that.bucket32768To65535) && 
            Objects.equals(bucket65536To131071, that.bucket65536To131071) && 
            Objects.equals(bucket131072Plus, that.bucket131072Plus);
    }

    @Override
    public int hashCode() {
        return Objects.hash( bucket512To4095,bucket4096to8191,bucket8192To16383,bucket16384To32767,bucket32768To65535,bucket65536To131071,bucket131072Plus );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("bucket512To4095", bucket512To4095);
        map.put("bucket4096to8191", bucket4096to8191);
        map.put("bucket8192To16383", bucket8192To16383);
        map.put("bucket16384To32767", bucket16384To32767);
        map.put("bucket32768To65535", bucket32768To65535);
        map.put("bucket65536To131071", bucket65536To131071);
        map.put("bucket131072Plus", bucket131072Plus);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" bucket512To4095 : ").append(gson.toJson(bucket512To4095)).append(",");
        sb.append(" bucket4096to8191 : ").append(gson.toJson(bucket4096to8191)).append(",");
        sb.append(" bucket8192To16383 : ").append(gson.toJson(bucket8192To16383)).append(",");
        sb.append(" bucket16384To32767 : ").append(gson.toJson(bucket16384To32767)).append(",");
        sb.append(" bucket32768To65535 : ").append(gson.toJson(bucket32768To65535)).append(",");
        sb.append(" bucket65536To131071 : ").append(gson.toJson(bucket65536To131071)).append(",");
        sb.append(" bucket131072Plus : ").append(gson.toJson(bucket131072Plus)).append(",");
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
        private Long bucket512To4095;
        private Long bucket4096to8191;
        private Long bucket8192To16383;
        private Long bucket16384To32767;
        private Long bucket32768To65535;
        private Long bucket65536To131071;
        private Long bucket131072Plus;

        private Builder() { }

        public BlockSizeHistogram build() {
            return new BlockSizeHistogram (
                         this.bucket512To4095,
                         this.bucket4096to8191,
                         this.bucket8192To16383,
                         this.bucket16384To32767,
                         this.bucket32768To65535,
                         this.bucket65536To131071,
                         this.bucket131072Plus);
        }

        private BlockSizeHistogram.Builder buildFrom(final BlockSizeHistogram req) {
            this.bucket512To4095 = req.bucket512To4095;
            this.bucket4096to8191 = req.bucket4096to8191;
            this.bucket8192To16383 = req.bucket8192To16383;
            this.bucket16384To32767 = req.bucket16384To32767;
            this.bucket32768To65535 = req.bucket32768To65535;
            this.bucket65536To131071 = req.bucket65536To131071;
            this.bucket131072Plus = req.bucket131072Plus;

            return this;
        }

        public BlockSizeHistogram.Builder bucket512To4095(final Long bucket512To4095) {
            this.bucket512To4095 = bucket512To4095;
            return this;
        }

        public BlockSizeHistogram.Builder bucket4096to8191(final Long bucket4096to8191) {
            this.bucket4096to8191 = bucket4096to8191;
            return this;
        }

        public BlockSizeHistogram.Builder bucket8192To16383(final Long bucket8192To16383) {
            this.bucket8192To16383 = bucket8192To16383;
            return this;
        }

        public BlockSizeHistogram.Builder bucket16384To32767(final Long bucket16384To32767) {
            this.bucket16384To32767 = bucket16384To32767;
            return this;
        }

        public BlockSizeHistogram.Builder bucket32768To65535(final Long bucket32768To65535) {
            this.bucket32768To65535 = bucket32768To65535;
            return this;
        }

        public BlockSizeHistogram.Builder bucket65536To131071(final Long bucket65536To131071) {
            this.bucket65536To131071 = bucket65536To131071;
            return this;
        }

        public BlockSizeHistogram.Builder bucket131072Plus(final Long bucket131072Plus) {
            this.bucket131072Plus = bucket131072Plus;
            return this;
        }

    }
}
