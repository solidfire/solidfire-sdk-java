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
 * BinAssignmentProperties  
 **/

public class BinAssignmentProperties implements Serializable {

    public static final long serialVersionUID = 1917671423369816206L;
    @SerializedName("algorithmRuntimeMS") private Long algorithmRuntimeMS;
    @SerializedName("areReplicasValid") private Boolean areReplicasValid;
    @SerializedName("binCount") private Long binCount;
    @SerializedName("isBalanced") private Boolean isBalanced;
    @SerializedName("isStable") private Boolean isStable;
    @SerializedName("numUpdatingBins") private Long numUpdatingBins;
    @SerializedName("numSwaps") private Long numSwaps;
    @SerializedName("layout") private ProtectionDomainServiceReplicaBudget[] layout;
    @SerializedName("reason") private String reason;
    @SerializedName("replicationCount") private Long replicationCount;
    @SerializedName("requestRebalance") private Boolean requestRebalance;
    @SerializedName("protectionDomainType") private String protectionDomainType;
    @SerializedName("serviceStrandedCapacities") private ServiceStrandedCapacity[] serviceStrandedCapacities;
    @SerializedName("timePublished") private Optional<String> timePublished;
    @SerializedName("validSchemes") private GetProtectionSchemesResult[] validSchemes;
    // empty constructor
    @Since("7.0")
    public BinAssignmentProperties() {}

    
    // parameterized constructor
    @Since("7.0")
    public BinAssignmentProperties(
        Long algorithmRuntimeMS,
        Boolean areReplicasValid,
        Long binCount,
        Boolean isBalanced,
        Boolean isStable,
        Long numUpdatingBins,
        Long numSwaps,
        ProtectionDomainServiceReplicaBudget[] layout,
        String reason,
        Long replicationCount,
        Boolean requestRebalance,
        String protectionDomainType,
        ServiceStrandedCapacity[] serviceStrandedCapacities,
        Optional<String> timePublished,
        GetProtectionSchemesResult[] validSchemes
    )
    {
        this.algorithmRuntimeMS = algorithmRuntimeMS;
        this.areReplicasValid = areReplicasValid;
        this.binCount = binCount;
        this.isBalanced = isBalanced;
        this.isStable = isStable;
        this.numUpdatingBins = numUpdatingBins;
        this.numSwaps = numSwaps;
        this.layout = layout;
        this.reason = reason;
        this.replicationCount = replicationCount;
        this.requestRebalance = requestRebalance;
        this.protectionDomainType = protectionDomainType;
        this.serviceStrandedCapacities = serviceStrandedCapacities;
        this.timePublished = (timePublished == null) ? Optional.<String>empty() : timePublished;
        this.validSchemes = validSchemes;
    }

    /** 
     * Time in milliseconds taken to calculate this bin assignments.
     **/
    public Long getAlgorithmRuntimeMS() { return this.algorithmRuntimeMS; }
   
    public void setAlgorithmRuntimeMS(Long algorithmRuntimeMS) { 
        this.algorithmRuntimeMS = algorithmRuntimeMS;
    }
    /** 
     * If replicas are valid in bin assignments.
     **/
    public Boolean getAreReplicasValid() { return this.areReplicasValid; }
   
    public void setAreReplicasValid(Boolean areReplicasValid) { 
        this.areReplicasValid = areReplicasValid;
    }
    /** 
     * Number of bins assigned.
     **/
    public Long getBinCount() { return this.binCount; }
   
    public void setBinCount(Long binCount) { 
        this.binCount = binCount;
    }
    /** 
     * If replica assignments are balanced across all block services.
     **/
    public Boolean getIsBalanced() { return this.isBalanced; }
   
    public void setIsBalanced(Boolean isBalanced) { 
        this.isBalanced = isBalanced;
    }
    /** 
     * If bin assignments are not expected to change.
     **/
    public Boolean getIsStable() { return this.isStable; }
   
    public void setIsStable(Boolean isStable) { 
        this.isStable = isStable;
    }
    /** 
     * Number of bins that have status bsUpdating or bsUdpatingFromActive.
     **/
    public Long getNumUpdatingBins() { return this.numUpdatingBins; }
   
    public void setNumUpdatingBins(Long numUpdatingBins) { 
        this.numUpdatingBins = numUpdatingBins;
    }
    /** 
     * Number of replicas that were swapped.
     **/
    public Long getNumSwaps() { return this.numSwaps; }
   
    public void setNumSwaps(Long numSwaps) { 
        this.numSwaps = numSwaps;
    }
    /** 
     * Replica bin budget for each block service in a protection domain.
     **/
    public ProtectionDomainServiceReplicaBudget[] getLayout() { return this.layout; }
   
    public void setLayout(ProtectionDomainServiceReplicaBudget[] layout) { 
        this.layout = layout;
    }
    /** 
     * Reason for this bin assignments.
     **/
    public String getReason() { return this.reason; }
   
