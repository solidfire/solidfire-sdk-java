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

import com.google.gson.annotations.SerializedName;
import com.solidfire.jsvcgen.annotation.Since;
import com.solidfire.jsvcgen.client.ApiException;
import com.solidfire.jsvcgen.javautil.Optional;

import java.net.URL;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

import static com.solidfire.jsvcgen.javautil.Optional.of;


/**
 * The Request object for the "ModifyClusterFullThreshold" API Service call.
 **/
public class ModifyClusterFullThresholdRequest implements Serializable {

    private static final long serialVersionUID = 2050543395L;

    @SerializedName("stage2AwareThreshold") private final Optional<Long> stage2AwareThreshold;
    @SerializedName("stage3BlockThresholdPercent") private final Optional<Long> stage3BlockThresholdPercent;
    @SerializedName("maxMetadataOverProvisionFactor") private final Optional<Long> maxMetadataOverProvisionFactor;

    /**
     * The Request object for the "ModifyClusterFullThreshold" API Service call.
     * @param stage2AwareThreshold (optional) Number of nodes worth of capacity remaining on the cluster that triggers a notification.
     * @param maxMetadataOverProvisionFactor (optional) A value representative of the number of times metadata space can be over provisioned relative to the amount of space available. For example, if there was enough metadata space to store 100 TiB of volumes and this number was set to 5, then 500 TiB worth of volumes could be created.
     * @since 7.0
     **/
    @Since("7.0")
    public ModifyClusterFullThresholdRequest(Optional<Long> stage2AwareThreshold, Optional<Long> maxMetadataOverProvisionFactor) {
        this.stage2AwareThreshold = (stage2AwareThreshold == null) ? Optional.<Long>empty() : stage2AwareThreshold;
        this.stage3BlockThresholdPercent = Optional.<Long>empty();
        this.maxMetadataOverProvisionFactor = (maxMetadataOverProvisionFactor == null) ? Optional.<Long>empty() : maxMetadataOverProvisionFactor;
    }

    /**
     * The Request object for the "ModifyClusterFullThreshold" API Service call.
     * @param stage2AwareThreshold (optional) Number of nodes worth of capacity remaining on the cluster that triggers a notification.
     * @param stage3BlockThresholdPercent (optional) Percent below "Error" state to raise a cluster "Warning" alert.
     * @param maxMetadataOverProvisionFactor (optional) A value representative of the number of times metadata space can be over provisioned relative to the amount of space available. For example, if there was enough metadata space to store 100 TiB of volumes and this number was set to 5, then 500 TiB worth of volumes could be created.
     * @since 8.0
     **/
    @Since("8.0")
    public ModifyClusterFullThresholdRequest(Optional<Long> stage2AwareThreshold, Optional<Long> stage3BlockThresholdPercent, Optional<Long> maxMetadataOverProvisionFactor) {
        this.stage2AwareThreshold = (stage2AwareThreshold == null) ? Optional.<Long>empty() : stage2AwareThreshold;
        this.stage3BlockThresholdPercent = (stage3BlockThresholdPercent == null) ? Optional.<Long>empty() : stage3BlockThresholdPercent;
        this.maxMetadataOverProvisionFactor = (maxMetadataOverProvisionFactor == null) ? Optional.<Long>empty() : maxMetadataOverProvisionFactor;
    }


    /**
     * Number of nodes worth of capacity remaining on the cluster that triggers a notification.
     **/
    public Optional<Long> getStage2AwareThreshold() {
        return this.stage2AwareThreshold;
    }

    /**
     * Percent below "Error" state to raise a cluster "Warning" alert.
     * @since 8.0 
     **/

    @Since("8.0")
    public Optional<Long> getStage3BlockThresholdPercent() {
        return this.stage3BlockThresholdPercent;
    }

    /**
     * A value representative of the number of times metadata space can be over provisioned relative to the amount of space available. For example, if there was enough metadata space to store 100 TiB of volumes and this number was set to 5, then 500 TiB worth of volumes could be created.
     **/
    public Optional<Long> getMaxMetadataOverProvisionFactor() {
        return this.maxMetadataOverProvisionFactor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyClusterFullThresholdRequest that = (ModifyClusterFullThresholdRequest) o;
        

        return Objects.equals( stage2AwareThreshold , that.stage2AwareThreshold )
            && Objects.equals( stage3BlockThresholdPercent , that.stage3BlockThresholdPercent )
            && Objects.equals( maxMetadataOverProvisionFactor , that.maxMetadataOverProvisionFactor );
    }

    @Override
    public int hashCode() {
        return Objects.hash( stage2AwareThreshold, stage3BlockThresholdPercent, maxMetadataOverProvisionFactor );
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != stage2AwareThreshold && stage2AwareThreshold.isPresent())
            sb.append(" stage2AwareThreshold : ").append(stage2AwareThreshold.get()).append(",");
        if(null != stage3BlockThresholdPercent && stage3BlockThresholdPercent.isPresent())
            sb.append(" stage3BlockThresholdPercent : ").append(stage3BlockThresholdPercent.get()).append(",");
        if(null != maxMetadataOverProvisionFactor && maxMetadataOverProvisionFactor.isPresent())
            sb.append(" maxMetadataOverProvisionFactor : ").append(maxMetadataOverProvisionFactor.get());
        sb.append( " }" );

        if(sb.lastIndexOf(", }") != -1)
            sb.deleteCharAt(sb.lastIndexOf(", }"));

        return sb.toString();
    }

    public static final Builder builder() {
        return new Builder();
    }

    public final Builder asBuilder() {
        return new Builder().buildFrom(this);
    }

    public static class Builder {
        private Optional<Long> stage2AwareThreshold;
        private Optional<Long> stage3BlockThresholdPercent;
        private Optional<Long> maxMetadataOverProvisionFactor;

        private Builder() { }

        public ModifyClusterFullThresholdRequest build() {
            return new ModifyClusterFullThresholdRequest (
                         this.stage2AwareThreshold,
                         this.stage3BlockThresholdPercent,
                         this.maxMetadataOverProvisionFactor            );
        }

        private ModifyClusterFullThresholdRequest.Builder buildFrom(final ModifyClusterFullThresholdRequest req) {
            this.stage2AwareThreshold = req.stage2AwareThreshold;
            this.stage3BlockThresholdPercent = req.stage3BlockThresholdPercent;
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

        public ModifyClusterFullThresholdRequest.Builder optionalMaxMetadataOverProvisionFactor(final Long maxMetadataOverProvisionFactor) {
            this.maxMetadataOverProvisionFactor = (maxMetadataOverProvisionFactor == null) ? Optional.<Long>empty() : Optional.of(maxMetadataOverProvisionFactor);
            return this;
        }

    }

}
