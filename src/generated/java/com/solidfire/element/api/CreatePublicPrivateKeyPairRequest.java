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
 * CreatePublicPrivateKeyPairRequest  
 * Creates SSL public and private keys. These keys can be used to generate Certificate Sign Requests.
 * There can be only one key pair in use for the cluster. To replace the existing keys, make sure that they are not being used by any providers before invoking this API.
 **/

public class CreatePublicPrivateKeyPairRequest implements Serializable {

    public static final long serialVersionUID = -1487017750162282280L;
    @SerializedName("commonName") private Optional<String> commonName;
    @SerializedName("organization") private Optional<String> organization;
    @SerializedName("organizationalUnit") private Optional<String> organizationalUnit;
    @SerializedName("locality") private Optional<String> locality;
    @SerializedName("state") private Optional<String> state;
    @SerializedName("country") private Optional<String> country;
    @SerializedName("emailAddress") private Optional<String> emailAddress;
    // empty constructor
    @Since("7.0")
    public CreatePublicPrivateKeyPairRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public CreatePublicPrivateKeyPairRequest(
        Optional<String> commonName,
        Optional<String> organization,
        Optional<String> organizationalUnit,
        Optional<String> locality,
        Optional<String> state,
        Optional<String> country,
        Optional<String> emailAddress
    )
    {
        this.commonName = (commonName == null) ? Optional.<String>empty() : commonName;
        this.organization = (organization == null) ? Optional.<String>empty() : organization;
        this.organizationalUnit = (organizationalUnit == null) ? Optional.<String>empty() : organizationalUnit;
        this.locality = (locality == null) ? Optional.<String>empty() : locality;
        this.state = (state == null) ? Optional.<String>empty() : state;
        this.country = (country == null) ? Optional.<String>empty() : country;
        this.emailAddress = (emailAddress == null) ? Optional.<String>empty() : emailAddress;
    }

    /** 
     * This is the X.509 distinguished name Common Name field (CN).
     **/
    public Optional<String> getCommonName() { return this.commonName; }
   
    public void setCommonName(Optional<String> commonName) { 
        this.commonName = (commonName == null) ? Optional.<String>empty() : commonName;
    }
    /** 
     * This is the X.509 distinguished name Organization Name field (O).
     **/
    public Optional<String> getOrganization() { return this.organization; }
   
    public void setOrganization(Optional<String> organization) { 
        this.organization = (organization == null) ? Optional.<String>empty() : organization;
    }
    /** 
     * This is the X.509 distinguished name Organizational Unit Name field (OU).
     **/
    public Optional<String> getOrganizationalUnit() { return this.organizationalUnit; }
   
    public void setOrganizationalUnit(Optional<String> organizationalUnit) { 
        this.organizationalUnit = (organizationalUnit == null) ? Optional.<String>empty() : organizationalUnit;
    }
    /** 
     * This is the X.509 distinguished name Locality Name field (L).
     **/
    public Optional<String> getLocality() { return this.locality; }
   
    public void setLocality(Optional<String> locality) { 
        this.locality = (locality == null) ? Optional.<String>empty() : locality;
    }
    /** 
     * This is the X.509 distinguished name State or Province Name field (ST or SP or S).
     **/
    public Optional<String> getState() { return this.state; }
   
    public void setState(Optional<String> state) { 
        this.state = (state == null) ? Optional.<String>empty() : state;
    }
    /** 
     * This is the X.509 distinguished name Country field (C).
     **/
    public Optional<String> getCountry() { return this.country; }
   
    public void setCountry(Optional<String> country) { 
        this.country = (country == null) ? Optional.<String>empty() : country;
    }
    /** 
     * This is the X.509 distinguished name Email Address field (MAIL).
     **/
    public Optional<String> getEmailAddress() { return this.emailAddress; }
   