    public void setReason(String reason) { 
        this.reason = reason;
    }
    /** 
     * Number of replicas per bin.
     **/
    public Long getReplicationCount() { return this.replicationCount; }
   
    public void setReplicationCount(Long replicationCount) { 
        this.replicationCount = replicationCount;
    }
    /** 
     * If bin assignments are requested to be rebalanced, which is expected during drive recovery.
     **/
    public Boolean getRequestRebalance() { return this.requestRebalance; }
   
    public void setRequestRebalance(Boolean requestRebalance) { 
        this.requestRebalance = requestRebalance;
    }
    /** 
     * Protection domain type
     **/
    public String getProtectionDomainType() { return this.protectionDomainType; }
   
    public void setProtectionDomainType(String protectionDomainType) { 
        this.protectionDomainType = protectionDomainType;
    }
    /** 
     * Stranded capacities for block services
     **/
    public ServiceStrandedCapacity[] getServiceStrandedCapacities() { return this.serviceStrandedCapacities; }
   
    public void setServiceStrandedCapacities(ServiceStrandedCapacity[] serviceStrandedCapacities) { 
        this.serviceStrandedCapacities = serviceStrandedCapacities;
    }
    /** 
     * When bin assignments were published.
     **/
    public Optional<String> getTimePublished() { return this.timePublished; }
   
    public void setTimePublished(Optional<String> timePublished) { 
        this.timePublished = (timePublished == null) ? Optional.<String>empty() : timePublished;
    }
    /** 
     * Valid data protection schemes.
     **/
    public GetProtectionSchemesResult[] getValidSchemes() { return this.validSchemes; }
   
