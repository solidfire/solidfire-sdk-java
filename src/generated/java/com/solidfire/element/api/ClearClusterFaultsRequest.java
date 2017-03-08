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

import com.solidfire.gson.annotations.SerializedName;
import com.solidfire.core.annotation.Since;
import com.solidfire.core.javautil.Optional;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * ClearClusterFaultsRequest  
 * ClearClusterFaults is used to clear information about both current faults that are resolved as well as faults that were previously detected and resolved can be cleared.
 **/

public class ClearClusterFaultsRequest implements Serializable {

    public static final long serialVersionUID = 8304045543083765534L;
    @SerializedName("faultType") private Optional<String> faultType;

    // empty constructor
    @Since("7.0")
    public ClearClusterFaultsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ClearClusterFaultsRequest(
        Optional<String> faultType
    )
    {
        this.faultType = (faultType == null) ? Optional.<String>empty() : faultType;
    }

    /** 
     * Determines the types of faults cleared:
     * current: Faults that are currently detected and have not been resolved.
     * resolved: Faults that were previously detected and resolved.
     * all: Both current and resolved faults are cleared. The fault status can be determined by the "resolved" field of the fault object.
     **/
    public Optional<String> getFaultType() { return this.faultType; }
    public void setFaultType(Optional<String> faultType) { 
        this.faultType = (faultType == null) ? Optional.<String>empty() : faultType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClearClusterFaultsRequest that = (ClearClusterFaultsRequest) o;

        return 
            Objects.equals(faultType, that.faultType);
    }

    @Override
    public int hashCode() {
        return Objects.hash( faultType );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("faultType", faultType);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != faultType && faultType.isPresent()){
            sb.append(" faultType : ").append(faultType).append(",");
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
        private Optional<String> faultType;

        private Builder() { }

        public ClearClusterFaultsRequest build() {
            return new ClearClusterFaultsRequest (
                         this.faultType);
        }

        private ClearClusterFaultsRequest.Builder buildFrom(final ClearClusterFaultsRequest req) {
            this.faultType = req.faultType;

            return this;
        }

        public ClearClusterFaultsRequest.Builder optional(final String faultType) {
            this.faultType = (faultType == null) ? Optional.<String>empty() : Optional.of(faultType);
            return this;
        }

    }
}
