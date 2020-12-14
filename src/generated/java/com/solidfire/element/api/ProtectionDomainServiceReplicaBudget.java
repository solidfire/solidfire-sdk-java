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
 * ProtectionDomainServiceReplicaBudget  
 **/

public class ProtectionDomainServiceReplicaBudget implements Serializable {

    public static final long serialVersionUID = -4901537701957575279L;
    @SerializedName("protectonDomainName") private String protectonDomainName;
    @SerializedName("services") private ServiceReplicaBudget[] services;
    // empty constructor
    @Since("7.0")
    public ProtectionDomainServiceReplicaBudget() {}

    
    // parameterized constructor
    @Since("7.0")
    public ProtectionDomainServiceReplicaBudget(
        String protectonDomainName,
        ServiceReplicaBudget[] services
    )
    {
        this.protectonDomainName = protectonDomainName;
        this.services = services;
    }

    /** 
     * Protecton domain name
     **/
    public String getProtectonDomainName() { return this.protectonDomainName; }
   
    public void setProtectonDomainName(String protectonDomainName) { 
        this.protectonDomainName = protectonDomainName;
    }
    /** 
     * Replica bin budget for each block service in this protection domain.
     **/
    public ServiceReplicaBudget[] getServices() { return this.services; }
   
    public void setServices(ServiceReplicaBudget[] services) { 
        this.services = services;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProtectionDomainServiceReplicaBudget that = (ProtectionDomainServiceReplicaBudget) o;

        return 
            Objects.equals(protectonDomainName, that.protectonDomainName) && 
            Arrays.equals(services, that.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash( protectonDomainName,(Object[])services );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("protectonDomainName", protectonDomainName);
        map.put("services", services);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" protectonDomainName : ").append(gson.toJson(protectonDomainName)).append(",");
        sb.append(" services : ").append(gson.toJson(Arrays.toString(services))).append(",");
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
        private String protectonDomainName;
        private ServiceReplicaBudget[] services;

        private Builder() { }

        public ProtectionDomainServiceReplicaBudget build() {
            return new ProtectionDomainServiceReplicaBudget (
                         this.protectonDomainName,
                         this.services);
        }

        private ProtectionDomainServiceReplicaBudget.Builder buildFrom(final ProtectionDomainServiceReplicaBudget req) {
            this.protectonDomainName = req.protectonDomainName;
            this.services = req.services;

            return this;
        }

        public ProtectionDomainServiceReplicaBudget.Builder protectonDomainName(final String protectonDomainName) {
            this.protectonDomainName = protectonDomainName;
            return this;
        }

        public ProtectionDomainServiceReplicaBudget.Builder services(final ServiceReplicaBudget[] services) {
            this.services = services;
            return this;
        }

    }
}
