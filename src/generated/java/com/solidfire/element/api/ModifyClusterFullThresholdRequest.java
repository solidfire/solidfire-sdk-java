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
 * ModifyClusterFullThresholdRequest  
 * You can use ModifyClusterFullThreshold to change the level at which the system generates an event when the storage cluster approaches a certain capacity utilization. You can use the threshold settings to indicate the acceptable amount of utilized block storage or metadata storage before the system generates a warning. For example, if you want to be alerted when the system reaches 3% below the "Error" level block storage utilization, enter a value of "3" for the stage3BlockThresholdPercent parameter. If this level is reached, the system sends an alert to the Event Log in the Cluster Management Console.
 **/

public class ModifyClusterFullThresholdRequest implements Serializable {

    public static final long serialVersionUID = 6981158956594615197L;
    @SerializedName("stage2AwareThreshold") private Optional<Long> stage2AwareThreshold;
    @SerializedName("stage3BlockThresholdPercent") private Optional<Long> stage3BlockThresholdPercent;
    @SerializedName("stage3MetadataThresholdPercent") private Optional<Long> stage3MetadataThresholdPercent;
    @SerializedName("maxMetadataOverProvisionFactor") private Optional<Long> maxMetadataOverProvisionFactor;
    // empty constructor
    @Since("7.0")
    public ModifyClusterFullThresholdRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public ModifyClusterFullThresholdRequest(
        Optional<Long> stage2AwareThreshold,
        Optional<Long> stage3MetadataThresholdPercent,
        Optional<Long> maxMetadataOverProvisionFactor
    )
    {
        this.stage2AwareThreshold = (stage2AwareThreshold == null) ? Optional.<Long>empty() : stage2AwareThreshold;
        this.stage3MetadataThresholdPercent = (stage3MetadataThresholdPercent == null) ? Optional.<Long>empty() : stage3MetadataThresholdPercent;
        this.maxMetadataOverProvisionFactor = (maxMetadataOverProvisionFactor == null) ? Optional.<Long>empty() : maxMetadataOverProvisionFactor;
    }
    // parameterized constructor
    @Since("8.0")
    public ModifyClusterFullThresholdRequest(
        Optional<Long> stage2AwareThreshold,
        Optional<Long> stage3BlockThresholdPercent,
        Optional<Long> stage3MetadataThresholdPercent,
        Optional<Long> maxMetadataOverProvisionFactor
    )
    {
        this.stage2AwareThreshold = (stage2AwareThreshold == null) ? Optional.<Long>empty() : stage2AwareThreshold;
        this.stage3BlockThresholdPercent = (stage3BlockThresholdPercent == null) ? Optional.<Long>empty() : stage3BlockThresholdPercent;
        this.stage3MetadataThresholdPercent = (stage3MetadataThresholdPercent == null) ? Optional.<Long>empty() : stage3MetadataThresholdPercent;
        this.maxMetadataOverProvisionFactor = (maxMetadataOverProvisionFactor == null) ? Optional.<Long>empty() : maxMetadataOverProvisionFactor;
    }

    /** 
     * The number of nodes of capacity remaining in the cluster before the system triggers a
     * capacity notification.
     **/
    public Optional<Long> getStage2AwareThreshold() { return this.stage2AwareThreshold; }
   
    public void setStage2AwareThreshold(Optional<Long> stage2AwareThreshold) { 
        this.stage2AwareThreshold = (stage2AwareThreshold == null) ? Optional.<Long>empty() : stage2AwareThreshold;
    }
    /** 
     * The percentage of block storage utilization below the "Error" threshold that causes the
     * system to trigger a cluster "Warning" alert.
     **/
    public Optional<Long> getStage3BlockThresholdPercent() { return this.stage3BlockThresholdPercent; }
   
    public void setStage3BlockThresholdPercent(Optional<Long> stage3BlockThresholdPercent) { 
        this.stage3BlockThresholdPercent = (stage3BlockThresholdPercent == null) ? Optional.<Long>empty() : stage3BlockThresholdPercent;
    }
    /** 
     * The percentage of metadata storage utilization below the "Error" threshold that causes the
     * system to trigger a cluster "Warning" alert.
     **/
    public Optional<Long> getStage3MetadataThresholdPercent() { return this.stage3MetadataThresholdPercent; }
   
    public void setStage3MetadataThresholdPercent(Optional<Long> stage3MetadataThresholdPercent) { 
        this.stage3MetadataThresholdPercent = (stage3MetadataThresholdPercent == null) ? Optional.<Long>empty() : stage3MetadataThresholdPercent;
    }
    /** 
     * A value representative of the number of times metadata space can be overprovisioned relative to the amount of space available. For example, if there was enough metadata space to store 100 TiB of volumes and this number was set to 5, then 500 TiB worth of volumes can be created.
     **/
    public Optional<Long> getMaxMetadataOverProvisionFactor() { return this.maxMetadataOverProvisionFactor; }
   
