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
 * AddVirtualNetworkResult  
 **/

public class AddVirtualNetworkResult implements Serializable {

    public static final long serialVersionUID = -684462985313881144L;
    @SerializedName("virtualNetworkID") private Long virtualNetworkID;

    // empty constructor
    @Since("7.0")
    public AddVirtualNetworkResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public AddVirtualNetworkResult(
        Long virtualNetworkID
    )
    {
        this.virtualNetworkID = virtualNetworkID;
    }

    /** 
     * The virtual network ID of the new virtual network.
     **/
    public Long getVirtualNetworkID() { return this.virtualNetworkID; }
    public void setVirtualNetworkID(Long virtualNetworkID) { 
        this.virtualNetworkID = virtualNetworkID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddVirtualNetworkResult that = (AddVirtualNetworkResult) o;

        return 
            Objects.equals(virtualNetworkID, that.virtualNetworkID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( virtualNetworkID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("virtualNetworkID", virtualNetworkID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" virtualNetworkID : ").append(virtualNetworkID).append(",");
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
        private Long virtualNetworkID;

        private Builder() { }

        public AddVirtualNetworkResult build() {
            return new AddVirtualNetworkResult (
                         this.virtualNetworkID);
        }

        private AddVirtualNetworkResult.Builder buildFrom(final AddVirtualNetworkResult req) {
            this.virtualNetworkID = req.virtualNetworkID;

            return this;
        }

        public AddVirtualNetworkResult.Builder virtualNetworkID(final Long virtualNetworkID) {
            this.virtualNetworkID = virtualNetworkID;
            return this;
        }

    }
}
