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
 * ModifyQoSPolicyResult  
 **/

public class ModifyQoSPolicyResult implements Serializable {

    public static final long serialVersionUID = -9030306688973730077L;
    @SerializedName("qosPolicy") private QoSPolicy qosPolicy;

    
    // parameterized constructor
    @Since("7.0")
    public ModifyQoSPolicyResult(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public ModifyQoSPolicyResult(
        QoSPolicy qosPolicy
    )
    {
        this.qosPolicy = qosPolicy;
    }

    /** 
     * Details of the newly modified QoSPolicy object.
     **/
    public QoSPolicy getQosPolicy() { return this.qosPolicy; }
   
    public void setQosPolicy(QoSPolicy qosPolicy) { 
        this.qosPolicy = qosPolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyQoSPolicyResult that = (ModifyQoSPolicyResult) o;

        return 
            Objects.equals(qosPolicy, that.qosPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash( qosPolicy );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("qosPolicy", qosPolicy);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" qosPolicy : ").append(gson.toJson(qosPolicy)).append(",");
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
        private QoSPolicy qosPolicy;

        private Builder() { }

        public ModifyQoSPolicyResult build() {
            return new ModifyQoSPolicyResult (
                         this.qosPolicy);
        }

        private ModifyQoSPolicyResult.Builder buildFrom(final ModifyQoSPolicyResult req) {
            this.qosPolicy = req.qosPolicy;

            return this;
        }

        public ModifyQoSPolicyResult.Builder qosPolicy(final QoSPolicy qosPolicy) {
            this.qosPolicy = qosPolicy;
            return this;
        }

    }
}
