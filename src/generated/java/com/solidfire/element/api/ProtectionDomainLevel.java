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
 * ProtectionDomainLevel  
 * A Protection Domain Level indicates the cluster's current Tolerance and Resiliency from the
 * perspective of a specific Protection Domain Type.
 **/

public class ProtectionDomainLevel implements Serializable {

    public static final long serialVersionUID = 2819011857187355718L;
    @SerializedName("protectionDomainType") private String protectionDomainType;
    @SerializedName("tolerance") private ProtectionDomainTolerance tolerance;
    @SerializedName("resiliency") private ProtectionDomainResiliency resiliency;
    // empty constructor
    @Since("7.0")
    public ProtectionDomainLevel() {}

    
    // parameterized constructor
    @Since("7.0")
    public ProtectionDomainLevel(
        String protectionDomainType,
        ProtectionDomainTolerance tolerance,
        ProtectionDomainResiliency resiliency
    )
    {
        this.protectionDomainType = protectionDomainType;
        this.tolerance = tolerance;
        this.resiliency = resiliency;
    }

    /** 
     * The type of the Protection Domain which has the associated Tolerance and Resiliency.
     **/
    public String getProtectionDomainType() { return this.protectionDomainType; }
   
    public void setProtectionDomainType(String protectionDomainType) { 
        this.protectionDomainType = protectionDomainType;
    }
    /** 
     * The current Tolerance of this cluster from the perspective of this Protection Domain Type.
     **/
    public ProtectionDomainTolerance getTolerance() { return this.tolerance; }
   
    public void setTolerance(ProtectionDomainTolerance tolerance) { 
        this.tolerance = tolerance;
    }
    /** 
     * The current Resiliency of this cluster from the perspective of this Protection Domain Type.
     **/
    public ProtectionDomainResiliency getResiliency() { return this.resiliency; }
   
    public void setResiliency(ProtectionDomainResiliency resiliency) { 
        this.resiliency = resiliency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProtectionDomainLevel that = (ProtectionDomainLevel) o;

        return 
            Objects.equals(protectionDomainType, that.protectionDomainType) && 
            Objects.equals(tolerance, that.tolerance) && 
            Objects.equals(resiliency, that.resiliency);
    }

    @Override
    public int hashCode() {
        return Objects.hash( protectionDomainType,tolerance,resiliency );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("protectionDomainType", protectionDomainType);
        map.put("tolerance", tolerance);
        map.put("resiliency", resiliency);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" protectionDomainType : ").append(gson.toJson(protectionDomainType)).append(",");
        sb.append(" tolerance : ").append(gson.toJson(tolerance)).append(",");
        sb.append(" resiliency : ").append(gson.toJson(resiliency)).append(",");
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
        private String protectionDomainType;
        private ProtectionDomainTolerance tolerance;
        private ProtectionDomainResiliency resiliency;

        private Builder() { }

        public ProtectionDomainLevel build() {
            return new ProtectionDomainLevel (
                         this.protectionDomainType,
                         this.tolerance,
                         this.resiliency);
        }

        private ProtectionDomainLevel.Builder buildFrom(final ProtectionDomainLevel req) {
            this.protectionDomainType = req.protectionDomainType;
            this.tolerance = req.tolerance;
            this.resiliency = req.resiliency;

            return this;
        }

        public ProtectionDomainLevel.Builder protectionDomainType(final String protectionDomainType) {
            this.protectionDomainType = protectionDomainType;
            return this;
        }

        public ProtectionDomainLevel.Builder tolerance(final ProtectionDomainTolerance tolerance) {
            this.tolerance = tolerance;
            return this;
        }

        public ProtectionDomainLevel.Builder resiliency(final ProtectionDomainResiliency resiliency) {
            this.resiliency = resiliency;
            return this;
        }

    }
}
