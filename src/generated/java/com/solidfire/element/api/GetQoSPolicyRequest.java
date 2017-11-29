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
 * GetQoSPolicyRequest  
 * You can use the GetQoSPolicy method to get details about a specific QoSPolicy from the system.
 **/

public class GetQoSPolicyRequest implements Serializable {

    public static final long serialVersionUID = -185877445579367227L;
    @SerializedName("qosPolicyID") private Long qosPolicyID;

    
    // parameterized constructor
    @Since("7.0")
    public GetQoSPolicyRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public GetQoSPolicyRequest(
        Long qosPolicyID
    )
    {
        this.qosPolicyID = qosPolicyID;
    }

    /** 
     * The ID of the policy to be retrieved.
     **/
    public Long getQosPolicyID() { return this.qosPolicyID; }
   
    public void setQosPolicyID(Long qosPolicyID) { 
        this.qosPolicyID = qosPolicyID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetQoSPolicyRequest that = (GetQoSPolicyRequest) o;

        return 
            Objects.equals(qosPolicyID, that.qosPolicyID);
    }

    @Override
    public int hashCode() {
        return Objects.hash( qosPolicyID );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("qosPolicyID", qosPolicyID);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" qosPolicyID : ").append(gson.toJson(qosPolicyID)).append(",");
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
        private Long qosPolicyID;

        private Builder() { }

        public GetQoSPolicyRequest build() {
            return new GetQoSPolicyRequest (
                         this.qosPolicyID);
        }

        private GetQoSPolicyRequest.Builder buildFrom(final GetQoSPolicyRequest req) {
            this.qosPolicyID = req.qosPolicyID;

            return this;
        }

        public GetQoSPolicyRequest.Builder qosPolicyID(final Long qosPolicyID) {
            this.qosPolicyID = qosPolicyID;
            return this;
        }

    }
}
