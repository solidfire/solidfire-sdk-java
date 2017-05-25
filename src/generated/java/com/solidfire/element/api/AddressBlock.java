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

import com.solidfire.core.client.Attributes;
import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * AddressBlock  
 * Unique Range of IP addresses to include in the virtual network.
 **/

public class AddressBlock implements Serializable {

    public static final long serialVersionUID = 5030063350807025932L;
    @SerializedName("start") private String start;
    @SerializedName("size") private Long size;
    @SerializedName("available") private String available;
    // empty constructor
    @Since("7.0")
    public AddressBlock() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddressBlock(
        String start,
        Long size,
        String available
    )
    {
        this.start = start;
        this.size = size;
        this.available = available;
    }

    /** 
     * Start of the IP address range.
     **/
    public String getStart() { return this.start; }
    public void setStart(String start) { 
        this.start = start;
    }
    /** 
     * Number of IP addresses to include in the block.
     **/
    public Long getSize() { return this.size; }
    public void setSize(Long size) { 
        this.size = size;
    }
    /** 
     * Nuber of available blocks
     **/
    public String getAvailable() { return this.available; }
    public void setAvailable(String available) { 
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressBlock that = (AddressBlock) o;

        return 
            Objects.equals(start, that.start) && 
            Objects.equals(size, that.size) && 
            Objects.equals(available, that.available);
    }

    @Override
    public int hashCode() {
        return Objects.hash( start,size,available );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("start", start);
        map.put("size", size);
        map.put("available", available);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" start : ").append(start).append(",");
        sb.append(" size : ").append(size).append(",");
        sb.append(" available : ").append(available).append(",");
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
        private String start;
        private Long size;
        private String available;

        private Builder() { }

        public AddressBlock build() {
            return new AddressBlock (
                         this.start,
                         this.size,
                         this.available);
        }

        private AddressBlock.Builder buildFrom(final AddressBlock req) {
            this.start = req.start;
            this.size = req.size;
            this.available = req.available;

            return this;
        }

        public AddressBlock.Builder start(final String start) {
            this.start = start;
            return this;
        }

        public AddressBlock.Builder size(final Long size) {
            this.size = size;
            return this;
        }

        public AddressBlock.Builder available(final String available) {
            this.available = available;
            return this;
        }

    }
}
