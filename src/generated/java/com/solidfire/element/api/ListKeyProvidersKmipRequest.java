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
 * ListKeyProvidersKmipRequest  
 * Returns the list of KMIP (Key Management Interoperability Protocol) Key Providers which have been created via CreateKeyProviderKmip.  The list can optionally be filtered by specifying additional parameters.
 **/

public class ListKeyProvidersKmipRequest implements Serializable {

    public static final long serialVersionUID = 7406430979916834950L;
    @SerializedName("keyProviderIsActive") private Optional<Boolean> keyProviderIsActive;
    @SerializedName("kmipKeyProviderHasServerAssigned") private Optional<Boolean> kmipKeyProviderHasServerAssigned;
    // empty constructor
    @Since("7.0")
    public ListKeyProvidersKmipRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListKeyProvidersKmipRequest(
        Optional<Boolean> keyProviderIsActive,
        Optional<Boolean> kmipKeyProviderHasServerAssigned
    )
    {
        this.keyProviderIsActive = (keyProviderIsActive == null) ? Optional.<Boolean>empty() : keyProviderIsActive;
        this.kmipKeyProviderHasServerAssigned = (kmipKeyProviderHasServerAssigned == null) ? Optional.<Boolean>empty() : kmipKeyProviderHasServerAssigned;
    }

    /** 
     * If omitted, returned KMIP Key Provider objects will not be filtered based on whether they're active.
     * If true, returns only KMIP Key Provider objects which are active (providing keys which are currently in use).
     * If false, returns only KMIP Key Provider objects which are inactive (not providing any keys and able to be deleted).
     **/
    public Optional<Boolean> getKeyProviderIsActive() { return this.keyProviderIsActive; }
   
    public void setKeyProviderIsActive(Optional<Boolean> keyProviderIsActive) { 
        this.keyProviderIsActive = (keyProviderIsActive == null) ? Optional.<Boolean>empty() : keyProviderIsActive;
    }
    /** 
     * If omitted, returned KMIP Key Provider objects will not be filtered based on whether they have a KMIP Key Server assigned.
     * If true, returns only KMIP Key Provider objects which have a KMIP Key Server assigned.
     * If false, returns only KMIP Key Provider objects which do not have a KMIP Key Server assigned.
     **/
    public Optional<Boolean> getKmipKeyProviderHasServerAssigned() { return this.kmipKeyProviderHasServerAssigned; }
   
    public void setKmipKeyProviderHasServerAssigned(Optional<Boolean> kmipKeyProviderHasServerAssigned) { 
        this.kmipKeyProviderHasServerAssigned = (kmipKeyProviderHasServerAssigned == null) ? Optional.<Boolean>empty() : kmipKeyProviderHasServerAssigned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListKeyProvidersKmipRequest that = (ListKeyProvidersKmipRequest) o;

        return 
            Objects.equals(keyProviderIsActive, that.keyProviderIsActive) && 
            Objects.equals(kmipKeyProviderHasServerAssigned, that.kmipKeyProviderHasServerAssigned);
    }

    @Override
    public int hashCode() {
        return Objects.hash( keyProviderIsActive,kmipKeyProviderHasServerAssigned );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("keyProviderIsActive", keyProviderIsActive);
        map.put("kmipKeyProviderHasServerAssigned", kmipKeyProviderHasServerAssigned);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != keyProviderIsActive && keyProviderIsActive.isPresent()){
            sb.append(" keyProviderIsActive : ").append(gson.toJson(keyProviderIsActive)).append(",");
        }
        else{
            sb.append(" keyProviderIsActive : ").append("null").append(",");
        }
        if(null != kmipKeyProviderHasServerAssigned && kmipKeyProviderHasServerAssigned.isPresent()){
            sb.append(" kmipKeyProviderHasServerAssigned : ").append(gson.toJson(kmipKeyProviderHasServerAssigned)).append(",");
        }
        else{
            sb.append(" kmipKeyProviderHasServerAssigned : ").append("null").append(",");
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
        private Optional<Boolean> keyProviderIsActive;
        private Optional<Boolean> kmipKeyProviderHasServerAssigned;

        private Builder() { }

        public ListKeyProvidersKmipRequest build() {
            return new ListKeyProvidersKmipRequest (
                         this.keyProviderIsActive,
                         this.kmipKeyProviderHasServerAssigned);
        }

        private ListKeyProvidersKmipRequest.Builder buildFrom(final ListKeyProvidersKmipRequest req) {
            this.keyProviderIsActive = req.keyProviderIsActive;
            this.kmipKeyProviderHasServerAssigned = req.kmipKeyProviderHasServerAssigned;

            return this;
        }

        public ListKeyProvidersKmipRequest.Builder optionalKeyProviderIsActive(final Boolean keyProviderIsActive) {
            this.keyProviderIsActive = (keyProviderIsActive == null) ? Optional.<Boolean>empty() : Optional.of(keyProviderIsActive);
            return this;
        }

        public ListKeyProvidersKmipRequest.Builder optionalKmipKeyProviderHasServerAssigned(final Boolean kmipKeyProviderHasServerAssigned) {
            this.kmipKeyProviderHasServerAssigned = (kmipKeyProviderHasServerAssigned == null) ? Optional.<Boolean>empty() : Optional.of(kmipKeyProviderHasServerAssigned);
            return this;
        }

    }
}
