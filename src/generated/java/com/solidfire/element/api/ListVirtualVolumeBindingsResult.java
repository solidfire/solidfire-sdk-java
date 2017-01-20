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
 * ListVirtualVolumeBindingsResult  
 **/

public class ListVirtualVolumeBindingsResult implements Serializable {

    public static final long serialVersionUID = 5960294798445498415L;
    @SerializedName("bindings") private VirtualVolumeBinding[] bindings;

    // empty constructor
    @Since("7.0")
    public ListVirtualVolumeBindingsResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVirtualVolumeBindingsResult(
        VirtualVolumeBinding[] bindings
    )
    {
        this.bindings = bindings;
    }

    /** 
     * Describes the VVol <-> Host binding.
     **/
    public VirtualVolumeBinding[] getBindings() { return this.bindings; }
    public void setBindings(VirtualVolumeBinding[] bindings) { 
        this.bindings = bindings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualVolumeBindingsResult that = (ListVirtualVolumeBindingsResult) o;

        return 
            Arrays.equals(bindings, that.bindings);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])bindings );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("bindings", bindings);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" bindings : ").append(Arrays.toString(bindings)).append(",");
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
        private VirtualVolumeBinding[] bindings;

        private Builder() { }

        public ListVirtualVolumeBindingsResult build() {
            return new ListVirtualVolumeBindingsResult (
                         this.bindings);
        }

        private ListVirtualVolumeBindingsResult.Builder buildFrom(final ListVirtualVolumeBindingsResult req) {
            this.bindings = req.bindings;

            return this;
        }

        public ListVirtualVolumeBindingsResult.Builder bindings(final VirtualVolumeBinding[] bindings) {
            this.bindings = bindings;
            return this;
        }

    }
}