    public void setEmailAddress(Optional<String> emailAddress) { 
        this.emailAddress = (emailAddress == null) ? Optional.<String>empty() : emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreatePublicPrivateKeyPairRequest that = (CreatePublicPrivateKeyPairRequest) o;

        return 
            Objects.equals(commonName, that.commonName) && 
            Objects.equals(organization, that.organization) && 
            Objects.equals(organizationalUnit, that.organizationalUnit) && 
            Objects.equals(locality, that.locality) && 
            Objects.equals(state, that.state) && 
            Objects.equals(country, that.country) && 
            Objects.equals(emailAddress, that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash( commonName,organization,organizationalUnit,locality,state,country,emailAddress );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("commonName", commonName);
        map.put("organization", organization);
        map.put("organizationalUnit", organizationalUnit);
        map.put("locality", locality);
        map.put("state", state);
        map.put("country", country);
        map.put("emailAddress", emailAddress);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != commonName && commonName.isPresent()){
            sb.append(" commonName : ").append(gson.toJson(commonName)).append(",");
        }
        else{
            sb.append(" commonName : ").append("null").append(",");
        }
        if(null != organization && organization.isPresent()){
            sb.append(" organization : ").append(gson.toJson(organization)).append(",");
        }
        else{
            sb.append(" organization : ").append("null").append(",");
        }
        if(null != organizationalUnit && organizationalUnit.isPresent()){
            sb.append(" organizationalUnit : ").append(gson.toJson(organizationalUnit)).append(",");
        }
        else{
            sb.append(" organizationalUnit : ").append("null").append(",");
        }
        if(null != locality && locality.isPresent()){
            sb.append(" locality : ").append(gson.toJson(locality)).append(",");
        }
        else{
            sb.append(" locality : ").append("null").append(",");
        }
        if(null != state && state.isPresent()){
            sb.append(" state : ").append(gson.toJson(state)).append(",");
        }
        else{
            sb.append(" state : ").append("null").append(",");
        }
        if(null != country && country.isPresent()){
            sb.append(" country : ").append(gson.toJson(country)).append(",");
        }
        else{
            sb.append(" country : ").append("null").append(",");
        }
        if(null != emailAddress && emailAddress.isPresent()){
            sb.append(" emailAddress : ").append(gson.toJson(emailAddress)).append(",");
        }
        else{
            sb.append(" emailAddress : ").append("null").append(",");
        }
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
        private Optional<String> commonName;
        private Optional<String> organization;
        private Optional<String> organizationalUnit;
        private Optional<String> locality;
        private Optional<String> state;
        private Optional<String> country;
        private Optional<String> emailAddress;

        private Builder() { }

        public CreatePublicPrivateKeyPairRequest build() {
            return new CreatePublicPrivateKeyPairRequest (
                         this.commonName,
                         this.organization,
                         this.organizationalUnit,
                         this.locality,
                         this.state,
                         this.country,
                         this.emailAddress);
        }

        private CreatePublicPrivateKeyPairRequest.Builder buildFrom(final CreatePublicPrivateKeyPairRequest req) {
            this.commonName = req.commonName;
            this.organization = req.organization;
            this.organizationalUnit = req.organizationalUnit;
            this.locality = req.locality;
            this.state = req.state;
            this.country = req.country;
            this.emailAddress = req.emailAddress;

            return this;
        }

        public CreatePublicPrivateKeyPairRequest.Builder optionalCommonName(final String commonName) {
            this.commonName = (commonName == null) ? Optional.<String>empty() : Optional.of(commonName);
            return this;
        }

        public CreatePublicPrivateKeyPairRequest.Builder optionalOrganization(final String organization) {
            this.organization = (organization == null) ? Optional.<String>empty() : Optional.of(organization);
            return this;
        }

        public CreatePublicPrivateKeyPairRequest.Builder optionalOrganizationalUnit(final String organizationalUnit) {
            this.organizationalUnit = (organizationalUnit == null) ? Optional.<String>empty() : Optional.of(organizationalUnit);
            return this;
        }

        public CreatePublicPrivateKeyPairRequest.Builder optionalLocality(final String locality) {
            this.locality = (locality == null) ? Optional.<String>empty() : Optional.of(locality);
            return this;
        }

        public CreatePublicPrivateKeyPairRequest.Builder optionalState(final String state) {
            this.state = (state == null) ? Optional.<String>empty() : Optional.of(state);
            return this;
        }

        public CreatePublicPrivateKeyPairRequest.Builder optionalCountry(final String country) {
            this.country = (country == null) ? Optional.<String>empty() : Optional.of(country);
            return this;
        }

        public CreatePublicPrivateKeyPairRequest.Builder optionalEmailAddress(final String emailAddress) {
            this.emailAddress = (emailAddress == null) ? Optional.<String>empty() : Optional.of(emailAddress);
            return this;
        }

    }
}