    public void setValidSchemes(GetProtectionSchemesResult[] validSchemes) { 
        this.validSchemes = validSchemes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BinAssignmentProperties that = (BinAssignmentProperties) o;

        return 
            Objects.equals(algorithmRuntimeMS, that.algorithmRuntimeMS) && 
            Objects.equals(areReplicasValid, that.areReplicasValid) && 
            Objects.equals(binCount, that.binCount) && 
            Objects.equals(isBalanced, that.isBalanced) && 
            Objects.equals(isStable, that.isStable) && 
            Objects.equals(numUpdatingBins, that.numUpdatingBins) && 
            Objects.equals(numSwaps, that.numSwaps) && 
            Arrays.equals(layout, that.layout) && 
            Objects.equals(reason, that.reason) && 
            Objects.equals(replicationCount, that.replicationCount) && 
            Objects.equals(requestRebalance, that.requestRebalance) && 
            Objects.equals(protectionDomainType, that.protectionDomainType) && 
            Arrays.equals(serviceStrandedCapacities, that.serviceStrandedCapacities) && 
            Objects.equals(timePublished, that.timePublished) && 
            Arrays.equals(validSchemes, that.validSchemes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( algorithmRuntimeMS,areReplicasValid,binCount,isBalanced,isStable,numUpdatingBins,numSwaps,(Object[])layout,reason,replicationCount,requestRebalance,protectionDomainType,(Object[])serviceStrandedCapacities,timePublished,(Object[])validSchemes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("algorithmRuntimeMS", algorithmRuntimeMS);
        map.put("areReplicasValid", areReplicasValid);
        map.put("binCount", binCount);
        map.put("isBalanced", isBalanced);
        map.put("isStable", isStable);
        map.put("numUpdatingBins", numUpdatingBins);
        map.put("numSwaps", numSwaps);
        map.put("layout", layout);
        map.put("reason", reason);
        map.put("replicationCount", replicationCount);
        map.put("requestRebalance", requestRebalance);
        map.put("protectionDomainType", protectionDomainType);
        map.put("serviceStrandedCapacities", serviceStrandedCapacities);
        map.put("timePublished", timePublished);
        map.put("validSchemes", validSchemes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" algorithmRuntimeMS : ").append(gson.toJson(algorithmRuntimeMS)).append(",");
        sb.append(" areReplicasValid : ").append(gson.toJson(areReplicasValid)).append(",");
        sb.append(" binCount : ").append(gson.toJson(binCount)).append(",");
        sb.append(" isBalanced : ").append(gson.toJson(isBalanced)).append(",");
        sb.append(" isStable : ").append(gson.toJson(isStable)).append(",");
        sb.append(" numUpdatingBins : ").append(gson.toJson(numUpdatingBins)).append(",");
        sb.append(" numSwaps : ").append(gson.toJson(numSwaps)).append(",");
        sb.append(" layout : ").append(gson.toJson(Arrays.toString(layout))).append(",");
        sb.append(" reason : ").append(gson.toJson(reason)).append(",");
        sb.append(" replicationCount : ").append(gson.toJson(replicationCount)).append(",");
        sb.append(" requestRebalance : ").append(gson.toJson(requestRebalance)).append(",");
        sb.append(" protectionDomainType : ").append(gson.toJson(protectionDomainType)).append(",");
        sb.append(" serviceStrandedCapacities : ").append(gson.toJson(Arrays.toString(serviceStrandedCapacities))).append(",");
        if(null != timePublished && timePublished.isPresent()){
            sb.append(" timePublished : ").append(gson.toJson(timePublished)).append(",");
        }
        else{
            sb.append(" timePublished : ").append("null").append(",");
        }
        sb.append(" validSchemes : ").append(gson.toJson(Arrays.toString(validSchemes))).append(",");
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
        private Long algorithmRuntimeMS;
        private Boolean areReplicasValid;
        private Long binCount;
        private Boolean isBalanced;
        private Boolean isStable;
        private Long numUpdatingBins;
        private Long numSwaps;
        private ProtectionDomainServiceReplicaBudget[] layout;
        private String reason;
        private Long replicationCount;
        private Boolean requestRebalance;
        private String protectionDomainType;
        private ServiceStrandedCapacity[] serviceStrandedCapacities;
        private Optional<String> timePublished;
        private GetProtectionSchemesResult[] validSchemes;

        private Builder() { }

        public BinAssignmentProperties build() {
            return new BinAssignmentProperties (
                         this.algorithmRuntimeMS,
                         this.areReplicasValid,
                         this.binCount,
                         this.isBalanced,
                         this.isStable,
                         this.numUpdatingBins,
                         this.numSwaps,
                         this.layout,
                         this.reason,
                         this.replicationCount,
                         this.requestRebalance,
                         this.protectionDomainType,
                         this.serviceStrandedCapacities,
                         this.timePublished,
                         this.validSchemes);
        }

        private BinAssignmentProperties.Builder buildFrom(final BinAssignmentProperties req) {
            this.algorithmRuntimeMS = req.algorithmRuntimeMS;
            this.areReplicasValid = req.areReplicasValid;
            this.binCount = req.binCount;
            this.isBalanced = req.isBalanced;
            this.isStable = req.isStable;
            this.numUpdatingBins = req.numUpdatingBins;
            this.numSwaps = req.numSwaps;
            this.layout = req.layout;
            this.reason = req.reason;
            this.replicationCount = req.replicationCount;
            this.requestRebalance = req.requestRebalance;
            this.protectionDomainType = req.protectionDomainType;
            this.serviceStrandedCapacities = req.serviceStrandedCapacities;
            this.timePublished = req.timePublished;
            this.validSchemes = req.validSchemes;

            return this;
        }

        public BinAssignmentProperties.Builder algorithmRuntimeMS(final Long algorithmRuntimeMS) {
            this.algorithmRuntimeMS = algorithmRuntimeMS;
            return this;
        }

        public BinAssignmentProperties.Builder areReplicasValid(final Boolean areReplicasValid) {
            this.areReplicasValid = areReplicasValid;
            return this;
        }

        public BinAssignmentProperties.Builder binCount(final Long binCount) {
            this.binCount = binCount;
            return this;
        }

        public BinAssignmentProperties.Builder isBalanced(final Boolean isBalanced) {
            this.isBalanced = isBalanced;
            return this;
        }

        public BinAssignmentProperties.Builder isStable(final Boolean isStable) {
            this.isStable = isStable;
            return this;
        }

        public BinAssignmentProperties.Builder numUpdatingBins(final Long numUpdatingBins) {
            this.numUpdatingBins = numUpdatingBins;
            return this;
        }

        public BinAssignmentProperties.Builder numSwaps(final Long numSwaps) {
            this.numSwaps = numSwaps;
            return this;
        }

        public BinAssignmentProperties.Builder layout(final ProtectionDomainServiceReplicaBudget[] layout) {
            this.layout = layout;
            return this;
        }

        public BinAssignmentProperties.Builder reason(final String reason) {
            this.reason = reason;
            return this;
        }

        public BinAssignmentProperties.Builder replicationCount(final Long replicationCount) {
            this.replicationCount = replicationCount;
            return this;
        }

        public BinAssignmentProperties.Builder requestRebalance(final Boolean requestRebalance) {
            this.requestRebalance = requestRebalance;
            return this;
        }

        public BinAssignmentProperties.Builder protectionDomainType(final String protectionDomainType) {
            this.protectionDomainType = protectionDomainType;
            return this;
        }

        public BinAssignmentProperties.Builder serviceStrandedCapacities(final ServiceStrandedCapacity[] serviceStrandedCapacities) {
            this.serviceStrandedCapacities = serviceStrandedCapacities;
            return this;
        }

        public BinAssignmentProperties.Builder optionalTimePublished(final String timePublished) {
            this.timePublished = (timePublished == null) ? Optional.<String>empty() : Optional.of(timePublished);
            return this;
        }

        public BinAssignmentProperties.Builder validSchemes(final GetProtectionSchemesResult[] validSchemes) {
            this.validSchemes = validSchemes;
            return this;
        }

    }
}
