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
 * SnapMirrorPolicyRule  
 * The snapMirrorPolicyRule object contains information about the rules in a SnapMirror policy.
 **/

public class SnapMirrorPolicyRule implements Serializable {

    public static final long serialVersionUID = -5446395046174384675L;
    @SerializedName("snapMirrorEndpointID") private Long snapMirrorEndpointID;
    @SerializedName("snapMirrorLabel") private String snapMirrorLabel;
    @SerializedName("keepCount") private String keepCount;

    
    // parameterized constructor
    @Since("7.0")
    public SnapMirrorPolicyRule(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public SnapMirrorPolicyRule(
        Long snapMirrorEndpointID,
        String snapMirrorLabel,
        String keepCount
    )
    {
        this.snapMirrorEndpointID = snapMirrorEndpointID;
        this.snapMirrorLabel = snapMirrorLabel;
        this.keepCount = keepCount;
    }

    /** 
     * The ID of the destination ONTAP system.
     **/
    public Long getSnapMirrorEndpointID() { return this.snapMirrorEndpointID; }
   
    public void setSnapMirrorEndpointID(Long snapMirrorEndpointID) { 
        this.snapMirrorEndpointID = snapMirrorEndpointID;
    }
    /** 
     * The snapshot copy label, used for snapshot copy
     * selection in extended data protection relationships.
     **/
    public String getSnapMirrorLabel() { return this.snapMirrorLabel; }
   
    public void setSnapMirrorLabel(String snapMirrorLabel) { 
        this.snapMirrorLabel = snapMirrorLabel;
    }
    /** 
     * Specifies the maximum number of snapshot copies that are
     * retained on the SnapMirror destination volume for a rule.
     **/
    public String getKeepCount() { return this.keepCount; }
   
    public void setKeepCount(String keepCount) { 
        this.keepCount = keepCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnapMirrorPolicyRule that = (SnapMirrorPolicyRule) o;

        return 
            Objects.equals(snapMirrorEndpointID, that.snapMirrorEndpointID) && 
            Objects.equals(snapMirrorLabel, that.snapMirrorLabel) && 
            Objects.equals(keepCount, that.keepCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash( snapMirrorEndpointID,snapMirrorLabel,keepCount );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("snapMirrorEndpointID", snapMirrorEndpointID);
        map.put("snapMirrorLabel", snapMirrorLabel);
        map.put("keepCount", keepCount);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" snapMirrorEndpointID : ").append(gson.toJson(snapMirrorEndpointID)).append(",");
        sb.append(" snapMirrorLabel : ").append(gson.toJson(snapMirrorLabel)).append(",");
        sb.append(" keepCount : ").append(gson.toJson(keepCount)).append(",");
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
        private String snapMirrorLabel;
        private String keepCount;

        private Builder() { }

        public SnapMirrorPolicyRule build() {
            return new SnapMirrorPolicyRule (
                         this.snapMirrorEndpointID,
                         this.snapMirrorLabel,
                         this.keepCount);
        }

        private SnapMirrorPolicyRule.Builder buildFrom(final SnapMirrorPolicyRule req) {
            this.snapMirrorEndpointID = req.snapMirrorEndpointID;
            this.snapMirrorLabel = req.snapMirrorLabel;
            this.keepCount = req.keepCount;

            return this;
        }

        public SnapMirrorPolicyRule.Builder snapMirrorEndpointID(final Long snapMirrorEndpointID) {
            this.snapMirrorEndpointID = snapMirrorEndpointID;
            return this;
        }

        public SnapMirrorPolicyRule.Builder snapMirrorLabel(final String snapMirrorLabel) {
            this.snapMirrorLabel = snapMirrorLabel;
            return this;
        }

        public SnapMirrorPolicyRule.Builder keepCount(final String keepCount) {
            this.keepCount = keepCount;
            return this;
        }

    }
}
