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
 * ListVirtualNetworksResult  
 **/

public class ListVirtualNetworksResult implements Serializable {

    public static final long serialVersionUID = 7593064884478925014L;
    @SerializedName("virtualNetworks") private VirtualNetwork[] virtualNetworks;
    // empty constructor
    @Since("7.0")
    public ListVirtualNetworksResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListVirtualNetworksResult(
        VirtualNetwork[] virtualNetworks
    )
    {
        this.virtualNetworks = virtualNetworks;
    }

    /** 
     * Object containing virtual network IP addresses.
     **/
    public VirtualNetwork[] getVirtualNetworks() { return this.virtualNetworks; }
   
    public void setVirtualNetworks(VirtualNetwork[] virtualNetworks) { 
        this.virtualNetworks = virtualNetworks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualNetworksResult that = (ListVirtualNetworksResult) o;

        return 
            Arrays.equals(virtualNetworks, that.virtualNetworks);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])virtualNetworks );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualNetworks", virtualNetworks);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" virtualNetworks : ").append(gson.toJson(Arrays.toString(virtualNetworks))).append(",");
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
        private VirtualNetwork[] virtualNetworks;

        private Builder() { }

        public ListVirtualNetworksResult build() {
            return new ListVirtualNetworksResult (
                         this.virtualNetworks);
        }

        private ListVirtualNetworksResult.Builder buildFrom(final ListVirtualNetworksResult req) {
            this.virtualNetworks = req.virtualNetworks;

            return this;
        }

        public ListVirtualNetworksResult.Builder virtualNetworks(final VirtualNetwork[] virtualNetworks) {
            this.virtualNetworks = virtualNetworks;
            return this;
        }

    }
}
