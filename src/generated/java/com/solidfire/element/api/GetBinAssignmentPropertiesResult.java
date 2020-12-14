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
 * GetBinAssignmentPropertiesResult  
 **/

public class GetBinAssignmentPropertiesResult implements Serializable {

    public static final long serialVersionUID = 2733669800857940247L;
    @SerializedName("properties") private BinAssignmentProperties properties;
    // empty constructor
    @Since("7.0")
    public GetBinAssignmentPropertiesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetBinAssignmentPropertiesResult(
        BinAssignmentProperties properties
    )
    {
        this.properties = properties;
    }

    /** 
     * Properties for current bin assignments in database.
     **/
    public BinAssignmentProperties getProperties() { return this.properties; }
   
    public void setProperties(BinAssignmentProperties properties) { 
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetBinAssignmentPropertiesResult that = (GetBinAssignmentPropertiesResult) o;

        return 
            Objects.equals(properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash( properties );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("properties", properties);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" properties : ").append(gson.toJson(properties)).append(",");
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
        private BinAssignmentProperties properties;

        private Builder() { }

        public GetBinAssignmentPropertiesResult build() {
            return new GetBinAssignmentPropertiesResult (
                         this.properties);
        }

        private GetBinAssignmentPropertiesResult.Builder buildFrom(final GetBinAssignmentPropertiesResult req) {
            this.properties = req.properties;

            return this;
        }

        public GetBinAssignmentPropertiesResult.Builder properties(final BinAssignmentProperties properties) {
            this.properties = properties;
            return this;
        }

    }
}
