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
 * Origin  
 **/

public class Origin implements Serializable {

    public static final long serialVersionUID = 3955882842214778931L;
    @SerializedName("<signature>") private Signature signature;
    @SerializedName("contract-date") private String contractDate;
    @SerializedName("contract-name") private String contractName;
    @SerializedName("contract-quantity") private Long contractQuantity;
    @SerializedName("contract-type") private String contractType;
    @SerializedName("integrator") private String integrator;
    @SerializedName("location") private String location;
    @SerializedName("organization") private String organization;
    @SerializedName("type") private String type;
    // empty constructor
    @Since("7.0")
    public Origin() {}

    
    // parameterized constructor
    @Since("7.0")
    public Origin(
        Signature signature,
        String contractDate,
        String contractName,
        Long contractQuantity,
        String contractType,
        String integrator,
        String location,
        String organization,
        String type
    )
    {
        this.signature = signature;
        this.contractDate = contractDate;
        this.contractName = contractName;
        this.contractQuantity = contractQuantity;
        this.contractType = contractType;
        this.integrator = integrator;
        this.location = location;
        this.organization = organization;
        this.type = type;
    }

    /** 
     * 
     **/
    public Signature getSignature() { return this.signature; }
   
    public void setSignature(Signature signature) { 
        this.signature = signature;
    }
    /** 
     * 
     **/
    public String getContractDate() { return this.contractDate; }
   
    public void setContractDate(String contractDate) { 
        this.contractDate = contractDate;
    }
    /** 
     * 
     **/
    public String getContractName() { return this.contractName; }
   
    public void setContractName(String contractName) { 
        this.contractName = contractName;
    }
    /** 
     * 
     **/
    public Long getContractQuantity() { return this.contractQuantity; }
   
    public void setContractQuantity(Long contractQuantity) { 
        this.contractQuantity = contractQuantity;
    }
    /** 
     * 
     **/
    public String getContractType() { return this.contractType; }
   
    public void setContractType(String contractType) { 
        this.contractType = contractType;
    }
    /** 
     * 
     **/
    public String getIntegrator() { return this.integrator; }
   
    public void setIntegrator(String integrator) { 
        this.integrator = integrator;
    }
    /** 
     * 
     **/
    public String getLocation() { return this.location; }
   
    public void setLocation(String location) { 
        this.location = location;
    }
    /** 
     * 
     **/
    public String getOrganization() { return this.organization; }
   
    public void setOrganization(String organization) { 
        this.organization = organization;
    }
    /** 
     * 
     **/
    public String getType() { return this.type; }
   
    public void setType(String type) { 
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Origin that = (Origin) o;

        return 
            Objects.equals(signature, that.signature) && 
            Objects.equals(contractDate, that.contractDate) && 
            Objects.equals(contractName, that.contractName) && 
            Objects.equals(contractQuantity, that.contractQuantity) && 
            Objects.equals(contractType, that.contractType) && 
            Objects.equals(integrator, that.integrator) && 
            Objects.equals(location, that.location) && 
            Objects.equals(organization, that.organization) && 
            Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash( signature,contractDate,contractName,contractQuantity,contractType,integrator,location,organization,type );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("signature", signature);
        map.put("contractDate", contractDate);
        map.put("contractName", contractName);
        map.put("contractQuantity", contractQuantity);
        map.put("contractType", contractType);
        map.put("integrator", integrator);
        map.put("location", location);
        map.put("organization", organization);
        map.put("type", type);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" signature : ").append(gson.toJson(signature)).append(",");
        sb.append(" contractDate : ").append(gson.toJson(contractDate)).append(",");
        sb.append(" contractName : ").append(gson.toJson(contractName)).append(",");
        sb.append(" contractQuantity : ").append(gson.toJson(contractQuantity)).append(",");
        sb.append(" contractType : ").append(gson.toJson(contractType)).append(",");
        sb.append(" integrator : ").append(gson.toJson(integrator)).append(",");
        sb.append(" location : ").append(gson.toJson(location)).append(",");
        sb.append(" organization : ").append(gson.toJson(organization)).append(",");
        sb.append(" type : ").append(gson.toJson(type)).append(",");
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
        private Signature signature;
        private String contractDate;
        private String contractName;
        private Long contractQuantity;
        private String contractType;
        private String integrator;
        private String location;
        private String organization;
        private String type;

        private Builder() { }

        public Origin build() {
            return new Origin (
                         this.signature,
                         this.contractDate,
                         this.contractName,
                         this.contractQuantity,
                         this.contractType,
                         this.integrator,
                         this.location,
                         this.organization,
                         this.type);
        }

        private Origin.Builder buildFrom(final Origin req) {
            this.signature = req.signature;
            this.contractDate = req.contractDate;
            this.contractName = req.contractName;
            this.contractQuantity = req.contractQuantity;
            this.contractType = req.contractType;
            this.integrator = req.integrator;
            this.location = req.location;
            this.organization = req.organization;
            this.type = req.type;

            return this;
        }

        public Origin.Builder signature(final Signature signature) {
            this.signature = signature;
            return this;
        }

        public Origin.Builder contractDate(final String contractDate) {
            this.contractDate = contractDate;
            return this;
        }

        public Origin.Builder contractName(final String contractName) {
            this.contractName = contractName;
            return this;
        }

        public Origin.Builder contractQuantity(final Long contractQuantity) {
            this.contractQuantity = contractQuantity;
            return this;
        }

        public Origin.Builder contractType(final String contractType) {
            this.contractType = contractType;
            return this;
        }

        public Origin.Builder integrator(final String integrator) {
            this.integrator = integrator;
            return this;
        }

        public Origin.Builder location(final String location) {
            this.location = location;
            return this;
        }

        public Origin.Builder organization(final String organization) {
            this.organization = organization;
            return this;
        }

        public Origin.Builder type(final String type) {
            this.type = type;
            return this;
        }

    }
}
