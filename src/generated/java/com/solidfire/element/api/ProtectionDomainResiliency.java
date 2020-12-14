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
 * ProtectionDomainResiliency  
 * ProtectionDomainResiliency indicates whether or not the cluster can automatically
 * heal itself from one or more failures of its associated ProtectionDomainType.
 * For the purposes of this method, a cluster is considered healed when Tolerance is
 * restored at a Node level, which means it can continue reading and writing data
 * through the failure of any single Node.
 **/

public class ProtectionDomainResiliency implements Serializable {

    public static final long serialVersionUID = 5224540913933948272L;
    @SerializedName("sustainableFailuresForEnsemble") private Long sustainableFailuresForEnsemble;
    @SerializedName("singleFailureThresholdBytesForBlockData") private Long singleFailureThresholdBytesForBlockData;
    @SerializedName("protectionSchemeResiliencies") private ProtectionSchemeResiliency[] protectionSchemeResiliencies;
    // empty constructor
    @Since("7.0")
    public ProtectionDomainResiliency() {}

    
    // parameterized constructor
    @Since("7.0")
    public ProtectionDomainResiliency(
        Long sustainableFailuresForEnsemble,
        Long singleFailureThresholdBytesForBlockData,
        ProtectionSchemeResiliency[] protectionSchemeResiliencies
    )
    {
        this.sustainableFailuresForEnsemble = sustainableFailuresForEnsemble;
        this.singleFailureThresholdBytesForBlockData = singleFailureThresholdBytesForBlockData;
        this.protectionSchemeResiliencies = protectionSchemeResiliencies;
    }

    /** 
     * The predicted number of simultaneous failures which may occur without losing
     * the ability to automatically heal to where the Ensemble Quorum has Node
     * Tolerance.
     **/
    public Long getSustainableFailuresForEnsemble() { return this.sustainableFailuresForEnsemble; }
   
    public void setSustainableFailuresForEnsemble(Long sustainableFailuresForEnsemble) { 
        this.sustainableFailuresForEnsemble = sustainableFailuresForEnsemble;
    }
    /** 
     * The maximum number of bytes that can be stored on the cluster before losing
     * the ability to automatically heal to where the data has Node Tolerance.
     **/
    public Long getSingleFailureThresholdBytesForBlockData() { return this.singleFailureThresholdBytesForBlockData; }
   
    public void setSingleFailureThresholdBytesForBlockData(Long singleFailureThresholdBytesForBlockData) { 
        this.singleFailureThresholdBytesForBlockData = singleFailureThresholdBytesForBlockData;
    }
    /** 
     * List of objects detailing failure resiliency information for the associated
     * ProtectionDomainType, one for each Protection Scheme.
     **/
    public ProtectionSchemeResiliency[] getProtectionSchemeResiliencies() { return this.protectionSchemeResiliencies; }
   
    public void setProtectionSchemeResiliencies(ProtectionSchemeResiliency[] protectionSchemeResiliencies) { 
        this.protectionSchemeResiliencies = protectionSchemeResiliencies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProtectionDomainResiliency that = (ProtectionDomainResiliency) o;

        return 
            Objects.equals(sustainableFailuresForEnsemble, that.sustainableFailuresForEnsemble) && 
            Objects.equals(singleFailureThresholdBytesForBlockData, that.singleFailureThresholdBytesForBlockData) && 
            Arrays.equals(protectionSchemeResiliencies, that.protectionSchemeResiliencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash( sustainableFailuresForEnsemble,singleFailureThresholdBytesForBlockData,(Object[])protectionSchemeResiliencies );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("sustainableFailuresForEnsemble", sustainableFailuresForEnsemble);
        map.put("singleFailureThresholdBytesForBlockData", singleFailureThresholdBytesForBlockData);
        map.put("protectionSchemeResiliencies", protectionSchemeResiliencies);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" sustainableFailuresForEnsemble : ").append(gson.toJson(sustainableFailuresForEnsemble)).append(",");
        sb.append(" singleFailureThresholdBytesForBlockData : ").append(gson.toJson(singleFailureThresholdBytesForBlockData)).append(",");
        sb.append(" protectionSchemeResiliencies : ").append(gson.toJson(Arrays.toString(protectionSchemeResiliencies))).append(",");
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
        private Long sustainableFailuresForEnsemble;
        private Long singleFailureThresholdBytesForBlockData;
        private ProtectionSchemeResiliency[] protectionSchemeResiliencies;

        private Builder() { }

        public ProtectionDomainResiliency build() {
            return new ProtectionDomainResiliency (
                         this.sustainableFailuresForEnsemble,
                         this.singleFailureThresholdBytesForBlockData,
                         this.protectionSchemeResiliencies);
        }

        private ProtectionDomainResiliency.Builder buildFrom(final ProtectionDomainResiliency req) {
            this.sustainableFailuresForEnsemble = req.sustainableFailuresForEnsemble;
            this.singleFailureThresholdBytesForBlockData = req.singleFailureThresholdBytesForBlockData;
            this.protectionSchemeResiliencies = req.protectionSchemeResiliencies;

            return this;
        }

        public ProtectionDomainResiliency.Builder sustainableFailuresForEnsemble(final Long sustainableFailuresForEnsemble) {
            this.sustainableFailuresForEnsemble = sustainableFailuresForEnsemble;
            return this;
        }

        public ProtectionDomainResiliency.Builder singleFailureThresholdBytesForBlockData(final Long singleFailureThresholdBytesForBlockData) {
            this.singleFailureThresholdBytesForBlockData = singleFailureThresholdBytesForBlockData;
            return this;
        }

        public ProtectionDomainResiliency.Builder protectionSchemeResiliencies(final ProtectionSchemeResiliency[] protectionSchemeResiliencies) {
            this.protectionSchemeResiliencies = protectionSchemeResiliencies;
            return this;
        }

    }
}
