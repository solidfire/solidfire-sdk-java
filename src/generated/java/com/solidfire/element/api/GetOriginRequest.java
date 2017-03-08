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
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * GetOriginRequest  
 * GetOrigin enables you to retrieve the origination certificate for where the node was built.NOTE: The GetOrigin method may return "null" if there is no origination certification.
 **/

public class GetOriginRequest implements Serializable {

    public static final long serialVersionUID = -8412853073741789397L;
    @SerializedName("force") private Boolean force;

    // empty constructor
    @Since("7.0")
    public GetOriginRequest() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetOriginRequest(
        Boolean force
    )
    {
        this.force = force;
    }

    /** 
     * 
     **/
    public Boolean getForce() { return this.force; }
    public void setForce(Boolean force) { 
        this.force = force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetOriginRequest that = (GetOriginRequest) o;

        return 
            Objects.equals(force, that.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash( force );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("force", force);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" force : ").append(force).append(",");
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
        private Boolean force;

        private Builder() { }

        public GetOriginRequest build() {
            return new GetOriginRequest (
                         this.force);
        }

        private GetOriginRequest.Builder buildFrom(final GetOriginRequest req) {
            this.force = req.force;

            return this;
        }

        public GetOriginRequest.Builder force(final Boolean force) {
            this.force = force;
            return this;
        }

    }
}
