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
 * ModifyClusterInterfacePreferenceRequest  
 * Modifies an existing cluster interface preference.
 **/

public class ModifyClusterInterfacePreferenceRequest implements Serializable {

    public static final long serialVersionUID = -7363158147437899336L;
    @SerializedName("name") private String name;
    @SerializedName("value") private String value;

    
    // parameterized constructor
    @Since("7.0")
    public ModifyClusterInterfacePreferenceRequest(
    )
    {
    }
    // parameterized constructor
    @Since("11.0")
    public ModifyClusterInterfacePreferenceRequest(
        String name,
        String value
    )
    {
        this.name = name;
        this.value = value;
    }

    /** 
     * Name of the cluster interface preference.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }
    /** 
     * Value of the cluster interface preference.
     **/
    public String getValue() { return this.value; }
   
    public void setValue(String value) { 
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyClusterInterfacePreferenceRequest that = (ModifyClusterInterfacePreferenceRequest) o;

        return 
            Objects.equals(name, that.name) && 
            Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,value );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("value", value);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" name : ").append(gson.toJson(name)).append(",");
        sb.append(" value : ").append(gson.toJson(value)).append(",");
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
        private String value;

        private Builder() { }

        public ModifyClusterInterfacePreferenceRequest build() {
            return new ModifyClusterInterfacePreferenceRequest (
                         this.name,
                         this.value);
        }

        private ModifyClusterInterfacePreferenceRequest.Builder buildFrom(final ModifyClusterInterfacePreferenceRequest req) {
            this.name = req.name;
            this.value = req.value;

            return this;
        }

        public ModifyClusterInterfacePreferenceRequest.Builder name(final String name) {
            this.name = name;
            return this;
        }

        public ModifyClusterInterfacePreferenceRequest.Builder value(final String value) {
            this.value = value;
            return this;
        }

    }
}
