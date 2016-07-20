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

import com.google.gson.annotations.SerializedName;
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
 * The object returned by the "ListVirtualNetworks" API Service call.
 **/
public class ListVirtualNetworksResult implements Serializable {

    private static final long serialVersionUID = 1225836365L;

    @SerializedName("virtualNetworks") private final VirtualNetwork[] virtualNetworks;

    /**
     * The object returned by the "ListVirtualNetworks" API Service call.
     * @param virtualNetworks [required] Object containing virtual network IP addresses.
     * @since 7.0
     **/
    @Since("7.0")
    public ListVirtualNetworksResult(VirtualNetwork[] virtualNetworks) {
        this.virtualNetworks = virtualNetworks;
    }


    /**
     * Object containing virtual network IP addresses.
     **/
    public VirtualNetwork[] getVirtualNetworks() {
        return this.virtualNetworks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListVirtualNetworksResult that = (ListVirtualNetworksResult) o;
        

        return Objects.deepEquals( virtualNetworks , that.virtualNetworks );
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object) virtualNetworks );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualNetworks : ").append(Arrays.toString(virtualNetworks));
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
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
                         this.virtualNetworks            );
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
