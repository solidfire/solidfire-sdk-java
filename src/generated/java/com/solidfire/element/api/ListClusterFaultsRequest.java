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
 * ListClusterFaultsRequest  
 * ListClusterFaults enables you to retrieve information about any faults detected on the cluster. With this method, you can retrieve both current faults as well as faults that have been resolved. The system caches faults every 30 seconds.
 **/

public class ListClusterFaultsRequest implements Serializable {

    public static final long serialVersionUID = 4199619582660611557L;
    @SerializedName("bestPractices") private Optional<Boolean> bestPractices;
    @SerializedName("faultTypes") private Optional<String> faultTypes;
    // empty constructor
    @Since("7.0")
    public ListClusterFaultsRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ListClusterFaultsRequest(
        Optional<Boolean> bestPractices,
        Optional<String> faultTypes
    )
    {
        this.bestPractices = (bestPractices == null) ? Optional.<Boolean>empty() : bestPractices;
        this.faultTypes = (faultTypes == null) ? Optional.<String>empty() : faultTypes;
    }

    /** 
     * Specifies whether to include faults triggered by suboptimal system configuration.
     * Possible values are:
     * true
     * false
     **/
    public Optional<Boolean> getBestPractices() { return this.bestPractices; }
   
    public void setBestPractices(Optional<Boolean> bestPractices) { 
        this.bestPractices = (bestPractices == null) ? Optional.<Boolean>empty() : bestPractices;
    }
    /** 
     * Determines the types of faults returned. Possible values are:
     * current: List active, unresolved faults.
     * resolved: List faults that were previously detected and
     * resolved.
     * all: (Default) List both current and resolved faults. You can
     * see the fault status in the resolved field of the Cluster Fault
     * object.
     **/
    public Optional<String> getFaultTypes() { return this.faultTypes; }
   
    public void setFaultTypes(Optional<String> faultTypes) { 
        this.faultTypes = (faultTypes == null) ? Optional.<String>empty() : faultTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListClusterFaultsRequest that = (ListClusterFaultsRequest) o;

        return 
            Objects.equals(bestPractices, that.bestPractices) && 
            Objects.equals(faultTypes, that.faultTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( bestPractices,faultTypes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("bestPractices", bestPractices);
        map.put("faultTypes", faultTypes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != bestPractices && bestPractices.isPresent()){
            sb.append(" bestPractices : ").append(gson.toJson(bestPractices)).append(",");
        }
        else{
            sb.append(" bestPractices : ").append("null").append(",");
        }
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
        private Optional<Boolean> bestPractices;
        private Optional<String> faultTypes;

        private Builder() { }

        public ListClusterFaultsRequest build() {
            return new ListClusterFaultsRequest (
                         this.bestPractices,
                         this.faultTypes);
        }

        private ListClusterFaultsRequest.Builder buildFrom(final ListClusterFaultsRequest req) {
            this.bestPractices = req.bestPractices;
            this.faultTypes = req.faultTypes;

            return this;
        }

        public ListClusterFaultsRequest.Builder optionalBestPractices(final Boolean bestPractices) {
            this.bestPractices = (bestPractices == null) ? Optional.<Boolean>empty() : Optional.of(bestPractices);
            return this;
        }

        public ListClusterFaultsRequest.Builder optionalFaultTypes(final String faultTypes) {
            this.faultTypes = (faultTypes == null) ? Optional.<String>empty() : Optional.of(faultTypes);
            return this;
        }

    }
}
