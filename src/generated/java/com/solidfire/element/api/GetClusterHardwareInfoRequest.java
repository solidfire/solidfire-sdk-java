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
import com.solidfire.gson.internal.LinkedTreeMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 
 **/

public class GetClusterHardwareInfoRequest implements Serializable {

    public static final long serialVersionUID = -945659093469045744L;
    @SerializedName("type") private Optional<String> type;

    // empty constructor
    @Since("7.0")
    public GetClusterHardwareInfoRequest() {}

    // parameterized constructor
    @Since("7.0")
    public GetClusterHardwareInfoRequest(
        Optional<String> type
    )
    {
        this.type = (type == null) ? Optional.<String>empty() : type;
    }

    /** 
     * Include only a certain type of hardware information in the response. Can be one of the following:drives: List only drive information in the response.nodes: List only node information in the response.all: Include both drive and node information in the response.If this parameter is omitted, a type of "all" is assumed.
     **/
    public Optional<String> getType() { return this.type; }
    public void setType(Optional<String> type) { 
        this.type = (type == null) ? Optional.<String>empty() : type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetClusterHardwareInfoRequest that = (GetClusterHardwareInfoRequest) o;

        return 
            Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash( type );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("type", type);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        if(null != type && type.isPresent()){
            sb.append(" type : ").append(type).append(",");
        }
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
        private Optional<String> type;

        private Builder() { }

        public GetClusterHardwareInfoRequest build() {
            return new GetClusterHardwareInfoRequest (
                         this.type);
        }

        private GetClusterHardwareInfoRequest.Builder buildFrom(final GetClusterHardwareInfoRequest req) {
            this.type = req.type;

            return this;
        }

        public GetClusterHardwareInfoRequest.Builder optionalType(final String type) {
            this.type = (type == null) ? Optional.<String>empty() : Optional.of(type);
            return this;
        }

    }
}
