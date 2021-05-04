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
 * SnapMirrorPolicy  
 * The snapMirrorPolicy object contains information about a SnapMirror policy that is stored on an ONTAP system.
 **/

public class SnapMirrorPolicy implements Serializable {

    public static final long serialVersionUID = -5203438975312766495L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("policyName") private String policyName;
    @SerializedName("policyType") private String policyType;
    @SerializedName("comment") private String comment;
    @SerializedName("transferPriority") private String transferPriority;
    @SerializedName("policyRules") private SnapMirrorPolicyRule[] policyRules;
    @SerializedName("totalKeepCount") private Long totalKeepCount;
    @SerializedName("totalRules") private Long totalRules;
    @SerializedName("vserverName") private String vserverName;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorPolicy(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorPolicy(
        Long snapMirrorEndpointID,
        String policyName,
        String policyType,
        String comment,
        String transferPriority,
        SnapMirrorPolicyRule[] policyRules,
        Long totalKeepCount,
        Long totalRules,
        String vserverName
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.policyName = policyName;
        this.policyType = policyType;
        this.comment = comment;
        this.transferPriority = transferPriority;
        this.policyRules = policyRules;
        this.totalKeepCount = totalKeepCount;
        this.totalRules = totalRules;
        this.vserverName = vserverName;
    }

    /** 
     * The ID of the destination ONTAP system.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The unique name assigned to the policy.
     **/
    public String getPolicyName() { return this.policyName; }
   
    public void setPolicyName(String policyName) { 
        this.policyName = policyName;
    }
    /** 
     * The type of policy.
     * Possible values:
     * async_mirror
     * mirror_vault
     **/
    public String getPolicyType() { return this.policyType; }
   
    public void setPolicyType(String policyType) { 
        this.policyType = policyType;
    }
    /** 
     * A human-readable description associated with the SnapMirror policy.
     **/
    public String getComment() { return this.comment; }
   
    public void setComment(String comment) { 
        this.comment = comment;
    }
    /** 
     * The priority at which a SnapMirror transfer runs.
     * Possible values:
     * normal: The default priority. These transfers are
     *         scheduled before most low priority transfers.
     * low:    These transfers have the lowest priority and
     *         are scheduled after most normal priority transfers.
     **/
    public String getTransferPriority() { return this.transferPriority; }
   
    public void setTransferPriority(String transferPriority) { 
        this.transferPriority = transferPriority;
    }
    /** 
     * A list of objects describing the policy rules.
     **/
    public SnapMirrorPolicyRule[] getPolicyRules() { return this.policyRules; }
   
    public void setPolicyRules(SnapMirrorPolicyRule[] policyRules) { 
        this.policyRules = policyRules;
    }
    /** 
     * The total retention count for all rules in the policy.
     **/
    public Long getTotalKeepCount() { return this.totalKeepCount; }
   
    public void setTotalKeepCount(Long totalKeepCount) { 
        this.totalKeepCount = totalKeepCount;
    }
    /** 
     * The total number of rules in the policy.
     **/
    public Long getTotalRules() { return this.totalRules; }
   
    public void setTotalRules(Long totalRules) { 
        this.totalRules = totalRules;
    }
    /** 
     * The name of the Vserver for the SnapMirror policy.
     **/
    public String getVserverName() { return this.vserverName; }
   
    public void setVserverName(String vserverName) { 
        this.vserverName = vserverName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorPolicy that = (SnapMirrorPolicy) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(policyName, that.policyName) && 
            Objects.equals(policyType, that.policyType) && 
            Objects.equals(comment, that.comment) && 
            Objects.equals(transferPriority, that.transferPriority) && 
            Arrays.equals(policyRules, that.policyRules) && 
            Objects.equals(totalKeepCount, that.totalKeepCount) && 
            Objects.equals(totalRules, that.totalRules) && 
            Objects.equals(vserverName, that.vserverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,policyName,policyType,comment,transferPriority,(Object[])policyRules,totalKeepCount,totalRules,vserverName );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("policyName", policyName);
        map.put("policyType", policyType);
        map.put("comment", comment);
        map.put("transferPriority", transferPriority);
        map.put("policyRules", policyRules);
        map.put("totalKeepCount", totalKeepCount);
        map.put("totalRules", totalRules);
        map.put("vserverName", vserverName);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" policyName : ").append(gson.toJson(policyName)).append(",");
        sb.append(" policyType : ").append(gson.toJson(policyType)).append(",");
        sb.append(" comment : ").append(gson.toJson(comment)).append(",");
        sb.append(" transferPriority : ").append(gson.toJson(transferPriority)).append(",");
        sb.append(" policyRules : ").append(gson.toJson(Arrays.toString(policyRules))).append(",");
        sb.append(" totalKeepCount : ").append(gson.toJson(totalKeepCount)).append(",");
        sb.append(" totalRules : ").append(gson.toJson(totalRules)).append(",");
        sb.append(" vserverName : ").append(gson.toJson(vserverName)).append(",");
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
        private Long snapMirrorEndpointID;
        private String policyName;
        private String policyType;
        private String comment;
        private String transferPriority;
        private SnapMirrorPolicyRule[] policyRules;
        private Long totalKeepCount;
        private Long totalRules;
        private String vserverName;

        private Builder() { }

        public SnapMirrorPolicy build() {
            return new SnapMirrorPolicy (
                         this.snapMirrorEndpointID,
                         this.policyName,
                         this.policyType,
                         this.comment,
                         this.transferPriority,
                         this.policyRules,
                         this.totalKeepCount,
                         this.totalRules,
                         this.vserverName);
        }

        private SnapMirrorPolicy.Builder buildFrom(final SnapMirrorPolicy req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.policyName = req.policyName;
            this.policyType = req.policyType;
            this.comment = req.comment;
            this.transferPriority = req.transferPriority;
            this.policyRules = req.policyRules;
            this.totalKeepCount = req.totalKeepCount;
            this.totalRules = req.totalRules;
            this.vserverName = req.vserverName;

            return this;
        }

        public SnapMirrorPolicy.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public SnapMirrorPolicy.Builder policyName(final String policyName) {
            this.policyName = policyName;
            return this;
        }

        public SnapMirrorPolicy.Builder policyType(final String policyType) {
            this.policyType = policyType;
            return this;
        }

        public SnapMirrorPolicy.Builder comment(final String comment) {
            this.comment = comment;
            return this;
        }

        public SnapMirrorPolicy.Builder transferPriority(final String transferPriority) {
            this.transferPriority = transferPriority;
            return this;
        }

        public SnapMirrorPolicy.Builder policyRules(final SnapMirrorPolicyRule[] policyRules) {
            this.policyRules = policyRules;
            return this;
        }

        public SnapMirrorPolicy.Builder totalKeepCount(final Long totalKeepCount) {
            this.totalKeepCount = totalKeepCount;
            return this;
        }

        public SnapMirrorPolicy.Builder totalRules(final Long totalRules) {
            this.totalRules = totalRules;
            return this;
        }

        public SnapMirrorPolicy.Builder vserverName(final String vserverName) {
            this.vserverName = vserverName;
            return this;
        }

    }
}
