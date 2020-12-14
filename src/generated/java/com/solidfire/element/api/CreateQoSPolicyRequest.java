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
 * CreateQoSPolicyRequest  
 * You can use the CreateQoSPolicy method to create a QoSPolicy object that you can later apply to a volume upon creation or modification. A QoS policy has a unique ID, a name, and QoS settings.
 **/

public class CreateQoSPolicyRequest implements Serializable {

    public static final long serialVersionUID = 7262753462364262971L;
    @SerializedName("name") private String name;
    @SerializedName("qos") private QoS qos;

    
    // parameterized constructor
    @Since("7.0")
    public CreateQoSPolicyRequest(
    )
    {
    }
    // parameterized constructor
    @Since("10.0")
    public CreateQoSPolicyRequest(
        String name,
        QoS qos
    )
    {
        this.name = name;
        this.qos = qos;
    }

    /** 
     * The name of the QoS policy; for example, gold, platinum, or silver.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * The QoS settings that this policy represents.
     **/
    public QoS getQos() { return this.qos; }
   
    public void setQos(QoS qos) { 
        this.qos = qos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateQoSPolicyRequest that = (CreateQoSPolicyRequest) o;

        return 
            Objects.equals(name, that.name) && 
            Objects.equals(qos, that.qos);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,qos );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("qos", qos);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" qos : ").append(gson.toJson(qos)).append(",");
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
        private String name;
        private QoS qos;

        private Builder() { }

        public CreateQoSPolicyRequest build() {
            return new CreateQoSPolicyRequest (
                         this.name,
                         this.qos);
        }

        private CreateQoSPolicyRequest.Builder buildFrom(final CreateQoSPolicyRequest req) {
            this.name = req.name;
            this.qos = req.qos;

            return this;
        }

        public CreateQoSPolicyRequest.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public CreateQoSPolicyRequest.Builder qos(final QoS qos) {
            this.qos = qos;
            return this;
        }

    }
}
