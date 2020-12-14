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
 * DeleteClusterInterfacePreferenceRequest  
 * Deletes an existing cluster interface preference.
 **/

public class DeleteClusterInterfacePreferenceRequest implements Serializable {

    public static final long serialVersionUID = -6199788140467652649L;
    @SerializedName("name") private String name;
    // empty constructor
    @Since("7.0")
    public DeleteClusterInterfacePreferenceRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public DeleteClusterInterfacePreferenceRequest(
        String name
    )
    {
        this.name = name;
    }

    /** 
     * Name of the cluster interface preference.
     **/
    public String getName() { return this.name; }
   
    public void setName(String name) { 
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteClusterInterfacePreferenceRequest that = (DeleteClusterInterfacePreferenceRequest) o;

        return 
            Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" name : ").append(gson.toJson(name)).append(",");
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

        private Builder() { }

        public DeleteClusterInterfacePreferenceRequest build() {
            return new DeleteClusterInterfacePreferenceRequest (
                         this.name);
        }

        private DeleteClusterInterfacePreferenceRequest.Builder buildFrom(final DeleteClusterInterfacePreferenceRequest req) {
            this.name = req.name;

            return this;
        }

        public DeleteClusterInterfacePreferenceRequest.Builder name(final String name) {
            this.name = name;
            return this;
        }

    }
}