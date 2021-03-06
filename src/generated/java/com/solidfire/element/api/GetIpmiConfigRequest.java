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
 * GetIpmiConfigRequest  
 * GetIpmiConfig enables you to retrieve hardware sensor information from sensors that are in your node.
 **/

public class GetIpmiConfigRequest implements Serializable {

    public static final long serialVersionUID = -7277588887590106282L;
    @SerializedName("chassisType") private Optional<String> chassisType;
    // empty constructor
    @Since("7.0")
    public GetIpmiConfigRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetIpmiConfigRequest(
        Optional<String> chassisType
    )
    {
        this.chassisType = (chassisType == null) ? Optional.<String>empty() : chassisType;
    }

    /** 
     * Displays information for each node chassis type.
     * Valid values are:
     * all: Returns sensor information for each chassis type.
     * {chassis type}: Returns sensor information for a specified chassis type.
     **/
    public Optional<String> getChassisType() { return this.chassisType; }
   
    public void setChassisType(Optional<String> chassisType) { 
        this.chassisType = (chassisType == null) ? Optional.<String>empty() : chassisType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetIpmiConfigRequest that = (GetIpmiConfigRequest) o;

        return 
            Objects.equals(chassisType, that.chassisType);
    }

    @Override
    public int hashCode() {
        return Objects.hash( chassisType );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("chassisType", chassisType);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != chassisType && chassisType.isPresent()){
            sb.append(" chassisType : ").append(gson.toJson(chassisType)).append(",");
        }
        else{
            sb.append(" chassisType : ").append("null").append(",");
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
        private Optional<String> chassisType;

        private Builder() { }

        public GetIpmiConfigRequest build() {
            return new GetIpmiConfigRequest (
                         this.chassisType);
        }

        private GetIpmiConfigRequest.Builder buildFrom(final GetIpmiConfigRequest req) {
            this.chassisType = req.chassisType;

            return this;
        }

        public GetIpmiConfigRequest.Builder optionalChassisType(final String chassisType) {
            this.chassisType = (chassisType == null) ? Optional.<String>empty() : Optional.of(chassisType);
            return this;
        }

    }
}
