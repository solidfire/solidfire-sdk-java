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
 * GetSystemStatusResult  
 **/

public class GetSystemStatusResult implements Serializable {

    public static final long serialVersionUID = -7587418980403606749L;
    @SerializedName("rebootRequired") private Boolean rebootRequired;

    // empty constructor
    @Since("7.0")
    public GetSystemStatusResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public GetSystemStatusResult(
        Boolean rebootRequired
    )
    {
        this.rebootRequired = rebootRequired;
    }

    /** 
     **/
    public Boolean getRebootRequired() { return this.rebootRequired; }
    public void setRebootRequired(Boolean rebootRequired) { 
        this.rebootRequired = rebootRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSystemStatusResult that = (GetSystemStatusResult) o;

        return 
            Objects.equals(rebootRequired, that.rebootRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash( rebootRequired );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("rebootRequired", rebootRequired);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append( "{ " );

        sb.append(" rebootRequired : ").append(rebootRequired).append(",");
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
        private Boolean rebootRequired;

        private Builder() { }

        public GetSystemStatusResult build() {
            return new GetSystemStatusResult (
                         this.rebootRequired);
        }

        private GetSystemStatusResult.Builder buildFrom(final GetSystemStatusResult req) {
            this.rebootRequired = req.rebootRequired;

            return this;
        }

        public GetSystemStatusResult.Builder rebootRequired(final Boolean rebootRequired) {
            this.rebootRequired = rebootRequired;
            return this;
        }

    }
}
