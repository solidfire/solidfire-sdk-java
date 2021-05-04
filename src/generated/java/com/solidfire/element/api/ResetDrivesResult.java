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
 * ResetDrivesResult  
 **/

public class ResetDrivesResult implements Serializable {

    public static final long serialVersionUID = 8754509892796384226L;
    @SerializedName("details") private ResetDrivesDetails details;
    @SerializedName("duration") private Optional<String> duration;
    @SerializedName("result") private Optional<String> result;
    // empty constructor
    @Since("7.0")
    public ResetDrivesResult() {}

    
    // parameterized constructor
    @Since("7.0")
    public ResetDrivesResult(
        ResetDrivesDetails details,
        Optional<String> duration,
        Optional<String> result
    )
    {
        this.details = details;
        this.duration = (duration == null) ? Optional.<String>empty() : duration;
        this.result = (result == null) ? Optional.<String>empty() : result;
    }

    /** 
     * Details of drives that are being reset.
     **/
    public ResetDrivesDetails getDetails() { return this.details; }
   
    public void setDetails(ResetDrivesDetails details) { 
        this.details = details;
    }
    /** 
     **/
    public Optional<String> getDuration() { return this.duration; }
   
    public void setDuration(Optional<String> duration) { 
        this.duration = (duration == null) ? Optional.<String>empty() : duration;
    }
    /** 
     **/
    public Optional<String> getResult() { return this.result; }
   
    public void setResult(Optional<String> result) { 
        this.result = (result == null) ? Optional.<String>empty() : result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResetDrivesResult that = (ResetDrivesResult) o;

        return 
            Objects.equals(details, that.details) && 
            Objects.equals(duration, that.duration) && 
            Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash( details,duration,result );
    }


    public java.util.Map<String, Object> toMap() {
        java.util.Map<String, Object> map = new HashMap<>();
        map.put("details", details);
        map.put("duration", duration);
        map.put("result", result);
        return map;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        Gson gson = new Gson();
        sb.append( "{ " );

        sb.append(" details : ").append(gson.toJson(details)).append(",");
        if(null != duration && duration.isPresent()){
            sb.append(" duration : ").append(gson.toJson(duration)).append(",");
        }
        else{
            sb.append(" duration : ").append("null").append(",");
        }
        if(null != result && result.isPresent()){
            sb.append(" result : ").append(gson.toJson(result)).append(",");
        }
        else{
            sb.append(" result : ").append("null").append(",");
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
        private ResetDrivesDetails details;
        private Optional<String> duration;
        private Optional<String> result;

        private Builder() { }

        public ResetDrivesResult build() {
            return new ResetDrivesResult (
                         this.details,
                         this.duration,
                         this.result);
        }

        private ResetDrivesResult.Builder buildFrom(final ResetDrivesResult req) {
            this.details = req.details;
            this.duration = req.duration;
            this.result = req.result;

            return this;
        }

        public ResetDrivesResult.Builder details(final ResetDrivesDetails details) {
            this.details = details;
            return this;
        }

        public ResetDrivesResult.Builder optionalDuration(final String duration) {
            this.duration = (duration == null) ? Optional.<String>empty() : Optional.of(duration);
            return this;
        }

        public ResetDrivesResult.Builder optionalResult(final String result) {
            this.result = (result == null) ? Optional.<String>empty() : Optional.of(result);
            return this;
        }

    }
}
