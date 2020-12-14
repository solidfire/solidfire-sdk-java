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
 * ServiceStrandedCapacity  
 **/

public class ServiceStrandedCapacity implements Serializable {

    public static final long serialVersionUID = -2743297895646902156L;
    @SerializedName("serviceID") private Long serviceID;
    @SerializedName("strandedCapacity") private Long strandedCapacity;
    // empty constructor
    @Since("7.0")
    public ServiceStrandedCapacity() {}

    
    // parameterized constructor
    @Since("7.0")
    public ServiceStrandedCapacity(
        Long serviceID,
        Long strandedCapacity
    )
    {
        this.serviceID = serviceID;
        this.strandedCapacity = strandedCapacity;
    }

    /** 
     * Service ID
     **/
    public Long getServiceID() { return this.serviceID; }
   
    public void setServiceID(Long serviceID) { 
        this.serviceID = serviceID;
    }
    /** 
     * Stranded capacity in bytes for a block service.
     **/
    public Long getStrandedCapacity() { return this.strandedCapacity; }
   
    public void setStrandedCapacity(Long strandedCapacity) { 
        this.strandedCapacity = strandedCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceStrandedCapacity that = (ServiceStrandedCapacity) o;

        return 
            Objects.equals(serviceID, that.serviceID) && 
            Objects.equals(strandedCapacity, that.strandedCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash( serviceID,strandedCapacity );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("serviceID", serviceID);
        map.put("strandedCapacity", strandedCapacity);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" serviceID : ").append(gson.toJson(serviceID)).append(",");
        sb.append(" strandedCapacity : ").append(gson.toJson(strandedCapacity)).append(",");
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
        private Long serviceID;
        private Long strandedCapacity;

        private Builder() { }

        public ServiceStrandedCapacity build() {
            return new ServiceStrandedCapacity (
                         this.serviceID,
                         this.strandedCapacity);
        }

        private ServiceStrandedCapacity.Builder buildFrom(final ServiceStrandedCapacity req) {
            this.serviceID = req.serviceID;
            this.strandedCapacity = req.strandedCapacity;

            return this;
        }

        public ServiceStrandedCapacity.Builder serviceID(final Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        public ServiceStrandedCapacity.Builder strandedCapacity(final Long strandedCapacity) {
            this.strandedCapacity = strandedCapacity;
            return this;
        }

    }
}
