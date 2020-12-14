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
 * ListKeyServersKmipRequest  
 * Returns the list of KMIP (Key Management Interoperability Protocol) Key Servers which have been created via CreateKeyServerKmip.  The list can optionally be filtered by specifying additional parameters.
 **/

public class ListKeyServersKmipRequest implements Serializable {

    public static final long serialVersionUID = -632220924420418909L;
    @SerializedName("keyProviderID") private Optional<Long> keyProviderID;
    @SerializedName("kmipAssignedProviderIsActive") private Optional<Boolean> kmipAssignedProviderIsActive;
    @SerializedName("kmipHasProviderAssigned") private Optional<Boolean> kmipHasProviderAssigned;
    // empty constructor
    @Since("7.0")
    public ListKeyServersKmipRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListKeyServersKmipRequest(
        Optional<Long> keyProviderID,
        Optional<Boolean> kmipAssignedProviderIsActive,
        Optional<Boolean> kmipHasProviderAssigned
    )
    {
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
        this.kmipAssignedProviderIsActive = (kmipAssignedProviderIsActive == null) ? Optional.<Boolean>empty() : kmipAssignedProviderIsActive;
        this.kmipHasProviderAssigned = (kmipHasProviderAssigned == null) ? Optional.<Boolean>empty() : kmipHasProviderAssigned;
    }

    /** 
     * If omitted, returned KMIP Key Server objects will not be filtered based on whether they're assigned to the specified KMIP Key Provider.
     * If specified, returned KMIP Key Server objects will be filtered to those assigned to the specified KMIP Key Provider.
     **/
    public Optional<Long> getKeyProviderID() { return this.keyProviderID; }
   
    public void setKeyProviderID(Optional<Long> keyProviderID) { 
        this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : keyProviderID;
    }
    /** 
     * If omitted, returned KMIP Key Server objects will not be filtered based on whether they're active.
     * If true, returns only KMIP Key Server objects which are active (providing keys which are currently in use).
     * If false, returns only KMIP Key Server objects which are inactive (not providing any keys and able to be deleted).
     **/
    public Optional<Boolean> getKmipAssignedProviderIsActive() { return this.kmipAssignedProviderIsActive; }
   
    public void setKmipAssignedProviderIsActive(Optional<Boolean> kmipAssignedProviderIsActive) { 
        this.kmipAssignedProviderIsActive = (kmipAssignedProviderIsActive == null) ? Optional.<Boolean>empty() : kmipAssignedProviderIsActive;
    }
    /** 
     * If omitted, returned KMIP Key Server objects will not be filtered based on whether they have a KMIP Key Provider assigned.
     * If true, returns only KMIP Key Server objects which have a KMIP Key Provider assigned.
     * If false, returns only KMIP Key Server objects which do not have a KMIP Key Provider assigned.
     **/
    public Optional<Boolean> getKmipHasProviderAssigned() { return this.kmipHasProviderAssigned; }
   
    public void setKmipHasProviderAssigned(Optional<Boolean> kmipHasProviderAssigned) { 
        this.kmipHasProviderAssigned = (kmipHasProviderAssigned == null) ? Optional.<Boolean>empty() : kmipHasProviderAssigned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListKeyServersKmipRequest that = (ListKeyServersKmipRequest) o;

        return 
            Objects.equals(keyProviderID, that.keyProviderID) && 
            Objects.equals(kmipAssignedProviderIsActive, that.kmipAssignedProviderIsActive) && 
            Objects.equals(kmipHasProviderAssigned, that.kmipHasProviderAssigned);
    }

    @Override
    public int hashCode() {
        return Objects.hash( keyProviderID,kmipAssignedProviderIsActive,kmipHasProviderAssigned );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("keyProviderID", keyProviderID);
        map.put("kmipAssignedProviderIsActive", kmipAssignedProviderIsActive);
        map.put("kmipHasProviderAssigned", kmipHasProviderAssigned);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != keyProviderID && keyProviderID.isPresent()){
            sb.append(" keyProviderID : ").append(gson.toJson(keyProviderID)).append(",");
        }
        else{
            sb.append(" keyProviderID : ").append("null").append(",");
        }
        if(null != kmipAssignedProviderIsActive && kmipAssignedProviderIsActive.isPresent()){
            sb.append(" kmipAssignedProviderIsActive : ").append(gson.toJson(kmipAssignedProviderIsActive)).append(",");
        }
        else{
            sb.append(" kmipAssignedProviderIsActive : ").append("null").append(",");
        }
        if(null != kmipHasProviderAssigned && kmipHasProviderAssigned.isPresent()){
            sb.append(" kmipHasProviderAssigned : ").append(gson.toJson(kmipHasProviderAssigned)).append(",");
        }
        else{
            sb.append(" kmipHasProviderAssigned : ").append("null").append(",");
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
        private Optional<Long> keyProviderID;
        private Optional<Boolean> kmipAssignedProviderIsActive;
        private Optional<Boolean> kmipHasProviderAssigned;

        private Builder() { }

        public ListKeyServersKmipRequest build() {
            return new ListKeyServersKmipRequest (
                         this.keyProviderID,
                         this.kmipAssignedProviderIsActive,
                         this.kmipHasProviderAssigned);
        }

        private ListKeyServersKmipRequest.Builder buildFrom(final ListKeyServersKmipRequest req) {
            this.keyProviderID = req.keyProviderID;
            this.kmipAssignedProviderIsActive = req.kmipAssignedProviderIsActive;
            this.kmipHasProviderAssigned = req.kmipHasProviderAssigned;

            return this;
        }

        public ListKeyServersKmipRequest.Builder optionalKeyProviderID(final Long keyProviderID) {
            this.keyProviderID = (keyProviderID == null) ? Optional.<Long>empty() : Optional.of(keyProviderID);
            return this;
        }

        public ListKeyServersKmipRequest.Builder optionalKmipAssignedProviderIsActive(final Boolean kmipAssignedProviderIsActive) {
            this.kmipAssignedProviderIsActive = (kmipAssignedProviderIsActive == null) ? Optional.<Boolean>empty() : Optional.of(kmipAssignedProviderIsActive);
            return this;
        }

        public ListKeyServersKmipRequest.Builder optionalKmipHasProviderAssigned(final Boolean kmipHasProviderAssigned) {
            this.kmipHasProviderAssigned = (kmipHasProviderAssigned == null) ? Optional.<Boolean>empty() : Optional.of(kmipHasProviderAssigned);
            return this;
        }

    }
}
