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
 * ServiceReplicaBudget  
 **/

public class ServiceReplicaBudget implements Serializable {

    public static final long serialVersionUID = -5949814656238995766L;
    @SerializedName("serviceID") private Long serviceID;
    @SerializedName("budget") private Long budget;
    // empty constructor
    @Since("7.0")
    public ServiceReplicaBudget() {}

    
    // parameterized constructor
    @Since("7.0")
    public ServiceReplicaBudget(
        Long serviceID,
        Long budget
    )
    {
        this.serviceID = serviceID;
        this.budget = budget;
    }

    /** 
     * Service ID
     **/
    public Long getServiceID() { return this.serviceID; }
   
    public void setServiceID(Long serviceID) { 
        this.serviceID = serviceID;
    }
    /** 
     * Replica bin budget for this block service.
     **/
    public Long getBudget() { return this.budget; }
   
    public void setBudget(Long budget) { 
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceReplicaBudget that = (ServiceReplicaBudget) o;

        return 
            Objects.equals(serviceID, that.serviceID) && 
            Objects.equals(budget, that.budget);
    }

    @Override
    public int hashCode() {
        return Objects.hash( serviceID,budget );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("serviceID", serviceID);
        map.put("budget", budget);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" serviceID : ").append(gson.toJson(serviceID)).append(",");
        sb.append(" budget : ").append(gson.toJson(budget)).append(",");
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
        private Long budget;

        private Builder() { }

        public ServiceReplicaBudget build() {
            return new ServiceReplicaBudget (
                         this.serviceID,
                         this.budget);
        }

        private ServiceReplicaBudget.Builder buildFrom(final ServiceReplicaBudget req) {
            this.serviceID = req.serviceID;
            this.budget = req.budget;

            return this;
        }

        public ServiceReplicaBudget.Builder serviceID(final Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        public ServiceReplicaBudget.Builder budget(final Long budget) {
            this.budget = budget;
            return this;
        }

    }
}