    public void setMaxMetadataOverProvisionFactor(Optional<Long> maxMetadataOverProvisionFactor) { 
        this.maxMetadataOverProvisionFactor = (maxMetadataOverProvisionFactor == null) ? Optional.<Long>empty() : maxMetadataOverProvisionFactor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyClusterFullThresholdRequest that = (ModifyClusterFullThresholdRequest) o;

        return 
            Objects.equals(stage2AwareThreshold, that.stage2AwareThreshold) && 
            Objects.equals(stage3BlockThresholdPercent, that.stage3BlockThresholdPercent) && 
            Objects.equals(stage3MetadataThresholdPercent, that.stage3MetadataThresholdPercent) && 
            Objects.equals(maxMetadataOverProvisionFactor, that.maxMetadataOverProvisionFactor);
    }

    @Override
    public int hashCode() {
        return Objects.hash( stage2AwareThreshold,stage3BlockThresholdPercent,stage3MetadataThresholdPercent,maxMetadataOverProvisionFactor );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("stage2AwareThreshold", stage2AwareThreshold);
        map.put("stage3BlockThresholdPercent", stage3BlockThresholdPercent);
        map.put("stage3MetadataThresholdPercent", stage3MetadataThresholdPercent);
        map.put("maxMetadataOverProvisionFactor", maxMetadataOverProvisionFactor);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != stage2AwareThreshold && stage2AwareThreshold.isPresent()){
            sb.append(" stage2AwareThreshold : ").append(gson.toJson(stage2AwareThreshold)).append(",");
        }
        else{
            sb.append(" stage2AwareThreshold : ").append("null").append(",");
        }
        if(null != stage3BlockThresholdPercent && stage3BlockThresholdPercent.isPresent()){
            sb.append(" stage3BlockThresholdPercent : ").append(gson.toJson(stage3BlockThresholdPercent)).append(",");
        }
        else{
            sb.append(" stage3BlockThresholdPercent : ").append("null").append(",");
        }
        if(null != stage3MetadataThresholdPercent && stage3MetadataThresholdPercent.isPresent()){
            sb.append(" stage3MetadataThresholdPercent : ").append(gson.toJson(stage3MetadataThresholdPercent)).append(",");
        }
        else{
            sb.append(" stage3MetadataThresholdPercent : ").append("null").append(",");
        }
        if(null != maxMetadataOverProvisionFactor && maxMetadataOverProvisionFactor.isPresent()){
            sb.append(" maxMetadataOverProvisionFactor : ").append(gson.toJson(maxMetadataOverProvisionFactor)).append(",");
        }
        else{
            sb.append(" maxMetadataOverProvisionFactor : ").append("null").append(",");
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
        private Optional<Long> stage2AwareThreshold;
        private Optional<Long> stage3BlockThresholdPercent;
        private Optional<Long> stage3MetadataThresholdPercent;
        private Optional<Long> maxMetadataOverProvisionFactor;

        private Builder() { }

        public ModifyClusterFullThresholdRequest build() {
            return new ModifyClusterFullThresholdRequest (
                         this.stage2AwareThreshold,
                         this.stage3BlockThresholdPercent,
                         this.stage3MetadataThresholdPercent,
                         this.maxMetadataOverProvisionFactor);
        }

        private ModifyClusterFullThresholdRequest.Builder buildFrom(final ModifyClusterFullThresholdRequest req) {
            this.stage2AwareThreshold = req.stage2AwareThreshold;
            this.stage3BlockThresholdPercent = req.stage3BlockThresholdPercent;
            this.stage3MetadataThresholdPercent = req.stage3MetadataThresholdPercent;
            this.maxMetadataOverProvisionFactor = req.maxMetadataOverProvisionFactor;

            return this;
        }

        public ModifyClusterFullThresholdRequest.Builder optionalStage2AwareThreshold(final Long stage2AwareThreshold) {
            this.stage2AwareThreshold = (stage2AwareThreshold == null) ? Optional.<Long>empty() : Optional.of(stage2AwareThreshold);
            return this;
        }

        public ModifyClusterFullThresholdRequest.Builder optionalStage3BlockThresholdPercent(final Long stage3BlockThresholdPercent) {
            this.stage3BlockThresholdPercent = (stage3BlockThresholdPercent == null) ? Optional.<Long>empty() : Optional.of(stage3BlockThresholdPercent);
            return this;
        }

        public ModifyClusterFullThresholdRequest.Builder optionalStage3MetadataThresholdPercent(final Long stage3MetadataThresholdPercent) {
            this.stage3MetadataThresholdPercent = (stage3MetadataThresholdPercent == null) ? Optional.<Long>empty() : Optional.of(stage3MetadataThresholdPercent);
            return this;
        }

        public ModifyClusterFullThresholdRequest.Builder optionalMaxMetadataOverProvisionFactor(final Long maxMetadataOverProvisionFactor) {
            this.maxMetadataOverProvisionFactor = (maxMetadataOverProvisionFactor == null) ? Optional.<Long>empty() : Optional.of(maxMetadataOverProvisionFactor);
            return this;
        }

    }
}
