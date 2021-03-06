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
 * GetOriginNodeResult  
 **/

public class GetOriginNodeResult implements Serializable {

    public static final long serialVersionUID = -8651997247788255294L;
    @SerializedName("origin") private Optional<Origin> origin;
    // empty constructor
    @Since("7.0")
    public GetOriginNodeResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetOriginNodeResult(
        Optional<Origin> origin
    )
    {
        this.origin = (origin == null) ? Optional.<Origin>empty() : origin;
    }

    /** 
     * 
     **/
    public Optional<Origin> getOrigin() { return this.origin; }
   
    public void setOrigin(Optional<Origin> origin) { 
        this.origin = (origin == null) ? Optional.<Origin>empty() : origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetOriginNodeResult that = (GetOriginNodeResult) o;

        return 
            Objects.equals(origin, that.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash( origin );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("origin", origin);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        if(null != origin && origin.isPresent()){
            sb.append(" origin : ").append(gson.toJson(origin)).append(",");
        }
        else{
            sb.append(" origin : ").append("null").append(",");
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
        private Optional<Origin> origin;

        private Builder() { }

        public GetOriginNodeResult build() {
            return new GetOriginNodeResult (
                         this.origin);
        }

        private GetOriginNodeResult.Builder buildFrom(final GetOriginNodeResult req) {
            this.origin = req.origin;

            return this;
        }

        public GetOriginNodeResult.Builder optionalOrigin(final Origin origin) {
            this.origin = (origin == null) ? Optional.<Origin>empty() : Optional.of(origin);
            return this;
        }

    }
}
