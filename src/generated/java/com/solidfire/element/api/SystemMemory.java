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
 * The amount of total, free, and used memory on the system.
 **/

public class SystemMemory implements Serializable {

    public static final long serialVersionUID = -5813705682608307518L;
    @SerializedName("free") private Long free;
    @SerializedName("total") private Long total;
    @SerializedName("used") private Long used;

    // empty constructor
    @Since("7.0")
    public SystemMemory() {}

    // parameterized constructor
    @Since("7.0")
    public SystemMemory(
        Long free,
        Long total,
        Long used
    )
    {
        this.free = free;
        this.total = total;
        this.used = used;
    }

    /** 
     **/
    public Long getFree() { return this.free; }
    public void setFree(Long free) { 
        this.free = free;
    }
    /** 
     **/
    public Long getTotal() { return this.total; }
    public void setTotal(Long total) { 
        this.total = total;
    }
    /** 
     **/
    public Long getUsed() { return this.used; }
    public void setUsed(Long used) { 
        this.used = used;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemMemory that = (SystemMemory) o;

        return 
            Objects.equals(free, that.free) &&
            Objects.equals(total, that.total) &&
            Objects.equals(used, that.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash( free, total, used );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("free", free);
        map.put("total", total);
        map.put("used", used);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" free : ").append(free).append(",");
        sb.append(" total : ").append(total).append(",");
        sb.append(" used : ").append(used).append(",");
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
        private Long free;
        private Long total;
        private Long used;

        private Builder() { }

        public SystemMemory build() {
            return new SystemMemory (
                         this.free,
                         this.total,
                         this.used);
        }

        private SystemMemory.Builder buildFrom(final SystemMemory req) {
            this.free = req.free;
            this.total = req.total;
            this.used = req.used;

            return this;
        }

        public SystemMemory.Builder free(final Long free) {
            this.free = free;
            return this;
        }

        public SystemMemory.Builder total(final Long total) {
            this.total = total;
            return this;
        }

        public SystemMemory.Builder used(final Long used) {
            this.used = used;
            return this;
        }

    }
}
