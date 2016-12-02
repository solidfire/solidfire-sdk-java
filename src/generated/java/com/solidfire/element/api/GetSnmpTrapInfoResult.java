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
 * 
 **/

public class GetSnmpTrapInfoResult implements Serializable {

    public static final long serialVersionUID = -2022621179440695389L;
    @SerializedName("trapRecipients") private SnmpTrapRecipient[] trapRecipients;
    @SerializedName("clusterFaultTrapsEnabled") private Boolean clusterFaultTrapsEnabled;
    @SerializedName("clusterFaultResolvedTrapsEnabled") private Boolean clusterFaultResolvedTrapsEnabled;
    @SerializedName("clusterEventTrapsEnabled") private Boolean clusterEventTrapsEnabled;

    // empty constructor
    @Since("7.0")
    public GetSnmpTrapInfoResult() {}

    // parameterized constructor
    @Since("7.0")
    public GetSnmpTrapInfoResult(
        SnmpTrapRecipient[] trapRecipients,
        Boolean clusterFaultTrapsEnabled,
        Boolean clusterFaultResolvedTrapsEnabled,
        Boolean clusterEventTrapsEnabled
    )
    {
        this.trapRecipients = trapRecipients;
        this.clusterFaultTrapsEnabled = clusterFaultTrapsEnabled;
        this.clusterFaultResolvedTrapsEnabled = clusterFaultResolvedTrapsEnabled;
        this.clusterEventTrapsEnabled = clusterEventTrapsEnabled;
    }

    /** 
     * List of hosts that are to receive the traps generated by the cluster.
     **/
    public SnmpTrapRecipient[] getTrapRecipients() { return this.trapRecipients; }
    public void setTrapRecipients(SnmpTrapRecipient[] trapRecipients) { 
        this.trapRecipients = trapRecipients;
    }
    /** 
     * If "true", when a cluster fault is logged a corresponding solidFireClusterFaultNotification is sent to the configured list of trap recipients.
     **/
    public Boolean getClusterFaultTrapsEnabled() { return this.clusterFaultTrapsEnabled; }
    public void setClusterFaultTrapsEnabled(Boolean clusterFaultTrapsEnabled) { 
        this.clusterFaultTrapsEnabled = clusterFaultTrapsEnabled;
    }
    /** 
     * If "true", when a cluster fault is logged a corresponding solidFireClusterFaultResolvedNotification is sent to the configured list of trap recipients.
     **/
    public Boolean getClusterFaultResolvedTrapsEnabled() { return this.clusterFaultResolvedTrapsEnabled; }
    public void setClusterFaultResolvedTrapsEnabled(Boolean clusterFaultResolvedTrapsEnabled) { 
        this.clusterFaultResolvedTrapsEnabled = clusterFaultResolvedTrapsEnabled;
    }
    /** 
     * If "true", when a cluster fault is logged a corresponding solidFireClusterEventNotification is sent to the configured list of trap recipients.
     **/
    public Boolean getClusterEventTrapsEnabled() { return this.clusterEventTrapsEnabled; }
    public void setClusterEventTrapsEnabled(Boolean clusterEventTrapsEnabled) { 
        this.clusterEventTrapsEnabled = clusterEventTrapsEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSnmpTrapInfoResult that = (GetSnmpTrapInfoResult) o;

        return 
            Arrays.equals(trapRecipients, that.trapRecipients) &&
            Objects.equals(clusterFaultTrapsEnabled, that.clusterFaultTrapsEnabled) &&
            Objects.equals(clusterFaultResolvedTrapsEnabled, that.clusterFaultResolvedTrapsEnabled) &&
            Objects.equals(clusterEventTrapsEnabled, that.clusterEventTrapsEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])trapRecipients, clusterFaultTrapsEnabled, clusterFaultResolvedTrapsEnabled, clusterEventTrapsEnabled );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("trapRecipients", trapRecipients);
        map.put("clusterFaultTrapsEnabled", clusterFaultTrapsEnabled);
        map.put("clusterFaultResolvedTrapsEnabled", clusterFaultResolvedTrapsEnabled);
        map.put("clusterEventTrapsEnabled", clusterEventTrapsEnabled);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" trapRecipients : ").append(Arrays.toString(trapRecipients)).append(",");
        sb.append(" clusterFaultTrapsEnabled : ").append(clusterFaultTrapsEnabled).append(",");
        sb.append(" clusterFaultResolvedTrapsEnabled : ").append(clusterFaultResolvedTrapsEnabled).append(",");
        sb.append(" clusterEventTrapsEnabled : ").append(clusterEventTrapsEnabled).append(",");
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
        private SnmpTrapRecipient[] trapRecipients;
        private Boolean clusterFaultTrapsEnabled;
        private Boolean clusterFaultResolvedTrapsEnabled;
        private Boolean clusterEventTrapsEnabled;

        private Builder() { }

        public GetSnmpTrapInfoResult build() {
            return new GetSnmpTrapInfoResult (
                         this.trapRecipients,
                         this.clusterFaultTrapsEnabled,
                         this.clusterFaultResolvedTrapsEnabled,
                         this.clusterEventTrapsEnabled);
        }

        private GetSnmpTrapInfoResult.Builder buildFrom(final GetSnmpTrapInfoResult req) {
            this.trapRecipients = req.trapRecipients;
            this.clusterFaultTrapsEnabled = req.clusterFaultTrapsEnabled;
            this.clusterFaultResolvedTrapsEnabled = req.clusterFaultResolvedTrapsEnabled;
            this.clusterEventTrapsEnabled = req.clusterEventTrapsEnabled;

            return this;
        }

        public GetSnmpTrapInfoResult.Builder trapRecipients(final SnmpTrapRecipient[] trapRecipients) {
            this.trapRecipients = trapRecipients;
            return this;
        }

        public GetSnmpTrapInfoResult.Builder clusterFaultTrapsEnabled(final Boolean clusterFaultTrapsEnabled) {
            this.clusterFaultTrapsEnabled = clusterFaultTrapsEnabled;
            return this;
        }

        public GetSnmpTrapInfoResult.Builder clusterFaultResolvedTrapsEnabled(final Boolean clusterFaultResolvedTrapsEnabled) {
            this.clusterFaultResolvedTrapsEnabled = clusterFaultResolvedTrapsEnabled;
            return this;
        }

        public GetSnmpTrapInfoResult.Builder clusterEventTrapsEnabled(final Boolean clusterEventTrapsEnabled) {
            this.clusterEventTrapsEnabled = clusterEventTrapsEnabled;
            return this;
        }

    }
}
