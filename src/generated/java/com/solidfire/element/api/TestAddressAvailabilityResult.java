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
 * TestAddressAvailabilityResult  
 **/

public class TestAddressAvailabilityResult implements Serializable {

    public static final long serialVersionUID = 9062295799688061666L;
    @SerializedName("address") private String address;
    @SerializedName("available") private Boolean available;
    // empty constructor
    @Since("7.0")
    public TestAddressAvailabilityResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public TestAddressAvailabilityResult(
        String address,
        Boolean available
    )
    {
        this.address = address;
        this.available = available;
    }

    /** 
     * The IP address tested.
     **/
    public String getAddress() { return this.address; }
   
    public void setAddress(String address) { 
        this.address = address;
    }
    /** 
     * True if the requested IP address is in use, and false if it is not.
     **/
    public Boolean getAvailable() { return this.available; }
   
    public void setAvailable(Boolean available) { 
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestAddressAvailabilityResult that = (TestAddressAvailabilityResult) o;

        return 
            Objects.equals(address, that.address) && 
            Objects.equals(available, that.available);
    }

    @Override
    public int hashCode() {
        return Objects.hash( address,available );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("address", address);
        map.put("available", available);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" address : ").append(gson.toJson(address)).append(",");
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
        private String address;
        private Boolean available;

        private Builder() { }

        public TestAddressAvailabilityResult build() {
            return new TestAddressAvailabilityResult (
                         this.address,
                         this.available);
        }

        private TestAddressAvailabilityResult.Builder buildFrom(final TestAddressAvailabilityResult req) {
            this.address = req.address;
            this.available = req.available;

            return this;
        }

        public TestAddressAvailabilityResult.Builder address(final String address) {
            this.address = address;
            return this;
        }

        public TestAddressAvailabilityResult.Builder available(final Boolean available) {
            this.available = available;
            return this;
        }

    }
}
