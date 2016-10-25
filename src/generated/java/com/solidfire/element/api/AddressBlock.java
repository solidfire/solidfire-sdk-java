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
 * Unique Range of IP addresses to include in the virtual network.
 **/
public class AddressBlock  implements Serializable  {

    private static final long serialVersionUID = -867125400L;

    @SerializedName("start") private String start;
    @SerializedName("size") private Long size;

    /**
     * Unique Range of IP addresses to include in the virtual network.
     * @param start [required] Start of the IP address range.
     * @param size [required] Number of IP addresses to include in the block.
     * @since 7.0
     **/
    @Since("7.0")
    public AddressBlock(String start, Long size) {
        this.start = start;
        this.size = size;
    }

    
    /**
     * Unique Range of IP addresses to include in the virtual network.
     * Empty constructor to support serialization.
     * @since 7.0
     **/
    @Since("7.0")
    public AddressBlock() {}


    /**
     * Start of the IP address range.
     **/
    public String getStart() {
        return this.start;
    }

    public void setStart(String start) {
        this.start = start;
    }



    /**
     * Number of IP addresses to include in the block.
     **/
    public Long getSize() {
        return this.size;
    }

    public void setSize(Long size) {
        this.size = size;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressBlock that = (AddressBlock) o;
        

        return Objects.equals( start , that.start )
            && Objects.equals( size , that.size );
    }

    @Override
    public int hashCode() {
        return Objects.hash( start, size );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" start : ").append(start).append(",");
        sb.append(" size : ").append(size);
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

        private Builder() { }

        public AddressBlock build() {
            return new AddressBlock (
                         this.start,
                         this.size            );
        }

        private AddressBlock.Builder buildFrom(final AddressBlock req) {
            this.start = req.start;
            this.size = req.size;

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

    }

}
