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
 * EnableBmcColdResetResult  
 * EnableBmcColdReset returns the time between reset intervals.
 **/

public class EnableBmcColdResetResult implements Serializable {

    public static final long serialVersionUID = -6034199449398157749L;
    @SerializedName("cBmcResetDurationMinutes") private Long cBmcResetDurationMinutes;
    // empty constructor
    @Since("7.0")
    public EnableBmcColdResetResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public EnableBmcColdResetResult(
        Long cBmcResetDurationMinutes
    )
    {
        this.cBmcResetDurationMinutes = cBmcResetDurationMinutes;
    }

    /** 
     * This is the time between BMC resets.
     **/
    public Long getCBmcResetDurationMinutes() { return this.cBmcResetDurationMinutes; }
   
    public void setCBmcResetDurationMinutes(Long cBmcResetDurationMinutes) { 
        this.cBmcResetDurationMinutes = cBmcResetDurationMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnableBmcColdResetResult that = (EnableBmcColdResetResult) o;

        return 
            Objects.equals(cBmcResetDurationMinutes, that.cBmcResetDurationMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash( cBmcResetDurationMinutes );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("cBmcResetDurationMinutes", cBmcResetDurationMinutes);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" cBmcResetDurationMinutes : ").append(gson.toJson(cBmcResetDurationMinutes)).append(",");
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
        private Long cBmcResetDurationMinutes;

        private Builder() { }

        public EnableBmcColdResetResult build() {
            return new EnableBmcColdResetResult (
                         this.cBmcResetDurationMinutes);
        }

        private EnableBmcColdResetResult.Builder buildFrom(final EnableBmcColdResetResult req) {
            this.cBmcResetDurationMinutes = req.cBmcResetDurationMinutes;

            return this;
        }

        public EnableBmcColdResetResult.Builder cBmcResetDurationMinutes(final Long cBmcResetDurationMinutes) {
            this.cBmcResetDurationMinutes = cBmcResetDurationMinutes;
            return this;
        }

    }
}
