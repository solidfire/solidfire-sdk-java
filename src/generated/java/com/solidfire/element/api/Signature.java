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
 * Signature  
 **/

public class Signature implements Serializable {

    public static final long serialVersionUID = 6006039558308474583L;
    @SerializedName("data") private String data;
    @SerializedName("pubkey") private String pubkey;
    @SerializedName("version") private Long version;

    // empty constructor
    @Since("7.0")
    public Signature() {}

    
    // parameterized constructor
    @Since("7.0")
    public Signature(
        String data,
        String pubkey,
        Long version
    )
    {
        this.data = data;
        this.pubkey = pubkey;
        this.version = version;
    }

    /** 
     * 
     **/
    public String getData() { return this.data; }
    public void setData(String data) { 
        this.data = data;
    }
    /** 
     * 
     **/
    public String getPubkey() { return this.pubkey; }
    public void setPubkey(String pubkey) { 
        this.pubkey = pubkey;
    }
    /** 
     * 
     **/
    public Long getVersion() { return this.version; }
    public void setVersion(Long version) { 
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Signature that = (Signature) o;

        return 
            Objects.equals(data, that.data) && 
            Objects.equals(pubkey, that.pubkey) && 
            Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash( data,pubkey,version );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("data", data);
        map.put("pubkey", pubkey);
        map.put("version", version);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" data : ").append(data).append(",");
        sb.append(" pubkey : ").append(pubkey).append(",");
        sb.append(" version : ").append(version).append(",");
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
        private String data;
        private String pubkey;
        private Long version;

        private Builder() { }

        public Signature build() {
            return new Signature (
                         this.data,
                         this.pubkey,
                         this.version);
        }

        private Signature.Builder buildFrom(final Signature req) {
            this.data = req.data;
            this.pubkey = req.pubkey;
            this.version = req.version;

            return this;
        }

        public Signature.Builder data(final String data) {
            this.data = data;
            return this;
        }

        public Signature.Builder pubkey(final String pubkey) {
            this.pubkey = pubkey;
            return this;
        }

        public Signature.Builder version(final Long version) {
            this.version = version;
            return this;
        }

    }
}
