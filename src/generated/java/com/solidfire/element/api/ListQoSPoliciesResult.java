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
 * ListQoSPoliciesResult  
 **/

public class ListQoSPoliciesResult implements Serializable {

    public static final long serialVersionUID = 8299666419095892264L;
    @SerializedName("qosPolicies") private QoSPolicy[] qosPolicies;

    
    // parameterized constructor
    @Since("7.0")
    public ListQoSPoliciesResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ListQoSPoliciesResult(
        QoSPolicy[] qosPolicies
    )
    {
        this.qosPolicies = qosPolicies;
    }

    /** 
     * A list of details about each QoS policy.
     **/
    public QoSPolicy[] getQosPolicies() { return this.qosPolicies; }
   
    public void setQosPolicies(QoSPolicy[] qosPolicies) { 
        this.qosPolicies = qosPolicies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListQoSPoliciesResult that = (ListQoSPoliciesResult) o;

        return 
            Arrays.equals(qosPolicies, that.qosPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash( (Object[])qosPolicies );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("qosPolicies", qosPolicies);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" qosPolicies : ").append(gson.toJson(Arrays.toString(qosPolicies))).append(",");
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
        private QoSPolicy[] qosPolicies;

        private Builder() { }

        public ListQoSPoliciesResult build() {
            return new ListQoSPoliciesResult (
                         this.qosPolicies);
        }

        private ListQoSPoliciesResult.Builder buildFrom(final ListQoSPoliciesResult req) {
            this.qosPolicies = req.qosPolicies;

            return this;
        }

        public ListQoSPoliciesResult.Builder qosPolicies(final QoSPolicy[] qosPolicies) {
            this.qosPolicies = qosPolicies;
            return this;
        }

    }
}
