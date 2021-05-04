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
 * ClearClusterFaultsRequest  
 * You can use the ClearClusterFaults method to clear information about both current and previously detected faults. Both resolved
 * and unresolved faults can be cleared.
 **/

public class ClearClusterFaultsRequest implements Serializable {

    public static final long serialVersionUID = -8586857494656470307L;
    @SerializedName("faultTypes") private Optional<String> faultTypes;
    // empty constructor
    @Since("7.0")
    public ClearClusterFaultsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ClearClusterFaultsRequest(
        Optional<String> faultTypes
    )
    {
        this.faultTypes = (faultTypes == null) ? Optional.<String>empty() : faultTypes;
    }

    /** 
     * Determines the types of faults cleared. Possible values are:
     * current: Faults that are currently detected and have
     * not been resolved.
     * resolved: (Default) Faults that were previously
     * detected and resolved.
     * all: Both current and resolved faults are cleared. The
     * fault status can be determined by the resolved field of
     * the fault object.
     **/
    public Optional<String> getFaultTypes() { return this.faultTypes; }
   
    public void setFaultTypes(Optional<String> faultTypes) { 
        this.faultTypes = (faultTypes == null) ? Optional.<String>empty() : faultTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClearClusterFaultsRequest that = (ClearClusterFaultsRequest) o;

        return 
            Objects.equals(faultTypes, that.faultTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( faultTypes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("faultTypes", faultTypes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != faultTypes && faultTypes.isPresent()){
            sb.append(" faultTypes : ").append(gson.toJson(faultTypes)).append(",");
        }
        else{
            sb.append(" faultTypes : ").append("null").append(",");
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
        private Optional<String> faultTypes;

        private Builder() { }

        public ClearClusterFaultsRequest build() {
            return new ClearClusterFaultsRequest (
                         this.faultTypes);
        }

        private ClearClusterFaultsRequest.Builder buildFrom(final ClearClusterFaultsRequest req) {
            this.faultTypes = req.faultTypes;

            return this;
        }

        public ClearClusterFaultsRequest.Builder optionalFaultTypes(final String faultTypes) {
            this.faultTypes = (faultTypes == null) ? Optional.<String>empty() : Optional.of(faultTypes);
            return this;
        }

    }
}
