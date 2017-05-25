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
 * ListServicesResult  
 **/

public class ListServicesResult implements Serializable {

    public static final long serialVersionUID = -1759750556897738456L;
    @SerializedName("services") private DetailedService[] services;
    // empty constructor
    @Since("7.0")
    public ListServicesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListServicesResult(
        DetailedService[] services
    )
    {
        this.services = services;
    }

    /** 
     * 
     **/
    public DetailedService[] getServices() { return this.services; }
    public void setServices(DetailedService[] services) { 
        this.services = services;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListServicesResult that = (ListServicesResult) o;

        return 
            Arrays.equals(services, that.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])services );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("services", services);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" services : ").append(Arrays.toString(services)).append(",");
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
        private DetailedService[] services;

        private Builder() { }

        public ListServicesResult build() {
            return new ListServicesResult (
                         this.services);
        }

        private ListServicesResult.Builder buildFrom(final ListServicesResult req) {
            this.services = req.services;

            return this;
        }

        public ListServicesResult.Builder services(final DetailedService[] services) {
            this.services = services;
            return this;
        }

    }
}
