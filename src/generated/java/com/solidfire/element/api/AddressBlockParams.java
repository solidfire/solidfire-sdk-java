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
 * AddressBlockParams  
 * Unique Range of IP addresses to include in the virtual network.
 **/

public class AddressBlockParams implements Serializable {

    public static final long serialVersionUID = 8392182782931215065L;
    @SerializedName("start") private String start;
    @SerializedName("size") private Long size;
    @SerializedName("available") private String available;
    // empty constructor
    @Since("7.0")
    public AddressBlockParams() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddressBlockParams(
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
     * dynamic bitset
     **/
    public String getAvailable() { return this.available; }
   
    public void setAvailable(String available) { 
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressBlockParams that = (AddressBlockParams) o;

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
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" start : ").append(gson.toJson(start)).append(",");
        sb.append(" size : ").append(gson.toJson(size)).append(",");
        sb.append(" available : ").append(gson.toJson(available)).append(",");
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

        public AddressBlockParams build() {
            return new AddressBlockParams (
                         this.start,
                         this.size,
                         this.available);
        }

        private AddressBlockParams.Builder buildFrom(final AddressBlockParams req) {
            this.start = req.start;
            this.size = req.size;
            this.available = req.available;

            return this;
        }

        public AddressBlockParams.Builder start(final String start) {
            this.start = start;
            return this;
        }

        public AddressBlockParams.Builder size(final Long size) {
            this.size = size;
            return this;
        }

        public AddressBlockParams.Builder available(final String available) {
            this.available = available;
            return this;
        }

    }
}
